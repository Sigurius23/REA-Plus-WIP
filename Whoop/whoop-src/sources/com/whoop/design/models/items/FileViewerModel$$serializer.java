package com.whoop.design.models.items;

import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/FileViewerModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/FileViewerModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/FileViewerModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/FileViewerModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class FileViewerModel$$serializer implements GeneratedSerializer<FileViewerModel> {
    public static final int $stable;
    public static final FileViewerModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        FileViewerModel$$serializer fileViewerModel$$serializer = new FileViewerModel$$serializer();
        INSTANCE = fileViewerModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.FileViewerModel", fileViewerModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("fileUrl", false);
        pluginGeneratedSerialDescriptor.addElement("urlType", true);
        pluginGeneratedSerialDescriptor.addElement("fileType", true);
        pluginGeneratedSerialDescriptor.addElement("scaling", true);
        pluginGeneratedSerialDescriptor.addElement("zoom", true);
        pluginGeneratedSerialDescriptor.addElement("horizontalAlignment", true);
        pluginGeneratedSerialDescriptor.addElement("verticalAlignment", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FileViewerModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = FileViewerModel.$childSerializers;
        return new InterfaceC37138c[]{StringSerializer.INSTANCE, interfaceC23462hArr[1].getValue(), interfaceC23462hArr[2].getValue(), interfaceC23462hArr[3].getValue(), interfaceC23462hArr[4].getValue(), interfaceC23462hArr[5].getValue(), interfaceC23462hArr[6].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final FileViewerModel deserialize(InterfaceC40541d decoder) {
        int i13;
        Map map;
        FileViewerModel.VerticalAlignment verticalAlignment;
        Map map2;
        FileViewerModel.HorizontalAlignment horizontalAlignment;
        FileViewerModel.Zoom zoom;
        FileViewerModel.Scaling scaling;
        String str;
        FileViewerModel.FileUrlType fileUrlType;
        FileViewerModel.FileType fileType;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = FileViewerModel.$childSerializers;
        int i14 = 8;
        int i15 = 6;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            FileViewerModel.FileUrlType fileUrlType2 = (FileViewerModel.FileUrlType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            FileViewerModel.FileType fileType2 = (FileViewerModel.FileType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            FileViewerModel.Scaling scaling2 = (FileViewerModel.Scaling) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            FileViewerModel.Zoom zoom2 = (FileViewerModel.Zoom) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            FileViewerModel.HorizontalAlignment horizontalAlignment2 = (FileViewerModel.HorizontalAlignment) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            FileViewerModel.VerticalAlignment verticalAlignment2 = (FileViewerModel.VerticalAlignment) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            str = strDecodeStringElement2;
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, LenientAggregateBindingsSerializer.INSTANCE, null);
            i13 = 511;
            verticalAlignment = verticalAlignment2;
            horizontalAlignment = horizontalAlignment2;
            scaling = scaling2;
            zoom = zoom2;
            fileType = fileType2;
            fileUrlType = fileUrlType2;
        } else {
            int i16 = 5;
            int i17 = 3;
            int i18 = 4;
            int i19 = 2;
            boolean z4 = true;
            int i24 = 0;
            Map map3 = null;
            FileViewerModel.VerticalAlignment verticalAlignment3 = null;
            Map map4 = null;
            FileViewerModel.HorizontalAlignment horizontalAlignment3 = null;
            FileViewerModel.Zoom zoom3 = null;
            FileViewerModel.Scaling scaling3 = null;
            FileViewerModel.FileUrlType fileUrlType3 = null;
            FileViewerModel.FileType fileType3 = null;
            while (z4) {
                int i25 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 6;
                        i19 = 2;
                        i17 = 3;
                        i18 = 4;
                        i16 = 5;
                        break;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i24 |= 1;
                        i14 = 8;
                        i15 = 6;
                        i19 = 2;
                        i17 = 3;
                        i18 = 4;
                        i16 = 5;
                        break;
                    case 1:
                        fileUrlType3 = (FileViewerModel.FileUrlType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), fileUrlType3);
                        i24 |= 2;
                        i14 = 8;
                        i15 = 6;
                        i19 = 2;
                        i17 = 3;
                        i18 = 4;
                        i16 = 5;
                        break;
                    case 2:
                        fileType3 = (FileViewerModel.FileType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i19, (InterfaceC37137b) interfaceC23462hArr[i19].getValue(), fileType3);
                        i24 |= 4;
                        i14 = 8;
                        i15 = 6;
                        i17 = 3;
                        i18 = 4;
                        i16 = 5;
                        break;
                    case 3:
                        scaling3 = (FileViewerModel.Scaling) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), scaling3);
                        i24 |= 8;
                        i14 = 8;
                        i15 = 6;
                        i18 = 4;
                        i16 = 5;
                        break;
                    case 4:
                        zoom3 = (FileViewerModel.Zoom) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), zoom3);
                        i24 |= 16;
                        i14 = 8;
                        i15 = 6;
                        i16 = 5;
                        break;
                    case 5:
                        horizontalAlignment3 = (FileViewerModel.HorizontalAlignment) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), horizontalAlignment3);
                        i24 |= 32;
                        i14 = 8;
                        i15 = 6;
                        break;
                    case 6:
                        verticalAlignment3 = (FileViewerModel.VerticalAlignment) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i25, (InterfaceC37137b) interfaceC23462hArr[i25].getValue(), verticalAlignment3);
                        i24 |= 64;
                        i15 = i25;
                        i14 = 8;
                        break;
                    case 7:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), map4);
                        i24 |= 128;
                        i15 = i25;
                        break;
                    case 8:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, LenientAggregateBindingsSerializer.INSTANCE, map3);
                        i24 |= 256;
                        i15 = i25;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i24;
            map = map3;
            verticalAlignment = verticalAlignment3;
            map2 = map4;
            horizontalAlignment = horizontalAlignment3;
            zoom = zoom3;
            scaling = scaling3;
            str = strDecodeStringElement;
            fileUrlType = fileUrlType3;
            fileType = fileType3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new FileViewerModel(i13, str, fileUrlType, fileType, scaling, zoom, horizontalAlignment, verticalAlignment, map2, map, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, FileViewerModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        FileViewerModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
