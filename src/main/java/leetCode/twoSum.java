//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class twoSum {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4};
        int target = 6;

        twoSum objeto = new twoSum();

        int[] soluçoes = objeto.solution(numeros,target);

        for (int i = 0; i < soluçoes.length; i++) {
        System.out.println(soluçoes[i]);

        }
    }


    public int[] solution(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}

