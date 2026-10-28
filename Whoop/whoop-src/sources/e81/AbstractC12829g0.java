package e81;

import androidx.compose.runtime.Composer;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: renamed from: e81.g0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Le81/i0;", "Li2/x;", "a", "(Le81/i0;Landroidx/compose/runtime/Composer;I)J", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12829g0 {

    /* JADX INFO: renamed from: e81.g0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43984a;

        static {
            int[] iArr = new int[EnumC12833i0.values().length];
            try {
                iArr[EnumC12833i0.OPTIMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC12833i0.SUFFICIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC12833i0.OUT_OF_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC12833i0.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f43984a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final long m35965a(EnumC12833i0 enumC12833i0, Composer composer, int i13) {
        AbstractC22676k.m65750j(enumC12833i0, "<this>");
        int i14 = a.f43984a[enumC12833i0.ordinal()];
        if (i14 == 1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1126606372);
            long accentPositiveTrend = C38072d.f163053a.m121949b(c28655q, 6).getAccentPositiveTrend();
            c28655q.m87173q(false);
            return accentPositiveTrend;
        }
        if (i14 == 2) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-1126604104);
            long sufficientTrend = C38072d.f163053a.m121949b(c28655q2, 6).getSufficientTrend();
            c28655q2.m87173q(false);
            return sufficientTrend;
        }
        if (i14 == 3) {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(-1126601892);
            long accentNegativeTrend = C38072d.f163053a.m121949b(c28655q3, 6).getAccentNegativeTrend();
            c28655q3.m87173q(false);
            return accentNegativeTrend;
        }
        if (i14 != 4) {
            throw AbstractC11895b.m32003v(-1126608088, (C28655q) composer, false);
        }
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87150e0(-1126600375);
        c28655q4.m87173q(false);
        return AbstractC17918w0.m51518f(0.25f, 0.26f, 0.26f, 0.8f, 16);
    }
}
