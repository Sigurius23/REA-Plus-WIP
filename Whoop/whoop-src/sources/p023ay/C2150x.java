package p023ay;

import android.os.Bundle;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import d20.C11496l;
import d20.InterfaceC11497m;
import e93.AbstractC12889b;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25265s;
import p479s4.AbstractC32126g;
import p537ux.C35357s0;
import p715kotlin.jvm.internal.AbstractC22676k;
import s40.C32132a;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: ay.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C2150x implements InterfaceC2152z, InterfaceC11497m {

    /* JADX INFO: renamed from: a */
    public final C32132a f8557a;

    public C2150x(C32132a host, int i13) {
        switch (i13) {
            case 1:
                AbstractC22676k.m65750j(host, "host");
                this.f8557a = host;
                break;
            default:
                AbstractC22676k.m65750j(host, "host");
                this.f8557a = host;
                break;
        }
    }

    @Override // p023ay.InterfaceC2152z
    /* JADX INFO: renamed from: a */
    public void mo6699a(C2142p c2142p) {
        int i13 = IntentConfirmationChallengeActivity.f22141y;
        String str = c2142p.f8536a;
        InterfaceC38802c8 interfaceC38802c8 = c2142p.f8538c;
        Bundle bundleM36273g = AbstractC12889b.m36273g(new C23465k("intent_confirmation_challenge_args", new C2146t(str, AbstractC25265s.m74093D1(c2142p.f8537b), interfaceC38802c8)));
        List list = C35357s0.f150612l;
        this.f8557a.m100080a(IntentConfirmationChallengeActivity.class, bundleM36273g, AbstractC32126g.m100044i(interfaceC38802c8));
    }

    @Override // s40.InterfaceC32135b
    /* JADX INFO: renamed from: b */
    public void mo6700b(Object obj) {
        C11496l c11496l = (C11496l) obj;
        Bundle bundleM36273g = AbstractC12889b.m36273g(new C23465k("extra_args", c11496l));
        List list = C35357s0.f150612l;
        this.f8557a.m100080a(Stripe3ds2TransactionActivity.class, bundleM36273g, AbstractC32126g.m100044i(c11496l.f36968y));
    }
}
