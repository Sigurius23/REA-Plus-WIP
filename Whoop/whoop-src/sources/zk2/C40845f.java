package zk2;

import java.util.List;
import n81.C26451d;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: zk2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lzk2/f;", "", "", "Lzk2/g;", "tabs", "", "selectedTagId", "Ln81/d;", "style", "<init>", "(Ljava/util/List;Ljava/lang/String;Ln81/d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "Ln81/d;", "()Ln81/d;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40845f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C40846g> tabs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String selectedTagId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C26451d style;

    public C40845f(List<C40846g> tabs, String selectedTagId, C26451d style) {
        AbstractC22676k.m65750j(tabs, "tabs");
        AbstractC22676k.m65750j(selectedTagId, "selectedTagId");
        AbstractC22676k.m65750j(style, "style");
        this.tabs = tabs;
        this.selectedTagId = selectedTagId;
        this.style = style;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSelectedTagId() {
        return this.selectedTagId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C26451d getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: c */
    public final List<C40846g> m132372c() {
        return this.tabs;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40845f)) {
            return false;
        }
        C40845f c40845f = (C40845f) other;
        return AbstractC22676k.m65745e(this.tabs, c40845f.tabs) && AbstractC22676k.m65745e(this.selectedTagId, c40845f.selectedTagId) && AbstractC22676k.m65745e(this.style, c40845f.style);
    }

    public int hashCode() {
        return this.style.hashCode() + AbstractC11266d.m30450d(this.tabs.hashCode() * 31, 31, this.selectedTagId);
    }

    public String toString() {
        List<C40846g> list = this.tabs;
        String str = this.selectedTagId;
        C26451d c26451d = this.style;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("SwipeableTagGroupState(tabs=", ", selectedTagId=", str, ", style=", list);
        sbM79507k.append(c26451d);
        sbM79507k.append(")");
        return sbM79507k.toString();
    }

    public /* synthetic */ C40845f(List list, String str, C26451d c26451d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 4) != 0) {
            c26451d = new C26451d(null, null, null, 7, null);
        }
        this(list, str, c26451d);
    }
}
