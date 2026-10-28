package kd1;

import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kd1.o */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lkd1/o;", "", "<init>", "()V", "c", "a", "b", "Lkd1/o$a;", "Lkd1/o$b;", "Lkd1/o$c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22403o {

    /* JADX INFO: renamed from: a */
    public static final int f87638a = 0;

    /* JADX INFO: renamed from: kd1.o$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, m65681d2 = {"Lkd1/o$a;", "Lkd1/o;", "", "id", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "a", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC22403o {

        /* JADX INFO: renamed from: c */
        public static final int f87639c = 0;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int id;

        public a(int i13) {
            super(null);
            this.id = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.id == ((a) other).id;
        }

        public int hashCode() {
            return Integer.hashCode(this.id);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.id, "Drawable(id=", ")");
        }
    }

    /* JADX INFO: renamed from: kd1.o$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkd1/o$b;", "Lkd1/o;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC22403o {

        /* JADX INFO: renamed from: b */
        public static final b f87641b = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC22403o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC22403o() {
    }

    /* JADX INFO: renamed from: kd1.o$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u001b"}, m65681d2 = {"Lkd1/o$c;", "Lkd1/o;", "", "data", "", "error", "placeholder", "fallback", "<init>", "(Ljava/lang/Object;III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "c", "I", "d", "e", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC22403o {

        /* JADX INFO: renamed from: f */
        public static final int f87642f = 8;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Object data;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int error;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int placeholder;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final int fallback;

        public c(Object obj, int i13, int i14, int i15) {
            super(null);
            this.data = obj;
            this.error = i13;
            this.placeholder = i14;
            this.fallback = i15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getFallback() {
            return this.fallback;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getPlaceholder() {
            return this.placeholder;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.data, cVar.data) && this.error == cVar.error && this.placeholder == cVar.placeholder && this.fallback == cVar.fallback;
        }

        public int hashCode() {
            Object obj = this.data;
            return Integer.hashCode(this.fallback) + AbstractC11266d.m30448b(this.placeholder, AbstractC11266d.m30448b(this.error, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
        }

        public String toString() {
            Object obj = this.data;
            int i13 = this.error;
            int i14 = this.placeholder;
            int i15 = this.fallback;
            StringBuilder sb4 = new StringBuilder("Url(data=");
            sb4.append(obj);
            sb4.append(", error=");
            sb4.append(i13);
            sb4.append(", placeholder=");
            return AbstractC26725a.m79505i(sb4, i14, ", fallback=", i15, ")");
        }

        public /* synthetic */ c(Object obj, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i16 & 2) != 0 ? 0 : i13, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15);
        }
    }
}
