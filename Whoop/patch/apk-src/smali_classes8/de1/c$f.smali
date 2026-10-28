.class final Lde1/c$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


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
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lde1/c$a;",
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
    c = "com.whoop.editactivities.domain.EditActivitiesDrawerInteractor$interact$1$1"
    f = "EditActivitiesDrawerInteractor.kt"
    l = {
        0x34,
        0x3c,
        0x3c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lde1/a;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lde1/c;


# direct methods
.method public constructor <init>(Lde1/c;Lde1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde1/c;",
            "Lde1/a;",
            "Lq83/d<",
            "-",
            "Lde1/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lde1/c$f;->z:Lde1/c;

    iput-object p2, p0, Lde1/c$f;->E:Lde1/a;

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

    new-instance v0, Lde1/c$f;

    iget-object v1, p0, Lde1/c$f;->z:Lde1/c;

    iget-object v2, p0, Lde1/c$f;->E:Lde1/a;

    invoke-direct {v0, v1, v2, p2}, Lde1/c$f;-><init>(Lde1/c;Lde1/a;Lq83/d;)V

    iput-object p1, v0, Lde1/c$f;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lde1/c$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lde1/c$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lde1/c$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lde1/c$f;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lde1/c$f;->y:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lde1/c$f;->x:I

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v1, v0, Lde1/c$f;->w:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lde1/c$f;->z:Lde1/c;

    invoke-static {v3}, Lde1/c;->f(Lde1/c;)Lce1/b;

    move-result-object v3

    sget-object v8, Lce1/a$c;->a:Lce1/a$c;

    invoke-virtual {v3, v8}, Lce1/b;->i(Lce1/a;)V

    new-instance v3, Lde1/c$a$b;

    new-instance v8, Lde1/b;

    sget-object v9, Lde1/d$f;->a:Lde1/d$f;

    iget-object v10, v0, Lde1/c$f;->E:Lde1/a;

    check-cast v10, Lde1/a$d;

    invoke-virtual {v10}, Lde1/a$d;->a()Ljava/lang/String;

    move-result-object v19

    const/16 v22, 0xdfe

    const/16 v23, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v8 .. v23}, Lde1/b;-><init>(Lde1/d;Ljava/util/List;Lm91/u;Lm91/u;Lm91/u;Lm91/u;Ljava/util/List;IJLjava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v8}, Lde1/c$a$b;-><init>(Lde1/b;)V

    iput-object v1, v0, Lde1/c$f;->y:Ljava/lang/Object;

    iput v6, v0, Lde1/c$f;->x:I

    invoke-interface {v1, v3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    iget-object v3, v0, Lde1/c$f;->z:Lde1/c;

    iget-object v6, v0, Lde1/c$f;->E:Lde1/a;

    check-cast v6, Lde1/a$d;

    invoke-virtual {v6}, Lde1/a$d;->a()Ljava/lang/String;

    move-result-object v6

    iput-object v7, v0, Lde1/c$f;->y:Ljava/lang/Object;

    iput-object v1, v0, Lde1/c$f;->w:Ljava/lang/Object;

    iput v5, v0, Lde1/c$f;->x:I

    invoke-static {v3, v6, v0}, Lde1/c;->g(Lde1/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast v3, Lde1/b;

    new-instance v5, Lde1/c$a$b;

    invoke-direct {v5, v3}, Lde1/c$a$b;-><init>(Lde1/b;)V

    iput-object v7, v0, Lde1/c$f;->y:Ljava/lang/Object;

    iput-object v7, v0, Lde1/c$f;->w:Ljava/lang/Object;

    iput v4, v0, Lde1/c$f;->x:I

    invoke-interface {v1, v5, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_6

    :goto_2
    return-object v2

    :cond_6
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
