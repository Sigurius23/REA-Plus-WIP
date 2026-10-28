package eg2;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import bm.InterfaceC3389m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import dg2.C12010b;
import dp0.InterfaceC12251g;
import java.util.List;
import p040c0.InterfaceC3764o;
import p163g1.C15199y3;
import p31.C28801l;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25312u;
import ps2.AbstractC29507c;
import rs2.AbstractC31797c;
import rv2.InterfaceC31850h;
import sv2.AbstractC33042e;

/* JADX INFO: renamed from: eg2.h */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C13175h implements InterfaceC4352n {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f45663E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f45664F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45665w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f45666x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f45667y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f45668z;

    public /* synthetic */ C13175h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13) {
        this.f45665w = i13;
        this.f45666x = obj;
        this.f45667y = obj2;
        this.f45668z = obj3;
        this.f45663E = obj4;
        this.f45664F = obj5;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f45665w) {
            case 0:
                return AbstractC13176i.m36956N((Function1) this.f45666x, (Function1) this.f45667y, (InterfaceC4339a) this.f45668z, (C12010b) this.f45663E, (InterfaceC28601c1) this.f45664F, (InterfaceC3764o) obj, (String) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 1:
                return AbstractC31797c.m98788w((C28801l) this.f45666x, (InterfaceC2994c0) this.f45667y, (InterfaceC12251g) this.f45668z, (InterfaceC4351m) this.f45663E, (InterfaceC25312u) this.f45664F, (InterfaceC3764o) obj, (AbstractC29507c) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            default:
                return AbstractC33042e.m104503e1((List) this.f45667y, (InterfaceC31850h.b) this.f45668z, (Function1) this.f45666x, (InterfaceC2994c0) this.f45663E, (C15199y3) this.f45664F, (InterfaceC3389m) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
        }
    }

    public /* synthetic */ C13175h(List list, InterfaceC31850h.b bVar, Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        this.f45665w = 2;
        this.f45667y = list;
        this.f45668z = bVar;
        this.f45666x = function1;
        this.f45663E = interfaceC2994c0;
        this.f45664F = c15199y3;
    }
}
