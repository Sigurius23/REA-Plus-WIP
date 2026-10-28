package p575w7;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.AbstractC1433a;
import l83.C23470p;
import p320m5.C25067k;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: w7.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC36868a implements Parcelable {

    /* JADX INFO: renamed from: w */
    public final C23470p f157706w = AbstractC30060g.m92088H(new C25067k(this, 12));

    /* JADX INFO: renamed from: b */
    public abstract AbstractC1433a mo4557b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        Object value = this.f157706w.getValue();
        AbstractC22676k.m65749i(value, "<get-bytes>(...)");
        return (((byte[]) value).length <= 16384 ? 1 : 0) ^ 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return AbstractC22676k.m65745e(mo4557b(), ((AbstractC36868a) obj).mo4557b());
    }

    public final int hashCode() {
        return mo4557b().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C23470p c23470p = this.f157706w;
        Object value = c23470p.getValue();
        AbstractC22676k.m65749i(value, "<get-bytes>(...)");
        if (((byte[]) value).length <= 16384) {
            dest.writeInt(0);
            Object value2 = c23470p.getValue();
            AbstractC22676k.m65749i(value2, "<get-bytes>(...)");
            dest.writeByteArray((byte[]) value2);
            return;
        }
        dest.writeInt(1);
        Object value3 = c23470p.getValue();
        AbstractC22676k.m65749i(value3, "<get-bytes>(...)");
        C36869b.f157707a.m118256b("ProtoParcelable", (byte[]) value3, dest, i13);
    }
}
