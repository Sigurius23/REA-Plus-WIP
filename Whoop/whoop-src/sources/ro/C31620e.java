package ro;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.InterfaceC4978i;
import com.google.android.gms.common.api.InterfaceC4979j;
import com.google.android.gms.common.api.Scope;
import com.google.crypto.tink.internal.C5099k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p229ip.AbstractC20796g;
import p432qo.C30524b;
import p529uo.AbstractC35117h;

/* JADX INFO: renamed from: ro.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C31620e extends AbstractC35117h {

    /* JADX INFO: renamed from: z */
    public final GoogleSignInOptions f130658z;

    public C31620e(Context context, Looper looper, C5099k0 c5099k0, GoogleSignInOptions googleSignInOptions, InterfaceC4978i interfaceC4978i, InterfaceC4979j interfaceC4979j) {
        C30524b c30524b;
        super(context, looper, 91, c5099k0, interfaceC4978i, interfaceC4979j, 0);
        Set<Scope> set = (Set) c5099k0.f21441z;
        if (googleSignInOptions != null) {
            c30524b = new C30524b();
            c30524b.f125520a = new HashSet();
            c30524b.f125527h = new HashMap();
            c30524b.f125520a = new HashSet(googleSignInOptions.f20463x);
            c30524b.f125521b = googleSignInOptions.f20456E;
            c30524b.f125522c = googleSignInOptions.f20457F;
            c30524b.f125523d = googleSignInOptions.f20465z;
            c30524b.f125524e = googleSignInOptions.f20458G;
            c30524b.f125525f = googleSignInOptions.f20464y;
            c30524b.f125526g = googleSignInOptions.f20459H;
            c30524b.f125527h = GoogleSignInOptions.m15585f(googleSignInOptions.f20460I);
            c30524b.f125528i = googleSignInOptions.f20461J;
        } else {
            c30524b = new C30524b();
            c30524b.f125520a = new HashSet();
            c30524b.f125527h = new HashMap();
        }
        c30524b.f125528i = AbstractC20796g.m57331a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = c30524b.f125520a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = c30524b.f125520a;
        if (hashSet2.contains(GoogleSignInOptions.f20454N)) {
            Scope scope2 = GoogleSignInOptions.f20453M;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (c30524b.f125523d && (c30524b.f125525f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f20452L);
        }
        this.f130658z = new GoogleSignInOptions(3, new ArrayList(hashSet2), c30524b.f125525f, c30524b.f125523d, c30524b.f125521b, c30524b.f125522c, c30524b.f125524e, c30524b.f125526g, c30524b.f125527h, c30524b.f125528i);
    }

    @Override // p529uo.AbstractC35107c, com.google.android.gms.common.api.InterfaceC4973d
    /* JADX INFO: renamed from: b */
    public final int mo5666b() {
        return 12451000;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: d */
    public final IInterface mo5667d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C31626k ? (C31626k) iInterfaceQueryLocalInterface : new C31626k(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 0);
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: k */
    public final String mo5669k() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: l */
    public final String mo5670l() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
