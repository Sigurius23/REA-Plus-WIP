package com.whoop.design.models.modal;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/design/models/modal/ModalLifecycleInteraction;", "", "onStart", "Lcom/whoop/design/models/modal/DecodedGenericInteraction;", "<init>", "(Lcom/whoop/design/models/modal/DecodedGenericInteraction;)V", "getOnStart", "()Lcom/whoop/design/models/modal/DecodedGenericInteraction;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ModalLifecycleInteraction {
    public static final int $stable = 8;
    private final DecodedGenericInteraction onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public ModalLifecycleInteraction() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ModalLifecycleInteraction copy$default(ModalLifecycleInteraction modalLifecycleInteraction, DecodedGenericInteraction decodedGenericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            decodedGenericInteraction = modalLifecycleInteraction.onStart;
        }
        return modalLifecycleInteraction.copy(decodedGenericInteraction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DecodedGenericInteraction getOnStart() {
        return this.onStart;
    }

    public final ModalLifecycleInteraction copy(DecodedGenericInteraction onStart) {
        return new ModalLifecycleInteraction(onStart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ModalLifecycleInteraction) && AbstractC22676k.m65745e(this.onStart, ((ModalLifecycleInteraction) other).onStart);
    }

    public final DecodedGenericInteraction getOnStart() {
        return this.onStart;
    }

    public int hashCode() {
        DecodedGenericInteraction decodedGenericInteraction = this.onStart;
        if (decodedGenericInteraction == null) {
            return 0;
        }
        return decodedGenericInteraction.hashCode();
    }

    public String toString() {
        return "ModalLifecycleInteraction(onStart=" + this.onStart + ")";
    }

    public ModalLifecycleInteraction(DecodedGenericInteraction decodedGenericInteraction) {
        this.onStart = decodedGenericInteraction;
    }

    public /* synthetic */ ModalLifecycleInteraction(DecodedGenericInteraction decodedGenericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : decodedGenericInteraction);
    }
}
