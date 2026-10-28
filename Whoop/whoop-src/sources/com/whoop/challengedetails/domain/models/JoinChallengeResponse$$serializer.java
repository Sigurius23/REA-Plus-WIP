package com.whoop.challengedetails.domain.models;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/challengedetails/domain/models/JoinChallengeResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class JoinChallengeResponse$$serializer implements GeneratedSerializer<JoinChallengeResponse> {
    public static final int $stable;
    public static final JoinChallengeResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        JoinChallengeResponse$$serializer joinChallengeResponse$$serializer = new JoinChallengeResponse$$serializer();
        INSTANCE = joinChallengeResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.challengedetails.domain.models.JoinChallengeResponse", joinChallengeResponse$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_STATUS, false);
        pluginGeneratedSerialDescriptor.addElement("text", false);
        pluginGeneratedSerialDescriptor.addElement("sub_text", false);
        pluginGeneratedSerialDescriptor.addElement("cta_text", false);
        pluginGeneratedSerialDescriptor.addElement("cta_close", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private JoinChallengeResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{JoinChallengeResponse.$childSerializers[0].getValue(), c25452a, c25452a, AbstractC38195a.m122336d(c25452a), AbstractC38195a.m122336d(c25452a)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final JoinChallengeResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        JoinChallengeResponseStatus joinChallengeResponseStatus;
        TextResource textResource;
        TextResource textResource2;
        TextResource textResource3;
        TextResource textResource4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = JoinChallengeResponse.$childSerializers;
        int i14 = 0;
        JoinChallengeResponseStatus joinChallengeResponseStatus2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            JoinChallengeResponseStatus joinChallengeResponseStatus3 = (JoinChallengeResponseStatus) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            TextResource textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, c25452a, null);
            TextResource textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, c25452a, null);
            joinChallengeResponseStatus = joinChallengeResponseStatus3;
            textResource4 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, c25452a, null);
            textResource3 = textResource7;
            i13 = 31;
            textResource2 = textResource6;
            textResource = textResource5;
        } else {
            int i15 = 1;
            int i16 = 0;
            TextResource textResource8 = null;
            TextResource textResource9 = null;
            TextResource textResource10 = null;
            TextResource textResource11 = null;
            while (i15 != 0) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                int i17 = i14;
                if (iDecodeElementIndex == -1) {
                    i14 = i17;
                    i15 = i14;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource8);
                        i16 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C25452a.f99689a, textResource9);
                        i16 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        textResource10 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, C25452a.f99689a, textResource10);
                        i16 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        textResource11 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, C25452a.f99689a, textResource11);
                        i16 |= 16;
                    }
                    i14 = i17;
                } else {
                    joinChallengeResponseStatus2 = (JoinChallengeResponseStatus) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), joinChallengeResponseStatus2);
                    i16 |= 1;
                    i14 = i17;
                }
            }
            i13 = i16;
            joinChallengeResponseStatus = joinChallengeResponseStatus2;
            textResource = textResource8;
            textResource2 = textResource9;
            textResource3 = textResource10;
            textResource4 = textResource11;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new JoinChallengeResponse(i13, joinChallengeResponseStatus, textResource, textResource2, textResource3, textResource4, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, JoinChallengeResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        JoinChallengeResponse.write$Self$challenge_details_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
