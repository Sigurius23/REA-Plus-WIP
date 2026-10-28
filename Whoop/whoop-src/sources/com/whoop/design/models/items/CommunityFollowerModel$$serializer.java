package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/CommunityFollowerModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/CommunityFollowerModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/CommunityFollowerModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/CommunityFollowerModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CommunityFollowerModel$$serializer implements GeneratedSerializer<CommunityFollowerModel> {
    public static final int $stable;
    public static final CommunityFollowerModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CommunityFollowerModel$$serializer communityFollowerModel$$serializer = new CommunityFollowerModel$$serializer();
        INSTANCE = communityFollowerModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.CommunityFollowerModel", communityFollowerModel$$serializer, 21);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("noDataLabel", true);
        pluginGeneratedSerialDescriptor.addElement("avatarUrl", true);
        pluginGeneratedSerialDescriptor.addElement("streak", true);
        pluginGeneratedSerialDescriptor.addElement("streakImageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("recoveryScore", true);
        pluginGeneratedSerialDescriptor.addElement("recoveryLabel", true);
        pluginGeneratedSerialDescriptor.addElement("dayStrain", true);
        pluginGeneratedSerialDescriptor.addElement("strainLabel", true);
        pluginGeneratedSerialDescriptor.addElement("sleepScore", true);
        pluginGeneratedSerialDescriptor.addElement("sleepLabel", true);
        pluginGeneratedSerialDescriptor.addElement("recoveryColor", true);
        pluginGeneratedSerialDescriptor.addElement("strainColor", true);
        pluginGeneratedSerialDescriptor.addElement("sleepColor", true);
        pluginGeneratedSerialDescriptor.addElement("backgroundStyle", true);
        pluginGeneratedSerialDescriptor.addElement("avatarRingColor", true);
        pluginGeneratedSerialDescriptor.addElement("iconUrls", true);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_NAVIGATION, true);
        pluginGeneratedSerialDescriptor.addElement("interaction", true);
        pluginGeneratedSerialDescriptor.addElement("titleInteraction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CommunityFollowerModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = CommunityFollowerModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d7 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d8 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d9 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d10 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d11 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d12 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d13 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d14 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d15 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d16 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d17 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[17].getValue());
        InterfaceC37138c interfaceC37138cM122336d18 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[18].getValue());
        GenericInteraction$$serializer genericInteraction$$serializer = GenericInteraction$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, interfaceC37138cM122336d5, interfaceC37138cM122336d6, interfaceC37138cM122336d7, interfaceC37138cM122336d8, interfaceC37138cM122336d9, interfaceC37138cM122336d10, interfaceC37138cM122336d11, interfaceC37138cM122336d12, interfaceC37138cM122336d13, interfaceC37138cM122336d14, interfaceC37138cM122336d15, interfaceC37138cM122336d16, interfaceC37138cM122336d17, interfaceC37138cM122336d18, AbstractC38195a.m122336d(genericInteraction$$serializer), AbstractC38195a.m122336d(genericInteraction$$serializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CommunityFollowerModel deserialize(InterfaceC40541d decoder) {
        String str;
        String str2;
        String str3;
        GenericInteraction genericInteraction;
        List list;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        GenericInteraction genericInteraction2;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i13;
        String str15;
        C9598e c9598e;
        String str16;
        String str17;
        int i14;
        String str18;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = CommunityFollowerModel.$childSerializers;
        String str19 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str24 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str25 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String str26 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            String str27 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            String str28 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            String str29 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            String str30 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            String str31 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, stringSerializer, null);
            String str32 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, stringSerializer, null);
            String str33 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, stringSerializer, null);
            String str34 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, stringSerializer, null);
            String str35 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, stringSerializer, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, (InterfaceC37137b) interfaceC23462hArr[17].getValue(), null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, (InterfaceC37137b) interfaceC23462hArr[18].getValue(), null);
            GenericInteraction$$serializer genericInteraction$$serializer = GenericInteraction$$serializer.INSTANCE;
            GenericInteraction genericInteraction3 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, genericInteraction$$serializer, null);
            genericInteraction2 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 20, genericInteraction$$serializer, null);
            str17 = strDecodeStringElement;
            str11 = str22;
            str15 = str27;
            str12 = str23;
            str10 = str21;
            str = str20;
            i13 = 2097151;
            str3 = str29;
            str9 = str28;
            str2 = str26;
            str14 = str25;
            str13 = str24;
            genericInteraction = genericInteraction3;
            str4 = str35;
            str5 = str34;
            str16 = str33;
            str6 = str32;
            c9598e = c9598e2;
            list = list2;
            str7 = str31;
            str8 = str30;
        } else {
            boolean z4 = true;
            int i15 = 0;
            String str36 = null;
            C9598e c9598e3 = null;
            String str37 = null;
            GenericInteraction genericInteraction4 = null;
            List list3 = null;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            String str42 = null;
            String str43 = null;
            GenericInteraction genericInteraction5 = null;
            String strDecodeStringElement2 = null;
            String str44 = null;
            String str45 = null;
            String str46 = null;
            String str47 = null;
            String str48 = null;
            String str49 = null;
            String str50 = null;
            while (z4) {
                String str51 = str43;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        str18 = str51;
                        z4 = false;
                        i15 = i15;
                        str43 = str18;
                        c9598e3 = c9598e3;
                        str36 = str36;
                        break;
                    case 0:
                        str18 = str51;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 |= 1;
                        str43 = str18;
                        c9598e3 = c9598e3;
                        str36 = str36;
                        break;
                    case 1:
                        str18 = str51;
                        str44 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str44);
                        i15 |= 2;
                        str45 = str45;
                        str43 = str18;
                        c9598e3 = c9598e3;
                        str36 = str36;
                        break;
                    case 2:
                        str18 = str51;
                        str45 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str45);
                        i15 |= 4;
                        str46 = str46;
                        str43 = str18;
                        c9598e3 = c9598e3;
                        str36 = str36;
                        break;
                    case 3:
                        str18 = str51;
                        str46 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str46);
                        i15 |= 8;
                        str47 = str47;
                        str43 = str18;
                        c9598e3 = c9598e3;
                        str36 = str36;
                        break;
                    case 4:
                        str18 = str51;
                        str47 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str47);
                        i15 |= 16;
                        str48 = str48;
                        str43 = str18;
                        c9598e3 = c9598e3;
                        str36 = str36;
                        break;
                    case 5:
                        str18 = str51;
                        str48 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str48);
                        i15 |= 32;
                        str49 = str49;
                        str43 = str18;
                        c9598e3 = c9598e3;
                        str36 = str36;
                        break;
                    case 6:
                        str18 = str51;
                        str49 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str49);
                        i15 |= 64;
                        str43 = str18;
                        c9598e3 = c9598e3;
                        str36 = str36;
                        break;
                    case 7:
                        str18 = str51;
                        str50 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str50);
                        i15 |= 128;
                        str43 = str18;
                        c9598e3 = c9598e3;
                        str36 = str36;
                        break;
                    case 8:
                        str36 = str36;
                        c9598e3 = c9598e3;
                        str43 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str51);
                        i15 |= 256;
                        c9598e3 = c9598e3;
                        str36 = str36;
                        break;
                    case 9:
                        str42 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str42);
                        i15 |= 512;
                        str36 = str36;
                        str43 = str51;
                        break;
                    case 10:
                        str42 = str42;
                        str37 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str37);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        str43 = str51;
                        str42 = str42;
                        break;
                    case 11:
                        str42 = str42;
                        str41 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str41);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        str43 = str51;
                        str42 = str42;
                        break;
                    case 12:
                        str42 = str42;
                        str40 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, StringSerializer.INSTANCE, str40);
                        i15 |= 4096;
                        str43 = str51;
                        str42 = str42;
                        break;
                    case 13:
                        str42 = str42;
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, str19);
                        i15 |= DfuBaseService.ERROR_REMOTE_MASK;
                        str43 = str51;
                        str42 = str42;
                        break;
                    case 14:
                        str42 = str42;
                        str36 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, str36);
                        i15 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        str43 = str51;
                        str42 = str42;
                        break;
                    case 15:
                        str39 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, StringSerializer.INSTANCE, str39);
                        i14 = 32768;
                        i15 |= i14;
                        str43 = str51;
                        str42 = str42;
                        break;
                    case 16:
                        str38 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, StringSerializer.INSTANCE, str38);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i15 |= i14;
                        str43 = str51;
                        str42 = str42;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, (InterfaceC37137b) interfaceC23462hArr[17].getValue(), list3);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i15 |= i14;
                        str43 = str51;
                        str42 = str42;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        str42 = str42;
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, (InterfaceC37137b) interfaceC23462hArr[18].getValue(), c9598e3);
                        i15 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        str43 = str51;
                        str42 = str42;
                        break;
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        genericInteraction4 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, GenericInteraction$$serializer.INSTANCE, genericInteraction4);
                        i14 = 524288;
                        i15 |= i14;
                        str43 = str51;
                        str42 = str42;
                        break;
                    case 20:
                        genericInteraction5 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 20, GenericInteraction$$serializer.INSTANCE, genericInteraction5);
                        i14 = 1048576;
                        i15 |= i14;
                        str43 = str51;
                        str42 = str42;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str44;
            str2 = str50;
            str3 = str37;
            genericInteraction = genericInteraction4;
            list = list3;
            str4 = str38;
            str5 = str39;
            str6 = str19;
            str7 = str40;
            str8 = str41;
            str9 = str42;
            genericInteraction2 = genericInteraction5;
            str10 = str45;
            str11 = str46;
            str12 = str47;
            str13 = str48;
            str14 = str49;
            i13 = i15;
            str15 = str43;
            c9598e = c9598e3;
            str16 = str36;
            str17 = strDecodeStringElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CommunityFollowerModel(i13, str17, str, str10, str11, str12, str13, str14, str2, str15, str9, str3, str8, str7, str6, str16, str5, str4, list, c9598e, genericInteraction, genericInteraction2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CommunityFollowerModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CommunityFollowerModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
