.class public final synthetic Lcu2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Leb/u0;


# direct methods
.method public synthetic constructor <init>(Leb/u0;I)V
    .locals 0

    iput p2, p0, Lcu2/n;->w:I

    iput-object p1, p0, Lcu2/n;->x:Leb/u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcu2/n;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Leb/q;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-object v0, p0, Lcu2/n;->x:Leb/u0;

    invoke-static {v0, p1, p2, p3}, Lcom/whoop/profile/view/navigation/ProfileNavHostKt;->d(Leb/u0;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-object v0, p0, Lcu2/n;->x:Leb/u0;

    invoke-static {v0, p1, p2, p3}, Lcom/whoop/weightlifting/a;->m(Leb/u0;Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcu2/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-object v0, p0, Lcu2/n;->x:Leb/u0;

    invoke-static {v0, p1, p2, p3}, Lcom/whoop/weightlifting/a;->l(Leb/u0;Lcu2/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
