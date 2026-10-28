.class public final Lzk2/b;
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
.field public static final a:Lzk2/b;

.field private static b:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation
.end field

.field private static c:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lzk2/b;

    invoke-direct {v0}, Lzk2/b;-><init>()V

    sput-object v0, Lzk2/b;->a:Lzk2/b;

    new-instance v0, Lzk2/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzk2/a;-><init>(I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, 0x6291f827

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lzk2/b;->b:Lkotlin/jvm/functions/Function3;

    new-instance v0, Lzk2/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lzk2/a;-><init>(I)V

    new-instance v1, Lx1/b;

    const v3, 0x3b934feb

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lzk2/b;->c:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzk2/b;->d(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzk2/b;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p0, p2, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p0, v0, :cond_0

    move p0, v1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    and-int/2addr p2, v1

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, p0}, Lp1/q;->U(IZ)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    move-object/from16 v0, p0

    const-string v1, "tagId"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_1

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p2, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x1

    if-eq v3, v4, :cond_2

    move v3, v5

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    and-int/2addr v1, v5

    move-object/from16 v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, " content placeholder"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    int-to-float v1, v2

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v28, 0x0

    const v29, 0x3fffc

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x30

    move-object/from16 v26, v4

    move-object v4, v0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_3
    move-object/from16 v26, v4

    invoke-virtual/range {v26 .. v26}, Lp1/q;->X()V

    :goto_3
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

    sget-object v0, Lzk2/b;->b:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method
