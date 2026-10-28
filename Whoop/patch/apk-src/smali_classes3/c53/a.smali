.class public final Lc53/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/c0;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lhc3/d;


# direct methods
.method public constructor <init>(Lc53/a;Lq83/j;)V
    .locals 4

    const/4 v0, 0x1

    iput v0, p0, Lc53/a;->w:I

    .line 7
    new-instance v0, Ld53/b;

    invoke-direct {v0}, Ld53/b;-><init>()V

    .line 8
    const-string v1, "clientScope"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "additionalContext"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    invoke-static {p1, v0}, Lbc3/f0;->B(Lbc3/c0;Lq83/j;)Lhc3/d;

    move-result-object v1

    .line 11
    iget-object p1, p1, Lc53/a;->x:Lhc3/d;

    .line 12
    iget-object p1, p1, Lhc3/d;->w:Lq83/j;

    .line 13
    invoke-static {p1}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object p1

    new-instance v2, Lav/b;

    const/4 v3, 0x6

    invoke-direct {v2, v0, v3}, Lav/b;-><init>(Ljava/lang/Object;I)V

    .line 14
    new-instance v0, Ld53/c;

    .line 15
    new-instance v3, Lbc3/e2;

    .line 16
    invoke-direct {v3, p1}, Lbc3/l1;-><init>(Lbc3/k1;)V

    .line 17
    invoke-direct {v0, v3, v2}, Ld53/c;-><init>(Lbc3/e2;Lav/b;)V

    .line 18
    invoke-static {v1, v0}, Lbc3/f0;->B(Lbc3/c0;Lq83/j;)Lhc3/d;

    move-result-object p1

    invoke-static {p1, p2}, Lbc3/f0;->B(Lbc3/c0;Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lc53/a;->x:Lhc3/d;

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/CoroutineExceptionHandler;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lc53/a;->w:I

    const-string v0, "exceptionHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    .line 3
    sget-object v1, Lt33/a;->b:Lkc3/d;

    .line 4
    invoke-static {v0, v1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v0

    .line 5
    new-instance v1, Lo23/r;

    invoke-direct {v1}, Lo23/r;-><init>()V

    invoke-interface {v0, v1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    invoke-interface {v0, p1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    .line 6
    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lc53/a;->x:Lhc3/d;

    return-void
.end method


# virtual methods
.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget v0, p0, Lc53/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc53/a;->x:Lhc3/d;

    iget-object v0, v0, Lhc3/d;->w:Lq83/j;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lc53/a;->x:Lhc3/d;

    iget-object v0, v0, Lhc3/d;->w:Lq83/j;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
