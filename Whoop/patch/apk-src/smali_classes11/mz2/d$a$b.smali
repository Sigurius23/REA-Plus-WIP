.class final Lmz2/d$a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmz2/d$a;->onScanResult(ILandroid/bluetooth/le/ScanResult;)V
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
    c = "com.whoop.whooplabs.io.HrDeviceScanner$scanCallback$1$onScanResult$1"
    f = "HrDeviceScanner.kt"
    l = {
        0x61
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field final synthetic G:Landroid/bluetooth/BluetoothDevice;

.field final synthetic H:Lmz2/d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;Lmz2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lmz2/d;",
            "Lq83/d<",
            "-",
            "Lmz2/d$a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmz2/d$a$b;->G:Landroid/bluetooth/BluetoothDevice;

    iput-object p2, p0, Lmz2/d$a$b;->H:Lmz2/d;

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

    new-instance p1, Lmz2/d$a$b;

    iget-object v0, p0, Lmz2/d$a$b;->G:Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, Lmz2/d$a$b;->H:Lmz2/d;

    invoke-direct {p1, v0, v1, p2}, Lmz2/d$a$b;-><init>(Landroid/bluetooth/BluetoothDevice;Lmz2/d;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lmz2/d$a$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmz2/d$a$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmz2/d$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmz2/d$a$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lmz2/d$a$b;->F:I

    const/4 v2, 0x1

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lmz2/d$a$b;->E:Ljava/lang/Object;

    check-cast v0, Lyw2/b;

    iget-object v0, p0, Lmz2/d$a$b;->z:Ljava/lang/Object;

    check-cast v0, Lyw2/b;

    iget-object v0, p0, Lmz2/d$a$b;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lmz2/d$a$b;->x:Ljava/lang/Object;

    check-cast v0, Lyb3/p;

    iget-object v0, p0, Lmz2/d$a$b;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lmz2/d$a$b;->G:Landroid/bluetooth/BluetoothDevice;

    invoke-static {p1}, Lyw2/c;->c(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lmz2/d$a$b;->H:Lmz2/d;

    invoke-static {v1}, Lmz2/d;->i(Lmz2/d;)Lyb3/p;

    move-result-object v1

    const-string v5, "pattern(...)"

    const/4 v6, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_2

    iget-object v0, p0, Lmz2/d$a$b;->H:Lmz2/d;

    invoke-static {v0}, Lmz2/d;->d(Lmz2/d;)Ltr2/n;

    move-result-object v0

    iget-object v1, v1, Lyb3/p;->w:Ljava/util/regex/Pattern;

    invoke-virtual {v1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " doesn\'t match "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v3

    :cond_2
    iget-object v1, p0, Lmz2/d$a$b;->H:Lmz2/d;

    invoke-static {v1}, Lmz2/d;->g(Lmz2/d;)Lyb3/p;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v7, p0, Lmz2/d$a$b;->H:Lmz2/d;

    invoke-virtual {v1, p1}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_3

    const-string v8, "BT device"

    invoke-static {p1, v8, v6}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v8

    if-eqz v8, :cond_4

    :cond_3
    invoke-static {v7}, Lmz2/d;->d(Lmz2/d;)Ltr2/n;

    move-result-object v0

    iget-object v1, v1, Lyb3/p;->w:Ljava/util/regex/Pattern;

    invoke-virtual {v1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " was blocked by "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " regex or due to a fallback name."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v3

    :cond_4
    iget-object v1, p0, Lmz2/d$a$b;->G:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    iget-object v5, p0, Lmz2/d$a$b;->H:Lmz2/d;

    invoke-static {v5}, Lmz2/d;->c(Lmz2/d;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lyw2/b;

    if-nez v5, :cond_5

    sget-object p1, Lyw2/b;->e:Lyw2/b$a;

    iget-object v5, p0, Lmz2/d$a$b;->G:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p1, v5}, Lyw2/b$a;->a(Landroid/bluetooth/BluetoothDevice;)Lyw2/b;

    move-result-object p1

    iget-object v5, p0, Lmz2/d$a$b;->H:Lmz2/d;

    invoke-static {v5}, Lmz2/d;->c(Lmz2/d;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lmz2/d$a$b;->H:Lmz2/d;

    invoke-static {v1}, Lmz2/d;->f(Lmz2/d;)Lec3/o1;

    move-result-object v1

    iput-object v4, p0, Lmz2/d$a$b;->w:Ljava/lang/Object;

    iput-object v4, p0, Lmz2/d$a$b;->x:Ljava/lang/Object;

    iput-object v4, p0, Lmz2/d$a$b;->y:Ljava/lang/Object;

    iput-object v4, p0, Lmz2/d$a$b;->z:Ljava/lang/Object;

    iput-object v4, p0, Lmz2/d$a$b;->E:Ljava/lang/Object;

    iput v2, p0, Lmz2/d$a$b;->F:I

    invoke-interface {v1, p1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_5
    iget-object v0, p0, Lmz2/d$a$b;->H:Lmz2/d;

    invoke-static {v0}, Lmz2/d;->c(Lmz2/d;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, p1}, Lyw2/b;->i(Ljava/lang/String;)Lyw2/b;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    :goto_0
    iget-object p1, p0, Lmz2/d$a$b;->H:Lmz2/d;

    invoke-static {p1}, Lmz2/d;->h(Lmz2/d;)Lec3/p1;

    move-result-object p1

    iget-object v0, p0, Lmz2/d$a$b;->H:Lmz2/d;

    invoke-static {v0}, Lmz2/d;->c(Lmz2/d;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v4, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v3
.end method
