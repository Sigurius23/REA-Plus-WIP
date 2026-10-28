package dz;

import androidx.core.app.NotificationCompat;
import cz.C11190b;
import cz.EnumC11202h;
import d40.AbstractC11672q;
import d40.C11670o;
import go1.C16016a;
import h20.AbstractC16653f1;
import h20.AbstractC16737t1;
import h20.C16625a3;
import h20.C16629b1;
import h20.C16637c3;
import h20.C16641d1;
import h20.C16647e1;
import h20.C16659g1;
import h20.C16665h1;
import h20.C16689l1;
import h20.C16691l3;
import h20.C16713p1;
import h20.C16749v1;
import h20.C16768y2;
import h20.C16772z0;
import h20.C16774z2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import n83.C26463f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: dz.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C12459f extends AbstractC12462i {

    /* JADX INFO: renamed from: w */
    public final C11190b f42531w;

    /* JADX INFO: renamed from: x */
    public final String f42532x;

    public C12459f(C11190b configuration, EnumC11202h integrationType) {
        String str;
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(integrationType, "integrationType");
        this.f42531w = configuration;
        int iOrdinal = integrationType.ordinal();
        if (iOrdinal == 0) {
            str = "cs_init_with_customer_adapter";
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "cs_init_with_customer_session";
        }
        this.f42532x = str;
    }

    @Override // dz.AbstractC12462i
    /* JADX INFO: renamed from: a */
    public final Map mo35094a() {
        String str;
        C11190b c11190b = this.f42531w;
        C23465k c23465k = new C23465k("google_pay_enabled", Boolean.valueOf(c11190b.f35890x));
        C23465k c23465k2 = new C23465k("default_billing_details", Boolean.valueOf(c11190b.f35892z.m47234b()));
        C16665h1 c16665h1 = c11190b.f35889w;
        AbstractC22676k.m65750j(c16665h1, "<this>");
        C16691l3 c16691l3 = c16665h1.f64091z;
        C16637c3 c16637c3 = c16665h1.f64090y;
        C16768y2 c16768y2 = c16665h1.f64081E;
        C16774z2 c16774z2 = c16768y2.f64446w;
        C16625a3 c16625a3 = c16768y2.f64448y;
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("colorsLight", Boolean.valueOf(!AbstractC22676k.m65745e(c16774z2, C16774z2.f64474F))), new C23465k("colorsDark", Boolean.valueOf(!AbstractC22676k.m65745e(c16768y2.f64447x, C16774z2.f64475G))), new C23465k("corner_radius", Boolean.valueOf(c16625a3.f63960w != null)), new C23465k("border_width", Boolean.valueOf(c16625a3.f63961x != null)), new C23465k("font", Boolean.valueOf(c16768y2.f64449z.f63975w != null)));
        C23465k c23465k3 = new C23465k("colorsLight", Boolean.valueOf(!AbstractC22676k.m65745e(c16665h1.f64088w, C16749v1.f64317L)));
        C23465k c23465k4 = new C23465k("colorsDark", Boolean.valueOf(!AbstractC22676k.m65745e(c16665h1.f64089x, C16749v1.f64318M)));
        float f13 = c16637c3.f63987w;
        C11670o c11670o = AbstractC11672q.f37693c;
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(c23465k3, c23465k4, new C23465k("corner_radius", Boolean.valueOf(!(f13 == c11670o.f37677a))), new C23465k("border_width", Boolean.valueOf(!(c16637c3.f63988x == c11670o.f37679c))), new C23465k("font", Boolean.valueOf(c16691l3.f64196x != null)), new C23465k("size_scale_factor", Boolean.valueOf(!(c16691l3.f64195w == AbstractC11672q.f37694d.f37722d))), new C23465k("primary_button", mapM73990Y));
        C16659g1 c16659g1 = c16665h1.f64082F;
        AbstractC22676k.m65750j(c16659g1, "<this>");
        AbstractC16653f1 abstractC16653f1 = c16659g1.f64060w;
        C23465k c23465k5 = new C23465k("style", Boolean.valueOf(!AbstractC22676k.m65745e(abstractC16653f1, C16659g1.f64059E.f64060w)));
        AbstractC22676k.m65750j(abstractC16653f1, "<this>");
        if (abstractC16653f1 instanceof C16647e1) {
            str = "floating_button";
        } else if (abstractC16653f1 instanceof C16641d1) {
            str = "flat_with_radio";
        } else if (abstractC16653f1 instanceof C16772z0) {
            str = "flat_with_checkmark";
        } else {
            if (!(abstractC16653f1 instanceof C16629b1)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "flat_with_disclosure";
        }
        Map mapM73990Y2 = AbstractC25247g0.m73990Y(c23465k5, new C23465k("row_style", str));
        linkedHashMapM73993b0.put("embedded_payment_element", null);
        boolean zContains = mapM73990Y.values().contains(Boolean.TRUE);
        Collection collectionValues = linkedHashMapM73993b0.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (obj instanceof Boolean) {
                arrayList.add(obj);
            }
        }
        boolean zContains2 = arrayList.contains(Boolean.TRUE);
        Collection collectionValues2 = mapM73990Y2.values();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collectionValues2) {
            if (obj2 instanceof Boolean) {
                arrayList2.add(obj2);
            }
        }
        linkedHashMapM73993b0.put("usage", Boolean.valueOf(zContains2 || zContains || arrayList2.contains(Boolean.TRUE)));
        C23465k c23465k6 = new C23465k("appearance", linkedHashMapM73993b0);
        C23465k c23465k7 = new C23465k("allows_removal_of_last_saved_payment_method", Boolean.valueOf(c11190b.f35885H));
        C23465k c23465k8 = new C23465k("payment_method_order", c11190b.f35886I);
        C16689l1 c16689l1 = c11190b.f35882E;
        AbstractC22676k.m65750j(c16689l1, "<this>");
        C26463f c26463f = new C26463f();
        c26463f.put("attach_defaults", Boolean.valueOf(c16689l1.f64186E));
        c26463f.put("name", c16689l1.f64189w.name());
        c26463f.put(NotificationCompat.CATEGORY_EMAIL, c16689l1.f64191y.name());
        c26463f.put("phone", c16689l1.f64190x.name());
        c26463f.put("address", c16689l1.f64192z.name());
        if (!c16689l1.m47249b().isEmpty()) {
            c26463f.put("allowed_countries", AbstractC25265s.m74110N0(c16689l1.m47249b(), ",", null, null, null, 62));
        }
        C23465k c23465k9 = new C23465k("billing_details_collection_configuration", c26463f.m78380b());
        ArrayList arrayList3 = c11190b.f35884G;
        ArrayList arrayList4 = !arrayList3.isEmpty() ? arrayList3 : null;
        C23465k c23465k10 = new C23465k("preferred_networks", arrayList4 != null ? AbstractC25265s.m74110N0(arrayList4, null, null, null, new C16016a(18), 31) : null);
        AbstractC16737t1 abstractC16737t1 = c11190b.f35887J;
        AbstractC22676k.m65750j(abstractC16737t1, "<this>");
        return AbstractC38963t7.m124385o("cs_config", AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k6, c23465k7, c23465k8, c23465k9, c23465k10, new C23465k("card_brand_acceptance", Boolean.valueOf(!(abstractC16737t1 instanceof C16713p1))), new C23465k("open_card_scan_automatically_enabled", Boolean.valueOf(c11190b.f35888K))));
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        return this.f42532x;
    }
}
