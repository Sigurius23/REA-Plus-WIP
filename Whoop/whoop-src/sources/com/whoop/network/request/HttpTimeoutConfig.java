package com.whoop.network.request;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.ChatClient;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yb0.AbstractC39383f;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0017¨\u0006,"}, m65681d2 = {"Lcom/whoop/network/request/HttpTimeoutConfig;", "", "", "connectTimeoutMillis", "socketTimeoutMillis", "requestTimeoutMillis", "<init>", "(JJJ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJJJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$network_release", "(Lcom/whoop/network/request/HttpTimeoutConfig;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()J", "component2", "component3", "copy", "(JJJ)Lcom/whoop/network/request/HttpTimeoutConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getConnectTimeoutMillis", "getSocketTimeoutMillis", "getRequestTimeoutMillis", "Companion", "$serializer", "a", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HttpTimeoutConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long connectTimeoutMillis;
    private final long requestTimeoutMillis;
    private final long socketTimeoutMillis;

    /* JADX INFO: renamed from: com.whoop.network.request.HttpTimeoutConfig$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/network/request/HttpTimeoutConfig$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/network/request/HttpTimeoutConfig;", "serializer", "()Lwc3/c;", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HttpTimeoutConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public HttpTimeoutConfig() {
        this(0L, 0L, 0L, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ HttpTimeoutConfig copy$default(HttpTimeoutConfig httpTimeoutConfig, long j7, long j13, long j14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = httpTimeoutConfig.connectTimeoutMillis;
        }
        long j15 = j7;
        if ((i13 & 2) != 0) {
            j13 = httpTimeoutConfig.socketTimeoutMillis;
        }
        long j16 = j13;
        if ((i13 & 4) != 0) {
            j14 = httpTimeoutConfig.requestTimeoutMillis;
        }
        return httpTimeoutConfig.copy(j15, j16, j14);
    }

    public static final /* synthetic */ void write$Self$network_release(HttpTimeoutConfig self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.connectTimeoutMillis != ChatClient.RESOLVE_DEPENDENCY_TIMEOUT) {
            output.encodeLongElement(serialDesc, 0, self.connectTimeoutMillis);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.socketTimeoutMillis != ChatClient.RESOLVE_DEPENDENCY_TIMEOUT) {
            output.encodeLongElement(serialDesc, 1, self.socketTimeoutMillis);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.requestTimeoutMillis == 0) {
            return;
        }
        output.encodeLongElement(serialDesc, 2, self.requestTimeoutMillis);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSocketTimeoutMillis() {
        return this.socketTimeoutMillis;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRequestTimeoutMillis() {
        return this.requestTimeoutMillis;
    }

    public final HttpTimeoutConfig copy(long connectTimeoutMillis, long socketTimeoutMillis, long requestTimeoutMillis) {
        return new HttpTimeoutConfig(connectTimeoutMillis, socketTimeoutMillis, requestTimeoutMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpTimeoutConfig)) {
            return false;
        }
        HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) other;
        return this.connectTimeoutMillis == httpTimeoutConfig.connectTimeoutMillis && this.socketTimeoutMillis == httpTimeoutConfig.socketTimeoutMillis && this.requestTimeoutMillis == httpTimeoutConfig.requestTimeoutMillis;
    }

    public final long getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final long getRequestTimeoutMillis() {
        return this.requestTimeoutMillis;
    }

    public final long getSocketTimeoutMillis() {
        return this.socketTimeoutMillis;
    }

    public int hashCode() {
        return Long.hashCode(this.requestTimeoutMillis) + AbstractC11266d.m30451e(Long.hashCode(this.connectTimeoutMillis) * 31, this.socketTimeoutMillis, 31);
    }

    public String toString() {
        long j7 = this.connectTimeoutMillis;
        long j13 = this.socketTimeoutMillis;
        long j14 = this.requestTimeoutMillis;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "HttpTimeoutConfig(connectTimeoutMillis=", ", socketTimeoutMillis=");
        sbM125596b.append(j13);
        sbM125596b.append(", requestTimeoutMillis=");
        sbM125596b.append(j14);
        sbM125596b.append(")");
        return sbM125596b.toString();
    }

    public /* synthetic */ HttpTimeoutConfig(int i13, long j7, long j13, long j14, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.connectTimeoutMillis = ChatClient.RESOLVE_DEPENDENCY_TIMEOUT;
        } else {
            this.connectTimeoutMillis = j7;
        }
        if ((i13 & 2) == 0) {
            this.socketTimeoutMillis = ChatClient.RESOLVE_DEPENDENCY_TIMEOUT;
        } else {
            this.socketTimeoutMillis = j13;
        }
        if ((i13 & 4) == 0) {
            this.requestTimeoutMillis = 0L;
        } else {
            this.requestTimeoutMillis = j14;
        }
    }

    public HttpTimeoutConfig(long j7, long j13, long j14) {
        this.connectTimeoutMillis = j7;
        this.socketTimeoutMillis = j13;
        this.requestTimeoutMillis = j14;
    }

    public /* synthetic */ HttpTimeoutConfig(long j7, long j13, long j14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 10000L : j7, (i13 & 2) != 0 ? 10000L : j13, (i13 & 4) != 0 ? 0L : j14);
    }
}
