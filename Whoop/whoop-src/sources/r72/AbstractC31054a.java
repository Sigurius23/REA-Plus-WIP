package r72;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: r72.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m65681d2 = {"Lr72/a;", "", "<init>", "()V", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "c", "g", "d", "e", "a", "i", "Lr72/a$a;", "Lr72/a$b;", "Lr72/a$c;", "Lr72/a$d;", "Lr72/a$e;", "Lr72/a$f;", "Lr72/a$g;", "Lr72/a$h;", "Lr72/a$i;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31054a {

    /* JADX INFO: renamed from: r72.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lr72/a$a;", "Lr72/a;", "<init>", "()V", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC31054a {

        /* JADX INFO: renamed from: a */
        public static final a f128050a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: r72.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lr72/a$b;", "Lr72/a;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC31054a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String source) {
            super(null);
            AbstractC22676k.m65750j(source, "source");
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.source, ((b) other).source);
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("JoinWaitlist(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: r72.a$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lr72/a$c;", "Lr72/a;", "<init>", "()V", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC31054a {

        /* JADX INFO: renamed from: a */
        public static final c f128052a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: r72.a$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lr72/a$d;", "Lr72/a;", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC31054a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String name) {
            super(null);
            AbstractC22676k.m65750j(name, "name");
            this.name = name;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.name, ((d) other).name);
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("TapCategory(name=", this.name, ")");
        }
    }

    /* JADX INFO: renamed from: r72.a$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lr72/a$e;", "Lr72/a;", "", "number", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC31054a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int number;

        public e(int i13) {
            super(null);
            this.number = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getNumber() {
            return this.number;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && this.number == ((e) other).number;
        }

        public int hashCode() {
            return Integer.hashCode(this.number);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.number, "TapFaq(number=", ")");
        }
    }

    /* JADX INFO: renamed from: r72.a$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lr72/a$f;", "Lr72/a;", "<init>", "()V", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC31054a {

        /* JADX INFO: renamed from: a */
        public static final f f128055a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: r72.a$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lr72/a$g;", "Lr72/a;", "<init>", "()V", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC31054a {

        /* JADX INFO: renamed from: a */
        public static final g f128056a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: r72.a$h */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lr72/a$h;", "Lr72/a;", "", "source", "", "isOn", "label", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC31054a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isOn;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String source, boolean z4, String str) {
            super(null);
            AbstractC22676k.m65750j(source, "source");
            this.source = source;
            this.isOn = z4;
            this.label = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsOn() {
            return this.isOn;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.source, hVar.source) && this.isOn == hVar.isOn && AbstractC22676k.m65745e(this.label, hVar.label);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(this.source.hashCode() * 31, 31, this.isOn);
            String str = this.label;
            return iM8289b + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.label, ")", AbstractC25012a.m73379l("ViewBloodworkDetails(source=", this.source, ", isOn=", ", label=", this.isOn));
        }
    }

    /* JADX INFO: renamed from: r72.a$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lr72/a$i;", "Lr72/a;", "<init>", "()V", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC31054a {

        /* JADX INFO: renamed from: a */
        public static final i f128060a = new i();

        private i() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC31054a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC31054a() {
    }
}
