package io.getstream.chat.android.p226ui.feature.pinned.list;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.Toast;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.C1754y;
import androidx.recyclerview.widget.RecyclerView;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.model.MessageResult;
import io.getstream.chat.android.p226ui.databinding.StreamUiPinnedMessageListViewBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import io.getstream.chat.android.p226ui.feature.pinned.list.internal.PinnedMessageListAdapter;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.EndlessScrollListener;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0004)*+,B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006-"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;", "Landroid/widget/ViewFlipper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll83/a0;", "init", "(Landroid/util/AttributeSet;)V", "", "Lio/getstream/chat/android/ui/common/model/MessageResult;", "messageResults", "showMessages", "(Ljava/util/List;)V", "showLoading", "()V", "showError", "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;", "pinnedMessageSelectedListener", "setPinnedMessageSelectedListener", "(Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;)V", "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$LoadMoreListener;", "loadMoreListener", "setLoadMoreListener", "(Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$LoadMoreListener;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiPinnedMessageListViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiPinnedMessageListViewBinding;", "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$LoadMoreListener;", "Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;", "adapter", "Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;", "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;", "scrollListener", "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;", "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;", "Companion", "Flipper", "PinnedMessageSelectedListener", "LoadMoreListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PinnedMessageListView extends ViewFlipper {
    private static final Companion Companion = new Companion();

    @Deprecated
    public static final int LOAD_MORE_THRESHOLD = 10;
    private final PinnedMessageListAdapter adapter;
    private final StreamUiPinnedMessageListViewBinding binding;
    private LoadMoreListener loadMoreListener;
    private final EndlessScrollListener scrollListener;
    private PinnedMessageListViewStyle style;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$Companion;", "", "<init>", "()V", "LOAD_MORE_THRESHOLD", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$Flipper;", "", "<init>", "()V", "RESULTS", "", "EMPTY", "LOADING", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Flipper {
        public static final int EMPTY = 1;
        public static final Flipper INSTANCE = new Flipper();
        public static final int LOADING = 2;
        public static final int RESULTS = 0;

        private Flipper() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$LoadMoreListener;", "", "Ll83/a0;", "onLoadMoreRequested", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface LoadMoreListener {
        void onLoadMoreRequested();
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onPinnedMessageSelected", "(Lio/getstream/chat/android/models/Message;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface PinnedMessageSelectedListener {
        void onPinnedMessageSelected(Message message);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnedMessageListView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context));
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiPinnedMessageListViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this);
        this.adapter = new PinnedMessageListAdapter();
        this.scrollListener = new EndlessScrollListener(10, new C19683b(this, 7));
        init(null);
    }

    private final void init(AttributeSet attrs) {
        PinnedMessageListViewStyle.Companion companion = PinnedMessageListViewStyle.INSTANCE;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        PinnedMessageListViewStyle pinnedMessageListViewStyleInvoke = companion.invoke(context, attrs);
        setBackgroundColor(pinnedMessageListViewStyleInvoke.getBackgroundColor());
        this.binding.emptyImage.setImageDrawable(pinnedMessageListViewStyleInvoke.getEmptyStateDrawable());
        this.adapter.setMessagePreviewStyle(pinnedMessageListViewStyleInvoke.getMessagePreviewStyle());
        this.style = pinnedMessageListViewStyleInvoke;
        RecyclerView recyclerView = this.binding.pinnedMessageListRecyclerView;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.adapter);
        C1754y c1754y = new C1754y(recyclerView.getContext());
        Drawable drawableM92133x = AbstractC30060g.m92133x(recyclerView.getContext(), C19469R.drawable.stream_ui_divider);
        AbstractC22676k.m65747g(drawableM92133x);
        c1754y.f6937a = drawableM92133x;
        recyclerView.addItemDecoration(c1754y, -1);
        recyclerView.addOnScrollListener(this.scrollListener);
        this.binding.emptyDescriptionTextView.setText(Html.fromHtml(getContext().getString(C19469R.string.stream_ui_pinned_message_list_empty_description)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 scrollListener$lambda$0(PinnedMessageListView pinnedMessageListView) {
        LoadMoreListener loadMoreListener = pinnedMessageListView.loadMoreListener;
        if (loadMoreListener != null) {
            loadMoreListener.onLoadMoreRequested();
        }
        return C23454a0.f92919a;
    }

    public final void setLoadMoreListener(LoadMoreListener loadMoreListener) {
        this.loadMoreListener = loadMoreListener;
    }

    public final void setPinnedMessageSelectedListener(PinnedMessageSelectedListener pinnedMessageSelectedListener) {
        this.adapter.setPinnedMessageSelectedListener(pinnedMessageSelectedListener);
    }

    public final void showError() {
        Toast.makeText(getContext(), C19469R.string.stream_ui_pinned_message_list_results_error, 0).show();
    }

    public final void showLoading() {
        if (this.adapter.getDisplayCount() == 0) {
            setDisplayedChild(2);
        }
        this.scrollListener.disablePagination();
    }

    public final void showMessages(List<MessageResult> messageResults) {
        AbstractC22676k.m65750j(messageResults, "messageResults");
        setDisplayedChild(messageResults.isEmpty() ? 1 : 0);
        this.adapter.submitList(messageResults);
        this.scrollListener.enablePagination();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnedMessageListView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiPinnedMessageListViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this);
        this.adapter = new PinnedMessageListAdapter();
        this.scrollListener = new EndlessScrollListener(10, new C19683b(this, 7));
        init(attributeSet);
    }
}
