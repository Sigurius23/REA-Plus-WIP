.class public final Lt23/q0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lt23/s0;


# direct methods
.method public synthetic constructor <init>(Lt23/s0;I)V
    .locals 0

    iput p2, p0, Lt23/q0;->w:I

    iput-object p1, p0, Lt23/q0;->x:Lt23/s0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lt23/q0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/util/List;

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lt23/g2;

    iget-object v2, v2, Lt23/g2;->a:Ljava/lang/String;

    iget-object v3, p0, Lt23/q0;->x:Lt23/s0;

    iget-object v3, v3, Lt23/s0;->b:Lt23/c0;

    iget-object v3, v3, Lt23/c0;->D:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0

    :pswitch_0
    check-cast p1, Ljava/util/Map;

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt23/q0;->x:Lt23/s0;

    iget-object v1, v0, Lt23/s0;->b:Lt23/c0;

    iget-object v1, v1, Lt23/c0;->D:Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt23/g2;

    if-nez p1, :cond_4

    iget-object p1, v0, Lt23/s0;->v:Lj53/m;

    iget-object p1, p1, Lj53/m;->j:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lt23/g2;

    iget-object v1, v1, Lt23/g2;->h:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    move-object p1, v0

    check-cast p1, Lt23/g2;

    :cond_4
    return-object p1

    :pswitch_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallIngressResponse;

    if-eqz p1, :cond_5

    iget-object v0, p0, Lt23/q0;->x:Lt23/s0;

    iget-object v0, v0, Lt23/s0;->b:Lt23/c0;

    iget-object v0, v0, Lt23/c0;->g:Lt23/b4;

    iget-object v0, v0, Lt23/b4;->z:Ljava/lang/String;

    new-instance v1, Lc43/f;

    new-instance v2, Lc43/n;

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallIngressResponse;->getRtmp()Lio/getstream/android/video/generated/models/RTMPIngress;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/RTMPIngress;->getAddress()Ljava/lang/String;

    move-result-object p1

    const-string v3, "address"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "streamKey"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object p1, v2, Lc43/n;->a:Ljava/lang/String;

    iput-object v0, v2, Lc43/n;->b:Ljava/lang/String;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v2, v1, Lc43/f;->a:Lc43/n;

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    :goto_2
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
