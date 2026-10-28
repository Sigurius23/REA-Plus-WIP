package com.whoop.shepherd.feature.notificationhistory.domain.models;

import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.CtaTileModel$$serializer;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ShepherdNotificationHistoryResponse$$serializer implements GeneratedSerializer<ShepherdNotificationHistoryResponse> {
    public static final int $stable;
    public static final ShepherdNotificationHistoryResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ShepherdNotificationHistoryResponse$$serializer shepherdNotificationHistoryResponse$$serializer = new ShepherdNotificationHistoryResponse$$serializer();
        INSTANCE = shepherdNotificationHistoryResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdNotificationHistoryResponse", shepherdNotificationHistoryResponse$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("pageTitle", false);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        pluginGeneratedSerialDescriptor.addElement("pageHeader", false);
        pluginGeneratedSerialDescriptor.addElement("settingsCta", true);
        pluginGeneratedSerialDescriptor.addElement("detectionOn", false);
        pluginGeneratedSerialDescriptor.addElement("afib_history_box", false);
        pluginGeneratedSerialDescriptor.addElement("clearHistoryDialog", false);
        pluginGeneratedSerialDescriptor.addElement("clearRecordDialog", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ShepherdNotificationHistoryResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        ShepherdClearHistoryDialogResponse$$serializer shepherdClearHistoryDialogResponse$$serializer = ShepherdClearHistoryDialogResponse$$serializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(shepherdClearHistoryDialogResponse$$serializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(shepherdClearHistoryDialogResponse$$serializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, PageHeaderResponse$$serializer.INSTANCE, CtaTileModel$$serializer.INSTANCE, BooleanSerializer.INSTANCE, ShepherdHistoryResponse$$serializer.INSTANCE, interfaceC37138cM122336d, interfaceC37138cM122336d2};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ShepherdNotificationHistoryResponse deserialize(InterfaceC40541d decoder) {
        boolean z4;
        ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse;
        ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse2;
        ShepherdHistoryResponse shepherdHistoryResponse;
        CtaTileModel ctaTileModel;
        PageHeaderResponse pageHeaderResponse;
        int i13;
        String str;
        String str2;
        String str3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 7;
        int i15 = 6;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            PageHeaderResponse pageHeaderResponse2 = (PageHeaderResponse) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, PageHeaderResponse$$serializer.INSTANCE, null);
            CtaTileModel ctaTileModel2 = (CtaTileModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, CtaTileModel$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
            ShepherdHistoryResponse shepherdHistoryResponse2 = (ShepherdHistoryResponse) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, ShepherdHistoryResponse$$serializer.INSTANCE, null);
            ShepherdClearHistoryDialogResponse$$serializer shepherdClearHistoryDialogResponse$$serializer = ShepherdClearHistoryDialogResponse$$serializer.INSTANCE;
            str = strDecodeStringElement;
            shepherdClearHistoryDialogResponse = (ShepherdClearHistoryDialogResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, shepherdClearHistoryDialogResponse$$serializer, null);
            shepherdHistoryResponse = shepherdHistoryResponse2;
            z4 = zDecodeBooleanElement;
            pageHeaderResponse = pageHeaderResponse2;
            shepherdClearHistoryDialogResponse2 = (ShepherdClearHistoryDialogResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, shepherdClearHistoryDialogResponse$$serializer, null);
            ctaTileModel = ctaTileModel2;
            str3 = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
            i13 = 511;
        } else {
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse3 = null;
            ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse4 = null;
            ShepherdHistoryResponse shepherdHistoryResponse3 = null;
            CtaTileModel ctaTileModel3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int i16 = 0;
            PageHeaderResponse pageHeaderResponse3 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i14 = 7;
                        break;
                    case 0:
                        i16 |= 1;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 1:
                        i16 |= 2;
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 2:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 3:
                        pageHeaderResponse3 = (PageHeaderResponse) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, PageHeaderResponse$$serializer.INSTANCE, pageHeaderResponse3);
                        i16 |= 8;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 4:
                        ctaTileModel3 = (CtaTileModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, CtaTileModel$$serializer.INSTANCE, ctaTileModel3);
                        i16 |= 16;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 5:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
                        i16 |= 32;
                        break;
                    case 6:
                        shepherdHistoryResponse3 = (ShepherdHistoryResponse) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, ShepherdHistoryResponse$$serializer.INSTANCE, shepherdHistoryResponse3);
                        i16 |= 64;
                        break;
                    case 7:
                        shepherdClearHistoryDialogResponse3 = (ShepherdClearHistoryDialogResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, ShepherdClearHistoryDialogResponse$$serializer.INSTANCE, shepherdClearHistoryDialogResponse3);
                        i16 |= 128;
                        break;
                    case 8:
                        shepherdClearHistoryDialogResponse4 = (ShepherdClearHistoryDialogResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, ShepherdClearHistoryDialogResponse$$serializer.INSTANCE, shepherdClearHistoryDialogResponse4);
                        i16 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            shepherdClearHistoryDialogResponse = shepherdClearHistoryDialogResponse3;
            shepherdClearHistoryDialogResponse2 = shepherdClearHistoryDialogResponse4;
            shepherdHistoryResponse = shepherdHistoryResponse3;
            ctaTileModel = ctaTileModel3;
            pageHeaderResponse = pageHeaderResponse3;
            i13 = i16;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ShepherdNotificationHistoryResponse(i13, str, str2, str3, pageHeaderResponse, ctaTileModel, z4, shepherdHistoryResponse, shepherdClearHistoryDialogResponse, shepherdClearHistoryDialogResponse2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ShepherdNotificationHistoryResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ShepherdNotificationHistoryResponse.write$Self$shepherd_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
