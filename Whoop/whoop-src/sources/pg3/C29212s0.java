package pg3;

import androidx.room.AbstractC1772c1;
import com.iterable.iterableapi.C5378v;
import g40.C15331c1;
import java.util.ArrayList;
import java.util.regex.Pattern;
import ke3.AbstractC22424a;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import q30.C29938w0;
import ud3.AbstractC34846v0;
import ud3.C34807d0;
import ud3.C34810e0;
import ud3.C34818h0;
import ud3.C34822j0;
import ud3.C34830n0;
import yb3.C39412p;

/* JADX INFO: renamed from: pg3.s0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29212s0 {

    /* JADX INFO: renamed from: l */
    public static final char[] f118212l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m */
    public static final Pattern f118213m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a */
    public final String f118214a;

    /* JADX INFO: renamed from: b */
    public final C34810e0 f118215b;

    /* JADX INFO: renamed from: c */
    public String f118216c;

    /* JADX INFO: renamed from: d */
    public C5378v f118217d;

    /* JADX INFO: renamed from: e */
    public final C34830n0 f118218e = new C34830n0();

    /* JADX INFO: renamed from: f */
    public final C22677k0 f118219f;

    /* JADX INFO: renamed from: g */
    public C34818h0 f118220g;

    /* JADX INFO: renamed from: h */
    public final boolean f118221h;

    /* JADX INFO: renamed from: i */
    public final C29938w0 f118222i;

    /* JADX INFO: renamed from: j */
    public final C15331c1 f118223j;

    /* JADX INFO: renamed from: k */
    public AbstractC34846v0 f118224k;

    public C29212s0(String str, C34810e0 c34810e0, String str2, C34807d0 c34807d0, C34818h0 c34818h0, boolean z4, boolean z13, boolean z14) {
        this.f118214a = str;
        this.f118215b = c34810e0;
        this.f118216c = str2;
        this.f118220g = c34818h0;
        this.f118221h = z4;
        if (c34807d0 != null) {
            this.f118219f = c34807d0.m109865d();
        } else {
            this.f118219f = new C22677k0(2, false);
        }
        if (z13) {
            this.f118223j = new C15331c1();
        } else if (z14) {
            C29938w0 c29938w0 = new C29938w0(19);
            this.f118222i = c29938w0;
            c29938w0.m91556L(C34822j0.f146598f);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m88717a(String str, String str2, boolean z4) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                C39412p c39412p = C34818h0.f146589e;
                this.f118220g = AbstractC1772c1.m5403u(str2);
                return;
            } catch (IllegalArgumentException e5) {
                throw new IllegalArgumentException(AbstractC11266d.m30461o("Malformed content type: ", str2), e5);
            }
        }
        C22677k0 c22677k0 = this.f118219f;
        if (z4) {
            c22677k0.m65765f(str, str2);
        } else {
            c22677k0.m65761b(str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m88718b(String encodedName, String str, boolean z4) {
        String str2 = this.f118216c;
        if (str2 != null) {
            C34810e0 c34810e0 = this.f118215b;
            C5378v c5378vM109879h = c34810e0.m109879h(str2);
            this.f118217d = c5378vM109879h;
            if (c5378vM109879h == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c34810e0 + ", Relative: " + this.f118216c);
            }
            this.f118216c = null;
        }
        if (!z4) {
            this.f118217d.m16525a(encodedName, str);
            return;
        }
        C5378v c5378v = this.f118217d;
        c5378v.getClass();
        AbstractC22676k.m65750j(encodedName, "encodedName");
        if (((ArrayList) c5378v.f21857h) == null) {
            c5378v.f21857h = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) c5378v.f21857h;
        AbstractC22676k.m65747g(arrayList);
        arrayList.add(AbstractC22424a.m64603a(0, encodedName, 0, 83, " \"'<>#&="));
        ArrayList arrayList2 = (ArrayList) c5378v.f21857h;
        AbstractC22676k.m65747g(arrayList2);
        arrayList2.add(str != null ? AbstractC22424a.m64603a(0, str, 0, 83, " \"'<>#&=") : null);
    }
}
