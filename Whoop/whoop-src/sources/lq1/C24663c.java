package lq1;

import ep0.C13404j;
import hq1.C17567f;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lq1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b#\u0010'¨\u0006("}, m65681d2 = {"Llq1/c;", "", "Llq1/b;", "headerState", "", "Llq1/d;", "sections", "Llq1/a;", "footerState", "Lhq1/f;", "metadata", "Lep0/j;", "screenContextMetadata", "<init>", "(Llq1/b;Ljava/util/List;Llq1/a;Lhq1/f;Lep0/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llq1/b;", "b", "()Llq1/b;", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "Llq1/a;", "()Llq1/a;", "d", "Lhq1/f;", "()Lhq1/f;", "Lep0/j;", "()Lep0/j;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24663c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C24662b headerState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C24664d> sections;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C24661a footerState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C17567f metadata;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C13404j screenContextMetadata;

    public C24663c(C24662b headerState, List<C24664d> sections, C24661a c24661a, C17567f metadata, C13404j c13404j) {
        AbstractC22676k.m65750j(headerState, "headerState");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(metadata, "metadata");
        this.headerState = headerState;
        this.sections = sections;
        this.footerState = c24661a;
        this.metadata = metadata;
        this.screenContextMetadata = c13404j;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C24661a getFooterState() {
        return this.footerState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C24662b getHeaderState() {
        return this.headerState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C17567f getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C13404j getScreenContextMetadata() {
        return this.screenContextMetadata;
    }

    /* JADX INFO: renamed from: e */
    public final List<C24664d> m72046e() {
        return this.sections;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24663c)) {
            return false;
        }
        C24663c c24663c = (C24663c) other;
        return AbstractC22676k.m65745e(this.headerState, c24663c.headerState) && AbstractC22676k.m65745e(this.sections, c24663c.sections) && AbstractC22676k.m65745e(this.footerState, c24663c.footerState) && AbstractC22676k.m65745e(this.metadata, c24663c.metadata) && AbstractC22676k.m65745e(this.screenContextMetadata, c24663c.screenContextMetadata);
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.headerState.hashCode() * 31, 31, this.sections);
        C24661a c24661a = this.footerState;
        int iHashCode = (this.metadata.hashCode() + ((iM31983b + (c24661a == null ? 0 : c24661a.hashCode())) * 31)) * 31;
        C13404j c13404j = this.screenContextMetadata;
        return iHashCode + (c13404j != null ? c13404j.hashCode() : 0);
    }

    public String toString() {
        return "BehaviorDetailsScreenState(headerState=" + this.headerState + ", sections=" + this.sections + ", footerState=" + this.footerState + ", metadata=" + this.metadata + ", screenContextMetadata=" + this.screenContextMetadata + ")";
    }
}
