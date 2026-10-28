.class public final synthetic Lhu1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lhu1/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lhu1/g;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/activation/domain/models/steps/JoinTeamStepModel;

    invoke-static {p1}, Li80/b;->i(Lcom/whoop/activation/domain/models/steps/JoinTeamStepModel;)Lk90/c;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;

    invoke-static {p1}, Li80/b;->E(Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;)Ly80/d;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/whoop/activation/domain/models/steps/DeidentifiedStepModel;

    invoke-static {p1}, Li80/b;->h(Lcom/whoop/activation/domain/models/steps/DeidentifiedStepModel;)Lx80/c;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;

    invoke-static {p1}, Li80/b;->z(Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;)Lr90/g;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/whoop/activation/domain/models/steps/GenderStepModel;

    invoke-static {p1}, Li80/b;->x(Lcom/whoop/activation/domain/models/steps/GenderStepModel;)Le90/h;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;

    invoke-static {p1}, Li80/b;->C(Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;)Lr80/f;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/whoop/access/programgoaltile/models/ProgramGoalTileModel;

    invoke-static {p1}, Li60/a;->a(Lcom/whoop/access/programgoaltile/models/ProgramGoalTileModel;)Lc60/d;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Li51/k;->c(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {p1}, Li31/c;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {p1}, Li21/t;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {p1}, Li21/s;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-static {p1}, Li21/s;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Ljava/util/UUID;

    invoke-static {p1}, Li21/n;->e(Ljava/util/UUID;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Li21/a;

    invoke-static {p1}, Li21/i;->d(Li21/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ljava/util/UUID;

    invoke-static {p1}, Li21/c;->e(Ljava/util/UUID;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ljava/util/List;

    const-string v0, "textFieldControllerIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/util/Map;

    const-string v0, "entries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll40/a;

    iget-boolean v1, v1, Ll40/a;->b:Z

    if-nez v1, :cond_1

    const/4 p1, 0x0

    :cond_2
    :goto_0
    return-object p1

    :pswitch_10
    check-cast p1, Ljava/util/List;

    const-string v0, "entries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;->a(Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_12
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Li11/e;->h(F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-static {p1}, Li01/f;->i(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Li2/g0;

    invoke-static {p1}, Lhy0/g1;->b(Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Li2/g0;

    invoke-static {p1}, Lhy0/g1;->c(Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lhy0/v0;->a(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Lhy0/f0;->g(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Lhy0/f0;->a(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_19
    invoke-static {p1}, Lhy0/y;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Lhy0/n;->r(F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lhw0/b;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lhu1/h;->f(Ltb/a;)Ljava/lang/Long;

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
