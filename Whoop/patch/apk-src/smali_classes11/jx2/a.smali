.class public final synthetic Ljx2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/whooplabs/feature/WhoopLabsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/whooplabs/feature/WhoopLabsFragment;I)V
    .locals 0

    iput p2, p0, Ljx2/a;->w:I

    iput-object p1, p0, Ljx2/a;->x:Lcom/whoop/whooplabs/feature/WhoopLabsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ljx2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljx2/a;->x:Lcom/whoop/whooplabs/feature/WhoopLabsFragment;

    invoke-static {v0}, Lcom/whoop/whooplabs/feature/WhoopLabsFragment;->E(Lcom/whoop/whooplabs/feature/WhoopLabsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ljx2/a;->x:Lcom/whoop/whooplabs/feature/WhoopLabsFragment;

    invoke-static {v0}, Lcom/whoop/whooplabs/feature/WhoopLabsFragment;->H(Lcom/whoop/whooplabs/feature/WhoopLabsFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ljx2/a;->x:Lcom/whoop/whooplabs/feature/WhoopLabsFragment;

    invoke-static {v0}, Lcom/whoop/whooplabs/feature/WhoopLabsFragment;->G(Lcom/whoop/whooplabs/feature/WhoopLabsFragment;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
