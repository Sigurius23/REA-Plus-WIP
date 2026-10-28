.class public final Lrq0/i0$b;
.super Lib/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrq0/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lib/a0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J%\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00072\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ%\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u000e2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lrq0/i0$b;",
        "Lib/a0;",
        "Lcom/whoop/domain/model/teams/TeamUser;",
        "Lrq0/i0;",
        "viewModel",
        "<init>",
        "(Lrq0/i0;)V",
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
        "Lrq0/i0;",
        "getViewModel",
        "()Lrq0/i0;",
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
.field private final c:Lrq0/i0;


# direct methods
.method public constructor <init>(Lrq0/i0;)V
    .locals 1

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lib/j;-><init>()V

    iput-object p1, p0, Lrq0/i0$b;->c:Lrq0/i0;

    return-void
.end method

.method public static synthetic l(Lib/x;Lcom/whoop/domain/model/RecordsDto;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lrq0/i0$b;->r(Lib/x;Lcom/whoop/domain/model/RecordsDto;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lrq0/f;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lrq0/i0$b;->s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic n(Lcom/whoop/data/local/room/dao/wipeable/d;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lrq0/i0$b;->q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic o(Lib/u;ILrq0/i0$b;Lcom/whoop/domain/model/RecordsDto;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lrq0/i0$b;->p(Lib/u;ILrq0/i0$b;Lcom/whoop/domain/model/RecordsDto;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Lib/u;ILrq0/i0$b;Lcom/whoop/domain/model/RecordsDto;)Ll83/a0;
    .locals 2

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lcom/whoop/domain/model/RecordsDto;->getRecords()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p3}, Lcom/whoop/domain/model/RecordsDto;->getRecords()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p0, p1, v1, v0}, Lib/u;->a(IILjava/util/List;)V

    iget-object p0, p2, Lrq0/i0$b;->c:Lrq0/i0;

    invoke-virtual {p3}, Lcom/whoop/domain/model/RecordsDto;->getTotalCount()I

    move-result p1

    invoke-virtual {p0, p1}, Lrq0/i0;->w(I)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final r(Lib/x;Lcom/whoop/domain/model/RecordsDto;)Ll83/a0;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/domain/model/RecordsDto;->getRecords()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lib/x;->a(Ljava/util/List;)V

    :cond_0
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
    .locals 3
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

    iget-object v0, p0, Lrq0/i0$b;->c:Lrq0/i0;

    invoke-virtual {v0, v1, p1}, Lrq0/i0;->t(II)Lxg3/g;

    move-result-object p1

    invoke-static {}, Lkh3/a;->a()Lkh3/a;

    move-result-object v0

    iget-object v0, v0, Lkh3/a;->b:Leh3/e;

    invoke-virtual {p1, v0}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object p1

    new-instance v0, Lcom/whoop/data/local/room/dao/wipeable/d;

    const/16 v2, 0xa

    invoke-direct {v0, p2, v1, p0, v2}, Lcom/whoop/data/local/room/dao/wipeable/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    new-instance p2, Lo52/m0;

    const/16 v1, 0x12

    invoke-direct {p2, v0, v1}, Lo52/m0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    return-void
.end method

.method public j(Lib/z;Lib/x;)V
    .locals 2
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

    iget-object v0, p0, Lrq0/i0$b;->c:Lrq0/i0;

    iget v1, p1, Lib/z;->a:I

    iget p1, p1, Lib/z;->b:I

    invoke-virtual {v0, v1, p1}, Lrq0/i0;->t(II)Lxg3/g;

    move-result-object p1

    invoke-static {}, Lkh3/a;->a()Lkh3/a;

    move-result-object v0

    iget-object v0, v0, Lkh3/a;->b:Leh3/e;

    invoke-virtual {p1, v0}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object p1

    new-instance v0, Lrq0/f;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1}, Lrq0/f;-><init>(Lib/x;I)V

    new-instance p2, Lo52/m0;

    const/16 v1, 0x11

    invoke-direct {p2, v0, v1}, Lo52/m0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    return-void
.end method
