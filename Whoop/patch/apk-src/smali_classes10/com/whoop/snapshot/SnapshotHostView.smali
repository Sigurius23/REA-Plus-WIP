.class public final Lcom/whoop/snapshot/SnapshotHostView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u001d\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/snapshot/SnapshotHostView;",
        "Landroid/widget/FrameLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "Ll83/a0;",
        "onAttachedToWindow",
        "()V",
        "snapshot-compose-host_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public onAttachedToWindow()V
    .locals 5

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    new-instance v1, Lgg2/a;

    sget-object v3, Landroidx/lifecycle/w;->y:Landroidx/lifecycle/w;

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lgg2/a;-><init>(Landroidx/lifecycle/w;Z)V

    invoke-virtual {v1}, Lgg2/a;->e()Landroidx/lifecycle/g0;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/o1;->n(Landroid/view/View;Landroidx/lifecycle/g0;)V

    new-instance v0, Lgg2/b;

    new-instance v1, Lgg2/a;

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-direct {v1, v2, v3, v4, v2}, Lgg2/a;-><init>(Landroidx/lifecycle/w;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1}, Lgg2/b;-><init>(Landroidx/lifecycle/x;)V

    invoke-static {p0, v0}, Lts/o;->G(Landroid/view/View;Lpb/f;)V

    :cond_1
    return-void
.end method
