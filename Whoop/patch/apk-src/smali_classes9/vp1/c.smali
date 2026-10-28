.class public final synthetic Lvp1/c;
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

    iput p2, p0, Lvp1/c;->w:I

    iput-object p1, p0, Lvp1/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvp1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvp1/c;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lvp1/h;->w(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lvp1/c;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lvp1/h;->Y(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lvp1/c;->x:Ljava/lang/Object;

    check-cast v0, Lsp1/b;

    check-cast p1, Lsp1/a;

    invoke-static {v0, p1}, Lcom/whoop/hormonalinsights/settings/view/HormonalSettingsFragment;->y(Lsp1/b;Lsp1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lvp1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/hormonalinsights/settings/view/HormonalSettingsFragment;

    check-cast p1, Ltp1/m;

    invoke-static {v0, p1}, Lcom/whoop/hormonalinsights/settings/view/HormonalSettingsFragment;->B(Lcom/whoop/hormonalinsights/settings/view/HormonalSettingsFragment;Ltp1/m;)Ll83/a0;

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
