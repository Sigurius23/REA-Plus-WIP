package zl0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r31.C30911f;

/* JADX INFO: renamed from: zl0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lzl0/k;", "", "Lr31/f;", "widgetViewState", "", "followupMessage", "<init>", "(Lr31/f;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr31/f;", "b", "()Lr31/f;", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40879k {

    /* JADX INFO: renamed from: c */
    public static final int f176176c = C30911f.f127478h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C30911f widgetViewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String followupMessage;

    public C40879k(C30911f widgetViewState, String str) {
        AbstractC22676k.m65750j(widgetViewState, "widgetViewState");
        this.widgetViewState = widgetViewState;
        this.followupMessage = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFollowupMessage() {
        return this.followupMessage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C30911f getWidgetViewState() {
        return this.widgetViewState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40879k)) {
            return false;
        }
        C40879k c40879k = (C40879k) other;
        return AbstractC22676k.m65745e(this.widgetViewState, c40879k.widgetViewState) && AbstractC22676k.m65745e(this.followupMessage, c40879k.followupMessage);
    }

    public int hashCode() {
        int iHashCode = this.widgetViewState.hashCode() * 31;
        String str = this.followupMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SelectionWidgetWrapperViewState(widgetViewState=" + this.widgetViewState + ", followupMessage=" + this.followupMessage + ")";
    }

    public /* synthetic */ C40879k(C30911f c30911f, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c30911f, (i13 & 2) != 0 ? null : str);
    }
}
