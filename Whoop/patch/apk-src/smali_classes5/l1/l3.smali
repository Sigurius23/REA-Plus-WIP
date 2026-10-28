.class public abstract Ll1/l3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;

.field public static final b:Landroidx/compose/material3/c;

.field public static final c:Landroidx/compose/material3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ll1/f0;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ll1/f0;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Ll1/l3;->a:Lp1/b0;

    new-instance v0, Landroidx/compose/material3/c;

    sget-wide v1, Li2/x;->n:J

    const/4 v3, 0x1

    const/high16 v4, 0x7fc00000    # Float.NaN

    invoke-direct {v0, v3, v4, v1, v2}, Landroidx/compose/material3/c;-><init>(ZFJ)V

    sput-object v0, Ll1/l3;->b:Landroidx/compose/material3/c;

    new-instance v0, Landroidx/compose/material3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Landroidx/compose/material3/c;-><init>(ZFJ)V

    sput-object v0, Ll1/l3;->c:Landroidx/compose/material3/c;

    return-void
.end method

.method public static a(FIZ)Landroidx/compose/material3/c;
    .locals 3

    and-int/lit8 v0, p1, 0x1

    if-eqz v0, :cond_0

    const/4 p2, 0x1

    :cond_0
    and-int/lit8 p1, p1, 0x2

    const/high16 v0, 0x7fc00000    # Float.NaN

    if-eqz p1, :cond_1

    move p0, v0

    :cond_1
    sget-wide v1, Li2/x;->n:J

    invoke-static {p0, v0}, Ly3/f;->b(FF)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {v1, v2, v1, v2}, Li2/x;->d(JJ)Z

    move-result p1

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    sget-object p0, Ll1/l3;->b:Landroidx/compose/material3/c;

    return-object p0

    :cond_2
    sget-object p0, Ll1/l3;->c:Landroidx/compose/material3/c;

    return-object p0

    :cond_3
    new-instance p1, Landroidx/compose/material3/c;

    invoke-direct {p1, p2, p0, v1, v2}, Landroidx/compose/material3/c;-><init>(ZFJ)V

    return-object p1
.end method
