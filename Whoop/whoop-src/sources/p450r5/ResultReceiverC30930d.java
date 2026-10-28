package p450r5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.room.C1836v0;
import com.google.android.gms.common.api.ApiException;
import j43.C21317a;
import java.util.concurrent.Executor;
import p005a3.C0271z0;
import p031b9.AbstractC2875y;
import p073cq.C11040i;
import p229ip.C20792c;
import p320m5.C25059c;
import p320m5.InterfaceC25063g;
import p402po.C29396m;
import p414q5.AbstractC29978b;
import p414q5.C29977a;
import p480s5.C32198a;
import p529uo.AbstractC35135w;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: r5.d */
/* JADX INFO: loaded from: classes5.dex */
public final class ResultReceiverC30930d extends ResultReceiver {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f127630w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f127631x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResultReceiverC30930d(AbstractC29978b abstractC29978b, Handler handler, int i13) {
        super(handler);
        this.f127630w = i13;
        this.f127631x = abstractC29978b;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i13, Bundle resultData) {
        int i14 = this.f127630w;
        Object obj = this.f127631x;
        switch (i14) {
            case 0:
                AbstractC22676k.m65750j(resultData, "resultData");
                C30931e c30931e = (C30931e) obj;
                if (AbstractC29978b.m91695c(resultData, new C1836v0(2, AbstractC29978b.f122437a, C29977a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 18), c30931e.m95140f(), c30931e.m95139e(), c30931e.f127635h)) {
                    return;
                }
                int i15 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                int i16 = AbstractC29978b.f122439c;
                if (i15 != i16) {
                    Log.w("BeginSignIn", "Returned request code " + i16 + " which  does not match what was given " + i15);
                    return;
                }
                C21317a c21317a = new C21317a(c30931e, 7);
                CancellationSignal cancellationSignal = c30931e.f127635h;
                if (i13 != -1) {
                    C22669g0 c22669g0 = new C22669g0();
                    c22669g0.f89336w = new GetCredentialUnknownException(AbstractC2875y.m8296i(i13, "activity with result code: ", " indicating not RESULT_OK"));
                    if (i13 == 0) {
                        c22669g0.f89336w = new GetCredentialCancellationException("activity is cancelled by the user.");
                    }
                    AbstractC29978b.m91693a(cancellationSignal, new C0271z0(25, c21317a, c22669g0));
                    return;
                }
                try {
                    Context context = c30931e.f127632e;
                    AbstractC35135w.m111094f(context);
                    AbstractC29978b.m91693a(c30931e.f127635h, new C0271z0(27, c30931e, c30931e.m95138d(new C20792c(context, new C29396m()).m57327c(intent))));
                    return;
                } catch (GetCredentialException e5) {
                    AbstractC29978b.m91693a(c30931e.f127635h, new C0271z0(29, c30931e, e5));
                    return;
                } catch (ApiException e13) {
                    C22669g0 c22669g1 = new C22669g0();
                    c22669g1.f89336w = new GetCredentialUnknownException(e13.getMessage());
                    int i17 = e13.f20483w.f20493w;
                    if (i17 == 16) {
                        c22669g1.f89336w = new GetCredentialCancellationException(e13.getMessage());
                    } else if (AbstractC29978b.f122438b.contains(Integer.valueOf(i17))) {
                        c22669g1.f89336w = new GetCredentialInterruptedException(e13.getMessage());
                    }
                    AbstractC29978b.m91693a(c30931e.f127635h, new C0271z0(28, c30931e, c22669g1));
                    return;
                } catch (Throwable th3) {
                    AbstractC29978b.m91693a(c30931e.f127635h, new C30929c(0, c30931e, new GetCredentialUnknownException(th3.getMessage())));
                    return;
                }
            case 1:
                AbstractC22676k.m65750j(resultData, "resultData");
                C1836v0 c1836v0 = new C1836v0(2, AbstractC29978b.f122437a, C29977a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 19);
                C32198a c32198a = (C32198a) obj;
                Executor executor = c32198a.f133336f;
                if (executor == null) {
                    AbstractC22676k.m65757q("executor");
                    throw null;
                }
                InterfaceC25063g interfaceC25063g = c32198a.f133335e;
                if (interfaceC25063g == null) {
                    AbstractC22676k.m65757q("callback");
                    throw null;
                }
                if (AbstractC29978b.m91695c(resultData, c1836v0, executor, interfaceC25063g, c32198a.f133337g)) {
                    return;
                }
                int i18 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                int i19 = AbstractC29978b.f122439c;
                if (i18 != i19) {
                    Log.w("CreatePassword", "Returned request code " + i19 + " which does not match what was given " + i18);
                    return;
                }
                C21317a c21317a2 = new C21317a(c32198a, 9);
                CancellationSignal cancellationSignal2 = c32198a.f133337g;
                if (i13 == -1) {
                    new Bundle();
                    AbstractC29978b.m91693a(c32198a.f133337g, new C30929c(4, c32198a, new C25059c()));
                    return;
                }
                C22669g0 c22669g2 = new C22669g0();
                c22669g2.f89336w = new CreateCredentialUnknownException(AbstractC2875y.m8296i(i13, "activity with result code: ", " indicating not RESULT_OK"));
                if (i13 == 0) {
                    c22669g2.f89336w = new CreateCredentialCancellationException("activity is cancelled by the user.");
                }
                C0271z0 c0271z0 = new C0271z0(c21317a2, c22669g2);
                int i24 = AbstractC29978b.f122440d;
                int i25 = C32198a.f133334i;
                AbstractC29978b.m91693a(cancellationSignal2, c0271z0);
                return;
            default:
                ((C11040i) obj).m29689d(null);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultReceiverC30930d(Handler handler, C11040i c11040i) {
        super(handler);
        this.f127630w = 2;
        this.f127631x = c11040i;
    }
}
