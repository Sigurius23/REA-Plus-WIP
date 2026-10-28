.class final Lsc2/s$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsc2/s;->X0(Ly42/a;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.settings.strap.StrapSettingsViewModel$observePuffinChargeStatus$2"
    f = "StrapSettingsViewModel.kt"
    l = {
        0x13e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lsc2/s;

.field final synthetic y:Ly42/a;


# direct methods
.method public constructor <init>(Lsc2/s;Ly42/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsc2/s;",
            "Ly42/a;",
            "Lq83/d<",
            "-",
            "Lsc2/s$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsc2/s$h;->x:Lsc2/s;

    iput-object p2, p0, Lsc2/s$h;->y:Ly42/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lsc2/s$h;

    iget-object v0, p0, Lsc2/s$h;->x:Lsc2/s;

    iget-object v1, p0, Lsc2/s$h;->y:Ly42/a;

    invoke-direct {p1, v0, v1, p2}, Lsc2/s$h;-><init>(Lsc2/s;Ly42/a;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lsc2/s$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsc2/s$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsc2/s$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsc2/s$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsc2/s$h;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsc2/s$h;->x:Lsc2/s;

    invoke-static {p1}, Lsc2/s;->M(Lsc2/s;)Lxs0/b;

    move-result-object p1

    invoke-interface {p1}, Lxs0/b;->a()Lec3/l;

    move-result-object p1

    iget-object v1, p0, Lsc2/s$h;->y:Ly42/a;

    invoke-interface {v1}, Ly42/a;->l()Lec3/t1;

    move-result-object v1

    new-instance v3, Lsc2/s$h$a;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lsc2/s$h$a;-><init>(Lq83/d;)V

    new-instance v5, Lec3/l1;

    const/4 v6, 0x1

    invoke-direct {v5, p1, v1, v3, v6}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    new-instance p1, Lsc2/s$h$b;

    iget-object v1, p0, Lsc2/s$h;->x:Lsc2/s;

    invoke-direct {p1, v1, v4}, Lsc2/s$h$b;-><init>(Lsc2/s;Lq83/d;)V

    iput v2, p0, Lsc2/s$h;->w:I

    invoke-static {v5, p1, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
