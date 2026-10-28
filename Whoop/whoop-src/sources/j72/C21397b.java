package j72;

import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: j72.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0014R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b%\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,¨\u0006-"}, m65681d2 = {"Lj72/b;", "", "Lj72/g;", "screenId", "Lkd1/o;", "imageUrl", "", "title", "subtitle", "", "Lj72/e;", "sections", "checkboxText", "nextButtonText", "buttonNextId", "", "isChecked", "<init>", "(Lj72/g;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj72/g;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lj72/g;", "e", "()Lj72/g;", "b", "Lkd1/o;", "c", "()Lkd1/o;", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "g", "Ljava/util/List;", "f", "()Ljava/util/List;", "i", "Z", "()Z", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21397b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC21402g screenId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o imageUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C21400e> sections;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String checkboxText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String nextButtonText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC21402g buttonNextId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isChecked;

    public C21397b(EnumC21402g screenId, AbstractC22403o imageUrl, String title, String subtitle, List<C21400e> sections, String checkboxText, String nextButtonText, EnumC21402g enumC21402g, boolean z4) {
        AbstractC22676k.m65750j(screenId, "screenId");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(checkboxText, "checkboxText");
        AbstractC22676k.m65750j(nextButtonText, "nextButtonText");
        this.screenId = screenId;
        this.imageUrl = imageUrl;
        this.title = title;
        this.subtitle = subtitle;
        this.sections = sections;
        this.checkboxText = checkboxText;
        this.nextButtonText = nextButtonText;
        this.buttonNextId = enumC21402g;
        this.isChecked = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC21402g getButtonNextId() {
        return this.buttonNextId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCheckboxText() {
        return this.checkboxText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNextButtonText() {
        return this.nextButtonText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC21402g getScreenId() {
        return this.screenId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21397b)) {
            return false;
        }
        C21397b c21397b = (C21397b) other;
        return this.screenId == c21397b.screenId && AbstractC22676k.m65745e(this.imageUrl, c21397b.imageUrl) && AbstractC22676k.m65745e(this.title, c21397b.title) && AbstractC22676k.m65745e(this.subtitle, c21397b.subtitle) && AbstractC22676k.m65745e(this.sections, c21397b.sections) && AbstractC22676k.m65745e(this.checkboxText, c21397b.checkboxText) && AbstractC22676k.m65745e(this.nextButtonText, c21397b.nextButtonText) && this.buttonNextId == c21397b.buttonNextId && this.isChecked == c21397b.isChecked;
    }

    /* JADX INFO: renamed from: f */
    public final List<C21400e> m60112f() {
        return this.sections;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC30007c.m91833c(this.imageUrl, this.screenId.hashCode() * 31, 31), 31, this.title), 31, this.subtitle), 31, this.sections), 31, this.checkboxText), 31, this.nextButtonText);
        EnumC21402g enumC21402g = this.buttonNextId;
        return Boolean.hashCode(this.isChecked) + ((iM30450d + (enumC21402g == null ? 0 : enumC21402g.hashCode())) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public String toString() {
        EnumC21402g enumC21402g = this.screenId;
        AbstractC22403o abstractC22403o = this.imageUrl;
        String str = this.title;
        String str2 = this.subtitle;
        List<C21400e> list = this.sections;
        String str3 = this.checkboxText;
        String str4 = this.nextButtonText;
        EnumC21402g enumC21402g2 = this.buttonNextId;
        boolean z4 = this.isChecked;
        StringBuilder sb4 = new StringBuilder("InfoCheckboxState(screenId=");
        sb4.append(enumC21402g);
        sb4.append(", imageUrl=");
        sb4.append(abstractC22403o);
        sb4.append(", title=");
        AbstractC11266d.m30444B(sb4, str, ", subtitle=", str2, ", sections=");
        AbstractC17176i.m48511m(", checkboxText=", str3, ", nextButtonText=", sb4, list);
        sb4.append(str4);
        sb4.append(", buttonNextId=");
        sb4.append(enumC21402g2);
        sb4.append(", isChecked=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }
}
