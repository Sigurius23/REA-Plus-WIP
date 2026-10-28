.class public final synthetic Lo52/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/realtime/presentation/j;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/realtime/presentation/j;I)V
    .locals 0

    iput p2, p0, Lo52/i0;->w:I

    iput-object p1, p0, Lo52/i0;->x:Lcom/whoop/realtime/presentation/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lo52/i0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo52/i0;->x:Lcom/whoop/realtime/presentation/j;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/j;->N(Lcom/whoop/realtime/presentation/j;)I

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lo52/i0;->x:Lcom/whoop/realtime/presentation/j;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/j;->M(Lcom/whoop/realtime/presentation/j;)I

    move-result v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
