package p320m5;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import bc3.C3033m;
import eu.C13610f;
import ge3.AbstractC15751g;
import gm.C15982j;
import p182h3.C16788d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: m5.f */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC25062f {
    /* JADX INFO: renamed from: a */
    static Object m73536a(Context context, C25070n c25070n, InterfaceC30057d interfaceC30057d) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        c3033m.m8776u(new C16788d(cancellationSignal, 2));
        C13610f c13610f = new C13610f(c3033m, 2);
        ExecutorC25061e executorC25061e = new ExecutorC25061e(0);
        AbstractC22676k.m65750j(context, "context");
        InterfaceC25065i interfaceC25065iM45126d = C15982j.m45126d(new C15982j(context, 2));
        if (interfaceC25065iM45126d == null) {
            c13610f.mo38428a(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            interfaceC25065iM45126d.onGetCredential(context, c25070n, cancellationSignal, executorC25061e, c13610f);
        }
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX INFO: renamed from: b */
    default Object m73537b(Context context, C25060d c25060d, InterfaceC30057d interfaceC30057d) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        c3033m.m8776u(new C16788d(cancellationSignal, 1));
        C13610f c13610f = new C13610f(c3033m, 1);
        ExecutorC25061e executorC25061e = new ExecutorC25061e(0);
        AbstractC22676k.m65750j(context, "context");
        InterfaceC25065i interfaceC25065iM45126d = C15982j.m45126d(new C15982j(((C25064h) this).f98196a, 2));
        if (interfaceC25065iM45126d == null) {
            c13610f.mo38428a(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            interfaceC25065iM45126d.onCreateCredential(context, c25060d, cancellationSignal, executorC25061e, c13610f);
        }
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }
}
