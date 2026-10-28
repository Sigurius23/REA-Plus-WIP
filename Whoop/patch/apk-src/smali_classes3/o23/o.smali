.class public final Lo23/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo23/d;


# instance fields
.field public final synthetic a:I

.field public final b:Lo23/d;

.field public final c:Lac3/a;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lo23/d;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lo23/o;->a:I

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lo23/o;->b:Lo23/d;

    .line 3
    iput-object p2, p0, Lo23/o;->d:Ljava/lang/Object;

    .line 4
    new-instance p1, Lac3/a;

    invoke-direct {p1}, Lac3/a;-><init>()V

    .line 5
    iput-object p1, p0, Lo23/o;->c:Lac3/a;

    return-void
.end method

.method public constructor <init>(Lo23/d;Lo23/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lo23/o;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lo23/o;->b:Lo23/d;

    .line 8
    iput-object p2, p0, Lo23/o;->d:Ljava/lang/Object;

    .line 9
    new-instance p1, Lac3/a;

    invoke-direct {p1}, Lac3/a;-><init>()V

    .line 10
    iput-object p1, p0, Lo23/o;->c:Lac3/a;

    return-void
.end method

.method public static a(Ln23/h;Ln23/h;)Ln23/h;
    .locals 2

    instance-of v0, p0, Ln23/g;

    if-eqz v0, :cond_0

    instance-of v0, p1, Ln23/g;

    if-eqz v0, :cond_0

    new-instance v0, Ln23/g;

    new-instance v1, Ll83/k;

    check-cast p0, Ln23/g;

    iget-object p0, p0, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    invoke-direct {v1, p0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance p0, Ln23/f;

    new-instance p1, Ln23/a;

    const-string v0, "Cannot combine results because one of them failed."

    invoke-direct {p1, v0}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ln23/f;-><init>(Ln23/e;)V

    return-object p0
.end method


# virtual methods
.method public final await(Lq83/d;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lo23/o;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lp23/a;->b:Lkc3/d;

    new-instance v1, Ln20/j;

    const/4 v2, 0x0

    const/16 v3, 0x8

    invoke-direct {v1, p0, v2, v3}, Ln20/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v1, p1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    sget-object v0, Lp23/a;->b:Lkc3/d;

    new-instance v1, Lo23/n;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Lo23/n;-><init>(Lo23/o;Lq83/d;I)V

    invoke-static {v0, v1, p1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final cancel()V
    .locals 1

    iget v0, p0, Lo23/o;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo23/o;->c:Lac3/a;

    invoke-virtual {v0}, Lac3/a;->b()V

    iget-object v0, p0, Lo23/o;->b:Lo23/d;

    invoke-interface {v0}, Lo23/d;->cancel()V

    iget-object v0, p0, Lo23/o;->d:Ljava/lang/Object;

    check-cast v0, Lo23/d;

    invoke-interface {v0}, Lo23/d;->cancel()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lo23/o;->c:Lac3/a;

    invoke-virtual {v0}, Lac3/a;->b()V

    iget-object v0, p0, Lo23/o;->b:Lo23/d;

    invoke-interface {v0}, Lo23/d;->cancel()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final enqueue()V
    .locals 2

    iget v0, p0, Lo23/o;->a:I

    packed-switch v0, :pswitch_data_0

    .line 3
    new-instance v0, Llive/hms/video/factories/c;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llive/hms/video/factories/c;-><init>(I)V

    invoke-virtual {p0, v0}, Lo23/o;->enqueue(Lo23/a;)V

    return-void

    .line 4
    :pswitch_0
    new-instance v0, Llive/hms/video/factories/c;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llive/hms/video/factories/c;-><init>(I)V

    invoke-virtual {p0, v0}, Lo23/o;->enqueue(Lo23/a;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final enqueue(Lo23/a;)V
    .locals 2

    iget v0, p0, Lo23/o;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    new-instance v0, Lc9/c;

    const/16 v1, 0x1d

    invoke-direct {v0, v1, p0, p1}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lo23/o;->b:Lo23/d;

    invoke-interface {p1, v0}, Lo23/d;->enqueue(Lo23/a;)V

    return-void

    .line 2
    :pswitch_0
    new-instance v0, Lc9/c;

    const/16 v1, 0x1b

    invoke-direct {v0, v1, p0, p1}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lo23/o;->b:Lo23/d;

    invoke-interface {p1, v0}, Lo23/d;->enqueue(Lo23/a;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final execute()Ln23/h;
    .locals 3

    iget v0, p0, Lo23/o;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lo23/t;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Lo23/t;-><init>(Lo23/o;Lq83/d;I)V

    sget-object v1, Lq83/k;->w:Lq83/k;

    invoke-static {v1, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln23/h;

    return-object v0

    :pswitch_0
    new-instance v0, Lo23/n;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Lo23/n;-><init>(Lo23/o;Lq83/d;I)V

    sget-object v1, Lq83/k;->w:Lq83/k;

    invoke-static {v1, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln23/h;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
