package androidx.savedstate.serialization.serializers;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013¢\u0006\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"androidx/savedstate/serialization/serializers/SparseArraySerializer.SparseArraySurrogate.$serializer", "T", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "<init>", "()V", "Lwc3/c;", "typeSerial0", "(Lwc3/c;)V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "", "childSerializers", "()[Lwc3/c;", "typeParametersSerializers", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "savedstate_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
@InterfaceC23457c
public /* synthetic */ class SparseArraySerializer$SparseArraySurrogate$$serializer<T> implements GeneratedSerializer<SparseArraySerializer$SparseArraySurrogate<T>> {
    private final InterfaceC39443g descriptor;
    private final /* synthetic */ InterfaceC37138c typeSerial0;

    private SparseArraySerializer$SparseArraySurrogate$$serializer() {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
        pluginGeneratedSerialDescriptor.addElement("keys", false);
        pluginGeneratedSerialDescriptor.addElement("values", false);
        this.descriptor = pluginGeneratedSerialDescriptor;
    }

    private final /* synthetic */ InterfaceC37138c getTypeSerial0() {
        return this.typeSerial0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{SparseArraySerializer$SparseArraySurrogate.$childSerializers[0].getValue(), new ArrayListSerializer(this.typeSerial0)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SparseArraySerializer$SparseArraySurrogate<T> deserialize(InterfaceC40541d decoder) {
        List list;
        List list2;
        int i13;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = this.descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = SparseArraySerializer$SparseArraySurrogate.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, new ArrayListSerializer(this.typeSerial0), null);
            i13 = 3;
        } else {
            boolean z4 = true;
            int i14 = 0;
            List list3 = null;
            List list4 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), list3);
                    i14 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, new ArrayListSerializer(this.typeSerial0), list4);
                    i14 |= 2;
                }
            }
            list = list3;
            list2 = list4;
            i13 = i14;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SparseArraySerializer$SparseArraySurrogate<>(i13, list, list2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SparseArraySerializer$SparseArraySurrogate<T> value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = this.descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SparseArraySerializer$SparseArraySurrogate.write$Self$savedstate_release(value, interfaceC40540cBeginStructure, interfaceC39443g, this.typeSerial0);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] typeParametersSerializers() {
        return new InterfaceC37138c[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SparseArraySerializer$SparseArraySurrogate$$serializer(InterfaceC37138c typeSerial0) {
        this();
        AbstractC22676k.m65750j(typeSerial0, "typeSerial0");
        this.typeSerial0 = typeSerial0;
    }
}
