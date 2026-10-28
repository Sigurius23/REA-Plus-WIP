.class public final Lrq0/i;
.super Lib/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrq0/i$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lib/p;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000c\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001f"
    }
    d2 = {
        "Lrq0/i;",
        "Lib/p;",
        "Lcom/whoop/domain/model/teams/TeamUser;",
        "Lrq0/i$b;",
        "Lrq0/k;",
        "viewModel",
        "<init>",
        "(Lrq0/k;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "h",
        "(Landroid/view/ViewGroup;I)Lrq0/i$b;",
        "holder",
        "position",
        "Ll83/a0;",
        "f",
        "(Lrq0/i$b;I)V",
        "c",
        "Lrq0/k;",
        "getViewModel",
        "()Lrq0/k;",
        "d",
        "Ljava/lang/Integer;",
        "e",
        "()Ljava/lang/Integer;",
        "i",
        "(Ljava/lang/Integer;)V",
        "positionToAnimate",
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
.field private final c:Lrq0/k;

.field private d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lrq0/k;)V
    .locals 1

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrq0/i$a;

    invoke-direct {v0}, Lrq0/i$a;-><init>()V

    invoke-direct {p0, v0}, Lib/p;-><init>(Landroidx/recyclerview/widget/u;)V

    iput-object p1, p0, Lrq0/i;->c:Lrq0/k;

    return-void
.end method

.method public static synthetic d(Lrq0/i;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lrq0/i;->g(Lrq0/i;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lrq0/i;I)Ll83/a0;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/i1;->notifyItemChanged(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final e()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lrq0/i;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public f(Lrq0/i$b;I)V
    .locals 7

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lib/p;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/whoop/domain/model/teams/TeamUser;

    iget-object v3, p0, Lrq0/i;->c:Lrq0/k;

    new-instance v6, Lf1/x;

    const/4 v0, 0x6

    invoke-direct {v6, p0, p2, v0}, Lf1/x;-><init>(Ljava/lang/Object;II)V

    move-object v4, p0

    move-object v1, p1

    move v5, p2

    invoke-virtual/range {v1 .. v6}, Lrq0/i$b;->d(Lcom/whoop/domain/model/teams/TeamUser;Lrq0/k;Lrq0/i;ILc93/a;)V

    return-void
.end method

.method public h(Landroid/view/ViewGroup;I)Lrq0/i$b;
    .locals 2

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lxp0/b0;->Y:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lrq0/i$b;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p2, p1}, Lrq0/i$b;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public final i(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lrq0/i;->d:Ljava/lang/Integer;

    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    check-cast p1, Lrq0/i$b;

    invoke-virtual {p0, p1, p2}, Lrq0/i;->f(Lrq0/i$b;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lrq0/i;->h(Landroid/view/ViewGroup;I)Lrq0/i$b;

    move-result-object p1

    return-object p1
.end method
