package kp0;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qe2.AbstractC30314g;

/* JADX INFO: renamed from: kp0.m */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lkp0/m;", "Lkp0/o;", "Landroid/os/Parcelable;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22746m extends AbstractC22748o implements Parcelable {

    /* JADX INFO: renamed from: z */
    public static final C22746m f89477z = new C22746m();

    /* JADX INFO: renamed from: E */
    public static final int f89476E = TextResource.$stable;
    public static final Parcelable.Creator<C22746m> CREATOR = new a();

    /* JADX INFO: renamed from: kp0.m$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Parcelable.Creator<C22746m> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22746m createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            parcel.readInt();
            return C22746m.f89477z;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C22746m[] newArray(int i13) {
            return new C22746m[i13];
        }
    }

    private C22746m() {
        super(85, new TextResource.C8688b(AbstractC30314g.f124232A, null, 2, null), null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        return "Perform";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
