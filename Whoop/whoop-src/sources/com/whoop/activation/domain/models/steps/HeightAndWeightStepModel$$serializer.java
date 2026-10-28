package com.whoop.activation.domain.models.steps;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import com.whoop.design.util.TextResource;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/activation/domain/models/steps/HeightAndWeightStepModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HeightAndWeightStepModel$$serializer implements GeneratedSerializer<HeightAndWeightStepModel> {
    public static final int $stable;
    public static final HeightAndWeightStepModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HeightAndWeightStepModel$$serializer heightAndWeightStepModel$$serializer = new HeightAndWeightStepModel$$serializer();
        INSTANCE = heightAndWeightStepModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.activation.domain.models.steps.HeightAndWeightStepModel", heightAndWeightStepModel$$serializer, 29);
        pluginGeneratedSerialDescriptor.addElement("imperialTitle", false);
        pluginGeneratedSerialDescriptor.addElement("metricTitle", false);
        pluginGeneratedSerialDescriptor.addElement("heightTitle", false);
        pluginGeneratedSerialDescriptor.addElement("weightTitle", false);
        pluginGeneratedSerialDescriptor.addElement("feetText", false);
        pluginGeneratedSerialDescriptor.addElement("inchesText", false);
        pluginGeneratedSerialDescriptor.addElement("poundsText", false);
        pluginGeneratedSerialDescriptor.addElement("centimetersText", false);
        pluginGeneratedSerialDescriptor.addElement("kilogramsText", false);
        pluginGeneratedSerialDescriptor.addElement("heightFeetMinValue", false);
        pluginGeneratedSerialDescriptor.addElement("heightFeetMaxValue", false);
        pluginGeneratedSerialDescriptor.addElement("weightPoundsMinValue", false);
        pluginGeneratedSerialDescriptor.addElement("weightPoundsMaxValue", false);
        pluginGeneratedSerialDescriptor.addElement("heightCentimetersMinValue", false);
        pluginGeneratedSerialDescriptor.addElement("heightCentimetersMaxValue", false);
        pluginGeneratedSerialDescriptor.addElement("heightCentimetersPreselectedValue", false);
        pluginGeneratedSerialDescriptor.addElement("weightKilogramsMinValue", false);
        pluginGeneratedSerialDescriptor.addElement("weightKilogramsMaxValue", false);
        pluginGeneratedSerialDescriptor.addElement("weightKilogramsPreselectedValue", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("heightFeetPreselectedValue", false);
        pluginGeneratedSerialDescriptor.addElement("weightPoundsPreselectedValue", false);
        pluginGeneratedSerialDescriptor.addElement("navigationBarText", false);
        pluginGeneratedSerialDescriptor.addElement("mobileScreenName", false);
        pluginGeneratedSerialDescriptor.addElement("analyticsName", false);
        pluginGeneratedSerialDescriptor.addElement("progressCircle", false);
        pluginGeneratedSerialDescriptor.addElement("footerButtons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HeightAndWeightStepModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = HeightAndWeightStepModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(ProgressButtonModel$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[28].getValue());
        C25452a c25452a = C25452a.f99689a;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new InterfaceC37138c[]{c25452a, c25452a, c25452a, c25452a, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, c25452a, stringSerializer, stringSerializer, intSerializer, intSerializer, interfaceC37138cM122336d, stringSerializer, stringSerializer, interfaceC37138cM122336d2, interfaceC37138cM122336d3};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HeightAndWeightStepModel deserialize(InterfaceC40541d decoder) {
        TextResource textResource;
        TextResource textResource2;
        int i13;
        TextResource textResource3;
        int i14;
        int i15;
        TextResource textResource4;
        TextResource textResource5;
        List list;
        ProgressButtonModel progressButtonModel;
        String str;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i27;
        String str7;
        String str8;
        String str9;
        String str10;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HeightAndWeightStepModel.$childSerializers;
        int i37 = 10;
        int i38 = 9;
        int i39 = 0;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            TextResource textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            TextResource textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, c25452a, null);
            TextResource textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, c25452a, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 9);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 10);
            int iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 11);
            int iDecodeIntElement4 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 12);
            int iDecodeIntElement5 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 13);
            int iDecodeIntElement6 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 14);
            int iDecodeIntElement7 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 15);
            int iDecodeIntElement8 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 16);
            int iDecodeIntElement9 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 17);
            int iDecodeIntElement10 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 18);
            TextResource textResource10 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 19, c25452a, null);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 20);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 21);
            int iDecodeIntElement11 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 22);
            int iDecodeIntElement12 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 23);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 24, StringSerializer.INSTANCE, null);
            String strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 25);
            String strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 26);
            textResource3 = textResource8;
            progressButtonModel = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 27, ProgressButtonModel$$serializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 28, (InterfaceC37137b) interfaceC23462hArr[28].getValue(), null);
            i14 = 536870911;
            str10 = strDecodeStringElement9;
            str8 = strDecodeStringElement7;
            i27 = iDecodeIntElement3;
            i28 = iDecodeIntElement2;
            i29 = iDecodeIntElement;
            str5 = strDecodeStringElement4;
            str4 = strDecodeStringElement3;
            str3 = strDecodeStringElement2;
            str6 = strDecodeStringElement5;
            str2 = strDecodeStringElement;
            str = str11;
            str9 = strDecodeStringElement8;
            textResource4 = textResource7;
            i26 = iDecodeIntElement12;
            i25 = iDecodeIntElement11;
            textResource = textResource10;
            str7 = strDecodeStringElement6;
            textResource5 = textResource6;
            i24 = iDecodeIntElement10;
            i19 = iDecodeIntElement9;
            i18 = iDecodeIntElement8;
            i17 = iDecodeIntElement7;
            i16 = iDecodeIntElement6;
            i15 = iDecodeIntElement5;
            i13 = iDecodeIntElement4;
            textResource2 = textResource9;
        } else {
            int i44 = 28;
            TextResource textResource11 = null;
            TextResource textResource12 = null;
            List list2 = null;
            ProgressButtonModel progressButtonModel2 = null;
            String str12 = null;
            TextResource textResource13 = null;
            TextResource textResource14 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            boolean z4 = true;
            int i45 = 0;
            int iDecodeIntElement13 = 0;
            int iDecodeIntElement14 = 0;
            int iDecodeIntElement15 = 0;
            int iDecodeIntElement16 = 0;
            int iDecodeIntElement17 = 0;
            int iDecodeIntElement18 = 0;
            int iDecodeIntElement19 = 0;
            int iDecodeIntElement20 = 0;
            int iDecodeIntElement21 = 0;
            int iDecodeIntElement22 = 0;
            TextResource textResource15 = null;
            int iDecodeIntElement23 = 0;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i38 = 9;
                        i44 = 28;
                        break;
                    case 0:
                        textResource13 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource13);
                        i39 |= 1;
                        i37 = 10;
                        i38 = 9;
                        i44 = 28;
                        break;
                    case 1:
                        i39 |= 2;
                        textResource14 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource14);
                        i37 = 10;
                        i38 = 9;
                        i44 = 28;
                        break;
                    case 2:
                        textResource15 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C25452a.f99689a, textResource15);
                        i39 |= 4;
                        i37 = 10;
                        i38 = 9;
                        i44 = 28;
                        break;
                    case 3:
                        textResource12 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, C25452a.f99689a, textResource12);
                        i39 |= 8;
                        i37 = 10;
                        i38 = 9;
                        i44 = 28;
                        break;
                    case 4:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i39 |= 16;
                        i37 = 10;
                        i44 = 28;
                        break;
                    case 5:
                        strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i39 |= 32;
                        i37 = 10;
                        i44 = 28;
                        break;
                    case 6:
                        strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i39 |= 64;
                        i37 = 10;
                        i44 = 28;
                        break;
                    case 7:
                        strDecodeStringElement13 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i39 |= 128;
                        i37 = 10;
                        i44 = 28;
                        break;
                    case 8:
                        strDecodeStringElement14 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i39 |= 256;
                        i44 = 28;
                        break;
                    case 9:
                        iDecodeIntElement22 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, i38);
                        i39 |= 512;
                        i44 = 28;
                        break;
                    case 10:
                        iDecodeIntElement21 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, i37);
                        i39 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i44 = 28;
                        break;
                    case 11:
                        iDecodeIntElement20 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 11);
                        i39 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i44 = 28;
                        break;
                    case 12:
                        i39 |= 4096;
                        iDecodeIntElement23 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 12);
                        i44 = 28;
                        break;
                    case 13:
                        int iDecodeIntElement24 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 13);
                        i39 |= DfuBaseService.ERROR_REMOTE_MASK;
                        i45 = iDecodeIntElement24;
                        i44 = 28;
                        break;
                    case 14:
                        iDecodeIntElement13 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 14);
                        i39 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        i44 = 28;
                        break;
                    case 15:
                        iDecodeIntElement14 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 15);
                        i34 = 32768;
                        i39 |= i34;
                        i44 = 28;
                        break;
                    case 16:
                        iDecodeIntElement15 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 16);
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i39 |= i34;
                        i44 = 28;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        iDecodeIntElement16 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 17);
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i39 |= i34;
                        i44 = 28;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        iDecodeIntElement17 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 18);
                        i34 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        i39 |= i34;
                        i44 = 28;
                        break;
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        textResource11 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 19, C25452a.f99689a, textResource11);
                        i35 = 524288;
                        i39 |= i35;
                        i44 = 28;
                        break;
                    case 20:
                        strDecodeStringElement15 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 20);
                        i36 = 1048576;
                        i39 |= i36;
                        i44 = 28;
                        break;
                    case 21:
                        strDecodeStringElement16 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 21);
                        i36 = 2097152;
                        i39 |= i36;
                        i44 = 28;
                        break;
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        iDecodeIntElement18 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 22);
                        i36 = 4194304;
                        i39 |= i36;
                        i44 = 28;
                        break;
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        iDecodeIntElement19 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 23);
                        i36 = 8388608;
                        i39 |= i36;
                        i44 = 28;
                        break;
                    case 24:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 24, StringSerializer.INSTANCE, str12);
                        i35 = 16777216;
                        i39 |= i35;
                        i44 = 28;
                        break;
                    case 25:
                        strDecodeStringElement17 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 25);
                        i39 |= AndroidSDKConstants.FLAG_MUTABLE;
                        i44 = 28;
                        break;
                    case 26:
                        strDecodeStringElement18 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 26);
                        i39 |= 67108864;
                        i44 = 28;
                        break;
                    case 27:
                        progressButtonModel2 = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 27, ProgressButtonModel$$serializer.INSTANCE, progressButtonModel2);
                        i35 = 134217728;
                        i39 |= i35;
                        i44 = 28;
                        break;
                    case 28:
                        list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i44, (InterfaceC37137b) interfaceC23462hArr[i44].getValue(), list2);
                        i39 |= 268435456;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            textResource = textResource11;
            textResource2 = textResource12;
            i13 = iDecodeIntElement23;
            textResource3 = textResource15;
            i14 = i39;
            i15 = i45;
            textResource4 = textResource14;
            textResource5 = textResource13;
            list = list2;
            progressButtonModel = progressButtonModel2;
            str = str12;
            i16 = iDecodeIntElement13;
            i17 = iDecodeIntElement14;
            i18 = iDecodeIntElement15;
            i19 = iDecodeIntElement16;
            i24 = iDecodeIntElement17;
            i25 = iDecodeIntElement18;
            i26 = iDecodeIntElement19;
            str2 = strDecodeStringElement10;
            str3 = strDecodeStringElement11;
            str4 = strDecodeStringElement12;
            str5 = strDecodeStringElement13;
            str6 = strDecodeStringElement14;
            i27 = iDecodeIntElement20;
            str7 = strDecodeStringElement15;
            str8 = strDecodeStringElement16;
            str9 = strDecodeStringElement17;
            str10 = strDecodeStringElement18;
            i28 = iDecodeIntElement21;
            i29 = iDecodeIntElement22;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HeightAndWeightStepModel(i14, textResource5, textResource4, textResource3, textResource2, str2, str3, str4, str5, str6, i29, i28, i27, i13, i15, i16, i17, i18, i19, i24, textResource, str7, str8, i25, i26, str, str9, str10, progressButtonModel, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HeightAndWeightStepModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HeightAndWeightStepModel.write$Self$activation_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
