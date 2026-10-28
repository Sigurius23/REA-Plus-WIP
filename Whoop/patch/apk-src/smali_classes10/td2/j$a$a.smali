.class public final Ltd2/j$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltd2/j$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lec3/m;

.field final synthetic x:Ltd2/j;


# direct methods
.method public constructor <init>(Lec3/m;Ltd2/j;)V
    .locals 0

    iput-object p1, p0, Ltd2/j$a$a;->w:Lec3/m;

    iput-object p2, p0, Ltd2/j$a$a;->x:Ltd2/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Ltd2/j$a$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ltd2/j$a$a$a;

    iget v3, v2, Ltd2/j$a$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Ltd2/j$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Ltd2/j$a$a$a;

    invoke-direct {v2, v0, v1}, Ltd2/j$a$a$a;-><init>(Ltd2/j$a$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Ltd2/j$a$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Ltd2/j$a$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Ltd2/j$a$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Ltd2/j$a$a$a;->E:Ljava/lang/Object;

    check-cast v2, Ltd2/j$a$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Ltd2/j$a$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lrd2/b;

    invoke-virtual {v4}, Lrd2/b;->c()Lrd2/e;

    move-result-object v6

    sget-object v7, Lrd2/e$e;->a:Lrd2/e$e;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    sget-object v4, Ltd2/i$a;->h:Ltd2/i$a$a;

    invoke-virtual {v4}, Ltd2/i$a$a;->d()Ltd2/i$a;

    move-result-object v4

    goto/16 :goto_1

    :cond_3
    instance-of v7, v6, Lrd2/e$c;

    if-eqz v7, :cond_4

    sget-object v4, Ltd2/i$a;->h:Ltd2/i$a$a;

    invoke-virtual {v4}, Ltd2/i$a$a;->c()Ltd2/i$a;

    move-result-object v4

    goto/16 :goto_1

    :cond_4
    sget-object v7, Lrd2/e$d;->a:Lrd2/e$d;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v6, v0, Ltd2/j$a$a;->x:Ltd2/j;

    invoke-static {v6, v4}, Ltd2/j;->a(Ltd2/j;Lrd2/b;)Ltd2/i;

    move-result-object v4

    goto :goto_1

    :cond_5
    sget-object v7, Lrd2/e$a;->a:Lrd2/e$a;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    iget-object v6, v0, Ltd2/j$a$a;->x:Ltd2/j;

    invoke-static {v6, v4}, Ltd2/j;->a(Ltd2/j;Lrd2/b;)Ltd2/i;

    move-result-object v4

    goto :goto_1

    :cond_6
    instance-of v7, v6, Lrd2/e$f;

    if-eqz v7, :cond_7

    sget-object v6, Ltd2/i$a;->h:Ltd2/i$a$a;

    invoke-virtual {v6}, Ltd2/i$a$a;->a()Ltd2/i$a;

    move-result-object v7

    new-instance v14, Ltd2/f$a;

    invoke-virtual {v4}, Lrd2/b;->c()Lrd2/e;

    move-result-object v4

    check-cast v4, Lrd2/e$f;

    invoke-virtual {v4}, Lrd2/e$f;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v14, v4}, Ltd2/f$a;-><init>(Ljava/lang/String;)V

    const/16 v15, 0x3f

    const/16 v16, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v7 .. v16}, Ltd2/i$a;->g(Ltd2/i$a;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ltd2/f;Lcom/whoop/design/util/TextResource;Ltd2/f;Ltd2/f;ILjava/lang/Object;)Ltd2/i$a;

    move-result-object v4

    goto :goto_1

    :cond_7
    sget-object v7, Lrd2/e$g;->a:Lrd2/e$g;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    sget-object v4, Ltd2/i$a;->h:Ltd2/i$a$a;

    invoke-virtual {v4}, Ltd2/i$a$a;->e()Ltd2/i$a;

    move-result-object v4

    goto :goto_1

    :cond_8
    instance-of v6, v6, Lrd2/e$b;

    if-eqz v6, :cond_a

    sget-object v6, Ltd2/i$a;->h:Ltd2/i$a$a;

    invoke-virtual {v6}, Ltd2/i$a$a;->b()Ltd2/i$a;

    move-result-object v7

    new-instance v11, Ltd2/f$g;

    invoke-virtual {v4}, Lrd2/b;->c()Lrd2/e;

    move-result-object v4

    check-cast v4, Lrd2/e$b;

    invoke-virtual {v4}, Lrd2/e$b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v11, v4}, Ltd2/f$g;-><init>(Ljava/lang/String;)V

    sget-object v13, Ltd2/f$b;->a:Ltd2/f$b;

    const/16 v15, 0x57

    const/16 v16, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v16}, Ltd2/i$a;->g(Ltd2/i$a;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ltd2/f;Lcom/whoop/design/util/TextResource;Ltd2/f;Ltd2/f;ILjava/lang/Object;)Ltd2/i$a;

    move-result-object v4

    :goto_1
    const/4 v6, 0x0

    iput-object v6, v2, Ltd2/j$a$a$a;->y:Ljava/lang/Object;

    iput-object v6, v2, Ltd2/j$a$a$a;->E:Ljava/lang/Object;

    iput-object v6, v2, Ltd2/j$a$a$a;->F:Ljava/lang/Object;

    iput-object v6, v2, Ltd2/j$a$a$a;->G:Ljava/lang/Object;

    const/4 v6, 0x0

    iput v6, v2, Ltd2/j$a$a$a;->H:I

    iput v5, v2, Ltd2/j$a$a$a;->x:I

    invoke-interface {v1, v4, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    return-object v3

    :cond_9
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
