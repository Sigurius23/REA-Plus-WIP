.class public final Lrb3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Lrb3/h;

.field public static final F:Lrb3/h;

.field public static final G:Lrb3/h;

.field public static final H:Lrb3/h;

.field public static final I:Lrb3/h;

.field public static final J:Lrb3/h;

.field public static final x:Lrb3/h;

.field public static final y:Lrb3/h;

.field public static final z:Lrb3/h;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lrb3/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrb3/h;-><init>(I)V

    sput-object v0, Lrb3/h;->x:Lrb3/h;

    new-instance v0, Lrb3/h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lrb3/h;-><init>(I)V

    sput-object v0, Lrb3/h;->y:Lrb3/h;

    new-instance v0, Lrb3/h;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lrb3/h;-><init>(I)V

    sput-object v0, Lrb3/h;->z:Lrb3/h;

    new-instance v0, Lrb3/h;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lrb3/h;-><init>(I)V

    sput-object v0, Lrb3/h;->E:Lrb3/h;

    new-instance v0, Lrb3/h;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lrb3/h;-><init>(I)V

    sput-object v0, Lrb3/h;->F:Lrb3/h;

    new-instance v0, Lrb3/h;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lrb3/h;-><init>(I)V

    sput-object v0, Lrb3/h;->G:Lrb3/h;

    new-instance v0, Lrb3/h;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lrb3/h;-><init>(I)V

    sput-object v0, Lrb3/h;->H:Lrb3/h;

    new-instance v0, Lrb3/h;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lrb3/h;-><init>(I)V

    sput-object v0, Lrb3/h;->I:Lrb3/h;

    new-instance v0, Lrb3/h;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lrb3/h;-><init>(I)V

    sput-object v0, Lrb3/h;->J:Lrb3/h;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lrb3/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lrb3/h;->w:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "$this$Checks"

    const/4 v4, 0x0

    const-string v5, "<this>"

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lo93/h;

    sget-object v0, Lrb3/v;->c:Lrb3/v;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lo93/h;->x()Llb3/c0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lo93/h;

    sget-object v0, Lrb3/u;->c:Lrb3/u;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo93/j;->J:Lo93/j;

    invoke-virtual {p1, v0}, Lo93/h;->t(Lo93/j;)Llb3/c0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lo93/h;

    sget-object v0, Lrb3/t;->c:Lrb3/t;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo93/j;->F:Lo93/j;

    invoke-virtual {p1, v0}, Lo93/h;->t(Lo93/j;)Llb3/c0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lr93/w;

    sget-object v0, Lrb3/r;->d:Ljava/util/List;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/b;->y()Lr93/q0;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lr93/b;->B()Lr93/q0;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_8

    invoke-interface {p1}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object v3

    if-eqz v3, :cond_1

    move-object v5, v0

    check-cast v5, Lu93/d;

    invoke-virtual {v5}, Lu93/d;->getType()Llb3/y;

    move-result-object v5

    sget-object v6, Lmb3/d;->a:Lmb3/l;

    invoke-virtual {v6, v3, v5}, Lmb3/l;->b(Llb3/y;Llb3/y;)Z

    move-result v3

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    if-nez v3, :cond_9

    invoke-interface {v0}, Lr93/q0;->getValue()Lfb3/d;

    move-result-object v0

    const-string v3, "getValue(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v3, v0, Lfb3/c;

    if-nez v3, :cond_3

    :cond_2
    :goto_1
    move p1, v2

    goto :goto_3

    :cond_3
    check-cast v0, Lfb3/c;

    iget-object v0, v0, Lfb3/c;->w:Lr93/e;

    invoke-interface {v0}, Lr93/z;->U()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lcb3/e;->f(Lr93/h;)Lva3/c;

    move-result-object v3

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    invoke-static {v0}, Lcb3/e;->j(Lr93/k;)Lr93/b0;

    move-result-object v0

    invoke-static {v0, v3}, Lhg3/i;->M(Lr93/b0;Lva3/c;)Lr93/h;

    move-result-object v0

    instance-of v3, v0, Lr93/w0;

    if-eqz v3, :cond_6

    check-cast v0, Lr93/w0;

    goto :goto_2

    :cond_6
    move-object v0, v4

    :goto_2
    if-nez v0, :cond_7

    goto :goto_1

    :cond_7
    invoke-interface {p1}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast v0, Ljb3/u;

    invoke-virtual {v0}, Ljb3/u;->K0()Llb3/c0;

    move-result-object v0

    sget-object v3, Lmb3/d;->a:Lmb3/l;

    invoke-virtual {v3, p1, v0}, Lmb3/l;->b(Llb3/y;Llb3/y;)Z

    move-result p1

    :goto_3
    if-eqz p1, :cond_8

    goto :goto_4

    :cond_8
    move v1, v2

    :cond_9
    :goto_4
    if-nez v1, :cond_a

    const-string v4, "receiver must be a supertype of the return type"

    :cond_a
    return-object v4

    :pswitch_3
    check-cast p1, Lr93/w;

    sget-object v0, Lrb3/r;->d:Ljava/util/List;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    const-string v3, "getContainingDeclaration(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v5, v0, Lr93/e;

    if-eqz v5, :cond_b

    check-cast v0, Lr93/e;

    sget-object v5, Lo93/h;->e:Lva3/h;

    sget-object v5, Lo93/m;->a:Lva3/f;

    invoke-static {v0, v5}, Lo93/h;->b(Lr93/e;Lva3/f;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto/16 :goto_9

    :cond_b
    invoke-interface {p1}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object v0

    const-string v5, "getOverriddenDescriptors(...)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    move-object v5, v0

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_c

    goto :goto_5

    :cond_c
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr93/w;

    invoke-interface {v5}, Lr93/k;->g()Lr93/k;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v6, v5, Lr93/e;

    if-eqz v6, :cond_d

    check-cast v5, Lr93/e;

    sget-object v6, Lo93/h;->e:Lva3/h;

    sget-object v6, Lo93/m;->a:Lva3/f;

    invoke-static {v5, v6}, Lo93/h;->b(Lr93/e;Lva3/f;)Z

    move-result v5

    if-eqz v5, :cond_d

    goto/16 :goto_9

    :cond_e
    :goto_5
    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    instance-of v5, v0, Lr93/e;

    if-eqz v5, :cond_f

    check-cast v0, Lr93/e;

    goto :goto_6

    :cond_f
    move-object v0, v4

    :goto_6
    if-eqz v0, :cond_14

    invoke-static {v0}, Lya3/h;->e(Lr93/k;)Z

    move-result v5

    if-eqz v5, :cond_10

    goto :goto_7

    :cond_10
    move-object v0, v4

    :goto_7
    if-eqz v0, :cond_14

    invoke-interface {v0}, Lr93/e;->i()Llb3/c0;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-static {v0}, Lio/sentry/config/a;->U(Llb3/y;)Llb3/f1;

    move-result-object v0

    if-nez v0, :cond_11

    goto :goto_8

    :cond_11
    invoke-interface {p1}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object v5

    if-nez v5, :cond_12

    goto :goto_8

    :cond_12
    move-object v6, p1

    check-cast v6, Lu93/n;

    invoke-virtual {v6}, Lu93/n;->getName()Lva3/h;

    move-result-object v6

    sget-object v7, Lrb3/s;->d:Lva3/h;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    sget-object v6, Lo93/h;->e:Lva3/h;

    sget-object v6, Lo93/m;->h:Lva3/f;

    invoke-static {v5, v6}, Lo93/h;->C(Llb3/y;Lva3/f;)Z

    move-result v6

    if-nez v6, :cond_13

    invoke-static {v5}, Lo93/h;->F(Llb3/y;)Z

    move-result v5

    if-eqz v5, :cond_14

    :cond_13
    invoke-interface {p1}, Lr93/b;->v()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ne v5, v1, :cond_14

    invoke-interface {p1}, Lr93/b;->v()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/a1;

    check-cast v1, Lu93/x0;

    invoke-virtual {v1}, Lu93/x0;->getType()Llb3/y;

    move-result-object v1

    const-string v2, "getType(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lio/sentry/config/a;->U(Llb3/y;)Llb3/f1;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {p1}, Lr93/b;->c0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {p1}, Lr93/b;->B()Lr93/q0;

    move-result-object v0

    if-nez v0, :cond_14

    goto :goto_9

    :cond_14
    :goto_8
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "must override \'\'equals()\'\' in Any"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lya3/h;->e(Lr93/k;)Z

    move-result v1

    if-eqz v1, :cond_15

    sget-object v1, Lxa3/i;->d:Lxa3/i;

    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object p1

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lr93/e;

    invoke-interface {p1}, Lr93/e;->i()Llb3/c0;

    move-result-object p1

    const-string v2, "getDefaultType(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/sentry/config/a;->U(Llb3/y;)Llb3/f1;

    move-result-object p1

    invoke-virtual {v1, p1}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " or define \'\'equals(other: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "): Boolean\'\'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_9
    return-object v4

    :pswitch_4
    check-cast p1, Lr93/w;

    sget-object v0, Lrb3/r;->d:Ljava/util/List;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/b;->v()Ljava/util/List;

    move-result-object p1

    const-string v0, "getValueParameters(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr93/a1;

    if-eqz p1, :cond_16

    invoke-static {p1}, Lcb3/e;->a(Lr93/a1;)Z

    move-result v0

    if-nez v0, :cond_16

    check-cast p1, Lu93/w0;

    iget-object p1, p1, Lu93/w0;->K:Llb3/y;

    if-nez p1, :cond_16

    goto :goto_a

    :cond_16
    const-string v4, "last parameter should not have a default value or be a vararg"

    :goto_a
    return-object v4

    :pswitch_5
    check-cast p1, Lr93/w;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v4

    :pswitch_6
    check-cast p1, Lr93/w;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v4

    :pswitch_7
    check-cast p1, Lr93/w;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
