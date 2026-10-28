package p503tp;

import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* JADX INFO: renamed from: tp.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C34038i {

    /* JADX INFO: renamed from: a */
    public final ArrayList f142700a;

    /* JADX INFO: renamed from: b */
    public boolean f142701b;

    /* JADX INFO: renamed from: c */
    public boolean f142702c;

    public C34038i() {
        this.f142700a = new ArrayList();
        this.f142701b = false;
        this.f142702c = false;
    }

    /* JADX INFO: renamed from: a */
    public void m107623a(LocationRequest locationRequest) {
        this.f142700a.add(locationRequest);
    }

    /* JADX INFO: renamed from: b */
    public C34039j m107624b() {
        return new C34039j(this.f142700a, this.f142701b, this.f142702c, null);
    }

    /* JADX INFO: renamed from: c */
    public void m107625c() {
        this.f142701b = true;
    }

    /* JADX INFO: renamed from: d */
    public void m107626d() {
        this.f142702c = true;
    }

    public C34038i(ArrayList arrayList, boolean z4, boolean z13) {
        this.f142700a = arrayList;
        this.f142702c = z4;
        this.f142701b = z13;
    }
}
