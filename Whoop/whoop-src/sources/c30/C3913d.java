package c30;

import a40.InterfaceC0358c;
import l83.InterfaceC23459e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;
import y00.EnumC38853i;

/* JADX INFO: renamed from: c30.d */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C3913d implements InterfaceC0358c, InterfaceC22666f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Function1 f15998w;

    public C3913d(Function1 function) {
        AbstractC22676k.m65750j(function, "function");
        this.f15998w = function;
    }

    @Override // a40.InterfaceC0358c
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo992a(EnumC38853i enumC38853i) {
        this.f15998w.invoke(enumC38853i);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC0358c) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return this.f15998w;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
