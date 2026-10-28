.class public final synthetic Li21/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Li21/j;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Li21/j;I)V
    .locals 0

    iput p3, p0, Li21/g;->w:I

    iput-object p1, p0, Li21/g;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Li21/g;->y:Li21/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Li21/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Li21/g;->y:Li21/j;

    check-cast p1, Ljava/util/UUID;

    iget-object v1, p0, Li21/g;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Li21/i;->f(Lkotlin/jvm/functions/Function1;Li21/j;Ljava/util/UUID;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Li21/g;->y:Li21/j;

    check-cast p1, Ljava/util/UUID;

    iget-object v1, p0, Li21/g;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Li21/i;->b(Lkotlin/jvm/functions/Function1;Li21/j;Ljava/util/UUID;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
