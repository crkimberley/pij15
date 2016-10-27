/**
 * @author crkimberley on 27/10/2016.
 */
public class CRKException {
    public static void main(String[] args) throws CRKCheckedException {
        CRKException crkException = new CRKException();
        //crkException.launch("r");
        //crkException.launch("c");
        crkException.launch("rtry");
        crkException.launch("ctry");
    }

    private void launch(String input) throws CRKCheckedException {
        if (input.equals("r")) {
            throw new CRKRuntimeException("Unchecked exception thrown outside of a try block");
        } else if (input.equals("c")) {
            throw new CRKCheckedException("Checked exception thrown outside of a try block");
        }
        try {
            if (input.equals("rtry")) {
                throw new CRKRuntimeException("Unchecked exception thrown inside a try block");
            } else if (input.equals("ctry")) {
                throw new CRKCheckedException("Checked exception thrown inside a try block");
            }
        } catch (CRKRuntimeException ex) {
            System.out.println("Unchecked exception caught");
        } catch (CRKCheckedException ex) {
            System.out.println("Checked exception caught");
        }
    }
}
