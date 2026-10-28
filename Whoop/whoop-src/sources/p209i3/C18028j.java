package p209i3;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: i3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C18028j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4339a f69950a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4339a f69951b;

    public C18028j(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        this.f69950a = interfaceC4339a;
        this.f69951b = interfaceC4339a2;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f69950a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f69951b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
