.class public final Lno0/s0;
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
.field public static final a:Lno0/s0;

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

    new-instance v0, Lno0/s0;

    invoke-direct {v0}, Lno0/s0;-><init>()V

    sput-object v0, Lno0/s0;->a:Lno0/s0;

    new-instance v0, Lno0/r0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lno0/r0;-><init>(I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, 0x51542e98

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lno0/s0;->b:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lno0/s0;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 26

    move-object/from16 v0, p0

    const-string v1, "label"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p2, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p2, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p2

    :goto_1
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-eq v2, v3, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    and-int/lit8 v4, v1, 0x1

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v4, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v2, v5, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    invoke-virtual {v2, v5, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    and-int/lit8 v23, v1, 0xe

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v24, v1, 0x12

    const v25, 0x2fffa

    const/4 v1, 0x0

    move-object/from16 v22, v5

    const-wide/16 v4, 0x0

    move-wide v2, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_3
    move-object/from16 v22, v5

    invoke-virtual/range {v22 .. v22}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
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

    sget-object v0, Lno0/s0;->b:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method
