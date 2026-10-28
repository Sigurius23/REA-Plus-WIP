package com.whoop.challengedetails.domain.models;

import com.whoop.design.util.TextResource;
import java.util.List;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/challengedetails/domain/models/ChallengeDetailsResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ChallengeDetailsResponse$$serializer implements GeneratedSerializer<ChallengeDetailsResponse> {
    public static final int $stable;
    public static final ChallengeDetailsResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ChallengeDetailsResponse$$serializer challengeDetailsResponse$$serializer = new ChallengeDetailsResponse$$serializer();
        INSTANCE = challengeDetailsResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.challengedetails.domain.models.ChallengeDetailsResponse", challengeDetailsResponse$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("toolbar_title", false);
        pluginGeneratedSerialDescriptor.addElement("header_image_url", false);
        pluginGeneratedSerialDescriptor.addElement("is_member_eligible", false);
        pluginGeneratedSerialDescriptor.addElement("ineligible_text", false);
        pluginGeneratedSerialDescriptor.addElement("challenge_title", false);
        pluginGeneratedSerialDescriptor.addElement("challenge_card_items", false);
        pluginGeneratedSerialDescriptor.addElement("description_title", false);
        pluginGeneratedSerialDescriptor.addElement("description_text", false);
        pluginGeneratedSerialDescriptor.addElement("cta_text", false);
        pluginGeneratedSerialDescriptor.addElement("style", false);
        pluginGeneratedSerialDescriptor.addElement("saving_text", false);
        pluginGeneratedSerialDescriptor.addElement("saving_sub_text", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChallengeDetailsResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ChallengeDetailsResponse.$childSerializers;
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{c25452a, StringSerializer.INSTANCE, BooleanSerializer.INSTANCE, AbstractC38195a.m122336d(c25452a), c25452a, interfaceC23462hArr[5].getValue(), c25452a, c25452a, c25452a, interfaceC23462hArr[9].getValue(), c25452a, c25452a};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ChallengeDetailsResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        TextResource textResource;
        String str;
        TextResource textResource2;
        ChallengeDetailsStyle challengeDetailsStyle;
        TextResource textResource3;
        TextResource textResource4;
        TextResource textResource5;
        List list;
        TextResource textResource6;
        TextResource textResource7;
        TextResource textResource8;
        boolean z4;
        InterfaceC23462h[] interfaceC23462hArr;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr2 = ChallengeDetailsResponse.$childSerializers;
        int i14 = 9;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
            TextResource textResource10 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, c25452a, null);
            TextResource textResource11 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, c25452a, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr2[5].getValue(), null);
            TextResource textResource12 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, c25452a, null);
            TextResource textResource13 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, c25452a, null);
            TextResource textResource14 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, c25452a, null);
            ChallengeDetailsStyle challengeDetailsStyle2 = (ChallengeDetailsStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr2[9].getValue(), null);
            TextResource textResource15 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, c25452a, null);
            i13 = 4095;
            challengeDetailsStyle = challengeDetailsStyle2;
            textResource4 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 11, c25452a, null);
            list = list2;
            textResource5 = textResource13;
            textResource3 = textResource12;
            textResource8 = textResource10;
            textResource6 = textResource14;
            textResource7 = textResource11;
            z4 = zDecodeBooleanElement;
            textResource2 = textResource15;
            str = strDecodeStringElement;
            textResource = textResource9;
        } else {
            TextResource textResource16 = null;
            String strDecodeStringElement2 = null;
            TextResource textResource17 = null;
            ChallengeDetailsStyle challengeDetailsStyle3 = null;
            TextResource textResource18 = null;
            TextResource textResource19 = null;
            TextResource textResource20 = null;
            List list3 = null;
            int i15 = 5;
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            TextResource textResource21 = null;
            TextResource textResource22 = null;
            TextResource textResource23 = null;
            i13 = 0;
            while (z13) {
                int i16 = i14;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i14 = 9;
                        i15 = 5;
                        break;
                    case 0:
                        textResource16 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource16);
                        i13 |= 1;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 9;
                        i15 = 5;
                        break;
                    case 1:
                        i13 |= 2;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 9;
                        i15 = 5;
                        break;
                    case 2:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
                        i13 |= 4;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 9;
                        i15 = 5;
                        break;
                    case 3:
                        textResource23 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, C25452a.f99689a, textResource23);
                        i13 |= 8;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 9;
                        i15 = 5;
                        break;
                    case 4:
                        textResource22 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, C25452a.f99689a, textResource22);
                        i13 |= 16;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        i14 = 9;
                        i15 = 5;
                        break;
                    case 5:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list3);
                        i13 |= 32;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        i14 = 9;
                        break;
                    case 6:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        textResource18 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, C25452a.f99689a, textResource18);
                        i13 |= 64;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        i14 = 9;
                        break;
                    case 7:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        textResource20 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, C25452a.f99689a, textResource20);
                        i13 |= 128;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        i14 = 9;
                        break;
                    case 8:
                        interfaceC23462hArr = interfaceC23462hArr2;
                        textResource21 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, C25452a.f99689a, textResource21);
                        i13 |= 256;
                        interfaceC23462hArr2 = interfaceC23462hArr;
                        i14 = 9;
                        break;
                    case 9:
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        challengeDetailsStyle3 = (ChallengeDetailsStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr2[i16].getValue(), challengeDetailsStyle3);
                        i13 |= 512;
                        i14 = i16;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        break;
                    case 10:
                        textResource17 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, C25452a.f99689a, textResource17);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i14 = i16;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        break;
                    case 11:
                        textResource19 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 11, C25452a.f99689a, textResource19);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i14 = i16;
                        interfaceC23462hArr2 = interfaceC23462hArr2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            textResource = textResource16;
            str = strDecodeStringElement2;
            textResource2 = textResource17;
            challengeDetailsStyle = challengeDetailsStyle3;
            textResource3 = textResource18;
            textResource4 = textResource19;
            textResource5 = textResource20;
            list = list3;
            textResource6 = textResource21;
            textResource7 = textResource22;
            textResource8 = textResource23;
            z4 = zDecodeBooleanElement2;
        }
        int i17 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ChallengeDetailsResponse(i17, textResource, str, z4, textResource8, textResource7, list, textResource3, textResource5, textResource6, challengeDetailsStyle, textResource2, textResource4, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ChallengeDetailsResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ChallengeDetailsResponse.write$Self$challenge_details_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
