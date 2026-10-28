package com.whoop.profile.domain.edit.models;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.domain.models.Gender;
import com.whoop.profile.domain.models.PhysiologicalBaseline;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.FloatSerializer;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/profile/domain/edit/models/UpdateProfileRequest.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class UpdateProfileRequest$$serializer implements GeneratedSerializer<UpdateProfileRequest> {
    public static final int $stable;
    public static final UpdateProfileRequest$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        UpdateProfileRequest$$serializer updateProfileRequest$$serializer = new UpdateProfileRequest$$serializer();
        INSTANCE = updateProfileRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.profile.domain.edit.models.UpdateProfileRequest", updateProfileRequest$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_EMAIL, false);
        pluginGeneratedSerialDescriptor.addElement("username", false);
        pluginGeneratedSerialDescriptor.addElement("first_name", false);
        pluginGeneratedSerialDescriptor.addElement("last_name", false);
        pluginGeneratedSerialDescriptor.addElement("country", false);
        pluginGeneratedSerialDescriptor.addElement("state", true);
        pluginGeneratedSerialDescriptor.addElement("city", true);
        pluginGeneratedSerialDescriptor.addElement("birthday", false);
        pluginGeneratedSerialDescriptor.addElement("gender", false);
        pluginGeneratedSerialDescriptor.addElement("physiological_baseline", true);
        pluginGeneratedSerialDescriptor.addElement("height", false);
        pluginGeneratedSerialDescriptor.addElement("weight", false);
        pluginGeneratedSerialDescriptor.addElement("unit_system", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UpdateProfileRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = UpdateProfileRequest.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), stringSerializer, interfaceC23462hArr[8].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[9].getValue()), floatSerializer, floatSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final UpdateProfileRequest deserialize(InterfaceC40541d decoder) {
        String str;
        String str2;
        int i13;
        Gender gender;
        PhysiologicalBaseline physiologicalBaseline;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        float fDecodeFloatElement;
        String strDecodeStringElement;
        float fDecodeFloatElement2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = UpdateProfileRequest.$childSerializers;
        int i14 = 10;
        String strDecodeStringElement2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            Gender gender2 = (Gender) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            PhysiologicalBaseline physiologicalBaseline2 = (PhysiologicalBaseline) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            physiologicalBaseline = physiologicalBaseline2;
            str2 = strDecodeStringElement3;
            str3 = str11;
            fDecodeFloatElement = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 10);
            fDecodeFloatElement2 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 11);
            str8 = strDecodeStringElement7;
            gender = gender2;
            str4 = str10;
            str6 = strDecodeStringElement5;
            str7 = strDecodeStringElement6;
            str5 = strDecodeStringElement4;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 12);
            i13 = 8191;
            str = str9;
        } else {
            int i15 = 12;
            int i16 = 0;
            String str12 = null;
            Gender gender3 = null;
            PhysiologicalBaseline physiologicalBaseline3 = null;
            String str13 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            boolean z4 = true;
            float fDecodeFloatElement3 = 0.0f;
            float fDecodeFloatElement4 = 0.0f;
            String str14 = null;
            String strDecodeStringElement12 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 12;
                        break;
                    case 0:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i16 |= 1;
                        i15 = 12;
                        i14 = 10;
                        break;
                    case 1:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str12);
                        i16 |= 2;
                        i15 = 12;
                        i14 = 10;
                        break;
                    case 2:
                        strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        i15 = 12;
                        i14 = 10;
                        break;
                    case 3:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i16 |= 8;
                        i15 = 12;
                        i14 = 10;
                        break;
                    case 4:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i16 |= 16;
                        i15 = 12;
                        i14 = 10;
                        break;
                    case 5:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str14);
                        i16 |= 32;
                        i15 = 12;
                        i14 = 10;
                        break;
                    case 6:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str13);
                        i16 |= 64;
                        i15 = 12;
                        i14 = 10;
                        break;
                    case 7:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i16 |= 128;
                        i15 = 12;
                        break;
                    case 8:
                        gender3 = (Gender) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), gender3);
                        i16 |= 256;
                        i15 = 12;
                        break;
                    case 9:
                        physiologicalBaseline3 = (PhysiologicalBaseline) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), physiologicalBaseline3);
                        i16 |= 512;
                        i15 = 12;
                        break;
                    case 10:
                        fDecodeFloatElement3 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, i14);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    case 11:
                        fDecodeFloatElement4 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 11);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        break;
                    case 12:
                        strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i15);
                        i16 |= 4096;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str12;
            str2 = strDecodeStringElement2;
            i13 = i16;
            gender = gender3;
            physiologicalBaseline = physiologicalBaseline3;
            str3 = str13;
            str4 = str14;
            str5 = strDecodeStringElement12;
            str6 = strDecodeStringElement8;
            str7 = strDecodeStringElement9;
            str8 = strDecodeStringElement10;
            fDecodeFloatElement = fDecodeFloatElement3;
            strDecodeStringElement = strDecodeStringElement11;
            fDecodeFloatElement2 = fDecodeFloatElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new UpdateProfileRequest(i13, str2, str, str5, str6, str7, str4, str3, str8, gender, physiologicalBaseline, fDecodeFloatElement, fDecodeFloatElement2, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, UpdateProfileRequest value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        UpdateProfileRequest.write$Self$profile_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
