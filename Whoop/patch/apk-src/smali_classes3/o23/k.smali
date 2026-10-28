.class public final Lo23/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo23/d;


# instance fields
.field public final synthetic a:I

.field public final b:Lo23/d;

.field public final c:Ls83/i;

.field public final d:Lhc3/d;


# direct methods
.method public constructor <init>(Lo23/d;Lbc3/c0;Lc93/m;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lo23/k;->a:I

    const-string v0, "originalCall"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lo23/k;->b:Lo23/d;

    .line 3
    check-cast p3, Ls83/i;

    iput-object p3, p0, Lo23/k;->c:Ls83/i;

    .line 4
    invoke-interface {p2}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object p1

    .line 5
    new-instance p3, Lbc3/e2;

    .line 6
    invoke-direct {p3, p1}, Lbc3/l1;-><init>(Lbc3/k1;)V

    .line 7
    invoke-static {p2, p3}, Lbc3/f0;->B(Lbc3/c0;Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lo23/k;->d:Lhc3/d;

    return-void
.end method

.method public constructor <init>(Lo23/d;Lbc3/c0;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, Lo23/k;->a:I

    packed-switch p4, :pswitch_data_0

    const-string p4, "originalCall"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "scope"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lo23/k;->b:Lo23/d;

    .line 10
    check-cast p3, Ls83/i;

    iput-object p3, p0, Lo23/k;->c:Ls83/i;

    .line 11
    invoke-interface {p2}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object p1

    .line 12
    new-instance p3, Lbc3/e2;

    .line 13
    invoke-direct {p3, p1}, Lbc3/l1;-><init>(Lbc3/k1;)V

    .line 14
    invoke-static {p2, p3}, Lbc3/f0;->B(Lbc3/c0;Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lo23/k;->d:Lhc3/d;

    return-void

    .line 15
    :pswitch_0
    const-string p4, "originalCall"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "scope"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lo23/k;->b:Lo23/d;

    .line 18
    check-cast p3, Ls83/i;

    iput-object p3, p0, Lo23/k;->c:Ls83/i;

    .line 19
    invoke-interface {p2}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object p1

    .line 20
    new-instance p3, Lbc3/e2;

    .line 21
    invoke-direct {p3, p1}, Lbc3/l1;-><init>(Lbc3/k1;)V

    .line 22
    invoke-static {p2, p3}, Lbc3/f0;->B(Lbc3/c0;Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lo23/k;->d:Lhc3/d;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final await(Lq83/d;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lo23/k;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, La6/e;

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-direct {v0, p0, v1, v2}, La6/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, p1}, Lo23/c;->b(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    new-instance v0, La6/e;

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-direct {v0, p0, v1, v2}, La6/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, p1}, Lo23/c;->b(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    new-instance v0, La6/e;

    const/4 v1, 0x0

    const/16 v2, 0xb

    invoke-direct {v0, p0, v1, v2}, La6/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, p1}, Lo23/c;->b(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final cancel()V
    .locals 1

    iget v0, p0, Lo23/k;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo23/k;->b:Lo23/d;

    invoke-interface {v0}, Lo23/d;->cancel()V

    iget-object v0, p0, Lo23/k;->d:Lhc3/d;

    iget-object v0, v0, Lhc3/d;->w:Lq83/j;

    invoke-static {v0}, Lbc3/f0;->l(Lq83/j;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lo23/k;->b:Lo23/d;

    invoke-interface {v0}, Lo23/d;->cancel()V

    iget-object v0, p0, Lo23/k;->d:Lhc3/d;

    iget-object v0, v0, Lhc3/d;->w:Lq83/j;

    invoke-static {v0}, Lbc3/f0;->l(Lq83/j;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lo23/k;->b:Lo23/d;

    invoke-interface {v0}, Lo23/d;->cancel()V

    iget-object v0, p0, Lo23/k;->d:Lhc3/d;

    iget-object v0, v0, Lhc3/d;->w:Lq83/j;

    invoke-static {v0}, Lbc3/f0;->l(Lq83/j;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final enqueue()V
    .locals 2

    iget v0, p0, Lo23/k;->a:I

    packed-switch v0, :pswitch_data_0

    .line 5
    new-instance v0, Llive/hms/video/factories/c;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llive/hms/video/factories/c;-><init>(I)V

    invoke-virtual {p0, v0}, Lo23/k;->enqueue(Lo23/a;)V

    return-void

    .line 6
    :pswitch_0
    new-instance v0, Llive/hms/video/factories/c;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llive/hms/video/factories/c;-><init>(I)V

    invoke-virtual {p0, v0}, Lo23/k;->enqueue(Lo23/a;)V

    return-void

    .line 7
    :pswitch_1
    new-instance v0, Llive/hms/video/factories/c;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llive/hms/video/factories/c;-><init>(I)V

    invoke-virtual {p0, v0}, Lo23/k;->enqueue(Lo23/a;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final enqueue(Lo23/a;)V
    .locals 3

    iget v0, p0, Lo23/k;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    new-instance v0, Ln20/j;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    iget-object v1, p0, Lo23/k;->d:Lhc3/d;

    invoke-static {v1, v2, v2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    .line 2
    :pswitch_0
    new-instance v0, Ln20/j;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    iget-object v1, p0, Lo23/k;->d:Lhc3/d;

    invoke-static {v1, v2, v2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    .line 3
    :pswitch_1
    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Landroidx/room/e;

    const/16 v1, 0x1d

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    iget-object v1, p0, Lo23/k;->d:Lhc3/d;

    invoke-static {v1, v2, v2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final execute()Ln23/h;
    .locals 3

    iget v0, p0, Lo23/k;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lo23/s;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Lo23/s;-><init>(Lo23/k;Lq83/d;I)V

    sget-object v1, Lq83/k;->w:Lq83/k;

    invoke-static {v1, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln23/h;

    return-object v0

    :pswitch_0
    new-instance v0, Lo23/l;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Lo23/l;-><init>(Lo23/k;Lq83/d;I)V

    sget-object v1, Lq83/k;->w:Lq83/k;

    invoke-static {v1, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln23/h;

    return-object v0

    :pswitch_1
    new-instance v0, Lkd/f;

    const/16 v1, 0x14

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    sget-object v1, Lq83/k;->w:Lq83/k;

    invoke-static {v1, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln23/h;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
