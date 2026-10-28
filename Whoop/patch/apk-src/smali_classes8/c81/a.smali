.class public abstract Lc81/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc81/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lc81/a;",
        "",
        "a",
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


# static fields
.field public static final a:Lc81/a$a;

.field private static final b:Lc81/g;

.field private static final c:Lc81/g;

.field private static final d:Lc81/g;

.field private static final e:Lc81/g;

.field private static final f:Lc81/g;

.field private static final g:Lc81/g;

.field private static final h:Lc81/g;

.field private static final i:Lc81/g;

.field private static final j:Lc81/g;

.field private static final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc81/e;",
            ">;"
        }
    .end annotation
.end field

.field private static final l:Lc81/g;

.field private static final m:Lc81/g;

.field private static final n:Lc81/g;

.field private static final o:Lc81/g;

.field private static final p:Lc81/g;


# direct methods
.method static constructor <clinit>()V
    .locals 33

    new-instance v0, Lc81/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc81/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lc81/a;->a:Lc81/a$a;

    new-instance v2, Lc81/g;

    const/16 v3, 0x24

    invoke-virtual {v0, v3}, Lc81/a$a;->f(I)Ljava/util/List;

    move-result-object v4

    sget-object v8, Lgz0/m0;->SLOW_PACE_OF_AGING:Lgz0/m0;

    sget-object v10, Lgz0/m0;->FAST_PACE_OF_AGING:Lgz0/m0;

    const/16 v15, 0x37

    invoke-static {v15, v3}, Lor2/a1;->c(II)Li93/h;

    move-result-object v9

    const/16 v13, 0x380

    const/4 v14, 0x0

    move-object v3, v4

    const-string v4, "Slow"

    const-string v6, "Fast"

    move-object v5, v8

    const-string v8, "PACE OF AGING"

    move-object v7, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v2 .. v14}, Lc81/g;-><init>(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v5

    move-object v10, v7

    sput-object v2, Lc81/a;->b:Lc81/g;

    new-instance v5, Lc81/g;

    const/16 v3, 0x1e

    invoke-virtual {v0, v3}, Lc81/a$a;->f(I)Ljava/util/List;

    move-result-object v6

    const/16 v4, 0x27

    invoke-static {v4, v3}, Lor2/a1;->c(II)Li93/h;

    move-result-object v12

    const/16 v16, 0x300

    const/16 v17, 0x0

    const-string v7, "Slow"

    const-string v9, "Fast"

    const-string v11, "PACE OF AGING"

    const/4 v13, 0x0

    const/4 v14, 0x0

    move v3, v15

    const/4 v15, 0x0

    invoke-direct/range {v5 .. v17}, Lc81/g;-><init>(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lc81/a;->c:Lc81/g;

    new-instance v5, Lc81/g;

    const/16 v6, 0x32

    invoke-virtual {v0, v6}, Lc81/a$a;->f(I)Ljava/util/List;

    move-result-object v7

    invoke-static {v4, v6}, Lor2/a1;->c(II)Li93/h;

    move-result-object v12

    move v4, v6

    move-object v6, v7

    const-string v7, "Slow"

    const-string v9, "Fast"

    const-string v11, "PACE OF AGING"

    invoke-direct/range {v5 .. v17}, Lc81/g;-><init>(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lc81/a;->d:Lc81/g;

    new-instance v5, Lc81/g;

    const/16 v6, 0x23

    invoke-virtual {v0, v6}, Lc81/a$a;->f(I)Ljava/util/List;

    move-result-object v7

    const/16 v9, 0x19

    invoke-static {v9, v6}, Lor2/a1;->c(II)Li93/h;

    move-result-object v12

    move v9, v6

    move-object v6, v7

    const-string v7, "Slow"

    move v11, v9

    const-string v9, "Fast"

    move v13, v11

    const-string v11, "PACE OF AGING"

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    const/4 v15, 0x0

    move/from16 v1, v18

    invoke-direct/range {v5 .. v17}, Lc81/g;-><init>(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lc81/a;->e:Lc81/g;

    new-instance v5, Lc81/g;

    invoke-virtual {v0, v4}, Lc81/a$a;->f(I)Ljava/util/List;

    move-result-object v6

    invoke-static {v1, v4}, Lor2/a1;->c(II)Li93/h;

    move-result-object v12

    const-string v7, "Slow"

    const-string v9, "Fast"

    const-string v11, "PACE OF AGING"

    invoke-direct/range {v5 .. v17}, Lc81/g;-><init>(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v8

    move-object v15, v10

    sput-object v5, Lc81/a;->f:Lc81/g;

    const/16 v5, 0x9

    invoke-virtual {v0, v5}, Lc81/a$a;->f(I)Ljava/util/List;

    move-result-object v6

    invoke-static {v3, v5}, Lor2/a1;->c(II)Li93/h;

    move-result-object v9

    const/16 v13, 0x3b8

    const/4 v14, 0x0

    move v5, v4

    const/4 v4, 0x0

    move v7, v5

    const/4 v5, 0x0

    move v8, v3

    move-object v3, v6

    const/4 v6, 0x0

    move v10, v7

    const/4 v7, 0x0

    move v11, v8

    const/4 v8, 0x0

    move v12, v10

    const/4 v10, 0x0

    move/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    invoke-static/range {v2 .. v14}, Lc81/g;->b(Lc81/g;Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;ILjava/lang/Object;)Lc81/g;

    move-result-object v2

    sput-object v2, Lc81/a;->g:Lc81/g;

    new-instance v20, Lc81/g;

    const/4 v2, -0x1

    invoke-static {v2, v2}, Lor2/a1;->c(II)Li93/h;

    move-result-object v27

    const/16 v31, 0x380

    const/16 v32, 0x0

    sget-object v21, Lm83/y;->w:Lm83/y;

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v20 .. v32}, Lc81/g;-><init>(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v20, Lc81/a;->h:Lc81/g;

    new-instance v5, Lc81/g;

    const/16 v2, 0x49

    invoke-virtual {v0, v2}, Lc81/a$a;->f(I)Ljava/util/List;

    move-result-object v6

    const/16 v3, 0x47

    invoke-static {v3, v2}, Lor2/a1;->c(II)Li93/h;

    move-result-object v12

    const/16 v16, 0x380

    const/16 v17, 0x0

    const-string v7, "Slow"

    const-string v9, "Fast"

    const-string v11, "PACE OF AGING"

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v10, v15

    const/4 v15, 0x0

    move-object v8, v1

    invoke-direct/range {v5 .. v17}, Lc81/g;-><init>(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lc81/a;->i:Lc81/g;

    new-instance v5, Lc81/g;

    invoke-virtual {v0, v2}, Lc81/a$a;->f(I)Ljava/util/List;

    move-result-object v6

    invoke-static {v2, v2}, Lor2/a1;->c(II)Li93/h;

    move-result-object v12

    const-string v7, "Slow"

    const-string v9, "Fast"

    const-string v11, "PACE OF AGING"

    invoke-direct/range {v5 .. v17}, Lc81/g;-><init>(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lc81/a;->j:Lc81/g;

    new-instance v0, Lc81/e;

    const-string v1, "HIGHLIGHT"

    const-string v2, "1"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4, v3, v1}, Lc81/e;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0x4e

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    move v4, v3

    :goto_0
    const/4 v5, 0x5

    if-ge v4, v2, :cond_2

    add-int/lit8 v6, v4, 0x2

    rem-int/lit8 v7, v6, 0x5

    if-nez v7, :cond_0

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    :goto_1
    add-int/lit8 v8, v4, 0x5

    rem-int/2addr v8, v5

    if-nez v8, :cond_1

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    :goto_2
    new-instance v6, Lc81/e;

    const-string v8, "NEUTRAL"

    invoke-direct {v6, v7, v5, v3, v8}, Lc81/e;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v0, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Lc81/e;

    const-string v2, "80"

    const-string v4, "CURRENT_VALUE"

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-direct {v1, v2, v7, v6, v4}, Lc81/e;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v7

    sput-object v7, Lc81/a;->k:Ljava/util/List;

    new-instance v6, Lc81/g;

    const/16 v0, 0x50

    invoke-static {v3, v0}, Lor2/a1;->c(II)Li93/h;

    move-result-object v13

    const/16 v17, 0x280

    const/16 v18, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v12, "PACE OF AGING"

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    invoke-direct/range {v6 .. v18}, Lc81/g;-><init>(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lc81/a;->l:Lc81/g;

    sget-object v7, Lc81/a;->b:Lc81/g;

    sget-object v0, Lc81/a;->a:Lc81/a$a;

    const/16 v1, 0x4f

    invoke-virtual {v0, v1}, Lc81/a$a;->f(I)Ljava/util/List;

    move-result-object v8

    const/16 v2, 0x37

    invoke-static {v2, v1}, Lor2/a1;->c(II)Li93/h;

    move-result-object v14

    const/16 v18, 0x3be

    const/16 v19, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v7 .. v19}, Lc81/g;->b(Lc81/g;Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;ILjava/lang/Object;)Lc81/g;

    move-result-object v1

    sput-object v1, Lc81/a;->m:Lc81/g;

    invoke-virtual {v0, v3}, Lc81/a$a;->f(I)Ljava/util/List;

    move-result-object v8

    invoke-static {v2, v3}, Lor2/a1;->c(II)Li93/h;

    move-result-object v14

    invoke-static/range {v7 .. v19}, Lc81/g;->b(Lc81/g;Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;ILjava/lang/Object;)Lc81/g;

    move-result-object v1

    sput-object v1, Lc81/a;->n:Lc81/g;

    const/16 v1, 0x4a

    invoke-virtual {v0, v1}, Lc81/a$a;->f(I)Ljava/util/List;

    move-result-object v8

    const/16 v4, 0x32

    invoke-static {v4, v1}, Lor2/a1;->c(II)Li93/h;

    move-result-object v14

    invoke-static/range {v7 .. v19}, Lc81/g;->b(Lc81/g;Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;ILjava/lang/Object;)Lc81/g;

    move-result-object v1

    sput-object v1, Lc81/a;->o:Lc81/g;

    invoke-virtual {v0, v5}, Lc81/a$a;->f(I)Ljava/util/List;

    move-result-object v8

    const/16 v0, 0x3c

    invoke-static {v0, v5}, Lor2/a1;->c(II)Li93/h;

    move-result-object v14

    invoke-static/range {v7 .. v19}, Lc81/g;->b(Lc81/g;Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;ILjava/lang/Object;)Lc81/g;

    move-result-object v0

    sput-object v0, Lc81/a;->p:Lc81/g;

    return-void
.end method

.method public static final synthetic a()Lc81/g;
    .locals 1

    sget-object v0, Lc81/a;->g:Lc81/g;

    return-object v0
.end method

.method public static final synthetic b()Lc81/g;
    .locals 1

    sget-object v0, Lc81/a;->l:Lc81/g;

    return-object v0
.end method

.method public static final synthetic c()Lc81/g;
    .locals 1

    sget-object v0, Lc81/a;->b:Lc81/g;

    return-object v0
.end method

.method public static final synthetic d()Lc81/g;
    .locals 1

    sget-object v0, Lc81/a;->c:Lc81/g;

    return-object v0
.end method

.method public static final synthetic e()Lc81/g;
    .locals 1

    sget-object v0, Lc81/a;->d:Lc81/g;

    return-object v0
.end method
