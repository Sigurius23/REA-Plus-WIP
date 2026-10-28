package com.whoop.design.models.calendar;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b\u0007\u0010\u001c¨\u0006-"}, m65681d2 = {"Lcom/whoop/design/models/calendar/BehaviorsCalendarDayModel;", "", "", "index", "Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;", NotificationCompat.CATEGORY_STATUS, "", "isToday", "<init>", "(ILcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;Z)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/calendar/BehaviorsCalendarDayModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;", "component3", "()Z", "copy", "(ILcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;Z)Lcom/whoop/design/models/calendar/BehaviorsCalendarDayModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getIndex", "Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;", "getStatus", "Z", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BehaviorsCalendarDayModel {
    public static final int $stable = 0;
    private final int index;
    private final boolean isToday;
    private final BehaviorsCalendarDayStatus status;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32219p(6)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/calendar/BehaviorsCalendarDayModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/calendar/BehaviorsCalendarDayModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BehaviorsCalendarDayModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BehaviorsCalendarDayModel() {
        this(0, (BehaviorsCalendarDayStatus) null, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return BehaviorsCalendarDayStatus.INSTANCE.serializer();
    }

    public static /* synthetic */ BehaviorsCalendarDayModel copy$default(BehaviorsCalendarDayModel behaviorsCalendarDayModel, int i13, BehaviorsCalendarDayStatus behaviorsCalendarDayStatus, boolean z4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = behaviorsCalendarDayModel.index;
        }
        if ((i14 & 2) != 0) {
            behaviorsCalendarDayStatus = behaviorsCalendarDayModel.status;
        }
        if ((i14 & 4) != 0) {
            z4 = behaviorsCalendarDayModel.isToday;
        }
        return behaviorsCalendarDayModel.copy(i13, behaviorsCalendarDayStatus, z4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BehaviorsCalendarDayModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.index != 0) {
            output.encodeIntElement(serialDesc, 0, self.index);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.status != BehaviorsCalendarDayStatus.EMPTY) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.isToday) {
            output.encodeBooleanElement(serialDesc, 2, self.isToday);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BehaviorsCalendarDayStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsToday() {
        return this.isToday;
    }

    public final BehaviorsCalendarDayModel copy(int index, BehaviorsCalendarDayStatus status, boolean isToday) {
        AbstractC22676k.m65750j(status, "status");
        return new BehaviorsCalendarDayModel(index, status, isToday);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorsCalendarDayModel)) {
            return false;
        }
        BehaviorsCalendarDayModel behaviorsCalendarDayModel = (BehaviorsCalendarDayModel) other;
        return this.index == behaviorsCalendarDayModel.index && this.status == behaviorsCalendarDayModel.status && this.isToday == behaviorsCalendarDayModel.isToday;
    }

    public final int getIndex() {
        return this.index;
    }

    public final BehaviorsCalendarDayStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isToday) + ((this.status.hashCode() + (Integer.hashCode(this.index) * 31)) * 31);
    }

    public final boolean isToday() {
        return this.isToday;
    }

    public String toString() {
        int i13 = this.index;
        BehaviorsCalendarDayStatus behaviorsCalendarDayStatus = this.status;
        boolean z4 = this.isToday;
        StringBuilder sb4 = new StringBuilder("BehaviorsCalendarDayModel(index=");
        sb4.append(i13);
        sb4.append(", status=");
        sb4.append(behaviorsCalendarDayStatus);
        sb4.append(", isToday=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ BehaviorsCalendarDayModel(int i13, int i14, BehaviorsCalendarDayStatus behaviorsCalendarDayStatus, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.index = 0;
        } else {
            this.index = i14;
        }
        if ((i13 & 2) == 0) {
            this.status = BehaviorsCalendarDayStatus.EMPTY;
        } else {
            this.status = behaviorsCalendarDayStatus;
        }
        if ((i13 & 4) == 0) {
            this.isToday = false;
        } else {
            this.isToday = z4;
        }
    }

    public BehaviorsCalendarDayModel(int i13, BehaviorsCalendarDayStatus status, boolean z4) {
        AbstractC22676k.m65750j(status, "status");
        this.index = i13;
        this.status = status;
        this.isToday = z4;
    }

    public /* synthetic */ BehaviorsCalendarDayModel(int i13, BehaviorsCalendarDayStatus behaviorsCalendarDayStatus, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? BehaviorsCalendarDayStatus.EMPTY : behaviorsCalendarDayStatus, (i14 & 4) != 0 ? false : z4);
    }
}
