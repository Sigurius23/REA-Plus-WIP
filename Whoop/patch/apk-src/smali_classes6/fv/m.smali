.class public final Lfv/m;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Lfv/m;

.field public static final F:Lfv/m;

.field public static final G:Lfv/m;

.field public static final x:Lfv/m;

.field public static final y:Lfv/m;

.field public static final z:Lfv/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lfv/m;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfv/m;-><init>(II)V

    sput-object v0, Lfv/m;->x:Lfv/m;

    new-instance v0, Lfv/m;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lfv/m;-><init>(II)V

    sput-object v0, Lfv/m;->y:Lfv/m;

    new-instance v0, Lfv/m;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lfv/m;-><init>(II)V

    sput-object v0, Lfv/m;->z:Lfv/m;

    new-instance v0, Lfv/m;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lfv/m;-><init>(II)V

    sput-object v0, Lfv/m;->E:Lfv/m;

    new-instance v0, Lfv/m;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lfv/m;-><init>(II)V

    sput-object v0, Lfv/m;->F:Lfv/m;

    new-instance v0, Lfv/m;

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lfv/m;-><init>(II)V

    sput-object v0, Lfv/m;->G:Lfv/m;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lfv/m;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lfv/m;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/animation/ValueAnimator;

    const-string v0, "$this$put"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x12c

    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    sget-object v0, Lfv/n;->d:Lh8/a;

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroid/animation/ValueAnimator;

    const-string v0, "$this$put"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x12c

    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    sget-object v0, Lfv/n;->d:Lh8/a;

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Landroid/animation/ValueAnimator;

    const-string v0, "$this$put"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x12c

    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    sget-object v0, Lfv/n;->d:Lh8/a;

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Landroid/animation/ValueAnimator;

    const-string v0, "$this$put"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x12c

    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    sget-object v0, Lfv/n;->d:Lh8/a;

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Landroid/animation/ValueAnimator;

    const-string v0, "$this$put"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x12c

    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    sget-object v0, Lfv/n;->d:Lh8/a;

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    check-cast p1, Landroid/animation/ValueAnimator;

    const-string v0, "$this$put"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x12c

    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    sget-object v0, Lfv/n;->d:Lh8/a;

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
