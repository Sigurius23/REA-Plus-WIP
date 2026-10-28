package p529uo;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1337q1;
import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.api.Scope;
import p557vo.AbstractC36219a;

/* JADX INFO: renamed from: uo.g */
/* JADX INFO: loaded from: classes.dex */
public final class C35115g extends AbstractC36219a {
    public static final Parcelable.Creator<C35115g> CREATOR = new C1337q1(11);

    /* JADX INFO: renamed from: O */
    public static final Scope[] f149011O = new Scope[0];

    /* JADX INFO: renamed from: P */
    public static final C4986c[] f149012P = new C4986c[0];

    /* JADX INFO: renamed from: E */
    public IBinder f149013E;

    /* JADX INFO: renamed from: F */
    public Scope[] f149014F;

    /* JADX INFO: renamed from: G */
    public Bundle f149015G;

    /* JADX INFO: renamed from: H */
    public Account f149016H;

    /* JADX INFO: renamed from: I */
    public C4986c[] f149017I;

    /* JADX INFO: renamed from: J */
    public C4986c[] f149018J;

    /* JADX INFO: renamed from: K */
    public final boolean f149019K;

    /* JADX INFO: renamed from: L */
    public final int f149020L;

    /* JADX INFO: renamed from: M */
    public boolean f149021M;

    /* JADX INFO: renamed from: N */
    public final String f149022N;

    /* JADX INFO: renamed from: w */
    public final int f149023w;

    /* JADX INFO: renamed from: x */
    public final int f149024x;

    /* JADX INFO: renamed from: y */
    public final int f149025y;

    /* JADX INFO: renamed from: z */
    public String f149026z;

    public C35115g(int i13, int i14, int i15, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C4986c[] c4986cArr, C4986c[] c4986cArr2, boolean z4, int i16, boolean z13, String str2) {
        scopeArr = scopeArr == null ? f149011O : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        C4986c[] c4986cArr3 = f149012P;
        c4986cArr = c4986cArr == null ? c4986cArr3 : c4986cArr;
        c4986cArr2 = c4986cArr2 == null ? c4986cArr3 : c4986cArr2;
        this.f149023w = i13;
        this.f149024x = i14;
        this.f149025y = i15;
        if ("com.google.android.gms".equals(str)) {
            this.f149026z = "com.google.android.gms";
        } else {
            this.f149026z = str;
        }
        if (i13 < 2) {
            this.f149016H = iBinder != null ? AbstractBinderC35103a.m111055c0(AbstractBinderC35103a.m111054X(iBinder)) : null;
        } else {
            this.f149013E = iBinder;
            this.f149016H = account;
        }
        this.f149014F = scopeArr;
        this.f149015G = bundle;
        this.f149017I = c4986cArr;
        this.f149018J = c4986cArr2;
        this.f149019K = z4;
        this.f149020L = i16;
        this.f149021M = z13;
        this.f149022N = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        C1337q1.m4208a(this, parcel, i13);
    }
}
