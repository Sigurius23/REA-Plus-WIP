.class public final Lsl1/d$g$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl1/d$g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010\u0000\"\u0006\u0008\u0001\u0010\u0001\u0018\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Lkotlin/Array;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.connectivity.strap.StrapDomainInteractor$special$$inlined$combine$1$3"
    f = "StrapDomainInteractor.kt"
    l = {
        0xea
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;[Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "[",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lsl1/d$g$b;

    invoke-direct {v0, p3}, Lsl1/d$g$b;-><init>(Lq83/d;)V

    iput-object p1, v0, Lsl1/d$g$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lsl1/d$g$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lsl1/d$g$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lsl1/d$g$b;->invoke(Lec3/m;[Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lsl1/d$g$b;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lsl1/d$g$b;->y:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    iget-object v1, v0, Lsl1/d$g$b;->x:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lsl1/d$g$b;->x:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lsl1/d$g$b;->y:Ljava/lang/Object;

    check-cast v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aget-object v6, v4, v5

    aget-object v7, v4, v3

    const/4 v8, 0x2

    aget-object v8, v4, v8

    const/4 v9, 0x3

    aget-object v9, v4, v9

    const/4 v10, 0x4

    aget-object v10, v4, v10

    const/4 v11, 0x5

    aget-object v11, v4, v11

    const/4 v12, 0x6

    aget-object v12, v4, v12

    const/4 v13, 0x7

    aget-object v4, v4, v13

    check-cast v4, Ljk0/a;

    move-object/from16 v20, v12

    check-cast v20, Lca2/a;

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v18

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->byteValue()B

    move-result v17

    check-cast v9, Ltd1/e;

    check-cast v8, Li92/h;

    check-cast v7, Llm0/c;

    move-object/from16 v19, v6

    check-cast v19, Ltd1/f;

    sget-object v6, Llm0/c;->OFF:Llm0/c;

    if-ne v7, v6, :cond_2

    move v14, v3

    goto :goto_0

    :cond_2
    move v14, v5

    :goto_0
    sget-object v6, Li92/h$b;->a:Li92/h$b;

    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    new-instance v13, Lsl1/a;

    invoke-virtual {v9}, Ltd1/e;->isReady()Z

    move-result v16

    sget-object v6, Ljk0/a;->STRAP_OFF_BODY:Ljk0/a;

    if-ne v4, v6, :cond_3

    move/from16 v21, v3

    goto :goto_1

    :cond_3
    move/from16 v21, v5

    :goto_1
    const/16 v23, 0x100

    const/16 v24, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v13 .. v24}, Lsl1/a;-><init>(ZZZIZLtd1/f;Lca2/a;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x0

    iput-object v4, v0, Lsl1/d$g$b;->x:Ljava/lang/Object;

    iput-object v4, v0, Lsl1/d$g$b;->y:Ljava/lang/Object;

    iput v3, v0, Lsl1/d$g$b;->w:I

    invoke-interface {v2, v13, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
