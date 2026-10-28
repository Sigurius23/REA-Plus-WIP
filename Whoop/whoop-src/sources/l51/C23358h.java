package l51;

import com.whoop.navigation.models.GenericInteraction;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l51.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Ll51/h;", "", "", "iconRes", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Ljava/lang/Integer;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23358h {

    /* JADX INFO: renamed from: c */
    public static final int f92596c = GenericInteraction.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Integer iconRes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    public C23358h(Integer num, GenericInteraction genericInteraction) {
        this.iconRes = num;
        this.interaction = genericInteraction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getIconRes() {
        return this.iconRes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23358h)) {
            return false;
        }
        C23358h c23358h = (C23358h) other;
        return AbstractC22676k.m65745e(this.iconRes, c23358h.iconRes) && AbstractC22676k.m65745e(this.interaction, c23358h.interaction);
    }

    public int hashCode() {
        Integer num = this.iconRes;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        GenericInteraction genericInteraction = this.interaction;
        return iHashCode + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        return "HeaderIconConfigState(iconRes=" + this.iconRes + ", interaction=" + this.interaction + ")";
    }
}
