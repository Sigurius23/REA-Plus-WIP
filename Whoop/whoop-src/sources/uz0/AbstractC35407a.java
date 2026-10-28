package uz0;

import androidx.compose.runtime.Composer;
import ih0.AbstractC18489d0;
import p088dc.AbstractC11895b;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: renamed from: uz0.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Luz0/b;", "intensityStyle", "Li2/x;", "a", "(Luz0/b;Landroidx/compose/runtime/Composer;I)J", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35407a {

    /* JADX INFO: renamed from: uz0.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f150844a;

        static {
            int[] iArr = new int[EnumC35408b.values().length];
            try {
                iArr[EnumC35408b.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC35408b.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC35408b.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC35408b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f150844a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final long m112324a(EnumC35408b intensityStyle, Composer composer, int i13) {
        long accentPositiveTrend;
        AbstractC22676k.m65750j(intensityStyle, "intensityStyle");
        int i14 = a.f150844a[intensityStyle.ordinal()];
        if (i14 == 1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1859242325);
            accentPositiveTrend = C38072d.f163053a.m121949b(c28655q, 6).getAccentPositiveTrend();
            c28655q.m87173q(false);
        } else if (i14 == 2) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(1859244856);
            accentPositiveTrend = C38072d.f163053a.m121949b(c28655q2, 6).getRecoveryMediumRecovery();
            c28655q2.m87173q(false);
        } else {
            if (i14 != 3) {
                if (i14 != 4) {
                    throw AbstractC11895b.m32003v(1859240070, (C28655q) composer, false);
                }
                C28655q c28655q3 = (C28655q) composer;
                c28655q3.m87150e0(1859249705);
                return AbstractC18489d0.m53358D(C38072d.f163053a, c28655q3, 6, false);
            }
            C28655q c28655q4 = (C28655q) composer;
            c28655q4.m87150e0(1859247405);
            accentPositiveTrend = C38072d.f163053a.m121949b(c28655q4, 6).getStrainZone5();
            c28655q4.m87173q(false);
        }
        return accentPositiveTrend;
    }
}
