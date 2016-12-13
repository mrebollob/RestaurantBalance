/*
 * Copyright (c) 2016. Manuel Rebollo Báez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mrebollob.m2p.domain

import com.mrebollob.m2p.domain.entities.CreditCard
import junit.framework.Assert.assertEquals
import org.jetbrains.spek.api.Spek

class CreditCardTest : Spek({
    given("a valid Credit Card") {
        val creditCard = CreditCard("4242424242424242", "10", "21", "111")
        on("check if is valid") {
            val isValid = creditCard.isValid()
            it("should be valid") {
                assertEquals(true, isValid)
            }
        }
    }

    given("a not valid Credit Card") {
        val creditCard = CreditCard("4242424242420000", "10", "21", "111")
        on("check if is valid") {
            val isValid = creditCard.isValid()
            it("should not be valid") {
                assertEquals(false, isValid)
            }
        }
    }
})