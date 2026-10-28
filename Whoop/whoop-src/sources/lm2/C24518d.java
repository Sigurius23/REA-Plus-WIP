package lm2;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;
import com.whoop.service.network.model.Sport;
import java.util.List;
import od1.C27843f;
import od1.C27848k;
import od1.C27856s;
import org.joda.time.DateTime;
import p92.C29019h;
import xg3.C38280g;

/* JADX INFO: renamed from: lm2.d */
/* JADX INFO: loaded from: classes10.dex */
public class C24518d implements InterfaceC24516b, Parcelable {
    public static final Parcelable.Creator<C24518d> CREATOR = new a();

    /* JADX INFO: renamed from: w */
    private final Sport f95671w;

    /* JADX INFO: renamed from: lm2.d$a */
    public class a implements Parcelable.Creator<C24518d> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C24518d createFromParcel(Parcel parcel) {
            return new C24518d((Sport) parcel.readParcelable(Sport.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C24518d[] newArray(int i13) {
            return new C24518d[i13];
        }
    }

    public C24518d(Sport sport) {
        this.f95671w = sport;
    }

    @Override // lm2.InterfaceC24516b
    /* JADX INFO: renamed from: b */
    public String mo71413b() {
        Sport sport = this.f95671w;
        return sport != null ? sport.getName() : "Workout";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return obj instanceof C24518d ? ((C24518d) obj).f95671w.equals(this.f95671w) : super.equals(obj);
    }

    @Override // lm2.InterfaceC24516b
    /* JADX INFO: renamed from: f */
    public C38280g<C27848k> mo71414f(C27843f c27843f, DateTime dateTime, DateTime dateTime2) {
        return c27843f.m83942l(this.f95671w, dateTime, dateTime2);
    }

    @Override // lm2.InterfaceC24516b
    /* JADX INFO: renamed from: h */
    public String mo71415h(Context context) {
        return C27856s.m84009h(this.f95671w) ? "other" : this.f95671w.getName();
    }

    public int hashCode() {
        return this.f95671w.hashCode();
    }

    @Override // lm2.InterfaceC24516b
    /* JADX INFO: renamed from: i */
    public void mo71416i(TextView textView) {
        textView.setText(this.f95671w.getName());
    }

    /* JADX INFO: renamed from: k */
    public Sport m71421k() {
        return this.f95671w;
    }

    /* JADX INFO: renamed from: s */
    public C38280g<C27848k> m71422s(C27843f c27843f, DateTime dateTime, DateTime dateTime2, boolean z4) {
        return c27843f.m83943n(this.f95671w, dateTime, dateTime2, z4);
    }

    public String toString() {
        return "AddableSport{sport=" + this.f95671w.getName() + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeParcelable(this.f95671w, 0);
    }

    /* JADX INFO: renamed from: x */
    public C38280g<Boolean> m71423x(C27843f c27843f, DateTime dateTime, DateTime dateTime2, List<C29019h.a> list) {
        return c27843f.m83940g(dateTime, dateTime2, list);
    }
}
