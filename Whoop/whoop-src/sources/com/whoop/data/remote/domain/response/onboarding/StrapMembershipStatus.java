package com.whoop.data.remote.domain.response.onboarding;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PROVISIONAL", "GIFT", "ELITE", "ELITE_GIFT", "UNKNOWN", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum StrapMembershipStatus {
    PROVISIONAL("provisional"),
    GIFT("gift"),
    ELITE("elite"),
    ELITE_GIFT("elite_gift"),
    UNKNOWN("unknown");

    private final String value;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus$Companion;", "", "<init>", "()V", "fromStringOrDefault", "Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;", "value", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
        public final StrapMembershipStatus fromStringOrDefault(String value) {
            for (StrapMembershipStatus strapMembershipStatus : StrapMembershipStatus.values()) {
                if (AbstractC22676k.m65745e(strapMembershipStatus.getValue(), value)) {
                    if (strapMembershipStatus == null) {
                        return StrapMembershipStatus.UNKNOWN;
                    }
                    return strapMembershipStatus;
                }
            }
            strapMembershipStatus = null;
            if (strapMembershipStatus == null) {
                return StrapMembershipStatus.UNKNOWN;
            }
            return strapMembershipStatus;
        }

        private Companion() {
        }
    }

    StrapMembershipStatus(String str) {
        this.value = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
