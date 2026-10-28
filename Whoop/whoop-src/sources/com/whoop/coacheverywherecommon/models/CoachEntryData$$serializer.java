package com.whoop.coacheverywherecommon.models;

import com.whoop.navigation.DrawerPresentation;
import ep0.EnumC13400f;
import ep0.EnumC13401g;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/coacheverywherecommon/models/CoachEntryData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/coacheverywherecommon/models/CoachEntryData;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/coacheverywherecommon/models/CoachEntryData;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/coacheverywherecommon/models/CoachEntryData;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CoachEntryData$$serializer implements GeneratedSerializer<CoachEntryData> {
    public static final int $stable;
    public static final CoachEntryData$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CoachEntryData$$serializer coachEntryData$$serializer = new CoachEntryData$$serializer();
        INSTANCE = coachEntryData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.coacheverywherecommon.models.CoachEntryData", coachEntryData$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("showMic", true);
        pluginGeneratedSerialDescriptor.addElement("useVoice", true);
        pluginGeneratedSerialDescriptor.addElement("placeholder", true);
        pluginGeneratedSerialDescriptor.addElement("onLoadStyle", true);
        pluginGeneratedSerialDescriptor.addElement("loadStyle", true);
        pluginGeneratedSerialDescriptor.addElement("maxLines", true);
        pluginGeneratedSerialDescriptor.addElement("drawerPresentation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CoachEntryData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = CoachEntryData.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(StringSerializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[3].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue()), AbstractC38195a.m122336d(IntSerializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CoachEntryData deserialize(InterfaceC40541d decoder) {
        int i13;
        DrawerPresentation drawerPresentation;
        Integer num;
        Boolean bool;
        Boolean bool2;
        String str;
        EnumC13400f enumC13400f;
        EnumC13401g enumC13401g;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = CoachEntryData.$childSerializers;
        int i14 = 5;
        Boolean bool3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, booleanSerializer, null);
            Boolean bool5 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, booleanSerializer, null);
            String str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, null);
            EnumC13400f enumC13400f2 = (EnumC13400f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            EnumC13401g enumC13401g2 = (EnumC13401g) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, IntSerializer.INSTANCE, null);
            drawerPresentation = (DrawerPresentation) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            bool2 = bool5;
            num = num2;
            str = str2;
            i13 = 127;
            enumC13400f = enumC13400f2;
            enumC13401g = enumC13401g2;
            bool = bool4;
        } else {
            boolean z4 = true;
            int i15 = 0;
            DrawerPresentation drawerPresentation2 = null;
            Integer num3 = null;
            Boolean bool6 = null;
            String str3 = null;
            EnumC13400f enumC13400f3 = null;
            EnumC13401g enumC13401g3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 5;
                        break;
                    case 0:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, BooleanSerializer.INSTANCE, bool3);
                        i15 |= 1;
                        i14 = 5;
                        break;
                    case 1:
                        bool6 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, BooleanSerializer.INSTANCE, bool6);
                        i15 |= 2;
                        i14 = 5;
                        break;
                    case 2:
                        str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str3);
                        i15 |= 4;
                        i14 = 5;
                        break;
                    case 3:
                        enumC13400f3 = (EnumC13400f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), enumC13400f3);
                        i15 |= 8;
                        break;
                    case 4:
                        enumC13401g3 = (EnumC13401g) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), enumC13401g3);
                        i15 |= 16;
                        break;
                    case 5:
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, IntSerializer.INSTANCE, num3);
                        i15 |= 32;
                        break;
                    case 6:
                        drawerPresentation2 = (DrawerPresentation) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), drawerPresentation2);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            drawerPresentation = drawerPresentation2;
            num = num3;
            bool = bool3;
            bool2 = bool6;
            str = str3;
            enumC13400f = enumC13400f3;
            enumC13401g = enumC13401g3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CoachEntryData(i13, bool, bool2, str, enumC13400f, enumC13401g, num, drawerPresentation, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CoachEntryData value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CoachEntryData.write$Self$coach_everywhere_common_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
