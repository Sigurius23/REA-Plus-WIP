package io.getstream.chat.android.p226ui.feature.gallery.overview;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1724q1;
import androidx.recyclerview.widget.AbstractC1740u1;
import androidx.recyclerview.widget.AbstractC1760z1;
import androidx.recyclerview.widget.C1701k2;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hn.C17508p;
import io.getstream.chat.android.p226ui.common.utils.Utils;
import io.getstream.chat.android.p226ui.databinding.StreamUiMediaAttachmentGridViewBinding;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryItem;
import io.getstream.chat.android.p226ui.feature.gallery.MediaAttachmentGridViewStyle;
import io.getstream.chat.android.p226ui.feature.gallery.overview.internal.MediaAttachmentAdapter;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.EndlessScrollListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 ?2\u00020\u0001:\u0005@ABC?B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006D"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "(Landroid/util/AttributeSet;)V", "", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;", "attachmentGalleryItems", "setDateText", "(Ljava/util/List;)V", "setAttachments", "disablePagination", "()V", "enablePagination", "Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaClickListener;", "listener", "setMediaClickListener", "(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaClickListener;)V", "Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$OnLoadMoreListener;", "setOnLoadMoreListener", "(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$OnLoadMoreListener;)V", "getAttachments", "()Ljava/util/List;", "Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;", "Ljava/text/DateFormat;", "dateFormat", "Ljava/text/DateFormat;", "", "showUserAvatars", "Z", "Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;", "Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;", "adapter$delegate", "Ll83/h;", "getAdapter", "()Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;", "adapter", "Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;", "dateScrollListener$delegate", "getDateScrollListener", "()Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;", "dateScrollListener", "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;", "scrollListener", "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;", "mediaClickListener", "Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaClickListener;", "loadMoreListener", "Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$OnLoadMoreListener;", "Companion", "MediaDateScrollListener", "MediaClickListener", "OnLoadMoreListener", "SharedMediaSpaceItemDecorator", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MediaAttachmentGridView extends FrameLayout {
    private static final int LOAD_MORE_THRESHOLD = 10;
    private static final int SPAN_COUNT = 3;

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h adapter;
    private final StreamUiMediaAttachmentGridViewBinding binding;
    private final DateFormat dateFormat;

    /* JADX INFO: renamed from: dateScrollListener$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h dateScrollListener;
    private OnLoadMoreListener loadMoreListener;
    private MediaClickListener mediaClickListener;
    private final EndlessScrollListener scrollListener;
    private boolean showUserAvatars;
    private MediaAttachmentGridViewStyle style;
    private static final int MEDIA_ITEM_SPACE = Utils.dpToPx(2);

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaClickListener;", "", "", "position", "Ll83/a0;", "onClick", "(I)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MediaClickListener {
        void onClick(int position);
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R$\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;", "Landroidx/recyclerview/widget/z1;", "", "spanCount", "Lkotlin/Function0;", "positionChangeThreshold", "Ll83/a0;", "onVisibleItemChanged", "<init>", "(ILc93/a;Lc93/a;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "I", "Lc93/a;", "value", "lastVisibleItemPosition", "getLastVisibleItemPosition", "()I", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class MediaDateScrollListener extends AbstractC1760z1 {
        private int lastVisibleItemPosition;
        private final InterfaceC4339a onVisibleItemChanged;
        private final InterfaceC4339a positionChangeThreshold;
        private final int spanCount;

        public MediaDateScrollListener(int i13, InterfaceC4339a positionChangeThreshold, InterfaceC4339a onVisibleItemChanged) {
            AbstractC22676k.m65750j(positionChangeThreshold, "positionChangeThreshold");
            AbstractC22676k.m65750j(onVisibleItemChanged, "onVisibleItemChanged");
            this.spanCount = i13;
            this.positionChangeThreshold = positionChangeThreshold;
            this.onVisibleItemChanged = onVisibleItemChanged;
        }

        public final int getLastVisibleItemPosition() {
            return this.lastVisibleItemPosition;
        }

        @Override // androidx.recyclerview.widget.AbstractC1760z1
        public final void onScrolled(RecyclerView recyclerView, int dx3, int dy3) {
            AbstractC22676k.m65750j(recyclerView, "recyclerView");
            AbstractC1692i1 adapter = recyclerView.getAdapter();
            if (adapter == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AbstractC1740u1 layoutManager = recyclerView.getLayoutManager();
            AbstractC22676k.m65748h(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
            View viewFindViewByPosition = gridLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition != null) {
                if (viewFindViewByPosition.getBottom() < ((Number) this.positionChangeThreshold.invoke()).intValue()) {
                    int itemCount = adapter.getPageCount() % this.spanCount;
                    iFindFirstVisibleItemPosition = Math.min(iFindFirstVisibleItemPosition + this.spanCount, itemCount == 0 ? adapter.getPageCount() - 1 : adapter.getPageCount() - itemCount);
                }
                if (this.lastVisibleItemPosition != iFindFirstVisibleItemPosition) {
                    this.lastVisibleItemPosition = iFindFirstVisibleItemPosition;
                    this.onVisibleItemChanged.invoke();
                }
            }
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$OnLoadMoreListener;", "", "Ll83/a0;", "onLoadMore", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnLoadMoreListener {
        void onLoadMore();
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$SharedMediaSpaceItemDecorator;", "Landroidx/recyclerview/widget/q1;", "<init>", "()V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/k2;", "state", "Ll83/a0;", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class SharedMediaSpaceItemDecorator extends AbstractC1724q1 {
        @Override // androidx.recyclerview.widget.AbstractC1724q1
        public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, C1701k2 state) {
            AbstractC22676k.m65750j(outRect, "outRect");
            AbstractC22676k.m65750j(view, "view");
            AbstractC22676k.m65750j(parent, "parent");
            AbstractC22676k.m65750j(state, "state");
            AbstractC1692i1 adapter = parent.getAdapter();
            if (adapter != null) {
                if (parent.getChildAdapterPosition(view) % 3 == 0) {
                    outRect.top = MediaAttachmentGridView.MEDIA_ITEM_SPACE;
                    outRect.right = MediaAttachmentGridView.MEDIA_ITEM_SPACE / 2;
                } else if (parent.getChildAdapterPosition(view) % 3 == 2) {
                    outRect.top = MediaAttachmentGridView.MEDIA_ITEM_SPACE;
                    outRect.left = MediaAttachmentGridView.MEDIA_ITEM_SPACE / 2;
                } else {
                    outRect.top = MediaAttachmentGridView.MEDIA_ITEM_SPACE;
                    outRect.right = MediaAttachmentGridView.MEDIA_ITEM_SPACE / 4;
                    outRect.left = MediaAttachmentGridView.MEDIA_ITEM_SPACE / 4;
                }
                if (parent.getChildAdapterPosition(view) >= adapter.getPageCount() - (adapter.getPageCount() % 3 != 0 ? adapter.getPageCount() % 3 : 3)) {
                    outRect.bottom = parent.getHeight() - (parent.getWidth() / 3);
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaAttachmentGridView(Context context) {
        this(context, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public static void m55163a(MediaAttachmentGridView mediaAttachmentGridView, int i13) {
        MediaClickListener mediaClickListener = mediaAttachmentGridView.mediaClickListener;
        if (mediaClickListener != null) {
            mediaClickListener.onClick(i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaAttachmentAdapter adapter_delegate$lambda$1(MediaAttachmentGridView mediaAttachmentGridView) {
        MediaAttachmentGridViewStyle mediaAttachmentGridViewStyle = mediaAttachmentGridView.style;
        if (mediaAttachmentGridViewStyle != null) {
            return new MediaAttachmentAdapter(mediaAttachmentGridViewStyle, new C17508p(mediaAttachmentGridView, 6));
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    private static final void adapter_delegate$lambda$1$lambda$0(MediaAttachmentGridView mediaAttachmentGridView, int i13) {
        MediaClickListener mediaClickListener = mediaAttachmentGridView.mediaClickListener;
        if (mediaClickListener != null) {
            mediaClickListener.onClick(i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaDateScrollListener dateScrollListener_delegate$lambda$4(MediaAttachmentGridView mediaAttachmentGridView) {
        return new MediaDateScrollListener(3, new C19664a(mediaAttachmentGridView, 0), new C19664a(mediaAttachmentGridView, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dateScrollListener_delegate$lambda$4$lambda$2(MediaAttachmentGridView mediaAttachmentGridView) {
        return mediaAttachmentGridView.binding.mediaRecyclerView.getTop() - mediaAttachmentGridView.binding.dateTextView.getBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 dateScrollListener_delegate$lambda$4$lambda$3(MediaAttachmentGridView mediaAttachmentGridView) {
        List<Object> currentList = mediaAttachmentGridView.getAdapter().getCurrentList();
        AbstractC22676k.m65749i(currentList, "getCurrentList(...)");
        mediaAttachmentGridView.setDateText(currentList);
        return C23454a0.f92919a;
    }

    private final MediaAttachmentAdapter getAdapter() {
        return (MediaAttachmentAdapter) this.adapter.getValue();
    }

    private final MediaDateScrollListener getDateScrollListener() {
        return (MediaDateScrollListener) this.dateScrollListener.getValue();
    }

    private final void init(AttributeSet attrs) {
        MediaAttachmentGridViewStyle.Companion companion = MediaAttachmentGridViewStyle.INSTANCE;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        MediaAttachmentGridViewStyle mediaAttachmentGridViewStyleInvoke = companion.invoke(context, attrs);
        this.style = mediaAttachmentGridViewStyleInvoke;
        if (mediaAttachmentGridViewStyleInvoke == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        this.showUserAvatars = mediaAttachmentGridViewStyleInvoke.getShowUserAvatars();
        RecyclerView recyclerView = this.binding.mediaRecyclerView;
        recyclerView.setAdapter(getAdapter());
        recyclerView.addOnScrollListener(this.scrollListener);
        recyclerView.addOnScrollListener(getDateScrollListener());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 scrollListener$lambda$5(MediaAttachmentGridView mediaAttachmentGridView) {
        OnLoadMoreListener onLoadMoreListener = mediaAttachmentGridView.loadMoreListener;
        if (onLoadMoreListener != null) {
            onLoadMoreListener.onLoadMore();
        }
        return C23454a0.f92919a;
    }

    private final void setDateText(List<AttachmentGalleryItem> attachmentGalleryItems) {
        List<AttachmentGalleryItem> list = attachmentGalleryItems;
        Date createdAt = list.isEmpty() ^ true ? attachmentGalleryItems.get(getDateScrollListener().getLastVisibleItemPosition()).getCreatedAt() : null;
        FrameLayout dateContainer = this.binding.dateContainer;
        AbstractC22676k.m65749i(dateContainer, "dateContainer");
        dateContainer.setVisibility(!list.isEmpty() ? 0 : 8);
        this.binding.dateTextView.setText(createdAt != null ? this.dateFormat.format(createdAt) : null);
    }

    public final void disablePagination() {
        this.scrollListener.disablePagination();
    }

    public final void enablePagination() {
        this.scrollListener.enablePagination();
    }

    public final List<AttachmentGalleryItem> getAttachments() {
        List currentList = getAdapter().getCurrentList();
        AbstractC22676k.m65749i(currentList, "getCurrentList(...)");
        return currentList;
    }

    public final void setAttachments(List<AttachmentGalleryItem> attachmentGalleryItems) {
        AbstractC22676k.m65750j(attachmentGalleryItems, "attachmentGalleryItems");
        getAdapter().submitList(attachmentGalleryItems);
        setDateText(attachmentGalleryItems);
    }

    public final void setMediaClickListener(MediaClickListener listener) {
        this.mediaClickListener = listener;
    }

    public final void setOnLoadMoreListener(OnLoadMoreListener listener) {
        this.loadMoreListener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaAttachmentGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaAttachmentGridView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiMediaAttachmentGridViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        this.dateFormat = new SimpleDateFormat("MMM yyyy", Locale.US);
        this.adapter = AbstractC30060g.m92088H(new C19664a(this, 2));
        this.dateScrollListener = AbstractC30060g.m92088H(new C19664a(this, 3));
        this.scrollListener = new EndlessScrollListener(10, new C19664a(this, 4));
        init(attributeSet);
    }
}
