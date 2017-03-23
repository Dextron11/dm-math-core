package com.varsol.math.controllers;

import com.sun.xml.internal.bind.v2.TODO;
import com.varsol.math.models.Polynomial;
import com.varsol.math.models.QNumber;

import java.util.ArrayList;

/**
 * Created by simon on 21.03.17.
 */
public class PolynomialController {


    /**
     * @author Andrew Soldatenkov
     * <p>
     * Cложение многочленов:
     * На вход: Два многочлена
     * На выход: Один Многочлен
     */
    public static Polynomial ADD_PP_P(Polynomial first, Polynomial second) {

        ArrayList<QNumber> num1 = first.getCoefficient();
        ArrayList<QNumber> num2 = second.getCoefficient();

        if (num1.size() < num2.size()) {
            ArrayList<QNumber> tmp = num1;
            num1 = num2;
            num2 = tmp;
        }

        for (int i = 0; i < second.getCoefficient().size(); i++) {
            num1.set(i, QController.ADD_QQ_Q(num1.get(i), num2.get(i)));
        }

        first.setCoefficient(num1);
        return first;
    }

    /**
     * @author Andrew Soldatenkov
     * <p>
     * Вычитание  многочленов:
     * На вход: Два многочлена
     * На выход: Один Многочлен
     */
    public static Polynomial SUB_PP_P(Polynomial first, Polynomial second) {

        ArrayList<QNumber> num1 = first.getCoefficient();
        ArrayList<QNumber> num2 = second.getCoefficient();


        if (num1.size() < num2.size()) {
            ArrayList<QNumber> tmp = num1;
            num1 = num2;
            num2 = tmp;
        }

        for (int i = 0; i < second.getCoefficient().size(); i++) {
            num1.set(i, QController.SUB_QQ_Q(num1.get(i), num2.get(i)));
        }

        first.setCoefficient(num1);
        return first;
    }

    /**
     * @author Andrew Soldatenkov
     * <p>
     * Умножение многочлена на рациональное число:
     * На вход: Один многочлена, Рациональное число
     * На выход: Если number=0, то возвращает 0;
     * иначе умнажает на число и возвращает многочлен.
     */
    public static Polynomial MUL_PQ_P(Polynomial polynomial, QNumber number) {

        if (ZController.POZ_Z_D(number.getNumerator()) != 0) {
            ArrayList<QNumber> num = polynomial.getCoefficient();
            for (int i = 0; i < polynomial.getCoefficient().size(); i++) {
                if (ZController.POZ_Z_D(num.get(i).getNumerator()) != 0) {
                    num.set(i, QController.MUL_QQ_Q(num.get(i), number));
                }
            }
            polynomial.setCoefficient(num);
            return polynomial;
        }
        // TODO: 23.03.17
        return null;
    }

    /**
     * @author Andrew Soldatenkov
     * @author Simon Tritin
     * <p>
     * Умножение многочлена на x^k:
     * На вход: Один многочлена, коэффициент при x
     * На выход:
     * Сема пиздец потом подумаем)
    TODO: пиздец
     */

    public static Polynomial MUL_Pxk_P(Polynomial polynomial, Integer k) {


        return null;
    }

    /**
     * @author Andrew Soldatenkov
     * <p>
     * Старший коэффициент многочлена:
     * На вход: Один многочлен
     * На выход: Рациональное число;
     */
    public static QNumber LED_P_Q(Polynomial polynomial) {
        return polynomial.getCoefficient().get(0);
    }

    /**
     * @author Andrew Soldatenkov
     * <p>
     * Старшая степень многочлена:
     * На вход: Один многочлен
     * На выход: Целое число;
     */
    public static Integer DEG_P_N(Polynomial polynomial) {
        return polynomial.getCoefficient().size();
    }

    public static Polynomial FAC_P_Q(Polynomial polynomial) {
        return null;
    }

    public static Polynomial MUL_PP_P(Polynomial first, Polynomial second) {
        return null;
    }

    public static Polynomial DIV_PP_P(Polynomial polynomial) {
        return null;
    }

    public static Polynomial MOD_PP_P(Polynomial polynomial) {
        return null;
    }

    public static Polynomial GCF_PP_P(ArrayList<Polynomial> polynomials) {
        return null;
    }

    public static Polynomial DER_P_P(Polynomial polynomial) {
        return null;
    }

    public static Polynomial NMR_P_P(Polynomial polynomial) {
        return null;
    }

}
