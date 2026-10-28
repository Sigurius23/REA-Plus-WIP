package cz0;

import a71.C0520a;
import androidx.core.app.FrameMetricsAggregator;
import e71.C12800a;
import j71.EnumC21393a;
import java.util.List;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: cz0.s */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0005\b\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0003\u0014\u0015\u0016¨\u0006\u0017"}, m65681d2 = {"Lcz0/s;", "", "<init>", "()V", "Lcz0/q;", "c", "()Lcz0/q;", "", "b", "()Ljava/lang/String;", "id", "", "La71/a;", "a", "()Ljava/util/List;", "details", "", "d", "()F", "x", "Lcz0/s$a;", "Lcz0/s$b;", "Lcz0/s$c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11258s {
    public /* synthetic */ AbstractC11258s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract List<C0520a> mo30408a();

    /* JADX INFO: renamed from: b */
    public abstract String getId();

    /* JADX INFO: renamed from: c */
    public final C11256q m30410c() {
        if (!(this instanceof a)) {
            return null;
        }
        a aVar = (a) this;
        if (aVar.getScrubberShape() == EnumC21393a.CENTER_DOT) {
            return new C11256q(aVar.getYBottom(), aVar.getYTop());
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract float getX();

    private AbstractC11258s() {
    }

    /* JADX INFO: renamed from: cz0.s$b */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006#"}, m65681d2 = {"Lcz0/s$b;", "Lcz0/s;", "", "id", "", "x", "Le71/a;", "group", "", "La71/a;", "details", "<init>", "(Ljava/lang/String;FLe71/a;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "F", "d", "()F", "c", "Le71/a;", "e", "()Le71/a;", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC11258s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float x;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C12800a group;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<C0520a> details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String id4, float f13, C12800a group, List<C0520a> details) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(group, "group");
            AbstractC22676k.m65750j(details, "details");
            this.id = id4;
            this.x = f13;
            this.group = group;
            this.details = details;
        }

        @Override // cz0.AbstractC11258s
        /* JADX INFO: renamed from: a */
        public List<C0520a> mo30408a() {
            return this.details;
        }

        @Override // cz0.AbstractC11258s
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // cz0.AbstractC11258s
        /* JADX INFO: renamed from: d, reason: from getter */
        public float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C12800a getGroup() {
            return this.group;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.id, bVar.id) && Float.compare(this.x, bVar.x) == 0 && AbstractC22676k.m65745e(this.group, bVar.group) && AbstractC22676k.m65745e(this.details, bVar.details);
        }

        public int hashCode() {
            return this.details.hashCode() + ((this.group.hashCode() + AbstractC11266d.m30447a(this.x, this.id.hashCode() * 31, 31)) * 31);
        }

        public String toString() {
            return "Bar(id=" + this.id + ", x=" + this.x + ", group=" + this.group + ", details=" + this.details + ")";
        }

        public /* synthetic */ b(String str, float f13, C12800a c12800a, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? 0.0f : f13, (i13 & 4) != 0 ? new C12800a(null, null, 0.0f, 0.0f, null, null, null, null, false, FrameMetricsAggregator.EVERY_DURATION, null) : c12800a, (i13 & 8) != 0 ? AbstractC37056f.m118958J(new C0520a(null, null, null, null, null, null, null, false, null, null, null, null, 4095, null)) : list);
        }
    }

    /* JADX INFO: renamed from: cz0.s$c */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f¨\u0006 "}, m65681d2 = {"Lcz0/s$c;", "Lcz0/s;", "", "id", "", "x", "y", "", "La71/a;", "details", "<init>", "(Ljava/lang/String;FFLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "F", "d", "()F", "c", "e", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC11258s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float x;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final float y;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<C0520a> details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String id4, float f13, float f14, List<C0520a> details) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(details, "details");
            this.id = id4;
            this.x = f13;
            this.y = f14;
            this.details = details;
        }

        @Override // cz0.AbstractC11258s
        /* JADX INFO: renamed from: a */
        public List<C0520a> mo30408a() {
            return this.details;
        }

        @Override // cz0.AbstractC11258s
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // cz0.AbstractC11258s
        /* JADX INFO: renamed from: d, reason: from getter */
        public float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getY() {
            return this.y;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.id, cVar.id) && Float.compare(this.x, cVar.x) == 0 && Float.compare(this.y, cVar.y) == 0 && AbstractC22676k.m65745e(this.details, cVar.details);
        }

        public int hashCode() {
            return this.details.hashCode() + AbstractC11266d.m30447a(this.y, AbstractC11266d.m30447a(this.x, this.id.hashCode() * 31, 31), 31);
        }

        public String toString() {
            return "Line(id=" + this.id + ", x=" + this.x + ", y=" + this.y + ", details=" + this.details + ")";
        }

        public /* synthetic */ c(String str, float f13, float f14, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? 0.0f : f13, (i13 & 4) == 0 ? f14 : 0.0f, (i13 & 8) != 0 ? AbstractC37056f.m118958J(new C0520a(null, null, null, null, null, null, null, false, null, null, null, null, 4095, null)) : list);
        }
    }

    /* JADX INFO: renamed from: cz0.s$a */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b\u0019\u0010&¨\u0006'"}, m65681d2 = {"Lcz0/s$a;", "Lcz0/s;", "", "id", "", "x", "yTop", "yBottom", "Lj71/a;", "scrubberShape", "", "La71/a;", "details", "<init>", "(Ljava/lang/String;FFFLj71/a;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "F", "d", "()F", "c", "g", "f", "e", "Lj71/a;", "()Lj71/a;", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC11258s {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float x;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final float yTop;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final float yBottom;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final EnumC21393a scrubberShape;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final List<C0520a> details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id4, float f13, float f14, float f15, EnumC21393a scrubberShape, List<C0520a> details) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(scrubberShape, "scrubberShape");
            AbstractC22676k.m65750j(details, "details");
            this.id = id4;
            this.x = f13;
            this.yTop = f14;
            this.yBottom = f15;
            this.scrubberShape = scrubberShape;
            this.details = details;
        }

        @Override // cz0.AbstractC11258s
        /* JADX INFO: renamed from: a */
        public List<C0520a> mo30408a() {
            return this.details;
        }

        @Override // cz0.AbstractC11258s
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // cz0.AbstractC11258s
        /* JADX INFO: renamed from: d, reason: from getter */
        public float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC21393a getScrubberShape() {
            return this.scrubberShape;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.id, aVar.id) && Float.compare(this.x, aVar.x) == 0 && Float.compare(this.yTop, aVar.yTop) == 0 && Float.compare(this.yBottom, aVar.yBottom) == 0 && this.scrubberShape == aVar.scrubberShape && AbstractC22676k.m65745e(this.details, aVar.details);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getYBottom() {
            return this.yBottom;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final float getYTop() {
            return this.yTop;
        }

        public int hashCode() {
            return this.details.hashCode() + ((this.scrubberShape.hashCode() + AbstractC11266d.m30447a(this.yBottom, AbstractC11266d.m30447a(this.yTop, AbstractC11266d.m30447a(this.x, this.id.hashCode() * 31, 31), 31), 31)) * 31);
        }

        public String toString() {
            String str = this.id;
            float f13 = this.x;
            float f14 = this.yTop;
            float f15 = this.yBottom;
            EnumC21393a enumC21393a = this.scrubberShape;
            List<C0520a> list = this.details;
            StringBuilder sb4 = new StringBuilder("Band(id=");
            sb4.append(str);
            sb4.append(", x=");
            sb4.append(f13);
            sb4.append(", yTop=");
            AbstractC30802r.m94772u(sb4, f14, ", yBottom=", f15, ", scrubberShape=");
            sb4.append(enumC21393a);
            sb4.append(", details=");
            sb4.append(list);
            sb4.append(")");
            return sb4.toString();
        }

        public /* synthetic */ a(String str, float f13, float f14, float f15, EnumC21393a enumC21393a, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? 0.0f : f13, (i13 & 4) != 0 ? 0.0f : f14, (i13 & 8) == 0 ? f15 : 0.0f, (i13 & 16) != 0 ? EnumC21393a.TWO_DOTS : enumC21393a, (i13 & 32) != 0 ? AbstractC37056f.m118958J(new C0520a(null, null, null, null, null, null, null, false, null, null, null, null, 4095, null)) : list);
        }
    }
}
