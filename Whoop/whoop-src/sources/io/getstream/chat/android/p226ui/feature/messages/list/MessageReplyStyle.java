package io.getstream.chat.android.p226ui.feature.messages.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p479s4.AbstractC32122c;
import p513u4.AbstractC34523k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 :2\u00020\u0001:\u0001:B\u0081\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\u008b\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0003\u0010\u000f\u001a\u00020\u00102\b\b\u0003\u0010\u0011\u001a\u00020\u00052\b\b\u0003\u0010\u0012\u001a\u00020\u0010HÆ\u0001J\u0013\u00104\u001a\u00020\u00032\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\u0005HÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#¨\u0006;"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "showUserAvatar", "", "messageBackgroundColorMine", "", "messageBackgroundColorTheirs", "linkBackgroundColorMine", "linkBackgroundColorTheirs", "textStyleMine", "Lio/getstream/chat/android/ui/font/TextStyle;", "textStyleTheirs", "linkStyleMine", "linkStyleTheirs", "messageStrokeColorMine", "messageStrokeWidthMine", "", "messageStrokeColorTheirs", "messageStrokeWidthTheirs", "<init>", "(ZIIIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;IFIF)V", "getShowUserAvatar", "()Z", "getMessageBackgroundColorMine", "()I", "getMessageBackgroundColorTheirs", "getLinkBackgroundColorMine", "getLinkBackgroundColorTheirs", "getTextStyleMine", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getTextStyleTheirs", "getLinkStyleMine", "getLinkStyleTheirs", "getMessageStrokeColorMine", "getMessageStrokeWidthMine", "()F", "getMessageStrokeColorTheirs", "getMessageStrokeWidthTheirs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageReplyStyle implements ViewStyle {
    public static final int DEFAULT_TEXT_STYLE = 0;
    public static final float MESSAGE_STROKE_WIDTH_MINE = 0.0f;
    private static final int VALUE_NOT_SET = Integer.MAX_VALUE;
    private final int linkBackgroundColorMine;
    private final int linkBackgroundColorTheirs;
    private final TextStyle linkStyleMine;
    private final TextStyle linkStyleTheirs;
    private final int messageBackgroundColorMine;
    private final int messageBackgroundColorTheirs;
    private final int messageStrokeColorMine;
    private final int messageStrokeColorTheirs;
    private final float messageStrokeWidthMine;
    private final float messageStrokeWidthTheirs;
    private final boolean showUserAvatar;
    private final TextStyle textStyleMine;
    private final TextStyle textStyleTheirs;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final InterfaceC23462h MESSAGE_STROKE_WIDTH_THEIRS$delegate = AbstractC30060g.m92088H(new C19728a(18));
    private static final int DEFAULT_TEXT_COLOR = C19469R.color.stream_ui_text_color_primary;
    private static final int DEFAULT_TEXT_SIZE = C19469R.dimen.stream_ui_text_medium;
    private static final int MESSAGE_STROKE_COLOR_MINE = C19469R.color.stream_ui_literal_transparent;
    private static final int MESSAGE_STROKE_COLOR_THEIRS = C19469R.color.stream_ui_grey_whisper;

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013R\u0014\u0010\u001e\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle$Companion;", "", "<init>", "()V", "Landroid/content/res/TypedArray;", "attributes", "Landroid/content/Context;", "context", "Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;", "invoke", "(Landroid/content/res/TypedArray;Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;", "", "MESSAGE_STROKE_WIDTH_THEIRS$delegate", "Ll83/h;", "getMESSAGE_STROKE_WIDTH_THEIRS", "()F", "MESSAGE_STROKE_WIDTH_THEIRS", "", "DEFAULT_TEXT_COLOR", "I", "getDEFAULT_TEXT_COLOR$stream_chat_android_ui_components_release", "()I", "DEFAULT_TEXT_SIZE", "getDEFAULT_TEXT_SIZE$stream_chat_android_ui_components_release", "MESSAGE_STROKE_COLOR_MINE", "getMESSAGE_STROKE_COLOR_MINE$stream_chat_android_ui_components_release", "MESSAGE_STROKE_COLOR_THEIRS", "getMESSAGE_STROKE_COLOR_THEIRS$stream_chat_android_ui_components_release", "VALUE_NOT_SET", "DEFAULT_TEXT_STYLE", "MESSAGE_STROKE_WIDTH_MINE", "F", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final float getMESSAGE_STROKE_WIDTH_THEIRS() {
            return ((Number) MessageReplyStyle.MESSAGE_STROKE_WIDTH_THEIRS$delegate.getValue()).floatValue();
        }

        public final int getDEFAULT_TEXT_COLOR$stream_chat_android_ui_components_release() {
            return MessageReplyStyle.DEFAULT_TEXT_COLOR;
        }

        public final int getDEFAULT_TEXT_SIZE$stream_chat_android_ui_components_release() {
            return MessageReplyStyle.DEFAULT_TEXT_SIZE;
        }

        /* JADX INFO: renamed from: getMESSAGE_STROKE_COLOR_MINE$stream_chat_android_ui_components_release */
        public final int m55424x3b5abdb5() {
            return MessageReplyStyle.MESSAGE_STROKE_COLOR_MINE;
        }

        /* JADX INFO: renamed from: getMESSAGE_STROKE_COLOR_THEIRS$stream_chat_android_ui_components_release */
        public final int m55425x453a8afb() {
            return MessageReplyStyle.MESSAGE_STROKE_COLOR_THEIRS;
        }

        public final MessageReplyStyle invoke(TypedArray attributes, Context context) {
            AbstractC22676k.m65750j(attributes, "attributes");
            AbstractC22676k.m65750j(context, "context");
            boolean z4 = attributes.getBoolean(C19469R.styleable.MessageListView_streamUiMessageReplyShowUserAvatar, true);
            int color = attributes.getColor(C19469R.styleable.MessageListView_streamUiMessageReplyBackgroundColorMine, Integer.MAX_VALUE);
            int color2 = attributes.getColor(C19469R.styleable.MessageListView_streamUiMessageReplyBackgroundColorTheirs, Integer.MAX_VALUE);
            int color3 = attributes.getColor(C19469R.styleable.MessageListView_streamUiMessageReplyLinkBackgroundColorMine, Integer.MAX_VALUE);
            int color4 = attributes.getColor(C19469R.styleable.MessageListView_streamUiMessageReplyLinkBackgroundColorTheirs, Integer.MAX_VALUE);
            Typeface typefaceM109098b = AbstractC34523k.m109098b(context, C19470R.font.stream_roboto_medium);
            if (typefaceM109098b == null) {
                typefaceM109098b = Typeface.DEFAULT;
            }
            TextStyle.Builder builder = new TextStyle.Builder(attributes);
            builder.size(C19469R.styleable.MessageListView_streamUiMessageReplyTextSizeMine, ContextKt.getDimension(context, MessageReplyStyle.DEFAULT_TEXT_SIZE));
            builder.color(C19469R.styleable.MessageListView_streamUiMessageReplyTextColorMine, AbstractC32122c.getColor(context, MessageReplyStyle.DEFAULT_TEXT_COLOR));
            int i13 = C19469R.styleable.MessageListView_streamUiMessageReplyTextFontAssetsMine;
            int i14 = C19469R.styleable.MessageListView_streamUiMessageReplyTextFontMine;
            AbstractC22676k.m65747g(typefaceM109098b);
            builder.font(i13, i14, typefaceM109098b);
            builder.style(C19469R.styleable.MessageListView_streamUiMessageReplyTextStyleMine, 0);
            TextStyle textStyleBuild = builder.build();
            TextStyle.Builder builder2 = new TextStyle.Builder(attributes);
            builder2.size(C19469R.styleable.MessageListView_streamUiMessageReplyTextSizeTheirs, ContextKt.getDimension(context, MessageReplyStyle.DEFAULT_TEXT_SIZE));
            builder2.color(C19469R.styleable.MessageListView_streamUiMessageReplyTextColorTheirs, AbstractC32122c.getColor(context, MessageReplyStyle.DEFAULT_TEXT_COLOR));
            builder2.font(C19469R.styleable.MessageListView_streamUiMessageReplyTextFontAssetsTheirs, C19469R.styleable.MessageListView_streamUiMessageReplyTextFontTheirs, typefaceM109098b);
            builder2.style(C19469R.styleable.MessageListView_streamUiMessageReplyTextStyleTheirs, 0);
            TextStyle textStyleBuild2 = builder2.build();
            TextStyle.Builder builder3 = new TextStyle.Builder(attributes);
            builder3.color(C19469R.styleable.MessageListView_streamUiMessageReplyLinkColorTheirs, Integer.MAX_VALUE);
            TextStyle textStyleBuild3 = builder3.build();
            TextStyle.Builder builder4 = new TextStyle.Builder(attributes);
            builder4.color(C19469R.styleable.MessageListView_streamUiMessageReplyLinkColorMine, Integer.MAX_VALUE);
            return TransformStyle.getMessageReplyStyleTransformer().transform(new MessageReplyStyle(z4, color, color2, color3, color4, textStyleBuild, textStyleBuild2, builder4.build(), textStyleBuild3, attributes.getColor(C19469R.styleable.MessageListView_streamUiMessageReplyStrokeColorMine, AbstractC32122c.getColor(context, MessageReplyStyle.MESSAGE_STROKE_COLOR_MINE)), attributes.getDimension(C19469R.styleable.MessageListView_streamUiMessageReplyStrokeWidthMine, 0.0f), attributes.getColor(C19469R.styleable.MessageListView_streamUiMessageReplyStrokeColorTheirs, AbstractC32122c.getColor(context, MessageReplyStyle.MESSAGE_STROKE_COLOR_THEIRS)), attributes.getDimension(C19469R.styleable.MessageListView_streamUiMessageReplyStrokeWidthTheirs, getMESSAGE_STROKE_WIDTH_THEIRS())));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public MessageReplyStyle(boolean z4, int i13, int i14, int i15, int i16, TextStyle textStyleMine, TextStyle textStyleTheirs, TextStyle linkStyleMine, TextStyle linkStyleTheirs, int i17, float f13, int i18, float f14) {
        AbstractC22676k.m65750j(textStyleMine, "textStyleMine");
        AbstractC22676k.m65750j(textStyleTheirs, "textStyleTheirs");
        AbstractC22676k.m65750j(linkStyleMine, "linkStyleMine");
        AbstractC22676k.m65750j(linkStyleTheirs, "linkStyleTheirs");
        this.showUserAvatar = z4;
        this.messageBackgroundColorMine = i13;
        this.messageBackgroundColorTheirs = i14;
        this.linkBackgroundColorMine = i15;
        this.linkBackgroundColorTheirs = i16;
        this.textStyleMine = textStyleMine;
        this.textStyleTheirs = textStyleTheirs;
        this.linkStyleMine = linkStyleMine;
        this.linkStyleTheirs = linkStyleTheirs;
        this.messageStrokeColorMine = i17;
        this.messageStrokeWidthMine = f13;
        this.messageStrokeColorTheirs = i18;
        this.messageStrokeWidthTheirs = f14;
    }

    public static /* synthetic */ MessageReplyStyle copy$default(MessageReplyStyle messageReplyStyle, boolean z4, int i13, int i14, int i15, int i16, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, int i17, float f13, int i18, float f14, int i19, Object obj) {
        if ((i19 & 1) != 0) {
            z4 = messageReplyStyle.showUserAvatar;
        }
        return messageReplyStyle.copy(z4, (i19 & 2) != 0 ? messageReplyStyle.messageBackgroundColorMine : i13, (i19 & 4) != 0 ? messageReplyStyle.messageBackgroundColorTheirs : i14, (i19 & 8) != 0 ? messageReplyStyle.linkBackgroundColorMine : i15, (i19 & 16) != 0 ? messageReplyStyle.linkBackgroundColorTheirs : i16, (i19 & 32) != 0 ? messageReplyStyle.textStyleMine : textStyle, (i19 & 64) != 0 ? messageReplyStyle.textStyleTheirs : textStyle2, (i19 & 128) != 0 ? messageReplyStyle.linkStyleMine : textStyle3, (i19 & 256) != 0 ? messageReplyStyle.linkStyleTheirs : textStyle4, (i19 & 512) != 0 ? messageReplyStyle.messageStrokeColorMine : i17, (i19 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageReplyStyle.messageStrokeWidthMine : f13, (i19 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageReplyStyle.messageStrokeColorTheirs : i18, (i19 & 4096) != 0 ? messageReplyStyle.messageStrokeWidthTheirs : f14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowUserAvatar() {
        return this.showUserAvatar;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getMessageStrokeColorMine() {
        return this.messageStrokeColorMine;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getMessageStrokeWidthMine() {
        return this.messageStrokeWidthMine;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getMessageStrokeColorTheirs() {
        return this.messageStrokeColorTheirs;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final float getMessageStrokeWidthTheirs() {
        return this.messageStrokeWidthTheirs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMessageBackgroundColorMine() {
        return this.messageBackgroundColorMine;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMessageBackgroundColorTheirs() {
        return this.messageBackgroundColorTheirs;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLinkBackgroundColorMine() {
        return this.linkBackgroundColorMine;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLinkBackgroundColorTheirs() {
        return this.linkBackgroundColorTheirs;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TextStyle getTextStyleMine() {
        return this.textStyleMine;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TextStyle getTextStyleTheirs() {
        return this.textStyleTheirs;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TextStyle getLinkStyleMine() {
        return this.linkStyleMine;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TextStyle getLinkStyleTheirs() {
        return this.linkStyleTheirs;
    }

    public final MessageReplyStyle copy(boolean showUserAvatar, int messageBackgroundColorMine, int messageBackgroundColorTheirs, int linkBackgroundColorMine, int linkBackgroundColorTheirs, TextStyle textStyleMine, TextStyle textStyleTheirs, TextStyle linkStyleMine, TextStyle linkStyleTheirs, int messageStrokeColorMine, float messageStrokeWidthMine, int messageStrokeColorTheirs, float messageStrokeWidthTheirs) {
        AbstractC22676k.m65750j(textStyleMine, "textStyleMine");
        AbstractC22676k.m65750j(textStyleTheirs, "textStyleTheirs");
        AbstractC22676k.m65750j(linkStyleMine, "linkStyleMine");
        AbstractC22676k.m65750j(linkStyleTheirs, "linkStyleTheirs");
        return new MessageReplyStyle(showUserAvatar, messageBackgroundColorMine, messageBackgroundColorTheirs, linkBackgroundColorMine, linkBackgroundColorTheirs, textStyleMine, textStyleTheirs, linkStyleMine, linkStyleTheirs, messageStrokeColorMine, messageStrokeWidthMine, messageStrokeColorTheirs, messageStrokeWidthTheirs);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageReplyStyle)) {
            return false;
        }
        MessageReplyStyle messageReplyStyle = (MessageReplyStyle) other;
        return this.showUserAvatar == messageReplyStyle.showUserAvatar && this.messageBackgroundColorMine == messageReplyStyle.messageBackgroundColorMine && this.messageBackgroundColorTheirs == messageReplyStyle.messageBackgroundColorTheirs && this.linkBackgroundColorMine == messageReplyStyle.linkBackgroundColorMine && this.linkBackgroundColorTheirs == messageReplyStyle.linkBackgroundColorTheirs && AbstractC22676k.m65745e(this.textStyleMine, messageReplyStyle.textStyleMine) && AbstractC22676k.m65745e(this.textStyleTheirs, messageReplyStyle.textStyleTheirs) && AbstractC22676k.m65745e(this.linkStyleMine, messageReplyStyle.linkStyleMine) && AbstractC22676k.m65745e(this.linkStyleTheirs, messageReplyStyle.linkStyleTheirs) && this.messageStrokeColorMine == messageReplyStyle.messageStrokeColorMine && Float.compare(this.messageStrokeWidthMine, messageReplyStyle.messageStrokeWidthMine) == 0 && this.messageStrokeColorTheirs == messageReplyStyle.messageStrokeColorTheirs && Float.compare(this.messageStrokeWidthTheirs, messageReplyStyle.messageStrokeWidthTheirs) == 0;
    }

    public final int getLinkBackgroundColorMine() {
        return this.linkBackgroundColorMine;
    }

    public final int getLinkBackgroundColorTheirs() {
        return this.linkBackgroundColorTheirs;
    }

    public final TextStyle getLinkStyleMine() {
        return this.linkStyleMine;
    }

    public final TextStyle getLinkStyleTheirs() {
        return this.linkStyleTheirs;
    }

    public final int getMessageBackgroundColorMine() {
        return this.messageBackgroundColorMine;
    }

    public final int getMessageBackgroundColorTheirs() {
        return this.messageBackgroundColorTheirs;
    }

    public final int getMessageStrokeColorMine() {
        return this.messageStrokeColorMine;
    }

    public final int getMessageStrokeColorTheirs() {
        return this.messageStrokeColorTheirs;
    }

    public final float getMessageStrokeWidthMine() {
        return this.messageStrokeWidthMine;
    }

    public final float getMessageStrokeWidthTheirs() {
        return this.messageStrokeWidthTheirs;
    }

    public final boolean getShowUserAvatar() {
        return this.showUserAvatar;
    }

    public final TextStyle getTextStyleMine() {
        return this.textStyleMine;
    }

    public final TextStyle getTextStyleTheirs() {
        return this.textStyleTheirs;
    }

    public final int hashCode() {
        return Float.hashCode(this.messageStrokeWidthTheirs) + AbstractC11266d.m30448b(this.messageStrokeColorTheirs, AbstractC11266d.m30447a(this.messageStrokeWidthMine, AbstractC11266d.m30448b(this.messageStrokeColorMine, AbstractC26725a.m79499c(this.linkStyleTheirs, AbstractC26725a.m79499c(this.linkStyleMine, AbstractC26725a.m79499c(this.textStyleTheirs, AbstractC26725a.m79499c(this.textStyleMine, AbstractC11266d.m30448b(this.linkBackgroundColorTheirs, AbstractC11266d.m30448b(this.linkBackgroundColorMine, AbstractC11266d.m30448b(this.messageBackgroundColorTheirs, AbstractC11266d.m30448b(this.messageBackgroundColorMine, Boolean.hashCode(this.showUserAvatar) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        boolean z4 = this.showUserAvatar;
        int i13 = this.messageBackgroundColorMine;
        int i14 = this.messageBackgroundColorTheirs;
        int i15 = this.linkBackgroundColorMine;
        int i16 = this.linkBackgroundColorTheirs;
        TextStyle textStyle = this.textStyleMine;
        TextStyle textStyle2 = this.textStyleTheirs;
        TextStyle textStyle3 = this.linkStyleMine;
        TextStyle textStyle4 = this.linkStyleTheirs;
        int i17 = this.messageStrokeColorMine;
        float f13 = this.messageStrokeWidthMine;
        int i18 = this.messageStrokeColorTheirs;
        float f14 = this.messageStrokeWidthTheirs;
        StringBuilder sb4 = new StringBuilder("MessageReplyStyle(showUserAvatar=");
        sb4.append(z4);
        sb4.append(", messageBackgroundColorMine=");
        sb4.append(i13);
        sb4.append(", messageBackgroundColorTheirs=");
        AbstractC30802r.m94773v(sb4, i14, ", linkBackgroundColorMine=", i15, ", linkBackgroundColorTheirs=");
        sb4.append(i16);
        sb4.append(", textStyleMine=");
        sb4.append(textStyle);
        sb4.append(", textStyleTheirs=");
        sb4.append(textStyle2);
        sb4.append(", linkStyleMine=");
        sb4.append(textStyle3);
        sb4.append(", linkStyleTheirs=");
        sb4.append(textStyle4);
        sb4.append(", messageStrokeColorMine=");
        sb4.append(i17);
        sb4.append(", messageStrokeWidthMine=");
        sb4.append(f13);
        sb4.append(", messageStrokeColorTheirs=");
        sb4.append(i18);
        sb4.append(", messageStrokeWidthTheirs=");
        return AbstractC30007c.m91837g(f14, ")", sb4);
    }

    public /* synthetic */ MessageReplyStyle(boolean z4, int i13, int i14, int i15, int i16, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, int i17, float f13, int i18, float f14, int i19, DefaultConstructorMarker defaultConstructorMarker) {
        this((i19 & 1) != 0 ? true : z4, i13, i14, i15, i16, textStyle, textStyle2, textStyle3, textStyle4, i17, f13, i18, f14);
    }
}
