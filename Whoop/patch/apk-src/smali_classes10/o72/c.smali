.class public final synthetic Lo72/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/sage/view/SageFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/sage/view/SageFragment;I)V
    .locals 0

    iput p2, p0, Lo72/c;->w:I

    iput-object p1, p0, Lo72/c;->x:Lcom/whoop/sage/view/SageFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lo72/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo72/c;->x:Lcom/whoop/sage/view/SageFragment;

    invoke-static {v0}, Lcom/whoop/sage/view/SageFragment;->A(Lcom/whoop/sage/view/SageFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lo72/c;->x:Lcom/whoop/sage/view/SageFragment;

    invoke-static {v0}, Lcom/whoop/sage/view/SageFragment;->y(Lcom/whoop/sage/view/SageFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lo72/c;->x:Lcom/whoop/sage/view/SageFragment;

    invoke-static {v0}, Lcom/whoop/sage/view/SageFragment;->D(Lcom/whoop/sage/view/SageFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
