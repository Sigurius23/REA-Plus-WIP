package mb3;

import bg.C3215j;
import c93.InterfaceC4339a;
import g40.C15335d;
import io.sentry.config.AbstractC20301a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l83.EnumC23463i;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import m83.C25271y;
import o93.AbstractC27736h;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import za3.InterfaceC40247b;

/* JADX INFO: renamed from: mb3.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C25392i implements InterfaceC40247b {

    /* JADX INFO: renamed from: E */
    public final Object f99482E;

    /* JADX INFO: renamed from: w */
    public final AbstractC23804u0 f99483w;

    /* JADX INFO: renamed from: x */
    public InterfaceC4339a f99484x;

    /* JADX INFO: renamed from: y */
    public final C25392i f99485y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC31165x0 f99486z;

    public C25392i(AbstractC23804u0 projection, InterfaceC4339a interfaceC4339a, C25392i c25392i, InterfaceC31165x0 interfaceC31165x0) {
        AbstractC22676k.m65750j(projection, "projection");
        this.f99483w = projection;
        this.f99484x = interfaceC4339a;
        this.f99485y = c25392i;
        this.f99486z = interfaceC31165x0;
        this.f99482E = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C3215j(this, 8));
    }

    @Override // za3.InterfaceC40247b
    /* JADX INFO: renamed from: b */
    public final AbstractC23804u0 mo74523b() {
        return this.f99483w;
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: c */
    public final AbstractC27736h mo1783c() {
        AbstractC23811y abstractC23811yMo69868b = this.f99483w.mo69868b();
        AbstractC22676k.m65749i(abstractC23811yMo69868b, "getType(...)");
        return AbstractC20301a.m56356z(abstractC23811yMo69868b);
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: d */
    public final InterfaceC31126h mo1784d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C25392i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        C25392i c25392i = (C25392i) obj;
        C25392i c25392i2 = this.f99485y;
        if (c25392i2 == null) {
            c25392i2 = this;
        }
        C25392i c25392i3 = c25392i.f99485y;
        if (c25392i3 != null) {
            obj = c25392i3;
        }
        return c25392i2 == obj;
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: f */
    public final boolean mo1785f() {
        return false;
    }

    @Override // lb3.InterfaceC23796q0
    public final List getParameters() {
        return C25271y.f99162w;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l83.h] */
    @Override // lb3.InterfaceC23796q0
    public final Collection getSupertypes() {
        Collection collection = (List) this.f99482E.getValue();
        if (collection == null) {
            collection = C25271y.f99162w;
        }
        return collection;
    }

    public final int hashCode() {
        C25392i c25392i = this.f99485y;
        return c25392i != null ? c25392i.hashCode() : super.hashCode();
    }

    public final String toString() {
        return "CapturedType(" + this.f99483w + ')';
    }

    public /* synthetic */ C25392i(AbstractC23804u0 abstractC23804u0, C15335d c15335d, InterfaceC31165x0 interfaceC31165x0, int i13) {
        this(abstractC23804u0, (i13 & 2) != 0 ? null : c15335d, (C25392i) null, (i13 & 8) != 0 ? null : interfaceC31165x0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25392i(AbstractC23804u0 projection, ArrayList arrayList) {
        this(projection, new C15335d(arrayList, 9), (InterfaceC31165x0) null, 8);
        AbstractC22676k.m65750j(projection, "projection");
    }
}
