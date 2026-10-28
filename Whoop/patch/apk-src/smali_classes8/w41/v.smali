.class public final Lw41/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lw41/v;

.field private static b:Lc93/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/q;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lw41/v;

    invoke-direct {v0}, Lw41/v;-><init>()V

    sput-object v0, Lw41/v;->a:Lw41/v;

    new-instance v0, Lw41/u;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, 0x515f6d8b

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lw41/v;->b:Lc93/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZLp1/q;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lw41/v;->c(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    const-string v3, "mapState"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "modifier"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, p6, 0x6

    if-nez v3, :cond_1

    move-object v3, p5

    check-cast v3, Lp1/q;

    invoke-virtual {v3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, p6

    goto :goto_1

    :cond_1
    move v3, p6

    :goto_1
    and-int/lit8 v4, p6, 0x30

    if-nez v4, :cond_3

    move-object v4, p5

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit16 v4, p6, 0x180

    if-nez v4, :cond_5

    move-object v4, p5

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p2}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v3, v4

    :cond_5
    and-int/lit16 v4, p6, 0xc00

    if-nez v4, :cond_7

    move-object v4, p5

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v3, v4

    :cond_7
    and-int/lit16 v2, p6, 0x6000

    if-nez v2, :cond_9

    move-object v2, p5

    check-cast v2, Lp1/q;

    invoke-virtual {v2, p4}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_8

    const/16 v2, 0x4000

    goto :goto_5

    :cond_8
    const/16 v2, 0x2000

    :goto_5
    or-int/2addr v3, v2

    :cond_9
    const v2, 0x12493

    and-int/2addr v2, v3

    const v7, 0x12492

    if-eq v2, v7, :cond_a

    const/4 v2, 0x1

    goto :goto_6

    :cond_a
    const/4 v2, 0x0

    :goto_6
    and-int/lit8 v7, v3, 0x1

    move-object v8, p5

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v7, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_b

    const v2, 0xfffe

    and-int/2addr v2, v3

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move v4, p4

    move v6, v2

    move-object v5, v8

    move v2, p2

    invoke-static/range {v0 .. v7}, Lw41/k;->G(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZLandroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_b
    move-object v5, v8

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method


# virtual methods
.method public final b()Lc93/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/q;"
        }
    .end annotation

    sget-object v0, Lw41/v;->b:Lc93/q;

    return-object v0
.end method
