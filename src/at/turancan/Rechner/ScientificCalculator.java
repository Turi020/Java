package at.turancan.Rechner;

public class ScientificCalculator extends Calculator{
        public double sine(double num) {
            double numRadian = Math.toRadians(num);
            return Math.sin(numRadian);
        }
        public double cosine(double num) {
            double numRadian = Math.toRadians(num);
            return Math.cos(numRadian);
        }
    }
}
