package com.whoop.activation.domain.models.steps;

import com.whoop.design.util.TextResource;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import md1.C25452a;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/activation/domain/models/steps/BillingFrequencyTile.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/BillingFrequencyTile;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class BillingFrequencyTile$$serializer implements GeneratedSerializer<BillingFrequencyTile> {
    public static final int $stable;
    public static final BillingFrequencyTile$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        BillingFrequencyTile$$serializer billingFrequencyTile$$serializer = new BillingFrequencyTile$$serializer();
        INSTANCE = billingFrequencyTile$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.activation.domain.models.steps.BillingFrequencyTile", billingFrequencyTile$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("text", false);
        pluginGeneratedSerialDescriptor.addElement("subtext", false);
        pluginGeneratedSerialDescriptor.addElement("upsellText", true);
        pluginGeneratedSerialDescriptor.addElement("billingFrequency", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BillingFrequencyTile$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{c25452a, c25452a, AbstractC38195a.m122336d(c25452a), StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final BillingFrequencyTile deserialize(InterfaceC40541d decoder) {
        int i13;
        TextResource textResource;
        TextResource textResource2;
        TextResource textResource3;
        String strDecodeStringElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        TextResource textResource4 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            TextResource textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, c25452a, null);
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            i13 = 15;
            textResource2 = textResource6;
            textResource = textResource5;
        } else {
            boolean z4 = true;
            int i14 = 0;
            TextResource textResource7 = null;
            TextResource textResource8 = null;
            String strDecodeStringElement2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    textResource4 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource4);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource7);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, C25452a.f99689a, textResource8);
                    i14 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                    i14 |= 8;
                }
            }
            i13 = i14;
            textResource = textResource4;
            textResource2 = textResource7;
            textResource3 = textResource8;
            strDecodeStringElement = strDecodeStringElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new BillingFrequencyTile(i13, textResource, textResource2, textResource3, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, BillingFrequencyTile value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        BillingFrequencyTile.write$Self$activation_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
