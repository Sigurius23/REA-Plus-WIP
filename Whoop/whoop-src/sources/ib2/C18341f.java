package ib2;

import androidx.core.app.NotificationCompat;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ib2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lib2/f;", "", "", "lastSubmittedEmail", "initialEmail", "Lib2/c;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lib2/c;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lib2/c;)Lib2/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "d", "c", "Lib2/c;", "()Lib2/c;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C18341f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String lastSubmittedEmail;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String initialEmail;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC18338c event;

    public C18341f(String str, String initialEmail, InterfaceC18338c event) {
        AbstractC22676k.m65750j(initialEmail, "initialEmail");
        AbstractC22676k.m65750j(event, "event");
        this.lastSubmittedEmail = str;
        this.initialEmail = initialEmail;
        this.event = event;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C18341f m52844b(C18341f c18341f, String str, String str2, InterfaceC18338c interfaceC18338c, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c18341f.lastSubmittedEmail;
        }
        if ((i13 & 2) != 0) {
            str2 = c18341f.initialEmail;
        }
        if ((i13 & 4) != 0) {
            interfaceC18338c = c18341f.event;
        }
        return c18341f.m52845a(str, str2, interfaceC18338c);
    }

    /* JADX INFO: renamed from: a */
    public final C18341f m52845a(String lastSubmittedEmail, String initialEmail, InterfaceC18338c event) {
        AbstractC22676k.m65750j(initialEmail, "initialEmail");
        AbstractC22676k.m65750j(event, "event");
        return new C18341f(lastSubmittedEmail, initialEmail, event);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC18338c getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInitialEmail() {
        return this.initialEmail;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLastSubmittedEmail() {
        return this.lastSubmittedEmail;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18341f)) {
            return false;
        }
        C18341f c18341f = (C18341f) other;
        return AbstractC22676k.m65745e(this.lastSubmittedEmail, c18341f.lastSubmittedEmail) && AbstractC22676k.m65745e(this.initialEmail, c18341f.initialEmail) && AbstractC22676k.m65745e(this.event, c18341f.event);
    }

    public int hashCode() {
        String str = this.lastSubmittedEmail;
        return this.event.hashCode() + AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.initialEmail);
    }

    public String toString() {
        String str = this.lastSubmittedEmail;
        String str2 = this.initialEmail;
        InterfaceC18338c interfaceC18338c = this.event;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("InternalState(lastSubmittedEmail=", str, ", initialEmail=", str2, ", event=");
        sbM32001t.append(interfaceC18338c);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C18341f(String str, String str2, InterfaceC18338c interfaceC18338c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? "" : str2, interfaceC18338c);
    }
}
