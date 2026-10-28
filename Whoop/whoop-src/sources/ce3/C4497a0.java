package ce3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import p035bp.C3512c;
import p077d0.AbstractC11395r;
import p077d0.C11357h0;
import p077d0.InterfaceC11363i2;
import p077d0.InterfaceC11419z;
import p389p0.C28539n0;
import p674z8.C40173i;
import p674z8.InterfaceC40169e;
import p674z8.InterfaceC40170f;
import p692zt.C41113q;

/* JADX INFO: renamed from: ce3.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4497a0 implements InterfaceC11363i2, InterfaceC40169e {

    /* JADX INFO: renamed from: w */
    public int f18118w;

    /* JADX INFO: renamed from: x */
    public int f18119x;

    /* JADX INFO: renamed from: y */
    public final Object f18120y;

    public C4497a0(Context context) {
        this.f18119x = 0;
        this.f18120y = context;
    }

    /* JADX INFO: renamed from: b */
    public synchronized int m14109b() {
        PackageInfo packageInfo;
        if (this.f18118w == 0) {
            try {
                packageInfo = ((Context) C3512c.m10398a((Context) this.f18120y).f3422w).getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e5) {
                Log.w("Metadata", "Failed to find package ".concat(e5.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f18118w = packageInfo.versionCode;
            }
        }
        return this.f18118w;
    }

    @Override // p674z8.InterfaceC40169e
    public InterfaceC40170f createDataSource() {
        return new C40173i(this.f18118w, this.f18119x, (C28539n0) this.f18120y);
    }

    /* JADX INFO: renamed from: d */
    public synchronized int m14110d() {
        int i13 = this.f18119x;
        if (i13 != 0) {
            return i13;
        }
        Context context = (Context) this.f18120y;
        PackageManager packageManager = context.getPackageManager();
        if (((Context) C3512c.m10398a(context).f3422w).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && !listQueryBroadcastReceivers.isEmpty()) {
            this.f18119x = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.f18119x = 2;
        return 2;
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: h */
    public AbstractC11395r mo2202h(long j7, AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        return ((C41113q) this.f18120y).mo2202h(j7, abstractC11395r, abstractC11395r2, abstractC11395r3);
    }

    @Override // p077d0.InterfaceC11363i2
    /* JADX INFO: renamed from: i */
    public int mo14111i() {
        return this.f18119x;
    }

    @Override // p077d0.InterfaceC11363i2
    /* JADX INFO: renamed from: l */
    public int mo14112l() {
        return this.f18118w;
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: m */
    public AbstractC11395r mo2205m(long j7, AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        return ((C41113q) this.f18120y).mo2205m(j7, abstractC11395r, abstractC11395r2, abstractC11395r3);
    }

    public C4497a0(int i13) {
        switch (i13) {
            case 3:
                this.f18120y = new C28539n0(12);
                this.f18118w = 8000;
                this.f18119x = 8000;
                break;
            default:
                this.f18120y = new C4497a0[256];
                this.f18118w = 0;
                this.f18119x = 0;
                break;
        }
    }

    public C4497a0(int i13, int i14) {
        this.f18120y = null;
        this.f18118w = i13;
        int i15 = i14 & 7;
        this.f18119x = i15 == 0 ? 8 : i15;
    }

    public C4497a0(int i13, int i14, InterfaceC11419z interfaceC11419z) {
        this.f18118w = i13;
        this.f18119x = i14;
        this.f18120y = new C41113q(new C11357h0(i13, i14, interfaceC11419z));
    }
}
