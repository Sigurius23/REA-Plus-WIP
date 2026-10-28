.class final Lsh1/f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsh1/f;->d(Ljava/util/List;)V
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
    c = "com.whoop.gps.collector.KoinBackgroundLocationHelper$processLocations$1"
    f = "BackgroundLocationReceiver.kt"
    l = {
        0x2b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic F:Lsh1/f;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lsh1/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/location/Location;",
            ">;",
            "Lsh1/f;",
            "Lq83/d<",
            "-",
            "Lsh1/f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsh1/f$a;->E:Ljava/util/List;

    iput-object p2, p0, Lsh1/f$a;->F:Lsh1/f;

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

    new-instance p1, Lsh1/f$a;

    iget-object v0, p0, Lsh1/f$a;->E:Ljava/util/List;

    iget-object v1, p0, Lsh1/f$a;->F:Lsh1/f;

    invoke-direct {p1, v0, v1, p2}, Lsh1/f$a;-><init>(Ljava/util/List;Lsh1/f;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsh1/f$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsh1/f$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsh1/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsh1/f$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsh1/f$a;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lsh1/f$a;->y:Ljava/lang/Object;

    check-cast v1, Lyh1/a;

    iget-object v3, p0, Lsh1/f$a;->x:Ljava/lang/Object;

    check-cast v3, Landroid/location/Location;

    iget-object v4, p0, Lsh1/f$a;->w:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsh1/f$a;->E:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v4, p1

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Landroid/location/Location;

    const-string p1, "distance_change"

    invoke-static {v3, p1}, Lki1/b;->a(Landroid/location/Location;Ljava/lang/String;)Lyh1/a;

    move-result-object v1

    iget-object p1, p0, Lsh1/f$a;->F:Lsh1/f;

    invoke-static {p1}, Lsh1/f;->a(Lsh1/f;)Lii1/a;

    move-result-object p1

    iput-object v4, p0, Lsh1/f$a;->w:Ljava/lang/Object;

    iput-object v3, p0, Lsh1/f$a;->x:Ljava/lang/Object;

    iput-object v1, p0, Lsh1/f$a;->y:Ljava/lang/Object;

    iput v2, p0, Lsh1/f$a;->z:I

    invoke-interface {p1, v1, p0}, Lii1/a;->c(Lyh1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_1
    iget-object p1, p0, Lsh1/f$a;->F:Lsh1/f;

    invoke-virtual {p1}, Lsh1/f;->c()Ltr2/n;

    move-result-object p1

    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v5

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v7

    invoke-virtual {v1}, Lyh1/a;->e()Lyh1/b;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lyh1/b;->c()D

    move-result-wide v9

    new-instance v1, Ljava/lang/Double;

    invoke-direct {v1, v9, v10}, Ljava/lang/Double;-><init>(D)V

    goto :goto_2

    :cond_3
    const-string v1, "null"

    :goto_2
    const-string v3, "Location saved: lat="

    const-string v9, ", lng="

    invoke-static {v3, v5, v6, v9}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v5, ", speed="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {p1, v1, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
