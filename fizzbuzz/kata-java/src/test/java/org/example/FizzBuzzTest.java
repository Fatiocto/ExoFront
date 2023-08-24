package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class FizzBuzzTest {

    @Test
    void UnRenvoieUn() {
    	// given
        FizzBuzz fizzBuzz = new FizzBuzz();

    	// when
        String result = fizzBuzz.execute(1);

    	// then
        assertThat(result).isEqualTo("1");
    }

    @Test
    void DeuxRenvoieUnEspaceDeux() {
    	// given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.execute(2);

        // then
        assertThat(result).isEqualTo("1 2");
    }

    @Test
    void TroisRenvoieUnDeuxFizz() {
    	// given
        FizzBuzz fizzBuzz = new FizzBuzz();

    	// when
        String result = fizzBuzz.execute(3);

    	// then
        assertThat(result).isEqualTo("1 2 Fizz");
    }

    @Test
    void CinqRenvoieUnDeuxFizzQuatreBuzz() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.execute(5);

        // then
        assertThat(result).isEqualTo("1 2 Fizz 4 Buzz");
    }

    @Test
    void SixRenvoieUnDeuxFizzQuatreBuzzFizz() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.execute(6);

        // then
        assertThat(result).isEqualTo("1 2 Fizz 4 Buzz Fizz");
    }

    @Test
    void QuinzeRenvoieFizzBuzz() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.execute(15);

        // then
        assertThat(result).isEqualTo("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz");
    }
}