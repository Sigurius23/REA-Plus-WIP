package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.api.QueryParams;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b\u0007\u0010\u001c¨\u0006-"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/TargetingConfig;", "", "", QueryParams.URL, "Lcom/amplitude/android/engagement/types/MatchType;", "matchType", "", "isExclude", "<init>", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/MatchType;Z)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/amplitude/android/engagement/types/MatchType;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/TargetingConfig;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/amplitude/android/engagement/types/MatchType;", "component3", "()Z", "copy", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/MatchType;Z)Lcom/amplitude/android/engagement/types/TargetingConfig;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Lcom/amplitude/android/engagement/types/MatchType;", "getMatchType", "Z", "Companion", "$serializer", "com/amplitude/android/engagement/types/y1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TargetingConfig {
    public static final int $stable = 0;
    private final boolean isExclude;
    private final MatchType matchType;
    private final String url;
    public static final C4951y1 Companion = new C4951y1();
    private static final InterfaceC37138c[] $childSerializers = {null, MatchType.Companion.serializer(), null};

    @InterfaceC23457c
    public /* synthetic */ TargetingConfig(int i13, String str, MatchType matchType, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, TargetingConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
        this.matchType = matchType;
        if ((i13 & 4) == 0) {
            this.isExclude = false;
        } else {
            this.isExclude = z4;
        }
    }

    public static /* synthetic */ TargetingConfig copy$default(TargetingConfig targetingConfig, String str, MatchType matchType, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = targetingConfig.url;
        }
        if ((i13 & 2) != 0) {
            matchType = targetingConfig.matchType;
        }
        if ((i13 & 4) != 0) {
            z4 = targetingConfig.isExclude;
        }
        return targetingConfig.copy(str, matchType, z4);
    }

    public static final /* synthetic */ void write$Self(TargetingConfig self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.url);
        output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.matchType);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.isExclude) {
            output.encodeBooleanElement(serialDesc, 2, self.isExclude);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MatchType getMatchType() {
        return this.matchType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsExclude() {
        return this.isExclude;
    }

    public final TargetingConfig copy(String url, MatchType matchType, boolean isExclude) {
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(matchType, "matchType");
        return new TargetingConfig(url, matchType, isExclude);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TargetingConfig)) {
            return false;
        }
        TargetingConfig targetingConfig = (TargetingConfig) other;
        return AbstractC22676k.m65745e(this.url, targetingConfig.url) && this.matchType == targetingConfig.matchType && this.isExclude == targetingConfig.isExclude;
    }

    public final MatchType getMatchType() {
        return this.matchType;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public int hashCode() {
        int iHashCode = (this.matchType.hashCode() + (this.url.hashCode() * 31)) * 31;
        boolean z4 = this.isExclude;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final boolean isExclude() {
        return this.isExclude;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("TargetingConfig(url=");
        sb4.append(this.url);
        sb4.append(", matchType=");
        sb4.append(this.matchType);
        sb4.append(", isExclude=");
        return AbstractC2875y.m8305r(sb4, this.isExclude, ')');
    }

    public TargetingConfig(String url, MatchType matchType, boolean z4) {
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(matchType, "matchType");
        this.url = url;
        this.matchType = matchType;
        this.isExclude = z4;
    }

    public /* synthetic */ TargetingConfig(String str, MatchType matchType, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, matchType, (i13 & 4) != 0 ? false : z4);
    }
}
