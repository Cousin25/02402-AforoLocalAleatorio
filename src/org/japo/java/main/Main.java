/* 
 * Copyright 2019 Andrés Cosín Zamareño - Cousin183@gmail.com ..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Andrés Cosín Zamareño - Cousin183@gmail.com .
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        final int AFORO_MAX = 100;
        final int AFORO_MIN = 0;

        int aforo;
        int aforoInt;

        aforo = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;

        aforoInt = (int) Math.floor(Math.random() * (100 + 1));

        System.out.printf("Aforo actual del local: %d personas %n", aforo);
        System.out.printf("AforoInt del local....: %d personas %n", aforoInt);
    }

}
