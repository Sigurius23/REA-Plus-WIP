.class public final Li20/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/a0;


# instance fields
.field public final w:Li20/y0;

.field public final x:Lf1/p1;

.field public y:Leg/j;


# direct methods
.method public constructor <init>(Li20/y0;Lf1/p1;)V
    .locals 1

    const-string v0, "launcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li20/n1;->w:Li20/y0;

    iput-object p2, p0, Li20/n1;->x:Lf1/p1;

    return-void
.end method


# virtual methods
.method public final d(Leg/j;)V
    .locals 0

    iput-object p1, p0, Li20/n1;->y:Leg/j;

    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Li20/n1;->x:Lf1/p1;

    iget-object v0, v0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p0, Li20/n1;->w:Li20/y0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "toString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Li20/y0;->c:Ljava/util/LinkedHashMap;

    new-instance v4, Ljava/lang/ref/WeakReference;

    invoke-direct {v4, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v1, Li20/y0;->b:Lj/d;

    if-eqz v3, :cond_0

    new-instance v4, Li20/c0;

    iget-object v1, v1, Li20/y0;->a:Li20/b0;

    invoke-direct {v4, v2, p1, v0, v1}, Li20/c0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li20/b0;)V

    const/4 p1, 0x0

    invoke-virtual {v3, v4, p1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :cond_0
    return-void
.end method

.method public final f()Lf1/p1;
    .locals 1

    iget-object v0, p0, Li20/n1;->x:Lf1/p1;

    return-object v0
.end method
