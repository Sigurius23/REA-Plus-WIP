.class final Loy2/e$p;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loy2/e;->r0(Loy2/a;Lq83/d;)Ljava/lang/Object;
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
        "Ldc3/u;",
        "Loy2/l;",
        "Ll83/a0;",
        "<anonymous>",
        "(Ldc3/u;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$handleAction$4"
    f = "CampaignStepsInteractor.kt"
    l = {
        0x9a,
        0x9b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Loy2/e;

.field final synthetic z:Loy2/a;


# direct methods
.method public constructor <init>(Loy2/e;Loy2/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loy2/e;",
            "Loy2/a;",
            "Lq83/d<",
            "-",
            "Loy2/e$p;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loy2/e$p;->y:Loy2/e;

    iput-object p2, p0, Loy2/e$p;->z:Loy2/a;

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

    new-instance v0, Loy2/e$p;

    iget-object v1, p0, Loy2/e$p;->y:Loy2/e;

    iget-object v2, p0, Loy2/e$p;->z:Loy2/a;

    invoke-direct {v0, v1, v2, p2}, Loy2/e$p;-><init>(Loy2/e;Loy2/a;Lq83/d;)V

    iput-object p1, v0, Loy2/e$p;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc3/u;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Loy2/e$p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loy2/e$p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loy2/e$p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loy2/e$p;->invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v6, p0

    iget-object v0, v6, Loy2/e$p;->x:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ldc3/u;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, v6, Loy2/e$p;->w:I

    const/4 v9, 0x2

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v9, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v6, Loy2/e$p;->y:Loy2/e;

    iget-object v2, v6, Loy2/e$p;->z:Loy2/a;

    check-cast v2, Loy2/a$g;

    invoke-virtual {v2}, Loy2/a$g;->e()I

    move-result v2

    iget-object v3, v6, Loy2/e$p;->z:Loy2/a;

    check-cast v3, Loy2/a$g;

    invoke-virtual {v3}, Loy2/a$g;->d()I

    move-result v3

    iget-object v4, v6, Loy2/e$p;->z:Loy2/a;

    check-cast v4, Loy2/a$g;

    invoke-virtual {v4}, Loy2/a$g;->a()I

    move-result v4

    iget-object v5, v6, Loy2/e$p;->z:Loy2/a;

    check-cast v5, Loy2/a$g;

    invoke-virtual {v5}, Loy2/a$g;->b()I

    move-result v5

    iget-object v10, v6, Loy2/e$p;->z:Loy2/a;

    check-cast v10, Loy2/a$g;

    invoke-virtual {v10}, Loy2/a$g;->c()I

    move-result v10

    iput-object v7, v6, Loy2/e$p;->x:Ljava/lang/Object;

    iput v1, v6, Loy2/e$p;->w:I

    move v1, v2

    move v2, v3

    move v3, v4

    move v4, v5

    move v5, v10

    invoke-static/range {v0 .. v6}, Loy2/e;->v(Loy2/e;IIIIILq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    new-instance v10, Loy2/l$e;

    iget-object v0, v6, Loy2/e$p;->z:Loy2/a;

    check-cast v0, Loy2/a$g;

    invoke-virtual {v0}, Loy2/a$g;->e()I

    move-result v11

    iget-object v0, v6, Loy2/e$p;->z:Loy2/a;

    check-cast v0, Loy2/a$g;

    invoke-virtual {v0}, Loy2/a$g;->d()I

    move-result v12

    iget-object v0, v6, Loy2/e$p;->z:Loy2/a;

    check-cast v0, Loy2/a$g;

    invoke-virtual {v0}, Loy2/a$g;->a()I

    move-result v13

    iget-object v0, v6, Loy2/e$p;->z:Loy2/a;

    check-cast v0, Loy2/a$g;

    invoke-virtual {v0}, Loy2/a$g;->b()I

    move-result v14

    iget-object v0, v6, Loy2/e$p;->z:Loy2/a;

    check-cast v0, Loy2/a$g;

    invoke-virtual {v0}, Loy2/a$g;->c()I

    move-result v15

    iget-object v0, v6, Loy2/e$p;->z:Loy2/a;

    check-cast v0, Loy2/a$g;

    invoke-virtual {v0}, Loy2/a$g;->f()Z

    move-result v16

    invoke-direct/range {v10 .. v16}, Loy2/l$e;-><init>(IIIIIZ)V

    const/4 v0, 0x0

    iput-object v0, v6, Loy2/e$p;->x:Ljava/lang/Object;

    iput v9, v6, Loy2/e$p;->w:I

    check-cast v7, Ldc3/t;

    iget-object v0, v7, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v0, v10, v6}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_4

    :goto_1
    return-object v8

    :cond_4
    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
