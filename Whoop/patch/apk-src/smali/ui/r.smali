.class public final Lui/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lui/p;


# instance fields
.field public final E:Lp1/f0;

.field public final F:Lp1/f0;

.field public final w:Lbc3/t;

.field public final x:Lp1/k1;

.field public final y:Lp1/k1;

.field public final z:Lp1/f0;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v0

    iput-object v0, p0, Lui/r;->w:Lbc3/t;

    const/4 v0, 0x0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lui/r;->x:Lp1/k1;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lui/r;->y:Lp1/k1;

    new-instance v0, Lui/q;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lui/q;-><init>(Lui/r;I)V

    invoke-static {v0}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    new-instance v0, Lui/q;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lui/q;-><init>(Lui/r;I)V

    invoke-static {v0}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v0

    iput-object v0, p0, Lui/r;->z:Lp1/f0;

    new-instance v0, Lui/q;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lui/q;-><init>(Lui/r;I)V

    invoke-static {v0}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v0

    iput-object v0, p0, Lui/r;->E:Lp1/f0;

    new-instance v0, Lui/q;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lui/q;-><init>(Lui/r;I)V

    invoke-static {v0}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v0

    iput-object v0, p0, Lui/r;->F:Lp1/f0;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lui/r;->x:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqi/i;

    return-object v0
.end method
