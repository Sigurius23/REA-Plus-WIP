.class public final Lay/b0;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:Lec3/w1;

.field public final F:Lec3/w1;

.field public final w:Lay/j;

.field public final x:Lq83/j;

.field public final y:Lec3/w1;

.field public final z:Lec3/w1;


# direct methods
.method public constructor <init>(Lay/j;Lq83/j;)V
    .locals 3

    const-string v0, "workContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lay/b0;->w:Lay/j;

    iput-object p2, p0, Lay/b0;->x:Lq83/j;

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x7

    invoke-static {p1, p1, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v2

    iput-object v2, p0, Lay/b0;->y:Lec3/w1;

    iput-object v2, p0, Lay/b0;->z:Lec3/w1;

    invoke-static {p1, p1, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lay/b0;->E:Lec3/w1;

    iput-object p1, p0, Lay/b0;->F:Lec3/w1;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v1, La20/b;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v0, v2}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x2

    invoke-static {p1, p2, v0, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
