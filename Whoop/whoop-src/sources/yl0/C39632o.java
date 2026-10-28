package yl0;

import l21.C23239c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: yl0.o */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u0014\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lyl0/o;", "", "Ll21/c;", "widgetViewState", "", "followupMessage", "Lyl0/c;", "magnitudeSheet", "", "didCommitSucceed", "<init>", "(Ll21/c;Ljava/lang/String;Lyl0/c;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ll21/c;", "d", "()Ll21/c;", "b", "Ljava/lang/String;", "c", "Lyl0/c;", "()Lyl0/c;", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39632o {

    /* JADX INFO: renamed from: e */
    public static final int f170513e = C23239c.f92089h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23239c widgetViewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String followupMessage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39620c magnitudeSheet;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean didCommitSucceed;

    public C39632o(C23239c widgetViewState, String str, C39620c c39620c, boolean z4) {
        AbstractC22676k.m65750j(widgetViewState, "widgetViewState");
        this.widgetViewState = widgetViewState;
        this.followupMessage = str;
        this.magnitudeSheet = c39620c;
        this.didCommitSucceed = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getDidCommitSucceed() {
        return this.didCommitSucceed;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFollowupMessage() {
        return this.followupMessage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C39620c getMagnitudeSheet() {
        return this.magnitudeSheet;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C23239c getWidgetViewState() {
        return this.widgetViewState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39632o)) {
            return false;
        }
        C39632o c39632o = (C39632o) other;
        return AbstractC22676k.m65745e(this.widgetViewState, c39632o.widgetViewState) && AbstractC22676k.m65745e(this.followupMessage, c39632o.followupMessage) && AbstractC22676k.m65745e(this.magnitudeSheet, c39632o.magnitudeSheet) && this.didCommitSucceed == c39632o.didCommitSucceed;
    }

    public int hashCode() {
        int iHashCode = this.widgetViewState.hashCode() * 31;
        String str = this.followupMessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C39620c c39620c = this.magnitudeSheet;
        return Boolean.hashCode(this.didCommitSucceed) + ((iHashCode2 + (c39620c != null ? c39620c.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "JournalEntryWidgetWrapperViewState(widgetViewState=" + this.widgetViewState + ", followupMessage=" + this.followupMessage + ", magnitudeSheet=" + this.magnitudeSheet + ", didCommitSucceed=" + this.didCommitSucceed + ")";
    }

    public /* synthetic */ C39632o(C23239c c23239c, String str, C39620c c39620c, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c23239c, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : c39620c, (i13 & 8) != 0 ? false : z4);
    }
}
