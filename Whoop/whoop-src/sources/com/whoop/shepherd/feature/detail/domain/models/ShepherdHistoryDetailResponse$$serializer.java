package com.whoop.shepherd.feature.detail.domain.models;

import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdClearHistoryDialogResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdClearHistoryDialogResponse$$serializer;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ShepherdHistoryDetailResponse$$serializer implements GeneratedSerializer<ShepherdHistoryDetailResponse> {
    public static final int $stable;
    public static final ShepherdHistoryDetailResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ShepherdHistoryDetailResponse$$serializer shepherdHistoryDetailResponse$$serializer = new ShepherdHistoryDetailResponse$$serializer();
        INSTANCE = shepherdHistoryDetailResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.shepherd.feature.detail.domain.models.ShepherdHistoryDetailResponse", shepherdHistoryDetailResponse$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("possible_afib_tile", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("pageTitle", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("advise", false);
        pluginGeneratedSerialDescriptor.addElement("ecg_item_info", false);
        pluginGeneratedSerialDescriptor.addElement("afib_history_box", false);
        pluginGeneratedSerialDescriptor.addElement("clearButton", false);
        pluginGeneratedSerialDescriptor.addElement("clearHistoryDialog", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ShepherdHistoryDetailResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(LabradorItemInfo$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(ShepherdClearHistoryDialogResponse$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{PossibleShepherdTileResponse$$serializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, interfaceC37138cM122336d, ShepherdHistoryDetailBox$$serializer.INSTANCE, ShepherdHistoryDetailClearButton$$serializer.INSTANCE, interfaceC37138cM122336d2};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ShepherdHistoryDetailResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse;
        ShepherdHistoryDetailClearButton shepherdHistoryDetailClearButton;
        ShepherdHistoryDetailBox shepherdHistoryDetailBox;
        LabradorItemInfo labradorItemInfo;
        PossibleShepherdTileResponse possibleShepherdTileResponse;
        String str;
        String str2;
        String str3;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 7;
        int i15 = 6;
        PossibleShepherdTileResponse possibleShepherdTileResponse2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            PossibleShepherdTileResponse possibleShepherdTileResponse3 = (PossibleShepherdTileResponse) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, PossibleShepherdTileResponse$$serializer.INSTANCE, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            LabradorItemInfo labradorItemInfo2 = (LabradorItemInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, LabradorItemInfo$$serializer.INSTANCE, null);
            ShepherdHistoryDetailBox shepherdHistoryDetailBox2 = (ShepherdHistoryDetailBox) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, ShepherdHistoryDetailBox$$serializer.INSTANCE, null);
            possibleShepherdTileResponse = possibleShepherdTileResponse3;
            shepherdHistoryDetailClearButton = (ShepherdHistoryDetailClearButton) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, ShepherdHistoryDetailClearButton$$serializer.INSTANCE, null);
            shepherdHistoryDetailBox = shepherdHistoryDetailBox2;
            labradorItemInfo = labradorItemInfo2;
            str3 = strDecodeStringElement3;
            shepherdClearHistoryDialogResponse = (ShepherdClearHistoryDialogResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, ShepherdClearHistoryDialogResponse$$serializer.INSTANCE, null);
            str4 = strDecodeStringElement4;
            str2 = strDecodeStringElement2;
            str = strDecodeStringElement;
            i13 = 511;
        } else {
            boolean z4 = true;
            int i16 = 0;
            ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse2 = null;
            ShepherdHistoryDetailClearButton shepherdHistoryDetailClearButton2 = null;
            ShepherdHistoryDetailBox shepherdHistoryDetailBox3 = null;
            LabradorItemInfo labradorItemInfo3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 6;
                        break;
                    case 0:
                        possibleShepherdTileResponse2 = (PossibleShepherdTileResponse) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, PossibleShepherdTileResponse$$serializer.INSTANCE, possibleShepherdTileResponse2);
                        i16 |= 1;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 1:
                        i16 |= 2;
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        break;
                    case 2:
                        i16 |= 4;
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        break;
                    case 3:
                        i16 |= 8;
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        break;
                    case 4:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i16 |= 16;
                        break;
                    case 5:
                        labradorItemInfo3 = (LabradorItemInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, LabradorItemInfo$$serializer.INSTANCE, labradorItemInfo3);
                        i16 |= 32;
                        break;
                    case 6:
                        shepherdHistoryDetailBox3 = (ShepherdHistoryDetailBox) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, ShepherdHistoryDetailBox$$serializer.INSTANCE, shepherdHistoryDetailBox3);
                        i16 |= 64;
                        break;
                    case 7:
                        shepherdHistoryDetailClearButton2 = (ShepherdHistoryDetailClearButton) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, ShepherdHistoryDetailClearButton$$serializer.INSTANCE, shepherdHistoryDetailClearButton2);
                        i16 |= 128;
                        break;
                    case 8:
                        shepherdClearHistoryDialogResponse2 = (ShepherdClearHistoryDialogResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, ShepherdClearHistoryDialogResponse$$serializer.INSTANCE, shepherdClearHistoryDialogResponse2);
                        i16 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            shepherdClearHistoryDialogResponse = shepherdClearHistoryDialogResponse2;
            shepherdHistoryDetailClearButton = shepherdHistoryDetailClearButton2;
            shepherdHistoryDetailBox = shepherdHistoryDetailBox3;
            labradorItemInfo = labradorItemInfo3;
            possibleShepherdTileResponse = possibleShepherdTileResponse2;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ShepherdHistoryDetailResponse(i13, possibleShepherdTileResponse, str, str2, str3, str4, labradorItemInfo, shepherdHistoryDetailBox, shepherdHistoryDetailClearButton, shepherdClearHistoryDialogResponse, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ShepherdHistoryDetailResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ShepherdHistoryDetailResponse.write$Self$shepherd_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
