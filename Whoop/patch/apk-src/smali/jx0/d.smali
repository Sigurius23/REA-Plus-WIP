.class public final synthetic Ljx0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;J)V
    .locals 0

    .line 1
    iput p1, p0, Ljx0/d;->w:I

    iput-wide p3, p0, Ljx0/d;->x:J

    iput-object p2, p0, Ljx0/d;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;J)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Ljx0/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljx0/d;->y:Ljava/lang/String;

    iput-wide p2, p0, Ljx0/d;->x:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Ljx0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-wide v0, p0, Ljx0/d;->x:J

    iget-object v2, p0, Ljx0/d;->y:Ljava/lang/String;

    check-cast p1, Ltb/a;

    const-string v3, "_connection"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "UPDATE workspec SET last_enqueue_time=? WHERE id=?"

    invoke-interface {p1, v3}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v3, 0x1

    :try_start_0
    invoke-interface {p1, v3, v0, v1}, Ltb/c;->p(IJ)V

    const/4 v0, 0x2

    invoke-interface {p1, v0, v2}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {p1}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception v0

    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_0
    iget-wide v0, p0, Ljx0/d;->x:J

    iget-object v2, p0, Ljx0/d;->y:Ljava/lang/String;

    check-cast p1, Ltb/a;

    const-string v3, "_connection"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "UPDATE workspec SET schedule_requested_at=? WHERE id=?"

    invoke-interface {p1, v3}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v3

    const/4 v4, 0x1

    :try_start_1
    invoke-interface {v3, v4, v0, v1}, Ltb/c;->p(IJ)V

    const/4 v0, 0x2

    invoke-interface {v3, v0, v2}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {v3}, Ltb/c;->e1()Z

    invoke-static {p1}, Lj93/l0;->H(Ltb/a;)I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :catchall_1
    move-exception p1

    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    throw p1

    :pswitch_1
    iget-wide v0, p0, Ljx0/d;->x:J

    check-cast p1, Ltb/a;

    iget-object v2, p0, Ljx0/d;->y:Ljava/lang/String;

    invoke-static {v2, v0, v1, p1}, Ljx0/e;->g(Ljava/lang/String;JLtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
