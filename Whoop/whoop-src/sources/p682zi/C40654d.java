package p682zi;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import b30.C2570m;
import bd3.C3143v;
import dj.AbstractC12058c;
import dj.AbstractC12064i;
import dj.C12056a;
import dj.C12063h;
import java.io.IOException;
import java.util.HashMap;
import p078d1.C11457j;
import p426qi.C30387i;
import p426qi.C30402w;
import p426qi.C30404y;
import p426qi.InterfaceC30372a0;
import p462ri.C31441a;
import p502ti.C33824g;
import p502ti.C33835r;
import vi.C36055a;

/* JADX INFO: renamed from: zi.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C40654d extends AbstractC40652b {

    /* JADX INFO: renamed from: D */
    public final C31441a f175499D;

    /* JADX INFO: renamed from: E */
    public final Rect f175500E;

    /* JADX INFO: renamed from: F */
    public final Rect f175501F;

    /* JADX INFO: renamed from: G */
    public final RectF f175502G;

    /* JADX INFO: renamed from: H */
    public final C30404y f175503H;

    /* JADX INFO: renamed from: I */
    public C33835r f175504I;

    /* JADX INFO: renamed from: J */
    public C33835r f175505J;

    /* JADX INFO: renamed from: K */
    public final C33824g f175506K;

    /* JADX INFO: renamed from: L */
    public C12063h f175507L;

    /* JADX INFO: renamed from: M */
    public C3143v f175508M;

    public C40654d(C30402w c30402w, C40655e c40655e) {
        super(c30402w, c40655e);
        this.f175499D = new C31441a(3);
        this.f175500E = new Rect();
        this.f175501F = new Rect();
        this.f175502G = new RectF();
        String str = c40655e.f175515g;
        C30387i c30387i = c30402w.f124769w;
        this.f175503H = c30387i == null ? null : (C30404y) ((HashMap) c30387i.m92860c()).get(str);
        C2570m c2570m = this.f175478p.f175532x;
        if (c2570m != null) {
            this.f175506K = new C33824g(this, this, c2570m);
        }
    }

    @Override // p682zi.AbstractC40652b, si.InterfaceC32519e
    /* JADX INFO: renamed from: e */
    public final void mo101533e(RectF rectF, Matrix matrix, boolean z4) {
        Bitmap bitmapM131936q;
        super.mo101533e(rectF, matrix, z4);
        C30404y c30404y = this.f175503H;
        if (c30404y != null) {
            int i13 = c30404y.f124776b;
            int i14 = c30404y.f124775a;
            float fM33265c = AbstractC12064i.m33265c();
            if (this.f175477o.f124739M || (bitmapM131936q = m131936q()) == null) {
                rectF.set(0.0f, 0.0f, i14 * fM33265c, i13 * fM33265c);
            } else {
                rectF.set(0.0f, 0.0f, bitmapM131936q.getWidth() * fM33265c, bitmapM131936q.getHeight() * fM33265c);
            }
            this.f175476n.mapRect(rectF);
        }
    }

    @Override // p682zi.AbstractC40652b, p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: g */
    public final void mo101534g(C11457j c11457j, Object obj) {
        super.mo101534g(c11457j, obj);
        if (obj == InterfaceC30372a0.f124614F) {
            if (c11457j == null) {
                this.f175504I = null;
                return;
            } else {
                this.f175504I = new C33835r(c11457j, null);
                return;
            }
        }
        if (obj == InterfaceC30372a0.f124617I) {
            if (c11457j == null) {
                this.f175505J = null;
                return;
            } else {
                this.f175505J = new C33835r(c11457j, null);
                return;
            }
        }
        C33824g c33824g = this.f175506K;
        if (obj == 5 && c33824g != null) {
            c33824g.f141658c.m106986j(c11457j);
            return;
        }
        if (obj == InterfaceC30372a0.f124610B && c33824g != null) {
            c33824g.m106990c(c11457j);
            return;
        }
        if (obj == InterfaceC30372a0.f124611C && c33824g != null) {
            c33824g.f141660e.m106986j(c11457j);
            return;
        }
        if (obj == InterfaceC30372a0.f124612D && c33824g != null) {
            c33824g.f141661f.m106986j(c11457j);
        } else {
            if (obj != InterfaceC30372a0.f124613E || c33824g == null) {
                return;
            }
            c33824g.f141662g.m106986j(c11457j);
        }
    }

    @Override // p682zi.AbstractC40652b
    /* JADX INFO: renamed from: i */
    public final void mo131928i(Canvas canvas, Matrix matrix, int i13, C12056a c12056a) {
        C30404y c30404y;
        Bitmap bitmapM131936q = m131936q();
        if (bitmapM131936q == null || bitmapM131936q.isRecycled() || (c30404y = this.f175503H) == null) {
            return;
        }
        float fM33265c = AbstractC12064i.m33265c();
        C31441a c31441a = this.f175499D;
        c31441a.setAlpha(i13);
        C33835r c33835r = this.f175504I;
        if (c33835r != null) {
            c31441a.setColorFilter((ColorFilter) c33835r.mo106981e());
        }
        C33824g c33824g = this.f175506K;
        if (c33824g != null) {
            c12056a = c33824g.m106989b(matrix, i13);
        }
        int width = bitmapM131936q.getWidth();
        int height = bitmapM131936q.getHeight();
        Rect rect = this.f175500E;
        rect.set(0, 0, width, height);
        boolean z4 = this.f175477o.f124739M;
        Rect rect2 = this.f175501F;
        if (z4) {
            rect2.set(0, 0, (int) (c30404y.f124775a * fM33265c), (int) (c30404y.f124776b * fM33265c));
        } else {
            rect2.set(0, 0, (int) (bitmapM131936q.getWidth() * fM33265c), (int) (bitmapM131936q.getHeight() * fM33265c));
        }
        boolean z13 = c12056a != null;
        if (z13) {
            if (this.f175507L == null) {
                this.f175507L = new C12063h();
            }
            if (this.f175508M == null) {
                this.f175508M = new C3143v(2, (byte) 0);
            }
            C3143v c3143v = this.f175508M;
            c3143v.f12310x = 255;
            c3143v.f12311y = null;
            c12056a.getClass();
            C12056a c12056a2 = new C12056a(c12056a);
            c3143v.f12311y = c12056a2;
            c12056a2.m33236b(i13);
            float f13 = rect2.left;
            float f14 = rect2.top;
            float f15 = rect2.right;
            float f16 = rect2.bottom;
            RectF rectF = this.f175502G;
            rectF.set(f13, f14, f15, f16);
            matrix.mapRect(rectF);
            canvas = this.f175507L.m33262e(canvas, rectF, this.f175508M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapM131936q, rect, rect2, c31441a);
        if (z13) {
            this.f175507L.m33261c();
            if (this.f175507L.f40007c == 4) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    /* JADX WARN: Code duplicated, block: B:75:0x015b  */
    /* JADX INFO: renamed from: q */
    public final Bitmap m131936q() {
        Bitmap bitmapM33266d;
        Bitmap bitmap;
        C33835r c33835r = this.f175505J;
        if (c33835r != null && (bitmap = (Bitmap) c33835r.mo106981e()) != null) {
            return bitmap;
        }
        String str = this.f175478p.f175515g;
        C30402w c30402w = this.f175477o;
        C36055a c36055a = c30402w.f124733G;
        if (c36055a != null) {
            Context contextM92882i = c30402w.m92882i();
            Context context = c36055a.f153921a;
            if (contextM92882i != null) {
                if (context instanceof Application) {
                    contextM92882i = contextM92882i.getApplicationContext();
                }
                if (contextM92882i != context) {
                    c30402w.f124733G = null;
                }
            } else if (context != null) {
                c30402w.f124733G = null;
            }
        }
        if (c30402w.f124733G == null) {
            c30402w.f124733G = new C36055a(c30402w.getCallback(), c30402w.f124734H, c30402w.f124769w.m92860c());
        }
        C36055a c36055a2 = c30402w.f124733G;
        if (c36055a2 != null) {
            String str2 = c36055a2.f153922b;
            C30404y c30404y = (C30404y) c36055a2.f153923c.get(str);
            if (c30404y == null) {
                bitmapM33266d = null;
            } else {
                int i13 = c30404y.f124776b;
                int i14 = c30404y.f124775a;
                bitmapM33266d = c30404y.f124780f;
                if (bitmapM33266d == null) {
                    Context context2 = c36055a2.f153921a;
                    if (context2 == null) {
                        bitmapM33266d = null;
                    } else {
                        String str3 = c30404y.f124778d;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                            try {
                                if (TextUtils.isEmpty(str2)) {
                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                }
                                try {
                                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                    if (bitmapDecodeStream == null) {
                                        AbstractC12058c.m33239b("Decoded image `" + str + "` is null.");
                                        bitmapM33266d = null;
                                    } else {
                                        bitmapM33266d = AbstractC12064i.m33266d(bitmapDecodeStream, i14, i13);
                                        synchronized (C36055a.f153920d) {
                                            ((C30404y) c36055a2.f153923c.get(str)).f124780f = bitmapM33266d;
                                        }
                                    }
                                } catch (IllegalArgumentException e5) {
                                    AbstractC12058c.m33240c("Unable to decode image `" + str + "`.", e5);
                                }
                            } catch (IOException e13) {
                                AbstractC12058c.m33240c("Unable to open asset.", e13);
                            }
                        } else {
                            try {
                                byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                try {
                                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                                    if (bitmapDecodeByteArray == null) {
                                        AbstractC12058c.m33239b("Decoded image `" + str + "` is null.");
                                        bitmapM33266d = null;
                                    } else {
                                        bitmapM33266d = AbstractC12064i.m33266d(bitmapDecodeByteArray, i14, i13);
                                        synchronized (C36055a.f153920d) {
                                            ((C30404y) c36055a2.f153923c.get(str)).f124780f = bitmapM33266d;
                                        }
                                    }
                                } catch (IllegalArgumentException e14) {
                                    AbstractC12058c.m33240c("Unable to decode image `" + str + "`.", e14);
                                }
                            } catch (IllegalArgumentException e15) {
                                AbstractC12058c.m33240c("data URL did not have correct base64 format.", e15);
                            }
                        }
                    }
                }
            }
        } else {
            bitmapM33266d = null;
        }
        if (bitmapM33266d != null) {
            return bitmapM33266d;
        }
        C30404y c30404y2 = this.f175503H;
        if (c30404y2 != null) {
            return c30404y2.f124780f;
        }
        return null;
    }
}
