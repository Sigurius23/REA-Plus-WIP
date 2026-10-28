package com.whoop.home.domain.models;

import com.whoop.design.models.items.AiChatEntryModel;
import com.whoop.design.models.items.AiChatEntryModel$$serializer;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/home/domain/models/NotificationsWrapperModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/home/domain/models/NotificationsWrapperModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/home/domain/models/NotificationsWrapperModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/home/domain/models/NotificationsWrapperModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class NotificationsWrapperModel$$serializer implements GeneratedSerializer<NotificationsWrapperModel> {
    public static final int $stable;
    public static final NotificationsWrapperModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        NotificationsWrapperModel$$serializer notificationsWrapperModel$$serializer = new NotificationsWrapperModel$$serializer();
        INSTANCE = notificationsWrapperModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.home.domain.models.NotificationsWrapperModel", notificationsWrapperModel$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("architectureMiniComponent", true);
        pluginGeneratedSerialDescriptor.addElement("chatEntryPoint", true);
        pluginGeneratedSerialDescriptor.addElement("replayText", true);
        pluginGeneratedSerialDescriptor.addElement("replayIcon", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NotificationsWrapperModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d((InterfaceC37138c) NotificationsWrapperModel.$childSerializers[0].getValue());
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(AiChatEntryModel$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, interfaceC37138cM122336d2, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final NotificationsWrapperModel deserialize(InterfaceC40541d decoder) {
        int i13;
        NotificationsCenterModel notificationsCenterModel;
        AiChatEntryModel aiChatEntryModel;
        String str;
        String strDecodeStringElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = NotificationsWrapperModel.$childSerializers;
        NotificationsCenterModel notificationsCenterModel2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            NotificationsCenterModel notificationsCenterModel3 = (NotificationsCenterModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            AiChatEntryModel aiChatEntryModel2 = (AiChatEntryModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, AiChatEntryModel$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            notificationsCenterModel = notificationsCenterModel3;
            aiChatEntryModel = aiChatEntryModel2;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            str = strDecodeStringElement2;
            i13 = 15;
        } else {
            boolean z4 = true;
            int i14 = 0;
            AiChatEntryModel aiChatEntryModel3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    notificationsCenterModel2 = (NotificationsCenterModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), notificationsCenterModel2);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    aiChatEntryModel3 = (AiChatEntryModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, AiChatEntryModel$$serializer.INSTANCE, aiChatEntryModel3);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                    i14 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                    i14 |= 8;
                }
            }
            i13 = i14;
            notificationsCenterModel = notificationsCenterModel2;
            aiChatEntryModel = aiChatEntryModel3;
            str = strDecodeStringElement3;
            strDecodeStringElement = strDecodeStringElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new NotificationsWrapperModel(i13, notificationsCenterModel, aiChatEntryModel, str, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, NotificationsWrapperModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        NotificationsWrapperModel.write$Self$home_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
