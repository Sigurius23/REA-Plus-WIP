package com.whoop.educationModels;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/educationModels/MediaHeader.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/educationModels/MediaHeader;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/educationModels/MediaHeader;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/educationModels/MediaHeader;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MediaHeader$$serializer implements GeneratedSerializer<MediaHeader> {
    public static final int $stable;
    public static final MediaHeader$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MediaHeader$$serializer mediaHeader$$serializer = new MediaHeader$$serializer();
        INSTANCE = mediaHeader$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.educationModels.MediaHeader", mediaHeader$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("sub_text", false);
        pluginGeneratedSerialDescriptor.addElement("image_url", false);
        pluginGeneratedSerialDescriptor.addElement("share_enabled", false);
        pluginGeneratedSerialDescriptor.addElement("cta_icon", false);
        pluginGeneratedSerialDescriptor.addElement("podcast_picker", false);
        pluginGeneratedSerialDescriptor.addElement("share_link", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MediaHeader$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, BooleanSerializer.INSTANCE, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(PodcastPicker$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MediaHeader deserialize(InterfaceC40541d decoder) {
        boolean z4;
        String str;
        int i13;
        String str2;
        String str3;
        String str4;
        String str5;
        PodcastPicker podcastPicker;
        boolean z13;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 6;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            PodcastPicker podcastPicker2 = (PodcastPicker) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, PodcastPicker$$serializer.INSTANCE, null);
            str2 = strDecodeStringElement;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            podcastPicker = podcastPicker2;
            z4 = zDecodeBooleanElement;
            str5 = str7;
            str4 = strDecodeStringElement2;
            str3 = str6;
            i13 = 127;
        } else {
            boolean z14 = true;
            boolean zDecodeBooleanElement2 = false;
            String strDecodeStringElement3 = null;
            String str8 = null;
            String strDecodeStringElement4 = null;
            String str9 = null;
            PodcastPicker podcastPicker3 = null;
            int i15 = 0;
            String str10 = null;
            while (z14) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        z13 = true;
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 |= 1;
                        i14 = 6;
                        break;
                    case 1:
                        z13 = true;
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str8);
                        i15 |= 2;
                        i14 = 6;
                        break;
                    case 2:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str9);
                        i15 |= 16;
                        break;
                    case 5:
                        podcastPicker3 = (PodcastPicker) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, PodcastPicker$$serializer.INSTANCE, podcastPicker3);
                        i15 |= 32;
                        break;
                    case 6:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str10);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            str = str10;
            i13 = i15;
            str2 = strDecodeStringElement3;
            str3 = str8;
            str4 = strDecodeStringElement4;
            str5 = str9;
            podcastPicker = podcastPicker3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MediaHeader(i13, str2, str3, str4, z4, str5, podcastPicker, str, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MediaHeader value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MediaHeader.write$Self$education_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
