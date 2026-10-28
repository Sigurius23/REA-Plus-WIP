package com.whoop.profile.domain.edit.models;

import androidx.core.app.NotificationCompat;
import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.mapbox.common.HttpHeaders;
import com.whoop.profile.domain.models.Gender;
import com.whoop.profile.domain.models.PhysiologicalBaseline;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/profile/domain/edit/models/EditProfileResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/profile/domain/edit/models/EditProfileResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/profile/domain/edit/models/EditProfileResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class EditProfileResponse$$serializer implements GeneratedSerializer<EditProfileResponse> {
    public static final int $stable;
    public static final EditProfileResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        EditProfileResponse$$serializer editProfileResponse$$serializer = new EditProfileResponse$$serializer();
        INSTANCE = editProfileResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.profile.domain.edit.models.EditProfileResponse", editProfileResponse$$serializer, 29);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("avatar_url", true);
        pluginGeneratedSerialDescriptor.addElement("first_name", false);
        pluginGeneratedSerialDescriptor.addElement("last_name", false);
        pluginGeneratedSerialDescriptor.addElement("username", true);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_EMAIL, false);
        pluginGeneratedSerialDescriptor.addElement("city", true);
        pluginGeneratedSerialDescriptor.addElement("country", false);
        pluginGeneratedSerialDescriptor.addElement("state", true);
        pluginGeneratedSerialDescriptor.addElement("member_since", false);
        pluginGeneratedSerialDescriptor.addElement(HttpHeaders.AGE, false);
        pluginGeneratedSerialDescriptor.addElement("founding_member", true);
        pluginGeneratedSerialDescriptor.addElement("user_id", false);
        pluginGeneratedSerialDescriptor.addElement("height", false);
        pluginGeneratedSerialDescriptor.addElement("weight", false);
        pluginGeneratedSerialDescriptor.addElement("birthday", true);
        pluginGeneratedSerialDescriptor.addElement("unit_system", false);
        pluginGeneratedSerialDescriptor.addElement("height_feet_min_value", false);
        pluginGeneratedSerialDescriptor.addElement("height_feet_max_value", false);
        pluginGeneratedSerialDescriptor.addElement("height_meters_min_value", true);
        pluginGeneratedSerialDescriptor.addElement("height_meters_max_value", true);
        pluginGeneratedSerialDescriptor.addElement("weight_pounds_min_value", false);
        pluginGeneratedSerialDescriptor.addElement("weight_pounds_max_value", false);
        pluginGeneratedSerialDescriptor.addElement("weight_kilograms_min_value", false);
        pluginGeneratedSerialDescriptor.addElement("weight_kilograms_max_value", false);
        pluginGeneratedSerialDescriptor.addElement("gender", true);
        pluginGeneratedSerialDescriptor.addElement("physiological_baseline", false);
        pluginGeneratedSerialDescriptor.addElement("countries", false);
        pluginGeneratedSerialDescriptor.addElement("locked_fields", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EditProfileResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = EditProfileResponse.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), DoubleSerializer.INSTANCE, intSerializer, AbstractC38195a.m122336d(BooleanSerializer.INSTANCE), intSerializer, floatSerializer, floatSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, intSerializer, intSerializer, AbstractC38195a.m122336d(floatSerializer), AbstractC38195a.m122336d(floatSerializer), intSerializer, intSerializer, intSerializer, intSerializer, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[25].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[26].getValue()), interfaceC23462hArr[27].getValue(), interfaceC23462hArr[28].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final EditProfileResponse deserialize(InterfaceC40541d decoder) {
        String str;
        int i13;
        List list;
        PhysiologicalBaseline physiologicalBaseline;
        Float f13;
        Float f14;
        String str2;
        String str3;
        Gender gender;
        Boolean bool;
        List list2;
        String str4;
        float f15;
        String str5;
        int i14;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        float f16;
        String str11;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        double d3;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = EditProfileResponse.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            double dDecodeDoubleElement = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 9);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 10);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, BooleanSerializer.INSTANCE, null);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 12);
            float fDecodeFloatElement = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 13);
            float fDecodeFloatElement2 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 14);
            String str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, stringSerializer, null);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 16);
            int iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 17);
            int iDecodeIntElement4 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 18);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f17 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, floatSerializer, null);
            Float f18 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 20, floatSerializer, null);
            int iDecodeIntElement5 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 21);
            int iDecodeIntElement6 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 22);
            int iDecodeIntElement7 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 23);
            int iDecodeIntElement8 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 24);
            Gender gender2 = (Gender) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 25, (InterfaceC37137b) interfaceC23462hArr[25].getValue(), null);
            PhysiologicalBaseline physiologicalBaseline2 = (PhysiologicalBaseline) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 26, (InterfaceC37137b) interfaceC23462hArr[26].getValue(), null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 27, (InterfaceC37137b) interfaceC23462hArr[27].getValue(), null);
            i25 = iDecodeIntElement8;
            list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 28, (InterfaceC37137b) interfaceC23462hArr[28].getValue(), null);
            i13 = 536870911;
            f16 = fDecodeFloatElement;
            i16 = iDecodeIntElement;
            i17 = iDecodeIntElement2;
            str10 = strDecodeStringElement4;
            str6 = str15;
            str9 = strDecodeStringElement3;
            str8 = strDecodeStringElement2;
            str3 = str16;
            str5 = str14;
            i18 = iDecodeIntElement6;
            i19 = iDecodeIntElement3;
            i24 = iDecodeIntElement7;
            f13 = f18;
            i14 = iDecodeIntElement5;
            str7 = strDecodeStringElement;
            str4 = str13;
            i15 = iDecodeIntElement4;
            str2 = str17;
            str11 = strDecodeStringElement5;
            str = str12;
            f15 = fDecodeFloatElement2;
            bool = bool2;
            list = list3;
            physiologicalBaseline = physiologicalBaseline2;
            gender = gender2;
            f14 = f17;
            d3 = dDecodeDoubleElement;
        } else {
            List list4 = null;
            int i34 = 0;
            float fDecodeFloatElement3 = 0.0f;
            boolean z4 = true;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            int iDecodeIntElement11 = 0;
            int iDecodeIntElement12 = 0;
            int iDecodeIntElement13 = 0;
            int iDecodeIntElement14 = 0;
            String str18 = null;
            String str19 = null;
            List list5 = null;
            PhysiologicalBaseline physiologicalBaseline3 = null;
            Float f19 = null;
            Float f24 = null;
            String str20 = null;
            String str21 = null;
            Gender gender3 = null;
            Boolean bool3 = null;
            String str22 = null;
            String str23 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            double dDecodeDoubleElement2 = 0.0d;
            float fDecodeFloatElement4 = 0.0f;
            int iDecodeIntElement15 = 0;
            int iDecodeIntElement16 = 0;
            while (z4) {
                int i35 = iDecodeIntElement15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        str19 = str19;
                        str18 = str18;
                        iDecodeIntElement15 = i35;
                        str23 = str23;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 0:
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str22);
                        i34 |= 1;
                        str19 = str19;
                        str18 = str18;
                        iDecodeIntElement15 = i35;
                        str23 = str23;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 1:
                        i34 |= 2;
                        str18 = str18;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str23);
                        iDecodeIntElement15 = i35;
                        break;
                    case 2:
                        iDecodeIntElement16 = iDecodeIntElement16;
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i34 |= 4;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 3:
                        iDecodeIntElement16 = iDecodeIntElement16;
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i34 |= 8;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 4:
                        iDecodeIntElement16 = iDecodeIntElement16;
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str19);
                        i34 |= 16;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 5:
                        iDecodeIntElement16 = iDecodeIntElement16;
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i34 |= 32;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 6:
                        iDecodeIntElement16 = iDecodeIntElement16;
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str18);
                        i34 |= 64;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 7:
                        iDecodeIntElement16 = iDecodeIntElement16;
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i34 |= 128;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 8:
                        iDecodeIntElement16 = iDecodeIntElement16;
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str21);
                        i34 |= 256;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 9:
                        iDecodeIntElement16 = iDecodeIntElement16;
                        dDecodeDoubleElement2 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 9);
                        i34 |= 512;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 10:
                        iDecodeIntElement16 = iDecodeIntElement16;
                        iDecodeIntElement11 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 10);
                        i34 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 11:
                        iDecodeIntElement16 = iDecodeIntElement16;
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, BooleanSerializer.INSTANCE, bool3);
                        i34 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 12:
                        iDecodeIntElement16 = iDecodeIntElement16;
                        iDecodeIntElement12 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 12);
                        i34 |= 4096;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 13:
                        iDecodeIntElement16 = iDecodeIntElement16;
                        fDecodeFloatElement4 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 13);
                        i34 |= DfuBaseService.ERROR_REMOTE_MASK;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 14:
                        iDecodeIntElement16 = iDecodeIntElement16;
                        fDecodeFloatElement3 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 14);
                        i34 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 15:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, StringSerializer.INSTANCE, str20);
                        i26 = 32768;
                        i34 |= i26;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 16:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 16);
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i34 |= i27;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        iDecodeIntElement14 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 17);
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i34 |= i27;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        iDecodeIntElement10 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 18);
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        i34 |= i27;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        f24 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, FloatSerializer.INSTANCE, f24);
                        i26 = 524288;
                        i34 |= i26;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 20:
                        f19 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 20, FloatSerializer.INSTANCE, f19);
                        i26 = 1048576;
                        i34 |= i26;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 21:
                        iDecodeIntElement9 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 21);
                        i28 = 2097152;
                        i34 |= i28;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        iDecodeIntElement13 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 22);
                        i28 = 4194304;
                        i34 |= i28;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        iDecodeIntElement16 = iDecodeIntElement16;
                        i34 |= 8388608;
                        iDecodeIntElement15 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 23);
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 24:
                        i34 |= 16777216;
                        iDecodeIntElement16 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 24);
                        iDecodeIntElement15 = i35;
                        break;
                    case 25:
                        gender3 = (Gender) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 25, (InterfaceC37137b) interfaceC23462hArr[25].getValue(), gender3);
                        i26 = AndroidSDKConstants.FLAG_MUTABLE;
                        i34 |= i26;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 26:
                        physiologicalBaseline3 = (PhysiologicalBaseline) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 26, (InterfaceC37137b) interfaceC23462hArr[26].getValue(), physiologicalBaseline3);
                        i29 = 67108864;
                        i34 |= i29;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 27:
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 27, (InterfaceC37137b) interfaceC23462hArr[27].getValue(), list5);
                        i26 = 134217728;
                        i34 |= i26;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    case 28:
                        list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 28, (InterfaceC37137b) interfaceC23462hArr[28].getValue(), list4);
                        i29 = 268435456;
                        i34 |= i29;
                        iDecodeIntElement15 = i35;
                        iDecodeIntElement16 = iDecodeIntElement16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            int i36 = iDecodeIntElement16;
            str = str22;
            i13 = i34;
            list = list5;
            physiologicalBaseline = physiologicalBaseline3;
            f13 = f19;
            f14 = f24;
            str2 = str20;
            str3 = str21;
            gender = gender3;
            bool = bool3;
            list2 = list4;
            str4 = str23;
            f15 = fDecodeFloatElement3;
            str5 = str19;
            i14 = iDecodeIntElement9;
            str6 = str18;
            str7 = strDecodeStringElement6;
            str8 = strDecodeStringElement7;
            str9 = strDecodeStringElement8;
            str10 = strDecodeStringElement9;
            f16 = fDecodeFloatElement4;
            str11 = strDecodeStringElement10;
            i15 = iDecodeIntElement10;
            i16 = iDecodeIntElement11;
            i17 = iDecodeIntElement12;
            i18 = iDecodeIntElement13;
            i19 = iDecodeIntElement14;
            d3 = dDecodeDoubleElement2;
            i24 = iDecodeIntElement15;
            i25 = i36;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new EditProfileResponse(i13, str, str4, str7, str8, str5, str9, str6, str10, str3, d3, i16, bool, i17, f16, f15, str2, str11, i19, i15, f14, f13, i14, i18, i24, i25, gender, physiologicalBaseline, list, list2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, EditProfileResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        EditProfileResponse.write$Self$profile_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
