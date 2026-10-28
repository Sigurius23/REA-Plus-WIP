package com.whoop.design.models.items;

import com.whoop.design.util.TextResource;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import md1.C25452a;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/ActivityTileSelectionModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/ActivityTileSelectionModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/ActivityTileSelectionModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/ActivityTileSelectionModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ActivityTileSelectionModel$$serializer implements GeneratedSerializer<ActivityTileSelectionModel> {
    public static final int $stable;
    public static final ActivityTileSelectionModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ActivityTileSelectionModel$$serializer activityTileSelectionModel$$serializer = new ActivityTileSelectionModel$$serializer();
        INSTANCE = activityTileSelectionModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.ActivityTileSelectionModel", activityTileSelectionModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("scoreDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("startTimeText", true);
        pluginGeneratedSerialDescriptor.addElement("endTimeText", true);
        pluginGeneratedSerialDescriptor.addElement("iconUrl", true);
        pluginGeneratedSerialDescriptor.addElement("activityV2Id", true);
        pluginGeneratedSerialDescriptor.addElement("isGpsEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("during", true);
        pluginGeneratedSerialDescriptor.addElement("internalName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActivityTileSelectionModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(During$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{c25452a, c25452a, c25452a, c25452a, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, interfaceC37138cM122336d, interfaceC37138cM122336d2};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ActivityTileSelectionModel deserialize(InterfaceC40541d decoder) {
        boolean z4;
        String str;
        During during;
        TextResource textResource;
        int i13;
        TextResource textResource2;
        TextResource textResource3;
        TextResource textResource4;
        String str2;
        String str3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 7;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            TextResource textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            TextResource textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, c25452a, null);
            TextResource textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, c25452a, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
            textResource = textResource8;
            during = (During) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, During$$serializer.INSTANCE, null);
            z4 = zDecodeBooleanElement;
            str3 = strDecodeStringElement2;
            str2 = strDecodeStringElement;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, null);
            i13 = 511;
            textResource4 = textResource7;
            textResource3 = textResource6;
            textResource2 = textResource5;
        } else {
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            String str4 = null;
            During during2 = null;
            TextResource textResource9 = null;
            TextResource textResource10 = null;
            TextResource textResource11 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i15 = 0;
            TextResource textResource12 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i14 = 7;
                        break;
                    case 0:
                        textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource9);
                        i15 |= 1;
                        i14 = 7;
                        break;
                    case 1:
                        textResource10 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource10);
                        i15 |= 2;
                        i14 = 7;
                        break;
                    case 2:
                        textResource11 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C25452a.f99689a, textResource11);
                        i15 |= 4;
                        i14 = 7;
                        break;
                    case 3:
                        textResource12 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, C25452a.f99689a, textResource12);
                        i15 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
                        i15 |= 64;
                        break;
                    case 7:
                        during2 = (During) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, During$$serializer.INSTANCE, during2);
                        i15 |= 128;
                        break;
                    case 8:
                        str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str4);
                        i15 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            str = str4;
            during = during2;
            textResource = textResource12;
            i13 = i15;
            textResource2 = textResource9;
            textResource3 = textResource10;
            textResource4 = textResource11;
            str2 = strDecodeStringElement3;
            str3 = strDecodeStringElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ActivityTileSelectionModel(i13, textResource2, textResource3, textResource4, textResource, str2, str3, z4, during, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ActivityTileSelectionModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ActivityTileSelectionModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
