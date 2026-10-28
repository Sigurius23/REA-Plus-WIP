.class public final Lpg3/x;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lpg3/e;


# direct methods
.method public synthetic constructor <init>(Lpg3/e;I)V
    .locals 0

    iput p2, p0, Lpg3/x;->w:I

    iput-object p1, p0, Lpg3/x;->x:Lpg3/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpg3/x;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Lpg3/x;->x:Lpg3/e;

    invoke-interface {p1}, Lpg3/e;->cancel()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Lpg3/x;->x:Lpg3/e;

    invoke-interface {p1}, Lpg3/e;->cancel()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Lpg3/x;->x:Lpg3/e;

    invoke-interface {p1}, Lpg3/e;->cancel()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
