package io.getstream.chat.android.p226ui.feature.search.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.preview.MessagePreviewStyle;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p479s4.AbstractC32122c;
import p513u4.AbstractC34523k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 @2\u00020\u0001:\u0001@B\u0085\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0013HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u0095\u0001\u00108\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0005HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\t\u0010>\u001a\u00020?HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001a¨\u0006A"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "backgroundColor", "", "searchInfoBarBackground", "Landroid/graphics/drawable/Drawable;", "searchInfoBarTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "emptyStateIcon", "emptyStateTextStyle", "progressBarIcon", "messagePreviewStyle", "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;", "itemHeight", "itemMarginStart", "itemMarginEnd", "itemTitleMarginStart", "itemVerticalSpacerHeight", "itemVerticalSpacerPosition", "", "itemSeparator", "<init>", "(ILandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;IIIIIFLandroid/graphics/drawable/Drawable;)V", "getBackgroundColor", "()I", "getSearchInfoBarBackground", "()Landroid/graphics/drawable/Drawable;", "getSearchInfoBarTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getEmptyStateIcon", "getEmptyStateTextStyle", "getProgressBarIcon", "getMessagePreviewStyle", "()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;", "getItemHeight", "getItemMarginStart", "getItemMarginEnd", "getItemTitleMarginStart", "getItemVerticalSpacerHeight", "getItemVerticalSpacerPosition", "()F", "getItemSeparator", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class SearchResultListViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final int backgroundColor;
    private final Drawable emptyStateIcon;
    private final TextStyle emptyStateTextStyle;
    private final int itemHeight;
    private final int itemMarginEnd;
    private final int itemMarginStart;
    private final Drawable itemSeparator;
    private final int itemTitleMarginStart;
    private final int itemVerticalSpacerHeight;
    private final float itemVerticalSpacerPosition;
    private final MessagePreviewStyle messagePreviewStyle;
    private final Drawable progressBarIcon;
    private final Drawable searchInfoBarBackground;
    private final TextStyle searchInfoBarTextStyle;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\u0002¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final SearchResultListViewStyle invoke(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.SearchResultListView, C19469R.attr.streamUiSearchResultListViewStyle, C19469R.style.StreamUi_SearchResultListView);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int color = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.SearchResultListView_streamUiSearchResultListBackground, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.f74412xad520d9d);
            if (drawable == null) {
                drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_bg_gradient);
                AbstractC22676k.m65747g(drawable);
            }
            Drawable drawable2 = drawable;
            TextStyle.Builder builder = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder.size(C19469R.styleable.f74416x2b8842fd, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_small));
            builder.color(C19469R.styleable.f74413x44a12be7, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder.font(C19469R.styleable.f74415xca9beaae, C19469R.styleable.f74414x2b826f4b);
            builder.style(C19469R.styleable.f74417x45851a35, 0);
            TextStyle textStyleBuild = builder.build();
            Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.SearchResultListView_streamUiSearchResultListEmptyStateIcon);
            if (drawable3 == null) {
                drawable3 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_search_empty);
                AbstractC22676k.m65747g(drawable3);
            }
            Drawable drawable4 = drawable3;
            TextStyle.Builder builder2 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder2.size(C19469R.styleable.SearchResultListView_streamUiSearchResultListEmptyStateTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder2.color(C19469R.styleable.SearchResultListView_streamUiSearchResultListEmptyStateTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder2.font(C19469R.styleable.f74407xeb835191, C19469R.styleable.SearchResultListView_streamUiSearchResultListEmptyStateTextFont);
            builder2.style(C19469R.styleable.SearchResultListView_streamUiSearchResultListEmptyStateTextStyle, 0);
            TextStyle textStyleBuild2 = builder2.build();
            Drawable drawable5 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.SearchResultListView_streamUiSearchResultListProgressBarIcon);
            if (drawable5 == null) {
                drawable5 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_rotating_indeterminate_progress_gradient);
                AbstractC22676k.m65747g(drawable5);
            }
            Drawable drawable6 = drawable5;
            TextStyle.Builder builder3 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder3.size(C19469R.styleable.SearchResultListView_streamUiSearchResultListSenderNameTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_channel_item_title));
            builder3.color(C19469R.styleable.SearchResultListView_streamUiSearchResultListSenderNameTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder3.font(C19469R.styleable.f74418x1c9ffad, C19469R.styleable.SearchResultListView_streamUiSearchResultListSenderNameTextFont);
            builder3.style(C19469R.styleable.SearchResultListView_streamUiSearchResultListSenderNameTextStyle, 0);
            TextStyle textStyleBuild3 = builder3.build();
            TextStyle.Builder builder4 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder4.size(C19469R.styleable.SearchResultListView_streamUiSearchResultListMessageTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_channel_item_message));
            builder4.color(C19469R.styleable.SearchResultListView_streamUiSearchResultListMessageTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder4.font(C19469R.styleable.f74408xae6f28f8, C19469R.styleable.SearchResultListView_streamUiSearchResultListMessageTextFont);
            builder4.style(C19469R.styleable.SearchResultListView_streamUiSearchResultListMessageTextStyle, 0);
            TextStyle textStyleBuild4 = builder4.build();
            TextStyle.Builder builder5 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder5.size(C19469R.styleable.SearchResultListView_streamUiSearchResultListMessageTimeTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_channel_item_message));
            builder5.color(C19469R.styleable.f74409xe7275f90, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder5.font(C19469R.styleable.f74410xf36098a5, C19469R.styleable.SearchResultListView_streamUiSearchResultListMessageTimeTextFont);
            builder5.style(C19469R.styleable.f74411xe80b4dde, 0);
            TextStyle textStyleBuild5 = builder5.build();
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.SearchResultListView_streamUiSearchResulListItemHeight, ContextKt.getDimension(context, C19469R.dimen.stream_ui_search_result_list_item_height));
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.SearchResultListView_streamUiSearchResulListItemMarginStart, ContextKt.getDimension(context, C19469R.dimen.stream_ui_search_result_item_margin_start));
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.SearchResultListView_streamUiSearchResulListItemMarginEnd, ContextKt.getDimension(context, C19469R.dimen.stream_ui_search_result_item_margin_end));
            int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.SearchResultListView_streamUiSearchResulListItemTitleMarginStart, ContextKt.getDimension(context, C19469R.dimen.stream_ui_search_result_item_title_margin_start));
            int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.f74405xfafc3ffe, ContextKt.getDimension(context, C19469R.dimen.stream_ui_search_result_item_vertical_spacer_height));
            float f13 = typedArrayObtainStyledAttributes.getFloat(C19469R.styleable.f74406x8e25ee40, AbstractC34523k.m109097a(context.getResources(), C19469R.dimen.stream_ui_search_result_item_vertical_spacer_position));
            Drawable drawable7 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.f74404xcf0495ce);
            if (drawable7 == null) {
                drawable7 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_divider);
                AbstractC22676k.m65747g(drawable7);
            }
            return TransformStyle.getSearchResultListViewStyleTransformer().transform(new SearchResultListViewStyle(color, drawable2, textStyleBuild, drawable4, textStyleBuild2, drawable6, new MessagePreviewStyle(textStyleBuild3, textStyleBuild4, textStyleBuild5), dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5, f13, drawable7));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public SearchResultListViewStyle(int i13, Drawable searchInfoBarBackground, TextStyle searchInfoBarTextStyle, Drawable emptyStateIcon, TextStyle emptyStateTextStyle, Drawable progressBarIcon, MessagePreviewStyle messagePreviewStyle, int i14, int i15, int i16, int i17, int i18, float f13, Drawable itemSeparator) {
        AbstractC22676k.m65750j(searchInfoBarBackground, "searchInfoBarBackground");
        AbstractC22676k.m65750j(searchInfoBarTextStyle, "searchInfoBarTextStyle");
        AbstractC22676k.m65750j(emptyStateIcon, "emptyStateIcon");
        AbstractC22676k.m65750j(emptyStateTextStyle, "emptyStateTextStyle");
        AbstractC22676k.m65750j(progressBarIcon, "progressBarIcon");
        AbstractC22676k.m65750j(messagePreviewStyle, "messagePreviewStyle");
        AbstractC22676k.m65750j(itemSeparator, "itemSeparator");
        this.backgroundColor = i13;
        this.searchInfoBarBackground = searchInfoBarBackground;
        this.searchInfoBarTextStyle = searchInfoBarTextStyle;
        this.emptyStateIcon = emptyStateIcon;
        this.emptyStateTextStyle = emptyStateTextStyle;
        this.progressBarIcon = progressBarIcon;
        this.messagePreviewStyle = messagePreviewStyle;
        this.itemHeight = i14;
        this.itemMarginStart = i15;
        this.itemMarginEnd = i16;
        this.itemTitleMarginStart = i17;
        this.itemVerticalSpacerHeight = i18;
        this.itemVerticalSpacerPosition = f13;
        this.itemSeparator = itemSeparator;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getItemMarginEnd() {
        return this.itemMarginEnd;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getItemTitleMarginStart() {
        return this.itemTitleMarginStart;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getItemVerticalSpacerHeight() {
        return this.itemVerticalSpacerHeight;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final float getItemVerticalSpacerPosition() {
        return this.itemVerticalSpacerPosition;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Drawable getItemSeparator() {
        return this.itemSeparator;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Drawable getSearchInfoBarBackground() {
        return this.searchInfoBarBackground;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextStyle getSearchInfoBarTextStyle() {
        return this.searchInfoBarTextStyle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Drawable getEmptyStateIcon() {
        return this.emptyStateIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextStyle getEmptyStateTextStyle() {
        return this.emptyStateTextStyle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Drawable getProgressBarIcon() {
        return this.progressBarIcon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MessagePreviewStyle getMessagePreviewStyle() {
        return this.messagePreviewStyle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getItemHeight() {
        return this.itemHeight;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getItemMarginStart() {
        return this.itemMarginStart;
    }

    public final SearchResultListViewStyle copy(int backgroundColor, Drawable searchInfoBarBackground, TextStyle searchInfoBarTextStyle, Drawable emptyStateIcon, TextStyle emptyStateTextStyle, Drawable progressBarIcon, MessagePreviewStyle messagePreviewStyle, int itemHeight, int itemMarginStart, int itemMarginEnd, int itemTitleMarginStart, int itemVerticalSpacerHeight, float itemVerticalSpacerPosition, Drawable itemSeparator) {
        AbstractC22676k.m65750j(searchInfoBarBackground, "searchInfoBarBackground");
        AbstractC22676k.m65750j(searchInfoBarTextStyle, "searchInfoBarTextStyle");
        AbstractC22676k.m65750j(emptyStateIcon, "emptyStateIcon");
        AbstractC22676k.m65750j(emptyStateTextStyle, "emptyStateTextStyle");
        AbstractC22676k.m65750j(progressBarIcon, "progressBarIcon");
        AbstractC22676k.m65750j(messagePreviewStyle, "messagePreviewStyle");
        AbstractC22676k.m65750j(itemSeparator, "itemSeparator");
        return new SearchResultListViewStyle(backgroundColor, searchInfoBarBackground, searchInfoBarTextStyle, emptyStateIcon, emptyStateTextStyle, progressBarIcon, messagePreviewStyle, itemHeight, itemMarginStart, itemMarginEnd, itemTitleMarginStart, itemVerticalSpacerHeight, itemVerticalSpacerPosition, itemSeparator);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultListViewStyle)) {
            return false;
        }
        SearchResultListViewStyle searchResultListViewStyle = (SearchResultListViewStyle) other;
        return this.backgroundColor == searchResultListViewStyle.backgroundColor && AbstractC22676k.m65745e(this.searchInfoBarBackground, searchResultListViewStyle.searchInfoBarBackground) && AbstractC22676k.m65745e(this.searchInfoBarTextStyle, searchResultListViewStyle.searchInfoBarTextStyle) && AbstractC22676k.m65745e(this.emptyStateIcon, searchResultListViewStyle.emptyStateIcon) && AbstractC22676k.m65745e(this.emptyStateTextStyle, searchResultListViewStyle.emptyStateTextStyle) && AbstractC22676k.m65745e(this.progressBarIcon, searchResultListViewStyle.progressBarIcon) && AbstractC22676k.m65745e(this.messagePreviewStyle, searchResultListViewStyle.messagePreviewStyle) && this.itemHeight == searchResultListViewStyle.itemHeight && this.itemMarginStart == searchResultListViewStyle.itemMarginStart && this.itemMarginEnd == searchResultListViewStyle.itemMarginEnd && this.itemTitleMarginStart == searchResultListViewStyle.itemTitleMarginStart && this.itemVerticalSpacerHeight == searchResultListViewStyle.itemVerticalSpacerHeight && Float.compare(this.itemVerticalSpacerPosition, searchResultListViewStyle.itemVerticalSpacerPosition) == 0 && AbstractC22676k.m65745e(this.itemSeparator, searchResultListViewStyle.itemSeparator);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Drawable getEmptyStateIcon() {
        return this.emptyStateIcon;
    }

    public final TextStyle getEmptyStateTextStyle() {
        return this.emptyStateTextStyle;
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

    public final MessagePreviewStyle getMessagePreviewStyle() {
        return this.messagePreviewStyle;
    }

    public final Drawable getProgressBarIcon() {
        return this.progressBarIcon;
    }

    public final Drawable getSearchInfoBarBackground() {
        return this.searchInfoBarBackground;
    }

    public final TextStyle getSearchInfoBarTextStyle() {
        return this.searchInfoBarTextStyle;
    }

    public final int hashCode() {
        return this.itemSeparator.hashCode() + AbstractC11266d.m30447a(this.itemVerticalSpacerPosition, AbstractC11266d.m30448b(this.itemVerticalSpacerHeight, AbstractC11266d.m30448b(this.itemTitleMarginStart, AbstractC11266d.m30448b(this.itemMarginEnd, AbstractC11266d.m30448b(this.itemMarginStart, AbstractC11266d.m30448b(this.itemHeight, (this.messagePreviewStyle.hashCode() + AbstractC26725a.m79497a(this.progressBarIcon, AbstractC26725a.m79499c(this.emptyStateTextStyle, AbstractC26725a.m79497a(this.emptyStateIcon, AbstractC26725a.m79499c(this.searchInfoBarTextStyle, AbstractC26725a.m79497a(this.searchInfoBarBackground, Integer.hashCode(this.backgroundColor) * 31, 31), 31), 31), 31), 31)) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        int i13 = this.backgroundColor;
        Drawable drawable = this.searchInfoBarBackground;
        TextStyle textStyle = this.searchInfoBarTextStyle;
        Drawable drawable2 = this.emptyStateIcon;
        TextStyle textStyle2 = this.emptyStateTextStyle;
        Drawable drawable3 = this.progressBarIcon;
        MessagePreviewStyle messagePreviewStyle = this.messagePreviewStyle;
        int i14 = this.itemHeight;
        int i15 = this.itemMarginStart;
        int i16 = this.itemMarginEnd;
        int i17 = this.itemTitleMarginStart;
        int i18 = this.itemVerticalSpacerHeight;
        float f13 = this.itemVerticalSpacerPosition;
        Drawable drawable4 = this.itemSeparator;
        StringBuilder sb4 = new StringBuilder("SearchResultListViewStyle(backgroundColor=");
        sb4.append(i13);
        sb4.append(", searchInfoBarBackground=");
        sb4.append(drawable);
        sb4.append(", searchInfoBarTextStyle=");
        sb4.append(textStyle);
        sb4.append(", emptyStateIcon=");
        sb4.append(drawable2);
        sb4.append(", emptyStateTextStyle=");
        sb4.append(textStyle2);
        sb4.append(", progressBarIcon=");
        sb4.append(drawable3);
        sb4.append(", messagePreviewStyle=");
        sb4.append(messagePreviewStyle);
        sb4.append(", itemHeight=");
        sb4.append(i14);
        sb4.append(", itemMarginStart=");
        AbstractC30802r.m94773v(sb4, i15, ", itemMarginEnd=", i16, ", itemTitleMarginStart=");
        AbstractC30802r.m94773v(sb4, i17, ", itemVerticalSpacerHeight=", i18, ", itemVerticalSpacerPosition=");
        sb4.append(f13);
        sb4.append(", itemSeparator=");
        sb4.append(drawable4);
        sb4.append(")");
        return sb4.toString();
    }
}
