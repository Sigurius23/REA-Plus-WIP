.class public final Lbc/b0;
.super Lbc/x;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Lbc/w;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lbc/b0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lbc/w;I)V
    .locals 0

    .line 2
    iput p2, p0, Lbc/b0;->a:I

    iput-object p1, p0, Lbc/b0;->b:Lbc/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lbc/w;)V
    .locals 1

    iget p1, p0, Lbc/b0;->a:I

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object p1, p0, Lbc/b0;->b:Lbc/w;

    check-cast p1, Lbc/c0;

    iget-boolean v0, p1, Lbc/c0;->h0:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lbc/w;->N()V

    const/4 v0, 0x1

    iput-boolean v0, p1, Lbc/c0;->h0:Z

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lbc/w;)V
    .locals 2

    iget v0, p0, Lbc/b0;->a:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, Lbc/b0;->b:Lbc/w;

    invoke-virtual {v0}, Lbc/w;->F()V

    invoke-virtual {p1, p0}, Lbc/w;->C(Lbc/u;)Lbc/w;

    return-void

    :pswitch_1
    iget-object v0, p0, Lbc/b0;->b:Lbc/w;

    check-cast v0, Lbc/c0;

    iget v1, v0, Lbc/c0;->g0:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lbc/c0;->g0:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lbc/c0;->h0:Z

    invoke-virtual {v0}, Lbc/w;->n()V

    :cond_0
    invoke-virtual {p1, p0}, Lbc/w;->C(Lbc/u;)Lbc/w;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lbc/w;)V
    .locals 2

    iget v0, p0, Lbc/b0;->a:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, Lbc/b0;->b:Lbc/w;

    check-cast v0, Lbc/c0;

    iget-object v1, v0, Lbc/c0;->e0:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lbc/c0;->u()Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lbc/v;->d:Lab/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v0, p1, v1}, Lbc/w;->z(Lbc/w;Lbc/v;Z)V

    const/4 p1, 0x1

    iput-boolean p1, v0, Lbc/w;->R:Z

    sget-object p1, Lbc/v;->c:Lab/a;

    invoke-virtual {v0, v0, p1, v1}, Lbc/w;->z(Lbc/w;Lbc/v;Z)V

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
