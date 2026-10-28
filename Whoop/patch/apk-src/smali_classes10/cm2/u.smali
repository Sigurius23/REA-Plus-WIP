.class public final synthetic Lcm2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcm2/v;


# direct methods
.method public synthetic constructor <init>(Lcm2/v;I)V
    .locals 0

    iput p2, p0, Lcm2/u;->w:I

    iput-object p1, p0, Lcm2/u;->x:Lcm2/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcm2/u;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcm2/u;->x:Lcm2/v;

    check-cast p1, Lcom/whoop/trends/data/model/MeasurementBox;

    invoke-static {v0, p1}, Lcm2/v;->a(Lcm2/v;Lcom/whoop/trends/data/model/MeasurementBox;)Lcm2/h;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcm2/u;->x:Lcm2/v;

    check-cast p1, Llb1/z0;

    invoke-static {v0, p1}, Lcm2/v;->c(Lcm2/v;Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
