.class public final synthetic Leo2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IILjava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput p2, p0, Leo2/k;->w:I

    iput-object p3, p0, Leo2/k;->x:Ljava/util/List;

    iput-object p4, p0, Leo2/k;->y:Lkotlin/jvm/functions/Function1;

    iput p1, p0, Leo2/k;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Leo2/k;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Leo2/k;->x:Ljava/util/List;

    iget-object v1, p0, Leo2/k;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Leo2/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lzq2/d;->a(Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Leo2/k;->x:Ljava/util/List;

    iget-object v1, p0, Leo2/k;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Leo2/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lu11/i;->A(Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Leo2/k;->x:Ljava/util/List;

    iget-object v1, p0, Leo2/k;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Leo2/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lsl0/p1;->k(Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Leo2/k;->x:Ljava/util/List;

    iget-object v1, p0, Leo2/k;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Leo2/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lse1/a;->c(Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Leo2/k;->x:Ljava/util/List;

    iget-object v1, p0, Leo2/k;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Leo2/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Liw0/x;->H(Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Leo2/k;->x:Ljava/util/List;

    iget-object v1, p0, Leo2/k;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Leo2/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Leo2/m;->h(Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
