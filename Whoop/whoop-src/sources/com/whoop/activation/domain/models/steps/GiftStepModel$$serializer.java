package com.whoop.activation.domain.models.steps;

import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import com.whoop.design.util.TextResource;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/activation/domain/models/steps/GiftStepModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/activation/domain/models/steps/GiftStepModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/activation/domain/models/steps/GiftStepModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/GiftStepModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class GiftStepModel$$serializer implements GeneratedSerializer<GiftStepModel> {
    public static final int $stable;
    public static final GiftStepModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        GiftStepModel$$serializer giftStepModel$$serializer = new GiftStepModel$$serializer();
        INSTANCE = giftStepModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.activation.domain.models.steps.GiftStepModel", giftStepModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("pickerText", false);
        pluginGeneratedSerialDescriptor.addElement("maximumCodesAllowed", false);
        pluginGeneratedSerialDescriptor.addElement("disclaimerText", false);
        pluginGeneratedSerialDescriptor.addElement("navigationBarText", false);
        pluginGeneratedSerialDescriptor.addElement("mobileScreenName", false);
        pluginGeneratedSerialDescriptor.addElement("analyticsName", false);
        pluginGeneratedSerialDescriptor.addElement("progressCircle", false);
        pluginGeneratedSerialDescriptor.addElement("footerButtons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GiftStepModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = GiftStepModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(ProgressButtonModel$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue());
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{c25452a, c25452a, stringSerializer, c25452a, IntSerializer.INSTANCE, c25452a, interfaceC37138cM122336d, stringSerializer, stringSerializer, interfaceC37138cM122336d2, interfaceC37138cM122336d3};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final GiftStepModel deserialize(InterfaceC40541d decoder) {
        int i13;
        TextResource textResource;
        List list;
        String str;
        ProgressButtonModel progressButtonModel;
        TextResource textResource2;
        TextResource textResource3;
        TextResource textResource4;
        int i14;
        String str2;
        String str3;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = GiftStepModel.$childSerializers;
        int i15 = 9;
        int i16 = 7;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            TextResource textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            TextResource textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, c25452a, null);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 4);
            TextResource textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, c25452a, null);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            ProgressButtonModel progressButtonModel2 = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, ProgressButtonModel$$serializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            textResource2 = textResource8;
            progressButtonModel = progressButtonModel2;
            str3 = strDecodeStringElement2;
            str = str5;
            str4 = strDecodeStringElement3;
            textResource3 = textResource7;
            i13 = 2047;
            i14 = iDecodeIntElement;
            str2 = strDecodeStringElement;
            textResource4 = textResource6;
            textResource = textResource5;
        } else {
            boolean z4 = true;
            int i17 = 0;
            List list2 = null;
            String str6 = null;
            ProgressButtonModel progressButtonModel3 = null;
            TextResource textResource9 = null;
            TextResource textResource10 = null;
            TextResource textResource11 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int iDecodeIntElement2 = 0;
            TextResource textResource12 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i16 = 7;
                        break;
                    case 0:
                        i17 |= 1;
                        textResource11 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource11);
                        i15 = 9;
                        i16 = 7;
                        break;
                    case 1:
                        textResource12 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource12);
                        i17 |= 2;
                        i15 = 9;
                        i16 = 7;
                        break;
                    case 2:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i17 |= 4;
                        i15 = 9;
                        i16 = 7;
                        break;
                    case 3:
                        textResource10 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, C25452a.f99689a, textResource10);
                        i17 |= 8;
                        i15 = 9;
                        i16 = 7;
                        break;
                    case 4:
                        iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 4);
                        i17 |= 16;
                        i15 = 9;
                        break;
                    case 5:
                        textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, C25452a.f99689a, textResource9);
                        i17 |= 32;
                        i15 = 9;
                        break;
                    case 6:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str6);
                        i17 |= 64;
                        i15 = 9;
                        break;
                    case 7:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i16);
                        i17 |= 128;
                        break;
                    case 8:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i17 |= 256;
                        break;
                    case 9:
                        progressButtonModel3 = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, ProgressButtonModel$$serializer.INSTANCE, progressButtonModel3);
                        i17 |= 512;
                        break;
                    case 10:
                        list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), list2);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            textResource = textResource11;
            list = list2;
            str = str6;
            progressButtonModel = progressButtonModel3;
            textResource2 = textResource9;
            textResource3 = textResource10;
            textResource4 = textResource12;
            i14 = iDecodeIntElement2;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new GiftStepModel(i13, textResource, textResource4, str2, textResource3, i14, textResource2, str, str3, str4, progressButtonModel, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, GiftStepModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        GiftStepModel.write$Self$activation_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
