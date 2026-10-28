.class public abstract Landroidx/compose/animation/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/high16 v0, -0x80000000

    int-to-long v0, v0

    const/16 v2, 0x20

    shl-long v2, v0, v2

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    sput-wide v0, Landroidx/compose/animation/c;->a:J

    return-void
.end method

.method public static a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;
    .locals 5

    const/4 v0, 0x1

    and-int/2addr p2, v0

    if-eqz p2, :cond_0

    int-to-long p1, v0

    const/16 v1, 0x20

    shl-long v1, p1, v1

    const-wide v3, 0xffffffffL

    and-long/2addr p1, v3

    or-long/2addr p1, v1

    new-instance v1, Ly3/l;

    invoke-direct {v1, p1, p2}, Ly3/l;-><init>(J)V

    const/4 p1, 0x0

    const/high16 p2, 0x43c80000    # 400.0f

    invoke-static {p1, p2, v0, v1}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p1

    :cond_0
    invoke-static {p0}, Lwb3/f;->s(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    new-instance p2, Landroidx/compose/animation/SizeAnimationModifierElement;

    invoke-direct {p2, p1}, Landroidx/compose/animation/SizeAnimationModifierElement;-><init>(Ld0/c0;)V

    invoke-interface {p0, p2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
