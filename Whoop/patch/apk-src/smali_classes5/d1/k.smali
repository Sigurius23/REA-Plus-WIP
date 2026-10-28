.class public final Ld1/k;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/m;
.implements La3/s;
.implements La3/n;


# instance fields
.field public O:Ld1/b;

.field public P:Lu0/s0;

.field public Q:Lf1/s1;

.field public final R:Lp1/k1;


# direct methods
.method public constructor <init>(Ld1/b;Lu0/s0;Lf1/s1;)V
    .locals 0

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p1, p0, Ld1/k;->O:Ld1/b;

    iput-object p2, p0, Ld1/k;->P:Lu0/s0;

    iput-object p3, p0, Ld1/k;->Q:Lf1/s1;

    const/4 p1, 0x0

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ld1/k;->R:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final I0(Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 1

    iget-object v0, p0, Ld1/k;->R:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final P0()V
    .locals 2

    iget-object v0, p0, Ld1/k;->O:Ld1/b;

    iget-object v1, v0, Ld1/b;->a:Ld1/k;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "Expected textInputModifierNode to be null"

    invoke-static {v1}, Lk0/a;->c(Ljava/lang/String;)V

    :goto_0
    iput-object p0, v0, Ld1/b;->a:Ld1/k;

    return-void
.end method

.method public final Q0()V
    .locals 1

    iget-object v0, p0, Ld1/k;->O:Ld1/b;

    invoke-virtual {v0, p0}, Ld1/b;->k(Ld1/k;)V

    return-void
.end method
