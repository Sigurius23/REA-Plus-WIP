.class public abstract Lyo0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyo0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a-\u0010\u0011\u001a\u00020\n*\u00020\n2\u0006\u0010\u000c\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;",
        "highlight",
        "Lyo0/g;",
        "highlightBounds",
        "Lcp0/g1;",
        "a",
        "(Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;Lyo0/g;Landroidx/compose/runtime/Composer;I)Lcp0/g1;",
        "Lcp0/d1;",
        "b",
        "(Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;)Lcp0/d1;",
        "Landroidx/compose/ui/Modifier;",
        "",
        "condition",
        "Lkotlin/Function1;",
        "Lh2/c;",
        "Ll83/a0;",
        "onCapture",
        "c",
        "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;",
        "coach-everywhere_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;Lyo0/g;Landroidx/compose/runtime/Composer;I)Lcp0/g1;
    .locals 10

    const-string v0, "highlight"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "highlightBounds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    check-cast p2, Lp1/q;

    invoke-virtual {p2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    invoke-virtual {p1}, Lyo0/g;->a()Lh2/c;

    move-result-object v1

    invoke-virtual {p1}, Lyo0/g;->b()Lh2/c;

    move-result-object v2

    invoke-virtual {p1}, Lyo0/g;->d()Lh2/c;

    move-result-object v3

    invoke-virtual {p1}, Lyo0/g;->c()Lh2/c;

    move-result-object v4

    invoke-virtual {p1}, Lyo0/g;->f()Lh2/c;

    move-result-object v5

    invoke-virtual {p1}, Lyo0/g;->e()Lh2/c;

    move-result-object v6

    and-int/lit8 v7, p3, 0xe

    xor-int/lit8 v7, v7, 0x6

    const/4 v8, 0x1

    const/4 v9, 0x4

    if-le v7, v9, :cond_0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    invoke-virtual {p2, v7}, Lp1/q;->e(I)Z

    move-result v7

    if-nez v7, :cond_1

    :cond_0
    and-int/lit8 p3, p3, 0x6

    if-ne p3, v9, :cond_2

    :cond_1
    move p3, v8

    goto :goto_0

    :cond_2
    const/4 p3, 0x0

    :goto_0
    invoke-virtual {p2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    invoke-virtual {p2, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    invoke-virtual {p2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    invoke-virtual {p2, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    invoke-virtual {p2, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    invoke-virtual {p2, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_3

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne v1, p3, :cond_a

    :cond_3
    sget-object p3, Lyo0/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p3, p0

    const/4 p3, 0x3

    if-eq p0, v8, :cond_8

    const/4 v1, 0x2

    if-eq p0, v1, :cond_7

    if-eq p0, p3, :cond_6

    if-eq p0, v9, :cond_5

    const/4 v1, 0x5

    if-ne p0, v1, :cond_4

    invoke-virtual {p1}, Lyo0/g;->b()Lh2/c;

    move-result-object p0

    goto :goto_1

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    invoke-virtual {p1}, Lyo0/g;->f()Lh2/c;

    move-result-object p0

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Lyo0/g;->d()Lh2/c;

    move-result-object p0

    goto :goto_1

    :cond_7
    invoke-virtual {p1}, Lyo0/g;->c()Lh2/c;

    move-result-object p0

    goto :goto_1

    :cond_8
    invoke-virtual {p1}, Lyo0/g;->d()Lh2/c;

    move-result-object p0

    :goto_1
    sget-object v1, Lh2/c;->e:Lh2/c;

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    invoke-virtual {p1}, Lyo0/g;->e()Lh2/c;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    new-instance v1, Lh2/c;

    iget v2, p0, Lh2/c;->a:F

    invoke-virtual {p1}, Lyo0/g;->e()Lh2/c;

    move-result-object v3

    iget v3, v3, Lh2/c;->a:F

    sub-float/2addr v2, v3

    iget v3, p0, Lh2/c;->b:F

    invoke-virtual {p1}, Lyo0/g;->e()Lh2/c;

    move-result-object v4

    iget v4, v4, Lh2/c;->b:F

    sub-float/2addr v3, v4

    iget v4, p0, Lh2/c;->c:F

    invoke-virtual {p1}, Lyo0/g;->e()Lh2/c;

    move-result-object v5

    iget v5, v5, Lh2/c;->a:F

    sub-float/2addr v4, v5

    iget p0, p0, Lh2/c;->d:F

    invoke-virtual {p1}, Lyo0/g;->e()Lh2/c;

    move-result-object p1

    iget p1, p1, Lh2/c;->b:F

    sub-float/2addr p0, p1

    invoke-direct {v1, v2, v3, v4, p0}, Lh2/c;-><init>(FFFF)V

    :cond_9
    int-to-float p0, p3

    int-to-float p1, v9

    mul-float/2addr p0, p1

    invoke-interface {v0, p0}, Ly3/c;->q0(F)F

    move-result p0

    int-to-float p3, v8

    mul-float/2addr p3, p1

    invoke-interface {v0, p3}, Ly3/c;->q0(F)F

    move-result p1

    new-instance p3, Lcp0/g1;

    invoke-direct {p3, v1, p0, p1}, Lcp0/g1;-><init>(Lh2/c;FF)V

    invoke-virtual {p2, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, p3

    :cond_a
    check-cast v1, Lcp0/g1;

    return-object v1
.end method

.method public static final b(Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;)Lcp0/d1;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lyo0/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    sget-object p0, Lcp0/d1;->NONE:Lcp0/d1;

    return-object p0

    :cond_1
    sget-object p0, Lcp0/d1;->AUDIO_INPUT:Lcp0/d1;

    return-object p0

    :cond_2
    sget-object p0, Lcp0/d1;->TEXT_FIELD:Lcp0/d1;

    return-object p0

    :cond_3
    sget-object p0, Lcp0/d1;->BLUR:Lcp0/d1;

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCapture"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-static {p0, p2}, Lcp0/f;->q(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    :cond_0
    return-object p0
.end method
