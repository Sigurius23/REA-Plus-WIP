.class public final Lx61/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx61/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000b\u001a\u00020\n2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lx61/d;",
        "",
        "<init>",
        "()V",
        "",
        "Ly61/b;",
        "mergedBars",
        "Lx61/d$a;",
        "c",
        "(Ljava/util/List;)Lx61/d$a;",
        "",
        "a",
        "(Ljava/util/List;)F",
        "Ly61/a;",
        "previousGroup",
        "nextGroup",
        "b",
        "(Ly61/a;Ly61/a;)Ly61/a;",
        "design_release"
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

.method private final a(Ljava/util/List;)F
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly61/b;",
            ">;)F"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 p1, 0x3f000000    # 0.5f

    return p1

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly61/b;

    invoke-virtual {v2}, Ly61/b;->c()F

    move-result v4

    invoke-virtual {v2}, Ly61/b;->b()F

    move-result v2

    div-float/2addr v2, v3

    sub-float/2addr v4, v2

    invoke-static {v1, v4}, Ljava/lang/Math;->min(FF)F

    move-result v1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly61/b;

    invoke-virtual {v2}, Ly61/b;->c()F

    move-result v4

    invoke-virtual {v2}, Ly61/b;->b()F

    move-result v2

    div-float/2addr v2, v3

    add-float/2addr v2, v4

    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    goto :goto_1

    :cond_2
    add-float/2addr v1, v0

    div-float/2addr v1, v3

    return v1
.end method

.method private final c(Ljava/util/List;)Lx61/d$a;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly61/b;",
            ">;)",
            "Lx61/d$a;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lx61/d;->a(Ljava/util/List;)F

    move-result v0

    new-instance v1, Lu61/d;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lu61/d;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, Lx61/d$a;

    invoke-direct {p1, v0, v1}, Lx61/d$a;-><init>(FLu61/d;)V

    return-object p1
.end method


# virtual methods
.method public final b(Ly61/a;Ly61/a;)Ly61/a;
    .locals 18

    const-string v0, "previousGroup"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextGroup"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ly61/a;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v2}, Ly61/a;->d()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v0, v3}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v1}, Ly61/a;->i()Lkd1/o;

    move-result-object v0

    invoke-virtual {v2}, Ly61/a;->i()Lkd1/o;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    move-object/from16 v2, p0

    invoke-direct {v2, v6}, Lx61/d;->c(Ljava/util/List;)Lx61/d$a;

    move-result-object v3

    new-instance v4, Ly61/a;

    invoke-virtual {v3}, Lx61/d$a;->b()F

    move-result v7

    invoke-virtual {v3}, Lx61/d$a;->a()Lu61/d;

    move-result-object v8

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ly61/a;->i()Lkd1/o;

    move-result-object v0

    :goto_0
    move-object v9, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lkd1/o$a;

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->b()Lgz0/c;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/c;->d()I

    move-result v1

    invoke-direct {v0, v1}, Lkd1/o$a;-><init>(I)V

    goto :goto_0

    :goto_1
    sget-object v10, Ly81/f;->WHITE_50:Ly81/f;

    const/16 v16, 0x7c1

    const/16 v17, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v4 .. v17}, Ly61/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;FLu61/d;Lkd1/o;Ly81/f;La71/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method
