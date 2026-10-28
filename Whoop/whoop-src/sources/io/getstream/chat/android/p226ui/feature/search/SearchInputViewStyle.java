package io.getstream.chat.android.p226ui.feature.search;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.profileinstaller.ProfileVerifier;
import e93.AbstractC12889b;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.TypedArrayKt;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b6\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u0000 I2\u00020\u0001:\u0002IJB¯\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\rHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J¿\u0001\u0010B\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00032\b\b\u0003\u0010\u0014\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u00032\b\b\u0003\u0010\u0017\u001a\u00020\u0003HÆ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\u0003HÖ\u0001J\t\u0010H\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001b¨\u0006K"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "textColor", "", "hintColor", "searchIconDrawable", "Landroid/graphics/drawable/Drawable;", "clearInputDrawable", "backgroundDrawable", "backgroundDrawableOutline", "Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle$DrawableOutline;", "containerBackgroundColor", "hintText", "", "textSize", "textMarginStart", "textMarginEnd", "searchInputHeight", "searchIconWidth", "searchIconHeight", "searchIconMarginStart", "clearIconWidth", "clearIconHeight", "clearIconMarginEnd", "<init>", "(IILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle$DrawableOutline;ILjava/lang/String;IIIIIIIIII)V", "getTextColor", "()I", "getHintColor", "getSearchIconDrawable", "()Landroid/graphics/drawable/Drawable;", "getClearInputDrawable", "getBackgroundDrawable", "getBackgroundDrawableOutline", "()Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle$DrawableOutline;", "getContainerBackgroundColor", "getHintText", "()Ljava/lang/String;", "getTextSize", "getTextMarginStart", "getTextMarginEnd", "getSearchInputHeight", "getSearchIconWidth", "getSearchIconHeight", "getSearchIconMarginStart", "getClearIconWidth", "getClearIconHeight", "getClearIconMarginEnd", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "DrawableOutline", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class SearchInputViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final Drawable backgroundDrawable;
    private final DrawableOutline backgroundDrawableOutline;
    private final int clearIconHeight;
    private final int clearIconMarginEnd;
    private final int clearIconWidth;
    private final Drawable clearInputDrawable;
    private final int containerBackgroundColor;
    private final int hintColor;
    private final String hintText;
    private final Drawable searchIconDrawable;
    private final int searchIconHeight;
    private final int searchIconMarginStart;
    private final int searchIconWidth;
    private final int searchInputHeight;
    private final int textColor;
    private final int textMarginEnd;
    private final int textMarginStart;
    private final int textSize;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\u0002¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final SearchInputViewStyle invoke(Context context, AttributeSet attrs) {
            String string;
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.SearchInputView, C19469R.attr.streamUiSearchInputViewStyle, C19469R.style.StreamUi_SearchInputView);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.SearchInputView_streamUiSearchInputViewSearchIcon);
            if (drawable == null) {
                drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_search);
                AbstractC22676k.m65747g(drawable);
            }
            Drawable drawable2 = drawable;
            Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.SearchInputView_streamUiSearchInputViewClearInputIcon);
            if (drawable3 == null) {
                drawable3 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_clear);
                AbstractC22676k.m65747g(drawable3);
            }
            Drawable drawable4 = drawable3;
            Drawable drawable5 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.SearchInputView_streamUiSearchInputViewBackground);
            if (drawable5 == null) {
                drawable5 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_shape_search_view_background);
                AbstractC22676k.m65747g(drawable5);
            }
            Drawable drawable6 = drawable5;
            Integer colorOrNull = TypedArrayKt.getColorOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.SearchInputView_streamUiSearchInputViewBackgroundOutlineColor);
            Float dimensionOrNull = TypedArrayKt.getDimensionOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.SearchInputView_streamUiSearchInputViewBackgroundOutlineWidth);
            DrawableOutline drawableOutline = null;
            Integer numValueOf = dimensionOrNull != null ? Integer.valueOf(AbstractC12889b.m36258X(dimensionOrNull.floatValue())) : null;
            if (colorOrNull != null && numValueOf != null) {
                drawableOutline = new DrawableOutline(numValueOf.intValue(), colorOrNull.intValue());
            }
            DrawableOutline drawableOutline2 = drawableOutline;
            int color = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.SearchInputView_streamUiSearchInputViewContainerBackground, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            int color2 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.SearchInputView_streamUiSearchInputViewTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            int color3 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.SearchInputView_streamUiSearchInputViewHintColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            CharSequence text = typedArrayObtainStyledAttributes.getText(C19469R.styleable.SearchInputView_streamUiSearchInputViewHintText);
            if (text == null || (string = text.toString()) == null) {
                string = context.getString(C19469R.string.stream_ui_search_input_hint);
                AbstractC22676k.m65749i(string, "getString(...)");
            }
            return TransformStyle.getSearchInputViewStyleTransformer().transform(new SearchInputViewStyle(color2, color3, drawable2, drawable4, drawable6, drawableOutline2, color, string, typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.SearchInputView_streamUiSearchInputViewTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium)), typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.SearchInputView_streamUiSearchInputViewTextMarginStart, ContextKt.getDimension(context, C19469R.dimen.stream_ui_search_input_text_margin_start)), typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.SearchInputView_streamUiSearchInputViewTextMarginEnd, ContextKt.getDimension(context, C19469R.dimen.stream_ui_search_input_text_margin_end)), typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.SearchInputView_streamUiSearchInputViewHeight, ContextKt.getDimension(context, C19469R.dimen.stream_ui_search_input_height)), typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.SearchInputView_streamUiSearchInputViewIconSearchWidth, ContextKt.getDimension(context, C19469R.dimen.stream_ui_search_input_icon_search_width)), typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.SearchInputView_streamUiSearchInputViewIconSearchHeight, ContextKt.getDimension(context, C19469R.dimen.stream_ui_search_input_icon_search_height)), typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.SearchInputView_streamUiSearchInputViewIconSearchMarginStart, ContextKt.getDimension(context, C19469R.dimen.stream_ui_search_input_icon_search_margin_start)), typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.SearchInputView_streamUiSearchInputViewIconClearWidth, ContextKt.getDimension(context, C19469R.dimen.stream_ui_search_input_icon_clear_width)), typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.SearchInputView_streamUiSearchInputViewIconClearHeight, ContextKt.getDimension(context, C19469R.dimen.stream_ui_search_input_icon_clear_height)), typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.SearchInputView_streamUiSearchInputViewIconClearMarginEnd, ContextKt.getDimension(context, C19469R.dimen.stream_ui_search_input_icon_clear_margin_end))));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle$DrawableOutline;", "", "width", "", "color", "<init>", "(II)V", "getWidth", "()I", "getColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class DrawableOutline {
        private final int color;
        private final int width;

        public DrawableOutline(int i13, int i14) {
            this.width = i13;
            this.color = i14;
        }

        public static DrawableOutline copy$default(DrawableOutline drawableOutline, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i13 = drawableOutline.width;
            }
            if ((i15 & 2) != 0) {
                i14 = drawableOutline.color;
            }
            drawableOutline.getClass();
            return new DrawableOutline(i13, i14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        public final DrawableOutline copy(int width, int color) {
            return new DrawableOutline(width, color);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrawableOutline)) {
                return false;
            }
            DrawableOutline drawableOutline = (DrawableOutline) other;
            return this.width == drawableOutline.width && this.color == drawableOutline.color;
        }

        public final int getColor() {
            return this.color;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int hashCode() {
            return Integer.hashCode(this.color) + (Integer.hashCode(this.width) * 31);
        }

        public final String toString() {
            return AbstractC25012a.m73372e(this.width, this.color, "DrawableOutline(width=", ", color=", ")");
        }
    }

    public SearchInputViewStyle(int i13, int i14, Drawable searchIconDrawable, Drawable clearInputDrawable, Drawable backgroundDrawable, DrawableOutline drawableOutline, int i15, String hintText, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29) {
        AbstractC22676k.m65750j(searchIconDrawable, "searchIconDrawable");
        AbstractC22676k.m65750j(clearInputDrawable, "clearInputDrawable");
        AbstractC22676k.m65750j(backgroundDrawable, "backgroundDrawable");
        AbstractC22676k.m65750j(hintText, "hintText");
        this.textColor = i13;
        this.hintColor = i14;
        this.searchIconDrawable = searchIconDrawable;
        this.clearInputDrawable = clearInputDrawable;
        this.backgroundDrawable = backgroundDrawable;
        this.backgroundDrawableOutline = drawableOutline;
        this.containerBackgroundColor = i15;
        this.hintText = hintText;
        this.textSize = i16;
        this.textMarginStart = i17;
        this.textMarginEnd = i18;
        this.searchInputHeight = i19;
        this.searchIconWidth = i24;
        this.searchIconHeight = i25;
        this.searchIconMarginStart = i26;
        this.clearIconWidth = i27;
        this.clearIconHeight = i28;
        this.clearIconMarginEnd = i29;
    }

    public static /* synthetic */ SearchInputViewStyle copy$default(SearchInputViewStyle searchInputViewStyle, int i13, int i14, Drawable drawable, Drawable drawable2, Drawable drawable3, DrawableOutline drawableOutline, int i15, String str, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29, int i34, Object obj) {
        int i35;
        int i36;
        int i37 = (i34 & 1) != 0 ? searchInputViewStyle.textColor : i13;
        int i38 = (i34 & 2) != 0 ? searchInputViewStyle.hintColor : i14;
        Drawable drawable4 = (i34 & 4) != 0 ? searchInputViewStyle.searchIconDrawable : drawable;
        Drawable drawable5 = (i34 & 8) != 0 ? searchInputViewStyle.clearInputDrawable : drawable2;
        Drawable drawable6 = (i34 & 16) != 0 ? searchInputViewStyle.backgroundDrawable : drawable3;
        DrawableOutline drawableOutline2 = (i34 & 32) != 0 ? searchInputViewStyle.backgroundDrawableOutline : drawableOutline;
        int i39 = (i34 & 64) != 0 ? searchInputViewStyle.containerBackgroundColor : i15;
        String str2 = (i34 & 128) != 0 ? searchInputViewStyle.hintText : str;
        int i44 = (i34 & 256) != 0 ? searchInputViewStyle.textSize : i16;
        int i45 = (i34 & 512) != 0 ? searchInputViewStyle.textMarginStart : i17;
        int i46 = (i34 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? searchInputViewStyle.textMarginEnd : i18;
        int i47 = (i34 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? searchInputViewStyle.searchInputHeight : i19;
        int i48 = (i34 & 4096) != 0 ? searchInputViewStyle.searchIconWidth : i24;
        int i49 = (i34 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? searchInputViewStyle.searchIconHeight : i25;
        int i54 = i37;
        int i55 = (i34 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? searchInputViewStyle.searchIconMarginStart : i26;
        int i56 = (i34 & 32768) != 0 ? searchInputViewStyle.clearIconWidth : i27;
        int i57 = (i34 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? searchInputViewStyle.clearIconHeight : i28;
        if ((i34 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            i36 = i57;
            i35 = searchInputViewStyle.clearIconMarginEnd;
        } else {
            i35 = i29;
            i36 = i57;
        }
        return searchInputViewStyle.copy(i54, i38, drawable4, drawable5, drawable6, drawableOutline2, i39, str2, i44, i45, i46, i47, i48, i49, i55, i56, i36, i35);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getTextMarginStart() {
        return this.textMarginStart;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getTextMarginEnd() {
        return this.textMarginEnd;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getSearchInputHeight() {
        return this.searchInputHeight;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getSearchIconWidth() {
        return this.searchIconWidth;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getSearchIconHeight() {
        return this.searchIconHeight;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getSearchIconMarginStart() {
        return this.searchIconMarginStart;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getClearIconWidth() {
        return this.clearIconWidth;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getClearIconHeight() {
        return this.clearIconHeight;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getClearIconMarginEnd() {
        return this.clearIconMarginEnd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHintColor() {
        return this.hintColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Drawable getSearchIconDrawable() {
        return this.searchIconDrawable;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Drawable getClearInputDrawable() {
        return this.clearInputDrawable;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Drawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DrawableOutline getBackgroundDrawableOutline() {
        return this.backgroundDrawableOutline;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getContainerBackgroundColor() {
        return this.containerBackgroundColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getHintText() {
        return this.hintText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getTextSize() {
        return this.textSize;
    }

    public final SearchInputViewStyle copy(int textColor, int hintColor, Drawable searchIconDrawable, Drawable clearInputDrawable, Drawable backgroundDrawable, DrawableOutline backgroundDrawableOutline, int containerBackgroundColor, String hintText, int textSize, int textMarginStart, int textMarginEnd, int searchInputHeight, int searchIconWidth, int searchIconHeight, int searchIconMarginStart, int clearIconWidth, int clearIconHeight, int clearIconMarginEnd) {
        AbstractC22676k.m65750j(searchIconDrawable, "searchIconDrawable");
        AbstractC22676k.m65750j(clearInputDrawable, "clearInputDrawable");
        AbstractC22676k.m65750j(backgroundDrawable, "backgroundDrawable");
        AbstractC22676k.m65750j(hintText, "hintText");
        return new SearchInputViewStyle(textColor, hintColor, searchIconDrawable, clearInputDrawable, backgroundDrawable, backgroundDrawableOutline, containerBackgroundColor, hintText, textSize, textMarginStart, textMarginEnd, searchInputHeight, searchIconWidth, searchIconHeight, searchIconMarginStart, clearIconWidth, clearIconHeight, clearIconMarginEnd);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchInputViewStyle)) {
            return false;
        }
        SearchInputViewStyle searchInputViewStyle = (SearchInputViewStyle) other;
        return this.textColor == searchInputViewStyle.textColor && this.hintColor == searchInputViewStyle.hintColor && AbstractC22676k.m65745e(this.searchIconDrawable, searchInputViewStyle.searchIconDrawable) && AbstractC22676k.m65745e(this.clearInputDrawable, searchInputViewStyle.clearInputDrawable) && AbstractC22676k.m65745e(this.backgroundDrawable, searchInputViewStyle.backgroundDrawable) && AbstractC22676k.m65745e(this.backgroundDrawableOutline, searchInputViewStyle.backgroundDrawableOutline) && this.containerBackgroundColor == searchInputViewStyle.containerBackgroundColor && AbstractC22676k.m65745e(this.hintText, searchInputViewStyle.hintText) && this.textSize == searchInputViewStyle.textSize && this.textMarginStart == searchInputViewStyle.textMarginStart && this.textMarginEnd == searchInputViewStyle.textMarginEnd && this.searchInputHeight == searchInputViewStyle.searchInputHeight && this.searchIconWidth == searchInputViewStyle.searchIconWidth && this.searchIconHeight == searchInputViewStyle.searchIconHeight && this.searchIconMarginStart == searchInputViewStyle.searchIconMarginStart && this.clearIconWidth == searchInputViewStyle.clearIconWidth && this.clearIconHeight == searchInputViewStyle.clearIconHeight && this.clearIconMarginEnd == searchInputViewStyle.clearIconMarginEnd;
    }

    public final Drawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    public final DrawableOutline getBackgroundDrawableOutline() {
        return this.backgroundDrawableOutline;
    }

    public final int getClearIconHeight() {
        return this.clearIconHeight;
    }

    public final int getClearIconMarginEnd() {
        return this.clearIconMarginEnd;
    }

    public final int getClearIconWidth() {
        return this.clearIconWidth;
    }

    public final Drawable getClearInputDrawable() {
        return this.clearInputDrawable;
    }

    public final int getContainerBackgroundColor() {
        return this.containerBackgroundColor;
    }

    public final int getHintColor() {
        return this.hintColor;
    }

    public final String getHintText() {
        return this.hintText;
    }

    public final Drawable getSearchIconDrawable() {
        return this.searchIconDrawable;
    }

    public final int getSearchIconHeight() {
        return this.searchIconHeight;
    }

    public final int getSearchIconMarginStart() {
        return this.searchIconMarginStart;
    }

    public final int getSearchIconWidth() {
        return this.searchIconWidth;
    }

    public final int getSearchInputHeight() {
        return this.searchInputHeight;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTextMarginEnd() {
        return this.textMarginEnd;
    }

    public final int getTextMarginStart() {
        return this.textMarginStart;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final int hashCode() {
        int iM79497a = AbstractC26725a.m79497a(this.backgroundDrawable, AbstractC26725a.m79497a(this.clearInputDrawable, AbstractC26725a.m79497a(this.searchIconDrawable, AbstractC11266d.m30448b(this.hintColor, Integer.hashCode(this.textColor) * 31, 31), 31), 31), 31);
        DrawableOutline drawableOutline = this.backgroundDrawableOutline;
        return Integer.hashCode(this.clearIconMarginEnd) + AbstractC11266d.m30448b(this.clearIconHeight, AbstractC11266d.m30448b(this.clearIconWidth, AbstractC11266d.m30448b(this.searchIconMarginStart, AbstractC11266d.m30448b(this.searchIconHeight, AbstractC11266d.m30448b(this.searchIconWidth, AbstractC11266d.m30448b(this.searchInputHeight, AbstractC11266d.m30448b(this.textMarginEnd, AbstractC11266d.m30448b(this.textMarginStart, AbstractC11266d.m30448b(this.textSize, AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.containerBackgroundColor, (iM79497a + (drawableOutline == null ? 0 : drawableOutline.hashCode())) * 31, 31), 31, this.hintText), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        int i13 = this.textColor;
        int i14 = this.hintColor;
        Drawable drawable = this.searchIconDrawable;
        Drawable drawable2 = this.clearInputDrawable;
        Drawable drawable3 = this.backgroundDrawable;
        DrawableOutline drawableOutline = this.backgroundDrawableOutline;
        int i15 = this.containerBackgroundColor;
        String str = this.hintText;
        int i16 = this.textSize;
        int i17 = this.textMarginStart;
        int i18 = this.textMarginEnd;
        int i19 = this.searchInputHeight;
        int i24 = this.searchIconWidth;
        int i25 = this.searchIconHeight;
        int i26 = this.searchIconMarginStart;
        int i27 = this.clearIconWidth;
        int i28 = this.clearIconHeight;
        int i29 = this.clearIconMarginEnd;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "SearchInputViewStyle(textColor=", ", hintColor=", ", searchIconDrawable=");
        sbM30465s.append(drawable);
        sbM30465s.append(", clearInputDrawable=");
        sbM30465s.append(drawable2);
        sbM30465s.append(", backgroundDrawable=");
        sbM30465s.append(drawable3);
        sbM30465s.append(", backgroundDrawableOutline=");
        sbM30465s.append(drawableOutline);
        sbM30465s.append(", containerBackgroundColor=");
        AbstractC11895b.m31979B(i15, ", hintText=", str, ", textSize=", sbM30465s);
        AbstractC30802r.m94773v(sbM30465s, i16, ", textMarginStart=", i17, ", textMarginEnd=");
        AbstractC30802r.m94773v(sbM30465s, i18, ", searchInputHeight=", i19, ", searchIconWidth=");
        AbstractC30802r.m94773v(sbM30465s, i24, ", searchIconHeight=", i25, ", searchIconMarginStart=");
        AbstractC30802r.m94773v(sbM30465s, i26, ", clearIconWidth=", i27, ", clearIconHeight=");
        return AbstractC26725a.m79505i(sbM30465s, i28, ", clearIconMarginEnd=", i29, ")");
    }
}
