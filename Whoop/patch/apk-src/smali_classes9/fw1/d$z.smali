.class final Lfw1/d$z;
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
    c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$1$9"
    f = "ExtensionsInteractor.kt"
    l = {
        0x94,
        0x95,
        0x97,
        0x9b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lfw1/b;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lfw1/d;


# direct methods
.method public constructor <init>(Lfw1/d;Lfw1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfw1/d;",
            "Lfw1/b;",
            "Lq83/d<",
            "-",
            "Lfw1/d$z;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfw1/d$z;->z:Lfw1/d;

    iput-object p2, p0, Lfw1/d$z;->E:Lfw1/b;

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

    new-instance v0, Lfw1/d$z;

    iget-object v1, p0, Lfw1/d$z;->z:Lfw1/d;

    iget-object v2, p0, Lfw1/d$z;->E:Lfw1/b;

    invoke-direct {v0, v1, v2, p2}, Lfw1/d$z;-><init>(Lfw1/d;Lfw1/b;Lq83/d;)V

    iput-object p1, v0, Lfw1/d$z;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lfw1/d$z;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfw1/d$z;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfw1/d$z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfw1/d$z;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lfw1/d$z;->y:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lfw1/d$z;->x:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lfw1/d$z;->w:Ljava/lang/Object;

    check-cast v1, Lfw1/g;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_2

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v8, Lfw1/g;

    const/16 v16, 0x7e

    const/16 v17, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v8 .. v17}, Lfw1/g;-><init>(ZZLcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;Ljava/lang/String;Ljava/lang/Boolean;ILcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, Lfw1/d$z;->y:Ljava/lang/Object;

    iput v7, v0, Lfw1/d$z;->x:I

    invoke-interface {v1, v8, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_5

    goto :goto_3

    :cond_5
    :goto_0
    iget-object v3, v0, Lfw1/d$z;->z:Lfw1/d;

    iput-object v1, v0, Lfw1/d$z;->y:Ljava/lang/Object;

    iput v6, v0, Lfw1/d$z;->x:I

    invoke-static {v3, v0}, Lfw1/d;->c(Lfw1/d;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    iget-object v3, v0, Lfw1/d$z;->z:Lfw1/d;

    iget-object v6, v0, Lfw1/d$z;->E:Lfw1/b;

    check-cast v6, Lfw1/b$e;

    invoke-virtual {v6}, Lfw1/b$e;->a()Ljava/lang/String;

    move-result-object v6

    iput-object v1, v0, Lfw1/d$z;->y:Ljava/lang/Object;

    iput v5, v0, Lfw1/d$z;->x:I

    invoke-static {v3, v6, v0}, Lfw1/d;->f(Lfw1/d;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    check-cast v3, Lfw1/g;

    iget-object v5, v0, Lfw1/d$z;->z:Lfw1/d;

    invoke-static {v5}, Lfw1/d;->i(Lfw1/d;)Lec3/p1;

    move-result-object v5

    check-cast v5, Lec3/h2;

    invoke-virtual {v5, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    const/4 v5, 0x0

    iput-object v5, v0, Lfw1/d$z;->y:Ljava/lang/Object;

    iput-object v5, v0, Lfw1/d$z;->w:Ljava/lang/Object;

    iput v4, v0, Lfw1/d$z;->x:I

    invoke-interface {v1, v3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_8

    :goto_3
    return-object v2

    :cond_8
    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
