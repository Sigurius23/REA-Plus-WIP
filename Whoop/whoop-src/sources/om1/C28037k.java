package om1;

import com.whoop.home.domain.models.CustomAnimationContainerViewState;
import ih0.AbstractC18489d0;
import java.util.List;
import m83.C25271y;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: om1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJL\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lom1/k;", "", "", "Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;", "contents", "", "keyToAnimate", "Lom1/a;", "enterTransition", "Lom1/b;", "exitTransition", "", "triggerConfetti", "<init>", "(Ljava/util/List;Ljava/lang/String;Lom1/a;Lom1/b;Z)V", "a", "(Ljava/util/List;Ljava/lang/String;Lom1/a;Lom1/b;Z)Lom1/k;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "f", "Lom1/a;", "d", "()Lom1/a;", "Lom1/b;", "e", "()Lom1/b;", "Z", "g", "()Z", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28037k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<CustomAnimationContainerViewState> contents;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String keyToAnimate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC28027a enterTransition;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC28028b exitTransition;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean triggerConfetti;

    public C28037k(List<CustomAnimationContainerViewState> list, String str, InterfaceC28027a enterTransition, InterfaceC28028b exitTransition, boolean z4) {
        AbstractC22676k.m65750j(enterTransition, "enterTransition");
        AbstractC22676k.m65750j(exitTransition, "exitTransition");
        this.contents = list;
        this.keyToAnimate = str;
        this.enterTransition = enterTransition;
        this.exitTransition = exitTransition;
        this.triggerConfetti = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C28037k m84529b(C28037k c28037k, List list, String str, InterfaceC28027a interfaceC28027a, InterfaceC28028b interfaceC28028b, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c28037k.contents;
        }
        if ((i13 & 2) != 0) {
            str = c28037k.keyToAnimate;
        }
        if ((i13 & 4) != 0) {
            interfaceC28027a = c28037k.enterTransition;
        }
        if ((i13 & 8) != 0) {
            interfaceC28028b = c28037k.exitTransition;
        }
        if ((i13 & 16) != 0) {
            z4 = c28037k.triggerConfetti;
        }
        boolean z13 = z4;
        InterfaceC28027a interfaceC28027a2 = interfaceC28027a;
        return c28037k.m84530a(list, str, interfaceC28027a2, interfaceC28028b, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C28037k m84530a(List<CustomAnimationContainerViewState> contents, String keyToAnimate, InterfaceC28027a enterTransition, InterfaceC28028b exitTransition, boolean triggerConfetti) {
        AbstractC22676k.m65750j(enterTransition, "enterTransition");
        AbstractC22676k.m65750j(exitTransition, "exitTransition");
        return new C28037k(contents, keyToAnimate, enterTransition, exitTransition, triggerConfetti);
    }

    /* JADX INFO: renamed from: c */
    public final List<CustomAnimationContainerViewState> m84531c() {
        return this.contents;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC28027a getEnterTransition() {
        return this.enterTransition;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC28028b getExitTransition() {
        return this.exitTransition;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28037k)) {
            return false;
        }
        C28037k c28037k = (C28037k) other;
        return AbstractC22676k.m65745e(this.contents, c28037k.contents) && AbstractC22676k.m65745e(this.keyToAnimate, c28037k.keyToAnimate) && AbstractC22676k.m65745e(this.enterTransition, c28037k.enterTransition) && AbstractC22676k.m65745e(this.exitTransition, c28037k.exitTransition) && this.triggerConfetti == c28037k.triggerConfetti;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getKeyToAnimate() {
        return this.keyToAnimate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getTriggerConfetti() {
        return this.triggerConfetti;
    }

    public int hashCode() {
        List<CustomAnimationContainerViewState> list = this.contents;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.keyToAnimate;
        return Boolean.hashCode(this.triggerConfetti) + ((this.exitTransition.hashCode() + ((this.enterTransition.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public String toString() {
        List<CustomAnimationContainerViewState> list = this.contents;
        String str = this.keyToAnimate;
        InterfaceC28027a interfaceC28027a = this.enterTransition;
        InterfaceC28028b interfaceC28028b = this.exitTransition;
        boolean z4 = this.triggerConfetti;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("DayZeroNotificationCardsDomainState(contents=", ", keyToAnimate=", str, ", enterTransition=", list);
        sbM79507k.append(interfaceC28027a);
        sbM79507k.append(", exitTransition=");
        sbM79507k.append(interfaceC28028b);
        sbM79507k.append(", triggerConfetti=");
        return AbstractC18489d0.m53372m(sbM79507k, z4, ")");
    }

    public /* synthetic */ C28037k(List list, String str, InterfaceC28027a interfaceC28027a, InterfaceC28028b interfaceC28028b, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? C28030d.f113094a : interfaceC28027a, (i13 & 8) != 0 ? C28031e.f113095a : interfaceC28028b, (i13 & 16) != 0 ? false : z4);
    }
}
