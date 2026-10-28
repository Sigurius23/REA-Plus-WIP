package bm2;

import android.app.DatePickerDialog;
import b30.C2582n3;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bi.AbstractC3269g;
import c31.AbstractC3932p;
import c93.InterfaceC4339a;
import d30.C11532g;
import d42.AbstractC11700p;
import e30.C12606d;
import ec3.InterfaceC13037f2;
import eg2.AbstractC13176i;
import h00.C16513l0;
import h02.C16587n0;
import h20.C16776z4;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.identifier.IdentifiersKt;
import io.getstream.chat.android.models.Reaction;
import java.util.Locale;
import l83.C23454a0;
import oo2.C28068c;
import p00.C28573j;
import p163g1.C15048j2;
import p163g1.C15136s0;
import p163g1.EnumC15146t0;
import p390p1.InterfaceC28601c1;
import p411q2.InterfaceC29805a;
import p715kotlin.jvm.functions.Function1;
import p736sz0.C33192k;
import ry0.AbstractC31907b;
import t20.C33333n;
import to2.AbstractC34023a;
import v90.AbstractC35822n;
import v90.C35819k;

/* JADX INFO: renamed from: bm2.d0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3433d0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13439w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f13440x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f13441y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f13442z;

    public /* synthetic */ C3433d0(Object obj, Object obj2, boolean z4, int i13) {
        this.f13439w = i13;
        this.f13441y = obj;
        this.f13442z = obj2;
        this.f13440x = z4;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [ec3.f2, java.lang.Object] */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f13439w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        boolean z4 = this.f13440x;
        Object obj = this.f13442z;
        Object obj2 = this.f13441y;
        switch (i13) {
            case 0:
                return AbstractC3436e0.m9941J(z4, (Locale) obj2, (InterfaceC28601c1) obj);
            case 1:
                return AbstractC3932p.m11970l((InterfaceC29805a) obj2, z4, (Function1) obj);
            case 2:
                return AbstractC11700p.m31230E(z4, (DatePickerDialog) obj2, (InterfaceC4339a) obj);
            case 3:
                return AbstractC13176i.m36949G(z4, (InterfaceC28601c1) obj, (Function1) obj2);
            case 4:
                C15136s0 c15136s0 = (C15136s0) obj2;
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
                if (z4) {
                    EnumC15146t0 enumC15146t0 = EnumC15146t0.f56806w;
                    c15136s0.getClass();
                    if (((Boolean) c15136s0.f56747a.f55767d.invoke(EnumC15146t0.f56806w)).booleanValue()) {
                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C15048j2(c15136s0, null, 0), 3);
                    }
                }
                return c23454a0;
            case 5:
                C16776z4 c16776z4 = (C16776z4) obj2;
                ?? r10 = c16776z4.f64482a;
                return new C12606d(AbstractC3269g.m9484M(r10, new C16513l0(10)), c16776z4.f64490i.f64021b, AbstractC3269g.m9484M(r10, new C16513l0(11)), (InterfaceC13037f2) obj, new C11532g(c16776z4, 1), this.f13440x, new C16587n0(c16776z4, 4));
            case 6:
                ChatClient.Companion companion = ChatClient.INSTANCE;
                return Integer.valueOf(IdentifiersKt.SendReactionIdentifier((Reaction) obj2, z4, (String) obj));
            case 7:
                ChatClient.Companion companion2 = ChatClient.INSTANCE;
                return Integer.valueOf(IdentifiersKt.HideChannelIdentifier((String) obj2, (String) obj, z4));
            case 8:
                return AbstractC31907b.m99200j((InterfaceC4339a) obj2, z4, (InterfaceC28601c1) obj);
            case 9:
                C33333n c33333n = (C33333n) obj2;
                C28573j c28573j = (C28573j) obj;
                if (z4) {
                    c33333n.f139039r.invoke(C2582n3.f10042a);
                }
                c28573j.invoke();
                c33333n.f139038q.invoke(new C33192k(17));
                return c23454a0;
            case 10:
                return AbstractC34023a.m107604k(z4, (String) obj2, (C28068c) obj);
            default:
                return AbstractC35822n.m113629o(z4, (C35819k) obj2, (InterfaceC28601c1) obj);
        }
    }

    public /* synthetic */ C3433d0(Object obj, boolean z4, Object obj2, int i13) {
        this.f13439w = i13;
        this.f13441y = obj;
        this.f13440x = z4;
        this.f13442z = obj2;
    }

    public /* synthetic */ C3433d0(Function1 function1, InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        this.f13439w = 3;
        this.f13440x = z4;
        this.f13442z = interfaceC28601c1;
        this.f13441y = function1;
    }

    public /* synthetic */ C3433d0(boolean z4, Object obj, Object obj2, int i13) {
        this.f13439w = i13;
        this.f13440x = z4;
        this.f13441y = obj;
        this.f13442z = obj2;
    }
}
