.class public final Lrq0/g0;
.super Lib/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrq0/g0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lib/p;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u001e\u001a\u0004\u0008\t\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lrq0/g0;",
        "Lib/p;",
        "Lcom/whoop/domain/model/teams/TeamUser;",
        "Lrq0/g0$b;",
        "Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;",
        "activity",
        "Lrq0/i0;",
        "viewModel",
        "",
        "isTransfer",
        "<init>",
        "(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lrq0/i0;Z)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "e",
        "(Landroid/view/ViewGroup;I)Lrq0/g0$b;",
        "holder",
        "position",
        "Ll83/a0;",
        "d",
        "(Lrq0/g0$b;I)V",
        "c",
        "Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;",
        "getActivity",
        "()Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;",
        "Lrq0/i0;",
        "getViewModel",
        "()Lrq0/i0;",
        "Z",
        "()Z",
        "b",
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


# instance fields
.field private final c:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

.field private final d:Lrq0/i0;

.field private final e:Z


# direct methods
.method public constructor <init>(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lrq0/i0;Z)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrq0/g0$a;

    invoke-direct {v0}, Lrq0/g0$a;-><init>()V

    invoke-direct {p0, v0}, Lib/p;-><init>(Landroidx/recyclerview/widget/u;)V

    iput-object p1, p0, Lrq0/g0;->c:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    iput-object p2, p0, Lrq0/g0;->d:Lrq0/i0;

    iput-boolean p3, p0, Lrq0/g0;->e:Z

    return-void
.end method


# virtual methods
.method public d(Lrq0/g0$b;I)V
    .locals 3

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lib/p;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/domain/model/teams/TeamUser;

    invoke-virtual {p0, p2}, Lib/p;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/domain/model/teams/TeamUser;

    iget-boolean v1, p0, Lrq0/g0;->e:Z

    iget-object v2, p0, Lrq0/g0;->c:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    invoke-virtual {p1, v0, v1, v2, p2}, Lrq0/g0$b;->c(Lcom/whoop/domain/model/teams/TeamUser;ZLcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;I)V

    return-void
.end method

.method public e(Landroid/view/ViewGroup;I)Lrq0/g0$b;
    .locals 2

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lrq0/g0;->c:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lxp0/b0;->b0:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lrq0/g0$b;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p2, p1}, Lrq0/g0$b;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    check-cast p1, Lrq0/g0$b;

    invoke-virtual {p0, p1, p2}, Lrq0/g0;->d(Lrq0/g0$b;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lrq0/g0;->e(Landroid/view/ViewGroup;I)Lrq0/g0$b;

    move-result-object p1

    return-object p1
.end method
