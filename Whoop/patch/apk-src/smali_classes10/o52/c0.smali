.class public final synthetic Lo52/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lo52/d0;


# direct methods
.method public synthetic constructor <init>(Lo52/d0;I)V
    .locals 0

    iput p2, p0, Lo52/c0;->w:I

    iput-object p1, p0, Lo52/c0;->x:Lo52/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lo52/c0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo52/c0;->x:Lo52/d0;

    invoke-static {v0}, Lo52/d0;->O(Lo52/d0;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lo52/c0;->x:Lo52/d0;

    invoke-static {v0}, Lo52/d0;->L(Lo52/d0;)Lcom/whoop/domain/model/StrainRecoveryMapping;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lo52/c0;->x:Lo52/d0;

    invoke-static {v0}, Lo52/d0;->M(Lo52/d0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
