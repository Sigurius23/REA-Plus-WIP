.class public final synthetic Lch0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lch0/x;->w:I

    iput-object p1, p0, Lch0/x;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lch0/x;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/x;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lnl0/d;

    invoke-static {v0, p1}, Lch0/m0;->r(Lkotlin/jvm/functions/Function1;Lnl0/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lch0/x;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ly2/y;

    invoke-static {v0, p1}, Lch0/c0;->e(Lkotlin/jvm/functions/Function1;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lch0/x;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ly2/y;

    invoke-static {v0, p1}, Lch0/c0;->f(Lkotlin/jvm/functions/Function1;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
