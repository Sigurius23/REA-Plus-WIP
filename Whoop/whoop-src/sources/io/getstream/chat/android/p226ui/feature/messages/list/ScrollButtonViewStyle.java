package io.getstream.chat.android.p226ui.feature.messages.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.TypedArrayKt;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001<Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010-\u001a\u00020\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\u008c\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00032\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020\u0006HÖ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019¨\u0006="}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "scrollButtonEnabled", "", "scrollButtonUnreadEnabled", "scrollButtonColor", "", "scrollButtonRippleColor", "scrollButtonBadgeColor", "scrollButtonElevation", "", "scrollButtonIcon", "Landroid/graphics/drawable/Drawable;", "scrollButtonBadgeTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "scrollButtonBadgeIcon", "scrollButtonBadgeGravity", "scrollButtonBadgeElevation", "scrollButtonInternalMargin", "<init>", "(ZZIILjava/lang/Integer;FLandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;IFI)V", "getScrollButtonEnabled", "()Z", "getScrollButtonUnreadEnabled", "getScrollButtonColor", "()I", "getScrollButtonRippleColor", "getScrollButtonBadgeColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScrollButtonElevation", "()F", "getScrollButtonIcon", "()Landroid/graphics/drawable/Drawable;", "getScrollButtonBadgeTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getScrollButtonBadgeIcon", "getScrollButtonBadgeGravity", "getScrollButtonBadgeElevation", "getScrollButtonInternalMargin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(ZZIILjava/lang/Integer;FLandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;IFI)Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;", "equals", "other", "", "hashCode", "toString", "", "Builder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ScrollButtonViewStyle implements ViewStyle {
    private final Integer scrollButtonBadgeColor;
    private final float scrollButtonBadgeElevation;
    private final int scrollButtonBadgeGravity;
    private final Drawable scrollButtonBadgeIcon;
    private final TextStyle scrollButtonBadgeTextStyle;
    private final int scrollButtonColor;
    private final float scrollButtonElevation;
    private final boolean scrollButtonEnabled;
    private final Drawable scrollButtonIcon;
    private final int scrollButtonInternalMargin;
    private final int scrollButtonRippleColor;
    private final boolean scrollButtonUnreadEnabled;

    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\tJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u001b\u001a\u00020\f2\b\b\u0001\u0010\u0019\u001a\u00020\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\u001c\u001a\u00020\f2\b\b\u0001\u0010\u001d\u001a\u00020\fJ\u0010\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u001e\u001a\u00020\fJ\u001a\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u0012\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fJ\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0001\u0010\u0015\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0013J\u0018\u0010#\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fJ\u0006\u0010%\u001a\u00020&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;", "", "context", "Landroid/content/Context;", "attrs", "Landroid/content/res/TypedArray;", "<init>", "(Landroid/content/Context;Landroid/content/res/TypedArray;)V", "scrollButtonEnabled", "", "scrollButtonUnreadEnabled", "scrollButtonColor", "", "scrollButtonRippleColor", "scrollButtonBadgeColor", "Ljava/lang/Integer;", "scrollButtonIcon", "Landroid/graphics/drawable/Drawable;", "scrollButtonElevation", "", "scrollButtonBadgeGravity", "scrollButtonBadgeIcon", "scrollButtonBadgeElevation", "scrollButtonInternalMargin", "scrollButtonEnabledStyleableId", "defaultValue", "scrollButtonUnreadEnabledStyleableId", "scrollButtonColorStyleableId", "scrollButtonRippleColorStyleableId", "defaultColor", "scrollButtonBadgeColorStyleableId", "scrollButtonIconStyleableId", "defaultIcon", "defaultElevation", "defaultGravity", "scrollButtonBadgeInternalMargin", "defaultMargin", "build", "Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private final TypedArray attrs;
        private final Context context;
        private Integer scrollButtonBadgeColor;
        private float scrollButtonBadgeElevation;
        private int scrollButtonBadgeGravity;
        private Drawable scrollButtonBadgeIcon;
        private int scrollButtonColor;
        private float scrollButtonElevation;
        private boolean scrollButtonEnabled;
        private Drawable scrollButtonIcon;
        private int scrollButtonInternalMargin;
        private int scrollButtonRippleColor;
        private boolean scrollButtonUnreadEnabled;

        public Builder(Context context, TypedArray attrs) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(attrs, "attrs");
            this.context = context;
            this.attrs = attrs;
            this.scrollButtonBadgeColor = 0;
        }

        public final ScrollButtonViewStyle build() {
            TextStyle.Builder builder = new TextStyle.Builder(this.attrs);
            builder.size(C19469R.styleable.MessageListView_streamUiScrollButtonBadgeTextSize, ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_scroll_button_unread_badge_text_size));
            builder.color(C19469R.styleable.MessageListView_streamUiScrollButtonBadgeTextColor, ContextKt.getColorCompat(this.context, C19469R.color.stream_ui_literal_white));
            builder.font(C19469R.styleable.MessageListView_streamUiScrollButtonBadgeFontAssets, C19469R.styleable.MessageListView_streamUiScrollButtonBadgeTextFont);
            builder.style(C19469R.styleable.MessageListView_streamUiScrollButtonBadgeTextStyle, 1);
            TextStyle textStyleBuild = builder.build();
            return TransformStyle.getScrollButtonStyleTransformer().transform(new ScrollButtonViewStyle(this.scrollButtonEnabled, this.scrollButtonUnreadEnabled, this.scrollButtonColor, this.scrollButtonRippleColor, this.scrollButtonBadgeColor, this.scrollButtonElevation, this.scrollButtonIcon, textStyleBuild, this.scrollButtonBadgeIcon, this.scrollButtonBadgeGravity, this.scrollButtonBadgeElevation, this.scrollButtonInternalMargin));
        }

        public final Builder scrollButtonBadgeColor(int scrollButtonBadgeColorStyleableId) {
            this.scrollButtonBadgeColor = TypedArrayKt.getColorOrNull(this.attrs, scrollButtonBadgeColorStyleableId);
            return this;
        }

        public final Builder scrollButtonBadgeElevation(int scrollButtonBadgeElevation, float defaultElevation) {
            this.scrollButtonBadgeElevation = this.attrs.getDimension(scrollButtonBadgeElevation, defaultElevation);
            return this;
        }

        public final Builder scrollButtonBadgeGravity(int scrollButtonBadgeGravity, int defaultGravity) {
            this.scrollButtonBadgeGravity = this.attrs.getInt(scrollButtonBadgeGravity, defaultGravity);
            return this;
        }

        public final Builder scrollButtonBadgeIcon(int scrollButtonBadgeIcon, Drawable defaultIcon) {
            Drawable drawable = this.attrs.getDrawable(scrollButtonBadgeIcon);
            if (drawable != null) {
                defaultIcon = drawable;
            }
            this.scrollButtonBadgeIcon = defaultIcon;
            return this;
        }

        public final Builder scrollButtonBadgeInternalMargin(int scrollButtonInternalMargin, int defaultMargin) {
            this.scrollButtonInternalMargin = this.attrs.getDimensionPixelSize(scrollButtonInternalMargin, defaultMargin);
            return this;
        }

        public final Builder scrollButtonColor(int scrollButtonColorStyleableId, int defaultValue) {
            this.scrollButtonColor = this.attrs.getColor(scrollButtonColorStyleableId, defaultValue);
            return this;
        }

        public final Builder scrollButtonElevation(int scrollButtonElevation, float defaultElevation) {
            this.scrollButtonElevation = this.attrs.getDimension(scrollButtonElevation, defaultElevation);
            return this;
        }

        public final Builder scrollButtonEnabled(int scrollButtonEnabledStyleableId, boolean defaultValue) {
            this.scrollButtonEnabled = this.attrs.getBoolean(scrollButtonEnabledStyleableId, defaultValue);
            return this;
        }

        public final Builder scrollButtonIcon(int scrollButtonIconStyleableId, Drawable defaultIcon) {
            Drawable drawable = this.attrs.getDrawable(scrollButtonIconStyleableId);
            if (drawable != null) {
                defaultIcon = drawable;
            }
            this.scrollButtonIcon = defaultIcon;
            return this;
        }

        public final Builder scrollButtonRippleColor(int scrollButtonRippleColorStyleableId, int defaultColor) {
            this.scrollButtonRippleColor = this.attrs.getColor(scrollButtonRippleColorStyleableId, defaultColor);
            return this;
        }

        public final Builder scrollButtonUnreadEnabled(int scrollButtonUnreadEnabledStyleableId, boolean defaultValue) {
            this.scrollButtonUnreadEnabled = this.attrs.getBoolean(scrollButtonUnreadEnabledStyleableId, defaultValue);
            return this;
        }
    }

    public ScrollButtonViewStyle(boolean z4, boolean z13, int i13, int i14, Integer num, float f13, Drawable drawable, TextStyle scrollButtonBadgeTextStyle, Drawable drawable2, int i15, float f14, int i16) {
        AbstractC22676k.m65750j(scrollButtonBadgeTextStyle, "scrollButtonBadgeTextStyle");
        this.scrollButtonEnabled = z4;
        this.scrollButtonUnreadEnabled = z13;
        this.scrollButtonColor = i13;
        this.scrollButtonRippleColor = i14;
        this.scrollButtonBadgeColor = num;
        this.scrollButtonElevation = f13;
        this.scrollButtonIcon = drawable;
        this.scrollButtonBadgeTextStyle = scrollButtonBadgeTextStyle;
        this.scrollButtonBadgeIcon = drawable2;
        this.scrollButtonBadgeGravity = i15;
        this.scrollButtonBadgeElevation = f14;
        this.scrollButtonInternalMargin = i16;
    }

    public static /* synthetic */ ScrollButtonViewStyle copy$default(ScrollButtonViewStyle scrollButtonViewStyle, boolean z4, boolean z13, int i13, int i14, Integer num, float f13, Drawable drawable, TextStyle textStyle, Drawable drawable2, int i15, float f14, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            z4 = scrollButtonViewStyle.scrollButtonEnabled;
        }
        if ((i17 & 2) != 0) {
            z13 = scrollButtonViewStyle.scrollButtonUnreadEnabled;
        }
        if ((i17 & 4) != 0) {
            i13 = scrollButtonViewStyle.scrollButtonColor;
        }
        if ((i17 & 8) != 0) {
            i14 = scrollButtonViewStyle.scrollButtonRippleColor;
        }
        if ((i17 & 16) != 0) {
            num = scrollButtonViewStyle.scrollButtonBadgeColor;
        }
        if ((i17 & 32) != 0) {
            f13 = scrollButtonViewStyle.scrollButtonElevation;
        }
        if ((i17 & 64) != 0) {
            drawable = scrollButtonViewStyle.scrollButtonIcon;
        }
        if ((i17 & 128) != 0) {
            textStyle = scrollButtonViewStyle.scrollButtonBadgeTextStyle;
        }
        if ((i17 & 256) != 0) {
            drawable2 = scrollButtonViewStyle.scrollButtonBadgeIcon;
        }
        if ((i17 & 512) != 0) {
            i15 = scrollButtonViewStyle.scrollButtonBadgeGravity;
        }
        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            f14 = scrollButtonViewStyle.scrollButtonBadgeElevation;
        }
        if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            i16 = scrollButtonViewStyle.scrollButtonInternalMargin;
        }
        float f15 = f14;
        int i18 = i16;
        Drawable drawable3 = drawable2;
        int i19 = i15;
        Drawable drawable4 = drawable;
        TextStyle textStyle2 = textStyle;
        Integer num2 = num;
        float f16 = f13;
        return scrollButtonViewStyle.copy(z4, z13, i13, i14, num2, f16, drawable4, textStyle2, drawable3, i19, f15, i18);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getScrollButtonEnabled() {
        return this.scrollButtonEnabled;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getScrollButtonBadgeGravity() {
        return this.scrollButtonBadgeGravity;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getScrollButtonBadgeElevation() {
        return this.scrollButtonBadgeElevation;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getScrollButtonInternalMargin() {
        return this.scrollButtonInternalMargin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getScrollButtonUnreadEnabled() {
        return this.scrollButtonUnreadEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getScrollButtonColor() {
        return this.scrollButtonColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getScrollButtonRippleColor() {
        return this.scrollButtonRippleColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getScrollButtonBadgeColor() {
        return this.scrollButtonBadgeColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getScrollButtonElevation() {
        return this.scrollButtonElevation;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Drawable getScrollButtonIcon() {
        return this.scrollButtonIcon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TextStyle getScrollButtonBadgeTextStyle() {
        return this.scrollButtonBadgeTextStyle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Drawable getScrollButtonBadgeIcon() {
        return this.scrollButtonBadgeIcon;
    }

    public final ScrollButtonViewStyle copy(boolean scrollButtonEnabled, boolean scrollButtonUnreadEnabled, int scrollButtonColor, int scrollButtonRippleColor, Integer scrollButtonBadgeColor, float scrollButtonElevation, Drawable scrollButtonIcon, TextStyle scrollButtonBadgeTextStyle, Drawable scrollButtonBadgeIcon, int scrollButtonBadgeGravity, float scrollButtonBadgeElevation, int scrollButtonInternalMargin) {
        AbstractC22676k.m65750j(scrollButtonBadgeTextStyle, "scrollButtonBadgeTextStyle");
        return new ScrollButtonViewStyle(scrollButtonEnabled, scrollButtonUnreadEnabled, scrollButtonColor, scrollButtonRippleColor, scrollButtonBadgeColor, scrollButtonElevation, scrollButtonIcon, scrollButtonBadgeTextStyle, scrollButtonBadgeIcon, scrollButtonBadgeGravity, scrollButtonBadgeElevation, scrollButtonInternalMargin);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollButtonViewStyle)) {
            return false;
        }
        ScrollButtonViewStyle scrollButtonViewStyle = (ScrollButtonViewStyle) other;
        return this.scrollButtonEnabled == scrollButtonViewStyle.scrollButtonEnabled && this.scrollButtonUnreadEnabled == scrollButtonViewStyle.scrollButtonUnreadEnabled && this.scrollButtonColor == scrollButtonViewStyle.scrollButtonColor && this.scrollButtonRippleColor == scrollButtonViewStyle.scrollButtonRippleColor && AbstractC22676k.m65745e(this.scrollButtonBadgeColor, scrollButtonViewStyle.scrollButtonBadgeColor) && Float.compare(this.scrollButtonElevation, scrollButtonViewStyle.scrollButtonElevation) == 0 && AbstractC22676k.m65745e(this.scrollButtonIcon, scrollButtonViewStyle.scrollButtonIcon) && AbstractC22676k.m65745e(this.scrollButtonBadgeTextStyle, scrollButtonViewStyle.scrollButtonBadgeTextStyle) && AbstractC22676k.m65745e(this.scrollButtonBadgeIcon, scrollButtonViewStyle.scrollButtonBadgeIcon) && this.scrollButtonBadgeGravity == scrollButtonViewStyle.scrollButtonBadgeGravity && Float.compare(this.scrollButtonBadgeElevation, scrollButtonViewStyle.scrollButtonBadgeElevation) == 0 && this.scrollButtonInternalMargin == scrollButtonViewStyle.scrollButtonInternalMargin;
    }

    public final Integer getScrollButtonBadgeColor() {
        return this.scrollButtonBadgeColor;
    }

    public final float getScrollButtonBadgeElevation() {
        return this.scrollButtonBadgeElevation;
    }

    public final int getScrollButtonBadgeGravity() {
        return this.scrollButtonBadgeGravity;
    }

    public final Drawable getScrollButtonBadgeIcon() {
        return this.scrollButtonBadgeIcon;
    }

    public final TextStyle getScrollButtonBadgeTextStyle() {
        return this.scrollButtonBadgeTextStyle;
    }

    public final int getScrollButtonColor() {
        return this.scrollButtonColor;
    }

    public final float getScrollButtonElevation() {
        return this.scrollButtonElevation;
    }

    public final boolean getScrollButtonEnabled() {
        return this.scrollButtonEnabled;
    }

    public final Drawable getScrollButtonIcon() {
        return this.scrollButtonIcon;
    }

    public final int getScrollButtonInternalMargin() {
        return this.scrollButtonInternalMargin;
    }

    public final int getScrollButtonRippleColor() {
        return this.scrollButtonRippleColor;
    }

    public final boolean getScrollButtonUnreadEnabled() {
        return this.scrollButtonUnreadEnabled;
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.scrollButtonRippleColor, AbstractC11266d.m30448b(this.scrollButtonColor, AbstractC2875y.m8289b(Boolean.hashCode(this.scrollButtonEnabled) * 31, 31, this.scrollButtonUnreadEnabled), 31), 31);
        Integer num = this.scrollButtonBadgeColor;
        int iM30447a = AbstractC11266d.m30447a(this.scrollButtonElevation, (iM30448b + (num == null ? 0 : num.hashCode())) * 31, 31);
        Drawable drawable = this.scrollButtonIcon;
        int iM79499c = AbstractC26725a.m79499c(this.scrollButtonBadgeTextStyle, (iM30447a + (drawable == null ? 0 : drawable.hashCode())) * 31, 31);
        Drawable drawable2 = this.scrollButtonBadgeIcon;
        return Integer.hashCode(this.scrollButtonInternalMargin) + AbstractC11266d.m30447a(this.scrollButtonBadgeElevation, AbstractC11266d.m30448b(this.scrollButtonBadgeGravity, (iM79499c + (drawable2 != null ? drawable2.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        boolean z4 = this.scrollButtonEnabled;
        boolean z13 = this.scrollButtonUnreadEnabled;
        int i13 = this.scrollButtonColor;
        int i14 = this.scrollButtonRippleColor;
        Integer num = this.scrollButtonBadgeColor;
        float f13 = this.scrollButtonElevation;
        Drawable drawable = this.scrollButtonIcon;
        TextStyle textStyle = this.scrollButtonBadgeTextStyle;
        Drawable drawable2 = this.scrollButtonBadgeIcon;
        int i15 = this.scrollButtonBadgeGravity;
        float f14 = this.scrollButtonBadgeElevation;
        int i16 = this.scrollButtonInternalMargin;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ScrollButtonViewStyle(scrollButtonEnabled=", ", scrollButtonUnreadEnabled=", ", scrollButtonColor=", z4, z13);
        AbstractC30802r.m94773v(sbM32002u, i13, ", scrollButtonRippleColor=", i14, ", scrollButtonBadgeColor=");
        sbM32002u.append(num);
        sbM32002u.append(", scrollButtonElevation=");
        sbM32002u.append(f13);
        sbM32002u.append(", scrollButtonIcon=");
        sbM32002u.append(drawable);
        sbM32002u.append(", scrollButtonBadgeTextStyle=");
        sbM32002u.append(textStyle);
        sbM32002u.append(", scrollButtonBadgeIcon=");
        sbM32002u.append(drawable2);
        sbM32002u.append(", scrollButtonBadgeGravity=");
        sbM32002u.append(i15);
        sbM32002u.append(", scrollButtonBadgeElevation=");
        sbM32002u.append(f14);
        sbM32002u.append(", scrollButtonInternalMargin=");
        sbM32002u.append(i16);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }
}
