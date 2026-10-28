.class final Ldz2/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldz2/c;->g()Lec3/l;
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
        "Ldz2/b;",
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
    c = "com.whoop.whooplabs.feature.landing.interactor.DwlLandingInteractor$loadDwlLanding$1"
    f = "DwlLandingInteractor.kt"
    l = {
        0x1c,
        0x1f,
        0x20,
        0x23
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ldz2/c;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldz2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldz2/c;",
            "Lq83/d<",
            "-",
            "Ldz2/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldz2/c$b;->E:Ldz2/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Ldz2/c$b;

    iget-object v1, p0, Ldz2/c$b;->E:Ldz2/c;

    invoke-direct {v0, v1, p2}, Ldz2/c$b;-><init>(Ldz2/c;Lq83/d;)V

    iput-object p1, v0, Ldz2/c$b;->z:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ldz2/c$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldz2/c$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldz2/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldz2/c$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Ldz2/c$b;->z:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ldz2/c$b;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x1

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v7, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Ldz2/c$b;->x:Ljava/lang/Object;

    check-cast v0, Lax2/b;

    iget-object v0, p0, Ldz2/c$b;->w:Ljava/lang/Object;

    check-cast v0, Lbz2/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    iget-object v2, p0, Ldz2/c$b;->w:Ljava/lang/Object;

    check-cast v2, Lbz2/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Ldz2/b$c;->a:Ldz2/b$c;

    iput-object v0, p0, Ldz2/c$b;->z:Ljava/lang/Object;

    iput v6, p0, Ldz2/c$b;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    iget-object p1, p0, Ldz2/c$b;->E:Ldz2/c;

    invoke-static {p1}, Ldz2/c;->c(Ldz2/c;)Ltr2/n;

    move-result-object p1

    const-string v2, "Loading Dwl landing"

    new-array v6, v3, [Lqr2/a$a;

    invoke-interface {p1, v2, v6}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lbz2/a;

    iget-object v2, p0, Ldz2/c$b;->E:Ldz2/c;

    invoke-static {v2}, Ldz2/c;->d(Ldz2/c;)Lex2/a;

    move-result-object v2

    invoke-direct {p1, v2, v8, v7, v8}, Lbz2/a;-><init>(Lex2/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Ldz2/c$b;->z:Ljava/lang/Object;

    iput-object v8, p0, Ldz2/c$b;->w:Ljava/lang/Object;

    iput v7, p0, Ldz2/c$b;->y:I

    invoke-virtual {p1, p0}, Lbz2/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    check-cast p1, Lax2/b;

    instance-of v2, p1, Lax2/b$b;

    if-eqz v2, :cond_7

    iget-object v2, p0, Ldz2/c$b;->E:Ldz2/c;

    check-cast p1, Lax2/b$b;

    invoke-virtual {p1}, Lax2/b$b;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/whooplabs/data/domain/DwlLanding;

    invoke-static {v2, p1}, Ldz2/c;->f(Ldz2/c;Lcom/whoop/whooplabs/data/domain/DwlLanding;)Lec3/l;

    move-result-object p1

    iput-object v8, p0, Ldz2/c$b;->z:Ljava/lang/Object;

    iput-object v8, p0, Ldz2/c$b;->w:Ljava/lang/Object;

    iput-object v8, p0, Ldz2/c$b;->x:Ljava/lang/Object;

    iput v5, p0, Ldz2/c$b;->y:I

    invoke-static {v0, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_3

    :cond_7
    sget-object v2, Lax2/b$a;->a:Lax2/b$a;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Ldz2/c$b;->E:Ldz2/c;

    invoke-static {p1}, Ldz2/c;->c(Ldz2/c;)Ltr2/n;

    move-result-object p1

    const-string v2, "Error loading Dwl landing"

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {p1, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ldz2/b$a;->a:Ldz2/b$a;

    iput-object v8, p0, Ldz2/c$b;->z:Ljava/lang/Object;

    iput-object v8, p0, Ldz2/c$b;->w:Ljava/lang/Object;

    iput-object v8, p0, Ldz2/c$b;->x:Ljava/lang/Object;

    iput v4, p0, Ldz2/c$b;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
