.class public final La81/b;
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
.field public static final a:La81/b;

.field private static b:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, La81/b;

    invoke-direct {v0}, La81/b;-><init>()V

    sput-object v0, La81/b;->a:La81/b;

    new-instance v0, Ln;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ln;-><init>(I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, -0x750f93d1

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, La81/b;->b:Lc93/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, La81/b;->c(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p1, v2

    move-object v6, p0

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lgz0/m0;->TINY_CROSS:Lgz0/m0;

    invoke-virtual {p0}, Lgz0/m0;->toWhoopIcon()I

    move-result p0

    const/4 p1, 0x6

    invoke-static {p0, v6, p1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v1

    sget p0, Lgy0/f;->b0:I

    invoke-static {v6, p0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p1, Lx81/d;->b:I

    invoke-virtual {p0, v6, p1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->y()J

    move-result-wide v4

    const/4 p0, 0x4

    int-to-float p0, p0

    mul-float/2addr p0, p0

    sget-object p1, Lb2/t;->w:Lb2/t;

    invoke-static {p0, p1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v7, 0x180

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b()Lc93/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/m;"
        }
    .end annotation

    sget-object v0, La81/b;->b:Lc93/m;

    return-object v0
.end method
