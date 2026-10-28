.class final Lmr1/f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmr1/f;->h()Lec3/l;
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
        "Lmr1/c;",
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
    c = "com.whoop.internal.checkout.UniversalCheckoutDataFetchInteractor$fetchCartId$1"
    f = "UniversalCheckoutDataFetchInteractor.kt"
    l = {
        0x38,
        0x3f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lmr1/f;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lmr1/f;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmr1/f;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lmr1/f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmr1/f$a;->y:Lmr1/f;

    iput-object p2, p0, Lmr1/f$a;->z:Ljava/lang/String;

    iput-object p3, p0, Lmr1/f$a;->E:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lmr1/f$a;

    iget-object v1, p0, Lmr1/f$a;->y:Lmr1/f;

    iget-object v2, p0, Lmr1/f$a;->z:Ljava/lang/String;

    iget-object v3, p0, Lmr1/f$a;->E:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lmr1/f$a;-><init>(Lmr1/f;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lmr1/f$a;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lmr1/f$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmr1/f$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmr1/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmr1/f$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lmr1/f$a;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lmr1/f$a;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v5, Lmr1/c;

    sget-object v9, Lmr1/a$a;->a:Lmr1/a$a;

    const/16 v11, 0x15

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v12}, Lmr1/c;-><init>(Ljava/lang/String;ZLjava/lang/String;Lmr1/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lmr1/f$a;->x:Ljava/lang/Object;

    iput v4, p0, Lmr1/f$a;->w:I

    invoke-interface {v0, v5, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lmr1/f$a;->y:Lmr1/f;

    iget-object v2, p0, Lmr1/f$a;->z:Ljava/lang/String;

    iget-object v4, p0, Lmr1/f$a;->E:Ljava/lang/String;

    invoke-static {p1, v2, v4}, Lmr1/f;->c(Lmr1/f;Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object p1

    new-instance v2, Lmr1/f$a$a;

    iget-object v4, p0, Lmr1/f$a;->y:Lmr1/f;

    invoke-direct {v2, v0, v4}, Lmr1/f$a$a;-><init>(Lec3/m;Lmr1/f;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lmr1/f$a;->x:Ljava/lang/Object;

    iput v3, p0, Lmr1/f$a;->w:I

    invoke-interface {p1, v2, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
