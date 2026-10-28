package qm1;

import com.whoop.home.domain.models.CustomAnimationContainerViewState;
import java.util.List;
import om1.C28030d;
import om1.C28031e;
import om1.InterfaceC28027a;
import om1.InterfaceC28028b;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: qm1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b \u0010\u0010¨\u0006%"}, m65681d2 = {"Lqm1/b;", "", "", "Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;", "contents", "Lom1/a;", "enterTransition", "Lom1/b;", "exitTransition", "", "triggerConfetti", "", "keyToAnimate", "<init>", "(Ljava/util/List;Lom1/a;Lom1/b;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lom1/a;", "()Lom1/a;", "c", "Lom1/b;", "()Lom1/b;", "d", "Z", "e", "()Z", "Ljava/lang/String;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30480b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<CustomAnimationContainerViewState> contents;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC28027a enterTransition;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC28028b exitTransition;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean triggerConfetti;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String keyToAnimate;

    public C30480b(List<CustomAnimationContainerViewState> list, InterfaceC28027a enterTransition, InterfaceC28028b exitTransition, boolean z4, String str) {
        AbstractC22676k.m65750j(enterTransition, "enterTransition");
        AbstractC22676k.m65750j(exitTransition, "exitTransition");
        this.contents = list;
        this.enterTransition = enterTransition;
        this.exitTransition = exitTransition;
        this.triggerConfetti = z4;
        this.keyToAnimate = str;
    }

    /* JADX INFO: renamed from: a */
    public final List<CustomAnimationContainerViewState> m93291a() {
        return this.contents;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC28027a getEnterTransition() {
        return this.enterTransition;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC28028b getExitTransition() {
        return this.exitTransition;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getKeyToAnimate() {
        return this.keyToAnimate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getTriggerConfetti() {
        return this.triggerConfetti;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30480b)) {
            return false;
        }
        C30480b c30480b = (C30480b) other;
        return AbstractC22676k.m65745e(this.contents, c30480b.contents) && AbstractC22676k.m65745e(this.enterTransition, c30480b.enterTransition) && AbstractC22676k.m65745e(this.exitTransition, c30480b.exitTransition) && this.triggerConfetti == c30480b.triggerConfetti && AbstractC22676k.m65745e(this.keyToAnimate, c30480b.keyToAnimate);
    }

    public int hashCode() {
        List<CustomAnimationContainerViewState> list = this.contents;
        int iM8289b = AbstractC2875y.m8289b((this.exitTransition.hashCode() + ((this.enterTransition.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31)) * 31, 31, this.triggerConfetti);
        String str = this.keyToAnimate;
        return iM8289b + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        List<CustomAnimationContainerViewState> list = this.contents;
        InterfaceC28027a interfaceC28027a = this.enterTransition;
        InterfaceC28028b interfaceC28028b = this.exitTransition;
        boolean z4 = this.triggerConfetti;
        String str = this.keyToAnimate;
        StringBuilder sb4 = new StringBuilder("DayZeroNotificationCardsViewState(contents=");
        sb4.append(list);
        sb4.append(", enterTransition=");
        sb4.append(interfaceC28027a);
        sb4.append(", exitTransition=");
        sb4.append(interfaceC28028b);
        sb4.append(", triggerConfetti=");
        sb4.append(z4);
        sb4.append(", keyToAnimate=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    public /* synthetic */ C30480b(List list, InterfaceC28027a interfaceC28027a, InterfaceC28028b interfaceC28028b, boolean z4, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i13 & 2) != 0 ? C28030d.f113094a : interfaceC28027a, (i13 & 4) != 0 ? C28031e.f113095a : interfaceC28028b, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? null : str);
    }
}
