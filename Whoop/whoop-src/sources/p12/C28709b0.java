package p12;

import jh3.AbstractC21702c;
import km0.C22581e;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: p12.b0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001c\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b\u0018\u0010(¨\u0006)"}, m65681d2 = {"Lp12/b0;", "", "Lny0/v;", "primaryButtonType", "Ly81/f;", "primaryButtonColor", "", "primaryButtonText", "Lp12/g;", "primaryButtonAction", "", "isFinalCta", "Lkm0/e;", "bottomSheetViewState", "<init>", "(Lny0/v;Ly81/f;Ljava/lang/String;Lp12/g;ZLkm0/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lny0/v;", "e", "()Lny0/v;", "b", "Ly81/f;", "c", "()Ly81/f;", "Ljava/lang/String;", "d", "Lp12/g;", "()Lp12/g;", "Z", "f", "()Z", "Lkm0/e;", "()Lkm0/e;", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28709b0 {

    /* JADX INFO: renamed from: g */
    public static final int f116117g = C22581e.f88865n;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC27284v primaryButtonType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f primaryButtonColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String primaryButtonText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC28717g primaryButtonAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isFinalCta;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C22581e bottomSheetViewState;

    public C28709b0(EnumC27284v primaryButtonType, EnumC39333f primaryButtonColor, String primaryButtonText, EnumC28717g primaryButtonAction, boolean z4, C22581e c22581e) {
        AbstractC22676k.m65750j(primaryButtonType, "primaryButtonType");
        AbstractC22676k.m65750j(primaryButtonColor, "primaryButtonColor");
        AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
        AbstractC22676k.m65750j(primaryButtonAction, "primaryButtonAction");
        this.primaryButtonType = primaryButtonType;
        this.primaryButtonColor = primaryButtonColor;
        this.primaryButtonText = primaryButtonText;
        this.primaryButtonAction = primaryButtonAction;
        this.isFinalCta = z4;
        this.bottomSheetViewState = c22581e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C22581e getBottomSheetViewState() {
        return this.bottomSheetViewState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC28717g getPrimaryButtonAction() {
        return this.primaryButtonAction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getPrimaryButtonColor() {
        return this.primaryButtonColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC27284v getPrimaryButtonType() {
        return this.primaryButtonType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28709b0)) {
            return false;
        }
        C28709b0 c28709b0 = (C28709b0) other;
        return this.primaryButtonType == c28709b0.primaryButtonType && this.primaryButtonColor == c28709b0.primaryButtonColor && AbstractC22676k.m65745e(this.primaryButtonText, c28709b0.primaryButtonText) && this.primaryButtonAction == c28709b0.primaryButtonAction && this.isFinalCta == c28709b0.isFinalCta && AbstractC22676k.m65745e(this.bottomSheetViewState, c28709b0.bottomSheetViewState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsFinalCta() {
        return this.isFinalCta;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.primaryButtonAction.hashCode() + AbstractC11266d.m30450d(AbstractC21702c.m61132c(this.primaryButtonColor, this.primaryButtonType.hashCode() * 31, 31), 31, this.primaryButtonText)) * 31, 31, this.isFinalCta);
        C22581e c22581e = this.bottomSheetViewState;
        return iM8289b + (c22581e == null ? 0 : c22581e.hashCode());
    }

    public String toString() {
        return "StoryPrimaryCTA(primaryButtonType=" + this.primaryButtonType + ", primaryButtonColor=" + this.primaryButtonColor + ", primaryButtonText=" + this.primaryButtonText + ", primaryButtonAction=" + this.primaryButtonAction + ", isFinalCta=" + this.isFinalCta + ", bottomSheetViewState=" + this.bottomSheetViewState + ")";
    }
}
