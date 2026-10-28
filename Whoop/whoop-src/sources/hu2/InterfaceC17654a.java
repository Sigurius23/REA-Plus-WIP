package hu2;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.weightlifting.data.domain.StrapLaterality;
import com.whoop.weightlifting.data.domain.StrapLocation;
import com.whoop.weightlifting.feature.active.activeworkout.domain.PositionInWorkout;
import du2.EnumC12379c;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import nu2.EnumC27144a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hu2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001d\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u0082\u0001\u0002\u001f ¨\u0006!À\u0006\u0003"}, m65681d2 = {"Lhu2/a;", "", "c0", "u", "p", "o", "t", "f", "e", "b", "z", "x", "n", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "g", "d", "q", "b0", "r", "v", "s", "l", "m", "c", "y", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a0", "k", "j", "a", "i", "Lhu2/a$k;", "Lhu2/a$c0;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC17654a {

    /* JADX INFO: renamed from: hu2.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhu2/a$a;", "Lhu2/a$k;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements k {

        /* JADX INFO: renamed from: w */
        public static final a f68459w = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: hu2.a$a0 */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, m65681d2 = {"Lhu2/a$a0;", "Lhu2/a$c0;", "", "rpe", "<init>", "(I)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "I", "b", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a0 implements c0 {
        public static final Parcelable.Creator<a0> CREATOR = new a();

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final int rpe;

        /* JADX INFO: renamed from: hu2.a$a0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<a0> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a0 createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                return new a0(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a0[] newArray(int i13) {
                return new a0[i13];
            }
        }

        public a0(int i13) {
            this.rpe = i13;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getRpe() {
            return this.rpe;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a0) && this.rpe == ((a0) other).rpe;
        }

        public int hashCode() {
            return Integer.hashCode(this.rpe);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.rpe, "UpdateRpeValue(rpe=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeInt(this.rpe);
        }
    }

    /* JADX INFO: renamed from: hu2.a$b */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lhu2/a$b;", "Lhu2/a$c0;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements c0 {

        /* JADX INFO: renamed from: w */
        public static final b f68461w = new b();
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: hu2.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return b.f68461w;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i13) {
                return new b[i13];
            }
        }

        private b() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: hu2.a$b0 */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lhu2/a$b0;", "Lhu2/a$c0;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 implements c0 {

        /* JADX INFO: renamed from: w */
        public static final b0 f68462w = new b0();
        public static final Parcelable.Creator<b0> CREATOR = new a();

        /* JADX INFO: renamed from: hu2.a$b0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<b0> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b0 createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return b0.f68462w;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b0[] newArray(int i13) {
                return new b0[i13];
            }
        }

        private b0() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: hu2.a$c */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lhu2/a$c;", "Lhu2/a$c0;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements c0 {

        /* JADX INFO: renamed from: w */
        public static final c f68463w = new c();
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: hu2.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return c.f68463w;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i13) {
                return new c[i13];
            }
        }

        private c() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: hu2.a$c0 */
    @Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0019\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001cÀ\u0006\u0003"}, m65681d2 = {"Lhu2/a$c0;", "Lhu2/a;", "Landroid/os/Parcelable;", "Lhu2/a$b;", "Lhu2/a$c;", "Lhu2/a$d;", "Lhu2/a$e;", "Lhu2/a$f;", "Lhu2/a$g;", "Lhu2/a$h;", "Lhu2/a$l;", "Lhu2/a$m;", "Lhu2/a$n;", "Lhu2/a$o;", "Lhu2/a$p;", "Lhu2/a$q;", "Lhu2/a$r;", "Lhu2/a$s;", "Lhu2/a$t;", "Lhu2/a$u;", "Lhu2/a$v;", "Lhu2/a$w;", "Lhu2/a$x;", "Lhu2/a$y;", "Lhu2/a$z;", "Lhu2/a$a0;", "Lhu2/a$b0;", "Lhu2/m;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface c0 extends InterfaceC17654a, Parcelable {
    }

    /* JADX INFO: renamed from: hu2.a$d */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lhu2/a$d;", "Lhu2/a$c0;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements c0 {

        /* JADX INFO: renamed from: w */
        public static final d f68464w = new d();
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: hu2.a$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return d.f68464w;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i13) {
                return new d[i13];
            }
        }

        private d() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: hu2.a$e */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lhu2/a$e;", "Lhu2/a$c0;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements c0 {

        /* JADX INFO: renamed from: w */
        public static final e f68465w = new e();
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: hu2.a$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return e.f68465w;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i13) {
                return new e[i13];
            }
        }

        private e() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: hu2.a$g */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lhu2/a$g;", "Lhu2/a$c0;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements c0 {

        /* JADX INFO: renamed from: w */
        public static final g f68467w = new g();
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: hu2.a$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return g.f68467w;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i13) {
                return new g[i13];
            }
        }

        private g() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: hu2.a$h */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lhu2/a$h;", "Lhu2/a$c0;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements c0 {

        /* JADX INFO: renamed from: w */
        public static final h f68468w = new h();
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: hu2.a$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return h.f68468w;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i13) {
                return new h[i13];
            }
        }

        private h() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: hu2.a$i */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lhu2/a$i;", "Lhu2/a$k;", "", "exerciseId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements k {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final String exerciseId;

        public i(String exerciseId) {
            AbstractC22676k.m65750j(exerciseId, "exerciseId");
            this.exerciseId = exerciseId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getExerciseId() {
            return this.exerciseId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && AbstractC22676k.m65745e(this.exerciseId, ((i) other).exerciseId);
        }

        public int hashCode() {
            return this.exerciseId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ExerciseDetails(exerciseId=", this.exerciseId, ")");
        }
    }

    /* JADX INFO: renamed from: hu2.a$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhu2/a$j;", "Lhu2/a$k;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements k {

        /* JADX INFO: renamed from: w */
        public static final j f68470w = new j();

        private j() {
        }
    }

    /* JADX INFO: renamed from: hu2.a$k */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lhu2/a$k;", "Lhu2/a;", "Lhu2/a$a;", "Lhu2/a$i;", "Lhu2/a$j;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface k extends InterfaceC17654a {
    }

    /* JADX INFO: renamed from: hu2.a$l */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\b¨\u0006\u001d"}, m65681d2 = {"Lhu2/a$l;", "Lhu2/a$c0;", "", "groupIndex", "exerciseIndex", "<init>", "(II)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "I", "f", "x", "b", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l implements c0 {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final int groupIndex;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final int exerciseIndex;

        /* JADX INFO: renamed from: hu2.a$l$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                return new l(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final l[] newArray(int i13) {
                return new l[i13];
            }
        }

        public l(int i13, int i14) {
            this.groupIndex = i13;
            this.exerciseIndex = i14;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getExerciseIndex() {
            return this.exerciseIndex;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return this.groupIndex == lVar.groupIndex && this.exerciseIndex == lVar.exerciseIndex;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getGroupIndex() {
            return this.groupIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.exerciseIndex) + (Integer.hashCode(this.groupIndex) * 31);
        }

        public String toString() {
            return AbstractC25012a.m73372e(this.groupIndex, this.exerciseIndex, "OpenDeleteExerciseDialog(groupIndex=", ", exerciseIndex=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeInt(this.groupIndex);
            dest.writeInt(this.exerciseIndex);
        }
    }

    /* JADX INFO: renamed from: hu2.a$m */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lhu2/a$m;", "Lhu2/a$c0;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements c0 {

        /* JADX INFO: renamed from: w */
        public static final m f68473w = new m();
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* JADX INFO: renamed from: hu2.a$m$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<m> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return m.f68473w;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final m[] newArray(int i13) {
                return new m[i13];
            }
        }

        private m() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: hu2.a$n */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lhu2/a$n;", "Lhu2/a$c0;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "undoSetPosition", "<init>", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "b", "()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n implements c0 {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final PositionInWorkout undoSetPosition;

        /* JADX INFO: renamed from: hu2.a$n$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<n> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                return new n(PositionInWorkout.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final n[] newArray(int i13) {
                return new n[i13];
            }
        }

        public n(PositionInWorkout undoSetPosition) {
            AbstractC22676k.m65750j(undoSetPosition, "undoSetPosition");
            this.undoSetPosition = undoSetPosition;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final PositionInWorkout getUndoSetPosition() {
            return this.undoSetPosition;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n) && AbstractC22676k.m65745e(this.undoSetPosition, ((n) other).undoSetPosition);
        }

        public int hashCode() {
            return this.undoSetPosition.hashCode();
        }

        public String toString() {
            return "OpenUndoSetConfirmDialog(undoSetPosition=" + this.undoSetPosition + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            this.undoSetPosition.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: hu2.a$o */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lhu2/a$o;", "Lhu2/a$c0;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements c0 {

        /* JADX INFO: renamed from: w */
        public static final o f68475w = new o();
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* JADX INFO: renamed from: hu2.a$o$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<o> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return o.f68475w;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final o[] newArray(int i13) {
                return new o[i13];
            }
        }

        private o() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: hu2.a$p */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lhu2/a$p;", "Lhu2/a$c0;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements c0 {

        /* JADX INFO: renamed from: w */
        public static final p f68476w = new p();
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* JADX INFO: renamed from: hu2.a$p$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<p> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return p.f68476w;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final p[] newArray(int i13) {
                return new p[i13];
            }
        }

        private p() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: hu2.a$q */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lhu2/a$q;", "Lhu2/a$c0;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements c0 {

        /* JADX INFO: renamed from: w */
        public static final q f68477w = new q();
        public static final Parcelable.Creator<q> CREATOR = new a();

        /* JADX INFO: renamed from: hu2.a$q$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<q> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final q createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return q.f68477w;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final q[] newArray(int i13) {
                return new q[i13];
            }
        }

        private q() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: hu2.a$r */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lhu2/a$r;", "Lhu2/a$c0;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements c0 {

        /* JADX INFO: renamed from: w */
        public static final r f68478w = new r();
        public static final Parcelable.Creator<r> CREATOR = new a();

        /* JADX INFO: renamed from: hu2.a$r$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<r> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return r.f68478w;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final r[] newArray(int i13) {
                return new r[i13];
            }
        }

        private r() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: hu2.a$s */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lhu2/a$s;", "Lhu2/a$c0;", "Lnu2/a;", "asyncProcess", "<init>", "(Lnu2/a;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lnu2/a;", "b", "()Lnu2/a;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s implements c0 {
        public static final Parcelable.Creator<s> CREATOR = new a();

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final EnumC27144a asyncProcess;

        /* JADX INFO: renamed from: hu2.a$s$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<s> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final s createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                return new s(EnumC27144a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final s[] newArray(int i13) {
                return new s[i13];
            }
        }

        public s(EnumC27144a asyncProcess) {
            AbstractC22676k.m65750j(asyncProcess, "asyncProcess");
            this.asyncProcess = asyncProcess;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC27144a getAsyncProcess() {
            return this.asyncProcess;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof s) && this.asyncProcess == ((s) other).asyncProcess;
        }

        public int hashCode() {
            return this.asyncProcess.hashCode();
        }

        public String toString() {
            return "StartAsyncProcess(asyncProcess=" + this.asyncProcess + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeString(this.asyncProcess.name());
        }
    }

    /* JADX INFO: renamed from: hu2.a$u */
    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lhu2/a$u;", "Lhu2/a$c0;", "Lcom/whoop/weightlifting/data/domain/StrapLocation;", "strapLocation", "Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "strapLaterality", "", "isQuickStart", "<init>", "(Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/weightlifting/data/domain/StrapLocation;", "f", "()Lcom/whoop/weightlifting/data/domain/StrapLocation;", "x", "Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "b", "()Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "y", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class u implements c0 {
        public static final Parcelable.Creator<u> CREATOR = new a();

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final StrapLocation strapLocation;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final StrapLaterality strapLaterality;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private final boolean isQuickStart;

        /* JADX INFO: renamed from: hu2.a$u$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<u> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final u createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                return new u(StrapLocation.valueOf(parcel.readString()), StrapLaterality.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final u[] newArray(int i13) {
                return new u[i13];
            }
        }

        public u(StrapLocation strapLocation, StrapLaterality strapLaterality, boolean z4) {
            AbstractC22676k.m65750j(strapLocation, "strapLocation");
            AbstractC22676k.m65750j(strapLaterality, "strapLaterality");
            this.strapLocation = strapLocation;
            this.strapLaterality = strapLaterality;
            this.isQuickStart = z4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final StrapLaterality getStrapLaterality() {
            return this.strapLaterality;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof u)) {
                return false;
            }
            u uVar = (u) other;
            return this.strapLocation == uVar.strapLocation && this.strapLaterality == uVar.strapLaterality && this.isQuickStart == uVar.isQuickStart;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final StrapLocation getStrapLocation() {
            return this.strapLocation;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsQuickStart() {
            return this.isQuickStart;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isQuickStart) + ((this.strapLaterality.hashCode() + (this.strapLocation.hashCode() * 31)) * 31);
        }

        public String toString() {
            StrapLocation strapLocation = this.strapLocation;
            StrapLaterality strapLaterality = this.strapLaterality;
            boolean z4 = this.isQuickStart;
            StringBuilder sb4 = new StringBuilder("StartWorkout(strapLocation=");
            sb4.append(strapLocation);
            sb4.append(", strapLaterality=");
            sb4.append(strapLaterality);
            sb4.append(", isQuickStart=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeString(this.strapLocation.name());
            dest.writeString(this.strapLaterality.name());
            dest.writeInt(this.isQuickStart ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: hu2.a$v */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lhu2/a$v;", "Lhu2/a$c0;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements c0 {

        /* JADX INFO: renamed from: w */
        public static final v f68485w = new v();
        public static final Parcelable.Creator<v> CREATOR = new a();

        /* JADX INFO: renamed from: hu2.a$v$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<v> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final v createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return v.f68485w;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final v[] newArray(int i13) {
                return new v[i13];
            }
        }

        private v() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: hu2.a$w */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lhu2/a$w;", "Lhu2/a$c0;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements c0 {

        /* JADX INFO: renamed from: w */
        public static final w f68486w = new w();
        public static final Parcelable.Creator<w> CREATOR = new a();

        /* JADX INFO: renamed from: hu2.a$w$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<w> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final w createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return w.f68486w;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final w[] newArray(int i13) {
                return new w[i13];
            }
        }

        private w() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: hu2.a$x */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lhu2/a$x;", "Lhu2/a$c0;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "undoSetPosition", "<init>", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "b", "()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class x implements c0 {
        public static final Parcelable.Creator<x> CREATOR = new a();

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final PositionInWorkout undoSetPosition;

        /* JADX INFO: renamed from: hu2.a$x$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<x> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                return new x(PositionInWorkout.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final x[] newArray(int i13) {
                return new x[i13];
            }
        }

        public x(PositionInWorkout undoSetPosition) {
            AbstractC22676k.m65750j(undoSetPosition, "undoSetPosition");
            this.undoSetPosition = undoSetPosition;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final PositionInWorkout getUndoSetPosition() {
            return this.undoSetPosition;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof x) && AbstractC22676k.m65745e(this.undoSetPosition, ((x) other).undoSetPosition);
        }

        public int hashCode() {
            return this.undoSetPosition.hashCode();
        }

        public String toString() {
            return "UndoSet(undoSetPosition=" + this.undoSetPosition + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            this.undoSetPosition.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: hu2.a$y */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lhu2/a$y;", "Lhu2/a$c0;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements c0 {

        /* JADX INFO: renamed from: w */
        public static final y f68488w = new y();
        public static final Parcelable.Creator<y> CREATOR = new a();

        /* JADX INFO: renamed from: hu2.a$y$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<y> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final y createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return y.f68488w;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final y[] newArray(int i13) {
                return new y[i13];
            }
        }

        private y() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: hu2.a$z */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lhu2/a$z;", "Lhu2/a$c0;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "nextSetPosition", "<init>", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "b", "()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class z implements c0 {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final PositionInWorkout nextSetPosition;

        /* JADX INFO: renamed from: hu2.a$z$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<z> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final z createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                return new z(PositionInWorkout.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final z[] newArray(int i13) {
                return new z[i13];
            }
        }

        public z(PositionInWorkout nextSetPosition) {
            AbstractC22676k.m65750j(nextSetPosition, "nextSetPosition");
            this.nextSetPosition = nextSetPosition;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final PositionInWorkout getNextSetPosition() {
            return this.nextSetPosition;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof z) && AbstractC22676k.m65745e(this.nextSetPosition, ((z) other).nextSetPosition);
        }

        public int hashCode() {
            return this.nextSetPosition.hashCode();
        }

        public String toString() {
            return "UpdateNextSet(nextSetPosition=" + this.nextSetPosition + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            this.nextSetPosition.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: hu2.a$f */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lhu2/a$f;", "Lhu2/a$c0;", "Ldu2/c;", "onScreen", "<init>", "(Ldu2/c;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "(Ldu2/c;)Lhu2/a$f;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ldu2/c;", "f", "()Ldu2/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements c0 {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final EnumC12379c onScreen;

        /* JADX INFO: renamed from: hu2.a$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                return new f(EnumC12379c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i13) {
                return new f[i13];
            }
        }

        public f(EnumC12379c onScreen) {
            AbstractC22676k.m65750j(onScreen, "onScreen");
            this.onScreen = onScreen;
        }

        /* JADX INFO: renamed from: b */
        public final f m50309b(EnumC12379c onScreen) {
            AbstractC22676k.m65750j(onScreen, "onScreen");
            return new f(onScreen);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && this.onScreen == ((f) other).onScreen;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final EnumC12379c getOnScreen() {
            return this.onScreen;
        }

        public int hashCode() {
            return this.onScreen.hashCode();
        }

        public String toString() {
            return "EndSet(onScreen=" + this.onScreen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeString(this.onScreen.name());
        }

        public /* synthetic */ f(EnumC12379c enumC12379c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? EnumC12379c.UNKNOWN : enumC12379c);
        }
    }

    /* JADX INFO: renamed from: hu2.a$t */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\nJ\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lhu2/a$t;", "Lhu2/a$c0;", "Ldu2/c;", "onScreen", "", "fromIcon", "<init>", "(Ldu2/c;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "(Ldu2/c;Z)Lhu2/a$t;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ldu2/c;", "i", "()Ldu2/c;", "x", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t implements c0 {
        public static final Parcelable.Creator<t> CREATOR = new a();

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final EnumC12379c onScreen;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final boolean fromIcon;

        /* JADX INFO: renamed from: hu2.a$t$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Parcelable.Creator<t> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final t createFromParcel(Parcel parcel) {
                AbstractC22676k.m65750j(parcel, "parcel");
                return new t(EnumC12379c.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final t[] newArray(int i13) {
                return new t[i13];
            }
        }

        public t(EnumC12379c onScreen, boolean z4) {
            AbstractC22676k.m65750j(onScreen, "onScreen");
            this.onScreen = onScreen;
            this.fromIcon = z4;
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ t m50338f(t tVar, EnumC12379c enumC12379c, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                enumC12379c = tVar.onScreen;
            }
            if ((i13 & 2) != 0) {
                z4 = tVar.fromIcon;
            }
            return tVar.m50339b(enumC12379c, z4);
        }

        /* JADX INFO: renamed from: b */
        public final t m50339b(EnumC12379c onScreen, boolean fromIcon) {
            AbstractC22676k.m65750j(onScreen, "onScreen");
            return new t(onScreen, fromIcon);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof t)) {
                return false;
            }
            t tVar = (t) other;
            return this.onScreen == tVar.onScreen && this.fromIcon == tVar.fromIcon;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getFromIcon() {
            return this.fromIcon;
        }

        public int hashCode() {
            return Boolean.hashCode(this.fromIcon) + (this.onScreen.hashCode() * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final EnumC12379c getOnScreen() {
            return this.onScreen;
        }

        public String toString() {
            return "StartSet(onScreen=" + this.onScreen + ", fromIcon=" + this.fromIcon + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeString(this.onScreen.name());
            dest.writeInt(this.fromIcon ? 1 : 0);
        }

        public /* synthetic */ t(EnumC12379c enumC12379c, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? EnumC12379c.UNKNOWN : enumC12379c, (i13 & 2) != 0 ? false : z4);
        }
    }
}
