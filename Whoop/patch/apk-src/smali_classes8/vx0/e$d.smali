.class final Lvx0/e$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvx0/e;->o()V
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
    c = "com.whoop.debug.whoopble.WhoopBleDebugViewModel$startScan$2"
    f = "WhoopBleDebugViewModel.kt"
    l = {
        0x4e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lvx0/e;


# direct methods
.method public constructor <init>(Lvx0/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvx0/e;",
            "Lq83/d<",
            "-",
            "Lvx0/e$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvx0/e$d;->x:Lvx0/e;

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

    new-instance p1, Lvx0/e$d;

    iget-object v0, p0, Lvx0/e$d;->x:Lvx0/e;

    invoke-direct {p1, v0, p2}, Lvx0/e$d;-><init>(Lvx0/e;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lvx0/e$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvx0/e$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvx0/e$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvx0/e$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvx0/e$d;->w:I

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

    iget-object p1, p0, Lvx0/e$d;->x:Lvx0/e;

    invoke-static {p1}, Lvx0/e;->g(Lvx0/e;)Lft0/c;

    move-result-object p1

    sget-object v1, Lnj0/f;->a:Lnj0/f$a;

    invoke-virtual {v1}, Lnj0/f$a;->c()Ljava/util/Set;

    move-result-object v1

    invoke-interface {p1, v1}, Lft0/c;->a(Ljava/util/Set;)Lec3/l;

    move-result-object p1

    new-instance v1, Lvx0/e$d$a;

    iget-object v3, p0, Lvx0/e$d;->x:Lvx0/e;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, Lvx0/e$d$a;-><init>(Lvx0/e;Lq83/d;)V

    new-instance v3, Lec3/a0;

    invoke-direct {v3, p1, v1}, Lec3/a0;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance p1, Lvx0/e$d$b;

    iget-object v1, p0, Lvx0/e$d;->x:Lvx0/e;

    invoke-direct {p1, v1, v4}, Lvx0/e$d$b;-><init>(Lvx0/e;Lq83/d;)V

    new-instance v1, Lec3/y;

    invoke-direct {v1, v3, p1}, Lec3/y;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance p1, Lvx0/e$d$c;

    iget-object v3, p0, Lvx0/e$d;->x:Lvx0/e;

    invoke-direct {p1, v3}, Lvx0/e$d$c;-><init>(Lvx0/e;)V

    iput v2, p0, Lvx0/e$d;->w:I

    invoke-virtual {v1, p1, p0}, Lec3/y;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
