package com.whoop.communityeverydaystats.domain.models;

import com.whoop.design.models.AchievementsBackgroundStyle;
import com.whoop.design.models.AchievementsBackgroundStyleSerializer;
import com.whoop.design.models.colortheme.ColorThemeModel;
import com.whoop.design.models.colortheme.ColorThemeModel$$serializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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
import xq0.EnumC38541a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CommunitySnapshotContainerModel$$serializer implements GeneratedSerializer<CommunitySnapshotContainerModel> {
    public static final int $stable;
    public static final CommunitySnapshotContainerModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CommunitySnapshotContainerModel$$serializer communitySnapshotContainerModel$$serializer = new CommunitySnapshotContainerModel$$serializer();
        INSTANCE = communitySnapshotContainerModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.communityeverydaystats.domain.models.CommunitySnapshotContainerModel", communitySnapshotContainerModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("progressSegmentCount", false);
        pluginGeneratedSerialDescriptor.addElement("activeSegmentIndex", false);
        pluginGeneratedSerialDescriptor.addElement("nextAction", false);
        pluginGeneratedSerialDescriptor.addElement("backAction", false);
        pluginGeneratedSerialDescriptor.addElement("backgroundImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("photoRevealFraction", true);
        pluginGeneratedSerialDescriptor.addElement("items", true);
        pluginGeneratedSerialDescriptor.addElement("headerOverlayItems", true);
        pluginGeneratedSerialDescriptor.addElement("footerOverlayItems", true);
        pluginGeneratedSerialDescriptor.addElement("achievementBackgroundStyle", true);
        pluginGeneratedSerialDescriptor.addElement("colors", true);
        pluginGeneratedSerialDescriptor.addElement("securityPolicy", true);
        pluginGeneratedSerialDescriptor.addElement("borderStyle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CommunitySnapshotContainerModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = CommunitySnapshotContainerModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        GenericInteraction$$serializer genericInteraction$$serializer = GenericInteraction$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, intSerializer, intSerializer, genericInteraction$$serializer, AbstractC38195a.m122336d(genericInteraction$$serializer), AbstractC38195a.m122336d(stringSerializer), FloatSerializer.INSTANCE, interfaceC23462hArr[7].getValue(), interfaceC23462hArr[8].getValue(), interfaceC23462hArr[9].getValue(), AbstractC38195a.m122336d(AchievementsBackgroundStyleSerializer.INSTANCE), AbstractC38195a.m122336d(ColorThemeModel$$serializer.INSTANCE), AbstractC38195a.m122336d(SecurityPolicyModel$$serializer.INSTANCE), interfaceC23462hArr[13].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CommunitySnapshotContainerModel deserialize(InterfaceC40541d decoder) {
        String strDecodeStringElement;
        int i13;
        int i14;
        GenericInteraction genericInteraction;
        AchievementsBackgroundStyle achievementsBackgroundStyle;
        List list;
        List list2;
        List list3;
        String str;
        GenericInteraction genericInteraction2;
        EnumC38541a enumC38541a;
        ColorThemeModel colorThemeModel;
        SecurityPolicyModel securityPolicyModel;
        float f13;
        int i15;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = CommunitySnapshotContainerModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
            GenericInteraction$$serializer genericInteraction$$serializer = GenericInteraction$$serializer.INSTANCE;
            GenericInteraction genericInteraction3 = (GenericInteraction) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, genericInteraction$$serializer, null);
            GenericInteraction genericInteraction4 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, genericInteraction$$serializer, null);
            String str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, null);
            float fDecodeFloatElement = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 6);
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            List list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            List list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            AchievementsBackgroundStyle achievementsBackgroundStyle2 = (AchievementsBackgroundStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, AchievementsBackgroundStyleSerializer.INSTANCE, null);
            ColorThemeModel colorThemeModel2 = (ColorThemeModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, ColorThemeModel$$serializer.INSTANCE, null);
            SecurityPolicyModel securityPolicyModel2 = (SecurityPolicyModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, SecurityPolicyModel$$serializer.INSTANCE, null);
            i13 = 16383;
            enumC38541a = (EnumC38541a) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            i14 = iDecodeIntElement;
            achievementsBackgroundStyle = achievementsBackgroundStyle2;
            f13 = fDecodeFloatElement;
            str = str2;
            genericInteraction = genericInteraction3;
            genericInteraction2 = genericInteraction4;
            i15 = iDecodeIntElement2;
            list2 = list4;
            list = list6;
            list3 = list5;
            securityPolicyModel = securityPolicyModel2;
            colorThemeModel = colorThemeModel2;
        } else {
            float fDecodeFloatElement2 = 0.0f;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            strDecodeStringElement = null;
            AchievementsBackgroundStyle achievementsBackgroundStyle3 = null;
            List list7 = null;
            List list8 = null;
            List list9 = null;
            String str3 = null;
            boolean z4 = true;
            int i16 = 9;
            int i17 = 7;
            int i18 = 8;
            i13 = 0;
            GenericInteraction genericInteraction5 = null;
            GenericInteraction genericInteraction6 = null;
            EnumC38541a enumC38541a2 = null;
            ColorThemeModel colorThemeModel3 = null;
            SecurityPolicyModel securityPolicyModel3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i17 = 7;
                        i18 = 8;
                        i16 = 9;
                        break;
                    case 0:
                        i13 |= 1;
                        iDecodeIntElement3 = iDecodeIntElement3;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i17 = 7;
                        i18 = 8;
                        i16 = 9;
                        break;
                    case 1:
                        i13 |= 2;
                        iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
                        i17 = 7;
                        i18 = 8;
                        i16 = 9;
                        break;
                    case 2:
                        iDecodeIntElement4 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
                        i13 |= 4;
                        iDecodeIntElement3 = iDecodeIntElement3;
                        i17 = 7;
                        i18 = 8;
                        i16 = 9;
                        break;
                    case 3:
                        genericInteraction5 = (GenericInteraction) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, GenericInteraction$$serializer.INSTANCE, genericInteraction5);
                        i13 |= 8;
                        iDecodeIntElement3 = iDecodeIntElement3;
                        i17 = 7;
                        i18 = 8;
                        i16 = 9;
                        break;
                    case 4:
                        genericInteraction6 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, GenericInteraction$$serializer.INSTANCE, genericInteraction6);
                        i13 |= 16;
                        iDecodeIntElement3 = iDecodeIntElement3;
                        i17 = 7;
                        i18 = 8;
                        i16 = 9;
                        break;
                    case 5:
                        str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str3);
                        i13 |= 32;
                        iDecodeIntElement3 = iDecodeIntElement3;
                        i17 = 7;
                        i18 = 8;
                        i16 = 9;
                        break;
                    case 6:
                        fDecodeFloatElement2 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 6);
                        i13 |= 64;
                        iDecodeIntElement3 = iDecodeIntElement3;
                        i18 = 8;
                        i16 = 9;
                        break;
                    case 7:
                        list8 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list8);
                        i13 |= 128;
                        iDecodeIntElement3 = iDecodeIntElement3;
                        i18 = 8;
                        i16 = 9;
                        break;
                    case 8:
                        list9 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), list9);
                        i13 |= 256;
                        iDecodeIntElement3 = iDecodeIntElement3;
                        i16 = 9;
                        break;
                    case 9:
                        list7 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list7);
                        i13 |= 512;
                        iDecodeIntElement3 = iDecodeIntElement3;
                        break;
                    case 10:
                        achievementsBackgroundStyle3 = (AchievementsBackgroundStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, AchievementsBackgroundStyleSerializer.INSTANCE, achievementsBackgroundStyle3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        iDecodeIntElement3 = iDecodeIntElement3;
                        break;
                    case 11:
                        colorThemeModel3 = (ColorThemeModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, ColorThemeModel$$serializer.INSTANCE, colorThemeModel3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        iDecodeIntElement3 = iDecodeIntElement3;
                        break;
                    case 12:
                        securityPolicyModel3 = (SecurityPolicyModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, SecurityPolicyModel$$serializer.INSTANCE, securityPolicyModel3);
                        i13 |= 4096;
                        iDecodeIntElement3 = iDecodeIntElement3;
                        break;
                    case 13:
                        enumC38541a2 = (EnumC38541a) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), enumC38541a2);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        iDecodeIntElement3 = iDecodeIntElement3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i14 = iDecodeIntElement3;
            genericInteraction = genericInteraction5;
            achievementsBackgroundStyle = achievementsBackgroundStyle3;
            list = list7;
            list2 = list8;
            list3 = list9;
            str = str3;
            genericInteraction2 = genericInteraction6;
            enumC38541a = enumC38541a2;
            colorThemeModel = colorThemeModel3;
            securityPolicyModel = securityPolicyModel3;
            f13 = fDecodeFloatElement2;
            i15 = iDecodeIntElement4;
        }
        String str4 = strDecodeStringElement;
        int i19 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CommunitySnapshotContainerModel(i19, str4, i14, i15, genericInteraction, genericInteraction2, str, f13, list2, list3, list, achievementsBackgroundStyle, colorThemeModel, securityPolicyModel, enumC38541a, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CommunitySnapshotContainerModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CommunitySnapshotContainerModel.write$Self$community_everyday_stats_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
