package qc3;

import java.util.ArrayList;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import sc3.AbstractC32387a;
import sc3.AbstractC32398l;
import sc3.C32399m;
import sc3.C32404r;
import sc3.InterfaceC32396j;
import tc3.C33699a;
import uc3.C34768f;
import uc3.C34774l;
import uc3.C34775m;
import uc3.C34779q;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: qc3.e1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30236e1 implements InterfaceC32396j {

    /* JADX INFO: renamed from: a */
    public final AbstractC32387a f123773a;

    /* JADX INFO: renamed from: b */
    public final Integer f123774b;

    /* JADX INFO: renamed from: c */
    public final Integer f123775c;

    /* JADX INFO: renamed from: d */
    public final Integer f123776d;

    /* JADX INFO: renamed from: e */
    public final EnumC30263o0 f123777e;

    public C30236e1(EnumC30263o0 enumC30263o0) {
        C32399m field = AbstractC30248i1.f123789a;
        Integer numValueOf = Integer.valueOf(enumC30263o0 != EnumC30263o0.f123804w ? 1 : 4);
        Integer num = enumC30263o0 == EnumC30263o0.f123805x ? 4 : null;
        AbstractC22676k.m65750j(field, "field");
        this.f123773a = field;
        this.f123774b = numValueOf;
        this.f123775c = num;
        this.f123776d = 4;
        this.f123777e = enumC30263o0;
    }

    @Override // sc3.InterfaceC32396j
    /* JADX INFO: renamed from: a */
    public final C33699a mo92507a() {
        this.f123773a.mo100962a();
        Integer num = this.f123774b;
        int iIntValue = num != null ? num.intValue() : 0;
        C33699a c33699a = new C33699a();
        if (iIntValue < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(iIntValue, "The minimum number of digits (", ") is negative").toString());
        }
        if (iIntValue <= 9) {
            return this.f123775c != null ? new C33699a() : c33699a;
        }
        throw new IllegalArgumentException(AbstractC2875y.m8296i(iIntValue, "The minimum number of digits (", ") exceeds the length of an Int").toString());
    }

    @Override // sc3.InterfaceC32396j
    /* JADX INFO: renamed from: b */
    public final C34774l mo92508b() {
        AbstractC32387a abstractC32387a = this.f123773a;
        C32404r setter = abstractC32387a.mo100962a();
        String name = abstractC32387a.mo100964c();
        AbstractC22676k.m65750j(setter, "setter");
        AbstractC22676k.m65750j(name, "name");
        Integer num = this.f123774b;
        Integer num2 = this.f123775c;
        ArrayList arrayListM118964P = AbstractC37056f.m118964P(AbstractC32398l.m100977j(num, null, num2, setter, name, true));
        Integer num3 = this.f123776d;
        C25271y c25271y = C25271y.f99162w;
        if (num3 != null) {
            arrayListM118964P.add(AbstractC32398l.m100977j(num, num3, num2, setter, name, false));
            arrayListM118964P.add(new C34774l(AbstractC37056f.m118959K(new C34775m("+"), new C34768f(AbstractC37056f.m118958J(new C34779q(Integer.valueOf(num3.intValue() + 1), null, setter, name, false)))), c25271y));
        } else {
            arrayListM118964P.add(AbstractC32398l.m100977j(num, null, num2, setter, name, false));
        }
        return new C34774l(c25271y, arrayListM118964P);
    }

    @Override // sc3.InterfaceC32396j
    /* JADX INFO: renamed from: c */
    public final AbstractC32387a mo92509c() {
        return this.f123773a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C30236e1) {
            return this.f123777e == ((C30236e1) obj).f123777e;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f123777e.hashCode() * 31);
    }
}
