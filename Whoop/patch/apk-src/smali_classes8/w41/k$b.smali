.class final Lw41/k$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw41/k;->n(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZLandroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.organism.activitymap.ActivityMapKt$DefaultActivityMap$1$1"
    f = "ActivityMap.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:F

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lw41/f;

.field final synthetic y:Leu/g;

.field final synthetic z:Lcom/google/android/gms/maps/model/LatLng;


# direct methods
.method public constructor <init>(Lw41/f;Leu/g;Lcom/google/android/gms/maps/model/LatLng;FLp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw41/f;",
            "Leu/g;",
            "Lcom/google/android/gms/maps/model/LatLng;",
            "F",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lw41/k$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lw41/k$b;->x:Lw41/f;

    iput-object p2, p0, Lw41/k$b;->y:Leu/g;

    iput-object p3, p0, Lw41/k$b;->z:Lcom/google/android/gms/maps/model/LatLng;

    iput p4, p0, Lw41/k$b;->E:F

    iput-object p5, p0, Lw41/k$b;->F:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lw41/k$b;

    iget-object v1, p0, Lw41/k$b;->x:Lw41/f;

    iget-object v2, p0, Lw41/k$b;->y:Leu/g;

    iget-object v3, p0, Lw41/k$b;->z:Lcom/google/android/gms/maps/model/LatLng;

    iget v4, p0, Lw41/k$b;->E:F

    iget-object v5, p0, Lw41/k$b;->F:Lp1/c1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lw41/k$b;-><init>(Lw41/f;Leu/g;Lcom/google/android/gms/maps/model/LatLng;FLp1/c1;Lq83/d;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lw41/k$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lw41/k$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lw41/k$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lw41/k$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lw41/k$b;->w:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lw41/k$b;->x:Lw41/f;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lw41/k$b;->F:Lp1/c1;

    invoke-static {p1}, Lw41/k;->J(Lp1/c1;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lw41/k$b;->y:Leu/g;

    iget-object v0, p0, Lw41/k$b;->z:Lcom/google/android/gms/maps/model/LatLng;

    iget v1, p0, Lw41/k$b;->E:F

    invoke-static {v0, v1}, Ls30/e;->n(Lcom/google/android/gms/maps/model/LatLng;F)Lup/a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p1, Leu/g;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p1, Leu/g;->e:Lup/b;

    const/4 v3, 0x0

    iput-object v3, p1, Leu/g;->g:Lbc3/k1;

    if-nez v2, :cond_1

    new-instance v2, Le10/k0;

    const/4 v3, 0x5

    invoke-direct {v2, v0, v3}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    iget-object v0, p1, Leu/g;->f:Leu/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Leu/d;->d()V

    :cond_0
    iput-object v2, p1, Leu/g;->f:Leu/d;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v0}, Lup/b;->c(Lup/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v1

    iget-object p1, p0, Lw41/k$b;->F:Lp1/c1;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lw41/k;->K(Lp1/c1;Z)V

    goto :goto_2

    :goto_1
    monitor-exit v1

    throw p1

    :cond_2
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
