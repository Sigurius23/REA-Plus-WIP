.class public final Lio/sentry/d5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public final E:Lio/sentry/m5;

.field public final F:I

.field public final G:Ljava/util/concurrent/Callable;

.field public final H:Ljava/lang/String;

.field public I:Ljava/util/HashMap;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/Integer;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/sentry/m5;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/sentry/d5;->E:Lio/sentry/m5;

    .line 3
    iput-object p3, p0, Lio/sentry/d5;->w:Ljava/lang/String;

    .line 4
    iput p2, p0, Lio/sentry/d5;->F:I

    .line 5
    iput-object p4, p0, Lio/sentry/d5;->y:Ljava/lang/String;

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lio/sentry/d5;->G:Ljava/util/concurrent/Callable;

    .line 7
    iput-object p5, p0, Lio/sentry/d5;->H:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lio/sentry/d5;->z:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lio/sentry/d5;->x:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Lio/sentry/m5;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 10
    invoke-direct/range {v0 .. v7}, Lio/sentry/d5;-><init>(Lio/sentry/m5;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method public constructor <init>(Lio/sentry/m5;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const-string v0, "type is required"

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/d5;->E:Lio/sentry/m5;

    .line 13
    iput-object p3, p0, Lio/sentry/d5;->w:Ljava/lang/String;

    const/4 p1, -0x1

    .line 14
    iput p1, p0, Lio/sentry/d5;->F:I

    .line 15
    iput-object p4, p0, Lio/sentry/d5;->y:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lio/sentry/d5;->G:Ljava/util/concurrent/Callable;

    .line 17
    iput-object p5, p0, Lio/sentry/d5;->H:Ljava/lang/String;

    .line 18
    iput-object p6, p0, Lio/sentry/d5;->z:Ljava/lang/String;

    .line 19
    iput-object p7, p0, Lio/sentry/d5;->x:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lio/sentry/d5;->G:Ljava/util/concurrent/Callable;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    const/4 v0, -0x1

    return v0

    :cond_0
    iget v0, p0, Lio/sentry/d5;->F:I

    return v0
.end method

.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    iget-object v0, p0, Lio/sentry/d5;->w:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "content_type"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/d5;->y:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, "filename"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_1
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/d5;->E:Lio/sentry/m5;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v0, p0, Lio/sentry/d5;->H:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v1, "attachment_type"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/d5;->z:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v1, "platform"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/d5;->x:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    const-string v1, "item_count"

    invoke-virtual {p1, v1}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p1, v0}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_4
    const-string v0, "length"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-virtual {p0}, Lio/sentry/d5;->a()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    iget-object v0, p0, Lio/sentry/d5;->I:Ljava/util/HashMap;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/d5;->I:Ljava/util/HashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->z(Ljava/util/HashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method
