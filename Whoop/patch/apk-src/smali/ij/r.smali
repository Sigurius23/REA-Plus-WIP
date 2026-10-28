.class public final synthetic Lij/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amplitude/quickjs/wrapper/JSCallFunction;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lij/t;

.field public final synthetic c:Lij/m;


# direct methods
.method public synthetic constructor <init>(Lij/m;Lij/t;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lij/r;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lij/r;->c:Lij/m;

    iput-object p2, p0, Lij/r;->b:Lij/t;

    return-void
.end method

.method public synthetic constructor <init>(Lij/t;Lij/m;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lij/r;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lij/r;->b:Lij/t;

    iput-object p2, p0, Lij/r;->c:Lij/m;

    return-void
.end method


# virtual methods
.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lij/r;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lij/r;->b:Lij/t;

    iget-object v0, v0, Lij/t;->G:Ljava/util/LinkedHashMap;

    array-length v1, p1

    const/4 v2, 0x1

    if-lt v1, v2, :cond_0

    const/4 v1, 0x0

    aget-object p1, p1, v1

    instance-of v1, p1, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Runnable;

    if-eqz p1, :cond_0

    iget-object v3, p0, Lij/r;->c:Lij/m;

    iget-object v3, v3, Lij/m;->d:Landroid/os/Handler;

    invoke-virtual {v3, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    return-object p1

    :pswitch_0
    array-length v0, p1

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    const/4 v0, 0x0

    aget-object v0, p1, v0

    instance-of v1, v0, Lcom/amplitude/quickjs/wrapper/JSFunction;

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    aget-object p1, p1, v1

    instance-of v1, p1, Ljava/lang/Number;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/amplitude/quickjs/wrapper/JSFunction;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    iget-object p1, p0, Lij/r;->c:Lij/m;

    iget-object p1, p1, Lij/m;->d:Landroid/os/Handler;

    iget-object v3, p0, Lij/r;->b:Lij/t;

    iget-object v4, v3, Lij/t;->H:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v4

    new-instance v6, Lij/s;

    invoke-direct {v6, v0, v3, v4, v5}, Lij/s;-><init>(Lcom/amplitude/quickjs/wrapper/JSFunction;Lij/t;J)V

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v3, v3, Lij/t;->G:Ljava/util/LinkedHashMap;

    invoke-interface {v3, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v6, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
