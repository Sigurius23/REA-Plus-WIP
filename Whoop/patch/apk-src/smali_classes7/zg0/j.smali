.class public abstract Lzg0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Liz0/m;",
        "a",
        "Liz0/m;",
        "whoopMarkdownStylesDefault",
        "bot_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Liz0/m;


# direct methods
.method static constructor <clinit>()V
    .locals 24

    new-instance v0, Liz0/m;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->a()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v2

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->k0()J

    move-result-wide v4

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->X()J

    move-result-wide v6

    sget-object v8, Lp3/r;->x:Lp3/r;

    sget-object v8, Lp3/r;->I:Lp3/r;

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v12

    new-instance v14, Liz0/a;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->N()Lb91/a;

    move-result-object v11

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->O()Lb91/a;

    move-result-object v15

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v16

    move-object/from16 v17, v0

    invoke-virtual/range {v16 .. v16}, Lb91/d;->P()Lb91/a;

    move-result-object v0

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v16

    move-object/from16 v18, v1

    invoke-virtual/range {v16 .. v16}, Lb91/d;->Q()Lb91/a;

    move-result-object v1

    invoke-direct {v14, v11, v15, v0, v1}, Liz0/a;-><init>(Lb91/a;Lb91/a;Lb91/a;Lb91/a;)V

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v15

    const/4 v0, 0x0

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v1, v0

    const/4 v11, 0x4

    int-to-float v11, v11

    mul-float/2addr v0, v11

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/4 v11, 0x1

    const/16 v19, 0x0

    move/from16 v21, v1

    move-object/from16 v23, v18

    move/from16 v18, v0

    move-object/from16 v0, v17

    move/from16 v17, v1

    move-object/from16 v1, v23

    invoke-direct/range {v0 .. v22}, Liz0/m;-><init>(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzg0/j;->a:Liz0/m;

    return-void
.end method

.method public static final synthetic a()Liz0/m;
    .locals 1

    sget-object v0, Lzg0/j;->a:Liz0/m;

    return-object v0
.end method
