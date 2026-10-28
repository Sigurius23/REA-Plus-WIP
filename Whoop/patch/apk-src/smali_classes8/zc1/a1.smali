.class public final Lzc1/a1;
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
.field public static final a:Lzc1/a1;

.field private static b:Lc93/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/n;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lzc1/a1;

    invoke-direct {v0}, Lzc1/a1;-><init>()V

    sput-object v0, Lzc1/a1;->a:Lzc1/a1;

    new-instance v0, Ld30/c;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ld30/c;-><init>(I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, -0x2a4ffe9c    # -2.4190002E13f

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lzc1/a1;->b:Lc93/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzc1/a1;->c(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    const-string v0, "$this$items"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p0, p3, 0x30

    if-nez p0, :cond_1

    move-object p0, p2

    check-cast p0, Lp1/q;

    invoke-virtual {p0, p1}, Lp1/q;->e(I)Z

    move-result p0

    if-eqz p0, :cond_0

    const/16 p0, 0x20

    goto :goto_0

    :cond_0
    const/16 p0, 0x10

    :goto_0
    or-int/2addr p3, p0

    :cond_1
    and-int/lit16 p0, p3, 0x91

    const/16 v0, 0x90

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p0, v0, :cond_2

    move p0, v2

    goto :goto_1

    :cond_2
    move p0, v1

    :goto_1
    and-int/lit8 v0, p3, 0x1

    check-cast p2, Lp1/q;

    invoke-virtual {p2, v0, p0}, Lp1/q;->U(IZ)Z

    move-result p0

    if-eqz p0, :cond_4

    sget-object p0, Lb2/t;->w:Lb2/t;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 v0, 0x2

    int-to-float v3, v0

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    const/4 v5, 0x0

    invoke-static {p0, v3, v5, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    if-nez p1, :cond_3

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    double-to-float p0, v7

    :goto_2
    mul-float/2addr p0, v4

    move v8, p0

    goto :goto_3

    :cond_3
    int-to-float p0, v1

    goto :goto_2

    :goto_3
    int-to-float p0, v2

    mul-float v10, p0, v4

    const/4 v11, 0x5

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    shr-int/lit8 p3, p3, 0x3

    and-int/lit8 p3, p3, 0xe

    invoke-static {p1, p0, p2, p3, v1}, Lzc1/s0;->t(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b()Lc93/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/n;"
        }
    .end annotation

    sget-object v0, Lzc1/a1;->b:Lc93/n;

    return-object v0
.end method
