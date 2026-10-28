.class public final synthetic Lq0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lq0/y;

.field public final synthetic y:Lbc3/c0;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lq0/y;I)V
    .locals 0

    iput p3, p0, Lq0/l;->w:I

    iput-object p2, p0, Lq0/l;->x:Lq0/y;

    iput-object p1, p0, Lq0/l;->y:Lbc3/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lq0/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lq0/l;->x:Lq0/y;

    invoke-virtual {v0}, Lq0/y;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lq0/m;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lq0/m;-><init>(Lq0/y;ILq83/d;)V

    const/4 v0, 0x3

    iget-object v2, p0, Lq0/l;->y:Lbc3/c0;

    invoke-static {v2, v3, v3, v1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lq0/l;->x:Lq0/y;

    invoke-virtual {v0}, Lq0/y;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Lq0/m;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lq0/m;-><init>(Lq0/y;ILq83/d;)V

    const/4 v0, 0x3

    iget-object v2, p0, Lq0/l;->y:Lbc3/c0;

    invoke-static {v2, v3, v3, v1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lq0/l;->x:Lq0/y;

    invoke-virtual {v0}, Lq0/y;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Lq0/m;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lq0/m;-><init>(Lq0/y;ILq83/d;)V

    const/4 v0, 0x3

    iget-object v2, p0, Lq0/l;->y:Lbc3/c0;

    invoke-static {v2, v3, v3, v1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lq0/l;->x:Lq0/y;

    invoke-virtual {v0}, Lq0/y;->c()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Lq0/m;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lq0/m;-><init>(Lq0/y;ILq83/d;)V

    const/4 v0, 0x3

    iget-object v2, p0, Lq0/l;->y:Lbc3/c0;

    invoke-static {v2, v3, v3, v1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
