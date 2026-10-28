package wc3;

import j93.InterfaceC21461d;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import l83.EnumC23463i;
import m83.AbstractC25260n;
import m83.C25262p;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: wc3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C37140e extends AbstractPolymorphicSerializer {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21461d f158881a;

    /* JADX INFO: renamed from: b */
    public final List f158882b;

    /* JADX INFO: renamed from: c */
    public final Object f158883c;

    public C37140e(InterfaceC21461d baseClass) {
        AbstractC22676k.m65750j(baseClass, "baseClass");
        this.f158881a = baseClass;
        this.f158882b = C25271y.f99162w;
        this.f158883c = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C25262p(this, 24));
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final InterfaceC21461d getBaseClass() {
        return this.f158881a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l83.h] */
    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return (InterfaceC39443g) this.f158883c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f158881a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37140e(InterfaceC21461d baseClass, Annotation[] annotationArr) {
        this(baseClass);
        AbstractC22676k.m65750j(baseClass, "baseClass");
        this.f158882b = AbstractC25260n.m74048W(annotationArr);
    }
}
