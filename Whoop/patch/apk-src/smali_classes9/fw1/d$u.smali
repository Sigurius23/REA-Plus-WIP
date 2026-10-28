.class final Lfw1/d$u;
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
    c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$1$3"
    f = "ExtensionsInteractor.kt"
    l = {
        0x59,
        0x61,
        0x61
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
            "Lfw1/d$u;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfw1/d$u;->z:Lfw1/b;

    iput-object p2, p0, Lfw1/d$u;->E:Lfw1/d;

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

    new-instance v0, Lfw1/d$u;

    iget-object v1, p0, Lfw1/d$u;->z:Lfw1/b;

    iget-object v2, p0, Lfw1/d$u;->E:Lfw1/d;

    invoke-direct {v0, v1, v2, p2}, Lfw1/d$u;-><init>(Lfw1/b;Lfw1/d;Lq83/d;)V

    iput-object p1, v0, Lfw1/d$u;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lfw1/d$u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfw1/d$u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfw1/d$u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfw1/d$u;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lfw1/d$u;->y:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lfw1/d$u;->x:I

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
    iget-object v1, v0, Lfw1/d$u;->w:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v8, Lfw1/f;

    iget-object v3, v0, Lfw1/d$u;->z:Lfw1/b;

    check-cast v3, Lfw1/b$b;

    invoke-virtual {v3}, Lfw1/b$b;->b()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v13

    iget-object v3, v0, Lfw1/d$u;->z:Lfw1/b;

    check-cast v3, Lfw1/b$b;

    invoke-virtual {v3}, Lfw1/b$b;->c()Ljava/lang/String;

    move-result-object v14

    iget-object v3, v0, Lfw1/d$u;->z:Lfw1/b;

    check-cast v3, Lfw1/b$b;

    invoke-virtual {v3}, Lfw1/b$b;->a()Ljava/lang/String;

    move-result-object v16

    const/16 v18, 0x14e

    const/16 v19, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v8 .. v19}, Lfw1/f;-><init>(ZZLcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Lcom/whoop/payments/domain/models/Card;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, Lfw1/d$u;->y:Ljava/lang/Object;

    iput v6, v0, Lfw1/d$u;->x:I

    invoke-interface {v1, v8, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    iget-object v3, v0, Lfw1/d$u;->E:Lfw1/d;

    iget-object v6, v0, Lfw1/d$u;->z:Lfw1/b;

    check-cast v6, Lfw1/b$b;

    invoke-virtual {v6}, Lfw1/b$b;->b()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v6

    iget-object v8, v0, Lfw1/d$u;->z:Lfw1/b;

    check-cast v8, Lfw1/b$b;

    invoke-virtual {v8}, Lfw1/b$b;->a()Ljava/lang/String;

    move-result-object v8

    iput-object v7, v0, Lfw1/d$u;->y:Ljava/lang/Object;

    iput-object v1, v0, Lfw1/d$u;->w:Ljava/lang/Object;

    iput v5, v0, Lfw1/d$u;->x:I

    invoke-static {v3, v6, v8, v0}, Lfw1/d;->b(Lfw1/d;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    iput-object v7, v0, Lfw1/d$u;->y:Ljava/lang/Object;

    iput-object v7, v0, Lfw1/d$u;->w:Ljava/lang/Object;

    iput v4, v0, Lfw1/d$u;->x:I

    invoke-interface {v1, v3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_6

    :goto_2
    return-object v2

    :cond_6
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
