.class public abstract Llb1/x4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/x4$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\n\u0010\t\u001a\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\u0015\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u0018\u001a\u0015\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u0018\u001a\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u0018\u00a8\u0006\u001c"
    }
    d2 = {
        "Lkd1/l;",
        "k",
        "(Lkd1/l;)Lkd1/l;",
        "homeCtaType",
        "Ly81/e;",
        "a",
        "(Lkd1/l;)Ly81/e;",
        "Lj91/b;",
        "d",
        "(Lkd1/l;)Lj91/b;",
        "b",
        "Li91/a;",
        "c",
        "(Lkd1/l;)Li91/a;",
        "",
        "icon",
        "Ly71/g;",
        "h",
        "(Lkd1/l;Ljava/lang/String;)Ly71/g;",
        "Lk91/a;",
        "f",
        "(Lkd1/l;)Lk91/a;",
        "Ly3/f;",
        "j",
        "(Lkd1/l;)F",
        "i",
        "e",
        "g",
        "design-models_release"
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
.method public static final a(Lkd1/l;)Ly81/e;
    .locals 1

    const-string v0, "homeCtaType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/x4$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 v0, 0x6

    if-eq p0, v0, :cond_0

    sget-object p0, Llb1/x4$f;->w:Llb1/x4$f;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object p0, Llb1/x4$e;->w:Llb1/x4$e;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object p0, Llb1/x4$d;->w:Llb1/x4$d;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object p0, Llb1/x4$c;->w:Llb1/x4$c;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object p0, Llb1/x4$b;->w:Llb1/x4$b;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lkd1/l;)Lj91/b;
    .locals 1

    const-string v0, "homeCtaType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/x4$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x4

    if-eq p0, v0, :cond_2

    const/4 v0, 0x6

    if-eq p0, v0, :cond_1

    const/4 v0, 0x7

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {}, Lgb1/b0;->J0()Li2/t;

    move-result-object p0

    invoke-static {p0}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {}, Lgb1/b0;->P()Li2/t;

    move-result-object p0

    invoke-static {p0}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {}, Lgb1/b0;->z()Li2/t;

    move-result-object p0

    invoke-static {p0}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkd1/l;)Li91/a;
    .locals 1

    const-string v0, "homeCtaType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/x4$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x5

    if-eq p0, v0, :cond_1

    const/16 v0, 0x8

    if-eq p0, v0, :cond_0

    sget-object p0, Llb1/x4$i;->w:Llb1/x4$i;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object p0, Llb1/x4$h;->w:Llb1/x4$h;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object p0, Llb1/x4$g;->w:Llb1/x4$g;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkd1/l;)Lj91/b;
    .locals 1

    const-string v0, "homeCtaType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/x4$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 v0, 0x6

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object p0

    invoke-static {p0}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lkd1/l;)F
    .locals 4

    const-string v0, "homeCtaType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/x4$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x7

    const/16 v1, 0x8

    if-ne p0, v0, :cond_0

    const/4 p0, 0x2

    int-to-float p0, p0

    :goto_0
    int-to-float v0, v1

    mul-float/2addr p0, v0

    return p0

    :cond_0
    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float p0, v2

    goto :goto_0
.end method

.method public static final f(Lkd1/l;)Lk91/a;
    .locals 1

    const-string v0, "homeCtaType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/x4$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x7

    if-ne p0, v0, :cond_0

    sget-object p0, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {p0}, Lkd1/w;->b()Lk91/a;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object p0, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {p0}, Lkd1/w;->a()Lk91/a;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lkd1/l;)F
    .locals 1

    const-string v0, "homeCtaType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/x4$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x7

    if-ne p0, v0, :cond_0

    const/high16 p0, 0x7fc00000    # Float.NaN

    return p0

    :cond_0
    sget-object p0, Ld11/i;->D:Ld11/i$b;

    invoke-virtual {p0}, Ld11/i$b;->a()F

    move-result p0

    return p0
.end method

.method public static final h(Lkd1/l;Ljava/lang/String;)Ly71/g;
    .locals 2

    const-string v0, "homeCtaType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/x4$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x4

    const/4 v1, 0x0

    if-eq p0, v0, :cond_0

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 v0, 0x6

    if-eq p0, v0, :cond_0

    const/16 v0, 0x9

    if-eq p0, v0, :cond_0

    new-instance p0, Ly71/g;

    sget-object v0, Lgz0/m0;->SURVEY:Lgz0/m0;

    invoke-static {p1, v0}, Lgz0/n0;->e(Ljava/lang/String;Lgz0/m0;)I

    move-result p1

    const/4 v0, 0x2

    invoke-direct {p0, p1, v1, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_0
    return-object v1
.end method

.method public static final i(Lkd1/l;)F
    .locals 4

    const-string v0, "homeCtaType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/x4$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x7

    const/16 v1, 0x8

    if-ne p0, v0, :cond_0

    const/4 p0, 0x2

    int-to-float p0, p0

    :goto_0
    int-to-float v0, v1

    mul-float/2addr p0, v0

    return p0

    :cond_0
    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float p0, v2

    goto :goto_0
.end method

.method public static final j(Lkd1/l;)F
    .locals 2

    const-string v0, "homeCtaType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/x4$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x7

    const/4 v1, 0x4

    if-ne p0, v0, :cond_0

    const/16 p0, 0x10

    :goto_0
    int-to-float p0, p0

    int-to-float v0, v1

    mul-float/2addr p0, v0

    return p0

    :cond_0
    const/16 p0, 0x12

    goto :goto_0
.end method

.method public static final k(Lkd1/l;)Lkd1/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/x4$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object p0, Lkd1/l;->EDUCATION_COACH:Lkd1/l;

    :cond_0
    return-object p0
.end method
