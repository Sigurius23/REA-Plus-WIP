package io.getstream.android.video.generated.models;

import java.util.List;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/android/video/generated/models/Credentials;", "", "token", "", "iceServers", "", "Lio/getstream/android/video/generated/models/ICEServer;", "server", "Lio/getstream/android/video/generated/models/SFUResponse;", "(Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/SFUResponse;)V", "getIceServers", "()Ljava/util/List;", "getServer", "()Lio/getstream/android/video/generated/models/SFUResponse;", "getToken", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class Credentials {
    private final List<ICEServer> iceServers;
    private final SFUResponse server;
    private final String token;

    public Credentials(@InterfaceC30731q(name = "token") String token, @InterfaceC30731q(name = "ice_servers") List<ICEServer> iceServers, @InterfaceC30731q(name = "server") SFUResponse server) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(iceServers, "iceServers");
        AbstractC22676k.m65750j(server, "server");
        this.token = token;
        this.iceServers = iceServers;
        this.server = server;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Credentials copy$default(Credentials credentials, String str, List list, SFUResponse sFUResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = credentials.token;
        }
        if ((i13 & 2) != 0) {
            list = credentials.iceServers;
        }
        if ((i13 & 4) != 0) {
            sFUResponse = credentials.server;
        }
        return credentials.copy(str, list, sFUResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final List<ICEServer> component2() {
        return this.iceServers;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SFUResponse getServer() {
        return this.server;
    }

    public final Credentials copy(@InterfaceC30731q(name = "token") String token, @InterfaceC30731q(name = "ice_servers") List<ICEServer> iceServers, @InterfaceC30731q(name = "server") SFUResponse server) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(iceServers, "iceServers");
        AbstractC22676k.m65750j(server, "server");
        return new Credentials(token, iceServers, server);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Credentials)) {
            return false;
        }
        Credentials credentials = (Credentials) other;
        return AbstractC22676k.m65745e(this.token, credentials.token) && AbstractC22676k.m65745e(this.iceServers, credentials.iceServers) && AbstractC22676k.m65745e(this.server, credentials.server);
    }

    public final List<ICEServer> getIceServers() {
        return this.iceServers;
    }

    public final SFUResponse getServer() {
        return this.server;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.server.hashCode() + AbstractC11895b.m31983b(this.token.hashCode() * 31, 31, this.iceServers);
    }

    public String toString() {
        String str = this.token;
        List<ICEServer> list = this.iceServers;
        SFUResponse sFUResponse = this.server;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("Credentials(token=", str, ", iceServers=", ", server=", list);
        sbM94766o.append(sFUResponse);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public /* synthetic */ Credentials(String str, List list, SFUResponse sFUResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25271y.f99162w : list, sFUResponse);
    }
}
