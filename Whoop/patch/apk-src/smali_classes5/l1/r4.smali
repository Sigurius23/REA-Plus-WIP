.class public abstract Ll1/r4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x10

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v0, v1}, Lvf3/b;->a(FF)J

    const/16 v0, 0xc8

    int-to-float v0, v0

    sput v0, Ll1/r4;->a:F

    return-void
.end method

.method public static a(Landroidx/compose/runtime/Composer;)Ll1/v4;
    .locals 3

    sget v0, Ll1/u4;->a:F

    sget-object v1, Lb3/v1;->h:Lp1/u2;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/c;

    invoke-interface {v1, v0}, Ly3/c;->F(F)I

    move-result v0

    invoke-virtual {p0, v0}, Lp1/q;->e(I)Z

    move-result v1

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_1

    :cond_0
    new-instance v2, Ll1/v4;

    invoke-direct {v2, v0}, Ll1/v4;-><init>(I)V

    invoke-virtual {p0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v2, Ll1/v4;

    return-object v2
.end method
