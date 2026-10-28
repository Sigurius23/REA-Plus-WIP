.class public final synthetic Ln72/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public synthetic constructor <init>(ILcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 0

    iput p1, p0, Ln72/a;->w:I

    iput-object p2, p0, Ln72/a;->x:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ln72/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln72/a;->x:Lcom/whoop/data/repositories/FeatureFlagChecker;

    check-cast p1, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;

    invoke-static {v0, p1}, Ln72/c;->e(Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/sage/design/sagemeter/SageGaugeModel;)Lb72/e;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ln72/a;->x:Lcom/whoop/data/repositories/FeatureFlagChecker;

    check-cast p1, Llb1/z0;

    invoke-static {v0, p1}, Ln72/c;->d(Lcom/whoop/data/repositories/FeatureFlagChecker;Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ln72/a;->x:Lcom/whoop/data/repositories/FeatureFlagChecker;

    check-cast p1, Ljb1/b;

    invoke-static {v0, p1}, Ln72/c;->c(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
