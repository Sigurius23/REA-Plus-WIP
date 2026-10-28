.class public final Llx/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljx/b;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Llx/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lmx/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Llx/c;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llx/c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 2

    iget v0, p0, Llx/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llx/c;->b:Ljava/lang/Object;

    check-cast v0, Lmx/c;

    invoke-virtual {v0}, Lmx/c;->o()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {v0, v1, p2}, Lmx/c;->R(II)V

    return-void

    :pswitch_0
    new-instance v0, Llx/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p2, v1}, Llx/b;-><init>(Llx/c;III)V

    invoke-static {v0}, Lse/b;->b0(Ljava/lang/Runnable;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(II)V
    .locals 2

    iget v0, p0, Llx/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llx/c;->b:Ljava/lang/Object;

    check-cast v0, Lmx/c;

    invoke-virtual {v0}, Lmx/c;->o()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {v0, v1, p2}, Lmx/c;->Q(II)V

    return-void

    :pswitch_0
    new-instance v0, Llx/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Llx/b;-><init>(Llx/c;III)V

    invoke-static {v0}, Lse/b;->b0(Ljava/lang/Runnable;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()V
    .locals 2

    iget v0, p0, Llx/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llx/c;->b:Ljava/lang/Object;

    check-cast v0, Lmx/c;

    invoke-virtual {v0}, Lmx/c;->N()V

    return-void

    :pswitch_0
    new-instance v0, Lbq/b;

    const/16 v1, 0x10

    invoke-direct {v0, p0, v1}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lse/b;->b0(Ljava/lang/Runnable;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(II)V
    .locals 2

    iget v0, p0, Llx/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llx/c;->b:Ljava/lang/Object;

    check-cast v0, Lmx/c;

    invoke-virtual {v0}, Lmx/c;->o()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {v0, v1, p2}, Lmx/c;->S(II)V

    return-void

    :pswitch_0
    new-instance v0, Llx/b;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, p2, v1}, Llx/b;-><init>(Llx/c;III)V

    invoke-static {v0}, Lse/b;->b0(Ljava/lang/Runnable;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
