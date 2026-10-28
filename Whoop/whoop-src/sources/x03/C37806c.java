package x03;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p329n0.C26062o;
import p329n0.InterfaceC26054g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x03.c */
/* JADX INFO: loaded from: classes11.dex */
public final class C37806c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC26054g f161921a;

    public C37806c(InterfaceC26054g lazyListItem) {
        AbstractC22676k.m65750j(lazyListItem, "lazyListItem");
        this.f161921a = lazyListItem;
    }

    /* JADX INFO: renamed from: a */
    public final int m121323a() {
        return ((C26062o) this.f161921a).f103184a;
    }

    public final String toString() {
        int iM121323a = m121323a();
        InterfaceC26054g interfaceC26054g = this.f161921a;
        int i13 = ((C26062o) interfaceC26054g).f103198o;
        return AbstractC18489d0.m53371l(AbstractC11266d.m30465s(iM121323a, i13, "SnapperLayoutItemInfo(index=", ", offset=", ", size="), ((C26062o) interfaceC26054g).f103199p, ")");
    }
}
