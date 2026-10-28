.class public final synthetic Lt81/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lt81/i;->w:I

    iput-object p1, p0, Lt81/i;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lt81/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lt81/i;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lh71/l;

    invoke-static {v0, p1}, Lt81/l;->n(Lkotlin/jvm/functions/Function1;Lh71/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lt81/i;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Li3/z;

    invoke-static {v0, p1}, Lt81/l;->f(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lt81/i;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Li2/g0;

    invoke-static {v0, p1}, Lt81/l;->e(Lp1/c1;Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lt81/i;->x:Ljava/lang/Object;

    check-cast v0, Lf0/r1;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1, v0}, Lt81/l;->k(FLf0/r1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lt81/i;->x:Ljava/lang/Object;

    check-cast v0, Lp1/z0;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, p1}, Lt81/l;->a(Lp1/z0;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
