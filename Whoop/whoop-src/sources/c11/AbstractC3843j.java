package c11;

import androidx.compose.runtime.Composer;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: renamed from: c11.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lc11/o;", "style", "Lc11/b;", "a", "(Lc11/o;Landroidx/compose/runtime/Composer;I)Lc11/b;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3843j {

    /* JADX INFO: renamed from: c11.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15753a;

        static {
            int[] iArr = new int[EnumC3848o.values().length];
            try {
                iArr[EnumC3848o.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3848o.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15753a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C3835b m11785a(EnumC3848o style, Composer composer, int i13) {
        AbstractC22676k.m65750j(style, "style");
        int i14 = a.f15753a[style.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                throw AbstractC11895b.m32003v(113170963, (C28655q) composer, false);
            }
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(113185465);
            C38072d c38072d = C38072d.f163053a;
            C3835b c3835b = new C3835b(c38072d.m121949b(c28655q, 6).getWhite30(), c38072d.m121949b(c28655q, 6).getWhite30(), c38072d.m121949b(c28655q, 6).getWhite30(), c38072d.m121949b(c28655q, 6).getWhite30(), c38072d.m121949b(c28655q, 6).getWhite30(), c38072d.m121949b(c28655q, 6).getWhite30(), null);
            c28655q.m87173q(false);
            return c3835b;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(113172086);
        C38072d c38072d2 = C38072d.f163053a;
        long brandWhite = c38072d2.m121949b(c28655q2, 6).getBrandWhite();
        long white50 = c38072d2.m121949b(c28655q2, 6).getWhite50();
        int i15 = C17919x.f69638o;
        C3835b c3835b2 = new C3835b(brandWhite, white50, C17919x.f69637n, c38072d2.m121949b(c28655q2, 6).getWhite70(), c38072d2.m121949b(c28655q2, 6).getWhite70(), c38072d2.m121949b(c28655q2, 6).getBrandWhite(), null);
        c28655q2.m87173q(false);
        return c3835b2;
    }
}
