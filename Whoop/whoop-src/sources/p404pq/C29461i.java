package p404pq;

import android.view.View;

/* JADX INFO: renamed from: pq.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C29461i extends AbstractC29455c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f119628a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f119629b;

    public /* synthetic */ C29461i(Object obj, int i13) {
        this.f119628a = i13;
        this.f119629b = obj;
    }

    /* JADX INFO: renamed from: d */
    private final void m89927d(View view, float f13) {
    }

    /* JADX INFO: renamed from: e */
    private final void m89928e(View view, float f13) {
    }

    @Override // p404pq.AbstractC29455c
    /* JADX INFO: renamed from: b */
    public final void mo5841b(View view, float f13) {
        int i13 = this.f119628a;
    }

    @Override // p404pq.AbstractC29455c
    /* JADX INFO: renamed from: c */
    public final void mo5842c(View view, int i13) {
        switch (this.f119628a) {
            case 0:
                if (i13 == 5) {
                    ((DialogC29463k) this.f119629b).cancel();
                }
                break;
            default:
                if (i13 == 5) {
                    C29464l.access$100((C29464l) this.f119629b);
                }
                break;
        }
    }
}
