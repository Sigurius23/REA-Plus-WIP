package v71;

import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: v71.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u001e\u0010&¨\u0006'"}, m65681d2 = {"Lv71/e;", "", "Lcom/whoop/navigation/e;", "navigationAction", "Lcom/whoop/navigation/models/GenericInteraction;", "ctaInteraction", "", "ctaIcon", "", "title", "titleIcon", "", "featureFlags", "<init>", "(Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "d", "()Lcom/whoop/navigation/e;", "b", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "c", "I", "Ljava/lang/String;", "e", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35764e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C9598e navigationAction;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final GenericInteraction ctaInteraction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int ctaIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Integer titleIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<String> featureFlags;

    public C35764e(C9598e c9598e, GenericInteraction genericInteraction, int i13, String title, Integer num, List<String> featureFlags) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(featureFlags, "featureFlags");
        this.navigationAction = c9598e;
        this.ctaInteraction = genericInteraction;
        this.ctaIcon = i13;
        this.title = title;
        this.titleIcon = num;
        this.featureFlags = featureFlags;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCtaIcon() {
        return this.ctaIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final GenericInteraction getCtaInteraction() {
        return this.ctaInteraction;
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m113320c() {
        return this.featureFlags;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C9598e getNavigationAction() {
        return this.navigationAction;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35764e)) {
            return false;
        }
        C35764e c35764e = (C35764e) other;
        return AbstractC22676k.m65745e(this.navigationAction, c35764e.navigationAction) && AbstractC22676k.m65745e(this.ctaInteraction, c35764e.ctaInteraction) && this.ctaIcon == c35764e.ctaIcon && AbstractC22676k.m65745e(this.title, c35764e.title) && AbstractC22676k.m65745e(this.titleIcon, c35764e.titleIcon) && AbstractC22676k.m65745e(this.featureFlags, c35764e.featureFlags);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getTitleIcon() {
        return this.titleIcon;
    }

    public int hashCode() {
        C9598e c9598e = this.navigationAction;
        int iHashCode = (c9598e == null ? 0 : c9598e.hashCode()) * 31;
        GenericInteraction genericInteraction = this.ctaInteraction;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.ctaIcon, (iHashCode + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31, 31), 31, this.title);
        Integer num = this.titleIcon;
        return this.featureFlags.hashCode() + ((iM30450d + (num != null ? num.hashCode() : 0)) * 31);
    }

    public String toString() {
        C9598e c9598e = this.navigationAction;
        GenericInteraction genericInteraction = this.ctaInteraction;
        int i13 = this.ctaIcon;
        String str = this.title;
        Integer num = this.titleIcon;
        List<String> list = this.featureFlags;
        StringBuilder sb4 = new StringBuilder("ItemsCardHeaderState(navigationAction=");
        sb4.append(c9598e);
        sb4.append(", ctaInteraction=");
        sb4.append(genericInteraction);
        sb4.append(", ctaIcon=");
        AbstractC11895b.m31979B(i13, ", title=", str, ", titleIcon=", sb4);
        sb4.append(num);
        sb4.append(", featureFlags=");
        sb4.append(list);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C35764e(C9598e c9598e, GenericInteraction genericInteraction, int i13, String str, Integer num, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(c9598e, (i14 & 2) != 0 ? null : genericInteraction, i13, str, num, (i14 & 32) != 0 ? C25271y.f99162w : list);
    }
}
