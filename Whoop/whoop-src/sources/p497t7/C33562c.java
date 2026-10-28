package p497t7;

import android.os.Parcelable;
import androidx.health.platform.client.proto.AbstractC1433a;
import androidx.health.platform.client.proto.C1479j0;
import l83.C23470p;
import p320m5.C25067k;
import p486sp.C32854e;
import p575w7.AbstractC36868a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: t7.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C33562c extends AbstractC36868a {
    public static final Parcelable.Creator<C33562c> CREATOR = new C32854e(7);

    /* JADX INFO: renamed from: x */
    public final int f140040x;

    /* JADX INFO: renamed from: y */
    public final String f140041y;

    /* JADX INFO: renamed from: z */
    public final C23470p f140042z = AbstractC30060g.m92088H(new C25067k(this, 9));

    public C33562c(int i13, String str) {
        this.f140040x = i13;
        this.f140041y = str;
    }

    @Override // p575w7.AbstractC36868a
    /* JADX INFO: renamed from: b */
    public final AbstractC1433a mo4557b() {
        Object value = this.f140042z.getValue();
        AbstractC22676k.m65749i(value, "<get-proto>(...)");
        return (C1479j0) value;
    }
}
