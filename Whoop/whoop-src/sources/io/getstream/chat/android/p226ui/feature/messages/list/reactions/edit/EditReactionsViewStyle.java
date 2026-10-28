package io.getstream.chat.android.p226ui.feature.messages.list.reactions.edit;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 92\u00020\u0001:\u000289B\u0091\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u0095\u0001\u00100\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u0006:"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "bubbleColorMine", "", "bubbleColorTheirs", "horizontalPadding", "itemSize", "bubbleHeight", "bubbleRadius", "largeTailBubbleCyOffset", "largeTailBubbleRadius", "largeTailBubbleOffset", "smallTailBubbleCyOffset", "smallTailBubbleRadius", "smallTailBubbleOffset", "reactionsColumn", "verticalPadding", "<init>", "(IIIIIIIIIIIIII)V", "getBubbleColorMine", "()I", "getBubbleColorTheirs", "getHorizontalPadding", "getItemSize", "getBubbleHeight", "getBubbleRadius", "getLargeTailBubbleCyOffset", "getLargeTailBubbleRadius", "getLargeTailBubbleOffset", "getSmallTailBubbleCyOffset", "getSmallTailBubbleRadius", "getSmallTailBubbleOffset", "getReactionsColumn", "getVerticalPadding", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Builder", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class EditReactionsViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final int bubbleColorMine;
    private final int bubbleColorTheirs;
    private final int bubbleHeight;
    private final int bubbleRadius;
    private final int horizontalPadding;
    private final int itemSize;
    private final int largeTailBubbleCyOffset;
    private final int largeTailBubbleOffset;
    private final int largeTailBubbleRadius;
    private final int reactionsColumn;
    private final int smallTailBubbleCyOffset;
    private final int smallTailBubbleOffset;
    private final int smallTailBubbleRadius;
    private final int verticalPadding;

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\r\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;", "", "array", "Landroid/content/res/TypedArray;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/res/TypedArray;Landroid/content/Context;)V", "bubbleColorMine", "", "bubbleColorTheirs", "reactionsColumn", "bubbleColorMineResId", "bubbleColorTheirsResId", "reactionsColumns", "columnsResId", "build", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Builder {
        private final TypedArray array;
        private int bubbleColorMine;
        private int bubbleColorTheirs;
        private final Context context;
        private int reactionsColumn;

        public Builder(TypedArray array, Context context) {
            AbstractC22676k.m65750j(array, "array");
            AbstractC22676k.m65750j(context, "context");
            this.array = array;
            this.context = context;
            this.bubbleColorMine = ContextKt.getColorCompat(context, C19469R.color.stream_ui_white);
            this.bubbleColorTheirs = ContextKt.getColorCompat(context, C19469R.color.stream_ui_white);
            this.reactionsColumn = 5;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        private final TypedArray getArray() {
            return this.array;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        private final Context getContext() {
            return this.context;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, TypedArray typedArray, Context context, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                typedArray = builder.array;
            }
            if ((i13 & 2) != 0) {
                context = builder.context;
            }
            return builder.copy(typedArray, context);
        }

        public final Builder bubbleColorMine(int bubbleColorMineResId) {
            this.bubbleColorMine = this.array.getColor(bubbleColorMineResId, ContextKt.getColorCompat(this.context, C19469R.color.stream_ui_white));
            return this;
        }

        public final Builder bubbleColorTheirs(int bubbleColorTheirsResId) {
            this.bubbleColorTheirs = this.array.getColor(bubbleColorTheirsResId, ContextKt.getColorCompat(this.context, C19469R.color.stream_ui_white));
            return this;
        }

        public final EditReactionsViewStyle build() {
            return TransformStyle.getEditReactionsStyleTransformer().transform(new EditReactionsViewStyle(this.bubbleColorMine, this.bubbleColorTheirs, ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_edit_reactions_horizontal_padding), ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_edit_reactions_item_size), ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_edit_reactions_bubble_height), ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_edit_reactions_bubble_radius), ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_edit_reactions_large_tail_bubble_cy_offset), ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_edit_reactions_large_tail_bubble_radius), ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_edit_reactions_large_tail_bubble_offset), ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_edit_reactions_small_tail_bubble_cy_offset), ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_edit_reactions_small_tail_bubble_radius), ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_edit_reactions_small_tail_bubble_offset), this.reactionsColumn, ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_edit_reactions_vertical_padding)));
        }

        public final Builder copy(TypedArray array, Context context) {
            AbstractC22676k.m65750j(array, "array");
            AbstractC22676k.m65750j(context, "context");
            return new Builder(array, context);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return AbstractC22676k.m65745e(this.array, builder.array) && AbstractC22676k.m65745e(this.context, builder.context);
        }

        public final int hashCode() {
            return this.context.hashCode() + (this.array.hashCode() * 31);
        }

        public final Builder reactionsColumns(int columnsResId) {
            this.reactionsColumn = this.array.getInt(columnsResId, 5);
            return this;
        }

        public final String toString() {
            return "Builder(array=" + this.array + ", context=" + this.context + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0080\u0002¢\u0006\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "invoke$stream_chat_android_ui_components_release", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final EditReactionsViewStyle invoke$stream_chat_android_ui_components_release(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.EditReactionsView, 0, 0);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            Builder builder = new Builder(typedArrayObtainStyledAttributes, context);
            builder.bubbleColorMine(C19469R.styleable.EditReactionsView_streamUiReactionsBubbleColorMine);
            builder.bubbleColorTheirs(C19469R.styleable.EditReactionsView_streamUiReactionsBubbleColorTheirs);
            return builder.build();
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public EditReactionsViewStyle(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29, int i34) {
        this.bubbleColorMine = i13;
        this.bubbleColorTheirs = i14;
        this.horizontalPadding = i15;
        this.itemSize = i16;
        this.bubbleHeight = i17;
        this.bubbleRadius = i18;
        this.largeTailBubbleCyOffset = i19;
        this.largeTailBubbleRadius = i24;
        this.largeTailBubbleOffset = i25;
        this.smallTailBubbleCyOffset = i26;
        this.smallTailBubbleRadius = i27;
        this.smallTailBubbleOffset = i28;
        this.reactionsColumn = i29;
        this.verticalPadding = i34;
    }

    public static EditReactionsViewStyle copy$default(EditReactionsViewStyle editReactionsViewStyle, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29, int i34, int i35, Object obj) {
        int i36 = (i35 & 1) != 0 ? editReactionsViewStyle.bubbleColorMine : i13;
        int i37 = (i35 & 2) != 0 ? editReactionsViewStyle.bubbleColorTheirs : i14;
        int i38 = (i35 & 4) != 0 ? editReactionsViewStyle.horizontalPadding : i15;
        int i39 = (i35 & 8) != 0 ? editReactionsViewStyle.itemSize : i16;
        int i44 = (i35 & 16) != 0 ? editReactionsViewStyle.bubbleHeight : i17;
        int i45 = (i35 & 32) != 0 ? editReactionsViewStyle.bubbleRadius : i18;
        int i46 = (i35 & 64) != 0 ? editReactionsViewStyle.largeTailBubbleCyOffset : i19;
        int i47 = (i35 & 128) != 0 ? editReactionsViewStyle.largeTailBubbleRadius : i24;
        int i48 = (i35 & 256) != 0 ? editReactionsViewStyle.largeTailBubbleOffset : i25;
        int i49 = (i35 & 512) != 0 ? editReactionsViewStyle.smallTailBubbleCyOffset : i26;
        int i54 = (i35 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? editReactionsViewStyle.smallTailBubbleRadius : i27;
        int i55 = (i35 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? editReactionsViewStyle.smallTailBubbleOffset : i28;
        int i56 = (i35 & 4096) != 0 ? editReactionsViewStyle.reactionsColumn : i29;
        int i57 = (i35 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? editReactionsViewStyle.verticalPadding : i34;
        editReactionsViewStyle.getClass();
        return new EditReactionsViewStyle(i36, i37, i38, i39, i44, i45, i46, i47, i48, i49, i54, i55, i56, i57);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBubbleColorMine() {
        return this.bubbleColorMine;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getSmallTailBubbleCyOffset() {
        return this.smallTailBubbleCyOffset;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getSmallTailBubbleRadius() {
        return this.smallTailBubbleRadius;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getSmallTailBubbleOffset() {
        return this.smallTailBubbleOffset;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getReactionsColumn() {
        return this.reactionsColumn;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getVerticalPadding() {
        return this.verticalPadding;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBubbleColorTheirs() {
        return this.bubbleColorTheirs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getItemSize() {
        return this.itemSize;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBubbleHeight() {
        return this.bubbleHeight;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBubbleRadius() {
        return this.bubbleRadius;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getLargeTailBubbleCyOffset() {
        return this.largeTailBubbleCyOffset;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getLargeTailBubbleRadius() {
        return this.largeTailBubbleRadius;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getLargeTailBubbleOffset() {
        return this.largeTailBubbleOffset;
    }

    public final EditReactionsViewStyle copy(int bubbleColorMine, int bubbleColorTheirs, int horizontalPadding, int itemSize, int bubbleHeight, int bubbleRadius, int largeTailBubbleCyOffset, int largeTailBubbleRadius, int largeTailBubbleOffset, int smallTailBubbleCyOffset, int smallTailBubbleRadius, int smallTailBubbleOffset, int reactionsColumn, int verticalPadding) {
        return new EditReactionsViewStyle(bubbleColorMine, bubbleColorTheirs, horizontalPadding, itemSize, bubbleHeight, bubbleRadius, largeTailBubbleCyOffset, largeTailBubbleRadius, largeTailBubbleOffset, smallTailBubbleCyOffset, smallTailBubbleRadius, smallTailBubbleOffset, reactionsColumn, verticalPadding);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditReactionsViewStyle)) {
            return false;
        }
        EditReactionsViewStyle editReactionsViewStyle = (EditReactionsViewStyle) other;
        return this.bubbleColorMine == editReactionsViewStyle.bubbleColorMine && this.bubbleColorTheirs == editReactionsViewStyle.bubbleColorTheirs && this.horizontalPadding == editReactionsViewStyle.horizontalPadding && this.itemSize == editReactionsViewStyle.itemSize && this.bubbleHeight == editReactionsViewStyle.bubbleHeight && this.bubbleRadius == editReactionsViewStyle.bubbleRadius && this.largeTailBubbleCyOffset == editReactionsViewStyle.largeTailBubbleCyOffset && this.largeTailBubbleRadius == editReactionsViewStyle.largeTailBubbleRadius && this.largeTailBubbleOffset == editReactionsViewStyle.largeTailBubbleOffset && this.smallTailBubbleCyOffset == editReactionsViewStyle.smallTailBubbleCyOffset && this.smallTailBubbleRadius == editReactionsViewStyle.smallTailBubbleRadius && this.smallTailBubbleOffset == editReactionsViewStyle.smallTailBubbleOffset && this.reactionsColumn == editReactionsViewStyle.reactionsColumn && this.verticalPadding == editReactionsViewStyle.verticalPadding;
    }

    public final int getBubbleColorMine() {
        return this.bubbleColorMine;
    }

    public final int getBubbleColorTheirs() {
        return this.bubbleColorTheirs;
    }

    public final int getBubbleHeight() {
        return this.bubbleHeight;
    }

    public final int getBubbleRadius() {
        return this.bubbleRadius;
    }

    public final int getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final int getItemSize() {
        return this.itemSize;
    }

    public final int getLargeTailBubbleCyOffset() {
        return this.largeTailBubbleCyOffset;
    }

    public final int getLargeTailBubbleOffset() {
        return this.largeTailBubbleOffset;
    }

    public final int getLargeTailBubbleRadius() {
        return this.largeTailBubbleRadius;
    }

    public final int getReactionsColumn() {
        return this.reactionsColumn;
    }

    public final int getSmallTailBubbleCyOffset() {
        return this.smallTailBubbleCyOffset;
    }

    public final int getSmallTailBubbleOffset() {
        return this.smallTailBubbleOffset;
    }

    public final int getSmallTailBubbleRadius() {
        return this.smallTailBubbleRadius;
    }

    public final int getVerticalPadding() {
        return this.verticalPadding;
    }

    public final int hashCode() {
        return Integer.hashCode(this.verticalPadding) + AbstractC11266d.m30448b(this.reactionsColumn, AbstractC11266d.m30448b(this.smallTailBubbleOffset, AbstractC11266d.m30448b(this.smallTailBubbleRadius, AbstractC11266d.m30448b(this.smallTailBubbleCyOffset, AbstractC11266d.m30448b(this.largeTailBubbleOffset, AbstractC11266d.m30448b(this.largeTailBubbleRadius, AbstractC11266d.m30448b(this.largeTailBubbleCyOffset, AbstractC11266d.m30448b(this.bubbleRadius, AbstractC11266d.m30448b(this.bubbleHeight, AbstractC11266d.m30448b(this.itemSize, AbstractC11266d.m30448b(this.horizontalPadding, AbstractC11266d.m30448b(this.bubbleColorTheirs, Integer.hashCode(this.bubbleColorMine) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        int i13 = this.bubbleColorMine;
        int i14 = this.bubbleColorTheirs;
        int i15 = this.horizontalPadding;
        int i16 = this.itemSize;
        int i17 = this.bubbleHeight;
        int i18 = this.bubbleRadius;
        int i19 = this.largeTailBubbleCyOffset;
        int i24 = this.largeTailBubbleRadius;
        int i25 = this.largeTailBubbleOffset;
        int i26 = this.smallTailBubbleCyOffset;
        int i27 = this.smallTailBubbleRadius;
        int i28 = this.smallTailBubbleOffset;
        int i29 = this.reactionsColumn;
        int i34 = this.verticalPadding;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "EditReactionsViewStyle(bubbleColorMine=", ", bubbleColorTheirs=", ", horizontalPadding=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", itemSize=", i16, ", bubbleHeight=");
        AbstractC30802r.m94773v(sbM30465s, i17, ", bubbleRadius=", i18, ", largeTailBubbleCyOffset=");
        AbstractC30802r.m94773v(sbM30465s, i19, ", largeTailBubbleRadius=", i24, ", largeTailBubbleOffset=");
        AbstractC30802r.m94773v(sbM30465s, i25, ", smallTailBubbleCyOffset=", i26, ", smallTailBubbleRadius=");
        AbstractC30802r.m94773v(sbM30465s, i27, ", smallTailBubbleOffset=", i28, ", reactionsColumn=");
        return AbstractC26725a.m79505i(sbM30465s, i29, ", verticalPadding=", i34, ")");
    }
}
