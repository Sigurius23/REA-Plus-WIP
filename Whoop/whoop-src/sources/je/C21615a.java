package je;

import ag.InterfaceC0852b;
import p031b9.AbstractC2875y;
import p091dg.C12002a;
import p249jc.AbstractC21598x;
import p522uf.AbstractC34881i;
import p522uf.C34894u;
import p551vf.C35937b;
import p647yf.InterfaceC39492e;
import p715kotlin.jvm.internal.AbstractC22676k;
import s83.AbstractC32269c;
import s93.AbstractC32306h;

/* JADX INFO: renamed from: je.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C21615a implements InterfaceC0852b {

    /* JADX INFO: renamed from: a */
    public int f82954a;

    /* JADX INFO: renamed from: b */
    public Integer f82955b;

    @Override // ag.InterfaceC0852b
    /* JADX INFO: renamed from: a */
    public final Object mo2062a(Object obj, InterfaceC39492e interfaceC39492e, AbstractC32269c abstractC32269c) {
        String strM8295h;
        C34894u c34894u = (C34894u) obj;
        this.f82954a++;
        C35937b c35937b = (C35937b) c34894u.f146959b;
        C12002a c12002a = c34894u.f146958a;
        AbstractC22676k.m65750j(c12002a, "<this>");
        AbstractC32306h.m100568q(c35937b, "amz-sdk-invocation-id", (String) AbstractC21598x.m60654J(c12002a, AbstractC34881i.f146917e));
        int i13 = this.f82954a;
        Integer num = this.f82955b;
        if (num == null || (strM8295h = AbstractC2875y.m8295h(num.intValue(), "; max=")) == null) {
            strM8295h = "";
        }
        AbstractC32306h.m100568q((C35937b) c34894u.f146959b, "amz-sdk-request", "attempt=" + i13 + strM8295h);
        return interfaceC39492e.mo2061a(c34894u, abstractC32269c);
    }
}
