package com.whoop.activation.domain.models.steps;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/activation/domain/models/steps/TrialPlanOption.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/activation/domain/models/steps/TrialPlanOption;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/activation/domain/models/steps/TrialPlanOption;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/TrialPlanOption;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class TrialPlanOption$$serializer implements GeneratedSerializer<TrialPlanOption> {
    public static final int $stable;
    public static final TrialPlanOption$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        TrialPlanOption$$serializer trialPlanOption$$serializer = new TrialPlanOption$$serializer();
        INSTANCE = trialPlanOption$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.activation.domain.models.steps.TrialPlanOption", trialPlanOption$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("shouldSkipNextScreen", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("price", false);
        pluginGeneratedSerialDescriptor.addElement("priceSubtitle", false);
        pluginGeneratedSerialDescriptor.addElement("disclaimer", false);
        pluginGeneratedSerialDescriptor.addElement("selected", false);
        pluginGeneratedSerialDescriptor.addElement("membershipTier", false);
        pluginGeneratedSerialDescriptor.addElement("trackingLabel", false);
        pluginGeneratedSerialDescriptor.addElement("tag", false);
        pluginGeneratedSerialDescriptor.addElement("strikethroughPrice", false);
        pluginGeneratedSerialDescriptor.addElement("commitmentType", false);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TrialPlanOption$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = TrialPlanOption.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        C25452a c25452a = C25452a.f99689a;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{booleanSerializer, c25452a, c25452a, c25452a, c25452a, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[11].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[12].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final TrialPlanOption deserialize(InterfaceC40541d decoder) {
        boolean zDecodeBooleanElement;
        TextResource textResource;
        TextResource textResource2;
        C9598e c9598e;
        CommitmentType commitmentType;
        String str;
        TextResource textResource3;
        String str2;
        TextResource textResource4;
        int i13;
        boolean z4;
        String str3;
        String str4;
        String str5;
        char c3;
        char c7;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = TrialPlanOption.$childSerializers;
        int i14 = 10;
        int i15 = 9;
        int i16 = 0;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 0);
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            TextResource textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, c25452a, null);
            TextResource textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, c25452a, null);
            TextResource textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, c25452a, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            commitmentType = (CommitmentType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), null);
            str = str7;
            str2 = str6;
            str4 = strDecodeStringElement2;
            z4 = zDecodeBooleanElement2;
            str3 = strDecodeStringElement;
            textResource4 = textResource7;
            str5 = strDecodeStringElement3;
            textResource3 = textResource8;
            textResource = textResource6;
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), null);
            i13 = 8191;
            textResource2 = textResource5;
        } else {
            int i17 = 12;
            boolean z13 = true;
            zDecodeBooleanElement = false;
            TextResource textResource9 = null;
            C9598e c9598e2 = null;
            CommitmentType commitmentType2 = null;
            String str8 = null;
            TextResource textResource10 = null;
            String str9 = null;
            TextResource textResource11 = null;
            TextResource textResource12 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean zDecodeBooleanElement3 = false;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        c3 = '\b';
                        z13 = false;
                        i14 = 10;
                        i15 = 9;
                        i17 = 12;
                        break;
                    case 0:
                        c3 = '\b';
                        zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 0);
                        i16 |= 1;
                        i14 = 10;
                        i15 = 9;
                        i17 = 12;
                        break;
                    case 1:
                        c3 = '\b';
                        i16 |= 2;
                        textResource12 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource12);
                        i14 = 10;
                        i15 = 9;
                        i17 = 12;
                        break;
                    case 2:
                        c3 = '\b';
                        textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C25452a.f99689a, textResource9);
                        i16 |= 4;
                        i14 = 10;
                        i15 = 9;
                        i17 = 12;
                        break;
                    case 3:
                        c3 = '\b';
                        textResource11 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, C25452a.f99689a, textResource11);
                        i16 |= 8;
                        i14 = 10;
                        i15 = 9;
                        i17 = 12;
                        break;
                    case 4:
                        c3 = '\b';
                        textResource10 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, C25452a.f99689a, textResource10);
                        i16 |= 16;
                        i14 = 10;
                        i15 = 9;
                        i17 = 12;
                        break;
                    case 5:
                        c7 = '\b';
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i16 |= 32;
                        i14 = 10;
                        i17 = 12;
                        break;
                    case 6:
                        i16 |= 64;
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
                        i14 = 10;
                        i17 = 12;
                        break;
                    case 7:
                        c7 = '\b';
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i16 |= 128;
                        i14 = 10;
                        i17 = 12;
                        break;
                    case 8:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i16 |= 256;
                        i17 = 12;
                        break;
                    case 9:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, StringSerializer.INSTANCE, str9);
                        i16 |= 512;
                        i17 = 12;
                        break;
                    case 10:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str8);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i17 = 12;
                        break;
                    case 11:
                        commitmentType2 = (CommitmentType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), commitmentType2);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i17 = 12;
                        break;
                    case 12:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), c9598e2);
                        i16 |= 4096;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            textResource = textResource9;
            textResource2 = textResource12;
            c9598e = c9598e2;
            commitmentType = commitmentType2;
            str = str8;
            textResource3 = textResource10;
            str2 = str9;
            textResource4 = textResource11;
            i13 = i16;
            z4 = zDecodeBooleanElement3;
            str3 = strDecodeStringElement4;
            str4 = strDecodeStringElement5;
            str5 = strDecodeStringElement6;
        }
        boolean z14 = zDecodeBooleanElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new TrialPlanOption(i13, z14, textResource2, textResource, textResource4, textResource3, str3, z4, str4, str5, str2, str, commitmentType, c9598e, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, TrialPlanOption value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        TrialPlanOption.write$Self$activation_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
