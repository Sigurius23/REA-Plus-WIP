package com.whoop.addactivity.network.model;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/addactivity/network/model/Activity.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/addactivity/network/model/Activity;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/addactivity/network/model/Activity;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/addactivity/network/model/Activity;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class Activity$$serializer implements GeneratedSerializer<Activity> {
    public static final Activity$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        Activity$$serializer activity$$serializer = new Activity$$serializer();
        INSTANCE = activity$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.addactivity.network.model.Activity", activity$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("displayName", false);
        pluginGeneratedSerialDescriptor.addElement("internalName", false);
        pluginGeneratedSerialDescriptor.addElement("iconUrl", false);
        pluginGeneratedSerialDescriptor.addElement("deleted", false);
        pluginGeneratedSerialDescriptor.addElement("category", false);
        pluginGeneratedSerialDescriptor.addElement("scoreType", false);
        pluginGeneratedSerialDescriptor.addElement("hasGps", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Activity$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = Activity.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, interfaceC23462hArr[5].getValue(), booleanSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final Activity deserialize(InterfaceC40541d decoder) {
        boolean zDecodeBooleanElement;
        ScoreType scoreType;
        boolean z4;
        int i13;
        String str;
        String str2;
        String str3;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = Activity.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            scoreType = (ScoreType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            str = strDecodeStringElement;
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
            z4 = zDecodeBooleanElement2;
            str4 = strDecodeStringElement4;
            str3 = strDecodeStringElement3;
            i13 = 127;
            str2 = strDecodeStringElement2;
        } else {
            boolean z13 = true;
            boolean zDecodeBooleanElement3 = false;
            int i14 = 0;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            boolean zDecodeBooleanElement4 = false;
            ScoreType scoreType2 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        break;
                    case 0:
                        i14 |= 1;
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        continue;
                    case 1:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 |= 2;
                        continue;
                    case 2:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i14 |= 4;
                        break;
                    case 3:
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
                        i14 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i14 |= 16;
                        break;
                    case 5:
                        scoreType2 = (ScoreType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), scoreType2);
                        i14 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
                        i14 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            scoreType = scoreType2;
            z4 = zDecodeBooleanElement4;
            i13 = i14;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new Activity(i13, str, str2, str3, z4, str4, scoreType, zDecodeBooleanElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, Activity value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        Activity.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
