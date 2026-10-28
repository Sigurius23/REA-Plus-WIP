package gm1;

import jl1.C21770a;
import nm1.C26838c;
import nm1.C26844i;
import nm1.EnumC26841f;
import p715kotlin.Metadata;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: gm1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lm91/u;", "item", "Ljl1/a;", "autoPopDomainState", "b", "(Lm91/u;Ljl1/a;)Lm91/u;", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15997g {

    /* JADX INFO: renamed from: gm1.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60553a;

        static {
            int[] iArr = new int[EnumC26841f.values().length];
            try {
                iArr[EnumC26841f.WAKE_UP_REPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC26841f.WIND_DOWN_REPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f60553a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final InterfaceC25312u m45294b(InterfaceC25312u interfaceC25312u, C21770a c21770a) {
        EnumC26841f enumC26841f;
        if (!(interfaceC25312u instanceof C26838c)) {
            return interfaceC25312u;
        }
        C26838c c26838c = (C26838c) interfaceC25312u;
        C26844i dailyOutlookTile = c26838c.getDailyOutlookTile();
        int i13 = a.f60553a[dailyOutlookTile.getStyle().ordinal()];
        if (i13 == 1) {
            enumC26841f = EnumC26841f.WAKE_UP_REPORT_OPENED;
        } else {
            if (i13 != 2) {
                return interfaceC25312u;
            }
            enumC26841f = EnumC26841f.WIND_DOWN_REPORT_OPENED;
        }
        return C21770a.INSTANCE.m61544e(c21770a, dailyOutlookTile.getDestination()) ? C26838c.m80090b(c26838c, null, C26844i.m80117b(dailyOutlookTile, false, null, null, null, enumC26841f, null, 47, null), 1, null) : interfaceC25312u;
    }
}
