.class public final Lwm1/a;
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
.field public static final a:Lwm1/a;

.field private static b:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lwm1/a;

    invoke-direct {v0}, Lwm1/a;-><init>()V

    sput-object v0, Lwm1/a;->a:Lwm1/a;

    new-instance v0, Lc41/c5;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lc41/c5;-><init>(I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, -0x35bf4ee3

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lwm1/a;->b:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lwm1/a;->c(Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    const-string p2, "$this$AnimatedVisibility"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 p0, 0x3f800000    # 1.0f

    sget-object p2, Lb2/t;->w:Lb2/t;

    invoke-static {p0, p2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float v1, v0, v0

    invoke-static {v1, p0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object v1, Ll0/m;->e:Ll0/h;

    sget-object v2, Lb2/e;->J:Lb2/l;

    const/4 v3, 0x6

    invoke-static {v1, v2, p1, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Lp1/q;

    iget-wide v4, v2, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {p1, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    iget-object v7, v2, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v7, v2, Lp1/q;->S:Z

    if-eqz v7, :cond_0

    invoke-virtual {v2, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_0
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p1, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {p1, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v2, Lp1/q;->S:Z

    if-nez v5, :cond_1

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    :cond_1
    invoke-static {v4, v2, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {p1, v1, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 p0, 0x12

    int-to-float p0, p0

    mul-float/2addr p0, v0

    const/4 v1, 0x3

    int-to-float v1, v1

    mul-float/2addr v1, v0

    invoke-static {p2, p0, v1}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0}, Lx81/d;->d()Lgz0/o0;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/o0;->h()Lgz0/u;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/u;->g()I

    move-result p0

    invoke-static {p0, p1, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v4

    const/16 v9, 0x61b0

    const/16 v10, 0x68

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v8, p1

    invoke-static/range {v4 .. v10}, Lpf/c;->d(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;Li2/p;Landroidx/compose/runtime/Composer;II)V

    const/4 p0, 0x1

    invoke-virtual {v2, p0}, Lp1/q;->q(Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation

    sget-object v0, Lwm1/a;->b:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method
