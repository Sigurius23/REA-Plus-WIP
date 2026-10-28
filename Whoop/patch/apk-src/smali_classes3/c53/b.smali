.class public final Lc53/b;
.super Lq83/a;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/CoroutineExceptionHandler;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(Lq83/i;I)V
    .locals 0

    iput p2, p0, Lc53/b;->w:I

    invoke-direct {p0, p1}, Lq83/a;-><init>(Lq83/i;)V

    return-void
.end method

.method private final s(Lq83/j;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final handleException(Lq83/j;Ljava/lang/Throwable;)V
    .locals 5

    iget v0, p0, Lc53/b;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Error in ClientEventReporter: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ClientEvent"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :pswitch_0
    return-void

    :pswitch_1
    sget-object p1, Lio/getstream/video/android/core/notifications/internal/service/CallService;->I:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb23/k;

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[CallService#Scope] Uncaught exception: "

    invoke-static {v0, p2}, Lb9/y;->n(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v2, v0, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :pswitch_2
    sget-object v0, Lbc3/b0;->x:Lbc3/j1;

    invoke-interface {p1, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    check-cast p1, Lbc3/b0;

    if-eqz p1, :cond_1

    iget-object p1, p1, Lbc3/b0;->w:Ljava/lang/String;

    if-nez p1, :cond_2

    :cond_1
    const-string p1, "unknown"

    :cond_2
    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    const-string v2, "ClientScope"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lb23/i;->c:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[ClientScope] Uncaught exception in coroutine "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, v2, p1, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
