package kotlinx.serialization.internal;

import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yb3.AbstractC39414r;
import yc3.C39437a;
import yc3.C39444h;
import yc3.C39448l;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\n\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u000b\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lkotlinx/serialization/internal/PairSerializer;", "K", "V", "Lkotlinx/serialization/internal/KeyValueSerializer;", "Ll83/k;", "Lwc3/c;", "keySerializer", "valueSerializer", "<init>", "(Lwc3/c;Lwc3/c;)V", "key", "value", "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Ll83/k;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "getKey", "(Ll83/k;)Ljava/lang/Object;", "getValue", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PairSerializer<K, V> extends KeyValueSerializer<K, V, C23465k> {
    private final InterfaceC39443g descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairSerializer(InterfaceC37138c keySerializer, InterfaceC37138c valueSerializer) {
        super(keySerializer, valueSerializer, null);
        AbstractC22676k.m65750j(keySerializer, "keySerializer");
        AbstractC22676k.m65750j(valueSerializer, "valueSerializer");
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        if (AbstractC39414r.m125890i0("kotlin.Pair")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C39437a c39437a = new C39437a("kotlin.Pair");
        descriptor$lambda$0(keySerializer, valueSerializer, c39437a);
        this.descriptor = new C39444h("kotlin.Pair", C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
    }

    private static final C23454a0 descriptor$lambda$0(InterfaceC37138c interfaceC37138c, InterfaceC37138c interfaceC37138c2, C39437a buildClassSerialDescriptor) {
        AbstractC22676k.m65750j(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.m125993a("first", interfaceC37138c.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("second", interfaceC37138c2.getDescriptor(), false);
        return C23454a0.f92919a;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public K getKey(C23465k c23465k) {
        AbstractC22676k.m65750j(c23465k, "<this>");
        return (K) c23465k.f92937w;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public V getValue(C23465k c23465k) {
        AbstractC22676k.m65750j(c23465k, "<this>");
        return (V) c23465k.f92938x;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public C23465k toResult(K key, V value) {
        return new C23465k(key, value);
    }
}
