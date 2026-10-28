package ht2;

import com.whoop.navigation.C9598e;
import p01.C28582b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ht2.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u0019\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001c\u0010\u000e¨\u0006\""}, m65681d2 = {"Lht2/i;", "", "", "title", "Lp01/b;", "circularProgressIndicator", "Lht2/j;", "style", "Lcom/whoop/navigation/e;", "destination", "id", "<init>", "(Ljava/lang/String;Lp01/b;Lht2/j;Lcom/whoop/navigation/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lp01/b;", "()Lp01/b;", "c", "Lht2/j;", "d", "()Lht2/j;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17637i {

    /* JADX INFO: renamed from: f */
    public static final int f68391f = C9598e.f28134d | C28582b.f115652u;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28582b circularProgressIndicator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC17638j style;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String id;

    public C17637i(String title, C28582b circularProgressIndicator, EnumC17638j style, C9598e c9598e, String str) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(circularProgressIndicator, "circularProgressIndicator");
        AbstractC22676k.m65750j(style, "style");
        this.title = title;
        this.circularProgressIndicator = circularProgressIndicator;
        this.style = style;
        this.destination = c9598e;
        this.id = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C28582b getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC17638j getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17637i)) {
            return false;
        }
        C17637i c17637i = (C17637i) other;
        return AbstractC22676k.m65745e(this.title, c17637i.title) && AbstractC22676k.m65745e(this.circularProgressIndicator, c17637i.circularProgressIndicator) && this.style == c17637i.style && AbstractC22676k.m65745e(this.destination, c17637i.destination) && AbstractC22676k.m65745e(this.id, c17637i.id);
    }

    public int hashCode() {
        int iHashCode = (this.style.hashCode() + ((this.circularProgressIndicator.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31;
        C9598e c9598e = this.destination;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        String str = this.id;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        C28582b c28582b = this.circularProgressIndicator;
        EnumC17638j enumC17638j = this.style;
        C9598e c9598e = this.destination;
        String str2 = this.id;
        StringBuilder sb4 = new StringBuilder("WeeklyPlanTileItem(title=");
        sb4.append(str);
        sb4.append(", circularProgressIndicator=");
        sb4.append(c28582b);
        sb4.append(", style=");
        sb4.append(enumC17638j);
        sb4.append(", destination=");
        sb4.append(c9598e);
        sb4.append(", id=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }
}
