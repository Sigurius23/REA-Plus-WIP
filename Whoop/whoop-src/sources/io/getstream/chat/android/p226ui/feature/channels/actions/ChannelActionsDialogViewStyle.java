package io.getstream.chat.android.p226ui.feature.channels.actions;

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
import p031b9.AbstractC2875y;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 92\u00020\u0001:\u00019Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\u008b\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\bHÆ\u0001J\u0013\u00102\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001a¨\u0006:"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "memberNamesTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "memberInfoTextStyle", "itemTextStyle", "warningItemTextStyle", "viewInfoIcon", "Landroid/graphics/drawable/Drawable;", "viewInfoEnabled", "", "leaveGroupIcon", "leaveGroupEnabled", "deleteConversationIcon", "deleteConversationEnabled", "cancelIcon", "cancelEnabled", "background", "<init>", "(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;)V", "getMemberNamesTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getMemberInfoTextStyle", "getItemTextStyle", "getWarningItemTextStyle", "getViewInfoIcon", "()Landroid/graphics/drawable/Drawable;", "getViewInfoEnabled", "()Z", "getLeaveGroupIcon", "getLeaveGroupEnabled", "getDeleteConversationIcon", "getDeleteConversationEnabled", "getCancelIcon", "getCancelEnabled", "getBackground", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "", "hashCode", "", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelActionsDialogViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final Drawable background;
    private final boolean cancelEnabled;
    private final Drawable cancelIcon;
    private final boolean deleteConversationEnabled;
    private final Drawable deleteConversationIcon;
    private final TextStyle itemTextStyle;
    private final boolean leaveGroupEnabled;
    private final Drawable leaveGroupIcon;
    private final TextStyle memberInfoTextStyle;
    private final TextStyle memberNamesTextStyle;
    private final boolean viewInfoEnabled;
    private final Drawable viewInfoIcon;
    private final TextStyle warningItemTextStyle;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\u0002¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ChannelActionsDialogViewStyle invoke(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.ChannelListView, 0, 0);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.ChannelListView_streamUiChannelActionsDialogStyle, C19469R.style.StreamUi_ChannelList_ActionsDialog), C19469R.styleable.ChannelActionsDialog);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
            TextStyle.Builder builder = new TextStyle.Builder(typedArrayObtainStyledAttributes2);
            builder.size(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsMemberNamesTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder.color(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsMemberNamesTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder.font(C19469R.styleable.f74142x67f9e242, C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsMemberNamesTextFont);
            builder.style(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsMemberNamesTextStyle, 1);
            TextStyle textStyleBuild = builder.build();
            TextStyle.Builder builder2 = new TextStyle.Builder(typedArrayObtainStyledAttributes2);
            builder2.size(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsMemberInfoTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_small));
            builder2.color(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsMemberInfoTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder2.font(C19469R.styleable.f74141xf53c7f92, C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsMemberInfoTextFont);
            builder2.style(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsMemberInfoTextStyle, 0);
            TextStyle textStyleBuild2 = builder2.build();
            TextStyle.Builder builder3 = new TextStyle.Builder(typedArrayObtainStyledAttributes2);
            builder3.size(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsItemTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder3.color(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsItemTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder3.font(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsItemTextFontAssets, C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsItemTextFont);
            builder3.style(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsItemTextStyle, 1);
            TextStyle textStyleBuild3 = builder3.build();
            TextStyle.Builder builder4 = new TextStyle.Builder(typedArrayObtainStyledAttributes2);
            builder4.size(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsWarningItemTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder4.color(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsWarningItemTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_accent_red));
            builder4.font(C19469R.styleable.f74143xb866d083, C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsWarningItemTextFont);
            builder4.style(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsWarningItemTextStyle, 1);
            TextStyle textStyleBuild4 = builder4.build();
            Drawable drawable = typedArrayObtainStyledAttributes2.getDrawable(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsViewInfoIcon);
            if (drawable == null) {
                drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_single_user);
                AbstractC22676k.m65747g(drawable);
            }
            Drawable drawable2 = drawable;
            boolean z4 = typedArrayObtainStyledAttributes2.getBoolean(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsViewInfoEnabled, false);
            Drawable drawable3 = typedArrayObtainStyledAttributes2.getDrawable(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsLeaveGroupIcon);
            if (drawable3 == null) {
                drawable3 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_leave_group);
                AbstractC22676k.m65747g(drawable3);
            }
            Drawable drawable4 = drawable3;
            boolean z13 = typedArrayObtainStyledAttributes2.getBoolean(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsLeaveGroupEnabled, true);
            Drawable drawable5 = typedArrayObtainStyledAttributes2.getDrawable(C19469R.styleable.f74140x79eff72);
            if (drawable5 == null) {
                drawable5 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_delete);
                AbstractC22676k.m65747g(drawable5);
            }
            Drawable drawable6 = drawable5;
            boolean z14 = typedArrayObtainStyledAttributes2.getBoolean(C19469R.styleable.f74139x1e23b9a8, true);
            Drawable drawable7 = typedArrayObtainStyledAttributes2.getDrawable(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsCancelIcon);
            if (drawable7 == null) {
                drawable7 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_clear);
                AbstractC22676k.m65747g(drawable7);
            }
            Drawable drawable8 = drawable7;
            boolean z15 = typedArrayObtainStyledAttributes2.getBoolean(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsCancelEnabled, true);
            Drawable drawable9 = typedArrayObtainStyledAttributes2.getDrawable(C19469R.styleable.ChannelActionsDialog_streamUiChannelActionsBackground);
            if (drawable9 == null) {
                drawable9 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_round_bottom_sheet);
                AbstractC22676k.m65747g(drawable9);
            }
            return TransformStyle.getChannelActionsDialogStyleTransformer().transform(new ChannelActionsDialogViewStyle(textStyleBuild, textStyleBuild2, textStyleBuild3, textStyleBuild4, drawable2, z4, drawable4, z13, drawable6, z14, drawable8, z15, drawable9));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ChannelActionsDialogViewStyle(TextStyle memberNamesTextStyle, TextStyle memberInfoTextStyle, TextStyle itemTextStyle, TextStyle warningItemTextStyle, Drawable viewInfoIcon, boolean z4, Drawable leaveGroupIcon, boolean z13, Drawable deleteConversationIcon, boolean z14, Drawable cancelIcon, boolean z15, Drawable background) {
        AbstractC22676k.m65750j(memberNamesTextStyle, "memberNamesTextStyle");
        AbstractC22676k.m65750j(memberInfoTextStyle, "memberInfoTextStyle");
        AbstractC22676k.m65750j(itemTextStyle, "itemTextStyle");
        AbstractC22676k.m65750j(warningItemTextStyle, "warningItemTextStyle");
        AbstractC22676k.m65750j(viewInfoIcon, "viewInfoIcon");
        AbstractC22676k.m65750j(leaveGroupIcon, "leaveGroupIcon");
        AbstractC22676k.m65750j(deleteConversationIcon, "deleteConversationIcon");
        AbstractC22676k.m65750j(cancelIcon, "cancelIcon");
        AbstractC22676k.m65750j(background, "background");
        this.memberNamesTextStyle = memberNamesTextStyle;
        this.memberInfoTextStyle = memberInfoTextStyle;
        this.itemTextStyle = itemTextStyle;
        this.warningItemTextStyle = warningItemTextStyle;
        this.viewInfoIcon = viewInfoIcon;
        this.viewInfoEnabled = z4;
        this.leaveGroupIcon = leaveGroupIcon;
        this.leaveGroupEnabled = z13;
        this.deleteConversationIcon = deleteConversationIcon;
        this.deleteConversationEnabled = z14;
        this.cancelIcon = cancelIcon;
        this.cancelEnabled = z15;
        this.background = background;
    }

    public static /* synthetic */ ChannelActionsDialogViewStyle copy$default(ChannelActionsDialogViewStyle channelActionsDialogViewStyle, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, Drawable drawable, boolean z4, Drawable drawable2, boolean z13, Drawable drawable3, boolean z14, Drawable drawable4, boolean z15, Drawable drawable5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textStyle = channelActionsDialogViewStyle.memberNamesTextStyle;
        }
        return channelActionsDialogViewStyle.copy(textStyle, (i13 & 2) != 0 ? channelActionsDialogViewStyle.memberInfoTextStyle : textStyle2, (i13 & 4) != 0 ? channelActionsDialogViewStyle.itemTextStyle : textStyle3, (i13 & 8) != 0 ? channelActionsDialogViewStyle.warningItemTextStyle : textStyle4, (i13 & 16) != 0 ? channelActionsDialogViewStyle.viewInfoIcon : drawable, (i13 & 32) != 0 ? channelActionsDialogViewStyle.viewInfoEnabled : z4, (i13 & 64) != 0 ? channelActionsDialogViewStyle.leaveGroupIcon : drawable2, (i13 & 128) != 0 ? channelActionsDialogViewStyle.leaveGroupEnabled : z13, (i13 & 256) != 0 ? channelActionsDialogViewStyle.deleteConversationIcon : drawable3, (i13 & 512) != 0 ? channelActionsDialogViewStyle.deleteConversationEnabled : z14, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? channelActionsDialogViewStyle.cancelIcon : drawable4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? channelActionsDialogViewStyle.cancelEnabled : z15, (i13 & 4096) != 0 ? channelActionsDialogViewStyle.background : drawable5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextStyle getMemberNamesTextStyle() {
        return this.memberNamesTextStyle;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getDeleteConversationEnabled() {
        return this.deleteConversationEnabled;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Drawable getCancelIcon() {
        return this.cancelIcon;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getCancelEnabled() {
        return this.cancelEnabled;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Drawable getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextStyle getMemberInfoTextStyle() {
        return this.memberInfoTextStyle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextStyle getItemTextStyle() {
        return this.itemTextStyle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextStyle getWarningItemTextStyle() {
        return this.warningItemTextStyle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Drawable getViewInfoIcon() {
        return this.viewInfoIcon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getViewInfoEnabled() {
        return this.viewInfoEnabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Drawable getLeaveGroupIcon() {
        return this.leaveGroupIcon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getLeaveGroupEnabled() {
        return this.leaveGroupEnabled;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Drawable getDeleteConversationIcon() {
        return this.deleteConversationIcon;
    }

    public final ChannelActionsDialogViewStyle copy(TextStyle memberNamesTextStyle, TextStyle memberInfoTextStyle, TextStyle itemTextStyle, TextStyle warningItemTextStyle, Drawable viewInfoIcon, boolean viewInfoEnabled, Drawable leaveGroupIcon, boolean leaveGroupEnabled, Drawable deleteConversationIcon, boolean deleteConversationEnabled, Drawable cancelIcon, boolean cancelEnabled, Drawable background) {
        AbstractC22676k.m65750j(memberNamesTextStyle, "memberNamesTextStyle");
        AbstractC22676k.m65750j(memberInfoTextStyle, "memberInfoTextStyle");
        AbstractC22676k.m65750j(itemTextStyle, "itemTextStyle");
        AbstractC22676k.m65750j(warningItemTextStyle, "warningItemTextStyle");
        AbstractC22676k.m65750j(viewInfoIcon, "viewInfoIcon");
        AbstractC22676k.m65750j(leaveGroupIcon, "leaveGroupIcon");
        AbstractC22676k.m65750j(deleteConversationIcon, "deleteConversationIcon");
        AbstractC22676k.m65750j(cancelIcon, "cancelIcon");
        AbstractC22676k.m65750j(background, "background");
        return new ChannelActionsDialogViewStyle(memberNamesTextStyle, memberInfoTextStyle, itemTextStyle, warningItemTextStyle, viewInfoIcon, viewInfoEnabled, leaveGroupIcon, leaveGroupEnabled, deleteConversationIcon, deleteConversationEnabled, cancelIcon, cancelEnabled, background);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelActionsDialogViewStyle)) {
            return false;
        }
        ChannelActionsDialogViewStyle channelActionsDialogViewStyle = (ChannelActionsDialogViewStyle) other;
        return AbstractC22676k.m65745e(this.memberNamesTextStyle, channelActionsDialogViewStyle.memberNamesTextStyle) && AbstractC22676k.m65745e(this.memberInfoTextStyle, channelActionsDialogViewStyle.memberInfoTextStyle) && AbstractC22676k.m65745e(this.itemTextStyle, channelActionsDialogViewStyle.itemTextStyle) && AbstractC22676k.m65745e(this.warningItemTextStyle, channelActionsDialogViewStyle.warningItemTextStyle) && AbstractC22676k.m65745e(this.viewInfoIcon, channelActionsDialogViewStyle.viewInfoIcon) && this.viewInfoEnabled == channelActionsDialogViewStyle.viewInfoEnabled && AbstractC22676k.m65745e(this.leaveGroupIcon, channelActionsDialogViewStyle.leaveGroupIcon) && this.leaveGroupEnabled == channelActionsDialogViewStyle.leaveGroupEnabled && AbstractC22676k.m65745e(this.deleteConversationIcon, channelActionsDialogViewStyle.deleteConversationIcon) && this.deleteConversationEnabled == channelActionsDialogViewStyle.deleteConversationEnabled && AbstractC22676k.m65745e(this.cancelIcon, channelActionsDialogViewStyle.cancelIcon) && this.cancelEnabled == channelActionsDialogViewStyle.cancelEnabled && AbstractC22676k.m65745e(this.background, channelActionsDialogViewStyle.background);
    }

    public final Drawable getBackground() {
        return this.background;
    }

    public final boolean getCancelEnabled() {
        return this.cancelEnabled;
    }

    public final Drawable getCancelIcon() {
        return this.cancelIcon;
    }

    public final boolean getDeleteConversationEnabled() {
        return this.deleteConversationEnabled;
    }

    public final Drawable getDeleteConversationIcon() {
        return this.deleteConversationIcon;
    }

    public final TextStyle getItemTextStyle() {
        return this.itemTextStyle;
    }

    public final boolean getLeaveGroupEnabled() {
        return this.leaveGroupEnabled;
    }

    public final Drawable getLeaveGroupIcon() {
        return this.leaveGroupIcon;
    }

    public final TextStyle getMemberInfoTextStyle() {
        return this.memberInfoTextStyle;
    }

    public final TextStyle getMemberNamesTextStyle() {
        return this.memberNamesTextStyle;
    }

    public final boolean getViewInfoEnabled() {
        return this.viewInfoEnabled;
    }

    public final Drawable getViewInfoIcon() {
        return this.viewInfoIcon;
    }

    public final TextStyle getWarningItemTextStyle() {
        return this.warningItemTextStyle;
    }

    public final int hashCode() {
        return this.background.hashCode() + AbstractC2875y.m8289b(AbstractC26725a.m79497a(this.cancelIcon, AbstractC2875y.m8289b(AbstractC26725a.m79497a(this.deleteConversationIcon, AbstractC2875y.m8289b(AbstractC26725a.m79497a(this.leaveGroupIcon, AbstractC2875y.m8289b(AbstractC26725a.m79497a(this.viewInfoIcon, AbstractC26725a.m79499c(this.warningItemTextStyle, AbstractC26725a.m79499c(this.itemTextStyle, AbstractC26725a.m79499c(this.memberInfoTextStyle, this.memberNamesTextStyle.hashCode() * 31, 31), 31), 31), 31), 31, this.viewInfoEnabled), 31), 31, this.leaveGroupEnabled), 31), 31, this.deleteConversationEnabled), 31), 31, this.cancelEnabled);
    }

    public final String toString() {
        return "ChannelActionsDialogViewStyle(memberNamesTextStyle=" + this.memberNamesTextStyle + ", memberInfoTextStyle=" + this.memberInfoTextStyle + ", itemTextStyle=" + this.itemTextStyle + ", warningItemTextStyle=" + this.warningItemTextStyle + ", viewInfoIcon=" + this.viewInfoIcon + ", viewInfoEnabled=" + this.viewInfoEnabled + ", leaveGroupIcon=" + this.leaveGroupIcon + ", leaveGroupEnabled=" + this.leaveGroupEnabled + ", deleteConversationIcon=" + this.deleteConversationIcon + ", deleteConversationEnabled=" + this.deleteConversationEnabled + ", cancelIcon=" + this.cancelIcon + ", cancelEnabled=" + this.cancelEnabled + ", background=" + this.background + ")";
    }
}
