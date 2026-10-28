.class public final Lqq0/c;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lqq0/c;",
        "Landroidx/recyclerview/widget/o2;",
        "Leq0/e3;",
        "selectTeamItemViewBinding",
        "<init>",
        "(Leq0/e3;)V",
        "Lcom/whoop/domain/model/teams/share/SelectTeam;",
        "selectTeam",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onTeamClick",
        "b",
        "(Lcom/whoop/domain/model/teams/share/SelectTeam;Lkotlin/jvm/functions/Function1;)V",
        "a",
        "Leq0/e3;",
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
.field private final a:Leq0/e3;


# direct methods
.method public constructor <init>(Leq0/e3;)V
    .locals 1

    const-string v0, "selectTeamItemViewBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lqq0/c;->a:Leq0/e3;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/share/SelectTeam;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lqq0/c;->c(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/share/SelectTeam;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/share/SelectTeam;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b(Lcom/whoop/domain/model/teams/share/SelectTeam;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/teams/share/SelectTeam;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "selectTeam"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTeamClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqq0/c;->a:Leq0/e3;

    iget-object v1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/share/SelectTeam;->getAvatarUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object v1

    sget-object v2, Lzk/k;->b:Lzk/k;

    invoke-virtual {v1, v2}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/f;

    sget v2, Lvu1/c;->n:I

    invoke-virtual {v1, v2}, Lpl/a;->j(I)Lpl/a;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/f;

    iget-object v2, v0, Leq0/e3;->a:Lde/hdodenhof/circleimageview/CircleImageView;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    iget-object v1, v0, Leq0/e3;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/share/SelectTeam;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lq11/c;

    const/16 v2, 0xa

    invoke-direct {v1, v2, p2, p1}, Lq11/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
