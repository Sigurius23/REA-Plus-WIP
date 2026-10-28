package io.getstream.chat.android.p226ui.feature.channels;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1643y1;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1620r;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import e93.AbstractC12889b;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.querysort.QuerySorter;
import io.getstream.chat.android.p226ui.common.utils.Utils;
import io.getstream.chat.android.p226ui.databinding.StreamUiFragmentChannelListBinding;
import io.getstream.chat.android.p226ui.feature.channels.header.ChannelListHeaderView;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListFragmentViewStyle;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListView;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.C19635b;
import io.getstream.chat.android.p226ui.feature.messages.ChannelActivity;
import io.getstream.chat.android.p226ui.feature.search.SearchInputView;
import io.getstream.chat.android.p226ui.feature.search.list.SearchResultListView;
import io.getstream.chat.android.p226ui.viewmodel.channels.ChannelListHeaderViewModel;
import io.getstream.chat.android.p226ui.viewmodel.channels.ChannelListHeaderViewModelBinding;
import io.getstream.chat.android.p226ui.viewmodel.channels.ChannelListViewModel;
import io.getstream.chat.android.p226ui.viewmodel.channels.ChannelListViewModelBinding;
import io.getstream.chat.android.p226ui.viewmodel.channels.ChannelListViewModelFactory;
import io.getstream.chat.android.p226ui.viewmodel.search.SearchViewModel;
import io.getstream.chat.android.p226ui.viewmodel.search.SearchViewModelBinding;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p047c9.C4312c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 ~2\u00020\u0001:\n\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001~B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\u0003J\u000f\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b/\u00100J\u0011\u00102\u001a\u0004\u0018\u000101H\u0014¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0014¢\u0006\u0004\b6\u00107R\u001b\u0010;\u001a\u00020\u00198DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001bR\u001b\u0010@\u001a\u00020<8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010?R\u001b\u0010C\u001a\u00020<8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bA\u00109\u001a\u0004\bB\u0010?R\u001d\u0010H\u001a\u0004\u0018\u00010D8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bE\u00109\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bJ\u00109\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bO\u00109\u001a\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020S8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bT\u00109\u001a\u0004\bU\u0010VR\"\u0010\u0016\u001a\u00020\u00158\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0016\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\u0018R$\u0010]\u001a\u0004\u0018\u00010\\8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010d\u001a\u0004\u0018\u00010c8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010k\u001a\u0004\u0018\u00010j8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR$\u0010r\u001a\u0004\u0018\u00010q8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u0018\u0010y\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010}\u001a\u00020x8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|¨\u0006\u0084\u0001"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/content/Context;", "context", "Ll83/a0;", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;", "style", "applyStyle", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;)V", "", "getTheme", "()I", "Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;", "channelListHeaderView", "setupChannelListHeader", "(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;)V", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;", "channelListView", "setupChannelList", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;)V", "Lio/getstream/chat/android/ui/feature/search/SearchInputView;", "searchInputView", "setupSearchInput", "(Lio/getstream/chat/android/ui/feature/search/SearchInputView;)V", "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;", "searchResultListView", "setupSearchResultList", "(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;)V", "onDestroyView", "onDetach", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;", "createChannelListViewModelFactory", "()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;", "Lio/getstream/chat/android/models/FilterObject;", "getFilter", "()Lio/getstream/chat/android/models/FilterObject;", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Channel;", "getSort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "themeResId$delegate", "Ll83/h;", "getThemeResId", "themeResId", "", "showHeader$delegate", "getShowHeader", "()Z", "showHeader", "showSearch$delegate", "getShowSearch", "showSearch", "", "headerTitle$delegate", "getHeaderTitle", "()Ljava/lang/String;", "headerTitle", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;", "channelListHeaderViewModel$delegate", "getChannelListHeaderViewModel", "()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;", "channelListHeaderViewModel", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;", "channelListViewModel$delegate", "getChannelListViewModel", "()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;", "channelListViewModel", "Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;", "searchViewModel$delegate", "getSearchViewModel", "()Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;", "searchViewModel", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;", "getStyle", "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;", "setStyle", "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;", "headerUserAvatarClickListener", "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;", "getHeaderUserAvatarClickListener", "()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;", "setHeaderUserAvatarClickListener", "(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;)V", "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;", "headerActionButtonClickListener", "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;", "getHeaderActionButtonClickListener", "()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;", "setHeaderActionButtonClickListener", "(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;)V", "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;", "channelListItemClickListener", "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;", "getChannelListItemClickListener", "()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;", "setChannelListItemClickListener", "(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;)V", "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;", "searchResultClickListener", "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;", "getSearchResultClickListener", "()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;", "setSearchResultClickListener", "(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;", "binding", "Companion", "HeaderActionButtonClickListener", "HeaderUserAvatarClickListener", "ChannelListItemClickListener", "SearchResultClickListener", "Builder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class ChannelListFragment extends AbstractComponentCallbacksC1320m0 {
    private static final String ARG_HEADER_TITLE = "header_title";
    private static final String ARG_SHOW_HEADER = "show_header";
    private static final String ARG_SHOW_SEARCH = "show_search";
    private static final String ARG_THEME_RES_ID = "theme_res_id";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private StreamUiFragmentChannelListBinding _binding;

    /* JADX INFO: renamed from: channelListHeaderViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h channelListHeaderViewModel;
    private ChannelListItemClickListener channelListItemClickListener;

    /* JADX INFO: renamed from: channelListViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h channelListViewModel;
    private HeaderActionButtonClickListener headerActionButtonClickListener;

    /* JADX INFO: renamed from: headerTitle$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h headerTitle;
    private HeaderUserAvatarClickListener headerUserAvatarClickListener;
    private SearchResultClickListener searchResultClickListener;

    /* JADX INFO: renamed from: searchViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h searchViewModel;

    /* JADX INFO: renamed from: showHeader$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h showHeader;

    /* JADX INFO: renamed from: showSearch$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h showSearch;
    protected ChannelListFragmentViewStyle style;

    /* JADX INFO: renamed from: themeResId$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h themeResId;

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u001d\u0010\u000e\u001a\u00020\u0000\"\b\b\u0000\u0010\u000f*\u00020\f2\u0006\u0010\u000b\u001a\u0002H\u000f¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;", "", "<init>", "()V", "themeResId", "", "showHeader", "", "showSearch", "headerTitle", "", "fragment", "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;", "customTheme", "setFragment", "T", "(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;", "build", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private ChannelListFragment fragment;
        private String headerTitle;
        private boolean showHeader = true;
        private boolean showSearch = true;
        private int themeResId;

        public final ChannelListFragment build() {
            ChannelListFragment channelListFragment = this.fragment;
            if (channelListFragment == null) {
                channelListFragment = new ChannelListFragment();
            }
            channelListFragment.setArguments(AbstractC12889b.m36273g(new C23465k(ChannelListFragment.ARG_THEME_RES_ID, Integer.valueOf(this.themeResId)), new C23465k(ChannelListFragment.ARG_SHOW_HEADER, Boolean.valueOf(this.showHeader)), new C23465k(ChannelListFragment.ARG_SHOW_SEARCH, Boolean.valueOf(this.showSearch)), new C23465k(ChannelListFragment.ARG_HEADER_TITLE, this.headerTitle)));
            return channelListFragment;
        }

        public final Builder customTheme(int themeResId) {
            this.themeResId = themeResId;
            return this;
        }

        public final Builder headerTitle(String headerTitle) {
            this.headerTitle = headerTitle;
            return this;
        }

        public final <T extends ChannelListFragment> Builder setFragment(T fragment) {
            AbstractC22676k.m65750j(fragment, "fragment");
            this.fragment = fragment;
            return this;
        }

        public final Builder showHeader(boolean showHeader) {
            this.showHeader = showHeader;
            return this;
        }

        public final Builder showSearch(boolean showSearch) {
            this.showSearch = showSearch;
            return this;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;", "", "Lio/getstream/chat/android/models/Channel;", "channel", "Ll83/a0;", "onChannelClick", "(Lio/getstream/chat/android/models/Channel;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ChannelListItemClickListener {
        void onChannelClick(Channel channel);
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;", "Ll83/a0;", "initializer", "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;", "newInstance", "(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;", "", "ARG_THEME_RES_ID", "Ljava/lang/String;", "ARG_SHOW_HEADER", "ARG_SHOW_SEARCH", "ARG_HEADER_TITLE", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ ChannelListFragment newInstance$default(Companion companion, Function1 function1, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                function1 = null;
            }
            return companion.newInstance(function1);
        }

        public final ChannelListFragment newInstance() {
            return newInstance$default(this, null, 1, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final ChannelListFragment newInstance(Function1 initializer) {
            Builder builder = new Builder();
            if (initializer != null) {
                initializer.invoke(builder);
            }
            return builder.build();
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;", "", "Ll83/a0;", "onActionButtonClick", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface HeaderActionButtonClickListener {
        void onActionButtonClick();
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;", "", "Ll83/a0;", "onUserAvatarClick", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface HeaderUserAvatarClickListener {
        void onUserAvatarClick();
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onSearchResultClick", "(Lio/getstream/chat/android/models/Message;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface SearchResultClickListener {
        void onSearchResultClick(Message message);
    }

    public ChannelListFragment() {
        final int i13 = 0;
        this.themeResId = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.channels.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelListFragment f74478x;

            {
                this.f74478x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return Integer.valueOf(this.f74478x.requireArguments().getInt("theme_res_id"));
                    case 1:
                        return Boolean.valueOf(this.f74478x.requireArguments().getBoolean("show_header", true));
                    case 2:
                        return Boolean.valueOf(this.f74478x.requireArguments().getBoolean("show_search", true));
                    case 3:
                        return this.f74478x.requireArguments().getString("header_title");
                    default:
                        return this.f74478x.createChannelListViewModelFactory();
                }
            }
        });
        final int i14 = 1;
        this.showHeader = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.channels.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelListFragment f74478x;

            {
                this.f74478x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return Integer.valueOf(this.f74478x.requireArguments().getInt("theme_res_id"));
                    case 1:
                        return Boolean.valueOf(this.f74478x.requireArguments().getBoolean("show_header", true));
                    case 2:
                        return Boolean.valueOf(this.f74478x.requireArguments().getBoolean("show_search", true));
                    case 3:
                        return this.f74478x.requireArguments().getString("header_title");
                    default:
                        return this.f74478x.createChannelListViewModelFactory();
                }
            }
        });
        final int i15 = 2;
        this.showSearch = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.channels.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelListFragment f74478x;

            {
                this.f74478x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return Integer.valueOf(this.f74478x.requireArguments().getInt("theme_res_id"));
                    case 1:
                        return Boolean.valueOf(this.f74478x.requireArguments().getBoolean("show_header", true));
                    case 2:
                        return Boolean.valueOf(this.f74478x.requireArguments().getBoolean("show_search", true));
                    case 3:
                        return this.f74478x.requireArguments().getString("header_title");
                    default:
                        return this.f74478x.createChannelListViewModelFactory();
                }
            }
        });
        final int i16 = 3;
        this.headerTitle = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.channels.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelListFragment f74478x;

            {
                this.f74478x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return Integer.valueOf(this.f74478x.requireArguments().getInt("theme_res_id"));
                    case 1:
                        return Boolean.valueOf(this.f74478x.requireArguments().getBoolean("show_header", true));
                    case 2:
                        return Boolean.valueOf(this.f74478x.requireArguments().getBoolean("show_search", true));
                    case 3:
                        return this.f74478x.requireArguments().getString("header_title");
                    default:
                        return this.f74478x.createChannelListViewModelFactory();
                }
            }
        });
        ChannelListFragment$special$$inlined$viewModels$default$1 channelListFragment$special$$inlined$viewModels$default$1 = new ChannelListFragment$special$$inlined$viewModels$default$1(this);
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(enumC23463i, new ChannelListFragment$special$$inlined$viewModels$default$2(channelListFragment$special$$inlined$viewModels$default$1));
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        this.channelListHeaderViewModel = new C1643y1(c22673i0.getOrCreateKotlinClass(ChannelListHeaderViewModel.class), new ChannelListFragment$special$$inlined$viewModels$default$3(interfaceC23462hM92087G), new ChannelListFragment$special$$inlined$viewModels$default$5(this, interfaceC23462hM92087G), new ChannelListFragment$special$$inlined$viewModels$default$4(null, interfaceC23462hM92087G));
        final int i17 = 4;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.channels.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelListFragment f74478x;

            {
                this.f74478x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return Integer.valueOf(this.f74478x.requireArguments().getInt("theme_res_id"));
                    case 1:
                        return Boolean.valueOf(this.f74478x.requireArguments().getBoolean("show_header", true));
                    case 2:
                        return Boolean.valueOf(this.f74478x.requireArguments().getBoolean("show_search", true));
                    case 3:
                        return this.f74478x.requireArguments().getString("header_title");
                    default:
                        return this.f74478x.createChannelListViewModelFactory();
                }
            }
        };
        InterfaceC23462h interfaceC23462hM92087G2 = AbstractC30060g.m92087G(enumC23463i, new ChannelListFragment$special$$inlined$viewModels$default$7(new ChannelListFragment$special$$inlined$viewModels$default$6(this)));
        this.channelListViewModel = new C1643y1(c22673i0.getOrCreateKotlinClass(ChannelListViewModel.class), new ChannelListFragment$special$$inlined$viewModels$default$8(interfaceC23462hM92087G2), interfaceC4339a, new ChannelListFragment$special$$inlined$viewModels$default$9(null, interfaceC23462hM92087G2));
        InterfaceC23462h interfaceC23462hM92087G3 = AbstractC30060g.m92087G(enumC23463i, new ChannelListFragment$special$$inlined$viewModels$default$12(new ChannelListFragment$special$$inlined$viewModels$default$11(this)));
        this.searchViewModel = new C1643y1(c22673i0.getOrCreateKotlinClass(SearchViewModel.class), new ChannelListFragment$special$$inlined$viewModels$default$13(interfaceC23462hM92087G3), new ChannelListFragment$special$$inlined$viewModels$default$15(this, interfaceC23462hM92087G3), new ChannelListFragment$special$$inlined$viewModels$default$14(null, interfaceC23462hM92087G3));
    }

    /* JADX INFO: renamed from: B */
    public static void m55089B(ChannelListFragment channelListFragment) {
        HeaderUserAvatarClickListener headerUserAvatarClickListener = channelListFragment.headerUserAvatarClickListener;
        if (headerUserAvatarClickListener != null) {
            headerUserAvatarClickListener.onUserAvatarClick();
        }
    }

    public static final ChannelListFragment newInstance() {
        Companion companion = INSTANCE;
        companion.getClass();
        return Companion.newInstance$default(companion, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupChannelList$lambda$11$lambda$10(ChannelListFragment channelListFragment, Channel it) {
        AbstractC22676k.m65750j(it, "it");
        ChannelListItemClickListener channelListItemClickListener = channelListFragment.channelListItemClickListener;
        if (channelListItemClickListener != null) {
            if (channelListItemClickListener != null) {
                channelListItemClickListener.onChannelClick(it);
            }
        } else {
            ChannelActivity.Companion companion = ChannelActivity.INSTANCE;
            Context contextRequireContext = channelListFragment.requireContext();
            AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
            channelListFragment.startActivity(ChannelActivity.Companion.createIntent$default(companion, contextRequireContext, it.getCid(), null, null, 12, null));
        }
    }

    private static final void setupChannelListHeader$lambda$9$lambda$7(ChannelListFragment channelListFragment) {
        HeaderActionButtonClickListener headerActionButtonClickListener = channelListFragment.headerActionButtonClickListener;
        if (headerActionButtonClickListener != null) {
            headerActionButtonClickListener.onActionButtonClick();
        }
    }

    private static final void setupChannelListHeader$lambda$9$lambda$8(ChannelListFragment channelListFragment) {
        HeaderUserAvatarClickListener headerUserAvatarClickListener = channelListFragment.headerUserAvatarClickListener;
        if (headerUserAvatarClickListener != null) {
            headerUserAvatarClickListener.onUserAvatarClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSearchInput$lambda$14$lambda$12(ChannelListFragment channelListFragment, String query) {
        AbstractC22676k.m65750j(query, "query");
        if (query.length() == 0) {
            StreamUiFragmentChannelListBinding streamUiFragmentChannelListBinding = channelListFragment._binding;
            AbstractC22676k.m65747g(streamUiFragmentChannelListBinding);
            ChannelListView channelListView = streamUiFragmentChannelListBinding.channelListView;
            AbstractC22676k.m65749i(channelListView, "channelListView");
            channelListView.setVisibility(0);
            StreamUiFragmentChannelListBinding streamUiFragmentChannelListBinding2 = channelListFragment._binding;
            AbstractC22676k.m65747g(streamUiFragmentChannelListBinding2);
            SearchResultListView searchResultListView = streamUiFragmentChannelListBinding2.searchResultListView;
            AbstractC22676k.m65749i(searchResultListView, "searchResultListView");
            searchResultListView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSearchInput$lambda$14$lambda$13(SearchInputView searchInputView, ChannelListFragment channelListFragment, String query) {
        AbstractC22676k.m65750j(query, "query");
        Utils.hideSoftKeyboard(searchInputView);
        channelListFragment.getSearchViewModel().setQuery(query);
        StreamUiFragmentChannelListBinding streamUiFragmentChannelListBinding = channelListFragment._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelListBinding);
        ChannelListView channelListView = streamUiFragmentChannelListBinding.channelListView;
        AbstractC22676k.m65749i(channelListView, "channelListView");
        channelListView.setVisibility(query.length() == 0 ? 0 : 8);
        StreamUiFragmentChannelListBinding streamUiFragmentChannelListBinding2 = channelListFragment._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelListBinding2);
        SearchResultListView searchResultListView = streamUiFragmentChannelListBinding2.searchResultListView;
        AbstractC22676k.m65749i(searchResultListView, "searchResultListView");
        searchResultListView.setVisibility(query.length() > 0 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSearchResultList$lambda$16$lambda$15(ChannelListFragment channelListFragment, Message it) {
        AbstractC22676k.m65750j(it, "it");
        SearchResultClickListener searchResultClickListener = channelListFragment.searchResultClickListener;
        if (searchResultClickListener != null) {
            if (searchResultClickListener != null) {
                searchResultClickListener.onSearchResultClick(it);
            }
        } else {
            ChannelActivity.Companion companion = ChannelActivity.INSTANCE;
            Context contextRequireContext = channelListFragment.requireContext();
            AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
            channelListFragment.startActivity(ChannelActivity.Companion.createIntent$default(companion, contextRequireContext, it.getCid(), it.getId(), null, 8, null));
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m55092y(ChannelListFragment channelListFragment) {
        HeaderActionButtonClickListener headerActionButtonClickListener = channelListFragment.headerActionButtonClickListener;
        if (headerActionButtonClickListener != null) {
            headerActionButtonClickListener.onActionButtonClick();
        }
    }

    public final void applyStyle(ChannelListFragmentViewStyle style) {
        AbstractC22676k.m65750j(style, "style");
        StreamUiFragmentChannelListBinding streamUiFragmentChannelListBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelListBinding);
        SearchInputView searchInputView = streamUiFragmentChannelListBinding.searchInputView;
        AbstractC22676k.m65749i(searchInputView, "searchInputView");
        ViewGroup.LayoutParams layoutParams = searchInputView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = style.getSearchInputMarginTop();
        marginLayoutParams.bottomMargin = style.getSearchInputMarginBottom();
        marginLayoutParams.setMarginStart(style.getSearchInputMarginStart());
        marginLayoutParams.setMarginEnd(style.getSearchInputMarginEnd());
        searchInputView.setLayoutParams(marginLayoutParams);
    }

    public final ChannelListViewModelFactory createChannelListViewModelFactory() {
        return new ChannelListViewModelFactory(null, ChannelListViewModel.DEFAULT_SORT, 0, null, null, false, null, 124, null);
    }

    public final StreamUiFragmentChannelListBinding getBinding() {
        StreamUiFragmentChannelListBinding streamUiFragmentChannelListBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelListBinding);
        return streamUiFragmentChannelListBinding;
    }

    public final ChannelListHeaderViewModel getChannelListHeaderViewModel() {
        return (ChannelListHeaderViewModel) this.channelListHeaderViewModel.getValue();
    }

    public final ChannelListItemClickListener getChannelListItemClickListener() {
        return this.channelListItemClickListener;
    }

    public final ChannelListViewModel getChannelListViewModel() {
        return (ChannelListViewModel) this.channelListViewModel.getValue();
    }

    public final FilterObject getFilter() {
        return null;
    }

    public final HeaderActionButtonClickListener getHeaderActionButtonClickListener() {
        return this.headerActionButtonClickListener;
    }

    public final String getHeaderTitle() {
        return (String) this.headerTitle.getValue();
    }

    public final HeaderUserAvatarClickListener getHeaderUserAvatarClickListener() {
        return this.headerUserAvatarClickListener;
    }

    public final SearchResultClickListener getSearchResultClickListener() {
        return this.searchResultClickListener;
    }

    public final SearchViewModel getSearchViewModel() {
        return (SearchViewModel) this.searchViewModel.getValue();
    }

    public final boolean getShowHeader() {
        return ((Boolean) this.showHeader.getValue()).booleanValue();
    }

    public final boolean getShowSearch() {
        return ((Boolean) this.showSearch.getValue()).booleanValue();
    }

    public final QuerySorter<Channel> getSort() {
        return ChannelListViewModel.DEFAULT_SORT;
    }

    public final ChannelListFragmentViewStyle getStyle() {
        ChannelListFragmentViewStyle channelListFragmentViewStyle = this.style;
        if (channelListFragmentViewStyle != null) {
            return channelListFragmentViewStyle;
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    public final int getTheme() {
        return getThemeResId();
    }

    public final int getThemeResId() {
        return ((Number) this.themeResId.getValue()).intValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onAttach(Context context) {
        AbstractC22676k.m65750j(context, "context");
        super.onAttach(context);
        setStyle(ChannelListFragmentViewStyle.INSTANCE.invoke(context));
        InterfaceC1620r parentFragment = getParentFragment();
        if (!(parentFragment instanceof HeaderUserAvatarClickListener)) {
            parentFragment = null;
        }
        HeaderUserAvatarClickListener headerUserAvatarClickListener = (HeaderUserAvatarClickListener) parentFragment;
        if (headerUserAvatarClickListener == null) {
            ActivityCompat.OnRequestPermissionsResultCallback activity = getActivity();
            if (!(activity instanceof HeaderUserAvatarClickListener)) {
                activity = null;
            }
            headerUserAvatarClickListener = (HeaderUserAvatarClickListener) activity;
        }
        this.headerUserAvatarClickListener = headerUserAvatarClickListener;
        InterfaceC1620r parentFragment2 = getParentFragment();
        if (!(parentFragment2 instanceof HeaderActionButtonClickListener)) {
            parentFragment2 = null;
        }
        HeaderActionButtonClickListener headerActionButtonClickListener = (HeaderActionButtonClickListener) parentFragment2;
        if (headerActionButtonClickListener == null) {
            ActivityCompat.OnRequestPermissionsResultCallback activity2 = getActivity();
            if (!(activity2 instanceof HeaderActionButtonClickListener)) {
                activity2 = null;
            }
            headerActionButtonClickListener = (HeaderActionButtonClickListener) activity2;
        }
        this.headerActionButtonClickListener = headerActionButtonClickListener;
        InterfaceC1620r parentFragment3 = getParentFragment();
        if (!(parentFragment3 instanceof ChannelListItemClickListener)) {
            parentFragment3 = null;
        }
        ChannelListItemClickListener channelListItemClickListener = (ChannelListItemClickListener) parentFragment3;
        if (channelListItemClickListener == null) {
            ActivityCompat.OnRequestPermissionsResultCallback activity3 = getActivity();
            if (!(activity3 instanceof ChannelListItemClickListener)) {
                activity3 = null;
            }
            channelListItemClickListener = (ChannelListItemClickListener) activity3;
        }
        this.channelListItemClickListener = channelListItemClickListener;
        InterfaceC1620r parentFragment4 = getParentFragment();
        if (!(parentFragment4 instanceof SearchResultClickListener)) {
            parentFragment4 = null;
        }
        SearchResultClickListener searchResultClickListener = (SearchResultClickListener) parentFragment4;
        if (searchResultClickListener == null) {
            AbstractActivityC1340r0 activity4 = getActivity();
            searchResultClickListener = (SearchResultClickListener) (activity4 instanceof SearchResultClickListener ? activity4 : null);
        }
        this.searchResultClickListener = searchResultClickListener;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        if (getThemeResId() != 0) {
            inflater = inflater.cloneInContext(new ContextThemeWrapper(getContext(), getThemeResId()));
        }
        StreamUiFragmentChannelListBinding streamUiFragmentChannelListBindingInflate = StreamUiFragmentChannelListBinding.inflate(inflater, container, false);
        this._binding = streamUiFragmentChannelListBindingInflate;
        ConstraintLayout root = streamUiFragmentChannelListBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDetach() {
        super.onDetach();
        this.headerUserAvatarClickListener = null;
        this.headerActionButtonClickListener = null;
        this.channelListItemClickListener = null;
        this.searchResultClickListener = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        StreamUiFragmentChannelListBinding streamUiFragmentChannelListBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelListBinding);
        ChannelListHeaderView channelListHeaderView = streamUiFragmentChannelListBinding.channelListHeaderView;
        AbstractC22676k.m65749i(channelListHeaderView, "channelListHeaderView");
        setupChannelListHeader(channelListHeaderView);
        StreamUiFragmentChannelListBinding streamUiFragmentChannelListBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelListBinding2);
        ChannelListView channelListView = streamUiFragmentChannelListBinding2.channelListView;
        AbstractC22676k.m65749i(channelListView, "channelListView");
        setupChannelList(channelListView);
        StreamUiFragmentChannelListBinding streamUiFragmentChannelListBinding3 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelListBinding3);
        SearchInputView searchInputView = streamUiFragmentChannelListBinding3.searchInputView;
        AbstractC22676k.m65749i(searchInputView, "searchInputView");
        setupSearchInput(searchInputView);
        StreamUiFragmentChannelListBinding streamUiFragmentChannelListBinding4 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelListBinding4);
        SearchResultListView searchResultListView = streamUiFragmentChannelListBinding4.searchResultListView;
        AbstractC22676k.m65749i(searchResultListView, "searchResultListView");
        setupSearchResultList(searchResultListView);
        applyStyle(getStyle());
    }

    public final void setChannelListItemClickListener(ChannelListItemClickListener channelListItemClickListener) {
        this.channelListItemClickListener = channelListItemClickListener;
    }

    public final void setHeaderActionButtonClickListener(HeaderActionButtonClickListener headerActionButtonClickListener) {
        this.headerActionButtonClickListener = headerActionButtonClickListener;
    }

    public final void setHeaderUserAvatarClickListener(HeaderUserAvatarClickListener headerUserAvatarClickListener) {
        this.headerUserAvatarClickListener = headerUserAvatarClickListener;
    }

    public final void setSearchResultClickListener(SearchResultClickListener searchResultClickListener) {
        this.searchResultClickListener = searchResultClickListener;
    }

    public final void setStyle(ChannelListFragmentViewStyle channelListFragmentViewStyle) {
        AbstractC22676k.m65750j(channelListFragmentViewStyle, "<set-?>");
        this.style = channelListFragmentViewStyle;
    }

    public final void setupChannelList(ChannelListView channelListView) {
        AbstractC22676k.m65750j(channelListView, "channelListView");
        StreamUiFragmentChannelListBinding streamUiFragmentChannelListBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelListBinding);
        ChannelListView channelListView2 = streamUiFragmentChannelListBinding.channelListView;
        ChannelListViewModel channelListViewModel = getChannelListViewModel();
        AbstractC22676k.m65747g(channelListView2);
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ChannelListViewModelBinding.bind(channelListViewModel, channelListView2, viewLifecycleOwner);
        channelListView2.setChannelItemClickListener(new C19635b(this, 3));
    }

    public final void setupChannelListHeader(ChannelListHeaderView channelListHeaderView) {
        AbstractC22676k.m65750j(channelListHeaderView, "channelListHeaderView");
        if (!getShowHeader()) {
            channelListHeaderView.setVisibility(8);
            return;
        }
        ChannelListHeaderViewModel channelListHeaderViewModel = getChannelListHeaderViewModel();
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ChannelListHeaderViewModelBinding.bind(channelListHeaderViewModel, channelListHeaderView, viewLifecycleOwner);
        String headerTitle = getHeaderTitle();
        if (headerTitle != null) {
            channelListHeaderView.setOnlineTitle(headerTitle);
        }
        channelListHeaderView.setOnActionButtonClickListener(new C19620a(this));
        channelListHeaderView.setOnUserAvatarClickListener(new C19620a(this));
    }

    public final void setupSearchInput(SearchInputView searchInputView) {
        AbstractC22676k.m65750j(searchInputView, "searchInputView");
        StreamUiFragmentChannelListBinding streamUiFragmentChannelListBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelListBinding);
        SearchInputView searchInputView2 = streamUiFragmentChannelListBinding.searchInputView;
        if (getShowSearch()) {
            searchInputView2.setDebouncedInputChangedListener(new C19620a(this));
            searchInputView2.setSearchStartedListener(new C4312c(6, searchInputView2, this));
        } else {
            AbstractC22676k.m65747g(searchInputView2);
            searchInputView2.setVisibility(8);
        }
    }

    public final void setupSearchResultList(SearchResultListView searchResultListView) {
        AbstractC22676k.m65750j(searchResultListView, "searchResultListView");
        StreamUiFragmentChannelListBinding streamUiFragmentChannelListBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelListBinding);
        SearchResultListView searchResultListView2 = streamUiFragmentChannelListBinding.searchResultListView;
        SearchViewModel searchViewModel = getSearchViewModel();
        AbstractC22676k.m65747g(searchResultListView2);
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        SearchViewModelBinding.bind(searchViewModel, searchResultListView2, viewLifecycleOwner);
        searchResultListView2.setSearchResultSelectedListener(new C19620a(this));
    }

    public static final ChannelListFragment newInstance(Function1 function1) {
        return INSTANCE.newInstance(function1);
    }
}
