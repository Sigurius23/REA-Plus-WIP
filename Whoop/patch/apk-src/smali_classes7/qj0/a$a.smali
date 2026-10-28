.class final Lqj0/a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqj0/a;->a(Lqj0/h;)Lqj0/d;
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "frame",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ble.device.BleDeviceSessionFactory$create$1"
    f = "BleDeviceSessionFactory.kt"
    l = {
        0x31
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lpj0/a;

.field final synthetic z:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Lpj0/a;Ljava/util/UUID;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpj0/a;",
            "Ljava/util/UUID;",
            "Lq83/d<",
            "-",
            "Lqj0/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqj0/a$a;->y:Lpj0/a;

    iput-object p2, p0, Lqj0/a$a;->z:Ljava/util/UUID;

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

    new-instance v0, Lqj0/a$a;

    iget-object v1, p0, Lqj0/a$a;->y:Lpj0/a;

    iget-object v2, p0, Lqj0/a$a;->z:Ljava/util/UUID;

    invoke-direct {v0, v1, v2, p2}, Lqj0/a$a;-><init>(Lpj0/a;Ljava/util/UUID;Lq83/d;)V

    iput-object p1, v0, Lqj0/a$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f([BLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lqj0/a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lqj0/a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lqj0/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lqj0/a$a;->f([BLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lqj0/a$a;->x:Ljava/lang/Object;

    check-cast v0, [B

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lqj0/a$a;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lqj0/a$a;->y:Lpj0/a;

    iget-object v2, p0, Lqj0/a$a;->z:Ljava/util/UUID;

    const/4 v4, 0x0

    iput-object v4, p0, Lqj0/a$a;->x:Ljava/lang/Object;

    iput v3, p0, Lqj0/a$a;->w:I

    invoke-interface {p1, v2, v0, p0}, Lpj0/a;->j(Ljava/util/UUID;[BLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    instance-of p1, p1, Lpj0/d$e;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
