package com.whoop.clinicianintheloop.api;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/clinicianintheloop/api/VideoSchedulingFormResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class VideoSchedulingFormResponse$$serializer implements GeneratedSerializer<VideoSchedulingFormResponse> {
    public static final int $stable;
    public static final VideoSchedulingFormResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        VideoSchedulingFormResponse$$serializer videoSchedulingFormResponse$$serializer = new VideoSchedulingFormResponse$$serializer();
        INSTANCE = videoSchedulingFormResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.clinicianintheloop.api.VideoSchedulingFormResponse", videoSchedulingFormResponse$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("navigationTitle", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("formContent", false);
        pluginGeneratedSerialDescriptor.addElement("nextButton", false);
        pluginGeneratedSerialDescriptor.addElement("savingTitle", false);
        pluginGeneratedSerialDescriptor.addElement("savingSubtitle", false);
        pluginGeneratedSerialDescriptor.addElement("analyticEvent", false);
        pluginGeneratedSerialDescriptor.addElement("callout", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VideoSchedulingFormResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), VideoSchedulingFormContent$$serializer.INSTANCE, ProgressButtonModel$$serializer.INSTANCE, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(AnalyticEventModel$$serializer.INSTANCE), AbstractC38195a.m122336d(InfoCalloutTileModel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final VideoSchedulingFormResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        AnalyticEventModel analyticEventModel;
        InfoCalloutTileModel infoCalloutTileModel;
        String str;
        String str2;
        ProgressButtonModel progressButtonModel;
        String str3;
        String str4;
        String str5;
        VideoSchedulingFormContent videoSchedulingFormContent;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 7;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            VideoSchedulingFormContent videoSchedulingFormContent2 = (VideoSchedulingFormContent) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, VideoSchedulingFormContent$$serializer.INSTANCE, null);
            ProgressButtonModel progressButtonModel2 = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, ProgressButtonModel$$serializer.INSTANCE, null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            str3 = strDecodeStringElement2;
            analyticEventModel = (AnalyticEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, AnalyticEventModel$$serializer.INSTANCE, null);
            str = str8;
            str2 = str7;
            videoSchedulingFormContent = videoSchedulingFormContent2;
            infoCalloutTileModel = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, InfoCalloutTileModel$$serializer.INSTANCE, null);
            progressButtonModel = progressButtonModel2;
            str5 = str6;
            str4 = strDecodeStringElement3;
            i13 = 511;
        } else {
            boolean z4 = true;
            int i15 = 0;
            AnalyticEventModel analyticEventModel2 = null;
            InfoCalloutTileModel infoCalloutTileModel2 = null;
            String str9 = null;
            String str10 = null;
            ProgressButtonModel progressButtonModel3 = null;
            String strDecodeStringElement4 = null;
            String str11 = null;
            VideoSchedulingFormContent videoSchedulingFormContent3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        i15 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 7;
                        break;
                    case 1:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i15 |= 2;
                        i14 = 7;
                        break;
                    case 2:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str11);
                        i15 |= 4;
                        i14 = 7;
                        break;
                    case 3:
                        videoSchedulingFormContent3 = (VideoSchedulingFormContent) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, VideoSchedulingFormContent$$serializer.INSTANCE, videoSchedulingFormContent3);
                        i15 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        progressButtonModel3 = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, ProgressButtonModel$$serializer.INSTANCE, progressButtonModel3);
                        i15 |= 16;
                        i14 = 7;
                        break;
                    case 5:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str10);
                        i15 |= 32;
                        i14 = 7;
                        break;
                    case 6:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str9);
                        i15 |= 64;
                        break;
                    case 7:
                        analyticEventModel2 = (AnalyticEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, AnalyticEventModel$$serializer.INSTANCE, analyticEventModel2);
                        i15 |= 128;
                        break;
                    case 8:
                        infoCalloutTileModel2 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, InfoCalloutTileModel$$serializer.INSTANCE, infoCalloutTileModel2);
                        i15 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            analyticEventModel = analyticEventModel2;
            infoCalloutTileModel = infoCalloutTileModel2;
            str = str9;
            str2 = str10;
            progressButtonModel = progressButtonModel3;
            str3 = strDecodeStringElement;
            str4 = strDecodeStringElement4;
            str5 = str11;
            videoSchedulingFormContent = videoSchedulingFormContent3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new VideoSchedulingFormResponse(i13, str3, str4, str5, videoSchedulingFormContent, progressButtonModel, str2, str, analyticEventModel, infoCalloutTileModel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, VideoSchedulingFormResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        VideoSchedulingFormResponse.write$Self$clinician_in_the_loop_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
