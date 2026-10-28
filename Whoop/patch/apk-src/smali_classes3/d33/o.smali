.class public final Ld33/o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld33/h1;


# direct methods
.method public synthetic constructor <init>(Ld33/h1;Lq83/d;I)V
    .locals 0

    iput p3, p0, Ld33/o;->w:I

    iput-object p1, p0, Ld33/o;->x:Ld33/h1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Ld33/o;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ld33/o;

    iget-object v0, p0, Ld33/o;->x:Ld33/h1;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Ld33/o;-><init>(Ld33/h1;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Ld33/o;

    iget-object v0, p0, Ld33/o;->x:Ld33/h1;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Ld33/o;-><init>(Ld33/h1;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ld33/o;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Ld33/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ld33/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Ld33/o;->w:I

    const-string v1, "Exception occurred: "

    const-string v2, "SafeCall"

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/o;->x:Ld33/h1;

    iget-object v0, p1, Ld33/h1;->E:Ld33/n;

    if-eqz v0, :cond_1

    :try_start_0
    iget-object p1, p1, Ld33/h1;->d:Landroidx/lifecycle/x;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-interface {v0, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lb23/i;->c:Lb23/j;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v2, v1, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iget-object p1, p0, Ld33/o;->x:Ld33/h1;

    const/4 v0, 0x0

    iput-object v0, p1, Ld33/h1;->E:Ld33/n;

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/o;->x:Ld33/h1;

    iget-object v0, p1, Ld33/h1;->E:Ld33/n;

    if-nez v0, :cond_2

    new-instance v0, Ld33/n;

    invoke-direct {v0, p1}, Ld33/n;-><init>(Ld33/h1;)V

    iput-object v0, p1, Ld33/h1;->E:Ld33/n;

    :cond_2
    :try_start_1
    iget-object v0, p1, Ld33/h1;->d:Landroidx/lifecycle/x;

    iget-object p1, p1, Ld33/h1;->E:Ld33/n;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-interface {v0, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lb23/i;->c:Lb23/j;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v2, v1, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
