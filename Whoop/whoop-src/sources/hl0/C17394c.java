package hl0;

import com.whoop.bot.models.feedback.AiMessageFeedback;
import java.util.Map;
import m83.C25272z;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hl0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lhl0/c;", "", "", "", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "completedMessages", "", "showToast", "Lhl0/d;", "toastStyle", "<init>", "(Ljava/util/Map;ZLhl0/d;)V", "a", "(Ljava/util/Map;ZLhl0/d;)Lhl0/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "b", "Z", "d", "()Z", "Lhl0/d;", "e", "()Lhl0/d;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17394c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<String, AiMessageFeedback> completedMessages;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showToast;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC17395d toastStyle;

    public C17394c(Map<String, AiMessageFeedback> completedMessages, boolean z4, AbstractC17395d toastStyle) {
        AbstractC22676k.m65750j(completedMessages, "completedMessages");
        AbstractC22676k.m65750j(toastStyle, "toastStyle");
        this.completedMessages = completedMessages;
        this.showToast = z4;
        this.toastStyle = toastStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C17394c m49231b(C17394c c17394c, Map map, boolean z4, AbstractC17395d abstractC17395d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = c17394c.completedMessages;
        }
        if ((i13 & 2) != 0) {
            z4 = c17394c.showToast;
        }
        if ((i13 & 4) != 0) {
            abstractC17395d = c17394c.toastStyle;
        }
        return c17394c.m49232a(map, z4, abstractC17395d);
    }

    /* JADX INFO: renamed from: a */
    public final C17394c m49232a(Map<String, AiMessageFeedback> completedMessages, boolean showToast, AbstractC17395d toastStyle) {
        AbstractC22676k.m65750j(completedMessages, "completedMessages");
        AbstractC22676k.m65750j(toastStyle, "toastStyle");
        return new C17394c(completedMessages, showToast, toastStyle);
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, AiMessageFeedback> m49233c() {
        return this.completedMessages;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShowToast() {
        return this.showToast;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC17395d getToastStyle() {
        return this.toastStyle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17394c)) {
            return false;
        }
        C17394c c17394c = (C17394c) other;
        return AbstractC22676k.m65745e(this.completedMessages, c17394c.completedMessages) && this.showToast == c17394c.showToast && AbstractC22676k.m65745e(this.toastStyle, c17394c.toastStyle);
    }

    public int hashCode() {
        return this.toastStyle.hashCode() + AbstractC2875y.m8289b(this.completedMessages.hashCode() * 31, 31, this.showToast);
    }

    public String toString() {
        return "AiFeedbackResult(completedMessages=" + this.completedMessages + ", showToast=" + this.showToast + ", toastStyle=" + this.toastStyle + ")";
    }

    public /* synthetic */ C17394c(Map map, boolean z4, AbstractC17395d abstractC17395d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25272z.f99163w : map, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? AbstractC17395d.b.f67357a : abstractC17395d);
    }
}
