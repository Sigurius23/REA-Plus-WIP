.class public final Lx30/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/l3;


# static fields
.field public static final G:Li93/c;


# instance fields
.field public final E:I

.field public final F:Lg40/h2;

.field public final w:Ljava/util/List;

.field public final x:Lec3/h2;

.field public final y:Lec3/h2;

.field public final z:Lzy/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li93/c;

    const/16 v1, 0x30

    const/16 v2, 0x39

    invoke-direct {v0, v1, v2}, Li93/a;-><init>(CC)V

    sput-object v0, Lx30/j;->G:Li93/c;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 2

    const-string v0, "banks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx30/j;->w:Ljava/util/List;

    const/4 p1, 0x0

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lx30/j;->x:Lec3/h2;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lx30/j;->y:Lec3/h2;

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    sget-object v0, Lm83/y;->w:Lm83/y;

    const v1, 0x7f140fc4

    invoke-static {v1, p1, v0}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    iput-object p1, p0, Lx30/j;->z:Lzy/b;

    const/4 p1, 0x3

    iput p1, p0, Lx30/j;->E:I

    new-instance p1, Lg40/h2;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Lg40/h2;-><init>(I)V

    iput-object p1, p0, Lx30/j;->F:Lg40/h2;

    return-void
.end method


# virtual methods
.method public final a()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lx30/j;->x:Lec3/h2;

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

    iget-object v0, p0, Lx30/j;->F:Lg40/h2;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLabel()Lzy/c;
    .locals 1

    iget-object v0, p0, Lx30/j;->z:Lzy/b;

    return-object v0
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLoading()Lec3/h2;
    .locals 1

    iget-object v0, p0, Lx30/j;->y:Lec3/h2;

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

    sget-object v4, Lx30/j;->G:Li93/c;

    invoke-virtual {v4, v3}, Li93/c;->e(C)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x6

    invoke-static {v0, p1}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

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
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-ge v0, v1, :cond_1

    new-instance p1, Lg40/u3;

    const v0, 0x7f140fc5

    invoke-direct {p1, v0}, Lg40/u3;-><init>(I)V

    return-object p1

    :cond_1
    iget-object v0, p0, Lx30/j;->w:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ls40/d;

    iget-object v4, v4, Ls40/d;->w:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-static {p1, v4, v5}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_3
    move-object v2, v3

    :goto_0
    check-cast v2, Ls40/d;

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-le p1, v1, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Lg40/x3;

    invoke-direct {p1, v3}, Lg40/x3;-><init>(Lg40/g1;)V

    return-object p1

    :cond_5
    :goto_1
    new-instance p1, Lg40/v3;

    const v0, 0x7f140fc6

    invoke-direct {p1, v0, v1, v3}, Lg40/v3;-><init>(IILjava/util/List;)V

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

    iget v0, p0, Lx30/j;->E:I

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
