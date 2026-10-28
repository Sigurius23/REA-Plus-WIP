package kp0;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kp0.r */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\b¨\u0006\u001b"}, m65681d2 = {"Lkp0/r;", "Lkp0/o;", "Landroid/os/Parcelable;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "z", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22751r extends AbstractC22748o implements Parcelable {

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: E */
    public static final int f89485E = TextResource.$stable;
    public static final Parcelable.Creator<C22751r> CREATOR = new a();

    /* JADX INFO: renamed from: kp0.r$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Parcelable.Creator<C22751r> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22751r createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new C22751r(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C22751r[] newArray(int i13) {
            return new C22751r[i13];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22751r(String text) {
        super(null, AbstractC8693b.m21278l(text), null);
        AbstractC22676k.m65750j(text, "text");
        this.text = text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C22751r) && AbstractC22676k.m65745e(this.text, ((C22751r) other).text);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    public String toString() {
        return "Weekly Plan Hours Of Sleep";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.text);
    }
}
