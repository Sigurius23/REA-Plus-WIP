.class public final Lzl0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lzl0/g;",
        "",
        "Lr31/f;",
        "initialViewState",
        "<init>",
        "(Lr31/f;)V",
        "Lzl0/c;",
        "domainState",
        "Lzl0/k;",
        "a",
        "(Lzl0/c;)Lzl0/k;",
        "Lr31/f;",
        "bot_release"
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
.field public static final b:I


# instance fields
.field private final a:Lr31/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lr31/f;->h:I

    sput v0, Lzl0/g;->b:I

    return-void
.end method

.method public constructor <init>(Lr31/f;)V
    .locals 1

    const-string v0, "initialViewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzl0/g;->a:Lr31/f;

    return-void
.end method


# virtual methods
.method public final a(Lzl0/c;)Lzl0/k;
    .locals 28

    move-object/from16 v0, p0

    const-string v1, "domainState"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lzl0/c;->d()Lzl0/a;

    move-result-object v1

    instance-of v3, v1, Lzl0/a$c;

    if-eqz v3, :cond_0

    sget-object v1, Lb81/e;->DISABLED:Lb81/e;

    :goto_0
    move-object v6, v1

    goto :goto_2

    :cond_0
    instance-of v3, v1, Lzl0/a$d;

    if-eqz v3, :cond_1

    sget-object v1, Lb81/e;->SUCCESS:Lb81/e;

    goto :goto_0

    :cond_1
    instance-of v3, v1, Lzl0/a$a;

    if-nez v3, :cond_3

    instance-of v1, v1, Lzl0/a$b;

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_3
    :goto_1
    sget-object v1, Lb81/e;->ENABLED:Lb81/e;

    goto :goto_0

    :goto_2
    iget-object v1, v0, Lzl0/g;->a:Lr31/f;

    invoke-virtual {v1}, Lr31/f;->f()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v1, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v11, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm91/u;

    instance-of v4, v3, Lb81/f;

    if-eqz v4, :cond_6

    check-cast v3, Lb81/f;

    invoke-virtual {v3}, Lb81/f;->c()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v4, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm91/u;

    instance-of v8, v7, Lb81/j;

    if-eqz v8, :cond_4

    move-object v12, v7

    check-cast v12, Lb81/j;

    invoke-virtual {v2}, Lzl0/c;->g()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v12}, Lb81/j;->g()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v15

    const/16 v19, 0x1b

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    invoke-static/range {v12 .. v20}, Lb81/j;->b(Lb81/j;ILjava/lang/String;ZZDILjava/lang/Object;)Lb81/j;

    move-result-object v7

    :cond_4
    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v4, 0x0

    invoke-static/range {v3 .. v8}, Lb81/f;->b(Lb81/f;Ljava/lang/String;Ljava/util/List;Lb81/e;ILjava/lang/Object;)Lb81/f;

    move-result-object v3

    :cond_6
    invoke-interface {v11, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    iget-object v1, v0, Lzl0/g;->a:Lr31/f;

    invoke-virtual {v1}, Lr31/f;->e()Lm91/u;

    move-result-object v1

    instance-of v3, v1, Ll11/e;

    if-eqz v3, :cond_8

    check-cast v1, Ll11/e;

    :goto_5
    move-object v12, v1

    goto :goto_6

    :cond_8
    const/4 v1, 0x0

    goto :goto_5

    :goto_6
    if-eqz v12, :cond_f

    invoke-virtual {v2}, Lzl0/c;->d()Lzl0/a;

    move-result-object v1

    instance-of v3, v1, Lzl0/a$c;

    if-eqz v3, :cond_a

    invoke-virtual {v12}, Ll11/e;->j()Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v20, Ll11/d$d;->a:Ll11/d$d;

    const/16 v25, 0xf7f

    const/16 v26, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v12 .. v26}, Ll11/e;->b(Ll11/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;ILjava/lang/Object;)Ll11/e;

    move-result-object v12

    :cond_9
    :goto_7
    move-object v13, v12

    goto :goto_8

    :cond_a
    instance-of v3, v1, Lzl0/a$d;

    if-eqz v3, :cond_b

    sget-object v20, Ll11/d$g;->a:Ll11/d$g;

    const/16 v25, 0xf7f

    const/16 v26, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v12 .. v26}, Ll11/e;->b(Ll11/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;ILjava/lang/Object;)Ll11/e;

    move-result-object v12

    goto :goto_7

    :cond_b
    instance-of v3, v1, Lzl0/a$a;

    if-eqz v3, :cond_c

    sget-object v20, Ll11/d$f;->a:Ll11/d$f;

    const/16 v25, 0xf7f

    const/16 v26, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v12 .. v26}, Ll11/e;->b(Ll11/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;ILjava/lang/Object;)Ll11/e;

    move-result-object v12

    goto :goto_7

    :cond_c
    instance-of v1, v1, Lzl0/a$b;

    if-eqz v1, :cond_e

    goto :goto_7

    :goto_8
    invoke-virtual {v13}, Ll11/e;->i()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v2}, Lzl0/c;->g()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_d

    invoke-virtual {v13}, Ll11/e;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lzl0/c;->g()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    const/16 v26, 0xffd

    const/16 v27, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v13 .. v27}, Ll11/e;->b(Ll11/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;ILjava/lang/Object;)Ll11/e;

    move-result-object v13

    :cond_d
    if-eqz v13, :cond_f

    :goto_9
    move-object v12, v13

    goto :goto_a

    :cond_e
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_f
    iget-object v1, v0, Lzl0/g;->a:Lr31/f;

    invoke-virtual {v1}, Lr31/f;->e()Lm91/u;

    move-result-object v13

    goto :goto_9

    :goto_a
    new-instance v1, Lzl0/k;

    iget-object v7, v0, Lzl0/g;->a:Lr31/f;

    invoke-virtual {v2}, Lzl0/c;->g()Ljava/util/List;

    move-result-object v13

    const/16 v15, 0x47

    const/16 v16, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v16}, Lr31/f;->b(Lr31/f;Ljava/lang/String;Ljava/lang/String;Lr31/e;Ljava/util/List;Lm91/u;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lr31/f;

    move-result-object v3

    invoke-virtual {v2}, Lzl0/c;->f()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v3, v2}, Lzl0/k;-><init>(Lr31/f;Ljava/lang/String;)V

    return-object v1
.end method
