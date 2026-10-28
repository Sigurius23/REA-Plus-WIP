package io.getstream.chat.android.p226ui.font;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.widget.TextView;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.ChatUI;
import java.io.Serializable;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u0000 92\u00020\u0001:\u00029:BY\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#Jb\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001aJ\u001a\u0010*\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b3\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u001aR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010#R\u0013\u00108\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b7\u0010#¨\u0006;"}, m65681d2 = {"Lio/getstream/chat/android/ui/font/TextStyle;", "Ljava/io/Serializable;", "", "fontResource", "", "fontAssetsPath", "style", "size", "color", "hint", "hintColor", "Landroid/graphics/Typeface;", "defaultFont", "<init>", "(ILjava/lang/String;IIILjava/lang/String;ILandroid/graphics/Typeface;)V", "Landroid/widget/TextView;", "textView", "Ll83/a0;", "apply", "(Landroid/widget/TextView;)V", "", "hasFont", "()Z", "colorOrNull", "()Ljava/lang/Integer;", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "()Landroid/graphics/Typeface;", "copy", "(ILjava/lang/String;IIILjava/lang/String;ILandroid/graphics/Typeface;)Lio/getstream/chat/android/ui/font/TextStyle;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getFontResource", "Ljava/lang/String;", "getFontAssetsPath", "getStyle", "getSize", "getColor", "getHint", "getHintColor", "Landroid/graphics/Typeface;", "getDefaultFont", "getFont", "font", "Companion", "Builder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class TextStyle implements Serializable {
    private static final Companion Companion = new Companion();

    @Deprecated
    public static final int UNSET_COLOR = Integer.MAX_VALUE;

    @Deprecated
    public static final int UNSET_FONT_RESOURCE = -1;

    @Deprecated
    public static final String UNSET_HINT = "";

    @Deprecated
    public static final int UNSET_HINT_COLOR = Integer.MAX_VALUE;

    @Deprecated
    public static final int UNSET_SIZE = -1;
    private final int color;
    private final Typeface defaultFont;
    private final String fontAssetsPath;
    private final int fontResource;
    private final String hint;
    private final int hintColor;
    private final int size;
    private final int style;

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0007J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\tJ\u0018\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007J\"\u0010\u0013\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\f\u001a\u00020\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0007J\u001a\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0007J\u0018\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007J\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/ui/font/TextStyle$Builder;", "", "array", "Landroid/content/res/TypedArray;", "<init>", "(Landroid/content/res/TypedArray;)V", "fontResource", "", "fontAssetsPath", "", "style", "size", "color", "hint", "hintColor", "defaultFont", "Landroid/graphics/Typeface;", "ref", "defValue", "font", "assetsPath", "resId", "build", "Lio/getstream/chat/android/ui/font/TextStyle;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private final TypedArray array;
        private int color;
        private Typeface defaultFont;
        private String fontAssetsPath;
        private int fontResource;
        private String hint;
        private int hintColor;
        private int size;
        private int style;

        public Builder(TypedArray array) {
            AbstractC22676k.m65750j(array, "array");
            this.array = array;
            this.fontResource = -1;
            this.size = -1;
            this.color = Integer.MAX_VALUE;
            this.hint = "";
            this.hintColor = Integer.MAX_VALUE;
            Typeface DEFAULT = Typeface.DEFAULT;
            AbstractC22676k.m65749i(DEFAULT, "DEFAULT");
            this.defaultFont = DEFAULT;
        }

        public final TextStyle build() {
            return new TextStyle(this.fontResource, this.fontAssetsPath, this.style, this.size, this.color, this.hint, this.hintColor, this.defaultFont);
        }

        public final Builder color(int ref, int defValue) {
            this.color = this.array.getColor(ref, defValue);
            return this;
        }

        public final Builder font(int assetsPath, int resId) {
            this.fontAssetsPath = this.array.getString(assetsPath);
            this.fontResource = this.array.getResourceId(resId, -1);
            return this;
        }

        public final Builder fontAssetsPath(int assetsPath, String defValue) {
            String string = this.array.getString(assetsPath);
            if (string != null) {
                defValue = string;
            }
            this.fontAssetsPath = defValue;
            return this;
        }

        public final Builder fontResource(int resId, int defValue) {
            this.fontResource = this.array.getResourceId(resId, defValue);
            return this;
        }

        public final Builder hint(int ref, String defValue) {
            AbstractC22676k.m65750j(defValue, "defValue");
            String string = this.array.getString(ref);
            if (string != null) {
                defValue = string;
            }
            this.hint = defValue;
            return this;
        }

        public final Builder hintColor(int ref, int defValue) {
            this.hintColor = this.array.getColor(ref, defValue);
            return this;
        }

        public final Builder size(int ref) {
            size(ref, -1);
            return this;
        }

        public final Builder style(int ref, int defValue) {
            this.style = this.array.getInt(ref, defValue);
            return this;
        }

        public final Builder size(int ref, int defValue) {
            this.size = this.array.getDimensionPixelSize(ref, defValue);
            return this;
        }

        public final Builder font(int assetsPath, int resId, Typeface defaultFont) {
            AbstractC22676k.m65750j(defaultFont, "defaultFont");
            this.fontAssetsPath = this.array.getString(assetsPath);
            this.fontResource = this.array.getResourceId(resId, -1);
            this.defaultFont = defaultFont;
            return this;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/font/TextStyle$Companion;", "", "<init>", "()V", "UNSET_SIZE", "", "UNSET_COLOR", "UNSET_HINT_COLOR", "UNSET_FONT_RESOURCE", "UNSET_HINT", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public TextStyle() {
        this(0, null, 0, 0, 0, null, 0, null, 255, null);
    }

    public static /* synthetic */ TextStyle copy$default(TextStyle textStyle, int i13, String str, int i14, int i15, int i16, String str2, int i17, Typeface typeface, int i18, Object obj) {
        if ((i18 & 1) != 0) {
            i13 = textStyle.fontResource;
        }
        if ((i18 & 2) != 0) {
            str = textStyle.fontAssetsPath;
        }
        if ((i18 & 4) != 0) {
            i14 = textStyle.style;
        }
        if ((i18 & 8) != 0) {
            i15 = textStyle.size;
        }
        if ((i18 & 16) != 0) {
            i16 = textStyle.color;
        }
        if ((i18 & 32) != 0) {
            str2 = textStyle.hint;
        }
        if ((i18 & 64) != 0) {
            i17 = textStyle.hintColor;
        }
        if ((i18 & 128) != 0) {
            typeface = textStyle.defaultFont;
        }
        int i19 = i17;
        Typeface typeface2 = typeface;
        int i24 = i16;
        String str3 = str2;
        return textStyle.copy(i13, str, i14, i15, i24, str3, i19, typeface2);
    }

    public final void apply(TextView textView) {
        AbstractC22676k.m65750j(textView, "textView");
        ChatFonts fonts = ChatUI.getFonts();
        int i13 = this.size;
        if (i13 != -1) {
            textView.setTextSize(0, i13);
        }
        int i14 = this.color;
        if (i14 != Integer.MAX_VALUE) {
            textView.setTextColor(i14);
        }
        if (!AbstractC22676k.m65745e(this.hint, "")) {
            textView.setHint(this.hint);
        }
        int i15 = this.hintColor;
        if (i15 != Integer.MAX_VALUE) {
            textView.setHintTextColor(i15);
        }
        fonts.setFont(this, textView, this.defaultFont);
    }

    public final Integer colorOrNull() {
        int i13 = this.color;
        if (i13 != Integer.MAX_VALUE) {
            return Integer.valueOf(i13);
        }
        return null;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFontResource() {
        return this.fontResource;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFontAssetsPath() {
        return this.fontAssetsPath;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getHintColor() {
        return this.hintColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Typeface getDefaultFont() {
        return this.defaultFont;
    }

    public final TextStyle copy(int fontResource, String fontAssetsPath, int style, int size, int color, String hint, int hintColor, Typeface defaultFont) {
        AbstractC22676k.m65750j(hint, "hint");
        AbstractC22676k.m65750j(defaultFont, "defaultFont");
        return new TextStyle(fontResource, fontAssetsPath, style, size, color, hint, hintColor, defaultFont);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) other;
        return this.fontResource == textStyle.fontResource && AbstractC22676k.m65745e(this.fontAssetsPath, textStyle.fontAssetsPath) && this.style == textStyle.style && this.size == textStyle.size && this.color == textStyle.color && AbstractC22676k.m65745e(this.hint, textStyle.hint) && this.hintColor == textStyle.hintColor && AbstractC22676k.m65745e(this.defaultFont, textStyle.defaultFont);
    }

    public final int getColor() {
        return this.color;
    }

    public final Typeface getDefaultFont() {
        return this.defaultFont;
    }

    public final Typeface getFont() {
        return ChatUI.getFonts().getFont(this);
    }

    public final String getFontAssetsPath() {
        return this.fontAssetsPath;
    }

    public final int getFontResource() {
        return this.fontResource;
    }

    public final String getHint() {
        return this.hint;
    }

    public final int getHintColor() {
        return this.hintColor;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getStyle() {
        return this.style;
    }

    public final boolean hasFont() {
        return (this.fontAssetsPath == null && this.fontResource == -1) ? false : true;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.fontResource) * 31;
        String str = this.fontAssetsPath;
        return this.defaultFont.hashCode() + AbstractC11266d.m30448b(this.hintColor, AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.color, AbstractC11266d.m30448b(this.size, AbstractC11266d.m30448b(this.style, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31, this.hint), 31);
    }

    public final String toString() {
        int i13 = this.fontResource;
        String str = this.fontAssetsPath;
        int i14 = this.style;
        int i15 = this.size;
        int i16 = this.color;
        String str2 = this.hint;
        int i17 = this.hintColor;
        Typeface typeface = this.defaultFont;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "TextStyle(fontResource=", ", fontAssetsPath=", str, ", style=");
        AbstractC30802r.m94773v(sbM53373n, i14, ", size=", i15, ", color=");
        AbstractC11895b.m31979B(i16, ", hint=", str2, ", hintColor=", sbM53373n);
        sbM53373n.append(i17);
        sbM53373n.append(", defaultFont=");
        sbM53373n.append(typeface);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    public TextStyle(int i13, String str, int i14, int i15, int i16, String hint, int i17, Typeface defaultFont) {
        AbstractC22676k.m65750j(hint, "hint");
        AbstractC22676k.m65750j(defaultFont, "defaultFont");
        this.fontResource = i13;
        this.fontAssetsPath = str;
        this.style = i14;
        this.size = i15;
        this.color = i16;
        this.hint = hint;
        this.hintColor = i17;
        this.defaultFont = defaultFont;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(int i13, String str, int i14, int i15, int i16, String str2, int i17, Typeface DEFAULT, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        i13 = (i18 & 1) != 0 ? -1 : i13;
        str = (i18 & 2) != 0 ? null : str;
        i14 = (i18 & 4) != 0 ? 0 : i14;
        i15 = (i18 & 8) != 0 ? -1 : i15;
        i16 = (i18 & 16) != 0 ? Integer.MAX_VALUE : i16;
        str2 = (i18 & 32) != 0 ? "" : str2;
        i17 = (i18 & 64) != 0 ? Integer.MAX_VALUE : i17;
        if ((i18 & 128) != 0) {
            DEFAULT = Typeface.DEFAULT;
            AbstractC22676k.m65749i(DEFAULT, "DEFAULT");
        }
        this(i13, str, i14, i15, i16, str2, i17, DEFAULT);
    }
}
