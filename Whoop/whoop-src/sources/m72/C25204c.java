package m72;

import com.whoop.navigation.C9598e;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17911t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m72.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0017\u0010!R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006$"}, m65681d2 = {"Lm72/c;", "", "Lkd1/o;", "lockedIcon", "", "headerTextDisplay", "descriptionDisplay", "Li2/t;", "buttonBrush", "buttonTextDisplay", "Lcom/whoop/navigation/e;", "buttonDestination", "<init>", "(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Li2/t;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "f", "()Lkd1/o;", "b", "Ljava/lang/String;", "e", "c", "d", "Li2/t;", "()Li2/t;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25204c {

    /* JADX INFO: renamed from: g */
    public static final int f98965g = C9598e.f28134d | AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o lockedIcon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String headerTextDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String descriptionDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC17911t buttonBrush;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String buttonTextDisplay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C9598e buttonDestination;

    public C25204c(AbstractC22403o lockedIcon, String headerTextDisplay, String descriptionDisplay, AbstractC17911t buttonBrush, String buttonTextDisplay, C9598e c9598e) {
        AbstractC22676k.m65750j(lockedIcon, "lockedIcon");
        AbstractC22676k.m65750j(headerTextDisplay, "headerTextDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttonBrush, "buttonBrush");
        AbstractC22676k.m65750j(buttonTextDisplay, "buttonTextDisplay");
        this.lockedIcon = lockedIcon;
        this.headerTextDisplay = headerTextDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.buttonBrush = buttonBrush;
        this.buttonTextDisplay = buttonTextDisplay;
        this.buttonDestination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC17911t getButtonBrush() {
        return this.buttonBrush;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getButtonDestination() {
        return this.buttonDestination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getButtonTextDisplay() {
        return this.buttonTextDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getHeaderTextDisplay() {
        return this.headerTextDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25204c)) {
            return false;
        }
        C25204c c25204c = (C25204c) other;
        return AbstractC22676k.m65745e(this.lockedIcon, c25204c.lockedIcon) && AbstractC22676k.m65745e(this.headerTextDisplay, c25204c.headerTextDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, c25204c.descriptionDisplay) && AbstractC22676k.m65745e(this.buttonBrush, c25204c.buttonBrush) && AbstractC22676k.m65745e(this.buttonTextDisplay, c25204c.buttonTextDisplay) && AbstractC22676k.m65745e(this.buttonDestination, c25204c.buttonDestination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC22403o getLockedIcon() {
        return this.lockedIcon;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.buttonBrush.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.lockedIcon.hashCode() * 31, 31, this.headerTextDisplay), 31, this.descriptionDisplay)) * 31, 31, this.buttonTextDisplay);
        C9598e c9598e = this.buttonDestination;
        return iM30450d + (c9598e == null ? 0 : c9598e.hashCode());
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.lockedIcon;
        String str = this.headerTextDisplay;
        String str2 = this.descriptionDisplay;
        AbstractC17911t abstractC17911t = this.buttonBrush;
        String str3 = this.buttonTextDisplay;
        C9598e c9598e = this.buttonDestination;
        StringBuilder sb4 = new StringBuilder("LockedContentViewState(lockedIcon=");
        sb4.append(abstractC22403o);
        sb4.append(", headerTextDisplay=");
        sb4.append(str);
        sb4.append(", descriptionDisplay=");
        sb4.append(str2);
        sb4.append(", buttonBrush=");
        sb4.append(abstractC17911t);
        sb4.append(", buttonTextDisplay=");
        return AbstractC13673n.m38563j(sb4, str3, ", buttonDestination=", c9598e, ")");
    }
}
