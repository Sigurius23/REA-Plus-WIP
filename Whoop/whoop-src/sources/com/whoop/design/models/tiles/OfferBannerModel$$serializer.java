package com.whoop.design.models.tiles;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/tiles/OfferBannerModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/tiles/OfferBannerModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/tiles/OfferBannerModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/tiles/OfferBannerModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class OfferBannerModel$$serializer implements GeneratedSerializer<OfferBannerModel> {
    public static final int $stable;
    public static final OfferBannerModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        OfferBannerModel$$serializer offerBannerModel$$serializer = new OfferBannerModel$$serializer();
        INSTANCE = offerBannerModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.tiles.OfferBannerModel", offerBannerModel$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("markdownTitle", true);
        pluginGeneratedSerialDescriptor.addElement("borderStyle", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("leadingIcon", true);
        pluginGeneratedSerialDescriptor.addElement("showChevron", false);
        pluginGeneratedSerialDescriptor.addElement("showHighlight", true);
        pluginGeneratedSerialDescriptor.addElement("timerMetadata", true);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_NAVIGATION, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OfferBannerModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = OfferBannerModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        C25452a c25452a = C25452a.f99689a;
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(c25452a);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(c25452a);
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, interfaceC37138cM122336d5, interfaceC37138cM122336d6, booleanSerializer, AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[8].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[9].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final OfferBannerModel deserialize(InterfaceC40541d decoder) {
        boolean z4;
        C9598e c9598e;
        List list;
        Boolean bool;
        TextResource textResource;
        String str;
        String str2;
        String str3;
        TextResource textResource2;
        int i13;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = OfferBannerModel.$childSerializers;
        int i14 = 9;
        int i15 = 8;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, c25452a, null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            TextResource textResource4 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, c25452a, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, BooleanSerializer.INSTANCE, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            str = str8;
            bool = bool2;
            z4 = zDecodeBooleanElement;
            list = list2;
            str2 = str7;
            textResource = textResource4;
            str3 = str6;
            i13 = 1023;
            textResource2 = textResource3;
            str4 = str5;
        } else {
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            C9598e c9598e2 = null;
            List list3 = null;
            Boolean bool3 = null;
            TextResource textResource5 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            int i16 = 0;
            TextResource textResource6 = null;
            while (z13) {
                int i17 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i15 = 8;
                        break;
                    case 0:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str12);
                        i16 |= 1;
                        i14 = 9;
                        i15 = 8;
                        break;
                    case 1:
                        textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource6);
                        i16 |= 2;
                        i14 = 9;
                        i15 = 8;
                        break;
                    case 2:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str11);
                        i16 |= 4;
                        i14 = 9;
                        i15 = 8;
                        break;
                    case 3:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str10);
                        i16 |= 8;
                        i14 = 9;
                        i15 = 8;
                        break;
                    case 4:
                        textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, C25452a.f99689a, textResource5);
                        i16 |= 16;
                        i14 = 9;
                        i15 = 8;
                        break;
                    case 5:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str9);
                        i16 |= 32;
                        i14 = 9;
                        i15 = 8;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
                        i16 |= 64;
                        i14 = 9;
                        i15 = 8;
                        break;
                    case 7:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, BooleanSerializer.INSTANCE, bool3);
                        i16 |= 128;
                        i14 = 9;
                        i15 = 8;
                        break;
                    case 8:
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list3);
                        i16 |= 256;
                        i15 = i17;
                        i14 = 9;
                        break;
                    case 9:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), c9598e2);
                        i16 |= 512;
                        i15 = i17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            c9598e = c9598e2;
            list = list3;
            bool = bool3;
            textResource = textResource5;
            str = str9;
            str2 = str10;
            str3 = str11;
            textResource2 = textResource6;
            i13 = i16;
            str4 = str12;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new OfferBannerModel(i13, str4, textResource2, str3, str2, textResource, str, z4, bool, list, c9598e, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, OfferBannerModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        OfferBannerModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
