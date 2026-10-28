package com.whoop.activation.domain.models.steps;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/activation/domain/models/steps/DeviceEducationStepModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class DeviceEducationStepModel$$serializer implements GeneratedSerializer<DeviceEducationStepModel> {
    public static final int $stable;
    public static final DeviceEducationStepModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        DeviceEducationStepModel$$serializer deviceEducationStepModel$$serializer = new DeviceEducationStepModel$$serializer();
        INSTANCE = deviceEducationStepModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.activation.domain.models.steps.DeviceEducationStepModel", deviceEducationStepModel$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("lottieUrl", false);
        pluginGeneratedSerialDescriptor.addElement("lottieJson", false);
        pluginGeneratedSerialDescriptor.addElement("ctaText", false);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_NAVIGATION, false);
        pluginGeneratedSerialDescriptor.addElement("navigationBarText", false);
        pluginGeneratedSerialDescriptor.addElement("mobileScreenName", false);
        pluginGeneratedSerialDescriptor.addElement("analyticsName", false);
        pluginGeneratedSerialDescriptor.addElement("progressCircle", false);
        pluginGeneratedSerialDescriptor.addElement("footerButtons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DeviceEducationStepModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = DeviceEducationStepModel.$childSerializers;
        C25452a c25452a = C25452a.f99689a;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{c25452a, c25452a, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(c25452a), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue()), AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, AbstractC38195a.m122336d(ProgressButtonModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[11].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final DeviceEducationStepModel deserialize(InterfaceC40541d decoder) {
        C9598e c9598e;
        int i13;
        TextResource textResource;
        ProgressButtonModel progressButtonModel;
        String str;
        List list;
        TextResource textResource2;
        String str2;
        String str3;
        String str4;
        TextResource textResource3;
        String str5;
        String str6;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = DeviceEducationStepModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource4 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            TextResource textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            TextResource textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, c25452a, null);
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
            ProgressButtonModel progressButtonModel2 = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, ProgressButtonModel$$serializer.INSTANCE, null);
            i13 = 4095;
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), null);
            textResource2 = textResource6;
            str3 = str10;
            str6 = strDecodeStringElement2;
            str5 = strDecodeStringElement;
            str2 = str8;
            progressButtonModel = progressButtonModel2;
            str = str9;
            str4 = str7;
            textResource3 = textResource5;
            textResource = textResource4;
        } else {
            int i14 = 11;
            TextResource textResource7 = null;
            ProgressButtonModel progressButtonModel3 = null;
            c9598e = null;
            String str11 = null;
            List list2 = null;
            TextResource textResource8 = null;
            String str12 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i15 = 6;
            boolean z4 = true;
            String str13 = null;
            String str14 = null;
            i13 = 0;
            TextResource textResource9 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 6;
                        break;
                    case 0:
                        textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource7);
                        i13 |= 1;
                        i14 = 11;
                        i15 = 6;
                        break;
                    case 1:
                        textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource9);
                        i13 |= 2;
                        i14 = 11;
                        i15 = 6;
                        break;
                    case 2:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str14);
                        i13 |= 4;
                        i14 = 11;
                        i15 = 6;
                        break;
                    case 3:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str12);
                        i13 |= 8;
                        i14 = 11;
                        i15 = 6;
                        break;
                    case 4:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str11);
                        i13 |= 16;
                        i14 = 11;
                        i15 = 6;
                        break;
                    case 5:
                        textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, C25452a.f99689a, textResource8);
                        i13 |= 32;
                        i14 = 11;
                        i15 = 6;
                        break;
                    case 6:
                        c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), c9598e);
                        i13 |= 64;
                        i14 = 11;
                        break;
                    case 7:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str13);
                        i13 |= 128;
                        i14 = 11;
                        break;
                    case 8:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i13 |= 256;
                        i14 = 11;
                        break;
                    case 9:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
                        i13 |= 512;
                        i14 = 11;
                        break;
                    case 10:
                        progressButtonModel3 = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, ProgressButtonModel$$serializer.INSTANCE, progressButtonModel3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i14 = 11;
                        break;
                    case 11:
                        list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), list2);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            textResource = textResource7;
            progressButtonModel = progressButtonModel3;
            str = str11;
            list = list2;
            textResource2 = textResource8;
            str2 = str12;
            str3 = str13;
            str4 = str14;
            textResource3 = textResource9;
            str5 = strDecodeStringElement3;
            str6 = strDecodeStringElement4;
        }
        C9598e c9598e2 = c9598e;
        int i16 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new DeviceEducationStepModel(i16, textResource, textResource3, str4, str2, str, textResource2, c9598e2, str3, str5, str6, progressButtonModel, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, DeviceEducationStepModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        DeviceEducationStepModel.write$Self$activation_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
