.class public final Lp1/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Ld93/a;


# instance fields
.field public E:I

.field public final synthetic w:I

.field public final x:Lp1/f2;

.field public final y:I

.field public z:I


# direct methods
.method public constructor <init>(Lp1/f2;II)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lp1/m0;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/m0;->x:Lp1/f2;

    iput p3, p0, Lp1/m0;->y:I

    .line 2
    iput p2, p0, Lp1/m0;->z:I

    .line 3
    iget p2, p1, Lp1/f2;->H:I

    .line 4
    iput p2, p0, Lp1/m0;->E:I

    .line 5
    iget-boolean p1, p1, Lp1/f2;->G:Z

    if-eqz p1, :cond_0

    .line 6
    invoke-static {}, Lp1/h2;->f()V

    :cond_0
    return-void
.end method

.method public constructor <init>(Lp1/f2;ILp1/n0;Lse/b;)V
    .locals 0

    const/4 p3, 0x1

    iput p3, p0, Lp1/m0;->w:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lp1/m0;->x:Lp1/f2;

    .line 9
    iput p2, p0, Lp1/m0;->y:I

    .line 10
    iget p1, p1, Lp1/f2;->H:I

    .line 11
    iput p1, p0, Lp1/m0;->z:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lp1/m0;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    throw v0

    :pswitch_0
    iget v0, p0, Lp1/m0;->z:I

    iget v1, p0, Lp1/m0;->y:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lp1/m0;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    throw v0

    :pswitch_0
    iget-object v0, p0, Lp1/m0;->x:Lp1/f2;

    iget v1, v0, Lp1/f2;->H:I

    iget v2, p0, Lp1/m0;->E:I

    if-eq v1, v2, :cond_0

    invoke-static {}, Lp1/h2;->f()V

    :cond_0
    iget v1, p0, Lp1/m0;->z:I

    iget-object v3, v0, Lp1/f2;->w:[I

    invoke-static {v3, v1}, Lp1/h2;->a([II)I

    move-result v3

    add-int/2addr v3, v1

    iput v3, p0, Lp1/m0;->z:I

    new-instance v3, Lp1/g2;

    invoke-direct {v3, v0, v1, v2}, Lp1/g2;-><init>(Lp1/f2;II)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    iget v0, p0, Lp1/m0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
