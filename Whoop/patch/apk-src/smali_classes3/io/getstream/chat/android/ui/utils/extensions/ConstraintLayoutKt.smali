.class public final Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u0011\n\u0002\u0008\u0005\u001a\'\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a#\u0010\u000f\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a#\u0010\u0011\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0010\u001a\'\u0010\u0014\u001a\u00020\u0003*\u00020\u00022\u0012\u0010\u0013\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u0012\"\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\'\u0010\u0016\u001a\u00020\u0003*\u00020\u00022\u0012\u0010\u0013\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u0012\"\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Lkotlin/Function1;",
        "Landroidx/constraintlayout/widget/p;",
        "Ll83/a0;",
        "actions",
        "updateConstraints",
        "(Landroidx/constraintlayout/widget/ConstraintLayout;Lkotlin/jvm/functions/Function1;)V",
        "Landroid/view/View;",
        "view",
        "",
        "side",
        "constrainViewToParentBySide",
        "(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V",
        "startView",
        "endView",
        "constrainViewStartToEndOfView",
        "(Landroidx/constraintlayout/widget/p;Landroid/view/View;Landroid/view/View;)V",
        "constrainViewEndToEndOfView",
        "",
        "views",
        "horizontalChainInParent",
        "(Landroidx/constraintlayout/widget/p;[Landroid/view/View;)V",
        "verticalChainInParent",
        "stream-chat-android-ui-components_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final constrainViewEndToEndOfView(Landroidx/constraintlayout/widget/p;Landroid/view/View;Landroid/view/View;)V
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const/4 v0, 0x7

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    invoke-virtual {p0, p1, v0, p2, v0}, Landroidx/constraintlayout/widget/p;->f(IIII)V

    return-void
.end method

.method public static final constrainViewStartToEndOfView(Landroidx/constraintlayout/widget/p;Landroid/view/View;Landroid/view/View;)V
    .locals 2
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    const/4 v0, 0x7

    const/4 v1, 0x6

    invoke-virtual {p0, p1, v1, p2, v0}, Landroidx/constraintlayout/widget/p;->f(IIII)V

    return-void
.end method

.method public static final constrainViewToParentBySide(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, p2}, Landroidx/constraintlayout/widget/p;->f(IIII)V

    return-void
.end method

.method public static final varargs horizontalChainInParent(Landroidx/constraintlayout/widget/p;[Landroid/view/View;)V
    .locals 10
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v2, "<this>"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "views"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    array-length v3, p1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, p1

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_0

    aget-object v6, p1, v5

    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lm83/s;->C1(Ljava/util/Collection;)[I

    move-result-object v6

    array-length v1, v6

    const/4 v2, 0x2

    if-lt v1, v2, :cond_2

    aget v1, v6, v4

    invoke-virtual {p0, v1}, Landroidx/constraintlayout/widget/p;->j(I)Landroidx/constraintlayout/widget/k;

    move-result-object v1

    iget-object v1, v1, Landroidx/constraintlayout/widget/k;->d:Landroidx/constraintlayout/widget/l;

    iput v4, v1, Landroidx/constraintlayout/widget/l;->V:I

    aget v1, v6, v4

    const/4 v5, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/p;->g(IIIII)V

    const/4 v7, 0x1

    move v8, v7

    :goto_1
    array-length v0, v6

    const/4 v4, 0x2

    if-ge v8, v0, :cond_1

    aget v1, v6, v8

    add-int/lit8 v9, v8, -0x1

    aget v3, v6, v9

    const/4 v5, -0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/p;->g(IIIII)V

    aget v1, v6, v9

    aget v3, v6, v8

    move v0, v4

    move v4, v2

    move v2, v0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/p;->g(IIIII)V

    move v2, v4

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    array-length v0, v6

    sub-int/2addr v0, v7

    aget v1, v6, v0

    const/4 v5, -0x1

    const/4 v3, 0x0

    move v2, v4

    const/4 v4, 0x2

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/p;->g(IIIII)V

    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "must have 2 or more widgets in a chain"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final updateConstraints(Landroidx/constraintlayout/widget/ConstraintLayout;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/constraintlayout/widget/ConstraintLayout;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/constraintlayout/widget/p;

    invoke-direct {v0}, Landroidx/constraintlayout/widget/p;-><init>()V

    invoke-virtual {v0, p0}, Landroidx/constraintlayout/widget/p;->e(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p0}, Landroidx/constraintlayout/widget/p;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    return-void
.end method

.method public static final varargs verticalChainInParent(Landroidx/constraintlayout/widget/p;[Landroid/view/View;)V
    .locals 10
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v2, "<this>"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "views"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    array-length v3, p1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, p1

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_0

    aget-object v6, p1, v5

    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lm83/s;->C1(Ljava/util/Collection;)[I

    move-result-object v6

    array-length v1, v6

    const/4 v2, 0x2

    if-lt v1, v2, :cond_2

    aget v1, v6, v4

    invoke-virtual {p0, v1}, Landroidx/constraintlayout/widget/p;->j(I)Landroidx/constraintlayout/widget/k;

    move-result-object v1

    iget-object v1, v1, Landroidx/constraintlayout/widget/k;->d:Landroidx/constraintlayout/widget/l;

    iput v4, v1, Landroidx/constraintlayout/widget/l;->W:I

    aget v1, v6, v4

    const/4 v2, 0x3

    const/4 v5, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x3

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/p;->g(IIIII)V

    const/4 v7, 0x1

    move v8, v7

    :goto_1
    array-length v0, v6

    if-ge v8, v0, :cond_1

    aget v1, v6, v8

    add-int/lit8 v9, v8, -0x1

    aget v3, v6, v9

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v2, 0x3

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/p;->g(IIIII)V

    aget v1, v6, v9

    aget v3, v6, v8

    const/4 v4, 0x3

    const/4 v2, 0x4

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/p;->g(IIIII)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    array-length v0, v6

    sub-int/2addr v0, v7

    aget v1, v6, v0

    const/4 v2, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x4

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/p;->g(IIIII)V

    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "must have 2 or more widgets in a chain"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
