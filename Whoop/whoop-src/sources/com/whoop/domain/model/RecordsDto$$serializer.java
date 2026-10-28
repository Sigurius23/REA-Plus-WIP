package com.whoop.domain.model;

import com.mapbox.maps.MapboxMap;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013¢\u0006\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"com/whoop/domain/model/RecordsDto.$serializer", "F", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/domain/model/RecordsDto;", "<init>", "()V", "Lwc3/c;", "typeSerial0", "(Lwc3/c;)V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/domain/model/RecordsDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/domain/model/RecordsDto;", "", "childSerializers", "()[Lwc3/c;", "typeParametersSerializers", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class RecordsDto$$serializer<F> implements GeneratedSerializer<RecordsDto<F>> {
    private final InterfaceC39443g descriptor;
    private final /* synthetic */ InterfaceC37138c typeSerial0;

    private RecordsDto$$serializer() {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.domain.model.RecordsDto", this, 3);
        pluginGeneratedSerialDescriptor.addElement(MapboxMap.QFE_OFFSET, false);
        pluginGeneratedSerialDescriptor.addElement("totalCount", false);
        pluginGeneratedSerialDescriptor.addElement("records", false);
        this.descriptor = pluginGeneratedSerialDescriptor;
    }

    private final /* synthetic */ InterfaceC37138c getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(this.typeSerial0);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new InterfaceC37138c[]{intSerializer, intSerializer, arrayListSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final RecordsDto<F> deserialize(InterfaceC40541d decoder) {
        int iDecodeIntElement;
        int i13;
        int i14;
        List list;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = this.descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, new ArrayListSerializer(this.typeSerial0), null);
            i13 = iDecodeIntElement2;
            i14 = 7;
        } else {
            boolean z4 = true;
            iDecodeIntElement = 0;
            int i15 = 0;
            List list2 = null;
            int iDecodeIntElement3 = 0;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
                    i15 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
                    i15 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, new ArrayListSerializer(this.typeSerial0), list2);
                    i15 |= 4;
                }
            }
            i13 = iDecodeIntElement3;
            i14 = i15;
            list = list2;
        }
        int i16 = iDecodeIntElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new RecordsDto<>(i14, i16, i13, list, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, RecordsDto<F> value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = this.descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        RecordsDto.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g, this.typeSerial0);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] typeParametersSerializers() {
        return new InterfaceC37138c[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecordsDto$$serializer(InterfaceC37138c typeSerial0) {
        this();
        AbstractC22676k.m65750j(typeSerial0, "typeSerial0");
        this.typeSerial0 = typeSerial0;
    }
}
