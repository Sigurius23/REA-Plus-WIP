.class public final Lsl0/n1;
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
.field public static final a:Lsl0/n1;

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

    new-instance v0, Lsl0/n1;

    invoke-direct {v0}, Lsl0/n1;-><init>()V

    sput-object v0, Lsl0/n1;->a:Lsl0/n1;

    new-instance v0, Lre1/a;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lre1/a;-><init>(I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, 0x636ce8c2

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lsl0/n1;->b:Lc93/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/n1;->c(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p1, v3

    move-object v8, p0

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p1, Lx81/d;->b:I

    invoke-virtual {p0, v8, p1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v0

    sget-object v3, Lt0/j;->a:Lt0/i;

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v0, v1, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x5

    int-to-float v1, v1

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v1, v3

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {p0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/a;->p()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v8, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    sget v0, Lwk0/b;->x0:I

    invoke-static {v0, v8, v2}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v8, p1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->u()J

    move-result-wide v6

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->X()V

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

    sget-object v0, Lsl0/n1;->b:Lc93/m;

    return-object v0
.end method
