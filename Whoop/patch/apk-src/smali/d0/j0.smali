.class public final Ld0/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/t2;


# instance fields
.field public E:Ld0/p1;

.field public F:Z

.field public G:Z

.field public H:J

.field public final synthetic I:Ld0/l0;

.field public w:Ljava/lang/Number;

.field public x:Ljava/lang/Number;

.field public final y:Ld0/f2;

.field public final z:Lp1/k1;


# direct methods
.method public constructor <init>(Ld0/l0;Ljava/lang/Number;Ljava/lang/Number;Ld0/f2;Ld0/i0;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/j0;->I:Ld0/l0;

    iput-object p2, p0, Ld0/j0;->w:Ljava/lang/Number;

    iput-object p3, p0, Ld0/j0;->x:Ljava/lang/Number;

    iput-object p4, p0, Ld0/j0;->y:Ld0/f2;

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ld0/j0;->z:Lp1/k1;

    new-instance v0, Ld0/p1;

    iget-object v3, p0, Ld0/j0;->w:Ljava/lang/Number;

    iget-object v4, p0, Ld0/j0;->x:Ljava/lang/Number;

    const/4 v5, 0x0

    move-object v2, p4

    move-object v1, p5

    invoke-direct/range {v0 .. v5}, Ld0/p1;-><init>(Ld0/l;Ld0/f2;Ljava/lang/Object;Ljava/lang/Object;Ld0/r;)V

    iput-object v0, p0, Ld0/j0;->E:Ld0/p1;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld0/j0;->z:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
