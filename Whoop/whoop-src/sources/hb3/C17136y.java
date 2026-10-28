package hb3;

import e93.AbstractC12889b;
import p715kotlin.jvm.internal.AbstractC22676k;
import qa3.C30145k;
import qa3.EnumC30142j;
import r93.InterfaceC31155s0;
import sa3.AbstractC32330d;
import sa3.C32334h;
import sa3.InterfaceC32332f;
import va3.C35845c;
import va3.C35847e;

/* JADX INFO: renamed from: hb3.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C17136y extends AbstractC17104a0 {

    /* JADX INFO: renamed from: E */
    public final C30145k f65805E;

    /* JADX INFO: renamed from: F */
    public final C17136y f65806F;

    /* JADX INFO: renamed from: G */
    public final C35845c f65807G;

    /* JADX INFO: renamed from: H */
    public final EnumC30142j f65808H;

    /* JADX INFO: renamed from: I */
    public final boolean f65809I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17136y(C30145k classProto, InterfaceC32332f nameResolver, C32334h c32334h, InterfaceC31155s0 interfaceC31155s0, C17136y c17136y) {
        super(nameResolver, c32334h, interfaceC31155s0);
        AbstractC22676k.m65750j(classProto, "classProto");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        this.f65805E = classProto;
        this.f65806F = c17136y;
        this.f65807G = AbstractC12889b.m36239E(nameResolver, classProto.f123271E);
        EnumC30142j enumC30142j = (EnumC30142j) AbstractC32330d.f133806f.mo91233e(classProto.f123301z);
        this.f65808H = enumC30142j == null ? EnumC30142j.CLASS : enumC30142j;
        this.f65809I = AbstractC32330d.f133807g.mo91233e(classProto.f123301z).booleanValue();
        AbstractC32330d.f133808h.getClass();
    }

    @Override // hb3.AbstractC17104a0
    /* JADX INFO: renamed from: b */
    public final C35847e mo48353b() {
        return this.f65807G.m113773a();
    }
}
