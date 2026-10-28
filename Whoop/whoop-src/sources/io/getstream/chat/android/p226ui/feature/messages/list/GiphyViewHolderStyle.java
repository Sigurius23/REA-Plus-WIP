package io.getstream.chat.android.p226ui.feature.messages.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p479s4.AbstractC32122c;
import p513u4.AbstractC34523k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003Jc\u0010'\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019¨\u00060"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "cardBackgroundColor", "", "cardElevation", "", "cardButtonDividerColor", "giphyIcon", "Landroid/graphics/drawable/Drawable;", "labelTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "queryTextStyle", "cancelButtonTextStyle", "shuffleButtonTextStyle", "sendButtonTextStyle", "<init>", "(IFILandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)V", "getCardBackgroundColor", "()I", "getCardElevation", "()F", "getCardButtonDividerColor", "getGiphyIcon", "()Landroid/graphics/drawable/Drawable;", "getLabelTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getQueryTextStyle", "getCancelButtonTextStyle", "getShuffleButtonTextStyle", "getSendButtonTextStyle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class GiphyViewHolderStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final TextStyle cancelButtonTextStyle;
    private final int cardBackgroundColor;
    private final int cardButtonDividerColor;
    private final float cardElevation;
    private final Drawable giphyIcon;
    private final TextStyle labelTextStyle;
    private final TextStyle queryTextStyle;
    private final TextStyle sendButtonTextStyle;
    private final TextStyle shuffleButtonTextStyle;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086\u0002¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;", "context", "Landroid/content/Context;", "attributes", "Landroid/content/res/TypedArray;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final GiphyViewHolderStyle invoke(Context context, TypedArray attributes) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(attributes, "attributes");
            Typeface typefaceM109098b = AbstractC34523k.m109098b(context, C19470R.font.stream_roboto_bold);
            if (typefaceM109098b == null) {
                typefaceM109098b = Typeface.DEFAULT_BOLD;
            }
            Typeface typefaceM109098b2 = AbstractC34523k.m109098b(context, C19470R.font.stream_roboto_medium);
            if (typefaceM109098b2 == null) {
                typefaceM109098b2 = Typeface.DEFAULT;
            }
            int color = attributes.getColor(C19469R.styleable.MessageListView_streamUiGiphyCardBackgroundColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            float dimension = attributes.getDimension(C19469R.styleable.MessageListView_streamUiGiphyCardElevation, ContextKt.getDimension(context, C19469R.dimen.stream_ui_elevation_small));
            int color2 = attributes.getColor(C19469R.styleable.MessageListView_streamUiGiphyCardButtonDividerColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_border));
            Drawable drawable = attributes.getDrawable(C19469R.styleable.MessageListView_streamUiGiphyIcon);
            if (drawable == null) {
                drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_giphy);
                AbstractC22676k.m65747g(drawable);
            }
            Drawable drawable2 = drawable;
            TextStyle.Builder builder = new TextStyle.Builder(attributes);
            builder.size(C19469R.styleable.MessageListView_streamUiGiphyLabelTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder.color(C19469R.styleable.MessageListView_streamUiGiphyLabelTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            int i13 = C19469R.styleable.MessageListView_streamUiGiphyLabelTextFontAssets;
            int i14 = C19469R.styleable.MessageListView_streamUiGiphyLabelTextFont;
            AbstractC22676k.m65747g(typefaceM109098b);
            builder.font(i13, i14, typefaceM109098b);
            builder.style(C19469R.styleable.MessageListView_streamUiGiphyLabelTextStyle, 0);
            TextStyle textStyleBuild = builder.build();
            TextStyle.Builder builder2 = new TextStyle.Builder(attributes);
            builder2.size(C19469R.styleable.MessageListView_streamUiGiphyQueryTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder2.color(C19469R.styleable.MessageListView_streamUiGiphyQueryTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            int i15 = C19469R.styleable.MessageListView_streamUiGiphyQueryTextFontAssets;
            int i16 = C19469R.styleable.MessageListView_streamUiGiphyQueryTextFont;
            AbstractC22676k.m65747g(typefaceM109098b2);
            builder2.font(i15, i16, typefaceM109098b2);
            builder2.style(C19469R.styleable.MessageListView_streamUiGiphyQueryTextStyle, 0);
            TextStyle textStyleBuild2 = builder2.build();
            TextStyle.Builder builder3 = new TextStyle.Builder(attributes);
            builder3.size(C19469R.styleable.MessageListView_streamUiGiphyCancelButtonTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder3.color(C19469R.styleable.MessageListView_streamUiGiphyCancelButtonTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder3.font(C19469R.styleable.MessageListView_streamUiGiphyCancelButtonTextFontAssets, C19469R.styleable.MessageListView_streamUiGiphyCancelButtonTextFont, typefaceM109098b);
            builder3.style(C19469R.styleable.MessageListView_streamUiGiphyCancelButtonTextStyle, 0);
            TextStyle textStyleBuild3 = builder3.build();
            TextStyle.Builder builder4 = new TextStyle.Builder(attributes);
            builder4.size(C19469R.styleable.MessageListView_streamUiGiphyShuffleButtonTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder4.color(C19469R.styleable.MessageListView_streamUiGiphyShuffleButtonTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder4.font(C19469R.styleable.MessageListView_streamUiGiphyShuffleButtonTextFontAssets, C19469R.styleable.MessageListView_streamUiGiphyShuffleButtonTextFont, typefaceM109098b);
            builder4.style(C19469R.styleable.MessageListView_streamUiGiphyShuffleButtonTextStyle, 0);
            TextStyle textStyleBuild4 = builder4.build();
            TextStyle.Builder builder5 = new TextStyle.Builder(attributes);
            builder5.size(C19469R.styleable.MessageListView_streamUiGiphySendButtonTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder5.color(C19469R.styleable.MessageListView_streamUiGiphySendButtonTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_accent_blue));
            builder5.font(C19469R.styleable.MessageListView_streamUiGiphySendButtonTextFontAssets, C19469R.styleable.MessageListView_streamUiGiphySendButtonTextFont, typefaceM109098b);
            builder5.style(C19469R.styleable.MessageListView_streamUiGiphySendButtonTextStyle, 0);
            return TransformStyle.getGiphyViewHolderStyleTransformer().transform(new GiphyViewHolderStyle(color, dimension, color2, drawable2, textStyleBuild, textStyleBuild2, textStyleBuild3, textStyleBuild4, builder5.build()));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public GiphyViewHolderStyle(int i13, float f13, int i14, Drawable giphyIcon, TextStyle labelTextStyle, TextStyle queryTextStyle, TextStyle cancelButtonTextStyle, TextStyle shuffleButtonTextStyle, TextStyle sendButtonTextStyle) {
        AbstractC22676k.m65750j(giphyIcon, "giphyIcon");
        AbstractC22676k.m65750j(labelTextStyle, "labelTextStyle");
        AbstractC22676k.m65750j(queryTextStyle, "queryTextStyle");
        AbstractC22676k.m65750j(cancelButtonTextStyle, "cancelButtonTextStyle");
        AbstractC22676k.m65750j(shuffleButtonTextStyle, "shuffleButtonTextStyle");
        AbstractC22676k.m65750j(sendButtonTextStyle, "sendButtonTextStyle");
        this.cardBackgroundColor = i13;
        this.cardElevation = f13;
        this.cardButtonDividerColor = i14;
        this.giphyIcon = giphyIcon;
        this.labelTextStyle = labelTextStyle;
        this.queryTextStyle = queryTextStyle;
        this.cancelButtonTextStyle = cancelButtonTextStyle;
        this.shuffleButtonTextStyle = shuffleButtonTextStyle;
        this.sendButtonTextStyle = sendButtonTextStyle;
    }

    public static /* synthetic */ GiphyViewHolderStyle copy$default(GiphyViewHolderStyle giphyViewHolderStyle, int i13, float f13, int i14, Drawable drawable, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = giphyViewHolderStyle.cardBackgroundColor;
        }
        if ((i15 & 2) != 0) {
            f13 = giphyViewHolderStyle.cardElevation;
        }
        if ((i15 & 4) != 0) {
            i14 = giphyViewHolderStyle.cardButtonDividerColor;
        }
        if ((i15 & 8) != 0) {
            drawable = giphyViewHolderStyle.giphyIcon;
        }
        if ((i15 & 16) != 0) {
            textStyle = giphyViewHolderStyle.labelTextStyle;
        }
        if ((i15 & 32) != 0) {
            textStyle2 = giphyViewHolderStyle.queryTextStyle;
        }
        if ((i15 & 64) != 0) {
            textStyle3 = giphyViewHolderStyle.cancelButtonTextStyle;
        }
        if ((i15 & 128) != 0) {
            textStyle4 = giphyViewHolderStyle.shuffleButtonTextStyle;
        }
        if ((i15 & 256) != 0) {
            textStyle5 = giphyViewHolderStyle.sendButtonTextStyle;
        }
        TextStyle textStyle6 = textStyle4;
        TextStyle textStyle7 = textStyle5;
        TextStyle textStyle8 = textStyle2;
        TextStyle textStyle9 = textStyle3;
        TextStyle textStyle10 = textStyle;
        int i16 = i14;
        return giphyViewHolderStyle.copy(i13, f13, i16, drawable, textStyle10, textStyle8, textStyle9, textStyle6, textStyle7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCardBackgroundColor() {
        return this.cardBackgroundColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getCardElevation() {
        return this.cardElevation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCardButtonDividerColor() {
        return this.cardButtonDividerColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Drawable getGiphyIcon() {
        return this.giphyIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextStyle getLabelTextStyle() {
        return this.labelTextStyle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TextStyle getQueryTextStyle() {
        return this.queryTextStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TextStyle getCancelButtonTextStyle() {
        return this.cancelButtonTextStyle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TextStyle getShuffleButtonTextStyle() {
        return this.shuffleButtonTextStyle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TextStyle getSendButtonTextStyle() {
        return this.sendButtonTextStyle;
    }

    public final GiphyViewHolderStyle copy(int cardBackgroundColor, float cardElevation, int cardButtonDividerColor, Drawable giphyIcon, TextStyle labelTextStyle, TextStyle queryTextStyle, TextStyle cancelButtonTextStyle, TextStyle shuffleButtonTextStyle, TextStyle sendButtonTextStyle) {
        AbstractC22676k.m65750j(giphyIcon, "giphyIcon");
        AbstractC22676k.m65750j(labelTextStyle, "labelTextStyle");
        AbstractC22676k.m65750j(queryTextStyle, "queryTextStyle");
        AbstractC22676k.m65750j(cancelButtonTextStyle, "cancelButtonTextStyle");
        AbstractC22676k.m65750j(shuffleButtonTextStyle, "shuffleButtonTextStyle");
        AbstractC22676k.m65750j(sendButtonTextStyle, "sendButtonTextStyle");
        return new GiphyViewHolderStyle(cardBackgroundColor, cardElevation, cardButtonDividerColor, giphyIcon, labelTextStyle, queryTextStyle, cancelButtonTextStyle, shuffleButtonTextStyle, sendButtonTextStyle);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiphyViewHolderStyle)) {
            return false;
        }
        GiphyViewHolderStyle giphyViewHolderStyle = (GiphyViewHolderStyle) other;
        return this.cardBackgroundColor == giphyViewHolderStyle.cardBackgroundColor && Float.compare(this.cardElevation, giphyViewHolderStyle.cardElevation) == 0 && this.cardButtonDividerColor == giphyViewHolderStyle.cardButtonDividerColor && AbstractC22676k.m65745e(this.giphyIcon, giphyViewHolderStyle.giphyIcon) && AbstractC22676k.m65745e(this.labelTextStyle, giphyViewHolderStyle.labelTextStyle) && AbstractC22676k.m65745e(this.queryTextStyle, giphyViewHolderStyle.queryTextStyle) && AbstractC22676k.m65745e(this.cancelButtonTextStyle, giphyViewHolderStyle.cancelButtonTextStyle) && AbstractC22676k.m65745e(this.shuffleButtonTextStyle, giphyViewHolderStyle.shuffleButtonTextStyle) && AbstractC22676k.m65745e(this.sendButtonTextStyle, giphyViewHolderStyle.sendButtonTextStyle);
    }

    public final TextStyle getCancelButtonTextStyle() {
        return this.cancelButtonTextStyle;
    }

    public final int getCardBackgroundColor() {
        return this.cardBackgroundColor;
    }

    public final int getCardButtonDividerColor() {
        return this.cardButtonDividerColor;
    }

    public final float getCardElevation() {
        return this.cardElevation;
    }

    public final Drawable getGiphyIcon() {
        return this.giphyIcon;
    }

    public final TextStyle getLabelTextStyle() {
        return this.labelTextStyle;
    }

    public final TextStyle getQueryTextStyle() {
        return this.queryTextStyle;
    }

    public final TextStyle getSendButtonTextStyle() {
        return this.sendButtonTextStyle;
    }

    public final TextStyle getShuffleButtonTextStyle() {
        return this.shuffleButtonTextStyle;
    }

    public final int hashCode() {
        return this.sendButtonTextStyle.hashCode() + AbstractC26725a.m79499c(this.shuffleButtonTextStyle, AbstractC26725a.m79499c(this.cancelButtonTextStyle, AbstractC26725a.m79499c(this.queryTextStyle, AbstractC26725a.m79499c(this.labelTextStyle, AbstractC26725a.m79497a(this.giphyIcon, AbstractC11266d.m30448b(this.cardButtonDividerColor, AbstractC11266d.m30447a(this.cardElevation, Integer.hashCode(this.cardBackgroundColor) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "GiphyViewHolderStyle(cardBackgroundColor=" + this.cardBackgroundColor + ", cardElevation=" + this.cardElevation + ", cardButtonDividerColor=" + this.cardButtonDividerColor + ", giphyIcon=" + this.giphyIcon + ", labelTextStyle=" + this.labelTextStyle + ", queryTextStyle=" + this.queryTextStyle + ", cancelButtonTextStyle=" + this.cancelButtonTextStyle + ", shuffleButtonTextStyle=" + this.shuffleButtonTextStyle + ", sendButtonTextStyle=" + this.sendButtonTextStyle + ")";
    }
}
