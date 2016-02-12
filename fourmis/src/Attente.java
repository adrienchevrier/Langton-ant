/**
 * Created by adrien on 30/01/16.
 */
public class Attente {

        private boolean b;

        public Attente()
        {
            b = false;

            new Thread()
            {
                public void run()
                {
                    b = true;
                    try { System.in.read(); } catch (Exception e) {}
                    b = false;
                }
            }.start();

            while (!b); // wait for thread to start
        }

        public boolean Continue()
        {
            return b;
        }
    }
