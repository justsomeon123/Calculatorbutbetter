// Where you can fool around
package com.example.finalfinalcalculator;

//by the way guys did I tell you I play fortnite?

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        // Buttons
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);
        Button b8 = findViewById(R.id.button8);
        Button b9 = findViewById(R.id.button9);
        Button b10 = findViewById(R.id.button10);
        Button b11 = findViewById(R.id.button11);
        Button b12 = findViewById(R.id.button12);
        Button b13 = findViewById(R.id.button13);
        Button b14 = findViewById(R.id.button14);
        Button b15 = findViewById(R.id.button15);
        Button b16 = findViewById(R.id.button16);
        Button b17 = findViewById(R.id.button17);
        Button b18 = findViewById(R.id.button18);
        Button b19 = findViewById(R.id.button19);
        Button b20 = findViewById(R.id.button20);
        Button b21 = findViewById(R.id.button21);
        Button b22 = findViewById(R.id.button22);
        Button b23 = findViewById(R.id.button23);
        Button b24 = findViewById(R.id.button24);
        Button b25 = findViewById(R.id.button25);
        Button b26 = findViewById(R.id.button26);
        Button b27 = findViewById(R.id.button27);
        Button b28 = findViewById(R.id.button28);

        // Text Views
        TextView t1 = findViewById(R.id.textView1);
        TextView t2 = findViewById(R.id.textView2);
        TextView t3 = findViewById(R.id.textView3);

        // Button Listeners
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("0");
                t2.setText("");
                t3.setText("");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("0");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().length() > 1) {
                    t1.setText(((String) t1.getText()).substring(0, t1.getText().length() - 1));
                } else {
                    t1.setText("0");
                }

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText() + (String)(b8.getText()));
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().equals("0")) {
                    t1.setText(b9.getText());
                } else {
                    if (String.valueOf(t1.getText()).endsWith("×0") || String.valueOf(t1.getText()).endsWith("÷0") || String.valueOf(t1.getText()).endsWith("-0") || String.valueOf(t1.getText()).endsWith("+0") || String.valueOf(t1.getText()).endsWith("−0")) {
                        t1.setText(String.valueOf(t1.getText()).substring(0, String.valueOf(t1.getText()).length() - 1) + b9.getText());;
                    } else {
                        t1.setText(t1.getText() + (String)(b9.getText()));
                    }
                }

            }

        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().equals("0")) {
                    t1.setText(b10.getText());
                } else {
                    if (String.valueOf(t1.getText()).endsWith("×0") || String.valueOf(t1.getText()).endsWith("÷0") || String.valueOf(t1.getText()).endsWith("-0") || String.valueOf(t1.getText()).endsWith("+0") || String.valueOf(t1.getText()).endsWith("−0")) {
                        t1.setText(String.valueOf(t1.getText()).substring(0, String.valueOf(t1.getText()).length() - 1) + b10.getText());;
                    } else {
                        t1.setText(t1.getText() + (String)(b10.getText()));
                    }
                }
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().equals("0")) {
                    t1.setText(b11.getText());
                } else {
                    if (String.valueOf(t1.getText()).endsWith("×0") || String.valueOf(t1.getText()).endsWith("÷0") || String.valueOf(t1.getText()).endsWith("-0") || String.valueOf(t1.getText()).endsWith("+0") || String.valueOf(t1.getText()).endsWith("−0")) {
                        t1.setText(String.valueOf(t1.getText()).substring(0, String.valueOf(t1.getText()).length() - 1) + b11.getText());;
                    } else {
                        t1.setText(t1.getText() + (String)(b11.getText()));
                    }
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText() + (String)(b12.getText()));

            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().equals("0")) {
                    t1.setText(b13.getText());
                } else {
                    if (String.valueOf(t1.getText()).endsWith("×0") || String.valueOf(t1.getText()).endsWith("÷0") || String.valueOf(t1.getText()).endsWith("-0") || String.valueOf(t1.getText()).endsWith("+0") || String.valueOf(t1.getText()).endsWith("−0")) {
                        t1.setText(String.valueOf(t1.getText()).substring(0, String.valueOf(t1.getText()).length() - 1) + b13.getText());;
                    } else {
                        t1.setText(t1.getText() + (String)(b13.getText()));
                    }
                }
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().equals("0")) {
                    t1.setText(b14.getText());
                } else {
                    if (String.valueOf(t1.getText()).endsWith("×0") || String.valueOf(t1.getText()).endsWith("÷0") || String.valueOf(t1.getText()).endsWith("-0") || String.valueOf(t1.getText()).endsWith("+0") || String.valueOf(t1.getText()).endsWith("−0")) {
                        t1.setText(String.valueOf(t1.getText()).substring(0, String.valueOf(t1.getText()).length() - 1) + b14.getText());;
                    } else {
                        t1.setText(t1.getText() + (String)(b14.getText()));
                    }
                }
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().equals("0")) {
                    t1.setText(b15.getText());
                } else {
                    if (String.valueOf(t1.getText()).endsWith("×0") || String.valueOf(t1.getText()).endsWith("÷0") || String.valueOf(t1.getText()).endsWith("-0") || String.valueOf(t1.getText()).endsWith("+0") || String.valueOf(t1.getText()).endsWith("−0")) {
                        t1.setText(String.valueOf(t1.getText()).substring(0, String.valueOf(t1.getText()).length() - 1) + b15.getText());;
                    } else {
                        t1.setText(t1.getText() + (String)(b15.getText()));
                    }
                }
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText() + (String)(b16.getText()));

            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().equals("0")) {
                    t1.setText(b17.getText());
                } else {
                    t1.setText(t1.getText() + (String)(b17.getText()));
                }
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().equals("0")) {
                    t1.setText(b18.getText());
                } else {
                    t1.setText(t1.getText() + (String)(b18.getText()));
                }
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().equals("0")) {
                    t1.setText(b19.getText());
                } else {
                    t1.setText(t1.getText() + (String)(b19.getText()));
                }
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().equals("0")) {
                    t1.setText(b20.getText());
                } else {
                    t1.setText(t1.getText() + (String)(b20.getText()));
                }
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().equals("0")) {
                    t1.setText(b21.getText());
                } else {
                    if (String.valueOf(t1.getText()).endsWith("×0") || String.valueOf(t1.getText()).endsWith("÷0") || String.valueOf(t1.getText()).endsWith("-0") || String.valueOf(t1.getText()).endsWith("+0") || String.valueOf(t1.getText()).endsWith("−0")) {
                        t1.setText(String.valueOf(t1.getText()).substring(0, String.valueOf(t1.getText()).length() - 1) + b21.getText());;
                    } else {
                        t1.setText(t1.getText() + (String)(b21.getText()));
                    }
                }
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().equals("0")) {
                    t1.setText(b22.getText());
                } else {
                    if (String.valueOf(t1.getText()).endsWith("×0") || String.valueOf(t1.getText()).endsWith("÷0") || String.valueOf(t1.getText()).endsWith("-0") || String.valueOf(t1.getText()).endsWith("+0") || String.valueOf(t1.getText()).endsWith("−0")) {
                        t1.setText(String.valueOf(t1.getText()).substring(0, String.valueOf(t1.getText()).length() - 1) + b22.getText());;
                    } else {
                        t1.setText(t1.getText() + (String)(b22.getText()));
                    }
                }
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().equals("0")) {
                    t1.setText(b23.getText());
                } else {
                    if (String.valueOf(t1.getText()).endsWith("×0") || String.valueOf(t1.getText()).endsWith("÷0") || String.valueOf(t1.getText()).endsWith("-0") || String.valueOf(t1.getText()).endsWith("+0") || String.valueOf(t1.getText()).endsWith("−0")) {
                        t1.setText(String.valueOf(t1.getText()).substring(0, String.valueOf(t1.getText()).length() - 1) + b23.getText());;
                    } else {
                        t1.setText(t1.getText() + (String)(b23.getText()));
                    }
                }
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText() + (String)(b24.getText()));
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(t1.getText().equals("0"))
                    t1.setText("−");
                else
                    t1.setText(t1.getText() + "−");
            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!t1.getText().equals("0")) {
                    if (String.valueOf(t1.getText()).endsWith("×0") || String.valueOf(t1.getText()).endsWith("÷0") || String.valueOf(t1.getText()).endsWith("-0") || String.valueOf(t1.getText()).endsWith("+0") || String.valueOf(t1.getText()).endsWith("−0")) {

                    } else {
                        t1.setText(t1.getText() + (String)(b26.getText()));
                    }

                }
            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().equals("0")) {
                    t1.setText(b27.getText());
                } else t1.setText(t1.getText() + (String)(b27.getText()));
            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String equation = (String) t1.getText();
                // Formatting
                equation = equation.replace("÷", "/");
                equation = equation.replace("×", "*");


                // Checking For Syntax Errors
                boolean syntaxError = false;
                String[] Operands = {
                        "+",
                        "-",
                        "*",
                        "/"
                };
                if (equation.contains("..") || equation.contains("−−")) // Decimal Errors
                    syntaxError = true;
                else if (equation.endsWith("−"))
                    syntaxError = true;

                for (String s: Operands) { // Combinations of operators that cause Errors
                    for (String operand: Operands) {
                        if (equation.contains(s + operand)) {
                            syntaxError = true;
                            break;
                        }
                    }
                    if (equation.endsWith(s) || equation.startsWith(s)) {
                        syntaxError = true;
                    }
                }
                // Updating Visuals
                if (!syntaxError) {
                    // Double Negative Sign Errors
                    try {
                        String output = String.valueOf(solve(equation, 1)).replace("-", "−");

                        if (output.endsWith(".0")) {
                            output = output.substring(0, output.length() - 2);
                        }

                        t3.setText(t2.getText());
                        t2.setText(t1.getText() + " = " + output);
                        if (output.equals("NaN")) {
                            t3.setText(t2.getText());
                            t2.setText(t1.getText() + " = " + "ERROR!");
                            t1.setText("0");
                        } else {
                            t1.setText(output);
                        }
                    } catch (Exception e) {
                        t3.setText(t2.getText());
                        t2.setText(t1.getText() + " = " + "ERROR!");
                        t1.setText("0");
                    }

                } else { // If there is a syntax Error
                    t3.setText(t2.getText());
                    t2.setText(t1.getText() + " = " + "ERROR!");
                    t1.setText("0");
                }
            }
            public void print(String a) {
                System.out.println(a);
            }

            // Math operators
            public Double add(double number1, double number2) {
                return number1 + number2;
            }

            public Double minus(double number1, double number2) {
                return number1 - number2;
            }

            public Double divide(double number1, double number2) {
                return number1 / number2;
            }

            public Double multiply(double number1, double number2) {
                return number1 * number2;
            }

            public Double exponent(double base, double exponent) {
                return Math.pow(base, exponent);
            }


            // Main Solver
            public Double solve(String equation, int nthTime) {

                // Variables
                ArrayList < String > operands = new ArrayList < > ();
                String[] Polynomials;

                // Addition/Subtraction
                if (nthTime == 1) {
                    Polynomials = equation.split("[+\\-]");
                    // Storing Operands
                    for (int x = 0; x < equation.length(); x++) {
                        if (equation.charAt(x) == '+' || equation.charAt(x) == '-') {
                            operands.add((Character.toString(equation.charAt(x))));
                        }
                    }
                }
                // Division/Multiplication
                else {
                    Polynomials = equation.split("[*/]");
                    // Storing Operands
                    for (int x = 0; x < equation.length(); x++) {
                        if (equation.charAt(x) == '*' || equation.charAt(x) == '/') {

                            operands.add((Character.toString(equation.charAt(x))));
                        }
                    }
                }

                // Solving Multiplication/Division
                for (int x = 0; x < Polynomials.length; x++) {
                    // Storing Operands
                    if (Polynomials[x].contains("*") || Polynomials[x].contains("/"))
                        Polynomials[x] = String.valueOf(solve(Polynomials[x], nthTime + 1));

                }

                // Solving Addition and Subtraction
                if (nthTime == 1) { // 2+2pi+2
                    // Replace weird negative sign with normal negative sign
                    for (int x = 0; x < Polynomials.length; x++) {
                        Polynomials[x] = Polynomials[x].replace("−", "-");
                        Polynomials[x] = Polynomials[x].replace("π", "3.14159265358979323846");
                    }
                    for (int x = 0; x < operands.size(); x++) {
                        if (operands.get(x).equals("+"))
                            Polynomials[x + 1] = String.valueOf(add(Double.parseDouble(Polynomials[x]),
                                    Double.parseDouble(Polynomials[x + 1])));

                        if (operands.get(x).equals("-")) {
                            Polynomials[x + 1] = String.valueOf(minus(Double.parseDouble(Polynomials[x]),
                                    Double.parseDouble(Polynomials[x + 1])));
                        }
                    }
                }

                // Solving Division and Multiplication
                else {
                    // Replace weird negative sign with normal negative sign
                    for (int x = 0; x < Polynomials.length; x++) {
                        Polynomials[x] = Polynomials[x].replace("−", "-");
                        Polynomials[x] = Polynomials[x].replace("π", "3.14159265358979323846");
                    }
                    for (int x = 0; x < operands.size(); x++) {
                        if (operands.get(x).equals("*")) {
                            Polynomials[x + 1] = String.valueOf(multiply(Double.parseDouble(Polynomials[x]),
                                    Double.parseDouble(Polynomials[x + 1])));
                        }
                        if (operands.get(x).equals("/")) {
                            Polynomials[x + 1] = String.valueOf(divide(Double.parseDouble(Polynomials[x]),
                                    Double.parseDouble(Polynomials[x + 1])));
                        }
                    }
                }
                int x;
                if (Double.parseDouble(Polynomials[Polynomials.length - 1]) == 1 / 0.0)
                    x = 0 / 0; // Creating an error so the try/catch makes the output "ERROR!"
                return Double.parseDouble(Polynomials[Polynomials.length - 1]); // 0Output
            }
        });

        // Setup
        t1.setText("0");

    }
}



/*
 * Things to do:
 * - Format History Correctly
 */