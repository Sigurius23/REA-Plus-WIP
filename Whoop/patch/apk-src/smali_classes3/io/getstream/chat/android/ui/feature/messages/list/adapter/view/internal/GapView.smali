.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bB+\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;",
        "Landroid/widget/LinearLayout;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "defStyleRes",
        "(Landroid/content/Context;Landroid/util/AttributeSet;II)V",
        "Ll83/a0;",
        "showSmallGap",
        "()V",
        "showBigGap",
        "Landroid/view/View;",
        "smallGap",
        "Landroid/view/View;",
        "bigGap",
        "Companion",
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


# static fields
.field private static final BIG_GAP_HEIGHT_DP:I = 0x8

.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;

.field private static final SMALL_GAP_HEIGHT_DP:I = 0x2


# instance fields
.field private final bigGap:Landroid/view/View;

.field private final smallGap:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p1, Landroid/widget/Space;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 3
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;

    const/4 v1, 0x2

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;->access$createLayoutParams(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;I)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v1, 0x8

    .line 4
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;->smallGap:Landroid/view/View;

    .line 6
    new-instance v2, Landroid/widget/Space;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 7
    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v3

    invoke-static {v0, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;->access$createLayoutParams(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;I)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    iput-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;->bigGap:Landroid/view/View;

    .line 10
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 11
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 13
    new-instance p1, Landroid/widget/Space;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 14
    sget-object p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;

    const/4 v0, 0x2

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-static {p2, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;->access$createLayoutParams(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;I)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v0, 0x8

    .line 15
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 16
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;->smallGap:Landroid/view/View;

    .line 17
    new-instance v1, Landroid/widget/Space;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 18
    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v2

    invoke-static {p2, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;->access$createLayoutParams(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;I)Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    invoke-virtual {v1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 20
    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;->bigGap:Landroid/view/View;

    .line 21
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 22
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 24
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 25
    new-instance p1, Landroid/widget/Space;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 26
    sget-object p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;

    const/4 p3, 0x2

    invoke-static {p3}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result p3

    invoke-static {p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;->access$createLayoutParams(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;I)Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 p3, 0x8

    .line 27
    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    .line 28
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;->smallGap:Landroid/view/View;

    .line 29
    new-instance v0, Landroid/widget/Space;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 30
    invoke-static {p3}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v1

    invoke-static {p2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;->access$createLayoutParams(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;I)Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 31
    invoke-virtual {v0, p3}, Landroid/view/View;->setVisibility(I)V

    .line 32
    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;->bigGap:Landroid/view/View;

    .line 33
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 34
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 36
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 37
    new-instance p1, Landroid/widget/Space;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 38
    sget-object p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;

    const/4 p3, 0x2

    invoke-static {p3}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result p3

    invoke-static {p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;->access$createLayoutParams(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;I)Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 p3, 0x8

    .line 39
    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    .line 40
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;->smallGap:Landroid/view/View;

    .line 41
    new-instance p4, Landroid/widget/Space;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p4, v0}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 42
    invoke-static {p3}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-static {p2, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;->access$createLayoutParams(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView$Companion;I)Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    invoke-virtual {p4, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 43
    invoke-virtual {p4, p3}, Landroid/view/View;->setVisibility(I)V

    .line 44
    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;->bigGap:Landroid/view/View;

    .line 45
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 46
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final showBigGap()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;->smallGap:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;->bigGap:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final showSmallGap()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;->smallGap:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;->bigGap:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
