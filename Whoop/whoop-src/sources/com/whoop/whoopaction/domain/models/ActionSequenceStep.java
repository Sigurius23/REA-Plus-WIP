package com.whoop.whoopaction.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import uw2.C35318c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0019¨\u0006-"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;", "", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;", "fullScreen", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whoop_action_release", "(Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/whoopaction/domain/models/Action;", "component2", "()Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;", "copy", "(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;)Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/whoopaction/domain/models/Action;", "getAction", "getAction$annotations", "()V", "Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;", "getFullScreen", "Companion", "$serializer", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActionSequenceStep {
    private final Action action;
    private final ActionSequenceFullScreenBehavior fullScreen;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/ActionSequenceStep$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;", "serializer", "()Lwc3/c;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActionSequenceStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActionSequenceStep(int i13, Action action, ActionSequenceFullScreenBehavior actionSequenceFullScreenBehavior, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ActionSequenceStep$$serializer.INSTANCE.getDescriptor());
        }
        this.action = action;
        this.fullScreen = actionSequenceFullScreenBehavior;
    }

    public static /* synthetic */ ActionSequenceStep copy$default(ActionSequenceStep actionSequenceStep, Action action, ActionSequenceFullScreenBehavior actionSequenceFullScreenBehavior, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            action = actionSequenceStep.action;
        }
        if ((i13 & 2) != 0) {
            actionSequenceFullScreenBehavior = actionSequenceStep.fullScreen;
        }
        return actionSequenceStep.copy(action, actionSequenceFullScreenBehavior);
    }

    @InterfaceC37144i(with = C35318c.class)
    public static /* synthetic */ void getAction$annotations() {
    }

    public static final /* synthetic */ void write$Self$whoop_action_release(ActionSequenceStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, C35318c.f150512b, self.action);
        output.encodeNullableSerializableElement(serialDesc, 1, ActionSequenceFullScreenBehavior$$serializer.INSTANCE, self.fullScreen);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ActionSequenceFullScreenBehavior getFullScreen() {
        return this.fullScreen;
    }

    public final ActionSequenceStep copy(Action action, ActionSequenceFullScreenBehavior fullScreen) {
        AbstractC22676k.m65750j(action, "action");
        return new ActionSequenceStep(action, fullScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionSequenceStep)) {
            return false;
        }
        ActionSequenceStep actionSequenceStep = (ActionSequenceStep) other;
        return AbstractC22676k.m65745e(this.action, actionSequenceStep.action) && AbstractC22676k.m65745e(this.fullScreen, actionSequenceStep.fullScreen);
    }

    public final Action getAction() {
        return this.action;
    }

    public final ActionSequenceFullScreenBehavior getFullScreen() {
        return this.fullScreen;
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        ActionSequenceFullScreenBehavior actionSequenceFullScreenBehavior = this.fullScreen;
        return iHashCode + (actionSequenceFullScreenBehavior == null ? 0 : actionSequenceFullScreenBehavior.hashCode());
    }

    public String toString() {
        return "ActionSequenceStep(action=" + this.action + ", fullScreen=" + this.fullScreen + ")";
    }

    public ActionSequenceStep(Action action, ActionSequenceFullScreenBehavior actionSequenceFullScreenBehavior) {
        AbstractC22676k.m65750j(action, "action");
        this.action = action;
        this.fullScreen = actionSequenceFullScreenBehavior;
    }
}
