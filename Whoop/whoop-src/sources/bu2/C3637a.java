package bu2;

import b91.AbstractC2890e;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p026b2.C2299e;
import p026b2.InterfaceC2300f;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: bu2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b,\u0010!R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b\"\u0010'R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b.\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b\u001e\u00100R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b#\u00101\u001a\u0004\b$\u00102¨\u00063"}, m65681d2 = {"Lbu2/a;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "targetText", "targetTextSuffix", "Ly81/e;", "targetColor", "Lb91/a;", "targetTextStyle", "targetTextSuffixStyle", "labelText", "labelColor", "labelTextStyle", "Lb2/f;", "goalAlignment", "Lbu2/c;", "labelPosition", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;Lb91/a;Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;Lb2/f;Lbu2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "b", "j", "c", "Ly81/e;", "g", "()Ly81/e;", "d", "Lb91/a;", "i", "()Lb91/a;", "e", "k", "f", "Lb2/f;", "()Lb2/f;", "Lbu2/c;", "()Lbu2/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3637a implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource targetText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource targetTextSuffix;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e targetColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C2886a targetTextStyle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C2886a targetTextSuffixStyle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource labelText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC39332e labelColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C2886a labelTextStyle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC2300f goalAlignment;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC3641c labelPosition;

    /* JADX INFO: renamed from: bu2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f14812w = new a();

        /* JADX INFO: renamed from: a */
        public final long m11209a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m11209a((C39336i) obj));
        }
    }

    public C3637a(TextResource targetText, TextResource textResource, InterfaceC39332e targetColor, C2886a targetTextStyle, C2886a c2886a, TextResource labelText, InterfaceC39332e labelColor, C2886a labelTextStyle, InterfaceC2300f goalAlignment, EnumC3641c labelPosition) {
        AbstractC22676k.m65750j(targetText, "targetText");
        AbstractC22676k.m65750j(targetColor, "targetColor");
        AbstractC22676k.m65750j(targetTextStyle, "targetTextStyle");
        AbstractC22676k.m65750j(labelText, "labelText");
        AbstractC22676k.m65750j(labelColor, "labelColor");
        AbstractC22676k.m65750j(labelTextStyle, "labelTextStyle");
        AbstractC22676k.m65750j(goalAlignment, "goalAlignment");
        AbstractC22676k.m65750j(labelPosition, "labelPosition");
        this.targetText = targetText;
        this.targetTextSuffix = textResource;
        this.targetColor = targetColor;
        this.targetTextStyle = targetTextStyle;
        this.targetTextSuffixStyle = c2886a;
        this.labelText = labelText;
        this.labelColor = labelColor;
        this.labelTextStyle = labelTextStyle;
        this.goalAlignment = goalAlignment;
        this.labelPosition = labelPosition;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC2300f getGoalAlignment() {
        return this.goalAlignment;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getLabelColor() {
        return this.labelColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC3641c getLabelPosition() {
        return this.labelPosition;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getLabelText() {
        return this.labelText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3637a)) {
            return false;
        }
        C3637a c3637a = (C3637a) other;
        return AbstractC22676k.m65745e(this.targetText, c3637a.targetText) && AbstractC22676k.m65745e(this.targetTextSuffix, c3637a.targetTextSuffix) && AbstractC22676k.m65745e(this.targetColor, c3637a.targetColor) && AbstractC22676k.m65745e(this.targetTextStyle, c3637a.targetTextStyle) && AbstractC22676k.m65745e(this.targetTextSuffixStyle, c3637a.targetTextSuffixStyle) && AbstractC22676k.m65745e(this.labelText, c3637a.labelText) && AbstractC22676k.m65745e(this.labelColor, c3637a.labelColor) && AbstractC22676k.m65745e(this.labelTextStyle, c3637a.labelTextStyle) && AbstractC22676k.m65745e(this.goalAlignment, c3637a.goalAlignment) && this.labelPosition == c3637a.labelPosition;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C2886a getLabelTextStyle() {
        return this.labelTextStyle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC39332e getTargetColor() {
        return this.targetColor;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getTargetText() {
        return this.targetText;
    }

    public int hashCode() {
        int iHashCode = this.targetText.hashCode() * 31;
        TextResource textResource = this.targetTextSuffix;
        int iM31984c = AbstractC11895b.m31984c(this.targetTextStyle, AbstractC33745d.m106648g(this.targetColor, (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31, 31), 31);
        C2886a c2886a = this.targetTextSuffixStyle;
        return this.labelPosition.hashCode() + ((this.goalAlignment.hashCode() + AbstractC11895b.m31984c(this.labelTextStyle, AbstractC33745d.m106648g(this.labelColor, AbstractC31061c.m95625a((iM31984c + (c2886a != null ? c2886a.hashCode() : 0)) * 31, this.labelText, 31), 31), 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C2886a getTargetTextStyle() {
        return this.targetTextStyle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getTargetTextSuffix() {
        return this.targetTextSuffix;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C2886a getTargetTextSuffixStyle() {
        return this.targetTextSuffixStyle;
    }

    public String toString() {
        TextResource textResource = this.targetText;
        TextResource textResource2 = this.targetTextSuffix;
        InterfaceC39332e interfaceC39332e = this.targetColor;
        C2886a c2886a = this.targetTextStyle;
        C2886a c2886a2 = this.targetTextSuffixStyle;
        TextResource textResource3 = this.labelText;
        InterfaceC39332e interfaceC39332e2 = this.labelColor;
        C2886a c2886a3 = this.labelTextStyle;
        InterfaceC2300f interfaceC2300f = this.goalAlignment;
        EnumC3641c enumC3641c = this.labelPosition;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("GoalInfoItemState(targetText=", textResource, ", targetTextSuffix=", textResource2, ", targetColor=");
        sbM106658q.append(interfaceC39332e);
        sbM106658q.append(", targetTextStyle=");
        sbM106658q.append(c2886a);
        sbM106658q.append(", targetTextSuffixStyle=");
        sbM106658q.append(c2886a2);
        sbM106658q.append(", labelText=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", labelColor=");
        sbM106658q.append(interfaceC39332e2);
        sbM106658q.append(", labelTextStyle=");
        sbM106658q.append(c2886a3);
        sbM106658q.append(", goalAlignment=");
        sbM106658q.append(interfaceC2300f);
        sbM106658q.append(", labelPosition=");
        sbM106658q.append(enumC3641c);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C3637a(TextResource textResource, TextResource textResource2, InterfaceC39332e interfaceC39332e, C2886a c2886a, C2886a c2886a2, TextResource textResource3, InterfaceC39332e interfaceC39332e2, C2886a c2886a3, InterfaceC2300f interfaceC2300f, EnumC3641c enumC3641c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, (i13 & 2) != 0 ? null : textResource2, interfaceC39332e, (i13 & 8) != 0 ? AbstractC2890e.m8450e().getN4() : c2886a, (i13 & 16) != 0 ? null : c2886a2, (i13 & 32) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 64) != 0 ? p745y81.Function1.m125323a(a.f14812w) : interfaceC39332e2, (i13 & 128) != 0 ? AbstractC2890e.m8450e().getH6() : c2886a3, (i13 & 256) != 0 ? C2299e.f9112O : interfaceC2300f, (i13 & 512) != 0 ? EnumC3641c.BOTTOM : enumC3641c);
    }
}
