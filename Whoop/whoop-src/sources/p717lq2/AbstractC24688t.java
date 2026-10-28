package p717lq2;

import i93.C18284j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh3.AbstractC21702c;
import m83.AbstractC25243e0;
import m83.AbstractC25267u;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lq2.t */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\n\u0011\u000e\u0012\rB/\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\r\u0010\u0010\u0082\u0001\u0005\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Llq2/t;", "Llq2/e;", "", "Li2/x;", "colors", "secondaryColors", "Llq2/f;", "option", "<init>", "(Ljava/util/List;Ljava/util/List;Llq2/f;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "Llq2/f;", "()Llq2/f;", "d", "e", "Llq2/t$a;", "Llq2/t$b;", "Llq2/t$c;", "Llq2/t$d;", "Llq2/t$e;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24688t implements InterfaceC24673e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C17919x> colors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C17919x> secondaryColors;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC24674f option;

    /* JADX INFO: renamed from: lq2.t$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Llq2/t$a;", "Llq2/t;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC24688t {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        public a(EnumC24674f gradientOption) {
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            C17919x c17919x = new C17919x(AbstractC17918w0.m51517e(4291514072L));
            int i13 = C17919x.f69638o;
            long j7 = C17919x.f69636m;
            super(AbstractC37056f.m118959K(c17919x, new C17919x(j7)), AbstractC37056f.m118959K(new C17919x(j7), new C17919x(AbstractC17918w0.m51517e(4291514072L))), gradientOption, null);
            this.gradientOption = gradientOption;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.gradientOption == ((a) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("WirIntro(gradientOption=", this.gradientOption, ")");
        }
    }

    /* JADX INFO: renamed from: lq2.t$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Llq2/t$b;", "Llq2/t;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC24688t {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC24674f gradientOption) {
            super(AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4280824633L)), new C17919x(AbstractC17918w0.m51517e(4279507229L)), new C17919x(AbstractC17918w0.m51517e(4279244056L))), null, gradientOption, 2, null);
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            this.gradientOption = gradientOption;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.gradientOption == ((b) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("WirOutro(gradientOption=", this.gradientOption, ")");
        }
    }

    /* JADX INFO: renamed from: lq2.t$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Llq2/t$c;", "Llq2/t;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC24688t {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        public c(EnumC24674f gradientOption) {
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            C17919x c17919x = new C17919x(AbstractC17918w0.m51517e(4284985062L));
            int i13 = C17919x.f69638o;
            super(AbstractC37056f.m118959K(c17919x, new C17919x(C17919x.f69636m)), null, gradientOption, 2, null);
            this.gradientOption = gradientOption;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.gradientOption == ((c) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("WirRecovery(gradientOption=", this.gradientOption, ")");
        }
    }

    /* JADX INFO: renamed from: lq2.t$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Llq2/t$d;", "Llq2/t;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC24688t {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        public d(EnumC24674f gradientOption) {
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            C17919x c17919x = new C17919x(AbstractC17918w0.m51517e(4288979953L));
            int i13 = C17919x.f69638o;
            super(AbstractC37056f.m118959K(c17919x, new C17919x(C17919x.f69636m)), null, gradientOption, 2, null);
            this.gradientOption = gradientOption;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && this.gradientOption == ((d) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("WirSleep(gradientOption=", this.gradientOption, ")");
        }
    }

    /* JADX INFO: renamed from: lq2.t$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Llq2/t$e;", "Llq2/t;", "Llq2/f;", "gradientOption", "<init>", "(Llq2/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Llq2/f;", "getGradientOption", "()Llq2/f;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC24688t {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC24674f gradientOption;

        public e(EnumC24674f gradientOption) {
            AbstractC22676k.m65750j(gradientOption, "gradientOption");
            C17919x c17919x = new C17919x(AbstractC17918w0.m51517e(4278227943L));
            int i13 = C17919x.f69638o;
            super(AbstractC37056f.m118959K(c17919x, new C17919x(C17919x.f69636m)), null, gradientOption, 2, null);
            this.gradientOption = gradientOption;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && this.gradientOption == ((e) other).gradientOption;
        }

        public int hashCode() {
            return this.gradientOption.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61136g("WirStrain(gradientOption=", this.gradientOption, ")");
        }
    }

    public /* synthetic */ AbstractC24688t(List list, List list2, EnumC24674f enumC24674f, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, enumC24674f);
    }

    /* JADX INFO: renamed from: a */
    public final List<C17919x> m72265a() {
        return this.colors;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC24674f getOption() {
        return this.option;
    }

    /* JADX INFO: renamed from: c */
    public final List<C17919x> m72267c() {
        return this.secondaryColors;
    }

    private AbstractC24688t(List<C17919x> list, List<C17919x> list2, EnumC24674f enumC24674f) {
        this.colors = list;
        this.secondaryColors = list2;
        this.option = enumC24674f;
    }

    public /* synthetic */ AbstractC24688t(List list, List list2, EnumC24674f enumC24674f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            C18284j c18284jM118950B = AbstractC37056f.m118950B(list);
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM118950B, 10));
            Iterator it = c18284jM118950B.iterator();
            while (it.hasNext()) {
                arrayList.add(new C17919x(((C17919x) list.get((list.size() - 1) - ((AbstractC25243e0) it).nextInt())).f69639a));
            }
            list2 = arrayList;
        }
        this(list, list2, enumC24674f, null);
    }
}
