package com.whoop.p057ai.chat.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006)"}, m65681d2 = {"Lcom/whoop/ai/chat/api/MarkTurnAsSeenRequestBody;", "", "", "ttfmtMs", "ttpiaMs", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/api/MarkTurnAsSeenRequestBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Long;", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/whoop/ai/chat/api/MarkTurnAsSeenRequestBody;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getTtfmtMs", "getTtpiaMs", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MarkTurnAsSeenRequestBody {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Long ttfmtMs;
    private final Long ttpiaMs;

    /* JADX INFO: renamed from: com.whoop.ai.chat.api.MarkTurnAsSeenRequestBody$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/api/MarkTurnAsSeenRequestBody$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/api/MarkTurnAsSeenRequestBody;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MarkTurnAsSeenRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarkTurnAsSeenRequestBody() {
        this((Long) null, (Long) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ MarkTurnAsSeenRequestBody copy$default(MarkTurnAsSeenRequestBody markTurnAsSeenRequestBody, Long l7, Long l12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            l7 = markTurnAsSeenRequestBody.ttfmtMs;
        }
        if ((i13 & 2) != 0) {
            l12 = markTurnAsSeenRequestBody.ttpiaMs;
        }
        return markTurnAsSeenRequestBody.copy(l7, l12);
    }

    public static final /* synthetic */ void write$Self$bot_release(MarkTurnAsSeenRequestBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.ttfmtMs != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, LongSerializer.INSTANCE, self.ttfmtMs);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.ttpiaMs == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.ttpiaMs);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTtfmtMs() {
        return this.ttfmtMs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTtpiaMs() {
        return this.ttpiaMs;
    }

    public final MarkTurnAsSeenRequestBody copy(Long ttfmtMs, Long ttpiaMs) {
        return new MarkTurnAsSeenRequestBody(ttfmtMs, ttpiaMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkTurnAsSeenRequestBody)) {
            return false;
        }
        MarkTurnAsSeenRequestBody markTurnAsSeenRequestBody = (MarkTurnAsSeenRequestBody) other;
        return AbstractC22676k.m65745e(this.ttfmtMs, markTurnAsSeenRequestBody.ttfmtMs) && AbstractC22676k.m65745e(this.ttpiaMs, markTurnAsSeenRequestBody.ttpiaMs);
    }

    public final Long getTtfmtMs() {
        return this.ttfmtMs;
    }

    public final Long getTtpiaMs() {
        return this.ttpiaMs;
    }

    public int hashCode() {
        Long l7 = this.ttfmtMs;
        int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
        Long l12 = this.ttpiaMs;
        return iHashCode + (l12 != null ? l12.hashCode() : 0);
    }

    public String toString() {
        return "MarkTurnAsSeenRequestBody(ttfmtMs=" + this.ttfmtMs + ", ttpiaMs=" + this.ttpiaMs + ")";
    }

    public /* synthetic */ MarkTurnAsSeenRequestBody(int i13, Long l7, Long l12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.ttfmtMs = null;
        } else {
            this.ttfmtMs = l7;
        }
        if ((i13 & 2) == 0) {
            this.ttpiaMs = null;
        } else {
            this.ttpiaMs = l12;
        }
    }

    public MarkTurnAsSeenRequestBody(Long l7, Long l12) {
        this.ttfmtMs = l7;
        this.ttpiaMs = l12;
    }

    public /* synthetic */ MarkTurnAsSeenRequestBody(Long l7, Long l12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : l7, (i13 & 2) != 0 ? null : l12);
    }
}
