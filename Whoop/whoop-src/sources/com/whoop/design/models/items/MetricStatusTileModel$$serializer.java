package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/MetricStatusTileModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/MetricStatusTileModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/MetricStatusTileModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/MetricStatusTileModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MetricStatusTileModel$$serializer implements GeneratedSerializer<MetricStatusTileModel> {
    public static final int $stable;
    public static final MetricStatusTileModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MetricStatusTileModel$$serializer metricStatusTileModel$$serializer = new MetricStatusTileModel$$serializer();
        INSTANCE = metricStatusTileModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.MetricStatusTileModel", metricStatusTileModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("valueSuffix", false);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_STATUS, false);
        pluginGeneratedSerialDescriptor.addElement("updateButton", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MetricStatusTileModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{c25452a, AbstractC38195a.m122336d(c25452a), AbstractC38195a.m122336d(c25452a), AbstractC38195a.m122336d(c25452a), AbstractC38195a.m122336d(TagModel$$serializer.INSTANCE), AbstractC38195a.m122336d(SecondaryButtonModel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MetricStatusTileModel deserialize(InterfaceC40541d decoder) {
        int i13;
        TextResource textResource;
        TextResource textResource2;
        TextResource textResource3;
        TextResource textResource4;
        TagModel tagModel;
        SecondaryButtonModel secondaryButtonModel;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 5;
        TextResource textResource5 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            TextResource textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, c25452a, null);
            TextResource textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, c25452a, null);
            TextResource textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, c25452a, null);
            TagModel tagModel2 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, TagModel$$serializer.INSTANCE, null);
            textResource4 = textResource9;
            secondaryButtonModel = (SecondaryButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, SecondaryButtonModel$$serializer.INSTANCE, null);
            tagModel = tagModel2;
            i13 = 63;
            textResource3 = textResource8;
            textResource2 = textResource7;
            textResource = textResource6;
        } else {
            boolean z4 = true;
            int i15 = 0;
            TextResource textResource10 = null;
            TextResource textResource11 = null;
            TextResource textResource12 = null;
            TagModel tagModel3 = null;
            SecondaryButtonModel secondaryButtonModel2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 5;
                        break;
                    case 0:
                        textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource5);
                        i15 |= 1;
                        i14 = 5;
                        break;
                    case 1:
                        textResource10 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource10);
                        i15 |= 2;
                        break;
                    case 2:
                        textResource11 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, C25452a.f99689a, textResource11);
                        i15 |= 4;
                        break;
                    case 3:
                        textResource12 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, C25452a.f99689a, textResource12);
                        i15 |= 8;
                        break;
                    case 4:
                        tagModel3 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, TagModel$$serializer.INSTANCE, tagModel3);
                        i15 |= 16;
                        break;
                    case 5:
                        secondaryButtonModel2 = (SecondaryButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, SecondaryButtonModel$$serializer.INSTANCE, secondaryButtonModel2);
                        i15 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            textResource = textResource5;
            textResource2 = textResource10;
            textResource3 = textResource11;
            textResource4 = textResource12;
            tagModel = tagModel3;
            secondaryButtonModel = secondaryButtonModel2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MetricStatusTileModel(i13, textResource, textResource2, textResource3, textResource4, tagModel, secondaryButtonModel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MetricStatusTileModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MetricStatusTileModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
