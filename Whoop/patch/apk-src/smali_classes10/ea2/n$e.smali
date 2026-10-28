.class public final Lea2/n$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea2/n;->l(Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;

.field final synthetic w:Ljava/util/List;

.field final synthetic x:Lc93/m;

.field final synthetic y:Lc93/a;

.field final synthetic z:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/util/List;Lc93/m;Lc93/a;Landroid/content/Context;Lp1/c1;)V
    .locals 0

    iput-object p1, p0, Lea2/n$e;->w:Ljava/util/List;

    iput-object p2, p0, Lea2/n$e;->x:Lc93/m;

    iput-object p3, p0, Lea2/n$e;->y:Lc93/a;

    iput-object p4, p0, Lea2/n$e;->z:Landroid/content/Context;

    iput-object p5, p0, Lea2/n$e;->E:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 9

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    or-int/2addr p1, p4

    goto :goto_1

    :cond_1
    move p1, p4

    :goto_1
    and-int/lit8 p4, p4, 0x30

    if-nez p4, :cond_3

    move-object p4, p3

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p2}, Lp1/q;->e(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr p1, p4

    :cond_3
    and-int/lit16 p4, p1, 0x93

    const/16 v0, 0x92

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p4, v0, :cond_4

    move p4, v1

    goto :goto_3

    :cond_4
    move p4, v2

    :goto_3
    and-int/2addr p1, v1

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p1, p4}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_a

    iget-object p1, p0, Lea2/n$e;->w:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/whoop/data/onboarding/FeatureEducationType;

    const p1, 0x39ae5bdc

    invoke-virtual {p3, p1}, Lp1/q;->e0(I)V

    iget-object p1, p0, Lea2/n$e;->E:Lp1/c1;

    invoke-static {p1}, Lea2/n;->F(Lp1/c1;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object p4, p2

    check-cast p4, Lcom/whoop/data/onboarding/OnboardingStatus;

    invoke-virtual {p4}, Lcom/whoop/data/onboarding/OnboardingStatus;->getType()Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object p4

    if-ne p4, v4, :cond_5

    goto :goto_4

    :cond_6
    const/4 p2, 0x0

    :goto_4
    check-cast p2, Lcom/whoop/data/onboarding/OnboardingStatus;

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Lcom/whoop/data/onboarding/OnboardingStatus;->isCompleted()Z

    move-result p1

    goto :goto_5

    :cond_7
    move p1, v2

    :goto_5
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    invoke-virtual {p3, p2}, Lp1/q;->e(I)Z

    move-result p2

    iget-object p4, p0, Lea2/n$e;->x:Lc93/m;

    invoke-virtual {p3, p4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    or-int/2addr p2, p4

    iget-object p4, p0, Lea2/n$e;->y:Lc93/a;

    invoke-virtual {p3, p4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    or-int/2addr p2, p4

    iget-object p4, p0, Lea2/n$e;->z:Landroid/content/Context;

    invoke-virtual {p3, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p4

    or-int/2addr p2, p4

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    if-nez p2, :cond_8

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p4, p2, :cond_9

    :cond_8
    new-instance v3, Lea2/n$b;

    iget-object v5, p0, Lea2/n$e;->x:Lc93/m;

    iget-object v6, p0, Lea2/n$e;->y:Lc93/a;

    iget-object v7, p0, Lea2/n$e;->z:Landroid/content/Context;

    iget-object v8, p0, Lea2/n$e;->E:Lp1/c1;

    invoke-direct/range {v3 .. v8}, Lea2/n$b;-><init>(Lcom/whoop/data/onboarding/FeatureEducationType;Lc93/m;Lc93/a;Landroid/content/Context;Lp1/c1;)V

    invoke-virtual {p3, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p4, v3

    :cond_9
    check-cast p4, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, p1, p4, p3, v2}, Lea2/n;->I(Lcom/whoop/data/onboarding/FeatureEducationType;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_a
    invoke-virtual {p3}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lea2/n$e;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
