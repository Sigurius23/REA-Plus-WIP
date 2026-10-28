package io.getstream.chat.android.p226ui.feature.threads.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.profileinstaller.ProfileVerifier;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.preview.MessagePreviewStyle;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 T2\u00020\u0001:\u0001TBÁ\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\t\u0010?\u001a\u00020\u000eHÆ\u0003J\t\u0010@\u001a\u00020\tHÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\tHÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003JÛ\u0001\u0010M\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0003\u0010\u0014\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u00032\b\b\u0003\u0010\u0017\u001a\u00020\u00032\b\b\u0003\u0010\u0018\u001a\u00020\u00032\b\b\u0003\u0010\u0019\u001a\u00020\u00032\b\b\u0003\u0010\u001a\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020\u0003HÖ\u0001J\t\u0010S\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001f¨\u0006U"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "backgroundColor", "", "emptyStateDrawable", "Landroid/graphics/drawable/Drawable;", "emptyStateText", "", "emptyStateTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "threadIconDrawable", "threadTitleStyle", "threadReplyToStyle", "latestReplyStyle", "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;", "unreadCountBadgeTextStyle", "unreadCountBadgeBackground", "bannerTextStyle", "bannerIcon", "bannerBackground", "bannerPaddingLeft", "bannerPaddingTop", "bannerPaddingRight", "bannerPaddingBottom", "bannerMarginLeft", "bannerMarginTop", "bannerMarginRight", "bannerMarginBottom", "<init>", "(ILandroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIIIIIII)V", "getBackgroundColor", "()I", "getEmptyStateDrawable", "()Landroid/graphics/drawable/Drawable;", "getEmptyStateText", "()Ljava/lang/String;", "getEmptyStateTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getThreadIconDrawable", "getThreadTitleStyle", "getThreadReplyToStyle", "getLatestReplyStyle", "()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;", "getUnreadCountBadgeTextStyle", "getUnreadCountBadgeBackground", "getBannerTextStyle", "getBannerIcon", "getBannerBackground", "getBannerPaddingLeft", "getBannerPaddingTop", "getBannerPaddingRight", "getBannerPaddingBottom", "getBannerMarginLeft", "getBannerMarginTop", "getBannerMarginRight", "getBannerMarginBottom", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ThreadListViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final int backgroundColor;
    private final Drawable bannerBackground;
    private final Drawable bannerIcon;
    private final int bannerMarginBottom;
    private final int bannerMarginLeft;
    private final int bannerMarginRight;
    private final int bannerMarginTop;
    private final int bannerPaddingBottom;
    private final int bannerPaddingLeft;
    private final int bannerPaddingRight;
    private final int bannerPaddingTop;
    private final TextStyle bannerTextStyle;
    private final Drawable emptyStateDrawable;
    private final String emptyStateText;
    private final TextStyle emptyStateTextStyle;
    private final MessagePreviewStyle latestReplyStyle;
    private final Drawable threadIconDrawable;
    private final TextStyle threadReplyToStyle;
    private final TextStyle threadTitleStyle;
    private final Drawable unreadCountBadgeBackground;
    private final TextStyle unreadCountBadgeTextStyle;

    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010!\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010#\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010$\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010%\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010&\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "backgroundColor", "", "typedArray", "Landroid/content/res/TypedArray;", "emptyStateDrawable", "Landroid/graphics/drawable/Drawable;", "emptyStateText", "", "emptyStateTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "threadIconDrawable", "threadTitleStyle", "threadReplyToStyle", "threadLatestReplySenderStyle", "threadLatestReplyMessageStyle", "threadLatestReplyTimeStyle", "unreadCountBadgeTextStyle", "unreadCountBadgeBackground", "bannerTextStyle", "bannerIcon", "bannerBackground", "bannerPaddingLeft", "bannerPaddingTop", "bannerPaddingRight", "bannerPaddingBottom", "bannerMarginLeft", "bannerMarginTop", "bannerMarginRight", "bannerMarginBottom", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final int backgroundColor(Context context, TypedArray typedArray) {
            return typedArray.getColor(C19469R.styleable.ThreadListView_streamUiThreadListBackground, ContextKt.getColorCompat(context, C19469R.color.stream_ui_white_snow));
        }

        private final Drawable bannerBackground(Context context, TypedArray typedArray) {
            Drawable drawable = typedArray.getDrawable(C19469R.styleable.ThreadListView_streamUiThreadListUnreadThreadsBannerBackground);
            if (drawable != null) {
                return drawable;
            }
            Drawable drawableCompat = ContextKt.getDrawableCompat(context, C19469R.drawable.stream_ui_shape_unread_threads_banner);
            AbstractC22676k.m65747g(drawableCompat);
            return drawableCompat;
        }

        private final Drawable bannerIcon(Context context, TypedArray typedArray) {
            Drawable drawable = typedArray.getDrawable(C19469R.styleable.ThreadListView_streamUiThreadListUnreadThreadsBannerIcon);
            if (drawable != null) {
                return drawable;
            }
            Drawable drawableCompat = ContextKt.getDrawableCompat(context, C19469R.drawable.stream_ui_ic_union);
            AbstractC22676k.m65747g(drawableCompat);
            return drawableCompat;
        }

        private final int bannerMarginBottom(Context context, TypedArray typedArray) {
            return typedArray.getDimensionPixelSize(C19469R.styleable.ThreadListView_streamUiThreadListUnreadThreadsBannerMarginBottom, ContextKt.getDimension(context, C19469R.dimen.stream_ui_spacing_small));
        }

        private final int bannerMarginLeft(Context context, TypedArray typedArray) {
            return typedArray.getDimensionPixelSize(C19469R.styleable.ThreadListView_streamUiThreadListUnreadThreadsBannerMarginLeft, ContextKt.getDimension(context, C19469R.dimen.stream_ui_spacing_small));
        }

        private final int bannerMarginRight(Context context, TypedArray typedArray) {
            return typedArray.getDimensionPixelSize(C19469R.styleable.ThreadListView_streamUiThreadListUnreadThreadsBannerMarginRight, ContextKt.getDimension(context, C19469R.dimen.stream_ui_spacing_small));
        }

        private final int bannerMarginTop(Context context, TypedArray typedArray) {
            return typedArray.getDimensionPixelSize(C19469R.styleable.ThreadListView_streamUiThreadListUnreadThreadsBannerMarginTop, ContextKt.getDimension(context, C19469R.dimen.stream_ui_spacing_small));
        }

        private final int bannerPaddingBottom(Context context, TypedArray typedArray) {
            return typedArray.getDimensionPixelSize(C19469R.styleable.f74430xe6602684, ContextKt.getDimension(context, C19469R.dimen.stream_ui_spacing_medium));
        }

        private final int bannerPaddingLeft(Context context, TypedArray typedArray) {
            return typedArray.getDimensionPixelSize(C19469R.styleable.ThreadListView_streamUiThreadListUnreadThreadsBannerPaddingLeft, ContextKt.getDimension(context, C19469R.dimen.stream_ui_spacing_medium));
        }

        private final int bannerPaddingRight(Context context, TypedArray typedArray) {
            return typedArray.getDimensionPixelSize(C19469R.styleable.ThreadListView_streamUiThreadListUnreadThreadsBannerPaddingRight, ContextKt.getDimension(context, C19469R.dimen.stream_ui_spacing_medium));
        }

        private final int bannerPaddingTop(Context context, TypedArray typedArray) {
            return typedArray.getDimensionPixelSize(C19469R.styleable.ThreadListView_streamUiThreadListUnreadThreadsBannerPaddingTop, ContextKt.getDimension(context, C19469R.dimen.stream_ui_spacing_medium));
        }

        private final TextStyle bannerTextStyle(Context context, TypedArray typedArray) {
            TextStyle.Builder builder = new TextStyle.Builder(typedArray);
            builder.size(C19469R.styleable.ThreadListView_streamUiThreadListUnreadThreadsBannerTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder.color(C19469R.styleable.ThreadListView_streamUiThreadListUnreadThreadsBannerTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            builder.font(C19469R.styleable.f74431x1b2029d7, C19469R.styleable.ThreadListView_streamUiThreadListUnreadThreadsBannerTextFont);
            builder.style(C19469R.styleable.ThreadListView_streamUiThreadListUnreadThreadsBannerTextStyle, 0);
            return builder.build();
        }

        private final Drawable emptyStateDrawable(Context context, TypedArray typedArray) {
            Drawable drawable = typedArray.getDrawable(C19469R.styleable.ThreadListView_streamUiThreadListEmptyStateDrawable);
            if (drawable != null) {
                return drawable;
            }
            Drawable drawableCompat = ContextKt.getDrawableCompat(context, C19469R.drawable.stream_ui_ic_threads_empty);
            AbstractC22676k.m65747g(drawableCompat);
            return drawableCompat;
        }

        private final String emptyStateText(Context context, TypedArray typedArray) {
            String string = typedArray.getString(C19469R.styleable.ThreadListView_streamUiThreadListEmptyStateText);
            if (string != null) {
                return string;
            }
            String string2 = context.getString(C19469R.string.stream_ui_thread_list_empty_title);
            AbstractC22676k.m65749i(string2, "getString(...)");
            return string2;
        }

        private final TextStyle emptyStateTextStyle(Context context, TypedArray typedArray) {
            TextStyle.Builder builder = new TextStyle.Builder(typedArray);
            builder.size(C19469R.styleable.ThreadListView_streamUiThreadListEmptyStateTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder.color(C19469R.styleable.ThreadListView_streamUiThreadListEmptyStateTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder.font(C19469R.styleable.ThreadListView_streamUiThreadListEmptyStateTextFontAssets, C19469R.styleable.ThreadListView_streamUiThreadListEmptyStateTextFont);
            builder.style(C19469R.styleable.ThreadListView_streamUiThreadListEmptyStateTextStyle, 0);
            return builder.build();
        }

        private final Drawable threadIconDrawable(Context context, TypedArray typedArray) {
            Drawable drawable = typedArray.getDrawable(C19469R.styleable.ThreadListView_streamUiThreadListThreadIconDrawable);
            if (drawable != null) {
                return drawable;
            }
            Drawable drawableCompat = ContextKt.getDrawableCompat(context, C19469R.drawable.stream_ui_ic_thread);
            AbstractC22676k.m65747g(drawableCompat);
            return drawableCompat;
        }

        private final TextStyle threadLatestReplyMessageStyle(Context context, TypedArray typedArray) {
            TextStyle.Builder builder = new TextStyle.Builder(typedArray);
            builder.size(C19469R.styleable.f74422xb6e4a78a, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder.color(C19469R.styleable.f74419x24d158fa, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder.font(C19469R.styleable.f74421x72ebf17b, C19469R.styleable.f74420xb6ded3d8);
            builder.style(C19469R.styleable.f74423x25b54748, 0);
            return builder.build();
        }

        private final TextStyle threadLatestReplySenderStyle(Context context, TypedArray typedArray) {
            TextStyle.Builder builder = new TextStyle.Builder(typedArray);
            builder.size(C19469R.styleable.ThreadListView_streamUiThreadListThreadLatestReplySenderTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder.color(C19469R.styleable.f74424x79d1df16, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder.font(C19469R.styleable.f74425x1716dcdf, C19469R.styleable.ThreadListView_streamUiThreadListThreadLatestReplySenderTextFont);
            builder.style(C19469R.styleable.f74426x7ab5cd64, 1);
            return builder.build();
        }

        private final TextStyle threadLatestReplyTimeStyle(Context context, TypedArray typedArray) {
            TextStyle.Builder builder = new TextStyle.Builder(typedArray);
            builder.size(C19469R.styleable.ThreadListView_streamUiThreadListThreadLatestReplyTimeTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder.color(C19469R.styleable.ThreadListView_streamUiThreadListThreadLatestReplyTimeTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder.font(C19469R.styleable.f74427x15f81237, C19469R.styleable.ThreadListView_streamUiThreadListThreadLatestReplyTimeTextFont);
            builder.style(C19469R.styleable.ThreadListView_streamUiThreadListThreadLatestReplyTimeTextStyle, 0);
            return builder.build();
        }

        private final TextStyle threadReplyToStyle(Context context, TypedArray typedArray) {
            TextStyle.Builder builder = new TextStyle.Builder(typedArray);
            builder.size(C19469R.styleable.ThreadListView_streamUiThreadListThreadReplyToTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder.color(C19469R.styleable.ThreadListView_streamUiThreadListThreadReplyToTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder.font(C19469R.styleable.ThreadListView_streamUiThreadListThreadReplyToTextFontAssets, C19469R.styleable.ThreadListView_streamUiThreadListThreadReplyToTextFont);
            builder.style(C19469R.styleable.ThreadListView_streamUiThreadListThreadReplyToTextStyle, 0);
            return builder.build();
        }

        private final TextStyle threadTitleStyle(Context context, TypedArray typedArray) {
            TextStyle.Builder builder = new TextStyle.Builder(typedArray);
            builder.size(C19469R.styleable.ThreadListView_streamUiThreadListThreadTitleTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder.color(C19469R.styleable.ThreadListView_streamUiThreadListThreadTitleTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder.font(C19469R.styleable.ThreadListView_streamUiThreadListThreadTitleTextFontAssets, C19469R.styleable.ThreadListView_streamUiThreadListThreadTitleTextFont);
            builder.style(C19469R.styleable.ThreadListView_streamUiThreadListThreadTitleTextStyle, 1);
            return builder.build();
        }

        private final Drawable unreadCountBadgeBackground(Context context, TypedArray typedArray) {
            Drawable drawable = typedArray.getDrawable(C19469R.styleable.f74428xfe063029);
            if (drawable != null) {
                return drawable;
            }
            Drawable drawableCompat = ContextKt.getDrawableCompat(context, C19469R.drawable.stream_ui_shape_badge_background);
            AbstractC22676k.m65747g(drawableCompat);
            return drawableCompat;
        }

        private final TextStyle unreadCountBadgeTextStyle(Context context, TypedArray typedArray) {
            TextStyle.Builder builder = new TextStyle.Builder(typedArray);
            builder.size(C19469R.styleable.ThreadListView_streamUiThreadListThreadUnreadCountBadgeTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_small));
            builder.color(C19469R.styleable.ThreadListView_streamUiThreadListThreadUnreadCountBadgeTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            builder.font(C19469R.styleable.f74429x8823e73a, C19469R.styleable.ThreadListView_streamUiThreadListThreadUnreadCountBadgeTextFont);
            builder.style(C19469R.styleable.ThreadListView_streamUiThreadListThreadUnreadCountBadgeTextStyle, 0);
            return builder.build();
        }

        public final ThreadListViewStyle invoke(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.ThreadListView, C19469R.attr.streamUiThreadListStyle, C19469R.style.StreamUi_ThreadList);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            Companion companion = ThreadListViewStyle.INSTANCE;
            int iBackgroundColor = companion.backgroundColor(context, typedArrayObtainStyledAttributes);
            Drawable drawableEmptyStateDrawable = companion.emptyStateDrawable(context, typedArrayObtainStyledAttributes);
            String strEmptyStateText = companion.emptyStateText(context, typedArrayObtainStyledAttributes);
            TextStyle textStyleEmptyStateTextStyle = companion.emptyStateTextStyle(context, typedArrayObtainStyledAttributes);
            Drawable drawableThreadIconDrawable = companion.threadIconDrawable(context, typedArrayObtainStyledAttributes);
            TextStyle textStyleThreadTitleStyle = companion.threadTitleStyle(context, typedArrayObtainStyledAttributes);
            TextStyle textStyleThreadReplyToStyle = companion.threadReplyToStyle(context, typedArrayObtainStyledAttributes);
            TextStyle textStyleThreadLatestReplySenderStyle = companion.threadLatestReplySenderStyle(context, typedArrayObtainStyledAttributes);
            TextStyle textStyleThreadLatestReplyMessageStyle = companion.threadLatestReplyMessageStyle(context, typedArrayObtainStyledAttributes);
            TextStyle textStyleThreadLatestReplyTimeStyle = companion.threadLatestReplyTimeStyle(context, typedArrayObtainStyledAttributes);
            return TransformStyle.getThreadListViewStyle().transform(new ThreadListViewStyle(iBackgroundColor, drawableEmptyStateDrawable, strEmptyStateText, textStyleEmptyStateTextStyle, drawableThreadIconDrawable, textStyleThreadTitleStyle, textStyleThreadReplyToStyle, new MessagePreviewStyle(textStyleThreadLatestReplySenderStyle, textStyleThreadLatestReplyMessageStyle, textStyleThreadLatestReplyTimeStyle), companion.unreadCountBadgeTextStyle(context, typedArrayObtainStyledAttributes), companion.unreadCountBadgeBackground(context, typedArrayObtainStyledAttributes), companion.bannerTextStyle(context, typedArrayObtainStyledAttributes), companion.bannerIcon(context, typedArrayObtainStyledAttributes), companion.bannerBackground(context, typedArrayObtainStyledAttributes), companion.bannerPaddingLeft(context, typedArrayObtainStyledAttributes), companion.bannerPaddingTop(context, typedArrayObtainStyledAttributes), companion.bannerPaddingRight(context, typedArrayObtainStyledAttributes), companion.bannerPaddingBottom(context, typedArrayObtainStyledAttributes), companion.bannerMarginLeft(context, typedArrayObtainStyledAttributes), companion.bannerMarginTop(context, typedArrayObtainStyledAttributes), companion.bannerMarginRight(context, typedArrayObtainStyledAttributes), companion.bannerMarginBottom(context, typedArrayObtainStyledAttributes)));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ThreadListViewStyle(int i13, Drawable emptyStateDrawable, String emptyStateText, TextStyle emptyStateTextStyle, Drawable threadIconDrawable, TextStyle threadTitleStyle, TextStyle threadReplyToStyle, MessagePreviewStyle latestReplyStyle, TextStyle unreadCountBadgeTextStyle, Drawable unreadCountBadgeBackground, TextStyle bannerTextStyle, Drawable bannerIcon, Drawable bannerBackground, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        AbstractC22676k.m65750j(emptyStateDrawable, "emptyStateDrawable");
        AbstractC22676k.m65750j(emptyStateText, "emptyStateText");
        AbstractC22676k.m65750j(emptyStateTextStyle, "emptyStateTextStyle");
        AbstractC22676k.m65750j(threadIconDrawable, "threadIconDrawable");
        AbstractC22676k.m65750j(threadTitleStyle, "threadTitleStyle");
        AbstractC22676k.m65750j(threadReplyToStyle, "threadReplyToStyle");
        AbstractC22676k.m65750j(latestReplyStyle, "latestReplyStyle");
        AbstractC22676k.m65750j(unreadCountBadgeTextStyle, "unreadCountBadgeTextStyle");
        AbstractC22676k.m65750j(unreadCountBadgeBackground, "unreadCountBadgeBackground");
        AbstractC22676k.m65750j(bannerTextStyle, "bannerTextStyle");
        AbstractC22676k.m65750j(bannerIcon, "bannerIcon");
        AbstractC22676k.m65750j(bannerBackground, "bannerBackground");
        this.backgroundColor = i13;
        this.emptyStateDrawable = emptyStateDrawable;
        this.emptyStateText = emptyStateText;
        this.emptyStateTextStyle = emptyStateTextStyle;
        this.threadIconDrawable = threadIconDrawable;
        this.threadTitleStyle = threadTitleStyle;
        this.threadReplyToStyle = threadReplyToStyle;
        this.latestReplyStyle = latestReplyStyle;
        this.unreadCountBadgeTextStyle = unreadCountBadgeTextStyle;
        this.unreadCountBadgeBackground = unreadCountBadgeBackground;
        this.bannerTextStyle = bannerTextStyle;
        this.bannerIcon = bannerIcon;
        this.bannerBackground = bannerBackground;
        this.bannerPaddingLeft = i14;
        this.bannerPaddingTop = i15;
        this.bannerPaddingRight = i16;
        this.bannerPaddingBottom = i17;
        this.bannerMarginLeft = i18;
        this.bannerMarginTop = i19;
        this.bannerMarginRight = i24;
        this.bannerMarginBottom = i25;
    }

    public static /* synthetic */ ThreadListViewStyle copy$default(ThreadListViewStyle threadListViewStyle, int i13, Drawable drawable, String str, TextStyle textStyle, Drawable drawable2, TextStyle textStyle2, TextStyle textStyle3, MessagePreviewStyle messagePreviewStyle, TextStyle textStyle4, Drawable drawable3, TextStyle textStyle5, Drawable drawable4, Drawable drawable5, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, Object obj) {
        int i27;
        int i28;
        int i29 = (i26 & 1) != 0 ? threadListViewStyle.backgroundColor : i13;
        Drawable drawable6 = (i26 & 2) != 0 ? threadListViewStyle.emptyStateDrawable : drawable;
        String str2 = (i26 & 4) != 0 ? threadListViewStyle.emptyStateText : str;
        TextStyle textStyle6 = (i26 & 8) != 0 ? threadListViewStyle.emptyStateTextStyle : textStyle;
        Drawable drawable7 = (i26 & 16) != 0 ? threadListViewStyle.threadIconDrawable : drawable2;
        TextStyle textStyle7 = (i26 & 32) != 0 ? threadListViewStyle.threadTitleStyle : textStyle2;
        TextStyle textStyle8 = (i26 & 64) != 0 ? threadListViewStyle.threadReplyToStyle : textStyle3;
        MessagePreviewStyle messagePreviewStyle2 = (i26 & 128) != 0 ? threadListViewStyle.latestReplyStyle : messagePreviewStyle;
        TextStyle textStyle9 = (i26 & 256) != 0 ? threadListViewStyle.unreadCountBadgeTextStyle : textStyle4;
        Drawable drawable8 = (i26 & 512) != 0 ? threadListViewStyle.unreadCountBadgeBackground : drawable3;
        TextStyle textStyle10 = (i26 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? threadListViewStyle.bannerTextStyle : textStyle5;
        Drawable drawable9 = (i26 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? threadListViewStyle.bannerIcon : drawable4;
        Drawable drawable10 = (i26 & 4096) != 0 ? threadListViewStyle.bannerBackground : drawable5;
        int i34 = (i26 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? threadListViewStyle.bannerPaddingLeft : i14;
        int i35 = i29;
        int i36 = (i26 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? threadListViewStyle.bannerPaddingTop : i15;
        int i37 = (i26 & 32768) != 0 ? threadListViewStyle.bannerPaddingRight : i16;
        int i38 = (i26 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? threadListViewStyle.bannerPaddingBottom : i17;
        int i39 = (i26 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? threadListViewStyle.bannerMarginLeft : i18;
        int i44 = (i26 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? threadListViewStyle.bannerMarginTop : i19;
        int i45 = (i26 & 524288) != 0 ? threadListViewStyle.bannerMarginRight : i24;
        if ((i26 & 1048576) != 0) {
            i28 = i45;
            i27 = threadListViewStyle.bannerMarginBottom;
        } else {
            i27 = i25;
            i28 = i45;
        }
        return threadListViewStyle.copy(i35, drawable6, str2, textStyle6, drawable7, textStyle7, textStyle8, messagePreviewStyle2, textStyle9, drawable8, textStyle10, drawable9, drawable10, i34, i36, i37, i38, i39, i44, i28, i27);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Drawable getUnreadCountBadgeBackground() {
        return this.unreadCountBadgeBackground;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final TextStyle getBannerTextStyle() {
        return this.bannerTextStyle;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Drawable getBannerIcon() {
        return this.bannerIcon;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Drawable getBannerBackground() {
        return this.bannerBackground;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getBannerPaddingLeft() {
        return this.bannerPaddingLeft;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getBannerPaddingTop() {
        return this.bannerPaddingTop;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getBannerPaddingRight() {
        return this.bannerPaddingRight;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getBannerPaddingBottom() {
        return this.bannerPaddingBottom;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getBannerMarginLeft() {
        return this.bannerMarginLeft;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getBannerMarginTop() {
        return this.bannerMarginTop;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Drawable getEmptyStateDrawable() {
        return this.emptyStateDrawable;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getBannerMarginRight() {
        return this.bannerMarginRight;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getBannerMarginBottom() {
        return this.bannerMarginBottom;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmptyStateText() {
        return this.emptyStateText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextStyle getEmptyStateTextStyle() {
        return this.emptyStateTextStyle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Drawable getThreadIconDrawable() {
        return this.threadIconDrawable;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TextStyle getThreadTitleStyle() {
        return this.threadTitleStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TextStyle getThreadReplyToStyle() {
        return this.threadReplyToStyle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final MessagePreviewStyle getLatestReplyStyle() {
        return this.latestReplyStyle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TextStyle getUnreadCountBadgeTextStyle() {
        return this.unreadCountBadgeTextStyle;
    }

    public final ThreadListViewStyle copy(int backgroundColor, Drawable emptyStateDrawable, String emptyStateText, TextStyle emptyStateTextStyle, Drawable threadIconDrawable, TextStyle threadTitleStyle, TextStyle threadReplyToStyle, MessagePreviewStyle latestReplyStyle, TextStyle unreadCountBadgeTextStyle, Drawable unreadCountBadgeBackground, TextStyle bannerTextStyle, Drawable bannerIcon, Drawable bannerBackground, int bannerPaddingLeft, int bannerPaddingTop, int bannerPaddingRight, int bannerPaddingBottom, int bannerMarginLeft, int bannerMarginTop, int bannerMarginRight, int bannerMarginBottom) {
        AbstractC22676k.m65750j(emptyStateDrawable, "emptyStateDrawable");
        AbstractC22676k.m65750j(emptyStateText, "emptyStateText");
        AbstractC22676k.m65750j(emptyStateTextStyle, "emptyStateTextStyle");
        AbstractC22676k.m65750j(threadIconDrawable, "threadIconDrawable");
        AbstractC22676k.m65750j(threadTitleStyle, "threadTitleStyle");
        AbstractC22676k.m65750j(threadReplyToStyle, "threadReplyToStyle");
        AbstractC22676k.m65750j(latestReplyStyle, "latestReplyStyle");
        AbstractC22676k.m65750j(unreadCountBadgeTextStyle, "unreadCountBadgeTextStyle");
        AbstractC22676k.m65750j(unreadCountBadgeBackground, "unreadCountBadgeBackground");
        AbstractC22676k.m65750j(bannerTextStyle, "bannerTextStyle");
        AbstractC22676k.m65750j(bannerIcon, "bannerIcon");
        AbstractC22676k.m65750j(bannerBackground, "bannerBackground");
        return new ThreadListViewStyle(backgroundColor, emptyStateDrawable, emptyStateText, emptyStateTextStyle, threadIconDrawable, threadTitleStyle, threadReplyToStyle, latestReplyStyle, unreadCountBadgeTextStyle, unreadCountBadgeBackground, bannerTextStyle, bannerIcon, bannerBackground, bannerPaddingLeft, bannerPaddingTop, bannerPaddingRight, bannerPaddingBottom, bannerMarginLeft, bannerMarginTop, bannerMarginRight, bannerMarginBottom);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreadListViewStyle)) {
            return false;
        }
        ThreadListViewStyle threadListViewStyle = (ThreadListViewStyle) other;
        return this.backgroundColor == threadListViewStyle.backgroundColor && AbstractC22676k.m65745e(this.emptyStateDrawable, threadListViewStyle.emptyStateDrawable) && AbstractC22676k.m65745e(this.emptyStateText, threadListViewStyle.emptyStateText) && AbstractC22676k.m65745e(this.emptyStateTextStyle, threadListViewStyle.emptyStateTextStyle) && AbstractC22676k.m65745e(this.threadIconDrawable, threadListViewStyle.threadIconDrawable) && AbstractC22676k.m65745e(this.threadTitleStyle, threadListViewStyle.threadTitleStyle) && AbstractC22676k.m65745e(this.threadReplyToStyle, threadListViewStyle.threadReplyToStyle) && AbstractC22676k.m65745e(this.latestReplyStyle, threadListViewStyle.latestReplyStyle) && AbstractC22676k.m65745e(this.unreadCountBadgeTextStyle, threadListViewStyle.unreadCountBadgeTextStyle) && AbstractC22676k.m65745e(this.unreadCountBadgeBackground, threadListViewStyle.unreadCountBadgeBackground) && AbstractC22676k.m65745e(this.bannerTextStyle, threadListViewStyle.bannerTextStyle) && AbstractC22676k.m65745e(this.bannerIcon, threadListViewStyle.bannerIcon) && AbstractC22676k.m65745e(this.bannerBackground, threadListViewStyle.bannerBackground) && this.bannerPaddingLeft == threadListViewStyle.bannerPaddingLeft && this.bannerPaddingTop == threadListViewStyle.bannerPaddingTop && this.bannerPaddingRight == threadListViewStyle.bannerPaddingRight && this.bannerPaddingBottom == threadListViewStyle.bannerPaddingBottom && this.bannerMarginLeft == threadListViewStyle.bannerMarginLeft && this.bannerMarginTop == threadListViewStyle.bannerMarginTop && this.bannerMarginRight == threadListViewStyle.bannerMarginRight && this.bannerMarginBottom == threadListViewStyle.bannerMarginBottom;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Drawable getBannerBackground() {
        return this.bannerBackground;
    }

    public final Drawable getBannerIcon() {
        return this.bannerIcon;
    }

    public final int getBannerMarginBottom() {
        return this.bannerMarginBottom;
    }

    public final int getBannerMarginLeft() {
        return this.bannerMarginLeft;
    }

    public final int getBannerMarginRight() {
        return this.bannerMarginRight;
    }

    public final int getBannerMarginTop() {
        return this.bannerMarginTop;
    }

    public final int getBannerPaddingBottom() {
        return this.bannerPaddingBottom;
    }

    public final int getBannerPaddingLeft() {
        return this.bannerPaddingLeft;
    }

    public final int getBannerPaddingRight() {
        return this.bannerPaddingRight;
    }

    public final int getBannerPaddingTop() {
        return this.bannerPaddingTop;
    }

    public final TextStyle getBannerTextStyle() {
        return this.bannerTextStyle;
    }

    public final Drawable getEmptyStateDrawable() {
        return this.emptyStateDrawable;
    }

    public final String getEmptyStateText() {
        return this.emptyStateText;
    }

    public final TextStyle getEmptyStateTextStyle() {
        return this.emptyStateTextStyle;
    }

    public final MessagePreviewStyle getLatestReplyStyle() {
        return this.latestReplyStyle;
    }

    public final Drawable getThreadIconDrawable() {
        return this.threadIconDrawable;
    }

    public final TextStyle getThreadReplyToStyle() {
        return this.threadReplyToStyle;
    }

    public final TextStyle getThreadTitleStyle() {
        return this.threadTitleStyle;
    }

    public final Drawable getUnreadCountBadgeBackground() {
        return this.unreadCountBadgeBackground;
    }

    public final TextStyle getUnreadCountBadgeTextStyle() {
        return this.unreadCountBadgeTextStyle;
    }

    public final int hashCode() {
        return Integer.hashCode(this.bannerMarginBottom) + AbstractC11266d.m30448b(this.bannerMarginRight, AbstractC11266d.m30448b(this.bannerMarginTop, AbstractC11266d.m30448b(this.bannerMarginLeft, AbstractC11266d.m30448b(this.bannerPaddingBottom, AbstractC11266d.m30448b(this.bannerPaddingRight, AbstractC11266d.m30448b(this.bannerPaddingTop, AbstractC11266d.m30448b(this.bannerPaddingLeft, AbstractC26725a.m79497a(this.bannerBackground, AbstractC26725a.m79497a(this.bannerIcon, AbstractC26725a.m79499c(this.bannerTextStyle, AbstractC26725a.m79497a(this.unreadCountBadgeBackground, AbstractC26725a.m79499c(this.unreadCountBadgeTextStyle, (this.latestReplyStyle.hashCode() + AbstractC26725a.m79499c(this.threadReplyToStyle, AbstractC26725a.m79499c(this.threadTitleStyle, AbstractC26725a.m79497a(this.threadIconDrawable, AbstractC26725a.m79499c(this.emptyStateTextStyle, AbstractC11266d.m30450d(AbstractC26725a.m79497a(this.emptyStateDrawable, Integer.hashCode(this.backgroundColor) * 31, 31), 31, this.emptyStateText), 31), 31), 31), 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        int i13 = this.backgroundColor;
        Drawable drawable = this.emptyStateDrawable;
        String str = this.emptyStateText;
        TextStyle textStyle = this.emptyStateTextStyle;
        Drawable drawable2 = this.threadIconDrawable;
        TextStyle textStyle2 = this.threadTitleStyle;
        TextStyle textStyle3 = this.threadReplyToStyle;
        MessagePreviewStyle messagePreviewStyle = this.latestReplyStyle;
        TextStyle textStyle4 = this.unreadCountBadgeTextStyle;
        Drawable drawable3 = this.unreadCountBadgeBackground;
        TextStyle textStyle5 = this.bannerTextStyle;
        Drawable drawable4 = this.bannerIcon;
        Drawable drawable5 = this.bannerBackground;
        int i14 = this.bannerPaddingLeft;
        int i15 = this.bannerPaddingTop;
        int i16 = this.bannerPaddingRight;
        int i17 = this.bannerPaddingBottom;
        int i18 = this.bannerMarginLeft;
        int i19 = this.bannerMarginTop;
        int i24 = this.bannerMarginRight;
        int i25 = this.bannerMarginBottom;
        StringBuilder sb4 = new StringBuilder("ThreadListViewStyle(backgroundColor=");
        sb4.append(i13);
        sb4.append(", emptyStateDrawable=");
        sb4.append(drawable);
        sb4.append(", emptyStateText=");
        sb4.append(str);
        sb4.append(", emptyStateTextStyle=");
        sb4.append(textStyle);
        sb4.append(", threadIconDrawable=");
        sb4.append(drawable2);
        sb4.append(", threadTitleStyle=");
        sb4.append(textStyle2);
        sb4.append(", threadReplyToStyle=");
        sb4.append(textStyle3);
        sb4.append(", latestReplyStyle=");
        sb4.append(messagePreviewStyle);
        sb4.append(", unreadCountBadgeTextStyle=");
        sb4.append(textStyle4);
        sb4.append(", unreadCountBadgeBackground=");
        sb4.append(drawable3);
        sb4.append(", bannerTextStyle=");
        sb4.append(textStyle5);
        sb4.append(", bannerIcon=");
        sb4.append(drawable4);
        sb4.append(", bannerBackground=");
        sb4.append(drawable5);
        sb4.append(", bannerPaddingLeft=");
        sb4.append(i14);
        sb4.append(", bannerPaddingTop=");
        AbstractC30802r.m94773v(sb4, i15, ", bannerPaddingRight=", i16, ", bannerPaddingBottom=");
        AbstractC30802r.m94773v(sb4, i17, ", bannerMarginLeft=", i18, ", bannerMarginTop=");
        AbstractC30802r.m94773v(sb4, i19, ", bannerMarginRight=", i24, ", bannerMarginBottom=");
        return AbstractC18489d0.m53371l(sb4, i25, ")");
    }
}
