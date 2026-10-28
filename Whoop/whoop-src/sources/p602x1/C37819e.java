package p602x1;

import java.util.Set;
import p390p1.C28594a2;
import p390p1.InterfaceC28691z1;
import p446r1.C30849c;

/* JADX INFO: renamed from: x1.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C37819e implements InterfaceC28691z1 {

    /* JADX INFO: renamed from: w */
    public final Set f161964w;

    /* JADX INFO: renamed from: x */
    public final C30849c f161965x = new C30849c(new C28594a2[16]);

    public C37819e(Set set) {
        this.f161964w = set;
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: a */
    public final void mo15502a() {
        C30849c c30849c = this.f161965x;
        Object[] objArr = c30849c.f127227w;
        int i13 = c30849c.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            InterfaceC28691z1 interfaceC28691z1 = ((C28594a2) objArr[i14]).f115707a;
            this.f161964w.remove(interfaceC28691z1);
            interfaceC28691z1.mo15502a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final C30849c m121346b() {
        return this.f161965x;
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: c */
    public final void mo15503c() {
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: d */
    public final void mo15504d() {
    }
}
