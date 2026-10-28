.class public final Lh/l;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh/l;->w:I

    .line 1
    iput-object p1, p0, Lh/l;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lh/k;ZLq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh/l;->w:I

    .line 2
    iput-object p1, p0, Lh/l;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lh/l;->x:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget v0, p0, Lh/l;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lh/l;

    iget-object v1, p0, Lh/l;->y:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1, p2}, Lh/l;-><init>(Landroid/content/Context;Lq83/d;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Lh/l;->x:Z

    return-object v0

    :pswitch_0
    new-instance p1, Lh/l;

    iget-object v0, p0, Lh/l;->y:Ljava/lang/Object;

    check-cast v0, Lh/k;

    iget-boolean v1, p0, Lh/l;->x:Z

    invoke-direct {p1, v0, v1, p2}, Lh/l;-><init>(Lh/k;ZLq83/d;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh/l;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh/l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh/l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh/l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh/l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lh/l;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lh/l;->y:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lh/l;->x:Z

    check-cast v2, Landroid/content/Context;

    const-class v0, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    invoke-static {v2, v0, p1}, Lrc/g;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v2, Lh/k;

    iget-boolean p1, p0, Lh/l;->x:Z

    if-nez p1, :cond_0

    iget-boolean v0, v2, Lh/k;->g:Z

    if-nez v0, :cond_0

    invoke-virtual {v2}, Lg/t;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v2, Lh/k;->f:Lf1/p1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf1/p1;->d()V

    :cond_0
    invoke-virtual {v2, p1}, Lg/t;->j(Z)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
