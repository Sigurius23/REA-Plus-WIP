package bq0;

import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.maps.MapboxMap;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bq0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lbq0/b;", "Landroid/os/Parcelable;", "", "widgetType", MapboxMap.QFE_OFFSET, "totalCount", "", "Lbq0/c;", "dataWidgetImages", "<init>", "(IIILjava/util/List;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "I", "f", "x", "getOffset", "y", "getTotalCount", "z", "Ljava/util/List;", "b", "()Ljava/util/List;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3546b implements Parcelable {
    public static final Parcelable.Creator<C3546b> CREATOR = new a();

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int widgetType;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int offset;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int totalCount;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final List<C3547c> dataWidgetImages;

    /* JADX INFO: renamed from: bq0.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Parcelable.Creator<C3546b> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3546b createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i16);
            int iM79498b = 0;
            while (iM79498b != i16) {
                iM79498b = AbstractC26725a.m79498b(C3547c.CREATOR, parcel, arrayList, iM79498b, 1);
            }
            return new C3546b(i13, i14, i15, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3546b[] newArray(int i13) {
            return new C3546b[i13];
        }
    }

    public C3546b(int i13, int i14, int i15, List<C3547c> dataWidgetImages) {
        AbstractC22676k.m65750j(dataWidgetImages, "dataWidgetImages");
        this.widgetType = i13;
        this.offset = i14;
        this.totalCount = i15;
        this.dataWidgetImages = dataWidgetImages;
    }

    /* JADX INFO: renamed from: b */
    public final List<C3547c> m10581b() {
        return this.dataWidgetImages;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3546b)) {
            return false;
        }
        C3546b c3546b = (C3546b) other;
        return this.widgetType == c3546b.widgetType && this.offset == c3546b.offset && this.totalCount == c3546b.totalCount && AbstractC22676k.m65745e(this.dataWidgetImages, c3546b.dataWidgetImages);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getWidgetType() {
        return this.widgetType;
    }

    public int hashCode() {
        return this.dataWidgetImages.hashCode() + AbstractC11266d.m30448b(this.totalCount, AbstractC11266d.m30448b(this.offset, Integer.hashCode(this.widgetType) * 31, 31), 31);
    }

    public String toString() {
        int i13 = this.widgetType;
        int i14 = this.offset;
        int i15 = this.totalCount;
        List<C3547c> list = this.dataWidgetImages;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "DataWidget(widgetType=", ", offset=", ", totalCount=");
        sbM30465s.append(i15);
        sbM30465s.append(", dataWidgetImages=");
        sbM30465s.append(list);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.widgetType);
        dest.writeInt(this.offset);
        dest.writeInt(this.totalCount);
        Iterator itM30863o = AbstractC11478a.m30863o(this.dataWidgetImages, dest);
        while (itM30863o.hasNext()) {
            ((C3547c) itM30863o.next()).writeToParcel(dest, flags);
        }
    }
}
