package gr1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import ny0.C27257h0;
import p715kotlin.Metadata;
import p720m91.InterfaceC25312u;
import r01.C30842c;

/* JADX INFO: renamed from: gr1.p */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lgr1/q;", "", "loading", "c", "(Lgr1/q;Z)Lgr1/q;", "Lm91/u;", "b", "(Lm91/u;Z)Lm91/u;", "integrations_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16109p {
    /* JADX INFO: renamed from: b */
    private static final InterfaceC25312u m45629b(InterfaceC25312u interfaceC25312u, boolean z4) {
        if (interfaceC25312u instanceof C27257h0) {
            return C27257h0.m82169b((C27257h0) interfaceC25312u, null, null, null, z4, 7, null);
        }
        if (!(interfaceC25312u instanceof C30842c)) {
            return interfaceC25312u;
        }
        C30842c c30842c = (C30842c) interfaceC25312u;
        InterfaceC25312u button = c30842c.getButton();
        return C30842c.m94851b(c30842c, null, null, null, button != null ? m45629b(button, z4) : null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [m91.u] */
    /* JADX WARN: Type inference failed for: r9v0, types: [gr1.d] */
    /* JADX INFO: renamed from: c */
    public static final C16110q m45630c(C16110q c16110q, boolean z4) {
        int i13;
        C16095b c16095bM45513b;
        ArrayList arrayList;
        C16095b detailsScreen = c16110q.getDetailsScreen();
        Object objM45551b = null;
        if (detailsScreen != null) {
            List<InterfaceC25312u> listM45523j = detailsScreen.m45523j();
            if (listM45523j != null) {
                List<InterfaceC25312u> list = listM45523j;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(m45629b((InterfaceC25312u) it.next(), z4));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            InterfaceC25312u overridePrimaryButton = detailsScreen.getOverridePrimaryButton();
            i13 = 10;
            c16095bM45513b = C16095b.m45513b(detailsScreen, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, overridePrimaryButton != null ? m45629b(overridePrimaryButton, z4) : null, arrayList, null, null, null, null, 31981567, null);
        } else {
            i13 = 10;
            c16095bM45513b = null;
        }
        C16097d disclaimerScreen = c16110q.getDisclaimerScreen();
        if (disclaimerScreen != null) {
            List<InterfaceC25312u> listM45556f = disclaimerScreen.m45556f();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM45556f, i13));
            Iterator it3 = listM45556f.iterator();
            while (it3.hasNext()) {
                arrayList3.add(m45629b((InterfaceC25312u) it3.next(), z4));
            }
            InterfaceC25312u secondaryButton = disclaimerScreen.getSecondaryButton();
            objM45551b = C16097d.m45551b(disclaimerScreen, null, null, null, null, arrayList3, null, null, null, secondaryButton != null ? m45629b(secondaryButton, z4) : null, 239, null);
        }
        return C16110q.m45631b(c16110q, null, false, null, null, c16095bM45513b, null, objM45551b, false, 175, null);
    }
}
