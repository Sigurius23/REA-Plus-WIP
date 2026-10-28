package lw2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whattoexpect.domain.models.DailyProgress;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import s21.C32085h;

/* JADX INFO: renamed from: lw2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b\u001d\u0010+R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010,\u001a\u0004\b!\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b'\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001f\u00100\u001a\u0004\b#\u00101¨\u00062"}, m65681d2 = {"Llw2/c;", "", "", "isLoading", "isError", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "title", "subTitle", "Lcom/whoop/whattoexpect/domain/models/DailyProgress;", "dailyProgress", "", "Lm91/u;", "items", "Ls21/h;", "selectedMilestone", "Llw2/d;", "progressIndicator", "<init>", "(ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whattoexpect/domain/models/DailyProgress;Ljava/util/List;Ls21/h;Llw2/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "i", "()Z", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "d", "f", "e", "Lcom/whoop/whattoexpect/domain/models/DailyProgress;", "()Lcom/whoop/whattoexpect/domain/models/DailyProgress;", "Ljava/util/List;", "()Ljava/util/List;", "Ls21/h;", "()Ls21/h;", "Llw2/d;", "()Llw2/d;", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24778c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource toolbarTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource subTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final DailyProgress dailyProgress;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C32085h selectedMilestone;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C24779d progressIndicator;

    /* JADX WARN: Multi-variable type inference failed */
    public C24778c(boolean z4, boolean z13, TextResource toolbarTitle, TextResource title, TextResource subTitle, DailyProgress dailyProgress, List<? extends InterfaceC25312u> items, C32085h c32085h, C24779d c24779d) {
        AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subTitle, "subTitle");
        AbstractC22676k.m65750j(dailyProgress, "dailyProgress");
        AbstractC22676k.m65750j(items, "items");
        this.isLoading = z4;
        this.isError = z13;
        this.toolbarTitle = toolbarTitle;
        this.title = title;
        this.subTitle = subTitle;
        this.dailyProgress = dailyProgress;
        this.items = items;
        this.selectedMilestone = c32085h;
        this.progressIndicator = c24779d;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DailyProgress getDailyProgress() {
        return this.dailyProgress;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m72624b() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C24779d getProgressIndicator() {
        return this.progressIndicator;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C32085h getSelectedMilestone() {
        return this.selectedMilestone;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getSubTitle() {
        return this.subTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24778c)) {
            return false;
        }
        C24778c c24778c = (C24778c) other;
        return this.isLoading == c24778c.isLoading && this.isError == c24778c.isError && AbstractC22676k.m65745e(this.toolbarTitle, c24778c.toolbarTitle) && AbstractC22676k.m65745e(this.title, c24778c.title) && AbstractC22676k.m65745e(this.subTitle, c24778c.subTitle) && AbstractC22676k.m65745e(this.dailyProgress, c24778c.dailyProgress) && AbstractC22676k.m65745e(this.items, c24778c.items) && AbstractC22676k.m65745e(this.selectedMilestone, c24778c.selectedMilestone) && AbstractC22676k.m65745e(this.progressIndicator, c24778c.progressIndicator);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getToolbarTitle() {
        return this.toolbarTitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.dailyProgress.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError), this.toolbarTitle, 31), this.title, 31), this.subTitle, 31)) * 31, 31, this.items);
        C32085h c32085h = this.selectedMilestone;
        int iHashCode = (iM31983b + (c32085h == null ? 0 : c32085h.hashCode())) * 31;
        C24779d c24779d = this.progressIndicator;
        return iHashCode + (c24779d != null ? c24779d.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        TextResource textResource = this.toolbarTitle;
        TextResource textResource2 = this.title;
        TextResource textResource3 = this.subTitle;
        DailyProgress dailyProgress = this.dailyProgress;
        List<InterfaceC25312u> list = this.items;
        C32085h c32085h = this.selectedMilestone;
        C24779d c24779d = this.progressIndicator;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("WhatToExpectViewState(isLoading=", ", isError=", ", toolbarTitle=", z4, z13);
        AbstractC30007c.m91855y(sbM32002u, textResource, ", title=", textResource2, ", subTitle=");
        sbM32002u.append(textResource3);
        sbM32002u.append(", dailyProgress=");
        sbM32002u.append(dailyProgress);
        sbM32002u.append(", items=");
        sbM32002u.append(list);
        sbM32002u.append(", selectedMilestone=");
        sbM32002u.append(c32085h);
        sbM32002u.append(", progressIndicator=");
        sbM32002u.append(c24779d);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C24778c(boolean z4, boolean z13, TextResource textResource, TextResource textResource2, TextResource textResource3, DailyProgress dailyProgress, List list, C32085h c32085h, C24779d c24779d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 32) != 0 ? new DailyProgress((TextResource) null, 0, 0, 7, (DefaultConstructorMarker) null) : dailyProgress, (i13 & 64) != 0 ? C25271y.f99162w : list, (i13 & 128) != 0 ? null : c32085h, (i13 & 256) != 0 ? null : c24779d);
    }
}
