package ec3;

import bc3.InterfaceC2994c0;
import dc3.EnumC11916a;
import dc3.InterfaceC11936u;
import dc3.InterfaceC11938w;
import fc3.AbstractC14373d;
import fc3.C14392w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import l83.C23454a0;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;

/* JADX INFO: renamed from: ec3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C13038g extends AbstractC14373d {

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f45061F = AtomicIntegerFieldUpdater.newUpdater(C13038g.class, "consumed$volatile");

    /* JADX INFO: renamed from: E */
    public final boolean f45062E;
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: z */
    public final InterfaceC11938w f45063z;

    public /* synthetic */ C13038g(InterfaceC11938w interfaceC11938w, boolean z4) {
        this(interfaceC11938w, z4, C30064k.f122676w, -3, EnumC11916a.f38982w);
    }

    @Override // fc3.AbstractC14373d
    /* JADX INFO: renamed from: c */
    public final String mo36561c() {
        return "channel=" + this.f45063z;
    }

    @Override // fc3.AbstractC14373d, ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) throws Throwable {
        if (this.f52481x == -3) {
            boolean z4 = this.f45062E;
            if (z4 && f45061F.getAndSet(this, 1) == 1) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object objM36614x = AbstractC13091v.m36614x(interfaceC13062m, this.f45063z, z4, interfaceC30057d);
            if (objM36614x == EnumC31071a.f128113w) {
                return objM36614x;
            }
        } else {
            Object objCollect = super.collect(interfaceC13062m, interfaceC30057d);
            if (objCollect == EnumC31071a.f128113w) {
                return objCollect;
            }
        }
        return C23454a0.f92919a;
    }

    @Override // fc3.AbstractC14373d
    /* JADX INFO: renamed from: e */
    public final Object mo36558e(InterfaceC11936u interfaceC11936u, InterfaceC30057d interfaceC30057d) throws Throwable {
        Object objM36614x = AbstractC13091v.m36614x(new C14392w(interfaceC11936u), this.f45063z, this.f45062E, interfaceC30057d);
        return objM36614x == EnumC31071a.f128113w ? objM36614x : C23454a0.f92919a;
    }

    @Override // fc3.AbstractC14373d
    /* JADX INFO: renamed from: f */
    public final AbstractC14373d mo36559f(InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a) {
        return new C13038g(this.f45063z, this.f45062E, interfaceC30063j, i13, enumC11916a);
    }

    @Override // fc3.AbstractC14373d
    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l mo36562g() {
        return new C13038g(this.f45063z, this.f45062E);
    }

    @Override // fc3.AbstractC14373d
    /* JADX INFO: renamed from: h */
    public final InterfaceC11938w mo36563h(InterfaceC2994c0 interfaceC2994c0) {
        if (this.f45062E && f45061F.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.f52481x == -3 ? this.f45063z : super.mo36563h(interfaceC2994c0);
    }

    public C13038g(InterfaceC11938w interfaceC11938w, boolean z4, InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a) {
        super(interfaceC30063j, i13, enumC11916a);
        this.f45063z = interfaceC11938w;
        this.f45062E = z4;
    }
}
