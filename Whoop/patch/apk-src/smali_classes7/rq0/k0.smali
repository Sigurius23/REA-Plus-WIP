.class public final Lrq0/k0;
.super Lib/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lib/a0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J%\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u00122\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lrq0/k0;",
        "Lib/a0;",
        "Lcom/whoop/domain/model/teams/LeadersEntry;",
        "Lcom/whoop/ui/ScoreContext;",
        "scoreContext",
        "Lcom/whoop/community/domain/model/teams/TimePeriod;",
        "timePeriod",
        "Lrq0/h1;",
        "viewModel",
        "<init>",
        "(Lcom/whoop/ui/ScoreContext;Lcom/whoop/community/domain/model/teams/TimePeriod;Lrq0/h1;)V",
        "Lib/w;",
        "params",
        "Lib/u;",
        "callback",
        "Ll83/a0;",
        "i",
        "(Lib/w;Lib/u;)V",
        "Lib/z;",
        "Lib/x;",
        "j",
        "(Lib/z;Lib/x;)V",
        "c",
        "Lcom/whoop/ui/ScoreContext;",
        "getScoreContext",
        "()Lcom/whoop/ui/ScoreContext;",
        "d",
        "Lcom/whoop/community/domain/model/teams/TimePeriod;",
        "getTimePeriod",
        "()Lcom/whoop/community/domain/model/teams/TimePeriod;",
        "e",
        "Lrq0/h1;",
        "getViewModel",
        "()Lrq0/h1;",
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
.field private final c:Lcom/whoop/ui/ScoreContext;

.field private final d:Lcom/whoop/community/domain/model/teams/TimePeriod;

.field private final e:Lrq0/h1;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/ScoreContext;Lcom/whoop/community/domain/model/teams/TimePeriod;Lrq0/h1;)V
    .locals 1

    const-string v0, "scoreContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timePeriod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lib/j;-><init>()V

    iput-object p1, p0, Lrq0/k0;->c:Lcom/whoop/ui/ScoreContext;

    iput-object p2, p0, Lrq0/k0;->d:Lcom/whoop/community/domain/model/teams/TimePeriod;

    iput-object p3, p0, Lrq0/k0;->e:Lrq0/h1;

    return-void
.end method

.method public static synthetic l(Lrq0/f;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lrq0/k0;->s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic m(Lcom/whoop/data/local/room/dao/wipeable/d;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lrq0/k0;->q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic n(Lib/x;Lhq0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lrq0/k0;->r(Lib/x;Lhq0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lib/u;ILrq0/k0;Lhq0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lrq0/k0;->p(Lib/u;ILrq0/k0;Lhq0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Lib/u;ILrq0/k0;Lhq0/a;)Ll83/a0;
    .locals 1

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lhq0/a;->b()Ljava/util/List;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    if-eqz p3, :cond_1

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0, p1, v0, p3}, Lib/u;->a(IILjava/util/List;)V

    iget-object p0, p2, Lrq0/k0;->e:Lrq0/h1;

    iget-object p1, p2, Lrq0/k0;->c:Lcom/whoop/ui/ScoreContext;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lrq0/h1;->B0(Lcom/whoop/ui/ScoreContext;I)V

    goto :goto_1

    :cond_1
    iget-object p0, p2, Lrq0/k0;->e:Lrq0/h1;

    iget-object p1, p2, Lrq0/k0;->c:Lcom/whoop/ui/ScoreContext;

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lrq0/h1;->B0(Lcom/whoop/ui/ScoreContext;I)V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final r(Lib/x;Lhq0/a;)Ll83/a0;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lhq0/a;->b()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lib/x;->a(Ljava/util/List;)V

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public i(Lib/w;Lib/u;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lib/w;",
            "Lib/u;",
            ")V"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x28

    invoke-static {p1, v0}, Lib/a0;->e(Lib/w;I)I

    move-result v1

    invoke-static {p1, v1, v0}, Lib/a0;->f(Lib/w;II)I

    move-result p1

    iget-object v0, p0, Lrq0/k0;->e:Lrq0/h1;

    iget-object v2, p0, Lrq0/k0;->c:Lcom/whoop/ui/ScoreContext;

    iget-object v3, p0, Lrq0/k0;->d:Lcom/whoop/community/domain/model/teams/TimePeriod;

    invoke-virtual {v0, v2, v3, v1, p1}, Lrq0/h1;->Q(Lcom/whoop/ui/ScoreContext;Lcom/whoop/community/domain/model/teams/TimePeriod;II)Lxg3/g;

    move-result-object p1

    invoke-static {}, Lkh3/a;->a()Lkh3/a;

    move-result-object v0

    iget-object v0, v0, Lkh3/a;->b:Leh3/e;

    invoke-virtual {p1, v0}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object p1

    new-instance v0, Lcom/whoop/data/local/room/dao/wipeable/d;

    const/16 v2, 0xb

    invoke-direct {v0, p2, v1, p0, v2}, Lcom/whoop/data/local/room/dao/wipeable/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    new-instance p2, Lo52/m0;

    const/16 v1, 0x14

    invoke-direct {p2, v0, v1}, Lo52/m0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    return-void
.end method

.method public j(Lib/z;Lib/x;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lib/z;",
            "Lib/x;",
            ")V"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrq0/k0;->e:Lrq0/h1;

    iget-object v1, p0, Lrq0/k0;->c:Lcom/whoop/ui/ScoreContext;

    iget-object v2, p0, Lrq0/k0;->d:Lcom/whoop/community/domain/model/teams/TimePeriod;

    iget v3, p1, Lib/z;->a:I

    iget p1, p1, Lib/z;->b:I

    invoke-virtual {v0, v1, v2, v3, p1}, Lrq0/h1;->Q(Lcom/whoop/ui/ScoreContext;Lcom/whoop/community/domain/model/teams/TimePeriod;II)Lxg3/g;

    move-result-object p1

    invoke-static {}, Lkh3/a;->a()Lkh3/a;

    move-result-object v0

    iget-object v0, v0, Lkh3/a;->b:Leh3/e;

    invoke-virtual {p1, v0}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object p1

    new-instance v0, Lrq0/f;

    const/4 v1, 0x2

    invoke-direct {v0, p2, v1}, Lrq0/f;-><init>(Lib/x;I)V

    new-instance p2, Lo52/m0;

    const/16 v1, 0x13

    invoke-direct {p2, v0, v1}, Lo52/m0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    return-void
.end method
