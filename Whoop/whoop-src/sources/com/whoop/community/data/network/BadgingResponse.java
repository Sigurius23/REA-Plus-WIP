package com.whoop.community.data.network;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, m65681d2 = {"Lcom/whoop/community/data/network/BadgingResponse;", "", "", "showCommunityBadge", "<init>", "(Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_release", "(Lcom/whoop/community/data/network/BadgingResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "copy", "(Z)Lcom/whoop/community/data/network/BadgingResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowCommunityBadge", "Companion", "$serializer", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BadgingResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean showCommunityBadge;

    /* JADX INFO: renamed from: com.whoop.community.data.network.BadgingResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/community/data/network/BadgingResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/community/data/network/BadgingResponse;", "serializer", "()Lwc3/c;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BadgingResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BadgingResponse() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BadgingResponse copy$default(BadgingResponse badgingResponse, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = badgingResponse.showCommunityBadge;
        }
        return badgingResponse.copy(z4);
    }

    public static final /* synthetic */ void write$Self$community_release(BadgingResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.showCommunityBadge) {
            output.encodeBooleanElement(serialDesc, 0, self.showCommunityBadge);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowCommunityBadge() {
        return this.showCommunityBadge;
    }

    public final BadgingResponse copy(boolean showCommunityBadge) {
        return new BadgingResponse(showCommunityBadge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BadgingResponse) && this.showCommunityBadge == ((BadgingResponse) other).showCommunityBadge;
    }

    public final boolean getShowCommunityBadge() {
        return this.showCommunityBadge;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showCommunityBadge);
    }

    public String toString() {
        return AbstractC3855a.m11827k("BadgingResponse(showCommunityBadge=", ")", this.showCommunityBadge);
    }

    public /* synthetic */ BadgingResponse(int i13, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.showCommunityBadge = false;
        } else {
            this.showCommunityBadge = z4;
        }
    }

    public BadgingResponse(boolean z4) {
        this.showCommunityBadge = z4;
    }

    public /* synthetic */ BadgingResponse(boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4);
    }
}
