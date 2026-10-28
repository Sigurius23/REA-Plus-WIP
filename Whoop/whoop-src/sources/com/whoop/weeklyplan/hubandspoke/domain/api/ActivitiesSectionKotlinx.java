package com.whoop.weeklyplan.hubandspoke.domain.api;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kg2.C22458d;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;", "", "", "title", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/EmptyStateKotlinx;", "emptyState", "", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivityDetailKotlinx;", "activities", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/EmptyStateKotlinx;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/EmptyStateKotlinx;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/EmptyStateKotlinx;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/EmptyStateKotlinx;Ljava/util/List;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/EmptyStateKotlinx;", "getEmptyState", "Ljava/util/List;", "getActivities", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivitiesSectionKotlinx {
    private final List<ActivityDetailKotlinx> activities;
    private final EmptyStateKotlinx emptyState;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22458d(17))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivitiesSectionKotlinx$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActivitiesSectionKotlinx(int i13, String str, EmptyStateKotlinx emptyStateKotlinx, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ActivitiesSectionKotlinx$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.emptyState = emptyStateKotlinx;
        if ((i13 & 4) == 0) {
            this.activities = C25271y.f99162w;
        } else {
            this.activities = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ActivityDetailKotlinx$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivitiesSectionKotlinx copy$default(ActivitiesSectionKotlinx activitiesSectionKotlinx, String str, EmptyStateKotlinx emptyStateKotlinx, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = activitiesSectionKotlinx.title;
        }
        if ((i13 & 2) != 0) {
            emptyStateKotlinx = activitiesSectionKotlinx.emptyState;
        }
        if ((i13 & 4) != 0) {
            list = activitiesSectionKotlinx.activities;
        }
        return activitiesSectionKotlinx.copy(str, emptyStateKotlinx, list);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(ActivitiesSectionKotlinx self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, EmptyStateKotlinx$$serializer.INSTANCE, self.emptyState);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.activities, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.activities);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EmptyStateKotlinx getEmptyState() {
        return this.emptyState;
    }

    public final List<ActivityDetailKotlinx> component3() {
        return this.activities;
    }

    public final ActivitiesSectionKotlinx copy(String title, EmptyStateKotlinx emptyState, List<ActivityDetailKotlinx> activities) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(emptyState, "emptyState");
        AbstractC22676k.m65750j(activities, "activities");
        return new ActivitiesSectionKotlinx(title, emptyState, activities);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivitiesSectionKotlinx)) {
            return false;
        }
        ActivitiesSectionKotlinx activitiesSectionKotlinx = (ActivitiesSectionKotlinx) other;
        return AbstractC22676k.m65745e(this.title, activitiesSectionKotlinx.title) && AbstractC22676k.m65745e(this.emptyState, activitiesSectionKotlinx.emptyState) && AbstractC22676k.m65745e(this.activities, activitiesSectionKotlinx.activities);
    }

    public final List<ActivityDetailKotlinx> getActivities() {
        return this.activities;
    }

    public final EmptyStateKotlinx getEmptyState() {
        return this.emptyState;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.activities.hashCode() + ((this.emptyState.hashCode() + (this.title.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.title;
        EmptyStateKotlinx emptyStateKotlinx = this.emptyState;
        List<ActivityDetailKotlinx> list = this.activities;
        StringBuilder sb4 = new StringBuilder("ActivitiesSectionKotlinx(title=");
        sb4.append(str);
        sb4.append(", emptyState=");
        sb4.append(emptyStateKotlinx);
        sb4.append(", activities=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public ActivitiesSectionKotlinx(String title, EmptyStateKotlinx emptyState, List<ActivityDetailKotlinx> activities) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(emptyState, "emptyState");
        AbstractC22676k.m65750j(activities, "activities");
        this.title = title;
        this.emptyState = emptyState;
        this.activities = activities;
    }

    public /* synthetic */ ActivitiesSectionKotlinx(String str, EmptyStateKotlinx emptyStateKotlinx, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, emptyStateKotlinx, (i13 & 4) != 0 ? C25271y.f99162w : list);
    }
}
