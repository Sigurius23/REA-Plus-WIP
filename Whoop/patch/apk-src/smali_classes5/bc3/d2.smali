.class public final Lbc3/d2;
.super Lhc3/u;
.source "SourceFile"


# instance fields
.field public final synthetic E:I


# direct methods
.method public synthetic constructor <init>(Lq83/j;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lbc3/d2;->E:I

    invoke-direct {p0, p1, p2}, Lhc3/u;-><init>(Lq83/j;Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final v(Ljava/lang/Throwable;)Z
    .locals 1

    iget v0, p0, Lbc3/d2;->E:I

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lkotlinx/coroutines/flow/internal/ChildCancelledException;

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lbc3/t1;->o(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1

    :pswitch_0
    const/4 p1, 0x0

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
