package androidx.compose.p018ui;

import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p026b2.C2313s;
import p027b3.C2404l2;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28689z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/CompositionLocalMapInjectionElement;", "La3/h1;", "Lb2/s;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class CompositionLocalMapInjectionElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC28689z f4772w;

    public CompositionLocalMapInjectionElement(InterfaceC28653p1 interfaceC28653p1) {
        this.f4772w = interfaceC28653p1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C2313s c2313s = new C2313s();
        c2313s.f9130O = this.f4772w;
        return c2313s;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof CompositionLocalMapInjectionElement) && AbstractC22676k.m65745e(((CompositionLocalMapInjectionElement) obj).f4772w, this.f4772w);
    }

    public final int hashCode() {
        return this.f4772w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "<Injected CompositionLocalMap>";
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C2313s c2313s = (C2313s) abstractC2316v;
        InterfaceC28689z interfaceC28689z = this.f4772w;
        c2313s.f9130O = interfaceC28689z;
        AbstractC0201g.m516p(c2313s).m653z0(interfaceC28689z);
    }
}
