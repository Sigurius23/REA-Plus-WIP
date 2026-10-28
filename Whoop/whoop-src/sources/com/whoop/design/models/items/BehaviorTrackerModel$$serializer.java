package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.whoop.data.remote.domain.dto.JournalMagnitudeDto;
import com.whoop.data.remote.domain.dto.JournalMagnitudeDto$$serializer;
import com.whoop.data.remote.domain.dto.WeeklyPlanGoalDto;
import com.whoop.data.remote.domain.dto.WeeklyPlanGoalDto$$serializer;
import com.whoop.navigation.C9598e;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/BehaviorTrackerModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/BehaviorTrackerModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/BehaviorTrackerModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/BehaviorTrackerModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class BehaviorTrackerModel$$serializer implements GeneratedSerializer<BehaviorTrackerModel> {
    public static final int $stable;
    public static final BehaviorTrackerModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        BehaviorTrackerModel$$serializer behaviorTrackerModel$$serializer = new BehaviorTrackerModel$$serializer();
        INSTANCE = behaviorTrackerModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.BehaviorTrackerModel", behaviorTrackerModel$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("questionType", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("questionText", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_STATUS, false);
        pluginGeneratedSerialDescriptor.addElement("sticky", false);
        pluginGeneratedSerialDescriptor.addElement("magnitude", false);
        pluginGeneratedSerialDescriptor.addElement("category", false);
        pluginGeneratedSerialDescriptor.addElement("deprecated", false);
        pluginGeneratedSerialDescriptor.addElement("createdAt", false);
        pluginGeneratedSerialDescriptor.addElement("updatedAt", false);
        pluginGeneratedSerialDescriptor.addElement("timeLabel", false);
        pluginGeneratedSerialDescriptor.addElement("timeContextLabel", false);
        pluginGeneratedSerialDescriptor.addElement("weeklyPlanGoal", false);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BehaviorTrackerModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = BehaviorTrackerModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d(booleanSerializer);
        InterfaceC37138c interfaceC37138cM122336d7 = AbstractC38195a.m122336d(JournalMagnitudeDto$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d8 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d9 = AbstractC38195a.m122336d(booleanSerializer);
        InterfaceC37138c interfaceC37138cM122336d10 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d11 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d12 = AbstractC38195a.m122336d(WeeklyPlanGoalDto$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d13 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[15].getValue());
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new InterfaceC37138c[]{IntSerializer.INSTANCE, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, interfaceC37138cM122336d5, interfaceC37138cM122336d6, interfaceC37138cM122336d7, interfaceC37138cM122336d8, interfaceC37138cM122336d9, doubleSerializer, doubleSerializer, interfaceC37138cM122336d10, interfaceC37138cM122336d11, interfaceC37138cM122336d12, interfaceC37138cM122336d13};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final BehaviorTrackerModel deserialize(InterfaceC40541d decoder) {
        String str;
        Boolean bool;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Boolean bool2;
        JournalMagnitudeDto journalMagnitudeDto;
        WeeklyPlanGoalDto weeklyPlanGoalDto;
        String str8;
        C9598e c9598e;
        int i13;
        int i14;
        double d3;
        double d14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = BehaviorTrackerModel.$childSerializers;
        String str9 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, booleanSerializer, null);
            JournalMagnitudeDto journalMagnitudeDto2 = (JournalMagnitudeDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, JournalMagnitudeDto$$serializer.INSTANCE, null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            Boolean bool4 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, booleanSerializer, null);
            double dDecodeDoubleElement = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 10);
            double dDecodeDoubleElement2 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 11);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, stringSerializer, null);
            String str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, stringSerializer, null);
            weeklyPlanGoalDto = (WeeklyPlanGoalDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, WeeklyPlanGoalDto$$serializer.INSTANCE, null);
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, (InterfaceC37137b) interfaceC23462hArr[15].getValue(), null);
            i14 = iDecodeIntElement;
            str4 = str11;
            str = str10;
            i13 = 65535;
            bool2 = bool4;
            journalMagnitudeDto = journalMagnitudeDto2;
            str8 = str15;
            bool = bool3;
            str2 = str14;
            str5 = str12;
            str7 = str16;
            str3 = str13;
            str6 = str17;
            d3 = dDecodeDoubleElement;
            d14 = dDecodeDoubleElement2;
        } else {
            double dDecodeDoubleElement3 = 0.0d;
            double dDecodeDoubleElement4 = 0.0d;
            boolean z4 = true;
            int i15 = 0;
            int iDecodeIntElement2 = 0;
            C9598e c9598e2 = null;
            Boolean bool5 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            Boolean bool6 = null;
            JournalMagnitudeDto journalMagnitudeDto3 = null;
            WeeklyPlanGoalDto weeklyPlanGoalDto2 = null;
            String str24 = null;
            while (z4) {
                String str25 = str9;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        c9598e2 = c9598e2;
                        str9 = str25;
                        i15 = i15;
                        break;
                    case 0:
                        iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
                        str9 = str25;
                        i15 |= 1;
                        c9598e2 = c9598e2;
                        break;
                    case 1:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str25);
                        i15 |= 2;
                        c9598e2 = c9598e2;
                        break;
                    case 2:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str20);
                        i15 |= 4;
                        str9 = str25;
                        break;
                    case 3:
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str21);
                        i15 |= 8;
                        str9 = str25;
                        str20 = str20;
                        break;
                    case 4:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str19);
                        i15 |= 16;
                        str9 = str25;
                        str20 = str20;
                        break;
                    case 5:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str18);
                        i15 |= 32;
                        str9 = str25;
                        str20 = str20;
                        break;
                    case 6:
                        bool5 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, BooleanSerializer.INSTANCE, bool5);
                        i15 |= 64;
                        str9 = str25;
                        str20 = str20;
                        break;
                    case 7:
                        journalMagnitudeDto3 = (JournalMagnitudeDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, JournalMagnitudeDto$$serializer.INSTANCE, journalMagnitudeDto3);
                        i15 |= 128;
                        str9 = str25;
                        str20 = str20;
                        break;
                    case 8:
                        str24 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str24);
                        i15 |= 256;
                        str9 = str25;
                        str20 = str20;
                        break;
                    case 9:
                        bool6 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, BooleanSerializer.INSTANCE, bool6);
                        i15 |= 512;
                        str9 = str25;
                        str20 = str20;
                        break;
                    case 10:
                        dDecodeDoubleElement3 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 10);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        str9 = str25;
                        str20 = str20;
                        break;
                    case 11:
                        dDecodeDoubleElement4 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 11);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        str9 = str25;
                        str20 = str20;
                        break;
                    case 12:
                        str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, StringSerializer.INSTANCE, str23);
                        i15 |= 4096;
                        str9 = str25;
                        str20 = str20;
                        break;
                    case 13:
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, str22);
                        i15 |= DfuBaseService.ERROR_REMOTE_MASK;
                        str9 = str25;
                        str20 = str20;
                        break;
                    case 14:
                        weeklyPlanGoalDto2 = (WeeklyPlanGoalDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, WeeklyPlanGoalDto$$serializer.INSTANCE, weeklyPlanGoalDto2);
                        i15 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        str9 = str25;
                        str20 = str20;
                        break;
                    case 15:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, (InterfaceC37137b) interfaceC23462hArr[15].getValue(), c9598e2);
                        i15 |= 32768;
                        str9 = str25;
                        str20 = str20;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str9;
            bool = bool5;
            str2 = str18;
            str3 = str19;
            str4 = str20;
            str5 = str21;
            str6 = str22;
            str7 = str23;
            bool2 = bool6;
            journalMagnitudeDto = journalMagnitudeDto3;
            weeklyPlanGoalDto = weeklyPlanGoalDto2;
            str8 = str24;
            c9598e = c9598e2;
            i13 = i15;
            i14 = iDecodeIntElement2;
            d3 = dDecodeDoubleElement3;
            d14 = dDecodeDoubleElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new BehaviorTrackerModel(i13, i14, str, str4, str5, str3, str2, bool, journalMagnitudeDto, str8, bool2, d3, d14, str7, str6, weeklyPlanGoalDto, c9598e, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, BehaviorTrackerModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        BehaviorTrackerModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
