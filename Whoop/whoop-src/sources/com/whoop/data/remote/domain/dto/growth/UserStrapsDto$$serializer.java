package com.whoop.data.remote.domain.dto.growth;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/data/remote/domain/dto/growth/UserStrapsDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class UserStrapsDto$$serializer implements GeneratedSerializer<UserStrapsDto> {
    public static final UserStrapsDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        UserStrapsDto$$serializer userStrapsDto$$serializer = new UserStrapsDto$$serializer();
        INSTANCE = userStrapsDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.data.remote.domain.dto.growth.UserStrapsDto", userStrapsDto$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("lastSeenStrap", false);
        pluginGeneratedSerialDescriptor.addElement("orderedStrap", false);
        pluginGeneratedSerialDescriptor.addElement("previousStraps", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserStrapsDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = UserStrapsDto.$childSerializers;
        UserStrapsDto$StrapDto$$serializer userStrapsDto$StrapDto$$serializer = UserStrapsDto$StrapDto$$serializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(userStrapsDto$StrapDto$$serializer), AbstractC38195a.m122336d(userStrapsDto$StrapDto$$serializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[2].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final UserStrapsDto deserialize(InterfaceC40541d decoder) {
        int i13;
        UserStrapsDto.StrapDto strapDto;
        UserStrapsDto.StrapDto strapDto2;
        List list;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = UserStrapsDto.$childSerializers;
        UserStrapsDto.StrapDto strapDto3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            UserStrapsDto$StrapDto$$serializer userStrapsDto$StrapDto$$serializer = UserStrapsDto$StrapDto$$serializer.INSTANCE;
            UserStrapsDto.StrapDto strapDto4 = (UserStrapsDto.StrapDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, userStrapsDto$StrapDto$$serializer, null);
            UserStrapsDto.StrapDto strapDto5 = (UserStrapsDto.StrapDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, userStrapsDto$StrapDto$$serializer, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            strapDto2 = strapDto5;
            i13 = 7;
            strapDto = strapDto4;
        } else {
            boolean z4 = true;
            int i14 = 0;
            UserStrapsDto.StrapDto strapDto6 = null;
            List list2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    strapDto3 = (UserStrapsDto.StrapDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, UserStrapsDto$StrapDto$$serializer.INSTANCE, strapDto3);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strapDto6 = (UserStrapsDto.StrapDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, UserStrapsDto$StrapDto$$serializer.INSTANCE, strapDto6);
                    i14 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), list2);
                    i14 |= 4;
                }
            }
            i13 = i14;
            strapDto = strapDto3;
            strapDto2 = strapDto6;
            list = list2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new UserStrapsDto(i13, strapDto, strapDto2, list, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, UserStrapsDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        UserStrapsDto.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
