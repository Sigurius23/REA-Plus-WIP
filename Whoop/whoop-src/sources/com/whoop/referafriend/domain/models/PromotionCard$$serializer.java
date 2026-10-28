package com.whoop.referafriend.domain.models;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/referafriend/domain/models/PromotionCard.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/referafriend/domain/models/PromotionCard;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/referafriend/domain/models/PromotionCard;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/referafriend/domain/models/PromotionCard;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class PromotionCard$$serializer implements GeneratedSerializer<PromotionCard> {
    public static final int $stable;
    public static final PromotionCard$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        PromotionCard$$serializer promotionCard$$serializer = new PromotionCard$$serializer();
        INSTANCE = promotionCard$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.referafriend.domain.models.PromotionCard", promotionCard$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        pluginGeneratedSerialDescriptor.addElement("referrals_completed", false);
        pluginGeneratedSerialDescriptor.addElement("referrals_needed", false);
        pluginGeneratedSerialDescriptor.addElement("referral_progress_text", false);
        pluginGeneratedSerialDescriptor.addElement("days_left_text", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PromotionCard$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, intSerializer, intSerializer, stringSerializer, interfaceC37138cM122336d};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final PromotionCard deserialize(InterfaceC40541d decoder) {
        int i13;
        int i14;
        int i15;
        String str;
        String str2;
        String str3;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            str = strDecodeStringElement;
            str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, null);
            i13 = iDecodeIntElement2;
            str3 = strDecodeStringElement3;
            i14 = iDecodeIntElement;
            str2 = strDecodeStringElement2;
            i15 = 63;
        } else {
            boolean z4 = true;
            int iDecodeIntElement3 = 0;
            int i16 = 0;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String str5 = null;
            int iDecodeIntElement4 = 0;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        continue;
                    case 0:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i16 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        break;
                    case 2:
                        iDecodeIntElement4 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
                        i16 |= 4;
                        break;
                    case 3:
                        iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
                        i16 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i16 |= 16;
                        break;
                    case 5:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str5);
                        i16 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = iDecodeIntElement3;
            i14 = iDecodeIntElement4;
            i15 = i16;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            str4 = str5;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new PromotionCard(i15, str, str2, i14, i13, str3, str4, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, PromotionCard value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        PromotionCard.write$Self$refer_a_friend_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
