.class public abstract Laf1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a+\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007*\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "raw",
        "Ljava/time/LocalDate;",
        "a",
        "(Ljava/lang/String;)Ljava/time/LocalDate;",
        "Li11/f;",
        "fallbackAnchorDate",
        "Ll83/k;",
        "b",
        "(Li11/f;Ljava/lang/String;)Ll83/k;",
        "exercise-progress-mini-arch_release"
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
.method public static final a(Ljava/lang/String;)Ljava/time/LocalDate;
    .locals 3

    const-string v0, "raw"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x54

    invoke-static {p0, v0}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x20

    invoke-static {v0, v1}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0xa

    if-lt v1, v2, :cond_1

    invoke-static {v2, v0}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;)Ljava/time/LocalDate;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0}, Ljava/time/Instant;->parse(Ljava/lang/CharSequence;)Ljava/time/Instant;

    move-result-object p0

    sget-object v0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    invoke-virtual {p0, v0}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p0

    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    move-result-object p0
    :try_end_0
    .catch Ljava/time/format/DateTimeParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final b(Li11/f;Ljava/lang/String;)Ll83/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li11/f;",
            "Ljava/lang/String;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Li11/f;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Laf1/c;->a(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object v0

    invoke-virtual {p0}, Li11/f;->i()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Laf1/c;->a(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/time/LocalDate;

    move-result-object p0

    invoke-static {p0}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    if-eqz p1, :cond_0

    invoke-static {p1}, Laf1/c;->a(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p0, p1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->t1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x2

    const-string v1, "toString(...)"

    if-lt p1, v0, :cond_1

    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/time/LocalDate;

    invoke-virtual {p1}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/time/LocalDate;

    invoke-virtual {p0}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ll83/k;

    invoke-direct {v0, p1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/time/LocalDate;

    invoke-virtual {p0}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ll83/k;

    invoke-direct {p1, p0, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_2
    new-instance p0, Ll83/k;

    const-string p1, ""

    invoke-direct {p0, p1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method
