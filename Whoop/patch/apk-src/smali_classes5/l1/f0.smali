.class public final synthetic Ll1/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ll1/f0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ll1/f0;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Ll72/i;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Ll72/c;->l()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Ll72/c;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Ll31/i;->g()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Ll31/i;->f()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Ll31/i;->i()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Ll31/i;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Ll31/i;->c()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Ll31/i;->e()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Ll31/i;->d()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Ll31/i;->h()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lio/getstream/chat/android/client/notifications/parser/StreamPayloadParser;->a()Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Ll11/c;->f()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Ll11/c;->e()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Ll11/c;->k()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Ll11/c;->g()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Ll11/c;->i()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    new-instance v0, Ll1/y4;

    invoke-direct {v0}, Ll1/y4;-><init>()V

    return-object v0

    :pswitch_12
    sget-object v0, Lo1/e0;->a:Ll3/v0;

    return-object v0

    :pswitch_13
    const/4 v0, 0x0

    int-to-float v0, v0

    new-instance v1, Ly3/f;

    invoke-direct {v1, v0}, Ly3/f;-><init>(F)V

    return-object v1

    :pswitch_14
    new-instance v0, Ll1/p3;

    invoke-direct {v0}, Ll1/p3;-><init>()V

    return-object v0

    :pswitch_15
    new-instance v0, Ll1/j3;

    invoke-direct {v0}, Ll1/j3;-><init>()V

    return-object v0

    :pswitch_16
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    return-object v0

    :pswitch_17
    sget-object v0, Ll1/q2;->a:Ll1/q2;

    return-object v0

    :pswitch_18
    sget-object v0, Ll1/x1;->a:Lp1/u2;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_19
    const/16 v0, 0x30

    int-to-float v0, v0

    new-instance v1, Ly3/f;

    invoke-direct {v1, v0}, Ly3/f;-><init>(F)V

    return-object v1

    :pswitch_1a
    sget-object v0, Ll1/w1;->a:Ly2/m;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_1b
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_1c
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0

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
