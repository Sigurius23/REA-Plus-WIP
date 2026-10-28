.class public final synthetic Lce3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILis0/j;Lp1/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lce3/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lce3/k;->x:I

    iput p2, p0, Lce3/k;->y:I

    iput-object p3, p0, Lce3/k;->z:Ljava/lang/Object;

    iput-object p4, p0, Lce3/k;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lce3/q;ILne3/h;IZ)V
    .locals 0

    .line 2
    const/4 p5, 0x0

    iput p5, p0, Lce3/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce3/k;->z:Ljava/lang/Object;

    iput p2, p0, Lce3/k;->x:I

    iput-object p3, p0, Lce3/k;->E:Ljava/lang/Object;

    iput p4, p0, Lce3/k;->y:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIILjava/lang/Object;)V
    .locals 0

    .line 3
    iput p4, p0, Lce3/k;->w:I

    iput-object p5, p0, Lce3/k;->z:Ljava/lang/Object;

    iput-object p1, p0, Lce3/k;->E:Ljava/lang/Object;

    iput p2, p0, Lce3/k;->x:I

    iput p3, p0, Lce3/k;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lce3/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lce3/k;->z:Ljava/lang/Object;

    check-cast v0, Luc3/m;

    iget-object v1, p0, Lce3/k;->E:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget v2, p0, Lce3/k;->x:I

    iget v3, p0, Lce3/k;->y:I

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Expected "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Luc3/m;->a:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " but got "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/2addr v3, v2

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget v0, p0, Lce3/k;->x:I

    iget v1, p0, Lce3/k;->y:I

    iget-object v2, p0, Lce3/k;->z:Ljava/lang/Object;

    check-cast v2, Lis0/j;

    iget-object v3, p0, Lce3/k;->E:Ljava/lang/Object;

    check-cast v3, Lp1/a1;

    invoke-static {v0, v1, v2, v3}, Lis0/x;->m(IILis0/j;Lp1/a1;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lce3/k;->z:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/api/internal/DistinctChatApi;

    iget-object v1, p0, Lce3/k;->E:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget v2, p0, Lce3/k;->x:I

    iget v3, p0, Lce3/k;->y:I

    invoke-static {v0, v1, v2, v3}, Lio/getstream/chat/android/client/api/internal/DistinctChatApi;->a(Lio/getstream/chat/android/client/api/internal/DistinctChatApi;Ljava/lang/String;II)Lo23/d;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lce3/k;->z:Ljava/lang/Object;

    check-cast v0, Lce3/q;

    iget v1, p0, Lce3/k;->x:I

    iget-object v2, p0, Lce3/k;->E:Ljava/lang/Object;

    check-cast v2, Lne3/h;

    iget v3, p0, Lce3/k;->y:I

    :try_start_0
    iget-object v4, v0, Lce3/q;->K:Lce3/c0;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    int-to-long v3, v3

    invoke-virtual {v2, v3, v4}, Lne3/h;->skip(J)V

    iget-object v2, v0, Lce3/q;->X:Lce3/z;

    sget-object v3, Lce3/a;->H:Lce3/a;

    invoke-virtual {v2, v1, v3}, Lce3/z;->x(ILce3/a;)V

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, v0, Lce3/q;->Z:Ljava/util/LinkedHashSet;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
