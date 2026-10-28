package io.getstream.chat.android.p226ui.feature.messages.header;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ge3.AbstractC15751g;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.databinding.StreamUiChannelHeaderViewBinding;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.TextViewKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.avatar.ChannelAvatarView;
import io.getstream.chat.android.p226ui.widgets.typing.TypingIndicatorView;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p479s4.AbstractC32122c;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 T2\u00020\u0001:\u0004UVWTB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0016J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u0014J\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u0016J\r\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u0016J\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\b \u0010\u001aJ\r\u0010!\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\u0016J\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010\u0014J\r\u0010#\u001a\u00020\u000e¢\u0006\u0004\b#\u0010\u0016J\r\u0010$\u001a\u00020\u000e¢\u0006\u0004\b$\u0010\u0016J\r\u0010%\u001a\u00020\u000e¢\u0006\u0004\b%\u0010\u0016J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b&\u0010\u0014J\u001b\u0010*\u001a\u00020\u000e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0017¢\u0006\u0004\b-\u0010\u001aJ\r\u0010.\u001a\u00020\u0017¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0017¢\u0006\u0004\b0\u0010\u001aJ\r\u00101\u001a\u00020\u000e¢\u0006\u0004\b1\u0010\u0016J\u0015\u00102\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b2\u0010\u0014J\u0019\u00103\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000eH\u0002¢\u0006\u0004\b5\u0010\u0016J\u000f\u00106\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u0010\u0016J\u000f\u00107\u001a\u00020\u000eH\u0002¢\u0006\u0004\b7\u0010\u0016J\u000f\u00108\u001a\u00020\u000eH\u0002¢\u0006\u0004\b8\u0010\u0016J\u000f\u00109\u001a\u00020\u000eH\u0002¢\u0006\u0004\b9\u0010\u0016J\u000f\u0010:\u001a\u00020\u000eH\u0002¢\u0006\u0004\b:\u0010\u0016J\u000f\u0010;\u001a\u00020\u000eH\u0002¢\u0006\u0004\b;\u0010\u0016Jo\u0010F\u001a\u00020\u000e2\b\b\u0002\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020<2\b\b\u0002\u0010?\u001a\u00020\u00172\b\b\u0002\u0010@\u001a\u00020\u00172\b\b\u0002\u0010A\u001a\u00020<2\b\b\u0002\u0010B\u001a\u00020\u00172\b\b\u0002\u0010C\u001a\u00020\u00172\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\b\b\u0002\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000eH\u0002¢\u0006\u0004\bH\u0010\u0016J\u000f\u0010I\u001a\u00020\u000eH\u0002¢\u0006\u0004\bI\u0010\u0016J\u000f\u0010J\u001a\u00020\u000eH\u0002¢\u0006\u0004\bJ\u0010\u0016R\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006X"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lio/getstream/chat/android/models/Channel;", "channel", "Ll83/a0;", "setAvatar", "(Lio/getstream/chat/android/models/Channel;)V", "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;", "listener", "setAvatarClickListener", "(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;)V", "hideAvatar", "()V", "", "text", "showBackButtonBadge", "(Ljava/lang/String;)V", "hideBackButtonBadge", "setBackButtonClickListener", "setNormalMode", "setThreadMode", "title", "setTitle", "hideTitle", "setTitleClickListener", "showOnlineStateSubtitle", "showSearchingForNetworkLabel", "showOfflineStateLabel", "setRetryClickListener", "", "Lio/getstream/chat/android/models/User;", "typingUsers", "showTypingStateLabel", "(Ljava/util/List;)V", "subtitle", "setOnlineStateSubtitle", "getOnlineStateSubtitle", "()Ljava/lang/String;", "setThreadSubtitle", "hideSubtitle", "setSubtitleClickListener", "init", "(Landroid/util/AttributeSet;)V", "configBackground", "configChannelAvatar", "configTitle", "configBackButton", "configOfflineLabel", "configSearchingForNetworkLabel", "configOnlineLabel", "", "isThread", "isTitleEnabled", "normalModeTitle", "threadModeTitle", "isSubtitleEnabled", "normalModeSubtitle", "threadModeSubtitle", "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;", "onlineState", "reduceHeaderState", "(ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;)V", "renderHeaderState", "renderTitleState", "renderSubtitleState", "Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;", "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;", "headerState", "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;", "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;", "Companion", "HeaderState", "OnlineState", "OnClickListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelHeaderView extends FrameLayout {
    private static final Companion Companion = new Companion();

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f74587w = 0;
    private final StreamUiChannelHeaderViewBinding binding;
    private HeaderState headerState;
    private ChannelHeaderViewStyle style;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$Companion;", "", "<init>", "()V", "createInitialHeaderState", "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;", "context", "Landroid/content/Context;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HeaderState createInitialHeaderState(Context context) {
            String string = context.getString(C19469R.string.stream_ui_channel_header_thread_title);
            AbstractC22676k.m65749i(string, "getString(...)");
            return new HeaderState(false, true, "", string, true, "", "", C25271y.f99162w, OnlineState.NONE);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010$\u001a\u00020\u000fHÆ\u0003Ji\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;", "", "isThread", "", "isTitleEnabled", "normalModeTitle", "", "threadModeTitle", "isSubtitleEnabled", "normalModeSubtitle", "threadModeSubtitle", "typingUsers", "", "Lio/getstream/chat/android/models/User;", "onlineState", "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;)V", "()Z", "getNormalModeTitle", "()Ljava/lang/String;", "getThreadModeTitle", "getNormalModeSubtitle", "getThreadModeSubtitle", "getTypingUsers", "()Ljava/util/List;", "getOnlineState", "()Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class HeaderState {
        private final boolean isSubtitleEnabled;
        private final boolean isThread;
        private final boolean isTitleEnabled;
        private final String normalModeSubtitle;
        private final String normalModeTitle;
        private final OnlineState onlineState;
        private final String threadModeSubtitle;
        private final String threadModeTitle;
        private final List<User> typingUsers;

        public HeaderState(boolean z4, boolean z13, String normalModeTitle, String threadModeTitle, boolean z14, String normalModeSubtitle, String threadModeSubtitle, List<User> typingUsers, OnlineState onlineState) {
            AbstractC22676k.m65750j(normalModeTitle, "normalModeTitle");
            AbstractC22676k.m65750j(threadModeTitle, "threadModeTitle");
            AbstractC22676k.m65750j(normalModeSubtitle, "normalModeSubtitle");
            AbstractC22676k.m65750j(threadModeSubtitle, "threadModeSubtitle");
            AbstractC22676k.m65750j(typingUsers, "typingUsers");
            AbstractC22676k.m65750j(onlineState, "onlineState");
            this.isThread = z4;
            this.isTitleEnabled = z13;
            this.normalModeTitle = normalModeTitle;
            this.threadModeTitle = threadModeTitle;
            this.isSubtitleEnabled = z14;
            this.normalModeSubtitle = normalModeSubtitle;
            this.threadModeSubtitle = threadModeSubtitle;
            this.typingUsers = typingUsers;
            this.onlineState = onlineState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HeaderState copy$default(HeaderState headerState, boolean z4, boolean z13, String str, String str2, boolean z14, String str3, String str4, List list, OnlineState onlineState, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = headerState.isThread;
            }
            if ((i13 & 2) != 0) {
                z13 = headerState.isTitleEnabled;
            }
            if ((i13 & 4) != 0) {
                str = headerState.normalModeTitle;
            }
            if ((i13 & 8) != 0) {
                str2 = headerState.threadModeTitle;
            }
            if ((i13 & 16) != 0) {
                z14 = headerState.isSubtitleEnabled;
            }
            if ((i13 & 32) != 0) {
                str3 = headerState.normalModeSubtitle;
            }
            if ((i13 & 64) != 0) {
                str4 = headerState.threadModeSubtitle;
            }
            if ((i13 & 128) != 0) {
                list = headerState.typingUsers;
            }
            if ((i13 & 256) != 0) {
                onlineState = headerState.onlineState;
            }
            List list2 = list;
            OnlineState onlineState2 = onlineState;
            String str5 = str3;
            String str6 = str4;
            boolean z15 = z14;
            String str7 = str;
            return headerState.copy(z4, z13, str7, str2, z15, str5, str6, list2, onlineState2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsThread() {
            return this.isThread;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsTitleEnabled() {
            return this.isTitleEnabled;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getNormalModeTitle() {
            return this.normalModeTitle;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getThreadModeTitle() {
            return this.threadModeTitle;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsSubtitleEnabled() {
            return this.isSubtitleEnabled;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getNormalModeSubtitle() {
            return this.normalModeSubtitle;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getThreadModeSubtitle() {
            return this.threadModeSubtitle;
        }

        public final List<User> component8() {
            return this.typingUsers;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final OnlineState getOnlineState() {
            return this.onlineState;
        }

        public final HeaderState copy(boolean isThread, boolean isTitleEnabled, String normalModeTitle, String threadModeTitle, boolean isSubtitleEnabled, String normalModeSubtitle, String threadModeSubtitle, List<User> typingUsers, OnlineState onlineState) {
            AbstractC22676k.m65750j(normalModeTitle, "normalModeTitle");
            AbstractC22676k.m65750j(threadModeTitle, "threadModeTitle");
            AbstractC22676k.m65750j(normalModeSubtitle, "normalModeSubtitle");
            AbstractC22676k.m65750j(threadModeSubtitle, "threadModeSubtitle");
            AbstractC22676k.m65750j(typingUsers, "typingUsers");
            AbstractC22676k.m65750j(onlineState, "onlineState");
            return new HeaderState(isThread, isTitleEnabled, normalModeTitle, threadModeTitle, isSubtitleEnabled, normalModeSubtitle, threadModeSubtitle, typingUsers, onlineState);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderState)) {
                return false;
            }
            HeaderState headerState = (HeaderState) other;
            return this.isThread == headerState.isThread && this.isTitleEnabled == headerState.isTitleEnabled && AbstractC22676k.m65745e(this.normalModeTitle, headerState.normalModeTitle) && AbstractC22676k.m65745e(this.threadModeTitle, headerState.threadModeTitle) && this.isSubtitleEnabled == headerState.isSubtitleEnabled && AbstractC22676k.m65745e(this.normalModeSubtitle, headerState.normalModeSubtitle) && AbstractC22676k.m65745e(this.threadModeSubtitle, headerState.threadModeSubtitle) && AbstractC22676k.m65745e(this.typingUsers, headerState.typingUsers) && this.onlineState == headerState.onlineState;
        }

        public final String getNormalModeSubtitle() {
            return this.normalModeSubtitle;
        }

        public final String getNormalModeTitle() {
            return this.normalModeTitle;
        }

        public final OnlineState getOnlineState() {
            return this.onlineState;
        }

        public final String getThreadModeSubtitle() {
            return this.threadModeSubtitle;
        }

        public final String getThreadModeTitle() {
            return this.threadModeTitle;
        }

        public final List<User> getTypingUsers() {
            return this.typingUsers;
        }

        public final int hashCode() {
            return this.onlineState.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(Boolean.hashCode(this.isThread) * 31, 31, this.isTitleEnabled), 31, this.normalModeTitle), 31, this.threadModeTitle), 31, this.isSubtitleEnabled), 31, this.normalModeSubtitle), 31, this.threadModeSubtitle), 31, this.typingUsers);
        }

        public final boolean isSubtitleEnabled() {
            return this.isSubtitleEnabled;
        }

        public final boolean isThread() {
            return this.isThread;
        }

        public final boolean isTitleEnabled() {
            return this.isTitleEnabled;
        }

        public final String toString() {
            boolean z4 = this.isThread;
            boolean z13 = this.isTitleEnabled;
            String str = this.normalModeTitle;
            String str2 = this.threadModeTitle;
            boolean z14 = this.isSubtitleEnabled;
            String str3 = this.normalModeSubtitle;
            String str4 = this.threadModeSubtitle;
            List<User> list = this.typingUsers;
            OnlineState onlineState = this.onlineState;
            StringBuilder sbM32002u = AbstractC11895b.m32002u("HeaderState(isThread=", ", isTitleEnabled=", ", normalModeTitle=", z4, z13);
            AbstractC11266d.m30444B(sbM32002u, str, ", threadModeTitle=", str2, ", isSubtitleEnabled=");
            AbstractC38963t7.m124391u(sbM32002u, z14, ", normalModeSubtitle=", str3, ", threadModeSubtitle=");
            AbstractC36095b.m114694v(str4, ", typingUsers=", ", onlineState=", sbM32002u, list);
            sbM32002u.append(onlineState);
            sbM32002u.append(")");
            return sbM32002u.toString();
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;", "", "Ll83/a0;", "onClick", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface OnClickListener {
        void onClick();
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ONLINE", "CONNECTING", "OFFLINE", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public enum OnlineState {
        NONE,
        ONLINE,
        CONNECTING,
        OFFLINE;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OnlineState.values().length];
            try {
                iArr[OnlineState.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OnlineState.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OnlineState.OFFLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OnlineState.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelHeaderView(Context context) {
        this(context, null, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    private final void configBackButton() {
        ConstraintLayout constraintLayout = this.binding.backButtonContainer;
        AbstractC22676k.m65747g(constraintLayout);
        ChannelHeaderViewStyle channelHeaderViewStyle = this.style;
        if (channelHeaderViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        constraintLayout.setVisibility(!channelHeaderViewStyle.getShowBackButton() ? 4 : 0);
        ChannelHeaderViewStyle channelHeaderViewStyle2 = this.style;
        if (channelHeaderViewStyle2 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        constraintLayout.setClickable(channelHeaderViewStyle2.getShowBackButton());
        ImageView imageView = this.binding.backButton;
        ChannelHeaderViewStyle channelHeaderViewStyle3 = this.style;
        if (channelHeaderViewStyle3 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        imageView.setImageDrawable(channelHeaderViewStyle3.getBackButtonIcon());
        TextView textView = this.binding.backButtonBadge;
        AbstractC22676k.m65747g(textView);
        ChannelHeaderViewStyle channelHeaderViewStyle4 = this.style;
        if (channelHeaderViewStyle4 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        textView.setVisibility(channelHeaderViewStyle4.getShowBackButtonBadge() ? 0 : 8);
        Drawable drawable = AbstractC32122c.getDrawable(textView.getContext(), C19469R.drawable.stream_ui_badge_bg);
        if (drawable != null) {
            ChannelHeaderViewStyle channelHeaderViewStyle5 = this.style;
            if (channelHeaderViewStyle5 == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            drawable.setTint(channelHeaderViewStyle5.getBackButtonBadgeBackgroundColor());
            textView.setBackground(drawable);
        }
    }

    private final void configBackground() {
        ChannelHeaderViewStyle channelHeaderViewStyle = this.style;
        if (channelHeaderViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        setBackgroundColor(channelHeaderViewStyle.getBackground());
        View view = this.binding.separator;
        ChannelHeaderViewStyle channelHeaderViewStyle2 = this.style;
        if (channelHeaderViewStyle2 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        view.setVisibility(channelHeaderViewStyle2.getSeparatorBackgroundDrawable() != null ? 0 : 8);
        View view2 = this.binding.separator;
        ChannelHeaderViewStyle channelHeaderViewStyle3 = this.style;
        if (channelHeaderViewStyle3 != null) {
            view2.setBackground(channelHeaderViewStyle3.getSeparatorBackgroundDrawable());
        } else {
            AbstractC22676k.m65757q("style");
            throw null;
        }
    }

    private final void configChannelAvatar() {
        ChannelAvatarView channelAvatarView = this.binding.channelAvatarView;
        AbstractC22676k.m65747g(channelAvatarView);
        ChannelHeaderViewStyle channelHeaderViewStyle = this.style;
        if (channelHeaderViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        channelAvatarView.setVisibility(!channelHeaderViewStyle.getShowUserAvatar() ? 4 : 0);
        ChannelHeaderViewStyle channelHeaderViewStyle2 = this.style;
        if (channelHeaderViewStyle2 != null) {
            channelAvatarView.setClickable(channelHeaderViewStyle2.getShowUserAvatar());
        } else {
            AbstractC22676k.m65757q("style");
            throw null;
        }
    }

    private final void configOfflineLabel() {
        ChannelHeaderViewStyle channelHeaderViewStyle = this.style;
        if (channelHeaderViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        TextStyle offlineTextStyle = channelHeaderViewStyle.getOfflineTextStyle();
        TextView textView = this.binding.offlineTextView;
        AbstractC22676k.m65747g(textView);
        TextViewKt.setTextSizePx(textView, offlineTextStyle.getSize());
        textView.setTextColor(offlineTextStyle.getColor());
        textView.setTypeface(offlineTextStyle.getFont());
        TextView textView2 = this.binding.offlineRetryButton;
        AbstractC22676k.m65747g(textView2);
        TextViewKt.setTextSizePx(textView2, offlineTextStyle.getSize());
        textView2.setTypeface(offlineTextStyle.getFont());
    }

    private final void configOnlineLabel() {
        TextView onlineTextView = this.binding.onlineTextView;
        AbstractC22676k.m65749i(onlineTextView, "onlineTextView");
        ChannelHeaderViewStyle channelHeaderViewStyle = this.style;
        if (channelHeaderViewStyle != null) {
            TextStyleKt.setTextStyle(onlineTextView, channelHeaderViewStyle.getOnlineTextStyle());
        } else {
            AbstractC22676k.m65757q("style");
            throw null;
        }
    }

    private final void configSearchingForNetworkLabel() {
        TextView connectingTextView = this.binding.connectingTextView;
        AbstractC22676k.m65749i(connectingTextView, "connectingTextView");
        ChannelHeaderViewStyle channelHeaderViewStyle = this.style;
        if (channelHeaderViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        TextStyleKt.setTextStyle(connectingTextView, channelHeaderViewStyle.getSearchingForNetworkTextStyle());
        ProgressBar progressBar = this.binding.connectingProgressBar;
        AbstractC22676k.m65747g(progressBar);
        ChannelHeaderViewStyle channelHeaderViewStyle2 = this.style;
        if (channelHeaderViewStyle2 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        progressBar.setVisibility(channelHeaderViewStyle2.getShowSearchingForNetworkProgressBar() ? 0 : 8);
        ChannelHeaderViewStyle channelHeaderViewStyle3 = this.style;
        if (channelHeaderViewStyle3 != null) {
            progressBar.setIndeterminateTintList(channelHeaderViewStyle3.getSearchingForNetworkProgressBarTint());
        } else {
            AbstractC22676k.m65757q("style");
            throw null;
        }
    }

    private final void configTitle() {
        TextView titleTextView = this.binding.titleTextView;
        AbstractC22676k.m65749i(titleTextView, "titleTextView");
        ChannelHeaderViewStyle channelHeaderViewStyle = this.style;
        if (channelHeaderViewStyle != null) {
            TextStyleKt.setTextStyle(titleTextView, channelHeaderViewStyle.getTitleTextStyle());
        } else {
            AbstractC22676k.m65757q("style");
            throw null;
        }
    }

    @SuppressLint({"CustomViewStyleable"})
    private final void init(AttributeSet attrs) {
        ChannelHeaderViewStyle.Companion companion = ChannelHeaderViewStyle.INSTANCE;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        this.style = companion.invoke(context, attrs);
        configBackground();
        configChannelAvatar();
        configTitle();
        configBackButton();
        configOfflineLabel();
        configSearchingForNetworkLabel();
        configOnlineLabel();
    }

    private final void reduceHeaderState(boolean isThread, boolean isTitleEnabled, String normalModeTitle, String threadModeTitle, boolean isSubtitleEnabled, String normalModeSubtitle, String threadModeSubtitle, List<User> typingUsers, OnlineState onlineState) {
        this.headerState = this.headerState.copy(isThread, isTitleEnabled, normalModeTitle, threadModeTitle, isSubtitleEnabled, normalModeSubtitle, threadModeSubtitle, typingUsers, onlineState);
        renderHeaderState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reduceHeaderState$default(ChannelHeaderView channelHeaderView, boolean z4, boolean z13, String str, String str2, boolean z14, String str3, String str4, List list, OnlineState onlineState, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = channelHeaderView.headerState.isThread();
        }
        if ((i13 & 2) != 0) {
            z13 = channelHeaderView.headerState.isTitleEnabled();
        }
        if ((i13 & 4) != 0) {
            str = channelHeaderView.headerState.getNormalModeTitle();
        }
        if ((i13 & 8) != 0) {
            str2 = channelHeaderView.headerState.getThreadModeTitle();
        }
        if ((i13 & 16) != 0) {
            z14 = channelHeaderView.headerState.isSubtitleEnabled();
        }
        if ((i13 & 32) != 0) {
            str3 = channelHeaderView.headerState.getNormalModeSubtitle();
        }
        if ((i13 & 64) != 0) {
            str4 = channelHeaderView.headerState.getThreadModeSubtitle();
        }
        if ((i13 & 128) != 0) {
            list = channelHeaderView.headerState.getTypingUsers();
        }
        if ((i13 & 256) != 0) {
            onlineState = channelHeaderView.headerState.getOnlineState();
        }
        List list2 = list;
        OnlineState onlineState2 = onlineState;
        String str5 = str3;
        String str6 = str4;
        boolean z15 = z14;
        String str7 = str;
        boolean z16 = z4;
        channelHeaderView.reduceHeaderState(z16, z13, str7, str2, z15, str5, str6, list2, onlineState2);
    }

    private final void renderHeaderState() {
        renderTitleState();
        renderSubtitleState();
    }

    private final void renderSubtitleState() {
        StreamUiChannelHeaderViewBinding streamUiChannelHeaderViewBinding = this.binding;
        if (this.headerState.getOnlineState() == OnlineState.CONNECTING) {
            LinearLayout connectingContainer = streamUiChannelHeaderViewBinding.connectingContainer;
            AbstractC22676k.m65749i(connectingContainer, "connectingContainer");
            if (connectingContainer.getVisibility() == 0) {
                return;
            }
        }
        if (!this.headerState.isSubtitleEnabled()) {
            FrameLayout subtitleContainer = streamUiChannelHeaderViewBinding.subtitleContainer;
            AbstractC22676k.m65749i(subtitleContainer, "subtitleContainer");
            subtitleContainer.setVisibility(8);
            return;
        }
        FrameLayout subtitleContainer2 = streamUiChannelHeaderViewBinding.subtitleContainer;
        AbstractC22676k.m65749i(subtitleContainer2, "subtitleContainer");
        int childCount = subtitleContainer2.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            subtitleContainer2.getChildAt(i13).setVisibility(8);
        }
        if (!this.headerState.getTypingUsers().isEmpty()) {
            TypingIndicatorView typingIndicatorView = streamUiChannelHeaderViewBinding.typingIndicatorView;
            AbstractC22676k.m65749i(typingIndicatorView, "typingIndicatorView");
            typingIndicatorView.setVisibility(0);
            streamUiChannelHeaderViewBinding.typingIndicatorView.setTypingUsers(this.headerState.getTypingUsers());
            return;
        }
        int i14 = WhenMappings.$EnumSwitchMapping$0[this.headerState.getOnlineState().ordinal()];
        if (i14 == 1) {
            String threadModeSubtitle = this.headerState.isThread() ? this.headerState.getThreadModeSubtitle() : this.headerState.getNormalModeSubtitle();
            streamUiChannelHeaderViewBinding.onlineTextView.setText(threadModeSubtitle);
            TextView onlineTextView = streamUiChannelHeaderViewBinding.onlineTextView;
            AbstractC22676k.m65749i(onlineTextView, "onlineTextView");
            onlineTextView.setVisibility(threadModeSubtitle.length() > 0 ? 0 : 8);
            return;
        }
        if (i14 == 2) {
            LinearLayout connectingContainer2 = streamUiChannelHeaderViewBinding.connectingContainer;
            AbstractC22676k.m65749i(connectingContainer2, "connectingContainer");
            connectingContainer2.setVisibility(0);
        } else if (i14 != 3) {
            if (i14 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            LinearLayout offlineContainer = streamUiChannelHeaderViewBinding.offlineContainer;
            AbstractC22676k.m65749i(offlineContainer, "offlineContainer");
            offlineContainer.setVisibility(0);
        }
    }

    private final void renderTitleState() {
        StreamUiChannelHeaderViewBinding streamUiChannelHeaderViewBinding = this.binding;
        if (!this.headerState.isTitleEnabled()) {
            TextView titleTextView = streamUiChannelHeaderViewBinding.titleTextView;
            AbstractC22676k.m65749i(titleTextView, "titleTextView");
            titleTextView.setVisibility(8);
        } else {
            String threadModeTitle = this.headerState.isThread() ? this.headerState.getThreadModeTitle() : this.headerState.getNormalModeTitle();
            streamUiChannelHeaderViewBinding.titleTextView.setText(threadModeTitle);
            TextView titleTextView2 = streamUiChannelHeaderViewBinding.titleTextView;
            AbstractC22676k.m65749i(titleTextView2, "titleTextView");
            titleTextView2.setVisibility(threadModeTitle.length() > 0 ? 0 : 8);
        }
    }

    public final String getOnlineStateSubtitle() {
        return this.binding.onlineTextView.getText().toString();
    }

    public final void hideAvatar() {
        ChannelAvatarView channelAvatarView = this.binding.channelAvatarView;
        AbstractC22676k.m65749i(channelAvatarView, "channelAvatarView");
        channelAvatarView.setVisibility(4);
    }

    public final void hideBackButtonBadge() {
        TextView backButtonBadge = this.binding.backButtonBadge;
        AbstractC22676k.m65749i(backButtonBadge, "backButtonBadge");
        backButtonBadge.setVisibility(8);
    }

    public final void hideSubtitle() {
        reduceHeaderState$default(this, false, false, null, null, false, null, null, null, null, 495, null);
    }

    public final void hideTitle() {
        reduceHeaderState$default(this, false, false, null, null, false, null, null, null, null, 509, null);
    }

    public final void setAvatar(Channel channel) {
        AbstractC22676k.m65750j(channel, "channel");
        ChannelAvatarView.setChannel$default(this.binding.channelAvatarView, channel, null, 2, null);
    }

    public final void setAvatarClickListener(OnClickListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.binding.channelAvatarView.setOnClickListener(new ViewOnClickListenerC19722a(listener, 3));
    }

    public final void setBackButtonClickListener(OnClickListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.binding.backButtonContainer.setOnClickListener(new ViewOnClickListenerC19722a(listener, 1));
    }

    public final void setNormalMode() {
        reduceHeaderState$default(this, false, false, null, null, false, null, null, null, null, 510, null);
    }

    public final void setOnlineStateSubtitle(String subtitle) {
        AbstractC22676k.m65750j(subtitle, "subtitle");
        reduceHeaderState$default(this, false, false, null, null, false, subtitle, null, null, null, 479, null);
    }

    public final void setRetryClickListener(OnClickListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        TextView textView = this.binding.offlineRetryButton;
        AbstractC22676k.m65747g(textView);
        textView.setVisibility(0);
        textView.setOnClickListener(new ViewOnClickListenerC19722a(listener, 4));
    }

    public final void setSubtitleClickListener(OnClickListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.binding.subtitleContainer.setOnClickListener(new ViewOnClickListenerC19722a(listener, 2));
    }

    public final void setThreadMode() {
        reduceHeaderState$default(this, true, false, null, null, false, null, null, null, null, 510, null);
    }

    public final void setThreadSubtitle(String subtitle) {
        AbstractC22676k.m65750j(subtitle, "subtitle");
        reduceHeaderState$default(this, false, false, null, null, false, null, subtitle, null, null, 447, null);
    }

    public final void setTitle(String title) {
        AbstractC22676k.m65750j(title, "title");
        String string = getContext().getString(C19469R.string.stream_ui_channel_header_thread_subtitle, title);
        AbstractC22676k.m65749i(string, "getString(...)");
        reduceHeaderState$default(this, false, true, title, null, false, null, string, null, null, 441, null);
    }

    public final void setTitleClickListener(OnClickListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.binding.titleTextView.setOnClickListener(new ViewOnClickListenerC19722a(listener, 0));
    }

    public final void showBackButtonBadge(String text) {
        AbstractC22676k.m65750j(text, "text");
        TextView textView = this.binding.backButtonBadge;
        AbstractC22676k.m65747g(textView);
        textView.setVisibility(0);
        textView.setText(text);
    }

    public final void showOfflineStateLabel() {
        reduceHeaderState$default(this, false, false, null, null, false, null, null, null, OnlineState.OFFLINE, 255, null);
    }

    public final void showOnlineStateSubtitle() {
        reduceHeaderState$default(this, false, false, null, null, false, null, null, null, OnlineState.ONLINE, 255, null);
    }

    public final void showSearchingForNetworkLabel() {
        reduceHeaderState$default(this, false, false, null, null, false, null, null, null, OnlineState.CONNECTING, 255, null);
    }

    public final void showTypingStateLabel(List<User> typingUsers) {
        AbstractC22676k.m65750j(typingUsers, "typingUsers");
        reduceHeaderState$default(this, false, false, null, null, false, null, null, typingUsers, null, 383, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelHeaderView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiChannelHeaderViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        Companion companion = Companion;
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        this.headerState = companion.createInitialHeaderState(context2);
        init(attributeSet);
    }
}
