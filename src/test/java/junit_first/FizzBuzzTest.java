package junit_first;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("fizbuzz test !")
class FizzBuzzTest {
	private FizzBuzz fizzbuzz;
	
	@BeforeEach
	void 前準備() {
		System.out.println("前準備");
		fizzbuzz = new FizzBuzz();
	}
	
	@Nested
	class convert_数を文字列に変換する{
	
		@Nested
		class その他の数のときはそのまま文字列に変換する{
			@Test
			void _1を渡すと文字列１を返す() throws Exception{			
				assertEquals("1", fizzbuzz.convert(1));
			}
		}
		
		@Nested
		class _3の倍数のときは数の代わりにFizzに変換する{
			@Test
			void _3を渡すと文字列Fizzを返す() throws Exception{
				assertEquals("Fizz", fizzbuzz.convert(3));
			}
		}
		
		
		@Nested
		class _5の倍数のときは数の代わりにBuzzに変換する{
			@Test
			void _5を渡すと文字列Buzzを返す() throws Exception{
				assertEquals("Buzz", fizzbuzz.convert(5));
			}
		}
	
	}
}
