package com.whoop.p057ai.chat.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0017¨\u0006+"}, m65681d2 = {"Lcom/whoop/ai/chat/api/AiTrackingCapabilities;", "", "", "seenTrackingEnabled", "dismissTrackingEnabled", "endSeenTrackingEnabled", "<init>", "(ZZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "component3", "copy", "(ZZZ)Lcom/whoop/ai/chat/api/AiTrackingCapabilities;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSeenTrackingEnabled", "getDismissTrackingEnabled", "getEndSeenTrackingEnabled", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiTrackingCapabilities {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean dismissTrackingEnabled;
    private final boolean endSeenTrackingEnabled;
    private final boolean seenTrackingEnabled;

    /* JADX INFO: renamed from: com.whoop.ai.chat.api.AiTrackingCapabilities$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/api/AiTrackingCapabilities$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/api/AiTrackingCapabilities;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiTrackingCapabilities$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AiTrackingCapabilities() {
        this(false, false, false, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AiTrackingCapabilities copy$default(AiTrackingCapabilities aiTrackingCapabilities, boolean z4, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = aiTrackingCapabilities.seenTrackingEnabled;
        }
        if ((i13 & 2) != 0) {
            z13 = aiTrackingCapabilities.dismissTrackingEnabled;
        }
        if ((i13 & 4) != 0) {
            z14 = aiTrackingCapabilities.endSeenTrackingEnabled;
        }
        return aiTrackingCapabilities.copy(z4, z13, z14);
    }

    public static final /* synthetic */ void write$Self$bot_release(AiTrackingCapabilities self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !self.seenTrackingEnabled) {
            output.encodeBooleanElement(serialDesc, 0, self.seenTrackingEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.dismissTrackingEnabled) {
            output.encodeBooleanElement(serialDesc, 1, self.dismissTrackingEnabled);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.endSeenTrackingEnabled) {
            return;
        }
        output.encodeBooleanElement(serialDesc, 2, self.endSeenTrackingEnabled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSeenTrackingEnabled() {
        return this.seenTrackingEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDismissTrackingEnabled() {
        return this.dismissTrackingEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEndSeenTrackingEnabled() {
        return this.endSeenTrackingEnabled;
    }

    public final AiTrackingCapabilities copy(boolean seenTrackingEnabled, boolean dismissTrackingEnabled, boolean endSeenTrackingEnabled) {
        return new AiTrackingCapabilities(seenTrackingEnabled, dismissTrackingEnabled, endSeenTrackingEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiTrackingCapabilities)) {
            return false;
        }
        AiTrackingCapabilities aiTrackingCapabilities = (AiTrackingCapabilities) other;
        return this.seenTrackingEnabled == aiTrackingCapabilities.seenTrackingEnabled && this.dismissTrackingEnabled == aiTrackingCapabilities.dismissTrackingEnabled && this.endSeenTrackingEnabled == aiTrackingCapabilities.endSeenTrackingEnabled;
    }

    public final boolean getDismissTrackingEnabled() {
        return this.dismissTrackingEnabled;
    }

    public final boolean getEndSeenTrackingEnabled() {
        return this.endSeenTrackingEnabled;
    }

    public final boolean getSeenTrackingEnabled() {
        return this.seenTrackingEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.endSeenTrackingEnabled) + AbstractC2875y.m8289b(Boolean.hashCode(this.seenTrackingEnabled) * 31, 31, this.dismissTrackingEnabled);
    }

    public String toString() {
        boolean z4 = this.seenTrackingEnabled;
        boolean z13 = this.dismissTrackingEnabled;
        return AbstractC18489d0.m53372m(AbstractC11895b.m32002u("AiTrackingCapabilities(seenTrackingEnabled=", ", dismissTrackingEnabled=", ", endSeenTrackingEnabled=", z4, z13), this.endSeenTrackingEnabled, ")");
    }

    public /* synthetic */ AiTrackingCapabilities(int i13, boolean z4, boolean z13, boolean z14, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.seenTrackingEnabled = true;
        } else {
            this.seenTrackingEnabled = z4;
        }
        if ((i13 & 2) == 0) {
            this.dismissTrackingEnabled = false;
        } else {
            this.dismissTrackingEnabled = z13;
        }
        if ((i13 & 4) == 0) {
            this.endSeenTrackingEnabled = true;
        } else {
            this.endSeenTrackingEnabled = z14;
        }
    }

    public AiTrackingCapabilities(boolean z4, boolean z13, boolean z14) {
        this.seenTrackingEnabled = z4;
        this.dismissTrackingEnabled = z13;
        this.endSeenTrackingEnabled = z14;
    }

    public /* synthetic */ AiTrackingCapabilities(boolean z4, boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? true : z14);
    }
}
