package r61;

import androidx.compose.runtime.Composer;
import com.mapbox.common.HttpHeaders;
import com.whoop.design.util.AbstractC8693b;
import i91.AbstractC18249c;
import j71.AbstractC21394b;
import java.util.ArrayList;
import java.util.List;
import k61.C22230c;
import p000.AbstractC11266d;
import p208i2.C17919x;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.Function1;
import p745y81.InterfaceC39332e;
import u61.C34552a;
import u61.C34554c;
import u61.C34555d;
import u61.C34556e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: r61.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lr61/b;", "", "<init>", "()V", "", "Lu61/a;", "b", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "Lr61/b$a;", "dataPoint", "Lu61/e;", "c", "(Lr61/b$a;Landroidx/compose/runtime/Composer;I)Lu61/e;", "Lj71/b$g;", "a", "(Landroidx/compose/runtime/Composer;I)Lj71/b$g;", "Ljava/util/List;", "getBiomarkerDataPoints", "()Ljava/util/List;", "biomarkerDataPoints", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30979b {

    /* JADX INFO: renamed from: a */
    public static final C30979b f127785a = new C30979b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final List<a> biomarkerDataPoints = AbstractC37056f.m118959K(new a("Apr 24, 2023", 179, 0.0f, Function1.m125323a(b.f127792w)), new a("Apr 12, 2024", 183, 0.2f, Function1.m125323a(c.f127793w)), new a("Jul 12, 2024", 161, 0.4f, Function1.m125323a(d.f127794w)), new a("Oct 4, 2024", 116, 0.6f, Function1.m125323a(e.f127795w)), new a("Jan 12, 2025", 134, 0.8f, Function1.m125323a(f.f127796w)), new a("Apr 2, 2025", 180, 1.0f, Function1.m125323a(g.f127797w)));

    /* JADX INFO: renamed from: c */
    public static final int f127787c = 8;

    /* JADX INFO: renamed from: r61.b$a */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lr61/b$a;", "", "", HttpHeaders.DATE, "", "value", "", "xPercent", "Ly81/e;", "circleColor", "<init>", "(Ljava/lang/String;IFLy81/e;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "F", "d", "()F", "Ly81/e;", "()Ly81/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final float xPercent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC39332e circleColor;

        public a(String date, int i13, float f13, InterfaceC39332e circleColor) {
            AbstractC22676k.m65750j(date, "date");
            AbstractC22676k.m65750j(circleColor, "circleColor");
            this.date = date;
            this.value = i13;
            this.xPercent = f13;
            this.circleColor = circleColor;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC39332e getCircleColor() {
            return this.circleColor;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getXPercent() {
            return this.xPercent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.date, aVar.date) && this.value == aVar.value && Float.compare(this.xPercent, aVar.xPercent) == 0 && AbstractC22676k.m65745e(this.circleColor, aVar.circleColor);
        }

        public int hashCode() {
            return this.circleColor.hashCode() + AbstractC11266d.m30447a(this.xPercent, AbstractC11266d.m30448b(this.value, this.date.hashCode() * 31, 31), 31);
        }

        public String toString() {
            String str = this.date;
            int i13 = this.value;
            float f13 = this.xPercent;
            InterfaceC39332e interfaceC39332e = this.circleColor;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "BiomarkerDataPoint(date=", str, ", value=", ", xPercent=");
            sbM30467u.append(f13);
            sbM30467u.append(", circleColor=");
            sbM30467u.append(interfaceC39332e);
            sbM30467u.append(")");
            return sbM30467u.toString();
        }
    }

    /* JADX INFO: renamed from: r61.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f127792w = new b();

        /* JADX INFO: renamed from: a */
        public final long m95306a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m95306a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: r61.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f127793w = new c();

        /* JADX INFO: renamed from: a */
        public final long m95307a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m95307a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: r61.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f127794w = new d();

        /* JADX INFO: renamed from: a */
        public final long m95308a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m95308a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: r61.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f127795w = new e();

        /* JADX INFO: renamed from: a */
        public final long m95309a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m95309a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: r61.b$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f127796w = new f();

        /* JADX INFO: renamed from: a */
        public final long m95310a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite70();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m95310a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: r61.b$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f127797w = new g();

        /* JADX INFO: renamed from: a */
        public final long m95311a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m95311a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: r61.b$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f127798w = new h();

        /* JADX INFO: renamed from: a */
        public final long m95312a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m95312a((C39336i) obj));
        }
    }

    private C30979b() {
    }

    /* JADX INFO: renamed from: b */
    private final List<C34552a> m95299b(Composer composer, int i13) {
        ArrayList arrayList = new ArrayList();
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(249634693);
        int size = biomarkerDataPoints.size() - 1;
        int i14 = 0;
        while (i14 < size) {
            List<a> list = biomarkerDataPoints;
            a aVar = list.get(i14);
            i14++;
            a aVar2 = list.get(i14);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = h.f127798w;
                c28655q.m87172p0(objM87133R);
            }
            int i15 = (i13 << 3) & 112;
            arrayList.add(new C34552a(AbstractC37056f.m118959K(m95300c(aVar, c28655q, i15), m95300c(aVar2, c28655q, i15)), null, new C22230c(2, 0, 0, AbstractC18249c.m52575m(Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R)), 0L, false, 54, null), null, 10, null));
        }
        c28655q.m87173q(false);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private final C34556e m95300c(a aVar, Composer composer, int i13) {
        float value = (aVar.getValue() - 100) / 100.0f;
        return new C34556e(aVar.getXPercent(), value, AbstractC8693b.m21278l(aVar.getDate() + ": " + aVar.getValue()), new C34554c(aVar.getCircleColor(), 14, null, 4, null), new C34555d(AbstractC8693b.m21278l(String.valueOf(aVar.getValue())), aVar.getCircleColor(), false, false), null, 32, null);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC21394b.g m95301a(Composer composer, int i13) {
        return new AbstractC21394b.g(m95299b(composer, i13 & 14), "biomarker_line_fixture", false, null, null, false, 60, null);
    }
}
