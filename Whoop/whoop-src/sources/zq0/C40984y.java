package zq0;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import java.util.List;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;
import vy0.C36570d0;

/* JADX INFO: renamed from: zq0.y */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u001d\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u0019\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, m65681d2 = {"Lzq0/y;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lkd1/o;", "avatar", "Lcom/whoop/navigation/models/GenericInteraction;", "action", "", "Lzq0/y$a;", "trailingButtons", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "d", "Lkd1/o;", "()Lkd1/o;", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "e", "Ljava/util/List;", "()Ljava/util/List;", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40984y implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o avatar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final GenericInteraction action;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<a> trailingButtons;

    /* JADX INFO: renamed from: zq0.y$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lzq0/y$a;", "", "", "icon", "Lcom/whoop/navigation/models/GenericInteraction;", "action", "Lvy0/d0;", "menu", "<init>", "(ILcom/whoop/navigation/models/GenericInteraction;Lvy0/d0;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "c", "Lvy0/d0;", "()Lvy0/d0;", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: d */
        public static final int f176879d = C36570d0.f156622b | GenericInteraction.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final GenericInteraction action;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C36570d0 menu;

        public a(int i13, GenericInteraction action, C36570d0 c36570d0) {
            AbstractC22676k.m65750j(action, "action");
            this.icon = i13;
            this.action = action;
            this.menu = c36570d0;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final GenericInteraction getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C36570d0 getMenu() {
            return this.menu;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.icon == aVar.icon && AbstractC22676k.m65745e(this.action, aVar.action) && AbstractC22676k.m65745e(this.menu, aVar.menu);
        }

        public int hashCode() {
            int iHashCode = (this.action.hashCode() + (Integer.hashCode(this.icon) * 31)) * 31;
            C36570d0 c36570d0 = this.menu;
            return iHashCode + (c36570d0 == null ? 0 : c36570d0.hashCode());
        }

        public String toString() {
            return "TrailingButton(icon=" + this.icon + ", action=" + this.action + ", menu=" + this.menu + ")";
        }
    }

    public C40984y(TextResource title, TextResource textResource, AbstractC22403o abstractC22403o, GenericInteraction genericInteraction, List<a> trailingButtons) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(trailingButtons, "trailingButtons");
        this.title = title;
        this.subtitle = textResource;
        this.avatar = abstractC22403o;
        this.action = genericInteraction;
        this.trailingButtons = trailingButtons;
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
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e */
    public final List<a> m133095e() {
        return this.trailingButtons;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40984y)) {
            return false;
        }
        C40984y c40984y = (C40984y) other;
        return AbstractC22676k.m65745e(this.title, c40984y.title) && AbstractC22676k.m65745e(this.subtitle, c40984y.subtitle) && AbstractC22676k.m65745e(this.avatar, c40984y.avatar) && AbstractC22676k.m65745e(this.action, c40984y.action) && AbstractC22676k.m65745e(this.trailingButtons, c40984y.trailingButtons);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextResource textResource = this.subtitle;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.avatar;
        int iHashCode3 = (iHashCode2 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        GenericInteraction genericInteraction = this.action;
        return this.trailingButtons.hashCode() + ((iHashCode3 + (genericInteraction != null ? genericInteraction.hashCode() : 0)) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        AbstractC22403o abstractC22403o = this.avatar;
        GenericInteraction genericInteraction = this.action;
        List<a> list = this.trailingButtons;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("SnapshotHeaderState(title=", textResource, ", subtitle=", textResource2, ", avatar=");
        sbM106658q.append(abstractC22403o);
        sbM106658q.append(", action=");
        sbM106658q.append(genericInteraction);
        sbM106658q.append(", trailingButtons=");
        return AbstractC3855a.m11829m(sbM106658q, list, ")");
    }
}
