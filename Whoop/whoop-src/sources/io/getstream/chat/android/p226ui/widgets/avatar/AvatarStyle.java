package io.getstream.chat.android.p226ui.widgets.avatar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 52\u00020\u0001:\u00015Ba\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u0011HÆ\u0003Jm\u0010.\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00066"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "avatarBorderWidth", "", "avatarBorderColor", "avatarInitialsTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "groupAvatarInitialsTextStyle", "onlineIndicatorEnabled", "", "onlineIndicatorPosition", "Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;", "onlineIndicatorColor", "onlineIndicatorBorderColor", "avatarShape", "Lio/getstream/chat/android/ui/widgets/avatar/AvatarShape;", "borderRadius", "", "<init>", "(IILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ZLio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;IILio/getstream/chat/android/ui/widgets/avatar/AvatarShape;F)V", "getAvatarBorderWidth", "()I", "getAvatarBorderColor", "getAvatarInitialsTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getGroupAvatarInitialsTextStyle", "getOnlineIndicatorEnabled", "()Z", "getOnlineIndicatorPosition", "()Lio/getstream/chat/android/ui/widgets/avatar/OnlineIndicatorPosition;", "getOnlineIndicatorColor", "getOnlineIndicatorBorderColor", "getAvatarShape", "()Lio/getstream/chat/android/ui/widgets/avatar/AvatarShape;", "getBorderRadius", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AvatarStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final int avatarBorderColor;
    private final int avatarBorderWidth;
    private final TextStyle avatarInitialsTextStyle;
    private final AvatarShape avatarShape;
    private final float borderRadius;
    private final TextStyle groupAvatarInitialsTextStyle;
    private final int onlineIndicatorBorderColor;
    private final int onlineIndicatorColor;
    private final boolean onlineIndicatorEnabled;
    private final OnlineIndicatorPosition onlineIndicatorPosition;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\u0002¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final AvatarStyle invoke(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.AvatarView, 0, 0);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.AvatarView_streamUiAvatarBorderWidth, ContextKt.getDimension(context, C19469R.dimen.stream_ui_avatar_border_width));
            int color = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.AvatarView_streamUiAvatarBorderColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_black));
            TextStyle.Builder builder = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder.size(C19469R.styleable.AvatarView_streamUiAvatarTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_avatar_initials));
            builder.color(C19469R.styleable.AvatarView_streamUiAvatarTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            builder.font(C19469R.styleable.AvatarView_streamUiAvatarTextFontAssets, C19469R.styleable.AvatarView_streamUiAvatarTextFont);
            builder.style(C19469R.styleable.AvatarView_streamUiAvatarTextStyle, 1);
            TextStyle textStyleBuild = builder.build();
            TextStyle.Builder builder2 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder2.size(C19469R.styleable.AvatarView_streamUiGroupAvatarTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_group_avatar_initials));
            builder2.color(C19469R.styleable.AvatarView_streamUiGroupAvatarTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            builder2.font(C19469R.styleable.AvatarView_streamUiGroupAvatarTextFontAssets, C19469R.styleable.AvatarView_streamUiGroupAvatarTextFont);
            builder2.style(C19469R.styleable.AvatarView_streamUiGroupAvatarTextStyle, 1);
            TextStyle textStyleBuild2 = builder2.build();
            boolean z4 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.AvatarView_streamUiAvatarOnlineIndicatorEnabled, false);
            int i13 = C19469R.styleable.AvatarView_streamUiAvatarOnlineIndicatorPosition;
            OnlineIndicatorPosition onlineIndicatorPosition = OnlineIndicatorPosition.TOP_END;
            int i14 = typedArrayObtainStyledAttributes.getInt(i13, -1);
            if (i14 >= 0) {
                onlineIndicatorPosition = OnlineIndicatorPosition.values()[i14];
            }
            OnlineIndicatorPosition onlineIndicatorPosition2 = onlineIndicatorPosition;
            int color2 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.AvatarView_streamUiAvatarOnlineIndicatorColor, -16711936);
            int color3 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.AvatarView_streamUiAvatarOnlineIndicatorBorderColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            int i15 = C19469R.styleable.AvatarView_streamUiAvatarShape;
            AvatarShape avatarShape = AvatarShape.CIRCLE;
            int i16 = typedArrayObtainStyledAttributes.getInt(i15, -1);
            if (i16 >= 0) {
                avatarShape = AvatarShape.values()[i16];
            }
            return TransformStyle.getAvatarStyleTransformer().transform(new AvatarStyle(dimensionPixelSize, color, textStyleBuild, textStyleBuild2, z4, onlineIndicatorPosition2, color2, color3, avatarShape, typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.AvatarView_streamUiAvatarBorderRadius, IntKt.dpToPx(4))));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public AvatarStyle(int i13, int i14, TextStyle avatarInitialsTextStyle, TextStyle groupAvatarInitialsTextStyle, boolean z4, OnlineIndicatorPosition onlineIndicatorPosition, int i15, int i16, AvatarShape avatarShape, float f13) {
        AbstractC22676k.m65750j(avatarInitialsTextStyle, "avatarInitialsTextStyle");
        AbstractC22676k.m65750j(groupAvatarInitialsTextStyle, "groupAvatarInitialsTextStyle");
        AbstractC22676k.m65750j(onlineIndicatorPosition, "onlineIndicatorPosition");
        AbstractC22676k.m65750j(avatarShape, "avatarShape");
        this.avatarBorderWidth = i13;
        this.avatarBorderColor = i14;
        this.avatarInitialsTextStyle = avatarInitialsTextStyle;
        this.groupAvatarInitialsTextStyle = groupAvatarInitialsTextStyle;
        this.onlineIndicatorEnabled = z4;
        this.onlineIndicatorPosition = onlineIndicatorPosition;
        this.onlineIndicatorColor = i15;
        this.onlineIndicatorBorderColor = i16;
        this.avatarShape = avatarShape;
        this.borderRadius = f13;
    }

    public static /* synthetic */ AvatarStyle copy$default(AvatarStyle avatarStyle, int i13, int i14, TextStyle textStyle, TextStyle textStyle2, boolean z4, OnlineIndicatorPosition onlineIndicatorPosition, int i15, int i16, AvatarShape avatarShape, float f13, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = avatarStyle.avatarBorderWidth;
        }
        if ((i17 & 2) != 0) {
            i14 = avatarStyle.avatarBorderColor;
        }
        if ((i17 & 4) != 0) {
            textStyle = avatarStyle.avatarInitialsTextStyle;
        }
        if ((i17 & 8) != 0) {
            textStyle2 = avatarStyle.groupAvatarInitialsTextStyle;
        }
        if ((i17 & 16) != 0) {
            z4 = avatarStyle.onlineIndicatorEnabled;
        }
        if ((i17 & 32) != 0) {
            onlineIndicatorPosition = avatarStyle.onlineIndicatorPosition;
        }
        if ((i17 & 64) != 0) {
            i15 = avatarStyle.onlineIndicatorColor;
        }
        if ((i17 & 128) != 0) {
            i16 = avatarStyle.onlineIndicatorBorderColor;
        }
        if ((i17 & 256) != 0) {
            avatarShape = avatarStyle.avatarShape;
        }
        if ((i17 & 512) != 0) {
            f13 = avatarStyle.borderRadius;
        }
        AvatarShape avatarShape2 = avatarShape;
        float f14 = f13;
        int i18 = i15;
        int i19 = i16;
        boolean z13 = z4;
        OnlineIndicatorPosition onlineIndicatorPosition2 = onlineIndicatorPosition;
        return avatarStyle.copy(i13, i14, textStyle, textStyle2, z13, onlineIndicatorPosition2, i18, i19, avatarShape2, f14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAvatarBorderWidth() {
        return this.avatarBorderWidth;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getBorderRadius() {
        return this.borderRadius;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAvatarBorderColor() {
        return this.avatarBorderColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextStyle getAvatarInitialsTextStyle() {
        return this.avatarInitialsTextStyle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextStyle getGroupAvatarInitialsTextStyle() {
        return this.groupAvatarInitialsTextStyle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getOnlineIndicatorEnabled() {
        return this.onlineIndicatorEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OnlineIndicatorPosition getOnlineIndicatorPosition() {
        return this.onlineIndicatorPosition;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getOnlineIndicatorColor() {
        return this.onlineIndicatorColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getOnlineIndicatorBorderColor() {
        return this.onlineIndicatorBorderColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AvatarShape getAvatarShape() {
        return this.avatarShape;
    }

    public final AvatarStyle copy(int avatarBorderWidth, int avatarBorderColor, TextStyle avatarInitialsTextStyle, TextStyle groupAvatarInitialsTextStyle, boolean onlineIndicatorEnabled, OnlineIndicatorPosition onlineIndicatorPosition, int onlineIndicatorColor, int onlineIndicatorBorderColor, AvatarShape avatarShape, float borderRadius) {
        AbstractC22676k.m65750j(avatarInitialsTextStyle, "avatarInitialsTextStyle");
        AbstractC22676k.m65750j(groupAvatarInitialsTextStyle, "groupAvatarInitialsTextStyle");
        AbstractC22676k.m65750j(onlineIndicatorPosition, "onlineIndicatorPosition");
        AbstractC22676k.m65750j(avatarShape, "avatarShape");
        return new AvatarStyle(avatarBorderWidth, avatarBorderColor, avatarInitialsTextStyle, groupAvatarInitialsTextStyle, onlineIndicatorEnabled, onlineIndicatorPosition, onlineIndicatorColor, onlineIndicatorBorderColor, avatarShape, borderRadius);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvatarStyle)) {
            return false;
        }
        AvatarStyle avatarStyle = (AvatarStyle) other;
        return this.avatarBorderWidth == avatarStyle.avatarBorderWidth && this.avatarBorderColor == avatarStyle.avatarBorderColor && AbstractC22676k.m65745e(this.avatarInitialsTextStyle, avatarStyle.avatarInitialsTextStyle) && AbstractC22676k.m65745e(this.groupAvatarInitialsTextStyle, avatarStyle.groupAvatarInitialsTextStyle) && this.onlineIndicatorEnabled == avatarStyle.onlineIndicatorEnabled && this.onlineIndicatorPosition == avatarStyle.onlineIndicatorPosition && this.onlineIndicatorColor == avatarStyle.onlineIndicatorColor && this.onlineIndicatorBorderColor == avatarStyle.onlineIndicatorBorderColor && this.avatarShape == avatarStyle.avatarShape && Float.compare(this.borderRadius, avatarStyle.borderRadius) == 0;
    }

    public final int getAvatarBorderColor() {
        return this.avatarBorderColor;
    }

    public final int getAvatarBorderWidth() {
        return this.avatarBorderWidth;
    }

    public final TextStyle getAvatarInitialsTextStyle() {
        return this.avatarInitialsTextStyle;
    }

    public final AvatarShape getAvatarShape() {
        return this.avatarShape;
    }

    public final float getBorderRadius() {
        return this.borderRadius;
    }

    public final TextStyle getGroupAvatarInitialsTextStyle() {
        return this.groupAvatarInitialsTextStyle;
    }

    public final int getOnlineIndicatorBorderColor() {
        return this.onlineIndicatorBorderColor;
    }

    public final int getOnlineIndicatorColor() {
        return this.onlineIndicatorColor;
    }

    public final boolean getOnlineIndicatorEnabled() {
        return this.onlineIndicatorEnabled;
    }

    public final OnlineIndicatorPosition getOnlineIndicatorPosition() {
        return this.onlineIndicatorPosition;
    }

    public final int hashCode() {
        return Float.hashCode(this.borderRadius) + ((this.avatarShape.hashCode() + AbstractC11266d.m30448b(this.onlineIndicatorBorderColor, AbstractC11266d.m30448b(this.onlineIndicatorColor, (this.onlineIndicatorPosition.hashCode() + AbstractC2875y.m8289b(AbstractC26725a.m79499c(this.groupAvatarInitialsTextStyle, AbstractC26725a.m79499c(this.avatarInitialsTextStyle, AbstractC11266d.m30448b(this.avatarBorderColor, Integer.hashCode(this.avatarBorderWidth) * 31, 31), 31), 31), 31, this.onlineIndicatorEnabled)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        int i13 = this.avatarBorderWidth;
        int i14 = this.avatarBorderColor;
        TextStyle textStyle = this.avatarInitialsTextStyle;
        TextStyle textStyle2 = this.groupAvatarInitialsTextStyle;
        boolean z4 = this.onlineIndicatorEnabled;
        OnlineIndicatorPosition onlineIndicatorPosition = this.onlineIndicatorPosition;
        int i15 = this.onlineIndicatorColor;
        int i16 = this.onlineIndicatorBorderColor;
        AvatarShape avatarShape = this.avatarShape;
        float f13 = this.borderRadius;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "AvatarStyle(avatarBorderWidth=", ", avatarBorderColor=", ", avatarInitialsTextStyle=");
        sbM30465s.append(textStyle);
        sbM30465s.append(", groupAvatarInitialsTextStyle=");
        sbM30465s.append(textStyle2);
        sbM30465s.append(", onlineIndicatorEnabled=");
        sbM30465s.append(z4);
        sbM30465s.append(", onlineIndicatorPosition=");
        sbM30465s.append(onlineIndicatorPosition);
        sbM30465s.append(", onlineIndicatorColor=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", onlineIndicatorBorderColor=", i16, ", avatarShape=");
        sbM30465s.append(avatarShape);
        sbM30465s.append(", borderRadius=");
        sbM30465s.append(f13);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }
}
