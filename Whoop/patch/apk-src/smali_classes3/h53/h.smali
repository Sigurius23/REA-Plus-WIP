.class public final Lh53/h;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lqg3/d;


# direct methods
.method public synthetic constructor <init>(Lqg3/d;I)V
    .locals 0

    iput p2, p0, Lh53/h;->w:I

    iput-object p1, p0, Lh53/h;->x:Lqg3/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lh53/h;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Li53/c;

    check-cast p2, Li53/o;

    const-string v0, "$this$onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lh53/h;->x:Lqg3/d;

    invoke-virtual {p1}, Lqg3/d;->s()Ly43/b;

    move-result-object p1

    iget-object p1, p1, Ly43/b;->d:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li53/j;

    return-object p1

    :pswitch_0
    check-cast p1, Li53/f;

    check-cast p2, Li53/m;

    const-string v0, "$this$onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lh53/h;->x:Lqg3/d;

    invoke-virtual {p1}, Lqg3/d;->s()Ly43/b;

    move-result-object p1

    iget-object p1, p1, Ly43/b;->d:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li53/j;

    return-object p1

    :pswitch_1
    check-cast p1, Li53/j;

    check-cast p2, Li53/s;

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh53/h;->x:Lqg3/d;

    invoke-virtual {v0}, Lqg3/d;->r()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "current state: "

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", event "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    instance-of v1, p2, Li53/k;

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lqg3/d;->r()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v3, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "SfuSocketStateEvent.Connect"

    invoke-interface {p1, v3, v1, v0, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    new-instance p1, Li53/b;

    check-cast p2, Li53/k;

    iget-object v0, p2, Li53/k;->a:Lx43/c;

    iget-object p2, p2, Li53/k;->b:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    invoke-direct {p1, v0, p2}, Li53/b;-><init>(Lx43/c;Lstream/video/sfu/models/WebsocketReconnectStrategy;)V

    :cond_2
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
