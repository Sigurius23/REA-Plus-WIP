.class public abstract Lk80/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0015\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a!\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "",
        "i",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Lp1/t2;",
        "",
        "h",
        "(Landroidx/compose/runtime/Composer;I)Lp1/t2;",
        "g",
        "(Landroidx/compose/runtime/Composer;I)Z",
        "keyboardVisible",
        "Lb3/x2;",
        "keyboardController",
        "Ll83/a0;",
        "f",
        "(ZLb3/x2;)V",
        "c",
        "(Landroidx/compose/runtime/Composer;I)V",
        "activation_release"
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lk80/s;->e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lk80/s;->d()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Landroidx/compose/runtime/Composer;I)V
    .locals 4

    check-cast p0, Lp1/q;

    const v0, 0x5e2c083c

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {p0, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_1

    new-instance v2, Ljx2/b;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Ljx2/b;-><init>(I)V

    invoke-virtual {p0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v2, Lc93/a;

    const/16 v3, 0x30

    invoke-static {v2, v0, p0, v3, v1}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_3

    new-instance v0, Lk71/a0;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lk71/a0;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method private static final d()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lk80/s;->c(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final f(ZLb3/x2;)V
    .locals 0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    check-cast p1, Lb3/x1;

    invoke-virtual {p1}, Lb3/x1;->a()V

    :cond_0
    return-void
.end method

.method public static final g(Landroidx/compose/runtime/Composer;I)Z
    .locals 0

    sget-object p1, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {p0}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object p0

    iget-object p0, p0, Ll0/c2;->c:Ll0/b;

    iget-object p0, p0, Ll0/b;->d:Lp1/k1;

    invoke-virtual {p0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final h(Landroidx/compose/runtime/Composer;I)Lp1/t2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Lp1/t2;"
        }
    .end annotation

    sget-object p1, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {p0}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object p1

    iget-object p1, p1, Ll0/c2;->c:Ll0/b;

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    invoke-virtual {p1}, Ll0/b;->e()Lv4/b;

    move-result-object p1

    iget p1, p1, Lv4/b;->d:I

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1, p0}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "\\s"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, ""

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "replaceAll(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
