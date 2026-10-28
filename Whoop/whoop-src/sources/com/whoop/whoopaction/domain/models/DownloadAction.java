package com.whoop.whoopaction.domain.models;

import com.whoop.analytics.MetricEventModel;
import com.whoop.analytics.MetricEventModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ<\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001f¨\u00063"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/DownloadAction;", "Lcom/whoop/whoopaction/domain/models/Action;", "", "path", "filename", "", "timeoutMillis", "Lcom/whoop/analytics/MetricEventModel;", "metricEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/analytics/MetricEventModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/analytics/MetricEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whoop_action_release", "(Lcom/whoop/whoopaction/domain/models/DownloadAction;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "component4", "()Lcom/whoop/analytics/MetricEventModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/analytics/MetricEventModel;)Lcom/whoop/whoopaction/domain/models/DownloadAction;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "getFilename", "Ljava/lang/Long;", "getTimeoutMillis", "Lcom/whoop/analytics/MetricEventModel;", "getMetricEvent", "Companion", "$serializer", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DownloadAction implements Action {
    private final String filename;
    private final MetricEventModel metricEvent;
    private final String path;
    private final Long timeoutMillis;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/DownloadAction$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/DownloadAction;", "serializer", "()Lwc3/c;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DownloadAction$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DownloadAction(int i13, String str, String str2, Long l7, MetricEventModel metricEventModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, DownloadAction$$serializer.INSTANCE.getDescriptor());
        }
        this.path = str;
        this.filename = str2;
        this.timeoutMillis = l7;
        if ((i13 & 8) == 0) {
            this.metricEvent = null;
        } else {
            this.metricEvent = metricEventModel;
        }
    }

    public static /* synthetic */ DownloadAction copy$default(DownloadAction downloadAction, String str, String str2, Long l7, MetricEventModel metricEventModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = downloadAction.path;
        }
        if ((i13 & 2) != 0) {
            str2 = downloadAction.filename;
        }
        if ((i13 & 4) != 0) {
            l7 = downloadAction.timeoutMillis;
        }
        if ((i13 & 8) != 0) {
            metricEventModel = downloadAction.metricEvent;
        }
        return downloadAction.copy(str, str2, l7, metricEventModel);
    }

    public static final /* synthetic */ void write$Self$whoop_action_release(DownloadAction self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.path);
        output.encodeStringElement(serialDesc, 1, self.filename);
        output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.timeoutMillis);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.metricEvent == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, MetricEventModel$$serializer.INSTANCE, self.metricEvent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MetricEventModel getMetricEvent() {
        return this.metricEvent;
    }

    public final DownloadAction copy(String path, String filename, Long timeoutMillis, MetricEventModel metricEvent) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(filename, "filename");
        return new DownloadAction(path, filename, timeoutMillis, metricEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadAction)) {
            return false;
        }
        DownloadAction downloadAction = (DownloadAction) other;
        return AbstractC22676k.m65745e(this.path, downloadAction.path) && AbstractC22676k.m65745e(this.filename, downloadAction.filename) && AbstractC22676k.m65745e(this.timeoutMillis, downloadAction.timeoutMillis) && AbstractC22676k.m65745e(this.metricEvent, downloadAction.metricEvent);
    }

    public final String getFilename() {
        return this.filename;
    }

    public final MetricEventModel getMetricEvent() {
        return this.metricEvent;
    }

    public final String getPath() {
        return this.path;
    }

    public final Long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.path.hashCode() * 31, 31, this.filename);
        Long l7 = this.timeoutMillis;
        int iHashCode = (iM30450d + (l7 == null ? 0 : l7.hashCode())) * 31;
        MetricEventModel metricEventModel = this.metricEvent;
        return iHashCode + (metricEventModel != null ? metricEventModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.path;
        String str2 = this.filename;
        Long l7 = this.timeoutMillis;
        MetricEventModel metricEventModel = this.metricEvent;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DownloadAction(path=", str, ", filename=", str2, ", timeoutMillis=");
        sbM32001t.append(l7);
        sbM32001t.append(", metricEvent=");
        sbM32001t.append(metricEventModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public DownloadAction(String path, String filename, Long l7, MetricEventModel metricEventModel) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(filename, "filename");
        this.path = path;
        this.filename = filename;
        this.timeoutMillis = l7;
        this.metricEvent = metricEventModel;
    }

    public /* synthetic */ DownloadAction(String str, String str2, Long l7, MetricEventModel metricEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, l7, (i13 & 8) != 0 ? null : metricEventModel);
    }
}
