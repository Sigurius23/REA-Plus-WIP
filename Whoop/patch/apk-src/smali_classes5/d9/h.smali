.class public final synthetic Ld9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/sentry/internal/debugmeta/c;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/internal/debugmeta/c;IJJ)V
    .locals 0

    .line 1
    const/4 p2, 0x6

    iput p2, p0, Ld9/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/h;->x:Lio/sentry/internal/debugmeta/c;

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/internal/debugmeta/c;J)V
    .locals 0

    .line 2
    const/4 p2, 0x1

    iput p2, p0, Ld9/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/h;->x:Lio/sentry/internal/debugmeta/c;

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/internal/debugmeta/c;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p3, p0, Ld9/h;->w:I

    iput-object p1, p0, Ld9/h;->x:Lio/sentry/internal/debugmeta/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/internal/debugmeta/c;Ljava/lang/String;JJ)V
    .locals 0

    .line 4
    const/4 p2, 0x3

    iput p2, p0, Ld9/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/h;->x:Lio/sentry/internal/debugmeta/c;

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/internal/debugmeta/c;Lu8/p;Lb9/h;)V
    .locals 0

    .line 5
    const/16 p2, 0x9

    iput p2, p0, Ld9/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/h;->x:Lio/sentry/internal/debugmeta/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Ld9/h;->w:I

    iget-object v1, p0, Ld9/h;->x:Lio/sentry/internal/debugmeta/c;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v0}, Lc9/h;->k()Lc9/a;

    move-result-object v1

    new-instance v2, Lc9/d;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Lc9/d;-><init>(I)V

    const/16 v3, 0x3f1

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_0
    iget-object v0, v1, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v0}, Lc9/h;->k()Lc9/a;

    move-result-object v1

    new-instance v2, Lc9/d;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Lc9/d;-><init>(I)V

    const/16 v3, 0x3f6

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_1
    iget-object v0, v1, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v0}, Lc9/h;->k()Lc9/a;

    move-result-object v1

    new-instance v2, Lc9/d;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Lc9/d;-><init>(I)V

    const/16 v3, 0x407

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_2
    iget-object v0, v1, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v0}, Lc9/h;->k()Lc9/a;

    move-result-object v1

    new-instance v2, Lc9/d;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lc9/d;-><init>(I)V

    const/16 v3, 0x3f3

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_3
    iget-object v0, v1, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v0}, Lc9/h;->k()Lc9/a;

    move-result-object v1

    new-instance v2, Lc9/d;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lc9/d;-><init>(I)V

    const/16 v3, 0x3ef

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_4
    iget-object v0, v1, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v0}, Lc9/h;->k()Lc9/a;

    move-result-object v1

    new-instance v2, Lc9/d;

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lc9/d;-><init>(I)V

    const/16 v3, 0x3f4

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_5
    iget-object v0, v1, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v0}, Lc9/h;->k()Lc9/a;

    move-result-object v1

    new-instance v2, Lab/a;

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Lab/a;-><init>(I)V

    const/16 v3, 0x3f0

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_6
    iget-object v0, v1, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v0}, Lc9/h;->k()Lc9/a;

    move-result-object v1

    new-instance v2, Lc9/d;

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, Lc9/d;-><init>(I)V

    const/16 v3, 0x408

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_7
    iget-object v0, v1, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v0}, Lc9/h;->k()Lc9/a;

    move-result-object v1

    new-instance v2, Lc9/d;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lc9/d;-><init>(I)V

    const/16 v3, 0x3f2

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_8
    iget-object v0, v1, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v0}, Lc9/h;->k()Lc9/a;

    move-result-object v1

    new-instance v2, Lc9/d;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lc9/d;-><init>(I)V

    const/16 v3, 0x405

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
