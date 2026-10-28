.class public final synthetic Lhc2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly71/o;

.field public final synthetic y:Lcom/whoop/settings/myaccount/MyAccountFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/myaccount/MyAccountFragment;Ly71/o;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lhc2/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhc2/g;->y:Lcom/whoop/settings/myaccount/MyAccountFragment;

    iput-object p2, p0, Lhc2/g;->x:Ly71/o;

    return-void
.end method

.method public synthetic constructor <init>(Ly71/o;Lcom/whoop/settings/myaccount/MyAccountFragment;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lhc2/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhc2/g;->x:Ly71/o;

    iput-object p2, p0, Lhc2/g;->y:Lcom/whoop/settings/myaccount/MyAccountFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lhc2/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhc2/g;->x:Ly71/o;

    iget-object v1, p0, Lhc2/g;->y:Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-static {v1, v0, p1}, Lcom/whoop/settings/myaccount/MyAccountFragment;->J(Lcom/whoop/settings/myaccount/MyAccountFragment;Ly71/o;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhc2/g;->y:Lcom/whoop/settings/myaccount/MyAccountFragment;

    iget-object v1, p0, Lhc2/g;->x:Ly71/o;

    invoke-static {v0, v1, p1}, Lcom/whoop/settings/myaccount/MyAccountFragment;->f0(Lcom/whoop/settings/myaccount/MyAccountFragment;Ly71/o;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
