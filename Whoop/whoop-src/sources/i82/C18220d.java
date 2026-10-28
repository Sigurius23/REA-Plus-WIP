package i82;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.items.FollowerRequestModel;
import com.whoop.searcharchmini.domain.model.SearchArchMiniResponse;
import com.whoop.whoopaction.domain.models.Action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25271y;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i82.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\bR\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001e¨\u0006 "}, m65681d2 = {"Li82/d;", "", "<init>", "()V", "Li82/a;", "resolution", "Li82/d$a;", "a", "(Li82/a;)Li82/d$a;", "Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;", "data", "Ll83/a0;", "b", "(Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;)V", "", "id", "Li82/b;", "stages", "c", "(Ljava/lang/String;Li82/b;)V", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "d", "(Lcom/whoop/whoopaction/domain/models/Action;)Li82/a;", "e", "", "Lcom/whoop/design/models/items/FollowerRequestModel;", "Ljava/util/List;", "followerItems", "", "Ljava/util/Map;", "followerRequestItemUiStages", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18220d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private List<FollowerRequestModel> followerItems = C25271y.f99162w;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Map<String, C18218b> followerRequestItemUiStages = C25272z.f99163w;

    /* JADX INFO: renamed from: i82.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Li82/d$a;", "", "", "id", "Li82/b;", "stages", "<init>", "(Ljava/lang/String;Li82/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Li82/b;", "()Li82/b;", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C18218b stages;

        public a(String id4, C18218b stages) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(stages, "stages");
            this.id = id4;
            this.stages = stages;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C18218b getStages() {
            return this.stages;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.id, aVar.id) && AbstractC22676k.m65745e(this.stages, aVar.stages);
        }

        public int hashCode() {
            return this.stages.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "StageDelta(id=" + this.id + ", stages=" + this.stages + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    private final a m52426a(AbstractC18217a resolution) {
        if (resolution instanceof AbstractC18217a.c) {
            AbstractC18217a.c cVar = (AbstractC18217a.c) resolution;
            if (!cVar.getHasSecondaryProgression()) {
                return new a(cVar.getId(), new C18218b(null, null, true, 3, null));
            }
            C18218b c18218b = this.followerRequestItemUiStages.get(cVar.getId());
            if (c18218b == null) {
                c18218b = new C18218b(null, null, false, 7, null);
            }
            return new a(cVar.getId(), c18218b.m52417a(EnumC18221e.AFTER_PRIMARY_ACTION, null, false));
        }
        if (resolution instanceof AbstractC18217a.d) {
            AbstractC18217a.d dVar = (AbstractC18217a.d) resolution;
            if (!dVar.getHasTertiaryStart()) {
                return new a(dVar.getId(), new C18218b(null, null, true, 3, null));
            }
            C18218b c18218b2 = this.followerRequestItemUiStages.get(dVar.getId());
            if (c18218b2 == null) {
                c18218b2 = new C18218b(null, null, false, 7, null);
            }
            return new a(dVar.getId(), c18218b2.m52417a(EnumC18221e.AFTER_SECONDARY_ACTION, null, false));
        }
        if (resolution instanceof AbstractC18217a.a) {
            AbstractC18217a.a aVar = (AbstractC18217a.a) resolution;
            if (!aVar.getHasSecondaryEnd()) {
                return new a(aVar.getId(), new C18218b(null, null, true, 3, null));
            }
            C18218b c18218b3 = this.followerRequestItemUiStages.get(aVar.getId());
            if (c18218b3 == null) {
                c18218b3 = new C18218b(null, null, false, 7, null);
            }
            return new a(aVar.getId(), c18218b3.m52417a(null, EnumC18221e.AFTER_PRIMARY_ACTION, false));
        }
        if (!(resolution instanceof AbstractC18217a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC18217a.b bVar = (AbstractC18217a.b) resolution;
        if (!bVar.getHasTertiaryEnd()) {
            return new a(bVar.getId(), new C18218b(null, null, true, 3, null));
        }
        C18218b c18218b4 = this.followerRequestItemUiStages.get(bVar.getId());
        if (c18218b4 == null) {
            c18218b4 = new C18218b(null, null, false, 7, null);
        }
        return new a(bVar.getId(), c18218b4.m52417a(null, EnumC18221e.AFTER_SECONDARY_ACTION, false));
    }

    /* JADX INFO: renamed from: b */
    public final void m52427b(SearchArchMiniResponse data) {
        AbstractC22676k.m65750j(data, "data");
        List<DesignSystemModel> items = data.getItems();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            DesignSystemModel designSystemModelUnwrap = DesignSystemModelKt.unwrap((DesignSystemModel) it.next());
            FollowerRequestModel followerRequestModel = designSystemModelUnwrap instanceof FollowerRequestModel ? (FollowerRequestModel) designSystemModelUnwrap : null;
            if (followerRequestModel != null) {
                arrayList.add(followerRequestModel);
            }
        }
        this.followerItems = arrayList;
        this.followerRequestItemUiStages = C25272z.f99163w;
    }

    /* JADX INFO: renamed from: c */
    public final void m52428c(String id4, C18218b stages) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(stages, "stages");
        this.followerRequestItemUiStages = AbstractC25247g0.m73996e0(this.followerRequestItemUiStages, new C23465k(id4, stages));
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC18217a m52429d(Action action) {
        AbstractC22676k.m65750j(action, "action");
        return AbstractC18219c.m52423c(action, this.followerItems, this.followerRequestItemUiStages);
    }

    /* JADX INFO: renamed from: e */
    public final a m52430e(AbstractC18217a resolution) {
        AbstractC22676k.m65750j(resolution, "resolution");
        return m52426a(resolution);
    }
}
