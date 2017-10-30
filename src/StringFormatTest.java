
public class StringFormatTest {

	public static void main(String[] args) {
		System.out.printf("%20s%4s%4s%4s%2s%32s%40s%32s%40s", "성공했습니다.","010 ","2479","5936","02","gid_1","정인호","gid_2","홍길동"); // res_msg
		System.out.println("[Request]");
		System.out.printf("%256s%2s%4s%4s%4s%32s%120s%538s", "0956IF_COP_701_COP1060_HFG9000              COP1060HFG900096096V100COP10602017082410332310000000020321                                    ONL00000                                                                                                              ","02","010 ","9680","5225","","","");
		
		
		// 회원 정보 조회 with 전화번호
		System.out.println("");
		System.out.printf("%04d", 960-4);								// gram_lngh
		System.out.printf("%-40s", "IF_COP_701_COP1060_HFG9000");		// if_id
		System.out.printf("%-7s", "COP1060");							// trs_sys
		System.out.printf("%-7s", "HFG9000");							// rec_sys
		System.out.printf("%-3s", "105");								// gram_tp
		System.out.printf("%-2s", "08");									// biz_dv
		System.out.printf("%-4s", "V100");								// gram_ver
		System.out.printf("%-7s", "COP1060");							// cco_c
		System.out.printf("%-8s", "20171030");							// cco_c
		System.out.printf("%-6s", "103036");								// cco_c
		System.out.printf("%-50s", "COP1060201710301234567890");			// flw_no
		System.out.printf("%-3s", "ONL");								// onl_off_dv
		System.out.printf("%-5s", "00000");								// rsp_c
		System.out.printf("%-110s", "");									// filler
		
		System.out.printf("%2s", "02");									// pc_dv
		System.out.printf("%4s", "010");								// cell1
		System.out.printf("%4s", "9680");								// cell2
		System.out.printf("%4s", "5225");								// cell3
		System.out.printf("%32s", "");									// glnId
		System.out.printf("%120s", "");									// onetimeKey
		System.out.printf("%538s", "");									// filler 
		
		
	}
}



