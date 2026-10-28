.class public final Ll1/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll1/j1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll1/j1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll1/j1;->a:Ll1/j1;

    return-void
.end method


# virtual methods
.method public final a(La00/g;Landroidx/compose/runtime/Composer;I)V
    .locals 4

    check-cast p2, Lp1/q;

    const v0, 0x5d549e6c

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p3

    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x1

    if-eq v2, v1, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    and-int/2addr v0, v3

    invoke-virtual {p2, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p1, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p1, La00/g;->z:Ljava/lang/Object;

    check-cast v1, Lc4/a0;

    new-instance v2, Lay/n;

    const/4 v3, 0x6

    invoke-direct {v2, p1, v3}, Lay/n;-><init>(Ljava/lang/Object;I)V

    const v3, 0x455a0383

    invoke-static {v3, p2, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v3, 0x180

    invoke-static {v0, v1, v2, p2, v3}, Lse/b;->d(Lc93/a;Lc4/a0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_3

    new-instance v0, Lj21/d;

    const/16 v1, 0x8

    invoke-direct {v0, p0, p1, p3, v1}, Lj21/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method
