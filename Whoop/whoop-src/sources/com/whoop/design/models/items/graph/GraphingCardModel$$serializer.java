package com.whoop.design.models.items.graph;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator;
import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator$$serializer;
import com.whoop.design.models.items.CheckmarkStyle;
import com.whoop.design.models.items.UnlockTrendsCardModel;
import com.whoop.design.models.items.UnlockTrendsCardModel$$serializer;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/graph/GraphingCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/graph/GraphingCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/graph/GraphingCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/graph/GraphingCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class GraphingCardModel$$serializer implements GeneratedSerializer<GraphingCardModel> {
    public static final int $stable;
    public static final GraphingCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        GraphingCardModel$$serializer graphingCardModel$$serializer = new GraphingCardModel$$serializer();
        INSTANCE = graphingCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.graph.GraphingCardModel", graphingCardModel$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("graph", false);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("endIcon", true);
        pluginGeneratedSerialDescriptor.addElement("trendsCta", true);
        pluginGeneratedSerialDescriptor.addElement("trendCtaText", true);
        pluginGeneratedSerialDescriptor.addElement("progressDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("sevenDayVow", true);
        pluginGeneratedSerialDescriptor.addElement("checkmarkStyle", true);
        pluginGeneratedSerialDescriptor.addElement("graphLegends", true);
        pluginGeneratedSerialDescriptor.addElement("destination", true);
        pluginGeneratedSerialDescriptor.addElement("planProgressStatus", true);
        pluginGeneratedSerialDescriptor.addElement("circularProgressIndicator", true);
        pluginGeneratedSerialDescriptor.addElement("unlockTrendsCard", true);
        pluginGeneratedSerialDescriptor.addElement("subItems", true);
        pluginGeneratedSerialDescriptor.addElement("theme", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GraphingCardModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = GraphingCardModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{GraphModel$$serializer.INSTANCE, AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[9].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[11].getValue()), AbstractC38195a.m122336d(PlanProgressStatusModel$$serializer.INSTANCE), AbstractC38195a.m122336d(CircularProgressIndicator$$serializer.INSTANCE), AbstractC38195a.m122336d(UnlockTrendsCardModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[15].getValue()), AbstractC38195a.m122336d(GraphingCardTheme$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final GraphingCardModel deserialize(InterfaceC40541d decoder) {
        GraphModel graphModel;
        String str;
        GraphingCardTheme graphingCardTheme;
        List list;
        CheckmarkStyle checkmarkStyle;
        String str2;
        String str3;
        CircularProgressIndicator circularProgressIndicator;
        C9598e c9598e;
        String str4;
        PlanProgressStatusModel planProgressStatusModel;
        UnlockTrendsCardModel unlockTrendsCardModel;
        String str5;
        String str6;
        EnumC16313m0 enumC16313m0;
        List list2;
        int i13;
        String str7;
        EnumC16313m0 enumC16313m1;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = GraphingCardModel.$childSerializers;
        UnlockTrendsCardModel unlockTrendsCardModel2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            graphModel = (GraphModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, GraphModel$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            EnumC16313m0 enumC16313m2 = (EnumC16313m0) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            CheckmarkStyle checkmarkStyle2 = (CheckmarkStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), null);
            PlanProgressStatusModel planProgressStatusModel2 = (PlanProgressStatusModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, PlanProgressStatusModel$$serializer.INSTANCE, null);
            CircularProgressIndicator circularProgressIndicator2 = (CircularProgressIndicator) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, CircularProgressIndicator$$serializer.INSTANCE, null);
            UnlockTrendsCardModel unlockTrendsCardModel3 = (UnlockTrendsCardModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, UnlockTrendsCardModel$$serializer.INSTANCE, null);
            List list4 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, (InterfaceC37137b) interfaceC23462hArr[15].getValue(), null);
            graphingCardTheme = (GraphingCardTheme) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, GraphingCardTheme$$serializer.INSTANCE, null);
            enumC16313m0 = enumC16313m2;
            str4 = str8;
            str2 = str13;
            str5 = str12;
            str3 = str11;
            str = str10;
            str6 = str9;
            checkmarkStyle = checkmarkStyle2;
            list = list3;
            str7 = strDecodeStringElement;
            i13 = 131071;
            list2 = list4;
            unlockTrendsCardModel = unlockTrendsCardModel3;
            circularProgressIndicator = circularProgressIndicator2;
            planProgressStatusModel = planProgressStatusModel2;
            c9598e = c9598e2;
        } else {
            int i14 = 4;
            boolean z4 = true;
            int i15 = 0;
            int i16 = 9;
            List list5 = null;
            String str14 = null;
            EnumC16313m0 enumC16313m3 = null;
            GraphingCardTheme graphingCardTheme2 = null;
            List list6 = null;
            CheckmarkStyle checkmarkStyle3 = null;
            String str15 = null;
            String str16 = null;
            CircularProgressIndicator circularProgressIndicator3 = null;
            C9598e c9598e3 = null;
            String str17 = null;
            PlanProgressStatusModel planProgressStatusModel3 = null;
            String strDecodeStringElement2 = null;
            GraphModel graphModel2 = null;
            String str18 = null;
            String str19 = null;
            while (z4) {
                EnumC16313m0 enumC16313m4 = enumC16313m3;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        str14 = str14;
                        list5 = list5;
                        i14 = 4;
                        i16 = 9;
                        str17 = str17;
                        enumC16313m3 = enumC16313m4;
                        break;
                    case 0:
                        graphModel2 = (GraphModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, GraphModel$$serializer.INSTANCE, graphModel2);
                        i15 |= 1;
                        str14 = str14;
                        list5 = list5;
                        i14 = 4;
                        i16 = 9;
                        str17 = str17;
                        enumC16313m3 = enumC16313m4;
                        break;
                    case 1:
                        enumC16313m1 = enumC16313m4;
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str18);
                        i15 |= 2;
                        str17 = str17;
                        str19 = str19;
                        enumC16313m3 = enumC16313m1;
                        list5 = list5;
                        i14 = 4;
                        i16 = 9;
                        break;
                    case 2:
                        enumC16313m1 = enumC16313m4;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        str17 = str17;
                        i15 |= 4;
                        enumC16313m3 = enumC16313m1;
                        list5 = list5;
                        i14 = 4;
                        i16 = 9;
                        break;
                    case 3:
                        enumC16313m1 = enumC16313m4;
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str19);
                        i15 |= 8;
                        str17 = str17;
                        enumC16313m3 = enumC16313m1;
                        list5 = list5;
                        i14 = 4;
                        i16 = 9;
                        break;
                    case 4:
                        int i17 = i15;
                        String str20 = str17;
                        InterfaceC37137b interfaceC37137b = (InterfaceC37137b) interfaceC23462hArr[i14].getValue();
                        int i18 = i14;
                        enumC16313m3 = (EnumC16313m0) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i18, interfaceC37137b, enumC16313m4);
                        i15 = i17 | 16;
                        str17 = str20;
                        i14 = i18;
                        list5 = list5;
                        i16 = 9;
                        break;
                    case 5:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str17);
                        i15 |= 32;
                        enumC16313m3 = enumC16313m4;
                        i16 = 9;
                        break;
                    case 6:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str16);
                        i15 |= 64;
                        enumC16313m3 = enumC16313m4;
                        str17 = str17;
                        i16 = 9;
                        break;
                    case 7:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str14);
                        i15 |= 128;
                        enumC16313m3 = enumC16313m4;
                        str17 = str17;
                        i16 = 9;
                        break;
                    case 8:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str15);
                        i15 |= 256;
                        enumC16313m3 = enumC16313m4;
                        str17 = str17;
                        i16 = 9;
                        break;
                    case 9:
                        checkmarkStyle3 = (CheckmarkStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), checkmarkStyle3);
                        i15 |= 512;
                        enumC16313m3 = enumC16313m4;
                        str17 = str17;
                        break;
                    case 10:
                        list6 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), list6);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        enumC16313m3 = enumC16313m4;
                        str17 = str17;
                        break;
                    case 11:
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), c9598e3);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        enumC16313m3 = enumC16313m4;
                        str17 = str17;
                        break;
                    case 12:
                        planProgressStatusModel3 = (PlanProgressStatusModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, PlanProgressStatusModel$$serializer.INSTANCE, planProgressStatusModel3);
                        i15 |= 4096;
                        enumC16313m3 = enumC16313m4;
                        str17 = str17;
                        break;
                    case 13:
                        circularProgressIndicator3 = (CircularProgressIndicator) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, CircularProgressIndicator$$serializer.INSTANCE, circularProgressIndicator3);
                        i15 |= DfuBaseService.ERROR_REMOTE_MASK;
                        enumC16313m3 = enumC16313m4;
                        str17 = str17;
                        break;
                    case 14:
                        unlockTrendsCardModel2 = (UnlockTrendsCardModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, UnlockTrendsCardModel$$serializer.INSTANCE, unlockTrendsCardModel2);
                        i15 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        enumC16313m3 = enumC16313m4;
                        str17 = str17;
                        break;
                    case 15:
                        list5 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, (InterfaceC37137b) interfaceC23462hArr[15].getValue(), list5);
                        i15 |= 32768;
                        enumC16313m3 = enumC16313m4;
                        str17 = str17;
                        break;
                    case 16:
                        graphingCardTheme2 = (GraphingCardTheme) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, GraphingCardTheme$$serializer.INSTANCE, graphingCardTheme2);
                        i15 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        enumC16313m3 = enumC16313m4;
                        str17 = str17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list7 = list5;
            graphModel = graphModel2;
            str = str17;
            graphingCardTheme = graphingCardTheme2;
            list = list6;
            checkmarkStyle = checkmarkStyle3;
            str2 = str15;
            str3 = str16;
            circularProgressIndicator = circularProgressIndicator3;
            c9598e = c9598e3;
            str4 = str18;
            planProgressStatusModel = planProgressStatusModel3;
            unlockTrendsCardModel = unlockTrendsCardModel2;
            str5 = str14;
            str6 = str19;
            enumC16313m0 = enumC16313m3;
            list2 = list7;
            i13 = i15;
            str7 = strDecodeStringElement2;
        }
        GraphModel graphModel3 = graphModel;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new GraphingCardModel(i13, graphModel3, str4, str7, str6, enumC16313m0, str, str3, str5, str2, checkmarkStyle, list, c9598e, planProgressStatusModel, circularProgressIndicator, unlockTrendsCardModel, list2, graphingCardTheme, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, GraphingCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        GraphingCardModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
