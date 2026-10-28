.class public final synthetic Lu0/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lu0/n1;


# direct methods
.method public synthetic constructor <init>(Lu0/n1;I)V
    .locals 0

    iput p2, p0, Lu0/l1;->w:I

    iput-object p1, p0, Lu0/l1;->x:Lu0/n1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lu0/l1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lu0/l1;->x:Lu0/n1;

    iget-object v0, v0, Lu0/n1;->a:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lu0/l1;->x:Lu0/n1;

    iget-object v1, v0, Lu0/n1;->a:Lp1/g1;

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v1

    iget-object v0, v0, Lu0/n1;->b:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    cmpg-float v0, v1, v0

    if-gez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
