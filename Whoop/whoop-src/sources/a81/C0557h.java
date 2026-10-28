package a81;

import cp0.AbstractC10986p;
import ev2.AbstractC13705n;
import ev2.AbstractC13712u;
import java.util.List;
import p291l0.C23016z;
import p329n0.InterfaceC26064q;
import p715kotlin.jvm.functions.Function1;
import qe0.AbstractC30302c;
import u11.AbstractC34443i;

/* JADX INFO: renamed from: a81.h */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0557h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1928w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f1929x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f1930y;

    public /* synthetic */ C0557h(List list, int i13, Function1 function1) {
        this.f1928w = i13;
        this.f1929x = list;
        this.f1930y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1928w) {
            case 0:
                return AbstractC0564o.m1406a0(this.f1929x, this.f1930y, (InterfaceC26064q) obj);
            case 1:
                return AbstractC10986p.m29334z(this.f1929x, this.f1930y, (InterfaceC26064q) obj);
            case 2:
                return AbstractC13705n.m38709y(this.f1929x, C23016z.f90757a, this.f1930y, (InterfaceC26064q) obj);
            case 3:
                return AbstractC13712u.m38734H0(this.f1929x, C23016z.f90757a, this.f1930y, (InterfaceC26064q) obj);
            case 4:
                return AbstractC30302c.m92608B(this.f1929x, this.f1930y, (InterfaceC26064q) obj);
            default:
                return AbstractC34443i.m108821F(this.f1929x, this.f1930y, (InterfaceC26064q) obj);
        }
    }
}
