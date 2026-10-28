package nl0;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import p000.AbstractC11266d;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: nl0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001b\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lnl0/k;", "", "", "showFeedbackToast", "Ly81/e;", "feedbackToastColor", "", "feedbackToastIcon", "Lcom/whoop/design/util/TextResource;", "feedbackToastText", "<init>", "(ZLy81/e;ILcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "Ly81/e;", "()Ly81/e;", "c", "I", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26809k {

    /* JADX INFO: renamed from: e */
    public static final int f106859e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean showFeedbackToast;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39332e feedbackToastColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int feedbackToastIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource feedbackToastText;

    /* JADX INFO: renamed from: nl0.k$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f106864w = new a();

        /* JADX INFO: renamed from: a */
        public final long m79979a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m79979a((C39336i) obj));
        }
    }

    public C26809k(boolean z4, InterfaceC39332e feedbackToastColor, int i13, TextResource feedbackToastText) {
        AbstractC22676k.m65750j(feedbackToastColor, "feedbackToastColor");
        AbstractC22676k.m65750j(feedbackToastText, "feedbackToastText");
        this.showFeedbackToast = z4;
        this.feedbackToastColor = feedbackToastColor;
        this.feedbackToastIcon = i13;
        this.feedbackToastText = feedbackToastText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC39332e getFeedbackToastColor() {
        return this.feedbackToastColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getFeedbackToastIcon() {
        return this.feedbackToastIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getFeedbackToastText() {
        return this.feedbackToastText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShowFeedbackToast() {
        return this.showFeedbackToast;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26809k)) {
            return false;
        }
        C26809k c26809k = (C26809k) other;
        return this.showFeedbackToast == c26809k.showFeedbackToast && AbstractC22676k.m65745e(this.feedbackToastColor, c26809k.feedbackToastColor) && this.feedbackToastIcon == c26809k.feedbackToastIcon && AbstractC22676k.m65745e(this.feedbackToastText, c26809k.feedbackToastText);
    }

    public int hashCode() {
        return this.feedbackToastText.hashCode() + AbstractC11266d.m30448b(this.feedbackToastIcon, AbstractC33745d.m106648g(this.feedbackToastColor, Boolean.hashCode(this.showFeedbackToast) * 31, 31), 31);
    }

    public String toString() {
        return "FeedbackToastViewState(showFeedbackToast=" + this.showFeedbackToast + ", feedbackToastColor=" + this.feedbackToastColor + ", feedbackToastIcon=" + this.feedbackToastIcon + ", feedbackToastText=" + this.feedbackToastText + ")";
    }

    public /* synthetic */ C26809k(boolean z4, InterfaceC39332e interfaceC39332e, int i13, TextResource textResource, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? false : z4, (i14 & 2) != 0 ? p745y81.Function1.m125323a(a.f106864w) : interfaceC39332e, (i14 & 4) != 0 ? EnumC16313m0.TINY_CHECKMARK.toWhoopIcon() : i13, (i14 & 8) != 0 ? AbstractC8693b.m21267a() : textResource);
    }
}
