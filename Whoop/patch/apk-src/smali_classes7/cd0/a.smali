.class public final synthetic Lcd0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    iput p3, p0, Lcd0/a;->w:I

    iput-object p1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    iput p2, p0, Lcd0/a;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcd0/a;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lzc1/e0;->e(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lz51/h;->n(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lz50/d;->a(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lwt1/a;->d(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lvs2/e;->j(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p2, p0, Lcd0/a;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1, p2}, Lrg/a;->g(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lss0/a;->c(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lry2/b;->f(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lpp2/h;->d(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lot1/c;->t(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lo42/k;->o(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lnx1/h;->b(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lnw0/o;->t(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lne2/a;->d(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lle0/b;->f(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lhe2/h;->g(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lhe1/a;->e(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lh60/g;->a(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/profile/view/ProfileScreenKt;->f(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/profile/view/ProfileScreenKt;->m(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lck1/f;->a(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lci0/d;->f(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lce2/c;->h(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lcd0/a;->y:I

    iget-object v1, p0, Lcd0/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lcd0/b;->a(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
