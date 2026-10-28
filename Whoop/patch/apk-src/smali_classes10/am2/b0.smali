.class public final synthetic Lam2/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/trends/view/TrendsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/trends/view/TrendsFragment;I)V
    .locals 0

    iput p2, p0, Lam2/b0;->w:I

    iput-object p1, p0, Lam2/b0;->x:Lcom/whoop/trends/view/TrendsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lam2/b0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lam2/b0;->x:Lcom/whoop/trends/view/TrendsFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/trends/view/TrendsFragment;->R(Lcom/whoop/trends/view/TrendsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lam2/b0;->x:Lcom/whoop/trends/view/TrendsFragment;

    check-cast p2, Lcom/whoop/util/TrendKey;

    invoke-static {v0, p1, p2}, Lcom/whoop/trends/view/TrendsFragment;->K(Lcom/whoop/trends/view/TrendsFragment;Ljava/lang/Object;Lcom/whoop/util/TrendKey;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
