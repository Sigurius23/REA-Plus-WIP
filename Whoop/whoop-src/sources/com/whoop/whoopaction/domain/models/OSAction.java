package com.whoop.whoopaction.domain.models;

import com.whoop.navigation.models.GenericInteraction;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import uw2.C35319d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006 "}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/OSAction;", "Lcom/whoop/whoopaction/domain/models/Action;", "type", "Lcom/whoop/whoopaction/domain/models/OSActionType;", "parameters", "Lcom/whoop/whoopaction/domain/models/OSActionParameters;", "onSuccess", "Lcom/whoop/navigation/models/GenericInteraction;", "onError", "<init>", "(Lcom/whoop/whoopaction/domain/models/OSActionType;Lcom/whoop/whoopaction/domain/models/OSActionParameters;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V", "getType", "()Lcom/whoop/whoopaction/domain/models/OSActionType;", "getParameters", "()Lcom/whoop/whoopaction/domain/models/OSActionParameters;", "getOnSuccess", "()Lcom/whoop/navigation/models/GenericInteraction;", "getOnError", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i(with = C35319d.class)
public final /* data */ class OSAction implements Action {
    private final GenericInteraction onError;
    private final GenericInteraction onSuccess;
    private final OSActionParameters parameters;
    private final OSActionType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/OSAction$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/OSAction;", "serializer", "()Lwc3/c;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return new C35319d();
        }

        private Companion() {
        }
    }

    public OSAction(OSActionType type, OSActionParameters parameters, GenericInteraction genericInteraction, GenericInteraction genericInteraction2) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(parameters, "parameters");
        this.type = type;
        this.parameters = parameters;
        this.onSuccess = genericInteraction;
        this.onError = genericInteraction2;
    }

    public static /* synthetic */ OSAction copy$default(OSAction oSAction, OSActionType oSActionType, OSActionParameters oSActionParameters, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            oSActionType = oSAction.type;
        }
        if ((i13 & 2) != 0) {
            oSActionParameters = oSAction.parameters;
        }
        if ((i13 & 4) != 0) {
            genericInteraction = oSAction.onSuccess;
        }
        if ((i13 & 8) != 0) {
            genericInteraction2 = oSAction.onError;
        }
        return oSAction.copy(oSActionType, oSActionParameters, genericInteraction, genericInteraction2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OSActionType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OSActionParameters getParameters() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GenericInteraction getOnSuccess() {
        return this.onSuccess;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GenericInteraction getOnError() {
        return this.onError;
    }

    public final OSAction copy(OSActionType type, OSActionParameters parameters, GenericInteraction onSuccess, GenericInteraction onError) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(parameters, "parameters");
        return new OSAction(type, parameters, onSuccess, onError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OSAction)) {
            return false;
        }
        OSAction oSAction = (OSAction) other;
        return this.type == oSAction.type && AbstractC22676k.m65745e(this.parameters, oSAction.parameters) && AbstractC22676k.m65745e(this.onSuccess, oSAction.onSuccess) && AbstractC22676k.m65745e(this.onError, oSAction.onError);
    }

    public final GenericInteraction getOnError() {
        return this.onError;
    }

    public final GenericInteraction getOnSuccess() {
        return this.onSuccess;
    }

    public final OSActionParameters getParameters() {
        return this.parameters;
    }

    public final OSActionType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.parameters.hashCode() + (this.type.hashCode() * 31)) * 31;
        GenericInteraction genericInteraction = this.onSuccess;
        int iHashCode2 = (iHashCode + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        GenericInteraction genericInteraction2 = this.onError;
        return iHashCode2 + (genericInteraction2 != null ? genericInteraction2.hashCode() : 0);
    }

    public String toString() {
        return "OSAction(type=" + this.type + ", parameters=" + this.parameters + ", onSuccess=" + this.onSuccess + ", onError=" + this.onError + ")";
    }

    public /* synthetic */ OSAction(OSActionType oSActionType, OSActionParameters oSActionParameters, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(oSActionType, oSActionParameters, (i13 & 4) != 0 ? null : genericInteraction, (i13 & 8) != 0 ? null : genericInteraction2);
    }
}
