package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import java.util.List;
import m83.C25271y;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/android/video/generated/models/WSAuthMessage;", "", "token", "", "userDetails", "Lio/getstream/android/video/generated/models/ConnectUserDetailsRequest;", "products", "", "(Ljava/lang/String;Lio/getstream/android/video/generated/models/ConnectUserDetailsRequest;Ljava/util/List;)V", "getProducts", "()Ljava/util/List;", "getToken", "()Ljava/lang/String;", "getUserDetails", "()Lio/getstream/android/video/generated/models/ConnectUserDetailsRequest;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class WSAuthMessage {
    private final List<String> products;
    private final String token;
    private final ConnectUserDetailsRequest userDetails;

    public WSAuthMessage(@InterfaceC30731q(name = "token") String token, @InterfaceC30731q(name = "user_details") ConnectUserDetailsRequest userDetails, @InterfaceC30731q(name = "products") List<String> list) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(userDetails, "userDetails");
        this.token = token;
        this.userDetails = userDetails;
        this.products = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WSAuthMessage copy$default(WSAuthMessage wSAuthMessage, String str, ConnectUserDetailsRequest connectUserDetailsRequest, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = wSAuthMessage.token;
        }
        if ((i13 & 2) != 0) {
            connectUserDetailsRequest = wSAuthMessage.userDetails;
        }
        if ((i13 & 4) != 0) {
            list = wSAuthMessage.products;
        }
        return wSAuthMessage.copy(str, connectUserDetailsRequest, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConnectUserDetailsRequest getUserDetails() {
        return this.userDetails;
    }

    public final List<String> component3() {
        return this.products;
    }

    public final WSAuthMessage copy(@InterfaceC30731q(name = "token") String token, @InterfaceC30731q(name = "user_details") ConnectUserDetailsRequest userDetails, @InterfaceC30731q(name = "products") List<String> products) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(userDetails, "userDetails");
        return new WSAuthMessage(token, userDetails, products);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WSAuthMessage)) {
            return false;
        }
        WSAuthMessage wSAuthMessage = (WSAuthMessage) other;
        return AbstractC22676k.m65745e(this.token, wSAuthMessage.token) && AbstractC22676k.m65745e(this.userDetails, wSAuthMessage.userDetails) && AbstractC22676k.m65745e(this.products, wSAuthMessage.products);
    }

    public final List<String> getProducts() {
        return this.products;
    }

    public final String getToken() {
        return this.token;
    }

    public final ConnectUserDetailsRequest getUserDetails() {
        return this.userDetails;
    }

    public int hashCode() {
        int iHashCode = (this.userDetails.hashCode() + (this.token.hashCode() * 31)) * 31;
        List<String> list = this.products;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        String str = this.token;
        ConnectUserDetailsRequest connectUserDetailsRequest = this.userDetails;
        List<String> list = this.products;
        StringBuilder sb4 = new StringBuilder("WSAuthMessage(token=");
        sb4.append(str);
        sb4.append(", userDetails=");
        sb4.append(connectUserDetailsRequest);
        sb4.append(", products=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public /* synthetic */ WSAuthMessage(String str, ConnectUserDetailsRequest connectUserDetailsRequest, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, connectUserDetailsRequest, (i13 & 4) != 0 ? C25271y.f99162w : list);
    }
}
