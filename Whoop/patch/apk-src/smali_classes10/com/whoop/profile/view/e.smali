.class public final synthetic Lcom/whoop/profile/view/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V
    .locals 0

    iput p3, p0, Lcom/whoop/profile/view/e;->w:I

    iput-object p1, p0, Lcom/whoop/profile/view/e;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/whoop/profile/view/e;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/whoop/profile/view/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-object v0, p0, Lcom/whoop/profile/view/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/whoop/profile/view/e;->y:Lp1/c1;

    invoke-static {v0, v1, p1, p2, p3}, Lrm1/h;->c(Lkotlin/jvm/functions/Function1;Lp1/c1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ll0/y;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-object v0, p0, Lcom/whoop/profile/view/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/whoop/profile/view/e;->y:Lp1/c1;

    invoke-static {v0, v1, p1, p2, p3}, Lcom/whoop/profile/view/ProfileScreenKt;->a(Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
