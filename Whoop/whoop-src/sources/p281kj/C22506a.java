package p281kj;

import c93.InterfaceC4339a;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: kj.a */
/* JADX INFO: loaded from: classes.dex */
public final class C22506a extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f88203w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f88204x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f88205y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22506a(String str, String str2, int i13) {
        super(0);
        this.f88203w = i13;
        this.f88204x = str;
        this.f88205y = str2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f88203w) {
            case 0:
                return "maybeBootOrReboot(); userId=" + this.f88204x + ", deviceId=" + this.f88205y;
            default:
                return "AmplitudeEngagementPlugin#setup(); currentUserId=" + this.f88204x + ", currentDeviceId=" + this.f88205y;
        }
    }
}
