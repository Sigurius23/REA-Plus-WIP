.class public final synthetic Lce3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    iput p4, p0, Lce3/h;->w:I

    iput-object p1, p0, Lce3/h;->y:Ljava/lang/Object;

    iput-wide p2, p0, Lce3/h;->x:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lce3/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lce3/h;->y:Ljava/lang/Object;

    check-cast v0, Li2/t;

    iget-wide v1, p0, Lce3/h;->x:J

    check-cast v0, Li2/y0;

    invoke-virtual {v0, v1, v2}, Li2/y0;->b(J)Landroid/graphics/Shader;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lce3/h;->y:Ljava/lang/Object;

    check-cast v0, Lce3/q;

    iget-wide v1, p0, Lce3/h;->x:J

    monitor-enter v0

    :try_start_0
    iget-wide v3, v0, Lce3/q;->M:J

    iget-wide v5, v0, Lce3/q;->L:J

    cmp-long v3, v3, v5

    const/4 v4, 0x1

    const/4 v7, 0x0

    if-gez v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const-wide/16 v8, 0x1

    add-long/2addr v5, v8

    iput-wide v5, v0, Lce3/q;->L:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v3, v7

    :goto_0
    monitor-exit v0

    if-eqz v3, :cond_1

    const/4 v1, 0x0

    sget-object v2, Lce3/a;->z:Lce3/a;

    invoke-virtual {v0, v2, v2, v1}, Lce3/q;->b(Lce3/a;Lce3/a;Ljava/io/IOException;)V

    const-wide/16 v1, -0x1

    goto :goto_1

    :cond_1
    :try_start_1
    iget-object v3, v0, Lce3/q;->X:Lce3/z;

    invoke-virtual {v3, v4, v7, v7}, Lce3/z;->s(IIZ)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    sget-object v4, Lce3/a;->z:Lce3/a;

    invoke-virtual {v0, v4, v4, v3}, Lce3/q;->b(Lce3/a;Lce3/a;Ljava/io/IOException;)V

    :goto_1
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
