package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/ActivityModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/ActivityModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/ActivityModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/ActivityModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ActivityModel$$serializer implements GeneratedSerializer<ActivityModel> {
    public static final int $stable;
    public static final ActivityModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ActivityModel$$serializer activityModel$$serializer = new ActivityModel$$serializer();
        INSTANCE = activityModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.ActivityModel", activityModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("scoreDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("startTimeText", true);
        pluginGeneratedSerialDescriptor.addElement("endTimeText", true);
        pluginGeneratedSerialDescriptor.addElement("iconUrl", true);
        pluginGeneratedSerialDescriptor.addElement("secondaryIconUrl", true);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_STATUS, true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("activityV2Id", true);
        pluginGeneratedSerialDescriptor.addElement("during", false);
        pluginGeneratedSerialDescriptor.addElement("detectedActivityMetadata", true);
        pluginGeneratedSerialDescriptor.addElement("ctaState", true);
        pluginGeneratedSerialDescriptor.addElement("destination", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActivityModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ActivityModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, c25452a, AbstractC38195a.m122336d(c25452a), AbstractC38195a.m122336d(c25452a), AbstractC38195a.m122336d(c25452a), stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(During$$serializer.INSTANCE), AbstractC38195a.m122336d(DetectedActivityMetadata$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[13].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ActivityModel deserialize(InterfaceC40541d decoder) {
        int i13;
        TextResource textResource;
        String str;
        TextResource textResource2;
        String str2;
        DetectedActivityMetadata detectedActivityMetadata;
        During during;
        String str3;
        C9598e c9598e;
        String str4;
        TextResource textResource3;
        TextResource textResource4;
        String str5;
        String str6;
        String str7;
        char c3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ActivityModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            TextResource textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, c25452a, null);
            TextResource textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, c25452a, null);
            TextResource textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, c25452a, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            During during2 = (During) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, During$$serializer.INSTANCE, null);
            i13 = 16383;
            detectedActivityMetadata = (DetectedActivityMetadata) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, DetectedActivityMetadata$$serializer.INSTANCE, null);
            str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, stringSerializer, null);
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            textResource3 = textResource8;
            str4 = str10;
            str6 = strDecodeStringElement2;
            str3 = str9;
            str5 = strDecodeStringElement;
            textResource4 = textResource7;
            str7 = strDecodeStringElement3;
            textResource = textResource6;
            textResource2 = textResource5;
            str = str8;
            during = during2;
        } else {
            int i14 = 13;
            String str11 = null;
            TextResource textResource9 = null;
            String str12 = null;
            DetectedActivityMetadata detectedActivityMetadata2 = null;
            During during3 = null;
            String str13 = null;
            C9598e c9598e2 = null;
            String str14 = null;
            TextResource textResource10 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean z4 = true;
            i13 = 0;
            TextResource textResource11 = null;
            TextResource textResource12 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str11);
                        i13 |= 1;
                        i14 = 13;
                        break;
                    case 1:
                        textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource9);
                        i13 |= 2;
                        i14 = 13;
                        break;
                    case 2:
                        textResource11 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, C25452a.f99689a, textResource11);
                        i13 |= 4;
                        i14 = 13;
                        break;
                    case 3:
                        textResource12 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, C25452a.f99689a, textResource12);
                        i13 |= 8;
                        i14 = 13;
                        break;
                    case 4:
                        textResource10 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, C25452a.f99689a, textResource10);
                        i13 |= 16;
                        i14 = 13;
                        break;
                    case 5:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i13 |= 32;
                        i14 = 13;
                        break;
                    case 6:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str13);
                        i13 |= 64;
                        i14 = 13;
                        break;
                    case 7:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i13 |= 128;
                        i14 = 13;
                        break;
                    case 8:
                        c3 = '\t';
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i13 |= 256;
                        i14 = 13;
                        break;
                    case 9:
                        c3 = '\t';
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str14);
                        i13 |= 512;
                        i14 = 13;
                        break;
                    case 10:
                        during3 = (During) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, During$$serializer.INSTANCE, during3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i14 = 13;
                        break;
                    case 11:
                        detectedActivityMetadata2 = (DetectedActivityMetadata) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, DetectedActivityMetadata$$serializer.INSTANCE, detectedActivityMetadata2);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i14 = 13;
                        break;
                    case 12:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, StringSerializer.INSTANCE, str12);
                        i13 |= 4096;
                        i14 = 13;
                        break;
                    case 13:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), c9598e2);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            textResource = textResource11;
            str = str11;
            textResource2 = textResource9;
            str2 = str12;
            detectedActivityMetadata = detectedActivityMetadata2;
            during = during3;
            str3 = str13;
            c9598e = c9598e2;
            str4 = str14;
            textResource3 = textResource10;
            textResource4 = textResource12;
            str5 = strDecodeStringElement4;
            str6 = strDecodeStringElement5;
            str7 = strDecodeStringElement6;
        }
        int i15 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ActivityModel(i15, str, textResource2, textResource, textResource4, textResource3, str5, str3, str6, str7, str4, during, detectedActivityMetadata, str2, c9598e, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ActivityModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ActivityModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
