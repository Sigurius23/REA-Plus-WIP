package com.whoop.access.reconfirmlabs.domain.models;

import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import com.whoop.design.models.tiles.EmptyTileModel;
import com.whoop.design.models.tiles.EmptyTileModel$$serializer;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ReconfirmLabsScreenResponse$$serializer implements GeneratedSerializer<ReconfirmLabsScreenResponse> {
    public static final int $stable;
    public static final ReconfirmLabsScreenResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ReconfirmLabsScreenResponse$$serializer reconfirmLabsScreenResponse$$serializer = new ReconfirmLabsScreenResponse$$serializer();
        INSTANCE = reconfirmLabsScreenResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.access.reconfirmlabs.domain.models.ReconfirmLabsScreenResponse", reconfirmLabsScreenResponse$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("tile", false);
        pluginGeneratedSerialDescriptor.addElement("progressButton", false);
        pluginGeneratedSerialDescriptor.addElement("callout", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ReconfirmLabsScreenResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, EmptyTileModel$$serializer.INSTANCE, ProgressButtonModel$$serializer.INSTANCE, AbstractC38195a.m122336d(InfoCalloutTileModel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ReconfirmLabsScreenResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        InfoCalloutTileModel infoCalloutTileModel;
        String str;
        String str2;
        String str3;
        String str4;
        EmptyTileModel emptyTileModel;
        ProgressButtonModel progressButtonModel;
        boolean z4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 6;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            EmptyTileModel emptyTileModel2 = (EmptyTileModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, EmptyTileModel$$serializer.INSTANCE, null);
            ProgressButtonModel progressButtonModel2 = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, ProgressButtonModel$$serializer.INSTANCE, null);
            str = strDecodeStringElement2;
            infoCalloutTileModel = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, InfoCalloutTileModel$$serializer.INSTANCE, null);
            progressButtonModel = progressButtonModel2;
            str4 = strDecodeStringElement4;
            emptyTileModel = emptyTileModel2;
            str3 = strDecodeStringElement3;
            str2 = str5;
            i13 = 127;
        } else {
            boolean z13 = true;
            int i15 = 0;
            InfoCalloutTileModel infoCalloutTileModel2 = null;
            String str6 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            EmptyTileModel emptyTileModel3 = null;
            ProgressButtonModel progressButtonModel3 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        break;
                    case 0:
                        z4 = true;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 |= 1;
                        i14 = 6;
                        break;
                    case 1:
                        z4 = true;
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str6);
                        i15 |= 2;
                        i14 = 6;
                        break;
                    case 2:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        emptyTileModel3 = (EmptyTileModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, EmptyTileModel$$serializer.INSTANCE, emptyTileModel3);
                        i15 |= 16;
                        break;
                    case 5:
                        progressButtonModel3 = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, ProgressButtonModel$$serializer.INSTANCE, progressButtonModel3);
                        i15 |= 32;
                        break;
                    case 6:
                        infoCalloutTileModel2 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, InfoCalloutTileModel$$serializer.INSTANCE, infoCalloutTileModel2);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            infoCalloutTileModel = infoCalloutTileModel2;
            str = strDecodeStringElement;
            str2 = str6;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
            emptyTileModel = emptyTileModel3;
            progressButtonModel = progressButtonModel3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ReconfirmLabsScreenResponse(i13, str, str2, str3, str4, emptyTileModel, progressButtonModel, infoCalloutTileModel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ReconfirmLabsScreenResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ReconfirmLabsScreenResponse.write$Self$access_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
