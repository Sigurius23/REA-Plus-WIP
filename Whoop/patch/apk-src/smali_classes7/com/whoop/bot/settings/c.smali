.class public final synthetic Lcom/whoop/bot/settings/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Leb/u0;


# direct methods
.method public synthetic constructor <init>(Leb/u0;I)V
    .locals 0

    iput p2, p0, Lcom/whoop/bot/settings/c;->w:I

    iput-object p1, p0, Lcom/whoop/bot/settings/c;->x:Leb/u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/whoop/bot/settings/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/bot/settings/c;->x:Leb/u0;

    invoke-static {v0}, Lrm2/e;->a(Leb/u0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/bot/settings/c;->x:Leb/u0;

    invoke-static {v0}, Lrm2/e;->A(Leb/u0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/bot/settings/c;->x:Leb/u0;

    invoke-static {v0}, Lrm2/e;->i(Leb/u0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcom/whoop/bot/settings/c;->x:Leb/u0;

    invoke-static {v0}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->n(Leb/u0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lcom/whoop/bot/settings/c;->x:Leb/u0;

    invoke-static {v0}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->J(Leb/u0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lcom/whoop/bot/settings/c;->x:Leb/u0;

    invoke-static {v0}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->o(Leb/u0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lcom/whoop/bot/settings/c;->x:Leb/u0;

    invoke-static {v0}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->L(Leb/u0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lcom/whoop/bot/settings/c;->x:Leb/u0;

    invoke-static {v0}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->N(Leb/u0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lcom/whoop/bot/settings/c;->x:Leb/u0;

    invoke-static {v0}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->I(Leb/u0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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
