.class public abstract Lih0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0010\u00b2\u0006\u000e\u0010\u000e\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000f\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "i",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;",
        "Ly3/l;",
        "Lh2/c;",
        "g",
        "(J)Lh2/c;",
        "Lp1/t1;",
        "",
        "a",
        "Lp1/t1;",
        "h",
        "()Lp1/t1;",
        "LocalKeepFormWidgetInView",
        "hasFocus",
        "widgetSize",
        "bot_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lp1/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li21/r;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Li21/r;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lih0/n;->a:Lp1/t1;

    return-void
.end method

.method public static synthetic a()Z
    .locals 1

    invoke-static {}, Lih0/n;->d()Z

    move-result v0

    return v0
.end method

.method public static synthetic b(Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lih0/n;->n(Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Ly3/l;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lih0/n;->o(Lp1/c1;Ly3/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static final synthetic e(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lih0/n;->j(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic f(Lp1/c1;)J
    .locals 2

    invoke-static {p0}, Lih0/n;->l(Lp1/c1;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final g(J)Lh2/c;
    .locals 4

    new-instance v0, Ly3/l;

    invoke-direct {v0, p0, p1}, Ly3/l;-><init>(J)V

    const-wide v1, 0xffffffffL

    and-long/2addr p0, v1

    long-to-int p0, p0

    const/4 p1, 0x0

    if-lez p0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    if-eqz v0, :cond_1

    iget-wide p0, v0, Ly3/l;->a:J

    new-instance v0, Lh2/c;

    and-long/2addr v1, p0

    long-to-int v1, v1

    add-int/lit8 v2, v1, -0x1

    int-to-float v2, v2

    const/16 v3, 0x20

    shr-long/2addr p0, v3

    long-to-int p0, p0

    int-to-float p0, p0

    int-to-float p1, v1

    const/4 v1, 0x0

    invoke-direct {v0, v1, v2, p0, p1}, Lh2/c;-><init>(FFFF)V

    return-object v0

    :cond_1
    return-object p1
.end method

.method public static final h()Lp1/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp1/t1;"
        }
    .end annotation

    sget-object v0, Lih0/n;->a:Lp1/t1;

    return-object v0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 9

    const-string p2, "<this>"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p2, 0x7a92d096

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    sget-object p2, Lih0/n;->a:Lp1/t1;

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    return-object p0

    :cond_0
    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne p2, v1, :cond_1

    new-instance p2, Lr0/c;

    invoke-direct {p2}, Lr0/c;-><init>()V

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v6, p2

    check-cast v6, Lr0/a;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_2

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v3, p2

    check-cast v3, Lp1/c1;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    new-instance p2, Ly3/l;

    const-wide/16 v4, 0x0

    invoke-direct {p2, v4, v5}, Ly3/l;-><init>(J)V

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v7, p2

    check-cast v7, Lp1/c1;

    sget-object p2, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {p1}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object p2

    iget-object p2, p2, Ll0/c2;->c:Ll0/b;

    invoke-static {p2, p1}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v4

    sget-object p2, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, Ly3/c;

    invoke-static {v3}, Lih0/n;->j(Lp1/c1;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v2, v8

    invoke-virtual {p1, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v2, v8

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v2, :cond_4

    if-ne v8, v1, :cond_5

    :cond_4
    new-instance v2, Lih0/n$a;

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v8}, Lih0/n$a;-><init>(Lp1/c1;Lp1/t2;Ly3/c;Lr0/a;Lp1/c1;Lq83/d;)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v8, v2

    :cond_5
    check-cast v8, Lc93/m;

    invoke-static {p1, v8, p2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    new-instance p2, Lih0/h;

    const/4 v2, 0x1

    invoke-direct {p2, v2, v3}, Lih0/h;-><init>(ILp1/c1;)V

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, p2}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    new-instance p2, Lih0/h;

    const/4 v1, 0x2

    invoke-direct {p2, v1, v7}, Lih0/h;-><init>(ILp1/c1;)V

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, p2}, Landroidx/compose/ui/layout/b;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p0, v6}, Landroidx/compose/foundation/relocation/a;->a(Landroidx/compose/ui/Modifier;Lr0/a;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final j(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final k(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final l(Lp1/c1;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")J"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/l;

    iget-wide v0, p0, Ly3/l;->a:J

    return-wide v0
.end method

.method private static final m(Lp1/c1;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "J)V"
        }
    .end annotation

    new-instance v0, Ly3/l;

    invoke-direct {v0, p1, p2}, Ly3/l;-><init>(J)V

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final n(Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lg2/w;

    invoke-virtual {p1}, Lg2/w;->a()Z

    move-result p1

    invoke-static {p0, p1}, Lih0/n;->k(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lp1/c1;Ly3/l;)Ll83/a0;
    .locals 2

    iget-wide v0, p1, Ly3/l;->a:J

    invoke-static {p0, v0, v1}, Lih0/n;->m(Lp1/c1;J)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
