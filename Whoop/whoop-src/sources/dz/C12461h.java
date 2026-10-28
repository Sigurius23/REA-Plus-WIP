package dz;

import java.util.Map;
import m83.C25272z;
import p031b9.AbstractC2875y;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: dz.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C12461h extends AbstractC12462i {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42534w;

    /* JADX INFO: renamed from: x */
    public final String f42535x;

    public C12461h(EnumC12464k enumC12464k, int i13) {
        String str;
        this.f42534w = i13;
        switch (i13) {
            case 1:
                int iOrdinal = enumC12464k.ordinal();
                if (iOrdinal == 0) {
                    str = "cs_add_payment_method_screen_presented";
                } else if (iOrdinal == 1) {
                    str = "cs_select_payment_method_screen_presented";
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "cs_open_edit_screen";
                }
                this.f42535x = str;
                return;
            default:
                if (AbstractC12460g.f42533a[enumC12464k.ordinal()] != 1) {
                    throw new IllegalArgumentException(AbstractC2875y.m8299l(enumC12464k.name(), " has no supported event for hiding screen!"));
                }
                this.f42535x = "cs_cancel_edit_screen";
                return;
        }
    }

    @Override // dz.AbstractC12462i
    /* JADX INFO: renamed from: a */
    public final Map mo35094a() {
        switch (this.f42534w) {
            case 0:
                break;
        }
        return C25272z.f99163w;
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        switch (this.f42534w) {
            case 0:
                break;
        }
        return this.f42535x;
    }
}
