package com.whoop.design.models.anchorSelector;

import com.whoop.design.models.DesignModelWrapper;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.SearchFilterableModel;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"SUGGESTED_SECTION_TYPE", "", "withFilteredSearchResults", "Lcom/whoop/design/models/DesignSystemModel;", "searchText", "isSearchResult", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AnchorSelectorModelKt {
    private static final String SUGGESTED_SECTION_TYPE = "suggested";

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSearchResult(DesignSystemModel designSystemModel) {
        if (designSystemModel instanceof DesignModelWrapper) {
            return isSearchResult(((DesignModelWrapper) designSystemModel).getModel());
        }
        return designSystemModel instanceof SearchFilterableModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DesignSystemModel withFilteredSearchResults(DesignSystemModel designSystemModel, String str) {
        if (!(designSystemModel instanceof DesignModelWrapper)) {
            return designSystemModel instanceof SearchFilterableModel ? ((SearchFilterableModel) designSystemModel).filteredForSearch(str) : designSystemModel;
        }
        DesignModelWrapper designModelWrapper = (DesignModelWrapper) designSystemModel;
        DesignSystemModel designSystemModelWithFilteredSearchResults = withFilteredSearchResults(designModelWrapper.getModel(), str);
        if (designSystemModelWithFilteredSearchResults == null) {
            return null;
        }
        return DesignModelWrapper.copy$default(designModelWrapper, designSystemModelWithFilteredSearchResults, null, null, null, null, 30, null);
    }
}
