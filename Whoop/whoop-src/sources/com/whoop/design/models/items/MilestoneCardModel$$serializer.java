package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/MilestoneCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/MilestoneCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/MilestoneCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/MilestoneCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MilestoneCardModel$$serializer implements GeneratedSerializer<MilestoneCardModel> {
    public static final int $stable;
    public static final MilestoneCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MilestoneCardModel$$serializer milestoneCardModel$$serializer = new MilestoneCardModel$$serializer();
        INSTANCE = milestoneCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.MilestoneCardModel", milestoneCardModel$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("cta", false);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_NAVIGATION, false);
        pluginGeneratedSerialDescriptor.addElement("filledCount", false);
        pluginGeneratedSerialDescriptor.addElement("totalCount", false);
        pluginGeneratedSerialDescriptor.addElement("isUnlocked", false);
        pluginGeneratedSerialDescriptor.addElement("color", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("dialogInfo", false);
        pluginGeneratedSerialDescriptor.addElement("navigationTag", false);
        pluginGeneratedSerialDescriptor.addElement("progressStyle", false);
        pluginGeneratedSerialDescriptor.addElement("analytics", false);
        pluginGeneratedSerialDescriptor.addElement("interaction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MilestoneCardModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = MilestoneCardModel.$childSerializers;
        C25452a c25452a = C25452a.f99689a;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(c25452a);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue());
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new InterfaceC37138c[]{c25452a, c25452a, interfaceC37138cM122336d, stringSerializer, interfaceC37138cM122336d2, interfaceC37138cM122336d3, AbstractC38195a.m122336d(intSerializer), AbstractC38195a.m122336d(intSerializer), BooleanSerializer.INSTANCE, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(DialogInfo$$serializer.INSTANCE), AbstractC38195a.m122336d(TagModel$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(MilestoneAnalytics$$serializer.INSTANCE), AbstractC38195a.m122336d(GenericInteraction$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MilestoneCardModel deserialize(InterfaceC40541d decoder) {
        int i13;
        TextResource textResource;
        C9598e c9598e;
        String str;
        TextResource textResource2;
        String str2;
        String str3;
        DialogInfo dialogInfo;
        String str4;
        Integer num;
        TagModel tagModel;
        Integer num2;
        TextResource textResource3;
        String str5;
        GenericInteraction genericInteraction;
        MilestoneAnalytics milestoneAnalytics;
        boolean z4;
        TextResource textResource4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = MilestoneCardModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            TextResource textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            TextResource textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, c25452a, null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, intSerializer, null);
            Integer num4 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, intSerializer, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 8);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            DialogInfo dialogInfo2 = (DialogInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, DialogInfo$$serializer.INSTANCE, null);
            TagModel tagModel2 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, TagModel$$serializer.INSTANCE, null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, stringSerializer, null);
            MilestoneAnalytics milestoneAnalytics2 = (MilestoneAnalytics) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, MilestoneAnalytics$$serializer.INSTANCE, null);
            i13 = 65535;
            genericInteraction = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, GenericInteraction$$serializer.INSTANCE, null);
            textResource2 = textResource7;
            str2 = str6;
            num2 = num4;
            textResource3 = textResource6;
            textResource = textResource5;
            str3 = str9;
            str = str7;
            z4 = zDecodeBooleanElement;
            num = num3;
            str5 = strDecodeStringElement;
            str4 = str8;
            milestoneAnalytics = milestoneAnalytics2;
            tagModel = tagModel2;
            dialogInfo = dialogInfo2;
            c9598e = c9598e2;
        } else {
            int i14 = 5;
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            MilestoneAnalytics milestoneAnalytics3 = null;
            GenericInteraction genericInteraction2 = null;
            C9598e c9598e3 = null;
            String str10 = null;
            TextResource textResource8 = null;
            TextResource textResource9 = null;
            String str11 = null;
            DialogInfo dialogInfo3 = null;
            String str12 = null;
            Integer num5 = null;
            TagModel tagModel3 = null;
            Integer num6 = null;
            String strDecodeStringElement2 = null;
            TextResource textResource10 = null;
            i13 = 0;
            String str13 = null;
            while (z13) {
                TextResource textResource11 = textResource9;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        textResource4 = textResource11;
                        z13 = false;
                        textResource9 = textResource4;
                        genericInteraction2 = genericInteraction2;
                        milestoneAnalytics3 = milestoneAnalytics3;
                        i14 = 5;
                        break;
                    case 0:
                        textResource4 = textResource11;
                        textResource10 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource10);
                        i13 |= 1;
                        str13 = str13;
                        textResource9 = textResource4;
                        genericInteraction2 = genericInteraction2;
                        milestoneAnalytics3 = milestoneAnalytics3;
                        i14 = 5;
                        break;
                    case 1:
                        i13 |= 2;
                        str13 = str13;
                        genericInteraction2 = genericInteraction2;
                        i14 = 5;
                        textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource11);
                        milestoneAnalytics3 = milestoneAnalytics3;
                        break;
                    case 2:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str13);
                        i13 |= 4;
                        milestoneAnalytics3 = milestoneAnalytics3;
                        textResource9 = textResource11;
                        i14 = 5;
                        break;
                    case 3:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i13 |= 8;
                        textResource9 = textResource11;
                        str13 = str13;
                        i14 = 5;
                        break;
                    case 4:
                        textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, C25452a.f99689a, textResource8);
                        i13 |= 16;
                        textResource9 = textResource11;
                        str13 = str13;
                        i14 = 5;
                        break;
                    case 5:
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), c9598e3);
                        i13 |= 32;
                        textResource9 = textResource11;
                        str13 = str13;
                        break;
                    case 6:
                        num5 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, IntSerializer.INSTANCE, num5);
                        i13 |= 64;
                        textResource9 = textResource11;
                        str13 = str13;
                        break;
                    case 7:
                        num6 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, IntSerializer.INSTANCE, num6);
                        i13 |= 128;
                        textResource9 = textResource11;
                        str13 = str13;
                        break;
                    case 8:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 8);
                        i13 |= 256;
                        textResource9 = textResource11;
                        str13 = str13;
                        break;
                    case 9:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str10);
                        i13 |= 512;
                        textResource9 = textResource11;
                        str13 = str13;
                        break;
                    case 10:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str12);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        textResource9 = textResource11;
                        str13 = str13;
                        break;
                    case 11:
                        dialogInfo3 = (DialogInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, DialogInfo$$serializer.INSTANCE, dialogInfo3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        textResource9 = textResource11;
                        str13 = str13;
                        break;
                    case 12:
                        tagModel3 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, TagModel$$serializer.INSTANCE, tagModel3);
                        i13 |= 4096;
                        textResource9 = textResource11;
                        str13 = str13;
                        break;
                    case 13:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, str11);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        textResource9 = textResource11;
                        str13 = str13;
                        break;
                    case 14:
                        milestoneAnalytics3 = (MilestoneAnalytics) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, MilestoneAnalytics$$serializer.INSTANCE, milestoneAnalytics3);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        textResource9 = textResource11;
                        str13 = str13;
                        break;
                    case 15:
                        genericInteraction2 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, GenericInteraction$$serializer.INSTANCE, genericInteraction2);
                        i13 |= 32768;
                        textResource9 = textResource11;
                        str13 = str13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            textResource = textResource10;
            c9598e = c9598e3;
            str = str10;
            textResource2 = textResource8;
            str2 = str13;
            str3 = str11;
            dialogInfo = dialogInfo3;
            str4 = str12;
            num = num5;
            tagModel = tagModel3;
            num2 = num6;
            textResource3 = textResource9;
            str5 = strDecodeStringElement2;
            genericInteraction = genericInteraction2;
            milestoneAnalytics = milestoneAnalytics3;
            z4 = zDecodeBooleanElement2;
        }
        int i15 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MilestoneCardModel(i15, textResource, textResource3, str2, str5, textResource2, c9598e, num, num2, z4, str, str4, dialogInfo, tagModel, str3, milestoneAnalytics, genericInteraction, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MilestoneCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MilestoneCardModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
