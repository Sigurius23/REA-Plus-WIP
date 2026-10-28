.class public final synthetic Lde/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Integer;)V
    .locals 0

    iput p1, p0, Lde/a;->w:I

    iput-object p2, p0, Lde/a;->x:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lde/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lde/a;->x:Ljava/lang/Integer;

    check-cast p1, Leb/y0;

    invoke-static {v0, p1}, Lcom/whoop/membership/familyPlan/navigation/b;->b(Ljava/lang/Integer;Leb/y0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Leg/k;

    const-string v0, "$this$factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lde/a;->x:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    iput v0, p1, Leg/k;->b:I

    goto :goto_0

    :cond_0
    new-instance p1, Laws/sdk/kotlin/runtime/ConfigurationException;

    const-string v1, "max attempts was "

    const-string v2, ", but should be at least 1"

    invoke-static {v0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
