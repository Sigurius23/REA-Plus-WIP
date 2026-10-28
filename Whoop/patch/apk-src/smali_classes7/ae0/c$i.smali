.class final Lae0/c$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lae0/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;
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
        "Lae0/b;",
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
    c = "com.whoop.advancedlabs.schedulingform.domain.SchedulingFormInteractor$saveAppointment$1"
    f = "SchedulingFormInteractor.kt"
    l = {
        0x68,
        0x6a,
        0x74,
        0x75
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Ljava/lang/String;

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lae0/c;


# direct methods
.method public constructor <init>(Lae0/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lae0/c;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lae0/c$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lae0/c$i;->z:Lae0/c;

    iput-object p2, p0, Lae0/c$i;->E:Ljava/lang/String;

    iput-object p3, p0, Lae0/c$i;->F:Ljava/lang/String;

    iput-object p4, p0, Lae0/c$i;->G:Ljava/lang/String;

    iput-object p5, p0, Lae0/c$i;->H:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lae0/c$i;

    iget-object v1, p0, Lae0/c$i;->z:Lae0/c;

    iget-object v2, p0, Lae0/c$i;->E:Ljava/lang/String;

    iget-object v3, p0, Lae0/c$i;->F:Ljava/lang/String;

    iget-object v4, p0, Lae0/c$i;->G:Ljava/lang/String;

    iget-object v5, p0, Lae0/c$i;->H:Ljava/lang/String;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lae0/c$i;-><init>(Lae0/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lae0/c$i;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lae0/c$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lae0/c$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lae0/c$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lae0/c$i;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v5, p0

    iget-object v0, v5, Lae0/c$i;->y:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lae0/c$i;->x:I

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v1, 0x2

    const/4 v12, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v12, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, v5, Lae0/c$i;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_2

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lae0/b$f;->a:Lae0/b$f;

    iput-object v8, v5, Lae0/c$i;->y:Ljava/lang/Object;

    iput v12, v5, Lae0/c$i;->x:I

    invoke-interface {v8, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, v5, Lae0/c$i;->z:Lae0/c;

    invoke-static {v2}, Lae0/c;->g(Lae0/c;)Ltr2/n;

    move-result-object v2

    new-instance v4, Lae0/c$i$a;

    iget-object v14, v5, Lae0/c$i;->E:Ljava/lang/String;

    iget-object v15, v5, Lae0/c$i;->z:Lae0/c;

    iget-object v3, v5, Lae0/c$i;->F:Ljava/lang/String;

    iget-object v6, v5, Lae0/c$i;->G:Ljava/lang/String;

    iget-object v7, v5, Lae0/c$i;->H:Ljava/lang/String;

    const/16 v19, 0x0

    move-object/from16 v16, v3

    move-object v13, v4

    move-object/from16 v17, v6

    move-object/from16 v18, v7

    invoke-direct/range {v13 .. v19}, Lae0/c$i$a;-><init>(Ljava/lang/String;Lae0/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object v8, v5, Lae0/c$i;->y:Ljava/lang/Object;

    iput v1, v5, Lae0/c$i;->x:I

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    new-instance v0, Lae0/b$e;

    invoke-direct {v0, v12}, Lae0/b$e;-><init>(Z)V

    iput-object v2, v5, Lae0/c$i;->y:Ljava/lang/Object;

    iput-object v2, v5, Lae0/c$i;->w:Ljava/lang/Object;

    iput v11, v5, Lae0/c$i;->x:I

    invoke-interface {v8, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_8

    goto :goto_3

    :cond_7
    instance-of v0, v0, Lu02/a$b;

    if-eqz v0, :cond_9

    new-instance v0, Lae0/b$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lae0/b$e;-><init>(Z)V

    iput-object v2, v5, Lae0/c$i;->y:Ljava/lang/Object;

    iput-object v2, v5, Lae0/c$i;->w:Ljava/lang/Object;

    iput v10, v5, Lae0/c$i;->x:I

    invoke-interface {v8, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_8

    :goto_3
    return-object v9

    :cond_8
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
