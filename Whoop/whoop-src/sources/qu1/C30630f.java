package qu1;

import p31.C28801l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import uu1.C35238c;

/* JADX INFO: renamed from: qu1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006$"}, m65681d2 = {"Lqu1/f;", "Lm91/u;", "Lqu1/h;", "screenContent", "Lp31/l;", "headerSectionViewState", "Luu1/c;", "subHeaderViewState", "Lqu1/g;", "miniArchModal", "<init>", "(Lqu1/h;Lp31/l;Luu1/c;Lqu1/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqu1/h;", "c", "()Lqu1/h;", "b", "Lp31/l;", "()Lp31/l;", "Luu1/c;", "e", "()Luu1/c;", "d", "Lqu1/g;", "()Lqu1/g;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30630f implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C30632h screenContent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28801l headerSectionViewState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C35238c subHeaderViewState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C30631g miniArchModal;

    public C30630f(C30632h c30632h, C28801l c28801l, C35238c c35238c, C30631g c30631g) {
        this.screenContent = c30632h;
        this.headerSectionViewState = c28801l;
        this.subHeaderViewState = c35238c;
        this.miniArchModal = c30631g;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C28801l getHeaderSectionViewState() {
        return this.headerSectionViewState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C30631g getMiniArchModal() {
        return this.miniArchModal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C30632h getScreenContent() {
        return this.screenContent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C35238c getSubHeaderViewState() {
        return this.subHeaderViewState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30630f)) {
            return false;
        }
        C30630f c30630f = (C30630f) other;
        return AbstractC22676k.m65745e(this.screenContent, c30630f.screenContent) && AbstractC22676k.m65745e(this.headerSectionViewState, c30630f.headerSectionViewState) && AbstractC22676k.m65745e(this.subHeaderViewState, c30630f.subHeaderViewState) && AbstractC22676k.m65745e(this.miniArchModal, c30630f.miniArchModal);
    }

    public int hashCode() {
        C30632h c30632h = this.screenContent;
        int iHashCode = (c30632h == null ? 0 : c30632h.hashCode()) * 31;
        C28801l c28801l = this.headerSectionViewState;
        int iHashCode2 = (iHashCode + (c28801l == null ? 0 : c28801l.hashCode())) * 31;
        C35238c c35238c = this.subHeaderViewState;
        int iHashCode3 = (iHashCode2 + (c35238c == null ? 0 : c35238c.hashCode())) * 31;
        C30631g c30631g = this.miniArchModal;
        return iHashCode3 + (c30631g != null ? c30631g.hashCode() : 0);
    }

    public String toString() {
        return "LastNightSleepViewState(screenContent=" + this.screenContent + ", headerSectionViewState=" + this.headerSectionViewState + ", subHeaderViewState=" + this.subHeaderViewState + ", miniArchModal=" + this.miniArchModal + ")";
    }

    public /* synthetic */ C30630f(C30632h c30632h, C28801l c28801l, C35238c c35238c, C30631g c30631g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c30632h, (i13 & 2) != 0 ? null : c28801l, (i13 & 4) != 0 ? null : c35238c, (i13 & 8) != 0 ? null : c30631g);
    }
}
