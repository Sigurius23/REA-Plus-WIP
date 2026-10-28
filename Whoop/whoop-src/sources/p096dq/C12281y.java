package p096dq;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import aq.C1884a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.AbstractC4970a;
import com.google.android.gms.common.api.C4975f;
import com.google.android.gms.common.api.InterfaceC4973d;
import com.google.android.gms.common.api.InterfaceC4978i;
import com.google.android.gms.common.api.InterfaceC4979j;
import com.google.android.gms.location.ActivityRecognition;
import com.google.crypto.tink.internal.C5099k0;
import java.util.ArrayList;
import java.util.HashSet;
import mp.C25782k1;
import nh3.AbstractC26725a;
import np.C27004i;
import p002a0.C0022g;
import p077d0.C11387o2;
import p229ip.C20794e;
import p229ip.C20799j;
import p229ip.C20801l;
import p374oo.C28053b;
import p486sp.C32860k;
import p529uo.C35126n;
import p590wo.C37435c;
import p656yp.C39698e;
import p688zp.AbstractC40938b;
import p688zp.C40937a;
import ro.C31620e;

/* JADX INFO: renamed from: dq.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C12281y extends AbstractC4970a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41126a;

    public /* synthetic */ C12281y(int i13) {
        this.f41126a = i13;
    }

    @Override // com.google.android.gms.common.api.AbstractC4970a
    /* JADX INFO: renamed from: a */
    public InterfaceC4973d mo15595a(Context context, Looper looper, C5099k0 c5099k0, Object obj, InterfaceC4978i interfaceC4978i, InterfaceC4979j interfaceC4979j) {
        switch (this.f41126a) {
            case 0:
                C12276t c12276t = (C12276t) obj;
                if (c12276t == null) {
                    c12276t = new C12276t(new C11387o2(2));
                }
                return new C32860k(context, looper, c5099k0, interfaceC4978i, interfaceC4979j, c12276t.f41105w);
            case 1:
            case 2:
            case 7:
            default:
                return super.mo15595a(context, looper, c5099k0, obj, interfaceC4978i, interfaceC4979j);
            case 3:
                return new C25782k1(context, looper, 148, c5099k0, interfaceC4978i, interfaceC4979j, 0);
            case 4:
                return new C20799j(context, looper, c5099k0, (C28053b) obj, interfaceC4978i, interfaceC4979j);
            case 5:
                return new C31620e(context, looper, c5099k0, (GoogleSignInOptions) obj, interfaceC4978i, interfaceC4979j);
            case 6:
                HashSet hashSet = new HashSet();
                new HashSet();
                C0022g c0022g = new C0022g(0);
                C0022g c0022g2 = new C0022g(0);
                GoogleApiAvailability.getInstance();
                C12281y c12281y = AbstractC40938b.f176617a;
                new ArrayList();
                new ArrayList();
                context.getMainLooper();
                String packageName = context.getPackageName();
                String name = context.getClass().getName();
                C4975f c4975f = AbstractC40938b.f176618b;
                return new C27004i(context, looper, interfaceC4978i, interfaceC4979j, ActivityRecognition.CLIENT_NAME, new C5099k0(hashSet, c0022g, packageName, name, c0022g2.containsKey(c4975f) ? (C40937a) c0022g2.get(c4975f) : C40937a.f176616w));
            case 8:
                return new C39698e(context, looper, 185, c5099k0, interfaceC4978i, interfaceC4979j, 0);
            case 9:
                c5099k0.getClass();
                Integer num = (Integer) c5099k0.f21438w;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new C1884a(context, looper, c5099k0, bundle, interfaceC4978i, interfaceC4979j);
            case 10:
                throw AbstractC26725a.m79500d(obj);
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4970a
    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC4973d mo15596b(Context context, Looper looper, C5099k0 c5099k0, Object obj, InterfaceC4978i interfaceC4978i, InterfaceC4979j interfaceC4979j) {
        switch (this.f41126a) {
            case 1:
                return new C20801l(context, looper, c5099k0, interfaceC4978i, interfaceC4979j);
            case 2:
                return new C20794e(context, looper, c5099k0, interfaceC4978i, interfaceC4979j);
            case 7:
                return new C37435c(context, looper, c5099k0, (C35126n) obj, interfaceC4978i, interfaceC4979j);
            default:
                return super.mo15596b(context, looper, c5099k0, obj, interfaceC4978i, interfaceC4979j);
        }
    }
}
