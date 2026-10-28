.class public final synthetic Lsl0/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lg1/y3;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lsl0/d0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/d0;->x:Lbc3/c0;

    iput-object p2, p0, Lsl0/d0;->z:Lg1/y3;

    iput-object p3, p0, Lsl0/d0;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lg1/y3;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lsl0/d0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/d0;->x:Lbc3/c0;

    iput-object p2, p0, Lsl0/d0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lsl0/d0;->z:Lg1/y3;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lsl0/d0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/d0;->z:Lg1/y3;

    check-cast p1, Lnl0/d;

    iget-object v1, p0, Lsl0/d0;->x:Lbc3/c0;

    iget-object v2, p0, Lsl0/d0;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, v2, p1}, Lsl0/e0;->b(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Lnl0/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsl0/d0;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lnl0/d;

    iget-object v1, p0, Lsl0/d0;->x:Lbc3/c0;

    iget-object v2, p0, Lsl0/d0;->z:Lg1/y3;

    invoke-static {v1, v2, v0, p1}, Lsl0/e0;->e(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Lnl0/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
