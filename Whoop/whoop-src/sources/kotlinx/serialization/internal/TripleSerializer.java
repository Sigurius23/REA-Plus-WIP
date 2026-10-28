package kotlinx.serialization.internal;

import kotlinx.serialization.SerializationException;
import l83.C23454a0;
import l83.C23471q;
import m83.AbstractC25260n;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yb3.AbstractC39414r;
import yc3.C39437a;
import yc3.C39444h;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0004B1\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ1\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lkotlinx/serialization/internal/TripleSerializer;", "A", "B", "C", "Lwc3/c;", "Ll83/q;", "aSerializer", "bSerializer", "cSerializer", "<init>", "(Lwc3/c;Lwc3/c;Lwc3/c;)V", "Lzc3/b;", "composite", "decodeSequentially", "(Lzc3/b;)Ll83/q;", "decodeStructure", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Ll83/q;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Ll83/q;", "Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TripleSerializer<A, B, C> implements InterfaceC37138c {
    private final InterfaceC37138c aSerializer;
    private final InterfaceC37138c bSerializer;
    private final InterfaceC37138c cSerializer;
    private final InterfaceC39443g descriptor;

    public TripleSerializer(InterfaceC37138c aSerializer, InterfaceC37138c bSerializer, InterfaceC37138c cSerializer) {
        AbstractC22676k.m65750j(aSerializer, "aSerializer");
        AbstractC22676k.m65750j(bSerializer, "bSerializer");
        AbstractC22676k.m65750j(cSerializer, "cSerializer");
        this.aSerializer = aSerializer;
        this.bSerializer = bSerializer;
        this.cSerializer = cSerializer;
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        if (AbstractC39414r.m125890i0("kotlin.Triple")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C39437a c39437a = new C39437a("kotlin.Triple");
        descriptor$lambda$0(this, c39437a);
        this.descriptor = new C39444h("kotlin.Triple", C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
    }

    private final C23471q decodeSequentially(InterfaceC40539b composite) {
        Object objDecodeSerializableElement = composite.decodeSerializableElement(getDescriptor(), 0, this.aSerializer, null);
        Object objDecodeSerializableElement2 = composite.decodeSerializableElement(getDescriptor(), 1, this.bSerializer, null);
        Object objDecodeSerializableElement3 = composite.decodeSerializableElement(getDescriptor(), 2, this.cSerializer, null);
        composite.endStructure(getDescriptor());
        return new C23471q(objDecodeSerializableElement, objDecodeSerializableElement2, objDecodeSerializableElement3);
    }

    private final C23471q decodeStructure(InterfaceC40539b composite) {
        Object objDecodeSerializableElement = TuplesKt.NULL;
        Object objDecodeSerializableElement2 = TuplesKt.NULL;
        Object objDecodeSerializableElement3 = TuplesKt.NULL;
        while (true) {
            int iDecodeElementIndex = composite.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex == -1) {
                composite.endStructure(getDescriptor());
                if (objDecodeSerializableElement == TuplesKt.NULL) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objDecodeSerializableElement2 == TuplesKt.NULL) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objDecodeSerializableElement3 != TuplesKt.NULL) {
                    return new C23471q(objDecodeSerializableElement, objDecodeSerializableElement2, objDecodeSerializableElement3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iDecodeElementIndex == 0) {
                objDecodeSerializableElement = composite.decodeSerializableElement(getDescriptor(), 0, this.aSerializer, null);
            } else if (iDecodeElementIndex == 1) {
                objDecodeSerializableElement2 = composite.decodeSerializableElement(getDescriptor(), 1, this.bSerializer, null);
            } else {
                if (iDecodeElementIndex != 2) {
                    throw new SerializationException(AbstractC2875y.m8295h(iDecodeElementIndex, "Unexpected index "));
                }
                objDecodeSerializableElement3 = composite.decodeSerializableElement(getDescriptor(), 2, this.cSerializer, null);
            }
        }
    }

    private static final C23454a0 descriptor$lambda$0(TripleSerializer tripleSerializer, C39437a buildClassSerialDescriptor) {
        AbstractC22676k.m65750j(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.m125993a("first", tripleSerializer.aSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("second", tripleSerializer.bSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("third", tripleSerializer.cSerializer.getDescriptor(), false);
        return C23454a0.f92919a;
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }

    @Override // wc3.InterfaceC37137b
    public C23471q deserialize(InterfaceC40541d decoder) {
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(getDescriptor());
        return interfaceC40539bBeginStructure.decodeSequentially() ? decodeSequentially(interfaceC40539bBeginStructure) : decodeStructure(interfaceC40539bBeginStructure);
    }

    @Override // wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, C23471q value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(getDescriptor());
        interfaceC40540cBeginStructure.encodeSerializableElement(getDescriptor(), 0, this.aSerializer, value.f92947w);
        interfaceC40540cBeginStructure.encodeSerializableElement(getDescriptor(), 1, this.bSerializer, value.f92948x);
        interfaceC40540cBeginStructure.encodeSerializableElement(getDescriptor(), 2, this.cSerializer, value.f92949y);
        interfaceC40540cBeginStructure.endStructure(getDescriptor());
    }
}
