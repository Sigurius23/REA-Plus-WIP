package p111e8;

import android.os.Parcelable;
import androidx.health.platform.client.proto.AbstractC1433a;
import androidx.health.platform.client.proto.C1496m2;
import l83.C23470p;
import p021av.C2088b;
import p096dq.C12280x;
import p575w7.AbstractC36868a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: e8.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C12812e extends AbstractC36868a {
    public static final Parcelable.Creator<C12812e> CREATOR = new C12280x(27);

    /* JADX INFO: renamed from: E */
    public final boolean f43847E;

    /* JADX INFO: renamed from: F */
    public final C23470p f43848F;

    /* JADX INFO: renamed from: x */
    public final String f43849x;

    /* JADX INFO: renamed from: y */
    public final int f43850y;

    /* JADX INFO: renamed from: z */
    public final String f43851z;

    public C12812e(String callingPackage, int i13, String str, boolean z4) {
        AbstractC22676k.m65750j(callingPackage, "callingPackage");
        this.f43849x = callingPackage;
        this.f43850y = i13;
        this.f43851z = str;
        this.f43847E = z4;
        this.f43848F = AbstractC30060g.m92088H(new C2088b(this, 8));
    }

    @Override // p575w7.AbstractC36868a
    /* JADX INFO: renamed from: b */
    public final AbstractC1433a mo4557b() {
        Object value = this.f43848F.getValue();
        AbstractC22676k.m65749i(value, "<get-proto>(...)");
        return (C1496m2) value;
    }
}
