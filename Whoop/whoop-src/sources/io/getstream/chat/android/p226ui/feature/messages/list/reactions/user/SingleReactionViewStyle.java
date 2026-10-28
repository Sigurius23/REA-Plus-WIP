package io.getstream.chat.android.p226ui.feature.messages.list.reactions.user;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageOptionsUserReactionAlignment;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.ViewReactionsViewStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import io.getstream.chat.android.p226ui.utils.extensions.TypedArrayKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewReactionsViewStyleKt;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b6\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 E2\u00020\u0001:\u0001EB©\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J²\u0001\u0010<\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020\u0003HÖ\u0001J\t\u0010C\u001a\u00020DHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0017¨\u0006F"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "bubbleBorderColorMine", "", "bubbleBorderColorTheirs", "bubbleColorMine", "bubbleColorTheirs", "bubbleBorderWidthMine", "", "bubbleBorderWidthTheirs", "totalHeight", "bubbleHeight", "bubbleRadius", "largeTailBubbleCy", "largeTailBubbleRadius", "largeTailBubbleOffset", "smallTailBubbleCy", "smallTailBubbleRadius", "smallTailBubbleOffset", "reactionOrientation", "<init>", "(ILjava/lang/Integer;IIFLjava/lang/Float;IIIIIIIIII)V", "getBubbleBorderColorMine", "()I", "getBubbleBorderColorTheirs", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBubbleColorMine", "getBubbleColorTheirs", "getBubbleBorderWidthMine", "()F", "getBubbleBorderWidthTheirs", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getTotalHeight", "getBubbleHeight", "getBubbleRadius", "getLargeTailBubbleCy", "getLargeTailBubbleRadius", "getLargeTailBubbleOffset", "getSmallTailBubbleCy", "getSmallTailBubbleRadius", "getSmallTailBubbleOffset", "getReactionOrientation", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(ILjava/lang/Integer;IIFLjava/lang/Float;IIIIIIIIII)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class SingleReactionViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final int DEFAULT_BUBBLE_BORDER_COLOR_MINE;
    private static final float DEFAULT_BUBBLE_BORDER_WIDTH_MINE;
    private static final int DEFAULT_BUBBLE_COLOR_MINE;
    private static final int DEFAULT_BUBBLE_COLOR_THEIRS;
    private final int bubbleBorderColorMine;
    private final Integer bubbleBorderColorTheirs;
    private final float bubbleBorderWidthMine;
    private final Float bubbleBorderWidthTheirs;
    private final int bubbleColorMine;
    private final int bubbleColorTheirs;
    private final int bubbleHeight;
    private final int bubbleRadius;
    private final int largeTailBubbleCy;
    private final int largeTailBubbleOffset;
    private final int largeTailBubbleRadius;
    private final int reactionOrientation;
    private final int smallTailBubbleCy;
    private final int smallTailBubbleOffset;
    private final int smallTailBubbleRadius;
    private final int totalHeight;

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0086\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion;", "", "<init>", "()V", "DEFAULT_BUBBLE_BORDER_COLOR_MINE", "", "DEFAULT_BUBBLE_COLOR_MINE", "DEFAULT_BUBBLE_COLOR_THEIRS", "DEFAULT_BUBBLE_BORDER_WIDTH_MINE", "", "invoke", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "Builder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u0015\u001a\u00020\tJ\u0010\u0010\f\u001a\u00020\u00002\b\b\u0001\u0010\u0015\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\tJ\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\tJ\u0010\u0010\u0017\u001a\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\tJ\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;", "", "array", "Landroid/content/res/TypedArray;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/res/TypedArray;Landroid/content/Context;)V", "bubbleColorTheirs", "", "bubbleColorMine", "bubbleBorderColorMine", "bubbleBorderColorTheirs", "Ljava/lang/Integer;", "bubbleBorderWidthMine", "", "bubbleBorderWidthTheirs", "Ljava/lang/Float;", "reactionOrientation", "theirsBubbleColorAttribute", "mineBubbleColorAttribute", "bubbleBorderColorAttribute", "bubbleBorderWidthAttribute", "messageOptionsUserReactionBubbleOrientation", "bubbleOrientation", "build", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Builder {
            private final TypedArray array;
            private int bubbleBorderColorMine;
            private Integer bubbleBorderColorTheirs;
            private float bubbleBorderWidthMine;
            private Float bubbleBorderWidthTheirs;
            private int bubbleColorMine;
            private int bubbleColorTheirs;
            private final Context context;
            private int reactionOrientation;

            public Builder(TypedArray array, Context context) {
                AbstractC22676k.m65750j(array, "array");
                AbstractC22676k.m65750j(context, "context");
                this.array = array;
                this.context = context;
                this.bubbleColorTheirs = ContextKt.getColorCompat(context, SingleReactionViewStyle.DEFAULT_BUBBLE_COLOR_THEIRS);
                this.bubbleColorMine = ContextKt.getColorCompat(context, SingleReactionViewStyle.DEFAULT_BUBBLE_COLOR_MINE);
                this.bubbleBorderColorMine = ContextKt.getColorCompat(context, SingleReactionViewStyle.DEFAULT_BUBBLE_BORDER_COLOR_MINE);
                this.bubbleBorderWidthMine = SingleReactionViewStyle.DEFAULT_BUBBLE_BORDER_WIDTH_MINE;
                this.reactionOrientation = MessageOptionsUserReactionAlignment.BY_USER.getValue();
            }

            public final Builder bubbleBorderColorMine(int bubbleBorderColorAttribute) {
                this.bubbleBorderColorMine = this.array.getColor(bubbleBorderColorAttribute, ContextKt.getColorCompat(this.context, SingleReactionViewStyle.DEFAULT_BUBBLE_BORDER_COLOR_MINE));
                return this;
            }

            public final Builder bubbleBorderColorTheirs(int bubbleBorderColorAttribute) {
                this.bubbleBorderColorTheirs = TypedArrayKt.getColorOrNull(this.array, bubbleBorderColorAttribute);
                return this;
            }

            public final Builder bubbleBorderWidthMine(int bubbleBorderWidthAttribute) {
                this.bubbleBorderWidthMine = this.array.getDimension(bubbleBorderWidthAttribute, SingleReactionViewStyle.DEFAULT_BUBBLE_BORDER_WIDTH_MINE);
                return this;
            }

            public final Builder bubbleBorderWidthTheirs(int bubbleBorderWidthAttribute) {
                this.bubbleBorderWidthTheirs = TypedArrayKt.getDimensionOrNull(this.array, bubbleBorderWidthAttribute);
                return this;
            }

            public final Builder bubbleColorMine(int mineBubbleColorAttribute) {
                this.bubbleColorMine = this.array.getColor(mineBubbleColorAttribute, ContextKt.getColorCompat(this.context, SingleReactionViewStyle.DEFAULT_BUBBLE_COLOR_MINE));
                return this;
            }

            public final Builder bubbleColorTheirs(int theirsBubbleColorAttribute) {
                this.bubbleColorTheirs = this.array.getColor(theirsBubbleColorAttribute, ContextKt.getColorCompat(this.context, SingleReactionViewStyle.DEFAULT_BUBBLE_COLOR_THEIRS));
                return this;
            }

            public final SingleReactionViewStyle build() {
                int dimension = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_single_reaction_view_total_height);
                int dimension2 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_single_reaction_view_bubble_height);
                int dimension3 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_single_reaction_view_bubble_radius);
                int dimension4 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_single_reaction_view_large_tail_bubble_cy);
                int dimension5 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_single_reaction_view_large_tail_bubble_radius);
                int dimension6 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_single_reaction_view_large_tail_bubble_offset);
                int dimension7 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_single_reaction_view_small_tail_bubble_cy);
                int dimension8 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_single_reaction_view_small_tail_bubble_radius);
                int dimension9 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_single_reaction_view_small_tail_bubble_offset);
                return TransformStyle.getSingleReactionViewStyleTransformer().transform(new SingleReactionViewStyle(this.bubbleBorderColorMine, this.bubbleBorderColorTheirs, this.bubbleColorMine, this.bubbleColorTheirs, this.bubbleBorderWidthMine, this.bubbleBorderWidthTheirs, dimension, dimension2, dimension3, dimension4, dimension5, dimension6, dimension7, dimension8, dimension9, this.reactionOrientation));
            }

            public final Builder messageOptionsUserReactionBubbleOrientation(int bubbleOrientation) {
                this.reactionOrientation = this.array.getInt(bubbleOrientation, MessageOptionsUserReactionAlignment.BY_USER.getValue());
                return this;
            }
        }

        private Companion() {
        }

        public final SingleReactionViewStyle invoke(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.SingleReactionView, C19469R.attr.streamUiSingleReactionViewStyle, 0);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            if (typedArrayObtainStyledAttributes.getIndexCount() == 0) {
                return ViewReactionsViewStyleKt.toSingleReactionViewStyle(ViewReactionsViewStyle.INSTANCE.invoke(context, attrs));
            }
            Builder builder = new Builder(typedArrayObtainStyledAttributes, context);
            builder.bubbleBorderColorMine(C19469R.styleable.SingleReactionView_streamUiSingleReactionBubbleBorderColorMine);
            builder.bubbleBorderColorTheirs(C19469R.styleable.SingleReactionView_streamUiSingleReactionBubbleBorderColorTheirs);
            builder.bubbleBorderWidthMine(C19469R.styleable.SingleReactionView_streamUiSingleReactionBubbleBorderWidthMine);
            builder.bubbleBorderWidthTheirs(C19469R.styleable.SingleReactionView_streamUiSingleReactionBubbleBorderWidthTheirs);
            builder.bubbleColorMine(C19469R.styleable.SingleReactionView_streamUiSingleReactionBubbleColorMine);
            builder.bubbleColorTheirs(C19469R.styleable.SingleReactionView_streamUiSingleReactionBubbleColorTheirs);
            builder.messageOptionsUserReactionBubbleOrientation(C19469R.styleable.SingleReactionView_streamUiSingleReactionBubbleOrientation);
            return builder.build();
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i13 = C19469R.color.stream_ui_grey_whisper;
        DEFAULT_BUBBLE_BORDER_COLOR_MINE = i13;
        DEFAULT_BUBBLE_COLOR_MINE = i13;
        DEFAULT_BUBBLE_COLOR_THEIRS = C19469R.color.stream_ui_grey_gainsboro;
        DEFAULT_BUBBLE_BORDER_WIDTH_MINE = IntKt.dpToPx(1) * 1.5f;
    }

    public SingleReactionViewStyle(int i13, Integer num, int i14, int i15, float f13, Float f14, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29) {
        this.bubbleBorderColorMine = i13;
        this.bubbleBorderColorTheirs = num;
        this.bubbleColorMine = i14;
        this.bubbleColorTheirs = i15;
        this.bubbleBorderWidthMine = f13;
        this.bubbleBorderWidthTheirs = f14;
        this.totalHeight = i16;
        this.bubbleHeight = i17;
        this.bubbleRadius = i18;
        this.largeTailBubbleCy = i19;
        this.largeTailBubbleRadius = i24;
        this.largeTailBubbleOffset = i25;
        this.smallTailBubbleCy = i26;
        this.smallTailBubbleRadius = i27;
        this.smallTailBubbleOffset = i28;
        this.reactionOrientation = i29;
    }

    public static SingleReactionViewStyle copy$default(SingleReactionViewStyle singleReactionViewStyle, int i13, Integer num, int i14, int i15, float f13, Float f14, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29, int i34, Object obj) {
        int i35 = (i34 & 1) != 0 ? singleReactionViewStyle.bubbleBorderColorMine : i13;
        Integer num2 = (i34 & 2) != 0 ? singleReactionViewStyle.bubbleBorderColorTheirs : num;
        int i36 = (i34 & 4) != 0 ? singleReactionViewStyle.bubbleColorMine : i14;
        int i37 = (i34 & 8) != 0 ? singleReactionViewStyle.bubbleColorTheirs : i15;
        float f15 = (i34 & 16) != 0 ? singleReactionViewStyle.bubbleBorderWidthMine : f13;
        Float f16 = (i34 & 32) != 0 ? singleReactionViewStyle.bubbleBorderWidthTheirs : f14;
        int i38 = (i34 & 64) != 0 ? singleReactionViewStyle.totalHeight : i16;
        int i39 = (i34 & 128) != 0 ? singleReactionViewStyle.bubbleHeight : i17;
        int i44 = (i34 & 256) != 0 ? singleReactionViewStyle.bubbleRadius : i18;
        int i45 = (i34 & 512) != 0 ? singleReactionViewStyle.largeTailBubbleCy : i19;
        int i46 = (i34 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? singleReactionViewStyle.largeTailBubbleRadius : i24;
        int i47 = (i34 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? singleReactionViewStyle.largeTailBubbleOffset : i25;
        int i48 = (i34 & 4096) != 0 ? singleReactionViewStyle.smallTailBubbleCy : i26;
        int i49 = (i34 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? singleReactionViewStyle.smallTailBubbleRadius : i27;
        int i54 = i35;
        int i55 = (i34 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? singleReactionViewStyle.smallTailBubbleOffset : i28;
        int i56 = (i34 & 32768) != 0 ? singleReactionViewStyle.reactionOrientation : i29;
        singleReactionViewStyle.getClass();
        return new SingleReactionViewStyle(i54, num2, i36, i37, f15, f16, i38, i39, i44, i45, i46, i47, i48, i49, i55, i56);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBubbleBorderColorMine() {
        return this.bubbleBorderColorMine;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getLargeTailBubbleCy() {
        return this.largeTailBubbleCy;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getLargeTailBubbleRadius() {
        return this.largeTailBubbleRadius;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getLargeTailBubbleOffset() {
        return this.largeTailBubbleOffset;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getSmallTailBubbleCy() {
        return this.smallTailBubbleCy;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getSmallTailBubbleRadius() {
        return this.smallTailBubbleRadius;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getSmallTailBubbleOffset() {
        return this.smallTailBubbleOffset;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getReactionOrientation() {
        return this.reactionOrientation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getBubbleBorderColorTheirs() {
        return this.bubbleBorderColorTheirs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBubbleColorMine() {
        return this.bubbleColorMine;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBubbleColorTheirs() {
        return this.bubbleColorTheirs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getBubbleBorderWidthMine() {
        return this.bubbleBorderWidthMine;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Float getBubbleBorderWidthTheirs() {
        return this.bubbleBorderWidthTheirs;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTotalHeight() {
        return this.totalHeight;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getBubbleHeight() {
        return this.bubbleHeight;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getBubbleRadius() {
        return this.bubbleRadius;
    }

    public final SingleReactionViewStyle copy(int bubbleBorderColorMine, Integer bubbleBorderColorTheirs, int bubbleColorMine, int bubbleColorTheirs, float bubbleBorderWidthMine, Float bubbleBorderWidthTheirs, int totalHeight, int bubbleHeight, int bubbleRadius, int largeTailBubbleCy, int largeTailBubbleRadius, int largeTailBubbleOffset, int smallTailBubbleCy, int smallTailBubbleRadius, int smallTailBubbleOffset, int reactionOrientation) {
        return new SingleReactionViewStyle(bubbleBorderColorMine, bubbleBorderColorTheirs, bubbleColorMine, bubbleColorTheirs, bubbleBorderWidthMine, bubbleBorderWidthTheirs, totalHeight, bubbleHeight, bubbleRadius, largeTailBubbleCy, largeTailBubbleRadius, largeTailBubbleOffset, smallTailBubbleCy, smallTailBubbleRadius, smallTailBubbleOffset, reactionOrientation);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReactionViewStyle)) {
            return false;
        }
        SingleReactionViewStyle singleReactionViewStyle = (SingleReactionViewStyle) other;
        return this.bubbleBorderColorMine == singleReactionViewStyle.bubbleBorderColorMine && AbstractC22676k.m65745e(this.bubbleBorderColorTheirs, singleReactionViewStyle.bubbleBorderColorTheirs) && this.bubbleColorMine == singleReactionViewStyle.bubbleColorMine && this.bubbleColorTheirs == singleReactionViewStyle.bubbleColorTheirs && Float.compare(this.bubbleBorderWidthMine, singleReactionViewStyle.bubbleBorderWidthMine) == 0 && AbstractC22676k.m65745e(this.bubbleBorderWidthTheirs, singleReactionViewStyle.bubbleBorderWidthTheirs) && this.totalHeight == singleReactionViewStyle.totalHeight && this.bubbleHeight == singleReactionViewStyle.bubbleHeight && this.bubbleRadius == singleReactionViewStyle.bubbleRadius && this.largeTailBubbleCy == singleReactionViewStyle.largeTailBubbleCy && this.largeTailBubbleRadius == singleReactionViewStyle.largeTailBubbleRadius && this.largeTailBubbleOffset == singleReactionViewStyle.largeTailBubbleOffset && this.smallTailBubbleCy == singleReactionViewStyle.smallTailBubbleCy && this.smallTailBubbleRadius == singleReactionViewStyle.smallTailBubbleRadius && this.smallTailBubbleOffset == singleReactionViewStyle.smallTailBubbleOffset && this.reactionOrientation == singleReactionViewStyle.reactionOrientation;
    }

    public final int getBubbleBorderColorMine() {
        return this.bubbleBorderColorMine;
    }

    public final Integer getBubbleBorderColorTheirs() {
        return this.bubbleBorderColorTheirs;
    }

    public final float getBubbleBorderWidthMine() {
        return this.bubbleBorderWidthMine;
    }

    public final Float getBubbleBorderWidthTheirs() {
        return this.bubbleBorderWidthTheirs;
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

    public final int getLargeTailBubbleCy() {
        return this.largeTailBubbleCy;
    }

    public final int getLargeTailBubbleOffset() {
        return this.largeTailBubbleOffset;
    }

    public final int getLargeTailBubbleRadius() {
        return this.largeTailBubbleRadius;
    }

    public final int getReactionOrientation() {
        return this.reactionOrientation;
    }

    public final int getSmallTailBubbleCy() {
        return this.smallTailBubbleCy;
    }

    public final int getSmallTailBubbleOffset() {
        return this.smallTailBubbleOffset;
    }

    public final int getSmallTailBubbleRadius() {
        return this.smallTailBubbleRadius;
    }

    public final int getTotalHeight() {
        return this.totalHeight;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.bubbleBorderColorMine) * 31;
        Integer num = this.bubbleBorderColorTheirs;
        int iM30447a = AbstractC11266d.m30447a(this.bubbleBorderWidthMine, AbstractC11266d.m30448b(this.bubbleColorTheirs, AbstractC11266d.m30448b(this.bubbleColorMine, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31);
        Float f13 = this.bubbleBorderWidthTheirs;
        return Integer.hashCode(this.reactionOrientation) + AbstractC11266d.m30448b(this.smallTailBubbleOffset, AbstractC11266d.m30448b(this.smallTailBubbleRadius, AbstractC11266d.m30448b(this.smallTailBubbleCy, AbstractC11266d.m30448b(this.largeTailBubbleOffset, AbstractC11266d.m30448b(this.largeTailBubbleRadius, AbstractC11266d.m30448b(this.largeTailBubbleCy, AbstractC11266d.m30448b(this.bubbleRadius, AbstractC11266d.m30448b(this.bubbleHeight, AbstractC11266d.m30448b(this.totalHeight, (iM30447a + (f13 != null ? f13.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        int i13 = this.bubbleBorderColorMine;
        Integer num = this.bubbleBorderColorTheirs;
        int i14 = this.bubbleColorMine;
        int i15 = this.bubbleColorTheirs;
        float f13 = this.bubbleBorderWidthMine;
        Float f14 = this.bubbleBorderWidthTheirs;
        int i16 = this.totalHeight;
        int i17 = this.bubbleHeight;
        int i18 = this.bubbleRadius;
        int i19 = this.largeTailBubbleCy;
        int i24 = this.largeTailBubbleRadius;
        int i25 = this.largeTailBubbleOffset;
        int i26 = this.smallTailBubbleCy;
        int i27 = this.smallTailBubbleRadius;
        int i28 = this.smallTailBubbleOffset;
        int i29 = this.reactionOrientation;
        StringBuilder sb4 = new StringBuilder("SingleReactionViewStyle(bubbleBorderColorMine=");
        sb4.append(i13);
        sb4.append(", bubbleBorderColorTheirs=");
        sb4.append(num);
        sb4.append(", bubbleColorMine=");
        AbstractC30802r.m94773v(sb4, i14, ", bubbleColorTheirs=", i15, ", bubbleBorderWidthMine=");
        sb4.append(f13);
        sb4.append(", bubbleBorderWidthTheirs=");
        sb4.append(f14);
        sb4.append(", totalHeight=");
        AbstractC30802r.m94773v(sb4, i16, ", bubbleHeight=", i17, ", bubbleRadius=");
        AbstractC30802r.m94773v(sb4, i18, ", largeTailBubbleCy=", i19, ", largeTailBubbleRadius=");
        AbstractC30802r.m94773v(sb4, i24, ", largeTailBubbleOffset=", i25, ", smallTailBubbleCy=");
        AbstractC30802r.m94773v(sb4, i26, ", smallTailBubbleRadius=", i27, ", smallTailBubbleOffset=");
        return AbstractC26725a.m79505i(sb4, i28, ", reactionOrientation=", i29, ")");
    }
}
