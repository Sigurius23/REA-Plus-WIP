package com.whoop.bot.models.conversation;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/bot/models/conversation/SleepBoundModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/bot/models/conversation/SleepBoundModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/bot/models/conversation/SleepBoundModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/bot/models/conversation/SleepBoundModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SleepBoundModel$$serializer implements GeneratedSerializer<SleepBoundModel> {
    public static final int $stable;
    public static final SleepBoundModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SleepBoundModel$$serializer sleepBoundModel$$serializer = new SleepBoundModel$$serializer();
        INSTANCE = sleepBoundModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.bot.models.conversation.SleepBoundModel", sleepBoundModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("label", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("predictedTime", false);
        pluginGeneratedSerialDescriptor.addElement("timeUnit", false);
        pluginGeneratedSerialDescriptor.addElement("typicalTitle", false);
        pluginGeneratedSerialDescriptor.addElement("typicalTime", false);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_ALARM, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SleepBoundModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AlarmModel$$serializer.INSTANCE);
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{c25452a, StringSerializer.INSTANCE, c25452a, c25452a, c25452a, c25452a, interfaceC37138cM122336d};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SleepBoundModel deserialize(InterfaceC40541d decoder) {
        int i13;
        AlarmModel alarmModel;
        TextResource textResource;
        String str;
        TextResource textResource2;
        TextResource textResource3;
        TextResource textResource4;
        TextResource textResource5;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 6;
        int i15 = 5;
        TextResource textResource6 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            TextResource textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, c25452a, null);
            TextResource textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, c25452a, null);
            TextResource textResource10 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, c25452a, null);
            textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, c25452a, null);
            alarmModel = (AlarmModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, AlarmModel$$serializer.INSTANCE, null);
            i13 = 127;
            textResource3 = textResource9;
            textResource4 = textResource10;
            textResource2 = textResource8;
            str = strDecodeStringElement;
            textResource = textResource7;
        } else {
            boolean z4 = true;
            int i16 = 0;
            AlarmModel alarmModel2 = null;
            String strDecodeStringElement2 = null;
            TextResource textResource11 = null;
            TextResource textResource12 = null;
            TextResource textResource13 = null;
            TextResource textResource14 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 5;
                        break;
                    case 0:
                        textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource6);
                        i16 |= 1;
                        i14 = 6;
                        i15 = 5;
                        break;
                    case 1:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        break;
                    case 2:
                        textResource11 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C25452a.f99689a, textResource11);
                        i16 |= 4;
                        break;
                    case 3:
                        textResource12 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, C25452a.f99689a, textResource12);
                        i16 |= 8;
                        break;
                    case 4:
                        textResource13 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, C25452a.f99689a, textResource13);
                        i16 |= 16;
                        break;
                    case 5:
                        textResource14 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, C25452a.f99689a, textResource14);
                        i16 |= 32;
                        break;
                    case 6:
                        alarmModel2 = (AlarmModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, AlarmModel$$serializer.INSTANCE, alarmModel2);
                        i16 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            alarmModel = alarmModel2;
            textResource = textResource6;
            str = strDecodeStringElement2;
            textResource2 = textResource11;
            textResource3 = textResource12;
            textResource4 = textResource13;
            textResource5 = textResource14;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SleepBoundModel(i13, textResource, str, textResource2, textResource3, textResource4, textResource5, alarmModel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SleepBoundModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SleepBoundModel.write$Self$bot_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
