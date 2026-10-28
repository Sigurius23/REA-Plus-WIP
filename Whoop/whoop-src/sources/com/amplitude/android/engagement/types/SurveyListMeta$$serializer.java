package com.amplitude.android.engagement.types;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"com/amplitude/android/engagement/types/SurveyListMeta.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/amplitude/android/engagement/types/SurveyListMeta;", "<init>", "()V", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/amplitude/android/engagement/types/SurveyListMeta;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/amplitude/android/engagement/types/SurveyListMeta;)V", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC23457c
public final class SurveyListMeta$$serializer implements GeneratedSerializer<SurveyListMeta> {
    public static final int $stable = 0;
    public static final SurveyListMeta$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SurveyListMeta$$serializer surveyListMeta$$serializer = new SurveyListMeta$$serializer();
        INSTANCE = surveyListMeta$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.amplitude.android.engagement.types.SurveyListMeta", surveyListMeta$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("options", false);
        pluginGeneratedSerialDescriptor.addElement("listType", false);
        pluginGeneratedSerialDescriptor.addElement("displayType", false);
        pluginGeneratedSerialDescriptor.addElement("isOrderRandom", true);
        pluginGeneratedSerialDescriptor.addElement("otherOption", true);
        pluginGeneratedSerialDescriptor.addElement("validation", true);
        pluginGeneratedSerialDescriptor.addElement("conditionalActions", true);
        pluginGeneratedSerialDescriptor.addElement("defaultAction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SurveyListMeta$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] childSerializers() {
        InterfaceC37138c[] interfaceC37138cArr = SurveyListMeta.$childSerializers;
        InterfaceC37138c interfaceC37138c = interfaceC37138cArr[0];
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(SurveyListOther$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(ValidationConfig$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(interfaceC37138cArr[6]);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(interfaceC37138cArr[7]);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138c, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public SurveyListMeta deserialize(InterfaceC40541d decoder) {
        Object objDecodeNullableSerializableElement;
        String strDecodeStringElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        int i13;
        String str;
        boolean z4;
        Object objDecodeSerializableElement;
        char c3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(descriptor2);
        InterfaceC37138c[] interfaceC37138cArr = SurveyListMeta.$childSerializers;
        int i14 = 5;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            objDecodeSerializableElement = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 0, interfaceC37138cArr[0], null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 1);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 2);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 3);
            objDecodeNullableSerializableElement4 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SurveyListOther$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement3 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 5, ValidationConfig$$serializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement5 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 6, interfaceC37138cArr[6], null);
            objDecodeNullableSerializableElement2 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 7, interfaceC37138cArr[7], null);
            i13 = 255;
            str = strDecodeStringElement3;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement5;
            strDecodeStringElement = strDecodeStringElement2;
            z4 = zDecodeBooleanElement;
        } else {
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            Object objDecodeNullableSerializableElement6 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement7 = null;
            Object objDecodeSerializableElement2 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement4 = null;
            int i15 = 0;
            Object objDecodeNullableSerializableElement8 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        break;
                    case 0:
                        objDecodeSerializableElement2 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 0, interfaceC37138cArr[0], objDecodeSerializableElement2);
                        i15 |= 1;
                        i14 = 5;
                        break;
                    case 1:
                        i15 |= 2;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 1);
                        i14 = 5;
                        break;
                    case 2:
                        i15 |= 4;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 2);
                        i14 = 5;
                        break;
                    case 3:
                        c3 = 4;
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 3);
                        i15 |= 8;
                        i14 = 5;
                        break;
                    case 4:
                        c3 = 4;
                        objDecodeNullableSerializableElement8 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SurveyListOther$$serializer.INSTANCE, objDecodeNullableSerializableElement8);
                        i15 |= 16;
                        i14 = 5;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement7 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, i14, ValidationConfig$$serializer.INSTANCE, objDecodeNullableSerializableElement7);
                        i15 |= 32;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 6, interfaceC37138cArr[6], objDecodeNullableSerializableElement);
                        i15 |= 64;
                        break;
                    case 7:
                        objDecodeNullableSerializableElement6 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 7, interfaceC37138cArr[7], objDecodeNullableSerializableElement6);
                        i15 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement6;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement7;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement8;
            i13 = i15;
            str = strDecodeStringElement4;
            z4 = zDecodeBooleanElement2;
            objDecodeSerializableElement = objDecodeSerializableElement2;
        }
        interfaceC40539bBeginStructure.endStructure(descriptor2);
        return new SurveyListMeta(i13, (List) objDecodeSerializableElement, strDecodeStringElement, str, z4, (SurveyListOther) objDecodeNullableSerializableElement4, (ValidationConfig) objDecodeNullableSerializableElement3, (List) objDecodeNullableSerializableElement, (Action) objDecodeNullableSerializableElement2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, SurveyListMeta value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(descriptor2);
        SurveyListMeta.write$Self(value, interfaceC40540cBeginStructure, descriptor2);
        interfaceC40540cBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
