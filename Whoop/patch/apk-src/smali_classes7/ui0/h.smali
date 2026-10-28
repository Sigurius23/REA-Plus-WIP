.class public final synthetic Lui0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/archv2/feature/view/GenericFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/archv2/feature/view/GenericFragment;I)V
    .locals 0

    iput p2, p0, Lui0/h;->w:I

    iput-object p1, p0, Lui0/h;->x:Lcom/whoop/archv2/feature/view/GenericFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lui0/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lui0/h;->x:Lcom/whoop/archv2/feature/view/GenericFragment;

    invoke-static {v0}, Lcom/whoop/archv2/feature/view/GenericFragment;->z(Lcom/whoop/archv2/feature/view/GenericFragment;)Lqi0/b$a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lui0/h;->x:Lcom/whoop/archv2/feature/view/GenericFragment;

    invoke-static {v0}, Lcom/whoop/archv2/feature/view/GenericFragment;->B(Lcom/whoop/archv2/feature/view/GenericFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lui0/h;->x:Lcom/whoop/archv2/feature/view/GenericFragment;

    invoke-static {v0}, Lcom/whoop/archv2/feature/view/GenericFragment;->D(Lcom/whoop/archv2/feature/view/GenericFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lui0/h;->x:Lcom/whoop/archv2/feature/view/GenericFragment;

    invoke-static {v0}, Lcom/whoop/archv2/feature/view/GenericFragment;->E(Lcom/whoop/archv2/feature/view/GenericFragment;)Ltr2/n;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lui0/h;->x:Lcom/whoop/archv2/feature/view/GenericFragment;

    invoke-static {v0}, Lcom/whoop/archv2/feature/view/GenericFragment;->C(Lcom/whoop/archv2/feature/view/GenericFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
