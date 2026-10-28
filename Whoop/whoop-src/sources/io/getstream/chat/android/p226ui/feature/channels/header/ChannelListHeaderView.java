package io.getstream.chat.android.p226ui.feature.channels.header;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b30.ViewOnClickListenerC2604q1;
import c93.InterfaceC4339a;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.databinding.StreamUiChannelListHeaderViewBinding;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import jo.ViewOnClickListenerC21821j;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q13.ViewOnLongClickListenerC29804a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002;<B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)J\u001b\u0010,\u001a\u00020\u000e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0*¢\u0006\u0004\b,\u0010-J\u001b\u0010.\u001a\u00020\u000e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0*¢\u0006\u0004\b.\u0010-J\r\u0010/\u001a\u00020\u000e¢\u0006\u0004\b/\u0010)J\r\u00100\u001a\u00020\u000e¢\u0006\u0004\b0\u0010)J\u0015\u00102\u001a\u00020\u000e2\u0006\u0010+\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u000e2\u0006\u0010+\u001a\u000204¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\u00020\u000e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0*H\u0007¢\u0006\u0004\b7\u0010-R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Ll83/a0;", "init", "(Landroid/util/AttributeSet;)V", "Landroid/content/res/TypedArray;", "typedArray", "configUserAvatar", "(Landroid/content/res/TypedArray;)V", "configOnlineTitle", "configOfflineTitleContainer", "Landroid/content/res/ColorStateList;", "getProgressBarTint", "(Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;", "configActionButton", "configureSeparator", "Lio/getstream/chat/android/ui/font/TextStyle;", "getOnlineTitleTextStyle", "(Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/font/TextStyle;", "getOfflineTitleTextStyle", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "setUser", "(Lio/getstream/chat/android/models/User;)V", "", "title", "setOnlineTitle", "(Ljava/lang/String;)V", "showOnlineTitle", "()V", "Lkotlin/Function0;", "listener", "setOnTitleClickListener", "(Lc93/a;)V", "setOnTitleLongClickListener", "showOfflineTitle", "showConnectingTitle", "Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$UserAvatarClickListener;", "setOnUserAvatarClickListener", "(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$UserAvatarClickListener;)V", "Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$ActionButtonClickListener;", "setOnActionButtonClickListener", "(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$ActionButtonClickListener;)V", "setOnUserAvatarLongClickListener", "Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;", "UserAvatarClickListener", "ActionButtonClickListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelListHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f74479w = 0;
    private final StreamUiChannelListHeaderViewBinding binding;

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$ActionButtonClickListener;", "", "Ll83/a0;", "onClick", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ActionButtonClickListener {
        void onClick();
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$UserAvatarClickListener;", "", "Ll83/a0;", "onUserAvatarClick", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface UserAvatarClickListener {
        void onUserAvatarClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelListHeaderView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context));
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiChannelListHeaderViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        init(null);
    }

    private final void configActionButton(TypedArray typedArray) {
        ImageView imageView = this.binding.actionButton;
        boolean z4 = typedArray.getBoolean(C19469R.styleable.ChannelListHeaderView_streamUiShowActionButton, true);
        AbstractC22676k.m65747g(imageView);
        imageView.setVisibility(!z4 ? 4 : 0);
        imageView.setClickable(z4);
        Drawable drawable = typedArray.getDrawable(C19469R.styleable.ChannelListHeaderView_streamUiActionButtonIcon);
        if (drawable == null) {
            drawable = AbstractC32122c.getDrawable(imageView.getContext(), C19469R.drawable.stream_ui_ic_pen);
        }
        imageView.setImageDrawable(drawable);
        ColorStateList colorStateList = typedArray.getColorStateList(C19469R.styleable.ChannelListHeaderView_streamUiActionBackgroundTint);
        if (colorStateList == null) {
            colorStateList = AbstractC32122c.getColorStateList(imageView.getContext(), C19469R.color.stream_ui_icon_button_background_selector);
        }
        imageView.setBackgroundTintList(colorStateList);
    }

    private final void configOfflineTitleContainer(TypedArray typedArray) {
        TextView offlineTextView = this.binding.offlineTextView;
        AbstractC22676k.m65749i(offlineTextView, "offlineTextView");
        TextStyleKt.setTextStyle(offlineTextView, getOfflineTitleTextStyle(typedArray));
        ProgressBar progressBar = this.binding.offlineProgressBar;
        AbstractC22676k.m65747g(progressBar);
        progressBar.setVisibility(typedArray.getBoolean(C19469R.styleable.ChannelListHeaderView_streamUiShowOfflineProgressBar, true) ? 0 : 8);
        progressBar.setIndeterminateTintList(getProgressBarTint(typedArray));
    }

    private final void configOnlineTitle(TypedArray typedArray) {
        TextView onlineTextView = this.binding.onlineTextView;
        AbstractC22676k.m65749i(onlineTextView, "onlineTextView");
        TextStyleKt.setTextStyle(onlineTextView, getOnlineTitleTextStyle(typedArray));
    }

    private final void configUserAvatar(TypedArray typedArray) {
        boolean z4 = typedArray.getBoolean(C19469R.styleable.ChannelListHeaderView_streamUiShowUserAvatar, true);
        UserAvatarView userAvatarView = this.binding.userAvatarView;
        AbstractC22676k.m65747g(userAvatarView);
        userAvatarView.setVisibility(!z4 ? 4 : 0);
        userAvatarView.setClickable(z4);
    }

    private final void configureSeparator(TypedArray typedArray) {
        View view = this.binding.separator;
        Drawable drawable = typedArray.getDrawable(C19469R.styleable.f74153x976bbdf0);
        view.setVisibility(drawable != null ? 0 : 8);
        view.setBackground(drawable);
    }

    private final TextStyle getOfflineTitleTextStyle(TypedArray typedArray) {
        TextStyle.Builder builder = new TextStyle.Builder(typedArray);
        int i13 = C19469R.styleable.ChannelListHeaderView_streamUiOfflineTitleTextSize;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        builder.size(i13, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
        int i14 = C19469R.styleable.ChannelListHeaderView_streamUiOfflineTitleTextColor;
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        builder.color(i14, AbstractC32122c.getColor(context2, C19469R.color.stream_ui_text_color_primary));
        builder.font(C19469R.styleable.ChannelListHeaderView_streamUiOfflineTitleFontAssets, C19469R.styleable.ChannelListHeaderView_streamUiOfflineTitleTextFont);
        builder.style(C19469R.styleable.ChannelListHeaderView_streamUiOfflineTitleTextStyle, 1);
        return builder.build();
    }

    private final TextStyle getOnlineTitleTextStyle(TypedArray typedArray) {
        TextStyle.Builder builder = new TextStyle.Builder(typedArray);
        int i13 = C19469R.styleable.ChannelListHeaderView_streamUiOnlineTitleTextSize;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        builder.size(i13, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
        int i14 = C19469R.styleable.ChannelListHeaderView_streamUiOnlineTitleTextColor;
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        builder.color(i14, AbstractC32122c.getColor(context2, C19469R.color.stream_ui_text_color_primary));
        builder.font(C19469R.styleable.ChannelListHeaderView_streamUiOnlineTitleFontAssets, C19469R.styleable.ChannelListHeaderView_streamUiOnlineTitleTextFont);
        builder.style(C19469R.styleable.ChannelListHeaderView_streamUiOnlineTitleTextStyle, 1);
        return builder.build();
    }

    private final ColorStateList getProgressBarTint(TypedArray typedArray) {
        ColorStateList colorStateList = typedArray.getColorStateList(C19469R.styleable.ChannelListHeaderView_streamUiOfflineProgressBarTint);
        return colorStateList == null ? AbstractC32122c.getColorStateList(getContext(), C19469R.color.stream_ui_accent_blue) : colorStateList;
    }

    private final void init(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C19469R.styleable.ChannelListHeaderView, C19469R.attr.streamUiChannelListHeaderStyle, C19469R.style.StreamUi_ChannelListHeader);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        configUserAvatar(typedArrayObtainStyledAttributes);
        configOnlineTitle(typedArrayObtainStyledAttributes);
        configOfflineTitleContainer(typedArrayObtainStyledAttributes);
        configActionButton(typedArrayObtainStyledAttributes);
        configureSeparator(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static final boolean setOnTitleLongClickListener$lambda$7(InterfaceC4339a interfaceC4339a, View view) {
        interfaceC4339a.invoke();
        return true;
    }

    private static final boolean setOnTitleLongClickListener$lambda$8(InterfaceC4339a interfaceC4339a, View view) {
        interfaceC4339a.invoke();
        return true;
    }

    private static final boolean setOnUserAvatarLongClickListener$lambda$11(InterfaceC4339a interfaceC4339a, View view) {
        interfaceC4339a.invoke();
        return true;
    }

    public final void setOnActionButtonClickListener(ActionButtonClickListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.binding.actionButton.setOnClickListener(new ViewOnClickListenerC21821j(listener, 10));
    }

    public final void setOnTitleClickListener(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.binding.offlineTextView.setOnClickListener(new ViewOnClickListenerC2604q1(listener, 1));
        this.binding.onlineTextView.setOnClickListener(new ViewOnClickListenerC2604q1(listener, 2));
    }

    public final void setOnTitleLongClickListener(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.binding.offlineTextView.setOnLongClickListener(new ViewOnLongClickListenerC29804a(listener, 1));
        this.binding.onlineTextView.setOnLongClickListener(new ViewOnLongClickListenerC29804a(listener, 2));
    }

    public final void setOnUserAvatarClickListener(UserAvatarClickListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.binding.userAvatarView.setOnClickListener(new ViewOnClickListenerC21821j(listener, 11));
    }

    @InternalStreamChatApi
    public final void setOnUserAvatarLongClickListener(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.binding.userAvatarView.setOnLongClickListener(new ViewOnLongClickListenerC29804a(listener, 0));
    }

    public final void setOnlineTitle(String title) {
        AbstractC22676k.m65750j(title, "title");
        this.binding.onlineTextView.setText(title);
    }

    public final void setUser(User user) {
        AbstractC22676k.m65750j(user, "user");
        UserAvatarView.setUser$default(this.binding.userAvatarView, user, false, 2, null);
    }

    public final void showConnectingTitle() {
        LinearLayout offlineTitleContainer = this.binding.offlineTitleContainer;
        AbstractC22676k.m65749i(offlineTitleContainer, "offlineTitleContainer");
        offlineTitleContainer.setVisibility(0);
        ProgressBar offlineProgressBar = this.binding.offlineProgressBar;
        AbstractC22676k.m65749i(offlineProgressBar, "offlineProgressBar");
        offlineProgressBar.setVisibility(0);
        TextView onlineTextView = this.binding.onlineTextView;
        AbstractC22676k.m65749i(onlineTextView, "onlineTextView");
        onlineTextView.setVisibility(8);
        this.binding.offlineTextView.setText(getResources().getString(C19469R.string.stream_ui_channel_list_header_disconnected));
    }

    public final void showOfflineTitle() {
        LinearLayout offlineTitleContainer = this.binding.offlineTitleContainer;
        AbstractC22676k.m65749i(offlineTitleContainer, "offlineTitleContainer");
        offlineTitleContainer.setVisibility(0);
        ProgressBar offlineProgressBar = this.binding.offlineProgressBar;
        AbstractC22676k.m65749i(offlineProgressBar, "offlineProgressBar");
        offlineProgressBar.setVisibility(8);
        TextView onlineTextView = this.binding.onlineTextView;
        AbstractC22676k.m65749i(onlineTextView, "onlineTextView");
        onlineTextView.setVisibility(8);
        this.binding.offlineTextView.setText(getResources().getString(C19469R.string.stream_ui_channel_list_header_offline));
    }

    public final void showOnlineTitle() {
        LinearLayout offlineTitleContainer = this.binding.offlineTitleContainer;
        AbstractC22676k.m65749i(offlineTitleContainer, "offlineTitleContainer");
        offlineTitleContainer.setVisibility(8);
        TextView onlineTextView = this.binding.onlineTextView;
        AbstractC22676k.m65749i(onlineTextView, "onlineTextView");
        onlineTextView.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelListHeaderView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiChannelListHeaderViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        init(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelListHeaderView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiChannelListHeaderViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        init(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelListHeaderView(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13, i14);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiChannelListHeaderViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        init(attributeSet);
    }
}
