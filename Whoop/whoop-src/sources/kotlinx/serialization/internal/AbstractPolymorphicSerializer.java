package kotlinx.serialization.internal;

import cd3.AbstractC4454f;
import cd3.C4452d;
import j93.InterfaceC21461d;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import va3.AbstractC35854l;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0017\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "", "T", "Lwc3/c;", "<init>", "()V", "Lzc3/b;", "compositeDecoder", "decodeSequentially", "(Lzc3/b;)Ljava/lang/Object;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Ljava/lang/Object;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Ljava/lang/Object;", "", "klassName", "Lwc3/b;", "findPolymorphicSerializerOrNull", "(Lzc3/b;Ljava/lang/String;)Lwc3/b;", "Lwc3/j;", "(Lzc3/e;Ljava/lang/Object;)Lwc3/j;", "Lj93/d;", "getBaseClass", "()Lj93/d;", "baseClass", "kotlinx-serialization-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class AbstractPolymorphicSerializer<T> implements InterfaceC37138c {
    /* JADX INFO: Access modifiers changed from: private */
    public final T decodeSequentially(InterfaceC40539b compositeDecoder) {
        return (T) compositeDecoder.decodeSerializableElement(getDescriptor(), 1, AbstractC35854l.m113831k(this, compositeDecoder, compositeDecoder.decodeStringElement(getDescriptor(), 0)), null);
    }

    @Override // wc3.InterfaceC37137b
    public final T deserialize(InterfaceC40541d decoder) {
        T t14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g descriptor = getDescriptor();
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(descriptor);
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            t14 = (T) decodeSequentially(interfaceC40539bBeginStructure);
        } else {
            Object objDecodeSerializableElement = null;
            String strDecodeStringElement = null;
            while (true) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    if (objDecodeSerializableElement == null) {
                        throw new IllegalArgumentException(AbstractC11266d.m30461o("Polymorphic value has not been read for class ", strDecodeStringElement).toString());
                    }
                    t14 = (T) objDecodeSerializableElement;
                    break;
                }
                if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(getDescriptor(), iDecodeElementIndex);
                } else {
                    if (iDecodeElementIndex != 1) {
                        StringBuilder sb4 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                        if (strDecodeStringElement == null) {
                            strDecodeStringElement = "unknown class";
                        }
                        sb4.append(strDecodeStringElement);
                        sb4.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb4.append(iDecodeElementIndex);
                        throw new SerializationException(sb4.toString());
                    }
                    if (strDecodeStringElement == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    objDecodeSerializableElement = interfaceC40539bBeginStructure.decodeSerializableElement(getDescriptor(), iDecodeElementIndex, AbstractC35854l.m113831k(this, interfaceC40539bBeginStructure, strDecodeStringElement), null);
                }
            }
        }
        interfaceC40539bBeginStructure.endStructure(descriptor);
        return t14;
    }

    public InterfaceC37137b findPolymorphicSerializerOrNull(InterfaceC40539b decoder, String klassName) {
        AbstractC22676k.m65750j(decoder, "decoder");
        AbstractC4454f serializersModule = decoder.getSerializersModule();
        InterfaceC21461d baseClass = getBaseClass();
        C4452d c4452d = (C4452d) serializersModule;
        c4452d.getClass();
        AbstractC22676k.m65750j(baseClass, "baseClass");
        Map map = (Map) c4452d.f17956d.get(baseClass);
        InterfaceC37138c interfaceC37138c = map != null ? (InterfaceC37138c) map.get(klassName) : null;
        if (!(interfaceC37138c instanceof InterfaceC37138c)) {
            interfaceC37138c = null;
        }
        if (interfaceC37138c != null) {
            return interfaceC37138c;
        }
        Object obj = c4452d.f17957e.get(baseClass);
        Function1 function1 = AbstractC22681m0.m65775f(1, obj) ? (Function1) obj : null;
        if (function1 != null) {
            return (InterfaceC37137b) function1.invoke(klassName);
        }
        return null;
    }

    public abstract InterfaceC21461d getBaseClass();

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public abstract /* synthetic */ InterfaceC39443g getDescriptor();

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, T value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC37145j interfaceC37145jM113832l = AbstractC35854l.m113832l(this, encoder, value);
        InterfaceC39443g descriptor = getDescriptor();
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(descriptor);
        interfaceC40540cBeginStructure.encodeStringElement(getDescriptor(), 0, interfaceC37145jM113832l.getDescriptor().getSerialName());
        interfaceC40540cBeginStructure.encodeSerializableElement(getDescriptor(), 1, interfaceC37145jM113832l, value);
        interfaceC40540cBeginStructure.endStructure(descriptor);
    }

    public InterfaceC37145j findPolymorphicSerializerOrNull(InterfaceC40542e encoder, T value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        return encoder.getSerializersModule().mo13925c(getBaseClass(), value);
    }
}
