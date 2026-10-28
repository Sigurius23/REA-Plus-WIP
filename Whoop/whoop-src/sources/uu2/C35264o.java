package uu2;

import e51.C12738n;
import ep0.C13404j;
import l51.C23357g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: uu2.o */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0018\u0010'¨\u0006("}, m65681d2 = {"Luu2/o;", "", "Ll51/g;", "header", "Le51/n;", "anchorSelector", "Lep0/j;", "screenContextMetadata", "Lm91/u;", "emptyState", "Luu2/m;", "analyticsContext", "<init>", "(Ll51/g;Le51/n;Lep0/j;Lm91/u;Luu2/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll51/g;", "c", "()Ll51/g;", "b", "Le51/n;", "()Le51/n;", "Lep0/j;", "d", "()Lep0/j;", "Lm91/u;", "getEmptyState", "()Lm91/u;", "e", "Luu2/m;", "()Luu2/m;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35264o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23357g header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C12738n anchorSelector;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C13404j screenContextMetadata;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25312u emptyState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C35262m analyticsContext;

    public C35264o(C23357g header, C12738n anchorSelector, C13404j c13404j, InterfaceC25312u interfaceC25312u, C35262m analyticsContext) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(anchorSelector, "anchorSelector");
        AbstractC22676k.m65750j(analyticsContext, "analyticsContext");
        this.header = header;
        this.anchorSelector = anchorSelector;
        this.screenContextMetadata = c13404j;
        this.emptyState = interfaceC25312u;
        this.analyticsContext = analyticsContext;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C35262m getAnalyticsContext() {
        return this.analyticsContext;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C12738n getAnchorSelector() {
        return this.anchorSelector;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C23357g getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C13404j getScreenContextMetadata() {
        return this.screenContextMetadata;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35264o)) {
            return false;
        }
        C35264o c35264o = (C35264o) other;
        return AbstractC22676k.m65745e(this.header, c35264o.header) && AbstractC22676k.m65745e(this.anchorSelector, c35264o.anchorSelector) && AbstractC22676k.m65745e(this.screenContextMetadata, c35264o.screenContextMetadata) && AbstractC22676k.m65745e(this.emptyState, c35264o.emptyState) && AbstractC22676k.m65745e(this.analyticsContext, c35264o.analyticsContext);
    }

    public int hashCode() {
        int iHashCode = (this.anchorSelector.hashCode() + (this.header.hashCode() * 31)) * 31;
        C13404j c13404j = this.screenContextMetadata;
        int iHashCode2 = (iHashCode + (c13404j == null ? 0 : c13404j.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u = this.emptyState;
        return this.analyticsContext.hashCode() + ((iHashCode2 + (interfaceC25312u != null ? interfaceC25312u.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ExerciseDetailsV2Content(header=" + this.header + ", anchorSelector=" + this.anchorSelector + ", screenContextMetadata=" + this.screenContextMetadata + ", emptyState=" + this.emptyState + ", analyticsContext=" + this.analyticsContext + ")";
    }
}
