package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/android/video/generated/models/ICEServer;", "", "password", "", "username", "urls", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getPassword", "()Ljava/lang/String;", "getUrls", "()Ljava/util/List;", "getUsername", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ICEServer {
    private final String password;
    private final List<String> urls;
    private final String username;

    public ICEServer(@InterfaceC30731q(name = "password") String password, @InterfaceC30731q(name = "username") String username, @InterfaceC30731q(name = "urls") List<String> urls) {
        AbstractC22676k.m65750j(password, "password");
        AbstractC22676k.m65750j(username, "username");
        AbstractC22676k.m65750j(urls, "urls");
        this.password = password;
        this.username = username;
        this.urls = urls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ICEServer copy$default(ICEServer iCEServer, String str, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = iCEServer.password;
        }
        if ((i13 & 2) != 0) {
            str2 = iCEServer.username;
        }
        if ((i13 & 4) != 0) {
            list = iCEServer.urls;
        }
        return iCEServer.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    public final List<String> component3() {
        return this.urls;
    }

    public final ICEServer copy(@InterfaceC30731q(name = "password") String password, @InterfaceC30731q(name = "username") String username, @InterfaceC30731q(name = "urls") List<String> urls) {
        AbstractC22676k.m65750j(password, "password");
        AbstractC22676k.m65750j(username, "username");
        AbstractC22676k.m65750j(urls, "urls");
        return new ICEServer(password, username, urls);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ICEServer)) {
            return false;
        }
        ICEServer iCEServer = (ICEServer) other;
        return AbstractC22676k.m65745e(this.password, iCEServer.password) && AbstractC22676k.m65745e(this.username, iCEServer.username) && AbstractC22676k.m65745e(this.urls, iCEServer.urls);
    }

    public final String getPassword() {
        return this.password;
    }

    public final List<String> getUrls() {
        return this.urls;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return this.urls.hashCode() + AbstractC11266d.m30450d(this.password.hashCode() * 31, 31, this.username);
    }

    public String toString() {
        String str = this.password;
        String str2 = this.username;
        return AbstractC3855a.m11829m(AbstractC11895b.m32001t("ICEServer(password=", str, ", username=", str2, ", urls="), this.urls, ")");
    }

    public /* synthetic */ ICEServer(String str, String str2, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? C25271y.f99162w : list);
    }
}
