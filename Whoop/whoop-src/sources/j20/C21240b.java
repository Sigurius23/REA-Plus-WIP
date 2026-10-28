package j20;

import dz.AbstractC12462i;
import java.util.Map;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: j20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C21240b extends AbstractC12462i {

    /* JADX INFO: renamed from: w */
    public final String f81097w;

    public C21240b(String country) {
        AbstractC22676k.m65750j(country, "country");
        this.f81097w = country;
    }

    @Override // dz.AbstractC12462i
    /* JADX INFO: renamed from: a */
    public final Map mo35094a() {
        return AbstractC38963t7.m124385o("address_data_blob", AbstractC31061c.m95645u("address_country_code", this.f81097w));
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        return "mc_address_show";
    }
}
