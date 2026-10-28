.class public abstract Lx43/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/u0;


# static fields
.field public static a:Lo2/e;

.field public static b:Ljava/lang/Boolean;

.field public static c:Lqg3/d;


# direct methods
.method public static A(La3/n0;)Ljava/util/List;
    .locals 5

    sget-object v0, Lx43/j;->b:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, La3/n0;->getChildren$ui()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.node.LayoutNode>"

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    invoke-static {}, Lx43/j;->B()Lqg3/d;

    move-result-object v0

    iget-object v0, v0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/List;

    return-object p0

    :cond_1
    if-nez v0, :cond_2

    :try_start_0
    invoke-virtual {p0}, La3/n0;->getChildren$ui()Ljava/util/List;

    move-result-object v0

    sput-object v1, Lx43/j;->b:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v0, Lx43/j;->b:Ljava/lang/Boolean;

    invoke-static {}, Lx43/j;->B()Lqg3/d;

    move-result-object v0

    iget-object v0, v0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/List;

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static B()Lqg3/d;
    .locals 5

    const-class v0, La3/n0;

    sget-object v1, Lx43/j;->c:Lqg3/d;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    const-string v1, "getChildren$ui_release"

    const/4 v2, 0x1

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v3

    :goto_0
    const-string v4, "getOuterCoordinator$ui_release"

    :try_start_1
    invoke-virtual {v0, v4, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v3, v0

    :catch_1
    new-instance v0, Lqg3/d;

    const/16 v2, 0x12

    invoke-direct {v0, v2, v1, v3}, Lqg3/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Lx43/j;->c:Lqg3/d;

    return-object v0
.end method

.method public static C()Lb3/d;
    .locals 2

    sget-object v0, Lb3/d;->e:Lb3/d;

    if-nez v0, :cond_0

    new-instance v0, Lb3/d;

    invoke-direct {v0}, Lb3/b;-><init>()V

    sput-object v0, Lb3/d;->e:Lb3/d;

    :cond_0
    sget-object v0, Lb3/d;->e:Lb3/d;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final D(Lj93/e;)Lj93/d;
    .locals 5

    instance-of v0, p0, Lj93/d;

    if-eqz v0, :cond_0

    check-cast p0, Lj93/d;

    return-object p0

    :cond_0
    instance-of v0, p0, Lj93/b0;

    if-eqz v0, :cond_6

    check-cast p0, Lj93/b0;

    invoke-interface {p0}, Lj93/b0;->getUpperBounds()Ljava/util/List;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lj93/a0;

    invoke-interface {v3}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v3

    instance-of v4, v3, Lkotlin/reflect/jvm/internal/KClassImpl;

    if-eqz v4, :cond_2

    move-object v2, v3

    check-cast v2, Lkotlin/reflect/jvm/internal/KClassImpl;

    :cond_2
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/KClassImpl;->getClassKind$kotlin_reflection()Laa3/q;

    move-result-object v3

    sget-object v4, Laa3/q;->y:Laa3/q;

    if-eq v3, v4, :cond_1

    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/KClassImpl;->getClassKind$kotlin_reflection()Laa3/q;

    move-result-object v2

    sget-object v3, Laa3/q;->F:Laa3/q;

    if-eq v2, v3, :cond_1

    move-object v2, v1

    :cond_3
    check-cast v2, Lj93/a0;

    if-nez v2, :cond_4

    invoke-static {p0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lj93/a0;

    :cond_4
    if-eqz v2, :cond_5

    invoke-static {v2}, Lx43/j;->E(Lj93/a0;)Lj93/d;

    move-result-object p0

    return-object p0

    :cond_5
    const-class p0, Ljava/lang/Object;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    return-object p0

    :cond_6
    new-instance v0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot calculate JVM erasure for type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final E(Lj93/a0;)Lj93/d;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lx43/j;->D(Lj93/e;)Lj93/d;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot calculate JVM erasure for type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static F(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/UUID;
    .locals 1

    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    :try_start_0
    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    const-string v0, "fromString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0

    :cond_0
    sget p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {p0}, Lo73/a;->w(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object p0

    throw p0

    :cond_1
    sget p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {p0}, Lo73/a;->x(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object p0

    throw p0
.end method

.method public static G(Lorg/json/JSONObject;Ljava/lang/String;Z)Z
    .locals 1

    if-eqz p2, :cond_1

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {p1}, Lo73/a;->x(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object p0

    throw p0

    :cond_1
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_4

    sget-object v0, Lr30/e;->c0:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz p2, :cond_3

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_3

    sget p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {p1}, Lo73/a;->x(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object p0

    goto :goto_1

    :cond_3
    sget p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {p1}, Lo73/a;->w(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object p0

    :goto_1
    throw p0

    :cond_4
    const-string p1, "Y"

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static H(ILjava/lang/Integer;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;)I
    .locals 4

    check-cast p3, Lp1/q;

    const v0, -0x35b2e087

    invoke-virtual {p3, v0}, Lp1/q;->e0(I)V

    const v0, -0x43be5e24

    invoke-virtual {p3, v0}, Lp1/q;->e0(I)V

    const v0, -0x5b23d4c6

    invoke-virtual {p3, v0}, Lp1/q;->e0(I)V

    invoke-static {p3}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v0

    iget-wide v0, v0, Ld40/n;->a:J

    invoke-static {v0, v1}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, v0, v2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-gez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    :cond_1
    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    sget-object p1, Ld40/r;->g:Lp1/u2;

    invoke-virtual {p3, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld40/h;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_3

    if-ne p1, v1, :cond_2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_1

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    :goto_1
    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    return p0
.end method

.method public static I(Lj93/a0;)Lj93/d0;
    .locals 2

    const-string v0, "type"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj93/d0;

    sget-object v1, Lj93/e0;->w:Lj93/e0;

    invoke-direct {v0, v1, p0}, Lj93/d0;-><init>(Lj93/e0;Lj93/a0;)V

    return-object v0
.end method

.method public static J(Landroid/view/accessibility/AccessibilityManager;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lb3/g1;->k(Landroid/view/accessibility/AccessibilityManager;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static K(La3/n0;)Z
    .locals 5

    sget-object v0, Lx43/j;->b:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, La3/n0;->getOuterCoordinator$ui()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->o1()Z

    move-result p0

    return p0

    :cond_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator"

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    invoke-static {}, Lx43/j;->B()Lqg3/d;

    move-result-object v0

    iget-object v0, v0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->o1()Z

    move-result p0

    return p0

    :cond_1
    if-nez v0, :cond_2

    :try_start_0
    invoke-virtual {p0}, La3/n0;->getOuterCoordinator$ui()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->o1()Z

    move-result v0

    sput-object v1, Lx43/j;->b:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v0, Lx43/j;->b:Ljava/lang/Boolean;

    invoke-static {}, Lx43/j;->B()Lqg3/d;

    move-result-object v0

    iget-object v0, v0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->o1()Z

    move-result p0

    return p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final L(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    move v1, v0

    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Lva3/d;->i(C)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    return v0
.end method

.method public static M(FFF)F
    .locals 0

    invoke-static {p1, p0, p2, p0}, Lb9/y;->a(FFFF)F

    move-result p0

    return p0
.end method

.method public static final O(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)Z
    .locals 18

    sget-object v0, Lp6/z;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v1, "vivo"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    invoke-static {}, Lr6/n;->E()Lr6/a;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->a()Landroidx/glance/appwidget/protobuf/a0;

    move-result-object v0

    check-cast v0, Lr6/n;

    const-string v1, "context"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ljc/v;->g(Landroid/content/Context;)Ljc/v;

    move-result-object v1

    new-instance v2, Lic/z;

    const-class v3, Landroidx/glance/appwidget/AsyncRequestWorker;

    invoke-direct {v2, v3}, Lic/q0;-><init>(Ljava/lang/Class;)V

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    const/4 v5, 0x0

    :try_start_0
    invoke-virtual {v0, v5}, Landroidx/glance/appwidget/protobuf/a0;->b(Landroidx/glance/appwidget/protobuf/b1;)I

    move-result v6

    new-array v7, v6, [B

    sget-object v8, Landroidx/glance/appwidget/protobuf/p;->e:Ljava/util/logging/Logger;

    new-instance v8, Landroidx/glance/appwidget/protobuf/n;

    invoke-direct {v8, v7, v6}, Landroidx/glance/appwidget/protobuf/n;-><init>([BI)V

    invoke-virtual {v0, v8}, Landroidx/glance/appwidget/protobuf/a0;->m(Landroidx/glance/appwidget/protobuf/p;)V

    invoke-virtual {v8}, Landroidx/glance/appwidget/protobuf/n;->C0()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_2

    invoke-static {v7}, Lic/h;->b([B)[Ljava/lang/Byte;

    move-result-object v0

    const-string v6, "request"

    invoke-interface {v4, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lic/g;

    invoke-direct {v0, v4}, Lic/g;-><init>(Ljava/util/LinkedHashMap;)V

    invoke-static {v0}, Lpf/c;->X(Lic/g;)[B

    invoke-virtual {v2, v0}, Lic/q0;->h(Lic/g;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    invoke-virtual {v1, v0}, Lic/p0;->c(Lic/r0;)Lic/e0;

    sget-object v0, Lic/l;->x:Lic/l;

    new-instance v2, Lic/z;

    invoke-direct {v2, v3}, Lic/q0;-><init>(Ljava/lang/Class;)V

    const-wide/16 v3, 0xe42

    sget-object v6, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v3, v4, v6}, Lic/q0;->g(JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object v2

    check-cast v2, Lic/z;

    new-instance v7, Lrc/e;

    invoke-direct {v7, v5}, Lrc/e;-><init>(Landroid/net/NetworkRequest;)V

    sget-object v8, Lic/x;->w:Lic/x;

    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v3}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v17

    new-instance v6, Lic/e;

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, -0x1

    move-wide v15, v13

    invoke-direct/range {v6 .. v17}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    invoke-virtual {v2, v6}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v2

    check-cast v2, Lic/z;

    invoke-virtual {v2}, Lic/q0;->b()Lic/r0;

    move-result-object v2

    check-cast v2, Lic/a0;

    const-string v3, "updateRequestWorkerKeepEnabled"

    invoke-virtual {v1, v3, v0, v2}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    const/4 v0, 0x1

    return v0

    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Serializing "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v3, Lr6/n;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " to a byte array threw an IOException (should never happen)."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static final varargs P([Lo6/d;)Lo6/f;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p0

    const/4 v2, 0x0

    if-gtz v1, :cond_0

    new-array p0, v2, [Ll83/k;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ll83/k;

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ll83/k;

    invoke-static {p0}, Lm83/g0;->b0([Ll83/k;)Ljava/util/LinkedHashMap;

    move-result-object p0

    new-instance v0, Lo6/f;

    invoke-direct {v0, p0}, Lo6/f;-><init>(Ljava/util/LinkedHashMap;)V

    return-object v0

    :cond_0
    aget-object p0, p0, v2

    const/4 p0, 0x0

    throw p0
.end method

.method public static final Q(Log/g;Lce/v;Ljava/lang/String;)Ljava/util/Map;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "logger"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "type"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lm83/z;->w:Lm83/z;

    if-eqz p2, :cond_28

    invoke-static/range {p2 .. p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_d

    :cond_0
    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v3

    invoke-static/range {p2 .. p2}, Lyb3/r;->m0(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v11, v8, 0x1

    if-ltz v8, :cond_1

    check-cast v9, Ljava/lang/String;

    new-instance v8, Lce/m;

    invoke-direct {v8, v11, v9}, Lce/m;-><init>(ILjava/lang/String;)V

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v8, v11

    goto :goto_0

    :cond_1
    invoke-static {}, Lwb3/f;->d0()V

    throw v10

    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lce/m;

    iget-object v11, v9, Lce/m;->b:Ljava/lang/String;

    invoke-static {v11}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_3

    iget-object v9, v9, Lce/m;->b:Ljava/lang/String;

    invoke-static {v9}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v11, "#"

    invoke-static {v9, v11, v7}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v11

    if-nez v11, :cond_3

    const-string v11, ";"

    invoke-static {v9, v11, v7}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v5, v10

    move-object v8, v5

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lce/m;

    const-string v11, "input"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v1, Lce/v;->x:Ljava/util/List;

    check-cast v11, Ljava/lang/Iterable;

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_6
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lkotlin/jvm/functions/Function3;

    invoke-interface {v12, v9, v5, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lce/b0;

    if-eqz v12, :cond_6

    goto :goto_3

    :cond_7
    move-object v12, v10

    :goto_3
    if-eqz v12, :cond_a

    instance-of v11, v12, Lce/z;

    if-eqz v11, :cond_8

    move-object v5, v12

    check-cast v5, Lce/z;

    move-object v8, v10

    goto :goto_4

    :cond_8
    instance-of v11, v12, Lce/y;

    if-eqz v11, :cond_9

    move-object v8, v12

    check-cast v8, Lce/y;

    :cond_9
    :goto_4
    new-instance v11, Ll83/k;

    invoke-direct {v11, v9, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v11}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_a
    new-instance v0, Laws/sdk/kotlin/runtime/config/profile/AwsConfigParseException;

    iget v1, v9, Lce/m;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Encountered unexpected token"

    invoke-static {v1, v2}, Lbp/b;->o(Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    invoke-static {v3}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v1

    const-string v3, "<this>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ln83/f;

    invoke-direct {v3}, Ln83/f;-><init>()V

    new-instance v4, Lkotlin/jvm/internal/g0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v7}, Ln83/c;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    move-object v5, v10

    move-object v8, v5

    :goto_5
    move-object v9, v1

    check-cast v9, Ln83/b;

    invoke-virtual {v9}, Ln83/b;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_19

    invoke-virtual {v9}, Ln83/b;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll83/k;

    iget-object v11, v9, Ll83/k;->w:Ljava/lang/Object;

    check-cast v11, Lce/m;

    iget-object v9, v9, Ll83/k;->x:Ljava/lang/Object;

    check-cast v9, Lce/b0;

    instance-of v12, v9, Lce/z;

    if-eqz v12, :cond_e

    iput-object v9, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {v3, v9}, Ln83/f;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    move-object v5, v9

    check-cast v5, Lce/z;

    iget-boolean v5, v5, Lce/z;->d:Z

    if-nez v5, :cond_c

    new-instance v5, Lce/c;

    const/4 v12, 0x0

    invoke-direct {v5, v11, v9, v12}, Lce/c;-><init>(Lce/m;Lce/b0;I)V

    invoke-interface {v0, v10, v5}, Log/g;->n(Ljava/lang/Throwable;Lc93/a;)V

    goto :goto_6

    :cond_c
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v3, v9, v5}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    :goto_6
    move-object v5, v10

    goto :goto_5

    :cond_e
    instance-of v12, v9, Lce/y;

    const-string v13, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.Token.Section"

    if-eqz v12, :cond_13

    iget-object v5, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lce/z;

    move-object v5, v9

    check-cast v5, Lce/y;

    iget-object v12, v5, Lce/y;->a:Ljava/lang/String;

    invoke-static {v12}, Lbp/b;->B(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_f

    new-instance v12, Lce/c;

    const/4 v13, 0x1

    invoke-direct {v12, v11, v9, v13}, Lce/c;-><init>(Lce/m;Lce/b0;I)V

    invoke-interface {v0, v10, v12}, Log/g;->n(Ljava/lang/Throwable;Lc93/a;)V

    goto :goto_5

    :cond_f
    iget-object v13, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v14, v13

    check-cast v14, Lce/z;

    iget-boolean v14, v14, Lce/z;->d:Z

    if-nez v14, :cond_10

    new-instance v9, Lce/d;

    const/4 v12, 0x0

    invoke-direct {v9, v12, v11, v4}, Lce/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v10, v9}, Log/g;->n(Ljava/lang/Throwable;Lc93/a;)V

    goto :goto_5

    :cond_10
    invoke-virtual {v3, v13}, Ln83/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v13, Ljava/util/Map;

    invoke-interface {v13, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_11

    new-instance v14, Lhb3/w;

    const/4 v15, 0x2

    invoke-direct {v14, v11, v9, v4, v15}, Lhb3/w;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v0, v10, v14}, Log/g;->n(Ljava/lang/Throwable;Lc93/a;)V

    :cond_11
    invoke-interface {v13, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_12

    new-instance v14, Lce/c;

    const/4 v15, 0x2

    invoke-direct {v14, v11, v9, v15}, Lce/c;-><init>(Lce/m;Lce/b0;I)V

    invoke-interface {v0, v10, v14}, Log/g;->n(Ljava/lang/Throwable;Lc93/a;)V

    :cond_12
    new-instance v9, Lce/f;

    iget-object v11, v5, Lce/y;->b:Ljava/lang/String;

    invoke-direct {v9, v11}, Lce/f;-><init>(Ljava/lang/String;)V

    invoke-interface {v13, v12, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_5

    :cond_13
    instance-of v12, v9, Lce/x;

    const-string v14, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.Token.Property"

    if-eqz v12, :cond_14

    iget-object v11, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Lce/z;

    invoke-static {v5, v14}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v5, Lce/y;->a:Ljava/lang/String;

    iget-object v12, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {v3, v12}, Ln83/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v12, Ljava/util/Map;

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    const-string v14, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.AwsConfigValue.String"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Lce/f;

    iget-object v13, v13, Lce/f;->w:Ljava/lang/String;

    new-instance v14, Lce/f;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    check-cast v9, Lce/x;

    iget-object v9, v9, Lce/x;->a:Ljava/lang/String;

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v14, v9}, Lce/f;-><init>(Ljava/lang/String;)V

    invoke-interface {v12, v11, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_5

    :cond_14
    instance-of v12, v9, Lce/a0;

    if-eqz v12, :cond_18

    iget-object v12, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Lce/z;

    invoke-static {v5, v14}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v12, v5, Lce/y;->a:Ljava/lang/String;

    move-object v13, v9

    check-cast v13, Lce/a0;

    iget-object v14, v13, Lce/a0;->a:Ljava/lang/String;

    invoke-static {v14}, Lbp/b;->B(Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_15

    new-instance v12, Lce/c;

    const/4 v13, 0x3

    invoke-direct {v12, v11, v9, v13}, Lce/c;-><init>(Lce/m;Lce/b0;I)V

    invoke-interface {v0, v10, v12}, Log/g;->n(Ljava/lang/Throwable;Lc93/a;)V

    goto/16 :goto_5

    :cond_15
    iget-object v15, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {v3, v15}, Ln83/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v15, Ljava/util/Map;

    invoke-interface {v15, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v6, v16

    check-cast v6, Lce/g;

    instance-of v7, v6, Lce/f;

    if-eqz v7, :cond_17

    check-cast v6, Lce/f;

    iget-object v6, v6, Lce/f;->w:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_16

    new-instance v6, Lce/c;

    const/4 v7, 0x4

    invoke-direct {v6, v11, v9, v7}, Lce/c;-><init>(Lce/m;Lce/b0;I)V

    invoke-interface {v0, v10, v6}, Log/g;->n(Ljava/lang/Throwable;Lc93/a;)V

    :cond_16
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v7, Lce/e;

    invoke-direct {v7, v6}, Lce/e;-><init>(Ljava/util/LinkedHashMap;)V

    invoke-interface {v15, v12, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v8, v6

    :cond_17
    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v6, v13, Lce/a0;->b:Ljava/lang/String;

    invoke-interface {v8, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v6, 0xa

    const/4 v7, 0x0

    goto/16 :goto_5

    :cond_18
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_19
    invoke-virtual {v3}, Ln83/f;->b()Ln83/f;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v0}, Ln83/f;->entrySet()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ln83/g;

    invoke-virtual {v3}, Ln83/g;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    move-object v4, v3

    check-cast v4, Li6/c;

    invoke-virtual {v4}, Li6/c;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1f

    move-object v4, v3

    check-cast v4, Ln83/d;

    invoke-virtual {v4}, Ln83/d;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lce/z;

    iget-boolean v5, v5, Lce/z;->c:Z

    const/4 v6, 0x1

    if-ne v5, v6, :cond_1a

    goto :goto_8

    :cond_1a
    if-nez v5, :cond_1e

    invoke-virtual {v0}, Ln83/f;->keySet()Ljava/util/Set;

    move-result-object v5

    check-cast v5, Lu1/g;

    iget-object v6, v5, Lu1/g;->x:Ljava/lang/Object;

    check-cast v6, Ln83/f;

    invoke-virtual {v6}, Ln83/f;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1b

    goto :goto_8

    :cond_1b
    invoke-virtual {v5}, Lu1/g;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lce/z;

    iget-boolean v7, v6, Lce/z;->c:Z

    if-eqz v7, :cond_1c

    iget-object v7, v6, Lce/z;->a:Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lce/z;

    iget-object v8, v8, Lce/z;->a:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1c

    iget-object v6, v6, Lce/z;->b:Lce/l;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lce/z;

    iget-object v7, v7, Lce/z;->b:Lce/l;

    if-ne v6, v7, :cond_1c

    goto :goto_7

    :cond_1d
    :goto_8
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_1e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1f
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_20

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    new-instance v4, Lce/k;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lce/z;

    iget-object v5, v5, Lce/z;->a:Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lce/z;

    iget-object v3, v3, Lce/z;->b:Lce/l;

    invoke-direct {v4, v5, v6, v3}, Lce/k;-><init>(Ljava/lang/String;Ljava/util/Map;Lce/l;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_20
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {}, Lce/l;->values()[Lce/l;

    move-result-object v3

    array-length v4, v3

    const/4 v7, 0x0

    :goto_a
    if-ge v7, v4, :cond_27

    aget-object v5, v3, v7

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_21
    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_22

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lce/k;

    iget-object v10, v10, Lce/k;->c:Lce/l;

    if-ne v10, v5, :cond_21

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_22
    new-instance v8, Ln83/f;

    invoke-direct {v8}, Ln83/f;-><init>()V

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_25

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lce/k;

    iget-object v10, v9, Lce/k;->a:Ljava/lang/String;

    invoke-virtual {v8, v10}, Ln83/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lce/k;

    if-eqz v10, :cond_23

    iget-object v10, v10, Lce/k;->b:Ljava/util/Map;

    if-nez v10, :cond_24

    :cond_23
    move-object v10, v2

    :cond_24
    iget-object v11, v9, Lce/k;->b:Ljava/util/Map;

    invoke-static {v10, v11}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v10

    iget-object v11, v9, Lce/k;->a:Ljava/lang/String;

    new-instance v12, Lce/k;

    iget-object v9, v9, Lce/k;->c:Lce/l;

    invoke-direct {v12, v11, v10, v9}, Lce/k;-><init>(Ljava/lang/String;Ljava/util/Map;Lce/l;)V

    invoke-virtual {v8, v11, v12}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    :cond_25
    invoke-virtual {v8}, Ln83/f;->b()Ln83/f;

    move-result-object v6

    invoke-virtual {v6}, Ln83/f;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_26

    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_26
    add-int/lit8 v7, v7, 0x1

    goto :goto_a

    :cond_27
    return-object v1

    :cond_28
    :goto_d
    return-object v2
.end method

.method public static final R(Lc2/a;Landroid/util/SparseArray;)V
    .locals 5

    iget-object v0, p0, Lc2/a;->b:Lc2/m;

    iget-object v0, v0, Lc2/m;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_6

    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/autofill/AutofillValue;

    invoke-virtual {v3}, Landroid/view/autofill/AutofillValue;->isText()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lc2/a;->b:Lc2/m;

    invoke-virtual {v3}, Landroid/view/autofill/AutofillValue;->getTextValue()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v4, Lc2/m;->a:Ljava/util/LinkedHashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc2/l;

    if-eqz v2, :cond_2

    iget-object v2, v2, Lc2/l;->c:Lkotlin/jvm/functions/Function1;

    if-eqz v2, :cond_2

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Landroid/view/autofill/AutofillValue;->isDate()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Landroid/view/autofill/AutofillValue;->isList()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v3}, Landroid/view/autofill/AutofillValue;->isToggle()Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    new-instance p0, Ll83/j;

    const-string p1, "An operation is not implemented: b/138604541:  Add onFill() callback for toggle"

    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance p0, Ll83/j;

    const-string p1, "An operation is not implemented: b/138604541: Add onFill() callback for list"

    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Ll83/j;

    const-string p1, "An operation is not implemented: b/138604541: Add onFill() callback for date"

    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    :goto_2
    return-void
.end method

.method public static final S(Lc2/a;Landroid/view/ViewStructure;)V
    .locals 11

    iget-object v0, p0, Lc2/a;->b:Lc2/m;

    iget-object v1, v0, Lc2/m;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v1, v0, Lc2/m;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/ViewStructure;->addChildCount(I)I

    move-result v1

    iget-object v0, v0, Lc2/m;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc2/l;

    invoke-virtual {p1, v1}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    move-result-object v4

    iget-object v5, p0, Lc2/a;->d:Landroid/view/autofill/AutofillId;

    invoke-virtual {v4, v5, v3}, Landroid/view/ViewStructure;->setAutofillId(Landroid/view/autofill/AutofillId;I)V

    iget-object v5, p0, Lc2/a;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v4, v3, v5, v6, v6}, Landroid/view/ViewStructure;->setId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-virtual {v4, v3}, Landroid/view/ViewStructure;->setAutofillType(I)V

    iget-object v3, v2, Lc2/l;->a:Ljava/util/List;

    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v7, 0x0

    move v8, v7

    :goto_1
    if-ge v8, v6, :cond_2

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lc2/n;

    sget-object v10, Lc2/e;->a:Ljava/util/HashMap;

    invoke-virtual {v10, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_1

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unsupported autofill type"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-array v3, v7, [Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    invoke-virtual {v4, v3}, Landroid/view/ViewStructure;->setAutofillHints([Ljava/lang/String;)V

    iget-object v2, v2, Lc2/l;->b:Lh2/c;

    if-nez v2, :cond_3

    const-string v2, "Autofill Warning"

    const-string v3, "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? "

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_3
    iget v3, v2, Lh2/c;->a:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v5

    iget v3, v2, Lh2/c;->b:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v6

    iget v3, v2, Lh2/c;->c:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget v2, v2, Lh2/c;->d:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    sub-int v9, v3, v5

    sub-int v10, v2, v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v4 .. v10}, Landroid/view/ViewStructure;->setDimens(IIIIII)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_4
    :goto_3
    return-void
.end method

.method public static final synthetic U(Lc43/v;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const-string p0, "subscriber"

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const-string p0, "publisher"

    return-object p0
.end method

.method public static final V(Ljava/util/List;)Ljava/util/List;
    .locals 2

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    check-cast p0, Ljava/util/Collection;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method

.method public static final W(Ljava/util/Map;)Ljava/util/Map;
    .locals 2

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->E0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map$Entry;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object p0, Lm83/z;->w:Lm83/z;

    return-object p0
.end method

.method public static final X(Ld00/f;)La30/k0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ld00/e;

    if-eqz v0, :cond_0

    sget-object p0, La30/k0;->w:La30/k0;

    return-object p0

    :cond_0
    instance-of v0, p0, Ld00/b;

    if-eqz v0, :cond_2

    check-cast p0, Ld00/b;

    iget-object p0, p0, Ld00/b;->a:Ljava/lang/String;

    if-eqz p0, :cond_1

    sget-object p0, La30/k0;->y:La30/k0;

    return-object p0

    :cond_1
    sget-object p0, La30/k0;->x:La30/k0;

    return-object p0

    :cond_2
    sget-object v0, Ld00/d;->a:Ld00/d;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, La30/k0;->x:La30/k0;

    return-object p0

    :cond_3
    sget-object v0, Ld00/c;->a:Ld00/c;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    instance-of p0, p0, Ld00/a;

    if-eqz p0, :cond_4

    goto :goto_0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    :goto_0
    sget-object p0, La30/k0;->z:La30/k0;

    return-object p0
.end method

.method public static final Y(Lvf/a;Ldg/a;Lq83/j;Lqf/b;)Lud3/o0;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "execContext"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "callContext"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "metrics"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lud3/n0;

    invoke-direct {v1}, Lud3/n0;-><init>()V

    new-instance v2, Lrf/w;

    invoke-direct {v2, p1, p2, p3}, Lrf/w;-><init>(Ldg/a;Lq83/j;Lqf/b;)V

    const-class p1, Lrf/w;

    invoke-static {p1}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const-string p3, "type"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, v1, Lud3/n0;->e:Lv63/c;

    invoke-virtual {p3, p1, v2}, Lv63/c;->k(Lj93/d;Ljava/lang/Object;)Lv63/c;

    move-result-object p1

    iput-object p1, v1, Lud3/n0;->e:Lv63/c;

    invoke-interface {p0}, Lvf/a;->getUrl()Lcg/o;

    move-result-object p1

    iget-object p1, p1, Lcg/o;->h:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lud3/n0;->f(Ljava/lang/String;)V

    invoke-interface {p0}, Lvf/a;->getHeaders()Lmf/h;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lkotlin/jvm/internal/k0;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {p3, v2, v3}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    new-instance v2, Lr12/a;

    const/4 v3, 0x2

    invoke-direct {v2, p3, v3}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v2}, Lgf/t;->c(Lc93/m;)V

    invoke-interface {p1}, Lgf/t;->f()Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "identity"

    const-string v2, "Accept-Encoding"

    invoke-virtual {p3, v2, p1}, Lkotlin/jvm/internal/k0;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p3}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lud3/n0;->d(Lud3/d0;)V

    invoke-interface {p0}, Lvf/a;->getMethod()Lmf/r;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->X(Ljava/lang/String;)Z

    move-result p1

    const/4 p3, 0x0

    if-eqz p1, :cond_c

    invoke-interface {p0}, Lvf/a;->getBody()Lmf/l;

    move-result-object p1

    instance-of v2, p1, Lmf/j;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    sget-object p1, Lud3/v0;->Companion:Lud3/u0;

    new-array p2, v3, [B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3, p2, v3, v3}, Lud3/u0;->c(Lud3/h0;[BII)Lud3/t0;

    move-result-object p3

    goto/16 :goto_3

    :cond_1
    instance-of v2, p1, Lof/a;

    if-eqz v2, :cond_2

    check-cast p1, Lof/a;

    iget-object p1, p1, Lof/a;->a:[B

    sget-object p2, Lud3/v0;->Companion:Lud3/u0;

    array-length v0, p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3, p1, v3, v0}, Lud3/u0;->c(Lud3/h0;[BII)Lud3/t0;

    move-result-object p3

    goto/16 :goto_3

    :cond_2
    instance-of v2, p1, Lmf/k;

    if-nez v2, :cond_4

    instance-of v2, p1, Lmf/n;

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_4
    :goto_0
    invoke-interface {p0}, Lvf/a;->getHeaders()Lmf/h;

    move-result-object v2

    const-string v3, "Content-Length"

    invoke-interface {v2, v3}, Lgf/t;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_b

    invoke-virtual {p1}, Lmf/l;->a()Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {p1}, Lmf/l;->a()Ljava/lang/Long;

    move-result-object v3

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v3, v3, v5

    if-nez v3, :cond_8

    :cond_6
    instance-of p3, p1, Lmf/k;

    if-eqz p3, :cond_7

    move-object p3, p1

    check-cast p3, Lmf/k;

    invoke-virtual {p3}, Lmf/k;->d()Lyf/u;

    move-result-object p3

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmf/o;

    invoke-direct {v0, v2, p3}, Lmf/o;-><init>(Ljava/lang/Long;Lyf/u;)V

    move-object p3, v0

    goto :goto_1

    :cond_7
    instance-of p3, p1, Lmf/n;

    if-eqz p3, :cond_a

    move-object p3, p1

    check-cast p3, Lmf/n;

    iget-object p3, p3, Lmf/n;->b:Lt9/u;

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v2, Lmf/n;

    invoke-direct {v2, v0, p3}, Lmf/n;-><init>(Ljava/lang/Long;Lt9/u;)V

    move-object p3, v2

    :cond_8
    :goto_1
    if-nez p3, :cond_9

    goto :goto_2

    :cond_9
    move-object p1, p3

    goto :goto_2

    :cond_a
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_b
    :goto_2
    new-instance p3, Lrf/x;

    invoke-direct {p3, p1, p2}, Lrf/x;-><init>(Lmf/l;Lq83/j;)V

    goto :goto_3

    :cond_c
    invoke-interface {p0}, Lvf/a;->getBody()Lmf/l;

    move-result-object p1

    instance-of p1, p1, Lmf/j;

    if-eqz p1, :cond_d

    :goto_3
    invoke-interface {p0}, Lvf/a;->getMethod()Lmf/r;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0, p3}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    new-instance p0, Lud3/o0;

    invoke-direct {p0, v1}, Lud3/o0;-><init>(Lud3/n0;)V

    return-object p0

    :cond_d
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "unexpected HTTP body for method "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Lvf/a;->getMethod()Lmf/r;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final Z(Lud3/x0;)Lwf/a;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrf/t;

    iget-object v1, p0, Lud3/x0;->F:Lud3/d0;

    invoke-direct {v0, v1}, Lrf/t;-><init>(Lud3/d0;)V

    iget-object v1, p0, Lud3/x0;->G:Lud3/a1;

    invoke-virtual {v1}, Lud3/a1;->i()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    sget-object v1, Lmf/j;->a:Lmf/j;

    goto :goto_0

    :cond_0
    new-instance v1, Lmf/o;

    invoke-direct {v1, p0}, Lmf/o;-><init>(Lud3/x0;)V

    :goto_0
    sget-object v2, Lmf/t;->c:Lmf/t;

    iget p0, p0, Lud3/x0;->z:I

    sget-object v2, Lmf/t;->i:Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmf/t;

    if-nez v2, :cond_1

    new-instance v2, Lmf/t;

    const-string v3, "Unknown HttpStatusCode"

    invoke-direct {v2, p0, v3}, Lmf/t;-><init>(ILjava/lang/String;)V

    :cond_1
    new-instance p0, Lwf/a;

    invoke-direct {p0, v2, v0, v1}, Lwf/a;-><init>(Lmf/t;Lmf/h;Lmf/l;)V

    return-object p0
.end method

.method public static final a0(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x5

    const-string v1, "ServiceConnection"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v1, p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lg40/d0;ZLandroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v2, p1

    move/from16 v8, p4

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, 0x55f395b5

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    move-object/from16 v10, p0

    if-nez v0, :cond_1

    invoke-virtual {v9, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v1, v8, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, v8, 0x180

    move/from16 v11, p2

    if-nez v1, :cond_5

    invoke-virtual {v9, v11}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    move v12, v0

    and-int/lit16 v0, v12, 0x93

    const/16 v1, 0x92

    if-ne v0, v1, :cond_7

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v6, v9

    goto :goto_7

    :cond_7
    :goto_4
    iget-object v0, v2, Lg40/d0;->c:Lec3/h2;

    const/4 v13, 0x0

    invoke-static {v0, v9, v13}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    iget-object v1, v2, Lg40/d0;->d:Ln53/e;

    invoke-static {v1, v9, v13}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v14

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    const v0, 0x2865c415

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_9

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_8

    goto :goto_5

    :cond_8
    move-object v0, v1

    move-object v1, v2

    goto :goto_6

    :cond_9
    :goto_5
    new-instance v0, La1/e;

    const/4 v6, 0x0

    const/16 v7, 0x1a

    const/4 v1, 0x1

    const-class v3, Lg40/d0;

    const-string v4, "onValueChange"

    const-string v5, "onValueChange(Z)V"

    invoke-direct/range {v0 .. v7}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object v1, v2

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_6
    check-cast v0, Lj93/g;

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    new-instance v4, Lay/n;

    const/4 v0, 0x4

    invoke-direct {v4, v1, v0}, Lay/n;-><init>(Ljava/lang/Object;I)V

    new-instance v5, Lg40/o;

    const/4 v0, 0x1

    invoke-direct {v5, v14, v0}, Lg40/o;-><init>(Lp1/t2;I)V

    and-int/lit16 v7, v12, 0x38e

    move-object v6, v9

    move-object v0, v10

    move v2, v11

    move v1, v15

    invoke-static/range {v0 .. v7}, Lx43/j;->e(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;Lay/n;Lg40/o;Landroidx/compose/runtime/Composer;I)V

    :goto_7
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v0, Lar2/f;

    const/16 v5, 0xf

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move v4, v8

    invoke-direct/range {v0 .. v5}, Lar2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZII)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method public static final e(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;Lay/n;Lg40/o;Landroidx/compose/runtime/Composer;I)V
    .locals 39

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v0, p4

    move-object/from16 v10, p5

    move/from16 v11, p7

    const-string v3, "onValueChange"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p6

    check-cast v7, Lp1/q;

    const v3, -0x23e28ddd

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v11, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v11

    goto :goto_1

    :cond_1
    move v3, v11

    :goto_1
    and-int/lit8 v5, v11, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v7, v2}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit16 v5, v11, 0x180

    if-nez v5, :cond_5

    move/from16 v5, p2

    invoke-virtual {v7, v5}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v3, v6

    goto :goto_4

    :cond_5
    move/from16 v5, p2

    :goto_4
    and-int/lit16 v6, v11, 0xc00

    const-string v8, "BACS_MANDATE_CHECKBOX"

    if-nez v6, :cond_7

    invoke-virtual {v7, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_5

    :cond_6
    const/16 v6, 0x400

    :goto_5
    or-int/2addr v3, v6

    :cond_7
    and-int/lit16 v6, v11, 0x6000

    if-nez v6, :cond_9

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x4000

    goto :goto_6

    :cond_8
    const/16 v6, 0x2000

    :goto_6
    or-int/2addr v3, v6

    :cond_9
    const/high16 v6, 0x30000

    and-int/2addr v6, v11

    if-nez v6, :cond_b

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    const/high16 v6, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v6, 0x10000

    :goto_7
    or-int/2addr v3, v6

    :cond_b
    const/high16 v6, 0x180000

    and-int/2addr v6, v11

    if-nez v6, :cond_d

    invoke-virtual {v7, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    const/high16 v6, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v6, 0x80000

    :goto_8
    or-int/2addr v3, v6

    :cond_d
    move/from16 v23, v3

    const v3, 0x92493

    and-int v3, v23, v3

    const v6, 0x92492

    if-ne v3, v6, :cond_f

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_9

    :cond_e
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v12, v7

    goto/16 :goto_f

    :cond_f
    :goto_9
    if-eqz v2, :cond_10

    const v3, 0x7f140b5c

    goto :goto_a

    :cond_10
    const v3, 0x7f140966

    :goto_a
    invoke-static {v7, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    const v6, -0x1cd59ef7

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    shr-int/lit8 v6, v23, 0x12

    and-int/lit8 v6, v6, 0xe

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v10, v7, v6}, Lg40/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    invoke-static {v7}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v12

    iget-object v12, v12, Ld40/n;->i:Lg1/c1;

    invoke-virtual {v12}, Lg1/c1;->c()J

    move-result-wide v12

    const v14, -0x1cd59071

    invoke-virtual {v7, v14}, Lp1/q;->e0(I)V

    const/16 v21, 0x0

    const/16 v22, 0x18

    const-wide/16 v18, 0x0

    move-wide v14, v12

    move-wide/from16 v16, v12

    move-object/from16 v20, v7

    invoke-static/range {v12 .. v22}, Ldp/d;->r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;

    move-result-object v7

    move-wide v13, v12

    move-object/from16 v12, v20

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    const v15, -0x1cd5905b

    invoke-virtual {v12, v15}, Lp1/q;->e0(I)V

    if-nez v7, :cond_11

    invoke-static {v12}, Lg1/l3;->a(Landroidx/compose/runtime/Composer;)Lg1/c1;

    move-result-object v7

    invoke-virtual {v7}, Lg1/c1;->f()J

    move-result-wide v15

    invoke-static {v12}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v7

    iget-wide v6, v7, Ld40/n;->e:J

    invoke-static {v12}, Lg1/l3;->a(Landroidx/compose/runtime/Composer;)Lg1/c1;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lg1/c1;->h()J

    move-result-wide v17

    const/16 v21, 0x0

    const/16 v22, 0x18

    move-object/from16 v20, v12

    move-wide/from16 v37, v15

    move-wide v14, v13

    move-wide/from16 v12, v37

    move-wide/from16 v16, v17

    const-wide/16 v18, 0x0

    move-wide/from16 v37, v14

    move-wide v14, v6

    move-wide/from16 v6, v37

    invoke-static/range {v12 .. v22}, Ldp/d;->r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;

    move-result-object v12

    move-object/from16 v13, v20

    move-wide v14, v6

    const/4 v6, 0x0

    goto :goto_b

    :cond_11
    move-wide v14, v13

    move-object v13, v12

    move-object v12, v7

    :goto_b
    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    const v6, -0x1cd556bc

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_12

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v7, v6, :cond_13

    :cond_12
    new-instance v7, Lb30/y4;

    const/16 v6, 0x18

    invoke-direct {v7, v3, v6}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    invoke-static {v1, v6, v7}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v1, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v1, v13, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v6, v13, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v16, v9

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v2, v13, Lp1/q;->S:Z

    if-eqz v2, :cond_14

    invoke-virtual {v13, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_14
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_c
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v13, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v13, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    move-object/from16 v17, v2

    iget-boolean v2, v13, Lp1/q;->S:Z

    if-nez v2, :cond_15

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    :cond_15
    invoke-static {v6, v13, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v13, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v5, Li3/i;

    const/4 v3, 0x1

    invoke-direct {v5, v3}, Li3/i;-><init>(I)V

    move-object v4, v2

    new-instance v2, Lb30/w4;

    move-object v6, v7

    const/4 v7, 0x1

    move-object v11, v6

    move-object/from16 p6, v12

    move-object/from16 v10, v17

    move-object/from16 v6, p3

    move-object v12, v4

    move-wide/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v4, p2

    move v15, v3

    move/from16 v3, p1

    invoke-direct/range {v2 .. v7}, Lb30/w4;-><init>(ZZLjava/lang/Object;Ljava/lang/Object;I)V

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v2}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v8}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->a:Ll0/e;

    sget-object v5, Lb2/e;->J:Lb2/l;

    invoke-static {v4, v5, v13, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v13, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v13, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-eqz v7, :cond_17

    invoke-virtual {v13, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_17
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v13, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_18

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    :cond_18
    invoke-static {v5, v13, v5, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v13, v12, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v1, 0x8

    int-to-float v1, v1

    const/16 v28, 0x0

    const/16 v29, 0xb

    const/16 v25, 0x0

    const/16 v26, 0x0

    move/from16 v27, v1

    move-object/from16 v24, v3

    invoke-static/range {v24 .. v29}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    shr-int/lit8 v1, v23, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v1, v1, 0x1b0

    shl-int/lit8 v2, v23, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int v8, v1, v2

    const/16 v9, 0x10

    const/4 v3, 0x0

    move/from16 v2, p1

    move/from16 v5, p2

    move-object/from16 v6, p6

    move-object v7, v13

    move-object/from16 v1, v16

    invoke-static/range {v2 .. v9}, Lg1/b1;->a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLg1/a1;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v7

    shr-int/lit8 v2, v23, 0xf

    and-int/lit8 v2, v2, 0xe

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v12, v2}, Lay/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v12}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v3

    iget-object v3, v3, Lg1/h9;->g:Ll3/v0;

    invoke-static {v12}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v4

    iget-wide v4, v4, Ld40/n;->g:J

    const/16 v35, 0x0

    const v36, 0xfffa

    const/4 v13, 0x0

    move-wide/from16 v6, v17

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v34, 0x0

    move-object/from16 v32, v3

    move-object/from16 v33, v12

    move v3, v15

    move-object v12, v2

    move v2, v14

    move-wide v14, v4

    invoke-static/range {v12 .. v36}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v33

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    const v4, -0xe8c5613

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    if-nez v1, :cond_1a

    goto :goto_e

    :cond_1a
    invoke-static {v6, v7, v1, v12, v2}, Lx43/j;->h(JLjava/lang/String;Landroidx/compose/runtime/Composer;I)V

    :goto_e
    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1b

    new-instance v0, Lb30/v;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lb30/v;-><init>(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;Lay/n;Lg40/o;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method public static final f(Lcom/amplitude/android/engagement/a;Lb2/z;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 52

    move-object/from16 v1, p0

    move-object/from16 v5, p3

    check-cast v5, Lp1/q;

    const v0, -0x74ff5c0c

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    iget-object v0, v1, Lcom/amplitude/android/engagement/a;->j:Lec3/r1;

    const/16 v2, 0x8

    invoke-static {v0, v5, v2}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    const/high16 v12, 0x3f800000    # 1.0f

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const v3, 0x3f666666    # 0.9f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-wide v3, Luj/g;->e:J

    sget-object v14, Li2/w0;->a:Li2/v0;

    invoke-static {v2, v3, v4, v14}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, Lb2/e;->w:Lb2/m;

    const/4 v15, 0x0

    invoke-static {v6, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v8, v5, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_0

    invoke-virtual {v5, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_0
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v5, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v5, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v15, v5, Lp1/q;->S:Z

    if-nez v15, :cond_1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v15, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_2

    :cond_1
    invoke-static {v8, v5, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v12, La3/k;->d:La3/i;

    invoke-static {v5, v12, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v15, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    move-object/from16 v17, v0

    const/4 v0, 0x0

    invoke-static {v15, v2, v5, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object v0, v2

    move-wide/from16 v18, v3

    iget-wide v2, v5, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v5, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-eqz v8, :cond_3

    invoke-virtual {v5, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    invoke-static {v5, v11, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v5, Lp1/q;->S:Z

    if-nez v1, :cond_4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    invoke-static {v2, v5, v2, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    invoke-static {v5, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-wide/from16 v2, v18

    invoke-static {v1, v2, v3, v14}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v2, Luj/g;->b:F

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v6, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    move v6, v2

    iget-wide v2, v5, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-eqz v8, :cond_6

    invoke-virtual {v5, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v5, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    invoke-static {v2, v5, v2, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v5, v12, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x7f080492

    const/4 v3, 0x0

    invoke-static {v1, v5, v3}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v2

    const/16 v1, 0x18

    int-to-float v1, v1

    invoke-static {v1, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->E:Lb2/m;

    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v4, v1, v3}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object v3, v10

    const/16 v10, 0x38

    move-object v8, v11

    const/16 v11, 0x78

    move-object/from16 v18, v3

    const-string v3, "Amplitude Logo"

    move-object/from16 v19, v9

    move-object v9, v5

    const/4 v5, 0x0

    move/from16 v20, v6

    const/4 v6, 0x0

    move-object/from16 v21, v7

    const/4 v7, 0x0

    move-object/from16 v22, v8

    const/4 v8, 0x0

    move-object/from16 v23, v12

    move-object v12, v0

    move-object/from16 v0, v18

    move-object/from16 v18, v14

    move/from16 v14, v20

    move-object/from16 v20, v19

    move-object/from16 v19, v23

    move-object/from16 v23, v4

    move-object v4, v1

    move-object/from16 v1, v22

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const/4 v8, 0x1

    invoke-virtual {v9, v8}, Lp1/q;->q(Z)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v2, 0x0

    invoke-static {v2, v9, v8}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v4

    const/16 v5, 0xe

    invoke-static {v3, v4, v5}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v14, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v24

    const/16 v3, 0x50

    int-to-float v3, v3

    const/16 v29, 0x7

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move/from16 v28, v3

    invoke-static/range {v24 .. v29}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v15, v12, v9, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-eqz v6, :cond_9

    invoke-virtual {v9, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_9
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v9, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v10, v21

    invoke-static {v9, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-nez v4, :cond_a

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    move-object/from16 v11, v20

    goto :goto_5

    :cond_b
    move-object/from16 v11, v20

    :goto_4
    move-object/from16 v2, v19

    goto :goto_6

    :goto_5
    invoke-static {v2, v9, v2, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_4

    :goto_6
    invoke-static {v9, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface/range {v17 .. v17}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/amplitude/android/engagement/types/SimulationContext;

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/SimulationContext;->getSimulatedNudge()Lcom/amplitude/android/engagement/types/Nudge;

    move-result-object v3

    :goto_7
    move-object/from16 v5, p0

    goto :goto_8

    :cond_c
    const/4 v3, 0x0

    goto :goto_7

    :goto_8
    iget-object v6, v5, Lcom/amplitude/android/engagement/a;->f:Ljava/util/LinkedHashMap;

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_9

    :cond_d
    const/4 v7, 0x0

    :goto_9
    invoke-interface {v6, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    new-instance v7, Loj/e;

    move-object/from16 v4, v17

    invoke-direct {v7, v3, v4, v8}, Loj/e;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lp1/c1;I)V

    const v8, 0x578b87e2

    invoke-static {v8, v9, v7}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const-string v8, "DETAILS"

    move-object/from16 v20, v11

    const/16 v11, 0x36

    invoke-static {v8, v7, v9, v11}, Lx43/j;->g(Ljava/lang/String;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v9, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object v7, v0

    new-instance v0, Loj/i;

    move-object/from16 v30, v1

    move-object/from16 v31, v2

    move-object v1, v3

    move v2, v6

    move-object v8, v7

    move-object/from16 v3, p1

    move-object/from16 v7, p2

    move-object v6, v4

    move/from16 v4, p4

    invoke-direct/range {v0 .. v7}, Loj/i;-><init>(Lcom/amplitude/android/engagement/types/Nudge;ZLb2/z;ILcom/amplitude/android/engagement/a;Lp1/c1;Lc93/a;)V

    move-object v7, v3

    const v1, 0x15d1c44b

    invoke-static {v1, v9, v0}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const-string v1, "DEBUG"

    invoke-static {v1, v0, v9, v11}, Lx43/j;->g(Ljava/lang/String;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    sget-object v0, Lb2/e;->H:Lb2/m;

    move-object/from16 v1, v23

    invoke-virtual {v1, v13, v0}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v15, v12, v9, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v9, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-eqz v4, :cond_e

    invoke-virtual {v9, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_a
    move-object/from16 v11, v30

    goto :goto_b

    :cond_e
    invoke-virtual {v9}, Lp1/q;->s0()V

    goto :goto_a

    :goto_b
    invoke-static {v9, v11, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-nez v1, :cond_f

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    :cond_f
    move-object/from16 v12, v20

    goto :goto_d

    :cond_10
    move-object/from16 v12, v20

    :goto_c
    move-object/from16 v1, v31

    goto :goto_e

    :goto_d
    invoke-static {v2, v9, v2, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v9, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v4, 0x0

    const/4 v6, 0x7

    const/4 v0, 0x0

    move-object/from16 v31, v1

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move-object v5, v9

    move-object/from16 v9, v31

    invoke-static/range {v0 .. v6}, Ll1/k3;->d(Landroidx/compose/ui/Modifier;JFILandroidx/compose/runtime/Composer;I)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-wide v1, Li2/x;->f:J

    move-object/from16 v3, v18

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v14, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v14}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v2, Lb2/e;->J:Lb2/l;

    const/4 v3, 0x6

    invoke-static {v1, v2, v5, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v2, v5, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-eqz v4, :cond_11

    invoke-virtual {v5, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_11
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v5, v11, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v5, Lp1/q;->S:Z

    if-nez v1, :cond_12

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    :cond_12
    invoke-static {v2, v5, v2, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v5, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v14, 0x3f800000    # 1.0f

    float-to-double v0, v14

    const-wide/16 v21, 0x0

    cmpl-double v0, v0, v21

    const-string v23, "invalid weight; must be greater than zero"

    if-lez v0, :cond_14

    goto :goto_10

    :cond_14
    invoke-static/range {v23 .. v23}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_10
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v24, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v1, v14, v24

    if-lez v1, :cond_15

    move/from16 v2, v24

    :goto_11
    const/4 v1, 0x1

    goto :goto_12

    :cond_15
    move v2, v14

    goto :goto_11

    :goto_12
    invoke-direct {v0, v2, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {v5, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_16

    if-ne v3, v4, :cond_17

    :cond_16
    new-instance v3, Loj/f;

    invoke-direct {v3, v7, v1}, Loj/f;-><init>(Lb2/z;I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v3, Lc93/a;

    const/4 v2, 0x7

    const/4 v6, 0x0

    const/4 v14, 0x0

    invoke-static {v0, v6, v14, v3, v2}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v3, Luj/g;->a:F

    const/4 v14, 0x0

    invoke-static {v0, v14, v3, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v14, Lb2/e;->N:Lb2/k;

    const/16 v6, 0x30

    invoke-static {v15, v14, v5, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move/from16 v25, v3

    iget-wide v2, v5, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-eqz v6, :cond_18

    invoke-virtual {v5, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_18
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v5, v11, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v5, Lp1/q;->S:Z

    if-nez v1, :cond_19

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    :cond_19
    invoke-static {v2, v5, v2, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    invoke-static {v5, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Ldp/d;->c:Lo2/e;

    if-eqz v0, :cond_1b

    move-object/from16 v34, v4

    move-object/from16 v35, v5

    goto/16 :goto_14

    :cond_1b
    new-instance v27, Lo2/d;

    const/16 v35, 0x0

    const/16 v37, 0x60

    const-string v28, "Filled.Refresh"

    const/high16 v29, 0x41c00000    # 24.0f

    const/high16 v30, 0x41c00000    # 24.0f

    const/high16 v31, 0x41c00000    # 24.0f

    const/high16 v32, 0x41c00000    # 24.0f

    const-wide/16 v33, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v27 .. v37}, Lo2/d;-><init>(Ljava/lang/String;FFFFJIZI)V

    move-object/from16 v0, v27

    sget v1, Lo2/f0;->a:I

    new-instance v1, Li2/c1;

    sget-wide v2, Li2/x;->b:J

    invoke-direct {v1, v2, v3}, Li2/c1;-><init>(J)V

    new-instance v2, Laa3/u0;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Laa3/u0;-><init>(I)V

    iget-object v3, v2, Laa3/u0;->a:Ljava/util/ArrayList;

    const v6, 0x418d3333    # 17.65f

    move-object/from16 v34, v4

    const v4, 0x40cb3333    # 6.35f

    invoke-virtual {v2, v6, v4}, Laa3/u0;->t(FF)V

    const/high16 v32, 0x41400000    # 12.0f

    const/high16 v33, 0x40800000    # 4.0f

    const v28, 0x4181999a    # 16.2f

    const v29, 0x409ccccd    # 4.9f

    const v30, 0x41635c29    # 14.21f

    const/high16 v31, 0x40800000    # 4.0f

    move-object/from16 v27, v2

    invoke-virtual/range {v27 .. v33}, Laa3/u0;->j(FFFFFF)V

    const v32, -0x3f0051ec    # -7.99f

    const/high16 v33, 0x41000000    # 8.0f

    const v28, -0x3f728f5c    # -4.42f

    const/16 v29, 0x0

    const v30, -0x3f0051ec    # -7.99f

    const v31, 0x40651eb8    # 3.58f

    invoke-virtual/range {v27 .. v33}, Laa3/u0;->k(FFFFFF)V

    const v4, 0x40647ae1    # 3.57f

    const v6, 0x40ffae14    # 7.99f

    move-object/from16 v35, v5

    const/high16 v5, 0x41000000    # 8.0f

    invoke-virtual {v2, v4, v5, v6, v5}, Laa3/u0;->u(FFFF)V

    const v32, 0x40f75c29    # 7.73f

    const/high16 v33, -0x3f400000    # -6.0f

    const v28, 0x406eb852    # 3.73f

    const v30, 0x40dae148    # 6.84f

    const v31, -0x3fdccccd    # -2.55f

    invoke-virtual/range {v27 .. v33}, Laa3/u0;->k(FFFFFF)V

    const v4, -0x3ffae148    # -2.08f

    invoke-virtual {v2, v4}, Laa3/u0;->q(F)V

    const v32, -0x3f4b3333    # -5.65f

    const/high16 v33, 0x40800000    # 4.0f

    const v28, -0x40ae147b    # -0.82f

    const v29, 0x40151eb8    # 2.33f

    const v30, -0x3fbd70a4    # -3.04f

    const/high16 v31, 0x40800000    # 4.0f

    invoke-virtual/range {v27 .. v33}, Laa3/u0;->k(FFFFFF)V

    const/high16 v32, -0x3f400000    # -6.0f

    const/high16 v33, -0x3f400000    # -6.0f

    const v28, -0x3fac28f6    # -3.31f

    const/16 v29, 0x0

    const/high16 v30, -0x3f400000    # -6.0f

    const v31, -0x3fd3d70a    # -2.69f

    invoke-virtual/range {v27 .. v33}, Laa3/u0;->k(FFFFFF)V

    const v4, 0x402c28f6    # 2.69f

    const/high16 v5, 0x40c00000    # 6.0f

    const/high16 v6, -0x3f400000    # -6.0f

    invoke-virtual {v2, v4, v6, v5, v6}, Laa3/u0;->u(FFFF)V

    const v32, 0x40870a3d    # 4.22f

    const v33, 0x3fe3d70a    # 1.78f

    const v28, 0x3fd47ae1    # 1.66f

    const v30, 0x4048f5c3    # 3.14f

    const v31, 0x3f30a3d7    # 0.69f

    invoke-virtual/range {v27 .. v33}, Laa3/u0;->k(FFFFFF)V

    const/high16 v4, 0x41500000    # 13.0f

    const/high16 v5, 0x41300000    # 11.0f

    invoke-virtual {v2, v4, v5}, Laa3/u0;->r(FF)V

    const/high16 v4, 0x40e00000    # 7.0f

    invoke-virtual {v2, v4}, Laa3/u0;->q(F)V

    new-instance v4, Lo2/z;

    const/high16 v5, 0x40800000    # 4.0f

    invoke-direct {v4, v5}, Lo2/z;-><init>(F)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v4, -0x3fe9999a    # -2.35f

    const v5, 0x40166666    # 2.35f

    invoke-virtual {v2, v4, v5}, Laa3/u0;->s(FF)V

    invoke-virtual {v2}, Laa3/u0;->i()V

    invoke-static {v0, v3, v1}, Lo2/d;->a(Lo2/d;Ljava/util/ArrayList;Li2/c1;)V

    invoke-virtual {v0}, Lo2/d;->b()Lo2/e;

    move-result-object v0

    sput-object v0, Ldp/d;->c:Lo2/e;

    :goto_14
    sget-wide v3, Luj/g;->u:J

    const/16 v1, 0x14

    int-to-float v1, v1

    invoke-static {v1, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v6, 0xdb0

    const/4 v7, 0x0

    move v5, v1

    const-string v1, "Restart"

    move/from16 v39, v5

    move/from16 v38, v25

    move-object/from16 v40, v34

    move-object/from16 v5, v35

    const/16 v17, 0x0

    const/16 v18, 0x1

    invoke-static/range {v0 .. v7}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x4

    int-to-float v0, v0

    invoke-static {v0, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-wide v2, Luj/g;->h:J

    const/16 v25, 0xc

    invoke-static/range {v25 .. v25}, Lv63/c;->h(I)J

    move-result-wide v4

    move-object/from16 v31, v9

    new-instance v9, Lw3/k;

    const/4 v1, 0x3

    invoke-direct {v9, v1}, Lw3/k;-><init>(I)V

    const/16 v32, 0x0

    const/16 v19, 0x0

    const v20, 0x1fdf2

    move v6, v0

    const-string v0, "Restart Preview"

    move v7, v1

    const/4 v1, 0x0

    move/from16 v26, v6

    const/4 v6, 0x0

    move/from16 v28, v7

    move-object/from16 v27, v8

    const-wide/16 v7, 0x0

    move-object/from16 v29, v10

    move-object/from16 v30, v11

    const-wide/16 v10, 0x0

    move-object/from16 v33, v12

    const/4 v12, 0x0

    move-object/from16 v34, v13

    const/4 v13, 0x0

    move-object/from16 v36, v14

    const/4 v14, 0x0

    move-object/from16 v37, v15

    const/4 v15, 0x0

    const/high16 v41, 0x3f800000    # 1.0f

    const/16 v16, 0x0

    move/from16 v42, v18

    const/16 v18, 0xd86

    move/from16 v50, v26

    move-object/from16 v43, v27

    move-object/from16 v45, v29

    move-object/from16 v44, v30

    move-object/from16 v47, v31

    move-object/from16 v46, v33

    move-object/from16 v51, v34

    move-object/from16 v17, v35

    move-object/from16 v49, v36

    move-object/from16 v48, v37

    invoke-static/range {v0 .. v20}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-wide v8, v2

    move-object/from16 v5, v17

    const/4 v10, 0x1

    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v0, v2

    cmpl-double v0, v0, v21

    if-lez v0, :cond_1c

    goto :goto_15

    :cond_1c
    invoke-static/range {v23 .. v23}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_15
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v1, v2, v24

    if-lez v1, :cond_1d

    move/from16 v12, v24

    goto :goto_16

    :cond_1d
    move v12, v2

    :goto_16
    invoke-direct {v0, v12, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move-object/from16 v11, p1

    invoke-virtual {v5, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1e

    move-object/from16 v1, v40

    if-ne v2, v1, :cond_1f

    :cond_1e
    new-instance v2, Loj/f;

    const/4 v1, 0x2

    invoke-direct {v2, v11, v1}, Loj/f;-><init>(Lb2/z;I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v2, Lc93/a;

    const/4 v1, 0x7

    const/4 v3, 0x0

    const/4 v14, 0x0

    invoke-static {v0, v3, v14, v2, v1}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v1, v38

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v10}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v1, v48

    move-object/from16 v2, v49

    const/16 v3, 0x30

    invoke-static {v1, v2, v5, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v5, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-eqz v4, :cond_20

    move-object/from16 v7, v43

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_17
    move-object/from16 v4, v44

    goto :goto_18

    :cond_20
    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_17

    :goto_18
    invoke-static {v5, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v45

    invoke-static {v5, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v5, Lp1/q;->S:Z

    if-nez v1, :cond_21

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    :cond_21
    move-object/from16 v12, v46

    goto :goto_1a

    :cond_22
    :goto_19
    move-object/from16 v1, v47

    goto :goto_1b

    :goto_1a
    invoke-static {v2, v5, v2, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_19

    :goto_1b
    invoke-static {v5, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {}, Lo73/a;->C()Lo2/e;

    move-result-object v0

    sget-wide v3, Li2/x;->g:J

    move/from16 v1, v39

    move-object/from16 v12, v51

    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v6, 0xdb0

    const/4 v7, 0x0

    const-string v1, "Close"

    invoke-static/range {v0 .. v7}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move/from16 v6, v50

    invoke-static {v6, v12}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v5, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static/range {v25 .. v25}, Lv63/c;->h(I)J

    move-result-wide v0

    move-wide v2, v8

    new-instance v9, Lw3/k;

    const/4 v7, 0x3

    invoke-direct {v9, v7}, Lw3/k;-><init>(I)V

    const/16 v19, 0x0

    const v20, 0x1fdf2

    move-object/from16 v17, v5

    move-wide v4, v0

    const-string v0, "Close Preview"

    const/4 v1, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    move/from16 v18, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v42, v18

    const/16 v18, 0xd86

    invoke-static/range {v0 .. v20}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v17

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-nez v6, :cond_23

    return-void

    :cond_23
    new-instance v0, Lgb/r;

    const/4 v5, 0x2

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lgb/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final g(Ljava/lang/String;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move-object/from16 v0, p1

    move/from16 v1, p3

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    const v3, 0xb5f200b

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x5b

    const/16 v4, 0x12

    if-ne v3, v4, :cond_1

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x0

    invoke-static {v3, v4, v2, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v2, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v9, v2, Lp1/q;->S:Z

    if-eqz v9, :cond_2

    invoke-virtual {v2, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v2, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v2, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v2, Lp1/q;->S:Z

    if-nez v5, :cond_3

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    :cond_3
    invoke-static {v4, v2, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v2, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-wide v3, Luj/g;->c:J

    move-wide v12, v3

    sget-wide v4, Luj/g;->h:J

    sget-object v3, Lp3/r;->G:Lp3/r;

    sget v10, Luj/g;->b:F

    const/4 v11, 0x7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v21, 0x0

    const v22, 0x1ffd0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object v8, v3

    move-object v3, v6

    move-wide v6, v12

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v20, 0x30db6

    move-object/from16 v19, v2

    move-object/from16 v2, p0

    invoke-static/range {v2 .. v22}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v19

    const/4 v3, 0x6

    const/4 v4, 0x1

    invoke-static {v3, v0, v2, v4}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    :goto_2
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-nez v2, :cond_5

    return-void

    :cond_5
    new-instance v3, Lc4/q;

    const/4 v4, 0x5

    move-object/from16 v5, p0

    invoke-direct {v3, v5, v0, v1, v4}, Lc4/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final h(JLjava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v5, p3

    check-cast v5, Lp1/q;

    const v0, 0x173a01a6

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    move-object/from16 v8, p2

    invoke-virtual {v5, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p4, v0

    move-wide/from16 v2, p0

    invoke-virtual {v5, v2, v3}, Lp1/q;->f(J)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int v9, v0, v1

    and-int/lit8 v0, v9, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v5}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_3
    :goto_2
    const/16 v0, 0x8

    int-to-float v12, v0

    const/4 v14, 0x0

    const/16 v15, 0xd

    sget-object v10, Lb2/t;->w:Lb2/t;

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->K:Lb2/l;

    sget-object v4, Ll0/m;->a:Ll0/e;

    const/16 v6, 0x30

    invoke-static {v4, v1, v5, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_4

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_3
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v5, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v5, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-nez v6, :cond_5

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    invoke-static {v4, v5, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v5, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x7f0807e2

    const/4 v1, 0x0

    invoke-static {v0, v5, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    const/4 v14, 0x0

    const/16 v15, 0xb

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    shl-int/lit8 v4, v9, 0x6

    and-int/lit16 v4, v4, 0x1c00

    or-int/lit16 v6, v4, 0x1b0

    const/4 v7, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    move-wide/from16 v3, p0

    invoke-static/range {v0 .. v7}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    and-int/lit8 v0, v9, 0xe

    shl-int/lit8 v1, v9, 0x3

    and-int/lit16 v1, v1, 0x380

    or-int v22, v0, v1

    const/16 v23, 0x0

    const v24, 0x1fffa

    const/4 v1, 0x0

    move-object/from16 v21, v5

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-wide/from16 v2, p0

    move-object/from16 v0, p2

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v21

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v6, Lg40/f0;

    const/4 v11, 0x0

    move-wide/from16 v8, p0

    move-object/from16 v7, p2

    move/from16 v10, p4

    invoke-direct/range {v6 .. v11}, Lg40/f0;-><init>(Ljava/lang/Object;JII)V

    iput-object v6, v0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final i(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v9, p3

    const-string v2, "step"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    const v2, -0x2c4f517c

    invoke-virtual {v6, v2}, Lp1/q;->g0(I)Lp1/q;

    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v6, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    sget-object v3, Lmj/r;->b:Lp1/u2;

    invoke-virtual {v6, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v18, v3

    check-cast v18, Lmj/p;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v3

    instance-of v4, v3, Lcom/amplitude/android/engagement/types/TooltipFormFactor;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    check-cast v3, Lcom/amplitude/android/engagement/types/TooltipFormFactor;

    move-object v13, v3

    goto :goto_0

    :cond_0
    move-object v13, v5

    :goto_0
    if-nez v13, :cond_2

    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-nez v2, :cond_1

    goto/16 :goto_e

    :cond_1
    new-instance v3, Lpj/f0;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v1, v9, v4}, Lpj/f0;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_2
    invoke-virtual {v13}, Lcom/amplitude/android/engagement/types/TooltipFormFactor;->getAnchorSelector()Lcom/amplitude/android/engagement/types/ElementSelector;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/ElementSelector;->getSelector()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move-object v12, v3

    goto :goto_3

    :cond_4
    :goto_2
    invoke-virtual {v13}, Lcom/amplitude/android/engagement/types/TooltipFormFactor;->getAnchor()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :goto_3
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v11, v2, Landroid/content/res/Configuration;->screenWidthDp:I

    iget v2, v2, Landroid/content/res/Configuration;->screenHeightDp:I

    invoke-virtual {v13}, Lcom/amplitude/android/engagement/types/TooltipFormFactor;->getMarker()Lcom/amplitude/android/engagement/types/Marker;

    move-result-object v3

    instance-of v4, v3, Lcom/amplitude/android/engagement/types/IconMarker;

    const/16 v7, 0x18

    if-eqz v4, :cond_5

    check-cast v3, Lcom/amplitude/android/engagement/types/IconMarker;

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/IconMarker;->getWidth()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_4

    :cond_5
    instance-of v4, v3, Lcom/amplitude/android/engagement/types/ImageMarker;

    if-eqz v4, :cond_6

    check-cast v3, Lcom/amplitude/android/engagement/types/ImageMarker;

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/ImageMarker;->getWidth()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :cond_6
    :goto_4
    invoke-static {v7, v7}, Lv63/b;->a(II)J

    move-result-wide v14

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_7

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v19, v3

    check-cast v19, Lp1/c1;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_8

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lp1/c1;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_9

    invoke-static {v6}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v7

    new-instance v8, Lp1/a0;

    invoke-direct {v8, v7}, Lp1/a0;-><init>(Lbc3/c0;)V

    invoke-virtual {v6, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v7, v8

    :cond_9
    check-cast v7, Lp1/a0;

    iget-object v7, v7, Lp1/a0;->w:Lbc3/c0;

    new-instance v10, Lpj/c0;

    move/from16 v16, v11

    move-object/from16 v11, v18

    move-object/from16 v18, v19

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v17, v2

    invoke-direct/range {v10 .. v20}, Lpj/c0;-><init>(Lmj/p;Ljava/lang/String;Lcom/amplitude/android/engagement/types/TooltipFormFactor;JIILp1/c1;Lq83/d;I)V

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-static {v6, v10, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v10, Lpj/e0;

    move/from16 v19, v17

    move-object/from16 v17, v12

    move/from16 v12, v19

    move-object/from16 v19, v18

    move-object/from16 v18, v11

    move/from16 v11, v16

    move-object/from16 v16, v13

    move-wide v13, v14

    move-object v15, v7

    invoke-direct/range {v10 .. v19}, Lpj/e0;-><init>(IIJLbc3/c0;Lcom/amplitude/android/engagement/types/TooltipFormFactor;Ljava/lang/String;Lmj/p;Lp1/c1;)V

    move-wide v14, v13

    move-object/from16 v13, v16

    move-object/from16 v18, v19

    invoke-static {v2, v10, v6}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-interface/range {v18 .. v18}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/j;

    if-eqz v2, :cond_19

    iget-wide v7, v2, Ly3/j;->a:J

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v11, 0x0

    int-to-float v12, v11

    const/4 v5, 0x0

    move-wide/from16 v16, v7

    const/4 v7, 0x1

    invoke-static {v2, v5, v12, v7}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v11, v6, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v0, v6, Lp1/q;->S:Z

    if-eqz v0, :cond_a

    invoke-virtual {v6, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_a
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_5
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v6, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v6, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v1, v6, Lp1/q;->S:Z

    if-nez v1, :cond_b

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v20, v13

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_6

    :cond_b
    move-object/from16 v20, v13

    :goto_6
    invoke-static {v11, v6, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v6, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v11, v3

    const/16 v13, 0x20

    shr-long v2, v16, v13

    long-to-int v2, v2

    int-to-float v3, v2

    const-wide v21, 0xffffffffL

    move-wide/from16 v23, v14

    move v15, v13

    and-long v13, v16, v21

    long-to-int v13, v13

    int-to-float v14, v13

    invoke-static {v10, v3, v14}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v10, 0x0

    invoke-static {v5, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    move-object v14, v11

    iget-wide v10, v6, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6}, Lp1/q;->i0()V

    move/from16 v16, v15

    iget-boolean v15, v6, Lp1/q;->S:Z

    if-eqz v15, :cond_d

    invoke-virtual {v6, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v6, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v6, Lp1/q;->S:Z

    if-nez v0, :cond_e

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    :cond_e
    invoke-static {v10, v6, v10, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v6, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v20 .. v20}, Lcom/amplitude/android/engagement/types/TooltipFormFactor;->getMarker()Lcom/amplitude/android/engagement/types/Marker;

    move-result-object v0

    invoke-virtual {v6, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_10

    if-ne v3, v4, :cond_11

    :cond_10
    new-instance v3, Lmj/e;

    const/4 v1, 0x7

    invoke-direct {v3, v1, v14}, Lmj/e;-><init>(ILp1/c1;)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v3, Lc93/a;

    const/4 v10, 0x0

    invoke-static {v0, v3, v6, v10}, Lse/g;->k(Lcom/amplitude/android/engagement/types/Marker;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    const v0, -0x221a0c8c

    invoke-virtual {v6, v0}, Lp1/q;->f0(I)V

    invoke-interface {v14}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-virtual/range {v20 .. v20}, Lcom/amplitude/android/engagement/types/TooltipFormFactor;->getPointer()Lcom/amplitude/android/engagement/types/TooltipPointer;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/TooltipPointer;->getType()Lcom/amplitude/android/engagement/types/TooltipPointerType;

    move-result-object v0

    goto :goto_8

    :cond_12
    const/4 v0, 0x0

    :goto_8
    if-nez v0, :cond_13

    const/4 v0, -0x1

    :goto_9
    const/4 v1, 0x1

    goto :goto_a

    :cond_13
    sget-object v1, Lpj/h0;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    goto :goto_9

    :goto_a
    if-ne v0, v1, :cond_14

    sget-object v5, Lcom/amplitude/android/engagement/types/PinPointerType;->ARROW:Lcom/amplitude/android/engagement/types/PinPointerType;

    goto :goto_b

    :cond_14
    const/4 v5, 0x0

    :goto_b
    new-instance v0, Landroid/graphics/Rect;

    shr-long v7, v23, v16

    long-to-int v3, v7

    add-int/2addr v3, v2

    and-long v7, v23, v21

    long-to-int v7, v7

    add-int/2addr v7, v13

    invoke-direct {v0, v2, v13, v3, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v6, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_15

    if-ne v3, v4, :cond_16

    :cond_15
    new-instance v3, Lmj/e;

    const/16 v2, 0x8

    invoke-direct {v3, v2, v14}, Lmj/e;-><init>(ILp1/c1;)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v3, Lc93/a;

    const v7, 0x8048

    const/16 v8, 0x8

    move-object v2, v5

    move-object v5, v3

    const/4 v3, 0x0

    move-object v4, v0

    move v10, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static/range {v0 .. v8}, Lvp/c;->c(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lcom/amplitude/android/engagement/types/PinPointerType;Landroidx/compose/ui/Modifier;Landroid/graphics/Rect;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    :goto_c
    const/4 v2, 0x0

    goto :goto_d

    :cond_17
    const/4 v10, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto :goto_c

    :goto_d
    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-nez v2, :cond_18

    goto :goto_e

    :cond_18
    new-instance v3, Lpj/f0;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v9, v4}, Lpj/f0;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_19
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-nez v2, :cond_1a

    :goto_e
    return-void

    :cond_1a
    new-instance v3, Lpj/f0;

    const/4 v4, 0x2

    invoke-direct {v3, v0, v1, v9, v4}, Lpj/f0;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final j(Landroidx/compose/runtime/Composer;I)V
    .locals 7

    move-object v5, p0

    check-cast v5, Lp1/q;

    const p0, -0x5fbbdb68

    invoke-virtual {v5, p0}, Lp1/q;->g0(I)Lp1/q;

    if-nez p1, :cond_1

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v5}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p0, Lb2/t;->w:Lb2/t;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 p0, 0x1

    int-to-float v3, p0

    sget-wide v1, Luj/g;->g:J

    const/16 v4, 0x1b6

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Ll1/k3;->d(Landroidx/compose/ui/Modifier;JFILandroidx/compose/runtime/Composer;I)V

    :goto_1
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-nez p0, :cond_2

    return-void

    :cond_2
    new-instance v0, Loj/d;

    invoke-direct {v0, p1}, Loj/d;-><init>(I)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final k(Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    const v2, -0x13131fcc

    invoke-virtual {v8, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0xe

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v4, v2, 0xb

    if-ne v4, v3, :cond_3

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v8}, Lp1/q;->X()V

    goto/16 :goto_b

    :cond_3
    :goto_2
    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0x8

    int-to-float v4, v4

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    sget-wide v5, Luj/g;->f:J

    invoke-static {v5, v6, v8}, Ll1/n;->b(JLandroidx/compose/runtime/Composer;)J

    move-result-wide v9

    sget-wide v11, Li2/x;->n:J

    const v7, 0x3ec28f5c    # 0.38f

    invoke-static {v7, v9, v10}, Li2/x;->c(FJ)J

    move-result-wide v13

    sget-object v7, Ll1/n;->a:Lp1/u2;

    invoke-virtual {v8, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll1/m;

    iget-object v15, v7, Ll1/m;->Y:Ll1/k;

    if-nez v15, :cond_4

    new-instance v16, Ll1/k;

    sget-object v15, Lo1/l;->a:Lo1/f;

    invoke-static {v7, v15}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v17

    move-object/from16 p1, v3

    move-object/from16 v25, v4

    invoke-static {v7, v15}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v3

    invoke-static {v7, v3, v4}, Ll1/n;->a(Ll1/m;J)J

    move-result-wide v19

    sget-object v3, Lo1/l;->c:Lo1/f;

    invoke-static {v7, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v3

    move-wide/from16 v26, v5

    sget v5, Lo1/l;->e:F

    invoke-static {v5, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    invoke-static {v7, v15}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Li2/w0;->p(JJ)J

    move-result-wide v21

    invoke-static {v7, v15}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v3

    invoke-static {v7, v3, v4}, Ll1/n;->a(Ll1/m;J)J

    move-result-wide v3

    const v5, 0x3ec28f5c    # 0.38f

    invoke-static {v5, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v23

    invoke-direct/range {v16 .. v24}, Ll1/k;-><init>(JJJJ)V

    move-object/from16 v15, v16

    iput-object v15, v7, Ll1/m;->Y:Ll1/k;

    goto :goto_3

    :cond_4
    move-object/from16 p1, v3

    move-object/from16 v25, v4

    move-wide/from16 v26, v5

    :goto_3
    const-wide/16 v3, 0x10

    cmp-long v5, v26, v3

    if-eqz v5, :cond_5

    move-wide/from16 v17, v26

    goto :goto_4

    :cond_5
    iget-wide v5, v15, Ll1/k;->a:J

    move-wide/from16 v17, v5

    :goto_4
    cmp-long v5, v9, v3

    if-eqz v5, :cond_6

    :goto_5
    move-wide/from16 v19, v9

    goto :goto_6

    :cond_6
    iget-wide v9, v15, Ll1/k;->b:J

    goto :goto_5

    :goto_6
    cmp-long v5, v11, v3

    if-eqz v5, :cond_7

    :goto_7
    move-wide/from16 v21, v11

    goto :goto_8

    :cond_7
    iget-wide v11, v15, Ll1/k;->c:J

    goto :goto_7

    :goto_8
    cmp-long v3, v13, v3

    if-eqz v3, :cond_8

    :goto_9
    move-wide/from16 v23, v13

    goto :goto_a

    :cond_8
    iget-wide v13, v15, Ll1/k;->d:J

    goto :goto_9

    :goto_a
    new-instance v16, Ll1/k;

    invoke-direct/range {v16 .. v24}, Ll1/k;-><init>(JJJJ)V

    const/4 v3, 0x1

    int-to-float v3, v3

    sget-wide v4, Luj/g;->g:J

    invoke-static {v3, v4, v5}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v6

    new-instance v3, Loj/j;

    invoke-direct {v3, v0, v2}, Loj/j;-><init>(Lx1/b;I)V

    const v2, 0x69d5626

    invoke-static {v2, v8, v3}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const v9, 0x36006

    const/4 v5, 0x0

    move-object/from16 v2, p1

    move-object/from16 v4, v16

    move-object/from16 v3, v25

    invoke-static/range {v2 .. v9}, Ll1/k3;->b(Landroidx/compose/ui/Modifier;Li2/a1;Ll1/k;Ll1/l;Lf0/t;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_b
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-nez v2, :cond_9

    return-void

    :cond_9
    new-instance v3, Loj/k;

    invoke-direct {v3, v0, v1}, Loj/k;-><init>(Lx1/b;I)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final l(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 46

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v2, 0x3539cb4e

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0xe

    if-nez v2, :cond_1

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, p3, 0x70

    if-nez v3, :cond_3

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    move/from16 v21, v2

    and-int/lit8 v2, v21, 0x5b

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v7, v1

    goto/16 :goto_a

    :cond_5
    :goto_3
    sget-object v2, Lb3/v1;->e:Lp1/u2;

    invoke-virtual {v5, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb3/s1;

    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v5, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v8, Luj/g;->b:F

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->g:Ll0/h;

    sget-object v9, Lb2/e;->K:Lb2/l;

    const/16 v10, 0x36

    invoke-static {v8, v9, v5, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v11, v5, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v5, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-eqz v14, :cond_6

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_4
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v5, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v5, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v15, v5, Lp1/q;->S:Z

    if-nez v15, :cond_7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    invoke-static {v11, v5, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v5, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v7, v4

    move-object/from16 v17, v5

    sget-wide v4, Luj/g;->d:J

    move-object v11, v2

    move-object v15, v3

    sget-wide v2, Luj/g;->h:J

    const/high16 v10, 0x3e800000    # 0.25f

    move-object/from16 v18, v7

    sget-object v7, Ll0/t1;->a:Ll0/t1;

    move-object/from16 v19, v8

    const/4 v8, 0x1

    invoke-virtual {v7, v6, v8, v10}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v10

    and-int/lit8 v8, v21, 0xe

    or-int/lit16 v8, v8, 0xd80

    move-object/from16 v22, v19

    const/16 v19, 0x0

    const/16 v23, 0x1

    const v20, 0x1fff0

    move-object/from16 v24, v6

    const/4 v6, 0x0

    move-object/from16 v26, v7

    move-object/from16 v25, v18

    move/from16 v18, v8

    const-wide/16 v7, 0x0

    move-object/from16 v27, v9

    const/4 v9, 0x0

    move-object v1, v10

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    move-object/from16 v29, v12

    const/4 v12, 0x0

    move-object/from16 v30, v13

    const/4 v13, 0x0

    move-object/from16 v31, v14

    const/4 v14, 0x0

    move-object/from16 v32, v15

    const/4 v15, 0x0

    const/16 v33, 0x36

    const/16 v16, 0x0

    move-object/from16 v39, v22

    move-object/from16 v43, v24

    move-object/from16 v41, v25

    move-object/from16 v44, v26

    move-object/from16 v36, v27

    move-object/from16 v34, v28

    move-object/from16 v40, v29

    move-object/from16 v37, v30

    move-object/from16 v38, v31

    move-object/from16 v35, v32

    invoke-static/range {v0 .. v20}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-wide v0, v4

    move-object/from16 v5, v17

    const/high16 v2, 0x3f400000    # 0.75f

    move-object/from16 v4, v43

    move-object/from16 v6, v44

    const/4 v3, 0x1

    invoke-virtual {v6, v4, v3, v2}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, Ll0/m;->b:Ll0/e;

    move-object/from16 v8, v36

    const/16 v9, 0x36

    invoke-static {v7, v8, v5, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v8, v5, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_9

    move-object/from16 v10, v37

    invoke-virtual {v5, v10}, Lp1/q;->l(Lc93/a;)V

    :goto_5
    move-object/from16 v10, v38

    goto :goto_6

    :cond_9
    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_5

    :goto_6
    invoke-static {v5, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v7, v39

    invoke-static {v5, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-nez v7, :cond_a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    :cond_a
    move-object/from16 v7, v40

    goto :goto_8

    :cond_b
    :goto_7
    move-object/from16 v7, v41

    goto :goto_9

    :goto_8
    invoke-static {v8, v5, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_7

    :goto_9
    invoke-static {v5, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-wide v7, Luj/g;->i:J

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v6, v4, v3, v2}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v9, Lw3/k;

    const/4 v6, 0x6

    invoke-direct {v9, v6}, Lw3/k;-><init>(I)V

    shr-int/lit8 v6, v21, 0x3

    and-int/lit8 v6, v6, 0xe

    or-int/lit16 v6, v6, 0xd80

    const/16 v19, 0x0

    const v20, 0x1fdf0

    move/from16 v18, v6

    const/4 v6, 0x0

    move/from16 v42, v3

    move-object/from16 v43, v4

    move-object/from16 v17, v5

    move-wide v4, v0

    move-object v1, v2

    move-wide v2, v7

    const-wide/16 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v0, p1

    move-object/from16 v45, v43

    invoke-static/range {v0 .. v20}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object v7, v0

    move-object/from16 v5, v17

    const/16 v0, 0x8

    int-to-float v0, v0

    move-object/from16 v4, v45

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v5, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v0, Lev/h;

    const/4 v1, 0x4

    move-object/from16 v11, v34

    move-object/from16 v15, v35

    invoke-direct {v0, v11, v7, v15, v1}, Lev/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/16 v1, 0x18

    int-to-float v1, v1

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v4, Loj/b;->a:Lx1/b;

    const v6, 0x30030

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Ll1/k3;->f(Lc93/a;Landroidx/compose/ui/Modifier;ZLl1/p1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    const/4 v3, 0x1

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_c

    return-void

    :cond_c
    new-instance v1, Lc4/i;

    const/4 v2, 0x2

    move-object/from16 v3, p0

    move/from16 v4, p3

    invoke-direct {v1, v3, v7, v4, v2}, Lc4/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final m(Lmj/p;Ljava/lang/String;Lcom/amplitude/android/engagement/types/TooltipFormFactor;JIILp1/c1;Ls83/c;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p8

    instance-of v1, v0, Lpj/g0;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lpj/g0;

    iget v2, v1, Lpj/g0;->G:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lpj/g0;->G:I

    goto :goto_0

    :cond_0
    new-instance v1, Lpj/g0;

    invoke-direct {v1, v0}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lpj/g0;->F:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lpj/g0;->G:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget v2, v1, Lpj/g0;->E:I

    iget v3, v1, Lpj/g0;->z:I

    iget-wide v5, v1, Lpj/g0;->y:J

    iget-object v7, v1, Lpj/g0;->x:Lp1/c1;

    iget-object v1, v1, Lpj/g0;->w:Lcom/amplitude/android/engagement/types/TooltipFormFactor;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    move-object v8, v7

    move v7, v3

    move-object v3, v8

    move v8, v2

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p2

    iput-object v0, v1, Lpj/g0;->w:Lcom/amplitude/android/engagement/types/TooltipFormFactor;

    move-object/from16 v3, p7

    iput-object v3, v1, Lpj/g0;->x:Lp1/c1;

    move-wide/from16 v5, p3

    iput-wide v5, v1, Lpj/g0;->y:J

    move/from16 v7, p5

    iput v7, v1, Lpj/g0;->z:I

    move/from16 v8, p6

    iput v8, v1, Lpj/g0;->E:I

    iput v4, v1, Lpj/g0;->G:I

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    invoke-virtual {v9, v10, v1}, Lmj/p;->b(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_1
    check-cast v1, Ljava/util/List;

    const/4 v2, 0x0

    invoke-static {v2, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    const/4 v10, 0x0

    if-nez v1, :cond_4

    invoke-interface {v3, v10}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v9

    :cond_4
    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/TooltipFormFactor;->getMarker()Lcom/amplitude/android/engagement/types/Marker;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/Marker;->getPositioning()Lcom/amplitude/android/engagement/types/MarkerPositioning;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/MarkerPositioning;->getOffset()Lcom/amplitude/android/engagement/types/OffsetValue;

    move-result-object v11

    const-string v12, "offset"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v11}, Lcom/amplitude/android/engagement/types/OffsetValue;->getX()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v12
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_2

    :catch_0
    move v12, v2

    :goto_2
    :try_start_1
    invoke-virtual {v11}, Lcom/amplitude/android/engagement/types/OffsetValue;->getY()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_3

    :catch_1
    move v11, v2

    :goto_3
    :try_start_2
    invoke-static {v12, v11}, Lvo/b;->a(II)J

    move-result-wide v11
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_4

    :catch_2
    sget-object v11, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v12, "TooltipView: Error parsing offset"

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v11, v12}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    invoke-static {v2, v2}, Lvo/b;->a(II)J

    move-result-wide v11

    :goto_4
    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/MarkerPositioning;->getPosition()Lcom/amplitude/android/engagement/types/TooltipPosition;

    move-result-object v0

    sget-object v13, Lpj/h0;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v13, v0

    const/16 v13, 0x20

    const-wide v14, 0xffffffffL

    const/4 v10, 0x2

    if-eq v0, v4, :cond_6

    if-eq v0, v10, :cond_5

    const/4 v10, 0x0

    goto :goto_5

    :cond_5
    iget v0, v1, Landroid/graphics/Rect;->right:I

    move/from16 p2, v10

    move-wide/from16 p0, v11

    shr-long v10, p0, v13

    long-to-int v4, v10

    add-int/2addr v0, v4

    iget v4, v1, Landroid/graphics/Rect;->top:I

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v1, v4

    and-long v10, p0, v14

    long-to-int v4, v10

    add-int/2addr v1, v4

    and-long v4, v5, v14

    long-to-int v4, v4

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v1, v4

    invoke-static {v0, v1}, Lvo/b;->a(II)J

    move-result-wide v0

    new-instance v10, Ly3/j;

    invoke-direct {v10, v0, v1}, Ly3/j;-><init>(J)V

    goto :goto_5

    :cond_6
    move/from16 p2, v10

    move-wide/from16 p0, v11

    iget v0, v1, Landroid/graphics/Rect;->left:I

    shr-long v10, v5, v13

    long-to-int v4, v10

    sub-int/2addr v0, v4

    shr-long v10, p0, v13

    long-to-int v4, v10

    sub-int/2addr v0, v4

    iget v4, v1, Landroid/graphics/Rect;->top:I

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v1, v4

    and-long v10, p0, v14

    long-to-int v4, v10

    add-int/2addr v1, v4

    and-long v4, v5, v14

    long-to-int v4, v4

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v1, v4

    invoke-static {v0, v1}, Lvo/b;->a(II)J

    move-result-wide v0

    new-instance v10, Ly3/j;

    invoke-direct {v10, v0, v1}, Ly3/j;-><init>(J)V

    :goto_5
    if-eqz v10, :cond_7

    iget-wide v0, v10, Ly3/j;->a:J

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4, v2, v2, v7, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    shr-long v5, v0, v13

    long-to-int v2, v5

    iget v5, v4, Landroid/graphics/Rect;->left:I

    iget v6, v4, Landroid/graphics/Rect;->right:I

    invoke-static {v2, v5, v6}, Le93/b;->n(III)I

    move-result v2

    and-long/2addr v0, v14

    long-to-int v0, v0

    iget v1, v4, Landroid/graphics/Rect;->top:I

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    invoke-static {v0, v1, v4}, Le93/b;->n(III)I

    move-result v0

    invoke-static {v2, v0}, Lvo/b;->a(II)J

    move-result-wide v0

    new-instance v2, Ly3/j;

    invoke-direct {v2, v0, v1}, Ly3/j;-><init>(J)V

    invoke-interface {v3, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_7
    return-object v9
.end method

.method public static final n(Lce/z;)Ljava/lang/String;
    .locals 1

    iget-object p0, p0, Lce/z;->b:Lce/l;

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    const-string p0, "unknown section"

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const-string p0, "services"

    return-object p0

    :cond_2
    const-string p0, "sso-session"

    return-object p0

    :cond_3
    const-string p0, "profile"

    return-object p0
.end method

.method public static final o(Ljava/util/List;Lwp/h;)Leu/i0;
    .locals 4

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Leu/x;

    instance-of v3, v2, Leu/i0;

    if-eqz v3, :cond_0

    check-cast v2, Leu/i0;

    iget-object v2, v2, Leu/i0;->b:Lwp/h;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    instance-of p0, v0, Leu/i0;

    if-eqz p0, :cond_2

    check-cast v0, Leu/i0;

    return-object v0

    :cond_2
    return-object v1
.end method

.method public static final p(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    const-string v0, "toCharArray(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    array-length v2, p0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_1

    aget-char v5, p0, v3

    const/4 v6, 0x1

    add-int/2addr v4, v6

    if-le v4, v6, :cond_0

    const-string v6, " "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_0
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final q(Lrf/l;Ls83/c;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lrf/l;->E:Lq83/j;

    sget-object v1, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    instance-of v1, v0, Lbc3/u;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lbc3/u;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v0}, Lbc3/u;->complete()Z

    invoke-interface {v0}, Lbc3/k1;->isCompleted()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lrf/l;->E:Lq83/j;

    const-class v3, Lrf/l;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-interface {v3}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v1, v3}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object v1

    new-instance v3, Lm22/m;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Lm22/m;-><init>(I)V

    invoke-virtual {v1, v2, v3}, Lgm/r;->s(Ljava/lang/Throwable;Lc93/a;)V

    invoke-virtual {p0}, Lrf/l;->a()V

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "logger<T> cannot be used on an anonymous object"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    invoke-interface {v0, p1}, Lbc3/k1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_4

    return-object p0

    :cond_4
    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final r(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    invoke-static {p0, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static s(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    sget-object v1, Lr30/e;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v1, 0x8

    :try_start_0
    invoke-static {p0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    const-string v1, "decode(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v2

    :goto_0
    instance-of p0, v2, Ll83/m;

    if-eqz p0, :cond_0

    goto :goto_1

    :cond_0
    move-object v0, v2

    :goto_1
    check-cast v0, Ljava/lang/String;

    :cond_1
    return-object v0
.end method

.method public static final t(II)D
    .locals 2

    int-to-long v0, p0

    const/16 p0, 0x1b

    shl-long/2addr v0, p0

    int-to-long p0, p1

    add-long/2addr v0, p0

    long-to-double p0, v0

    const-wide/high16 v0, 0x4340000000000000L    # 9.007199254740992E15

    div-double/2addr p0, v0

    return-wide p0
.end method

.method public static final u(Ljava/io/IOException;)Lmf/p;
    .locals 8

    instance-of v0, p0, Ljava/net/SocketTimeoutException;

    const-string v1, "null cannot be cast to non-null type java.net.SocketTimeoutException"

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move-object v3, p0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    instance-of v3, v3, Ljava/net/SocketTimeoutException;

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_1

    check-cast v3, Ljava/net/SocketTimeoutException;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p0}, Lpf/c;->B(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/Throwable;

    instance-of v5, v5, Ljava/net/SocketTimeoutException;

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_4
    move-object v4, v2

    :goto_0
    instance-of v3, v4, Ljava/net/SocketTimeoutException;

    if-nez v3, :cond_5

    move-object v4, v2

    :cond_5
    move-object v3, v4

    check-cast v3, Ljava/net/SocketTimeoutException;

    :goto_1
    check-cast v3, Ljava/net/SocketTimeoutException;

    const/4 v4, 0x1

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_6

    const-string v5, "connect"

    invoke-static {v3, v5, v4}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-ne v3, v4, :cond_6

    sget-object p0, Lmf/p;->w:Lmf/p;

    return-object p0

    :cond_6
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_e

    const-string v5, "unexpected end of stream"

    const/4 v6, 0x0

    invoke-static {v3, v5, v6}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-ne v3, v4, :cond_e

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    instance-of v5, v3, Ljava/lang/Exception;

    if-eqz v5, :cond_7

    check-cast v3, Ljava/lang/Exception;

    goto :goto_2

    :cond_7
    move-object v3, v2

    :goto_2
    if-eqz v3, :cond_e

    instance-of v5, v3, Ljava/io/EOFException;

    if-eqz v5, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    instance-of v5, v5, Ljava/io/EOFException;

    if-eqz v5, :cond_a

    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_9

    check-cast v3, Ljava/io/EOFException;

    goto :goto_4

    :cond_9
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type java.io.EOFException"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    invoke-static {v3}, Lpf/c;->B(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ljava/lang/Throwable;

    instance-of v7, v7, Ljava/io/EOFException;

    if-eqz v7, :cond_b

    goto :goto_3

    :cond_c
    move-object v5, v2

    :goto_3
    instance-of v3, v5, Ljava/io/EOFException;

    if-nez v3, :cond_d

    move-object v5, v2

    :cond_d
    move-object v3, v5

    check-cast v3, Ljava/io/EOFException;

    :goto_4
    check-cast v3, Ljava/io/EOFException;

    if-eqz v3, :cond_e

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_e

    const-string v5, "\\n not found: limit=0"

    invoke-static {v3, v5, v6}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-ne v3, v4, :cond_e

    sget-object p0, Lmf/p;->y:Lmf/p;

    return-object p0

    :cond_e
    if-eqz v0, :cond_f

    move-object v0, p0

    goto :goto_6

    :cond_f
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/net/SocketTimeoutException;

    if-eqz v0, :cond_11

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_10

    check-cast v0, Ljava/net/SocketTimeoutException;

    goto :goto_6

    :cond_10
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_11
    invoke-static {p0}, Lpf/c;->B(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/Throwable;

    instance-of v3, v3, Ljava/net/SocketTimeoutException;

    if-eqz v3, :cond_12

    goto :goto_5

    :cond_13
    move-object v1, v2

    :goto_5
    instance-of v0, v1, Ljava/net/SocketTimeoutException;

    if-nez v0, :cond_14

    move-object v1, v2

    :cond_14
    move-object v0, v1

    check-cast v0, Ljava/net/SocketTimeoutException;

    :goto_6
    if-eqz v0, :cond_15

    sget-object p0, Lmf/p;->z:Lmf/p;

    return-object p0

    :cond_15
    instance-of v0, p0, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v0, :cond_16

    goto :goto_9

    :cond_16
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v0, :cond_18

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_17

    check-cast p0, Ljavax/net/ssl/SSLHandshakeException;

    goto :goto_9

    :cond_17
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type javax.net.ssl.SSLHandshakeException"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_18
    invoke-static {p0}, Lpf/c;->B(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_19
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Throwable;

    instance-of v1, v1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v1, :cond_19

    goto :goto_7

    :cond_1a
    move-object v0, v2

    :goto_7
    instance-of p0, v0, Ljavax/net/ssl/SSLHandshakeException;

    if-nez p0, :cond_1b

    goto :goto_8

    :cond_1b
    move-object v2, v0

    :goto_8
    move-object p0, v2

    check-cast p0, Ljavax/net/ssl/SSLHandshakeException;

    :goto_9
    if-eqz p0, :cond_1c

    sget-object p0, Lmf/p;->x:Lmf/p;

    return-object p0

    :cond_1c
    sget-object p0, Lmf/p;->E:Lmf/p;

    return-object p0
.end method

.method public static final v(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x6

    const-string v1, "ServiceConnection"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v1, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method public static final w(Ljava/lang/String;)V
    .locals 2

    const-string v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x6

    const-string v1, "ServiceConnection"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static x(ILjava/lang/CharSequence;)I
    .locals 7

    const/4 v0, 0x0

    const/4 v1, -0x1

    move v2, v0

    move v3, v2

    move v4, v1

    move v1, v3

    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge p0, v5, :cond_7

    invoke-interface {p1, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x2c

    if-eq v5, v6, :cond_6

    const/16 v6, 0x5b

    if-eq v5, v6, :cond_5

    const/16 v6, 0x5d

    if-eq v5, v6, :cond_4

    const/16 v6, 0x60

    if-eq v5, v6, :cond_7

    const/16 v6, 0x7b

    if-eq v5, v6, :cond_3

    const/16 v6, 0x7d

    if-eq v5, v6, :cond_2

    const/16 v6, 0x202f

    if-eq v5, v6, :cond_7

    const/16 v6, 0x205f

    if-eq v5, v6, :cond_7

    const/16 v6, 0x3000

    if-eq v5, v6, :cond_7

    const/16 v6, 0x2e

    if-eq v5, v6, :cond_6

    const/16 v6, 0x2f

    if-eq v5, v6, :cond_1

    const/16 v6, 0x3e

    if-eq v5, v6, :cond_7

    const/16 v6, 0x3f

    if-eq v5, v6, :cond_6

    const/16 v6, 0x2028

    if-eq v5, v6, :cond_7

    const/16 v6, 0x2029

    if-eq v5, v6, :cond_7

    packed-switch v5, :pswitch_data_0

    packed-switch v5, :pswitch_data_1

    packed-switch v5, :pswitch_data_2

    packed-switch v5, :pswitch_data_3

    packed-switch v5, :pswitch_data_4

    goto :goto_2

    :pswitch_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_7

    :goto_1
    move v4, p0

    goto :goto_3

    :pswitch_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :pswitch_2
    xor-int/lit8 v5, v0, 0x1

    if-eqz v0, :cond_0

    move v4, p0

    :cond_0
    move v0, v5

    goto :goto_3

    :cond_1
    add-int/lit8 v5, p0, -0x1

    if-ne v4, v5, :cond_6

    :goto_2
    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_7

    goto :goto_1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_7

    goto :goto_1

    :cond_5
    add-int/lit8 v2, v2, 0x1

    :cond_6
    :goto_3
    :pswitch_3
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_7
    :pswitch_4
    return v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x27
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x3a
        :pswitch_3
        :pswitch_3
        :pswitch_4
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x7f
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x2000
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public static y(Lorg/json/JSONObject;)Lr30/e;
    .locals 36

    move-object/from16 v1, p0

    const-string v0, "messageType"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "CRes"

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5a

    const-string v0, "challengeCompletionInd"

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Lx43/j;->G(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v9

    new-instance v3, Lq30/q0;

    const-string v0, "sdkTransID"

    invoke-static {v0, v1}, Lx43/j;->F(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/UUID;

    move-result-object v0

    invoke-direct {v3, v0}, Lq30/q0;-><init>(Ljava/util/UUID;)V

    const-string v0, "threeDSServerTransID"

    invoke-static {v0, v1}, Lx43/j;->F(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v0, "toString(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "acsTransID"

    invoke-static {v5, v1}, Lx43/j;->F(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageVersion"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v6}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_0

    move-object/from16 v20, v6

    goto :goto_0

    :cond_0
    const/16 v20, 0x0

    :goto_0
    if-eqz v20, :cond_59

    const-string v0, "messageExtension"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    const/16 v6, 0x40

    const/4 v7, 0x0

    if-nez v0, :cond_1

    move/from16 v32, v2

    const/4 v8, 0x0

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v10

    invoke-static {v7, v10}, Le93/b;->i0(II)Li93/j;

    move-result-object v10

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v10}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_2
    :goto_1
    move-object v12, v10

    check-cast v12, Li93/i;

    iget-boolean v12, v12, Li93/i;->y:Z

    if-eqz v12, :cond_3

    move-object v12, v10

    check-cast v12, Lm83/e0;

    invoke-virtual {v12}, Lm83/e0;->nextInt()I

    move-result v12

    invoke-virtual {v0, v12}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    if-eqz v12, :cond_2

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v11, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v0, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lorg/json/JSONObject;

    const-string v13, "name"

    invoke-virtual {v12, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v14

    if-gt v14, v6, :cond_7

    const-string v14, "id"

    invoke-virtual {v12, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v15

    if-gt v15, v6, :cond_6

    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    move/from16 v32, v2

    const-string v2, "data"

    invoke-virtual {v12, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v16

    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_5

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v6, v17

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v7

    const/16 v10, 0x1f7b

    if-gt v7, v10, :cond_4

    invoke-virtual {v15, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v6, 0x40

    const/4 v7, 0x0

    const/16 v10, 0xa

    goto :goto_3

    :cond_4
    sget v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    const-string v0, "messageExtension.data.value"

    invoke-static {v0}, Lo73/a;->w(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_5
    new-instance v2, Lr30/h;

    const-string v6, "criticalityIndicator"

    invoke-virtual {v12, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v6

    invoke-direct {v2, v6, v13, v14, v15}, Lr30/h;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v2, v32

    const/16 v6, 0x40

    const/4 v7, 0x0

    const/16 v10, 0xa

    goto :goto_2

    :cond_6
    sget v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    const-string v0, "messageExtension.id"

    invoke-static {v0}, Lo73/a;->w(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_7
    sget v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    const-string v0, "messageExtension.name"

    invoke-static {v0}, Lo73/a;->w(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_8
    move/from16 v32, v2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v6, 0xa

    if-gt v2, v6, :cond_58

    move-object v8, v0

    :goto_4
    if-eqz v8, :cond_c

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lr30/h;

    iget-boolean v6, v6, Lr30/h;->y:Z

    if-eqz v6, :cond_9

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_6

    :cond_b
    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    sget-object v1, Lr30/i;->y:Lr30/i;

    const/4 v14, 0x0

    const/16 v15, 0x3e

    const-string v11, ","

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;-><init>(Lr30/i;Ljava/lang/String;)V

    throw v0

    :cond_c
    :goto_6
    const-string v0, "challengeInfoTextIndicator"

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lx43/j;->G(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v14

    const-string v0, "resendInformationLabel"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v25, v2

    goto :goto_7

    :cond_d
    const/16 v25, 0x0

    :goto_7
    if-eqz v25, :cond_f

    invoke-virtual/range {v25 .. v25}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_8

    :cond_e
    sget v1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {v0}, Lo73/a;->w(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_f
    :goto_8
    const-string v2, "challengeSelectInfo"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    move-object v0, v1

    goto :goto_9

    :cond_10
    const/4 v0, 0x0

    :goto_9
    if-eqz v0, :cond_12

    sget-object v6, Lr30/e;->CREATOR:Landroid/os/Parcelable$Creator;

    :try_start_0
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_a

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_a
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-nez v6, :cond_11

    check-cast v0, Lorg/json/JSONArray;

    goto :goto_b

    :cond_11
    sget v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {v2}, Lo73/a;->w(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_12
    const/4 v0, 0x0

    :goto_b
    if-eqz v9, :cond_13

    const/4 v6, 0x0

    goto :goto_c

    :cond_13
    const-string v2, "acsUiType"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_57

    invoke-static {v6}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_57

    sget-object v7, Lr30/j;->y:Lng3/o;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6}, Lng3/o;->o(Ljava/lang/String;)Lr30/j;

    move-result-object v6

    if-eqz v6, :cond_56

    :goto_c
    if-eqz v6, :cond_18

    sget-object v2, Lr30/e;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v2, "submitAuthenticationLabel"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_14

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_d

    :cond_14
    const/4 v7, 0x0

    :goto_d
    if-eqz v7, :cond_15

    invoke-static {v7}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_16

    :cond_15
    iget-boolean v10, v6, Lr30/j;->x:Z

    if-nez v10, :cond_17

    :cond_16
    move-object/from16 v27, v7

    goto :goto_e

    :cond_17
    sget v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {v2}, Lo73/a;->x(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_18
    const/16 v27, 0x0

    :goto_e
    if-eqz v6, :cond_23

    sget-object v2, Lr30/e;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v2, "acsHTML"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_19

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_f

    :cond_19
    const/4 v7, 0x0

    :goto_f
    if-eqz v7, :cond_1a

    invoke-static {v7}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_1b

    :cond_1a
    sget-object v10, Lr30/j;->H:Lr30/j;

    if-eq v6, v10, :cond_22

    :cond_1b
    if-eqz v7, :cond_1d

    const-string v10, "\n"

    const/4 v11, 0x0

    invoke-static {v7, v10, v11}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-nez v10, :cond_1e

    const-string v10, " "

    invoke-static {v7, v10, v11}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-nez v10, :cond_1e

    const-string v10, "+"

    invoke-static {v7, v10, v11}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-nez v10, :cond_1e

    const-string v10, "/"

    invoke-static {v7, v10, v11}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-eqz v10, :cond_1c

    goto :goto_10

    :cond_1c
    move v10, v11

    goto :goto_11

    :cond_1d
    const/4 v11, 0x0

    :cond_1e
    :goto_10
    move/from16 v10, v32

    :goto_11
    if-eqz v7, :cond_1f

    const-string v12, "="

    invoke-static {v7, v12, v11}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v12

    if-eqz v12, :cond_1f

    move/from16 v12, v32

    goto :goto_12

    :cond_1f
    move v12, v11

    :goto_12
    sget-object v13, Lr30/j;->H:Lr30/j;

    if-ne v6, v13, :cond_21

    if-nez v10, :cond_20

    if-nez v12, :cond_20

    goto :goto_13

    :cond_20
    sget v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {v2}, Lo73/a;->w(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_21
    :goto_13
    invoke-static {v7}, Lx43/j;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_14

    :cond_22
    sget v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {v2}, Lo73/a;->x(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_23
    const/4 v11, 0x0

    const/4 v2, 0x0

    :goto_14
    if-eqz v6, :cond_27

    sget-object v7, Lr30/e;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v7, "oobContinueLabel"

    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_24

    invoke-static {v10}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_25

    :cond_24
    sget-object v12, Lr30/j;->G:Lr30/j;

    if-eq v6, v12, :cond_26

    :cond_25
    move-object/from16 v23, v10

    goto :goto_15

    :cond_26
    sget v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {v7}, Lo73/a;->x(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_27
    const/16 v23, 0x0

    :goto_15
    if-nez v0, :cond_28

    const/4 v15, 0x0

    goto :goto_17

    :cond_28
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v10

    move v12, v11

    :goto_16
    if-ge v12, v10, :cond_2a

    invoke-virtual {v0, v12}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v13

    if-eqz v13, :cond_29

    invoke-virtual {v13}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v13, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    new-instance v11, Lr30/c;

    invoke-static {v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v11, v15, v13}, Lr30/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_29
    add-int/lit8 v12, v12, 0x1

    const/4 v11, 0x0

    goto :goto_16

    :cond_2a
    move-object v15, v7

    :goto_17
    if-eqz v9, :cond_2b

    const/4 v7, 0x0

    goto :goto_18

    :cond_2b
    const-string v0, "acsHTMLRefresh"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx43/j;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    :goto_18
    if-eqz v9, :cond_2c

    const/4 v10, 0x0

    goto :goto_19

    :cond_2c
    const-string v0, "challengeInfoHeader"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v10, v0

    :goto_19
    if-eqz v9, :cond_2d

    const/4 v11, 0x0

    goto :goto_1a

    :cond_2d
    const-string v0, "challengeInfoLabel"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v11, v0

    :goto_1a
    if-eqz v9, :cond_2e

    const/4 v12, 0x0

    goto :goto_1b

    :cond_2e
    const-string v0, "challengeInfoText"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v12, v0

    :goto_1b
    if-eqz v9, :cond_2f

    const/4 v13, 0x0

    goto :goto_1c

    :cond_2f
    const-string v0, "challengeAddInfo"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v13, v0

    :goto_1c
    if-eqz v9, :cond_30

    const/16 v28, 0x0

    goto :goto_1d

    :cond_30
    const-string v0, "whitelistingInfoText"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v28, v0

    :goto_1d
    if-eqz v9, :cond_31

    const/16 v29, 0x0

    goto :goto_1e

    :cond_31
    const-string v0, "whyInfoLabel"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v29, v0

    :goto_1e
    if-eqz v9, :cond_32

    const/16 v30, 0x0

    goto :goto_1f

    :cond_32
    const-string v0, "whyInfoText"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v30, v0

    :goto_1f
    if-eqz v9, :cond_33

    const/16 v16, 0x0

    goto :goto_20

    :cond_33
    const-string v0, "expandInfoLabel"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v16, v0

    :goto_20
    if-eqz v9, :cond_34

    const/16 v21, 0x0

    goto :goto_21

    :cond_34
    const-string v0, "expandInfoText"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v21, v0

    :goto_21
    const-string v0, "issuerImage"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    move-object/from16 v22, v2

    const-string v2, "extraHigh"

    move-object/from16 v26, v3

    const-string v3, "high"

    move-object/from16 v24, v4

    const-string v4, "medium"

    move-object/from16 v31, v5

    if-eqz v0, :cond_35

    new-instance v5, Lr30/d;

    move-object/from16 v33, v6

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v34, v7

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v6, v7, v0}, Lr30/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_22

    :cond_35
    move-object/from16 v33, v6

    move-object/from16 v34, v7

    const/4 v5, 0x0

    :goto_22
    if-eqz v9, :cond_36

    const/4 v0, 0x0

    goto :goto_23

    :cond_36
    const-string v0, "oobAppURL"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_23
    if-eqz v9, :cond_37

    const/4 v6, 0x0

    goto :goto_24

    :cond_37
    const-string v6, "oobAppLabel"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :goto_24
    const-string v7, "psImage"

    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    move-object/from16 v35, v0

    if-eqz v7, :cond_38

    new-instance v0, Lr30/d;

    invoke-virtual {v7, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v4, v3, v2}, Lr30/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_25

    :cond_38
    const/4 v0, 0x0

    :goto_25
    if-eqz v9, :cond_3d

    const-string v2, "transStatus"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3c

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3c

    sget-object v3, Lq30/x0;->x:Lng3/n;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lq30/x0;->z:Lt83/b;

    invoke-virtual {v3}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_39
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lq30/x0;

    iget-object v7, v7, Lq30/x0;->w:Ljava/lang/String;

    invoke-virtual {v7, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_39

    move-object/from16 v17, v4

    goto :goto_26

    :cond_3a
    const/16 v17, 0x0

    :goto_26
    move-object/from16 v1, v17

    check-cast v1, Lq30/x0;

    if-eqz v1, :cond_3b

    iget-object v1, v1, Lq30/x0;->w:Ljava/lang/String;

    goto :goto_27

    :cond_3b
    sget v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {v2}, Lo73/a;->w(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_3c
    sget v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {v2}, Lo73/a;->x(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_3d
    const-string v1, ""

    :goto_27
    new-instance v3, Lr30/e;

    move-object/from16 v2, v22

    move-object/from16 v22, v6

    move-object v6, v2

    move-object/from16 v18, v5

    move-object/from16 v19, v8

    move-object/from16 v17, v21

    move-object/from16 v4, v24

    move-object/from16 v5, v31

    move-object/from16 v8, v33

    move-object/from16 v7, v34

    move-object/from16 v21, v35

    const/4 v2, 0x0

    move-object/from16 v24, v0

    move-object/from16 v31, v1

    const/16 v1, 0x40

    invoke-direct/range {v3 .. v31}, Lr30/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr30/j;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Lr30/d;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr30/d;Ljava/lang/String;Lq30/q0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v10

    move-object/from16 v10, v23

    if-nez v8, :cond_3f

    :cond_3e
    move/from16 v2, v32

    goto/16 :goto_2e

    :cond_3f
    sget-object v4, Lr30/j;->H:Lr30/j;

    if-ne v8, v4, :cond_42

    if-eqz v6, :cond_41

    invoke-static {v6}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_40

    goto :goto_28

    :cond_40
    move v7, v2

    goto :goto_29

    :cond_41
    :goto_28
    move/from16 v7, v32

    :goto_29
    xor-int/lit8 v2, v7, 0x1

    goto/16 :goto_2e

    :cond_42
    sget-object v4, Lr30/j;->z:Lr30/j;

    if-eq v8, v4, :cond_43

    sget-object v4, Lr30/j;->E:Lr30/j;

    if-eq v8, v4, :cond_43

    sget-object v4, Lr30/j;->F:Lr30/j;

    if-ne v8, v4, :cond_46

    :cond_43
    filled-new-array {v0, v11, v12}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    instance-of v5, v4, Ljava/util/Collection;

    if-eqz v5, :cond_44

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_44

    goto :goto_2a

    :cond_44
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_45
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_46

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_52

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_45

    goto/16 :goto_2e

    :cond_46
    :goto_2a
    sget-object v4, Lr30/j;->G:Lr30/j;

    if-ne v8, v4, :cond_49

    filled-new-array {v0, v12}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    instance-of v5, v4, Ljava/util/Collection;

    if-eqz v5, :cond_47

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_47

    goto :goto_2b

    :cond_47
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_48
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_49

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_52

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_48

    goto/16 :goto_2e

    :cond_49
    :goto_2b
    if-eqz v10, :cond_4c

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_4a

    goto :goto_2c

    :cond_4a
    if-eqz v0, :cond_4b

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_4c

    :cond_4b
    if-eqz v12, :cond_52

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_4c

    goto :goto_2e

    :cond_4c
    :goto_2c
    sget-object v0, Lr30/j;->G:Lr30/j;

    if-ne v8, v0, :cond_4f

    iget-object v0, v3, Lr30/e;->S:Ljava/lang/String;

    iget-object v4, v3, Lr30/e;->R:Ljava/lang/String;

    filled-new-array {v0, v4, v10}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v4, v0, Ljava/util/Collection;

    if-eqz v4, :cond_4d

    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4d

    goto :goto_2e

    :cond_4d
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4e
    :goto_2d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_52

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_4e

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3e

    goto :goto_2d

    :cond_4f
    sget-object v0, Lr30/j;->E:Lr30/j;

    if-eq v8, v0, :cond_50

    sget-object v0, Lr30/j;->F:Lr30/j;

    if-ne v8, v0, :cond_51

    :cond_50
    iget-object v0, v3, Lr30/e;->L:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_52

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_51

    goto :goto_2e

    :cond_51
    iget-object v0, v3, Lr30/e;->X:Ljava/lang/String;

    if-eqz v0, :cond_41

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_40

    goto/16 :goto_28

    :cond_52
    :goto_2e
    if-eqz v2, :cond_55

    iget-object v0, v3, Lr30/e;->Y:Ljava/lang/String;

    if-eqz v0, :cond_54

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v0, v1, :cond_53

    goto :goto_2f

    :cond_53
    sget v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    const-string v0, "Whitelisting info text exceeds length."

    invoke-static {v0}, Lo73/a;->w(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_54
    :goto_2f
    return-object v3

    :cond_55
    sget v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    const-string v0, "UI fields missing"

    invoke-static {v0}, Lo73/a;->x(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_56
    sget v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {v2}, Lo73/a;->w(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_57
    sget v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {v2}, Lo73/a;->x(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_58
    sget v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    const-string v0, "messageExtensions"

    invoke-static {v0}, Lo73/a;->w(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_59
    sget v1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {v0}, Lo73/a;->x(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_5a
    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    sget-object v1, Lr30/i;->y:Lr30/i;

    const-string v1, "Message is not CRes"

    const-string v2, "Invalid Message Type"

    const/16 v3, 0x65

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    throw v0
.end method

.method public static z(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V
    .locals 2

    iget v0, p0, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v0, v0, 0x3

    iget v1, p1, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v1, v1, 0x3

    if-eq v0, v1, :cond_0

    iget v0, p2, Landroid/content/res/Configuration;->colorMode:I

    or-int/2addr v0, v1

    iput v0, p2, Landroid/content/res/Configuration;->colorMode:I

    :cond_0
    iget p0, p0, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 p0, p0, 0xc

    iget p1, p1, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 p1, p1, 0xc

    if-eq p0, p1, :cond_1

    iget p0, p2, Landroid/content/res/Configuration;->colorMode:I

    or-int/2addr p0, p1

    iput p0, p2, Landroid/content/res/Configuration;->colorMode:I

    :cond_1
    return-void
.end method


# virtual methods
.method public abstract N()Ljava/lang/Object;
.end method

.method public abstract T(Ljava/lang/String;)V
.end method

.method public a()V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
