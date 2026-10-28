.class public final synthetic Llive/hms/video/factories/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lb9/y0;Landroid/util/Pair;Ll9/t;Ll9/y;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Llive/hms/video/factories/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/factories/e;->z:Ljava/lang/Object;

    iput-object p2, p0, Llive/hms/video/factories/e;->E:Ljava/lang/Object;

    iput-object p3, p0, Llive/hms/video/factories/e;->x:Ljava/lang/Object;

    iput-object p4, p0, Llive/hms/video/factories/e;->y:Ljava/lang/Object;

    iput p5, p0, Llive/hms/video/factories/e;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/ArrayBlockingQueue;Llive/hms/video/factories/HappyEyeballsDns;Ljava/net/InetAddress;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Llive/hms/video/factories/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/factories/e;->x:Ljava/lang/Object;

    iput-object p2, p0, Llive/hms/video/factories/e;->y:Ljava/lang/Object;

    iput-object p3, p0, Llive/hms/video/factories/e;->z:Ljava/lang/Object;

    iput-object p4, p0, Llive/hms/video/factories/e;->E:Ljava/lang/Object;

    iput p5, p0, Llive/hms/video/factories/e;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Llive/hms/video/factories/HappyEyeballsDns;Ljava/net/InetAddress;ILjava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/ArrayBlockingQueue;)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Llive/hms/video/factories/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/factories/e;->z:Ljava/lang/Object;

    iput-object p2, p0, Llive/hms/video/factories/e;->E:Ljava/lang/Object;

    iput p3, p0, Llive/hms/video/factories/e;->F:I

    iput-object p4, p0, Llive/hms/video/factories/e;->x:Ljava/lang/Object;

    iput-object p5, p0, Llive/hms/video/factories/e;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget v0, p0, Llive/hms/video/factories/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llive/hms/video/factories/e;->z:Ljava/lang/Object;

    check-cast v0, Lb9/y0;

    iget-object v1, p0, Llive/hms/video/factories/e;->E:Ljava/lang/Object;

    check-cast v1, Landroid/util/Pair;

    iget-object v2, p0, Llive/hms/video/factories/e;->x:Ljava/lang/Object;

    move-object v6, v2

    check-cast v6, Ll9/t;

    iget-object v2, p0, Llive/hms/video/factories/e;->y:Ljava/lang/Object;

    move-object v7, v2

    check-cast v7, Ll9/y;

    iget-object v0, v0, Lb9/y0;->x:Lb9/b1;

    iget-object v0, v0, Lb9/b1;->j:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc9/h;

    iget-object v0, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ll9/c0;

    iget v8, p0, Llive/hms/video/factories/e;->F:I

    invoke-virtual/range {v3 .. v8}, Lc9/h;->f(ILl9/c0;Ll9/t;Ll9/y;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Llive/hms/video/factories/e;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v1, p0, Llive/hms/video/factories/e;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/ArrayBlockingQueue;

    iget-object v2, p0, Llive/hms/video/factories/e;->z:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/factories/HappyEyeballsDns;

    iget-object v3, p0, Llive/hms/video/factories/e;->E:Ljava/lang/Object;

    check-cast v3, Ljava/net/InetAddress;

    iget v4, p0, Llive/hms/video/factories/e;->F:I

    invoke-static {v0, v1, v2, v3, v4}, Llive/hms/video/factories/HappyEyeballsDns;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/ArrayBlockingQueue;Llive/hms/video/factories/HappyEyeballsDns;Ljava/net/InetAddress;I)V

    return-void

    :pswitch_1
    iget-object v0, p0, Llive/hms/video/factories/e;->z:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/factories/HappyEyeballsDns;

    iget-object v1, p0, Llive/hms/video/factories/e;->E:Ljava/lang/Object;

    check-cast v1, Ljava/net/InetAddress;

    iget-object v2, p0, Llive/hms/video/factories/e;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v3, p0, Llive/hms/video/factories/e;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/ArrayBlockingQueue;

    iget v4, p0, Llive/hms/video/factories/e;->F:I

    invoke-static {v2, v3, v0, v1, v4}, Llive/hms/video/factories/HappyEyeballsDns;->c(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/ArrayBlockingQueue;Llive/hms/video/factories/HappyEyeballsDns;Ljava/net/InetAddress;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
