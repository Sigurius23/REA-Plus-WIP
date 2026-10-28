package com.stripe.hcaptcha.config;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import w40.C36798a;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/stripe/hcaptcha/config/HCaptchaConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "hcaptcha_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC23457c
public /* synthetic */ class HCaptchaConfig$$serializer implements GeneratedSerializer<HCaptchaConfig> {
    public static final HCaptchaConfig$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HCaptchaConfig$$serializer hCaptchaConfig$$serializer = new HCaptchaConfig$$serializer();
        INSTANCE = hCaptchaConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.hcaptcha.config.HCaptchaConfig", hCaptchaConfig$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("siteKey", false);
        pluginGeneratedSerialDescriptor.addElement("sentry", true);
        pluginGeneratedSerialDescriptor.addElement("loading", true);
        pluginGeneratedSerialDescriptor.addElement("hideDialog", true);
        pluginGeneratedSerialDescriptor.addElement("rqdata", true);
        pluginGeneratedSerialDescriptor.addElement("jsSrc", true);
        pluginGeneratedSerialDescriptor.addElement("endpoint", true);
        pluginGeneratedSerialDescriptor.addElement("reportapi", true);
        pluginGeneratedSerialDescriptor.addElement("assethost", true);
        pluginGeneratedSerialDescriptor.addElement("imghost", true);
        pluginGeneratedSerialDescriptor.addElement("locale", true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        pluginGeneratedSerialDescriptor.addElement("orientation", true);
        pluginGeneratedSerialDescriptor.addElement("theme", true);
        pluginGeneratedSerialDescriptor.addElement("host", true);
        pluginGeneratedSerialDescriptor.addElement("customTheme", true);
        pluginGeneratedSerialDescriptor.addElement("tokenExpiration", true);
        pluginGeneratedSerialDescriptor.addElement("disableHardwareAcceleration", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HCaptchaConfig$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c[] interfaceC37138cArr = HCaptchaConfig.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138c = interfaceC37138cArr[11];
        InterfaceC37138c interfaceC37138c2 = interfaceC37138cArr[12];
        InterfaceC37138c interfaceC37138c3 = interfaceC37138cArr[13];
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d7 = AbstractC38195a.m122336d(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, booleanSerializer, booleanSerializer, booleanSerializer, interfaceC37138cM122336d, stringSerializer, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, interfaceC37138cM122336d5, stringSerializer, interfaceC37138c, interfaceC37138c2, interfaceC37138c3, interfaceC37138cM122336d6, interfaceC37138cM122336d7, C36798a.f157424a, booleanSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HCaptchaConfig deserialize(InterfaceC40541d decoder) {
        String strDecodeStringElement;
        int i13;
        String str;
        String str2;
        Duration duration;
        String str3;
        HCaptchaTheme hCaptchaTheme;
        HCaptchaOrientation hCaptchaOrientation;
        HCaptchaSize hCaptchaSize;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean zDecodeBooleanElement;
        boolean z4;
        boolean z13;
        boolean z14;
        int i14;
        int i15;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC37138c[] interfaceC37138cArr = HCaptchaConfig.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
            boolean zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
            boolean zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 10);
            strDecodeStringElement = strDecodeStringElement2;
            HCaptchaSize hCaptchaSize2 = (HCaptchaSize) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 11, interfaceC37138cArr[11], null);
            HCaptchaOrientation hCaptchaOrientation2 = (HCaptchaOrientation) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 12, interfaceC37138cArr[12], null);
            HCaptchaTheme hCaptchaTheme2 = (HCaptchaTheme) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, interfaceC37138cArr[13], null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, stringSerializer, null);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, stringSerializer, null);
            duration = (Duration) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 16, C36798a.f157424a, null);
            str6 = str15;
            z13 = zDecodeBooleanElement3;
            z14 = zDecodeBooleanElement2;
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 17);
            str9 = strDecodeStringElement4;
            str7 = str14;
            str = str12;
            str5 = str11;
            str8 = strDecodeStringElement3;
            z4 = zDecodeBooleanElement4;
            i13 = 262143;
            str4 = str13;
            str2 = str10;
            str3 = str16;
            hCaptchaTheme = hCaptchaTheme2;
            hCaptchaOrientation = hCaptchaOrientation2;
            hCaptchaSize = hCaptchaSize2;
        } else {
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            int i16 = 0;
            String str17 = null;
            Duration duration2 = null;
            String str18 = null;
            HCaptchaTheme hCaptchaTheme3 = null;
            HCaptchaOrientation hCaptchaOrientation3 = null;
            HCaptchaSize hCaptchaSize3 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean z15 = true;
            boolean zDecodeBooleanElement8 = false;
            String str22 = null;
            String str23 = null;
            while (z15) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        i14 = i16;
                        z15 = false;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        i16 = i14;
                        break;
                    case 0:
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        int i17 = i16;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = i17 | 1;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        i16 = i14;
                        break;
                    case 1:
                        i14 = i16 | 2;
                        zDecodeBooleanElement8 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        i16 = i14;
                        break;
                    case 2:
                        i16 |= 4;
                        zDecodeBooleanElement5 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        break;
                    case 3:
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        int i18 = i16;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        zDecodeBooleanElement7 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
                        i14 = i18 | 8;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        i16 = i14;
                        break;
                    case 4:
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        int i19 = i16;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str22);
                        i14 = i19 | 16;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        i16 = i14;
                        break;
                    case 5:
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        int i24 = i16;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i14 = i24 | 32;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        i16 = i14;
                        break;
                    case 6:
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        int i25 = i16;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str23);
                        i14 = i25 | 64;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        i16 = i14;
                        break;
                    case 7:
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        int i26 = i16;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str17);
                        i14 = i26 | 128;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        i16 = i14;
                        break;
                    case 8:
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        int i27 = i16;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str19);
                        i14 = i27 | 256;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        i16 = i14;
                        break;
                    case 9:
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        int i28 = i16;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str21);
                        i14 = i28 | 512;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        i16 = i14;
                        break;
                    case 10:
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        int i29 = i16;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 10);
                        i14 = i29 | DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        i16 = i14;
                        break;
                    case 11:
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        int i34 = i16;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        hCaptchaSize3 = (HCaptchaSize) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 11, interfaceC37138cArr[11], hCaptchaSize3);
                        i14 = i34 | DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        i16 = i14;
                        break;
                    case 12:
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        int i35 = i16;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        hCaptchaOrientation3 = (HCaptchaOrientation) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 12, interfaceC37138cArr[12], hCaptchaOrientation3);
                        i14 = i35 | 4096;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        i16 = i14;
                        break;
                    case 13:
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        int i36 = i16;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        hCaptchaTheme3 = (HCaptchaTheme) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, interfaceC37138cArr[13], hCaptchaTheme3);
                        i14 = i36 | DfuBaseService.ERROR_REMOTE_MASK;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        i16 = i14;
                        break;
                    case 14:
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        int i37 = i16;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, str20);
                        i14 = i37 | DfuBaseService.ERROR_CONNECTION_MASK;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        i16 = i14;
                        break;
                    case 15:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, StringSerializer.INSTANCE, str18);
                        i15 = 32768;
                        i14 = i16 | i15;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        i16 = i14;
                        break;
                    case 16:
                        duration2 = (Duration) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 16, C36798a.f157424a, duration2);
                        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i14 = i16 | i15;
                        zDecodeBooleanElement5 = zDecodeBooleanElement5;
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                        i16 = i14;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        zDecodeBooleanElement6 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 17);
                        i16 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            str = str17;
            str2 = str22;
            duration = duration2;
            str3 = str18;
            hCaptchaTheme = hCaptchaTheme3;
            hCaptchaOrientation = hCaptchaOrientation3;
            hCaptchaSize = hCaptchaSize3;
            str4 = str19;
            str5 = str23;
            str6 = str20;
            str7 = str21;
            str8 = strDecodeStringElement5;
            str9 = strDecodeStringElement6;
            zDecodeBooleanElement = zDecodeBooleanElement6;
            z4 = zDecodeBooleanElement7;
            z13 = zDecodeBooleanElement5;
            z14 = zDecodeBooleanElement8;
        }
        String str24 = strDecodeStringElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HCaptchaConfig(i13, str24, z14, z13, z4, str2, str8, str5, str, str4, str7, str9, hCaptchaSize, hCaptchaOrientation, hCaptchaTheme, str6, str3, duration, zDecodeBooleanElement, (SerializationConstructorMarker) null, (DefaultConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HCaptchaConfig value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HCaptchaConfig.write$Self$hcaptcha_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }
}
