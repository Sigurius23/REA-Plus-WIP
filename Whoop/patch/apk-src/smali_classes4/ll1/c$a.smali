.class final Lll1/c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lll1/c;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lec3/m;",
        "",
        "Lll1/a;",
        "action",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Lll1/a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.connectivity.bluetooth.RequiredPermissionsInteractor$interact$1"
    f = "RequiredPermissionsInteractor.kt"
    l = {
        0x20,
        0x22,
        0x24,
        0x25
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lll1/c;

.field w:I

.field x:Z

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lll1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lll1/c;",
            "Lq83/d<",
            "-",
            "Lll1/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lll1/c$a;->F:Lll1/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lec3/m;Lll1/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lll1/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lll1/c$a;

    iget-object v1, p0, Lll1/c$a;->F:Lll1/c;

    invoke-direct {v0, v1, p3}, Lll1/c$a;-><init>(Lll1/c;Lq83/d;)V

    iput-object p1, v0, Lll1/c$a;->z:Ljava/lang/Object;

    iput-object p2, v0, Lll1/c$a;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lll1/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lec3/m;

    check-cast p2, Lll1/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lll1/c$a;->f(Lec3/m;Lll1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lll1/c$a;->z:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    iget-object v1, p0, Lll1/c$a;->E:Ljava/lang/Object;

    check-cast v1, Lll1/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lll1/c$a;->y:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v3, :cond_4

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Lll1/c$a;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lll1/a$a;

    if-eqz p1, :cond_a

    iget-object p1, p0, Lll1/c$a;->F:Lll1/c;

    invoke-static {p1}, Lll1/c;->c(Lll1/c;)Ly92/a;

    move-result-object p1

    iput-object v0, p0, Lll1/c$a;->z:Ljava/lang/Object;

    iput-object v8, p0, Lll1/c$a;->E:Ljava/lang/Object;

    iput v7, p0, Lll1/c$a;->y:I

    invoke-virtual {p1, p0}, Ly92/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto :goto_4

    :cond_5
    :goto_1
    if-nez p1, :cond_6

    goto :goto_2

    :cond_6
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_7

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v8, p0, Lll1/c$a;->z:Ljava/lang/Object;

    iput-object v8, p0, Lll1/c$a;->E:Ljava/lang/Object;

    iput v7, p0, Lll1/c$a;->w:I

    iput v6, p0, Lll1/c$a;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_9

    goto :goto_4

    :cond_7
    iget-object p1, p0, Lll1/c$a;->F:Lll1/c;

    invoke-static {p1}, Lll1/c;->d(Lll1/c;)Ljava/util/List;

    move-result-object v1

    iput-object v0, p0, Lll1/c$a;->z:Ljava/lang/Object;

    iput-object v8, p0, Lll1/c$a;->E:Ljava/lang/Object;

    iput v7, p0, Lll1/c$a;->w:I

    iput v5, p0, Lll1/c$a;->y:I

    invoke-static {p1, v1, p0}, Lll1/c;->e(Lll1/c;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_8

    goto :goto_4

    :cond_8
    move v1, v7

    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v8, p0, Lll1/c$a;->z:Ljava/lang/Object;

    iput-object v8, p0, Lll1/c$a;->E:Ljava/lang/Object;

    iput v1, p0, Lll1/c$a;->w:I

    iput-boolean p1, p0, Lll1/c$a;->x:Z

    iput v4, p0, Lll1/c$a;->y:I

    invoke-interface {v0, v3, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_9

    :goto_4
    return-object v2

    :cond_9
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
