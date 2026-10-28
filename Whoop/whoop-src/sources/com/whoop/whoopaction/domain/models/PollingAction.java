package com.whoop.whoopaction.domain.models;

import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBK\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$JH\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010$¨\u0006="}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/PollingAction;", "Lcom/whoop/whoopaction/domain/models/Action;", "Lcom/whoop/whoopaction/domain/models/Request;", "request", "", "frequencyMillis", "timeoutMillis", "Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "pollingTreatment", "Lcom/whoop/navigation/models/GenericInteraction;", "onTimeout", "<init>", "(Lcom/whoop/whoopaction/domain/models/Request;JLjava/lang/Long;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/whoopaction/domain/models/Request;JLjava/lang/Long;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whoop_action_release", "(Lcom/whoop/whoopaction/domain/models/PollingAction;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/whoopaction/domain/models/Request;", "component2", "()J", "component3", "()Ljava/lang/Long;", "component4", "()Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "component5", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Lcom/whoop/whoopaction/domain/models/Request;JLjava/lang/Long;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/whoopaction/domain/models/PollingAction;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/whoopaction/domain/models/Request;", "getRequest", "J", "getFrequencyMillis", "Ljava/lang/Long;", "getTimeoutMillis", "Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "getPollingTreatment", "Lcom/whoop/navigation/models/GenericInteraction;", "getOnTimeout", "Companion", "$serializer", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PollingAction implements Action {
    private final long frequencyMillis;
    private final GenericInteraction onTimeout;
    private final LoadingTreatment pollingTreatment;
    private final Request request;
    private final Long timeoutMillis;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/PollingAction$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/PollingAction;", "serializer", "()Lwc3/c;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PollingAction$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PollingAction(int i13, Request request, long j7, Long l7, LoadingTreatment loadingTreatment, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, PollingAction$$serializer.INSTANCE.getDescriptor());
        }
        this.request = request;
        this.frequencyMillis = j7;
        if ((i13 & 4) == 0) {
            this.timeoutMillis = null;
        } else {
            this.timeoutMillis = l7;
        }
        if ((i13 & 8) == 0) {
            this.pollingTreatment = null;
        } else {
            this.pollingTreatment = loadingTreatment;
        }
        if ((i13 & 16) == 0) {
            this.onTimeout = null;
        } else {
            this.onTimeout = genericInteraction;
        }
    }

    public static /* synthetic */ PollingAction copy$default(PollingAction pollingAction, Request request, long j7, Long l7, LoadingTreatment loadingTreatment, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            request = pollingAction.request;
        }
        if ((i13 & 2) != 0) {
            j7 = pollingAction.frequencyMillis;
        }
        if ((i13 & 4) != 0) {
            l7 = pollingAction.timeoutMillis;
        }
        if ((i13 & 8) != 0) {
            loadingTreatment = pollingAction.pollingTreatment;
        }
        if ((i13 & 16) != 0) {
            genericInteraction = pollingAction.onTimeout;
        }
        GenericInteraction genericInteraction2 = genericInteraction;
        Long l12 = l7;
        return pollingAction.copy(request, j7, l12, loadingTreatment, genericInteraction2);
    }

    public static final /* synthetic */ void write$Self$whoop_action_release(PollingAction self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, Request$$serializer.INSTANCE, self.request);
        output.encodeLongElement(serialDesc, 1, self.frequencyMillis);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.timeoutMillis != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.timeoutMillis);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.pollingTreatment != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, LoadingTreatment$$serializer.INSTANCE, self.pollingTreatment);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.onTimeout == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, GenericInteraction$$serializer.INSTANCE, self.onTimeout);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Request getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getFrequencyMillis() {
        return this.frequencyMillis;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LoadingTreatment getPollingTreatment() {
        return this.pollingTreatment;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GenericInteraction getOnTimeout() {
        return this.onTimeout;
    }

    public final PollingAction copy(Request request, long frequencyMillis, Long timeoutMillis, LoadingTreatment pollingTreatment, GenericInteraction onTimeout) {
        AbstractC22676k.m65750j(request, "request");
        return new PollingAction(request, frequencyMillis, timeoutMillis, pollingTreatment, onTimeout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollingAction)) {
            return false;
        }
        PollingAction pollingAction = (PollingAction) other;
        return AbstractC22676k.m65745e(this.request, pollingAction.request) && this.frequencyMillis == pollingAction.frequencyMillis && AbstractC22676k.m65745e(this.timeoutMillis, pollingAction.timeoutMillis) && AbstractC22676k.m65745e(this.pollingTreatment, pollingAction.pollingTreatment) && AbstractC22676k.m65745e(this.onTimeout, pollingAction.onTimeout);
    }

    public final long getFrequencyMillis() {
        return this.frequencyMillis;
    }

    public final GenericInteraction getOnTimeout() {
        return this.onTimeout;
    }

    public final LoadingTreatment getPollingTreatment() {
        return this.pollingTreatment;
    }

    public final Request getRequest() {
        return this.request;
    }

    public final Long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public int hashCode() {
        int iM30451e = AbstractC11266d.m30451e(this.request.hashCode() * 31, this.frequencyMillis, 31);
        Long l7 = this.timeoutMillis;
        int iHashCode = (iM30451e + (l7 == null ? 0 : l7.hashCode())) * 31;
        LoadingTreatment loadingTreatment = this.pollingTreatment;
        int iHashCode2 = (iHashCode + (loadingTreatment == null ? 0 : loadingTreatment.hashCode())) * 31;
        GenericInteraction genericInteraction = this.onTimeout;
        return iHashCode2 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        return "PollingAction(request=" + this.request + ", frequencyMillis=" + this.frequencyMillis + ", timeoutMillis=" + this.timeoutMillis + ", pollingTreatment=" + this.pollingTreatment + ", onTimeout=" + this.onTimeout + ")";
    }

    public PollingAction(Request request, long j7, Long l7, LoadingTreatment loadingTreatment, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(request, "request");
        this.request = request;
        this.frequencyMillis = j7;
        this.timeoutMillis = l7;
        this.pollingTreatment = loadingTreatment;
        this.onTimeout = genericInteraction;
    }

    public /* synthetic */ PollingAction(Request request, long j7, Long l7, LoadingTreatment loadingTreatment, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(request, j7, (i13 & 4) != 0 ? null : l7, (i13 & 8) != 0 ? null : loadingTreatment, (i13 & 16) != 0 ? null : genericInteraction);
    }
}
