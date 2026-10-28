package so;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: so.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C32784a extends AbstractC36219a {
    public static final Parcelable.Creator<C32784a> CREATOR = new C32786c(0);

    /* JADX INFO: renamed from: w */
    public final Intent f136462w;

    public C32784a(Intent intent) {
        this.f136462w = intent;
    }

    /* JADX INFO: renamed from: b */
    public final String m102843b() {
        Intent intent = this.f136462w;
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    /* JADX INFO: renamed from: f */
    public final Integer m102844f() {
        Intent intent = this.f136462w;
        if (intent.hasExtra("google.product_id")) {
            return Integer.valueOf(intent.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 1, this.f136462w, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
