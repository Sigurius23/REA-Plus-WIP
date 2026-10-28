package com.whoop.healthconnect.domain.models;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/healthconnect/domain/models/HealthConnectEventsResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HealthConnectEventsResponse$$serializer implements GeneratedSerializer<HealthConnectEventsResponse> {
    public static final int $stable;
    public static final HealthConnectEventsResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HealthConnectEventsResponse$$serializer healthConnectEventsResponse$$serializer = new HealthConnectEventsResponse$$serializer();
        INSTANCE = healthConnectEventsResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.healthconnect.domain.models.HealthConnectEventsResponse", healthConnectEventsResponse$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("token", false);
        pluginGeneratedSerialDescriptor.addElement("exerciseSessionRecords", false);
        pluginGeneratedSerialDescriptor.addElement("activeCaloriesBurnedRecords", false);
        pluginGeneratedSerialDescriptor.addElement("sleepSessionRecords", false);
        pluginGeneratedSerialDescriptor.addElement("respiratoryRateRecords", false);
        pluginGeneratedSerialDescriptor.addElement("restingHeartRateRecords", false);
        pluginGeneratedSerialDescriptor.addElement("oxygenSaturationRecords", false);
        pluginGeneratedSerialDescriptor.addElement("heartRateRecords", false);
        pluginGeneratedSerialDescriptor.addElement("stepRecords", false);
        pluginGeneratedSerialDescriptor.addElement("deletedExerciseSessionRecords", false);
        pluginGeneratedSerialDescriptor.addElement("deletedActiveCaloriesBurnedRecords", false);
        pluginGeneratedSerialDescriptor.addElement("deletedSleepSessionRecords", false);
        pluginGeneratedSerialDescriptor.addElement("deletedSleepStageRecords", false);
        pluginGeneratedSerialDescriptor.addElement("deletedRespiratoryRateRecords", false);
        pluginGeneratedSerialDescriptor.addElement("deletedRestingHeartRateRecords", false);
        pluginGeneratedSerialDescriptor.addElement("deletedOxygenSaturationRecords", false);
        pluginGeneratedSerialDescriptor.addElement("deletedHeartRateRecords", false);
        pluginGeneratedSerialDescriptor.addElement("deletedStepRecords", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HealthConnectEventsResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = HealthConnectEventsResponse.$childSerializers;
        return new InterfaceC37138c[]{StringSerializer.INSTANCE, interfaceC23462hArr[1].getValue(), interfaceC23462hArr[2].getValue(), interfaceC23462hArr[3].getValue(), interfaceC23462hArr[4].getValue(), interfaceC23462hArr[5].getValue(), interfaceC23462hArr[6].getValue(), interfaceC23462hArr[7].getValue(), interfaceC23462hArr[8].getValue(), interfaceC23462hArr[9].getValue(), interfaceC23462hArr[10].getValue(), interfaceC23462hArr[11].getValue(), interfaceC23462hArr[12].getValue(), interfaceC23462hArr[13].getValue(), interfaceC23462hArr[14].getValue(), interfaceC23462hArr[15].getValue(), interfaceC23462hArr[16].getValue(), interfaceC23462hArr[17].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HealthConnectEventsResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        List list9;
        List list10;
        List list11;
        List list12;
        List list13;
        List list14;
        List list15;
        List list16;
        List list17;
        String str;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HealthConnectEventsResponse.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            List list18 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            List list19 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            List list20 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            List list21 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            List list22 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            List list23 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            List list24 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            List list25 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            List list26 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            List list27 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            List list28 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), null);
            List list29 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), null);
            List list30 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            List list31 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), null);
            List list32 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 15, (InterfaceC37137b) interfaceC23462hArr[15].getValue(), null);
            i13 = 262143;
            list13 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 16, (InterfaceC37137b) interfaceC23462hArr[16].getValue(), null);
            str = strDecodeStringElement;
            list8 = list25;
            list11 = list21;
            list5 = list19;
            list = list18;
            list12 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 17, (InterfaceC37137b) interfaceC23462hArr[17].getValue(), null);
            list7 = list27;
            list2 = list26;
            list9 = list24;
            list10 = list23;
            list3 = list22;
            list4 = list20;
            list14 = list32;
            list15 = list31;
            list16 = list30;
            list17 = list29;
            list6 = list28;
        } else {
            int i15 = 17;
            int i16 = 8;
            int i17 = 4;
            int i18 = 2;
            int i19 = 1;
            boolean z4 = true;
            List list33 = null;
            List list34 = null;
            List list35 = null;
            List list36 = null;
            List list37 = null;
            List list38 = null;
            List list39 = null;
            List list40 = null;
            List list41 = null;
            List list42 = null;
            String strDecodeStringElement2 = null;
            int i24 = 10;
            int i25 = 9;
            int i26 = 7;
            int i27 = 6;
            int i28 = 5;
            int i29 = 3;
            i13 = 0;
            List list43 = null;
            List list44 = null;
            List list45 = null;
            List list46 = null;
            List list47 = null;
            List list48 = null;
            List list49 = null;
            while (z4) {
                int i34 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        i14 = i19;
                        z4 = false;
                        i15 = 17;
                        i18 = 2;
                        i29 = 3;
                        i17 = 4;
                        i28 = 5;
                        i27 = 6;
                        i26 = 7;
                        i16 = 8;
                        i25 = 9;
                        i24 = 10;
                        i19 = i14;
                        list33 = list33;
                        break;
                    case 0:
                        i14 = i19;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i13 |= 1;
                        i15 = 17;
                        i18 = 2;
                        i29 = 3;
                        i17 = 4;
                        i28 = 5;
                        i27 = 6;
                        i26 = 7;
                        i16 = 8;
                        i25 = 9;
                        i24 = 10;
                        i19 = i14;
                        list33 = list33;
                        break;
                    case 1:
                        i14 = i19;
                        list43 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i19].getValue(), list43);
                        i13 |= 2;
                        list38 = list38;
                        i15 = 17;
                        i18 = 2;
                        i29 = 3;
                        i17 = 4;
                        i28 = 5;
                        i27 = 6;
                        i26 = 7;
                        i16 = 8;
                        i25 = 9;
                        i24 = 10;
                        i19 = i14;
                        list33 = list33;
                        break;
                    case 2:
                        list37 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), list37);
                        i13 |= 4;
                        list33 = list33;
                        list43 = list43;
                        i15 = 17;
                        i29 = 3;
                        i17 = 4;
                        i28 = 5;
                        i27 = 6;
                        i26 = 7;
                        i16 = 8;
                        i25 = 9;
                        i24 = 10;
                        break;
                    case 3:
                        list36 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i29, (InterfaceC37137b) interfaceC23462hArr[i29].getValue(), list36);
                        i13 |= 8;
                        list33 = list33;
                        list43 = list43;
                        i15 = 17;
                        i17 = 4;
                        i28 = 5;
                        i27 = 6;
                        i26 = 7;
                        i16 = 8;
                        i25 = 9;
                        i24 = 10;
                        break;
                    case 4:
                        list49 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list49);
                        i13 |= 16;
                        list33 = list33;
                        list43 = list43;
                        i15 = 17;
                        i28 = 5;
                        i27 = 6;
                        i26 = 7;
                        i16 = 8;
                        i25 = 9;
                        i24 = 10;
                        break;
                    case 5:
                        list35 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i28, (InterfaceC37137b) interfaceC23462hArr[i28].getValue(), list35);
                        i13 |= 32;
                        list33 = list33;
                        list43 = list43;
                        i15 = 17;
                        i27 = 6;
                        i26 = 7;
                        i16 = 8;
                        i25 = 9;
                        i24 = 10;
                        break;
                    case 6:
                        list48 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i27, (InterfaceC37137b) interfaceC23462hArr[i27].getValue(), list48);
                        i13 |= 64;
                        list33 = list33;
                        list43 = list43;
                        i15 = 17;
                        i26 = 7;
                        i16 = 8;
                        i25 = 9;
                        i24 = 10;
                        break;
                    case 7:
                        list47 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i26, (InterfaceC37137b) interfaceC23462hArr[i26].getValue(), list47);
                        i13 |= 128;
                        list33 = list33;
                        list43 = list43;
                        i15 = 17;
                        i16 = 8;
                        i25 = 9;
                        i24 = 10;
                        break;
                    case 8:
                        list46 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list46);
                        i13 |= 256;
                        list33 = list33;
                        list43 = list43;
                        i15 = 17;
                        i25 = 9;
                        i24 = 10;
                        break;
                    case 9:
                        list34 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i25, (InterfaceC37137b) interfaceC23462hArr[i25].getValue(), list34);
                        i13 |= 512;
                        list33 = list33;
                        list43 = list43;
                        i15 = 17;
                        i24 = 10;
                        break;
                    case 10:
                        list45 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i24, (InterfaceC37137b) interfaceC23462hArr[i24].getValue(), list45);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        list33 = list33;
                        list43 = list43;
                        i15 = 17;
                        break;
                    case 11:
                        list44 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), list44);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        list33 = list33;
                        list43 = list43;
                        i15 = 17;
                        break;
                    case 12:
                        list43 = list43;
                        list38 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), list38);
                        i13 |= 4096;
                        list33 = list33;
                        list39 = list39;
                        list43 = list43;
                        i15 = 17;
                        break;
                    case 13:
                        list43 = list43;
                        list39 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), list39);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        list33 = list33;
                        list40 = list40;
                        list43 = list43;
                        i15 = 17;
                        break;
                    case 14:
                        list43 = list43;
                        list40 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), list40);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        list33 = list33;
                        list41 = list41;
                        list43 = list43;
                        i15 = 17;
                        break;
                    case 15:
                        list43 = list43;
                        list41 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 15, (InterfaceC37137b) interfaceC23462hArr[15].getValue(), list41);
                        i13 |= 32768;
                        list33 = list33;
                        list42 = list42;
                        list43 = list43;
                        i15 = 17;
                        break;
                    case 16:
                        list42 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 16, (InterfaceC37137b) interfaceC23462hArr[16].getValue(), list42);
                        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        list33 = list33;
                        list43 = list43;
                        i15 = 17;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        list33 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i34, (InterfaceC37137b) interfaceC23462hArr[i34].getValue(), list33);
                        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i15 = i34;
                        list43 = list43;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list43;
            list2 = list34;
            list3 = list35;
            list4 = list36;
            list5 = list37;
            list6 = list44;
            list7 = list45;
            list8 = list46;
            list9 = list47;
            list10 = list48;
            list11 = list49;
            list12 = list33;
            list13 = list42;
            list14 = list41;
            list15 = list40;
            list16 = list39;
            list17 = list38;
            str = strDecodeStringElement2;
        }
        int i35 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HealthConnectEventsResponse(i35, str, list, list5, list4, list11, list3, list10, list9, list8, list2, list7, list6, list17, list16, list15, list14, list13, list12, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HealthConnectEventsResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HealthConnectEventsResponse.write$Self$health_connect_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
