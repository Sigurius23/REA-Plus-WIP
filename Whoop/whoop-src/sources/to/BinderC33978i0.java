package to;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import aq.AbstractBinderC1886c;
import aq.C1884a;
import aq.C1887d;
import aq.C1889f;
import cd3.C4455g;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.api.InterfaceC4978i;
import com.google.android.gms.common.api.InterfaceC4979j;
import com.google.crypto.tink.internal.C5099k0;
import java.util.Set;
import jp.AbstractC21843a;
import p036bq.RunnableC3543b;
import p096dq.C12281y;
import p097ds.RunnableC12316s;
import p508ty.C34249c;
import p529uo.AbstractC35135w;
import p529uo.C35131s;
import p557vo.AbstractC36221c;
import p688zp.AbstractC40938b;
import p688zp.C40937a;
import ro.C31617b;

/* JADX INFO: renamed from: to.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC33978i0 extends AbstractBinderC1886c implements InterfaceC4978i, InterfaceC4979j {

    /* JADX INFO: renamed from: n */
    public static final C12281y f142439n = AbstractC40938b.f176617a;

    /* JADX INFO: renamed from: g */
    public final Context f142440g;

    /* JADX INFO: renamed from: h */
    public final Handler f142441h;

    /* JADX INFO: renamed from: i */
    public final C12281y f142442i;

    /* JADX INFO: renamed from: j */
    public final Set f142443j;

    /* JADX INFO: renamed from: k */
    public final C5099k0 f142444k;

    /* JADX INFO: renamed from: l */
    public C1884a f142445l;

    /* JADX INFO: renamed from: m */
    public C4455g f142446m;

    public BinderC33978i0(Context context, Handler handler, C5099k0 c5099k0) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 1);
        this.f142440g = context;
        this.f142441h = handler;
        this.f142444k = c5099k0;
        this.f142443j = (Set) c5099k0.f21440y;
        this.f142442i = f142439n;
    }

    @Override // com.google.android.gms.common.api.InterfaceC4978i
    /* JADX INFO: renamed from: X */
    public final void mo15599X(int i13) {
        C4455g c4455g = this.f142446m;
        C34003v c34003v = (C34003v) ((C33971f) c4455g.f17960F).f142423J.get((C33961a) c4455g.f17963y);
        if (c34003v != null) {
            if (c34003v.f142502n) {
                c34003v.m107485k(new C4969a(17));
            } else {
                c34003v.mo15599X(i13);
            }
        }
    }

    @Override // com.google.android.gms.common.api.InterfaceC4979j
    /* JADX INFO: renamed from: c0 */
    public final void mo15607c0(C4969a c4969a) {
        this.f142446m.m13937K(c4969a);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m107447n0(C4455g c4455g) {
        C1884a c1884a = this.f142445l;
        if (c1884a != null) {
            c1884a.mo80986e();
        }
        Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
        C5099k0 c5099k0 = this.f142444k;
        c5099k0.f21438w = numValueOf;
        Handler handler = this.f142441h;
        this.f142445l = (C1884a) this.f142442i.mo15595a(this.f142440g, handler.getLooper(), c5099k0, (C40937a) c5099k0.f21437F, this, this);
        this.f142446m = c4455g;
        Set set = this.f142443j;
        if (set == null || set.isEmpty()) {
            handler.post(new RunnableC3543b(this, 28));
            return;
        }
        C1884a c1884a2 = this.f142445l;
        c1884a2.getClass();
        c1884a2.f148970i = new C34249c(c1884a2);
        c1884a2.m111067t(2, null);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m107448o0() {
        C1884a c1884a = this.f142445l;
        if (c1884a != null) {
            c1884a.mo80986e();
        }
    }

    @Override // com.google.android.gms.common.api.InterfaceC4978i
    /* JADX INFO: renamed from: s */
    public final void mo15600s() {
        C1884a c1884a = this.f142445l;
        c1884a.getClass();
        boolean z4 = false;
        try {
            c1884a.f7426A.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccountM97681b = "<<default account>>".equals(account.name) ? C31617b.m97679a(c1884a.f148964c).m97681b() : null;
            Integer num = c1884a.f7428C;
            AbstractC35135w.m111094f(num);
            C35131s c35131s = new C35131s(2, account, num.intValue(), googleSignInAccountM97681b);
            C1887d c1887d = (C1887d) c1884a.m111061j();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c1887d.f78074h);
            int i13 = AbstractC21843a.f84371a;
            parcelObtain.writeInt(1);
            int iM115338s = AbstractC36221c.m115338s(parcelObtain, 20293);
            AbstractC36221c.m115337r(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            AbstractC36221c.m115331l(parcelObtain, 2, c35131s, 0);
            AbstractC36221c.m115339t(parcelObtain, iM115338s);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                c1887d.f78073g.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e5) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f142441h.post(new RunnableC12316s(this, new C1889f(1, new C4969a(8, null), null), z4, 16));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e5);
            }
        }
    }
}
