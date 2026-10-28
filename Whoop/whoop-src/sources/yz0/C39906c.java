package yz0;

import com.whoop.navigation.models.GenericInteraction;
import kd1.AbstractC22403o;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: yz0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lyz0/c;", "Lm91/u;", "Lkd1/o;", "image", "", "title", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Lkd1/o;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "()Lkd1/o;", "b", "Ljava/lang/String;", "c", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39906c implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f172301d = GenericInteraction.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    public C39906c(AbstractC22403o image, String title, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        this.image = image;
        this.title = title;
        this.interaction = genericInteraction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39906c)) {
            return false;
        }
        C39906c c39906c = (C39906c) other;
        return AbstractC22676k.m65745e(this.image, c39906c.image) && AbstractC22676k.m65745e(this.title, c39906c.title) && AbstractC22676k.m65745e(this.interaction, c39906c.interaction);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.image.hashCode() * 31, 31, this.title);
        GenericInteraction genericInteraction = this.interaction;
        return iM30450d + (genericInteraction == null ? 0 : genericInteraction.hashCode());
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.image;
        String str = this.title;
        GenericInteraction genericInteraction = this.interaction;
        StringBuilder sb4 = new StringBuilder("AvatarPillViewState(image=");
        sb4.append(abstractC22403o);
        sb4.append(", title=");
        sb4.append(str);
        sb4.append(", interaction=");
        return AbstractC26725a.m79506j(sb4, genericInteraction, ")");
    }
}
