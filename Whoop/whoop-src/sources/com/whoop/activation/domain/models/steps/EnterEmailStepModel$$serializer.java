package com.whoop.activation.domain.models.steps;

import com.whoop.activation.domain.models.EmailDialogInfo;
import com.whoop.activation.domain.models.EmailDialogInfo$$serializer;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import com.whoop.design.util.TextResource;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/activation/domain/models/steps/EnterEmailStepModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class EnterEmailStepModel$$serializer implements GeneratedSerializer<EnterEmailStepModel> {
    public static final int $stable;
    public static final EnterEmailStepModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        EnterEmailStepModel$$serializer enterEmailStepModel$$serializer = new EnterEmailStepModel$$serializer();
        INSTANCE = enterEmailStepModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.activation.domain.models.steps.EnterEmailStepModel", enterEmailStepModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("textEntries", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("dialogInfo", true);
        pluginGeneratedSerialDescriptor.addElement("marketingOptInText", true);
        pluginGeneratedSerialDescriptor.addElement("navigationBarText", false);
        pluginGeneratedSerialDescriptor.addElement("mobileScreenName", false);
        pluginGeneratedSerialDescriptor.addElement("analyticsName", false);
        pluginGeneratedSerialDescriptor.addElement("progressCircle", false);
        pluginGeneratedSerialDescriptor.addElement("footerButtons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EnterEmailStepModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = EnterEmailStepModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{C25452a.f99689a, stringSerializer, interfaceC23462hArr[2].getValue(), stringSerializer, AbstractC38195a.m122336d(EmailDialogInfo$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, AbstractC38195a.m122336d(ProgressButtonModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final EnterEmailStepModel deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        String str;
        ProgressButtonModel progressButtonModel;
        String str2;
        EmailDialogInfo emailDialogInfo;
        List list2;
        TextResource textResource;
        String str3;
        String str4;
        String str5;
        String str6;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = EnterEmailStepModel.$childSerializers;
        int i14 = 9;
        int i15 = 7;
        TextResource textResource2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            TextResource textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            EmailDialogInfo emailDialogInfo2 = (EmailDialogInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, EmailDialogInfo$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            ProgressButtonModel progressButtonModel2 = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, ProgressButtonModel$$serializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            textResource = textResource3;
            progressButtonModel = progressButtonModel2;
            str5 = strDecodeStringElement3;
            str = str8;
            str2 = str7;
            str4 = strDecodeStringElement2;
            str6 = strDecodeStringElement4;
            emailDialogInfo = emailDialogInfo2;
            i13 = 2047;
            list2 = list3;
            str3 = strDecodeStringElement;
        } else {
            int i16 = 2;
            boolean z4 = true;
            int i17 = 0;
            List list4 = null;
            String str9 = null;
            ProgressButtonModel progressButtonModel3 = null;
            String str10 = null;
            EmailDialogInfo emailDialogInfo3 = null;
            List list5 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 7;
                        i16 = 2;
                        break;
                    case 0:
                        textResource2 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource2);
                        i17 |= 1;
                        i14 = 9;
                        i15 = 7;
                        i16 = 2;
                        break;
                    case 1:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i17 |= 2;
                        i14 = 9;
                        i15 = 7;
                        break;
                    case 2:
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list5);
                        i17 |= 4;
                        i14 = 9;
                        i15 = 7;
                        break;
                    case 3:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i17 |= 8;
                        i14 = 9;
                        break;
                    case 4:
                        emailDialogInfo3 = (EmailDialogInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, EmailDialogInfo$$serializer.INSTANCE, emailDialogInfo3);
                        i17 |= 16;
                        i14 = 9;
                        break;
                    case 5:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str10);
                        i17 |= 32;
                        i14 = 9;
                        break;
                    case 6:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str9);
                        i17 |= 64;
                        i14 = 9;
                        break;
                    case 7:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i15);
                        i17 |= 128;
                        break;
                    case 8:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i17 |= 256;
                        break;
                    case 9:
                        progressButtonModel3 = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, ProgressButtonModel$$serializer.INSTANCE, progressButtonModel3);
                        i17 |= 512;
                        break;
                    case 10:
                        list4 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), list4);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            list = list4;
            str = str9;
            progressButtonModel = progressButtonModel3;
            str2 = str10;
            emailDialogInfo = emailDialogInfo3;
            list2 = list5;
            textResource = textResource2;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
            str5 = strDecodeStringElement7;
            str6 = strDecodeStringElement8;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new EnterEmailStepModel(i13, textResource, str3, list2, str4, emailDialogInfo, str2, str, str5, str6, progressButtonModel, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, EnterEmailStepModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        EnterEmailStepModel.write$Self$activation_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
