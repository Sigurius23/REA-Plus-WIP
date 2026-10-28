package y00;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import java.util.Map;
import org.json.JSONObject;
import p474s.AbstractC32004s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.v6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38980v6 implements Parcelable {
    public static final Parcelable.Creator<C38980v6> CREATOR = new C38943r5(20);

    /* JADX INFO: renamed from: w */
    public final Object f167782w;

    public C38980v6(Map map) {
        this.f167782w = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38980v6) && this.f167782w.equals(((C38980v6) obj).f167782w);
    }

    public final int hashCode() {
        return this.f167782w.hashCode();
    }

    public final String toString() {
        return AbstractC18489d0.m53369j(this.f167782w, "ApiParams(value=", ")");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        JSONObject jSONObjectM99546o = AbstractC32004s.m99546o(this.f167782w);
        dest.writeString(jSONObjectM99546o != null ? jSONObjectM99546o.toString() : null);
    }
}
