package f90;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: f90.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\\\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b \u0010'R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b)\u0010\u0015¨\u0006*"}, m65681d2 = {"Lf90/c;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lkd1/o;", "image", "pickerText", "", "", "codeAmountDisplayValues", "disclaimerText", "", "selectedCodesAmount", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;I)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;I)Lf90/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Lkd1/o;", "f", "()Lkd1/o;", "g", "e", "Ljava/util/List;", "()Ljava/util/List;", "I", "getSelectedCodesAmount", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14282c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource pickerText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<String> codeAmountDisplayValues;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource disclaimerText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int selectedCodesAmount;

    public C14282c(TextResource title, TextResource subtitle, AbstractC22403o image, TextResource pickerText, List<String> codeAmountDisplayValues, TextResource disclaimerText, int i13) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(pickerText, "pickerText");
        AbstractC22676k.m65750j(codeAmountDisplayValues, "codeAmountDisplayValues");
        AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;
        this.pickerText = pickerText;
        this.codeAmountDisplayValues = codeAmountDisplayValues;
        this.disclaimerText = disclaimerText;
        this.selectedCodesAmount = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C14282c m40777b(C14282c c14282c, TextResource textResource, TextResource textResource2, AbstractC22403o abstractC22403o, TextResource textResource3, List list, TextResource textResource4, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            textResource = c14282c.title;
        }
        if ((i14 & 2) != 0) {
            textResource2 = c14282c.subtitle;
        }
        if ((i14 & 4) != 0) {
            abstractC22403o = c14282c.image;
        }
        if ((i14 & 8) != 0) {
            textResource3 = c14282c.pickerText;
        }
        if ((i14 & 16) != 0) {
            list = c14282c.codeAmountDisplayValues;
        }
        if ((i14 & 32) != 0) {
            textResource4 = c14282c.disclaimerText;
        }
        if ((i14 & 64) != 0) {
            i13 = c14282c.selectedCodesAmount;
        }
        TextResource textResource5 = textResource4;
        int i15 = i13;
        List list2 = list;
        AbstractC22403o abstractC22403o2 = abstractC22403o;
        return c14282c.m40778a(textResource, textResource2, abstractC22403o2, textResource3, list2, textResource5, i15);
    }

    /* JADX INFO: renamed from: a */
    public final C14282c m40778a(TextResource title, TextResource subtitle, AbstractC22403o image, TextResource pickerText, List<String> codeAmountDisplayValues, TextResource disclaimerText, int selectedCodesAmount) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(pickerText, "pickerText");
        AbstractC22676k.m65750j(codeAmountDisplayValues, "codeAmountDisplayValues");
        AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
        return new C14282c(title, subtitle, image, pickerText, codeAmountDisplayValues, disclaimerText, selectedCodesAmount);
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m40779c() {
        return this.codeAmountDisplayValues;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getDisclaimerText() {
        return this.disclaimerText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14282c)) {
            return false;
        }
        C14282c c14282c = (C14282c) other;
        return AbstractC22676k.m65745e(this.title, c14282c.title) && AbstractC22676k.m65745e(this.subtitle, c14282c.subtitle) && AbstractC22676k.m65745e(this.image, c14282c.image) && AbstractC22676k.m65745e(this.pickerText, c14282c.pickerText) && AbstractC22676k.m65745e(this.codeAmountDisplayValues, c14282c.codeAmountDisplayValues) && AbstractC22676k.m65745e(this.disclaimerText, c14282c.disclaimerText) && this.selectedCodesAmount == c14282c.selectedCodesAmount;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getPickerText() {
        return this.pickerText;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Integer.hashCode(this.selectedCodesAmount) + AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC30007c.m91833c(this.image, AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), 31), this.pickerText, 31), 31, this.codeAmountDisplayValues), this.disclaimerText, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        AbstractC22403o abstractC22403o = this.image;
        TextResource textResource3 = this.pickerText;
        List<String> list = this.codeAmountDisplayValues;
        TextResource textResource4 = this.disclaimerText;
        int i13 = this.selectedCodesAmount;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("GiftScreenViewState(title=", textResource, ", subtitle=", textResource2, ", image=");
        AbstractC13673n.m38549A(sbM106658q, abstractC22403o, ", pickerText=", textResource3, ", codeAmountDisplayValues=");
        AbstractC30007c.m91852v(textResource4, ", disclaimerText=", ", selectedCodesAmount=", sbM106658q, list);
        return AbstractC18489d0.m53371l(sbM106658q, i13, ")");
    }

    public /* synthetic */ C14282c(TextResource textResource, TextResource textResource2, AbstractC22403o abstractC22403o, TextResource textResource3, List list, TextResource textResource4, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, abstractC22403o, textResource3, list, textResource4, (i14 & 64) != 0 ? 0 : i13);
    }
}
