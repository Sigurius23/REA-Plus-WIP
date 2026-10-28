package rt1;

import com.whoop.design.util.TextResource;
import java.util.List;
import m83.AbstractC25260n;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import rs1.AbstractC31794f;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: rt1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, m65681d2 = {"Lrt1/j;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "Lrt1/f;", "symptoms", "primaryButtonText", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "()Ljava/util/List;", "d", "getPrimaryButtonText", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31812j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<EnumC31808f> symptoms;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource primaryButtonText;

    /* JADX WARN: Multi-variable type inference failed */
    public C31812j(TextResource title, TextResource subtitle, List<? extends EnumC31808f> symptoms, TextResource primaryButtonText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(symptoms, "symptoms");
        AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
        this.title = title;
        this.subtitle = subtitle;
        this.symptoms = symptoms;
        this.primaryButtonText = primaryButtonText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: b */
    public final List<EnumC31808f> m98866b() {
        return this.symptoms;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31812j)) {
            return false;
        }
        C31812j c31812j = (C31812j) other;
        return AbstractC22676k.m65745e(this.title, c31812j.title) && AbstractC22676k.m65745e(this.subtitle, c31812j.subtitle) && AbstractC22676k.m65745e(this.symptoms, c31812j.symptoms) && AbstractC22676k.m65745e(this.primaryButtonText, c31812j.primaryButtonText);
    }

    public int hashCode() {
        return this.primaryButtonText.hashCode() + AbstractC11895b.m31983b(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), 31, this.symptoms);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        List<EnumC31808f> list = this.symptoms;
        TextResource textResource3 = this.primaryButtonText;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("SymptomsBottomSheetContentViewState(title=", textResource, ", subtitle=", textResource2, ", symptoms=");
        sbM106658q.append(list);
        sbM106658q.append(", primaryButtonText=");
        sbM106658q.append(textResource3);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C31812j(TextResource textResource, TextResource textResource2, List list, TextResource textResource3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new TextResource.C8688b(AbstractC31794f.f131682s0, null, 2, null) : textResource, (i13 & 2) != 0 ? new TextResource.C8688b(AbstractC31794f.f131680r0, null, 2, null) : textResource2, (i13 & 4) != 0 ? AbstractC25260n.m74049W0(EnumC31808f.values()) : list, (i13 & 8) != 0 ? new TextResource.C8688b(AbstractC31794f.f131659h, null, 2, null) : textResource3);
    }
}
