package c41;

import b91.AbstractC2890e;
import b91.C2886a;
import b91.InterfaceC2887b;
import com.whoop.design.models.DesignSystemEnum;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import p294l3.C23285v0;
import p392p3.AbstractC28771i;
import p392p3.C28780r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;
import v63.AbstractC35745c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NO_DATA' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: c41.h1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002BQ\b\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010,\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&j\u0002\b.j\u0002\b/j\u0002\b0¨\u00061"}, m65681d2 = {"Lc41/h1;", "Lcom/whoop/design/models/DesignSystemEnum;", "", "Lcom/whoop/design/util/TextResource;", "textDefault", "Lp3/i;", "fontFamily", "Lp3/r;", "fontWeight", "Ly3/o;", "fontSize", "lineHeight", "letterSpacing", "Lw3/k;", "textAlign", "Ly81/f;", "textColor", "<init>", "(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Lp3/i;Lp3/r;JJJILy81/f;)V", "Lcom/whoop/design/util/TextResource;", "getTextDefault", "()Lcom/whoop/design/util/TextResource;", "Lp3/i;", "getFontFamily", "()Lp3/i;", "Lp3/r;", "getFontWeight", "()Lp3/r;", "J", "getFontSize-XSAIIZE", "()J", "getLineHeight-XSAIIZE", "getLetterSpacing-XSAIIZE", "I", "getTextAlign-e0LSkKk", "()I", "Ly81/f;", "getTextColor", "()Ly81/f;", "Lb91/a;", "textStyle", "Lb91/a;", "getTextStyle", "()Lb91/a;", "colorKey", "getColorKey", "NO_DATA", "CALIBRATING", "DATA", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC4035h1 implements DesignSystemEnum {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC4035h1[] $VALUES;
    public static final EnumC4035h1 CALIBRATING;
    public static final EnumC4035h1 DATA;
    public static final EnumC4035h1 NO_DATA;
    private final EnumC39333f colorKey;
    private final AbstractC28771i fontFamily;
    private final long fontSize;
    private final C28780r fontWeight;
    private final long letterSpacing;
    private final long lineHeight;
    private final int textAlign;
    private final EnumC39333f textColor;
    private final TextResource textDefault;
    private final C2886a textStyle;

    private static final /* synthetic */ EnumC4035h1[] $values() {
        return new EnumC4035h1[]{NO_DATA, CALIBRATING, DATA};
    }

    static {
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62293X);
        AbstractC28771i abstractC28771iM8448c = AbstractC2890e.m8448c();
        C28780r c28780r = C28780r.f116542I;
        long jM113246h = AbstractC35745c.m113246h(17);
        long jM113246h2 = AbstractC35745c.m113246h(21);
        EnumC39333f enumC39333f = EnumC39333f.WHITE_70;
        NO_DATA = new EnumC4035h1("NO_DATA", 0, c8688bM21277k, abstractC28771iM8448c, c28780r, jM113246h, jM113246h2, 0L, 0, enumC39333f, 96, null);
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC16277f.f62290W);
        AbstractC28771i abstractC28771iM8449d = AbstractC2890e.m8449d();
        C28780r c28780r2 = C28780r.f116541H;
        CALIBRATING = new EnumC4035h1("CALIBRATING", 1, c8688bM21277k2, abstractC28771iM8449d, c28780r2, AbstractC35745c.m113246h(13), AbstractC35745c.m113246h(16), 0L, 0, enumC39333f, 96, null);
        DATA = new EnumC4035h1("DATA", 2, null, AbstractC2890e.m8448c(), c28780r2, AbstractC35745c.m113246h(17), AbstractC35745c.m113246h(21), 0L, 0, EnumC39333f.BRAND_WHITE, 97, null);
        EnumC4035h1[] enumC4035h1Arr$values = $values();
        $VALUES = enumC4035h1Arr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC4035h1Arr$values);
    }

    private EnumC4035h1(String str, int i13, TextResource textResource, AbstractC28771i abstractC28771i, C28780r c28780r, long j7, long j13, long j14, int i14, EnumC39333f enumC39333f) {
        super(str, i13);
        this.textDefault = textResource;
        this.fontFamily = abstractC28771i;
        this.fontWeight = c28780r;
        this.fontSize = j7;
        this.lineHeight = j13;
        this.letterSpacing = j14;
        this.textAlign = i14;
        this.textColor = enumC39333f;
        this.textStyle = new C2886a(new C23285v0(0L, j7, c28780r, null, abstractC28771i, j14, null, null, i14, j13, 16613209), InterfaceC2887b.j.f11510a);
        this.colorKey = enumC39333f;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4035h1 valueOf(String str) {
        return (EnumC4035h1) Enum.valueOf(EnumC4035h1.class, str);
    }

    public static EnumC4035h1[] values() {
        return (EnumC4035h1[]) $VALUES.clone();
    }

    public final EnumC39333f getColorKey() {
        return this.colorKey;
    }

    public final AbstractC28771i getFontFamily() {
        return this.fontFamily;
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name and from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    public final C28780r getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name and from getter */
    public final long getLetterSpacing() {
        return this.letterSpacing;
    }

    /* JADX INFO: renamed from: getLineHeight-XSAIIZE, reason: not valid java name and from getter */
    public final long getLineHeight() {
        return this.lineHeight;
    }

    /* JADX INFO: renamed from: getTextAlign-e0LSkKk, reason: not valid java name and from getter */
    public final int getTextAlign() {
        return this.textAlign;
    }

    public final EnumC39333f getTextColor() {
        return this.textColor;
    }

    public final TextResource getTextDefault() {
        return this.textDefault;
    }

    public final C2886a getTextStyle() {
        return this.textStyle;
    }

    public /* synthetic */ EnumC4035h1(String str, int i13, TextResource textResource, AbstractC28771i abstractC28771i, C28780r c28780r, long j7, long j13, long j14, int i14, EnumC39333f enumC39333f, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (i15 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i15 & 2) != 0 ? AbstractC2890e.m8449d() : abstractC28771i, c28780r, j7, j13, (i15 & 32) != 0 ? AbstractC35745c.m113246h(0) : j14, (i15 & 64) != 0 ? 2 : i14, enumC39333f);
    }
}
