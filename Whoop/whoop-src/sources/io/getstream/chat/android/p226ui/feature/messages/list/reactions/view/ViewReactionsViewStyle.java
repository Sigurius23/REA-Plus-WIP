package io.getstream.chat.android.p226ui.feature.messages.list.reactions.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.profileinstaller.ProfileVerifier;
import io.getstream.chat.android.models.ReactionSorting;
import io.getstream.chat.android.models.ReactionSortingByCount;
import io.getstream.chat.android.models.ReactionSortingByFirstReactionAt;
import io.getstream.chat.android.models.ReactionSortingByLastReactionAt;
import io.getstream.chat.android.models.ReactionSortingBySumScore;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageOptionsUserReactionAlignment;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import io.getstream.chat.android.p226ui.utils.extensions.TypedArrayKt;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import xo1.C38492a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 S2\u00020\u0001:\u0001SBÏ\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00106\u001a\u00020\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010%J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0018HÆ\u0003JÚ\u0001\u0010J\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00032\b\b\u0003\u0010\u0014\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001¢\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020\u0003HÖ\u0001J\t\u0010Q\u001a\u00020RHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001cR\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006T"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "bubbleBorderColorMine", "", "bubbleBorderColorTheirs", "bubbleColorMine", "bubbleColorTheirs", "bubbleBorderWidthMine", "", "bubbleBorderWidthTheirs", "totalHeight", "horizontalPadding", "itemSize", "bubbleHeight", "bubbleRadius", "largeTailBubbleCy", "largeTailBubbleRadius", "largeTailBubbleOffset", "smallTailBubbleCy", "smallTailBubbleRadius", "smallTailBubbleOffset", "verticalPadding", "messageOptionsUserReactionOrientation", "reactionSorting", "Lio/getstream/chat/android/models/ReactionSorting;", "<init>", "(ILjava/lang/Integer;IIFLjava/lang/Float;IIIIIIIIIIIIILio/getstream/chat/android/models/ReactionSorting;)V", "getBubbleBorderColorMine", "()I", "getBubbleBorderColorTheirs", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBubbleColorMine", "getBubbleColorTheirs", "getBubbleBorderWidthMine", "()F", "getBubbleBorderWidthTheirs", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getTotalHeight", "getHorizontalPadding", "getItemSize", "getBubbleHeight", "getBubbleRadius", "getLargeTailBubbleCy", "getLargeTailBubbleRadius", "getLargeTailBubbleOffset", "getSmallTailBubbleCy", "getSmallTailBubbleRadius", "getSmallTailBubbleOffset", "getVerticalPadding", "getMessageOptionsUserReactionOrientation", "getReactionSorting", "()Lio/getstream/chat/android/models/ReactionSorting;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(ILjava/lang/Integer;IIFLjava/lang/Float;IIIIIIIIIIIIILio/getstream/chat/android/models/ReactionSorting;)Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ViewReactionsViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final int DEFAULT_BUBBLE_BORDER_COLOR_MINE;
    private static final InterfaceC23462h DEFAULT_BUBBLE_BORDER_WIDTH_MINE$delegate;
    private static final int DEFAULT_BUBBLE_COLOR_MINE;
    private static final int DEFAULT_BUBBLE_COLOR_THEIRS;
    private static final int REACTION_SORTING_BY_COUNT = 3;
    private static final int REACTION_SORTING_BY_FIRST_REACTION_AT = 0;
    private static final int REACTION_SORTING_BY_LAST_REACTION_AT = 1;
    private static final int REACTION_SORTING_BY_SUM_SCORE = 2;
    private final int bubbleBorderColorMine;
    private final Integer bubbleBorderColorTheirs;
    private final float bubbleBorderWidthMine;
    private final Float bubbleBorderWidthTheirs;
    private final int bubbleColorMine;
    private final int bubbleColorTheirs;
    private final int bubbleHeight;
    private final int bubbleRadius;
    private final int horizontalPadding;
    private final int itemSize;
    private final int largeTailBubbleCy;
    private final int largeTailBubbleOffset;
    private final int largeTailBubbleRadius;
    private final int messageOptionsUserReactionOrientation;
    private final ReactionSorting reactionSorting;
    private final int smallTailBubbleCy;
    private final int smallTailBubbleOffset;
    private final int smallTailBubbleRadius;
    private final int totalHeight;
    private final int verticalPadding;

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0080\u0003\u0018\u00002\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion;", "", "<init>", "()V", "", "Lio/getstream/chat/android/models/ReactionSorting;", "getReactionSorting", "(I)Lio/getstream/chat/android/models/ReactionSorting;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;", "invoke", "(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;", "", "DEFAULT_BUBBLE_BORDER_WIDTH_MINE$delegate", "Ll83/h;", "getDEFAULT_BUBBLE_BORDER_WIDTH_MINE", "()F", "DEFAULT_BUBBLE_BORDER_WIDTH_MINE", "DEFAULT_BUBBLE_BORDER_COLOR_MINE", "I", "DEFAULT_BUBBLE_COLOR_MINE", "DEFAULT_BUBBLE_COLOR_THEIRS", "REACTION_SORTING_BY_FIRST_REACTION_AT", "REACTION_SORTING_BY_LAST_REACTION_AT", "REACTION_SORTING_BY_SUM_SCORE", "REACTION_SORTING_BY_COUNT", "Builder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {

        @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0015\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\tJ\u0010\u0010\f\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\tJ\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\tJ\u0010\u0010\u0019\u001a\u00020\u00002\b\b\u0001\u0010\u001a\u001a\u00020\tJ\u0010\u0010\u001b\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\tJ\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;", "", "array", "Landroid/content/res/TypedArray;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/res/TypedArray;Landroid/content/Context;)V", "bubbleColorTheirs", "", "bubbleColorMine", "bubbleBorderColorMine", "bubbleBorderColorTheirs", "Ljava/lang/Integer;", "bubbleBorderWidthMine", "", "bubbleBorderWidthTheirs", "Ljava/lang/Float;", "messageOptionsUserReactionOrientation", "reactionSorting", "Lio/getstream/chat/android/models/ReactionSorting;", "theirsBubbleColorAttribute", "mineBubbleColorAttribute", "bubbleBorderColorAttribute", "bubbleBorderWidthAttribute", "messageOptionsUserReactionBubbleOrientation", "bubbleOrientation", "messageOptionsReactionSorting", "build", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Builder {
            private final TypedArray array;
            private int bubbleBorderColorMine;
            private Integer bubbleBorderColorTheirs;
            private float bubbleBorderWidthMine;
            private Float bubbleBorderWidthTheirs;
            private int bubbleColorMine;
            private int bubbleColorTheirs;
            private final Context context;
            private int messageOptionsUserReactionOrientation;
            private ReactionSorting reactionSorting;

            public Builder(TypedArray array, Context context) {
                AbstractC22676k.m65750j(array, "array");
                AbstractC22676k.m65750j(context, "context");
                this.array = array;
                this.context = context;
                this.bubbleColorTheirs = ContextKt.getColorCompat(context, ViewReactionsViewStyle.DEFAULT_BUBBLE_COLOR_THEIRS);
                this.bubbleColorMine = ContextKt.getColorCompat(context, ViewReactionsViewStyle.DEFAULT_BUBBLE_COLOR_MINE);
                this.bubbleBorderColorMine = ContextKt.getColorCompat(context, ViewReactionsViewStyle.DEFAULT_BUBBLE_BORDER_COLOR_MINE);
                this.bubbleBorderWidthMine = ViewReactionsViewStyle.INSTANCE.getDEFAULT_BUBBLE_BORDER_WIDTH_MINE();
                this.messageOptionsUserReactionOrientation = MessageOptionsUserReactionAlignment.BY_USER.getValue();
                this.reactionSorting = ReactionSortingByFirstReactionAt.INSTANCE;
            }

            public final Builder bubbleBorderColorMine(int bubbleBorderColorAttribute) {
                this.bubbleBorderColorMine = this.array.getColor(bubbleBorderColorAttribute, ContextKt.getColorCompat(this.context, ViewReactionsViewStyle.DEFAULT_BUBBLE_BORDER_COLOR_MINE));
                return this;
            }

            public final Builder bubbleBorderColorTheirs(int bubbleBorderColorAttribute) {
                this.bubbleBorderColorTheirs = TypedArrayKt.getColorOrNull(this.array, bubbleBorderColorAttribute);
                return this;
            }

            public final Builder bubbleBorderWidthMine(int bubbleBorderWidthAttribute) {
                this.bubbleBorderWidthMine = this.array.getDimension(bubbleBorderWidthAttribute, ViewReactionsViewStyle.INSTANCE.getDEFAULT_BUBBLE_BORDER_WIDTH_MINE());
                return this;
            }

            public final Builder bubbleBorderWidthTheirs(int bubbleBorderWidthAttribute) {
                this.bubbleBorderWidthTheirs = TypedArrayKt.getDimensionOrNull(this.array, bubbleBorderWidthAttribute);
                return this;
            }

            public final Builder bubbleColorMine(int mineBubbleColorAttribute) {
                this.bubbleColorMine = this.array.getColor(mineBubbleColorAttribute, ContextKt.getColorCompat(this.context, ViewReactionsViewStyle.DEFAULT_BUBBLE_COLOR_MINE));
                return this;
            }

            public final Builder bubbleColorTheirs(int theirsBubbleColorAttribute) {
                this.bubbleColorTheirs = this.array.getColor(theirsBubbleColorAttribute, ContextKt.getColorCompat(this.context, ViewReactionsViewStyle.DEFAULT_BUBBLE_COLOR_THEIRS));
                return this;
            }

            public final ViewReactionsViewStyle build() {
                int dimension = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_view_reactions_total_height);
                int dimension2 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_view_reactions_horizontal_padding);
                int dimension3 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_view_reactions_item_size);
                int dimension4 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_view_reactions_bubble_height);
                int dimension5 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_view_reactions_bubble_radius);
                int dimension6 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_view_reactions_large_tail_bubble_cy);
                int dimension7 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_view_reactions_large_tail_bubble_radius);
                int dimension8 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_view_reactions_large_tail_bubble_offset);
                int dimension9 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_view_reactions_small_tail_bubble_cy);
                int dimension10 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_view_reactions_small_tail_bubble_radius);
                int dimension11 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_view_reactions_small_tail_bubble_offset);
                int dimension12 = ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_view_reactions_vertical_padding);
                return TransformStyle.getViewReactionsStyleTransformer().transform(new ViewReactionsViewStyle(this.bubbleBorderColorMine, this.bubbleBorderColorTheirs, this.bubbleColorMine, this.bubbleColorTheirs, this.bubbleBorderWidthMine, this.bubbleBorderWidthTheirs, dimension, dimension2, dimension3, dimension4, dimension5, dimension6, dimension7, dimension8, dimension9, dimension10, dimension11, dimension12, this.messageOptionsUserReactionOrientation, this.reactionSorting));
            }

            public final Builder messageOptionsReactionSorting(int reactionSorting) {
                this.reactionSorting = ViewReactionsViewStyle.INSTANCE.getReactionSorting(this.array.getInt(reactionSorting, 0));
                return this;
            }

            public final Builder messageOptionsUserReactionBubbleOrientation(int bubbleOrientation) {
                this.messageOptionsUserReactionOrientation = this.array.getInt(bubbleOrientation, MessageOptionsUserReactionAlignment.BY_USER.getValue());
                return this;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float getDEFAULT_BUBBLE_BORDER_WIDTH_MINE() {
            return ((Number) ViewReactionsViewStyle.DEFAULT_BUBBLE_BORDER_WIDTH_MINE$delegate.getValue()).floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ReactionSorting getReactionSorting(int i13) {
            if (i13 == 0) {
                return ReactionSortingByFirstReactionAt.INSTANCE;
            }
            if (i13 == 1) {
                return ReactionSortingByLastReactionAt.INSTANCE;
            }
            if (i13 != 2) {
                return i13 != 3 ? ReactionSortingByFirstReactionAt.INSTANCE : ReactionSortingByCount.INSTANCE;
            }
            return ReactionSortingBySumScore.INSTANCE;
        }

        public final ViewReactionsViewStyle invoke(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.ViewReactionsView, C19469R.attr.streamUiMessageListViewReactionsStyle, 0);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            Builder builder = new Builder(typedArrayObtainStyledAttributes, context);
            builder.bubbleBorderColorMine(C19469R.styleable.ViewReactionsView_streamUiReactionsBubbleBorderColorMine);
            builder.bubbleBorderColorTheirs(C19469R.styleable.ViewReactionsView_streamUiReactionsBubbleBorderColorTheirs);
            builder.bubbleBorderWidthMine(C19469R.styleable.ViewReactionsView_streamUiReactionsBubbleBorderWidthMine);
            builder.bubbleBorderWidthTheirs(C19469R.styleable.ViewReactionsView_streamUiReactionsBubbleBorderWidthTheirs);
            builder.bubbleColorMine(C19469R.styleable.ViewReactionsView_streamUiReactionsBubbleColorMine);
            builder.bubbleColorTheirs(C19469R.styleable.ViewReactionsView_streamUiReactionsBubbleColorTheirs);
            builder.messageOptionsUserReactionBubbleOrientation(C19469R.styleable.ViewReactionsView_streamUiMessageOptionsUserReactionOrientation);
            builder.messageOptionsReactionSorting(C19469R.styleable.ViewReactionsView_streamUiReactionSorting);
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
        DEFAULT_BUBBLE_BORDER_WIDTH_MINE$delegate = AbstractC30060g.m92088H(new C38492a(17));
    }

    public ViewReactionsViewStyle(int i13, Integer num, int i14, int i15, float f13, Float f14, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29, int i34, int i35, int i36, ReactionSorting reactionSorting) {
        AbstractC22676k.m65750j(reactionSorting, "reactionSorting");
        this.bubbleBorderColorMine = i13;
        this.bubbleBorderColorTheirs = num;
        this.bubbleColorMine = i14;
        this.bubbleColorTheirs = i15;
        this.bubbleBorderWidthMine = f13;
        this.bubbleBorderWidthTheirs = f14;
        this.totalHeight = i16;
        this.horizontalPadding = i17;
        this.itemSize = i18;
        this.bubbleHeight = i19;
        this.bubbleRadius = i24;
        this.largeTailBubbleCy = i25;
        this.largeTailBubbleRadius = i26;
        this.largeTailBubbleOffset = i27;
        this.smallTailBubbleCy = i28;
        this.smallTailBubbleRadius = i29;
        this.smallTailBubbleOffset = i34;
        this.verticalPadding = i35;
        this.messageOptionsUserReactionOrientation = i36;
        this.reactionSorting = reactionSorting;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DEFAULT_BUBBLE_BORDER_WIDTH_MINE_delegate$lambda$0() {
        return IntKt.dpToPx(1) * 1.5f;
    }

    public static /* synthetic */ ViewReactionsViewStyle copy$default(ViewReactionsViewStyle viewReactionsViewStyle, int i13, Integer num, int i14, int i15, float f13, Float f14, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29, int i34, int i35, int i36, ReactionSorting reactionSorting, int i37, Object obj) {
        ReactionSorting reactionSorting2;
        int i38;
        int i39 = (i37 & 1) != 0 ? viewReactionsViewStyle.bubbleBorderColorMine : i13;
        Integer num2 = (i37 & 2) != 0 ? viewReactionsViewStyle.bubbleBorderColorTheirs : num;
        int i44 = (i37 & 4) != 0 ? viewReactionsViewStyle.bubbleColorMine : i14;
        int i45 = (i37 & 8) != 0 ? viewReactionsViewStyle.bubbleColorTheirs : i15;
        float f15 = (i37 & 16) != 0 ? viewReactionsViewStyle.bubbleBorderWidthMine : f13;
        Float f16 = (i37 & 32) != 0 ? viewReactionsViewStyle.bubbleBorderWidthTheirs : f14;
        int i46 = (i37 & 64) != 0 ? viewReactionsViewStyle.totalHeight : i16;
        int i47 = (i37 & 128) != 0 ? viewReactionsViewStyle.horizontalPadding : i17;
        int i48 = (i37 & 256) != 0 ? viewReactionsViewStyle.itemSize : i18;
        int i49 = (i37 & 512) != 0 ? viewReactionsViewStyle.bubbleHeight : i19;
        int i54 = (i37 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? viewReactionsViewStyle.bubbleRadius : i24;
        int i55 = (i37 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? viewReactionsViewStyle.largeTailBubbleCy : i25;
        int i56 = (i37 & 4096) != 0 ? viewReactionsViewStyle.largeTailBubbleRadius : i26;
        int i57 = (i37 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? viewReactionsViewStyle.largeTailBubbleOffset : i27;
        int i58 = i39;
        int i59 = (i37 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? viewReactionsViewStyle.smallTailBubbleCy : i28;
        int i64 = (i37 & 32768) != 0 ? viewReactionsViewStyle.smallTailBubbleRadius : i29;
        int i65 = (i37 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? viewReactionsViewStyle.smallTailBubbleOffset : i34;
        int i66 = (i37 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? viewReactionsViewStyle.verticalPadding : i35;
        int i67 = (i37 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? viewReactionsViewStyle.messageOptionsUserReactionOrientation : i36;
        if ((i37 & 524288) != 0) {
            i38 = i67;
            reactionSorting2 = viewReactionsViewStyle.reactionSorting;
        } else {
            reactionSorting2 = reactionSorting;
            i38 = i67;
        }
        return viewReactionsViewStyle.copy(i58, num2, i44, i45, f15, f16, i46, i47, i48, i49, i54, i55, i56, i57, i59, i64, i65, i66, i38, reactionSorting2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBubbleBorderColorMine() {
        return this.bubbleBorderColorMine;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getBubbleHeight() {
        return this.bubbleHeight;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getBubbleRadius() {
        return this.bubbleRadius;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getLargeTailBubbleCy() {
        return this.largeTailBubbleCy;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getLargeTailBubbleRadius() {
        return this.largeTailBubbleRadius;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getLargeTailBubbleOffset() {
        return this.largeTailBubbleOffset;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getSmallTailBubbleCy() {
        return this.smallTailBubbleCy;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getSmallTailBubbleRadius() {
        return this.smallTailBubbleRadius;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getSmallTailBubbleOffset() {
        return this.smallTailBubbleOffset;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getVerticalPadding() {
        return this.verticalPadding;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getMessageOptionsUserReactionOrientation() {
        return this.messageOptionsUserReactionOrientation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getBubbleBorderColorTheirs() {
        return this.bubbleBorderColorTheirs;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final ReactionSorting getReactionSorting() {
        return this.reactionSorting;
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
    public final int getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getItemSize() {
        return this.itemSize;
    }

    public final ViewReactionsViewStyle copy(int bubbleBorderColorMine, Integer bubbleBorderColorTheirs, int bubbleColorMine, int bubbleColorTheirs, float bubbleBorderWidthMine, Float bubbleBorderWidthTheirs, int totalHeight, int horizontalPadding, int itemSize, int bubbleHeight, int bubbleRadius, int largeTailBubbleCy, int largeTailBubbleRadius, int largeTailBubbleOffset, int smallTailBubbleCy, int smallTailBubbleRadius, int smallTailBubbleOffset, int verticalPadding, int messageOptionsUserReactionOrientation, ReactionSorting reactionSorting) {
        AbstractC22676k.m65750j(reactionSorting, "reactionSorting");
        return new ViewReactionsViewStyle(bubbleBorderColorMine, bubbleBorderColorTheirs, bubbleColorMine, bubbleColorTheirs, bubbleBorderWidthMine, bubbleBorderWidthTheirs, totalHeight, horizontalPadding, itemSize, bubbleHeight, bubbleRadius, largeTailBubbleCy, largeTailBubbleRadius, largeTailBubbleOffset, smallTailBubbleCy, smallTailBubbleRadius, smallTailBubbleOffset, verticalPadding, messageOptionsUserReactionOrientation, reactionSorting);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewReactionsViewStyle)) {
            return false;
        }
        ViewReactionsViewStyle viewReactionsViewStyle = (ViewReactionsViewStyle) other;
        return this.bubbleBorderColorMine == viewReactionsViewStyle.bubbleBorderColorMine && AbstractC22676k.m65745e(this.bubbleBorderColorTheirs, viewReactionsViewStyle.bubbleBorderColorTheirs) && this.bubbleColorMine == viewReactionsViewStyle.bubbleColorMine && this.bubbleColorTheirs == viewReactionsViewStyle.bubbleColorTheirs && Float.compare(this.bubbleBorderWidthMine, viewReactionsViewStyle.bubbleBorderWidthMine) == 0 && AbstractC22676k.m65745e(this.bubbleBorderWidthTheirs, viewReactionsViewStyle.bubbleBorderWidthTheirs) && this.totalHeight == viewReactionsViewStyle.totalHeight && this.horizontalPadding == viewReactionsViewStyle.horizontalPadding && this.itemSize == viewReactionsViewStyle.itemSize && this.bubbleHeight == viewReactionsViewStyle.bubbleHeight && this.bubbleRadius == viewReactionsViewStyle.bubbleRadius && this.largeTailBubbleCy == viewReactionsViewStyle.largeTailBubbleCy && this.largeTailBubbleRadius == viewReactionsViewStyle.largeTailBubbleRadius && this.largeTailBubbleOffset == viewReactionsViewStyle.largeTailBubbleOffset && this.smallTailBubbleCy == viewReactionsViewStyle.smallTailBubbleCy && this.smallTailBubbleRadius == viewReactionsViewStyle.smallTailBubbleRadius && this.smallTailBubbleOffset == viewReactionsViewStyle.smallTailBubbleOffset && this.verticalPadding == viewReactionsViewStyle.verticalPadding && this.messageOptionsUserReactionOrientation == viewReactionsViewStyle.messageOptionsUserReactionOrientation && AbstractC22676k.m65745e(this.reactionSorting, viewReactionsViewStyle.reactionSorting);
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

    public final int getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final int getItemSize() {
        return this.itemSize;
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

    public final int getMessageOptionsUserReactionOrientation() {
        return this.messageOptionsUserReactionOrientation;
    }

    public final ReactionSorting getReactionSorting() {
        return this.reactionSorting;
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

    public final int getVerticalPadding() {
        return this.verticalPadding;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.bubbleBorderColorMine) * 31;
        Integer num = this.bubbleBorderColorTheirs;
        int iM30447a = AbstractC11266d.m30447a(this.bubbleBorderWidthMine, AbstractC11266d.m30448b(this.bubbleColorTheirs, AbstractC11266d.m30448b(this.bubbleColorMine, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31);
        Float f13 = this.bubbleBorderWidthTheirs;
        return this.reactionSorting.hashCode() + AbstractC11266d.m30448b(this.messageOptionsUserReactionOrientation, AbstractC11266d.m30448b(this.verticalPadding, AbstractC11266d.m30448b(this.smallTailBubbleOffset, AbstractC11266d.m30448b(this.smallTailBubbleRadius, AbstractC11266d.m30448b(this.smallTailBubbleCy, AbstractC11266d.m30448b(this.largeTailBubbleOffset, AbstractC11266d.m30448b(this.largeTailBubbleRadius, AbstractC11266d.m30448b(this.largeTailBubbleCy, AbstractC11266d.m30448b(this.bubbleRadius, AbstractC11266d.m30448b(this.bubbleHeight, AbstractC11266d.m30448b(this.itemSize, AbstractC11266d.m30448b(this.horizontalPadding, AbstractC11266d.m30448b(this.totalHeight, (iM30447a + (f13 != null ? f13.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        int i13 = this.bubbleBorderColorMine;
        Integer num = this.bubbleBorderColorTheirs;
        int i14 = this.bubbleColorMine;
        int i15 = this.bubbleColorTheirs;
        float f13 = this.bubbleBorderWidthMine;
        Float f14 = this.bubbleBorderWidthTheirs;
        int i16 = this.totalHeight;
        int i17 = this.horizontalPadding;
        int i18 = this.itemSize;
        int i19 = this.bubbleHeight;
        int i24 = this.bubbleRadius;
        int i25 = this.largeTailBubbleCy;
        int i26 = this.largeTailBubbleRadius;
        int i27 = this.largeTailBubbleOffset;
        int i28 = this.smallTailBubbleCy;
        int i29 = this.smallTailBubbleRadius;
        int i34 = this.smallTailBubbleOffset;
        int i35 = this.verticalPadding;
        int i36 = this.messageOptionsUserReactionOrientation;
        ReactionSorting reactionSorting = this.reactionSorting;
        StringBuilder sb4 = new StringBuilder("ViewReactionsViewStyle(bubbleBorderColorMine=");
        sb4.append(i13);
        sb4.append(", bubbleBorderColorTheirs=");
        sb4.append(num);
        sb4.append(", bubbleColorMine=");
        AbstractC30802r.m94773v(sb4, i14, ", bubbleColorTheirs=", i15, ", bubbleBorderWidthMine=");
        sb4.append(f13);
        sb4.append(", bubbleBorderWidthTheirs=");
        sb4.append(f14);
        sb4.append(", totalHeight=");
        AbstractC30802r.m94773v(sb4, i16, ", horizontalPadding=", i17, ", itemSize=");
        AbstractC30802r.m94773v(sb4, i18, ", bubbleHeight=", i19, ", bubbleRadius=");
        AbstractC30802r.m94773v(sb4, i24, ", largeTailBubbleCy=", i25, ", largeTailBubbleRadius=");
        AbstractC30802r.m94773v(sb4, i26, ", largeTailBubbleOffset=", i27, ", smallTailBubbleCy=");
        AbstractC30802r.m94773v(sb4, i28, ", smallTailBubbleRadius=", i29, ", smallTailBubbleOffset=");
        AbstractC30802r.m94773v(sb4, i34, ", verticalPadding=", i35, ", messageOptionsUserReactionOrientation=");
        sb4.append(i36);
        sb4.append(", reactionSorting=");
        sb4.append(reactionSorting);
        sb4.append(")");
        return sb4.toString();
    }
}
