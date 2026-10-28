package io.getstream.chat.android.p226ui.feature.messages.header;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 <2\u00020\u0001:\u0001<Bu\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\t\u00103\u001a\u00020\u0012HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003J\u008d\u0001\u00105\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u00106\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020\u0003HÖ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 ¨\u0006="}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "background", "", "titleTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "offlineTextStyle", "searchingForNetworkTextStyle", "onlineTextStyle", "showUserAvatar", "", "backButtonIcon", "Landroid/graphics/drawable/Drawable;", "showBackButton", "showBackButtonBadge", "backButtonBadgeBackgroundColor", "showSearchingForNetworkProgressBar", "searchingForNetworkProgressBarTint", "Landroid/content/res/ColorStateList;", "separatorBackgroundDrawable", "<init>", "(ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ZLandroid/graphics/drawable/Drawable;ZZIZLandroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;)V", "getBackground", "()I", "getTitleTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getOfflineTextStyle", "getSearchingForNetworkTextStyle", "getOnlineTextStyle", "getShowUserAvatar", "()Z", "getBackButtonIcon", "()Landroid/graphics/drawable/Drawable;", "getShowBackButton", "getShowBackButtonBadge", "getBackButtonBadgeBackgroundColor", "getShowSearchingForNetworkProgressBar", "getSearchingForNetworkProgressBarTint", "()Landroid/content/res/ColorStateList;", "getSeparatorBackgroundDrawable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelHeaderViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final int backButtonBadgeBackgroundColor;
    private final Drawable backButtonIcon;
    private final int background;
    private final TextStyle offlineTextStyle;
    private final TextStyle onlineTextStyle;
    private final ColorStateList searchingForNetworkProgressBarTint;
    private final TextStyle searchingForNetworkTextStyle;
    private final Drawable separatorBackgroundDrawable;
    private final boolean showBackButton;
    private final boolean showBackButtonBadge;
    private final boolean showSearchingForNetworkProgressBar;
    private final boolean showUserAvatar;
    private final TextStyle titleTextStyle;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\u0002¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ChannelHeaderViewStyle invoke(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.ChannelHeaderView, C19469R.attr.streamUiChannelHeaderStyle, C19469R.style.StreamUi_ChannelHeader);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int color = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderBackground, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            boolean z4 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderShowUserAvatar, true);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderBackButtonIcon);
            if (drawable == null) {
                drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_arrow_left);
                AbstractC22676k.m65747g(drawable);
            }
            Drawable drawable2 = drawable;
            TextStyle.Builder builder = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder.size(C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderTitleTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder.color(C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderTitleTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder.font(C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderTitleFontAssets, C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderTitleTextFont);
            builder.style(C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderTitleTextStyle, 1);
            TextStyle textStyleBuild = builder.build();
            boolean z13 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderShowBackButton, true);
            boolean z14 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderShowBackButtonBadge, false);
            int color2 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.f74144x430fccdd, AbstractC32122c.getColor(context, C19469R.color.stream_ui_accent_red));
            TextStyle.Builder builder2 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder2.size(C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderOfflineLabelTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_small));
            builder2.color(C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderOfflineLabelTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder2.font(C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderOfflineLabelFontAssets, C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderOfflineLabelTextFont);
            builder2.style(C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderOfflineLabelTextStyle, 0);
            TextStyle textStyleBuild2 = builder2.build();
            TextStyle.Builder builder3 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder3.size(C19469R.styleable.f74148x746c0d35, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_small));
            builder3.color(C19469R.styleable.f74145x178cce5c, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder3.font(C19469R.styleable.f74146x4b4c8959, C19469R.styleable.f74147x74663983);
            builder3.style(C19469R.styleable.f74149x191a96fd, 0);
            TextStyle textStyleBuild3 = builder3.build();
            boolean z15 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.f74152xb7640816, true);
            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(C19469R.styleable.f74150x2abf1554);
            if (colorStateList == null) {
                colorStateList = AbstractC32122c.getColorStateList(context, C19469R.color.stream_ui_accent_blue);
                AbstractC22676k.m65747g(colorStateList);
            }
            ColorStateList colorStateList2 = colorStateList;
            TextStyle.Builder builder4 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder4.size(C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderDefaultLabelTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_small));
            builder4.color(C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderDefaultLabelTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder4.font(C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderDefaultLabelFontAssets, C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderDefaultLabelTextFont);
            builder4.style(C19469R.styleable.ChannelHeaderView_streamUiChannelHeaderDefaultLabelTextStyle, 0);
            return TransformStyle.getChannelHeaderStyleTransformer().transform(new ChannelHeaderViewStyle(color, textStyleBuild, textStyleBuild2, textStyleBuild3, builder4.build(), z4, drawable2, z13, z14, color2, z15, colorStateList2, typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.f74151xa2c6ed5f)));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ChannelHeaderViewStyle(int i13, TextStyle titleTextStyle, TextStyle offlineTextStyle, TextStyle searchingForNetworkTextStyle, TextStyle onlineTextStyle, boolean z4, Drawable backButtonIcon, boolean z13, boolean z14, int i14, boolean z15, ColorStateList searchingForNetworkProgressBarTint, Drawable drawable) {
        AbstractC22676k.m65750j(titleTextStyle, "titleTextStyle");
        AbstractC22676k.m65750j(offlineTextStyle, "offlineTextStyle");
        AbstractC22676k.m65750j(searchingForNetworkTextStyle, "searchingForNetworkTextStyle");
        AbstractC22676k.m65750j(onlineTextStyle, "onlineTextStyle");
        AbstractC22676k.m65750j(backButtonIcon, "backButtonIcon");
        AbstractC22676k.m65750j(searchingForNetworkProgressBarTint, "searchingForNetworkProgressBarTint");
        this.background = i13;
        this.titleTextStyle = titleTextStyle;
        this.offlineTextStyle = offlineTextStyle;
        this.searchingForNetworkTextStyle = searchingForNetworkTextStyle;
        this.onlineTextStyle = onlineTextStyle;
        this.showUserAvatar = z4;
        this.backButtonIcon = backButtonIcon;
        this.showBackButton = z13;
        this.showBackButtonBadge = z14;
        this.backButtonBadgeBackgroundColor = i14;
        this.showSearchingForNetworkProgressBar = z15;
        this.searchingForNetworkProgressBarTint = searchingForNetworkProgressBarTint;
        this.separatorBackgroundDrawable = drawable;
    }

    public static /* synthetic */ ChannelHeaderViewStyle copy$default(ChannelHeaderViewStyle channelHeaderViewStyle, int i13, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, boolean z4, Drawable drawable, boolean z13, boolean z14, int i14, boolean z15, ColorStateList colorStateList, Drawable drawable2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = channelHeaderViewStyle.background;
        }
        return channelHeaderViewStyle.copy(i13, (i15 & 2) != 0 ? channelHeaderViewStyle.titleTextStyle : textStyle, (i15 & 4) != 0 ? channelHeaderViewStyle.offlineTextStyle : textStyle2, (i15 & 8) != 0 ? channelHeaderViewStyle.searchingForNetworkTextStyle : textStyle3, (i15 & 16) != 0 ? channelHeaderViewStyle.onlineTextStyle : textStyle4, (i15 & 32) != 0 ? channelHeaderViewStyle.showUserAvatar : z4, (i15 & 64) != 0 ? channelHeaderViewStyle.backButtonIcon : drawable, (i15 & 128) != 0 ? channelHeaderViewStyle.showBackButton : z13, (i15 & 256) != 0 ? channelHeaderViewStyle.showBackButtonBadge : z14, (i15 & 512) != 0 ? channelHeaderViewStyle.backButtonBadgeBackgroundColor : i14, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? channelHeaderViewStyle.showSearchingForNetworkProgressBar : z15, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? channelHeaderViewStyle.searchingForNetworkProgressBarTint : colorStateList, (i15 & 4096) != 0 ? channelHeaderViewStyle.separatorBackgroundDrawable : drawable2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getBackButtonBadgeBackgroundColor() {
        return this.backButtonBadgeBackgroundColor;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getShowSearchingForNetworkProgressBar() {
        return this.showSearchingForNetworkProgressBar;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ColorStateList getSearchingForNetworkProgressBarTint() {
        return this.searchingForNetworkProgressBarTint;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Drawable getSeparatorBackgroundDrawable() {
        return this.separatorBackgroundDrawable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextStyle getTitleTextStyle() {
        return this.titleTextStyle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextStyle getOfflineTextStyle() {
        return this.offlineTextStyle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextStyle getSearchingForNetworkTextStyle() {
        return this.searchingForNetworkTextStyle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextStyle getOnlineTextStyle() {
        return this.onlineTextStyle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShowUserAvatar() {
        return this.showUserAvatar;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Drawable getBackButtonIcon() {
        return this.backButtonIcon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getShowBackButtonBadge() {
        return this.showBackButtonBadge;
    }

    public final ChannelHeaderViewStyle copy(int background, TextStyle titleTextStyle, TextStyle offlineTextStyle, TextStyle searchingForNetworkTextStyle, TextStyle onlineTextStyle, boolean showUserAvatar, Drawable backButtonIcon, boolean showBackButton, boolean showBackButtonBadge, int backButtonBadgeBackgroundColor, boolean showSearchingForNetworkProgressBar, ColorStateList searchingForNetworkProgressBarTint, Drawable separatorBackgroundDrawable) {
        AbstractC22676k.m65750j(titleTextStyle, "titleTextStyle");
        AbstractC22676k.m65750j(offlineTextStyle, "offlineTextStyle");
        AbstractC22676k.m65750j(searchingForNetworkTextStyle, "searchingForNetworkTextStyle");
        AbstractC22676k.m65750j(onlineTextStyle, "onlineTextStyle");
        AbstractC22676k.m65750j(backButtonIcon, "backButtonIcon");
        AbstractC22676k.m65750j(searchingForNetworkProgressBarTint, "searchingForNetworkProgressBarTint");
        return new ChannelHeaderViewStyle(background, titleTextStyle, offlineTextStyle, searchingForNetworkTextStyle, onlineTextStyle, showUserAvatar, backButtonIcon, showBackButton, showBackButtonBadge, backButtonBadgeBackgroundColor, showSearchingForNetworkProgressBar, searchingForNetworkProgressBarTint, separatorBackgroundDrawable);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelHeaderViewStyle)) {
            return false;
        }
        ChannelHeaderViewStyle channelHeaderViewStyle = (ChannelHeaderViewStyle) other;
        return this.background == channelHeaderViewStyle.background && AbstractC22676k.m65745e(this.titleTextStyle, channelHeaderViewStyle.titleTextStyle) && AbstractC22676k.m65745e(this.offlineTextStyle, channelHeaderViewStyle.offlineTextStyle) && AbstractC22676k.m65745e(this.searchingForNetworkTextStyle, channelHeaderViewStyle.searchingForNetworkTextStyle) && AbstractC22676k.m65745e(this.onlineTextStyle, channelHeaderViewStyle.onlineTextStyle) && this.showUserAvatar == channelHeaderViewStyle.showUserAvatar && AbstractC22676k.m65745e(this.backButtonIcon, channelHeaderViewStyle.backButtonIcon) && this.showBackButton == channelHeaderViewStyle.showBackButton && this.showBackButtonBadge == channelHeaderViewStyle.showBackButtonBadge && this.backButtonBadgeBackgroundColor == channelHeaderViewStyle.backButtonBadgeBackgroundColor && this.showSearchingForNetworkProgressBar == channelHeaderViewStyle.showSearchingForNetworkProgressBar && AbstractC22676k.m65745e(this.searchingForNetworkProgressBarTint, channelHeaderViewStyle.searchingForNetworkProgressBarTint) && AbstractC22676k.m65745e(this.separatorBackgroundDrawable, channelHeaderViewStyle.separatorBackgroundDrawable);
    }

    public final int getBackButtonBadgeBackgroundColor() {
        return this.backButtonBadgeBackgroundColor;
    }

    public final Drawable getBackButtonIcon() {
        return this.backButtonIcon;
    }

    public final int getBackground() {
        return this.background;
    }

    public final TextStyle getOfflineTextStyle() {
        return this.offlineTextStyle;
    }

    public final TextStyle getOnlineTextStyle() {
        return this.onlineTextStyle;
    }

    public final ColorStateList getSearchingForNetworkProgressBarTint() {
        return this.searchingForNetworkProgressBarTint;
    }

    public final TextStyle getSearchingForNetworkTextStyle() {
        return this.searchingForNetworkTextStyle;
    }

    public final Drawable getSeparatorBackgroundDrawable() {
        return this.separatorBackgroundDrawable;
    }

    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    public final boolean getShowBackButtonBadge() {
        return this.showBackButtonBadge;
    }

    public final boolean getShowSearchingForNetworkProgressBar() {
        return this.showSearchingForNetworkProgressBar;
    }

    public final boolean getShowUserAvatar() {
        return this.showUserAvatar;
    }

    public final TextStyle getTitleTextStyle() {
        return this.titleTextStyle;
    }

    public final int hashCode() {
        int iHashCode = (this.searchingForNetworkProgressBarTint.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.backButtonBadgeBackgroundColor, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC26725a.m79497a(this.backButtonIcon, AbstractC2875y.m8289b(AbstractC26725a.m79499c(this.onlineTextStyle, AbstractC26725a.m79499c(this.searchingForNetworkTextStyle, AbstractC26725a.m79499c(this.offlineTextStyle, AbstractC26725a.m79499c(this.titleTextStyle, Integer.hashCode(this.background) * 31, 31), 31), 31), 31), 31, this.showUserAvatar), 31), 31, this.showBackButton), 31, this.showBackButtonBadge), 31), 31, this.showSearchingForNetworkProgressBar)) * 31;
        Drawable drawable = this.separatorBackgroundDrawable;
        return iHashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        int i13 = this.background;
        TextStyle textStyle = this.titleTextStyle;
        TextStyle textStyle2 = this.offlineTextStyle;
        TextStyle textStyle3 = this.searchingForNetworkTextStyle;
        TextStyle textStyle4 = this.onlineTextStyle;
        boolean z4 = this.showUserAvatar;
        Drawable drawable = this.backButtonIcon;
        boolean z13 = this.showBackButton;
        boolean z14 = this.showBackButtonBadge;
        int i14 = this.backButtonBadgeBackgroundColor;
        boolean z15 = this.showSearchingForNetworkProgressBar;
        ColorStateList colorStateList = this.searchingForNetworkProgressBarTint;
        Drawable drawable2 = this.separatorBackgroundDrawable;
        StringBuilder sb4 = new StringBuilder("ChannelHeaderViewStyle(background=");
        sb4.append(i13);
        sb4.append(", titleTextStyle=");
        sb4.append(textStyle);
        sb4.append(", offlineTextStyle=");
        sb4.append(textStyle2);
        sb4.append(", searchingForNetworkTextStyle=");
        sb4.append(textStyle3);
        sb4.append(", onlineTextStyle=");
        sb4.append(textStyle4);
        sb4.append(", showUserAvatar=");
        sb4.append(z4);
        sb4.append(", backButtonIcon=");
        sb4.append(drawable);
        sb4.append(", showBackButton=");
        sb4.append(z13);
        sb4.append(", showBackButtonBadge=");
        AbstractC30802r.m94769r(i14, ", backButtonBadgeBackgroundColor=", ", showSearchingForNetworkProgressBar=", sb4, z14);
        sb4.append(z15);
        sb4.append(", searchingForNetworkProgressBarTint=");
        sb4.append(colorStateList);
        sb4.append(", separatorBackgroundDrawable=");
        sb4.append(drawable2);
        sb4.append(")");
        return sb4.toString();
    }
}
