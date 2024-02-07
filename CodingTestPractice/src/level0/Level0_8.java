package level0;

public class Level0_8 {
	/*
	 * 주어진 solution 함수는 정리되기 전 창고의 물건 이름이 담긴 문자열 리스트 storage와 각 물건의 개수가 담긴 정수 리스트
	 * num이 주어질 때, 정리된 창고에서 개수가 가장 많은 물건의 이름을 return 하는 함수입니다. solution 함수가 올바르게
	 * 작동하도록 한 줄을 수정해 주세요.
	 */
	  public String solution(String[] storage, int[] num) {
	        int num_item = 0;
	        String[] clean_storage = new String[storage.length];
	        int[] clean_num = new int[num.length];
	        
	        for(int i=0; i<storage.length; i++){
	            int clean_idx = -1;
	            for(int j=0; j<num_item; j++){
	                if(storage[i].equals(clean_storage[j])){
	                    clean_idx = j;
	                    break;
	                }
	            }
	            if(clean_idx == -1){
	                clean_storage[num_item] = Integer.toString(num[i]);
	                clean_num[num_item] = num[i];
	                num_item += 1;
	            }
	            else{
	                clean_num[clean_idx] += num[i];
	            }
	        }
	        
	        // 아래 코드에는 틀린 부분이 없습니다.
	        
	        int num_max = -1;
	        String answer = "";
	        for(int i=0; i<num_item; i++){
	            if(clean_num[i] > num_max){
	                num_max = clean_num[i];
	                answer = clean_storage[i];
	            }
	        }
	        return answer;
	    }
}
