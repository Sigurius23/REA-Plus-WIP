.class public final synthetic Lau1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIILkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput p3, p0, Lau1/k;->w:I

    iput-object p4, p0, Lau1/k;->x:Lkotlin/jvm/functions/Function1;

    iput p1, p0, Lau1/k;->y:I

    iput p2, p0, Lau1/k;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lau1/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lau1/k;->y:I

    iput-object p1, p0, Lau1/k;->x:Lkotlin/jvm/functions/Function1;

    iput p3, p0, Lau1/k;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lau1/k;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lau1/k;->y:I

    iget-object v1, p0, Lau1/k;->x:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lau1/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lyt2/c;->n(ILkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lau1/k;->y:I

    iget-object v1, p0, Lau1/k;->x:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lau1/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lvy1/b;->l(ILkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget v0, p0, Lau1/k;->y:I

    iget-object v1, p0, Lau1/k;->x:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lau1/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lqt2/k;->b(ILkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget v0, p0, Lau1/k;->y:I

    iget-object v1, p0, Lau1/k;->x:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lau1/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lpt2/v;->C(ILkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget v0, p0, Lau1/k;->y:I

    iget-object v1, p0, Lau1/k;->x:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lau1/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lmn1/h;->f(ILkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget v0, p0, Lau1/k;->y:I

    iget-object v1, p0, Lau1/k;->x:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lau1/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lfy2/a;->g(ILkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget v0, p0, Lau1/k;->y:I

    iget-object v1, p0, Lau1/k;->x:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lau1/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->k(ILkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget v0, p0, Lau1/k;->y:I

    iget-object v1, p0, Lau1/k;->x:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lau1/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lau1/l;->c(ILkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
