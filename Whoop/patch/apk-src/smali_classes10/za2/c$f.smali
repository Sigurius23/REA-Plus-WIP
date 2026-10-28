.class final Lza2/c$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lza2/c;->l()V
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
    c = "com.whoop.settings.banner.SettingsBannerCoordinator$initializeStateFlow$1"
    f = "SettingsBannerCoordinator.kt"
    l = {
        0x2d,
        0x2d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lza2/c;


# direct methods
.method public constructor <init>(Lza2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lza2/c;",
            "Lq83/d<",
            "-",
            "Lza2/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lza2/c$f;->y:Lza2/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lza2/c$f;

    iget-object v0, p0, Lza2/c$f;->y:Lza2/c;

    invoke-direct {p1, v0, p2}, Lza2/c$f;-><init>(Lza2/c;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lza2/c$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lza2/c$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lza2/c$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lza2/c$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lza2/c$f;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lza2/c$f;->w:Ljava/lang/Object;

    check-cast v1, Lec3/p1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lza2/c$f;->y:Lza2/c;

    invoke-static {p1}, Lza2/c;->g(Lza2/c;)Lec3/p1;

    move-result-object v1

    iget-object p1, p0, Lza2/c$f;->y:Lza2/c;

    iput-object v1, p0, Lza2/c$f;->w:Ljava/lang/Object;

    iput v4, p0, Lza2/c$f;->x:I

    invoke-static {p1, p0}, Lza2/c;->b(Lza2/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v4, 0x0

    iput-object v4, p0, Lza2/c$f;->w:Ljava/lang/Object;

    iput v3, p0, Lza2/c$f;->x:I

    check-cast v1, Lec3/h2;

    invoke-virtual {v1, p1, p0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v2, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    return-object v2
.end method
