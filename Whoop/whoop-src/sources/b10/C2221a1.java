package b10;

import a30.C0286e0;
import a30.C0294h;
import android.content.Context;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import d30.C11530f0;
import e00.C12500w;
import e00.C12501x;
import java.util.Set;
import k20.C22136a;
import p203hy.C17714c;
import p442qy.C30765d;
import p599wz.C37734l1;
import p664yy.C39865j;
import q83.InterfaceC30063j;
import s10.C32063e;
import s10.C32064f;
import t10.C33285e;
import v00.C35459c0;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: b10.a1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2221a1 implements InterfaceC35517d {

    /* JADX INFO: renamed from: E */
    public final InterfaceC35521h f8846E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC35521h f8847F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC35521h f8848G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC35521h f8849H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC35521h f8850I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8851w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35521h f8852x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f8853y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC35521h f8854z;

    public /* synthetic */ C2221a1(InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, InterfaceC35521h interfaceC35521h3, InterfaceC35521h interfaceC35521h4, InterfaceC35521h interfaceC35521h5, InterfaceC35521h interfaceC35521h6, InterfaceC35521h interfaceC35521h7, InterfaceC35521h interfaceC35521h8, int i13) {
        this.f8851w = i13;
        this.f8852x = interfaceC35521h;
        this.f8853y = interfaceC35521h2;
        this.f8854z = interfaceC35521h3;
        this.f8846E = interfaceC35521h4;
        this.f8847F = interfaceC35521h5;
        this.f8848G = interfaceC35521h6;
        this.f8849H = interfaceC35521h7;
        this.f8850I = interfaceC35521h8;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f8851w) {
            case 0:
                return new C2273z0((Context) this.f8852x.get(), (InterfaceC4339a) this.f8853y.get(), (EnumC2228d) this.f8854z.get(), (InterfaceC30063j) this.f8846E.get(), (Set) this.f8847F.get(), (C2222b) this.f8848G.get(), (C39865j) this.f8849H.get(), (C30765d) this.f8850I.get());
            case 1:
                return new C11530f0((C35459c0) this.f8852x.get(), (String) this.f8853y.get(), ((Boolean) this.f8854z.get()).booleanValue(), (C32064f) this.f8846E.get(), (C32063e) this.f8847F.get(), (InterfaceC2994c0) this.f8848G.get(), (C33285e) this.f8849H.get(), (C22136a) this.f8850I.get());
            default:
                return new C17714c((C22136a) this.f8852x.get(), (C12500w) ((C12501x) this.f8850I).get(), (String) this.f8853y.get(), (InterfaceC30063j) this.f8854z.get(), (C0286e0) this.f8846E.get(), (C37734l1) this.f8847F.get(), (EventReporter$Mode) this.f8848G.get(), (C30765d) this.f8849H.get());
        }
    }

    public C2221a1(InterfaceC35521h interfaceC35521h, C12501x c12501x, C2225c c2225c, InterfaceC35521h interfaceC35521h2, C0294h c0294h, InterfaceC35521h interfaceC35521h3, InterfaceC35521h interfaceC35521h4, InterfaceC35521h interfaceC35521h5) {
        this.f8851w = 2;
        this.f8852x = interfaceC35521h;
        this.f8850I = c12501x;
        this.f8853y = c2225c;
        this.f8854z = interfaceC35521h2;
        this.f8846E = c0294h;
        this.f8847F = interfaceC35521h3;
        this.f8848G = interfaceC35521h4;
        this.f8849H = interfaceC35521h5;
    }
}
