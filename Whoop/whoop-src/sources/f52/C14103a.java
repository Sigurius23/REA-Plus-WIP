package f52;

import a52.C0396c;
import bc3.InterfaceC3018i0;
import com.whoop.puffin.sync.C9819b;
import com.whoop.puffin.sync.C9820c;
import nf3.C26669a;
import of3.InterfaceC27903a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import sj2.InterfaceC32564a;
import vk0.InterfaceC36079e;
import y42.InterfaceC39219a;

/* JADX INFO: renamed from: f52.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lf52/a;", "Lof3/a;", "<init>", "()V", "Ly42/a;", "puffin", "Lcom/whoop/puffin/sync/c;", "batterySyncHolder", "Lbc3/i0;", "Lvk0/e;", "c", "(Ly42/a;Lcom/whoop/puffin/sync/c;)Lbc3/i0;", "b", "(Ly42/a;)Lbc3/i0;", "a", "(Ly42/a;Lq83/d;)Ljava/lang/Object;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14103a implements InterfaceC27903a {
    /* JADX INFO: renamed from: a */
    public final Object m40171a(InterfaceC39219a interfaceC39219a, InterfaceC30057d<? super InterfaceC36079e> interfaceC30057d) {
        return interfaceC39219a.mo124936a(new C0396c(), InterfaceC32564a.a.f134904a).await(interfaceC30057d);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC3018i0 m40172b(InterfaceC39219a puffin) {
        AbstractC22676k.m65750j(puffin, "puffin");
        return m40173c(puffin, (C9820c) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9820c.class), null));
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC3018i0 m40173c(InterfaceC39219a puffin, C9820c batterySyncHolder) {
        AbstractC22676k.m65750j(puffin, "puffin");
        AbstractC22676k.m65750j(batterySyncHolder, "batterySyncHolder");
        return puffin.mo124936a(new C9819b(null, null, null, batterySyncHolder, 7, null), InterfaceC32564a.b.f134906a);
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }
}
