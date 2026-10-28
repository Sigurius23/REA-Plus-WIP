.class final Lds0/h$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lds0/h;->q(Lds0/d$a;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lds0/e;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.communityreactions.domain.ReactionsInteractor$load$1"
    f = "ReactionsInteractor.kt"
    l = {
        0xb2,
        0xb6,
        0xba,
        0xbb,
        0xbb
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lds0/d$a;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lds0/h;


# direct methods
.method public constructor <init>(Lds0/h;Lds0/d$a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lds0/h;",
            "Lds0/d$a;",
            "Lq83/d<",
            "-",
            "Lds0/h$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lds0/h$c;->z:Lds0/h;

    iput-object p2, p0, Lds0/h$c;->E:Lds0/d$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lds0/h$c;

    iget-object v1, p0, Lds0/h$c;->z:Lds0/h;

    iget-object v2, p0, Lds0/h$c;->E:Lds0/d$a;

    invoke-direct {v0, v1, v2, p2}, Lds0/h$c;-><init>(Lds0/h;Lds0/d$a;Lq83/d;)V

    iput-object p1, v0, Lds0/h$c;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lds0/h$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lds0/h$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lds0/h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lds0/h$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lds0/h$c;->y:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lds0/h$c;->x:I

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x5

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v3, :cond_5

    if-eq v3, v9, :cond_4

    if-eq v3, v8, :cond_3

    if-eq v3, v7, :cond_2

    if-eq v3, v6, :cond_1

    if-ne v3, v5, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v1, v0, Lds0/h$c;->w:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto/16 :goto_3

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v3, Lds0/e$d;->a:Lds0/e$d;

    iput-object v1, v0, Lds0/h$c;->y:Ljava/lang/Object;

    iput v9, v0, Lds0/h$c;->x:I

    invoke-interface {v1, v3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_6

    goto :goto_4

    :cond_6
    :goto_0
    iget-object v3, v0, Lds0/h$c;->z:Lds0/h;

    invoke-static {v3}, Lds0/h;->c(Lds0/h;)Lds0/g;

    move-result-object v3

    invoke-virtual {v3}, Lds0/g;->d()Z

    move-result v3

    if-nez v3, :cond_8

    iget-object v3, v0, Lds0/h$c;->z:Lds0/h;

    invoke-static {v3}, Lds0/h;->d(Lds0/h;)Ltr2/n;

    move-result-object v3

    const/4 v5, 0x0

    new-array v5, v5, [Lqr2/a$a;

    const-string v6, "Blank path, skipping the fetch"

    invoke-interface {v3, v6, v5}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v3, Lds0/e$b;->a:Lds0/e$b;

    iput-object v10, v0, Lds0/h$c;->y:Ljava/lang/Object;

    iput v8, v0, Lds0/h$c;->x:I

    invoke-interface {v1, v3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_7

    goto :goto_4

    :cond_7
    :goto_1
    return-object v4

    :cond_8
    sget-object v3, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    iget-object v3, v0, Lds0/h$c;->E:Lds0/d$a;

    invoke-virtual {v3}, Lds0/d$a;->a()J

    move-result-wide v11

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x2710

    invoke-static/range {v11 .. v16}, Le93/b;->p(JJJ)J

    move-result-wide v8

    sget-object v3, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v8, v9, v3}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v8

    iput-object v1, v0, Lds0/h$c;->y:Ljava/lang/Object;

    iput v7, v0, Lds0/h$c;->x:I

    invoke-static {v8, v9, v0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_9

    goto :goto_4

    :cond_9
    :goto_2
    iget-object v3, v0, Lds0/h$c;->z:Lds0/h;

    invoke-static {v3}, Lds0/h;->c(Lds0/h;)Lds0/g;

    move-result-object v3

    iput-object v10, v0, Lds0/h$c;->y:Ljava/lang/Object;

    iput-object v1, v0, Lds0/h$c;->w:Ljava/lang/Object;

    iput v6, v0, Lds0/h$c;->x:I

    invoke-virtual {v3, v0}, Lds0/g;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_a

    goto :goto_4

    :cond_a
    :goto_3
    iput-object v10, v0, Lds0/h$c;->y:Ljava/lang/Object;

    iput-object v10, v0, Lds0/h$c;->w:Ljava/lang/Object;

    iput v5, v0, Lds0/h$c;->x:I

    invoke-interface {v1, v3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_b

    :goto_4
    return-object v2

    :cond_b
    :goto_5
    return-object v4
.end method
