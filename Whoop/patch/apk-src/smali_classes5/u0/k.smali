.class public final synthetic Lu0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lu0/r1;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lu0/r1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lu0/k;->w:I

    iput-object p1, p0, Lu0/k;->x:Lu0/r1;

    iput-object p2, p0, Lu0/k;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lu0/k;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lp1/i0;

    iget-object p1, p0, Lu0/k;->x:Lu0/r1;

    iget-object v0, p1, Lu0/r1;->c:Lz1/p;

    iget-object v1, p0, Lu0/k;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Lz1/p;->add(Ljava/lang/Object;)Z

    new-instance v0, Ld0/b2;

    const/4 v2, 0x6

    invoke-direct {v0, v2, p1, v1}, Ld0/b2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :pswitch_0
    check-cast p1, Ll3/r0;

    iget-object v0, p0, Lu0/k;->x:Lu0/r1;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lu0/r1;->a:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lu0/k;->y:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
