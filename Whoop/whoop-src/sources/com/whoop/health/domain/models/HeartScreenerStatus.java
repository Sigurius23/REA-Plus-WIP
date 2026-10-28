package com.whoop.health.domain.models;

import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/health/domain/models/HeartScreenerStatus;", "", "Lcom/whoop/design/util/TextResource;", "description", "", "feature", "Lcom/whoop/health/domain/models/MiniStatus;", "miniStatus", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/health/domain/models/MiniStatus;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/health/domain/models/MiniStatus;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_release", "(Lcom/whoop/health/domain/models/HeartScreenerStatus;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/health/domain/models/MiniStatus;", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/health/domain/models/MiniStatus;)Lcom/whoop/health/domain/models/HeartScreenerStatus;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getDescription", "Ljava/lang/String;", "getFeature", "Lcom/whoop/health/domain/models/MiniStatus;", "getMiniStatus", "Companion", "$serializer", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HeartScreenerStatus {
    private final TextResource description;
    private final String feature;
    private final MiniStatus miniStatus;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/domain/models/HeartScreenerStatus$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/domain/models/HeartScreenerStatus;", "serializer", "()Lwc3/c;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HeartScreenerStatus$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HeartScreenerStatus(int i13, TextResource textResource, String str, MiniStatus miniStatus, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, HeartScreenerStatus$$serializer.INSTANCE.getDescriptor());
        }
        this.description = textResource;
        this.feature = str;
        this.miniStatus = miniStatus;
    }

    public static /* synthetic */ HeartScreenerStatus copy$default(HeartScreenerStatus heartScreenerStatus, TextResource textResource, String str, MiniStatus miniStatus, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = heartScreenerStatus.description;
        }
        if ((i13 & 2) != 0) {
            str = heartScreenerStatus.feature;
        }
        if ((i13 & 4) != 0) {
            miniStatus = heartScreenerStatus.miniStatus;
        }
        return heartScreenerStatus.copy(textResource, str, miniStatus);
    }

    public static final /* synthetic */ void write$Self$health_release(HeartScreenerStatus self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.description);
        output.encodeStringElement(serialDesc, 1, self.feature);
        output.encodeSerializableElement(serialDesc, 2, MiniStatus$$serializer.INSTANCE, self.miniStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFeature() {
        return this.feature;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MiniStatus getMiniStatus() {
        return this.miniStatus;
    }

    public final HeartScreenerStatus copy(TextResource description, String feature, MiniStatus miniStatus) {
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(feature, "feature");
        AbstractC22676k.m65750j(miniStatus, "miniStatus");
        return new HeartScreenerStatus(description, feature, miniStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartScreenerStatus)) {
            return false;
        }
        HeartScreenerStatus heartScreenerStatus = (HeartScreenerStatus) other;
        return AbstractC22676k.m65745e(this.description, heartScreenerStatus.description) && AbstractC22676k.m65745e(this.feature, heartScreenerStatus.feature) && AbstractC22676k.m65745e(this.miniStatus, heartScreenerStatus.miniStatus);
    }

    public final TextResource getDescription() {
        return this.description;
    }

    public final String getFeature() {
        return this.feature;
    }

    public final MiniStatus getMiniStatus() {
        return this.miniStatus;
    }

    public int hashCode() {
        return this.miniStatus.hashCode() + AbstractC11266d.m30450d(this.description.hashCode() * 31, 31, this.feature);
    }

    public String toString() {
        TextResource textResource = this.description;
        String str = this.feature;
        MiniStatus miniStatus = this.miniStatus;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("HeartScreenerStatus(description=", textResource, ", feature=", str, ", miniStatus=");
        sbM91845o.append(miniStatus);
        sbM91845o.append(")");
        return sbM91845o.toString();
    }

    public HeartScreenerStatus(TextResource description, String feature, MiniStatus miniStatus) {
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(feature, "feature");
        AbstractC22676k.m65750j(miniStatus, "miniStatus");
        this.description = description;
        this.feature = feature;
        this.miniStatus = miniStatus;
    }
}
