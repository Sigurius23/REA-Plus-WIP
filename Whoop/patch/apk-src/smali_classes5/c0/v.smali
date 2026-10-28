.class public final Lc0/v;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lc0/x;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lc0/x;I)V
    .locals 0

    iput p3, p0, Lc0/v;->w:I

    iput-object p1, p0, Lc0/v;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lc0/v;->y:Lc0/x;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lc0/v;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    int-to-long v0, p1

    const/16 v2, 0x20

    shl-long v3, v0, v2

    const-wide v5, 0xffffffffL

    and-long/2addr v0, v5

    or-long/2addr v0, v3

    iget-object v3, p0, Lc0/v;->y:Lc0/x;

    invoke-static {v3}, Lc0/x;->f(Lc0/x;)J

    move-result-wide v4

    invoke-static {v3, v0, v1, v4, v5}, Lc0/x;->e(Lc0/x;JJ)J

    move-result-wide v0

    shr-long/2addr v0, v2

    long-to-int v0, v0

    neg-int v0, v0

    sub-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Lc0/v;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Lc0/v;->y:Lc0/x;

    invoke-static {v0}, Lc0/x;->f(Lc0/x;)J

    move-result-wide v1

    const/16 v3, 0x20

    shr-long/2addr v1, v3

    long-to-int v1, v1

    int-to-long v4, p1

    shl-long v6, v4, v3

    const-wide v8, 0xffffffffL

    and-long/2addr v4, v8

    or-long/2addr v4, v6

    invoke-static {v0}, Lc0/x;->f(Lc0/x;)J

    move-result-wide v6

    invoke-static {v0, v4, v5, v6, v7}, Lc0/x;->e(Lc0/x;JJ)J

    move-result-wide v4

    shr-long v2, v4, v3

    long-to-int p1, v2

    sub-int/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Lc0/v;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
