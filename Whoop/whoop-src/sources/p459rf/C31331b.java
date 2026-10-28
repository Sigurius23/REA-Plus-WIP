package p459rf;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: rf.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C31331b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128925w;

    @Override // c93.InterfaceC4339a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f128925w) {
            case 0:
                return "cache conditional hit";
            case 1:
                return "cache hit";
            case 2:
                return "cache miss";
            case 3:
                return "call complete";
            case 4:
                return "call failed";
            case 5:
                return "call started";
            case 6:
                return "call cancelled";
            case 7:
                return "sending request body";
            case 8:
                return "request failed";
            case 9:
                return "finished sending request headers";
            case 10:
                return "sending request headers";
            case 11:
                return "response body available";
            case 12:
                return "response failed";
            case 13:
                return "response headers start";
            case 14:
                return "cache satisfaction failure";
            default:
                return "initiating TLS connection";
        }
    }
}
