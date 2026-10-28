package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view;

import android.content.Context;
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
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 22\u00020\u0001:\u00012Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Jw\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00063"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "pollTitleTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "pollSubtitleTextStyle", "pollOptionCheckDrawable", "Landroid/graphics/drawable/Drawable;", "pollOptionTextStyle", "pollOptionVotesTextStyle", "pollCloseTextStyle", "pollResultsTextStyle", "pollShowAllOptionsTextStyle", "pollSuggestOptionTextStyle", "pollAddCommentTextStyle", "pollViewCommentsTextStyle", "<init>", "(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)V", "getPollTitleTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getPollSubtitleTextStyle", "getPollOptionCheckDrawable", "()Landroid/graphics/drawable/Drawable;", "getPollOptionTextStyle", "getPollOptionVotesTextStyle", "getPollCloseTextStyle", "getPollResultsTextStyle", "getPollShowAllOptionsTextStyle", "getPollSuggestOptionTextStyle", "getPollAddCommentTextStyle", "getPollViewCommentsTextStyle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PollViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final TextStyle pollAddCommentTextStyle;
    private final TextStyle pollCloseTextStyle;
    private final Drawable pollOptionCheckDrawable;
    private final TextStyle pollOptionTextStyle;
    private final TextStyle pollOptionVotesTextStyle;
    private final TextStyle pollResultsTextStyle;
    private final TextStyle pollShowAllOptionsTextStyle;
    private final TextStyle pollSubtitleTextStyle;
    private final TextStyle pollSuggestOptionTextStyle;
    private final TextStyle pollTitleTextStyle;
    private final TextStyle pollViewCommentsTextStyle;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0080\u0002¢\u0006\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "invoke$stream_chat_android_ui_components_release", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final PollViewStyle invoke$stream_chat_android_ui_components_release(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.PollView, C19469R.attr.streamUiMessageListPollStyle, C19469R.style.StreamUi_MessageList_Poll);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            TextStyle.Builder builder = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder.size(C19469R.styleable.PollView_streamUiPollTitleTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder.color(C19469R.styleable.PollView_streamUiPollTitleTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder.font(C19469R.styleable.PollView_streamUiPollTitleFontAssets, C19469R.styleable.PollView_streamUiPollTitleTextFont);
            builder.style(C19469R.styleable.PollView_streamUiPollTitleTextStyle, 0);
            TextStyle textStyleBuild = builder.build();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.PollView_streamUiPollOptionCheckDrawable);
            if (drawable == null) {
                drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_poll_option_selector);
                AbstractC22676k.m65747g(drawable);
            }
            Drawable drawable2 = drawable;
            TextStyle.Builder builder2 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder2.size(C19469R.styleable.PollView_streamUiPollSubtitleTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder2.color(C19469R.styleable.PollView_streamUiPollSubtitleTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder2.font(C19469R.styleable.PollView_streamUiPollSubtitleFontAssets, C19469R.styleable.PollView_streamUiPollSubtitleTextFont);
            builder2.style(C19469R.styleable.PollView_streamUiPollSubtitleTextStyle, 0);
            TextStyle textStyleBuild2 = builder2.build();
            TextStyle.Builder builder3 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder3.size(C19469R.styleable.PollView_streamUiPollOptionTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder3.color(C19469R.styleable.PollView_streamUiPollOptionTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder3.font(C19469R.styleable.PollView_streamUiPollOptionFontAssets, C19469R.styleable.PollView_streamUiPollOptionTextFont);
            builder3.style(C19469R.styleable.PollView_streamUiPollOptionTextStyle, 0);
            TextStyle textStyleBuild3 = builder3.build();
            TextStyle.Builder builder4 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder4.size(C19469R.styleable.PollView_streamUiPollVotesTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder4.color(C19469R.styleable.PollView_streamUiPollVotesTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder4.font(C19469R.styleable.PollView_streamUiPollVotesFontAssets, C19469R.styleable.PollView_streamUiPollVotesTextFont);
            builder4.style(C19469R.styleable.PollView_streamUiPollVotesTextStyle, 0);
            TextStyle textStyleBuild4 = builder4.build();
            TextStyle.Builder builder5 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder5.size(C19469R.styleable.PollView_streamUiPollCloseTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder5.color(C19469R.styleable.PollView_streamUiPollCloseTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_accent_blue));
            builder5.font(C19469R.styleable.PollView_streamUiPollCloseFontAssets, C19469R.styleable.PollView_streamUiPollCloseTextFont);
            builder5.style(C19469R.styleable.PollView_streamUiPollCloseTextStyle, 0);
            TextStyle textStyleBuild5 = builder5.build();
            TextStyle.Builder builder6 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder6.size(C19469R.styleable.PollView_streamUiPollResultsTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder6.color(C19469R.styleable.PollView_streamUiPollResultsTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_accent_blue));
            builder6.font(C19469R.styleable.PollView_streamUiPollResultsFontAssets, C19469R.styleable.PollView_streamUiPollResultsTextFont);
            builder6.style(C19469R.styleable.PollView_streamUiPollResultsTextStyle, 0);
            TextStyle textStyleBuild6 = builder6.build();
            TextStyle.Builder builder7 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder7.size(C19469R.styleable.PollView_streamUiPollShowAllOptionsTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder7.color(C19469R.styleable.PollView_streamUiPollShowAllOptionsTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_accent_blue));
            builder7.font(C19469R.styleable.PollView_streamUiPollShowAllOptionsFontAssets, C19469R.styleable.PollView_streamUiPollShowAllOptionsTextFont);
            builder7.style(C19469R.styleable.PollView_streamUiPollShowAllOptionsTextStyle, 0);
            TextStyle textStyleBuild7 = builder7.build();
            TextStyle.Builder builder8 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder8.size(C19469R.styleable.PollView_streamUiPollSuggestOptionTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder8.color(C19469R.styleable.PollView_streamUiPollSuggestOptionTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_accent_blue));
            builder8.font(C19469R.styleable.PollView_streamUiPollSuggestOptionFontAssets, C19469R.styleable.PollView_streamUiPollSuggestOptionTextFont);
            builder8.style(C19469R.styleable.PollView_streamUiPollSuggestOptionTextStyle, 0);
            TextStyle textStyleBuild8 = builder8.build();
            TextStyle.Builder builder9 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder9.size(C19469R.styleable.PollView_streamUiPollAddCommentTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder9.color(C19469R.styleable.PollView_streamUiPollAddCommentTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_accent_blue));
            builder9.font(C19469R.styleable.PollView_streamUiPollAddCommentFontAssets, C19469R.styleable.PollView_streamUiPollAddCommentTextFont);
            builder9.style(C19469R.styleable.PollView_streamUiPollAddCommentTextStyle, 0);
            TextStyle textStyleBuild9 = builder9.build();
            TextStyle.Builder builder10 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder10.size(C19469R.styleable.PollView_streamUiPollViewCommentsTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder10.color(C19469R.styleable.PollView_streamUiPollViewCommentsTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_accent_blue));
            builder10.font(C19469R.styleable.PollView_streamUiPollViewCommentsFontAssets, C19469R.styleable.PollView_streamUiPollViewCommentsTextFont);
            builder10.style(C19469R.styleable.PollView_streamUiPollViewCommentsTextStyle, 0);
            return TransformStyle.getPollViewStyleTransformer().transform(new PollViewStyle(textStyleBuild, textStyleBuild2, drawable2, textStyleBuild3, textStyleBuild4, textStyleBuild5, textStyleBuild6, textStyleBuild7, textStyleBuild8, textStyleBuild9, builder10.build()));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public PollViewStyle(TextStyle pollTitleTextStyle, TextStyle pollSubtitleTextStyle, Drawable pollOptionCheckDrawable, TextStyle pollOptionTextStyle, TextStyle pollOptionVotesTextStyle, TextStyle pollCloseTextStyle, TextStyle pollResultsTextStyle, TextStyle pollShowAllOptionsTextStyle, TextStyle pollSuggestOptionTextStyle, TextStyle pollAddCommentTextStyle, TextStyle pollViewCommentsTextStyle) {
        AbstractC22676k.m65750j(pollTitleTextStyle, "pollTitleTextStyle");
        AbstractC22676k.m65750j(pollSubtitleTextStyle, "pollSubtitleTextStyle");
        AbstractC22676k.m65750j(pollOptionCheckDrawable, "pollOptionCheckDrawable");
        AbstractC22676k.m65750j(pollOptionTextStyle, "pollOptionTextStyle");
        AbstractC22676k.m65750j(pollOptionVotesTextStyle, "pollOptionVotesTextStyle");
        AbstractC22676k.m65750j(pollCloseTextStyle, "pollCloseTextStyle");
        AbstractC22676k.m65750j(pollResultsTextStyle, "pollResultsTextStyle");
        AbstractC22676k.m65750j(pollShowAllOptionsTextStyle, "pollShowAllOptionsTextStyle");
        AbstractC22676k.m65750j(pollSuggestOptionTextStyle, "pollSuggestOptionTextStyle");
        AbstractC22676k.m65750j(pollAddCommentTextStyle, "pollAddCommentTextStyle");
        AbstractC22676k.m65750j(pollViewCommentsTextStyle, "pollViewCommentsTextStyle");
        this.pollTitleTextStyle = pollTitleTextStyle;
        this.pollSubtitleTextStyle = pollSubtitleTextStyle;
        this.pollOptionCheckDrawable = pollOptionCheckDrawable;
        this.pollOptionTextStyle = pollOptionTextStyle;
        this.pollOptionVotesTextStyle = pollOptionVotesTextStyle;
        this.pollCloseTextStyle = pollCloseTextStyle;
        this.pollResultsTextStyle = pollResultsTextStyle;
        this.pollShowAllOptionsTextStyle = pollShowAllOptionsTextStyle;
        this.pollSuggestOptionTextStyle = pollSuggestOptionTextStyle;
        this.pollAddCommentTextStyle = pollAddCommentTextStyle;
        this.pollViewCommentsTextStyle = pollViewCommentsTextStyle;
    }

    public static /* synthetic */ PollViewStyle copy$default(PollViewStyle pollViewStyle, TextStyle textStyle, TextStyle textStyle2, Drawable drawable, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textStyle = pollViewStyle.pollTitleTextStyle;
        }
        if ((i13 & 2) != 0) {
            textStyle2 = pollViewStyle.pollSubtitleTextStyle;
        }
        if ((i13 & 4) != 0) {
            drawable = pollViewStyle.pollOptionCheckDrawable;
        }
        if ((i13 & 8) != 0) {
            textStyle3 = pollViewStyle.pollOptionTextStyle;
        }
        if ((i13 & 16) != 0) {
            textStyle4 = pollViewStyle.pollOptionVotesTextStyle;
        }
        if ((i13 & 32) != 0) {
            textStyle5 = pollViewStyle.pollCloseTextStyle;
        }
        if ((i13 & 64) != 0) {
            textStyle6 = pollViewStyle.pollResultsTextStyle;
        }
        if ((i13 & 128) != 0) {
            textStyle7 = pollViewStyle.pollShowAllOptionsTextStyle;
        }
        if ((i13 & 256) != 0) {
            textStyle8 = pollViewStyle.pollSuggestOptionTextStyle;
        }
        if ((i13 & 512) != 0) {
            textStyle9 = pollViewStyle.pollAddCommentTextStyle;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            textStyle10 = pollViewStyle.pollViewCommentsTextStyle;
        }
        TextStyle textStyle11 = textStyle9;
        TextStyle textStyle12 = textStyle10;
        TextStyle textStyle13 = textStyle7;
        TextStyle textStyle14 = textStyle8;
        TextStyle textStyle15 = textStyle5;
        TextStyle textStyle16 = textStyle6;
        TextStyle textStyle17 = textStyle4;
        Drawable drawable2 = drawable;
        return pollViewStyle.copy(textStyle, textStyle2, drawable2, textStyle3, textStyle17, textStyle15, textStyle16, textStyle13, textStyle14, textStyle11, textStyle12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextStyle getPollTitleTextStyle() {
        return this.pollTitleTextStyle;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final TextStyle getPollAddCommentTextStyle() {
        return this.pollAddCommentTextStyle;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final TextStyle getPollViewCommentsTextStyle() {
        return this.pollViewCommentsTextStyle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextStyle getPollSubtitleTextStyle() {
        return this.pollSubtitleTextStyle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Drawable getPollOptionCheckDrawable() {
        return this.pollOptionCheckDrawable;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextStyle getPollOptionTextStyle() {
        return this.pollOptionTextStyle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextStyle getPollOptionVotesTextStyle() {
        return this.pollOptionVotesTextStyle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TextStyle getPollCloseTextStyle() {
        return this.pollCloseTextStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TextStyle getPollResultsTextStyle() {
        return this.pollResultsTextStyle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TextStyle getPollShowAllOptionsTextStyle() {
        return this.pollShowAllOptionsTextStyle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TextStyle getPollSuggestOptionTextStyle() {
        return this.pollSuggestOptionTextStyle;
    }

    public final PollViewStyle copy(TextStyle pollTitleTextStyle, TextStyle pollSubtitleTextStyle, Drawable pollOptionCheckDrawable, TextStyle pollOptionTextStyle, TextStyle pollOptionVotesTextStyle, TextStyle pollCloseTextStyle, TextStyle pollResultsTextStyle, TextStyle pollShowAllOptionsTextStyle, TextStyle pollSuggestOptionTextStyle, TextStyle pollAddCommentTextStyle, TextStyle pollViewCommentsTextStyle) {
        AbstractC22676k.m65750j(pollTitleTextStyle, "pollTitleTextStyle");
        AbstractC22676k.m65750j(pollSubtitleTextStyle, "pollSubtitleTextStyle");
        AbstractC22676k.m65750j(pollOptionCheckDrawable, "pollOptionCheckDrawable");
        AbstractC22676k.m65750j(pollOptionTextStyle, "pollOptionTextStyle");
        AbstractC22676k.m65750j(pollOptionVotesTextStyle, "pollOptionVotesTextStyle");
        AbstractC22676k.m65750j(pollCloseTextStyle, "pollCloseTextStyle");
        AbstractC22676k.m65750j(pollResultsTextStyle, "pollResultsTextStyle");
        AbstractC22676k.m65750j(pollShowAllOptionsTextStyle, "pollShowAllOptionsTextStyle");
        AbstractC22676k.m65750j(pollSuggestOptionTextStyle, "pollSuggestOptionTextStyle");
        AbstractC22676k.m65750j(pollAddCommentTextStyle, "pollAddCommentTextStyle");
        AbstractC22676k.m65750j(pollViewCommentsTextStyle, "pollViewCommentsTextStyle");
        return new PollViewStyle(pollTitleTextStyle, pollSubtitleTextStyle, pollOptionCheckDrawable, pollOptionTextStyle, pollOptionVotesTextStyle, pollCloseTextStyle, pollResultsTextStyle, pollShowAllOptionsTextStyle, pollSuggestOptionTextStyle, pollAddCommentTextStyle, pollViewCommentsTextStyle);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollViewStyle)) {
            return false;
        }
        PollViewStyle pollViewStyle = (PollViewStyle) other;
        return AbstractC22676k.m65745e(this.pollTitleTextStyle, pollViewStyle.pollTitleTextStyle) && AbstractC22676k.m65745e(this.pollSubtitleTextStyle, pollViewStyle.pollSubtitleTextStyle) && AbstractC22676k.m65745e(this.pollOptionCheckDrawable, pollViewStyle.pollOptionCheckDrawable) && AbstractC22676k.m65745e(this.pollOptionTextStyle, pollViewStyle.pollOptionTextStyle) && AbstractC22676k.m65745e(this.pollOptionVotesTextStyle, pollViewStyle.pollOptionVotesTextStyle) && AbstractC22676k.m65745e(this.pollCloseTextStyle, pollViewStyle.pollCloseTextStyle) && AbstractC22676k.m65745e(this.pollResultsTextStyle, pollViewStyle.pollResultsTextStyle) && AbstractC22676k.m65745e(this.pollShowAllOptionsTextStyle, pollViewStyle.pollShowAllOptionsTextStyle) && AbstractC22676k.m65745e(this.pollSuggestOptionTextStyle, pollViewStyle.pollSuggestOptionTextStyle) && AbstractC22676k.m65745e(this.pollAddCommentTextStyle, pollViewStyle.pollAddCommentTextStyle) && AbstractC22676k.m65745e(this.pollViewCommentsTextStyle, pollViewStyle.pollViewCommentsTextStyle);
    }

    public final TextStyle getPollAddCommentTextStyle() {
        return this.pollAddCommentTextStyle;
    }

    public final TextStyle getPollCloseTextStyle() {
        return this.pollCloseTextStyle;
    }

    public final Drawable getPollOptionCheckDrawable() {
        return this.pollOptionCheckDrawable;
    }

    public final TextStyle getPollOptionTextStyle() {
        return this.pollOptionTextStyle;
    }

    public final TextStyle getPollOptionVotesTextStyle() {
        return this.pollOptionVotesTextStyle;
    }

    public final TextStyle getPollResultsTextStyle() {
        return this.pollResultsTextStyle;
    }

    public final TextStyle getPollShowAllOptionsTextStyle() {
        return this.pollShowAllOptionsTextStyle;
    }

    public final TextStyle getPollSubtitleTextStyle() {
        return this.pollSubtitleTextStyle;
    }

    public final TextStyle getPollSuggestOptionTextStyle() {
        return this.pollSuggestOptionTextStyle;
    }

    public final TextStyle getPollTitleTextStyle() {
        return this.pollTitleTextStyle;
    }

    public final TextStyle getPollViewCommentsTextStyle() {
        return this.pollViewCommentsTextStyle;
    }

    public final int hashCode() {
        return this.pollViewCommentsTextStyle.hashCode() + AbstractC26725a.m79499c(this.pollAddCommentTextStyle, AbstractC26725a.m79499c(this.pollSuggestOptionTextStyle, AbstractC26725a.m79499c(this.pollShowAllOptionsTextStyle, AbstractC26725a.m79499c(this.pollResultsTextStyle, AbstractC26725a.m79499c(this.pollCloseTextStyle, AbstractC26725a.m79499c(this.pollOptionVotesTextStyle, AbstractC26725a.m79499c(this.pollOptionTextStyle, AbstractC26725a.m79497a(this.pollOptionCheckDrawable, AbstractC26725a.m79499c(this.pollSubtitleTextStyle, this.pollTitleTextStyle.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "PollViewStyle(pollTitleTextStyle=" + this.pollTitleTextStyle + ", pollSubtitleTextStyle=" + this.pollSubtitleTextStyle + ", pollOptionCheckDrawable=" + this.pollOptionCheckDrawable + ", pollOptionTextStyle=" + this.pollOptionTextStyle + ", pollOptionVotesTextStyle=" + this.pollOptionVotesTextStyle + ", pollCloseTextStyle=" + this.pollCloseTextStyle + ", pollResultsTextStyle=" + this.pollResultsTextStyle + ", pollShowAllOptionsTextStyle=" + this.pollShowAllOptionsTextStyle + ", pollSuggestOptionTextStyle=" + this.pollSuggestOptionTextStyle + ", pollAddCommentTextStyle=" + this.pollAddCommentTextStyle + ", pollViewCommentsTextStyle=" + this.pollViewCommentsTextStyle + ")";
    }

    public /* synthetic */ PollViewStyle(TextStyle textStyle, TextStyle textStyle2, Drawable drawable, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textStyle, textStyle2, drawable, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, (i13 & 256) != 0 ? new TextStyle(0, null, 0, 0, 0, null, 0, null, 255, null) : textStyle8, (i13 & 512) != 0 ? new TextStyle(0, null, 0, 0, 0, null, 0, null, 255, null) : textStyle9, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? new TextStyle(0, null, 0, 0, 0, null, 0, null, 255, null) : textStyle10);
    }
}
