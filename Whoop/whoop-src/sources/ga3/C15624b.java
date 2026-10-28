package ga3;

import ha3.InterfaceC17064g;
import ia3.C18295a;
import j93.InterfaceC21493z;
import java.util.Map;
import kb3.C22340i;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import lb3.AbstractC23763c0;
import lb3.AbstractC23811y;
import m83.AbstractC25265s;
import m83.C25272z;
import ma3.InterfaceC25372a;
import p048ce.C4463d;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import pf.AbstractC29125c;
import r93.InterfaceC31155s0;
import va3.C35847e;
import x93.C38111d;

/* JADX INFO: renamed from: ga3.b */
/* JADX INFO: loaded from: classes3.dex */
public class C15624b implements InterfaceC17064g {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC21493z[] f58651e = {AbstractC22671h0.f89337a.property1(new C22693x(C15624b.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};

    /* JADX INFO: renamed from: a */
    public final C35847e f58652a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC31155s0 f58653b;

    /* JADX INFO: renamed from: c */
    public final C22340i f58654c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC25372a f58655d;

    public C15624b(C41113q c3, C38111d c38111d, C35847e fqName) {
        AbstractC22676k.m65750j(c3, "c");
        C18295a c18295a = (C18295a) c3.f177224x;
        AbstractC22676k.m65750j(fqName, "fqName");
        this.f58652a = fqName;
        this.f58653b = c38111d != null ? c18295a.f71232j.m118692c(c38111d) : InterfaceC31155s0.f128370q;
        InterfaceC22345n interfaceC22345n = c18295a.f71223a;
        C4463d c4463d = new C4463d(2, c3, this);
        C22342k c22342k = (C22342k) interfaceC22345n;
        c22342k.getClass();
        this.f58654c = new C22340i(c22342k, c4463d);
        this.f58655d = c38111d != null ? (InterfaceC25372a) AbstractC25265s.m74098G0(c38111d.m122096b()) : null;
    }

    @Override // s93.InterfaceC32300b
    /* JADX INFO: renamed from: a */
    public Map mo43952a() {
        return C25272z.f99163w;
    }

    @Override // s93.InterfaceC32300b
    /* JADX INFO: renamed from: b */
    public final C35847e mo43953b() {
        return this.f58652a;
    }

    @Override // s93.InterfaceC32300b
    public final InterfaceC31155s0 getSource() {
        return this.f58653b;
    }

    @Override // s93.InterfaceC32300b
    public final AbstractC23811y getType() {
        return (AbstractC23763c0) AbstractC29125c.m88494C(this.f58654c, f58651e[0]);
    }
}
