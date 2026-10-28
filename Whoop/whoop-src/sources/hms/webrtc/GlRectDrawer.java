package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public class GlRectDrawer extends GlGenericDrawer {
    private static final String FRAGMENT_SHADER = "void main() {\n  gl_FragColor = sample(tc);\n}\n";

    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        public /* synthetic */ ShaderCallbacks(int i13) {
            this();
        }

        @Override // hms.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
        }

        @Override // hms.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i13, int i14, int i15, int i16) {
        }

        private ShaderCallbacks() {
        }
    }

    public GlRectDrawer() {
        super(FRAGMENT_SHADER, new ShaderCallbacks(0));
    }

    @Override // hms.webrtc.GlGenericDrawer, hms.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawOes(int i13, float[] fArr, int i14, int i15, int i16, int i17, int i18, int i19) {
        super.drawOes(i13, fArr, i14, i15, i16, i17, i18, i19);
    }

    @Override // hms.webrtc.GlGenericDrawer, hms.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawRgb(int i13, float[] fArr, int i14, int i15, int i16, int i17, int i18, int i19) {
        super.drawRgb(i13, fArr, i14, i15, i16, i17, i18, i19);
    }

    @Override // hms.webrtc.GlGenericDrawer, hms.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawYuv(int[] iArr, float[] fArr, int i13, int i14, int i15, int i16, int i17, int i18) {
        super.drawYuv(iArr, fArr, i13, i14, i15, i16, i17, i18);
    }

    @Override // hms.webrtc.GlGenericDrawer, hms.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
