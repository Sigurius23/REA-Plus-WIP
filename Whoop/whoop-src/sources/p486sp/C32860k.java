package p486sp;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.api.InterfaceC4978i;
import com.google.android.gms.common.api.InterfaceC4979j;
import com.google.crypto.tink.internal.C5099k0;
import p096dq.AbstractC12277u;
import p529uo.AbstractC35117h;

/* JADX INFO: renamed from: sp.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C32860k extends AbstractC35117h {

    /* JADX INFO: renamed from: A */
    public final int f136891A;

    /* JADX INFO: renamed from: B */
    public final String f136892B;

    /* JADX INFO: renamed from: C */
    public final int f136893C;

    /* JADX INFO: renamed from: D */
    public final boolean f136894D;

    /* JADX INFO: renamed from: z */
    public final Context f136895z;

    public C32860k(Context context, Looper looper, C5099k0 c5099k0, InterfaceC4978i interfaceC4978i, InterfaceC4979j interfaceC4979j, int i13) {
        super(context, looper, 4, c5099k0, interfaceC4978i, interfaceC4979j, 0);
        this.f136895z = context;
        this.f136891A = i13;
        this.f136892B = null;
        this.f136893C = 1;
        this.f136894D = true;
    }

    @Override // p529uo.AbstractC35107c, com.google.android.gms.common.api.InterfaceC4973d
    /* JADX INFO: renamed from: b */
    public final int mo5666b() {
        return 12600000;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: d */
    public final IInterface mo5667d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return iInterfaceQueryLocalInterface instanceof C32857h ? (C32857h) iInterfaceQueryLocalInterface : new C32857h(iBinder, "com.google.android.gms.wallet.internal.IOwService", 4);
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: g */
    public final C4986c[] mo57329g() {
        return AbstractC12277u.f41109d;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: k */
    public final String mo5669k() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: l */
    public final String mo5670l() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: p */
    public final boolean mo57337p() {
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final Bundle m103129u() {
        String packageName = this.f136895z.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.f136891A);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.f136894D);
        bundle.putString("androidPackageName", packageName);
        String str = this.f136892B;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.f136893C);
        return bundle;
    }
}
