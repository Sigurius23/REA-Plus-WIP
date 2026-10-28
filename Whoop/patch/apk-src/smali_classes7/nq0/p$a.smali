.class public final Lnq0/p$a;
.super Landroidx/recyclerview/widget/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnq0/p;-><init>(Landroid/app/Activity;Lrq0/i0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/u;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "nq0/p$a",
        "Landroidx/recyclerview/widget/u;",
        "Lcom/whoop/domain/model/teams/TeamUser;",
        "oldItem",
        "newItem",
        "",
        "b",
        "(Lcom/whoop/domain/model/teams/TeamUser;Lcom/whoop/domain/model/teams/TeamUser;)Z",
        "a",
        "community_release"
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/whoop/domain/model/teams/TeamUser;Lcom/whoop/domain/model/teams/TeamUser;)Z
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/whoop/domain/model/teams/TeamUser;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/whoop/domain/model/teams/TeamUser;

    check-cast p2, Lcom/whoop/domain/model/teams/TeamUser;

    invoke-virtual {p0, p1, p2}, Lnq0/p$a;->a(Lcom/whoop/domain/model/teams/TeamUser;Lcom/whoop/domain/model/teams/TeamUser;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/whoop/domain/model/teams/TeamUser;

    check-cast p2, Lcom/whoop/domain/model/teams/TeamUser;

    invoke-virtual {p0, p1, p2}, Lnq0/p$a;->b(Lcom/whoop/domain/model/teams/TeamUser;Lcom/whoop/domain/model/teams/TeamUser;)Z

    move-result p1

    return p1
.end method

.method public b(Lcom/whoop/domain/model/teams/TeamUser;Lcom/whoop/domain/model/teams/TeamUser;)Z
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamUser;->getId()I

    move-result p1

    invoke-virtual {p2}, Lcom/whoop/domain/model/teams/TeamUser;->getId()I

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
