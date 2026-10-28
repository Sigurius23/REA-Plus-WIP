package com.whoop.design.models.items;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/HorizontalMetricTileModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/HorizontalMetricTileModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/HorizontalMetricTileModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/HorizontalMetricTileModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HorizontalMetricTileModel$$serializer implements GeneratedSerializer<HorizontalMetricTileModel> {
    public static final int $stable;
    public static final HorizontalMetricTileModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HorizontalMetricTileModel$$serializer horizontalMetricTileModel$$serializer = new HorizontalMetricTileModel$$serializer();
        INSTANCE = horizontalMetricTileModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.HorizontalMetricTileModel", horizontalMetricTileModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("endIcon", false);
        pluginGeneratedSerialDescriptor.addElement("footer", false);
        pluginGeneratedSerialDescriptor.addElement("metrics", false);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        pluginGeneratedSerialDescriptor.addElement("subItems", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HorizontalMetricTileModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = HorizontalMetricTileModel.$childSerializers;
        return new InterfaceC37138c[]{C25452a.f99689a, StringSerializer.INSTANCE, AbstractC38195a.m122336d(HorizontalMetricTileFooter$$serializer.INSTANCE), interfaceC23462hArr[3].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HorizontalMetricTileModel deserialize(InterfaceC40541d decoder) {
        int i13;
        TextResource textResource;
        String str;
        HorizontalMetricTileFooter horizontalMetricTileFooter;
        List list;
        C9598e c9598e;
        List list2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HorizontalMetricTileModel.$childSerializers;
        int i14 = 2;
        TextResource textResource2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            TextResource textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            HorizontalMetricTileFooter horizontalMetricTileFooter2 = (HorizontalMetricTileFooter) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, HorizontalMetricTileFooter$$serializer.INSTANCE, null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            textResource = textResource3;
            horizontalMetricTileFooter = horizontalMetricTileFooter2;
            i13 = 63;
            list = list3;
            c9598e = c9598e2;
            str = strDecodeStringElement;
        } else {
            boolean z4 = true;
            int i15 = 0;
            String strDecodeStringElement2 = null;
            HorizontalMetricTileFooter horizontalMetricTileFooter3 = null;
            List list4 = null;
            C9598e c9598e3 = null;
            List list5 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 2;
                        break;
                    case 0:
                        textResource2 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource2);
                        i15 |= 1;
                        i14 = 2;
                        break;
                    case 1:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        horizontalMetricTileFooter3 = (HorizontalMetricTileFooter) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, HorizontalMetricTileFooter$$serializer.INSTANCE, horizontalMetricTileFooter3);
                        i15 |= 4;
                        break;
                    case 3:
                        list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), list4);
                        i15 |= 8;
                        break;
                    case 4:
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), c9598e3);
                        i15 |= 16;
                        break;
                    case 5:
                        list5 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), list5);
                        i15 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            textResource = textResource2;
            str = strDecodeStringElement2;
            horizontalMetricTileFooter = horizontalMetricTileFooter3;
            list = list4;
            c9598e = c9598e3;
            list2 = list5;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HorizontalMetricTileModel(i13, textResource, str, horizontalMetricTileFooter, list, c9598e, list2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HorizontalMetricTileModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HorizontalMetricTileModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
