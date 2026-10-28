.class final Lzo0/b$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzo0/b;-><init>(Lpo0/a;Lbc3/c0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lzo0/a;Lzo0/j;Lzo0/f;Lzo0/k;Ltr2/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/o;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lzo0/e;",
        "local",
        "Lep0/e;",
        "animation",
        "",
        "isPrefetchEnabled",
        "isPreviewCollapsed",
        "Lep0/d;",
        "<anonymous>",
        "(Lzo0/e;Lep0/e;ZZ)Lep0/d;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.coacheverywhere.presentation.GlobalCoachManagerImpl$state$2"
    f = "GlobalCoachManagerImpl.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Z

.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Z


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lzo0/b$b;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x5

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lzo0/e;Lep0/e;ZZLq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzo0/e;",
            "Lep0/e;",
            "ZZ",
            "Lq83/d<",
            "-",
            "Lep0/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lzo0/b$b;

    invoke-direct {v0, p5}, Lzo0/b$b;-><init>(Lq83/d;)V

    iput-object p1, v0, Lzo0/b$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lzo0/b$b;->y:Ljava/lang/Object;

    iput-boolean p3, v0, Lzo0/b$b;->z:Z

    iput-boolean p4, v0, Lzo0/b$b;->E:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lzo0/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v1, p1

    check-cast v1, Lzo0/e;

    move-object v2, p2

    check-cast v2, Lep0/e;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v5, p5

    check-cast v5, Lq83/d;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lzo0/b$b;->f(Lzo0/e;Lep0/e;ZZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lzo0/b$b;->x:Ljava/lang/Object;

    check-cast v1, Lzo0/e;

    iget-object v2, v0, Lzo0/b$b;->y:Ljava/lang/Object;

    check-cast v2, Lep0/e;

    iget-boolean v3, v0, Lzo0/b$b;->z:Z

    iget-boolean v10, v0, Lzo0/b$b;->E:Z

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v4, v0, Lzo0/b$b;->w:I

    if-nez v4, :cond_1

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v4, v2, Lep0/e$a;

    if-eqz v4, :cond_0

    move-object v4, v2

    check-cast v4, Lep0/e$a;

    const/16 v11, 0x1f

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v12}, Lep0/e$a;->b(Lep0/e$a;Lep0/f;Lep0/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lep0/e$a;

    move-result-object v2

    :cond_0
    new-instance v4, Lep0/d;

    invoke-virtual {v1}, Lzo0/e;->g()Z

    move-result v5

    invoke-virtual {v1}, Lzo0/e;->h()Z

    move-result v6

    invoke-virtual {v1}, Lzo0/e;->e()J

    move-result-wide v7

    invoke-virtual {v1}, Lzo0/e;->d()Lep0/j;

    move-result-object v9

    invoke-virtual {v1}, Lzo0/e;->f()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Lep0/h;

    invoke-direct {v11, v3, v2}, Lep0/h;-><init>(ZLep0/e;)V

    invoke-virtual {v1}, Lzo0/e;->c()F

    move-result v13

    const/16 v14, 0x40

    const/4 v15, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v15}, Lep0/d;-><init>(ZZJLep0/j;Ljava/lang/String;Lep0/h;Lep0/i;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
