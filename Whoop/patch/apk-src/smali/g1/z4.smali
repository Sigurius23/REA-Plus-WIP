.class public abstract Lg1/z4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;

.field public static final b:Landroidx/compose/material/d;

.field public static final c:Landroidx/compose/material/d;

.field public static final d:Lk1/b;

.field public static final e:Lk1/b;

.field public static final f:Lk1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lep0/a;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lep0/a;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lg1/z4;->a:Lp1/b0;

    new-instance v0, Landroidx/compose/material/d;

    sget-wide v1, Li2/x;->n:J

    const/4 v3, 0x1

    const/high16 v4, 0x7fc00000    # Float.NaN

    invoke-direct {v0, v3, v4, v1, v2}, Landroidx/compose/material/d;-><init>(ZFJ)V

    sput-object v0, Lg1/z4;->b:Landroidx/compose/material/d;

    new-instance v0, Landroidx/compose/material/d;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Landroidx/compose/material/d;-><init>(ZFJ)V

    sput-object v0, Lg1/z4;->c:Landroidx/compose/material/d;

    new-instance v0, Lk1/b;

    const v1, 0x3e23d70a    # 0.16f

    const v2, 0x3e75c28f    # 0.24f

    const v3, 0x3da3d70a    # 0.08f

    invoke-direct {v0, v1, v2, v3, v2}, Lk1/b;-><init>(FFFF)V

    sput-object v0, Lg1/z4;->d:Lk1/b;

    new-instance v0, Lk1/b;

    const v1, 0x3df5c28f    # 0.12f

    const v2, 0x3d23d70a    # 0.04f

    invoke-direct {v0, v3, v1, v2, v1}, Lk1/b;-><init>(FFFF)V

    sput-object v0, Lg1/z4;->e:Lk1/b;

    new-instance v0, Lk1/b;

    const v4, 0x3dcccccd    # 0.1f

    invoke-direct {v0, v3, v1, v2, v4}, Lk1/b;-><init>(FFFF)V

    sput-object v0, Lg1/z4;->f:Lk1/b;

    return-void
.end method

.method public static a(JIZF)Landroidx/compose/material/d;
    .locals 2

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    const/4 p3, 0x1

    :cond_0
    and-int/lit8 v0, p2, 0x2

    const/high16 v1, 0x7fc00000    # Float.NaN

    if-eqz v0, :cond_1

    move p4, v1

    :cond_1
    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_2

    sget-wide p0, Li2/x;->n:J

    :cond_2
    invoke-static {p4, v1}, Ly3/f;->b(FF)Z

    move-result p2

    if-eqz p2, :cond_4

    sget-wide v0, Li2/x;->n:J

    invoke-static {p0, p1, v0, v1}, Li2/x;->d(JJ)Z

    move-result p2

    if-eqz p2, :cond_4

    if-eqz p3, :cond_3

    sget-object p0, Lg1/z4;->b:Landroidx/compose/material/d;

    return-object p0

    :cond_3
    sget-object p0, Lg1/z4;->c:Landroidx/compose/material/d;

    return-object p0

    :cond_4
    new-instance p2, Landroidx/compose/material/d;

    invoke-direct {p2, p3, p4, p0, p1}, Landroidx/compose/material/d;-><init>(ZFJ)V

    return-object p2
.end method
