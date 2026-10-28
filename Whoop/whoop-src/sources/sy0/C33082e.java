package sy0;

import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: sy0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010JZ\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, m65681d2 = {"Lsy0/e;", "Lm91/u;", "", "id", "label", "", "isToggled", "Lsy0/k;", "checkboxType", "Lsy0/a;", "toggleInteraction", "", "spacerSize", "Ly81/f;", "toggledColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLsy0/k;Lsy0/a;Ljava/lang/Integer;Ly81/f;)V", "a", "(Ljava/lang/String;Ljava/lang/String;ZLsy0/k;Lsy0/a;Ljava/lang/Integer;Ly81/f;)Lsy0/e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "e", "c", "Z", "i", "()Z", "d", "Lsy0/k;", "()Lsy0/k;", "Lsy0/a;", "g", "()Lsy0/a;", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Ly81/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33082e implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f137950h = GenericInteraction.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isToggled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC33088k checkboxType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C33078a toggleInteraction;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Integer spacerSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC39333f toggledColor;

    public C33082e(String id4, String label, boolean z4, AbstractC33088k checkboxType, C33078a c33078a, Integer num, EnumC39333f toggledColor) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(checkboxType, "checkboxType");
        AbstractC22676k.m65750j(toggledColor, "toggledColor");
        this.id = id4;
        this.label = label;
        this.isToggled = z4;
        this.checkboxType = checkboxType;
        this.toggleInteraction = c33078a;
        this.spacerSize = num;
        this.toggledColor = toggledColor;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C33082e m104796b(C33082e c33082e, String str, String str2, boolean z4, AbstractC33088k abstractC33088k, C33078a c33078a, Integer num, EnumC39333f enumC39333f, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c33082e.id;
        }
        if ((i13 & 2) != 0) {
            str2 = c33082e.label;
        }
        if ((i13 & 4) != 0) {
            z4 = c33082e.isToggled;
        }
        if ((i13 & 8) != 0) {
            abstractC33088k = c33082e.checkboxType;
        }
        if ((i13 & 16) != 0) {
            c33078a = c33082e.toggleInteraction;
        }
        if ((i13 & 32) != 0) {
            num = c33082e.spacerSize;
        }
        if ((i13 & 64) != 0) {
            enumC39333f = c33082e.toggledColor;
        }
        Integer num2 = num;
        EnumC39333f enumC39333f2 = enumC39333f;
        C33078a c33078a2 = c33078a;
        boolean z13 = z4;
        return c33082e.m104797a(str, str2, z13, abstractC33088k, c33078a2, num2, enumC39333f2);
    }

    /* JADX INFO: renamed from: a */
    public final C33082e m104797a(String id4, String label, boolean isToggled, AbstractC33088k checkboxType, C33078a toggleInteraction, Integer spacerSize, EnumC39333f toggledColor) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(checkboxType, "checkboxType");
        AbstractC22676k.m65750j(toggledColor, "toggledColor");
        return new C33082e(id4, label, isToggled, checkboxType, toggleInteraction, spacerSize, toggledColor);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC33088k getCheckboxType() {
        return this.checkboxType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33082e)) {
            return false;
        }
        C33082e c33082e = (C33082e) other;
        return AbstractC22676k.m65745e(this.id, c33082e.id) && AbstractC22676k.m65745e(this.label, c33082e.label) && this.isToggled == c33082e.isToggled && AbstractC22676k.m65745e(this.checkboxType, c33082e.checkboxType) && AbstractC22676k.m65745e(this.toggleInteraction, c33082e.toggleInteraction) && AbstractC22676k.m65745e(this.spacerSize, c33082e.spacerSize) && this.toggledColor == c33082e.toggledColor;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getSpacerSize() {
        return this.spacerSize;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C33078a getToggleInteraction() {
        return this.toggleInteraction;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC39333f getToggledColor() {
        return this.toggledColor;
    }

    public int hashCode() {
        int iHashCode = (this.checkboxType.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.label), 31, this.isToggled)) * 31;
        C33078a c33078a = this.toggleInteraction;
        int iHashCode2 = (iHashCode + (c33078a == null ? 0 : c33078a.hashCode())) * 31;
        Integer num = this.spacerSize;
        return this.toggledColor.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsToggled() {
        return this.isToggled;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.label;
        boolean z4 = this.isToggled;
        AbstractC33088k abstractC33088k = this.checkboxType;
        C33078a c33078a = this.toggleInteraction;
        Integer num = this.spacerSize;
        EnumC39333f enumC39333f = this.toggledColor;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CheckboxViewState(id=", str, ", label=", str2, ", isToggled=");
        sbM32001t.append(z4);
        sbM32001t.append(", checkboxType=");
        sbM32001t.append(abstractC33088k);
        sbM32001t.append(", toggleInteraction=");
        sbM32001t.append(c33078a);
        sbM32001t.append(", spacerSize=");
        sbM32001t.append(num);
        sbM32001t.append(", toggledColor=");
        return AbstractC21702c.m61138i(sbM32001t, enumC39333f, ")");
    }

    public /* synthetic */ C33082e(String str, String str2, boolean z4, AbstractC33088k abstractC33088k, C33078a c33078a, Integer num, EnumC39333f enumC39333f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z4, (i13 & 8) != 0 ? new AbstractC33088k.a(null, null, null, false, 15, null) : abstractC33088k, (i13 & 16) != 0 ? null : c33078a, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f);
    }
}
