package p184h5;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p543v4.C35643b;

/* JADX INFO: renamed from: h5.e1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16869e1 extends AbstractC16878h1 {

    /* JADX INFO: renamed from: e */
    public static Field f64802e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f64803f = false;

    /* JADX INFO: renamed from: g */
    public static Constructor f64804g = null;

    /* JADX INFO: renamed from: h */
    public static boolean f64805h = false;

    /* JADX INFO: renamed from: c */
    public WindowInsets f64806c;

    /* JADX INFO: renamed from: d */
    public C35643b f64807d;

    public C16869e1() {
        this.f64806c = m47494i();
    }

    /* JADX INFO: renamed from: i */
    private static WindowInsets m47494i() {
        if (!f64803f) {
            try {
                f64802e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e5);
            }
            f64803f = true;
        }
        Field field = f64802e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e13);
            }
        }
        if (!f64805h) {
            try {
                f64804g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e14) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e14);
            }
            f64805h = true;
        }
        Constructor constructor = f64804g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e15) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e15);
            }
        }
        return null;
    }

    @Override // p184h5.AbstractC16878h1
    /* JADX INFO: renamed from: b */
    public C16905q1 mo47495b() {
        m47520a();
        C16905q1 c16905q1M47596h = C16905q1.m47596h(null, this.f64806c);
        C35643b[] c35643bArr = this.f64823b;
        C16899o1 c16899o1 = c16905q1M47596h.f64864a;
        c16899o1.mo47536r(c35643bArr);
        c16899o1.mo47546u(this.f64807d);
        return c16905q1M47596h;
    }

    @Override // p184h5.AbstractC16878h1
    /* JADX INFO: renamed from: e */
    public void mo47496e(C35643b c35643b) {
        this.f64807d = c35643b;
    }

    @Override // p184h5.AbstractC16878h1
    /* JADX INFO: renamed from: g */
    public void mo47497g(C35643b c35643b) {
        WindowInsets windowInsets = this.f64806c;
        if (windowInsets != null) {
            this.f64806c = windowInsets.replaceSystemWindowInsets(c35643b.f151449a, c35643b.f151450b, c35643b.f151451c, c35643b.f151452d);
        }
    }

    public C16869e1(C16905q1 c16905q1) {
        super(c16905q1);
        this.f64806c = c16905q1.m47602g();
    }
}
