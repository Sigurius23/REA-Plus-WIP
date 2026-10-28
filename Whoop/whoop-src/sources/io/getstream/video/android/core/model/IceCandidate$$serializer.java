package io.getstream.video.android.core.model;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"io/getstream/video/android/core/model/IceCandidate.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lio/getstream/video/android/core/model/IceCandidate;", "<init>", "()V", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lio/getstream/video/android/core/model/IceCandidate;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lio/getstream/video/android/core/model/IceCandidate;)V", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
@InterfaceC23457c
public final class IceCandidate$$serializer implements GeneratedSerializer<IceCandidate> {
    public static final IceCandidate$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        IceCandidate$$serializer iceCandidate$$serializer = new IceCandidate$$serializer();
        INSTANCE = iceCandidate$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.getstream.video.android.core.model.IceCandidate", iceCandidate$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("sdpMid", false);
        pluginGeneratedSerialDescriptor.addElement("sdpMLineIndex", false);
        pluginGeneratedSerialDescriptor.addElement("candidate", false);
        pluginGeneratedSerialDescriptor.addElement("usernameFragment", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IceCandidate$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, IntSerializer.INSTANCE, stringSerializer, AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public IceCandidate deserialize(InterfaceC40541d decoder) {
        int i13;
        int i14;
        String str;
        String str2;
        String str3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(descriptor2);
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 0);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(descriptor2, 1);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 2);
            str = strDecodeStringElement;
            str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, null);
            str2 = strDecodeStringElement2;
            i13 = iDecodeIntElement;
            i14 = 15;
        } else {
            boolean z4 = true;
            int iDecodeIntElement2 = 0;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str4 = null;
            int i15 = 0;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 0);
                    i15 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(descriptor2, 1);
                    i15 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 2);
                    i15 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str4);
                    i15 |= 8;
                }
            }
            i13 = iDecodeIntElement2;
            i14 = i15;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            str3 = str4;
        }
        interfaceC40539bBeginStructure.endStructure(descriptor2);
        return new IceCandidate(i14, str, i13, str2, str3, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, IceCandidate value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(descriptor2);
        IceCandidate.write$Self$stream_video_android_core_release(value, interfaceC40540cBeginStructure, descriptor2);
        interfaceC40540cBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
