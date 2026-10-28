.class public final Lch/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnh/i;
.implements Ly2/c0;


# instance fields
.field public final w:Lec3/h2;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-wide v0, Lch/v;->a:J

    new-instance v2, Ly3/a;

    invoke-direct {v2, v0, v1}, Ly3/a;-><init>(J)V

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lch/p;->w:Lec3/h2;

    return-void
.end method


# virtual methods
.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 3

    new-instance v0, Ly3/a;

    invoke-direct {v0, p3, p4}, Ly3/a;-><init>(J)V

    iget-object v1, p0, Lch/p;->w:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget p3, p2, Ly2/j1;->w:I

    iget p4, p2, Ly2/j1;->x:I

    new-instance v0, Lch/m;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lch/m;-><init>(Ly2/j1;I)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, p4, p2, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final j(Lbh/g;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lch/o;

    const/4 v1, 0x0

    iget-object v2, p0, Lch/p;->w:Lec3/h2;

    invoke-direct {v0, v2, v1}, Lch/o;-><init>(Lec3/l;I)V

    invoke-static {v0, p1}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
