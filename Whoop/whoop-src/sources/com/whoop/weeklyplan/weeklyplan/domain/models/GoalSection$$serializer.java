package com.whoop.weeklyplan.weeklyplan.domain.models;

import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.SecondaryButtonModel$$serializer;
import com.whoop.navigation.C9598e;
import hy0.EnumC17740f;
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
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weeklyplan/weeklyplan/domain/models/GoalSection.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class GoalSection$$serializer implements GeneratedSerializer<GoalSection> {
    public static final int $stable;
    public static final GoalSection$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        GoalSection$$serializer goalSection$$serializer = new GoalSection$$serializer();
        INSTANCE = goalSection$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weeklyplan.weeklyplan.domain.models.GoalSection", goalSection$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement("titleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("titleImage", false);
        pluginGeneratedSerialDescriptor.addElement("subtitleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("actionDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("style", false);
        pluginGeneratedSerialDescriptor.addElement("titleStyle", false);
        pluginGeneratedSerialDescriptor.addElement("goalCards", false);
        pluginGeneratedSerialDescriptor.addElement("calloutDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("calloutCtaDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("secondaryButton", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GoalSection$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = GoalSection.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[0].getValue()), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), interfaceC23462hArr[8].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(SecondaryButtonModel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final GoalSection deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        C9598e c9598e;
        String str2;
        EnumC17740f enumC17740f;
        String str3;
        GoalSectionStyle goalSectionStyle;
        String str4;
        String str5;
        List list;
        String str6;
        String str7;
        SecondaryButtonModel secondaryButtonModel;
        String str8;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = GoalSection.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            GoalSectionStyle goalSectionStyle2 = (GoalSectionStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            EnumC17740f enumC17740f2 = (EnumC17740f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            i13 = 8191;
            secondaryButtonModel = (SecondaryButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, SecondaryButtonModel$$serializer.INSTANCE, null);
            c9598e = c9598e2;
            str8 = strDecodeStringElement;
            goalSectionStyle = goalSectionStyle2;
            str5 = str13;
            str3 = str12;
            str7 = str10;
            str4 = str11;
            str = str9;
            enumC17740f = enumC17740f2;
            str6 = str14;
            str2 = str15;
            list = list2;
        } else {
            int i14 = 0;
            SecondaryButtonModel secondaryButtonModel2 = null;
            C9598e c9598e3 = null;
            String strDecodeStringElement2 = null;
            String str16 = null;
            EnumC17740f enumC17740f3 = null;
            String str17 = null;
            GoalSectionStyle goalSectionStyle3 = null;
            String str18 = null;
            int i15 = 7;
            int i16 = 6;
            int i17 = 8;
            int i18 = 1;
            i13 = 0;
            String str19 = null;
            String str20 = null;
            List list3 = null;
            String str21 = null;
            String str22 = null;
            while (i18 != 0) {
                String str23 = strDecodeStringElement2;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        i18 = i14;
                        strDecodeStringElement2 = str23;
                        i16 = 6;
                        i15 = 7;
                        i17 = 8;
                        secondaryButtonModel2 = secondaryButtonModel2;
                        i14 = i18;
                        break;
                    case 0:
                        int i19 = i14;
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i19, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), c9598e3);
                        i13 |= 1;
                        i14 = i19;
                        secondaryButtonModel2 = secondaryButtonModel2;
                        strDecodeStringElement2 = str23;
                        i16 = 6;
                        i15 = 7;
                        i17 = 8;
                        break;
                    case 1:
                        c9598e3 = c9598e3;
                        i13 |= 2;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        c9598e3 = c9598e3;
                        i16 = 6;
                        i15 = 7;
                        i17 = 8;
                        break;
                    case 2:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str19);
                        i13 |= 4;
                        strDecodeStringElement2 = str23;
                        c9598e3 = c9598e3;
                        i16 = 6;
                        i15 = 7;
                        i17 = 8;
                        break;
                    case 3:
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str22);
                        i13 |= 8;
                        strDecodeStringElement2 = str23;
                        c9598e3 = c9598e3;
                        i16 = 6;
                        i15 = 7;
                        i17 = 8;
                        break;
                    case 4:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str18);
                        i13 |= 16;
                        strDecodeStringElement2 = str23;
                        c9598e3 = c9598e3;
                        i16 = 6;
                        i15 = 7;
                        i17 = 8;
                        break;
                    case 5:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str17);
                        i13 |= 32;
                        strDecodeStringElement2 = str23;
                        c9598e3 = c9598e3;
                        i16 = 6;
                        i15 = 7;
                        i17 = 8;
                        break;
                    case 6:
                        goalSectionStyle3 = (GoalSectionStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), goalSectionStyle3);
                        i13 |= 64;
                        strDecodeStringElement2 = str23;
                        c9598e3 = c9598e3;
                        i15 = 7;
                        i17 = 8;
                        break;
                    case 7:
                        enumC17740f3 = (EnumC17740f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), enumC17740f3);
                        i13 |= 128;
                        strDecodeStringElement2 = str23;
                        c9598e3 = c9598e3;
                        i17 = 8;
                        break;
                    case 8:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list3);
                        i13 |= 256;
                        strDecodeStringElement2 = str23;
                        c9598e3 = c9598e3;
                        break;
                    case 9:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str20);
                        i13 |= 512;
                        strDecodeStringElement2 = str23;
                        c9598e3 = c9598e3;
                        break;
                    case 10:
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str21);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        strDecodeStringElement2 = str23;
                        c9598e3 = c9598e3;
                        break;
                    case 11:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str16);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        strDecodeStringElement2 = str23;
                        c9598e3 = c9598e3;
                        break;
                    case 12:
                        secondaryButtonModel2 = (SecondaryButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, SecondaryButtonModel$$serializer.INSTANCE, secondaryButtonModel2);
                        i13 |= 4096;
                        strDecodeStringElement2 = str23;
                        c9598e3 = c9598e3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str19;
            c9598e = c9598e3;
            str2 = str16;
            enumC17740f = enumC17740f3;
            str3 = str17;
            goalSectionStyle = goalSectionStyle3;
            str4 = str18;
            str5 = str20;
            list = list3;
            str6 = str21;
            str7 = str22;
            secondaryButtonModel = secondaryButtonModel2;
            str8 = strDecodeStringElement2;
        }
        int i24 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new GoalSection(i24, c9598e, str8, str, str7, str4, str3, goalSectionStyle, enumC17740f, list, str5, str6, str2, secondaryButtonModel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, GoalSection value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        GoalSection.write$Self$weekly_plan_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
