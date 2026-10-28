.class public final Luu2/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Luu2/z;",
        "",
        "<init>",
        "()V",
        "Lvu2/c;",
        "domainState",
        "Luu2/y;",
        "a",
        "(Lvu2/c;)Luu2/y;",
        "weightlifting_release"
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


# virtual methods
.method public final a(Lvu2/c;)Luu2/y;
    .locals 14

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lvu2/c;->f()Lvu2/b;

    move-result-object v0

    sget-object v1, Lvu2/b$b;->a:Lvu2/b$b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v2, Luu2/y;

    sget-object p1, Luu2/j0;->i:Luu2/j0$a;

    invoke-virtual {p1}, Luu2/j0$a;->c()Luu2/j0;

    move-result-object v3

    const/16 v8, 0x1c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Luu2/y;-><init>(Luu2/j0;Luu2/o;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_0
    sget-object v1, Lvu2/b$a;->a:Lvu2/b$a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v2, Luu2/y;

    sget-object p1, Luu2/j0;->i:Luu2/j0$a;

    invoke-virtual {p1}, Luu2/j0$a;->e()Luu2/j0;

    move-result-object v3

    sget-object v7, Luu2/c$c;->a:Luu2/c$c;

    const/16 v12, 0xf7

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v3 .. v13}, Luu2/j0;->g(Luu2/j0;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Luu2/c;Lcom/whoop/design/util/TextResource;Luu2/c;Luu2/c;ZILjava/lang/Object;)Luu2/j0;

    move-result-object v3

    const/16 v8, 0x1c

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Luu2/y;-><init>(Luu2/j0;Luu2/o;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_1
    sget-object v1, Lvu2/b$c;->a:Lvu2/b$c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v2, Luu2/y;

    sget-object p1, Luu2/j0;->i:Luu2/j0$a;

    invoke-virtual {p1}, Luu2/j0$a;->d()Luu2/j0;

    move-result-object v3

    sget-object v7, Luu2/c$c;->a:Luu2/c$c;

    const/16 v12, 0xf7

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v3 .. v13}, Luu2/j0;->g(Luu2/j0;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Luu2/c;Lcom/whoop/design/util/TextResource;Luu2/c;Luu2/c;ZILjava/lang/Object;)Luu2/j0;

    move-result-object v3

    const/16 v8, 0x1c

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Luu2/y;-><init>(Luu2/j0;Luu2/o;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_2
    if-nez v0, :cond_5

    invoke-virtual {p1}, Lvu2/c;->e()Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lvu2/c;->c()Luu2/m;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v0, v1}, Luu2/r;->f(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Luu2/m;)Luu2/o;

    move-result-object v4

    invoke-virtual {p1}, Lvu2/c;->d()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {p1}, Lvu2/c;->d()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {p1}, Lvu2/c;->g()Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    new-instance v2, Luu2/y;

    const/4 v3, 0x0

    invoke-direct/range {v2 .. v7}, Luu2/y;-><init>(Luu2/j0;Luu2/o;ZZZ)V

    return-object v2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "analyticsContext required when exercise details are loaded"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance v1, Luu2/y;

    sget-object p1, Luu2/j0;->i:Luu2/j0$a;

    invoke-virtual {p1}, Luu2/j0$a;->e()Luu2/j0;

    move-result-object v2

    sget-object v6, Luu2/c$c;->a:Luu2/c$c;

    const/16 v11, 0xf7

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v12}, Luu2/j0;->g(Luu2/j0;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Luu2/c;Lcom/whoop/design/util/TextResource;Luu2/c;Luu2/c;ZILjava/lang/Object;)Luu2/j0;

    move-result-object v2

    const/16 v7, 0x1c

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Luu2/y;-><init>(Luu2/j0;Luu2/o;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
