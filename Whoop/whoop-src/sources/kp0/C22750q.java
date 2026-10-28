package kp0;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qe2.AbstractC30314g;

/* JADX INFO: renamed from: kp0.q */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lkp0/q;", "Lkp0/o;", "Landroid/os/Parcelable;", "", "value", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "z", "I", "f", "()Ljava/lang/Integer;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22750q extends AbstractC22748o implements Parcelable {

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: E */
    public static final int f89483E = TextResource.$stable;
    public static final Parcelable.Creator<C22750q> CREATOR = new a();

    /* JADX INFO: renamed from: kp0.q$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Parcelable.Creator<C22750q> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22750q createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new C22750q(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C22750q[] newArray(int i13) {
            return new C22750q[i13];
        }
    }

    public C22750q(int i13) {
        super(Integer.valueOf(i13), new TextResource.C8688b(AbstractC30314g.f124235B, null, 2, null), null);
        this.value = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C22750q) && this.value == ((C22750q) other).value;
    }

    @Override // kp0.AbstractC22748o
    /* JADX INFO: renamed from: f */
    public Integer getValue() {
        return Integer.valueOf(this.value);
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    public String toString() {
        return "Weekly Plan";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.value);
    }
}
