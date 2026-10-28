.class final Lcom/mapbox/common/logger/MapboxLogger$w$1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/common/logger/MapboxLogger;->w(Lru/b;Lru/a;Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "invoke",
        "()V",
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
.field final synthetic $msg:Lru/a;

.field final synthetic $tag:Lru/b;

.field final synthetic $tr:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lru/b;Lru/a;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/common/logger/MapboxLogger$w$1;->$tag:Lru/b;

    iput-object p2, p0, Lcom/mapbox/common/logger/MapboxLogger$w$1;->$msg:Lru/a;

    iput-object p3, p0, Lcom/mapbox/common/logger/MapboxLogger$w$1;->$tr:Ljava/lang/Throwable;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/mapbox/common/logger/MapboxLogger$w$1;->invoke()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/mapbox/common/logger/MapboxLogger$w$1;->$tag:Lru/b;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, v0, Lru/b;->a:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 4
    :cond_0
    const-string v0, "MapboxLogger"

    :cond_1
    iget-object v1, p0, Lcom/mapbox/common/logger/MapboxLogger$w$1;->$msg:Lru/a;

    .line 5
    iget-object v1, v1, Lru/a;->a:Ljava/lang/String;

    .line 6
    iget-object v2, p0, Lcom/mapbox/common/logger/MapboxLogger$w$1;->$tr:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method
