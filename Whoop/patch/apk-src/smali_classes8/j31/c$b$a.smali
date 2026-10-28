.class final Lj31/c$b$a;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj31/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/h;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lu2/b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lu2/b;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.molecule.reordable.DragGestureKt$awaitLongPressOrCancellation$2$1"
    f = "DragGesture.kt"
    l = {
        0x67,
        0x78
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic G:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lkotlin/jvm/internal/g0;",
            "Lq83/d<",
            "-",
            "Lj31/c$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj31/c$b$a;->F:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lj31/c$b$a;->G:Lkotlin/jvm/internal/g0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lj31/c$b$a;

    iget-object v1, p0, Lj31/c$b$a;->F:Lkotlin/jvm/internal/g0;

    iget-object v2, p0, Lj31/c$b$a;->G:Lkotlin/jvm/internal/g0;

    invoke-direct {v0, v1, v2, p2}, Lj31/c$b$a;-><init>(Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lq83/d;)V

    iput-object p1, v0, Lj31/c$b$a;->E:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lu2/b;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lj31/c$b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj31/c$b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj31/c$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lj31/c$b$a;->f(Lu2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lj31/c$b$a;->E:Ljava/lang/Object;

    check-cast v1, Lu2/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lj31/c$b$a;->z:I

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v7, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v7, :cond_1

    if-ne v3, v4, :cond_0

    iget v3, v0, Lj31/c$b$a;->y:I

    iget-object v8, v0, Lj31/c$b$a;->x:Ljava/lang/Object;

    check-cast v8, Lu2/k;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v5, p1

    goto/16 :goto_7

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v3, v0, Lj31/c$b$a;->y:I

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v8, p1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_12

    sget-object v8, Lu2/l;->x:Lu2/l;

    iput-object v1, v0, Lj31/c$b$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lj31/c$b$a;->x:Ljava/lang/Object;

    iput v3, v0, Lj31/c$b$a;->y:I

    iput v7, v0, Lj31/c$b$a;->z:I

    check-cast v1, Lu2/g0;

    invoke-virtual {v1, v8, v0}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v2, :cond_3

    goto :goto_6

    :cond_3
    :goto_1
    check-cast v8, Lu2/k;

    iget-object v9, v8, Lu2/k;->a:Ljava/lang/Object;

    move-object v10, v9

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_2
    if-ge v11, v10, :cond_5

    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lu2/r;

    invoke-static {v12}, Lu2/d0;->e(Lu2/r;)Z

    move-result v12

    if-nez v12, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_5
    move v3, v7

    :goto_3
    iget-object v9, v8, Lu2/k;->a:Ljava/lang/Object;

    move-object v10, v9

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_4
    if-ge v11, v10, :cond_8

    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lu2/r;

    invoke-virtual {v12}, Lu2/r;->l()Z

    move-result v13

    if-nez v13, :cond_7

    move-object v13, v1

    check-cast v13, Lu2/g0;

    iget-object v14, v13, Lu2/g0;->F:Lu2/h0;

    iget-wide v14, v14, Lu2/h0;->Y:J

    invoke-virtual {v13}, Lu2/g0;->b()J

    move-result-wide v5

    invoke-static {v12, v14, v15, v5, v6}, Lu2/d0;->h(Lu2/r;JJ)Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v11, v11, 0x1

    const/4 v5, 0x0

    goto :goto_4

    :cond_7
    :goto_5
    move v3, v7

    :cond_8
    sget-object v5, Lu2/l;->y:Lu2/l;

    iput-object v1, v0, Lj31/c$b$a;->E:Ljava/lang/Object;

    iput-object v8, v0, Lj31/c$b$a;->x:Ljava/lang/Object;

    iput v3, v0, Lj31/c$b$a;->y:I

    iput v4, v0, Lj31/c$b$a;->z:I

    check-cast v1, Lu2/g0;

    invoke-virtual {v1, v5, v0}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_9

    :goto_6
    return-object v2

    :cond_9
    :goto_7
    check-cast v5, Lu2/k;

    iget-object v5, v5, Lu2/k;->a:Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v9, 0x0

    :goto_8
    if-ge v9, v6, :cond_b

    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lu2/r;

    invoke-virtual {v10}, Lu2/r;->l()Z

    move-result v10

    if-eqz v10, :cond_a

    move v3, v7

    goto :goto_9

    :cond_a
    add-int/lit8 v9, v9, 0x1

    goto :goto_8

    :cond_b
    :goto_9
    iget-object v5, v0, Lj31/c$b$a;->F:Lkotlin/jvm/internal/g0;

    iget-object v5, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v5, Lu2/r;

    iget-wide v5, v5, Lu2/r;->a:J

    invoke-static {v8, v5, v6}, Lj31/c;->a(Lu2/k;J)Z

    move-result v5

    if-nez v5, :cond_e

    iget-object v5, v0, Lj31/c$b$a;->G:Lkotlin/jvm/internal/g0;

    iget-object v6, v8, Lu2/k;->a:Ljava/lang/Object;

    iget-object v8, v0, Lj31/c$b$a;->F:Lkotlin/jvm/internal/g0;

    move-object v9, v6

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_a
    if-ge v10, v9, :cond_d

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lu2/r;

    iget-wide v12, v12, Lu2/r;->a:J

    iget-object v14, v8, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v14, Lu2/r;

    iget-wide v14, v14, Lu2/r;->a:J

    invoke-static {v12, v13, v14, v15}, Lu2/q;->a(JJ)Z

    move-result v12

    if-eqz v12, :cond_c

    goto :goto_b

    :cond_c
    add-int/lit8 v10, v10, 0x1

    goto :goto_a

    :cond_d
    const/4 v11, 0x0

    :goto_b
    iput-object v11, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_e

    :cond_e
    iget-object v5, v8, Lu2/k;->a:Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v8, 0x0

    :goto_c
    if-ge v8, v6, :cond_10

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lu2/r;

    iget-boolean v10, v10, Lu2/r;->d:Z

    if-eqz v10, :cond_f

    goto :goto_d

    :cond_f
    add-int/lit8 v8, v8, 0x1

    goto :goto_c

    :cond_10
    const/4 v9, 0x0

    :goto_d
    check-cast v9, Lu2/r;

    if-eqz v9, :cond_11

    iget-object v5, v0, Lj31/c$b$a;->F:Lkotlin/jvm/internal/g0;

    iput-object v9, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v5, v0, Lj31/c$b$a;->G:Lkotlin/jvm/internal/g0;

    iput-object v9, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :goto_e
    const/4 v5, 0x0

    goto/16 :goto_0

    :cond_11
    move v3, v7

    goto :goto_e

    :cond_12
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
