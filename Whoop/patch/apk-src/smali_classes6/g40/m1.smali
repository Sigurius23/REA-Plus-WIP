.class public final Lg40/m1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Li93/c;


# instance fields
.field public a:Ljava/lang/String;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ln53/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li93/c;

    const/16 v1, 0x30

    const/16 v2, 0x39

    invoke-direct {v0, v1, v2}, Li93/a;-><init>(CC)V

    sput-object v0, Lg40/m1;->d:Li93/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lg40/m1;->a:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {v1, v2}, Le93/b;->i0(II)Li93/j;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    move-object v4, v2

    check-cast v4, Li93/i;

    iget-boolean v4, v4, Li93/i;->y:Z

    if-eqz v4, :cond_0

    move-object v4, v2

    check-cast v4, Lm83/e0;

    invoke-virtual {v4}, Lm83/e0;->nextInt()I

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iput-object v3, p0, Lg40/m1;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v8, 0x0

    const/16 v9, 0x3e

    sget-object v4, Lm83/y;->w:Lm83/y;

    const-string v5, ""

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-static {v3}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    new-array v1, v1, [Lec3/l;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lec3/l;

    new-instance v1, Lg40/c;

    const/4 v2, 0x4

    invoke-direct {v1, v0, v2}, Lg40/c;-><init>([Lec3/l;I)V

    move-object v0, v1

    :goto_1
    new-instance v1, Lg40/d;

    const/4 v2, 0x4

    invoke-direct {v1, v3, v2}, Lg40/d;-><init>(Ljava/util/ArrayList;I)V

    new-instance v2, Ln53/e;

    invoke-direct {v2, v0, v1}, Ln53/e;-><init>(Lec3/l;Lc93/a;)V

    iput-object v2, p0, Lg40/m1;->c:Ln53/e;

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;)I
    .locals 7

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg40/m1;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x0

    const-string v0, ""

    invoke-virtual {p1, p2, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return v2

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_3

    invoke-virtual {p2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    sget-object v6, Lg40/m1;->d:Li93/c;

    invoke-virtual {v6, v5}, Li93/c;->e(C)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v3, 0x6

    if-ne v1, v3, :cond_4

    move p1, v2

    :cond_4
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v2, v1}, Le93/b;->i0(II)Li93/j;

    move-result-object v2

    invoke-virtual {v2}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    move-object v3, v2

    check-cast v3, Li93/i;

    iget-boolean v3, v3, Li93/i;->y:Z

    if-eqz v3, :cond_5

    move-object v3, v2

    check-cast v3, Lm83/e0;

    invoke-virtual {v3}, Lm83/e0;->nextInt()I

    move-result v3

    add-int v4, p1, v3

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lec3/p1;

    invoke-virtual {p2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v3

    check-cast v4, Lec3/h2;

    invoke-virtual {v4, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    return v1
.end method
