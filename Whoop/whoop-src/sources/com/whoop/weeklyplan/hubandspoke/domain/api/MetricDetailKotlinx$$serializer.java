package com.whoop.weeklyplan.hubandspoke.domain.api;

import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.hubandspoke.domain.models.MetricCardModel;
import com.whoop.weeklyplan.hubandspoke.domain.models.MetricCardModel$$serializer;
import com.whoop.weeklyplan.hubandspoke.domain.models.MetricPlanTileModel;
import com.whoop.weeklyplan.hubandspoke.domain.models.MetricPlanTileModel$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MetricDetailKotlinx$$serializer implements GeneratedSerializer<MetricDetailKotlinx> {
    public static final int $stable;
    public static final MetricDetailKotlinx$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MetricDetailKotlinx$$serializer metricDetailKotlinx$$serializer = new MetricDetailKotlinx$$serializer();
        INSTANCE = metricDetailKotlinx$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weeklyplan.hubandspoke.domain.api.MetricDetailKotlinx", metricDetailKotlinx$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("goalTypeId", false);
        pluginGeneratedSerialDescriptor.addElement("goalType", false);
        pluginGeneratedSerialDescriptor.addElement("metricCard", false);
        pluginGeneratedSerialDescriptor.addElement("metricPlanTile", false);
        pluginGeneratedSerialDescriptor.addElement("associatedBehaviorsActivities", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MetricDetailKotlinx$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{IntSerializer.INSTANCE, MetricDetailKotlinx.$childSerializers[1].getValue(), MetricCardModel$$serializer.INSTANCE, MetricPlanTileModel$$serializer.INSTANCE, AssociatedBehaviorsActivitiesKotlinx$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MetricDetailKotlinx deserialize(InterfaceC40541d decoder) {
        int iDecodeIntElement;
        int i13;
        TargetGoalType targetGoalType;
        MetricCardModel metricCardModel;
        MetricPlanTileModel metricPlanTileModel;
        AssociatedBehaviorsActivitiesKotlinx associatedBehaviorsActivitiesKotlinx;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = MetricDetailKotlinx.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
            TargetGoalType targetGoalType2 = (TargetGoalType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            MetricCardModel metricCardModel2 = (MetricCardModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, MetricCardModel$$serializer.INSTANCE, null);
            targetGoalType = targetGoalType2;
            metricPlanTileModel = (MetricPlanTileModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, MetricPlanTileModel$$serializer.INSTANCE, null);
            associatedBehaviorsActivitiesKotlinx = (AssociatedBehaviorsActivitiesKotlinx) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, AssociatedBehaviorsActivitiesKotlinx$$serializer.INSTANCE, null);
            metricCardModel = metricCardModel2;
            i13 = 31;
        } else {
            boolean z4 = true;
            iDecodeIntElement = 0;
            TargetGoalType targetGoalType3 = null;
            MetricCardModel metricCardModel3 = null;
            MetricPlanTileModel metricPlanTileModel2 = null;
            AssociatedBehaviorsActivitiesKotlinx associatedBehaviorsActivitiesKotlinx2 = null;
            int i14 = 0;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    targetGoalType3 = (TargetGoalType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), targetGoalType3);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    metricCardModel3 = (MetricCardModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, MetricCardModel$$serializer.INSTANCE, metricCardModel3);
                    i14 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    metricPlanTileModel2 = (MetricPlanTileModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, MetricPlanTileModel$$serializer.INSTANCE, metricPlanTileModel2);
                    i14 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    associatedBehaviorsActivitiesKotlinx2 = (AssociatedBehaviorsActivitiesKotlinx) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, AssociatedBehaviorsActivitiesKotlinx$$serializer.INSTANCE, associatedBehaviorsActivitiesKotlinx2);
                    i14 |= 16;
                }
            }
            i13 = i14;
            targetGoalType = targetGoalType3;
            metricCardModel = metricCardModel3;
            metricPlanTileModel = metricPlanTileModel2;
            associatedBehaviorsActivitiesKotlinx = associatedBehaviorsActivitiesKotlinx2;
        }
        int i15 = iDecodeIntElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MetricDetailKotlinx(i13, i15, targetGoalType, metricCardModel, metricPlanTileModel, associatedBehaviorsActivitiesKotlinx, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MetricDetailKotlinx value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MetricDetailKotlinx.write$Self$weekly_plan_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
