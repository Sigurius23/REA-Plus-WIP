package com.whoop.design.models.items;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import k01.EnumC22089a;
import k01.EnumC22094f;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/SleepPlannerAlarmCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SleepPlannerAlarmCardModel$$serializer implements GeneratedSerializer<SleepPlannerAlarmCardModel> {
    public static final int $stable;
    public static final SleepPlannerAlarmCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SleepPlannerAlarmCardModel$$serializer sleepPlannerAlarmCardModel$$serializer = new SleepPlannerAlarmCardModel$$serializer();
        INSTANCE = sleepPlannerAlarmCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.SleepPlannerAlarmCardModel", sleepPlannerAlarmCardModel$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("leftIcon", false);
        pluginGeneratedSerialDescriptor.addElement("rightIcon", false);
        pluginGeneratedSerialDescriptor.addElement("backgroundStyle", false);
        pluginGeneratedSerialDescriptor.addElement("bedtimeIcon", false);
        pluginGeneratedSerialDescriptor.addElement("bedtimeDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("bedtimeTitle", false);
        pluginGeneratedSerialDescriptor.addElement("bedtimePeriodDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("waketimeIcon", false);
        pluginGeneratedSerialDescriptor.addElement("waketimeDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("waketimeTitle", false);
        pluginGeneratedSerialDescriptor.addElement("waketimeSubtitle", true);
        pluginGeneratedSerialDescriptor.addElement("waketimeLabelStyle", true);
        pluginGeneratedSerialDescriptor.addElement("waketimePeriodDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("heightStyle", true);
        pluginGeneratedSerialDescriptor.addElement("ctaText", false);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        pluginGeneratedSerialDescriptor.addElement("ctaButtonText", true);
        pluginGeneratedSerialDescriptor.addElement("ctaButtonIcon", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SleepPlannerAlarmCardModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = SleepPlannerAlarmCardModel.$childSerializers;
        C25452a c25452a = C25452a.f99689a;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{c25452a, stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, c25452a, c25452a, AbstractC38195a.m122336d(c25452a), stringSerializer, c25452a, c25452a, AbstractC38195a.m122336d(c25452a), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[12].getValue()), AbstractC38195a.m122336d(c25452a), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[14].getValue()), AbstractC38195a.m122336d(SleepPlannerAlarmCardStatus$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[16].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SleepPlannerAlarmCardModel deserialize(InterfaceC40541d decoder) {
        int i13;
        TextResource textResource;
        TextResource textResource2;
        String str;
        TextResource textResource3;
        String str2;
        SleepPlannerAlarmCardStatus sleepPlannerAlarmCardStatus;
        TextResource textResource4;
        EnumC22094f enumC22094f;
        TextResource textResource5;
        TextResource textResource6;
        EnumC22089a enumC22089a;
        String str3;
        String str4;
        TextResource textResource7;
        TextResource textResource8;
        String str5;
        C9598e c9598e;
        String str6;
        String str7;
        int i14;
        int i15;
        TextResource textResource9;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = SleepPlannerAlarmCardModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource10 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            TextResource textResource11 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, c25452a, null);
            TextResource textResource12 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, c25452a, null);
            TextResource textResource13 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, c25452a, null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            TextResource textResource14 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, c25452a, null);
            TextResource textResource15 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, c25452a, null);
            TextResource textResource16 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, c25452a, null);
            EnumC22094f enumC22094f2 = (EnumC22094f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), null);
            TextResource textResource17 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, c25452a, null);
            EnumC22089a enumC22089a2 = (EnumC22089a) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), null);
            SleepPlannerAlarmCardStatus sleepPlannerAlarmCardStatus2 = (SleepPlannerAlarmCardStatus) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, SleepPlannerAlarmCardStatus$$serializer.INSTANCE, null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, (InterfaceC37137b) interfaceC23462hArr[16].getValue(), null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, stringSerializer, null);
            i13 = 524287;
            str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, stringSerializer, null);
            textResource4 = textResource17;
            str6 = str9;
            str = str8;
            textResource = textResource10;
            str7 = strDecodeStringElement;
            textResource6 = textResource14;
            textResource2 = textResource13;
            textResource3 = textResource12;
            textResource8 = textResource11;
            str3 = strDecodeStringElement2;
            str5 = strDecodeStringElement4;
            c9598e = c9598e2;
            sleepPlannerAlarmCardStatus = sleepPlannerAlarmCardStatus2;
            enumC22089a = enumC22089a2;
            enumC22094f = enumC22094f2;
            str4 = strDecodeStringElement3;
            textResource7 = textResource15;
            textResource5 = textResource16;
        } else {
            boolean z4 = true;
            String str10 = null;
            C9598e c9598e3 = null;
            TextResource textResource18 = null;
            TextResource textResource19 = null;
            TextResource textResource20 = null;
            String str11 = null;
            SleepPlannerAlarmCardStatus sleepPlannerAlarmCardStatus3 = null;
            TextResource textResource21 = null;
            EnumC22094f enumC22094f3 = null;
            TextResource textResource22 = null;
            TextResource textResource23 = null;
            EnumC22089a enumC22089a3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            TextResource textResource24 = null;
            String str12 = null;
            i13 = 0;
            TextResource textResource25 = null;
            while (z4) {
                TextResource textResource26 = textResource25;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        textResource18 = textResource18;
                        textResource25 = textResource26;
                        c9598e3 = c9598e3;
                        break;
                    case 0:
                        textResource9 = textResource26;
                        textResource24 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource24);
                        i13 |= 1;
                        textResource18 = textResource18;
                        textResource25 = textResource9;
                        c9598e3 = c9598e3;
                        str10 = str10;
                        break;
                    case 1:
                        textResource9 = textResource26;
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i13 |= 2;
                        textResource25 = textResource9;
                        c9598e3 = c9598e3;
                        str10 = str10;
                        break;
                    case 2:
                        textResource9 = textResource26;
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str12);
                        i13 |= 4;
                        textResource25 = textResource9;
                        c9598e3 = c9598e3;
                        str10 = str10;
                        break;
                    case 3:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i13 |= 8;
                        textResource25 = textResource26;
                        c9598e3 = c9598e3;
                        str10 = str10;
                        break;
                    case 4:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i13 |= 16;
                        textResource25 = textResource26;
                        c9598e3 = c9598e3;
                        str10 = str10;
                        break;
                    case 5:
                        str10 = str10;
                        c9598e3 = c9598e3;
                        textResource25 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, C25452a.f99689a, textResource26);
                        i13 |= 32;
                        c9598e3 = c9598e3;
                        str10 = str10;
                        break;
                    case 6:
                        textResource20 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, C25452a.f99689a, textResource20);
                        i13 |= 64;
                        str10 = str10;
                        textResource25 = textResource26;
                        break;
                    case 7:
                        textResource20 = textResource20;
                        textResource19 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, C25452a.f99689a, textResource19);
                        i13 |= 128;
                        textResource25 = textResource26;
                        textResource20 = textResource20;
                        break;
                    case 8:
                        textResource20 = textResource20;
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i13 |= 256;
                        textResource25 = textResource26;
                        textResource20 = textResource20;
                        break;
                    case 9:
                        textResource20 = textResource20;
                        textResource23 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, C25452a.f99689a, textResource23);
                        i13 |= 512;
                        textResource25 = textResource26;
                        textResource20 = textResource20;
                        break;
                    case 10:
                        textResource20 = textResource20;
                        textResource18 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, C25452a.f99689a, textResource18);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        textResource25 = textResource26;
                        textResource20 = textResource20;
                        break;
                    case 11:
                        textResource20 = textResource20;
                        textResource22 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, C25452a.f99689a, textResource22);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        textResource25 = textResource26;
                        textResource20 = textResource20;
                        break;
                    case 12:
                        textResource20 = textResource20;
                        enumC22094f3 = (EnumC22094f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), enumC22094f3);
                        i13 |= 4096;
                        textResource25 = textResource26;
                        textResource20 = textResource20;
                        break;
                    case 13:
                        textResource20 = textResource20;
                        textResource21 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, C25452a.f99689a, textResource21);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        textResource25 = textResource26;
                        textResource20 = textResource20;
                        break;
                    case 14:
                        textResource20 = textResource20;
                        enumC22089a3 = (EnumC22089a) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), enumC22089a3);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        textResource25 = textResource26;
                        textResource20 = textResource20;
                        break;
                    case 15:
                        sleepPlannerAlarmCardStatus3 = (SleepPlannerAlarmCardStatus) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, SleepPlannerAlarmCardStatus$$serializer.INSTANCE, sleepPlannerAlarmCardStatus3);
                        i14 = 32768;
                        i13 |= i14;
                        textResource25 = textResource26;
                        textResource20 = textResource20;
                        break;
                    case 16:
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, (InterfaceC37137b) interfaceC23462hArr[16].getValue(), c9598e3);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i13 |= i14;
                        textResource25 = textResource26;
                        textResource20 = textResource20;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, StringSerializer.INSTANCE, str10);
                        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i13 |= i15;
                        textResource25 = textResource26;
                        textResource20 = textResource20;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, StringSerializer.INSTANCE, str11);
                        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        i13 |= i15;
                        textResource25 = textResource26;
                        textResource20 = textResource20;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            textResource = textResource24;
            textResource2 = textResource19;
            str = str12;
            textResource3 = textResource20;
            str2 = str11;
            sleepPlannerAlarmCardStatus = sleepPlannerAlarmCardStatus3;
            textResource4 = textResource21;
            enumC22094f = enumC22094f3;
            textResource5 = textResource22;
            textResource6 = textResource23;
            enumC22089a = enumC22089a3;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
            textResource7 = textResource18;
            textResource8 = textResource25;
            str5 = strDecodeStringElement7;
            c9598e = c9598e3;
            str6 = str10;
            str7 = strDecodeStringElement8;
        }
        int i16 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SleepPlannerAlarmCardModel(i16, textResource, str7, str, str3, str4, textResource8, textResource3, textResource2, str5, textResource6, textResource7, textResource5, enumC22094f, textResource4, enumC22089a, sleepPlannerAlarmCardStatus, c9598e, str6, str2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SleepPlannerAlarmCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SleepPlannerAlarmCardModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
