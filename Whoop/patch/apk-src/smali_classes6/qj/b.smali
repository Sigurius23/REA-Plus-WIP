.class public final Lqj/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/amplitude/android/engagement/types/ImageBlock;


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/types/ImageBlock;I)V
    .locals 0

    iput p2, p0, Lqj/b;->w:I

    iput-object p1, p0, Lqj/b;->x:Lcom/amplitude/android/engagement/types/ImageBlock;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lqj/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lch/r;

    check-cast p2, Lcoil/compose/AsyncImagePainter$State$Error;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    const-string v0, "$this$SubcomposeAsyncImage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit16 p1, p4, 0x281

    const/16 p2, 0x80

    if-ne p1, p2, :cond_1

    move-object p1, p3

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Lqj/b;->x:Lcom/amplitude/android/engagement/types/ImageBlock;

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/ImageBlock;->getMeta()Lcom/amplitude/android/engagement/types/ImageMeta;

    move-result-object p1

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/ImageMeta;->getFilename()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p4, 0x0

    invoke-static {p1, p2, p3, p4}, Lse/b;->u(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lch/r;

    check-cast p2, Lcoil/compose/AsyncImagePainter$State$Success;

    move-object v7, p3

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p3

    const-string p4, "$this$SubcomposeAsyncImage"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "success"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x70

    if-nez p1, :cond_3

    move-object p1, v7

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0x20

    goto :goto_2

    :cond_2
    const/16 p1, 0x10

    :goto_2
    or-int/2addr p3, p1

    :cond_3
    and-int/lit16 p1, p3, 0x2d1

    const/16 p3, 0x90

    if-ne p1, p3, :cond_5

    move-object p1, v7

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p3

    if-nez p3, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lp1/q;->X()V

    goto/16 :goto_8

    :cond_5
    :goto_3
    invoke-virtual {p2}, Lcoil/compose/AsyncImagePainter$State$Success;->a()Ln2/a;

    move-result-object v0

    invoke-virtual {v0}, Ln2/a;->h()J

    move-result-wide p1

    const-wide p3, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-static {p1, p2, p3, p4}, Lh2/e;->b(JJ)Z

    move-result p3

    const/high16 p4, 0x3f800000    # 1.0f

    if-nez p3, :cond_7

    invoke-static {p1, p2}, Lh2/e;->c(J)F

    move-result p3

    const/4 v1, 0x0

    cmpg-float p3, p3, v1

    if-nez p3, :cond_6

    goto :goto_4

    :cond_6
    invoke-static {p1, p2}, Lh2/e;->e(J)F

    move-result p3

    invoke-static {p1, p2}, Lh2/e;->c(J)F

    move-result p1

    div-float/2addr p3, p1

    goto :goto_5

    :cond_7
    :goto_4
    move p3, p4

    :goto_5
    iget-object p1, p0, Lqj/b;->x:Lcom/amplitude/android/engagement/types/ImageBlock;

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/ImageBlock;->getMeta()Lcom/amplitude/android/engagement/types/ImageMeta;

    move-result-object p2

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/ImageMeta;->getFilename()Ljava/lang/String;

    move-result-object v1

    sget-object p2, Lb2/t;->w:Lb2/t;

    invoke-static {p4, p2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    const/4 v2, 0x0

    invoke-static {p2, v2, p3}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object p2

    move-object p3, v7

    check-cast p3, Lp1/q;

    const v3, -0x1896950d

    invoke-virtual {p3, v3}, Lp1/q;->f0(I)V

    sget-object v3, Luj/k;->a:Lp1/u2;

    invoke-virtual {p3, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Luj/m;

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    iget p3, v3, Luj/m;->L:F

    invoke-static {p3}, Lt0/j;->a(F)Lt0/i;

    move-result-object p3

    invoke-static {p2, p3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/ImageBlock;->getMeta()Lcom/amplitude/android/engagement/types/ImageMeta;

    move-result-object p1

    const-string p3, "<this>"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/ImageMeta;->getStyle()Lcom/amplitude/android/engagement/types/ImageStyle;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/ImageStyle;->getScale()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_6

    :cond_8
    const/4 p1, 0x0

    :goto_6
    if-eqz p1, :cond_b

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    if-nez p3, :cond_9

    goto :goto_7

    :cond_9
    const-string p3, "%"

    invoke-static {p1, p3, v2}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p3

    if-eqz p3, :cond_a

    const/4 p3, 0x1

    invoke-static {p3, p1}, Lyb3/r;->X(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p3

    if-eqz p3, :cond_a

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p1

    const/high16 p3, 0x42c80000    # 100.0f

    div-float p4, p1, p3

    goto :goto_7

    :cond_a
    invoke-static {p1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p4

    :cond_b
    :goto_7
    invoke-static {p4, p2}, Ldt/b;->N(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->s(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->E:Lb2/m;

    const/16 v8, 0x6c08

    const/16 v9, 0x60

    sget-object v4, Ly2/j;->b:Ly2/b1;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    :goto_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Lch/r;

    check-cast p2, Lcoil/compose/AsyncImagePainter$State$Loading;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    const-string v0, "$this$SubcomposeAsyncImage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit16 p1, p4, 0x281

    const/16 p2, 0x80

    if-ne p1, p2, :cond_d

    move-object p1, p3

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_c

    goto :goto_9

    :cond_c
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_a

    :cond_d
    :goto_9
    iget-object p1, p0, Lqj/b;->x:Lcom/amplitude/android/engagement/types/ImageBlock;

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/ImageBlock;->getMeta()Lcom/amplitude/android/engagement/types/ImageMeta;

    move-result-object p1

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/ImageMeta;->getFilename()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p4, 0x0

    invoke-static {p1, p2, p3, p4}, Lse/b;->u(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_a
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
