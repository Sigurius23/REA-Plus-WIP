.class public final synthetic Lc42/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/pregnancy/view/PregnancySettingsFragment;I)V
    .locals 0

    iput p2, p0, Lc42/l;->w:I

    iput-object p1, p0, Lc42/l;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lc42/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc42/l;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->G(Lcom/whoop/pregnancy/view/PregnancySettingsFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lc42/l;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    invoke-static {v0, p1}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->z(Lcom/whoop/pregnancy/view/PregnancySettingsFragment;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lc42/l;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->b0(Lcom/whoop/pregnancy/view/PregnancySettingsFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
