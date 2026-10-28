package y22;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.payments.feature.paymentmethodmanagement.domain.models.PaymentMethodManagementModels;
import com.whoop.payments.feature.paymentmethodmanagement.domain.models.PaymentMethodManagementNavigationBarModel;
import com.whoop.payments.feature.paymentmethodmanagement.domain.models.PaymentMethodManagementSectionModel;
import g32.C15312l;
import j11.EnumC21213p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jb1.C21535a;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import p22.AbstractC28756b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33205o0;
import p736sz0.C33211q0;
import u22.C34489d;
import u22.InterfaceC34487b;
import v22.EnumC35586a;
import x22.C37864c;
import x22.InterfaceC37862a;

/* JADX INFO: renamed from: y22.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ly22/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lu22/b$b;", "Lx22/c$b;", "c", "(Lu22/b$b;)Lx22/c$b;", "Lu22/b$e;", "Lx22/c$c;", "b", "(Lu22/b$e;)Lx22/c$c;", "Lu22/d;", "dialog", "fullScreenModal", "Lx22/c;", "d", "(Lu22/d;Lx22/c$c;Lx22/c$b;)Lx22/c;", "domainResult", "a", "(Lu22/d;)Lx22/c;", "Ljb1/a;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39166a {

    /* JADX INFO: renamed from: b */
    public static final int f168402b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C39166a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: b */
    private final C37864c.c m124744b(InterfaceC34487b.e eVar) {
        if (!(eVar instanceof InterfaceC34487b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34487b.a aVar = (InterfaceC34487b.a) eVar;
        return new C37864c.c(AbstractC8693b.m21278l(aVar.getData().getTitle()), AbstractC8693b.m21278l(aVar.getData().getPrimaryButton().getTitle()), null, AbstractC8693b.m21278l(aVar.getData().getSecondaryButton().getTitle()), AbstractC8693b.m21267a(), false, true, EnumC21213p.DEFAULT, InterfaceC37862a.g.f162091a, InterfaceC37862a.e.f162089a, 4, null);
    }

    /* JADX INFO: renamed from: c */
    private final C37864c.b m124745c(InterfaceC34487b.b bVar) {
        if (bVar instanceof InterfaceC34487b.c) {
            return new C37864c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null);
        }
        if (bVar instanceof InterfaceC34487b.d) {
            return new C37864c.b(C33205o0.f138451a.m105289c(), InterfaceC37862a.t.f162106a, null, InterfaceC37862a.j.f162094a, 4, null);
        }
        if (bVar instanceof InterfaceC34487b.f) {
            return new C37864c.b(C33205o0.f138451a.m105291e(), InterfaceC37862a.t.f162106a, null, InterfaceC37862a.j.f162094a, 4, null);
        }
        if (bVar instanceof InterfaceC34487b.h) {
            return new C37864c.b(new C33211q0(null, new AbstractC33208p0.d(AbstractC8693b.m21277k(AbstractC28756b.f116485m)), null, null, null, false, false, null, false, true, 509, null), null, null, null, 14, null);
        }
        if (bVar instanceof InterfaceC34487b.i) {
            return new C37864c.b(new C33211q0(null, new AbstractC33208p0.h(AbstractC8693b.m21277k(AbstractC28756b.f116486n), 0L, null, 6, null), null, null, null, false, false, null, false, true, 509, null), InterfaceC37862a.j.f162094a, null, null, 12, null);
        }
        if (bVar instanceof InterfaceC34487b.g) {
            return new C37864c.b(new C33211q0(null, new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC28756b.f116484l), false, null, 6, null), AbstractC8693b.m21277k(AbstractC28756b.f116483k), null, AbstractC8693b.m21277k(AbstractC28756b.f116487o), false, false, null, false, true, 489, null), InterfaceC37862a.u.f162107a, null, null, 12, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [m83.z] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    /* JADX INFO: renamed from: d */
    private final C37864c m124746d(C34489d c34489d, C37864c.c cVar, C37864c.b bVar) {
        ?? linkedHashMap;
        TextResource textResourceM21267a;
        List list;
        List<PaymentMethodManagementSectionModel> sections;
        EnumC35586a enumC35586a;
        String title;
        Map<String, String> analyticsProperties;
        PaymentMethodManagementModels response = c34489d.getResponse();
        if (response == null || (analyticsProperties = response.getAnalyticsProperties()) == null) {
            linkedHashMap = C25272z.f99163w;
        } else {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : analyticsProperties.entrySet()) {
                if (entry.getValue().length() > 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        PaymentMethodManagementModels response2 = c34489d.getResponse();
        PaymentMethodManagementNavigationBarModel navigationBar = response2 != null ? response2.getNavigationBar() : null;
        if (navigationBar == null || (title = navigationBar.getTitle()) == null || (textResourceM21267a = AbstractC8693b.m21278l(title)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        PaymentMethodManagementModels response3 = c34489d.getResponse();
        boolean z4 = false;
        if (response3 == null || (sections = response3.getSections()) == null) {
            list = C25271y.f99162w;
        } else {
            List<PaymentMethodManagementSectionModel> list2 = sections;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (PaymentMethodManagementSectionModel paymentMethodManagementSectionModel : list2) {
                String sectionType = paymentMethodManagementSectionModel.getSectionType();
                if (sectionType == null) {
                    sectionType = "";
                }
                String upperCase = sectionType.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                EnumC35586a enumC35586a2 = EnumC35586a.COMPACT;
                EnumC35586a[] enumC35586aArrValues = EnumC35586a.values();
                int length = enumC35586aArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        enumC35586a = null;
                        break;
                    }
                    enumC35586a = enumC35586aArrValues[i13];
                    if (AbstractC22676k.m65745e(enumC35586a.name(), upperCase)) {
                        break;
                    }
                    i13++;
                }
                if (enumC35586a != null) {
                    enumC35586a2 = enumC35586a;
                }
                List<InterfaceC25312u> listM60540g = this.reducer.m60540g(paymentMethodManagementSectionModel.getItems());
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM60540g, 10));
                for (Object objM43500b : listM60540g) {
                    if (objM43500b instanceof C15312l) {
                        objM43500b = C15312l.m43500b((C15312l) objM43500b, null, null, null, null, c34489d.getAutoPopPaymentSheet(), 15, null);
                    }
                    arrayList2.add(objM43500b);
                }
                arrayList.add(new C37864c.a(arrayList2, enumC35586a2));
            }
            list = arrayList;
        }
        if (!c34489d.getManualRefresh() && c34489d.getDisplayRefreshingSpinner()) {
            z4 = true;
        }
        return new C37864c(cVar, bVar, new C37864c.d(textResourceM21267a, list, z4, linkedHashMap));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C37864c m124747e(C39166a c39166a, C34489d c34489d, C37864c.c cVar, C37864c.b bVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            cVar = null;
        }
        if ((i13 & 2) != 0) {
            bVar = null;
        }
        return c39166a.m124746d(c34489d, cVar, bVar);
    }

    /* JADX INFO: renamed from: a */
    public final C37864c m124748a(C34489d domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        InterfaceC34487b currentDialogType = domainResult.getCurrentDialogType();
        if (currentDialogType instanceof InterfaceC34487b.b) {
            return m124747e(this, domainResult, null, m124745c((InterfaceC34487b.b) domainResult.getCurrentDialogType()), 1, null);
        }
        return currentDialogType instanceof InterfaceC34487b.e ? m124747e(this, domainResult, m124744b((InterfaceC34487b.e) domainResult.getCurrentDialogType()), null, 2, null) : m124747e(this, domainResult, null, null, 2, null);
    }

    public /* synthetic */ C39166a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC39167b.f168404a : c21535a);
    }
}
