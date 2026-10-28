package com.whoop.design.models.items;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.whoopaction.domain.models.Action;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/EntryPointModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/EntryPointModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/EntryPointModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/EntryPointModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class EntryPointModel$$serializer implements GeneratedSerializer<EntryPointModel> {
    public static final int $stable;
    public static final EntryPointModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        EntryPointModel$$serializer entryPointModel$$serializer = new EntryPointModel$$serializer();
        INSTANCE = entryPointModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.EntryPointModel", entryPointModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("endIcon", false);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        pluginGeneratedSerialDescriptor.addElement("backgroundStyle", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("callToAction", false);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        pluginGeneratedSerialDescriptor.addElement("navigationTag", false);
        pluginGeneratedSerialDescriptor.addElement("dismissAction", false);
        pluginGeneratedSerialDescriptor.addElement("analyticEvents", false);
        pluginGeneratedSerialDescriptor.addElement("genericInteraction", true);
        pluginGeneratedSerialDescriptor.addElement("dismissId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EntryPointModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = EntryPointModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, AbstractC38195a.m122336d(c25452a), AbstractC38195a.m122336d(stringSerializer), c25452a, stringSerializer, AbstractC38195a.m122336d(stringSerializer), EntryPointModelCta$$serializer.INSTANCE, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), AbstractC38195a.m122336d(TagModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[9].getValue()), AbstractC38195a.m122336d(EntryPointAnalyticEventsModel$$serializer.INSTANCE), AbstractC38195a.m122336d(GenericInteraction$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final EntryPointModel deserialize(InterfaceC40541d decoder) {
        C9598e c9598e;
        int i13;
        String str;
        TextResource textResource;
        Action action;
        TagModel tagModel;
        EntryPointModelCta entryPointModelCta;
        GenericInteraction genericInteraction;
        String str2;
        String str3;
        EntryPointAnalyticEventsModel entryPointAnalyticEventsModel;
        TextResource textResource2;
        String str4;
        String str5;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = EntryPointModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, c25452a, null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            TextResource textResource4 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, c25452a, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            EntryPointModelCta entryPointModelCta2 = (EntryPointModelCta) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, EntryPointModelCta$$serializer.INSTANCE, null);
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            TagModel tagModel2 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, TagModel$$serializer.INSTANCE, null);
            Action action2 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            EntryPointAnalyticEventsModel entryPointAnalyticEventsModel2 = (EntryPointAnalyticEventsModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, EntryPointAnalyticEventsModel$$serializer.INSTANCE, null);
            i13 = 8191;
            genericInteraction = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, GenericInteraction$$serializer.INSTANCE, null);
            str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, stringSerializer, null);
            str = str6;
            textResource2 = textResource4;
            entryPointModelCta = entryPointModelCta2;
            str2 = str8;
            str5 = strDecodeStringElement;
            tagModel = tagModel2;
            str4 = str7;
            entryPointAnalyticEventsModel = entryPointAnalyticEventsModel2;
            textResource = textResource3;
            action = action2;
        } else {
            String str9 = null;
            TextResource textResource5 = null;
            Action action3 = null;
            TagModel tagModel3 = null;
            EntryPointModelCta entryPointModelCta3 = null;
            GenericInteraction genericInteraction2 = null;
            c9598e = null;
            String str10 = null;
            String strDecodeStringElement2 = null;
            int i14 = 9;
            int i15 = 7;
            boolean z4 = true;
            i13 = 0;
            String str11 = null;
            String str12 = null;
            EntryPointAnalyticEventsModel entryPointAnalyticEventsModel3 = null;
            TextResource textResource6 = null;
            while (z4) {
                interfaceC23462hArr = interfaceC23462hArr;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        str11 = str11;
                        i15 = 7;
                        i14 = 9;
                        break;
                    case 0:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str9);
                        i13 |= 1;
                        str11 = str11;
                        i15 = 7;
                        i14 = 9;
                        break;
                    case 1:
                        textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource5);
                        i13 |= 2;
                        str9 = str9;
                        i15 = 7;
                        i14 = 9;
                        break;
                    case 2:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str11);
                        i13 |= 4;
                        str9 = str9;
                        i15 = 7;
                        i14 = 9;
                        break;
                    case 3:
                        textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, C25452a.f99689a, textResource6);
                        i13 |= 8;
                        str9 = str9;
                        i15 = 7;
                        i14 = 9;
                        break;
                    case 4:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i13 |= 16;
                        str9 = str9;
                        i15 = 7;
                        i14 = 9;
                        break;
                    case 5:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str10);
                        i13 |= 32;
                        str9 = str9;
                        i15 = 7;
                        i14 = 9;
                        break;
                    case 6:
                        entryPointModelCta3 = (EntryPointModelCta) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, EntryPointModelCta$$serializer.INSTANCE, entryPointModelCta3);
                        i13 |= 64;
                        str9 = str9;
                        i15 = 7;
                        i14 = 9;
                        break;
                    case 7:
                        c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), c9598e);
                        i13 |= 128;
                        interfaceC23462hArr = interfaceC23462hArr;
                        str9 = str9;
                        i14 = 9;
                        break;
                    case 8:
                        tagModel3 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, TagModel$$serializer.INSTANCE, tagModel3);
                        i13 |= 256;
                        interfaceC23462hArr = interfaceC23462hArr;
                        str9 = str9;
                        i14 = 9;
                        break;
                    case 9:
                        action3 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), action3);
                        i13 |= 512;
                        interfaceC23462hArr = interfaceC23462hArr;
                        str9 = str9;
                        break;
                    case 10:
                        entryPointAnalyticEventsModel3 = (EntryPointAnalyticEventsModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, EntryPointAnalyticEventsModel$$serializer.INSTANCE, entryPointAnalyticEventsModel3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        interfaceC23462hArr = interfaceC23462hArr;
                        str9 = str9;
                        break;
                    case 11:
                        genericInteraction2 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, GenericInteraction$$serializer.INSTANCE, genericInteraction2);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        interfaceC23462hArr = interfaceC23462hArr;
                        str9 = str9;
                        break;
                    case 12:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, StringSerializer.INSTANCE, str12);
                        i13 |= 4096;
                        interfaceC23462hArr = interfaceC23462hArr;
                        str9 = str9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str9;
            textResource = textResource5;
            action = action3;
            tagModel = tagModel3;
            entryPointModelCta = entryPointModelCta3;
            genericInteraction = genericInteraction2;
            str2 = str10;
            str3 = str12;
            entryPointAnalyticEventsModel = entryPointAnalyticEventsModel3;
            textResource2 = textResource6;
            str4 = str11;
            str5 = strDecodeStringElement2;
        }
        int i16 = i13;
        C9598e c9598e2 = c9598e;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new EntryPointModel(i16, str, textResource, str4, textResource2, str5, str2, entryPointModelCta, c9598e2, tagModel, action, entryPointAnalyticEventsModel, genericInteraction, str3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, EntryPointModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        EntryPointModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
