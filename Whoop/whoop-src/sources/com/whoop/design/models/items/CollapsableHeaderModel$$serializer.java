package com.whoop.design.models.items;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/CollapsableHeaderModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/CollapsableHeaderModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/CollapsableHeaderModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/CollapsableHeaderModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CollapsableHeaderModel$$serializer implements GeneratedSerializer<CollapsableHeaderModel> {
    public static final int $stable;
    public static final CollapsableHeaderModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CollapsableHeaderModel$$serializer collapsableHeaderModel$$serializer = new CollapsableHeaderModel$$serializer();
        INSTANCE = collapsableHeaderModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.CollapsableHeaderModel", collapsableHeaderModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("subtitleStickOnScroll", true);
        pluginGeneratedSerialDescriptor.addElement("subtitleTypography", true);
        pluginGeneratedSerialDescriptor.addElement("backgroundUrl", true);
        pluginGeneratedSerialDescriptor.addElement("endNavigationButton", true);
        pluginGeneratedSerialDescriptor.addElement("startNavigationButton", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CollapsableHeaderModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        HeaderIconConfig$$serializer headerIconConfig$$serializer = HeaderIconConfig$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, interfaceC37138cM122336d, BooleanSerializer.INSTANCE, interfaceC37138cM122336d2, interfaceC37138cM122336d3, AbstractC38195a.m122336d(headerIconConfig$$serializer), headerIconConfig$$serializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CollapsableHeaderModel deserialize(InterfaceC40541d decoder) {
        boolean z4;
        HeaderIconConfig headerIconConfig;
        int i13;
        String str;
        String str2;
        String str3;
        String str4;
        HeaderIconConfig headerIconConfig2;
        boolean z13;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 6;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            HeaderIconConfig$$serializer headerIconConfig$$serializer = HeaderIconConfig$$serializer.INSTANCE;
            HeaderIconConfig headerIconConfig3 = (HeaderIconConfig) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, headerIconConfig$$serializer, null);
            str = strDecodeStringElement;
            headerIconConfig = (HeaderIconConfig) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, headerIconConfig$$serializer, null);
            headerIconConfig2 = headerIconConfig3;
            str3 = str6;
            str4 = str7;
            z4 = zDecodeBooleanElement;
            str2 = str5;
            i13 = 127;
        } else {
            boolean z14 = true;
            boolean zDecodeBooleanElement2 = false;
            String strDecodeStringElement2 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            HeaderIconConfig headerIconConfig4 = null;
            int i15 = 0;
            HeaderIconConfig headerIconConfig5 = null;
            while (z14) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        z13 = true;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 |= 1;
                        i14 = 6;
                        break;
                    case 1:
                        z13 = true;
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str8);
                        i15 |= 2;
                        i14 = 6;
                        break;
                    case 2:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str9);
                        i15 |= 8;
                        break;
                    case 4:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str10);
                        i15 |= 16;
                        break;
                    case 5:
                        headerIconConfig4 = (HeaderIconConfig) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, HeaderIconConfig$$serializer.INSTANCE, headerIconConfig4);
                        i15 |= 32;
                        break;
                    case 6:
                        headerIconConfig5 = (HeaderIconConfig) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, HeaderIconConfig$$serializer.INSTANCE, headerIconConfig5);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            headerIconConfig = headerIconConfig5;
            i13 = i15;
            str = strDecodeStringElement2;
            str2 = str8;
            str3 = str9;
            str4 = str10;
            headerIconConfig2 = headerIconConfig4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CollapsableHeaderModel(i13, str, str2, z4, str3, str4, headerIconConfig2, headerIconConfig, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CollapsableHeaderModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CollapsableHeaderModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
