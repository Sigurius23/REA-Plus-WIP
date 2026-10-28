package h41;

import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import i91.C18250d;
import p208i2.C17919x;
import p555vl.AbstractC36095b;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: h41.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u000e\f\u0013\u0018\u0019\u0010B/\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017\u0082\u0001\u0006\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, m65681d2 = {"Lh41/e;", "", "Lcom/whoop/design/util/TextResource;", "title", "Li91/a;", "backgroundColor", "Ly81/e;", "textColor", "Lj91/b;", "priceAccentColor", "<init>", "(Lcom/whoop/design/util/TextResource;Li91/a;Ly81/e;Lj91/b;)V", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "Li91/a;", "()Li91/a;", "c", "Ly81/e;", "()Ly81/e;", "Lj91/b;", "()Lj91/b;", "f", "e", "Lh41/e$a;", "Lh41/e$b;", "Lh41/e$c;", "Lh41/e$d;", "Lh41/e$e;", "Lh41/e$f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16851e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC18247a backgroundColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e textColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21430b priceAccentColor;

    public /* synthetic */ AbstractC16851e(TextResource textResource, AbstractC18247a abstractC18247a, InterfaceC39332e interfaceC39332e, InterfaceC21430b interfaceC21430b, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, abstractC18247a, interfaceC39332e, interfaceC21430b);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC18247a getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC21430b getPriceAccentColor() {
        return this.priceAccentColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: d */
    public abstract TextResource getTitle();

    /* JADX INFO: renamed from: h41.e$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lh41/e$a;", "Lh41/e;", "Lcom/whoop/design/util/TextResource;", "title", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC16851e {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: h41.e$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41681a implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final C41681a f64752w = new C41681a();

            /* JADX INFO: renamed from: a */
            public final long m47479a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getGreyL1();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m47479a((C39336i) obj));
            }
        }

        public /* synthetic */ a(TextResource textResource, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? new TextResource.C8688b(AbstractC16277f.f62341j2, null, 2, null) : textResource);
        }

        @Override // h41.AbstractC16851e
        /* JADX INFO: renamed from: d, reason: from getter */
        public TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.title, ((a) other).title);
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("ComingSoon(title=", this.title, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextResource title) {
            super(title, AbstractC18249c.m52575m(p745y81.Function1.m125323a(C41681a.f64752w)), null, null, 12, null);
            AbstractC22676k.m65750j(title, "title");
            this.title = title;
        }
    }

    /* JADX INFO: renamed from: h41.e$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lh41/e$b;", "Lh41/e;", "Lcom/whoop/design/util/TextResource;", "title", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC16851e {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource title;

        public /* synthetic */ b(TextResource textResource, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? new TextResource.C8688b(AbstractC16277f.f62361o2, null, 2, null) : textResource);
        }

        @Override // h41.AbstractC16851e
        /* JADX INFO: renamed from: d, reason: from getter */
        public TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.title, ((b) other).title);
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("CyberSale(title=", this.title, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TextResource title) {
            super(title, new C18250d(AbstractC16850d.f64746a, 0.0f, 2, null), EnumC39333f.BRAND_BLACK, AbstractC16850d.f64746a, null);
            AbstractC22676k.m65750j(title, "title");
            this.title = title;
        }
    }

    /* JADX INFO: renamed from: h41.e$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lh41/e$c;", "Lh41/e;", "Lcom/whoop/design/util/TextResource;", "title", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC16851e {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: h41.e$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final a f64755w = new a();

            /* JADX INFO: renamed from: a */
            public final long m47480a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getBrandWhoopPro();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m47480a((C39336i) obj));
            }
        }

        public /* synthetic */ c(TextResource textResource, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? new TextResource.C8688b(AbstractC16277f.f62349l2, null, 2, null) : textResource);
        }

        @Override // h41.AbstractC16851e
        /* JADX INFO: renamed from: d, reason: from getter */
        public TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.title, ((c) other).title);
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("Exclusive(title=", this.title, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextResource title) {
            super(title, AbstractC18249c.m52575m(p745y81.Function1.m125323a(a.f64755w)), EnumC39333f.BRAND_BLACK, null, 8, null);
            AbstractC22676k.m65750j(title, "title");
            this.title = title;
        }
    }

    /* JADX INFO: renamed from: h41.e$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lh41/e$d;", "Lh41/e;", "Lcom/whoop/design/util/TextResource;", "title", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC16851e {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: h41.e$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final a f64757w = new a();

            /* JADX INFO: renamed from: a */
            public final long m47481a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getBrandBlack();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m47481a((C39336i) obj));
            }
        }

        public /* synthetic */ d(TextResource textResource, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? new TextResource.C8688b(AbstractC16277f.f62353m2, null, 2, null) : textResource);
        }

        @Override // h41.AbstractC16851e
        /* JADX INFO: renamed from: d, reason: from getter */
        public TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.title, ((d) other).title);
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("New(title=", this.title, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TextResource title) {
            super(title, AbstractC18249c.m52575m(p745y81.Function1.m125323a(a.f64757w)), null, null, 12, null);
            AbstractC22676k.m65750j(title, "title");
            this.title = title;
        }
    }

    /* JADX INFO: renamed from: h41.e$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lh41/e$e;", "Lh41/e;", "Lcom/whoop/design/util/TextResource;", "title", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC16851e {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: h41.e$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final a f64759w = new a();

            /* JADX INFO: renamed from: a */
            public final long m47482a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getGreyL1();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m47482a((C39336i) obj));
            }
        }

        public /* synthetic */ e(TextResource textResource, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? new TextResource.C8688b(AbstractC16277f.f62357n2, null, 2, null) : textResource);
        }

        @Override // h41.AbstractC16851e
        /* JADX INFO: renamed from: d, reason: from getter */
        public TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.title, ((e) other).title);
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("OutOfStock(title=", this.title, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(TextResource title) {
            super(title, AbstractC18249c.m52575m(p745y81.Function1.m125323a(a.f64759w)), null, null, 12, null);
            AbstractC22676k.m65750j(title, "title");
            this.title = title;
        }
    }

    /* JADX INFO: renamed from: h41.e$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lh41/e$f;", "Lh41/e;", "Lcom/whoop/design/util/TextResource;", "title", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC16851e {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: h41.e$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final a f64761w = new a();

            /* JADX INFO: renamed from: a */
            public final long m47483a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getStrain();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m47483a((C39336i) obj));
            }
        }

        public /* synthetic */ f(TextResource textResource, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? new TextResource.C8688b(AbstractC16277f.f62361o2, null, 2, null) : textResource);
        }

        @Override // h41.AbstractC16851e
        /* JADX INFO: renamed from: d, reason: from getter */
        public TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.title, ((f) other).title);
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("Sale(title=", this.title, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(TextResource title) {
            super(title, AbstractC18249c.m52575m(p745y81.Function1.m125323a(a.f64761w)), null, null, 12, null);
            AbstractC22676k.m65750j(title, "title");
            this.title = title;
        }
    }

    private AbstractC16851e(TextResource textResource, AbstractC18247a abstractC18247a, InterfaceC39332e interfaceC39332e, InterfaceC21430b interfaceC21430b) {
        this.title = textResource;
        this.backgroundColor = abstractC18247a;
        this.textColor = interfaceC39332e;
        this.priceAccentColor = interfaceC21430b;
    }

    public /* synthetic */ AbstractC16851e(TextResource textResource, AbstractC18247a abstractC18247a, InterfaceC39332e interfaceC39332e, InterfaceC21430b interfaceC21430b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, abstractC18247a, (i13 & 4) != 0 ? EnumC39333f.BRAND_WHITE : interfaceC39332e, (i13 & 8) != 0 ? null : interfaceC21430b, null);
    }
}
