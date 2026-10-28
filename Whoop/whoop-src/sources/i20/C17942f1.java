package i20;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.InterfaceC1563a2;
import j20.C21241c;
import k83.InterfaceC22297a;
import kr.C22791j;
import p20.C28742d;
import p715kotlin.jvm.internal.AbstractC22676k;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: i20.f1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17942f1 implements InterfaceC1563a2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC22297a f69722a;

    public C17942f1(InterfaceC22297a inputAddressViewModelSubcomponentFactoryProvider) {
        AbstractC22676k.m65750j(inputAddressViewModelSubcomponentFactoryProvider, "inputAddressViewModelSubcomponentFactoryProvider");
        this.f69722a = inputAddressViewModelSubcomponentFactoryProvider;
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(Class modelClass) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        C22791j c22791j = ((C28742d) this.f69722a.get()).f116331a;
        return new C17954j1((C17946h) c22791j.f89753a, (C17957k1) ((InterfaceC35521h) c22791j.f89755c).get(), (C21241c) ((InterfaceC35521h) c22791j.f89763k).get());
    }
}
