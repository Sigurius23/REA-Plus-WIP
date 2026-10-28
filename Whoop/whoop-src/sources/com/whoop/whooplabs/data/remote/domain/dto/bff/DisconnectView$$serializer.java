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
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class DisconnectView$$serializer implements GeneratedSerializer<DisconnectView> {
    public static final int $stable;
    public static final DisconnectView$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        DisconnectView$$serializer disconnectView$$serializer = new DisconnectView$$serializer();
        INSTANCE = disconnectView$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.whooplabs.data.remote.domain.dto.bff.DisconnectView", disconnectView$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        pluginGeneratedSerialDescriptor.addElement("positiveCta", false);
        pluginGeneratedSerialDescriptor.addElement("negativeCta", false);
        pluginGeneratedSerialDescriptor.addElement("errorTitle", false);
        pluginGeneratedSerialDescriptor.addElement("errorBody", false);
        pluginGeneratedSerialDescriptor.addElement("errorPositiveCta", false);
        pluginGeneratedSerialDescriptor.addElement("errorNegativeCta", false);
        pluginGeneratedSerialDescriptor.addElement("submittingTitle", false);
        pluginGeneratedSerialDescriptor.addElement("submittingBody", false);
        pluginGeneratedSerialDescriptor.addElement("successText", false);
        pluginGeneratedSerialDescriptor.addElement("successSubtext", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DisconnectView$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final DisconnectView deserialize(InterfaceC40541d decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i13 = 0;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            String strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
            String strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 10);
            i13 = 4095;
            strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
            str = strDecodeStringElement12;
            str2 = strDecodeStringElement11;
            str3 = strDecodeStringElement9;
            str4 = strDecodeStringElement8;
            str5 = strDecodeStringElement7;
            str6 = strDecodeStringElement5;
            str7 = strDecodeStringElement10;
            str8 = strDecodeStringElement6;
            str9 = strDecodeStringElement4;
            str10 = strDecodeStringElement3;
        } else {
            strDecodeStringElement = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            boolean z4 = true;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        i13 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        continue;
                    case 1:
                        strDecodeStringElement23 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i13 |= 2;
                        continue;
                    case 2:
                        strDecodeStringElement22 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i13 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement19 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i13 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement21 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i13 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement18 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i13 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement17 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i13 |= 64;
                        break;
                    case 7:
                        strDecodeStringElement16 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i13 |= 128;
                        break;
                    case 8:
                        strDecodeStringElement20 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i13 |= 256;
                        break;
                    case 9:
                        strDecodeStringElement15 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
                        i13 |= 512;
                        break;
                    case 10:
                        strDecodeStringElement14 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 10);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    case 11:
                        strDecodeStringElement13 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement2 = strDecodeStringElement13;
            str = strDecodeStringElement14;
            str2 = strDecodeStringElement15;
            str3 = strDecodeStringElement16;
            str4 = strDecodeStringElement17;
            str5 = strDecodeStringElement18;
            str6 = strDecodeStringElement19;
            str7 = strDecodeStringElement20;
            str8 = strDecodeStringElement21;
            str9 = strDecodeStringElement22;
            str10 = strDecodeStringElement23;
        }
        String str11 = strDecodeStringElement;
        int i14 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new DisconnectView(i14, str11, str10, str9, str6, str8, str5, str4, str3, str7, str2, str, strDecodeStringElement2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, DisconnectView value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        DisconnectView.write$Self$whooplabs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
