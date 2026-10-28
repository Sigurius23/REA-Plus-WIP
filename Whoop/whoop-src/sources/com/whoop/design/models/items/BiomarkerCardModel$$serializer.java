package com.whoop.design.models.items;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/BiomarkerCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/BiomarkerCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/BiomarkerCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/BiomarkerCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class BiomarkerCardModel$$serializer implements GeneratedSerializer<BiomarkerCardModel> {
    public static final int $stable;
    public static final BiomarkerCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        BiomarkerCardModel$$serializer biomarkerCardModel$$serializer = new BiomarkerCardModel$$serializer();
        INSTANCE = biomarkerCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.BiomarkerCardModel", biomarkerCardModel$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("valueText", false);
        pluginGeneratedSerialDescriptor.addElement("unit", false);
        pluginGeneratedSerialDescriptor.addElement("trend", false);
        pluginGeneratedSerialDescriptor.addElement("statusType", false);
        pluginGeneratedSerialDescriptor.addElement("disclaimer", false);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        pluginGeneratedSerialDescriptor.addElement("categoryIds", false);
        pluginGeneratedSerialDescriptor.addElement("rangeMeter", false);
        pluginGeneratedSerialDescriptor.addElement("lastRecording", false);
        pluginGeneratedSerialDescriptor.addElement("miniCallout", false);
        pluginGeneratedSerialDescriptor.addElement("graph", true);
        pluginGeneratedSerialDescriptor.addElement("useTileBackground", true);
        pluginGeneratedSerialDescriptor.addElement("interaction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BiomarkerCardModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = BiomarkerCardModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(ImpactModel$$serializer.INSTANCE), stringSerializer, AbstractC38195a.m122336d(BiomarkerCardDisclaimerModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[9].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), AbstractC38195a.m122336d(RangeMeterModel$$serializer.INSTANCE), AbstractC38195a.m122336d(IntSerializer.INSTANCE), AbstractC38195a.m122336d(MiniCalloutModel$$serializer.INSTANCE), AbstractC38195a.m122336d(GraphModel$$serializer.INSTANCE), BooleanSerializer.INSTANCE, AbstractC38195a.m122336d(GenericInteraction$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final BiomarkerCardModel deserialize(InterfaceC40541d decoder) {
        int i13;
        GraphModel graphModel;
        MiniCalloutModel miniCalloutModel;
        String str;
        String str2;
        RangeMeterModel rangeMeterModel;
        List list;
        C9598e c9598e;
        ImpactModel impactModel;
        String str3;
        Integer num;
        BiomarkerCardDisclaimerModel biomarkerCardDisclaimerModel;
        String str4;
        String str5;
        GenericInteraction genericInteraction;
        String str6;
        boolean z4;
        String str7;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = BiomarkerCardModel.$childSerializers;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            ImpactModel impactModel2 = (ImpactModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, ImpactModel$$serializer.INSTANCE, null);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            BiomarkerCardDisclaimerModel biomarkerCardDisclaimerModel2 = (BiomarkerCardDisclaimerModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, BiomarkerCardDisclaimerModel$$serializer.INSTANCE, null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            RangeMeterModel rangeMeterModel2 = (RangeMeterModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, RangeMeterModel$$serializer.INSTANCE, null);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, IntSerializer.INSTANCE, null);
            MiniCalloutModel miniCalloutModel2 = (MiniCalloutModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, MiniCalloutModel$$serializer.INSTANCE, null);
            GraphModel graphModel2 = (GraphModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, GraphModel$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 15);
            i13 = 131071;
            genericInteraction = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, GenericInteraction$$serializer.INSTANCE, null);
            rangeMeterModel = rangeMeterModel2;
            c9598e = c9598e2;
            str4 = strDecodeStringElement3;
            str3 = str10;
            str6 = strDecodeStringElement5;
            impactModel = impactModel2;
            biomarkerCardDisclaimerModel = biomarkerCardDisclaimerModel2;
            str5 = strDecodeStringElement4;
            str2 = str8;
            z4 = zDecodeBooleanElement;
            str = str9;
            graphModel = graphModel2;
            str7 = strDecodeStringElement2;
            miniCalloutModel = miniCalloutModel2;
            num = num2;
            list = list2;
        } else {
            int i14 = 10;
            int i15 = 9;
            boolean z13 = true;
            i13 = 0;
            boolean zDecodeBooleanElement2 = false;
            GenericInteraction genericInteraction2 = null;
            GraphModel graphModel3 = null;
            MiniCalloutModel miniCalloutModel3 = null;
            String str11 = null;
            String str12 = null;
            RangeMeterModel rangeMeterModel3 = null;
            List list3 = null;
            C9598e c9598e3 = null;
            ImpactModel impactModel3 = null;
            String str13 = null;
            Integer num3 = null;
            BiomarkerCardDisclaimerModel biomarkerCardDisclaimerModel3 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z13) {
                String str14 = strDecodeStringElement;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        str12 = str12;
                        genericInteraction2 = genericInteraction2;
                        strDecodeStringElement = str14;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 0:
                        i13 |= 1;
                        str12 = str12;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        genericInteraction2 = genericInteraction2;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 1:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i13 |= 2;
                        str12 = str12;
                        genericInteraction2 = genericInteraction2;
                        strDecodeStringElement = str14;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 2:
                        genericInteraction2 = genericInteraction2;
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str12);
                        i13 |= 4;
                        genericInteraction2 = genericInteraction2;
                        strDecodeStringElement = str14;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 3:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i13 |= 8;
                        strDecodeStringElement = str14;
                        str12 = str12;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 4:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str11);
                        i13 |= 16;
                        strDecodeStringElement = str14;
                        str12 = str12;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 5:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str13);
                        i13 |= 32;
                        strDecodeStringElement = str14;
                        str12 = str12;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 6:
                        impactModel3 = (ImpactModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, ImpactModel$$serializer.INSTANCE, impactModel3);
                        i13 |= 64;
                        strDecodeStringElement = str14;
                        str12 = str12;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 7:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i13 |= 128;
                        strDecodeStringElement = str14;
                        str12 = str12;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 8:
                        biomarkerCardDisclaimerModel3 = (BiomarkerCardDisclaimerModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, BiomarkerCardDisclaimerModel$$serializer.INSTANCE, biomarkerCardDisclaimerModel3);
                        i13 |= 256;
                        strDecodeStringElement = str14;
                        str12 = str12;
                        i15 = 9;
                        i14 = 10;
                        break;
                    case 9:
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), c9598e3);
                        i13 |= 512;
                        strDecodeStringElement = str14;
                        str12 = str12;
                        i14 = 10;
                        break;
                    case 10:
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), list3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        strDecodeStringElement = str14;
                        str12 = str12;
                        break;
                    case 11:
                        rangeMeterModel3 = (RangeMeterModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, RangeMeterModel$$serializer.INSTANCE, rangeMeterModel3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        strDecodeStringElement = str14;
                        str12 = str12;
                        break;
                    case 12:
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, IntSerializer.INSTANCE, num3);
                        i13 |= 4096;
                        strDecodeStringElement = str14;
                        str12 = str12;
                        break;
                    case 13:
                        miniCalloutModel3 = (MiniCalloutModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, MiniCalloutModel$$serializer.INSTANCE, miniCalloutModel3);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        strDecodeStringElement = str14;
                        str12 = str12;
                        break;
                    case 14:
                        graphModel3 = (GraphModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, GraphModel$$serializer.INSTANCE, graphModel3);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        strDecodeStringElement = str14;
                        str12 = str12;
                        break;
                    case 15:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 15);
                        i13 |= 32768;
                        strDecodeStringElement = str14;
                        str12 = str12;
                        break;
                    case 16:
                        genericInteraction2 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, GenericInteraction$$serializer.INSTANCE, genericInteraction2);
                        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        strDecodeStringElement = str14;
                        str12 = str12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            graphModel = graphModel3;
            miniCalloutModel = miniCalloutModel3;
            str = str11;
            str2 = str12;
            rangeMeterModel = rangeMeterModel3;
            list = list3;
            c9598e = c9598e3;
            impactModel = impactModel3;
            str3 = str13;
            num = num3;
            biomarkerCardDisclaimerModel = biomarkerCardDisclaimerModel3;
            str4 = strDecodeStringElement6;
            str5 = strDecodeStringElement7;
            genericInteraction = genericInteraction2;
            str6 = strDecodeStringElement8;
            z4 = zDecodeBooleanElement2;
            str7 = strDecodeStringElement;
        }
        int i16 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new BiomarkerCardModel(i16, str7, str4, str2, str5, str, str3, impactModel, str6, biomarkerCardDisclaimerModel, c9598e, list, rangeMeterModel, num, miniCalloutModel, graphModel, z4, genericInteraction, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, BiomarkerCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        BiomarkerCardModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
