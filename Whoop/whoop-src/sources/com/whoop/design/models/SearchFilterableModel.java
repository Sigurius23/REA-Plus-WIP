package com.whoop.design.models;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/design/models/SearchFilterableModel;", "Lcom/whoop/design/models/DesignSystemModel;", "filteredForSearch", "query", "", "Companion", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface SearchFilterableModel extends DesignSystemModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/SearchFilterableModel$Companion;", "", "<init>", "()V", "matchesQuery", "", "query", "", "searchKeys", "", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final boolean matchesQuery(String query, List<String> searchKeys) {
            AbstractC22676k.m65750j(query, "query");
            if (searchKeys == null) {
                searchKeys = C25271y.f99162w;
            }
            List<String> list = searchKeys;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC39414r.m125876U((String) it.next(), query, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    SearchFilterableModel filteredForSearch(String query);
}
