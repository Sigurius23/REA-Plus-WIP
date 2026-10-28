package com.amplitude.android.engagement.types;

import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import no.nordicsemi.android.dfu.DfuBaseService;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"com/amplitude/android/engagement/types/EndUser.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/amplitude/android/engagement/types/EndUser;", "<init>", "()V", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/amplitude/android/engagement/types/EndUser;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/amplitude/android/engagement/types/EndUser;)V", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC23457c
public final class EndUser$$serializer implements GeneratedSerializer<EndUser> {
    public static final int $stable = 0;
    public static final EndUser$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EndUser$$serializer endUser$$serializer = new EndUser$$serializer();
        INSTANCE = endUser$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.amplitude.android.engagement.types.EndUser", endUser$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("user_id", true);
        pluginGeneratedSerialDescriptor.addElement("device_id", true);
        pluginGeneratedSerialDescriptor.addElement("country", true);
        pluginGeneratedSerialDescriptor.addElement("city", true);
        pluginGeneratedSerialDescriptor.addElement("region", true);
        pluginGeneratedSerialDescriptor.addElement("dma", true);
        pluginGeneratedSerialDescriptor.addElement("language", true);
        pluginGeneratedSerialDescriptor.addElement("platform", true);
        pluginGeneratedSerialDescriptor.addElement("version", true);
        pluginGeneratedSerialDescriptor.addElement("os", true);
        pluginGeneratedSerialDescriptor.addElement("device_model", true);
        pluginGeneratedSerialDescriptor.addElement("carrier", true);
        pluginGeneratedSerialDescriptor.addElement("library", true);
        pluginGeneratedSerialDescriptor.addElement("user_agent", true);
        pluginGeneratedSerialDescriptor.addElement("session_id", true);
        pluginGeneratedSerialDescriptor.addElement("user_properties", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EndUser$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] childSerializers() {
        InterfaceC37138c[] interfaceC37138cArr = EndUser.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(IntSerializer.INSTANCE), interfaceC37138cArr[15]};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public EndUser deserialize(InterfaceC40541d decoder) {
        Object objDecodeSerializableElement;
        Object obj;
        Object obj2;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object obj3;
        int i13;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        Object objDecodeNullableSerializableElement12;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(descriptor2);
        InterfaceC37138c[] interfaceC37138cArr = EndUser.$childSerializers;
        Object objDecodeSerializableElement2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement13 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 0, stringSerializer, null);
            objDecodeNullableSerializableElement12 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            objDecodeNullableSerializableElement11 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            objDecodeNullableSerializableElement10 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            objDecodeNullableSerializableElement9 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            objDecodeNullableSerializableElement8 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            objDecodeNullableSerializableElement7 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            objDecodeNullableSerializableElement6 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            objDecodeNullableSerializableElement5 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 8, stringSerializer, null);
            objDecodeNullableSerializableElement2 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 9, stringSerializer, null);
            objDecodeNullableSerializableElement = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 10, stringSerializer, null);
            Object objDecodeNullableSerializableElement14 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 11, stringSerializer, null);
            objDecodeNullableSerializableElement4 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 12, stringSerializer, null);
            objDecodeNullableSerializableElement3 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 13, stringSerializer, null);
            Object objDecodeNullableSerializableElement15 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 14, IntSerializer.INSTANCE, null);
            objDecodeSerializableElement = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 15, interfaceC37138cArr[15], null);
            i13 = 65535;
            obj = objDecodeNullableSerializableElement13;
            obj3 = objDecodeNullableSerializableElement15;
            obj2 = objDecodeNullableSerializableElement14;
        } else {
            int i14 = 15;
            int i15 = 0;
            boolean z4 = true;
            Object objDecodeNullableSerializableElement16 = null;
            Object objDecodeNullableSerializableElement17 = null;
            Object objDecodeNullableSerializableElement18 = null;
            Object objDecodeNullableSerializableElement19 = null;
            Object objDecodeNullableSerializableElement20 = null;
            Object objDecodeNullableSerializableElement21 = null;
            Object objDecodeNullableSerializableElement22 = null;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            Object objDecodeNullableSerializableElement25 = null;
            Object objDecodeNullableSerializableElement26 = null;
            Object objDecodeNullableSerializableElement27 = null;
            Object objDecodeNullableSerializableElement28 = null;
            Object obj4 = null;
            Object objDecodeNullableSerializableElement29 = null;
            while (z4) {
                int i16 = i14;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                        i15 = i15;
                        i14 = 15;
                        obj4 = obj4;
                        break;
                    case 0:
                        objDecodeNullableSerializableElement29 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, objDecodeNullableSerializableElement29);
                        i15 |= 1;
                        objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                        i14 = 15;
                        obj4 = obj4;
                        break;
                    case 1:
                        i15 |= 2;
                        objDecodeNullableSerializableElement16 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement16);
                        objDecodeNullableSerializableElement27 = objDecodeNullableSerializableElement27;
                        i14 = 15;
                        obj4 = obj4;
                        break;
                    case 2:
                        obj4 = obj4;
                        objDecodeNullableSerializableElement18 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i15 |= 4;
                        objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                        i14 = 15;
                        obj4 = obj4;
                        break;
                    case 3:
                        obj4 = obj4;
                        objDecodeNullableSerializableElement17 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                        i15 |= 8;
                        objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                        i14 = 15;
                        obj4 = obj4;
                        break;
                    case 4:
                        obj4 = obj4;
                        objDecodeNullableSerializableElement24 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i15 |= 16;
                        objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                        i14 = 15;
                        obj4 = obj4;
                        break;
                    case 5:
                        obj4 = obj4;
                        objDecodeNullableSerializableElement26 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement26);
                        i15 |= 32;
                        objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                        i14 = 15;
                        obj4 = obj4;
                        break;
                    case 6:
                        obj4 = obj4;
                        objDecodeNullableSerializableElement23 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i15 |= 64;
                        objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                        i14 = 15;
                        obj4 = obj4;
                        break;
                    case 7:
                        obj4 = obj4;
                        objDecodeNullableSerializableElement22 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i15 |= 128;
                        objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                        i14 = 15;
                        obj4 = obj4;
                        break;
                    case 8:
                        obj4 = obj4;
                        objDecodeNullableSerializableElement21 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i15 |= 256;
                        objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                        i14 = 15;
                        obj4 = obj4;
                        break;
                    case 9:
                        obj4 = obj4;
                        objDecodeNullableSerializableElement25 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, objDecodeNullableSerializableElement25);
                        i15 |= 512;
                        objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                        i14 = 15;
                        obj4 = obj4;
                        break;
                    case 10:
                        obj4 = obj4;
                        objDecodeNullableSerializableElement20 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                        i14 = 15;
                        obj4 = obj4;
                        break;
                    case 11:
                        obj4 = obj4;
                        objDecodeNullableSerializableElement19 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, objDecodeNullableSerializableElement19);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                        i14 = 15;
                        obj4 = obj4;
                        break;
                    case 12:
                        obj4 = obj4;
                        objDecodeNullableSerializableElement27 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 12, StringSerializer.INSTANCE, objDecodeNullableSerializableElement27);
                        i15 |= 4096;
                        objDecodeNullableSerializableElement28 = objDecodeNullableSerializableElement28;
                        objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                        i14 = 15;
                        obj4 = obj4;
                        break;
                    case 13:
                        obj4 = obj4;
                        objDecodeNullableSerializableElement28 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 13, StringSerializer.INSTANCE, objDecodeNullableSerializableElement28);
                        i15 |= DfuBaseService.ERROR_REMOTE_MASK;
                        objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                        i14 = 15;
                        obj4 = obj4;
                        break;
                    case 14:
                        Object objDecodeNullableSerializableElement30 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 14, IntSerializer.INSTANCE, obj4);
                        i15 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        objDecodeSerializableElement2 = objDecodeSerializableElement2;
                        i14 = 15;
                        obj4 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                        break;
                    case 15:
                        objDecodeSerializableElement2 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, i16, interfaceC37138cArr[i16], objDecodeSerializableElement2);
                        i15 |= 32768;
                        i14 = i16;
                        objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            int i17 = i15;
            Object obj5 = obj4;
            objDecodeSerializableElement = objDecodeSerializableElement2;
            Object obj6 = objDecodeNullableSerializableElement16;
            obj = objDecodeNullableSerializableElement29;
            obj2 = objDecodeNullableSerializableElement19;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement20;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement25;
            obj3 = obj5;
            i13 = i17;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement28;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement27;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement21;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement22;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement23;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement26;
            objDecodeNullableSerializableElement9 = objDecodeNullableSerializableElement24;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement17;
            objDecodeNullableSerializableElement11 = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement12 = obj6;
        }
        interfaceC40539bBeginStructure.endStructure(descriptor2);
        return new EndUser(i13, (String) obj, (String) objDecodeNullableSerializableElement12, (String) objDecodeNullableSerializableElement11, (String) objDecodeNullableSerializableElement10, (String) objDecodeNullableSerializableElement9, (String) objDecodeNullableSerializableElement8, (String) objDecodeNullableSerializableElement7, (String) objDecodeNullableSerializableElement6, (String) objDecodeNullableSerializableElement5, (String) objDecodeNullableSerializableElement2, (String) objDecodeNullableSerializableElement, (String) obj2, (String) objDecodeNullableSerializableElement4, (String) objDecodeNullableSerializableElement3, (Integer) obj3, (Map) objDecodeSerializableElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, EndUser value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(descriptor2);
        EndUser.write$Self(value, interfaceC40540cBeginStructure, descriptor2);
        interfaceC40540cBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
