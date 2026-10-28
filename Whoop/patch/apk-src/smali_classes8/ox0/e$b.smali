.class final Lox0/e$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lox0/e;->t(B)V
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
    c = "com.whoop.debug.battery.BatteryDebugViewModel$setFakeBatteryLevel$1"
    f = "BatteryDebugViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lox0/e;

.field final synthetic y:B


# direct methods
.method public constructor <init>(Lox0/e;BLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lox0/e;",
            "B",
            "Lq83/d<",
            "-",
            "Lox0/e$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lox0/e$b;->x:Lox0/e;

    iput-byte p2, p0, Lox0/e$b;->y:B

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

    new-instance p1, Lox0/e$b;

    iget-object v0, p0, Lox0/e$b;->x:Lox0/e;

    iget-byte v1, p0, Lox0/e$b;->y:B

    invoke-direct {p1, v0, v1, p2}, Lox0/e$b;-><init>(Lox0/e;BLq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lox0/e$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lox0/e$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lox0/e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lox0/e$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    const-string v0, "Fake battery level set to "

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lox0/e$b;->w:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lox0/e$b;->x:Lox0/e;

    invoke-static {p1}, Lox0/e;->l(Lox0/e;)Lec3/p1;

    move-result-object p1

    sget-object v1, Lox0/d$b;->a:Lox0/d$b;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    const/4 p1, 0x0

    :try_start_0
    iget-object v1, p0, Lox0/e$b;->x:Lox0/e;

    invoke-static {v1}, Lox0/e;->j(Lox0/e;)Lci2/b;

    move-result-object v1

    invoke-interface {v1}, Lci2/b;->b()Lec3/t1;

    move-result-object v1

    invoke-interface {v1}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v1

    iget-byte v2, p0, Lox0/e$b;->y:B

    iget-object v3, p0, Lox0/e$b;->x:Lox0/e;

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljk0/d;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljk0/d;->b()Lkk0/a;

    move-result-object v1

    invoke-virtual {v1, v2}, Lkk0/a;->m(B)V

    invoke-static {v3}, Lox0/e;->l(Lox0/e;)Lec3/p1;

    move-result-object v1

    new-instance v3, Lox0/d$d;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "%"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lox0/d$d;-><init>(Ljava/lang/String;)V

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, p1, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-static {v3}, Lox0/e;->l(Lox0/e;)Lec3/p1;

    move-result-object v0

    new-instance v1, Lox0/d$a;

    const-string v2, "No strap connected - can\'t set fake battery level."

    invoke-direct {v1, v2}, Lox0/d$a;-><init>(Ljava/lang/String;)V

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, p1, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_0
    iget-object v1, p0, Lox0/e$b;->x:Lox0/e;

    invoke-static {v1}, Lox0/e;->l(Lox0/e;)Lec3/p1;

    move-result-object v1

    new-instance v2, Lox0/d$a;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v3, "Failed to set battery level: "

    invoke-static {v3, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lox0/d$a;-><init>(Ljava/lang/String;)V

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, p1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
