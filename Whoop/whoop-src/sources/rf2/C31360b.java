package rf2;

import com.whoop.data.local.room.entity.SmartAlarmUserInfo;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: rf2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31360b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f129013w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31361c f129014x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ SmartAlarmUserInfo f129015y;

    public /* synthetic */ C31360b(C31361c c31361c, SmartAlarmUserInfo smartAlarmUserInfo, int i13) {
        this.f129013w = i13;
        this.f129014x = c31361c;
        this.f129015y = smartAlarmUserInfo;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f129013w) {
            case 0:
                return this.f129014x.m96456x(this.f129015y, (InterfaceC30057d) obj);
            default:
                return this.f129014x.m96455w(this.f129015y, (InterfaceC33687a) obj);
        }
    }
}
