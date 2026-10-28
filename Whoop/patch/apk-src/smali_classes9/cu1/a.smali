.class public final synthetic Lcu1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/labrador/fragment/LabradorDetailsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/labrador/fragment/LabradorDetailsFragment;I)V
    .locals 0

    iput p2, p0, Lcu1/a;->w:I

    iput-object p1, p0, Lcu1/a;->x:Lcom/whoop/labrador/fragment/LabradorDetailsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcu1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcu1/a;->x:Lcom/whoop/labrador/fragment/LabradorDetailsFragment;

    invoke-static {v0}, Lcom/whoop/labrador/fragment/LabradorDetailsFragment;->K(Lcom/whoop/labrador/fragment/LabradorDetailsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcu1/a;->x:Lcom/whoop/labrador/fragment/LabradorDetailsFragment;

    invoke-static {v0}, Lcom/whoop/labrador/fragment/LabradorDetailsFragment;->J(Lcom/whoop/labrador/fragment/LabradorDetailsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcu1/a;->x:Lcom/whoop/labrador/fragment/LabradorDetailsFragment;

    invoke-static {v0}, Lcom/whoop/labrador/fragment/LabradorDetailsFragment;->D(Lcom/whoop/labrador/fragment/LabradorDetailsFragment;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcu1/a;->x:Lcom/whoop/labrador/fragment/LabradorDetailsFragment;

    invoke-static {v0}, Lcom/whoop/labrador/fragment/LabradorDetailsFragment;->E(Lcom/whoop/labrador/fragment/LabradorDetailsFragment;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lcu1/a;->x:Lcom/whoop/labrador/fragment/LabradorDetailsFragment;

    invoke-static {v0}, Lcom/whoop/labrador/fragment/LabradorDetailsFragment;->I(Lcom/whoop/labrador/fragment/LabradorDetailsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lcu1/a;->x:Lcom/whoop/labrador/fragment/LabradorDetailsFragment;

    invoke-static {v0}, Lcom/whoop/labrador/fragment/LabradorDetailsFragment;->A(Lcom/whoop/labrador/fragment/LabradorDetailsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lcu1/a;->x:Lcom/whoop/labrador/fragment/LabradorDetailsFragment;

    invoke-static {v0}, Lcom/whoop/labrador/fragment/LabradorDetailsFragment;->y(Lcom/whoop/labrador/fragment/LabradorDetailsFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
