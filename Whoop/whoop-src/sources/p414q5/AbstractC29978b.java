package p414q5;

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import java.util.Set;
import java.util.concurrent.Executor;
import m83.AbstractC25260n;
import p127ev.C13667h;
import p320m5.InterfaceC25063g;
import p394p5.C28845b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q5.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC29978b {

    /* JADX INFO: renamed from: a */
    public static final C29977a f122437a = new C29977a();

    /* JADX INFO: renamed from: b */
    public static final Set f122438b = AbstractC25260n.m74059b1(new Integer[]{7, 20});

    /* JADX INFO: renamed from: c */
    public static final int f122439c = 1;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f122440d = 0;

    /* JADX INFO: renamed from: a */
    public static final void m91693a(CancellationSignal cancellationSignal, InterfaceC4339a onResultOrException) {
        AbstractC22676k.m65750j(onResultOrException, "onResultOrException");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (C28845b.m87735a(cancellationSignal)) {
            return;
        }
        onResultOrException.invoke();
    }

    /* JADX INFO: renamed from: b */
    public static void m91694b(ResultReceiver resultReceiver, Intent intent, String str) {
        AbstractC22676k.m65750j(resultReceiver, "resultReceiver");
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", f122439c);
        Parcel parcelObtain = Parcel.obtain();
        AbstractC22676k.m65749i(parcelObtain, "obtain()");
        resultReceiver.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        intent.putExtra("RESULT_RECEIVER", resultReceiver2);
        intent.setFlags(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m91695c(Bundle bundle, InterfaceC4351m interfaceC4351m, Executor executor, InterfaceC25063g callback, CancellationSignal cancellationSignal) {
        AbstractC22676k.m65750j(executor, "executor");
        AbstractC22676k.m65750j(callback, "callback");
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        m91693a(cancellationSignal, new C13667h(executor, callback, interfaceC4351m.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE")), 6));
        return true;
    }
}
