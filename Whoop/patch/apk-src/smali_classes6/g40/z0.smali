.class public final Lg40/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/l3;


# static fields
.field public static final F:Ljava/util/regex/Pattern;


# instance fields
.field public final E:Lec3/h2;

.field public final w:Lzy/c;

.field public final x:Z

.field public final y:I

.field public final z:Lec3/h2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lg40/z0;->F:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    sget-object v2, Lm83/y;->w:Lm83/y;

    const v3, 0x7f140ff5

    invoke-static {v3, v1, v2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v1

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    move p1, v0

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lg40/z0;->w:Lzy/c;

    iput-boolean p1, p0, Lg40/z0;->x:Z

    const/4 p1, 0x6

    iput p1, p0, Lg40/z0;->y:I

    const/4 p1, 0x0

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lg40/z0;->z:Lec3/h2;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lg40/z0;->E:Lec3/h2;

    return-void
.end method


# virtual methods
.method public final a()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/z0;->z:Lec3/h2;

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

    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLabel()Lzy/c;
    .locals 1

    iget-object v0, p0, Lg40/z0;->w:Lzy/c;

    return-object v0
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLoading()Lec3/h2;
    .locals 1

    iget-object v0, p0, Lg40/z0;->E:Lec3/h2;

    return-object v0
.end method

.method public final h()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "userTyped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Lva3/d;->i(C)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v0, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/String;)Lg40/s3;
    .locals 6

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-boolean v3, p0, Lg40/z0;->x:Z

    if-eqz v3, :cond_1

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lg40/t3;->b:Lg40/t3;

    return-object p1

    :cond_2
    sget-object v0, Lg40/z0;->F:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_1
    sget-object p1, Lg40/y3;->a:Lg40/y3;

    return-object p1

    :cond_3
    const-string v0, "@"

    invoke-static {p1, v0, v2}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    const v3, 0x7f140ff6

    if-eqz v0, :cond_4

    const-string v0, ".*@.*\\..+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v4, "compile(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    move v0, v2

    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v2, v4, :cond_6

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x40

    if-ne v4, v5, :cond_5

    add-int/lit8 v0, v0, 0x1

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_6
    if-le v0, v1, :cond_7

    :goto_3
    new-instance p1, Lg40/v3;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p1, v3, v1, v0}, Lg40/v3;-><init>(IILjava/util/List;)V

    return-object p1

    :cond_7
    new-instance p1, Lg40/u3;

    invoke-direct {p1, v3}, Lg40/u3;-><init>(I)V

    return-object p1
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lg40/z0;->x:Z

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

    iget v0, p0, Lg40/z0;->y:I

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
