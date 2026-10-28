package g40;

import com.whoop.android.R;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: g40.q2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15410q2 implements InterfaceC15421s3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57890a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f57891b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC15386l3 f57892c;

    public /* synthetic */ C15410q2(InterfaceC15386l3 interfaceC15386l3, String str, int i13) {
        this.f57890a = i13;
        this.f57892c = interfaceC15386l3;
        this.f57891b = str;
    }

    @Override // g40.InterfaceC15421s3
    /* JADX INFO: renamed from: a */
    public final boolean mo43599a() {
        switch (this.f57890a) {
            case 0:
                break;
        }
        return AbstractC39414r.m125890i0(this.f57891b);
    }

    @Override // g40.InterfaceC15421s3
    /* JADX INFO: renamed from: b */
    public final boolean mo43600b(boolean z4, boolean z13) {
        switch (this.f57890a) {
            case 0:
                return mo43602f() != null && (!z4 || z13);
            default:
                return mo43602f() != null && z13;
        }
    }

    @Override // g40.InterfaceC15421s3
    /* JADX INFO: renamed from: c */
    public final boolean mo43601c() {
        switch (this.f57890a) {
            case 0:
                return this.f57891b.length() >= ((C15415r2) this.f57892c).f57915E.f57868b;
            default:
                return false;
        }
    }

    @Override // g40.InterfaceC15421s3
    /* JADX INFO: renamed from: f */
    public final InterfaceC15361h1 mo43602f() {
        C15349f1 c15349f1;
        switch (this.f57890a) {
            case 0:
                C15415r2 c15415r2 = (C15415r2) this.f57892c;
                AbstractC15405p2 abstractC15405p2 = c15415r2.f57915E;
                String str = c15415r2.f57922y;
                String str2 = this.f57891b;
                if (!AbstractC39414r.m125890i0(str2) && !isValid() && AbstractC22676k.m65745e(str, "US")) {
                    c15349f1 = str2.length() < abstractC15405p2.f57867a ? new C15349f1(R.string.stripe_address_zip_incomplete, null) : new C15349f1(R.string.stripe_address_zip_invalid, null);
                } else if (!AbstractC39414r.m125890i0(str2) && !isValid()) {
                    c15349f1 = str2.length() < abstractC15405p2.f57867a ? new C15349f1(R.string.stripe_address_postal_code_incomplete, null) : new C15349f1(R.string.stripe_address_postal_code_invalid, null);
                } else {
                    if (str2.length() <= 0 || isValid()) {
                        return null;
                    }
                    c15349f1 = AbstractC22676k.m65745e(str, "US") ? new C15349f1(R.string.stripe_address_zip_invalid, null) : new C15349f1(R.string.stripe_address_postal_code_invalid, null);
                }
                return c15349f1;
            default:
                if (isValid()) {
                    return null;
                }
                return new C15349f1(R.string.stripe_blank_and_required, null);
        }
    }

    @Override // g40.InterfaceC15421s3
    public final boolean isValid() {
        switch (this.f57890a) {
            case 0:
                C15415r2 c15415r2 = (C15415r2) this.f57892c;
                AbstractC15405p2 abstractC15405p2 = c15415r2.f57915E;
                boolean z4 = c15415r2.f57923z;
                String str = this.f57891b;
                boolean z13 = z4 && str.length() == 0;
                if (abstractC15405p2 instanceof C15395n2) {
                    if (!z13 && AbstractC39414r.m125890i0(str)) {
                        return false;
                    }
                } else if (!z13) {
                    int i13 = abstractC15405p2.f57867a;
                    int i14 = abstractC15405p2.f57868b;
                    int length = str.length();
                    if (i13 > length || length > i14 || AbstractC39414r.m125890i0(str) || !abstractC15405p2.f57869c.m125851e(str)) {
                        return false;
                    }
                }
                return true;
            default:
                boolean z14 = ((C15339d3) this.f57892c).f57639E;
                String str2 = this.f57891b;
                return (z14 && str2.length() == 0) || !AbstractC39414r.m125890i0(str2);
        }
    }
}
