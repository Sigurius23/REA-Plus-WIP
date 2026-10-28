package com.whoop.streaks.domain.models;

import com.whoop.design.models.TitleSubTitleModel;
import com.whoop.design.models.TitleSubTitleModel$$serializer;
import com.whoop.design.models.celebration.CelebrationMediaModel;
import com.whoop.design.models.celebration.CelebrationMediaModel$$serializer;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/streaks/domain/models/StreaksResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/streaks/domain/models/StreaksResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/streaks/domain/models/StreaksResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/streaks/domain/models/StreaksResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class StreaksResponse$$serializer implements GeneratedSerializer<StreaksResponse> {
    public static final int $stable;
    public static final StreaksResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        StreaksResponse$$serializer streaksResponse$$serializer = new StreaksResponse$$serializer();
        INSTANCE = streaksResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.streaks.domain.models.StreaksResponse", streaksResponse$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("lottieUrl", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("celebrationMedia", true);
        pluginGeneratedSerialDescriptor.addElement("titleSubtitle", true);
        pluginGeneratedSerialDescriptor.addElement("streakValue", false);
        pluginGeneratedSerialDescriptor.addElement("streakSubtitle", true);
        pluginGeneratedSerialDescriptor.addElement("today_streak_state", false);
        pluginGeneratedSerialDescriptor.addElement("items", false);
        pluginGeneratedSerialDescriptor.addElement("headerIcon", false);
        pluginGeneratedSerialDescriptor.addElement("headerIconDestination", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StreaksResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = StreaksResponse.$childSerializers;
        C25452a c25452a = C25452a.f99689a;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{c25452a, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(CelebrationMediaModel$$serializer.INSTANCE), AbstractC38195a.m122336d(TitleSubTitleModel$$serializer.INSTANCE), c25452a, AbstractC38195a.m122336d(c25452a), stringSerializer, interfaceC23462hArr[8].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final StreaksResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        C9598e c9598e;
        String str2;
        List list;
        TextResource textResource;
        TextResource textResource2;
        TitleSubTitleModel titleSubTitleModel;
        CelebrationMediaModel celebrationMediaModel;
        String str3;
        TextResource textResource3;
        String str4;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = StreaksResponse.$childSerializers;
        int i15 = 8;
        TextResource textResource4 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            CelebrationMediaModel celebrationMediaModel2 = (CelebrationMediaModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, CelebrationMediaModel$$serializer.INSTANCE, null);
            TitleSubTitleModel titleSubTitleModel2 = (TitleSubTitleModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, TitleSubTitleModel$$serializer.INSTANCE, null);
            TextResource textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, c25452a, null);
            TextResource textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, c25452a, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            textResource2 = textResource7;
            celebrationMediaModel = celebrationMediaModel2;
            str4 = strDecodeStringElement;
            list = list2;
            textResource = textResource6;
            titleSubTitleModel = titleSubTitleModel2;
            str2 = str7;
            str3 = str6;
            i13 = 2047;
            str = str5;
            textResource3 = textResource5;
        } else {
            int i16 = 10;
            boolean z4 = true;
            int i17 = 0;
            String str8 = null;
            C9598e c9598e2 = null;
            String str9 = null;
            List list3 = null;
            TextResource textResource8 = null;
            TextResource textResource9 = null;
            TitleSubTitleModel titleSubTitleModel3 = null;
            CelebrationMediaModel celebrationMediaModel3 = null;
            String str10 = null;
            String strDecodeStringElement2 = null;
            while (z4) {
                int i18 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 8;
                        break;
                    case 0:
                        textResource4 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource4);
                        i17 |= 1;
                        i16 = 10;
                        i15 = 8;
                        break;
                    case 1:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str8);
                        i17 |= 2;
                        i16 = 10;
                        i15 = 8;
                        break;
                    case 2:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str10);
                        i17 |= 4;
                        i16 = 10;
                        i15 = 8;
                        break;
                    case 3:
                        celebrationMediaModel3 = (CelebrationMediaModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, CelebrationMediaModel$$serializer.INSTANCE, celebrationMediaModel3);
                        i17 |= 8;
                        i16 = 10;
                        i15 = 8;
                        break;
                    case 4:
                        titleSubTitleModel3 = (TitleSubTitleModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, TitleSubTitleModel$$serializer.INSTANCE, titleSubTitleModel3);
                        i17 |= 16;
                        i16 = 10;
                        i15 = 8;
                        break;
                    case 5:
                        textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, C25452a.f99689a, textResource8);
                        i17 |= 32;
                        i16 = 10;
                        i15 = 8;
                        break;
                    case 6:
                        textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, C25452a.f99689a, textResource9);
                        i17 |= 64;
                        i16 = 10;
                        i15 = 8;
                        break;
                    case 7:
                        i14 = i18;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i17 |= 128;
                        i15 = i14;
                        i16 = 10;
                        break;
                    case 8:
                        i14 = i18;
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), list3);
                        i17 |= 256;
                        i15 = i14;
                        i16 = 10;
                        break;
                    case 9:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str9);
                        i17 |= 512;
                        i15 = i18;
                        i16 = 10;
                        break;
                    case 10:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), c9598e2);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i15 = i18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            str = str8;
            c9598e = c9598e2;
            str2 = str9;
            list = list3;
            textResource = textResource8;
            textResource2 = textResource9;
            titleSubTitleModel = titleSubTitleModel3;
            celebrationMediaModel = celebrationMediaModel3;
            str3 = str10;
            textResource3 = textResource4;
            str4 = strDecodeStringElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new StreaksResponse(i13, textResource3, str, str3, celebrationMediaModel, titleSubTitleModel, textResource, textResource2, str4, list, str2, c9598e, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, StreaksResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        StreaksResponse.write$Self$streaks_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
