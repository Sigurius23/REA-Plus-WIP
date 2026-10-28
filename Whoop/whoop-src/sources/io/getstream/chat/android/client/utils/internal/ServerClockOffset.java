package io.getstream.chat.android.client.utils.internal;

import c93.InterfaceC4339a;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import j02.C21174w;
import java.util.Date;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0016\u0010 \u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001c¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;", "", "Lkotlin/Function0;", "", "localTimeMs", "maxRttMs", "maxOffsetMs", "<init>", "(Lc93/a;JJ)V", "candidate", "Ll83/a0;", "acceptOffset", "(J)V", "onConnectionStarted$stream_chat_android_client_release", "()V", "onConnectionStarted", "onHealthCheckSent$stream_chat_android_client_release", "onHealthCheckSent", "Ljava/util/Date;", "serverTime", "onConnected$stream_chat_android_client_release", "(Ljava/util/Date;)V", "onConnected", "onHealthCheck$stream_chat_android_client_release", "onHealthCheck", "estimatedServerTime", "()Ljava/util/Date;", "Lc93/a;", "J", "lock", "Ljava/lang/Object;", "offsetMs", "bestRttMs", "healthCheckSentAtMs", "connectionStartedAtMs", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ServerClockOffset {
    public static final long DEFAULT_MAX_OFFSET_MS = 3600000;
    public static final long DEFAULT_MAX_RTT_MS = 11000;
    private volatile long bestRttMs;
    private volatile long connectionStartedAtMs;
    private volatile long healthCheckSentAtMs;
    private final InterfaceC4339a localTimeMs;
    private final Object lock;
    private final long maxOffsetMs;
    private final long maxRttMs;
    private volatile long offsetMs;

    public ServerClockOffset() {
        this(null, 0L, 0L, 7, null);
    }

    private final void acceptOffset(long candidate) {
        if (Math.abs(candidate) <= this.maxOffsetMs) {
            this.offsetMs = candidate;
        }
    }

    @InternalStreamChatApi
    public final Date estimatedServerTime() {
        return new Date(((Number) this.localTimeMs.invoke()).longValue() - this.offsetMs);
    }

    public final void onConnected$stream_chat_android_client_release(Date serverTime) {
        AbstractC22676k.m65750j(serverTime, "serverTime");
        synchronized (this.lock) {
            this.bestRttMs = Long.MAX_VALUE;
            this.healthCheckSentAtMs = 0L;
            this.offsetMs = 0L;
            long jLongValue = ((Number) this.localTimeMs.invoke()).longValue();
            long j7 = this.connectionStartedAtMs;
            this.connectionStartedAtMs = 0L;
            if (j7 > 0) {
                long j13 = jLongValue - j7;
                if (1 <= j13 && j13 <= this.maxRttMs) {
                    acceptOffset(((j7 + jLongValue) / ((long) 2)) - serverTime.getTime());
                    this.bestRttMs = j13;
                    return;
                }
            }
            acceptOffset(jLongValue - serverTime.getTime());
        }
    }

    public final void onConnectionStarted$stream_chat_android_client_release() {
        this.connectionStartedAtMs = ((Number) this.localTimeMs.invoke()).longValue();
    }

    public final void onHealthCheck$stream_chat_android_client_release(Date serverTime) {
        AbstractC22676k.m65750j(serverTime, "serverTime");
        synchronized (this.lock) {
            long j7 = this.healthCheckSentAtMs;
            if (j7 <= 0) {
                return;
            }
            this.healthCheckSentAtMs = 0L;
            long jLongValue = ((Number) this.localTimeMs.invoke()).longValue();
            long j13 = jLongValue - j7;
            if (1 > j13 || j13 > this.maxRttMs) {
                return;
            }
            if (j13 < this.bestRttMs) {
                this.bestRttMs = j13;
                acceptOffset(((j7 + jLongValue) / ((long) 2)) - serverTime.getTime());
            }
        }
    }

    public final void onHealthCheckSent$stream_chat_android_client_release() {
        this.healthCheckSentAtMs = ((Number) this.localTimeMs.invoke()).longValue();
    }

    public ServerClockOffset(InterfaceC4339a localTimeMs, long j7, long j13) {
        AbstractC22676k.m65750j(localTimeMs, "localTimeMs");
        this.localTimeMs = localTimeMs;
        this.maxRttMs = j7;
        this.maxOffsetMs = j13;
        this.lock = new Object();
        this.bestRttMs = Long.MAX_VALUE;
    }

    public /* synthetic */ ServerClockOffset(InterfaceC4339a interfaceC4339a, long j7, long j13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21174w(25) : interfaceC4339a, (i13 & 2) != 0 ? DEFAULT_MAX_RTT_MS : j7, (i13 & 4) != 0 ? 3600000L : j13);
    }
}
