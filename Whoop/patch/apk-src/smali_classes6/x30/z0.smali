.class public final Lx30/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/l3;


# static fields
.field public static final F:Ljava/util/ArrayList;


# instance fields
.field public final E:Lg40/h2;

.field public final w:Lzy/b;

.field public final x:I

.field public final y:Lec3/h2;

.field public final z:Lec3/h2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Li93/c;

    const/16 v1, 0x30

    const/16 v2, 0x39

    invoke-direct {v0, v1, v2}, Li93/a;-><init>(CC)V

    new-instance v1, Li93/c;

    const/16 v2, 0x61

    const/16 v3, 0x7a

    invoke-direct {v1, v2, v3}, Li93/a;-><init>(CC)V

    invoke-static {v0, v1}, Lm83/s;->d1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Li93/c;

    const/16 v2, 0x41

    const/16 v3, 0x5a

    invoke-direct {v1, v2, v3}, Li93/a;-><init>(CC)V

    invoke-static {v0, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lx30/z0;->F:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sget-object v1, Lm83/y;->w:Lm83/y;

    const v2, 0x7f141010

    invoke-static {v2, v0, v1}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    iput-object v0, p0, Lx30/z0;->w:Lzy/b;

    const/4 v0, 0x2

    iput v0, p0, Lx30/z0;->x:I

    new-instance v0, Lg40/q3;

    const/4 v1, 0x0

    const/16 v2, 0xa

    const v3, 0x7f0807b0

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lg40/q3;-><init>(IZLh02/n0;I)V

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lx30/z0;->y:Lec3/h2;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lx30/z0;->z:Lec3/h2;

    new-instance v0, Lg40/h2;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lg40/h2;-><init>(I)V

    iput-object v0, p0, Lx30/z0;->E:Lg40/h2;

    return-void
.end method


# virtual methods
.method public final a()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lx30/z0;->y:Lec3/h2;

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final d()Lq3/g0;
    .locals 1

    iget-object v0, p0, Lx30/z0;->E:Lg40/h2;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLabel()Lzy/c;
    .locals 1

    iget-object v0, p0, Lx30/z0;->w:Lzy/b;

    return-object v0
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLoading()Lec3/h2;
    .locals 1

    iget-object v0, p0, Lx30/z0;->z:Lec3/h2;

    return-object v0
.end method

.method public final h()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final j(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, "userTyped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    sget-object v4, Lx30/z0;->F:Ljava/util/ArrayList;

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x22

    invoke-static {v0, p1}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final k(Ljava/lang/String;)Lg40/s3;
    .locals 6

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lg40/t3;->b:Lg40/t3;

    return-object p1

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0, p1}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toUpperCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    if-ge v3, v4, :cond_2

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_1

    new-instance p1, Lg40/v3;

    const v0, 0x7f141013

    const/4 v1, 0x6

    invoke-direct {p1, v0, v1, v5}, Lg40/v3;-><init>(IILjava/util/List;)V

    return-object p1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const v4, 0x7f141011

    if-ge v3, v0, :cond_3

    new-instance p1, Lg40/u3;

    invoke-direct {p1, v4}, Lg40/u3;-><init>(I)V

    return-object p1

    :cond_3
    invoke-static {}, Ljava/util/Locale;->getISOCountries()[Ljava/lang/String;

    move-result-object v0

    const-string v3, "getISOCountries(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x4

    if-nez v0, :cond_4

    new-instance p1, Lg40/v3;

    const v0, 0x7f141012

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p1, v0, v3, v1}, Lg40/v3;-><init>(IILjava/util/List;)V

    return-object p1

    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-ge v0, v1, :cond_5

    new-instance p1, Lg40/u3;

    invoke-direct {p1, v4}, Lg40/u3;-><init>(I)V

    return-object p1

    :cond_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v3

    invoke-static {v0, p1}, Lyb3/r;->M0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, p1}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lyb3/p;

    const-string v2, "[A-Z]"

    invoke-direct {v1, v2}, Lyb3/p;-><init>(Ljava/lang/String;)V

    new-instance v2, Lwz/h1;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Lwz/h1;-><init>(I)V

    invoke-virtual {v1, v0, v2}, Lyb3/p;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/math/BigInteger;

    const-string v2, "97"

    invoke-direct {v0, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    sget-object v1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v0, 0x22

    if-ne p1, v0, :cond_6

    new-instance p1, Lg40/x3;

    invoke-direct {p1, v5}, Lg40/x3;-><init>(Lg40/g1;)V

    return-object p1

    :cond_6
    sget-object p1, Lg40/y3;->a:Lg40/y3;

    return-object p1

    :cond_7
    new-instance p1, Lg40/u3;

    const v0, 0x7f14101d

    invoke-direct {p1, v0}, Lg40/u3;-><init>(I)V

    return-object p1
.end method

.method public final l()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final m(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "displayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final n()I
    .locals 1

    iget v0, p0, Lx30/z0;->x:I

    return v0
.end method

.method public final o()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final p()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
