package io.getstream.video.android.model;

import java.util.List;
import java.util.Map;
import jg3.C21682i;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import o53.C27590a;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"io/getstream/video/android/model/User.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lio/getstream/video/android/model/User;", "<init>", "()V", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lio/getstream/video/android/model/User;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lio/getstream/video/android/model/User;)V", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
@InterfaceC23457c
public final class User$$serializer implements GeneratedSerializer<User> {
    public static final User$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        User$$serializer user$$serializer = new User$$serializer();
        INSTANCE = user$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.getstream.video.android.model.User", user$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("role", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("image", true);
        pluginGeneratedSerialDescriptor.addElement("teams", true);
        pluginGeneratedSerialDescriptor.addElement("custom", true);
        pluginGeneratedSerialDescriptor.addElement("createdAt", true);
        pluginGeneratedSerialDescriptor.addElement("updatedAt", true);
        pluginGeneratedSerialDescriptor.addElement("deletedAt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private User$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] childSerializers() {
        InterfaceC37138c[] interfaceC37138cArr = User.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138c = interfaceC37138cArr[2];
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(interfaceC37138cArr[5]);
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(interfaceC37138cArr[6]);
        C27590a c27590a = C27590a.f111081a;
        return new InterfaceC37138c[]{stringSerializer, interfaceC37138cM122336d, interfaceC37138c, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, interfaceC37138cM122336d5, AbstractC38195a.m122336d(c27590a), AbstractC38195a.m122336d(c27590a), AbstractC38195a.m122336d(c27590a)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public User deserialize(InterfaceC40541d decoder) {
        int i13;
        C21682i c21682i;
        List list;
        Map map;
        C21682i c21682i2;
        C21682i c21682i3;
        String str;
        String str2;
        UserType userType;
        String str3;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(descriptor2);
        InterfaceC37138c[] interfaceC37138cArr = User.$childSerializers;
        int i14 = 9;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            UserType userType2 = (UserType) interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 2, interfaceC37138cArr[2], null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 5, interfaceC37138cArr[5], null);
            Map map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 6, interfaceC37138cArr[6], null);
            C27590a c27590a = C27590a.f111081a;
            C21682i c21682i4 = (C21682i) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 7, c27590a, null);
            C21682i c21682i5 = (C21682i) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 8, c27590a, null);
            map = map2;
            str3 = strDecodeStringElement2;
            c21682i = (C21682i) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 9, c27590a, null);
            c21682i3 = c21682i4;
            str2 = str6;
            c21682i2 = c21682i5;
            str = str7;
            i13 = 1023;
            list = list2;
            userType = userType2;
            str4 = str5;
        } else {
            int i15 = 6;
            int i16 = 5;
            int i17 = 2;
            boolean z4 = true;
            int i18 = 0;
            C21682i c21682i6 = null;
            List list3 = null;
            Map map3 = null;
            C21682i c21682i7 = null;
            C21682i c21682i8 = null;
            String str8 = null;
            String str9 = null;
            UserType userType3 = null;
            String str10 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i17 = 2;
                        i16 = 5;
                        i15 = 6;
                        break;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 0);
                        i18 |= 1;
                        i14 = 9;
                        i17 = 2;
                        i16 = 5;
                        i15 = 6;
                        break;
                    case 1:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, str10);
                        i18 |= 2;
                        i14 = 9;
                        i17 = 2;
                        i16 = 5;
                        i15 = 6;
                        break;
                    case 2:
                        userType3 = (UserType) interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, i17, interfaceC37138cArr[i17], userType3);
                        i18 |= 4;
                        i14 = 9;
                        i16 = 5;
                        i15 = 6;
                        break;
                    case 3:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str9);
                        i18 |= 8;
                        i14 = 9;
                        i16 = 5;
                        i15 = 6;
                        break;
                    case 4:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str8);
                        i18 |= 16;
                        i14 = 9;
                        i16 = 5;
                        i15 = 6;
                        break;
                    case 5:
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, i16, interfaceC37138cArr[i16], list3);
                        i18 |= 32;
                        i14 = 9;
                        i15 = 6;
                        break;
                    case 6:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, i15, interfaceC37138cArr[i15], map3);
                        i18 |= 64;
                        i14 = 9;
                        break;
                    case 7:
                        c21682i8 = (C21682i) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 7, C27590a.f111081a, c21682i8);
                        i18 |= 128;
                        i14 = 9;
                        break;
                    case 8:
                        c21682i7 = (C21682i) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 8, C27590a.f111081a, c21682i7);
                        i18 |= 256;
                        i14 = 9;
                        break;
                    case 9:
                        c21682i6 = (C21682i) interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, i14, C27590a.f111081a, c21682i6);
                        i18 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i18;
            c21682i = c21682i6;
            list = list3;
            map = map3;
            c21682i2 = c21682i7;
            c21682i3 = c21682i8;
            str = str8;
            str2 = str9;
            userType = userType3;
            str3 = strDecodeStringElement;
            str4 = str10;
        }
        interfaceC40539bBeginStructure.endStructure(descriptor2);
        return new User(i13, str3, str4, userType, str2, str, list, map, c21682i3, c21682i2, c21682i, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, User value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(descriptor2);
        User.write$Self$stream_video_android_core_release(value, interfaceC40540cBeginStructure, descriptor2);
        interfaceC40540cBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
