.class final Lug1/c$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/c;->t(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)Lec3/l;
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
        "Ldc3/u;",
        "Lgt0/h;",
        "Ll83/a0;",
        "<anonymous>",
        "(Ldc3/u;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy$getDfuProgress$1"
    f = "DfuUpdateStrategy.kt"
    l = {
        0xe9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Landroid/bluetooth/BluetoothDevice;

.field final synthetic F:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lug1/c;


# direct methods
.method public constructor <init>(Lug1/c;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lug1/c;",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lug1/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug1/c$c;->z:Lug1/c;

    iput-object p2, p0, Lug1/c$c;->E:Landroid/bluetooth/BluetoothDevice;

    iput-object p3, p0, Lug1/c$c;->F:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lug1/c;Lug1/c$c$a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lug1/c$c;->h(Lug1/c;Lug1/c$c$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lug1/c;Lug1/c$c$a;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lug1/c;->i(Lug1/c;)Lpg1/a;

    move-result-object v0

    invoke-static {p0}, Lug1/c;->g(Lug1/c;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lpg1/a;->f(Landroid/content/Context;Lno/nordicsemi/android/dfu/DfuProgressListener;)V

    invoke-static {p0}, Lug1/c;->i(Lug1/c;)Lpg1/a;

    move-result-object p1

    invoke-static {p0}, Lug1/c;->g(Lug1/c;)Landroid/content/Context;

    move-result-object v0

    invoke-static {p0}, Lug1/c;->j(Lug1/c;)Lpg1/c;

    move-result-object p0

    invoke-virtual {p1, v0, p0}, Lpg1/a;->e(Landroid/content/Context;Lpg1/c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
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

    new-instance v0, Lug1/c$c;

    iget-object v1, p0, Lug1/c$c;->z:Lug1/c;

    iget-object v2, p0, Lug1/c$c;->E:Landroid/bluetooth/BluetoothDevice;

    iget-object v3, p0, Lug1/c$c;->F:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lug1/c$c;-><init>(Lug1/c;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lug1/c$c;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc3/u;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lug1/c$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lug1/c$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lug1/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lug1/c$c;->invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lug1/c$c;->y:Ljava/lang/Object;

    check-cast v0, Ldc3/u;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lug1/c$c;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lug1/c$c;->w:Ljava/lang/Object;

    check-cast v0, Lug1/c$c$a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lug1/c$c$a;

    iget-object v2, p0, Lug1/c$c;->z:Lug1/c;

    invoke-direct {p1, v0, v2}, Lug1/c$c$a;-><init>(Ldc3/u;Lug1/c;)V

    iget-object v2, p0, Lug1/c$c;->z:Lug1/c;

    invoke-static {v2}, Lug1/c;->i(Lug1/c;)Lpg1/a;

    move-result-object v2

    invoke-virtual {v2}, Lpg1/a;->a()V

    iget-object v2, p0, Lug1/c$c;->z:Lug1/c;

    invoke-static {v2}, Lug1/c;->i(Lug1/c;)Lpg1/a;

    move-result-object v2

    iget-object v4, p0, Lug1/c$c;->z:Lug1/c;

    invoke-static {v4}, Lug1/c;->g(Lug1/c;)Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v2, v4, p1}, Lpg1/a;->c(Landroid/content/Context;Lno/nordicsemi/android/dfu/DfuProgressListener;)V

    iget-object v2, p0, Lug1/c$c;->z:Lug1/c;

    invoke-static {v2}, Lug1/c;->i(Lug1/c;)Lpg1/a;

    move-result-object v2

    iget-object v4, p0, Lug1/c$c;->z:Lug1/c;

    invoke-static {v4}, Lug1/c;->g(Lug1/c;)Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lug1/c$c;->z:Lug1/c;

    invoke-static {v5}, Lug1/c;->j(Lug1/c;)Lpg1/c;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lpg1/a;->b(Landroid/content/Context;Lpg1/c;)V

    iget-object v2, p0, Lug1/c$c;->z:Lug1/c;

    invoke-virtual {v2}, Lug1/c;->h()Ltr2/n;

    move-result-object v2

    iget-object v4, p0, Lug1/c$c;->E:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v4}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lug1/c$c;->E:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v5}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "starting service for device "

    const-string v7, ", "

    invoke-static {v6, v4, v7, v5}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    new-array v5, v5, [Lqr2/a$a;

    invoke-interface {v2, v4, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v2, p0, Lug1/c$c;->z:Lug1/c;

    invoke-static {v2}, Lug1/c;->i(Lug1/c;)Lpg1/a;

    move-result-object v4

    iget-object v2, p0, Lug1/c$c;->E:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v5

    const-string v2, "getAddress(...)"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lug1/c$c;->E:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v2}, Ltt0/a;->a(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v6

    iget-object v9, p0, Lug1/c$c;->F:Ljava/lang/String;

    const/16 v11, 0xc

    const/4 v12, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const-class v13, Lcom/whoop/firmwareUpdateService/strategy/NewDfuService;

    invoke-virtual/range {v4 .. v13}, Lpg1/a;->d(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZIZLjava/lang/Class;)V

    iget-object v2, p0, Lug1/c$c;->z:Lug1/c;

    new-instance v4, Lug1/d;

    invoke-direct {v4, v2, p1}, Lug1/d;-><init>(Lug1/c;Lug1/c$c$a;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lug1/c$c;->y:Ljava/lang/Object;

    iput-object p1, p0, Lug1/c$c;->w:Ljava/lang/Object;

    iput v3, p0, Lug1/c$c;->x:I

    invoke-static {v0, v4, p0}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
