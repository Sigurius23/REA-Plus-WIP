.class public final Lyf1/b;
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
.field public static final a:Lyf1/b;

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

    new-instance v0, Lyf1/b;

    invoke-direct {v0}, Lyf1/b;-><init>()V

    sput-object v0, Lyf1/b;->a:Lyf1/b;

    new-instance v0, Lvx0/a;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lvx0/a;-><init>(I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, 0x2ce603fa

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lyf1/b;->b:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lyf1/b;->d(Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lyf1/b;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method private static final d(Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    const-string p2, "$this$AnimatedVisibility"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p0, 0x8

    int-to-float p0, p0

    const/4 p2, 0x4

    int-to-float p2, p2

    mul-float/2addr p0, p2

    sget-object p2, Lb2/t;->w:Lb2/t;

    invoke-static {p0, p2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget p0, Lgy0/e;->d:I

    invoke-static {p0}, Lv41/r0$d;->b(I)I

    move-result p0

    invoke-static {p0}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v1

    move-object v9, p1

    check-cast v9, Lp1/q;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p0, p1, :cond_0

    new-instance p0, Lyc2/a;

    const/4 p1, 0x6

    invoke-direct {p0, p1}, Lyc2/a;-><init>(I)V

    invoke-virtual {v9, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    move-object v5, p0

    check-cast v5, Lc93/a;

    const v10, 0x30006

    const/16 v11, 0x1dc

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v11}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method


# virtual methods
.method public final c()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation

    sget-object v0, Lyf1/b;->b:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method
