.class public final synthetic Ldj1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;I)V
    .locals 0

    iput p2, p0, Ldj1/b;->w:I

    iput-object p1, p0, Ldj1/b;->x:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ldj1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldj1/b;->x:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    check-cast p1, Lcom/whoop/health/domain/models/ScreenerStatusTileBodyModel;

    invoke-static {v0, p1}, Ldj1/c;->a(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Lcom/whoop/health/domain/models/ScreenerStatusTileBodyModel;)Lej1/j0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ldj1/b;->x:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    check-cast p1, Lcom/whoop/health/domain/models/ImageVisualizationCardBodyModel;

    invoke-static {v0, p1}, Ldj1/c;->c(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Lcom/whoop/health/domain/models/ImageVisualizationCardBodyModel;)Lej1/c0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ldj1/b;->x:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    check-cast p1, Llb1/z0;

    invoke-static {v0, p1}, Ldj1/c;->j(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Ldj1/b;->x:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    check-cast p1, Ljb1/b;

    invoke-static {v0, p1}, Ldj1/c;->l(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
