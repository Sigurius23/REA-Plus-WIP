package eu2;

import com.whoop.design.util.TextResource;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: eu2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u0015\u0010 ¨\u0006!"}, m65681d2 = {"Leu2/b;", "EVENT", "", "Lcom/whoop/design/util/TextResource;", "text", "Ly81/e;", "color", "", "enabled", "clickEvent", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/e;ZLjava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "Ly81/e;", "()Ly81/e;", "c", "Z", "()Z", "Ljava/lang/Object;", "()Ljava/lang/Object;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13645b<EVENT> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EVENT clickEvent;

    public C13645b(TextResource text, InterfaceC39332e color, boolean z4, EVENT event) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(color, "color");
        this.text = text;
        this.color = color;
        this.enabled = z4;
        this.clickEvent = event;
    }

    /* JADX INFO: renamed from: a */
    public final EVENT m38444a() {
        return this.clickEvent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13645b)) {
            return false;
        }
        C13645b c13645b = (C13645b) other;
        return AbstractC22676k.m65745e(this.text, c13645b.text) && AbstractC22676k.m65745e(this.color, c13645b.color) && this.enabled == c13645b.enabled && AbstractC22676k.m65745e(this.clickEvent, c13645b.clickEvent);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC33745d.m106648g(this.color, this.text.hashCode() * 31, 31), 31, this.enabled);
        EVENT event = this.clickEvent;
        return iM8289b + (event == null ? 0 : event.hashCode());
    }

    public String toString() {
        return "CtaState(text=" + this.text + ", color=" + this.color + ", enabled=" + this.enabled + ", clickEvent=" + this.clickEvent + ")";
    }

    public /* synthetic */ C13645b(TextResource textResource, InterfaceC39332e interfaceC39332e, boolean z4, Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, (i13 & 2) != 0 ? EnumC39333f.BRAND_WHITE : interfaceC39332e, (i13 & 4) != 0 ? true : z4, obj);
    }
}
