package androidx.compose.foundation.layout;

import c93.InterfaceC4351m;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p291l0.C22964h2;
import p291l0.EnumC22954f0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "La3/h1;", "Ll0/h2;", "foundation-layout"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class WrapContentElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final String f4578E;

    /* JADX INFO: renamed from: w */
    public final EnumC22954f0 f4579w;

    /* JADX INFO: renamed from: x */
    public final boolean f4580x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC4351m f4581y;

    /* JADX INFO: renamed from: z */
    public final Object f4582z;

    public WrapContentElement(EnumC22954f0 enumC22954f0, boolean z4, InterfaceC4351m interfaceC4351m, Object obj, String str) {
        this.f4579w = enumC22954f0;
        this.f4580x = z4;
        this.f4581y = interfaceC4351m;
        this.f4582z = obj;
        this.f4578E = str;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C22964h2 c22964h2 = new C22964h2();
        c22964h2.f90618O = this.f4579w;
        c22964h2.f90619P = this.f4580x;
        c22964h2.f90620Q = this.f4581y;
        return c22964h2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f4579w == wrapContentElement.f4579w && this.f4580x == wrapContentElement.f4580x && AbstractC22676k.m65745e(this.f4582z, wrapContentElement.f4582z);
    }

    public final int hashCode() {
        return this.f4582z.hashCode() + AbstractC2875y.m8289b(this.f4579w.hashCode() * 31, 31, this.f4580x);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c(this.f4578E);
        c2404l2.m7400b().m7292c(this.f4582z, "align");
        c2404l2.m7400b().m7292c(Boolean.valueOf(this.f4580x), "unbounded");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C22964h2 c22964h2 = (C22964h2) abstractC2316v;
        c22964h2.f90618O = this.f4579w;
        c22964h2.f90619P = this.f4580x;
        c22964h2.f90620Q = this.f4581y;
    }
}
