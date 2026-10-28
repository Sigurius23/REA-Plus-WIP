.class public final Lg60/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0013\u0010\r\u001a\u00020\u000c*\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0013\u0010\n\u00a8\u0006\u0014"
    }
    d2 = {
        "Lg60/a;",
        "",
        "<init>",
        "()V",
        "Ld60/a$a;",
        "Lf60/c;",
        "b",
        "(Ld60/a$a;)Lf60/c;",
        "Ld60/c;",
        "e",
        "(Ld60/c;)Lf60/c;",
        "Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;",
        "Lf60/c$c;",
        "d",
        "(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;)Lf60/c$c;",
        "domainState",
        "Lf60/c$b;",
        "c",
        "(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ld60/c;)Lf60/c$b;",
        "a",
        "access_release"
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

.method private final b(Ld60/a$a;)Lf60/c;
    .locals 9

    instance-of v0, p1, Ld60/a$b;

    if-eqz v0, :cond_0

    new-instance v1, Lf60/c;

    new-instance v2, Lf60/c$a;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lf60/c$a;-><init>(Lsz0/q0;Lf60/a;Lf60/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lf60/c;-><init>(Lf60/c$a;Lf60/c$c;Lf60/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Ld60/a$c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    new-instance v3, Lf60/c;

    new-instance v4, Lf60/c$a;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object p1

    new-instance v0, Lf60/a$g;

    invoke-direct {v0, v2, v1, v2}, Lf60/a$g;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, Lf60/a$c;->a:Lf60/a$c;

    invoke-direct {v4, p1, v0, v1}, Lf60/c$a;-><init>(Lsz0/q0;Lf60/a;Lf60/a;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lf60/c;-><init>(Lf60/c$a;Lf60/c$c;Lf60/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_1
    instance-of p1, p1, Ld60/a$d;

    if-eqz p1, :cond_2

    new-instance v3, Lf60/c;

    new-instance v4, Lf60/c$a;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object p1

    new-instance v0, Lf60/a$g;

    invoke-direct {v0, v2, v1, v2}, Lf60/a$g;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, Lf60/a$c;->a:Lf60/a$c;

    invoke-direct {v4, p1, v0, v1}, Lf60/c$a;-><init>(Lsz0/q0;Lf60/a;Lf60/a;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lf60/c;-><init>(Lf60/c$a;Lf60/c$c;Lf60/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final c(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ld60/c;)Lf60/c$b;
    .locals 1

    new-instance v0, Lf60/c$b;

    invoke-virtual {p1}, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ld60/c;->d()Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lf60/c$b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method private final d(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;)Lf60/c$c;
    .locals 8

    invoke-virtual {p1}, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->getTile()Lcom/whoop/design/models/tiles/EmptyTileModel;

    move-result-object v0

    invoke-static {v0}, Llb1/i1;->c(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->getProgressButton()Lcom/whoop/design/models/ProgressButtonModel;

    move-result-object v0

    invoke-static {v0}, Llb1/t3;->g(Lcom/whoop/design/models/ProgressButtonModel;)Lc31/k;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->getCallout()Lcom/whoop/design/models/InfoCalloutTileModel;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Llb1/j2;->b(Lcom/whoop/design/models/InfoCalloutTileModel;)Lc41/p2;

    move-result-object p1

    :goto_0
    move-object v6, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    new-instance v0, Lf60/c$c;

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lf60/c$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lk11/f;Lc31/k;Lc41/p2;Lcom/whoop/navigation/e;)V

    return-object v0
.end method

.method private final e(Ld60/c;)Lf60/c;
    .locals 16

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Ld60/c;->e()Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v2, Lf60/c;

    new-instance v3, Lf60/c$a;

    sget-object v1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lf60/c$a;-><init>(Lsz0/q0;Lf60/a;Lf60/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v7}, Lf60/c;-><init>(Lf60/c$a;Lf60/c$c;Lf60/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_0
    invoke-virtual/range {p1 .. p1}, Ld60/c;->f()Ld60/e;

    move-result-object v2

    instance-of v2, v2, Ld60/e$d;

    if-eqz v2, :cond_1

    new-instance v3, Lf60/c;

    new-instance v4, Lf60/c$a;

    sget-object v1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lf60/c$a;-><init>(Lsz0/q0;Lf60/a;Lf60/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v3 .. v8}, Lf60/c;-><init>(Lf60/c$a;Lf60/c$c;Lf60/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_1
    invoke-virtual/range {p1 .. p1}, Ld60/c;->f()Ld60/e;

    move-result-object v2

    instance-of v2, v2, Ld60/e$c;

    if-eqz v2, :cond_3

    new-instance v3, Lsz0/q0;

    new-instance v4, Lsz0/p0$h;

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v14, 0x3fd

    const/4 v15, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v3 .. v15}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Ld60/c;->f()Ld60/e;

    move-result-object v1

    check-cast v1, Ld60/e$c;

    invoke-virtual {v1}, Ld60/e$c;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lf60/a$e;

    invoke-direct {v2, v1}, Lf60/a$e;-><init>(Ljava/lang/String;)V

    :goto_0
    move-object v5, v2

    goto :goto_1

    :cond_2
    sget-object v2, Lf60/a$c;->a:Lf60/a$c;

    goto :goto_0

    :goto_1
    new-instance v7, Lf60/c$a;

    const/4 v6, 0x0

    move-object v4, v3

    move-object v3, v7

    const/4 v7, 0x4

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lf60/c$a;-><init>(Lsz0/q0;Lf60/a;Lf60/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lf60/c;

    const/4 v9, 0x0

    const/4 v10, 0x6

    const/4 v11, 0x0

    move-object v7, v3

    invoke-direct/range {v6 .. v11}, Lf60/c;-><init>(Lf60/c$a;Lf60/c$c;Lf60/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_3
    invoke-virtual/range {p1 .. p1}, Ld60/c;->d()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    new-instance v3, Lf60/c;

    move-object/from16 v2, p1

    invoke-direct {v0, v1, v2}, Lg60/a;->c(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ld60/c;)Lf60/c$b;

    move-result-object v6

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v3 .. v8}, Lf60/c;-><init>(Lf60/c$a;Lf60/c$c;Lf60/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_4
    new-instance v4, Lf60/c;

    invoke-direct {v0, v1}, Lg60/a;->d(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;)Lf60/c$c;

    move-result-object v6

    const/4 v8, 0x5

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lf60/c;-><init>(Lf60/c$a;Lf60/c$c;Lf60/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method


# virtual methods
.method public final a(Ld60/c;)Lf60/c;
    .locals 1

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ld60/c;->c()Ld60/a;

    move-result-object v0

    instance-of v0, v0, Ld60/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ld60/c;->c()Ld60/a;

    move-result-object p1

    check-cast p1, Ld60/a$a;

    invoke-direct {p0, p1}, Lg60/a;->b(Ld60/a$a;)Lf60/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lg60/a;->e(Ld60/c;)Lf60/c;

    move-result-object p1

    return-object p1
.end method
