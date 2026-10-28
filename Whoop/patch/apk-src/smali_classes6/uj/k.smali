.class public abstract Luj/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Luj/c;->F:Luj/c;

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Luj/k;->a:Lp1/u2;

    return-void
.end method

.method public static final a(Luj/m;ZLx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p3, Lp1/q;

    const v0, -0x5cd6b4f8

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    or-int/lit8 v0, v0, 0x10

    and-int/lit16 v0, v0, 0x2db

    const/16 v1, 0x92

    if-ne v0, v1, :cond_2

    invoke-virtual {p3}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_1
    move v4, p1

    goto :goto_6

    :cond_2
    :goto_2
    invoke-virtual {p3}, Lp1/q;->Z()V

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_4

    invoke-virtual {p3}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p3}, Lp1/q;->X()V

    goto :goto_4

    :cond_4
    :goto_3
    invoke-static {p3}, Ldc/a;->G(Landroidx/compose/runtime/Composer;)Z

    move-result p1

    :goto_4
    invoke-virtual {p3}, Lp1/q;->r()V

    if-nez p0, :cond_6

    if-eqz p1, :cond_5

    sget-object v0, Luj/m;->p0:Luj/m;

    goto :goto_5

    :cond_5
    sget-object v0, Luj/m;->o0:Luj/m;

    goto :goto_5

    :cond_6
    move-object v0, p0

    :goto_5
    sget-object v1, Luj/k;->a:Lp1/u2;

    invoke-virtual {v1, v0}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {v0, p2, p3, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :goto_6
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-nez p1, :cond_7

    return-void

    :cond_7
    new-instance v2, Lqj/a;

    const/4 v7, 0x2

    move-object v3, p0

    move-object v5, p2

    move v6, p4

    invoke-direct/range {v2 .. v7}, Lqj/a;-><init>(Ljava/lang/Object;ZLl83/e;II)V

    iput-object v2, p1, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final b(Landroid/app/Activity;)I
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    if-eqz p0, :cond_0

    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p0, p0, 0x30

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/16 v0, 0x20

    if-ne p0, v0, :cond_2

    const/4 p0, 0x2

    return p0

    :cond_2
    :goto_1
    const/4 p0, 0x1

    return p0
.end method
