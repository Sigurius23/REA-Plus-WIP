.class public final synthetic Ljc/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljc/i0;


# direct methods
.method public synthetic constructor <init>(Ljc/i0;I)V
    .locals 0

    iput p2, p0, Ljc/z;->w:I

    iput-object p1, p0, Ljc/z;->x:Ljc/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Ljc/z;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljc/z;->x:Ljc/i0;

    iget-object v1, v0, Ljc/i0;->j:Lqc/u;

    iget-object v0, v0, Ljc/i0;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lqc/u;->d(Ljava/lang/String;)Lic/m0;

    move-result-object v2

    sget-object v3, Lic/m0;->w:Lic/m0;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    sget-object v2, Lic/m0;->x:Lic/m0;

    invoke-virtual {v1, v2, v0}, Lqc/u;->j(Lic/m0;Ljava/lang/String;)I

    iget-object v2, v1, Lqc/u;->a:Landroidx/room/z0;

    new-instance v3, Le61/g;

    const/16 v5, 0xf

    invoke-direct {v3, v0, v5}, Le61/g;-><init>(Ljava/lang/String;I)V

    const/4 v5, 0x1

    invoke-static {v2, v4, v5, v3}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    const/16 v2, -0x100

    invoke-virtual {v1, v2, v0}, Lqc/u;->k(ILjava/lang/String;)V

    move v4, v5

    :cond_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ljc/z;->x:Ljc/i0;

    iget-object v1, v0, Ljc/i0;->a:Lqc/q;

    iget-object v2, v1, Lqc/q;->b:Lic/m0;

    iget-object v3, v1, Lqc/q;->c:Ljava/lang/String;

    sget-object v4, Lic/m0;->w:Lic/m0;

    if-eq v2, v4, :cond_1

    sget-object v0, Ljc/j0;->a:Ljava/lang/String;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is not in ENQUEUED state. Nothing more to do"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lqc/q;->c()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, v1, Lqc/q;->b:Lic/m0;

    if-ne v2, v4, :cond_3

    iget v2, v1, Lqc/q;->k:I

    if-lez v2, :cond_3

    :cond_2
    iget-object v0, v0, Ljc/i0;->g:Lic/y;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v1}, Lqc/q;->a()J

    move-result-wide v0

    cmp-long v0, v4, v0

    if-gez v0, :cond_3

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    sget-object v1, Ljc/j0;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Delaying execution for "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " because it is being executed before schedule."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
