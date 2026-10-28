package ga3;

import bg.C3215j;
import ia3.C18295a;
import j93.InterfaceC21493z;
import java.util.Map;
import kb3.C22340i;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import o93.AbstractC27741m;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import pf.AbstractC29125c;
import x93.C38111d;

/* JADX INFO: renamed from: ga3.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C15631i extends C15624b {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ InterfaceC21493z[] f58669g = {AbstractC22671h0.f89337a.property1(new C22693x(C15631i.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: f */
    public final C22340i f58670f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15631i(C38111d annotation, C41113q c3) {
        super(c3, annotation, AbstractC27741m.f111872w);
        AbstractC22676k.m65750j(annotation, "annotation");
        AbstractC22676k.m65750j(c3, "c");
        InterfaceC22345n interfaceC22345n = ((C18295a) c3.f177224x).f71223a;
        C3215j c3215j = new C3215j(this, 1);
        C22342k c22342k = (C22342k) interfaceC22345n;
        c22342k.getClass();
        this.f58670f = new C22340i(c22342k, c3215j);
    }

    @Override // ga3.C15624b, s93.InterfaceC32300b
    /* JADX INFO: renamed from: a */
    public final Map mo43952a() {
        return (Map) AbstractC29125c.m88494C(this.f58670f, f58669g[0]);
    }
}
