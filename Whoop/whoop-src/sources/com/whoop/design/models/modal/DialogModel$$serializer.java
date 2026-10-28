package com.whoop.design.models.modal;

import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/modal/DialogModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/modal/DialogModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/modal/DialogModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/modal/DialogModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class DialogModel$$serializer implements GeneratedSerializer<DialogModel> {
    public static final int $stable;
    public static final DialogModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        DialogModel$$serializer dialogModel$$serializer = new DialogModel$$serializer();
        INSTANCE = dialogModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.modal.DialogModel", dialogModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("primaryButton", true);
        pluginGeneratedSerialDescriptor.addElement("secondaryButton", true);
        pluginGeneratedSerialDescriptor.addElement("items", true);
        pluginGeneratedSerialDescriptor.addElement("showCloseButton", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DialogModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = DialogModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        DialogButton$$serializer dialogButton$$serializer = DialogButton$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(dialogButton$$serializer), AbstractC38195a.m122336d(dialogButton$$serializer), interfaceC23462hArr[5].getValue(), BooleanSerializer.INSTANCE, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final DialogModel deserialize(InterfaceC40541d decoder) {
        boolean z4;
        List list;
        Map map;
        DialogButton dialogButton;
        Map map2;
        DialogButton dialogButton2;
        String str;
        int i13;
        String str2;
        String str3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = DialogModel.$childSerializers;
        int i14 = 8;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, null);
            DialogButton$$serializer dialogButton$$serializer = DialogButton$$serializer.INSTANCE;
            DialogButton dialogButton3 = (DialogButton) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, dialogButton$$serializer, null);
            DialogButton dialogButton4 = (DialogButton) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, dialogButton$$serializer, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            str2 = strDecodeStringElement;
            z4 = zDecodeBooleanElement;
            dialogButton2 = dialogButton3;
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, LenientAggregateBindingsSerializer.INSTANCE, null);
            dialogButton = dialogButton4;
            str = str4;
            i13 = 511;
            list = list2;
            str3 = strDecodeStringElement2;
        } else {
            int i15 = 5;
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            List list3 = null;
            Map map3 = null;
            DialogButton dialogButton5 = null;
            Map map4 = null;
            DialogButton dialogButton6 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i16 = 0;
            String str5 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i15 = 5;
                        break;
                    case 0:
                        i16 |= 1;
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 8;
                        i15 = 5;
                        break;
                    case 1:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        i14 = 8;
                        i15 = 5;
                        break;
                    case 2:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str5);
                        i16 |= 4;
                        i14 = 8;
                        i15 = 5;
                        break;
                    case 3:
                        dialogButton6 = (DialogButton) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, DialogButton$$serializer.INSTANCE, dialogButton6);
                        i16 |= 8;
                        i14 = 8;
                        i15 = 5;
                        break;
                    case 4:
                        dialogButton5 = (DialogButton) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, DialogButton$$serializer.INSTANCE, dialogButton5);
                        i16 |= 16;
                        i14 = 8;
                        i15 = 5;
                        break;
                    case 5:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list3);
                        i16 |= 32;
                        i14 = 8;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
                        i16 |= 64;
                        break;
                    case 7:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), map3);
                        i16 |= 128;
                        break;
                    case 8:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, LenientAggregateBindingsSerializer.INSTANCE, map4);
                        i16 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            list = list3;
            map = map3;
            dialogButton = dialogButton5;
            map2 = map4;
            dialogButton2 = dialogButton6;
            str = str5;
            i13 = i16;
            str2 = strDecodeStringElement3;
            str3 = strDecodeStringElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new DialogModel(i13, str2, str3, str, dialogButton2, dialogButton, list, z4, map, map2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, DialogModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        DialogModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
