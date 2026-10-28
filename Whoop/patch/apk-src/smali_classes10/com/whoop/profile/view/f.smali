.class public final synthetic Lcom/whoop/profile/view/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lcom/whoop/profile/view/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/view/f;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/whoop/profile/view/f;->y:Lp1/c1;

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lcom/whoop/profile/view/f;->w:I

    iput-object p1, p0, Lcom/whoop/profile/view/f;->y:Lp1/c1;

    iput-object p2, p0, Lcom/whoop/profile/view/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/whoop/profile/view/f;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lcom/whoop/profile/view/f;->y:Lp1/c1;

    iget-object v1, p0, Lcom/whoop/profile/view/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lqu2/h;->u(Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lcom/whoop/profile/view/f;->y:Lp1/c1;

    iget-object v1, p0, Lcom/whoop/profile/view/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Ljp1/m;->f(Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Long;

    iget-object v0, p0, Lcom/whoop/profile/view/f;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/whoop/profile/view/f;->y:Lp1/c1;

    invoke-static {v0, v1, p1, p2}, Lge0/e;->a(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;Ljava/lang/Long;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lcom/whoop/profile/view/f;->y:Lp1/c1;

    iget-object v1, p0, Lcom/whoop/profile/view/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/profile/view/ProfileScreenKt;->s(Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
