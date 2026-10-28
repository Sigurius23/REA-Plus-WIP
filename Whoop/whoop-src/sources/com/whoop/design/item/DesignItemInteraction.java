package com.whoop.design.item;

import com.whoop.analytics.AnalyticEventModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25301j;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/design/item/DesignItemInteraction;", "", "actionArgument", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/whoop/analytics/AnalyticEventModel;", "copy", "(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/design/item/DesignItemInteraction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getActionArgument", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Companion", "a", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i(with = C25301j.class)
public final /* data */ class DesignItemInteraction {
    private final Object actionArgument;
    private final AnalyticEventModel analyticEvent;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.design.item.DesignItemInteraction$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/item/DesignItemInteraction$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/item/DesignItemInteraction;", "serializer", "()Lwc3/c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return new C25301j();
        }

        private Companion() {
        }
    }

    public DesignItemInteraction(Object obj, AnalyticEventModel analyticEventModel) {
        this.actionArgument = obj;
        this.analyticEvent = analyticEventModel;
    }

    public static /* synthetic */ DesignItemInteraction copy$default(DesignItemInteraction designItemInteraction, Object obj, AnalyticEventModel analyticEventModel, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            obj = designItemInteraction.actionArgument;
        }
        if ((i13 & 2) != 0) {
            analyticEventModel = designItemInteraction.analyticEvent;
        }
        return designItemInteraction.copy(obj, analyticEventModel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getActionArgument() {
        return this.actionArgument;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final DesignItemInteraction copy(Object actionArgument, AnalyticEventModel analyticEvent) {
        return new DesignItemInteraction(actionArgument, analyticEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DesignItemInteraction)) {
            return false;
        }
        DesignItemInteraction designItemInteraction = (DesignItemInteraction) other;
        return AbstractC22676k.m65745e(this.actionArgument, designItemInteraction.actionArgument) && AbstractC22676k.m65745e(this.analyticEvent, designItemInteraction.analyticEvent);
    }

    public final Object getActionArgument() {
        return this.actionArgument;
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public int hashCode() {
        Object obj = this.actionArgument;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iHashCode + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    public String toString() {
        return "DesignItemInteraction(actionArgument=" + this.actionArgument + ", analyticEvent=" + this.analyticEvent + ")";
    }
}
