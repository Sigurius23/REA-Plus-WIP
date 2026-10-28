.class public final synthetic Lty1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lty1/k;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lty1/k;I)V
    .locals 0

    iput p3, p0, Lty1/f;->w:I

    iput-object p1, p0, Lty1/f;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lty1/f;->y:Lty1/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lty1/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lty1/f;->y:Lty1/k;

    check-cast p1, Lc31/c;

    iget-object v1, p0, Lty1/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lty1/i;->p(Lkotlin/jvm/functions/Function1;Lty1/k;Lc31/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lty1/f;->y:Lty1/k;

    check-cast p1, Lu0/p0;

    iget-object v1, p0, Lty1/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lty1/i;->u(Lkotlin/jvm/functions/Function1;Lty1/k;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
