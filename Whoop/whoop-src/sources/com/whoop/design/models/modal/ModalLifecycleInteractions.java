package com.whoop.design.models.modal;

import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006("}, m65681d2 = {"Lcom/whoop/design/models/modal/ModalLifecycleInteractions;", "", "Lcom/whoop/navigation/models/GenericInteraction;", "onStart", "onUserDismiss", "<init>", "(Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/modal/ModalLifecycleInteractions;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/navigation/models/GenericInteraction;", "component2", "copy", "(Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/modal/ModalLifecycleInteractions;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/models/GenericInteraction;", "getOnStart", "getOnUserDismiss", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ModalLifecycleInteractions {
    private final GenericInteraction onStart;
    private final GenericInteraction onUserDismiss;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/modal/ModalLifecycleInteractions$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/modal/ModalLifecycleInteractions;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ModalLifecycleInteractions$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ModalLifecycleInteractions(int i13, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, ModalLifecycleInteractions$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.onStart = null;
        } else {
            this.onStart = genericInteraction;
        }
        this.onUserDismiss = genericInteraction2;
    }

    public static /* synthetic */ ModalLifecycleInteractions copy$default(ModalLifecycleInteractions modalLifecycleInteractions, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            genericInteraction = modalLifecycleInteractions.onStart;
        }
        if ((i13 & 2) != 0) {
            genericInteraction2 = modalLifecycleInteractions.onUserDismiss;
        }
        return modalLifecycleInteractions.copy(genericInteraction, genericInteraction2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ModalLifecycleInteractions self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.onStart != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, GenericInteraction$$serializer.INSTANCE, self.onStart);
        }
        output.encodeNullableSerializableElement(serialDesc, 1, GenericInteraction$$serializer.INSTANCE, self.onUserDismiss);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GenericInteraction getOnStart() {
        return this.onStart;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GenericInteraction getOnUserDismiss() {
        return this.onUserDismiss;
    }

    public final ModalLifecycleInteractions copy(GenericInteraction onStart, GenericInteraction onUserDismiss) {
        return new ModalLifecycleInteractions(onStart, onUserDismiss);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalLifecycleInteractions)) {
            return false;
        }
        ModalLifecycleInteractions modalLifecycleInteractions = (ModalLifecycleInteractions) other;
        return AbstractC22676k.m65745e(this.onStart, modalLifecycleInteractions.onStart) && AbstractC22676k.m65745e(this.onUserDismiss, modalLifecycleInteractions.onUserDismiss);
    }

    public final GenericInteraction getOnStart() {
        return this.onStart;
    }

    public final GenericInteraction getOnUserDismiss() {
        return this.onUserDismiss;
    }

    public int hashCode() {
        GenericInteraction genericInteraction = this.onStart;
        int iHashCode = (genericInteraction == null ? 0 : genericInteraction.hashCode()) * 31;
        GenericInteraction genericInteraction2 = this.onUserDismiss;
        return iHashCode + (genericInteraction2 != null ? genericInteraction2.hashCode() : 0);
    }

    public String toString() {
        return "ModalLifecycleInteractions(onStart=" + this.onStart + ", onUserDismiss=" + this.onUserDismiss + ")";
    }

    public ModalLifecycleInteractions(GenericInteraction genericInteraction, GenericInteraction genericInteraction2) {
        this.onStart = genericInteraction;
        this.onUserDismiss = genericInteraction2;
    }

    public /* synthetic */ ModalLifecycleInteractions(GenericInteraction genericInteraction, GenericInteraction genericInteraction2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : genericInteraction, genericInteraction2);
    }
}
