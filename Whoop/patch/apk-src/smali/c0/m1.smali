.class public abstract Lc0/m1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld0/i1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v2, v2, v1, v0}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    sput-object v0, Lc0/m1;->a:Ld0/i1;

    return-void
.end method

.method public static final a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;
    .locals 9

    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    sget-object p2, Lc0/m1;->a:Ld0/i1;

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const-string p3, "ColorAnimation"

    :cond_1
    move-object v4, p3

    invoke-static {p0, p1}, Li2/x;->g(J)Lj2/c;

    move-result-object p2

    move-object v6, p4

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_2

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p3, p2, :cond_3

    :cond_2
    invoke-static {p0, p1}, Li2/x;->g(J)Lj2/c;

    move-result-object p2

    sget-object p3, Lc0/d;->z:Lc0/d;

    new-instance p4, La3/m1;

    const/16 p6, 0x9

    invoke-direct {p4, p2, p6}, La3/m1;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Ld0/f2;

    invoke-direct {p2, p3, p4}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v6, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p3, p2

    :cond_3
    move-object v1, p3

    check-cast v1, Ld0/f2;

    new-instance v0, Li2/x;

    invoke-direct {v0, p0, p1}, Li2/x;-><init>(J)V

    and-int/lit8 p0, p5, 0xe

    shl-int/lit8 p1, p5, 0x3

    and-int/lit16 p1, p1, 0x380

    or-int/2addr p0, p1

    shl-int/lit8 p1, p5, 0x6

    const p2, 0xe000

    and-int/2addr p2, p1

    or-int/2addr p0, p2

    const/high16 p2, 0x70000

    and-int/2addr p1, p2

    or-int v7, p0, p1

    const/16 v8, 0x8

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Ld0/g;->d(Ljava/lang/Object;Ld0/f2;Ld0/l;Ljava/lang/Float;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p0

    return-object p0
.end method
