.class public final Lrq0/a1;
.super Lib/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrq0/a1$b;,
        Lrq0/a1$c;,
        Lrq0/a1$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lib/p;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0008\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u001d\"\u001fB#\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J#\u0010\u0015\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00192\n\u0010\u0017\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lrq0/a1;",
        "Lib/p;",
        "Lcom/whoop/domain/model/teams/TeamUser;",
        "Lrq0/a1$d;",
        "Lrq0/z0;",
        "fragment",
        "Lrq0/a1$b;",
        "viewModel",
        "",
        "isInternationalizedTeamViews",
        "<init>",
        "(Lrq0/z0;Lrq0/a1$b;Z)V",
        "f",
        "()Z",
        "e",
        "",
        "g",
        "()I",
        "Landroid/view/ViewGroup;",
        "parent",
        "viewType",
        "i",
        "(Landroid/view/ViewGroup;I)Lrq0/a1$d;",
        "holder",
        "position",
        "Ll83/a0;",
        "h",
        "(Lrq0/a1$d;I)V",
        "getItemCount",
        "c",
        "Lrq0/z0;",
        "d",
        "Lrq0/a1$b;",
        "Z",
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
.field private final c:Lrq0/z0;

.field private final d:Lrq0/a1$b;

.field private final e:Z


# direct methods
.method public constructor <init>(Lrq0/z0;Lrq0/a1$b;Z)V
    .locals 1

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrq0/a1$a;

    invoke-direct {v0}, Lrq0/a1$a;-><init>()V

    invoke-direct {p0, v0}, Lib/p;-><init>(Landroidx/recyclerview/widget/u;)V

    iput-object p1, p0, Lrq0/a1;->c:Lrq0/z0;

    iput-object p2, p0, Lrq0/a1;->d:Lrq0/a1$b;

    iput-boolean p3, p0, Lrq0/a1;->e:Z

    return-void
.end method

.method public static final synthetic d(Lrq0/a1;)Z
    .locals 0

    iget-boolean p0, p0, Lrq0/a1;->e:Z

    return p0
.end method

.method private final e()Z
    .locals 2

    invoke-direct {p0}, Lrq0/a1;->f()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lrq0/a1;->d:Lrq0/a1$b;

    invoke-interface {v0}, Lrq0/a1$b;->state()Lrq0/a1$c;

    move-result-object v0

    invoke-interface {v0}, Lrq0/a1$c;->b()Lcom/whoop/domain/model/teams/Team;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/Team;->getTeamType()Lcom/whoop/domain/model/teams/TeamType;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lcom/whoop/domain/model/teams/TeamType;->ELITE:Lcom/whoop/domain/model/teams/TeamType;

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method private final f()Z
    .locals 1

    iget-object v0, p0, Lrq0/a1;->d:Lrq0/a1$b;

    instance-of v0, v0, Lrq0/e1;

    return v0
.end method

.method private final g()I
    .locals 1

    invoke-direct {p0}, Lrq0/a1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    return v0

    :cond_0
    const/4 v0, 0x3

    return v0
.end method


# virtual methods
.method public getItemCount()I
    .locals 2

    invoke-super {p0}, Lib/p;->getItemCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-direct {p0}, Lrq0/a1;->g()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public h(Lrq0/a1$d;I)V
    .locals 8

    const-string v1, "holder"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_4

    const/4 v1, 0x1

    if-eq p2, v1, :cond_3

    const/4 v3, 0x2

    if-eq p2, v3, :cond_1

    const/4 v3, 0x3

    if-eq p2, v3, :cond_0

    iget-object v4, p0, Lrq0/a1;->d:Lrq0/a1$b;

    invoke-direct {p0}, Lrq0/a1;->g()I

    move-result v1

    sub-int v0, p2, v1

    invoke-virtual {p0, v0}, Lib/p;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/whoop/domain/model/teams/TeamUser;

    const/4 v6, 0x0

    invoke-direct {p0}, Lrq0/a1;->f()Z

    move-result v7

    const/4 v3, 0x2

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lrq0/a1$d;->e(ILrq0/a1$b;Lcom/whoop/domain/model/teams/TeamUser;ZZ)V

    return-void

    :cond_0
    iget-object v4, p0, Lrq0/a1;->d:Lrq0/a1$b;

    invoke-direct {p0}, Lrq0/a1;->g()I

    move-result v2

    sub-int v0, p2, v2

    invoke-virtual {p0, v0}, Lib/p;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/whoop/domain/model/teams/TeamUser;

    invoke-direct {p0}, Lrq0/a1;->e()Z

    move-result v0

    xor-int/lit8 v6, v0, 0x1

    invoke-direct {p0}, Lrq0/a1;->f()Z

    move-result v7

    const/4 v3, 0x2

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lrq0/a1$d;->e(ILrq0/a1$b;Lcom/whoop/domain/model/teams/TeamUser;ZZ)V

    return-void

    :cond_1
    iget-object v4, p0, Lrq0/a1;->d:Lrq0/a1$b;

    invoke-direct {p0}, Lrq0/a1;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0}, Lrq0/a1;->g()I

    move-result v1

    sub-int v0, p2, v1

    invoke-virtual {p0, v0}, Lib/p;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/domain/model/teams/TeamUser;

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-direct {p0}, Lrq0/a1;->e()Z

    move-result v6

    invoke-direct {p0}, Lrq0/a1;->f()Z

    move-result v7

    const/4 v3, 0x3

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lrq0/a1$d;->e(ILrq0/a1$b;Lcom/whoop/domain/model/teams/TeamUser;ZZ)V

    return-void

    :cond_3
    iget-object v4, p0, Lrq0/a1;->d:Lrq0/a1$b;

    const/4 v6, 0x0

    invoke-direct {p0}, Lrq0/a1;->f()Z

    move-result v7

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lrq0/a1$d;->e(ILrq0/a1$b;Lcom/whoop/domain/model/teams/TeamUser;ZZ)V

    return-void

    :cond_4
    iget-object v4, p0, Lrq0/a1;->d:Lrq0/a1$b;

    const/4 v6, 0x0

    invoke-direct {p0}, Lrq0/a1;->f()Z

    move-result v7

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lrq0/a1$d;->e(ILrq0/a1$b;Lcom/whoop/domain/model/teams/TeamUser;ZZ)V

    return-void
.end method

.method public i(Landroid/view/ViewGroup;I)Lrq0/a1$d;
    .locals 3

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lrq0/a1$d;

    iget-object v0, p0, Lrq0/a1;->c:Lrq0/z0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const-string v2, "from(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p0, v0, v1, p1}, Lrq0/a1$d;-><init>(Lrq0/a1;Lrq0/z0;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    return-object p2
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    check-cast p1, Lrq0/a1$d;

    invoke-virtual {p0, p1, p2}, Lrq0/a1;->h(Lrq0/a1$d;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lrq0/a1;->i(Landroid/view/ViewGroup;I)Lrq0/a1$d;

    move-result-object p1

    return-object p1
.end method
