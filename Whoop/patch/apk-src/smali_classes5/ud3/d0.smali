.class public final Lud3/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ld93/a;


# static fields
.field public static final x:Lud3/d0;


# instance fields
.field public final w:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lud3/d0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-direct {v0, v1}, Lud3/d0;-><init>([Ljava/lang/String;)V

    sput-object v0, Lud3/d0;->x:Lud3/d0;

    return-void
.end method

.method public constructor <init>([Ljava/lang/String;)V
    .locals 1

    const-string v0, "namesAndValues"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lud3/d0;->w:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "namesAndValues"

    iget-object v1, p0, Lud3/d0;->w:[Ljava/lang/String;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v1

    add-int/lit8 v0, v0, -0x2

    const/4 v2, 0x0

    const/4 v3, -0x2

    invoke-static {v0, v2, v3}, Lj93/l0;->F(III)I

    move-result v2

    if-gt v2, v0, :cond_1

    :goto_0
    aget-object v3, v1, v0

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    aget-object p1, v1, v0

    return-object p1

    :cond_0
    if-eq v0, v2, :cond_1

    add-int/lit8 v0, v0, -0x2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final c(I)Ljava/lang/String;
    .locals 3

    mul-int/lit8 v0, p1, 0x2

    iget-object v1, p0, Lud3/d0;->w:[Ljava/lang/String;

    invoke-static {v0, v1}, Lm83/n;->y0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "name["

    const/16 v2, 0x5d

    invoke-static {v1, p1, v2}, Lr80/c;->o(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()Lkotlin/jvm/internal/k0;
    .locals 3

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    iget-object v1, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    iget-object v2, p0, Lud3/d0;->w:[Ljava/lang/String;

    invoke-static {v1, v2}, Lm83/s;->o0(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public final e()Ljava/util/TreeMap;
    .locals 7

    new-instance v0, Ljava/util/TreeMap;

    invoke-static {}, Lyb3/y;->G()V

    sget-object v1, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    invoke-virtual {p0}, Lud3/d0;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p0, v2}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "US"

    const-string v6, "toLowerCase(...)"

    invoke-static {v4, v5, v3, v4, v6}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-nez v4, :cond_0

    new-instance v4, Ljava/util/ArrayList;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0, v2}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lud3/d0;

    if-eqz v0, :cond_0

    check-cast p1, Lud3/d0;

    iget-object p1, p1, Lud3/d0;->w:[Ljava/lang/String;

    iget-object v0, p0, Lud3/d0;->w:[Ljava/lang/String;

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final g(I)Ljava/lang/String;
    .locals 3

    mul-int/lit8 v0, p1, 0x2

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lud3/d0;->w:[Ljava/lang/String;

    invoke-static {v0, v1}, Lm83/n;->y0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "value["

    const/16 v2, 0x5d

    invoke-static {v1, p1, v2}, Lr80/c;->o(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lud3/d0;->w:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 6

    invoke-virtual {p0}, Lud3/d0;->size()I

    move-result v0

    new-array v1, v0, [Ll83/k;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p0, v2}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ll83/k;

    invoke-direct {v5, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v5, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/m0;->h([Ljava/lang/Object;)La0/i1;

    move-result-object v0

    return-object v0
.end method

.method public final j(Ljava/lang/String;)Ljava/util/List;
    .locals 5

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lud3/d0;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v1

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p0, v2}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    if-nez v3, :cond_0

    new-instance v3, Ljava/util/ArrayList;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    :cond_0
    invoke-virtual {p0, v2}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    if-eqz v3, :cond_3

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    const-string p1, "unmodifiableList(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    if-nez v1, :cond_4

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_4
    return-object v1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lud3/d0;->w:[Ljava/lang/String;

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lud3/d0;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p0, v2}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ": "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lwd3/f;->m(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v4, "\u2588\u2588"

    :cond_0
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
