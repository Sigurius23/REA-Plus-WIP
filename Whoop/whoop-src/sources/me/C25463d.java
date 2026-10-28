package me;

import androidx.room.C1832u;
import be.C3154g;
import be.InterfaceC3160m;
import java.io.Closeable;
import l83.InterfaceC23462h;
import p147ff.InterfaceC14422a;
import p250jf.AbstractC21636e;
import p474s.C31983m2;
import p646yd.AbstractC39455f;
import p715kotlin.jvm.internal.AbstractC22676k;
import s83.AbstractC32269c;
import vg.InterfaceC35967n;

/* JADX INFO: renamed from: me.d */
/* JADX INFO: loaded from: classes.dex */
public final class C25463d implements InterfaceC14422a, Closeable {

    /* JADX INFO: renamed from: w */
    public final InterfaceC23462h f99700w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35967n f99701x;

    /* JADX INFO: renamed from: y */
    public final C31983m2 f99702y = new C31983m2(new C1832u(1, this, C25463d.class, "loadRegion", "loadRegion(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 19));

    public C25463d(InterfaceC23462h interfaceC23462h, InterfaceC35967n interfaceC35967n) {
        this.f99700w = interfaceC23462h;
        this.f99701x = interfaceC35967n;
    }

    @Override // p147ff.InterfaceC14422a
    /* JADX INFO: renamed from: b */
    public final Object mo41126b(AbstractC32269c abstractC32269c) {
        if (AbstractC22676k.m65745e(AbstractC21636e.m60881b(AbstractC39455f.m125999e(), this.f99701x), Boolean.TRUE)) {
            return null;
        }
        return this.f99702y.m99483g(abstractC32269c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC23462h interfaceC23462h = this.f99700w;
        if (interfaceC23462h.mo5046b()) {
            ((C3154g) ((InterfaceC3160m) interfaceC23462h.getValue())).close();
        }
    }
}
