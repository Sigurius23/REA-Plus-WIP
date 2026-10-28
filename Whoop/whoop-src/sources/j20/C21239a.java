package j20;

import dz.AbstractC12462i;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C21239a extends AbstractC12462i {

    /* JADX INFO: renamed from: w */
    public final String f81094w;

    /* JADX INFO: renamed from: x */
    public final boolean f81095x;

    /* JADX INFO: renamed from: y */
    public final Integer f81096y;

    public C21239a(String country, boolean z4, Integer num) {
        AbstractC22676k.m65750j(country, "country");
        this.f81094w = country;
        this.f81095x = z4;
        this.f81096y = num;
    }

    @Override // dz.AbstractC12462i
    /* JADX INFO: renamed from: a */
    public final Map mo35094a() {
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("address_country_code", this.f81094w), new C23465k("auto_complete_result_selected", Boolean.valueOf(this.f81095x)));
        linkedHashMapM73993b0.put("edit_distance", Integer.valueOf(this.f81096y.intValue()));
        return AbstractC25247g0.m73989X(new C23465k("address_data_blob", linkedHashMapM73993b0));
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        return "mc_address_completed";
    }
}
