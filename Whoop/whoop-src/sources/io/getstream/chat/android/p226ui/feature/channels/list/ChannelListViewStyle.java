package io.getstream.chat.android.p226ui.feature.channels.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.profileinstaller.ProfileVerifier;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.TypedArrayKt;
import live.hms.video.utils.AndroidSDKConstants;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p479s4.AbstractC32122c;
import p513u4.AbstractC34523k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0007\n\u0002\bM\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 x2\u00020\u0001:\u0001xB¥\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\b\b\u0001\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001a\u001a\u00020\n\u0012\b\b\u0001\u0010\u001b\u001a\u00020\n\u0012\b\b\u0001\u0010\u001c\u001a\u00020\n\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\b\b\u0001\u0010 \u001a\u00020\n\u0012\b\b\u0001\u0010!\u001a\u00020\n\u0012\b\b\u0001\u0010\"\u001a\u00020\n\u0012\b\b\u0001\u0010#\u001a\u00020\n\u0012\b\b\u0001\u0010$\u001a\u00020\n\u0012\b\b\u0001\u0010%\u001a\u00020&¢\u0006\u0004\b'\u0010(J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0006HÆ\u0003J\t\u0010S\u001a\u00020\u0006HÆ\u0003J\t\u0010T\u001a\u00020\u0006HÆ\u0003J\t\u0010U\u001a\u00020\nHÆ\u0003J\t\u0010V\u001a\u00020\nHÆ\u0003J\t\u0010W\u001a\u00020\rHÆ\u0003J\t\u0010X\u001a\u00020\rHÆ\u0003J\t\u0010Y\u001a\u00020\rHÆ\u0003J\t\u0010Z\u001a\u00020\rHÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\nHÆ\u0003J\t\u0010`\u001a\u00020\rHÆ\u0003J\t\u0010a\u001a\u00020\nHÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\nHÆ\u0003J\t\u0010e\u001a\u00020\nHÆ\u0003J\t\u0010f\u001a\u00020\nHÆ\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010EJ\t\u0010h\u001a\u00020\u0006HÆ\u0003J\t\u0010i\u001a\u00020\u0006HÆ\u0003J\t\u0010j\u001a\u00020\nHÆ\u0003J\t\u0010k\u001a\u00020\nHÆ\u0003J\t\u0010l\u001a\u00020\nHÆ\u0003J\t\u0010m\u001a\u00020\nHÆ\u0003J\t\u0010n\u001a\u00020\nHÆ\u0003J\t\u0010o\u001a\u00020&HÆ\u0003JÐ\u0002\u0010p\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0003\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0003\u0010\u001a\u001a\u00020\n2\b\b\u0003\u0010\u001b\u001a\u00020\n2\b\b\u0003\u0010\u001c\u001a\u00020\n2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0003\u0010 \u001a\u00020\n2\b\b\u0003\u0010!\u001a\u00020\n2\b\b\u0003\u0010\"\u001a\u00020\n2\b\b\u0003\u0010#\u001a\u00020\n2\b\b\u0003\u0010$\u001a\u00020\n2\b\b\u0003\u0010%\u001a\u00020&HÆ\u0001¢\u0006\u0002\u0010qJ\u0013\u0010r\u001a\u00020\u00062\b\u0010s\u001a\u0004\u0018\u00010tHÖ\u0003J\t\u0010u\u001a\u00020\nHÖ\u0001J\t\u0010v\u001a\u00020wHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b7\u00104R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b<\u00101R\u0011\u0010\u0016\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b=\u00104R\u0011\u0010\u0017\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b>\u00101R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010*R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010*R\u0011\u0010\u001a\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bA\u00101R\u0011\u0010\u001b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bB\u00101R\u0011\u0010\u001c\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bC\u00101R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010F\u001a\u0004\bD\u0010ER\u0011\u0010\u001e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bG\u0010-R\u0011\u0010\u001f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bH\u0010-R\u0011\u0010 \u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bI\u00101R\u0011\u0010!\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bJ\u00101R\u0011\u0010\"\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bK\u00101R\u0011\u0010#\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bL\u00101R\u0011\u0010$\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bM\u00101R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\bN\u0010O¨\u0006y"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "optionsIcon", "Landroid/graphics/drawable/Drawable;", "deleteIcon", "optionsEnabled", "", "deleteEnabled", "swipeEnabled", "backgroundColor", "", "backgroundLayoutColor", "channelTitleText", "Lio/getstream/chat/android/ui/font/TextStyle;", "draftMessageLabel", "lastMessageText", "lastMessageDateText", "indicatorSentIcon", "indicatorDeliveredIcon", "indicatorReadIcon", "indicatorPendingSyncIcon", "foregroundLayoutColor", "unreadMessageCounterText", "unreadMessageCounterBackgroundColor", "mutedChannelIcon", "itemSeparator", "loadingView", "emptyStateView", "loadingMoreView", "edgeEffectColor", "showChannelDeliveryStatusIndicator", "readCountEnabled", "itemHeight", "itemMarginStart", "itemMarginEnd", "itemTitleMarginStart", "itemVerticalSpacerHeight", "itemVerticalSpacerPosition", "", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ZZZIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ILio/getstream/chat/android/ui/font/TextStyle;ILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIILjava/lang/Integer;ZZIIIIIF)V", "getOptionsIcon", "()Landroid/graphics/drawable/Drawable;", "getDeleteIcon", "getOptionsEnabled", "()Z", "getDeleteEnabled", "getSwipeEnabled", "getBackgroundColor", "()I", "getBackgroundLayoutColor", "getChannelTitleText", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getDraftMessageLabel", "getLastMessageText", "getLastMessageDateText", "getIndicatorSentIcon", "getIndicatorDeliveredIcon", "getIndicatorReadIcon", "getIndicatorPendingSyncIcon", "getForegroundLayoutColor", "getUnreadMessageCounterText", "getUnreadMessageCounterBackgroundColor", "getMutedChannelIcon", "getItemSeparator", "getLoadingView", "getEmptyStateView", "getLoadingMoreView", "getEdgeEffectColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowChannelDeliveryStatusIndicator", "getReadCountEnabled", "getItemHeight", "getItemMarginStart", "getItemMarginEnd", "getItemTitleMarginStart", "getItemVerticalSpacerHeight", "getItemVerticalSpacerPosition", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "copy", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ZZZIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ILio/getstream/chat/android/ui/font/TextStyle;ILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIILjava/lang/Integer;ZZIIIIIF)Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;", "equals", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelListViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final int backgroundColor;
    private final int backgroundLayoutColor;
    private final TextStyle channelTitleText;
    private final boolean deleteEnabled;
    private final Drawable deleteIcon;
    private final TextStyle draftMessageLabel;
    private final Integer edgeEffectColor;
    private final int emptyStateView;
    private final int foregroundLayoutColor;
    private final Drawable indicatorDeliveredIcon;
    private final Drawable indicatorPendingSyncIcon;
    private final Drawable indicatorReadIcon;
    private final Drawable indicatorSentIcon;
    private final int itemHeight;
    private final int itemMarginEnd;
    private final int itemMarginStart;
    private final Drawable itemSeparator;
    private final int itemTitleMarginStart;
    private final int itemVerticalSpacerHeight;
    private final float itemVerticalSpacerPosition;
    private final TextStyle lastMessageDateText;
    private final TextStyle lastMessageText;
    private final int loadingMoreView;
    private final int loadingView;
    private final Drawable mutedChannelIcon;
    private final boolean optionsEnabled;
    private final Drawable optionsIcon;
    private final boolean readCountEnabled;
    private final boolean showChannelDeliveryStatusIndicator;
    private final boolean swipeEnabled;
    private final int unreadMessageCounterBackgroundColor;
    private final TextStyle unreadMessageCounterText;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\u0002¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ChannelListViewStyle invoke(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.ChannelListView, C19469R.attr.streamUiChannelListViewStyle, C19469R.style.StreamUi_ChannelListView);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.ChannelListView_streamUiChannelOptionsIcon);
            if (drawable == null) {
                drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_more);
                AbstractC22676k.m65747g(drawable);
            }
            Drawable drawable2 = drawable;
            Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.ChannelListView_streamUiChannelDeleteIcon);
            if (drawable3 == null) {
                drawable3 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_delete);
                AbstractC22676k.m65747g(drawable3);
            }
            Drawable drawable4 = drawable3;
            boolean z4 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.ChannelListView_streamUiChannelOptionsEnabled, false);
            boolean z13 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.ChannelListView_streamUiChannelDeleteEnabled, true);
            boolean z14 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.ChannelListView_streamUiSwipeEnabled, true);
            boolean z15 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.ChannelListView_streamUiReadCountEnabled, true);
            int color = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.ChannelListView_streamUiChannelListBackgroundColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            int color2 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.ChannelListView_streamUiBackgroundLayoutColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white_smoke));
            TextStyle.Builder builder = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder.size(C19469R.styleable.ChannelListView_streamUiChannelTitleTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_channel_item_title));
            builder.color(C19469R.styleable.ChannelListView_streamUiChannelTitleTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder.font(C19469R.styleable.ChannelListView_streamUiChannelTitleFontAssets, C19469R.styleable.ChannelListView_streamUiChannelTitleTextFont);
            builder.style(C19469R.styleable.ChannelListView_streamUiChannelTitleTextStyle, 1);
            TextStyle textStyleBuild = builder.build();
            TextStyle.Builder builder2 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder2.size(C19469R.styleable.ChannelListView_streamUiLastMessageTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_channel_item_message));
            builder2.color(C19469R.styleable.ChannelListView_streamUiLastMessageTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder2.font(C19469R.styleable.ChannelListView_streamUiLastMessageFontAssets, C19469R.styleable.ChannelListView_streamUiLastMessageTextFont);
            builder2.style(C19469R.styleable.ChannelListView_streamUiLastMessageTextStyle, 0);
            TextStyle textStyleBuild2 = builder2.build();
            TextStyle.Builder builder3 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder3.size(C19469R.styleable.ChannelListView_streamUiLastMessageTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_channel_item_message));
            builder3.color(C19469R.styleable.ChannelListView_streamUiDraftMessageLabelTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_accent_blue));
            builder3.font(C19469R.styleable.ChannelListView_streamUiLastMessageFontAssets, C19469R.styleable.ChannelListView_streamUiLastMessageTextFont);
            builder3.style(C19469R.styleable.ChannelListView_streamUiLastMessageTextStyle, 0);
            TextStyle textStyleBuild3 = builder3.build();
            TextStyle.Builder builder4 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder4.size(C19469R.styleable.ChannelListView_streamUiLastMessageDateTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_channel_item_message_date));
            builder4.color(C19469R.styleable.ChannelListView_streamUiLastMessageDateTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder4.font(C19469R.styleable.ChannelListView_streamUiLastMessageDateFontAssets, C19469R.styleable.ChannelListView_streamUiLastMessageDateTextFont);
            builder4.style(C19469R.styleable.ChannelListView_streamUiLastMessageDateTextStyle, 0);
            TextStyle textStyleBuild4 = builder4.build();
            boolean z16 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.ChannelListView_streamUiShowChannelDeliveryStatusIndicator, true);
            Drawable drawable5 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.ChannelListView_streamUiIndicatorSentIcon);
            if (drawable5 == null) {
                drawable5 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_check_single);
                AbstractC22676k.m65747g(drawable5);
            }
            Drawable drawable6 = drawable5;
            Drawable drawable7 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.ChannelListView_streamUiIndicatorDeliveredIcon);
            if (drawable7 == null) {
                drawable7 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_check_double_grey);
                AbstractC22676k.m65747g(drawable7);
            }
            Drawable drawable8 = drawable7;
            Drawable drawable9 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.ChannelListView_streamUiIndicatorReadIcon);
            if (drawable9 == null) {
                drawable9 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_check_double);
                AbstractC22676k.m65747g(drawable9);
            }
            Drawable drawable10 = drawable9;
            Drawable drawableCompat = TypedArrayKt.getDrawableCompat(typedArrayObtainStyledAttributes, context, C19469R.styleable.ChannelListView_streamUiIndicatorPendingSyncIcon);
            if (drawableCompat == null) {
                drawableCompat = AbstractC30060g.m92133x(context, C19469R.drawable.stream_ui_ic_clock);
                AbstractC22676k.m65747g(drawableCompat);
            }
            Drawable drawable11 = drawableCompat;
            int color3 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.ChannelListView_streamUiForegroundLayoutColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white_snow));
            TextStyle.Builder builder5 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder5.size(C19469R.styleable.ChannelListView_streamUiUnreadMessageCounterTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_small));
            builder5.color(C19469R.styleable.ChannelListView_streamUiUnreadMessageCounterTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_literal_white));
            builder5.font(C19469R.styleable.ChannelListView_streamUiUnreadMessageCounterFontAssets, C19469R.styleable.ChannelListView_streamUiUnreadMessageCounterTextFont);
            builder5.style(C19469R.styleable.ChannelListView_streamUiUnreadMessageCounterTextStyle, 0);
            TextStyle textStyleBuild5 = builder5.build();
            int color4 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.ChannelListView_streamUiUnreadMessageCounterBackgroundColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_accent_red));
            Drawable drawable12 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.ChannelListView_streamUiMutedChannelIcon);
            if (drawable12 == null) {
                drawable12 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_mute_black);
                AbstractC22676k.m65747g(drawable12);
            }
            Drawable drawable13 = drawable12;
            Drawable drawable14 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.ChannelListView_streamUiChannelsItemSeparatorDrawable);
            if (drawable14 == null) {
                drawable14 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_divider);
                AbstractC22676k.m65747g(drawable14);
            }
            return TransformStyle.getChannelListStyleTransformer().transform(new ChannelListViewStyle(drawable2, drawable4, z4, z13, z14, color, color2, textStyleBuild, textStyleBuild3, textStyleBuild2, textStyleBuild4, drawable6, drawable8, drawable10, drawable11, color3, textStyleBuild5, color4, drawable13, drawable14, typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.ChannelListView_streamUiLoadingView, C19469R.layout.stream_ui_default_loading_view), typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.ChannelListView_streamUiEmptyStateView, C19469R.layout.stream_ui_channel_list_empty_state_view), typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.ChannelListView_streamUiLoadingMoreView, C19469R.layout.stream_ui_channel_list_loading_more_view), TypedArrayKt.getColorOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.ChannelListView_streamUiEdgeEffectColor), z16, z15, typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.ChannelListView_streamUiChannelHeight, ContextKt.getDimension(context, C19469R.dimen.stream_ui_channel_list_item_height)), typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.ChannelListView_streamUiChannelMarginStart, ContextKt.getDimension(context, C19469R.dimen.stream_ui_channel_list_item_margin_start)), typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.ChannelListView_streamUiChannelMarginEnd, ContextKt.getDimension(context, C19469R.dimen.stream_ui_channel_list_item_margin_end)), typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.ChannelListView_streamUiChannelTitleMarginStart, ContextKt.getDimension(context, C19469R.dimen.stream_ui_channel_list_item_title_margin_start)), typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.ChannelListView_streamUiChannelVerticalSpacerHeight, ContextKt.getDimension(context, C19469R.dimen.stream_ui_channel_list_item_vertical_spacer_height)), typedArrayObtainStyledAttributes.getFloat(C19469R.styleable.ChannelListView_streamUiChannelVerticalSpacerPosition, AbstractC34523k.m109097a(context.getResources(), C19469R.dimen.stream_ui_channel_list_item_vertical_spacer_position))));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ChannelListViewStyle(Drawable optionsIcon, Drawable deleteIcon, boolean z4, boolean z13, boolean z14, int i13, int i14, TextStyle channelTitleText, TextStyle draftMessageLabel, TextStyle lastMessageText, TextStyle lastMessageDateText, Drawable indicatorSentIcon, Drawable indicatorDeliveredIcon, Drawable indicatorReadIcon, Drawable indicatorPendingSyncIcon, int i15, TextStyle unreadMessageCounterText, int i16, Drawable mutedChannelIcon, Drawable itemSeparator, int i17, int i18, int i19, Integer num, boolean z15, boolean z16, int i24, int i25, int i26, int i27, int i28, float f13) {
        AbstractC22676k.m65750j(optionsIcon, "optionsIcon");
        AbstractC22676k.m65750j(deleteIcon, "deleteIcon");
        AbstractC22676k.m65750j(channelTitleText, "channelTitleText");
        AbstractC22676k.m65750j(draftMessageLabel, "draftMessageLabel");
        AbstractC22676k.m65750j(lastMessageText, "lastMessageText");
        AbstractC22676k.m65750j(lastMessageDateText, "lastMessageDateText");
        AbstractC22676k.m65750j(indicatorSentIcon, "indicatorSentIcon");
        AbstractC22676k.m65750j(indicatorDeliveredIcon, "indicatorDeliveredIcon");
        AbstractC22676k.m65750j(indicatorReadIcon, "indicatorReadIcon");
        AbstractC22676k.m65750j(indicatorPendingSyncIcon, "indicatorPendingSyncIcon");
        AbstractC22676k.m65750j(unreadMessageCounterText, "unreadMessageCounterText");
        AbstractC22676k.m65750j(mutedChannelIcon, "mutedChannelIcon");
        AbstractC22676k.m65750j(itemSeparator, "itemSeparator");
        this.optionsIcon = optionsIcon;
        this.deleteIcon = deleteIcon;
        this.optionsEnabled = z4;
        this.deleteEnabled = z13;
        this.swipeEnabled = z14;
        this.backgroundColor = i13;
        this.backgroundLayoutColor = i14;
        this.channelTitleText = channelTitleText;
        this.draftMessageLabel = draftMessageLabel;
        this.lastMessageText = lastMessageText;
        this.lastMessageDateText = lastMessageDateText;
        this.indicatorSentIcon = indicatorSentIcon;
        this.indicatorDeliveredIcon = indicatorDeliveredIcon;
        this.indicatorReadIcon = indicatorReadIcon;
        this.indicatorPendingSyncIcon = indicatorPendingSyncIcon;
        this.foregroundLayoutColor = i15;
        this.unreadMessageCounterText = unreadMessageCounterText;
        this.unreadMessageCounterBackgroundColor = i16;
        this.mutedChannelIcon = mutedChannelIcon;
        this.itemSeparator = itemSeparator;
        this.loadingView = i17;
        this.emptyStateView = i18;
        this.loadingMoreView = i19;
        this.edgeEffectColor = num;
        this.showChannelDeliveryStatusIndicator = z15;
        this.readCountEnabled = z16;
        this.itemHeight = i24;
        this.itemMarginStart = i25;
        this.itemMarginEnd = i26;
        this.itemTitleMarginStart = i27;
        this.itemVerticalSpacerHeight = i28;
        this.itemVerticalSpacerPosition = f13;
    }

    public static /* synthetic */ ChannelListViewStyle copy$default(ChannelListViewStyle channelListViewStyle, Drawable drawable, Drawable drawable2, boolean z4, boolean z13, boolean z14, int i13, int i14, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6, int i15, TextStyle textStyle5, int i16, Drawable drawable7, Drawable drawable8, int i17, int i18, int i19, Integer num, boolean z15, boolean z16, int i24, int i25, int i26, int i27, int i28, float f13, int i29, Object obj) {
        float f14;
        int i34;
        Drawable drawable9 = (i29 & 1) != 0 ? channelListViewStyle.optionsIcon : drawable;
        Drawable drawable10 = (i29 & 2) != 0 ? channelListViewStyle.deleteIcon : drawable2;
        boolean z17 = (i29 & 4) != 0 ? channelListViewStyle.optionsEnabled : z4;
        boolean z18 = (i29 & 8) != 0 ? channelListViewStyle.deleteEnabled : z13;
        boolean z19 = (i29 & 16) != 0 ? channelListViewStyle.swipeEnabled : z14;
        int i35 = (i29 & 32) != 0 ? channelListViewStyle.backgroundColor : i13;
        int i36 = (i29 & 64) != 0 ? channelListViewStyle.backgroundLayoutColor : i14;
        TextStyle textStyle6 = (i29 & 128) != 0 ? channelListViewStyle.channelTitleText : textStyle;
        TextStyle textStyle7 = (i29 & 256) != 0 ? channelListViewStyle.draftMessageLabel : textStyle2;
        TextStyle textStyle8 = (i29 & 512) != 0 ? channelListViewStyle.lastMessageText : textStyle3;
        TextStyle textStyle9 = (i29 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? channelListViewStyle.lastMessageDateText : textStyle4;
        Drawable drawable11 = (i29 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? channelListViewStyle.indicatorSentIcon : drawable3;
        Drawable drawable12 = (i29 & 4096) != 0 ? channelListViewStyle.indicatorDeliveredIcon : drawable4;
        Drawable drawable13 = (i29 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? channelListViewStyle.indicatorReadIcon : drawable5;
        Drawable drawable14 = drawable9;
        Drawable drawable15 = (i29 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? channelListViewStyle.indicatorPendingSyncIcon : drawable6;
        int i37 = (i29 & 32768) != 0 ? channelListViewStyle.foregroundLayoutColor : i15;
        TextStyle textStyle10 = (i29 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? channelListViewStyle.unreadMessageCounterText : textStyle5;
        int i38 = (i29 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? channelListViewStyle.unreadMessageCounterBackgroundColor : i16;
        Drawable drawable16 = (i29 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? channelListViewStyle.mutedChannelIcon : drawable7;
        Drawable drawable17 = (i29 & 524288) != 0 ? channelListViewStyle.itemSeparator : drawable8;
        int i39 = (i29 & 1048576) != 0 ? channelListViewStyle.loadingView : i17;
        int i44 = (i29 & 2097152) != 0 ? channelListViewStyle.emptyStateView : i18;
        int i45 = (i29 & 4194304) != 0 ? channelListViewStyle.loadingMoreView : i19;
        Integer num2 = (i29 & 8388608) != 0 ? channelListViewStyle.edgeEffectColor : num;
        boolean z24 = (i29 & 16777216) != 0 ? channelListViewStyle.showChannelDeliveryStatusIndicator : z15;
        boolean z25 = (i29 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? channelListViewStyle.readCountEnabled : z16;
        int i46 = (i29 & 67108864) != 0 ? channelListViewStyle.itemHeight : i24;
        int i47 = (i29 & 134217728) != 0 ? channelListViewStyle.itemMarginStart : i25;
        int i48 = (i29 & 268435456) != 0 ? channelListViewStyle.itemMarginEnd : i26;
        int i49 = (i29 & 536870912) != 0 ? channelListViewStyle.itemTitleMarginStart : i27;
        int i54 = (i29 & 1073741824) != 0 ? channelListViewStyle.itemVerticalSpacerHeight : i28;
        if ((i29 & Integer.MIN_VALUE) != 0) {
            i34 = i54;
            f14 = channelListViewStyle.itemVerticalSpacerPosition;
        } else {
            f14 = f13;
            i34 = i54;
        }
        return channelListViewStyle.copy(drawable14, drawable10, z17, z18, z19, i35, i36, textStyle6, textStyle7, textStyle8, textStyle9, drawable11, drawable12, drawable13, drawable15, i37, textStyle10, i38, drawable16, drawable17, i39, i44, i45, num2, z24, z25, i46, i47, i48, i49, i34, f14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Drawable getOptionsIcon() {
        return this.optionsIcon;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final TextStyle getLastMessageText() {
        return this.lastMessageText;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final TextStyle getLastMessageDateText() {
        return this.lastMessageDateText;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Drawable getIndicatorSentIcon() {
        return this.indicatorSentIcon;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Drawable getIndicatorDeliveredIcon() {
        return this.indicatorDeliveredIcon;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Drawable getIndicatorReadIcon() {
        return this.indicatorReadIcon;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Drawable getIndicatorPendingSyncIcon() {
        return this.indicatorPendingSyncIcon;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getForegroundLayoutColor() {
        return this.foregroundLayoutColor;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final TextStyle getUnreadMessageCounterText() {
        return this.unreadMessageCounterText;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getUnreadMessageCounterBackgroundColor() {
        return this.unreadMessageCounterBackgroundColor;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Drawable getMutedChannelIcon() {
        return this.mutedChannelIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Drawable getDeleteIcon() {
        return this.deleteIcon;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Drawable getItemSeparator() {
        return this.itemSeparator;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getLoadingView() {
        return this.loadingView;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getEmptyStateView() {
        return this.emptyStateView;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getLoadingMoreView() {
        return this.loadingMoreView;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Integer getEdgeEffectColor() {
        return this.edgeEffectColor;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getShowChannelDeliveryStatusIndicator() {
        return this.showChannelDeliveryStatusIndicator;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getReadCountEnabled() {
        return this.readCountEnabled;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final int getItemHeight() {
        return this.itemHeight;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final int getItemMarginStart() {
        return this.itemMarginStart;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final int getItemMarginEnd() {
        return this.itemMarginEnd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getOptionsEnabled() {
        return this.optionsEnabled;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final int getItemTitleMarginStart() {
        return this.itemTitleMarginStart;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final int getItemVerticalSpacerHeight() {
        return this.itemVerticalSpacerHeight;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final float getItemVerticalSpacerPosition() {
        return this.itemVerticalSpacerPosition;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDeleteEnabled() {
        return this.deleteEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSwipeEnabled() {
        return this.swipeEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getBackgroundLayoutColor() {
        return this.backgroundLayoutColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TextStyle getChannelTitleText() {
        return this.channelTitleText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TextStyle getDraftMessageLabel() {
        return this.draftMessageLabel;
    }

    public final ChannelListViewStyle copy(Drawable optionsIcon, Drawable deleteIcon, boolean optionsEnabled, boolean deleteEnabled, boolean swipeEnabled, int backgroundColor, int backgroundLayoutColor, TextStyle channelTitleText, TextStyle draftMessageLabel, TextStyle lastMessageText, TextStyle lastMessageDateText, Drawable indicatorSentIcon, Drawable indicatorDeliveredIcon, Drawable indicatorReadIcon, Drawable indicatorPendingSyncIcon, int foregroundLayoutColor, TextStyle unreadMessageCounterText, int unreadMessageCounterBackgroundColor, Drawable mutedChannelIcon, Drawable itemSeparator, int loadingView, int emptyStateView, int loadingMoreView, Integer edgeEffectColor, boolean showChannelDeliveryStatusIndicator, boolean readCountEnabled, int itemHeight, int itemMarginStart, int itemMarginEnd, int itemTitleMarginStart, int itemVerticalSpacerHeight, float itemVerticalSpacerPosition) {
        AbstractC22676k.m65750j(optionsIcon, "optionsIcon");
        AbstractC22676k.m65750j(deleteIcon, "deleteIcon");
        AbstractC22676k.m65750j(channelTitleText, "channelTitleText");
        AbstractC22676k.m65750j(draftMessageLabel, "draftMessageLabel");
        AbstractC22676k.m65750j(lastMessageText, "lastMessageText");
        AbstractC22676k.m65750j(lastMessageDateText, "lastMessageDateText");
        AbstractC22676k.m65750j(indicatorSentIcon, "indicatorSentIcon");
        AbstractC22676k.m65750j(indicatorDeliveredIcon, "indicatorDeliveredIcon");
        AbstractC22676k.m65750j(indicatorReadIcon, "indicatorReadIcon");
        AbstractC22676k.m65750j(indicatorPendingSyncIcon, "indicatorPendingSyncIcon");
        AbstractC22676k.m65750j(unreadMessageCounterText, "unreadMessageCounterText");
        AbstractC22676k.m65750j(mutedChannelIcon, "mutedChannelIcon");
        AbstractC22676k.m65750j(itemSeparator, "itemSeparator");
        return new ChannelListViewStyle(optionsIcon, deleteIcon, optionsEnabled, deleteEnabled, swipeEnabled, backgroundColor, backgroundLayoutColor, channelTitleText, draftMessageLabel, lastMessageText, lastMessageDateText, indicatorSentIcon, indicatorDeliveredIcon, indicatorReadIcon, indicatorPendingSyncIcon, foregroundLayoutColor, unreadMessageCounterText, unreadMessageCounterBackgroundColor, mutedChannelIcon, itemSeparator, loadingView, emptyStateView, loadingMoreView, edgeEffectColor, showChannelDeliveryStatusIndicator, readCountEnabled, itemHeight, itemMarginStart, itemMarginEnd, itemTitleMarginStart, itemVerticalSpacerHeight, itemVerticalSpacerPosition);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelListViewStyle)) {
            return false;
        }
        ChannelListViewStyle channelListViewStyle = (ChannelListViewStyle) other;
        return AbstractC22676k.m65745e(this.optionsIcon, channelListViewStyle.optionsIcon) && AbstractC22676k.m65745e(this.deleteIcon, channelListViewStyle.deleteIcon) && this.optionsEnabled == channelListViewStyle.optionsEnabled && this.deleteEnabled == channelListViewStyle.deleteEnabled && this.swipeEnabled == channelListViewStyle.swipeEnabled && this.backgroundColor == channelListViewStyle.backgroundColor && this.backgroundLayoutColor == channelListViewStyle.backgroundLayoutColor && AbstractC22676k.m65745e(this.channelTitleText, channelListViewStyle.channelTitleText) && AbstractC22676k.m65745e(this.draftMessageLabel, channelListViewStyle.draftMessageLabel) && AbstractC22676k.m65745e(this.lastMessageText, channelListViewStyle.lastMessageText) && AbstractC22676k.m65745e(this.lastMessageDateText, channelListViewStyle.lastMessageDateText) && AbstractC22676k.m65745e(this.indicatorSentIcon, channelListViewStyle.indicatorSentIcon) && AbstractC22676k.m65745e(this.indicatorDeliveredIcon, channelListViewStyle.indicatorDeliveredIcon) && AbstractC22676k.m65745e(this.indicatorReadIcon, channelListViewStyle.indicatorReadIcon) && AbstractC22676k.m65745e(this.indicatorPendingSyncIcon, channelListViewStyle.indicatorPendingSyncIcon) && this.foregroundLayoutColor == channelListViewStyle.foregroundLayoutColor && AbstractC22676k.m65745e(this.unreadMessageCounterText, channelListViewStyle.unreadMessageCounterText) && this.unreadMessageCounterBackgroundColor == channelListViewStyle.unreadMessageCounterBackgroundColor && AbstractC22676k.m65745e(this.mutedChannelIcon, channelListViewStyle.mutedChannelIcon) && AbstractC22676k.m65745e(this.itemSeparator, channelListViewStyle.itemSeparator) && this.loadingView == channelListViewStyle.loadingView && this.emptyStateView == channelListViewStyle.emptyStateView && this.loadingMoreView == channelListViewStyle.loadingMoreView && AbstractC22676k.m65745e(this.edgeEffectColor, channelListViewStyle.edgeEffectColor) && this.showChannelDeliveryStatusIndicator == channelListViewStyle.showChannelDeliveryStatusIndicator && this.readCountEnabled == channelListViewStyle.readCountEnabled && this.itemHeight == channelListViewStyle.itemHeight && this.itemMarginStart == channelListViewStyle.itemMarginStart && this.itemMarginEnd == channelListViewStyle.itemMarginEnd && this.itemTitleMarginStart == channelListViewStyle.itemTitleMarginStart && this.itemVerticalSpacerHeight == channelListViewStyle.itemVerticalSpacerHeight && Float.compare(this.itemVerticalSpacerPosition, channelListViewStyle.itemVerticalSpacerPosition) == 0;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBackgroundLayoutColor() {
        return this.backgroundLayoutColor;
    }

    public final TextStyle getChannelTitleText() {
        return this.channelTitleText;
    }

    public final boolean getDeleteEnabled() {
        return this.deleteEnabled;
    }

    public final Drawable getDeleteIcon() {
        return this.deleteIcon;
    }

    public final TextStyle getDraftMessageLabel() {
        return this.draftMessageLabel;
    }

    public final Integer getEdgeEffectColor() {
        return this.edgeEffectColor;
    }

    public final int getEmptyStateView() {
        return this.emptyStateView;
    }

    public final int getForegroundLayoutColor() {
        return this.foregroundLayoutColor;
    }

    public final Drawable getIndicatorDeliveredIcon() {
        return this.indicatorDeliveredIcon;
    }

    public final Drawable getIndicatorPendingSyncIcon() {
        return this.indicatorPendingSyncIcon;
    }

    public final Drawable getIndicatorReadIcon() {
        return this.indicatorReadIcon;
    }

    public final Drawable getIndicatorSentIcon() {
        return this.indicatorSentIcon;
    }

    public final int getItemHeight() {
        return this.itemHeight;
    }

    public final int getItemMarginEnd() {
        return this.itemMarginEnd;
    }

    public final int getItemMarginStart() {
        return this.itemMarginStart;
    }

    public final Drawable getItemSeparator() {
        return this.itemSeparator;
    }

    public final int getItemTitleMarginStart() {
        return this.itemTitleMarginStart;
    }

    public final int getItemVerticalSpacerHeight() {
        return this.itemVerticalSpacerHeight;
    }

    public final float getItemVerticalSpacerPosition() {
        return this.itemVerticalSpacerPosition;
    }

    public final TextStyle getLastMessageDateText() {
        return this.lastMessageDateText;
    }

    public final TextStyle getLastMessageText() {
        return this.lastMessageText;
    }

    public final int getLoadingMoreView() {
        return this.loadingMoreView;
    }

    public final int getLoadingView() {
        return this.loadingView;
    }

    public final Drawable getMutedChannelIcon() {
        return this.mutedChannelIcon;
    }

    public final boolean getOptionsEnabled() {
        return this.optionsEnabled;
    }

    public final Drawable getOptionsIcon() {
        return this.optionsIcon;
    }

    public final boolean getReadCountEnabled() {
        return this.readCountEnabled;
    }

    public final boolean getShowChannelDeliveryStatusIndicator() {
        return this.showChannelDeliveryStatusIndicator;
    }

    public final boolean getSwipeEnabled() {
        return this.swipeEnabled;
    }

    public final int getUnreadMessageCounterBackgroundColor() {
        return this.unreadMessageCounterBackgroundColor;
    }

    public final TextStyle getUnreadMessageCounterText() {
        return this.unreadMessageCounterText;
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.loadingMoreView, AbstractC11266d.m30448b(this.emptyStateView, AbstractC11266d.m30448b(this.loadingView, AbstractC26725a.m79497a(this.itemSeparator, AbstractC26725a.m79497a(this.mutedChannelIcon, AbstractC11266d.m30448b(this.unreadMessageCounterBackgroundColor, AbstractC26725a.m79499c(this.unreadMessageCounterText, AbstractC11266d.m30448b(this.foregroundLayoutColor, AbstractC26725a.m79497a(this.indicatorPendingSyncIcon, AbstractC26725a.m79497a(this.indicatorReadIcon, AbstractC26725a.m79497a(this.indicatorDeliveredIcon, AbstractC26725a.m79497a(this.indicatorSentIcon, AbstractC26725a.m79499c(this.lastMessageDateText, AbstractC26725a.m79499c(this.lastMessageText, AbstractC26725a.m79499c(this.draftMessageLabel, AbstractC26725a.m79499c(this.channelTitleText, AbstractC11266d.m30448b(this.backgroundLayoutColor, AbstractC11266d.m30448b(this.backgroundColor, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC26725a.m79497a(this.deleteIcon, this.optionsIcon.hashCode() * 31, 31), 31, this.optionsEnabled), 31, this.deleteEnabled), 31, this.swipeEnabled), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        Integer num = this.edgeEffectColor;
        return Float.hashCode(this.itemVerticalSpacerPosition) + AbstractC11266d.m30448b(this.itemVerticalSpacerHeight, AbstractC11266d.m30448b(this.itemTitleMarginStart, AbstractC11266d.m30448b(this.itemMarginEnd, AbstractC11266d.m30448b(this.itemMarginStart, AbstractC11266d.m30448b(this.itemHeight, AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30448b + (num == null ? 0 : num.hashCode())) * 31, 31, this.showChannelDeliveryStatusIndicator), 31, this.readCountEnabled), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        Drawable drawable = this.optionsIcon;
        Drawable drawable2 = this.deleteIcon;
        boolean z4 = this.optionsEnabled;
        boolean z13 = this.deleteEnabled;
        boolean z14 = this.swipeEnabled;
        int i13 = this.backgroundColor;
        int i14 = this.backgroundLayoutColor;
        TextStyle textStyle = this.channelTitleText;
        TextStyle textStyle2 = this.draftMessageLabel;
        TextStyle textStyle3 = this.lastMessageText;
        TextStyle textStyle4 = this.lastMessageDateText;
        Drawable drawable3 = this.indicatorSentIcon;
        Drawable drawable4 = this.indicatorDeliveredIcon;
        Drawable drawable5 = this.indicatorReadIcon;
        Drawable drawable6 = this.indicatorPendingSyncIcon;
        int i15 = this.foregroundLayoutColor;
        TextStyle textStyle5 = this.unreadMessageCounterText;
        int i16 = this.unreadMessageCounterBackgroundColor;
        Drawable drawable7 = this.mutedChannelIcon;
        Drawable drawable8 = this.itemSeparator;
        int i17 = this.loadingView;
        int i18 = this.emptyStateView;
        int i19 = this.loadingMoreView;
        Integer num = this.edgeEffectColor;
        boolean z15 = this.showChannelDeliveryStatusIndicator;
        boolean z16 = this.readCountEnabled;
        int i24 = this.itemHeight;
        int i25 = this.itemMarginStart;
        int i26 = this.itemMarginEnd;
        int i27 = this.itemTitleMarginStart;
        int i28 = this.itemVerticalSpacerHeight;
        float f13 = this.itemVerticalSpacerPosition;
        StringBuilder sb4 = new StringBuilder("ChannelListViewStyle(optionsIcon=");
        sb4.append(drawable);
        sb4.append(", deleteIcon=");
        sb4.append(drawable2);
        sb4.append(", optionsEnabled=");
        AbstractC38963t7.m124392v(sb4, z4, ", deleteEnabled=", z13, ", swipeEnabled=");
        AbstractC30802r.m94769r(i13, ", backgroundColor=", ", backgroundLayoutColor=", sb4, z14);
        sb4.append(i14);
        sb4.append(", channelTitleText=");
        sb4.append(textStyle);
        sb4.append(", draftMessageLabel=");
        sb4.append(textStyle2);
        sb4.append(", lastMessageText=");
        sb4.append(textStyle3);
        sb4.append(", lastMessageDateText=");
        sb4.append(textStyle4);
        sb4.append(", indicatorSentIcon=");
        sb4.append(drawable3);
        sb4.append(", indicatorDeliveredIcon=");
        sb4.append(drawable4);
        sb4.append(", indicatorReadIcon=");
        sb4.append(drawable5);
        sb4.append(", indicatorPendingSyncIcon=");
        sb4.append(drawable6);
        sb4.append(", foregroundLayoutColor=");
        sb4.append(i15);
        sb4.append(", unreadMessageCounterText=");
        sb4.append(textStyle5);
        sb4.append(", unreadMessageCounterBackgroundColor=");
        sb4.append(i16);
        sb4.append(", mutedChannelIcon=");
        sb4.append(drawable7);
        sb4.append(", itemSeparator=");
        sb4.append(drawable8);
        sb4.append(", loadingView=");
        AbstractC30802r.m94773v(sb4, i17, ", emptyStateView=", i18, ", loadingMoreView=");
        sb4.append(i19);
        sb4.append(", edgeEffectColor=");
        sb4.append(num);
        sb4.append(", showChannelDeliveryStatusIndicator=");
        AbstractC38963t7.m124392v(sb4, z15, ", readCountEnabled=", z16, ", itemHeight=");
        AbstractC30802r.m94773v(sb4, i24, ", itemMarginStart=", i25, ", itemMarginEnd=");
        AbstractC30802r.m94773v(sb4, i26, ", itemTitleMarginStart=", i27, ", itemVerticalSpacerHeight=");
        sb4.append(i28);
        sb4.append(", itemVerticalSpacerPosition=");
        sb4.append(f13);
        sb4.append(")");
        return sb4.toString();
    }
}
