.class public final Lvn1/c;
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
.field public static final a:Lvn1/c;

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

    new-instance v0, Lvn1/c;

    invoke-direct {v0}, Lvn1/c;-><init>()V

    sput-object v0, Lvn1/c;->a:Lvn1/c;

    new-instance v0, Lvk1/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lvk1/a;-><init>(I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, -0x4cfc0e60

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lvn1/c;->b:Lc93/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lvn1/c;->e(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lvn1/c;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(F)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvn1/c;->g(F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

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

    move-object v10, p0

    check-cast v10, Lp1/q;

    invoke-virtual {v10, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p0

    if-eqz p0, :cond_3

    const/16 p0, 0xc

    int-to-float p0, p0

    const/4 p1, 0x4

    int-to-float p1, p1

    mul-float/2addr p0, p1

    sget-object p1, Lb2/t;->w:Lb2/t;

    invoke-static {p0, p1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget p0, Lgy0/e;->d:I

    invoke-static {p0}, Lv41/r0$d;->b(I)I

    move-result p0

    invoke-static {p0}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p0, p1, :cond_1

    new-instance p0, Lun1/f;

    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lun1/f;-><init>(I)V

    invoke-virtual {v10, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v6, p0

    check-cast v6, Lc93/a;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, p1, :cond_2

    new-instance p0, Lvb1/a;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lvb1/a;-><init>(I)V

    invoke-virtual {v10, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v7, p0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const v11, 0x1b0006

    const/16 v12, 0x19c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v12}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(F)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final d()Lc93/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/m;"
        }
    .end annotation

    sget-object v0, Lvn1/c;->b:Lc93/m;

    return-object v0
.end method
