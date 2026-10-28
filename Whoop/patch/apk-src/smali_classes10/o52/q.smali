.class public final synthetic Lo52/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrv/t;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lo52/q;->a:I

    iput-object p1, p0, Lo52/q;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/mapbox/geojson/Point;)V
    .locals 2

    iget v0, p0, Lo52/q;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo52/q;->b:Ljava/lang/Object;

    check-cast v0, Lrv/m;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v0, Lrv/m;->F:Lcom/mapbox/geojson/Point;

    iget-object v0, v0, Lrv/m;->G:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrv/t;

    invoke-interface {v1, p1}, Lrv/t;->a(Lcom/mapbox/geojson/Point;)V

    goto :goto_0

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lo52/q;->b:Ljava/lang/Object;

    check-cast v0, Lo52/w;

    invoke-static {v0, p1}, Lo52/w;->P(Lo52/w;Lcom/mapbox/geojson/Point;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
