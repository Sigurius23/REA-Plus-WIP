.class public abstract Ll0/p1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll0/r1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ll0/r1;

    sget-object v1, Ll0/m;->a:Ll0/e;

    sget-object v2, Lb2/e;->J:Lb2/l;

    invoke-direct {v0, v1, v2}, Ll0/r1;-><init>(Ll0/i;Lb2/g;)V

    sput-object v0, Ll0/p1;->a:Ll0/r1;

    return-void
.end method

.method public static final a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;
    .locals 5

    sget-object v0, Ll0/m;->a:Ll0/e;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lb2/e;->J:Lb2/l;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p2, Lp1/q;

    const p0, -0x4000d2b7

    invoke-virtual {p2, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    sget-object p0, Ll0/p1;->a:Ll0/r1;

    return-object p0

    :cond_0
    check-cast p2, Lp1/q;

    const v0, -0x40000c00    # -1.9996338f

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    and-int/lit8 v0, p3, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v2, 0x1

    const/4 v3, 0x4

    if-le v0, v3, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 v0, p3, 0x6

    if-ne v0, v3, :cond_3

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    move v0, v1

    :goto_0
    and-int/lit8 v3, p3, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/16 v4, 0x20

    if-le v3, v4, :cond_4

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_4
    and-int/lit8 p3, p3, 0x30

    if-ne p3, v4, :cond_5

    goto :goto_1

    :cond_5
    move v2, v1

    :cond_6
    :goto_1
    or-int p3, v0, v2

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_7

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne v0, p3, :cond_8

    :cond_7
    new-instance v0, Ll0/r1;

    invoke-direct {v0, p0, p1}, Ll0/r1;-><init>(Ll0/i;Lb2/g;)V

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v0, Ll0/r1;

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    return-object v0
.end method
