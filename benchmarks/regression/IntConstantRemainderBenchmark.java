/*
 * Copyright (C) 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package benchmarks.regression;

public class IntConstantRemainderBenchmark {
    public int timeRemainderIntByConstant2(int reps) {
        int result = 1;
        for (int i = 0; i < reps; ++i) {
            result %= 2;
        }
        return result;
    }
    public int timeRemainderIntByConstant8(int reps) {
        int result = 1;
        for (int i = 0; i < reps; ++i) {
            result %= 8;
        }
        return result;
    }
/*
    public int timeRemainderIntByConstant10(int reps) {
        int result = 1;
        for (int i = 0; i < reps; ++i) {
            result %= 10;
        }
        return result;
    }
    public int timeRemainderIntByConstant100(int reps) {
        int result = 1;
        for (int i = 0; i < reps; ++i) {
            result %= 100;
        }
        return result;
    }
*/
    public int timeRemainderIntByConstant2048(int reps) {
        int result = 1;
        for (int i = 0; i < reps; ++i) {
            result %= 2048;
        }
        return result;
    }
    public int timeRemainderIntByVariable2(int reps) {
        int result = 1;
        int factor = 2;
        for (int i = 0; i < reps; ++i) {
            result %= factor;
        }
        return result;
    }
/*
    public int timeRemainderIntByVariable10(int reps) {
        int result = 1;
        int factor = 10;
        for (int i = 0; i < reps; ++i) {
            result %= factor;
        }
        return result;
    }
*/
}
