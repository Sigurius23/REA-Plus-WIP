.class public final Lc0/h0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:Ld0/z1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Ld0/z1;)V
    .locals 0

    iput-object p1, p0, Lc0/h0;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lc0/h0;->x:Ld0/z1;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    check-cast p1, Ly2/t0;

    check-cast p2, Ly2/q0;

    check-cast p3, Ly3/a;

    iget-wide v0, p3, Ly3/a;->a:J

    invoke-interface {p2, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    invoke-interface {p1}, Ly2/r;->A()Z

    move-result p3

    const-wide v0, 0xffffffffL

    const/16 v2, 0x20

    if-eqz p3, :cond_0

    iget-object p3, p0, Lc0/h0;->x:Ld0/z1;

    iget-object p3, p3, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {p3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p3

    iget-object v3, p0, Lc0/h0;->w:Lkotlin/jvm/functions/Function1;

    invoke-interface {v3, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_0

    const-wide/16 v3, 0x0

    goto :goto_0

    :cond_0
    iget p3, p2, Ly2/j1;->w:I

    iget v3, p2, Ly2/j1;->x:I

    int-to-long v4, p3

    shl-long/2addr v4, v2

    int-to-long v6, v3

    and-long/2addr v6, v0

    or-long v3, v4, v6

    :goto_0
    shr-long v5, v3, v2

    long-to-int p3, v5

    and-long/2addr v0, v3

    long-to-int v0, v0

    new-instance v1, Lc0/g0;

    const/4 v2, 0x0

    invoke-direct {v1, p2, v2}, Lc0/g0;-><init>(Ly2/j1;I)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, v0, p2, v1}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
