package p512u2;

import p002a0.C0047q0;
import p002a0.C0062y;
import p133f1.C13968p1;
import p446r1.C30849c;
import p635y2.InterfaceC39147y;

/* JADX INFO: renamed from: u2.j */
/* JADX INFO: loaded from: classes.dex */
public class C34464j {

    /* JADX INFO: renamed from: a */
    public final C30849c f144798a = new C30849c(new C34463i[16]);

    /* JADX INFO: renamed from: b */
    public final C0047q0 f144799b = new C0047q0(10);

    /* JADX INFO: renamed from: a */
    public boolean mo108937a(C0062y c0062y, InterfaceC39147y interfaceC39147y, C13968p1 c13968p1, boolean z4) {
        C30849c c30849c = this.f144798a;
        Object[] objArr = c30849c.f127227w;
        int i13 = c30849c.f127229y;
        boolean z13 = false;
        for (int i14 = 0; i14 < i13; i14++) {
            z13 = ((C34463i) objArr[i14]).mo108937a(c0062y, interfaceC39147y, c13968p1, z4) || z13;
        }
        return z13;
    }

    /* JADX INFO: renamed from: b */
    public void mo108938b(C13968p1 c13968p1) {
        C30849c c30849c = this.f144798a;
        int i13 = c30849c.f127229y;
        while (true) {
            i13--;
            if (-1 >= i13) {
                return;
            }
            if (((C34463i) c30849c.f127227w[i13]).f144791d.m71604h()) {
                c30849c.m94894l(i13);
            }
        }
    }
}
