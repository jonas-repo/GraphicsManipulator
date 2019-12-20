
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonas
 */
public class VentanaDib extends javax.swing.JFrame {

    Image imagen;
    Graphics2D g = new Graphics2D() {
        @Override
        public void draw(Shape s) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean drawImage(Image img, AffineTransform xform, ImageObserver obs) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawImage(BufferedImage img, BufferedImageOp op, int x, int y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawRenderedImage(RenderedImage img, AffineTransform xform) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawRenderableImage(RenderableImage img, AffineTransform xform) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawString(String str, int x, int y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawString(String str, float x, float y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawString(AttributedCharacterIterator iterator, int x, int y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawString(AttributedCharacterIterator iterator, float x, float y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawGlyphVector(GlyphVector g, float x, float y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void fill(Shape s) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean hit(Rectangle rect, Shape s, boolean onStroke) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public GraphicsConfiguration getDeviceConfiguration() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setComposite(Composite comp) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setPaint(Paint paint) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setStroke(Stroke s) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setRenderingHint(RenderingHints.Key hintKey, Object hintValue) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object getRenderingHint(RenderingHints.Key hintKey) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setRenderingHints(Map<?, ?> hints) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void addRenderingHints(Map<?, ?> hints) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public RenderingHints getRenderingHints() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void translate(int x, int y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void translate(double tx, double ty) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void rotate(double theta) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void rotate(double theta, double x, double y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void scale(double sx, double sy) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void shear(double shx, double shy) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void transform(AffineTransform Tx) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setTransform(AffineTransform Tx) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public AffineTransform getTransform() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Paint getPaint() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Composite getComposite() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setBackground(Color color) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Color getBackground() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Stroke getStroke() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void clip(Shape s) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public FontRenderContext getFontRenderContext() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Graphics create() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Color getColor() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setColor(Color c) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setPaintMode() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setXORMode(Color c1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Font getFont() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setFont(Font font) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public FontMetrics getFontMetrics(Font f) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Rectangle getClipBounds() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void clipRect(int x, int y, int width, int height) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setClip(int x, int y, int width, int height) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Shape getClip() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setClip(Shape clip) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void copyArea(int x, int y, int width, int height, int dx, int dy) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawLine(int x1, int y1, int x2, int y2) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void fillRect(int x, int y, int width, int height) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void clearRect(int x, int y, int width, int height) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawOval(int x, int y, int width, int height) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void fillOval(int x, int y, int width, int height) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void dispose() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    HiloTraslacionArriba traslacionHilo;
    HiloEscalado escaladoHilo;
    ImageIcon frente = new ImageIcon("src/frente.png"); 
    ImageIcon atras = new ImageIcon("src/atras.png"); 
    ImageIcon izq = new ImageIcon("src/izq.png"); 
    ImageIcon der = new ImageIcon("src/der.png"); 
    ImageIcon m1 = new ImageIcon("src/menu2.png"); 
    ClaseDibujar draw = new ClaseDibujar();
    int bandera=1;
    public VentanaDib() {
    initComponents();
    draw.dibuja(frente, areaDibujo);
    draw.cambiarColor(rotacion360);
    draw.cambiarColor(rotacion180);
    draw.cambiarColor(rotacion90);
    draw.cambiarColor(rotacion270);
    draw.cambiarColor(abajoTraslacion);
    draw.cambiarColor(transicionIzquierda);
    draw.cambiarColor(traslacionDerecha);
    draw.cambiarColor(traslacionArriba);
    draw.cambiarColor(aumentarEsc);
    draw.cambiarColor(disminuirEsc);
    this.getContentPane().setBackground(Color.white);
    this.setTitle("Pantalla");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transicionIzquierda = new javax.swing.JButton();
        abajoTraslacion = new javax.swing.JButton();
        traslacionDerecha = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rotacion360 = new javax.swing.JButton();
        rotacion270 = new javax.swing.JButton();
        area = new javax.swing.JPanel();
        areaDibujo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        escala1 = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        traslacionArriba = new javax.swing.JButton();
        rotacion90 = new javax.swing.JButton();
        rotacion180 = new javax.swing.JButton();
        aumentarEsc = new javax.swing.JButton();
        disminuirEsc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 211));
        setPreferredSize(new java.awt.Dimension(1212, 681));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        transicionIzquierda.setBackground(new java.awt.Color(0, 0, 0));
        transicionIzquierda.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        transicionIzquierda.setForeground(new java.awt.Color(255, 255, 255));
        transicionIzquierda.setText("◄");
        transicionIzquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transicionIzquierdaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                transicionIzquierdaMouseReleased(evt);
            }
        });
        getContentPane().add(transicionIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, 50, 60));

        abajoTraslacion.setBackground(new java.awt.Color(0, 0, 0));
        abajoTraslacion.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        abajoTraslacion.setForeground(new java.awt.Color(255, 255, 255));
        abajoTraslacion.setText("▼");
        abajoTraslacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                abajoTraslacionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                abajoTraslacionMouseReleased(evt);
            }
        });
        getContentPane().add(abajoTraslacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 200, 100, 30));

        traslacionDerecha.setBackground(new java.awt.Color(0, 0, 0));
        traslacionDerecha.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        traslacionDerecha.setForeground(new java.awt.Color(255, 255, 255));
        traslacionDerecha.setText("►");
        traslacionDerecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                traslacionDerechaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                traslacionDerechaMouseReleased(evt);
            }
        });
        getContentPane().add(traslacionDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 110, -1, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Traslación");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 120, -1, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Rotación");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 430, 70, 40));

        rotacion360.setBackground(new java.awt.Color(0, 0, 0));
        rotacion360.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        rotacion360.setForeground(new java.awt.Color(255, 255, 255));
        rotacion360.setText("►");
        rotacion360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotacion360ActionPerformed(evt);
            }
        });
        getContentPane().add(rotacion360, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 420, -1, 60));

        rotacion270.setBackground(new java.awt.Color(0, 0, 0));
        rotacion270.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        rotacion270.setForeground(new java.awt.Color(255, 255, 255));
        rotacion270.setText("▼");
        rotacion270.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotacion270ActionPerformed(evt);
            }
        });
        getContentPane().add(rotacion270, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 510, 100, 30));

        area.setBackground(new java.awt.Color(255, 255, 255));
        area.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 10, true));
        area.setFocusCycleRoot(true);
        area.setPreferredSize(new java.awt.Dimension(600, 500));
        area.setLayout(null);
        area.add(areaDibujo);
        areaDibujo.setBounds(20, 80, 820, 312);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall.jpg"))); // NOI18N
        area.add(jLabel12);
        jLabel12.setBounds(10, 10, 840, 480);

        getContentPane().add(area, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 854, 500));

        escala1.setToolTipText("");
        escala1.setEnabled(false);
        getContentPane().add(escala1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, 262, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Escalado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 70, -1));

        traslacionArriba.setBackground(new java.awt.Color(0, 0, 0));
        traslacionArriba.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        traslacionArriba.setForeground(new java.awt.Color(255, 255, 255));
        traslacionArriba.setText("▲");
        traslacionArriba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                traslacionArribaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                traslacionArribaMouseReleased(evt);
            }
        });
        getContentPane().add(traslacionArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 100, 30));

        rotacion90.setBackground(new java.awt.Color(0, 0, 0));
        rotacion90.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        rotacion90.setForeground(new java.awt.Color(255, 255, 255));
        rotacion90.setText("▲");
        rotacion90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotacion90ActionPerformed(evt);
            }
        });
        getContentPane().add(rotacion90, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 350, 100, 30));

        rotacion180.setBackground(new java.awt.Color(0, 0, 0));
        rotacion180.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        rotacion180.setForeground(new java.awt.Color(255, 255, 255));
        rotacion180.setText("◄");
        rotacion180.setBorder(new javax.swing.border.MatteBorder(null));
        rotacion180.setPreferredSize(new java.awt.Dimension(43, 23));
        rotacion180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotacion180ActionPerformed(evt);
            }
        });
        getContentPane().add(rotacion180, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, 50, 60));

        aumentarEsc.setBackground(new java.awt.Color(0, 0, 0));
        aumentarEsc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        aumentarEsc.setForeground(new java.awt.Color(255, 255, 255));
        aumentarEsc.setText("+");
        aumentarEsc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aumentarEscMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                aumentarEscMouseReleased(evt);
            }
        });
        getContentPane().add(aumentarEsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 565, -1, -1));

        disminuirEsc.setBackground(new java.awt.Color(0, 0, 0));
        disminuirEsc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        disminuirEsc.setForeground(new java.awt.Color(255, 255, 255));
        disminuirEsc.setText("-");
        disminuirEsc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                disminuirEscMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                disminuirEscMouseReleased(evt);
            }
        });
        getContentPane().add(disminuirEsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 565, 40, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu4.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 260, 240));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu4.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 330, 250, 240));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha2.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 250, 80));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("270°");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 560, 40, 40));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setText("360°");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 430, 40, 40));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setText("90°");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 300, 40, 40));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setText("180°");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 430, 40, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void rotacionBotones()
    {
      draw.cambiarColor(rotacion360);
      draw.cambiarColor(rotacion180);
      draw.cambiarColor(rotacion90);
      draw.cambiarColor(rotacion270);
    }
    private void traslacionArribaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_traslacionArribaMousePressed
    rotacionBotones();
    draw.devolverColor(traslacionArriba);
    traslacionHilo = new HiloTraslacionArriba(1,areaDibujo);
    traslacionHilo.start();
    }//GEN-LAST:event_traslacionArribaMousePressed

    private void traslacionArribaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_traslacionArribaMouseReleased
    traslacionHilo.stop();
    draw.cambiarColor(traslacionArriba);
    }//GEN-LAST:event_traslacionArribaMouseReleased

    private void abajoTraslacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abajoTraslacionMousePressed
     rotacionBotones();
     draw.devolverColor(abajoTraslacion);
     traslacionHilo = new HiloTraslacionArriba(2,areaDibujo);
     traslacionHilo.start();
    }//GEN-LAST:event_abajoTraslacionMousePressed

    private void abajoTraslacionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abajoTraslacionMouseReleased
     traslacionHilo.stop();
     draw.cambiarColor(abajoTraslacion);
    }//GEN-LAST:event_abajoTraslacionMouseReleased

    private void traslacionDerechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_traslacionDerechaMousePressed
     rotacionBotones();
     draw.devolverColor(traslacionDerecha);
     traslacionHilo = new HiloTraslacionArriba(3,areaDibujo);
     traslacionHilo.start();   
    }//GEN-LAST:event_traslacionDerechaMousePressed

    private void traslacionDerechaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_traslacionDerechaMouseReleased
     traslacionHilo.stop();
     draw.cambiarColor(traslacionDerecha);
    }//GEN-LAST:event_traslacionDerechaMouseReleased

    private void transicionIzquierdaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transicionIzquierdaMousePressed
     rotacionBotones();
     draw.devolverColor(transicionIzquierda);
     traslacionHilo = new HiloTraslacionArriba(4,areaDibujo);
     traslacionHilo.start();    
    }//GEN-LAST:event_transicionIzquierdaMousePressed

    private void transicionIzquierdaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transicionIzquierdaMouseReleased
     draw.cambiarColor(transicionIzquierda);
     traslacionHilo.stop(); 
    }//GEN-LAST:event_transicionIzquierdaMouseReleased

    private void rotacion90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotacion90ActionPerformed
     rotacionBotones();
     switch(bandera)
      {
          case 1:      
           draw.dibuja(izq, areaDibujo);
           bandera=3;
           break;
          case 2:
           draw.dibuja(der, areaDibujo);
           bandera=4;
           break;
          case 3:
           draw.dibuja(atras, areaDibujo);
           bandera=2;
           break;
          case 4:
           draw.dibuja(frente, areaDibujo);
           bandera=1;
           break;
     }
     draw.devolverColor(rotacion90);
    }//GEN-LAST:event_rotacion90ActionPerformed

    private void rotacion180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotacion180ActionPerformed
      rotacionBotones();
       switch(bandera)
      {
          case 1:      
           draw.dibuja(atras, areaDibujo);
           bandera=2;
           break;
          case 2:
           draw.dibuja(frente, areaDibujo);
           bandera=1;
           break;
          case 3:
           draw.dibuja(der, areaDibujo);
           bandera=4;
           break;
          case 4:
           draw.dibuja(izq, areaDibujo);
           bandera=3;
           break;
      }
     
      draw.devolverColor(rotacion180);
    }//GEN-LAST:event_rotacion180ActionPerformed

    private void rotacion270ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotacion270ActionPerformed
      rotacionBotones();
      switch(bandera)
      {
          case 1:      
           draw.dibuja(der, areaDibujo);
           bandera=4;
           break;
          case 2:
           draw.dibuja(izq, areaDibujo);
           bandera=3;
           break;
          case 3:
           draw.dibuja(frente, areaDibujo);
           bandera=1;
           break;
          case 4:
           draw.dibuja(atras, areaDibujo);
           bandera=2;
           break;
      }
      draw.devolverColor(rotacion270);
    }//GEN-LAST:event_rotacion270ActionPerformed

    private void rotacion360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotacion360ActionPerformed
      rotacionBotones();
      draw.devolverColor(rotacion360); 
    }//GEN-LAST:event_rotacion360ActionPerformed

    private void aumentarEscMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aumentarEscMousePressed
    switch(bandera)
    { 
        case 1:
            escaladoHilo = new HiloEscalado(frente, areaDibujo, true, escala1);
            break;
        case 2:
            escaladoHilo = new HiloEscalado(atras, areaDibujo, true, escala1);
            break;
        case 3:
            escaladoHilo = new HiloEscalado(izq, areaDibujo, true, escala1);
            break;
        case 4:
            escaladoHilo = new HiloEscalado(der, areaDibujo, true, escala1);
            break;
    }
     rotacionBotones();
     draw.devolverColor(aumentarEsc);
     escaladoHilo.start();
    }//GEN-LAST:event_aumentarEscMousePressed

    private void aumentarEscMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aumentarEscMouseReleased
      escaladoHilo.stop();
      draw.cambiarColor(aumentarEsc);
    }//GEN-LAST:event_aumentarEscMouseReleased

    private void disminuirEscMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disminuirEscMousePressed
     switch(bandera)
    { 
        case 1:
            escaladoHilo = new HiloEscalado(frente, areaDibujo, false, escala1);
            break;
        case 2:
            escaladoHilo = new HiloEscalado(atras, areaDibujo, false, escala1);
            break;
        case 3:
            escaladoHilo = new HiloEscalado(izq, areaDibujo, false, escala1);
            break;
        case 4:
            escaladoHilo = new HiloEscalado(der, areaDibujo, false, escala1);
            break;
    }
     rotacionBotones();
     draw.devolverColor(disminuirEsc);
     escaladoHilo.start();
    }//GEN-LAST:event_disminuirEscMousePressed

    private void disminuirEscMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disminuirEscMouseReleased
     escaladoHilo.stop();  
     draw.cambiarColor(disminuirEsc);
    }//GEN-LAST:event_disminuirEscMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaDib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDib().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abajoTraslacion;
    private javax.swing.JPanel area;
    private javax.swing.JLabel areaDibujo;
    private javax.swing.JButton aumentarEsc;
    private javax.swing.JButton disminuirEsc;
    private javax.swing.JSlider escala1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton rotacion180;
    private javax.swing.JButton rotacion270;
    private javax.swing.JButton rotacion360;
    private javax.swing.JButton rotacion90;
    private javax.swing.JButton transicionIzquierda;
    private javax.swing.JButton traslacionArriba;
    private javax.swing.JButton traslacionDerecha;
    // End of variables declaration//GEN-END:variables
}
