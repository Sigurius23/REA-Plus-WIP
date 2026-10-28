.class final Llm0/a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llm0/a;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;Landroid/bluetooth/BluetoothAdapter;Lbc3/c0;Llm0/e;)V
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
        "Llm0/c;",
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
    c = "com.whoop.broadcastlisteners.BleStateChangeReceiver$flow$1"
    f = "BleStateChangeReceiver.kt"
    l = {
        0x2b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Llm0/a;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Llm0/e;


# direct methods
.method public constructor <init>(Llm0/e;Llm0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llm0/e;",
            "Llm0/a;",
            "Lq83/d<",
            "-",
            "Llm0/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llm0/a$b;->z:Llm0/e;

    iput-object p2, p0, Llm0/a$b;->E:Llm0/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Llm0/a;Llm0/a$b$a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llm0/a$b;->h(Llm0/a;Llm0/a$b$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Llm0/a;Llm0/a$b$a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llm0/a;->b(Llm0/a;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
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

    new-instance v0, Llm0/a$b;

    iget-object v1, p0, Llm0/a$b;->z:Llm0/e;

    iget-object v2, p0, Llm0/a$b;->E:Llm0/a;

    invoke-direct {v0, v1, v2, p2}, Llm0/a$b;-><init>(Llm0/e;Llm0/a;Lq83/d;)V

    iput-object p1, v0, Llm0/a$b;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Llm0/a$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llm0/a$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llm0/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llm0/a$b;->invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Llm0/a$b;->y:Ljava/lang/Object;

    check-cast v0, Ldc3/u;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Llm0/a$b;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Llm0/a$b;->w:Ljava/lang/Object;

    check-cast v0, Llm0/a$b$a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Llm0/a$b$a;

    invoke-direct {p1, v0}, Llm0/a$b$a;-><init>(Ldc3/u;)V

    iget-object v2, p0, Llm0/a$b;->z:Llm0/e;

    iget-object v4, p0, Llm0/a$b;->E:Llm0/a;

    invoke-static {v4}, Llm0/a;->b(Llm0/a;)Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Llm0/a$b;->E:Llm0/a;

    invoke-static {v5}, Llm0/a;->c(Llm0/a;)Landroid/content/IntentFilter;

    move-result-object v5

    const/4 v6, 0x4

    invoke-virtual {v2, v4, p1, v5, v6}, Llm0/e;->a(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    iget-object v2, p0, Llm0/a$b;->E:Llm0/a;

    invoke-static {v2}, Llm0/a;->a(Llm0/a;)Landroid/bluetooth/BluetoothAdapter;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_2

    sget-object v2, Llm0/c;->OFF:Llm0/c;

    move-object v4, v0

    check-cast v4, Ldc3/t;

    invoke-virtual {v4, v2}, Ldc3/t;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v2, p0, Llm0/a$b;->E:Llm0/a;

    new-instance v4, Llm0/b;

    invoke-direct {v4, v2, p1}, Llm0/b;-><init>(Llm0/a;Llm0/a$b$a;)V

    const/4 p1, 0x0

    iput-object p1, p0, Llm0/a$b;->y:Ljava/lang/Object;

    iput-object p1, p0, Llm0/a$b;->w:Ljava/lang/Object;

    iput v3, p0, Llm0/a$b;->x:I

    invoke-static {v0, v4, p0}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
