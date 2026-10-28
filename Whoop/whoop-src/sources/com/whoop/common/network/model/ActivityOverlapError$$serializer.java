package com.whoop.common.network.model;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/common/network/model/ActivityOverlapError.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/common/network/model/ActivityOverlapError;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/common/network/model/ActivityOverlapError;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/common/network/model/ActivityOverlapError;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ActivityOverlapError$$serializer implements GeneratedSerializer<ActivityOverlapError> {
    public static final int $stable;
    public static final ActivityOverlapError$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ActivityOverlapError$$serializer activityOverlapError$$serializer = new ActivityOverlapError$$serializer();
        INSTANCE = activityOverlapError$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.common.network.model.ActivityOverlapError", activityOverlapError$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("overlappingActivities", false);
        pluginGeneratedSerialDescriptor.addElement("resolution", false);
        pluginGeneratedSerialDescriptor.addElement("dismissButton", false);
        pluginGeneratedSerialDescriptor.addElement("errorTitle", false);
        pluginGeneratedSerialDescriptor.addElement("proceedButton", true);
        pluginGeneratedSerialDescriptor.addElement("message", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActivityOverlapError$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{ActivityOverlapError.$childSerializers[0].getValue(), stringSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ActivityOverlapError deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String strDecodeStringElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ActivityOverlapError.$childSerializers;
        int i14 = 5;
        int i15 = 0;
        List list2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, null);
            list = list3;
            str = strDecodeStringElement2;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            str3 = strDecodeStringElement4;
            str4 = str5;
            str2 = strDecodeStringElement3;
            i13 = 63;
        } else {
            int i16 = 1;
            int i17 = 0;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String str6 = null;
            String strDecodeStringElement8 = null;
            while (i16 != 0) {
                int i18 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        i15 = i18;
                        i16 = i15;
                        i14 = 5;
                        break;
                    case 0:
                        list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), list2);
                        i17 |= 1;
                        i15 = i18;
                        i14 = 5;
                        break;
                    case 1:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i17 |= 2;
                        i15 = i18;
                        break;
                    case 2:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i17 |= 4;
                        i15 = i18;
                        break;
                    case 3:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i17 |= 8;
                        i15 = i18;
                        break;
                    case 4:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str6);
                        i17 |= 16;
                        i15 = i18;
                        break;
                    case 5:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i14);
                        i17 |= 32;
                        i15 = i18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            list = list2;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            str4 = str6;
            strDecodeStringElement = strDecodeStringElement8;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ActivityOverlapError(i13, list, str, str2, str3, str4, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ActivityOverlapError value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ActivityOverlapError.write$Self$add_activity_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
