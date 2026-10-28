.class public abstract Ly1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp0/n0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lxl2/a;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lxl2/a;-><init>(I)V

    new-instance v1, Lvb1/a;

    const/16 v2, 0x12

    invoke-direct {v1, v2}, Lvb1/a;-><init>(I)V

    new-instance v2, Lp0/n0;

    const/16 v3, 0xa

    invoke-direct {v2, v3, v0, v1}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sput-object v2, Ly1/k;->a:Lp0/n0;

    return-void
.end method

.method public static final a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable()."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lc93/m;Lkotlin/jvm/functions/Function1;)Lp0/n0;
    .locals 2

    new-instance v0, Ld91/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p0}, Ld91/a;-><init>(ILc93/m;)V

    const/4 p0, 0x1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    new-instance p0, Lp0/n0;

    const/16 v1, 0xa

    invoke-direct {p0, v1, v0, p1}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
    .locals 7

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    shl-int/lit8 p0, p3, 0x6

    and-int/lit16 p0, p0, 0x1c00

    or-int/lit16 v5, p0, 0x180

    const/4 v6, 0x0

    sget-object v2, Ly1/k;->a:Lp0/n0;

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v1 .. v6}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
    .locals 7

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    shl-int/lit8 p0, p4, 0x3

    and-int/lit16 p0, p0, 0x1c00

    const/16 p4, 0x180

    or-int v5, p4, p0

    const/4 v6, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v6}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;
    .locals 7

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    sget-object p1, Ly1/k;->a:Lp0/n0;

    :cond_0
    move-object v1, p1

    check-cast p3, Lp1/q;

    iget-wide v2, p3, Lp1/q;->T:J

    const/16 p1, 0x24

    invoke-static {p1}, Lva3/d;->c(I)V

    invoke-static {v2, v3, p1}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v3

    const-string p1, "toString(...)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ly1/h;->a:Lp1/u2;

    invoke-virtual {p3, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ly1/f;

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    const/4 p5, 0x0

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne p1, v6, :cond_3

    if-eqz v2, :cond_1

    invoke-interface {v2, v3}, Ly1/f;->f(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {v1, p1}, Ly1/j;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, p5

    :goto_0
    if-nez p1, :cond_2

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    :cond_2
    move-object v4, p1

    new-instance v0, Ly1/b;

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Ly1/b;-><init>(Ly1/j;Ly1/f;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    invoke-virtual {p3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p1, v0

    goto :goto_1

    :cond_3
    move-object v5, p0

    :goto_1
    check-cast p1, Ly1/b;

    iget-object p0, p1, Ly1/b;->E:[Ljava/lang/Object;

    invoke-static {v5, p0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    iget-object p5, p1, Ly1/b;->z:Ljava/lang/Object;

    :cond_4
    if-nez p5, :cond_5

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p5

    :cond_5
    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    and-int/lit8 p2, p4, 0x70

    xor-int/lit8 p2, p2, 0x30

    const/16 v0, 0x20

    if-le p2, v0, :cond_6

    invoke-virtual {p3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    :cond_6
    and-int/lit8 p2, p4, 0x30

    if-ne p2, v0, :cond_8

    :cond_7
    const/4 p2, 0x1

    goto :goto_2

    :cond_8
    const/4 p2, 0x0

    :goto_2
    or-int/2addr p0, p2

    invoke-virtual {p3, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p0, p2

    invoke-virtual {p3, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p0, p2

    invoke-virtual {p3, p5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p0, p2

    invoke-virtual {p3, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p0, p2

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p0, :cond_a

    if-ne p2, v6, :cond_9

    goto :goto_3

    :cond_9
    move-object v5, p5

    goto :goto_4

    :cond_a
    :goto_3
    new-instance v0, Ly1/a;

    move-object v4, v3

    move-object v6, v5

    move-object v5, p5

    move-object v3, v2

    move-object v2, v1

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Ly1/a;-><init>(Ly1/b;Ly1/j;Ly1/f;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    invoke-virtual {p3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p2, v0

    :goto_4
    check-cast p2, Lc93/a;

    invoke-static {p2, p3}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    return-object v5
.end method

.method public static final f([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;)Lp1/c1;
    .locals 7

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    new-instance p0, Lx31/a;

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lx31/a;-><init>(I)V

    new-instance v0, Lu93/e;

    invoke-direct {v0}, Lu93/e;-><init>()V

    new-instance v2, Lp0/n0;

    const/16 v3, 0xa

    invoke-direct {v2, v3, p0, v0}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 v5, 0xd80

    const/4 v6, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v1 .. v6}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lp1/c1;

    return-object p0
.end method

.method public static final g(Landroidx/compose/runtime/Composer;)Ly1/d;
    .locals 5

    check-cast p0, Lp1/q;

    const v0, 0x753e2915

    invoke-virtual {p0, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_0

    new-instance v2, Lwe1/h;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lwe1/h;-><init>(I)V

    invoke-virtual {p0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v2, Lc93/a;

    const/16 v3, 0x180

    sget-object v4, Ly1/d;->E:Lp0/n0;

    invoke-static {v1, v4, v2, p0, v3}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly1/d;

    sget-object v2, Ly1/h;->a:Lp1/u2;

    invoke-virtual {p0, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly1/f;

    iput-object v2, v1, Ly1/d;->y:Ly1/f;

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    return-object v1
.end method
