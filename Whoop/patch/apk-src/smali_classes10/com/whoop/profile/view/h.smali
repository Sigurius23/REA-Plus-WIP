.class public final synthetic Lcom/whoop/profile/view/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lcom/whoop/profile/view/h;->w:I

    iput-object p1, p0, Lcom/whoop/profile/view/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/whoop/profile/view/h;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lcom/whoop/profile/view/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p2, p1, v0}, Lwo1/s;->d(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lcom/whoop/profile/view/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, p2}, Lrs2/c;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lcom/whoop/profile/view/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, p2, v0}, Lre1/j;->k(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lp90/e;

    iget-object v0, p0, Lcom/whoop/profile/view/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1, p2}, Lp90/i;->e(Lkotlin/jvm/functions/Function1;ZLp90/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lcom/whoop/profile/view/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1, p2}, Lof2/f;->c(Lkotlin/jvm/functions/Function1;II)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Long;

    iget-object v0, p0, Lcom/whoop/profile/view/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1, p2}, Lno0/w;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Long;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Lcom/whoop/design/models/modal/AnyModal;

    iget-object v0, p0, Lcom/whoop/profile/view/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1, p2}, Lno0/p;->g(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/whoop/design/models/modal/AnyModal;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lcom/whoop/profile/view/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1, p2}, Lif0/c;->h(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lcom/whoop/profile/view/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/ProfileScreenKt;->e(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lcom/whoop/profile/view/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/ProfileScreenKt;->h(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
