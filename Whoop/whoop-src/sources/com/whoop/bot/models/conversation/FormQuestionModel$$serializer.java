package com.whoop.bot.models.conversation;

import com.whoop.whoopaction.domain.models.Action;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
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
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/bot/models/conversation/FormQuestionModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/bot/models/conversation/FormQuestionModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/bot/models/conversation/FormQuestionModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/bot/models/conversation/FormQuestionModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class FormQuestionModel$$serializer implements GeneratedSerializer<FormQuestionModel> {
    public static final int $stable;
    public static final FormQuestionModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        FormQuestionModel$$serializer formQuestionModel$$serializer = new FormQuestionModel$$serializer();
        INSTANCE = formQuestionModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.bot.models.conversation.FormQuestionModel", formQuestionModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("prompt", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("answerDisplayStyle", true);
        pluginGeneratedSerialDescriptor.addElement("maxSelections", true);
        pluginGeneratedSerialDescriptor.addElement("isRequired", true);
        pluginGeneratedSerialDescriptor.addElement("answers", true);
        pluginGeneratedSerialDescriptor.addElement("onAnswer", true);
        pluginGeneratedSerialDescriptor.addElement("userVisibleProgressIndicator", true);
        pluginGeneratedSerialDescriptor.addElement("userVisibleSubmitButtonText", true);
        pluginGeneratedSerialDescriptor.addElement("userVisibleCompletedButtonText", true);
        pluginGeneratedSerialDescriptor.addElement("placeholder", true);
        pluginGeneratedSerialDescriptor.addElement("userInputTextMaxLength", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FormQuestionModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = FormQuestionModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[3].getValue()), intSerializer, BooleanSerializer.INSTANCE, interfaceC23462hArr[6].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final FormQuestionModel deserialize(InterfaceC40541d decoder) {
        AnswerDisplayStyle answerDisplayStyle;
        String str;
        Action action;
        int i13;
        List list;
        String str2;
        String str3;
        String str4;
        String str5;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        boolean z4;
        int i14;
        int iDecodeIntElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = FormQuestionModel.$childSerializers;
        int i15 = 10;
        String strDecodeStringElement3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            AnswerDisplayStyle answerDisplayStyle2 = (AnswerDisplayStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 4);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            Action action2 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            String strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
            action = action2;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str4 = strDecodeStringElement7;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 10);
            str5 = strDecodeStringElement8;
            z4 = zDecodeBooleanElement;
            strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
            i14 = iDecodeIntElement2;
            str3 = strDecodeStringElement6;
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 12);
            list = list2;
            answerDisplayStyle = answerDisplayStyle2;
            i13 = 8191;
        } else {
            int i16 = 12;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            Action action3 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            boolean z13 = true;
            int i17 = 0;
            AnswerDisplayStyle answerDisplayStyle3 = null;
            List list3 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i16 = 12;
                        break;
                    case 0:
                        i17 |= 1;
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i16 = 12;
                        i15 = 10;
                        break;
                    case 1:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i17 |= 2;
                        i16 = 12;
                        i15 = 10;
                        break;
                    case 2:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i17 |= 4;
                        i16 = 12;
                        i15 = 10;
                        break;
                    case 3:
                        answerDisplayStyle3 = (AnswerDisplayStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), answerDisplayStyle3);
                        i17 |= 8;
                        i16 = 12;
                        i15 = 10;
                        break;
                    case 4:
                        iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 4);
                        i17 |= 16;
                        i16 = 12;
                        break;
                    case 5:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
                        i17 |= 32;
                        i16 = 12;
                        break;
                    case 6:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), list3);
                        i17 |= 64;
                        i16 = 12;
                        break;
                    case 7:
                        action3 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), action3);
                        i17 |= 128;
                        i16 = 12;
                        break;
                    case 8:
                        strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i17 |= 256;
                        break;
                    case 9:
                        strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
                        i17 |= 512;
                        break;
                    case 10:
                        strDecodeStringElement13 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i15);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    case 11:
                        strDecodeStringElement14 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        break;
                    case 12:
                        iDecodeIntElement4 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, i16);
                        i17 |= 4096;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            answerDisplayStyle = answerDisplayStyle3;
            str = strDecodeStringElement3;
            action = action3;
            i13 = i17;
            list = list3;
            str2 = strDecodeStringElement9;
            str3 = strDecodeStringElement10;
            str4 = strDecodeStringElement11;
            str5 = strDecodeStringElement12;
            strDecodeStringElement = strDecodeStringElement13;
            strDecodeStringElement2 = strDecodeStringElement14;
            z4 = zDecodeBooleanElement2;
            i14 = iDecodeIntElement3;
            iDecodeIntElement = iDecodeIntElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new FormQuestionModel(i13, str, str2, str3, answerDisplayStyle, i14, z4, list, action, str4, str5, strDecodeStringElement, strDecodeStringElement2, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, FormQuestionModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        FormQuestionModel.write$Self$bot_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
