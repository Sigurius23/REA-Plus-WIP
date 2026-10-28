.class public final Lf0/d0;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/r;


# instance fields
.field public final O:Lj0/i;

.field public P:Z

.field public Q:Z

.field public R:Z


# direct methods
.method public constructor <init>(Lj0/i;)V
    .locals 0

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p1, p0, Lf0/d0;->O:Lj0/i;

    return-void
.end method


# virtual methods
.method public final O(La3/p0;)V
    .locals 11

    invoke-virtual {p1}, La3/p0;->a()V

    iget-object v1, p1, La3/p0;->w:Lk2/b;

    iget-boolean v2, p0, Lf0/d0;->P:Z

    if-eqz v2, :cond_0

    sget-wide v2, Li2/x;->b:J

    const v4, 0x3e99999a    # 0.3f

    invoke-static {v4, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v5

    const/4 v9, 0x0

    const/16 v10, 0x7a

    move-wide v1, v2

    const-wide/16 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v10}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lf0/d0;->Q:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lf0/d0;->R:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    sget-wide v2, Li2/x;->b:J

    const v0, 0x3dcccccd    # 0.1f

    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v5

    const/4 v9, 0x0

    const/16 v10, 0x7a

    move-wide v1, v2

    const-wide/16 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v10}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    return-void
.end method

.method public final P0()V
    .locals 4

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    new-instance v1, Landroidx/room/z1;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, v2}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
