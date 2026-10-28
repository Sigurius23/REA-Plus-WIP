.class final Lfw1/d$y;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfw1/d;->v(Lec3/l;)Lec3/l;
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
        "Lfw1/c;",
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
    c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$1$8"
    f = "ExtensionsInteractor.kt"
    l = {
        0x7f,
        0x8a,
        0x89
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lfw1/d;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lfw1/b;


# direct methods
.method public constructor <init>(Lfw1/b;Lfw1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfw1/b;",
            "Lfw1/d;",
            "Lq83/d<",
            "-",
            "Lfw1/d$y;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfw1/d$y;->z:Lfw1/b;

    iput-object p2, p0, Lfw1/d$y;->E:Lfw1/d;

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

    new-instance v0, Lfw1/d$y;

    iget-object v1, p0, Lfw1/d$y;->z:Lfw1/b;

    iget-object v2, p0, Lfw1/d$y;->E:Lfw1/d;

    invoke-direct {v0, v1, v2, p2}, Lfw1/d$y;-><init>(Lfw1/b;Lfw1/d;Lq83/d;)V

    iput-object p1, v0, Lfw1/d$y;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lfw1/d$y;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfw1/d$y;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfw1/d$y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfw1/d$y;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v5, p0

    iget-object v0, v5, Lfw1/d$y;->y:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lec3/m;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lfw1/d$y;->x:I

    const/4 v8, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v9, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v8, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v5, Lfw1/d$y;->w:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Lfw1/d$y;->z:Lfw1/b;

    check-cast v0, Lfw1/b$g;

    invoke-virtual {v0}, Lfw1/b$g;->a()Lcom/whoop/payments/domain/models/Card;

    move-result-object v17

    iget-object v0, v5, Lfw1/d$y;->z:Lfw1/b;

    check-cast v0, Lfw1/b$g;

    invoke-virtual {v0}, Lfw1/b$g;->d()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v15

    iget-object v0, v5, Lfw1/d$y;->z:Lfw1/b;

    check-cast v0, Lfw1/b$g;

    invoke-virtual {v0}, Lfw1/b$g;->e()Ljava/lang/String;

    move-result-object v16

    iget-object v0, v5, Lfw1/d$y;->z:Lfw1/b;

    check-cast v0, Lfw1/b$g;

    invoke-virtual {v0}, Lfw1/b$g;->b()Ljava/util/List;

    move-result-object v19

    iget-object v0, v5, Lfw1/d$y;->z:Lfw1/b;

    check-cast v0, Lfw1/b$g;

    invoke-virtual {v0}, Lfw1/b$g;->c()Ljava/lang/String;

    move-result-object v18

    new-instance v10, Lfw1/f;

    const/16 v20, 0xe

    const/16 v21, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v21}, Lfw1/f;-><init>(ZZLcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, v5, Lfw1/d$y;->y:Ljava/lang/Object;

    iput v2, v5, Lfw1/d$y;->x:I

    invoke-interface {v6, v10, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    iget-object v0, v5, Lfw1/d$y;->z:Lfw1/b;

    check-cast v0, Lfw1/b$g;

    invoke-virtual {v0}, Lfw1/b$g;->a()Lcom/whoop/payments/domain/models/Card;

    move-result-object v2

    iget-object v0, v5, Lfw1/d$y;->z:Lfw1/b;

    check-cast v0, Lfw1/b$g;

    invoke-virtual {v0}, Lfw1/b$g;->d()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v0

    iget-object v3, v5, Lfw1/d$y;->z:Lfw1/b;

    check-cast v3, Lfw1/b$g;

    invoke-virtual {v3}, Lfw1/b$g;->e()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v5, Lfw1/d$y;->z:Lfw1/b;

    check-cast v4, Lfw1/b$g;

    invoke-virtual {v4}, Lfw1/b$g;->c()Ljava/lang/String;

    move-result-object v4

    move-object v10, v0

    iget-object v0, v5, Lfw1/d$y;->E:Lfw1/d;

    iput-object v9, v5, Lfw1/d$y;->y:Ljava/lang/Object;

    iput-object v6, v5, Lfw1/d$y;->w:Ljava/lang/Object;

    iput v1, v5, Lfw1/d$y;->x:I

    move-object v1, v10

    invoke-static/range {v0 .. v5}, Lfw1/d;->a(Lfw1/d;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Lcom/whoop/payments/domain/models/Card;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    iput-object v9, v5, Lfw1/d$y;->y:Ljava/lang/Object;

    iput-object v9, v5, Lfw1/d$y;->w:Ljava/lang/Object;

    iput v8, v5, Lfw1/d$y;->x:I

    invoke-interface {v6, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_6

    :goto_2
    return-object v7

    :cond_6
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
