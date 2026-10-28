package com.whoop.whoopaction.domain.models;

import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006%"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/GenericPollingResult;", "", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whoop_action_release", "(Lcom/whoop/whoopaction/domain/models/GenericPollingResult;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/whoopaction/domain/models/GenericPollingResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Companion", "$serializer", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GenericPollingResult {
    private final GenericInteraction interaction;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/GenericPollingResult$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/GenericPollingResult;", "serializer", "()Lwc3/c;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GenericPollingResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GenericPollingResult() {
        this((GenericInteraction) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ GenericPollingResult copy$default(GenericPollingResult genericPollingResult, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            genericInteraction = genericPollingResult.interaction;
        }
        return genericPollingResult.copy(genericInteraction);
    }

    public static final /* synthetic */ void write$Self$whoop_action_release(GenericPollingResult self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.interaction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, GenericInteraction$$serializer.INSTANCE, self.interaction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final GenericPollingResult copy(GenericInteraction interaction) {
        return new GenericPollingResult(interaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GenericPollingResult) && AbstractC22676k.m65745e(this.interaction, ((GenericPollingResult) other).interaction);
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public int hashCode() {
        GenericInteraction genericInteraction = this.interaction;
        if (genericInteraction == null) {
            return 0;
        }
        return genericInteraction.hashCode();
    }

    public String toString() {
        return "GenericPollingResult(interaction=" + this.interaction + ")";
    }

    public /* synthetic */ GenericPollingResult(int i13, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.interaction = null;
        } else {
            this.interaction = genericInteraction;
        }
    }

    public GenericPollingResult(GenericInteraction genericInteraction) {
        this.interaction = genericInteraction;
    }

    public /* synthetic */ GenericPollingResult(GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : genericInteraction);
    }
}
