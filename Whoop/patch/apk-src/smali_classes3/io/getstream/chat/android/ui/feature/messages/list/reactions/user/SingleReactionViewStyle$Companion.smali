.class public final Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0080\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0086\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "DEFAULT_BUBBLE_BORDER_COLOR_MINE",
        "",
        "DEFAULT_BUBBLE_COLOR_MINE",
        "DEFAULT_BUBBLE_COLOR_THEIRS",
        "DEFAULT_BUBBLE_BORDER_WIDTH_MINE",
        "",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "Builder",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/R$styleable;->SingleReactionView:[I

    sget v1, Lio/getstream/chat/android/ui/R$attr;->streamUiSingleReactionViewStyle:I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    const-string v1, "obtainStyledAttributes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    if-eqz v1, :cond_0

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;

    invoke-direct {p2, v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;-><init>(Landroid/content/res/TypedArray;Landroid/content/Context;)V

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->SingleReactionView_streamUiSingleReactionBubbleBorderColorMine:I

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;->bubbleBorderColorMine(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->SingleReactionView_streamUiSingleReactionBubbleBorderColorTheirs:I

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;->bubbleBorderColorTheirs(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->SingleReactionView_streamUiSingleReactionBubbleBorderWidthMine:I

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;->bubbleBorderWidthMine(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->SingleReactionView_streamUiSingleReactionBubbleBorderWidthTheirs:I

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;->bubbleBorderWidthTheirs(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->SingleReactionView_streamUiSingleReactionBubbleColorMine:I

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;->bubbleColorMine(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->SingleReactionView_streamUiSingleReactionBubbleColorTheirs:I

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;->bubbleColorTheirs(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->SingleReactionView_streamUiSingleReactionBubbleOrientation:I

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;->messageOptionsUserReactionBubbleOrientation(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion$Builder;->build()Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    move-result-object p1

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewReactionsViewStyleKt;->toSingleReactionViewStyle(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;

    move-result-object p1

    return-object p1
.end method
