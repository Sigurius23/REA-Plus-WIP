package ld0;

import androidx.core.app.NotificationCompat;
import ih0.AbstractC18489d0;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ld0.o */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, m65681d2 = {"Lld0/o;", "", "", "title", "subtitle", "Lld0/n;", NotificationCompat.CATEGORY_STATUS, "", "Lm91/u;", "items", "", "isExpanded", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lld0/n;Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "Lld0/n;", "()Lld0/n;", "Ljava/util/List;", "()Ljava/util/List;", "e", "Z", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23856o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC23855n status;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isExpanded;

    /* JADX WARN: Multi-variable type inference failed */
    public C23856o(String title, String str, EnumC23855n status, List<? extends InterfaceC25312u> items, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(items, "items");
        this.title = title;
        this.subtitle = str;
        this.status = status;
        this.items = items;
        this.isExpanded = z4;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m70088a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC23855n getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23856o)) {
            return false;
        }
        C23856o c23856o = (C23856o) other;
        return AbstractC22676k.m65745e(this.title, c23856o.title) && AbstractC22676k.m65745e(this.subtitle, c23856o.subtitle) && this.status == c23856o.status && AbstractC22676k.m65745e(this.items, c23856o.items) && this.isExpanded == c23856o.isExpanded;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        return Boolean.hashCode(this.isExpanded) + AbstractC11895b.m31983b((this.status.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.items);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        EnumC23855n enumC23855n = this.status;
        List<InterfaceC25312u> list = this.items;
        boolean z4 = this.isExpanded;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ChecklistStepViewState(title=", str, ", subtitle=", str2, ", status=");
        sbM32001t.append(enumC23855n);
        sbM32001t.append(", items=");
        sbM32001t.append(list);
        sbM32001t.append(", isExpanded=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }
}
