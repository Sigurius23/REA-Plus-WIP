.class final Lcom/mapbox/maps/MapboxMap$loadStyleUri$1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/MapboxMap;->loadStyleUri(Ljava/lang/String;Lcom/mapbox/maps/TransitionOptions;Lcom/mapbox/maps/Style$OnStyleLoaded;Lnv/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Luu/b;",
        "Ll83/a0;",
        "invoke",
        "(Luu/b;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $styleTransitionOptions:Lcom/mapbox/maps/TransitionOptions;


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/TransitionOptions;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/MapboxMap$loadStyleUri$1;->$styleTransitionOptions:Lcom/mapbox/maps/TransitionOptions;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Luu/b;

    invoke-virtual {p0, p1}, Lcom/mapbox/maps/MapboxMap$loadStyleUri$1;->invoke(Luu/b;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Luu/b;)V
    .locals 2

    const-string v0, "$this$style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/MapboxMap$loadStyleUri$1;->$styleTransitionOptions:Lcom/mapbox/maps/TransitionOptions;

    if-eqz v0, :cond_0

    .line 3
    new-instance v1, Lcom/mapbox/maps/TransitionOptions$Builder;

    invoke-direct {v1}, Lcom/mapbox/maps/TransitionOptions$Builder;-><init>()V

    .line 4
    invoke-virtual {v0}, Lcom/mapbox/maps/TransitionOptions;->toBuilder()Lcom/mapbox/maps/TransitionOptions$Builder;

    .line 5
    invoke-virtual {v1}, Lcom/mapbox/maps/TransitionOptions$Builder;->build()Lcom/mapbox/maps/TransitionOptions;

    move-result-object v0

    const-string v1, "transition"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iput-object v0, p1, Luu/b;->f:Lcom/mapbox/maps/TransitionOptions;

    :cond_0
    return-void
.end method
