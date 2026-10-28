package m72;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: m72.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010 ¨\u0006!"}, m65681d2 = {"Lm72/i;", "", "", "titleDisplay", "Lm72/h;", "titleStyle", "subtitleDisplay", "", "Lm91/u;", "items", "<init>", "(Ljava/lang/String;Lm72/h;Ljava/lang/String;Ljava/util/List;)V", "a", "(Ljava/lang/String;Lm72/h;Ljava/lang/String;Ljava/util/List;)Lm72/i;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Lm72/h;", "f", "()Lm72/h;", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25210i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC25209h titleStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subtitleDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX WARN: Multi-variable type inference failed */
    public C25210i(String str, EnumC25209h titleStyle, String str2, List<? extends InterfaceC25312u> items) {
        AbstractC22676k.m65750j(titleStyle, "titleStyle");
        AbstractC22676k.m65750j(items, "items");
        this.titleDisplay = str;
        this.titleStyle = titleStyle;
        this.subtitleDisplay = str2;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C25210i m73829b(C25210i c25210i, String str, EnumC25209h enumC25209h, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c25210i.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            enumC25209h = c25210i.titleStyle;
        }
        if ((i13 & 4) != 0) {
            str2 = c25210i.subtitleDisplay;
        }
        if ((i13 & 8) != 0) {
            list = c25210i.items;
        }
        return c25210i.m73830a(str, enumC25209h, str2, list);
    }

    /* JADX INFO: renamed from: a */
    public final C25210i m73830a(String titleDisplay, EnumC25209h titleStyle, String subtitleDisplay, List<? extends InterfaceC25312u> items) {
        AbstractC22676k.m65750j(titleStyle, "titleStyle");
        AbstractC22676k.m65750j(items, "items");
        return new C25210i(titleDisplay, titleStyle, subtitleDisplay, items);
    }

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC25312u> m73831c() {
        return this.items;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25210i)) {
            return false;
        }
        C25210i c25210i = (C25210i) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c25210i.titleDisplay) && this.titleStyle == c25210i.titleStyle && AbstractC22676k.m65745e(this.subtitleDisplay, c25210i.subtitleDisplay) && AbstractC22676k.m65745e(this.items, c25210i.items);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC25209h getTitleStyle() {
        return this.titleStyle;
    }

    public int hashCode() {
        String str = this.titleDisplay;
        int iHashCode = (this.titleStyle.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.subtitleDisplay;
        return this.items.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.titleDisplay;
        EnumC25209h enumC25209h = this.titleStyle;
        String str2 = this.subtitleDisplay;
        List<InterfaceC25312u> list = this.items;
        StringBuilder sb4 = new StringBuilder("SectionsViewState(titleDisplay=");
        sb4.append(str);
        sb4.append(", titleStyle=");
        sb4.append(enumC25209h);
        sb4.append(", subtitleDisplay=");
        return AbstractC30007c.m91840j(str2, ", items=", ")", sb4, list);
    }
}
