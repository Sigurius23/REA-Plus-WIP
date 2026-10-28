.class public final synthetic Lsl0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lnl0/f;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lnl0/f;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, Lsl0/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lsl0/l;->y:Lnl0/f;

    iput-object p1, p0, Lsl0/l;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lnl0/f;I)V
    .locals 0

    .line 2
    iput p3, p0, Lsl0/l;->w:I

    iput-object p1, p0, Lsl0/l;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lsl0/l;->y:Lnl0/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lsl0/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/l;->y:Lnl0/f;

    iget-object v1, p0, Lsl0/l;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Lsl0/u0;->h(Lkotlin/jvm/functions/Function1;Lnl0/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsl0/l;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lsl0/l;->y:Lnl0/f;

    invoke-static {v0, v1}, Lsl0/u0;->C(Lkotlin/jvm/functions/Function1;Lnl0/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lsl0/l;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lsl0/l;->y:Lnl0/f;

    invoke-static {v0, v1}, Lsl0/o0;->p(Lkotlin/jvm/functions/Function1;Lnl0/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lsl0/l;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lsl0/l;->y:Lnl0/f;

    invoke-static {v0, v1}, Lsl0/p;->h(Lkotlin/jvm/functions/Function1;Lnl0/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
