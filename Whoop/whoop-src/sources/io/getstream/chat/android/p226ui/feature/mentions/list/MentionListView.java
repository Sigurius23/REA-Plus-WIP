package io.getstream.chat.android.p226ui.feature.mentions.list;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Toast;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.C1754y;
import androidx.recyclerview.widget.RecyclerView;
import h02.C16587n0;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.common.model.MessageResult;
import io.getstream.chat.android.p226ui.databinding.StreamUiMentionListViewBinding;
import io.getstream.chat.android.p226ui.feature.mentions.list.internal.MentionListAdapter;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.EndlessScrollListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0004+,-.B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006/"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView;", "Landroid/widget/ViewFlipper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll83/a0;", "init", "(Landroid/util/AttributeSet;)V", "", "Lio/getstream/chat/android/ui/common/model/MessageResult;", "messages", "", "isLoadingMore", "showMessages", "(Ljava/util/List;Z)V", "showLoading", "()V", "showError", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;", "mentionSelectedListener", "setMentionSelectedListener", "(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;)V", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$LoadMoreListener;", "loadMoreListener", "setLoadMoreListener", "(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$LoadMoreListener;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiMentionListViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiMentionListViewBinding;", "Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListAdapter;", "adapter", "Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListAdapter;", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$LoadMoreListener;", "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;", "scrollListener", "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListViewStyle;", "Companion", "Flipper", "MentionSelectedListener", "LoadMoreListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MentionListView extends ViewFlipper {
    private static final Companion Companion = new Companion();
    private static final int LOAD_MORE_THRESHOLD = 10;
    private final MentionListAdapter adapter;
    private final StreamUiMentionListViewBinding binding;
    private LoadMoreListener loadMoreListener;
    private final EndlessScrollListener scrollListener;
    private MentionListViewStyle style;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$Companion;", "", "<init>", "()V", "LOAD_MORE_THRESHOLD", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$Flipper;", "", "<init>", "()V", "RESULTS", "", "EMPTY", "LOADING", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Flipper {
        public static final int EMPTY = 1;
        public static final Flipper INSTANCE = new Flipper();
        public static final int LOADING = 2;
        public static final int RESULTS = 0;

        private Flipper() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$LoadMoreListener;", "", "Ll83/a0;", "onLoadMoreRequested", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface LoadMoreListener {
        void onLoadMoreRequested();
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onMentionSelected", "(Lio/getstream/chat/android/models/Message;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MentionSelectedListener {
        void onMentionSelected(Message message);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MentionListView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context));
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiMentionListViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this);
        this.adapter = new MentionListAdapter();
        this.scrollListener = new EndlessScrollListener(10, new C16587n0(this, 29));
        init(null);
    }

    private final void init(AttributeSet attrs) {
        MentionListViewStyle.Companion companion = MentionListViewStyle.INSTANCE;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        MentionListViewStyle mentionListViewStyleInvoke = companion.invoke(context, attrs);
        setBackgroundColor(mentionListViewStyleInvoke.getBackgroundColor());
        this.binding.emptyImage.setImageDrawable(mentionListViewStyleInvoke.getEmptyStateDrawable());
        this.adapter.setPreviewStyle(mentionListViewStyleInvoke.getMessagePreviewStyle());
        this.style = mentionListViewStyleInvoke;
        RecyclerView recyclerView = this.binding.mentionListRecyclerView;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.adapter);
        C1754y c1754y = new C1754y(recyclerView.getContext());
        Drawable drawableM92133x = AbstractC30060g.m92133x(recyclerView.getContext(), C19469R.drawable.stream_ui_divider);
        AbstractC22676k.m65747g(drawableM92133x);
        c1754y.f6937a = drawableM92133x;
        recyclerView.addItemDecoration(c1754y, -1);
        recyclerView.addOnScrollListener(this.scrollListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 scrollListener$lambda$0(MentionListView mentionListView) {
        LoadMoreListener loadMoreListener = mentionListView.loadMoreListener;
        if (loadMoreListener != null) {
            loadMoreListener.onLoadMoreRequested();
        }
        return C23454a0.f92919a;
    }

    public static /* synthetic */ void showMessages$default(MentionListView mentionListView, List list, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        mentionListView.showMessages(list, z4);
    }

    public final void setLoadMoreListener(LoadMoreListener loadMoreListener) {
        this.loadMoreListener = loadMoreListener;
    }

    public final void setMentionSelectedListener(MentionSelectedListener mentionSelectedListener) {
        this.adapter.setMentionSelectedListener(mentionSelectedListener);
    }

    public final void showError() {
        Toast.makeText(getContext(), C19470R.string.stream_ui_mention_list_error, 0).show();
    }

    public final void showLoading() {
        setDisplayedChild(2);
        this.scrollListener.disablePagination();
    }

    public final void showMessages(List<MessageResult> messages, boolean isLoadingMore) {
        AbstractC22676k.m65750j(messages, "messages");
        setDisplayedChild(messages.isEmpty() ? 1 : 0);
        List<MessageResult> list = messages;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new MentionListItem.MessageItem((MessageResult) it.next()));
        }
        this.adapter.submitList(AbstractC25265s.m74129g1(arrayList, isLoadingMore ? AbstractC37056f.m118958J(MentionListItem.LoadingItem.INSTANCE) : C25271y.f99162w));
        this.scrollListener.enablePagination();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MentionListView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiMentionListViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this);
        this.adapter = new MentionListAdapter();
        this.scrollListener = new EndlessScrollListener(10, new C16587n0(this, 29));
        init(attributeSet);
    }
}
