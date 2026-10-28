.class public final Lx30/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/l3;


# static fields
.field public static final E:Li93/c;


# instance fields
.field public final w:Lec3/h2;

.field public final x:Lec3/h2;

.field public final y:Lzy/b;

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li93/c;

    const/16 v1, 0x30

    const/16 v2, 0x39

    invoke-direct {v0, v1, v2}, Li93/a;-><init>(CC)V

    sput-object v0, Lx30/d;->E:Li93/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lx30/d;->w:Lec3/h2;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lx30/d;->x:Lec3/h2;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sget-object v1, Lm83/y;->w:Lm83/y;

    const v2, 0x7f140fc1

    invoke-static {v2, v0, v1}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    iput-object v0, p0, Lx30/d;->y:Lzy/b;

    const/4 v0, 0x3

    iput v0, p0, Lx30/d;->z:I

    return-void
.end method


# virtual methods
.method public final a()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lx30/d;->w:Lec3/h2;

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

    iget-object v0, p0, Lx30/d;->y:Lzy/b;

    return-object v0
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLoading()Lec3/h2;
    .locals 1

    iget-object v0, p0, Lx30/d;->x:Lec3/h2;

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

    sget-object v4, Lx30/d;->E:Li93/c;

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

    const/16 v0, 0x9

    invoke-static {v0, p1}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/String;)Lg40/s3;
    .locals 2

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

    const/4 v1, 0x4

    if-ge v0, v1, :cond_1

    new-instance p1, Lg40/u3;

    const v0, 0x7f140fc2

    invoke-direct {p1, v0}, Lg40/u3;-><init>(I)V

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v0, 0x9

    if-ge p1, v0, :cond_2

    sget-object p1, Lg40/y3;->a:Lg40/y3;

    return-object p1

    :cond_2
    new-instance p1, Lg40/x3;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lg40/x3;-><init>(Lg40/g1;)V

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

    iget v0, p0, Lx30/d;->z:I

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
