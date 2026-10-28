package p299l9;

import java.util.List;
import p324m9.AbstractC25276d;
import p324m9.InterfaceC25282j;
import p361o9.InterfaceC27679s;
import p516u8.C34610p;
import p516u8.C34611p0;

/* JADX INFO: renamed from: l9.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23508j0 implements InterfaceC27679s {

    /* JADX INFO: renamed from: a */
    public final InterfaceC27679s f93043a;

    /* JADX INFO: renamed from: b */
    public final C34611p0 f93044b;

    public C23508j0(InterfaceC27679s interfaceC27679s, C34611p0 c34611p0) {
        this.f93043a = interfaceC27679s;
        this.f93044b = c34611p0;
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: a */
    public final void mo68069a() {
        this.f93043a.mo68069a();
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: b */
    public final void mo68070b() {
        this.f93043a.mo68070b();
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: c */
    public final int mo68071c() {
        return this.f93043a.mo68071c();
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: d */
    public final C34610p mo68072d(int i13) {
        return this.f93044b.f145799d[this.f93043a.mo68073e(i13)];
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: e */
    public final int mo68073e(int i13) {
        return this.f93043a.mo68073e(i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23508j0)) {
            return false;
        }
        C23508j0 c23508j0 = (C23508j0) obj;
        return this.f93043a.equals(c23508j0.f93043a) && this.f93044b.equals(c23508j0.f93044b);
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: f */
    public final void mo68074f(float f13) {
        this.f93043a.mo68074f(f13);
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: g */
    public final Object mo68075g() {
        return this.f93043a.mo68075g();
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: h */
    public final void mo68076h() {
        this.f93043a.mo68076h();
    }

    public final int hashCode() {
        return this.f93043a.hashCode() + ((this.f93044b.hashCode() + 527) * 31);
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: i */
    public final int mo68077i(int i13) {
        return this.f93043a.mo68077i(i13);
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: j */
    public final C34611p0 mo68078j() {
        return this.f93044b;
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: k */
    public final void mo68079k(boolean z4) {
        this.f93043a.mo68079k(z4);
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: l */
    public final int mo68080l(long j7, List list) {
        return this.f93043a.mo68080l(j7, list);
    }

    @Override // p361o9.InterfaceC27679s
    public final int length() {
        return this.f93043a.length();
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: m */
    public final int mo68081m() {
        return this.f93043a.mo68081m();
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: n */
    public final C34610p mo68082n() {
        return this.f93044b.f145799d[this.f93043a.mo68081m()];
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: o */
    public final int mo68083o() {
        return this.f93043a.mo68083o();
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: p */
    public final void mo68084p() {
        this.f93043a.mo68084p();
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: q */
    public final boolean mo68085q(int i13, long j7) {
        return this.f93043a.mo68085q(i13, j7);
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: r */
    public final void mo68086r(long j7, long j13, long j14, List list, InterfaceC25282j[] interfaceC25282jArr) {
        this.f93043a.mo68086r(j7, j13, j14, list, interfaceC25282jArr);
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: s */
    public final int mo68087s(C34610p c34610p) {
        int i13 = 0;
        while (true) {
            C34610p[] c34610pArr = this.f93044b.f145799d;
            if (i13 >= c34610pArr.length) {
                i13 = -1;
                break;
            }
            if (c34610p == c34610pArr[i13]) {
                break;
            }
            i13++;
        }
        return this.f93043a.mo68077i(i13);
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: t */
    public final boolean mo68088t(int i13, long j7) {
        return this.f93043a.mo68088t(i13, j7);
    }

    @Override // p361o9.InterfaceC27679s
    /* JADX INFO: renamed from: u */
    public final boolean mo68089u(long j7, AbstractC25276d abstractC25276d, List list) {
        return this.f93043a.mo68089u(j7, abstractC25276d, list);
    }
}
