package com.whoop.whoopaction.domain.models;

import com.whoop.analytics.MetricEventModel;
import com.whoop.analytics.MetricEventModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.navigation.DismissEventModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.customizeplan.domain.api.C10717a;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25272z;
import p127ev.AbstractC13673n;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fBY\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nHÆ\u0003¢\u0006\u0004\b&\u0010'JT\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010%R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010'¨\u0006A"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/UpdateAction;", "Lcom/whoop/whoopaction/domain/models/Action;", "Lcom/whoop/whoopaction/domain/models/Request;", "request", "Lcom/whoop/navigation/e;", "completionDestination", "Lcom/whoop/navigation/DismissEventModel;", "dismissEvent", "Lcom/whoop/analytics/MetricEventModel;", "metricEvent", "", "", "Lcom/whoop/whoopaction/domain/models/MediaCaps;", "media", "<init>", "(Lcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/navigation/e;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/MetricEventModel;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/navigation/e;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/MetricEventModel;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whoop_action_release", "(Lcom/whoop/whoopaction/domain/models/UpdateAction;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/whoopaction/domain/models/Request;", "component2", "()Lcom/whoop/navigation/e;", "component3", "()Lcom/whoop/navigation/DismissEventModel;", "component4", "()Lcom/whoop/analytics/MetricEventModel;", "component5", "()Ljava/util/Map;", "copy", "(Lcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/navigation/e;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/MetricEventModel;Ljava/util/Map;)Lcom/whoop/whoopaction/domain/models/UpdateAction;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/whoopaction/domain/models/Request;", "getRequest", "Lcom/whoop/navigation/e;", "getCompletionDestination", "getCompletionDestination$annotations", "()V", "Lcom/whoop/navigation/DismissEventModel;", "getDismissEvent", "Lcom/whoop/analytics/MetricEventModel;", "getMetricEvent", "Ljava/util/Map;", "getMedia", "Companion", "$serializer", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UpdateAction implements Action {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e completionDestination;
    private final DismissEventModel dismissEvent;
    private final Map<String, MediaCaps> media;
    private final MetricEventModel metricEvent;
    private final Request request;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/UpdateAction$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/UpdateAction;", "serializer", "()Lwc3/c;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UpdateAction$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C10717a(26)), null, null, AbstractC30060g.m92087G(enumC23463i, new C10717a(27))};
    }

    public /* synthetic */ UpdateAction(int i13, Request request, C9598e c9598e, DismissEventModel dismissEventModel, MetricEventModel metricEventModel, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, UpdateAction$$serializer.INSTANCE.getDescriptor());
        }
        this.request = request;
        this.completionDestination = c9598e;
        this.dismissEvent = dismissEventModel;
        if ((i13 & 8) == 0) {
            this.metricEvent = null;
        } else {
            this.metricEvent = metricEventModel;
        }
        if ((i13 & 16) == 0) {
            this.media = C25272z.f99163w;
        } else {
            this.media = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, MediaCaps$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateAction copy$default(UpdateAction updateAction, Request request, C9598e c9598e, DismissEventModel dismissEventModel, MetricEventModel metricEventModel, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            request = updateAction.request;
        }
        if ((i13 & 2) != 0) {
            c9598e = updateAction.completionDestination;
        }
        if ((i13 & 4) != 0) {
            dismissEventModel = updateAction.dismissEvent;
        }
        if ((i13 & 8) != 0) {
            metricEventModel = updateAction.metricEvent;
        }
        if ((i13 & 16) != 0) {
            map = updateAction.media;
        }
        Map map2 = map;
        DismissEventModel dismissEventModel2 = dismissEventModel;
        return updateAction.copy(request, c9598e, dismissEventModel2, metricEventModel, map2);
    }

    public static /* synthetic */ void getCompletionDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$whoop_action_release(UpdateAction self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, Request$$serializer.INSTANCE, self.request);
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.completionDestination);
        output.encodeNullableSerializableElement(serialDesc, 2, DismissEventModel$$serializer.INSTANCE, self.dismissEvent);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.metricEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, MetricEventModel$$serializer.INSTANCE, self.metricEvent);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && AbstractC22676k.m65745e(self.media, C25272z.f99163w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.media);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Request getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C9598e getCompletionDestination() {
        return this.completionDestination;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DismissEventModel getDismissEvent() {
        return this.dismissEvent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MetricEventModel getMetricEvent() {
        return this.metricEvent;
    }

    public final Map<String, MediaCaps> component5() {
        return this.media;
    }

    public final UpdateAction copy(Request request, C9598e completionDestination, DismissEventModel dismissEvent, MetricEventModel metricEvent, Map<String, MediaCaps> media) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(media, "media");
        return new UpdateAction(request, completionDestination, dismissEvent, metricEvent, media);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateAction)) {
            return false;
        }
        UpdateAction updateAction = (UpdateAction) other;
        return AbstractC22676k.m65745e(this.request, updateAction.request) && AbstractC22676k.m65745e(this.completionDestination, updateAction.completionDestination) && AbstractC22676k.m65745e(this.dismissEvent, updateAction.dismissEvent) && AbstractC22676k.m65745e(this.metricEvent, updateAction.metricEvent) && AbstractC22676k.m65745e(this.media, updateAction.media);
    }

    public final C9598e getCompletionDestination() {
        return this.completionDestination;
    }

    public final DismissEventModel getDismissEvent() {
        return this.dismissEvent;
    }

    public final Map<String, MediaCaps> getMedia() {
        return this.media;
    }

    public final MetricEventModel getMetricEvent() {
        return this.metricEvent;
    }

    public final Request getRequest() {
        return this.request;
    }

    public int hashCode() {
        int iHashCode = this.request.hashCode() * 31;
        C9598e c9598e = this.completionDestination;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        DismissEventModel dismissEventModel = this.dismissEvent;
        int iHashCode3 = (iHashCode2 + (dismissEventModel == null ? 0 : dismissEventModel.hashCode())) * 31;
        MetricEventModel metricEventModel = this.metricEvent;
        return this.media.hashCode() + ((iHashCode3 + (metricEventModel != null ? metricEventModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        Request request = this.request;
        C9598e c9598e = this.completionDestination;
        DismissEventModel dismissEventModel = this.dismissEvent;
        MetricEventModel metricEventModel = this.metricEvent;
        Map<String, MediaCaps> map = this.media;
        StringBuilder sb4 = new StringBuilder("UpdateAction(request=");
        sb4.append(request);
        sb4.append(", completionDestination=");
        sb4.append(c9598e);
        sb4.append(", dismissEvent=");
        sb4.append(dismissEventModel);
        sb4.append(", metricEvent=");
        sb4.append(metricEventModel);
        sb4.append(", media=");
        return AbstractC13673n.m38565l(sb4, map, ")");
    }

    public UpdateAction(Request request, C9598e c9598e, DismissEventModel dismissEventModel, MetricEventModel metricEventModel, Map<String, MediaCaps> media) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(media, "media");
        this.request = request;
        this.completionDestination = c9598e;
        this.dismissEvent = dismissEventModel;
        this.metricEvent = metricEventModel;
        this.media = media;
    }

    public /* synthetic */ UpdateAction(Request request, C9598e c9598e, DismissEventModel dismissEventModel, MetricEventModel metricEventModel, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(request, c9598e, dismissEventModel, (i13 & 8) != 0 ? null : metricEventModel, (i13 & 16) != 0 ? C25272z.f99163w : map);
    }
}
