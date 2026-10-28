package wr0;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import kd1.AbstractC22403o;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wr0.a0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0019\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lwr0/a0;", "", "Lcom/whoop/design/util/TextResource;", "name", "subtitle", "Lkd1/o;", "avatar", "Lcom/whoop/navigation/models/GenericInteraction;", "action", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "d", "Lkd1/o;", "()Lkd1/o;", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37517a0 {

    /* JADX INFO: renamed from: e */
    public static final int f160448e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o avatar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final GenericInteraction action;

    static {
        int i13 = GenericInteraction.$stable | AbstractC22403o.f87638a;
        int i14 = TextResource.$stable;
        f160448e = i13 | i14 | i14;
    }

    public C37517a0(TextResource name, TextResource textResource, AbstractC22403o abstractC22403o, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(name, "name");
        this.name = name;
        this.subtitle = textResource;
        this.avatar = abstractC22403o;
        this.action = genericInteraction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final GenericInteraction getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37517a0)) {
            return false;
        }
        C37517a0 c37517a0 = (C37517a0) other;
        return AbstractC22676k.m65745e(this.name, c37517a0.name) && AbstractC22676k.m65745e(this.subtitle, c37517a0.subtitle) && AbstractC22676k.m65745e(this.avatar, c37517a0.avatar) && AbstractC22676k.m65745e(this.action, c37517a0.action);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        TextResource textResource = this.subtitle;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.avatar;
        int iHashCode3 = (iHashCode2 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        GenericInteraction genericInteraction = this.action;
        return iHashCode3 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        return AbstractC30802r.m94762k("MomentCardProfileChrome(hasAvatar=", ", hasAction=", ")", this.avatar != null, this.action != null);
    }
}
