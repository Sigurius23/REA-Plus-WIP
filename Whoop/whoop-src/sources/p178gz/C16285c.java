package p178gz;

import a40.InterfaceC0358c;
import cz.C11222r;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.EnumC38853i;

/* JADX INFO: renamed from: gz.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C16285c implements InterfaceC0358c {

    /* JADX INFO: renamed from: w */
    public final Function1 f62458w;

    public C16285c(Function1 viewActionHandler) {
        AbstractC22676k.m65750j(viewActionHandler, "viewActionHandler");
        this.f62458w = viewActionHandler;
    }

    @Override // a40.InterfaceC0358c
    /* JADX INFO: renamed from: a */
    public final void mo992a(EnumC38853i brand) {
        AbstractC22676k.m65750j(brand, "brand");
        this.f62458w.invoke(new C11222r(brand));
    }
}
