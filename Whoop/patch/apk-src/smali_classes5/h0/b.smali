.class public abstract Lh0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld0/e2;

.field public static final b:Lgo1/a;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    sput-object v0, Lh0/b;->a:Ld0/e2;

    new-instance v0, Lgo1/a;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lgo1/a;-><init>(I)V

    sput-object v0, Lh0/b;->b:Lgo1/a;

    invoke-static {}, Ld0/f;->o()Ld0/x;

    const/16 v0, 0x8

    sput v0, Lh0/b;->c:I

    return-void
.end method

.method public static a(Lh0/p;Landroidx/compose/runtime/Composer;I)Lh0/p3;
    .locals 7

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    check-cast p1, Lp1/q;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    invoke-virtual {p1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit8 v2, p2, 0xe

    xor-int/lit8 v2, v2, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x4

    if-le v2, v5, :cond_0

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    and-int/lit8 v2, p2, 0x6

    if-ne v2, v5, :cond_2

    :cond_1
    move v2, v4

    goto :goto_0

    :cond_2
    move v2, v3

    :goto_0
    or-int/2addr v1, v2

    and-int/lit8 v2, p2, 0x70

    xor-int/lit8 v2, v2, 0x30

    const/16 v5, 0x20

    sget-object v6, Lh0/b;->b:Lgo1/a;

    if-le v2, v5, :cond_3

    invoke-virtual {p1, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    :cond_3
    and-int/lit8 p2, p2, 0x30

    if-ne p2, v5, :cond_5

    :cond_4
    move v3, v4

    :cond_5
    or-int p2, v1, v3

    sget-object v1, Lh0/b;->a:Ld0/e2;

    invoke-virtual {p1, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr p2, v2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p2, :cond_6

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne v2, p2, :cond_7

    :cond_6
    new-instance p2, Lg1/r0;

    const/4 v2, 0x2

    invoke-direct {p2, v2, v0}, Lg1/r0;-><init>(ILy3/c;)V

    new-instance v0, Lh0/c;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v6, p2, v2}, Lh0/c;-><init>(Ljava/lang/Object;Ll83/e;Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Li0/k;->e(Lh0/c;Ld0/l;)Li0/g;

    move-result-object v2

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lh0/p3;

    return-object v2
.end method
