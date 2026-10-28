package com.whoop.whoopaction.domain.models;

import io.getstream.chat.android.client.api.QueryParams;
import java.util.Date;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import u82.C34641b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/whoopaction/domain/models/AddToCalendarParameters.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class AddToCalendarParameters$$serializer implements GeneratedSerializer<AddToCalendarParameters> {
    public static final int $stable;
    public static final AddToCalendarParameters$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        AddToCalendarParameters$$serializer addToCalendarParameters$$serializer = new AddToCalendarParameters$$serializer();
        INSTANCE = addToCalendarParameters$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.whoopaction.domain.models.AddToCalendarParameters", addToCalendarParameters$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("startDate", false);
        pluginGeneratedSerialDescriptor.addElement("endDate", false);
        pluginGeneratedSerialDescriptor.addElement("location", true);
        pluginGeneratedSerialDescriptor.addElement("notes", true);
        pluginGeneratedSerialDescriptor.addElement(QueryParams.URL, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AddToCalendarParameters$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        C34641b c34641b = C34641b.f145940a;
        return new InterfaceC37138c[]{stringSerializer, c34641b, c34641b, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final AddToCalendarParameters deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        Date date;
        Date date2;
        String str2;
        String str3;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            C34641b c34641b = C34641b.f145940a;
            Date date3 = (Date) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c34641b, null);
            Date date4 = (Date) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, c34641b, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            str = strDecodeStringElement2;
            str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            str2 = str5;
            str3 = str6;
            date2 = date4;
            date = date3;
            i13 = 63;
        } else {
            boolean z4 = true;
            int i14 = 0;
            Date date5 = null;
            Date date6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        continue;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 |= 1;
                        continue;
                    case 1:
                        date5 = (Date) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C34641b.f145940a, date5);
                        i14 |= 2;
                        break;
                    case 2:
                        date6 = (Date) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C34641b.f145940a, date6);
                        i14 |= 4;
                        break;
                    case 3:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str7);
                        i14 |= 8;
                        break;
                    case 4:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str8);
                        i14 |= 16;
                        break;
                    case 5:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str9);
                        i14 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i14;
            str = strDecodeStringElement;
            date = date5;
            date2 = date6;
            str2 = str7;
            str3 = str8;
            str4 = str9;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new AddToCalendarParameters(i13, str, date, date2, str2, str3, str4, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, AddToCalendarParameters value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        AddToCalendarParameters.write$Self$whoop_action_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
