.class public final synthetic Lno0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;I)V
    .locals 0

    iput p2, p0, Lno0/u;->w:I

    iput-object p1, p0, Lno0/u;->x:Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lno0/u;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lno0/u;->x:Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;

    check-cast p1, Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v0, p1}, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;->A(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lno0/u;->x:Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;

    check-cast p1, Llo0/r;

    invoke-static {v0, p1}, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;->B(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;Llo0/r;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
