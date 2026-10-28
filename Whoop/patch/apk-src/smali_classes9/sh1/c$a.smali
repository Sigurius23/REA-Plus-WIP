.class final Lsh1/c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsh1/c;->g()V
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
    c = "com.whoop.gps.collector.BackgroundLocationCollector$getCurrentLocation$1"
    f = "BackgroundLocationCollector.kt"
    l = {
        0x55,
        0x58
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Lsh1/c;


# direct methods
.method public constructor <init>(Lsh1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsh1/c;",
            "Lq83/d<",
            "-",
            "Lsh1/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsh1/c$a;->z:Lsh1/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lsh1/c$a;

    iget-object v0, p0, Lsh1/c$a;->z:Lsh1/c;

    invoke-direct {p1, v0, p2}, Lsh1/c$a;-><init>(Lsh1/c;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsh1/c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsh1/c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsh1/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsh1/c$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsh1/c$a;->y:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lsh1/c$a;->x:Ljava/lang/Object;

    check-cast v0, Lyh1/a;

    iget-object v0, p0, Lsh1/c$a;->w:Ljava/lang/Object;

    check-cast v0, Landroid/location/Location;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsh1/c$a;->z:Lsh1/c;

    invoke-static {p1}, Lsh1/c;->b(Lsh1/c;)Lsh1/g;

    move-result-object p1

    iput v4, p0, Lsh1/c$a;->y:I

    const/16 v1, 0x66

    invoke-interface {p1, v1, p0}, Lsh1/g;->c(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Landroid/location/Location;

    if-eqz p1, :cond_5

    const-string v1, "app_foreground"

    invoke-static {p1, v1}, Lki1/b;->a(Landroid/location/Location;Ljava/lang/String;)Lyh1/a;

    move-result-object v1

    iget-object v4, p0, Lsh1/c$a;->z:Lsh1/c;

    invoke-static {v4}, Lsh1/c;->a(Lsh1/c;)Lii1/a;

    move-result-object v4

    iput-object p1, p0, Lsh1/c$a;->w:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, p0, Lsh1/c$a;->x:Ljava/lang/Object;

    iput v3, p0, Lsh1/c$a;->y:I

    invoke-interface {v4, v1, p0}, Lii1/a;->c(Lyh1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    move-object v0, p1

    :goto_2
    iget-object p1, p0, Lsh1/c$a;->z:Lsh1/c;

    invoke-static {p1}, Lsh1/c;->c(Lsh1/c;)Ltr2/n;

    move-result-object p1

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    const-string v5, "Current location fetched and saved: lat="

    const-string v6, ", lng="

    invoke-static {v5, v3, v4, v6}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lsh1/c$a;->z:Lsh1/c;

    invoke-static {p1}, Lsh1/c;->c(Lsh1/c;)Ltr2/n;

    move-result-object p1

    const-string v0, "No current location available"

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
