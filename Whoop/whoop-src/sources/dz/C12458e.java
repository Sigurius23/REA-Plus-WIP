package dz;

import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p550vd.AbstractC35903f;
import p715kotlin.time.Duration;
import v30.InterfaceC35592a;

/* JADX INFO: renamed from: dz.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C12458e extends AbstractC12462i implements InterfaceC35592a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42529w;

    /* JADX INFO: renamed from: x */
    public final LinkedHashMap f42530x;

    public C12458e(Duration duration, int i13) {
        this.f42529w = i13;
        switch (i13) {
            case 2:
                this.f42530x = AbstractC25247g0.m73995d0(AbstractC35903f.m113985C(duration), AbstractC25247g0.m73989X(new C23465k("implementation", "google_pay")));
                break;
            default:
                this.f42530x = AbstractC25247g0.m73995d0(AbstractC35903f.m113985C(duration), AbstractC25247g0.m73989X(new C23465k("implementation", "google_pay")));
                break;
        }
    }

    @Override // dz.AbstractC12462i
    /* JADX INFO: renamed from: a */
    public final Map mo35094a() {
        switch (this.f42529w) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f42530x;
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        switch (this.f42529w) {
            case 0:
                return "cs_cardscan_cancel";
            case 1:
                return "cs_cardscan_failed";
            default:
                return "cs_cardscan_success";
        }
    }

    public C12458e(Duration duration, Throwable th3) {
        this.f42529w = 1;
        this.f42530x = AbstractC25247g0.m73995d0(AbstractC35903f.m113985C(duration), AbstractC25247g0.m73990Y(new C23465k("implementation", "google_pay"), new C23465k("error_message", th3 != null ? th3.getClass().getSimpleName() : null)));
    }
}
