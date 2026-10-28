package com.whoop.design.models.items.graph.plot.scrubber;

import a71.EnumC0523d;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.design.util.TextResource;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class DataScrubberDetailsModel$$serializer implements GeneratedSerializer<DataScrubberDetailsModel> {
    public static final int $stable;
    public static final DataScrubberDetailsModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        DataScrubberDetailsModel$$serializer dataScrubberDetailsModel$$serializer = new DataScrubberDetailsModel$$serializer();
        INSTANCE = dataScrubberDetailsModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.graph.plot.scrubber.DataScrubberDetailsModel", dataScrubberDetailsModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("primaryContextualDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        pluginGeneratedSerialDescriptor.addElement("valueDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("unitDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("secondaryContextualDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("scrubberStyle", true);
        pluginGeneratedSerialDescriptor.addElement("dataContext", true);
        pluginGeneratedSerialDescriptor.addElement("phaseLabel", true);
        pluginGeneratedSerialDescriptor.addElement("supplementalDataScrubberDetails", true);
        pluginGeneratedSerialDescriptor.addElement("callout", true);
        pluginGeneratedSerialDescriptor.addElement("graphLegends", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DataScrubberDetailsModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = DataScrubberDetailsModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(DoubleSerializer.INSTANCE), C25452a.f99689a, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(PhaseLabel$$serializer.INSTANCE), AbstractC38195a.m122336d(SupplementalDataScrubberDetails$$serializer.INSTANCE), AbstractC38195a.m122336d(InfoCalloutTileModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final DataScrubberDetailsModel deserialize(InterfaceC40541d decoder) {
        List list;
        SupplementalDataScrubberDetails supplementalDataScrubberDetails;
        PhaseLabel phaseLabel;
        String str;
        InfoCalloutTileModel infoCalloutTileModel;
        EnumC0523d enumC0523d;
        String str2;
        int i13;
        String str3;
        TextResource textResource;
        Double d3;
        String str4;
        InterfaceC23462h[] interfaceC23462hArr;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr2 = DataScrubberDetailsModel.$childSerializers;
        String str5 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            Double d14 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, DoubleSerializer.INSTANCE, null);
            TextResource textResource2 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C25452a.f99689a, null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            EnumC0523d enumC0523d2 = (EnumC0523d) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr2[5].getValue(), null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            PhaseLabel phaseLabel2 = (PhaseLabel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, PhaseLabel$$serializer.INSTANCE, null);
            SupplementalDataScrubberDetails supplementalDataScrubberDetails2 = (SupplementalDataScrubberDetails) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, SupplementalDataScrubberDetails$$serializer.INSTANCE, null);
            InfoCalloutTileModel infoCalloutTileModel2 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, InfoCalloutTileModel$$serializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr2[10].getValue(), null);
            str3 = str9;
            infoCalloutTileModel = infoCalloutTileModel2;
            phaseLabel = phaseLabel2;
            supplementalDataScrubberDetails = supplementalDataScrubberDetails2;
            str2 = str7;
            i13 = 2047;
            str = str8;
            textResource = textResource2;
            d3 = d14;
            enumC0523d = enumC0523d2;
            str4 = str6;
        } else {
            int i14 = 10;
            int i15 = 5;
            boolean z4 = true;
            int i16 = 0;
            List list2 = null;
            SupplementalDataScrubberDetails supplementalDataScrubberDetails3 = null;
            PhaseLabel phaseLabel3 = null;
            String str10 = null;
            InfoCalloutTileModel infoCalloutTileModel3 = null;
            EnumC0523d enumC0523d3 = null;
            String str11 = null;
            String str12 = null;
            TextResource textResource3 = null;
            Double d15 = null;
            while (z4) {
                int i17 = i14;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 10;
                        i15 = 5;
                        break;
                    case 0:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str5);
                        i16 |= 1;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 10;
                        i15 = 5;
                        break;
                    case 1:
                        d15 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, DoubleSerializer.INSTANCE, d15);
                        i16 |= 2;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 10;
                        i15 = 5;
                        break;
                    case 2:
                        textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C25452a.f99689a, textResource3);
                        i16 |= 4;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 10;
                        i15 = 5;
                        break;
                    case 3:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str11);
                        i16 |= 8;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 10;
                        i15 = 5;
                        break;
                    case 4:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str10);
                        i16 |= 16;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 10;
                        i15 = 5;
                        break;
                    case 5:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        enumC0523d3 = (EnumC0523d) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), enumC0523d3);
                        i16 |= 32;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        i14 = 10;
                        break;
                    case 6:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str12);
                        i16 |= 64;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        i14 = 10;
                        break;
                    case 7:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        phaseLabel3 = (PhaseLabel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, PhaseLabel$$serializer.INSTANCE, phaseLabel3);
                        i16 |= 128;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        i14 = 10;
                        break;
                    case 8:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        supplementalDataScrubberDetails3 = (SupplementalDataScrubberDetails) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, SupplementalDataScrubberDetails$$serializer.INSTANCE, supplementalDataScrubberDetails3);
                        i16 |= 256;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        i14 = 10;
                        break;
                    case 9:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        infoCalloutTileModel3 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, InfoCalloutTileModel$$serializer.INSTANCE, infoCalloutTileModel3);
                        i16 |= 512;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        i14 = 10;
                        break;
                    case 10:
                        list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr2[i17].getValue(), list2);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i14 = i17;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list2;
            supplementalDataScrubberDetails = supplementalDataScrubberDetails3;
            phaseLabel = phaseLabel3;
            str = str10;
            infoCalloutTileModel = infoCalloutTileModel3;
            enumC0523d = enumC0523d3;
            str2 = str11;
            i13 = i16;
            str3 = str12;
            textResource = textResource3;
            d3 = d15;
            str4 = str5;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new DataScrubberDetailsModel(i13, str4, d3, textResource, str2, str, enumC0523d, str3, phaseLabel, supplementalDataScrubberDetails, infoCalloutTileModel, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, DataScrubberDetailsModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        DataScrubberDetailsModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
