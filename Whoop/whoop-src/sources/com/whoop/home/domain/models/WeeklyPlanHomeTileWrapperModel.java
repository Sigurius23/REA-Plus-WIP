package com.whoop.home.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import we1.C37224h;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, m65681d2 = {"Lcom/whoop/home/domain/models/WeeklyPlanHomeTileWrapperModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/home/domain/models/WeeklyPlanHomeTileModel;", "architectureMiniComponent", "<init>", "(Lcom/whoop/home/domain/models/WeeklyPlanHomeTileModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/home/domain/models/WeeklyPlanHomeTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/WeeklyPlanHomeTileWrapperModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/home/domain/models/WeeklyPlanHomeTileModel;", "copy", "(Lcom/whoop/home/domain/models/WeeklyPlanHomeTileModel;)Lcom/whoop/home/domain/models/WeeklyPlanHomeTileWrapperModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/home/domain/models/WeeklyPlanHomeTileModel;", "getArchitectureMiniComponent", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WeeklyPlanHomeTileWrapperModel implements DesignSystemModel {
    public static final int $stable = 0;
    private final WeeklyPlanHomeTileModel architectureMiniComponent;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37224h(29))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/WeeklyPlanHomeTileWrapperModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/WeeklyPlanHomeTileWrapperModel;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WeeklyPlanHomeTileWrapperModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WeeklyPlanHomeTileWrapperModel() {
        this((WeeklyPlanHomeTileModel) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ObjectSerializer("com.whoop.home.domain.models.WeeklyPlanHomeTileModel", WeeklyPlanHomeTileModel.INSTANCE, new Annotation[0]);
    }

    public static /* synthetic */ WeeklyPlanHomeTileWrapperModel copy$default(WeeklyPlanHomeTileWrapperModel weeklyPlanHomeTileWrapperModel, WeeklyPlanHomeTileModel weeklyPlanHomeTileModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            weeklyPlanHomeTileModel = weeklyPlanHomeTileWrapperModel.architectureMiniComponent;
        }
        return weeklyPlanHomeTileWrapperModel.copy(weeklyPlanHomeTileModel);
    }

    public static final /* synthetic */ void write$Self$home_release(WeeklyPlanHomeTileWrapperModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.architectureMiniComponent == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.architectureMiniComponent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WeeklyPlanHomeTileModel getArchitectureMiniComponent() {
        return this.architectureMiniComponent;
    }

    public final WeeklyPlanHomeTileWrapperModel copy(WeeklyPlanHomeTileModel architectureMiniComponent) {
        return new WeeklyPlanHomeTileWrapperModel(architectureMiniComponent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WeeklyPlanHomeTileWrapperModel) && AbstractC22676k.m65745e(this.architectureMiniComponent, ((WeeklyPlanHomeTileWrapperModel) other).architectureMiniComponent);
    }

    public final WeeklyPlanHomeTileModel getArchitectureMiniComponent() {
        return this.architectureMiniComponent;
    }

    public int hashCode() {
        WeeklyPlanHomeTileModel weeklyPlanHomeTileModel = this.architectureMiniComponent;
        if (weeklyPlanHomeTileModel == null) {
            return 0;
        }
        return weeklyPlanHomeTileModel.hashCode();
    }

    public String toString() {
        return "WeeklyPlanHomeTileWrapperModel(architectureMiniComponent=" + this.architectureMiniComponent + ")";
    }

    public /* synthetic */ WeeklyPlanHomeTileWrapperModel(int i13, WeeklyPlanHomeTileModel weeklyPlanHomeTileModel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.architectureMiniComponent = null;
        } else {
            this.architectureMiniComponent = weeklyPlanHomeTileModel;
        }
    }

    public WeeklyPlanHomeTileWrapperModel(WeeklyPlanHomeTileModel weeklyPlanHomeTileModel) {
        this.architectureMiniComponent = weeklyPlanHomeTileModel;
    }

    public /* synthetic */ WeeklyPlanHomeTileWrapperModel(WeeklyPlanHomeTileModel weeklyPlanHomeTileModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : weeklyPlanHomeTileModel);
    }
}
