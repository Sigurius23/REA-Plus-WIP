package com.whoop.referafriend.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/RafHubResponse;", "", "Lcom/whoop/referafriend/domain/models/RafHubType$Basic;", "basic", "Lcom/whoop/referafriend/domain/models/RafHubType$Full;", "full", "Lcom/whoop/referafriend/domain/models/RafHubType$Trials;", "trials", "<init>", "(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lcom/whoop/referafriend/domain/models/RafHubType$Trials;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lcom/whoop/referafriend/domain/models/RafHubType$Trials;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$refer_a_friend_release", "(Lcom/whoop/referafriend/domain/models/RafHubResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/referafriend/domain/models/RafHubType$Basic;", "component2", "()Lcom/whoop/referafriend/domain/models/RafHubType$Full;", "component3", "()Lcom/whoop/referafriend/domain/models/RafHubType$Trials;", "copy", "(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lcom/whoop/referafriend/domain/models/RafHubType$Trials;)Lcom/whoop/referafriend/domain/models/RafHubResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/referafriend/domain/models/RafHubType$Basic;", "getBasic", "Lcom/whoop/referafriend/domain/models/RafHubType$Full;", "getFull", "Lcom/whoop/referafriend/domain/models/RafHubType$Trials;", "getTrials", "Companion", "$serializer", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RafHubResponse {
    private final RafHubType.Basic basic;
    private final RafHubType.Full full;
    private final RafHubType.Trials trials;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/RafHubResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/referafriend/domain/models/RafHubResponse;", "serializer", "()Lwc3/c;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RafHubResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RafHubResponse() {
        this((RafHubType.Basic) null, (RafHubType.Full) null, (RafHubType.Trials) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RafHubResponse copy$default(RafHubResponse rafHubResponse, RafHubType.Basic basic, RafHubType.Full full, RafHubType.Trials trials, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            basic = rafHubResponse.basic;
        }
        if ((i13 & 2) != 0) {
            full = rafHubResponse.full;
        }
        if ((i13 & 4) != 0) {
            trials = rafHubResponse.trials;
        }
        return rafHubResponse.copy(basic, full, trials);
    }

    public static final /* synthetic */ void write$Self$refer_a_friend_release(RafHubResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.basic != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, RafHubType$Basic$$serializer.INSTANCE, self.basic);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.full != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, RafHubType$Full$$serializer.INSTANCE, self.full);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.trials == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, RafHubType$Trials$$serializer.INSTANCE, self.trials);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RafHubType.Basic getBasic() {
        return this.basic;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RafHubType.Full getFull() {
        return this.full;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RafHubType.Trials getTrials() {
        return this.trials;
    }

    public final RafHubResponse copy(RafHubType.Basic basic, RafHubType.Full full, RafHubType.Trials trials) {
        return new RafHubResponse(basic, full, trials);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RafHubResponse)) {
            return false;
        }
        RafHubResponse rafHubResponse = (RafHubResponse) other;
        return AbstractC22676k.m65745e(this.basic, rafHubResponse.basic) && AbstractC22676k.m65745e(this.full, rafHubResponse.full) && AbstractC22676k.m65745e(this.trials, rafHubResponse.trials);
    }

    public final RafHubType.Basic getBasic() {
        return this.basic;
    }

    public final RafHubType.Full getFull() {
        return this.full;
    }

    public final RafHubType.Trials getTrials() {
        return this.trials;
    }

    public int hashCode() {
        RafHubType.Basic basic = this.basic;
        int iHashCode = (basic == null ? 0 : basic.hashCode()) * 31;
        RafHubType.Full full = this.full;
        int iHashCode2 = (iHashCode + (full == null ? 0 : full.hashCode())) * 31;
        RafHubType.Trials trials = this.trials;
        return iHashCode2 + (trials != null ? trials.hashCode() : 0);
    }

    public String toString() {
        return "RafHubResponse(basic=" + this.basic + ", full=" + this.full + ", trials=" + this.trials + ")";
    }

    public /* synthetic */ RafHubResponse(int i13, RafHubType.Basic basic, RafHubType.Full full, RafHubType.Trials trials, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.basic = null;
        } else {
            this.basic = basic;
        }
        if ((i13 & 2) == 0) {
            this.full = null;
        } else {
            this.full = full;
        }
        if ((i13 & 4) == 0) {
            this.trials = null;
        } else {
            this.trials = trials;
        }
    }

    public RafHubResponse(RafHubType.Basic basic, RafHubType.Full full, RafHubType.Trials trials) {
        this.basic = basic;
        this.full = full;
        this.trials = trials;
    }

    public /* synthetic */ RafHubResponse(RafHubType.Basic basic, RafHubType.Full full, RafHubType.Trials trials, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : basic, (i13 & 2) != 0 ? null : full, (i13 & 4) != 0 ? null : trials);
    }
}
