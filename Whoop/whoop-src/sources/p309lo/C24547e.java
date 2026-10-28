package p309lo;

import android.util.SparseBooleanArray;
import p516u8.C34606n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: lo.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C24547e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95814a;

    /* JADX INFO: renamed from: b */
    public final SparseBooleanArray f95815b;

    /* JADX INFO: renamed from: c */
    public boolean f95816c;

    public C24547e(int i13) {
        this.f95814a = i13;
        switch (i13) {
            case 1:
                this.f95815b = new SparseBooleanArray();
                break;
            default:
                this.f95815b = new SparseBooleanArray();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m71592a(int i13) {
        switch (this.f95814a) {
            case 0:
                AbstractC24543a.m71573i(!this.f95816c);
                this.f95815b.append(i13, true);
                break;
            default:
                AbstractC35849g.m113807i(!this.f95816c);
                this.f95815b.append(i13, true);
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public C24548f m71593b() {
        AbstractC24543a.m71573i(!this.f95816c);
        this.f95816c = true;
        return new C24548f(this.f95815b);
    }

    /* JADX INFO: renamed from: c */
    public C34606n m71594c() {
        AbstractC35849g.m113807i(!this.f95816c);
        this.f95816c = true;
        return new C34606n(this.f95815b);
    }
}
