package com.whoop.home.domain.models;

import com.whoop.navigation.C9598e;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/home/domain/models/ScoreGaugeStickyDialModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/home/domain/models/ScoreGaugeStickyDialModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ScoreGaugeStickyDialModel$$serializer implements GeneratedSerializer<ScoreGaugeStickyDialModel> {
    public static final int $stable;
    public static final ScoreGaugeStickyDialModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ScoreGaugeStickyDialModel$$serializer scoreGaugeStickyDialModel$$serializer = new ScoreGaugeStickyDialModel$$serializer();
        INSTANCE = scoreGaugeStickyDialModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.home.domain.models.ScoreGaugeStickyDialModel", scoreGaugeStickyDialModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("scoreDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("scoreDisplaySuffix", false);
        pluginGeneratedSerialDescriptor.addElement("gaugeFillPercentage", false);
        pluginGeneratedSerialDescriptor.addElement("progressFillStyle", false);
        pluginGeneratedSerialDescriptor.addElement("titleEndIcon", false);
        pluginGeneratedSerialDescriptor.addElement("scoreTarget", false);
        pluginGeneratedSerialDescriptor.addElement("lowerOptimalPercentage", false);
        pluginGeneratedSerialDescriptor.addElement("higherOptimalPercentage", false);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScoreGaugeStickyDialModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ScoreGaugeStickyDialModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), floatSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(floatSerializer), AbstractC38195a.m122336d(floatSerializer), AbstractC38195a.m122336d(floatSerializer), interfaceC23462hArr[10].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ScoreGaugeStickyDialModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        C9598e c9598e;
        Float f13;
        Float f14;
        Float f15;
        String str2;
        String str3;
        float f16;
        String str4;
        String str5;
        String str6;
        char c3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ScoreGaugeStickyDialModel.$childSerializers;
        int i14 = 9;
        int i15 = 7;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            float fDecodeFloatElement = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 4);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f17 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, floatSerializer, null);
            Float f18 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, floatSerializer, null);
            Float f19 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, floatSerializer, null);
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            str2 = str9;
            f14 = f19;
            f15 = f17;
            i13 = 2047;
            str6 = strDecodeStringElement3;
            str3 = str8;
            f13 = f18;
            f16 = fDecodeFloatElement;
            str5 = strDecodeStringElement2;
            str4 = strDecodeStringElement;
            str = str7;
        } else {
            boolean z4 = true;
            C9598e c9598e2 = null;
            Float f24 = null;
            Float f25 = null;
            Float f26 = null;
            String str10 = null;
            String str11 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            float fDecodeFloatElement2 = 0.0f;
            int i16 = 0;
            String str12 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 7;
                        break;
                    case 0:
                        i16 |= 1;
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str11);
                        i14 = 9;
                        i15 = 7;
                        break;
                    case 1:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        i14 = 9;
                        i15 = 7;
                        break;
                    case 2:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        i14 = 9;
                        i15 = 7;
                        break;
                    case 3:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str12);
                        i16 |= 8;
                        i14 = 9;
                        i15 = 7;
                        break;
                    case 4:
                        i16 |= 16;
                        fDecodeFloatElement2 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 4);
                        i14 = 9;
                        break;
                    case 5:
                        c3 = 6;
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i16 |= 32;
                        i14 = 9;
                        break;
                    case 6:
                        c3 = 6;
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str10);
                        i16 |= 64;
                        i14 = 9;
                        break;
                    case 7:
                        f26 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, FloatSerializer.INSTANCE, f26);
                        i16 |= 128;
                        break;
                    case 8:
                        f24 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, FloatSerializer.INSTANCE, f24);
                        i16 |= 256;
                        break;
                    case 9:
                        f25 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, FloatSerializer.INSTANCE, f25);
                        i16 |= 512;
                        break;
                    case 10:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), c9598e2);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            str = str11;
            c9598e = c9598e2;
            f13 = f24;
            f14 = f25;
            f15 = f26;
            str2 = str10;
            str3 = str12;
            f16 = fDecodeFloatElement2;
            str4 = strDecodeStringElement4;
            str5 = strDecodeStringElement5;
            str6 = strDecodeStringElement6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ScoreGaugeStickyDialModel(i13, str, str4, str5, str3, f16, str6, str2, f15, f13, f14, c9598e, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ScoreGaugeStickyDialModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ScoreGaugeStickyDialModel.write$Self$home_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
