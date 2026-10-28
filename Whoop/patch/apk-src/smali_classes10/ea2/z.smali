.class public final synthetic Lea2/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly71/o;

.field public final synthetic y:Lcom/whoop/settings/SettingsLandingFragment;


# direct methods
.method public synthetic constructor <init>(Ly71/o;Lcom/whoop/settings/SettingsLandingFragment;I)V
    .locals 0

    iput p3, p0, Lea2/z;->w:I

    iput-object p1, p0, Lea2/z;->x:Ly71/o;

    iput-object p2, p0, Lea2/z;->y:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lea2/z;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lea2/z;->x:Ly71/o;

    iget-object v1, p0, Lea2/z;->y:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/settings/SettingsLandingFragment;->Y(Ly71/o;Lcom/whoop/settings/SettingsLandingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lea2/z;->x:Ly71/o;

    iget-object v1, p0, Lea2/z;->y:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/settings/SettingsLandingFragment;->N(Ly71/o;Lcom/whoop/settings/SettingsLandingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lea2/z;->x:Ly71/o;

    iget-object v1, p0, Lea2/z;->y:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/settings/SettingsLandingFragment;->b0(Ly71/o;Lcom/whoop/settings/SettingsLandingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lea2/z;->x:Ly71/o;

    iget-object v1, p0, Lea2/z;->y:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/settings/SettingsLandingFragment;->u0(Ly71/o;Lcom/whoop/settings/SettingsLandingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lea2/z;->x:Ly71/o;

    iget-object v1, p0, Lea2/z;->y:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/settings/SettingsLandingFragment;->k0(Ly71/o;Lcom/whoop/settings/SettingsLandingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lea2/z;->x:Ly71/o;

    iget-object v1, p0, Lea2/z;->y:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/settings/SettingsLandingFragment;->q0(Ly71/o;Lcom/whoop/settings/SettingsLandingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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
