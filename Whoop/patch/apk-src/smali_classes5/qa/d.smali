.class public final Lqa/d;
.super La9/f;
.source "SourceFile"

# interfaces
.implements Lqa/e;


# instance fields
.field public E:Lqa/e;

.field public F:J

.field public final synthetic G:I

.field public H:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lqa/d;->G:I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, La9/a;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lh9/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lqa/d;->G:I

    .line 2
    invoke-direct {p0, v0}, La9/a;-><init>(I)V

    .line 3
    iput-object p1, p0, Lqa/d;->H:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(J)I
    .locals 3

    iget-object v0, p0, Lqa/d;->E:Lqa/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v1, p0, Lqa/d;->F:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lqa/e;->b(J)I

    move-result p1

    return p1
.end method

.method public final d(J)Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lqa/d;->E:Lqa/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v1, p0, Lqa/d;->F:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lqa/e;->d(J)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final h(I)J
    .locals 4

    iget-object v0, p0, Lqa/d;->E:Lqa/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, p1}, Lqa/e;->h(I)J

    move-result-wide v0

    iget-wide v2, p0, Lqa/d;->F:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final j()I
    .locals 1

    iget-object v0, p0, Lqa/d;->E:Lqa/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Lqa/e;->j()I

    move-result v0

    return v0
.end method

.method public final o()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, La9/a;->x:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, La9/f;->y:J

    iput-boolean v0, p0, La9/f;->z:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lqa/d;->E:Lqa/e;

    return-void
.end method

.method public final p()V
    .locals 1

    iget v0, p0, Lqa/d;->G:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqa/d;->H:Ljava/lang/Object;

    check-cast v0, Lmm/d;

    iget-object v0, v0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lra/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lqa/d;->o()V

    iget-object v0, v0, Lra/h;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    iget-object v0, p0, Lqa/d;->H:Ljava/lang/Object;

    check-cast v0, Lh9/b;

    invoke-virtual {v0, p0}, Lh9/b;->k(La9/f;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
