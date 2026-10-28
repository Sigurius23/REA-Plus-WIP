package com.whoop.whoopaction.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006*"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/MediaCaps;", "", "", "maxDimension", "", "maxBytes", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whoop_action_release", "(Lcom/whoop/whoopaction/domain/models/MediaCaps;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;)Lcom/whoop/whoopaction/domain/models/MediaCaps;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMaxDimension", "Ljava/lang/Long;", "getMaxBytes", "Companion", "$serializer", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MediaCaps {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Long maxBytes;
    private final Integer maxDimension;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/MediaCaps$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/MediaCaps;", "serializer", "()Lwc3/c;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MediaCaps$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MediaCaps(int i13, Integer num, Long l7, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, MediaCaps$$serializer.INSTANCE.getDescriptor());
        }
        this.maxDimension = num;
        this.maxBytes = l7;
    }

    public static /* synthetic */ MediaCaps copy$default(MediaCaps mediaCaps, Integer num, Long l7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = mediaCaps.maxDimension;
        }
        if ((i13 & 2) != 0) {
            l7 = mediaCaps.maxBytes;
        }
        return mediaCaps.copy(num, l7);
    }

    public static final /* synthetic */ void write$Self$whoop_action_release(MediaCaps self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.maxDimension);
        output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.maxBytes);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getMaxDimension() {
        return this.maxDimension;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getMaxBytes() {
        return this.maxBytes;
    }

    public final MediaCaps copy(Integer maxDimension, Long maxBytes) {
        return new MediaCaps(maxDimension, maxBytes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaCaps)) {
            return false;
        }
        MediaCaps mediaCaps = (MediaCaps) other;
        return AbstractC22676k.m65745e(this.maxDimension, mediaCaps.maxDimension) && AbstractC22676k.m65745e(this.maxBytes, mediaCaps.maxBytes);
    }

    public final Long getMaxBytes() {
        return this.maxBytes;
    }

    public final Integer getMaxDimension() {
        return this.maxDimension;
    }

    public int hashCode() {
        Integer num = this.maxDimension;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l7 = this.maxBytes;
        return iHashCode + (l7 != null ? l7.hashCode() : 0);
    }

    public String toString() {
        return "MediaCaps(maxDimension=" + this.maxDimension + ", maxBytes=" + this.maxBytes + ")";
    }

    public MediaCaps(Integer num, Long l7) {
        this.maxDimension = num;
        this.maxBytes = l7;
    }
}
