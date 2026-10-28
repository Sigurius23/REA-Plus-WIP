.class public final Lb3/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb2/w;


# instance fields
.field public final w:Lp1/g1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp1/g1;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1}, Lp1/g1;-><init>(F)V

    iput-object v0, p0, Lb3/o2;->w:Lp1/g1;

    return-void
.end method


# virtual methods
.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final h()F
    .locals 1

    iget-object v0, p0, Lb3/o2;->w:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    return v0
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method
