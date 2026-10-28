package fm1;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fm1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lfm1/c;", "", "", "Lfm1/f;", "pillarContentList", "Lfm1/d;", "homeMetaData", "<init>", "(Ljava/util/List;Lfm1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lfm1/d;", "()Lfm1/d;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14599c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C14602f> pillarContentList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14600d homeMetaData;

    public C14599c(List<C14602f> pillarContentList, C14600d homeMetaData) {
        AbstractC22676k.m65750j(pillarContentList, "pillarContentList");
        AbstractC22676k.m65750j(homeMetaData, "homeMetaData");
        this.pillarContentList = pillarContentList;
        this.homeMetaData = homeMetaData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C14600d getHomeMetaData() {
        return this.homeMetaData;
    }

    /* JADX INFO: renamed from: b */
    public final List<C14602f> m41769b() {
        return this.pillarContentList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14599c)) {
            return false;
        }
        C14599c c14599c = (C14599c) other;
        return AbstractC22676k.m65745e(this.pillarContentList, c14599c.pillarContentList) && AbstractC22676k.m65745e(this.homeMetaData, c14599c.homeMetaData);
    }

    public int hashCode() {
        return this.homeMetaData.hashCode() + (this.pillarContentList.hashCode() * 31);
    }

    public String toString() {
        return "HomeFeed(pillarContentList=" + this.pillarContentList + ", homeMetaData=" + this.homeMetaData + ")";
    }
}
