package jx1;

import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jx1.l */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Ljx1/l;", "", "<init>", "()V", "d", "c", "b", "a", "Ljx1/l$a;", "Ljx1/l$b;", "Ljx1/l$c;", "Ljx1/l$d;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22022l {

    /* JADX INFO: renamed from: jx1.l$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljx1/l$a;", "Ljx1/l;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22022l {

        /* JADX INFO: renamed from: a */
        public static final a f85396a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jx1.l$b */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Ljx1/l$b;", "Ljx1/l;", "", "navigationBarTitle", "", "Ljx1/f0;", "sections", "Ljx1/n;", "style", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljx1/n;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljx1/n;", "()Ljx1/n;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC22022l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String navigationBarTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<C22015f0> sections;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC22024n style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String navigationBarTitle, List<C22015f0> sections, EnumC22024n style) {
            super(null);
            AbstractC22676k.m65750j(navigationBarTitle, "navigationBarTitle");
            AbstractC22676k.m65750j(sections, "sections");
            AbstractC22676k.m65750j(style, "style");
            this.navigationBarTitle = navigationBarTitle;
            this.sections = sections;
            this.style = style;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNavigationBarTitle() {
            return this.navigationBarTitle;
        }

        /* JADX INFO: renamed from: b */
        public final List<C22015f0> m62951b() {
            return this.sections;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC22024n getStyle() {
            return this.style;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.navigationBarTitle, bVar.navigationBarTitle) && AbstractC22676k.m65745e(this.sections, bVar.sections) && this.style == bVar.style;
        }

        public int hashCode() {
            return this.style.hashCode() + AbstractC11895b.m31983b(this.navigationBarTitle.hashCode() * 31, 31, this.sections);
        }

        public String toString() {
            String str = this.navigationBarTitle;
            List<C22015f0> list = this.sections;
            EnumC22024n enumC22024n = this.style;
            StringBuilder sbM94766o = AbstractC30802r.m94766o("Loaded(navigationBarTitle=", str, ", sections=", ", style=", list);
            sbM94766o.append(enumC22024n);
            sbM94766o.append(")");
            return sbM94766o.toString();
        }
    }

    /* JADX INFO: renamed from: jx1.l$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljx1/l$c;", "Ljx1/l;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC22022l {

        /* JADX INFO: renamed from: a */
        public static final c f85400a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jx1.l$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljx1/l$d;", "Ljx1/l;", "<init>", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC22022l {

        /* JADX INFO: renamed from: a */
        public static final d f85401a = new d();

        private d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC22022l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC22022l() {
    }
}
