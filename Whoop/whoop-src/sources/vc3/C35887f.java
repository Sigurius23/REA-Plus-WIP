package vc3;

import j93.InterfaceC21461d;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import l83.EnumC23463i;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import v40.C35652d;
import wc3.C37142g;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: vc3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C35887f extends AbstractPolymorphicSerializer {

    /* JADX INFO: renamed from: a */
    public static final C35887f f152811a = new C35887f();

    /* JADX INFO: renamed from: b */
    public static final Object f152812b = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35652d(26));

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, l83.h] */
    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final InterfaceC37145j findPolymorphicSerializerOrNull(InterfaceC40542e encoder, Object obj) {
        DateTimeUnit value = (DateTimeUnit) obj;
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        return ((C37142g) f152812b.getValue()).findPolymorphicSerializerOrNull(encoder, value);
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final InterfaceC21461d getBaseClass() {
        return AbstractC22671h0.f89337a.getOrCreateKotlinClass(DateTimeUnit.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l83.h] */
    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return ((C37142g) f152812b.getValue()).getDescriptor();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l83.h] */
    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final InterfaceC37137b findPolymorphicSerializerOrNull(InterfaceC40539b decoder, String str) {
        AbstractC22676k.m65750j(decoder, "decoder");
        return ((C37142g) f152812b.getValue()).findPolymorphicSerializerOrNull(decoder, str);
    }
}
