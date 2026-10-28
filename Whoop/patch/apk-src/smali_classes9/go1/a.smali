.class public final synthetic Lgo1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lgo1/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lgo1/a;->w:I

    const-string v1, "$this$semantics"

    const-string v2, "$this$NavHost"

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Li3/z;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CircularProgressIndicator"

    invoke-static {v0, p1}, Li3/w;->k(Ljava/lang/String;Li3/z;)V

    return-object v3

    :pswitch_0
    check-cast p1, Lc0/q;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lr00/a;->a:Lc0/l0;

    iget-object p1, p1, Lc0/l0;->b:Lc0/e1;

    return-object p1

    :pswitch_1
    check-cast p1, Lc0/q;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lr00/a;->a:Lc0/l0;

    iget-object p1, p1, Lc0/l0;->a:Lc0/c1;

    return-object p1

    :pswitch_2
    check-cast p1, Lc0/q;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lr00/a;->a:Lc0/l0;

    iget-object p1, p1, Lc0/l0;->d:Lc0/r1;

    return-object p1

    :pswitch_3
    check-cast p1, Li3/z;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li3/w;->a:[Lj93/z;

    sget-object v0, Li3/u;->o:Li3/y;

    check-cast p1, Li3/l;

    invoke-virtual {p1, v0, v3}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    return-object v3

    :pswitch_4
    check-cast p1, Lh2/b;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v3

    :pswitch_6
    check-cast p1, Lh2/b;

    sget p1, Lh0/z0;->a:F

    return-object v3

    :pswitch_7
    check-cast p1, Lp1/p1;

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    check-cast p1, Lp1/p1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v0}, Lp1/x;->D(Lp1/p1;Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const-string v0, "android.software.leanback"

    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lh0/s;->a:Lh0/r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lh0/r;->c:Lh0/q;

    goto :goto_0

    :cond_0
    sget-object p1, Lh0/u;->b:Lh0/t;

    :goto_0
    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lmh/h;

    invoke-static {p1}, Lgz2/b;->c(Lmh/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ly00/i;

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Ly00/i;->w:Ljava/lang/String;

    return-object p1

    :pswitch_b
    check-cast p1, Lcom/whoop/weightlifting/data/domain/FilterItem;

    invoke-static {p1}, Lgv2/c;->b(Lcom/whoop/weightlifting/data/domain/FilterItem;)Lgv2/a;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lcom/whoop/weightlifting/data/domain/FilterItem;

    invoke-static {p1}, Lgv2/c;->a(Lcom/whoop/weightlifting/data/domain/FilterItem;)Lgv2/a;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lad3/g;

    invoke-static {p1}, Lgu0/d;->a(Lad3/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lad3/g;

    invoke-static {p1}, Lgu0/b;->a(Lad3/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lgt1/n;->p(Ljava/util/List;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lgt1/n;->k(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Let1/a;

    invoke-static {p1}, Lgt1/n;->q(Let1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lft1/a;

    invoke-static {p1}, Lgt1/n;->f(Lft1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lgt1/l;->j(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Let1/a;

    invoke-static {p1}, Lgt1/l;->n(Let1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lgt1/l;->o(Ljava/util/List;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lft1/a;

    invoke-static {p1}, Lgt1/l;->c(Lft1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lft1/a;

    invoke-static {p1}, Lgt1/c;->a(Lft1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lgt1/b;->e(Ljava/lang/Throwable;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lgt1/b;->a(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lep2/a;

    invoke-static {p1}, Lgp2/f;->f(Lep2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    invoke-static {p1}, Lgp2/e;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    invoke-static {p1}, Lgo1/b;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

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
