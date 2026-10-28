.class public final La1/k;
.super La3/o;
.source "SourceFile"

# interfaces
.implements La3/m;
.implements Lb1/f;


# instance fields
.field public Q:Lro/i;

.field public R:Ls83/i;

.field public S:Lkotlin/jvm/functions/Function1;

.field public T:Lkotlin/jvm/functions/Function1;

.field public U:Lbc3/c2;

.field public final V:Lp1/f0;

.field public W:Lh2/c;


# direct methods
.method public constructor <init>(Lro/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, La3/o;-><init>()V

    iput-object p1, p0, La1/k;->Q:Lro/i;

    check-cast p2, Ls83/i;

    iput-object p2, p0, La1/k;->R:Ls83/i;

    iput-object p3, p0, La1/k;->S:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La1/k;->T:Lkotlin/jvm/functions/Function1;

    new-instance p1, La1/j;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, La1/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object p1

    iput-object p1, p0, La1/k;->V:Lp1/f0;

    sget-object p1, Lh2/c;->e:Lh2/c;

    iput-object p1, p0, La1/k;->W:Lh2/c;

    return-void
.end method


# virtual methods
.method public final G0(Ly2/y;)J
    .locals 2

    invoke-virtual {p0, p1}, La1/k;->v0(Ly2/y;)Lh2/c;

    move-result-object p1

    invoke-virtual {p1}, Lh2/c;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public final P0()V
    .locals 1

    iget-object v0, p0, La1/k;->Q:Lro/i;

    iput-object p0, v0, Lro/i;->x:Ljava/lang/Object;

    return-void
.end method

.method public final Q0()V
    .locals 2

    iget-object v0, p0, La1/k;->Q:Lro/i;

    const/4 v1, 0x0

    iput-object v1, v0, Lro/i;->x:Ljava/lang/Object;

    return-void
.end method

.method public final s()Lx0/c;
    .locals 1

    iget-object v0, p0, La1/k;->V:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx0/c;

    return-object v0
.end method

.method public final v0(Ly2/y;)Lh2/c;
    .locals 1

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    iget-object p1, p0, La1/k;->W:Lh2/c;

    return-object p1

    :cond_0
    iget-object v0, p0, La1/k;->T:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh2/c;

    if-nez p1, :cond_1

    iget-object p1, p0, La1/k;->W:Lh2/c;

    return-object p1

    :cond_1
    iput-object p1, p0, La1/k;->W:Lh2/c;

    return-object p1
.end method
