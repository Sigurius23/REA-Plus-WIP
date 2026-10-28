.class public final synthetic Llc0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Llc0/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llc0/g;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Llive/hms/video/media/capturers/camera/utils/BitMatrix;

    invoke-static {p1}, Llive/hms/video/media/capturers/camera/utils/OrientationTools;->b(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Llive/hms/video/media/capturers/camera/utils/BitMatrix;

    invoke-static {p1}, Llive/hms/video/media/capturers/camera/utils/OrientationTools;->a(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Llive/hms/video/media/capturers/camera/utils/BitMatrix;

    invoke-static {p1}, Llive/hms/video/media/capturers/camera/utils/OrientationTools;->e(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Llive/hms/video/media/capturers/camera/utils/BitMatrix;

    invoke-static {p1}, Llive/hms/video/media/capturers/camera/utils/OrientationTools;->f(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Llive/hms/video/media/capturers/camera/utils/BitMatrix;

    invoke-static {p1}, Llive/hms/video/media/capturers/camera/utils/OrientationTools;->c(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->G(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;

    invoke-static {p1}, Lcom/whoop/startactivity/goals/targetcard/a;->d(Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;)Llg2/b;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lcom/whoop/startactivity/goals/targetcard/a;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lcom/whoop/startactivity/goals/targetcard/a;->e(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lcom/whoop/startactivity/goals/targetcard/a;->c(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Llg0/g;->b(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-static {p1}, Llf0/h2;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-static {p1}, Llf0/f2;->k(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lld0/h;

    invoke-static {p1}, Llf0/b2;->d(Lld0/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, La01/m;

    invoke-static {p1}, Llf0/b2;->b(La01/m;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-static {p1}, Llf0/o1;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Llf0/q0;

    invoke-static {p1}, Llf0/t0;->g(Llf0/q0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-static {p1}, Llf0/o0;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-static {p1}, Llf0/l0;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    invoke-static {p1}, Llf0/b0;->i(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-static {p1}, Llf0/b0;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    invoke-static {p1}, Llf0/b0;->m(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;

    invoke-static {p1}, Llf0/p;->f(Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    invoke-static {p1}, Llf0/g;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    invoke-static {p1}, Llf0/d;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    invoke-static {p1}, Lle0/b;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lie0/a;

    invoke-static {p1}, Lle0/b;->b(Lie0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Ljc0/a;

    invoke-static {p1}, Llc0/j;->d(Ljc0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    invoke-static {p1}, Llc0/j;->j(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Ljc0/a;

    invoke-static {p1}, Llc0/h;->b(Ljc0/a;)Ll83/a0;

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
