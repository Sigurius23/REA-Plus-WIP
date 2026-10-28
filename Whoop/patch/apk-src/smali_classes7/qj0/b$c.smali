.class final Lqj0/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqj0/b;->j(Lxj0/b;JZLq83/d;)Ljava/lang/Object;
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
        "Lzj0/h;",
        "<anonymous>",
        "(Lbc3/c0;)Lzj0/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ble.device.CommandChannel$send$2$1"
    f = "CommandChannel.kt"
    l = {
        0x52
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field w:I

.field final synthetic x:Lqj0/b;

.field final synthetic y:[B

.field final synthetic z:Lxj0/b;


# direct methods
.method public constructor <init>(Lqj0/b;[BLxj0/b;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqj0/b;",
            "[B",
            "Lxj0/b;",
            "Z",
            "Lq83/d<",
            "-",
            "Lqj0/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqj0/b$c;->x:Lqj0/b;

    iput-object p2, p0, Lqj0/b$c;->y:[B

    iput-object p3, p0, Lqj0/b$c;->z:Lxj0/b;

    iput-boolean p4, p0, Lqj0/b$c;->E:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lqj0/b$c;

    iget-object v1, p0, Lqj0/b$c;->x:Lqj0/b;

    iget-object v2, p0, Lqj0/b$c;->y:[B

    iget-object v3, p0, Lqj0/b$c;->z:Lxj0/b;

    iget-boolean v4, p0, Lqj0/b$c;->E:Z

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lqj0/b$c;-><init>(Lqj0/b;[BLxj0/b;ZLq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lzj0/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lqj0/b$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lqj0/b$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lqj0/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lqj0/b$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lqj0/b$c;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lqj0/b$c;->x:Lqj0/b;

    invoke-static {p1}, Lqj0/b;->c(Lqj0/b;)Lec3/o1;

    move-result-object p1

    new-instance v1, Lqj0/b$c$a;

    iget-object v3, p0, Lqj0/b$c;->x:Lqj0/b;

    iget-object v4, p0, Lqj0/b$c;->y:[B

    const/4 v5, 0x0

    invoke-direct {v1, v3, v4, v5}, Lqj0/b$c$a;-><init>(Lqj0/b;[BLq83/d;)V

    new-instance v3, Lec3/m2;

    invoke-direct {v3, p1, v1}, Lec3/m2;-><init>(Lec3/t1;Lc93/m;)V

    iget-object p1, p0, Lqj0/b$c;->x:Lqj0/b;

    iget-object v1, p0, Lqj0/b$c;->z:Lxj0/b;

    new-instance v4, Lqj0/b$c$c;

    invoke-direct {v4, v3, p1, v1}, Lqj0/b$c$c;-><init>(Lec3/l;Lqj0/b;Lxj0/b;)V

    new-instance p1, Lqj0/b$c$b;

    iget-boolean v1, p0, Lqj0/b$c;->E:Z

    invoke-direct {p1, v1, v5}, Lqj0/b$c$b;-><init>(ZLq83/d;)V

    iput v2, p0, Lqj0/b$c;->w:I

    invoke-static {v4, p1, p0}, Lec3/v;->z(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
