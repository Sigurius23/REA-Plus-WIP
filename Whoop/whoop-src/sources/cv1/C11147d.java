package cv1;

import androidx.compose.p018ui.Modifier;
import n41.C26271b;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: cv1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0019\u0010 ¨\u0006!"}, m65681d2 = {"Lcv1/d;", "Lm91/u;", "", "id", "icon", "title", "Ln41/b;", "timerState", "Landroidx/compose/ui/Modifier;", "modifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ln41/b;Landroidx/compose/ui/Modifier;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "c", "e", "d", "Ln41/b;", "()Ln41/b;", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11147d implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f35672f = C26271b.f104437f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C26271b timerState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Modifier modifier;

    public C11147d(String id4, String icon, String title, C26271b c26271b, Modifier modifier) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(modifier, "modifier");
        this.id = id4;
        this.icon = icon;
        this.title = title;
        this.timerState = c26271b;
        this.modifier = modifier;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C26271b getTimerState() {
        return this.timerState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11147d)) {
            return false;
        }
        C11147d c11147d = (C11147d) other;
        return AbstractC22676k.m65745e(this.id, c11147d.id) && AbstractC22676k.m65745e(this.icon, c11147d.icon) && AbstractC22676k.m65745e(this.title, c11147d.title) && AbstractC22676k.m65745e(this.timerState, c11147d.timerState) && AbstractC22676k.m65745e(this.modifier, c11147d.modifier);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.icon), 31, this.title);
        C26271b c26271b = this.timerState;
        return this.modifier.hashCode() + ((iM30450d + (c26271b == null ? 0 : c26271b.hashCode())) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.icon;
        String str3 = this.title;
        C26271b c26271b = this.timerState;
        Modifier modifier = this.modifier;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TimerPillViewState(id=", str, ", icon=", str2, ", title=");
        sbM32001t.append(str3);
        sbM32001t.append(", timerState=");
        sbM32001t.append(c26271b);
        sbM32001t.append(", modifier=");
        sbM32001t.append(modifier);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C11147d(String str, String str2, String str3, C26271b c26271b, Modifier modifier, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, c26271b, (i13 & 16) != 0 ? C2314t.f9131w : modifier);
    }
}
