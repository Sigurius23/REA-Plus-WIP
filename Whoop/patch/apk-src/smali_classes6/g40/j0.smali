.class public final Lg40/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/l3;


# instance fields
.field public final E:Lec3/h2;

.field public final F:Ly3/m;

.field public final w:Lzy/b;

.field public final x:I

.field public final y:Lg40/d1;

.field public final z:Lec3/h2;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sget-object v1, Lm83/y;->w:Lm83/y;

    const v2, 0x7f140ffb

    invoke-static {v2, v0, v1}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    iput-object v0, p0, Lg40/j0;->w:Lzy/b;

    const/16 v0, 0x8

    iput v0, p0, Lg40/j0;->x:I

    new-instance v0, Lg40/d1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lg40/d1;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lg40/j0;->y:Lg40/d1;

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lg40/j0;->z:Lec3/h2;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lg40/j0;->E:Lec3/h2;

    sget-object v0, Ly3/m;->w:Ly3/m;

    iput-object v0, p0, Lg40/j0;->F:Ly3/m;

    return-void
.end method


# virtual methods
.method public final a()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/j0;->z:Lec3/h2;

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

    iget-object v0, p0, Lg40/j0;->y:Lg40/d1;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLabel()Lzy/c;
    .locals 1

    iget-object v0, p0, Lg40/j0;->w:Lzy/b;

    return-object v0
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    iget-object v0, p0, Lg40/j0;->F:Ly3/m;

    return-object v0
.end method

.method public final getLoading()Lec3/h2;
    .locals 1

    iget-object v0, p0, Lg40/j0;->E:Lec3/h2;

    return-object v0
.end method

.method public final h()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "userTyped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/String;)Lg40/s3;
    .locals 8

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lg40/t3;->b:Lg40/t3;

    return-object p1

    :cond_0
    invoke-static {p1}, Lo73/a;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const v1, 0x7f141016

    const/4 v2, 0x4

    if-ge v0, v2, :cond_1

    new-instance p1, Lg40/u3;

    invoke-direct {p1, v1}, Lg40/u3;-><init>(I)V

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v3, 0x0

    if-le v0, v2, :cond_2

    new-instance p1, Lg40/v3;

    const/4 v0, 0x6

    invoke-direct {p1, v1, v0, v3}, Lg40/v3;-><init>(IILjava/util/List;)V

    return-object p1

    :cond_2
    const/4 v0, 0x2

    invoke-static {v0, p1}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Required value was null."

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-static {v0, p1}, Lyb3/r;->M0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/4 v4, 0x1

    add-int/2addr v2, v4

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/util/Calendar;->get(I)I

    move-result v5

    rem-int/lit8 v5, v5, 0x64

    sub-int/2addr p1, v5

    const/4 v5, 0x0

    if-gez p1, :cond_3

    move v6, v4

    goto :goto_0

    :cond_3
    move v6, v5

    :goto_0
    const/16 v7, 0x32

    if-le p1, v7, :cond_4

    move v7, v4

    goto :goto_1

    :cond_4
    move v7, v5

    :goto_1
    if-nez p1, :cond_5

    if-le v2, v1, :cond_5

    move p1, v4

    goto :goto_2

    :cond_5
    move p1, v5

    :goto_2
    if-gt v4, v1, :cond_6

    const/16 v2, 0xd

    if-ge v1, v2, :cond_6

    goto :goto_3

    :cond_6
    move v4, v5

    :goto_3
    const v1, 0x7f141023

    if-eqz v6, :cond_7

    new-instance p1, Lg40/v3;

    invoke-direct {p1, v1, v0, v3}, Lg40/v3;-><init>(IILjava/util/List;)V

    return-object p1

    :cond_7
    if-eqz v7, :cond_8

    new-instance p1, Lg40/v3;

    invoke-direct {p1, v1, v0, v3}, Lg40/v3;-><init>(IILjava/util/List;)V

    return-object p1

    :cond_8
    const v1, 0x7f141022

    if-eqz p1, :cond_9

    new-instance p1, Lg40/v3;

    invoke-direct {p1, v1, v0, v3}, Lg40/v3;-><init>(IILjava/util/List;)V

    return-object p1

    :cond_9
    if-nez v4, :cond_a

    new-instance p1, Lg40/u3;

    invoke-direct {p1, v1}, Lg40/u3;-><init>(I)V

    return-object p1

    :cond_a
    new-instance p1, Lg40/x3;

    invoke-direct {p1, v3}, Lg40/x3;-><init>(Lg40/g1;)V

    return-object p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
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

    iget v0, p0, Lg40/j0;->x:I

    return v0
.end method

.method public final o()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final p()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
