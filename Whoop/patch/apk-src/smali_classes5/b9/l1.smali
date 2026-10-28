.class public final Lb9/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb9/p0;
.implements Llo/l;


# instance fields
.field public final E:Ljava/lang/Object;

.field public F:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:J

.field public y:J

.field public z:Z


# direct methods
.method public constructor <init>(JJZLjava/io/File;Ljava/util/HashMap;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb9/l1;->w:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-wide p1, p0, Lb9/l1;->x:J

    .line 9
    iput-object p6, p0, Lb9/l1;->E:Ljava/lang/Object;

    .line 10
    iput-wide p3, p0, Lb9/l1;->y:J

    .line 11
    iput-object p7, p0, Lb9/l1;->F:Ljava/lang/Object;

    .line 12
    iput-boolean p5, p0, Lb9/l1;->z:Z

    return-void
.end method

.method public constructor <init>(Llo/t;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lb9/l1;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lb9/l1;->E:Ljava/lang/Object;

    .line 3
    sget-object p1, Lrm/w0;->z:Lrm/w0;

    iput-object p1, p0, Lb9/l1;->F:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lx8/p;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb9/l1;->w:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lb9/l1;->E:Ljava/lang/Object;

    .line 6
    sget-object p1, Lu8/e0;->d:Lu8/e0;

    iput-object p1, p0, Lb9/l1;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 1

    iget v0, p0, Lb9/l1;->w:I

    packed-switch v0, :pswitch_data_0

    iput-wide p1, p0, Lb9/l1;->x:J

    iget-boolean p1, p0, Lb9/l1;->z:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lb9/l1;->E:Ljava/lang/Object;

    check-cast p1, Llo/t;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Lb9/l1;->y:J

    :cond_0
    return-void

    :pswitch_0
    iput-wide p1, p0, Lb9/l1;->x:J

    iget-boolean p1, p0, Lb9/l1;->z:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lb9/l1;->E:Ljava/lang/Object;

    check-cast p1, Lx8/p;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Lb9/l1;->y:J

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b()Lrm/w0;
    .locals 1

    .line 1
    iget-object v0, p0, Lb9/l1;->F:Ljava/lang/Object;

    check-cast v0, Lrm/w0;

    return-object v0
.end method

.method public b()Lu8/e0;
    .locals 1

    .line 2
    iget-object v0, p0, Lb9/l1;->F:Ljava/lang/Object;

    check-cast v0, Lu8/e0;

    return-object v0
.end method

.method public c()J
    .locals 7

    iget v0, p0, Lb9/l1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-wide v0, p0, Lb9/l1;->x:J

    iget-boolean v2, p0, Lb9/l1;->z:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lb9/l1;->E:Ljava/lang/Object;

    check-cast v2, Llo/t;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lb9/l1;->y:J

    sub-long/2addr v2, v4

    iget-object v4, p0, Lb9/l1;->F:Ljava/lang/Object;

    check-cast v4, Lrm/w0;

    iget v5, v4, Lrm/w0;->w:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v5, v5, v6

    if-nez v5, :cond_0

    invoke-static {v2, v3}, Llo/y;->z(J)J

    move-result-wide v2

    :goto_0
    add-long/2addr v0, v2

    goto :goto_1

    :cond_0
    iget v4, v4, Lrm/w0;->y:I

    int-to-long v4, v4

    mul-long/2addr v2, v4

    goto :goto_0

    :cond_1
    :goto_1
    return-wide v0

    :pswitch_0
    iget-wide v0, p0, Lb9/l1;->x:J

    iget-boolean v2, p0, Lb9/l1;->z:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Lb9/l1;->E:Ljava/lang/Object;

    check-cast v2, Lx8/p;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lb9/l1;->y:J

    sub-long/2addr v2, v4

    iget-object v4, p0, Lb9/l1;->F:Ljava/lang/Object;

    check-cast v4, Lu8/e0;

    iget v5, v4, Lu8/e0;->a:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v5, v5, v6

    if-nez v5, :cond_2

    invoke-static {v2, v3}, Lx8/t;->J(J)J

    move-result-wide v2

    :goto_2
    add-long/2addr v0, v2

    goto :goto_3

    :cond_2
    iget v4, v4, Lu8/e0;->c:I

    int-to-long v4, v4

    mul-long/2addr v2, v4

    goto :goto_2

    :cond_3
    :goto_3
    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lu8/e0;)V
    .locals 2

    iget-boolean v0, p0, Lb9/l1;->z:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb9/l1;->c()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lb9/l1;->a(J)V

    :cond_0
    iput-object p1, p0, Lb9/l1;->F:Ljava/lang/Object;

    return-void
.end method

.method public f(Lrm/w0;)V
    .locals 2

    iget-boolean v0, p0, Lb9/l1;->z:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb9/l1;->c()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lb9/l1;->a(J)V

    :cond_0
    iput-object p1, p0, Lb9/l1;->F:Ljava/lang/Object;

    return-void
.end method

.method public g()V
    .locals 2

    iget v0, p0, Lb9/l1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lb9/l1;->z:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lb9/l1;->E:Ljava/lang/Object;

    check-cast v0, Llo/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lb9/l1;->y:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb9/l1;->z:Z

    :cond_0
    return-void

    :pswitch_0
    iget-boolean v0, p0, Lb9/l1;->z:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lb9/l1;->E:Ljava/lang/Object;

    check-cast v0, Lx8/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lb9/l1;->y:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb9/l1;->z:Z

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
