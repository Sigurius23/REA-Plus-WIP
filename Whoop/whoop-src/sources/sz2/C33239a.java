package sz2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.util.Log;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rz2.EnumC31928a;
import uz2.EnumC35444a;
import vu1.AbstractC36510a;

/* JADX INFO: renamed from: sz2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\u0015\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u0016\u0010)\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001dR\u0016\u0010+\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001dR\u0018\u0010.\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00101R\u0016\u00109\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00101R\u0016\u0010;\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00101R\u0014\u0010=\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u001b¨\u0006>"}, m65681d2 = {"Lsz2/a;", "Lsz2/b;", "Landroid/content/Context;", "context", "", "width", "height", "<init>", "(Landroid/content/Context;II)V", "Ll83/a0;", "L", "()V", "M", "G", "y", "t", "onSurfaceChanged", "(II)V", "v", "Landroid/graphics/Bitmap;", "bitmap", "K", "(Landroid/graphics/Bitmap;)V", "Lrz2/a;", "liveColorMode", "H", "(Lrz2/a;)V", "I", "color", "F", "(I)V", "Luz2/a;", "mode", "J", "(Luz2/a;)V", "g0", "overlayTextureId", "", "h0", "offsetR", "i0", "offsetG", "j0", "offsetB", "k0", "Luz2/a;", "colorMode", "", "l0", "Z", "mUpdateIsNeeded", "m0", "Landroid/graphics/Bitmap;", "bmp", "n0", "doTint", "o0", "doGrayscale", "p0", "doOverlay", "q0", "colorTintBlue", "whooplive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33239a extends AbstractC33240b {

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private int overlayTextureId;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    private float offsetR;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    private float offsetG;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    private float offsetB;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    private EnumC35444a colorMode;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    private boolean mUpdateIsNeeded;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    private Bitmap bmp;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    private boolean doTint;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    private boolean doGrayscale;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    private boolean doOverlay;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    private final int colorTintBlue;

    /* JADX INFO: renamed from: sz2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f138597a;

        static {
            int[] iArr = new int[EnumC31928a.values().length];
            try {
                iArr[EnumC31928a.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31928a.Blue.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f138597a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33239a(Context context, int i13, int i14) {
        super(context);
        AbstractC22676k.m65750j(context, "context");
        this.overlayTextureId = -1;
        this.offsetR = 0.5f;
        this.offsetG = 0.5f;
        this.offsetB = 0.5f;
        this.f138603G = i14;
        this.f138602F = i13;
        this.colorTintBlue = AbstractC32122c.getColor(context, AbstractC36510a.f156020b);
    }

    /* JADX INFO: renamed from: G */
    private final void m105440G() {
        float f13 = ((this.offsetB + this.offsetG) + this.offsetR) / 3;
        this.offsetR = f13;
        this.offsetG = f13;
        this.offsetB = f13;
        this.doTint = false;
        this.doGrayscale = true;
        this.doOverlay = false;
    }

    /* JADX INFO: renamed from: L */
    private final void m105441L() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f138602F, this.f138603G, Bitmap.Config.ARGB_8888);
        if (bitmapCreateBitmap != null) {
            bitmapCreateBitmap.eraseColor(Color.argb(0, 0, 0, 0));
        }
        this.overlayTextureId = m105460g(bitmapCreateBitmap, "displayTexture");
    }

    /* JADX INFO: renamed from: M */
    private final void m105442M() {
        if (this.bmp == null || this.overlayTextureId == -1) {
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f138602F, this.f138603G, Bitmap.Config.ARGB_8888);
        if (bitmapCreateBitmap != null) {
            bitmapCreateBitmap.eraseColor(Color.argb(0, 0, 0, 0));
        }
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Bitmap bitmap = this.bmp;
            AbstractC22676k.m65747g(bitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            m105458E(this.overlayTextureId, bitmapCreateBitmap);
        }
        this.bmp = null;
    }

    /* JADX INFO: renamed from: F */
    public final void m105443F(int color) {
        this.offsetR = ((color >> 16) & 255) / 256.0f;
        this.offsetG = ((color >> 8) & 255) / 256.0f;
        this.offsetB = (color & 255) / 256.0f;
        this.doTint = true;
        this.doGrayscale = false;
        this.doOverlay = false;
    }

    /* JADX INFO: renamed from: H */
    public final void m105444H(EnumC31928a liveColorMode) {
        AbstractC22676k.m65750j(liveColorMode, "liveColorMode");
        int i13 = a.f138597a[liveColorMode.ordinal()];
        if (i13 == 1) {
            m105445I();
        } else if (i13 != 2) {
            m105440G();
        } else {
            m105443F(this.colorTintBlue);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m105445I() {
        float f13 = ((this.offsetB + this.offsetG) + this.offsetR) / 3;
        this.offsetR = f13;
        this.offsetG = f13;
        this.offsetB = f13;
        this.doTint = false;
        this.doGrayscale = false;
        this.doOverlay = false;
    }

    /* JADX INFO: renamed from: J */
    public final void m105446J(EnumC35444a mode) {
        AbstractC22676k.m65750j(mode, "mode");
        this.colorMode = mode;
        this.doTint = false;
        this.doGrayscale = false;
        this.doOverlay = true;
    }

    /* JADX INFO: renamed from: K */
    public final void m105447K(Bitmap bitmap) {
        if (bitmap != null) {
            this.bmp = bitmap;
            this.mUpdateIsNeeded = true;
        }
    }

    @Override // sz2.AbstractC33240b, com.whoop.whooplive.live.views.WhoopRecordableSurfaceView.InterfaceC10866b
    public void onSurfaceChanged(int width, int height) {
        if (width > 0) {
            super.onSurfaceChanged(width, height);
        }
    }

    @Override // sz2.AbstractC33240b
    /* JADX INFO: renamed from: t */
    public void mo105448t() {
        m105441L();
        super.mo105448t();
    }

    @Override // sz2.AbstractC33240b
    /* JADX INFO: renamed from: v */
    public void mo105449v() {
        if (this.mUpdateIsNeeded) {
            try {
                m105442M();
            } catch (IllegalArgumentException e5) {
                Log.d("WhoopLiveRenderer", "ILLEGAL", e5);
            }
            this.mUpdateIsNeeded = false;
        }
        super.mo105449v();
    }

    @Override // sz2.AbstractC33240b
    /* JADX INFO: renamed from: y */
    public void mo105450y() {
        super.mo105450y();
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f138609M, "offsetR");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f138609M, "offsetG");
        int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(this.f138609M, "offsetB");
        int iGlGetUniformLocation4 = GLES20.glGetUniformLocation(this.f138609M, "tintEnabled");
        int iGlGetUniformLocation5 = GLES20.glGetUniformLocation(this.f138609M, "grayscaleEnabled");
        int iGlGetUniformLocation6 = GLES20.glGetUniformLocation(this.f138609M, "overlayEnabled");
        int iGlGetUniformLocation7 = GLES20.glGetUniformLocation(this.f138609M, "overlay");
        GLES20.glUniform1f(iGlGetUniformLocation, this.offsetR);
        GLES20.glUniform1f(iGlGetUniformLocation2, this.offsetG);
        GLES20.glUniform1f(iGlGetUniformLocation3, this.offsetB);
        GLES20.glUniform1i(iGlGetUniformLocation4, this.doTint ? 1 : 0);
        GLES20.glUniform1i(iGlGetUniformLocation5, this.doGrayscale ? 1 : 0);
        GLES20.glUniform1i(iGlGetUniformLocation6, this.doOverlay ? 1 : 0);
        if (this.doOverlay) {
            if (this.colorMode == EnumC35444a.DARK) {
                GLES20.glUniform4f(iGlGetUniformLocation7, 0.5f, 0.5f, 0.5f, 1.0f);
            } else {
                GLES20.glUniform4f(iGlGetUniformLocation7, 1.0f, 1.0f, 1.0f, 1.0f);
            }
        }
    }
}
