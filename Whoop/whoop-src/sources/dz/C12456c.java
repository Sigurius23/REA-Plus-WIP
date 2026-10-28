package dz;

import java.util.Map;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import v30.InterfaceC35592a;
import y00.EnumC38853i;

/* JADX INFO: renamed from: dz.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C12456c extends AbstractC12462i implements InterfaceC35592a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42526w;

    /* JADX INFO: renamed from: x */
    public final Map f42527x;

    public C12456c(int i13) {
        this.f42526w = i13;
        switch (i13) {
            case 2:
                this.f42527x = AbstractC31061c.m95645u("implementation", "google_pay");
                break;
            default:
                this.f42527x = AbstractC31061c.m95645u("implementation", "google_pay");
                break;
        }
    }

    @Override // dz.AbstractC12462i
    /* JADX INFO: renamed from: a */
    public final Map mo35094a() {
        switch (this.f42526w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f42527x;
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        switch (this.f42526w) {
            case 0:
                return "cs_disallowed_card_brand";
            case 1:
                return "cs_cardscan_api_check_succeeded";
            case 2:
                return "cs_cardscan_scan_started";
            default:
                return "cs_load_failed";
        }
    }

    public C12456c(Throwable th3) {
        this.f42526w = 3;
        this.f42527x = AbstractC31061c.m95645u("error_message", th3.getMessage());
    }

    public C12456c(EnumC38853i cardBrand) {
        this.f42526w = 0;
        AbstractC22676k.m65750j(cardBrand, "cardBrand");
        this.f42527x = AbstractC31061c.m95645u("brand", cardBrand.f167260w);
    }
}
