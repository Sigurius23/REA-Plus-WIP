package p197hj;

import c93.InterfaceC4339a;
import p255jk.C21743a;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: hj.o */
/* JADX INFO: loaded from: classes.dex */
public final class C17332o extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67130w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21743a f67131x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17332o(int i13, C21743a c21743a) {
        super(0);
        this.f67130w = i13;
        this.f67131x = c21743a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f67130w) {
            case 0:
                return "AmplitudeEngagement.sdk#forwardEvent(event=" + this.f67131x + ')';
            default:
                StringBuilder sb4 = new StringBuilder("AmplitudeEngagement#execute(); userId=");
                C21743a c21743a = this.f67131x;
                sb4.append(c21743a.f83629a);
                sb4.append(", eventType=");
                sb4.append(c21743a.mo61353a());
                sb4.append(", eventProperties=");
                sb4.append(c21743a.f83625N);
                return sb4.toString();
        }
    }
}
