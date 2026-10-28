.class public final Lrv/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/location/LocationObserver;


# instance fields
.field public a:Z

.field public final synthetic b:Lcom/mapbox/common/Cancelable;

.field public final synthetic c:Ldc3/u;


# direct methods
.method public constructor <init>(Lcom/mapbox/common/Cancelable;Ldc3/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrv/i;->b:Lcom/mapbox/common/Cancelable;

    iput-object p2, p0, Lrv/i;->c:Ldc3/u;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lrv/i;->a:Z

    return-void
.end method


# virtual methods
.method public final onLocationUpdateReceived(Ljava/util/List;)V
    .locals 1

    const-string v0, "locations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lrv/i;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lrv/i;->b:Lcom/mapbox/common/Cancelable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/mapbox/common/Cancelable;->cancel()V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lrv/i;->a:Z

    :cond_1
    iget-object v0, p0, Lrv/i;->c:Ldc3/u;

    invoke-static {p1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lvd/f;->X(Ldc3/x;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
