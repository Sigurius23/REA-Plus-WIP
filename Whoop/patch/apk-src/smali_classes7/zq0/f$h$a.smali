.class final Lzq0/f$h$a;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzq0/f$h;->invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.communityeverydaystats.view.CommunitySnapshotContainerKt$pullDownToDismiss$1$1"
    f = "CommunitySnapshotContainer.kt"
    l = {
        0x1f8,
        0x1fd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lzq0/p;

.field final synthetic G:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic H:F

.field final synthetic I:F

.field final synthetic J:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic K:Lcom/whoop/navigation/models/GenericInteraction;

.field final synthetic L:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lzq0/p;Lc93/a;FFLkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Lc93/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzq0/p;",
            "Lc93/a;",
            "FF",
            "Lkotlin/jvm/functions/Function1;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "Lzq0/f$h$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzq0/f$h$a;->F:Lzq0/p;

    iput-object p2, p0, Lzq0/f$h$a;->G:Lc93/a;

    iput p3, p0, Lzq0/f$h$a;->H:F

    iput p4, p0, Lzq0/f$h$a;->I:F

    iput-object p5, p0, Lzq0/f$h$a;->J:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lzq0/f$h$a;->K:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p7, p0, Lzq0/f$h$a;->L:Lc93/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
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

    new-instance v0, Lzq0/f$h$a;

    iget-object v1, p0, Lzq0/f$h$a;->F:Lzq0/p;

    iget-object v2, p0, Lzq0/f$h$a;->G:Lc93/a;

    iget v3, p0, Lzq0/f$h$a;->H:F

    iget v4, p0, Lzq0/f$h$a;->I:F

    iget-object v5, p0, Lzq0/f$h$a;->J:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lzq0/f$h$a;->K:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v7, p0, Lzq0/f$h$a;->L:Lc93/a;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lzq0/f$h$a;-><init>(Lzq0/p;Lc93/a;FFLkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Lc93/a;Lq83/d;)V

    iput-object p1, v0, Lzq0/f$h$a;->E:Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lzq0/f$h$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lzq0/f$h$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lzq0/f$h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lzq0/f$h$a;->f(Lu2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lzq0/f$h$a;->E:Ljava/lang/Object;

    check-cast v1, Lu2/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lzq0/f$h$a;->z:I

    const-wide/16 v4, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v7, :cond_1

    if-ne v3, v6, :cond_0

    iget-object v3, v0, Lzq0/f$h$a;->y:Ljava/lang/Object;

    check-cast v3, Lv2/c;

    iget-object v7, v0, Lzq0/f$h$a;->x:Ljava/lang/Object;

    check-cast v7, Lu2/r;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    goto :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v1, v0, Lzq0/f$h$a;->E:Ljava/lang/Object;

    iput v7, v0, Lzq0/f$h$a;->z:I

    invoke-static {v1, v0, v6}, Lh0/o3;->c(Lu2/b;Lq83/d;I)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast v3, Lu2/r;

    new-instance v7, Lv2/c;

    invoke-direct {v7}, Lv2/c;-><init>()V

    invoke-static {v7, v3, v4, v5}, Lsb3/a;->a(Lv2/c;Lu2/r;J)V

    iget-object v3, v0, Lzq0/f$h$a;->F:Lzq0/p;

    iget-object v8, v0, Lzq0/f$h$a;->G:Lc93/a;

    invoke-interface {v8}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-virtual {v3, v8}, Lzq0/p;->k(Z)V

    move-object v3, v7

    :cond_4
    sget-object v7, Lu2/l;->y:Lu2/l;

    iput-object v1, v0, Lzq0/f$h$a;->E:Ljava/lang/Object;

    const/4 v8, 0x0

    iput-object v8, v0, Lzq0/f$h$a;->x:Ljava/lang/Object;

    iput-object v3, v0, Lzq0/f$h$a;->y:Ljava/lang/Object;

    iput v6, v0, Lzq0/f$h$a;->z:I

    check-cast v1, Lu2/g0;

    invoke-virtual {v1, v7, v0}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_5

    :goto_1
    return-object v2

    :cond_5
    :goto_2
    check-cast v7, Lu2/k;

    iget-object v8, v7, Lu2/k;->a:Ljava/lang/Object;

    invoke-static {v8}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lu2/r;

    if-nez v8, :cond_6

    goto/16 :goto_5

    :cond_6
    invoke-static {v3, v8, v4, v5}, Lsb3/a;->a(Lv2/c;Lu2/r;J)V

    iget-wide v9, v8, Lu2/r;->c:J

    iget-wide v11, v8, Lu2/r;->g:J

    invoke-static {v9, v10, v11, v12}, Lh2/b;->g(JJ)J

    move-result-wide v8

    iget-object v10, v0, Lzq0/f$h$a;->F:Lzq0/p;

    const/16 v11, 0x20

    shr-long v11, v8, v11

    long-to-int v11, v11

    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    const-wide v12, 0xffffffffL

    and-long/2addr v8, v12

    long-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    iget-object v8, v0, Lzq0/f$h$a;->G:Lc93/a;

    invoke-interface {v8}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    const/16 v15, 0x8

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-static/range {v10 .. v16}, Lzq0/p;->m(Lzq0/p;FFZZILjava/lang/Object;)V

    iget-object v7, v7, Lu2/k;->a:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    instance-of v8, v7, Ljava/util/Collection;

    if-eqz v8, :cond_7

    move-object v8, v7

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_4

    :cond_7
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_8
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lu2/r;

    invoke-static {v8}, Lu2/d0;->e(Lu2/r;)Z

    move-result v9

    if-nez v9, :cond_8

    iget-boolean v8, v8, Lu2/r;->d:Z

    if-nez v8, :cond_4

    goto :goto_3

    :cond_9
    :goto_4
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    invoke-static {v1, v1}, Ls4/i;->a(FF)J

    move-result-wide v1

    invoke-virtual {v3, v1, v2}, Lv2/c;->a(J)J

    move-result-wide v1

    iget-object v3, v0, Lzq0/f$h$a;->F:Lzq0/p;

    invoke-static {v1, v2}, Ly3/q;->d(J)F

    move-result v4

    invoke-static {v1, v2}, Ly3/q;->e(J)F

    move-result v5

    iget-object v1, v0, Lzq0/f$h$a;->G:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iget v7, v0, Lzq0/f$h$a;->H:F

    iget v8, v0, Lzq0/f$h$a;->I:F

    invoke-virtual/range {v3 .. v8}, Lzq0/p;->e(FFZFF)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, v0, Lzq0/f$h$a;->J:Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Lzq0/f$h$a;->K:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_a
    iget-object v1, v0, Lzq0/f$h$a;->F:Lzq0/p;

    invoke-virtual {v1}, Lzq0/p;->t()Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, v0, Lzq0/f$h$a;->L:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_b
    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
