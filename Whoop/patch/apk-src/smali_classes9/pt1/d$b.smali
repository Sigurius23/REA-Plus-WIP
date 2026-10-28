.class public final Lpt1/d$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpt1/d;->l(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.labrador.feature.reading.domain.LabradorReadingInteractor$interact$$inlined$flatMapLatest$1"
    f = "LabradorReadingInteractor.kt"
    l = {
        0xc0,
        0xce,
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lpt1/d;


# direct methods
.method public constructor <init>(Lq83/d;Lpt1/d;)V
    .locals 0

    iput-object p2, p0, Lpt1/d$b;->z:Lpt1/d;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lpt1/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lpt1/d$b;

    iget-object v1, p0, Lpt1/d$b;->z:Lpt1/d;

    invoke-direct {v0, p3, v1}, Lpt1/d$b;-><init>(Lq83/d;Lpt1/d;)V

    iput-object p1, v0, Lpt1/d$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lpt1/d$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lpt1/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lpt1/d$b;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lpt1/d$b;->w:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lpt1/d$b;->x:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v2, v0, Lpt1/d$b;->G:Ljava/lang/Object;

    check-cast v2, Lpt1/a;

    iget-object v2, v0, Lpt1/d$b;->F:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Lpt1/d$b;->E:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lpt1/d$b;->x:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto/16 :goto_1

    :cond_2
    iget-object v2, v0, Lpt1/d$b;->G:Ljava/lang/Object;

    check-cast v2, Lpt1/a;

    iget-object v4, v0, Lpt1/d$b;->F:Ljava/lang/Object;

    check-cast v4, Lq83/d;

    iget-object v4, v0, Lpt1/d$b;->E:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    iget-object v7, v0, Lpt1/d$b;->x:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v4

    move-object/from16 v4, p1

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lpt1/d$b;->x:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v7, v0, Lpt1/d$b;->y:Ljava/lang/Object;

    check-cast v7, Lpt1/a;

    instance-of v8, v7, Lpt1/a$b;

    const/4 v9, 0x0

    if-eqz v8, :cond_5

    iget-object v4, v0, Lpt1/d$b;->z:Lpt1/d;

    move-object v8, v7

    check-cast v8, Lpt1/a$b;

    invoke-virtual {v8}, Lpt1/a$b;->b()Lht1/e;

    move-result-object v8

    iput-object v6, v0, Lpt1/d$b;->x:Ljava/lang/Object;

    iput-object v6, v0, Lpt1/d$b;->y:Ljava/lang/Object;

    iput-object v2, v0, Lpt1/d$b;->E:Ljava/lang/Object;

    iput-object v6, v0, Lpt1/d$b;->F:Ljava/lang/Object;

    iput-object v7, v0, Lpt1/d$b;->G:Ljava/lang/Object;

    iput v9, v0, Lpt1/d$b;->H:I

    iput v5, v0, Lpt1/d$b;->w:I

    invoke-static {v4, v8, v0}, Lpt1/d;->e(Lpt1/d;Lht1/e;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_4

    goto/16 :goto_3

    :cond_4
    move-object/from16 v16, v7

    move-object v7, v2

    move-object/from16 v2, v16

    :goto_0
    check-cast v4, Lpt1/b;

    iget-object v8, v0, Lpt1/d$b;->z:Lpt1/d;

    invoke-static {v8}, Lpt1/d;->d(Lpt1/d;)Lfu1/b;

    move-result-object v8

    invoke-interface {v8}, Lfu1/b;->c()Lec3/l;

    move-result-object v8

    new-instance v9, Lpt1/d$c;

    iget-object v10, v0, Lpt1/d$b;->z:Lpt1/d;

    invoke-direct {v9, v10, v2, v6}, Lpt1/d$c;-><init>(Lpt1/d;Lpt1/a;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v4, v8, v9}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance v4, Lpt1/d$e;

    iget-object v8, v0, Lpt1/d$b;->z:Lpt1/d;

    invoke-direct {v4, v2, v8}, Lpt1/d$e;-><init>(Lec3/l;Lpt1/d;)V

    sget v2, Lec3/w0;->a:I

    new-instance v2, Lch/o;

    invoke-direct {v2, v4, v5}, Lch/o;-><init>(Lec3/l;I)V

    invoke-static {v2}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object v2

    goto :goto_2

    :cond_5
    instance-of v7, v7, Lpt1/a$a;

    if-eqz v7, :cond_8

    iget-object v7, v0, Lpt1/d$b;->z:Lpt1/d;

    invoke-static {v7}, Lpt1/d;->c(Lpt1/d;)Lts1/c;

    move-result-object v7

    invoke-interface {v7}, Lts1/c;->d()V

    iget-object v7, v0, Lpt1/d$b;->z:Lpt1/d;

    new-instance v10, Lpt1/b;

    sget-object v11, Lpt1/c$a;->a:Lpt1/c$a;

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lpt1/b;-><init>(Lpt1/c;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, v0, Lpt1/d$b;->x:Ljava/lang/Object;

    iput-object v6, v0, Lpt1/d$b;->y:Ljava/lang/Object;

    iput-object v2, v0, Lpt1/d$b;->E:Ljava/lang/Object;

    iput-object v6, v0, Lpt1/d$b;->F:Ljava/lang/Object;

    iput-object v6, v0, Lpt1/d$b;->G:Ljava/lang/Object;

    iput v9, v0, Lpt1/d$b;->H:I

    iput v4, v0, Lpt1/d$b;->w:I

    invoke-static {v7, v10, v0}, Lpt1/d;->h(Lpt1/d;Lpt1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    new-instance v7, La6/u;

    invoke-direct {v7, v4, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    move-object/from16 v16, v7

    move-object v7, v2

    move-object/from16 v2, v16

    :goto_2
    iput-object v6, v0, Lpt1/d$b;->x:Ljava/lang/Object;

    iput-object v6, v0, Lpt1/d$b;->y:Ljava/lang/Object;

    iput-object v6, v0, Lpt1/d$b;->E:Ljava/lang/Object;

    iput-object v6, v0, Lpt1/d$b;->F:Ljava/lang/Object;

    iput-object v6, v0, Lpt1/d$b;->G:Ljava/lang/Object;

    iput v3, v0, Lpt1/d$b;->w:I

    invoke-static {v7, v2, v0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
