.class public final synthetic Lid2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/share/view/WhoopShareFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/share/view/WhoopShareFragment;I)V
    .locals 0

    iput p2, p0, Lid2/o;->w:I

    iput-object p1, p0, Lid2/o;->x:Lcom/whoop/share/view/WhoopShareFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lid2/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lid2/o;->x:Lcom/whoop/share/view/WhoopShareFragment;

    invoke-static {v0}, Lcom/whoop/share/view/WhoopShareFragment;->A(Lcom/whoop/share/view/WhoopShareFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lid2/o;->x:Lcom/whoop/share/view/WhoopShareFragment;

    invoke-static {v0}, Lcom/whoop/share/view/WhoopShareFragment;->B(Lcom/whoop/share/view/WhoopShareFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lid2/o;->x:Lcom/whoop/share/view/WhoopShareFragment;

    invoke-static {v0}, Lcom/whoop/share/view/WhoopShareFragment;->E(Lcom/whoop/share/view/WhoopShareFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
