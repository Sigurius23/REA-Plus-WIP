package ch;

import coil.compose.AsyncImagePainter;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: ch.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4586g implements InterfaceC13062m, InterfaceC22666f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AsyncImagePainter f18466w;

    public C4586g(AsyncImagePainter asyncImagePainter) {
        this.f18466w = asyncImagePainter;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        this.f18466w.m15506k((AbstractC4585f) obj);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return C23454a0.f92919a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC13062m) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return new C22656a(2, 4, AsyncImagePainter.class, this.f18466w, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
