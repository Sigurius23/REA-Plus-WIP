.class public final Lpg3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpg3/g;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/reflect/Type;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/reflect/Type;)V
    .locals 0

    iput p1, p0, Lpg3/j;->w:I

    iput-object p2, p0, Lpg3/j;->x:Ljava/lang/reflect/Type;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final adapt(Lpg3/e;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lpg3/j;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lpg3/k;

    check-cast p1, Lpg3/b0;

    invoke-direct {v0, p1}, Lpg3/k;-><init>(Lpg3/b0;)V

    new-instance v1, Lpg3/i;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lpg3/i;-><init>(Lpg3/k;I)V

    invoke-virtual {p1, v1}, Lpg3/b0;->R0(Lpg3/h;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lpg3/k;

    check-cast p1, Lpg3/b0;

    invoke-direct {v0, p1}, Lpg3/k;-><init>(Lpg3/b0;)V

    new-instance v1, Lpg3/i;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lpg3/i;-><init>(Lpg3/k;I)V

    invoke-virtual {p1, v1}, Lpg3/b0;->R0(Lpg3/h;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final responseType()Ljava/lang/reflect/Type;
    .locals 1

    iget v0, p0, Lpg3/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpg3/j;->x:Ljava/lang/reflect/Type;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpg3/j;->x:Ljava/lang/reflect/Type;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
