.class public final Lpc3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Ld93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Li93/l;


# direct methods
.method public synthetic constructor <init>(Li93/l;I)V
    .locals 0

    iput p2, p0, Lpc3/i;->w:I

    iput-object p1, p0, Lpc3/i;->x:Li93/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget v0, p0, Lpc3/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpc3/i;->x:Li93/l;

    iget-boolean v0, v0, Li93/l;->y:Z

    return v0

    :pswitch_0
    iget-object v0, p0, Lpc3/i;->x:Li93/l;

    iget-boolean v0, v0, Li93/l;->y:Z

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lpc3/i;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lkotlinx/datetime/YearMonth;->Companion:Lpc3/t;

    iget-object v1, p0, Lpc3/i;->x:Li93/l;

    invoke-virtual {v1}, Li93/l;->nextLong()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lkotlinx/datetime/h;->a(Lpc3/t;J)Lkotlinx/datetime/YearMonth;

    move-result-object v0

    return-object v0

    :pswitch_0
    sget-object v0, Lkotlinx/datetime/LocalDate;->Companion:Lpc3/f;

    iget-object v1, p0, Lpc3/i;->x:Li93/l;

    invoke-virtual {v1}, Li93/l;->nextLong()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, Lpc3/f;->a(J)Lkotlinx/datetime/LocalDate;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    iget v0, p0, Lpc3/i;->w:I

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
