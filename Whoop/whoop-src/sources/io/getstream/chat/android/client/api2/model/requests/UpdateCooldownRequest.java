package io.getstream.chat.android.client.api2.model.requests;

import java.util.Map;
import l83.C23465k;
import live.hms.video.utils.HMSFieldTrials;
import m83.AbstractC25247g0;
import nh3.AbstractC26725a;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/UpdateCooldownRequest;", "", "set", "", "", "<init>", "(Ljava/util/Map;)V", "getSet", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UpdateCooldownRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, Object> set;

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/UpdateCooldownRequest$Companion;", "", "<init>", "()V", "create", "Lio/getstream/chat/android/client/api2/model/requests/UpdateCooldownRequest;", "cooldownTimeInSeconds", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UpdateCooldownRequest create(int cooldownTimeInSeconds) {
            return new UpdateCooldownRequest(AbstractC25247g0.m73989X(new C23465k("cooldown", Integer.valueOf(cooldownTimeInSeconds))));
        }

        private Companion() {
        }
    }

    public UpdateCooldownRequest(Map<String, ? extends Object> set) {
        AbstractC22676k.m65750j(set, "set");
        this.set = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateCooldownRequest copy$default(UpdateCooldownRequest updateCooldownRequest, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = updateCooldownRequest.set;
        }
        return updateCooldownRequest.copy(map);
    }

    public final Map<String, Object> component1() {
        return this.set;
    }

    public final UpdateCooldownRequest copy(Map<String, ? extends Object> set) {
        AbstractC22676k.m65750j(set, "set");
        return new UpdateCooldownRequest(set);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpdateCooldownRequest) && AbstractC22676k.m65745e(this.set, ((UpdateCooldownRequest) other).set);
    }

    public final Map<String, Object> getSet() {
        return this.set;
    }

    public int hashCode() {
        return this.set.hashCode();
    }

    public String toString() {
        return AbstractC26725a.m79504h("UpdateCooldownRequest(set=", ")", this.set);
    }
}
