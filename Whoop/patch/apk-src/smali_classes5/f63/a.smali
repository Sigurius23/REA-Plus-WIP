.class public final Lf63/a;
.super Lf63/c;
.source "SourceFile"


# instance fields
.field public final E:Lq63/b;

.field public final F:Lq83/j;

.field public final G:Lw53/b;

.field public final H:Ljava/lang/Object;

.field public final I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final x:Li63/v;

.field public final y:Li63/u;

.field public final z:Lq63/b;


# direct methods
.method public constructor <init>(Lw53/b;Le63/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lf63/a;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf63/a;->G:Lw53/b;

    .line 3
    iget-object p1, p2, Le63/g;->f:Lq83/j;

    .line 4
    iput-object p1, p0, Lf63/a;->F:Lq83/j;

    .line 5
    iget-object p1, p2, Le63/g;->a:Li63/v;

    .line 6
    iput-object p1, p0, Lf63/a;->x:Li63/v;

    .line 7
    iget-object p1, p2, Le63/g;->d:Li63/u;

    .line 8
    iput-object p1, p0, Lf63/a;->y:Li63/u;

    .line 9
    iget-object p1, p2, Le63/g;->b:Lq63/b;

    .line 10
    iput-object p1, p0, Lf63/a;->z:Lq63/b;

    .line 11
    iget-object p1, p2, Le63/g;->g:Lq63/b;

    .line 12
    iput-object p1, p0, Lf63/a;->E:Lq63/b;

    .line 13
    iget-object p1, p2, Le63/g;->e:Ljava/lang/Object;

    .line 14
    instance-of v0, p1, Lio/ktor/utils/io/q;

    if-eqz v0, :cond_0

    check-cast p1, Lio/ktor/utils/io/q;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    .line 15
    sget-object p1, Lio/ktor/utils/io/q;->a:Lio/ktor/utils/io/p;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lio/ktor/utils/io/p;->a()Lio/ktor/utils/io/q;

    move-result-object p1

    .line 16
    :cond_1
    iput-object p1, p0, Lf63/a;->H:Ljava/lang/Object;

    .line 17
    iget-object p1, p2, Le63/g;->c:Lz53/h;

    .line 18
    iput-object p1, p0, Lf63/a;->I:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lw53/e;[BLf63/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lf63/a;->w:I

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lf63/a;->G:Lw53/b;

    .line 21
    invoke-static {}, Lbc3/f0;->c()Lbc3/l1;

    move-result-object p1

    .line 22
    invoke-virtual {p3}, Lf63/c;->e()Li63/v;

    move-result-object v0

    iput-object v0, p0, Lf63/a;->x:Li63/v;

    .line 23
    invoke-virtual {p3}, Lf63/c;->f()Li63/u;

    move-result-object v0

    iput-object v0, p0, Lf63/a;->y:Li63/u;

    .line 24
    invoke-virtual {p3}, Lf63/c;->c()Lq63/b;

    move-result-object v0

    iput-object v0, p0, Lf63/a;->z:Lq63/b;

    .line 25
    invoke-virtual {p3}, Lf63/c;->d()Lq63/b;

    move-result-object v0

    iput-object v0, p0, Lf63/a;->E:Lq63/b;

    .line 26
    invoke-interface {p3}, Li63/s;->getHeaders()Li63/m;

    move-result-object v0

    iput-object v0, p0, Lf63/a;->H:Ljava/lang/Object;

    .line 27
    invoke-interface {p3}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p3

    invoke-interface {p3, p1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    iput-object p1, p0, Lf63/a;->F:Lq83/j;

    .line 28
    invoke-static {p2}, Lge3/g;->a([B)Lio/ktor/utils/io/m;

    move-result-object p1

    iput-object p1, p0, Lf63/a;->I:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Lw53/b;
    .locals 1

    iget v0, p0, Lf63/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf63/a;->G:Lw53/b;

    check-cast v0, Lw53/e;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf63/a;->G:Lw53/b;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Lio/ktor/utils/io/q;
    .locals 1

    iget v0, p0, Lf63/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf63/a;->I:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/m;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf63/a;->H:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/q;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Lq63/b;
    .locals 1

    iget v0, p0, Lf63/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf63/a;->z:Lq63/b;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf63/a;->z:Lq63/b;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Lq63/b;
    .locals 1

    iget v0, p0, Lf63/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf63/a;->E:Lq63/b;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf63/a;->E:Lq63/b;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()Li63/v;
    .locals 1

    iget v0, p0, Lf63/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf63/a;->x:Li63/v;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf63/a;->x:Li63/v;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f()Li63/u;
    .locals 1

    iget v0, p0, Lf63/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf63/a;->y:Li63/u;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf63/a;->y:Li63/u;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget v0, p0, Lf63/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf63/a;->F:Lq83/j;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf63/a;->F:Lq83/j;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getHeaders()Li63/m;
    .locals 1

    iget v0, p0, Lf63/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf63/a;->H:Ljava/lang/Object;

    check-cast v0, Li63/m;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf63/a;->I:Ljava/lang/Object;

    check-cast v0, Lz53/h;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
