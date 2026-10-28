package q21;

import gb1.AbstractC15673b0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: q21.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001%BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\\\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b,\u0010 R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b-\u0010 ¨\u0006."}, m65681d2 = {"Lq21/e;", "", "Ly81/e;", "iconBackgroundColor", "Li2/t;", "iconBackgroundBrush", "highlightedBackgroundColor", "Lq21/f;", "style", "Lt0/i;", "shape", "iconTintColor", "textColor", "<init>", "(Ly81/e;Li2/t;Li2/t;Lq21/f;Lt0/i;Ly81/e;Ly81/e;)V", "", "isHighlighted", "i", "(Z)Ly81/e;", "a", "(Ly81/e;Li2/t;Li2/t;Lq21/f;Lt0/i;Ly81/e;Ly81/e;)Lq21/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ly81/e;", "e", "()Ly81/e;", "b", "Li2/t;", "d", "()Li2/t;", "c", "Lq21/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lq21/f;", "Lt0/i;", "g", "()Lt0/i;", "f", "getTextColor", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29846e {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39332e iconBackgroundColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC17911t iconBackgroundBrush;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC17911t highlightedBackgroundColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC29847f style;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C33252i shape;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC39332e iconTintColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC39332e textColor;

    /* JADX INFO: renamed from: q21.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f121985w = new a();

        /* JADX INFO: renamed from: a */
        public final long m91378a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m91378a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: q21.e$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f121986w = new b();

        /* JADX INFO: renamed from: a */
        public final long m91379a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m91379a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: q21.e$c, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lq21/e$c;", "", "<init>", "()V", "", "style", "Lq21/e;", "a", "(Ljava/lang/String;)Lq21/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: q21.e$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final a f121987w = new a();

            /* JADX INFO: renamed from: a */
            public final long m91381a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getStrainZone1();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m91381a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: q21.e$c$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final b f121988w = new b();

            /* JADX INFO: renamed from: a */
            public final long m91382a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getAccentPositiveTrend15();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m91382a((C39336i) obj));
            }
        }

        /* JADX INFO: renamed from: q21.e$c$c, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42206c implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final C42206c f121989w = new C42206c();

            /* JADX INFO: renamed from: a */
            public final long m91383a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return whoopColor.getAccentPositiveTrend();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m91383a((C39336i) obj));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: a */
        public final C29846e m91380a(String style) {
            AbstractC22676k.m65750j(style, "style");
            switch (style.hashCode()) {
                case -1104367997:
                    if (style.equals("ADVANCED_LABS")) {
                        return new C29846e(p745y81.Function1.m125323a(b.f121988w), null, AbstractC15673b0.m44004Q(), EnumC29847f.ADVANCED_LABS, AbstractC33253j.m105489e(1 * 4), p745y81.Function1.m125323a(C42206c.f121989w), null, 66, null);
                    }
                    break;
                case -200196011:
                    if (style.equals("DOWNGRADE")) {
                        return new C29846e(p745y81.Function1.m125324b(AbstractC17918w0.m51517e(4294178297L)), null, null, EnumC29847f.DOWNGRADE, null, null, null, 118, null);
                    }
                    break;
                case 78406:
                    if (style.equals("ONE")) {
                        return new C29846e(p745y81.Function1.m125324b(AbstractC17918w0.m51517e(4294178297L)), null, null, EnumC29847f.ONE, null, null, null, 118, null);
                    }
                    break;
                case 2336508:
                    if (style.equals("LIFE")) {
                        return new C29846e(null, AbstractC15673b0.m43989I0(), AbstractC15673b0.m43989I0(), EnumC29847f.LIFE, null, null, null, 113, null);
                    }
                    break;
                case 2451679:
                    if (style.equals("PEAK")) {
                        return new C29846e(p745y81.Function1.m125323a(a.f121987w), null, null, EnumC29847f.PEAK, null, null, null, 118, null);
                    }
                    break;
                case 1184033572:
                    if (style.equals("FAMILY_PLAN")) {
                        return new C29846e(p745y81.Function1.m125324b(AbstractC17918w0.m51517e(4294178297L)), null, null, EnumC29847f.FAMILY_PLAN, null, null, null, 118, null);
                    }
                    break;
            }
            return new C29846e(null, null, null, null, null, null, null, 127, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: q21.e$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f121990w = new d();

        /* JADX INFO: renamed from: a */
        public final long m91384a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m91384a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: q21.e$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f121991w = new e();

        /* JADX INFO: renamed from: a */
        public final long m91385a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite70();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m91385a((C39336i) obj));
        }
    }

    public C29846e(InterfaceC39332e interfaceC39332e, AbstractC17911t abstractC17911t, AbstractC17911t highlightedBackgroundColor, EnumC29847f enumC29847f, C33252i shape, InterfaceC39332e iconTintColor, InterfaceC39332e textColor) {
        AbstractC22676k.m65750j(highlightedBackgroundColor, "highlightedBackgroundColor");
        AbstractC22676k.m65750j(shape, "shape");
        AbstractC22676k.m65750j(iconTintColor, "iconTintColor");
        AbstractC22676k.m65750j(textColor, "textColor");
        this.iconBackgroundColor = interfaceC39332e;
        this.iconBackgroundBrush = abstractC17911t;
        this.highlightedBackgroundColor = highlightedBackgroundColor;
        this.style = enumC29847f;
        this.shape = shape;
        this.iconTintColor = iconTintColor;
        this.textColor = textColor;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C29846e m91369b(C29846e c29846e, InterfaceC39332e interfaceC39332e, AbstractC17911t abstractC17911t, AbstractC17911t abstractC17911t2, EnumC29847f enumC29847f, C33252i c33252i, InterfaceC39332e interfaceC39332e2, InterfaceC39332e interfaceC39332e3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC39332e = c29846e.iconBackgroundColor;
        }
        if ((i13 & 2) != 0) {
            abstractC17911t = c29846e.iconBackgroundBrush;
        }
        if ((i13 & 4) != 0) {
            abstractC17911t2 = c29846e.highlightedBackgroundColor;
        }
        if ((i13 & 8) != 0) {
            enumC29847f = c29846e.style;
        }
        if ((i13 & 16) != 0) {
            c33252i = c29846e.shape;
        }
        if ((i13 & 32) != 0) {
            interfaceC39332e2 = c29846e.iconTintColor;
        }
        if ((i13 & 64) != 0) {
            interfaceC39332e3 = c29846e.textColor;
        }
        InterfaceC39332e interfaceC39332e4 = interfaceC39332e2;
        InterfaceC39332e interfaceC39332e5 = interfaceC39332e3;
        C33252i c33252i2 = c33252i;
        AbstractC17911t abstractC17911t3 = abstractC17911t2;
        return c29846e.m91370a(interfaceC39332e, abstractC17911t, abstractC17911t3, enumC29847f, c33252i2, interfaceC39332e4, interfaceC39332e5);
    }

    /* JADX INFO: renamed from: a */
    public final C29846e m91370a(InterfaceC39332e iconBackgroundColor, AbstractC17911t iconBackgroundBrush, AbstractC17911t highlightedBackgroundColor, EnumC29847f style, C33252i shape, InterfaceC39332e iconTintColor, InterfaceC39332e textColor) {
        AbstractC22676k.m65750j(highlightedBackgroundColor, "highlightedBackgroundColor");
        AbstractC22676k.m65750j(shape, "shape");
        AbstractC22676k.m65750j(iconTintColor, "iconTintColor");
        AbstractC22676k.m65750j(textColor, "textColor");
        return new C29846e(iconBackgroundColor, iconBackgroundBrush, highlightedBackgroundColor, style, shape, iconTintColor, textColor);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC17911t getHighlightedBackgroundColor() {
        return this.highlightedBackgroundColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC17911t getIconBackgroundBrush() {
        return this.iconBackgroundBrush;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC39332e getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29846e)) {
            return false;
        }
        C29846e c29846e = (C29846e) other;
        return AbstractC22676k.m65745e(this.iconBackgroundColor, c29846e.iconBackgroundColor) && AbstractC22676k.m65745e(this.iconBackgroundBrush, c29846e.iconBackgroundBrush) && AbstractC22676k.m65745e(this.highlightedBackgroundColor, c29846e.highlightedBackgroundColor) && this.style == c29846e.style && AbstractC22676k.m65745e(this.shape, c29846e.shape) && AbstractC22676k.m65745e(this.iconTintColor, c29846e.iconTintColor) && AbstractC22676k.m65745e(this.textColor, c29846e.textColor);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC39332e getIconTintColor() {
        return this.iconTintColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C33252i getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC29847f getStyle() {
        return this.style;
    }

    public int hashCode() {
        InterfaceC39332e interfaceC39332e = this.iconBackgroundColor;
        int iHashCode = (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode()) * 31;
        AbstractC17911t abstractC17911t = this.iconBackgroundBrush;
        int iHashCode2 = (this.highlightedBackgroundColor.hashCode() + ((iHashCode + (abstractC17911t == null ? 0 : abstractC17911t.hashCode())) * 31)) * 31;
        EnumC29847f enumC29847f = this.style;
        return this.textColor.hashCode() + AbstractC33745d.m106648g(this.iconTintColor, (this.shape.hashCode() + ((iHashCode2 + (enumC29847f != null ? enumC29847f.hashCode() : 0)) * 31)) * 31, 31);
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC39332e m91377i(boolean isHighlighted) {
        if (isHighlighted && this.style == EnumC29847f.ADVANCED_LABS) {
            return p745y81.Function1.m125323a(d.f121990w);
        }
        return (!isHighlighted || this.style == EnumC29847f.DOWNGRADE) ? p745y81.Function1.m125323a(e.f121991w) : this.textColor;
    }

    public String toString() {
        return "MembershipComparisonTableCellViewStateStyle(iconBackgroundColor=" + this.iconBackgroundColor + ", iconBackgroundBrush=" + this.iconBackgroundBrush + ", highlightedBackgroundColor=" + this.highlightedBackgroundColor + ", style=" + this.style + ", shape=" + this.shape + ", iconTintColor=" + this.iconTintColor + ", textColor=" + this.textColor + ")";
    }

    public C29846e(InterfaceC39332e interfaceC39332e, AbstractC17911t abstractC17911t, AbstractC17911t abstractC17911t2, EnumC29847f enumC29847f, C33252i c33252i, InterfaceC39332e interfaceC39332e2, InterfaceC39332e interfaceC39332e3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC39332e, (i13 & 2) != 0 ? null : abstractC17911t, (i13 & 4) != 0 ? C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4289577677L)), new C17919x(AbstractC17918w0.m51517e(4289577677L))), 0.0f, 0.0f, 14) : abstractC17911t2, (i13 & 8) != 0 ? null : enumC29847f, (i13 & 16) != 0 ? AbstractC33253j.f138651a : c33252i, (i13 & 32) != 0 ? p745y81.Function1.m125323a(a.f121985w) : interfaceC39332e2, (i13 & 64) != 0 ? p745y81.Function1.m125323a(b.f121986w) : interfaceC39332e3);
    }
}
