.class final Luy1/c$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luy1/c;->m()Lec3/l;
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
        "Luy1/d;",
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
    c = "com.whoop.mfa.management.MfaManagementInteractor$handleInit$1"
    f = "MfaManagementInteractor.kt"
    l = {
        0x5d,
        0x60,
        0x60,
        0x62,
        0x66
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field private synthetic F:Ljava/lang/Object;

.field final synthetic G:Luy1/c;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Luy1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luy1/c;",
            "Lq83/d<",
            "-",
            "Luy1/c$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Luy1/c$e;->G:Luy1/c;

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

    new-instance v0, Luy1/c$e;

    iget-object v1, p0, Luy1/c$e;->G:Luy1/c;

    invoke-direct {v0, v1, p2}, Luy1/c$e;-><init>(Luy1/c;Lq83/d;)V

    iput-object p1, v0, Luy1/c$e;->F:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Luy1/c$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Luy1/c$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Luy1/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Luy1/c$e;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Luy1/c$e;->F:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Luy1/c$e;->E:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Luy1/c$e;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Luy1/c$e;->y:Ljava/lang/Object;

    check-cast v0, Luy1/g;

    iget-object v0, p0, Luy1/c$e;->x:Ljava/lang/Object;

    check-cast v0, Luy1/h;

    iget-object v0, p0, Luy1/c$e;->w:Ljava/lang/Object;

    check-cast v0, Luy1/i;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Luy1/c$e;->x:Ljava/lang/Object;

    check-cast v2, Luy1/h;

    iget-object v2, p0, Luy1/c$e;->w:Ljava/lang/Object;

    check-cast v2, Luy1/i;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    iget-object v2, p0, Luy1/c$e;->x:Ljava/lang/Object;

    check-cast v2, Luy1/h;

    iget-object v2, p0, Luy1/c$e;->w:Ljava/lang/Object;

    check-cast v2, Luy1/i;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v2, p0, Luy1/c$e;->y:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v6, p0, Luy1/c$e;->x:Ljava/lang/Object;

    check-cast v6, Luy1/h;

    iget-object v7, p0, Luy1/c$e;->w:Ljava/lang/Object;

    check-cast v7, Luy1/i;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Luy1/c$e;->G:Luy1/c;

    iput-object v0, p0, Luy1/c$e;->F:Ljava/lang/Object;

    iput v7, p0, Luy1/c$e;->E:I

    invoke-static {p1, p0}, Luy1/c;->e(Luy1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto/16 :goto_4

    :cond_6
    :goto_0
    check-cast p1, Luy1/i;

    iget-object v2, p0, Luy1/c$e;->G:Luy1/c;

    invoke-static {v2, p1}, Luy1/c;->b(Luy1/c;Luy1/i;)Luy1/h;

    move-result-object p1

    iget-object v2, p0, Luy1/c$e;->G:Luy1/c;

    iput-object v0, p0, Luy1/c$e;->F:Ljava/lang/Object;

    iput-object v8, p0, Luy1/c$e;->w:Ljava/lang/Object;

    iput-object p1, p0, Luy1/c$e;->x:Ljava/lang/Object;

    iput-object v0, p0, Luy1/c$e;->y:Ljava/lang/Object;

    iput v6, p0, Luy1/c$e;->E:I

    invoke-static {v2, p0}, Luy1/c;->h(Luy1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_4

    :cond_7
    move-object v6, p1

    move-object p1, v2

    move-object v2, v0

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    new-instance v7, Luy1/d$c;

    invoke-direct {v7, p1, v6}, Luy1/d$c;-><init>(ZLuy1/h;)V

    iput-object v0, p0, Luy1/c$e;->F:Ljava/lang/Object;

    iput-object v8, p0, Luy1/c$e;->w:Ljava/lang/Object;

    iput-object v8, p0, Luy1/c$e;->x:Ljava/lang/Object;

    iput-object v8, p0, Luy1/c$e;->y:Ljava/lang/Object;

    iput v5, p0, Luy1/c$e;->E:I

    invoke-interface {v2, v7, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_4

    :cond_8
    :goto_2
    iget-object p1, p0, Luy1/c$e;->G:Luy1/c;

    iput-object v0, p0, Luy1/c$e;->F:Ljava/lang/Object;

    iput-object v8, p0, Luy1/c$e;->w:Ljava/lang/Object;

    iput-object v8, p0, Luy1/c$e;->x:Ljava/lang/Object;

    iput v4, p0, Luy1/c$e;->E:I

    invoke-static {p1, p0}, Luy1/c;->d(Luy1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_4

    :cond_9
    :goto_3
    check-cast p1, Ll83/k;

    if-nez p1, :cond_a

    new-instance p1, Ll83/k;

    const-string v2, ""

    invoke-direct {p1, v8, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_a
    iget-object v2, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Luy1/g;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    if-eqz v2, :cond_b

    iget-object v4, p0, Luy1/c$e;->G:Luy1/c;

    invoke-static {v4}, Luy1/c;->c(Luy1/c;)Lpy1/a;

    move-result-object v4

    invoke-static {v2}, Lpy1/b;->d(Luy1/g;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lpy1/a;->u(Ljava/lang/String;)V

    :cond_b
    new-instance v4, Luy1/d$b;

    invoke-direct {v4, v2, p1}, Luy1/d$b;-><init>(Luy1/g;Ljava/lang/String;)V

    iput-object v8, p0, Luy1/c$e;->F:Ljava/lang/Object;

    iput-object v8, p0, Luy1/c$e;->w:Ljava/lang/Object;

    iput-object v8, p0, Luy1/c$e;->x:Ljava/lang/Object;

    iput-object v8, p0, Luy1/c$e;->y:Ljava/lang/Object;

    iput-object v8, p0, Luy1/c$e;->z:Ljava/lang/Object;

    iput v3, p0, Luy1/c$e;->E:I

    invoke-interface {v0, v4, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_c

    :goto_4
    return-object v1

    :cond_c
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
