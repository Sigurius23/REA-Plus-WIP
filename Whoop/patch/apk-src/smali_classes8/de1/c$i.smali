.class final Lde1/c$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lde1/c;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lde1/b;",
        "prevState",
        "Lde1/c$a;",
        "internal",
        "<anonymous>",
        "(Lde1/b;Lde1/c$a;)Lde1/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.editactivities.domain.EditActivitiesDrawerInteractor$interact$2"
    f = "EditActivitiesDrawerInteractor.kt"
    l = {
        0x4f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lde1/c;


# direct methods
.method public constructor <init>(Lde1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde1/c;",
            "Lq83/d<",
            "-",
            "Lde1/c$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lde1/c$i;->z:Lde1/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lde1/b;Lde1/c$a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde1/b;",
            "Lde1/c$a;",
            "Lq83/d<",
            "-",
            "Lde1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lde1/c$i;

    iget-object v1, p0, Lde1/c$i;->z:Lde1/c;

    invoke-direct {v0, v1, p3}, Lde1/c$i;-><init>(Lde1/c;Lq83/d;)V

    iput-object p1, v0, Lde1/c$i;->x:Ljava/lang/Object;

    iput-object p2, v0, Lde1/c$i;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lde1/c$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde1/b;

    check-cast p2, Lde1/c$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lde1/c$i;->f(Lde1/b;Lde1/c$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lde1/c$i;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lde1/b;

    iget-object v1, v0, Lde1/c$i;->y:Ljava/lang/Object;

    check-cast v1, Lde1/c$a;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v0, Lde1/c$i;->w:I

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    if-ne v4, v5, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v4, v1, Lde1/c$a$b;

    if-eqz v4, :cond_2

    check-cast v1, Lde1/c$a$b;

    invoke-virtual {v1}, Lde1/c$a$b;->a()Lde1/b;

    move-result-object v1

    return-object v1

    :cond_2
    instance-of v4, v1, Lde1/c$a$c;

    if-eqz v4, :cond_3

    check-cast v1, Lde1/c$a$c;

    invoke-virtual {v1}, Lde1/c$a$c;->a()Lde1/d;

    move-result-object v3

    const/16 v16, 0x7fe

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v2 .. v17}, Lde1/b;->b(Lde1/b;Lde1/d;Ljava/util/List;Lm91/u;Lm91/u;Lm91/u;Lm91/u;Ljava/util/List;IJLjava/lang/String;ZZILjava/lang/Object;)Lde1/b;

    move-result-object v1

    return-object v1

    :cond_3
    instance-of v4, v1, Lde1/c$a$a;

    if-eqz v4, :cond_5

    iget-object v4, v0, Lde1/c$i;->z:Lde1/c;

    check-cast v1, Lde1/c$a$a;

    invoke-virtual {v1}, Lde1/c$a$a;->a()Lde1/a;

    move-result-object v1

    const/4 v6, 0x0

    iput-object v6, v0, Lde1/c$i;->x:Ljava/lang/Object;

    iput-object v6, v0, Lde1/c$i;->y:Ljava/lang/Object;

    iput v5, v0, Lde1/c$i;->w:I

    invoke-static {v4, v2, v1, v0}, Lde1/c;->c(Lde1/c;Lde1/b;Lde1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_4

    return-object v3

    :cond_4
    :goto_0
    check-cast v1, Lde1/b;

    return-object v1

    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
