.class public final synthetic Lty1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lty1/k;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Lkotlin/jvm/functions/Function1;Lty1/k;)V
    .locals 0

    iput p1, p0, Lty1/b;->w:I

    iput-object p3, p0, Lty1/b;->x:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lty1/b;->y:Lty1/k;

    iput-object p2, p0, Lty1/b;->z:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lty1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lty1/b;->y:Lty1/k;

    iget-object v1, p0, Lty1/b;->z:Ljava/lang/String;

    iget-object v2, p0, Lty1/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lty1/i;->i(Lkotlin/jvm/functions/Function1;Lty1/k;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lty1/b;->y:Lty1/k;

    iget-object v1, p0, Lty1/b;->z:Ljava/lang/String;

    iget-object v2, p0, Lty1/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lty1/i;->k(Lkotlin/jvm/functions/Function1;Lty1/k;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
