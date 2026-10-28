package zm1;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import java.util.List;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: zm1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001b\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+¨\u0006,"}, m65681d2 = {"Lzm1/f;", "Lm91/u;", "Lgz0/m0;", "icon", "Lcom/whoop/design/util/TextResource;", "title", "body", "Lzm1/a;", "dailyProgress", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "", "Lzm1/b;", "progressList", "<init>", "(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lzm1/a;Lcom/whoop/navigation/e;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "c", "()Lgz0/m0;", "b", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "d", "Lzm1/a;", "()Lzm1/a;", "e", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "f", "Ljava/util/List;", "()Ljava/util/List;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40895f implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource body;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C40890a dailyProgress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9598e navigation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C40891b> progressList;

    public C40895f(EnumC16313m0 enumC16313m0, TextResource title, TextResource body, C40890a dailyProgress, C9598e navigation, List<C40891b> progressList) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(dailyProgress, "dailyProgress");
        AbstractC22676k.m65750j(navigation, "navigation");
        AbstractC22676k.m65750j(progressList, "progressList");
        this.icon = enumC16313m0;
        this.title = title;
        this.body = body;
        this.dailyProgress = dailyProgress;
        this.navigation = navigation;
        this.progressList = progressList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C40890a getDailyProgress() {
        return this.dailyProgress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40895f)) {
            return false;
        }
        C40895f c40895f = (C40895f) other;
        return this.icon == c40895f.icon && AbstractC22676k.m65745e(this.title, c40895f.title) && AbstractC22676k.m65745e(this.body, c40895f.body) && AbstractC22676k.m65745e(this.dailyProgress, c40895f.dailyProgress) && AbstractC22676k.m65745e(this.navigation, c40895f.navigation) && AbstractC22676k.m65745e(this.progressList, c40895f.progressList);
    }

    /* JADX INFO: renamed from: f */
    public final List<C40891b> m132547f() {
        return this.progressList;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        EnumC16313m0 enumC16313m0 = this.icon;
        return this.progressList.hashCode() + AbstractC36095b.m114673a(this.navigation, (this.dailyProgress.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a((enumC16313m0 == null ? 0 : enumC16313m0.hashCode()) * 31, this.title, 31), this.body, 31)) * 31, 31);
    }

    public String toString() {
        return "WhatToExpectCardState(icon=" + this.icon + ", title=" + this.title + ", body=" + this.body + ", dailyProgress=" + this.dailyProgress + ", navigation=" + this.navigation + ", progressList=" + this.progressList + ")";
    }
}
