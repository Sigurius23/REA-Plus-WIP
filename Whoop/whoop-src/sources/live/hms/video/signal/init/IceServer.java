package live.hms.video.signal.init;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J@\u0010\u0013\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R(\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/signal/init/IceServer;", "", "urls", "Lkotlin/collections/ArrayList;", "", "Ljava/util/ArrayList;", "username", "credential", "<init>", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getUrls", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "getUsername", "()Ljava/lang/String;", "getCredential", "component1", "component2", "component3", "copy", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)Llive/hms/video/signal/init/IceServer;", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class IceServer {

    @SerializedName("credential")
    private final String credential;

    @SerializedName("urls")
    private final ArrayList<String> urls;

    @SerializedName("username")
    private final String username;

    public IceServer(ArrayList<String> urls, String str, String str2) {
        AbstractC22676k.m65750j(urls, "urls");
        this.urls = urls;
        this.username = str;
        this.credential = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IceServer copy$default(IceServer iceServer, ArrayList arrayList, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            arrayList = iceServer.urls;
        }
        if ((i13 & 2) != 0) {
            str = iceServer.username;
        }
        if ((i13 & 4) != 0) {
            str2 = iceServer.credential;
        }
        return iceServer.copy(arrayList, str, str2);
    }

    public final ArrayList<String> component1() {
        return this.urls;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCredential() {
        return this.credential;
    }

    public final IceServer copy(ArrayList<String> urls, String username, String credential) {
        AbstractC22676k.m65750j(urls, "urls");
        return new IceServer(urls, username, credential);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IceServer)) {
            return false;
        }
        IceServer iceServer = (IceServer) other;
        return AbstractC22676k.m65745e(this.urls, iceServer.urls) && AbstractC22676k.m65745e(this.username, iceServer.username) && AbstractC22676k.m65745e(this.credential, iceServer.credential);
    }

    public final String getCredential() {
        return this.credential;
    }

    public final ArrayList<String> getUrls() {
        return this.urls;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int iHashCode = this.urls.hashCode() * 31;
        String str = this.username;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.credential;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("IceServer(urls=");
        sb4.append(this.urls);
        sb4.append(", username=");
        sb4.append(this.username);
        sb4.append(", credential=");
        return AbstractC25012a.m73377j(sb4, this.credential, ')');
    }

    public /* synthetic */ IceServer(ArrayList arrayList, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2);
    }
}
