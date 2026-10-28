package com.whoop.design.models.calendar;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import s51.C32219p;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u001a¨\u0006,"}, m65681d2 = {"Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;", "", "Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;", NotificationCompat.CATEGORY_STATUS, "", "legendText", "legendSubText", "<init>", "(Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;", "getStatus", "Ljava/lang/String;", "getLegendText", "getLegendSubText", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BehaviorsCalendarLegendItemModel {
    public static final int $stable = 0;
    private final String legendSubText;
    private final String legendText;
    private final BehaviorsCalendarDayStatus status;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32219p(9)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BehaviorsCalendarLegendItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BehaviorsCalendarLegendItemModel() {
        this((BehaviorsCalendarDayStatus) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return BehaviorsCalendarDayStatus.INSTANCE.serializer();
    }

    public static /* synthetic */ BehaviorsCalendarLegendItemModel copy$default(BehaviorsCalendarLegendItemModel behaviorsCalendarLegendItemModel, BehaviorsCalendarDayStatus behaviorsCalendarDayStatus, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            behaviorsCalendarDayStatus = behaviorsCalendarLegendItemModel.status;
        }
        if ((i13 & 2) != 0) {
            str = behaviorsCalendarLegendItemModel.legendText;
        }
        if ((i13 & 4) != 0) {
            str2 = behaviorsCalendarLegendItemModel.legendSubText;
        }
        return behaviorsCalendarLegendItemModel.copy(behaviorsCalendarDayStatus, str, str2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BehaviorsCalendarLegendItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.status != BehaviorsCalendarDayStatus.EMPTY) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.legendText, "")) {
            output.encodeStringElement(serialDesc, 1, self.legendText);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.legendSubText, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 2, self.legendSubText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BehaviorsCalendarDayStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLegendText() {
        return this.legendText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLegendSubText() {
        return this.legendSubText;
    }

    public final BehaviorsCalendarLegendItemModel copy(BehaviorsCalendarDayStatus status, String legendText, String legendSubText) {
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(legendText, "legendText");
        AbstractC22676k.m65750j(legendSubText, "legendSubText");
        return new BehaviorsCalendarLegendItemModel(status, legendText, legendSubText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorsCalendarLegendItemModel)) {
            return false;
        }
        BehaviorsCalendarLegendItemModel behaviorsCalendarLegendItemModel = (BehaviorsCalendarLegendItemModel) other;
        return this.status == behaviorsCalendarLegendItemModel.status && AbstractC22676k.m65745e(this.legendText, behaviorsCalendarLegendItemModel.legendText) && AbstractC22676k.m65745e(this.legendSubText, behaviorsCalendarLegendItemModel.legendSubText);
    }

    public final String getLegendSubText() {
        return this.legendSubText;
    }

    public final String getLegendText() {
        return this.legendText;
    }

    public final BehaviorsCalendarDayStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.legendSubText.hashCode() + AbstractC11266d.m30450d(this.status.hashCode() * 31, 31, this.legendText);
    }

    public String toString() {
        BehaviorsCalendarDayStatus behaviorsCalendarDayStatus = this.status;
        String str = this.legendText;
        String str2 = this.legendSubText;
        StringBuilder sb4 = new StringBuilder("BehaviorsCalendarLegendItemModel(status=");
        sb4.append(behaviorsCalendarDayStatus);
        sb4.append(", legendText=");
        sb4.append(str);
        sb4.append(", legendSubText=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public /* synthetic */ BehaviorsCalendarLegendItemModel(int i13, BehaviorsCalendarDayStatus behaviorsCalendarDayStatus, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.status = (i13 & 1) == 0 ? BehaviorsCalendarDayStatus.EMPTY : behaviorsCalendarDayStatus;
        if ((i13 & 2) == 0) {
            this.legendText = "";
        } else {
            this.legendText = str;
        }
        if ((i13 & 4) == 0) {
            this.legendSubText = "";
        } else {
            this.legendSubText = str2;
        }
    }

    public BehaviorsCalendarLegendItemModel(BehaviorsCalendarDayStatus status, String legendText, String legendSubText) {
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(legendText, "legendText");
        AbstractC22676k.m65750j(legendSubText, "legendSubText");
        this.status = status;
        this.legendText = legendText;
        this.legendSubText = legendSubText;
    }

    public /* synthetic */ BehaviorsCalendarLegendItemModel(BehaviorsCalendarDayStatus behaviorsCalendarDayStatus, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? BehaviorsCalendarDayStatus.EMPTY : behaviorsCalendarDayStatus, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2);
    }
}
