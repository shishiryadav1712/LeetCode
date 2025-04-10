// Asteroid Collision
public class Solution {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int ast : asteroids) {
            boolean alive = true;
            while (alive && ast < 0 && !stack.isEmpty() && stack.peek() > 0) {
                int top = stack.peek();

                if (top < -ast) {
                    stack.pop(); 
                } else if (top == -ast) {
                    stack.pop(); 
                    alive = false;
                } else {
                    
                    alive = false;
                }
            }

            if (alive) {
                stack.push(ast);
            }
        }

        
        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
        }

        return result;
    }
}
