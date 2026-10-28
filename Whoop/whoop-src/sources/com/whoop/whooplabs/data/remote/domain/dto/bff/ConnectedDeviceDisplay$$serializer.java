package com.whoop.whooplabs.data.remote.domain.dto.bff;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ConnectedDeviceDisplay$$serializer implements GeneratedSerializer<ConnectedDeviceDisplay> {
    public static final int $stable;
    public static final ConnectedDeviceDisplay$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ConnectedDeviceDisplay$$serializer connectedDeviceDisplay$$serializer = new ConnectedDeviceDisplay$$serializer();
        INSTANCE = connectedDeviceDisplay$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.whooplabs.data.remote.domain.dto.bff.ConnectedDeviceDisplay", connectedDeviceDisplay$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("deviceType", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("connectedSubtitle", false);
        pluginGeneratedSerialDescriptor.addElement("connectedText", false);
        pluginGeneratedSerialDescriptor.addElement("connectedIcon", false);
        pluginGeneratedSerialDescriptor.addElement("connectedCtaButton", false);
        pluginGeneratedSerialDescriptor.addElement("disconnectedSubtitle", false);
        pluginGeneratedSerialDescriptor.addElement("disconnectedText", false);
        pluginGeneratedSerialDescriptor.addElement("disconnectedIcon", false);
        pluginGeneratedSerialDescriptor.addElement("disconnectedCtaButton", false);
        pluginGeneratedSerialDescriptor.addElement("disconnectView", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConnectedDeviceDisplay$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(DisconnectView$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        CtaButton$$serializer ctaButton$$serializer = CtaButton$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, ctaButton$$serializer, stringSerializer, stringSerializer, stringSerializer, ctaButton$$serializer, interfaceC37138cM122336d};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ConnectedDeviceDisplay deserialize(InterfaceC40541d decoder) {
        int i13;
        DisconnectView disconnectView;
        CtaButton ctaButton;
        CtaButton ctaButton2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 10;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            CtaButton$$serializer ctaButton$$serializer = CtaButton$$serializer.INSTANCE;
            CtaButton ctaButton3 = (CtaButton) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, ctaButton$$serializer, null);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            CtaButton ctaButton4 = (CtaButton) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, ctaButton$$serializer, null);
            str = strDecodeStringElement2;
            disconnectView = (DisconnectView) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, DisconnectView$$serializer.INSTANCE, null);
            ctaButton = ctaButton4;
            str7 = strDecodeStringElement8;
            str6 = strDecodeStringElement7;
            ctaButton2 = ctaButton3;
            str4 = strDecodeStringElement5;
            str8 = strDecodeStringElement9;
            str5 = strDecodeStringElement6;
            str3 = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            i13 = 2047;
        } else {
            boolean z4 = true;
            int i15 = 0;
            DisconnectView disconnectView2 = null;
            CtaButton ctaButton5 = null;
            CtaButton ctaButton6 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 10;
                        break;
                    case 0:
                        i15 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 10;
                        break;
                    case 1:
                        i15 |= 2;
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 = 10;
                        break;
                    case 2:
                        strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i15 |= 4;
                        i14 = 10;
                        break;
                    case 3:
                        strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement13 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        ctaButton6 = (CtaButton) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, CtaButton$$serializer.INSTANCE, ctaButton6);
                        i15 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement14 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i15 |= 64;
                        break;
                    case 7:
                        strDecodeStringElement15 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i15 |= 128;
                        break;
                    case 8:
                        strDecodeStringElement16 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i15 |= 256;
                        break;
                    case 9:
                        ctaButton5 = (CtaButton) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, CtaButton$$serializer.INSTANCE, ctaButton5);
                        i15 |= 512;
                        break;
                    case 10:
                        disconnectView2 = (DisconnectView) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, DisconnectView$$serializer.INSTANCE, disconnectView2);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            disconnectView = disconnectView2;
            ctaButton = ctaButton5;
            ctaButton2 = ctaButton6;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement10;
            str3 = strDecodeStringElement11;
            str4 = strDecodeStringElement12;
            str5 = strDecodeStringElement13;
            str6 = strDecodeStringElement14;
            str7 = strDecodeStringElement15;
            str8 = strDecodeStringElement16;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ConnectedDeviceDisplay(i13, str, str2, str3, str4, str5, ctaButton2, str6, str7, str8, ctaButton, disconnectView, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ConnectedDeviceDisplay value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ConnectedDeviceDisplay.write$Self$whooplabs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
