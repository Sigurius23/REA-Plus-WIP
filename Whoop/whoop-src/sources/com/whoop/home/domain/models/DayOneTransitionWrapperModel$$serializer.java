package com.whoop.home.domain.models;

import com.whoop.design.models.items.OverviewGaugeModel;
import com.whoop.design.models.items.OverviewGaugeModel$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/home/domain/models/DayOneTransitionWrapperModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/home/domain/models/DayOneTransitionWrapperModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/home/domain/models/DayOneTransitionWrapperModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/home/domain/models/DayOneTransitionWrapperModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class DayOneTransitionWrapperModel$$serializer implements GeneratedSerializer<DayOneTransitionWrapperModel> {
    public static final int $stable;
    public static final DayOneTransitionWrapperModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        DayOneTransitionWrapperModel$$serializer dayOneTransitionWrapperModel$$serializer = new DayOneTransitionWrapperModel$$serializer();
        INSTANCE = dayOneTransitionWrapperModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.home.domain.models.DayOneTransitionWrapperModel", dayOneTransitionWrapperModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("overviewGauge", false);
        pluginGeneratedSerialDescriptor.addElement("notificationsWrapper", false);
        pluginGeneratedSerialDescriptor.addElement("welcomeHomeCard", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DayOneTransitionWrapperModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{OverviewGaugeModel$$serializer.INSTANCE, NotificationsWrapperModel$$serializer.INSTANCE, WelcomeCardModel$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final DayOneTransitionWrapperModel deserialize(InterfaceC40541d decoder) {
        int i13;
        OverviewGaugeModel overviewGaugeModel;
        NotificationsWrapperModel notificationsWrapperModel;
        WelcomeCardModel welcomeCardModel;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        OverviewGaugeModel overviewGaugeModel2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            OverviewGaugeModel overviewGaugeModel3 = (OverviewGaugeModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, OverviewGaugeModel$$serializer.INSTANCE, null);
            NotificationsWrapperModel notificationsWrapperModel2 = (NotificationsWrapperModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, NotificationsWrapperModel$$serializer.INSTANCE, null);
            overviewGaugeModel = overviewGaugeModel3;
            welcomeCardModel = (WelcomeCardModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, WelcomeCardModel$$serializer.INSTANCE, null);
            notificationsWrapperModel = notificationsWrapperModel2;
            i13 = 7;
        } else {
            boolean z4 = true;
            int i14 = 0;
            NotificationsWrapperModel notificationsWrapperModel3 = null;
            WelcomeCardModel welcomeCardModel2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    overviewGaugeModel2 = (OverviewGaugeModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, OverviewGaugeModel$$serializer.INSTANCE, overviewGaugeModel2);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    notificationsWrapperModel3 = (NotificationsWrapperModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, NotificationsWrapperModel$$serializer.INSTANCE, notificationsWrapperModel3);
                    i14 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    welcomeCardModel2 = (WelcomeCardModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, WelcomeCardModel$$serializer.INSTANCE, welcomeCardModel2);
                    i14 |= 4;
                }
            }
            i13 = i14;
            overviewGaugeModel = overviewGaugeModel2;
            notificationsWrapperModel = notificationsWrapperModel3;
            welcomeCardModel = welcomeCardModel2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new DayOneTransitionWrapperModel(i13, overviewGaugeModel, notificationsWrapperModel, welcomeCardModel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, DayOneTransitionWrapperModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        DayOneTransitionWrapperModel.write$Self$home_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
