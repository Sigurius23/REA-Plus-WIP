package com.whoop.weeklyplan.hometile.domain.api;

import a13.C0148f;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ<\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00062"}, m65681d2 = {"Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;", "", "", "title", "Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;", "circularProgressIndicator", "Lcom/whoop/navigation/e;", "destination", "id", "<init>", "(Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;Lcom/whoop/navigation/e;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;Lcom/whoop/navigation/e;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;", "component3", "()Lcom/whoop/navigation/e;", "component4", "copy", "(Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;Lcom/whoop/navigation/e;Ljava/lang/String;)Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;", "getCircularProgressIndicator", "Lcom/whoop/navigation/e;", "getDestination", "getId", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PlanItem {
    private final CircularProgressIndicator circularProgressIndicator;
    private final C9598e destination;
    private final String id;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C0148f(18)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PlanItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PlanItem(int i13, String str, CircularProgressIndicator circularProgressIndicator, C9598e c9598e, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, PlanItem$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.circularProgressIndicator = circularProgressIndicator;
        this.destination = c9598e;
        if ((i13 & 8) == 0) {
            this.id = null;
        } else {
            this.id = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ PlanItem copy$default(PlanItem planItem, String str, CircularProgressIndicator circularProgressIndicator, C9598e c9598e, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = planItem.title;
        }
        if ((i13 & 2) != 0) {
            circularProgressIndicator = planItem.circularProgressIndicator;
        }
        if ((i13 & 4) != 0) {
            c9598e = planItem.destination;
        }
        if ((i13 & 8) != 0) {
            str2 = planItem.id;
        }
        return planItem.copy(str, circularProgressIndicator, c9598e, str2);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(PlanItem self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, CircularProgressIndicator$$serializer.INSTANCE, self.circularProgressIndicator);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.destination);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.id == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CircularProgressIndicator getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final PlanItem copy(String title, CircularProgressIndicator circularProgressIndicator, C9598e destination, String id4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(circularProgressIndicator, "circularProgressIndicator");
        return new PlanItem(title, circularProgressIndicator, destination, id4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanItem)) {
            return false;
        }
        PlanItem planItem = (PlanItem) other;
        return AbstractC22676k.m65745e(this.title, planItem.title) && AbstractC22676k.m65745e(this.circularProgressIndicator, planItem.circularProgressIndicator) && AbstractC22676k.m65745e(this.destination, planItem.destination) && AbstractC22676k.m65745e(this.id, planItem.id);
    }

    public final CircularProgressIndicator getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.circularProgressIndicator.hashCode() + (this.title.hashCode() * 31)) * 31;
        C9598e c9598e = this.destination;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        String str = this.id;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PlanItem(title=" + this.title + ", circularProgressIndicator=" + this.circularProgressIndicator + ", destination=" + this.destination + ", id=" + this.id + ")";
    }

    public PlanItem(String title, CircularProgressIndicator circularProgressIndicator, C9598e c9598e, String str) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(circularProgressIndicator, "circularProgressIndicator");
        this.title = title;
        this.circularProgressIndicator = circularProgressIndicator;
        this.destination = c9598e;
        this.id = str;
    }

    public /* synthetic */ PlanItem(String str, CircularProgressIndicator circularProgressIndicator, C9598e c9598e, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, circularProgressIndicator, c9598e, (i13 & 8) != 0 ? null : str2);
    }
}
