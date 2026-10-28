.class public final La63/a0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbc3/s0;


# direct methods
.method public synthetic constructor <init>(Lbc3/s0;I)V
    .locals 0

    iput p2, p0, La63/a0;->w:I

    iput-object p1, p0, La63/a0;->x:Lbc3/s0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La63/a0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, La63/a0;->x:Lbc3/s0;

    invoke-interface {p1}, Lbc3/s0;->dispose()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, La63/a0;->x:Lbc3/s0;

    invoke-interface {p1}, Lbc3/s0;->dispose()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
