package p394p5;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import l83.C23454a0;
import p005a3.C0271z0;
import p320m5.InterfaceC25063g;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: p5.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C28846c extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ CancellationSignal f116763w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Executor f116764x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC25063g f116765y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28846c(CancellationSignal cancellationSignal, Executor executor, InterfaceC25063g interfaceC25063g) {
        super(1);
        this.f116763w = cancellationSignal;
        this.f116764x = executor;
        this.f116765y = interfaceC25063g;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C28845b c28845b = CredentialProviderPlayServicesImpl.Companion;
        C0271z0 c0271z0 = new C0271z0(23, this.f116764x, this.f116765y);
        c28845b.getClass();
        if (!C28845b.m87735a(this.f116763w)) {
            c0271z0.invoke();
        }
        return C23454a0.f92919a;
    }
}
