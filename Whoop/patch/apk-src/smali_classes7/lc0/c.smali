.class public final synthetic Llc0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Llc0/c;->w:I

    iput-object p1, p0, Llc0/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Llc0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Llo0/l;

    check-cast p1, Ln0/q;

    invoke-static {v0, p1}, Lno0/s;->f(Llo0/l;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;

    check-cast p1, Llo0/j;

    invoke-static {v0, p1}, Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;->z(Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;Llo0/j;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Ll0/y;

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1}, Lno0/i;->d(Ll0/y;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;

    invoke-static {v0, p1}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->F(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lkb0/b;

    check-cast p1, Lkb0/a;

    invoke-static {v0, p1}, Lcom/whoop/advancedlabs/clinicalinsights/view/ClinicalInsightsFragment;->A(Lkb0/b;Lkb0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/clinicalinsights/view/ClinicalInsightsFragment;

    check-cast p1, Lkd0/a$c;

    invoke-static {v0, p1}, Lcom/whoop/advancedlabs/clinicalinsights/view/ClinicalInsightsFragment;->B(Lcom/whoop/advancedlabs/clinicalinsights/view/ClinicalInsightsFragment;Lkd0/a$c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, [Ll83/k;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Ln71/o;->g([Ll83/k;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Ll42/b;

    check-cast p1, Ll42/a;

    invoke-static {v0, p1}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->A(Ll42/b;Ll42/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lm1/x;

    check-cast p1, Li3/z;

    invoke-interface {v0}, Lm1/x;->invoke()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    new-instance v1, Li3/h;

    invoke-interface {v0}, Lm1/x;->invoke()F

    move-result v0

    new-instance v3, Li93/e;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v3, v2, v4}, Li93/e;-><init>(FF)V

    const/4 v2, 0x0

    invoke-direct {v1, v0, v3, v2}, Li3/h;-><init>(FLi93/f;I)V

    invoke-static {p1, v1}, Li3/w;->h(Li3/z;Li3/h;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Ln0/k;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-wide v1, v0, Ln0/k;->E:J

    invoke-virtual {v0, p1, v1, v2}, Ln0/k;->Q(IJ)Ln0/o;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lmx2/h$b$c;

    check-cast p1, Lmx2/f$a;

    invoke-static {v0, p1}, Lmx2/h;->e(Lmx2/h$b$c;Lmx2/f$a;)Lmx2/f$a;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lmx2/h$b$k;

    check-cast p1, Lmx2/f$a;

    invoke-static {v0, p1}, Lmx2/h;->a(Lmx2/h$b$k;Lmx2/f$a;)Lmx2/f$a;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lmx2/h$b$m;

    check-cast p1, Lmx2/f$a;

    invoke-static {v0, p1}, Lmx2/h;->d(Lmx2/h$b$m;Lmx2/f$a;)Lmx2/f$a;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lmx2/h$b$h;

    check-cast p1, Lmx2/f$a;

    invoke-static {v0, p1}, Lmx2/h;->b(Lmx2/h$b$h;Lmx2/f$a;)Lmx2/f$a;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Ljx1/x;

    check-cast p1, Lk2/e;

    invoke-static {v0, p1}, Lmx1/r;->a(Ljx1/x;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lm92/j;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lm92/j;->k(Lm92/j;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lm83/f;

    check-cast p1, Ljava/util/Map$Entry;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "(this Map)"

    if-ne v2, v0, :cond_1

    move-object v2, v3

    goto :goto_0

    :cond_1
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lm83/a;

    if-ne p1, v0, :cond_3

    const-string p1, "(this Collection)"

    goto :goto_2

    :cond_3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1

    :pswitch_11
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lj22/h;

    check-cast p1, Lj22/f;

    invoke-static {v0, p1}, Lcom/whoop/pairing/ui/view/PairingFragment;->z(Lj22/h;Lj22/f;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/pairing/ui/view/PairingFragment;

    check-cast p1, Lk22/e;

    invoke-static {v0, p1}, Lcom/whoop/pairing/ui/view/PairingFragment;->B(Lcom/whoop/pairing/ui/view/PairingFragment;Lk22/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Li3/z;

    check-cast p1, La3/p2;

    const-string v1, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lm1/c0;

    const/4 v1, 0x1

    iput-boolean v1, p1, Lm1/c0;->P:Z

    iget-object v1, p1, Lm1/c0;->O:Ljs2/h;

    invoke-virtual {v1, v0}, Ljs2/h;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, La3/g;->j(La3/j2;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_14
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Ll1/x4;

    check-cast p1, Lp1/i0;

    new-instance p1, Lb1/e;

    const/4 v1, 0x7

    invoke-direct {p1, v0, v1}, Lb1/e;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :pswitch_15
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lzr2/a;

    check-cast p1, Lad3/g;

    invoke-static {v0, p1}, Llu2/d;->a(Lzr2/a;Lad3/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Llq2/p$a$a;

    check-cast p1, Lf2/d;

    invoke-static {v0, p1}, Llq2/p;->a(Llq2/p$a$a;Lf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/videoview/textureview/HMSTextureRenderer;

    check-cast p1, Lhms/webrtc/RendererCommon$RendererEvents;

    invoke-static {v0, p1}, Llive/hms/videoview/textureview/HMSTextureRenderer;->a(Llive/hms/videoview/textureview/HMSTextureRenderer;Lhms/webrtc/RendererCommon$RendererEvents;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/videoview/HMSVideoView;

    check-cast p1, Lhms/webrtc/RendererCommon$RendererEvents;

    invoke-static {v0, p1}, Llive/hms/videoview/HMSVideoView;->b(Llive/hms/videoview/HMSVideoView;Lhms/webrtc/RendererCommon$RendererEvents;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/strava/view/StravaFragment;

    check-cast p1, Lji2/i;

    invoke-static {v0, p1}, Lcom/whoop/strava/view/StravaFragment;->B(Lcom/whoop/strava/view/StravaFragment;Lji2/i;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/stories/OnboardingStoriesDebugFragment;

    check-cast p1, Ln0/q;

    invoke-static {v0, p1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->I(Lcom/whoop/stories/OnboardingStoriesDebugFragment;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;

    check-cast p1, Lie0/a;

    invoke-static {v0, p1}, Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;->B(Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;Lie0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Llc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/feature/hormonalcontext/view/HormonalContextFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/view/HormonalContextFragment;->z(Lcom/whoop/advancedlabs/feature/hormonalcontext/view/HormonalContextFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
