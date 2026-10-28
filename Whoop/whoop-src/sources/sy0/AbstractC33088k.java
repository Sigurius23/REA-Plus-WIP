package sy0;

import b91.AbstractC2890e;
import b91.C2886a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import p026b2.C2299e;
import p026b2.InterfaceC2300f;
import p026b2.InterfaceC2301g;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: sy0.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\t\n\u000b\f\r\u000e\u000f\u0010\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m65681d2 = {"Lsy0/k;", "", "Lb91/a;", "style", "<init>", "(Lb91/a;)V", "a", "Lb91/a;", "()Lb91/a;", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "g", "f", "e", "d", "b", "Lsy0/k$a;", "Lsy0/k$b;", "Lsy0/k$c;", "Lsy0/k$d;", "Lsy0/k$e;", "Lsy0/k$f;", "Lsy0/k$g;", "Lsy0/k$h;", "Lsy0/k$i;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33088k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C2886a style;

    /* JADX INFO: renamed from: sy0.k$a */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"¨\u0006#"}, m65681d2 = {"Lsy0/k$a;", "Lsy0/k;", "Li2/x;", "linkColor", "Lb91/a;", "textStyle", "Lb2/f;", "horizontalAlignment", "", "trimStartGutter", "<init>", "(Li2/x;Lb91/a;Lb2/f;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Li2/x;", "c", "()Li2/x;", "Lb91/a;", "getTextStyle", "()Lb91/a;", "d", "Lb2/f;", "()Lb2/f;", "e", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC33088k {

        /* JADX INFO: renamed from: f */
        public static final int f137977f = 0;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C17919x linkColor;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C2886a textStyle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC2300f horizontalAlignment;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean trimStartGutter;

        public /* synthetic */ a(C17919x c17919x, C2886a c2886a, InterfaceC2300f interfaceC2300f, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
            this(c17919x, c2886a, interfaceC2300f, z4);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC2300f getHorizontalAlignment() {
            return this.horizontalAlignment;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C17919x getLinkColor() {
            return this.linkColor;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getTrimStartGutter() {
            return this.trimStartGutter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.linkColor, aVar.linkColor) && AbstractC22676k.m65745e(this.textStyle, aVar.textStyle) && AbstractC22676k.m65745e(this.horizontalAlignment, aVar.horizontalAlignment) && this.trimStartGutter == aVar.trimStartGutter;
        }

        public int hashCode() {
            C17919x c17919x = this.linkColor;
            int iM31984c = AbstractC11895b.m31984c(this.textStyle, (c17919x == null ? 0 : Long.hashCode(c17919x.f69639a)) * 31, 31);
            InterfaceC2300f interfaceC2300f = this.horizontalAlignment;
            return Boolean.hashCode(this.trimStartGutter) + ((iM31984c + (interfaceC2300f != null ? interfaceC2300f.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "MarkdownCheckbox(linkColor=" + this.linkColor + ", textStyle=" + this.textStyle + ", horizontalAlignment=" + this.horizontalAlignment + ", trimStartGutter=" + this.trimStartGutter + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private a(C17919x c17919x, C2886a textStyle, InterfaceC2300f interfaceC2300f, boolean z4) {
            super(textStyle, null);
            AbstractC22676k.m65750j(textStyle, "textStyle");
            this.linkColor = c17919x;
            this.textStyle = textStyle;
            this.horizontalAlignment = interfaceC2300f;
            this.trimStartGutter = z4;
        }

        public /* synthetic */ a(C17919x c17919x, C2886a c2886a, InterfaceC2300f interfaceC2300f, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : c17919x, (i13 & 2) != 0 ? AbstractC2890e.m8450e().getB1() : c2886a, (i13 & 4) != 0 ? null : interfaceC2300f, (i13 & 8) != 0 ? false : z4, null);
        }
    }

    /* JADX INFO: renamed from: sy0.k$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lsy0/k$b;", "Lsy0/k;", "Lkd1/o;", "image", "<init>", "(Lkd1/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lkd1/o;", "()Lkd1/o;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC33088k {

        /* JADX INFO: renamed from: c */
        public static final int f137982c = 8;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC22403o image;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC22403o image) {
            super(AbstractC2890e.m8450e().getH4(), null);
            AbstractC22676k.m65750j(image, "image");
            this.image = image;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AbstractC22403o getImage() {
            return this.image;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.image, ((b) other).image);
        }

        public int hashCode() {
            return this.image.hashCode();
        }

        public String toString() {
            return "MultiSelectToggleIconLeft(image=" + this.image + ")";
        }
    }

    /* JADX INFO: renamed from: sy0.k$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsy0/k$c;", "Lsy0/k;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC33088k {

        /* JADX INFO: renamed from: b */
        public static final c f137984b = new c();

        /* JADX INFO: renamed from: c */
        public static final int f137985c = 8;

        private c() {
            super(AbstractC2890e.m8450e().getB1(), null);
        }
    }

    /* JADX INFO: renamed from: sy0.k$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsy0/k$d;", "Lsy0/k;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC33088k {

        /* JADX INFO: renamed from: b */
        public static final d f137986b = new d();

        /* JADX INFO: renamed from: c */
        public static final int f137987c = 8;

        private d() {
            super(AbstractC2890e.m8450e().getN7(), null);
        }
    }

    /* JADX INFO: renamed from: sy0.k$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsy0/k$e;", "Lsy0/k;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC33088k {

        /* JADX INFO: renamed from: b */
        public static final e f137988b = new e();

        /* JADX INFO: renamed from: c */
        public static final int f137989c = 8;

        private e() {
            super(AbstractC2890e.m8450e().getH4(), null);
        }
    }

    /* JADX INFO: renamed from: sy0.k$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsy0/k$f;", "Lsy0/k;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC33088k {

        /* JADX INFO: renamed from: b */
        public static final f f137990b = new f();

        /* JADX INFO: renamed from: c */
        public static final int f137991c = 8;

        private f() {
            super(AbstractC2890e.m8450e().getN8(), null);
        }
    }

    /* JADX INFO: renamed from: sy0.k$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsy0/k$h;", "Lsy0/k;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC33088k {

        /* JADX INFO: renamed from: b */
        public static final h f137995b = new h();

        /* JADX INFO: renamed from: c */
        public static final int f137996c = 8;

        private h() {
            super(AbstractC2890e.m8450e().getFormLabel(), null);
        }
    }

    /* JADX INFO: renamed from: sy0.k$i */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lsy0/k$i;", "Lsy0/k;", "Lb91/a;", "textStyle", "<init>", "(Lb91/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lb91/a;", "getTextStyle", "()Lb91/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC33088k {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C2886a textStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C2886a textStyle) {
            super(textStyle, null);
            AbstractC22676k.m65750j(textStyle, "textStyle");
            this.textStyle = textStyle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && AbstractC22676k.m65745e(this.textStyle, ((i) other).textStyle);
        }

        public int hashCode() {
            return this.textStyle.hashCode();
        }

        public String toString() {
            return "V2Text(textStyle=" + this.textStyle + ")";
        }
    }

    public /* synthetic */ AbstractC33088k(C2886a c2886a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2886a);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C2886a getStyle() {
        return this.style;
    }

    private AbstractC33088k(C2886a c2886a) {
        this.style = c2886a;
    }

    /* JADX INFO: renamed from: sy0.k$g */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lsy0/k$g;", "Lsy0/k;", "Lb91/a;", "textStyle", "Lb2/g;", "verticalAlignment", "<init>", "(Lb91/a;Lb2/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lb91/a;", "getTextStyle", "()Lb91/a;", "c", "Lb2/g;", "()Lb2/g;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC33088k {

        /* JADX INFO: renamed from: d */
        public static final int f137992d = 0;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C2886a textStyle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC2301g verticalAlignment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C2886a textStyle, InterfaceC2301g verticalAlignment) {
            super(textStyle, null);
            AbstractC22676k.m65750j(textStyle, "textStyle");
            AbstractC22676k.m65750j(verticalAlignment, "verticalAlignment");
            this.textStyle = textStyle;
            this.verticalAlignment = verticalAlignment;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC2301g getVerticalAlignment() {
            return this.verticalAlignment;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.textStyle, gVar.textStyle) && AbstractC22676k.m65745e(this.verticalAlignment, gVar.verticalAlignment);
        }

        public int hashCode() {
            return this.verticalAlignment.hashCode() + (this.textStyle.hashCode() * 31);
        }

        public String toString() {
            return "TraditionalText(textStyle=" + this.textStyle + ", verticalAlignment=" + this.verticalAlignment + ")";
        }

        public /* synthetic */ g(C2886a c2886a, InterfaceC2301g interfaceC2301g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? AbstractC2890e.m8450e().getFormLabel() : c2886a, (i13 & 2) != 0 ? C2299e.f9108K : interfaceC2301g);
        }
    }
}
