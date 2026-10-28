.class public final enum Lcom/amplitude/android/engagement/types/DebugStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/amplitude/android/engagement/types/DebugStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0087\u0001\u0018\u0000 \u000c2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00088G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/amplitude/android/engagement/types/DebugStatus;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Lo2/e;",
        "getIcon",
        "(Landroidx/compose/runtime/Composer;I)Lo2/e;",
        "icon",
        "Li2/x;",
        "getColor",
        "(Landroidx/compose/runtime/Composer;I)J",
        "color",
        "Companion",
        "lj/h",
        "SUCCESS",
        "WARNING",
        "INFO",
        "ERROR",
        "engagement_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/amplitude/android/engagement/types/DebugStatus;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Llj/h;

.field public static final enum ERROR:Lcom/amplitude/android/engagement/types/DebugStatus;
    .annotation runtime Lwc3/h;
        value = "error"
    .end annotation
.end field

.field public static final enum INFO:Lcom/amplitude/android/engagement/types/DebugStatus;
    .annotation runtime Lwc3/h;
        value = "info"
    .end annotation
.end field

.field public static final enum SUCCESS:Lcom/amplitude/android/engagement/types/DebugStatus;
    .annotation runtime Lwc3/h;
        value = "success"
    .end annotation
.end field

.field public static final enum WARNING:Lcom/amplitude/android/engagement/types/DebugStatus;
    .annotation runtime Lwc3/h;
        value = "warning"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/amplitude/android/engagement/types/DebugStatus;
    .locals 4

    sget-object v0, Lcom/amplitude/android/engagement/types/DebugStatus;->SUCCESS:Lcom/amplitude/android/engagement/types/DebugStatus;

    sget-object v1, Lcom/amplitude/android/engagement/types/DebugStatus;->WARNING:Lcom/amplitude/android/engagement/types/DebugStatus;

    sget-object v2, Lcom/amplitude/android/engagement/types/DebugStatus;->INFO:Lcom/amplitude/android/engagement/types/DebugStatus;

    sget-object v3, Lcom/amplitude/android/engagement/types/DebugStatus;->ERROR:Lcom/amplitude/android/engagement/types/DebugStatus;

    filled-new-array {v0, v1, v2, v3}, [Lcom/amplitude/android/engagement/types/DebugStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/amplitude/android/engagement/types/DebugStatus;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/DebugStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/DebugStatus;->SUCCESS:Lcom/amplitude/android/engagement/types/DebugStatus;

    new-instance v0, Lcom/amplitude/android/engagement/types/DebugStatus;

    const-string v1, "WARNING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/DebugStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/DebugStatus;->WARNING:Lcom/amplitude/android/engagement/types/DebugStatus;

    new-instance v0, Lcom/amplitude/android/engagement/types/DebugStatus;

    const-string v1, "INFO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/DebugStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/DebugStatus;->INFO:Lcom/amplitude/android/engagement/types/DebugStatus;

    new-instance v0, Lcom/amplitude/android/engagement/types/DebugStatus;

    const-string v1, "ERROR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/DebugStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/DebugStatus;->ERROR:Lcom/amplitude/android/engagement/types/DebugStatus;

    invoke-static {}, Lcom/amplitude/android/engagement/types/DebugStatus;->$values()[Lcom/amplitude/android/engagement/types/DebugStatus;

    move-result-object v0

    sput-object v0, Lcom/amplitude/android/engagement/types/DebugStatus;->$VALUES:[Lcom/amplitude/android/engagement/types/DebugStatus;

    new-instance v0, Llj/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/DebugStatus;->Companion:Llj/h;

    sget-object v0, Ll83/i;->x:Ll83/i;

    sget-object v1, Llj/b;->F:Llj/b;

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/amplitude/android/engagement/types/DebugStatus;->$cachedSerializer$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/DebugStatus;->$cachedSerializer$delegate:Ll83/h;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amplitude/android/engagement/types/DebugStatus;
    .locals 1

    const-class v0, Lcom/amplitude/android/engagement/types/DebugStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amplitude/android/engagement/types/DebugStatus;

    return-object p0
.end method

.method public static values()[Lcom/amplitude/android/engagement/types/DebugStatus;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/DebugStatus;->$VALUES:[Lcom/amplitude/android/engagement/types/DebugStatus;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amplitude/android/engagement/types/DebugStatus;

    return-object v0
.end method


# virtual methods
.method public final getColor(Landroidx/compose/runtime/Composer;I)J
    .locals 2

    check-cast p1, Lp1/q;

    const p2, -0x717e996d

    invoke-virtual {p1, p2}, Lp1/q;->f0(I)V

    sget-object p2, Llj/i;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p2, p2, v0

    const/4 v0, 0x1

    if-eq p2, v0, :cond_3

    const/4 v0, 0x2

    if-eq p2, v0, :cond_2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    sget p2, Li2/x;->o:I

    sget-wide v0, Li2/x;->g:J

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget p2, Luj/g;->a:F

    sget-wide v0, Luj/g;->q:J

    goto :goto_0

    :cond_2
    sget p2, Luj/g;->a:F

    sget-wide v0, Luj/g;->n:J

    goto :goto_0

    :cond_3
    sget p2, Luj/g;->a:F

    sget-wide v0, Luj/g;->m:J

    :goto_0
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-wide v0
.end method

.method public final getIcon(Landroidx/compose/runtime/Composer;I)Lo2/e;
    .locals 25

    move-object/from16 v0, p1

    check-cast v0, Lp1/q;

    const v1, 0xbc46f28

    invoke-virtual {v0, v1}, Lp1/q;->f0(I)V

    sget-object v1, Llj/i;->a:[I

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x5

    const v4, 0x418c28f6    # 17.52f

    const/high16 v5, 0x41880000    # 17.0f

    const/high16 v6, -0x3ee00000    # -10.0f

    const v7, -0x3f70a3d7    # -4.48f

    const v8, 0x408f5c29    # 4.48f

    const/high16 v9, 0x41200000    # 10.0f

    const/high16 v10, 0x40000000    # 2.0f

    const/high16 v11, 0x41400000    # 12.0f

    if-eq v1, v2, :cond_5

    const/4 v2, 0x2

    const/high16 v12, 0x41500000    # 13.0f

    if-eq v1, v2, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    const/4 v2, 0x4

    if-ne v1, v2, :cond_1

    sget-object v1, Lbp/b;->z:Lo2/e;

    if-eqz v1, :cond_0

    goto/16 :goto_0

    :cond_0
    new-instance v14, Lo2/d;

    const/16 v22, 0x0

    const/16 v24, 0x60

    const-string v15, "Filled.Error"

    const/high16 v16, 0x41c00000    # 24.0f

    const/high16 v17, 0x41c00000    # 24.0f

    const/high16 v18, 0x41c00000    # 24.0f

    const/high16 v19, 0x41c00000    # 24.0f

    const-wide/16 v20, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v14 .. v24}, Lo2/d;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Lo2/f0;->a:I

    new-instance v1, Li2/c1;

    move-object v2, v14

    sget-wide v13, Li2/x;->b:J

    invoke-direct {v1, v13, v14}, Li2/c1;-><init>(J)V

    new-instance v15, Laa3/u0;

    invoke-direct {v15, v3}, Laa3/u0;-><init>(I)V

    iget-object v3, v15, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {v15, v11, v10}, Laa3/u0;->t(FF)V

    const/high16 v20, 0x40000000    # 2.0f

    const/high16 v21, 0x41400000    # 12.0f

    const v16, 0x40cf5c29    # 6.48f

    const/high16 v17, 0x40000000    # 2.0f

    const/high16 v18, 0x40000000    # 2.0f

    const v19, 0x40cf5c29    # 6.48f

    invoke-virtual/range {v15 .. v21}, Laa3/u0;->j(FFFFFF)V

    invoke-virtual {v15, v8, v9, v9, v9}, Laa3/u0;->u(FFFF)V

    invoke-virtual {v15, v9, v7, v9, v6}, Laa3/u0;->u(FFFF)V

    new-instance v6, Lo2/o;

    invoke-direct {v6, v4, v10, v11, v10}, Lo2/o;-><init>(FFFF)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v15}, Laa3/u0;->i()V

    invoke-virtual {v15, v12, v5}, Laa3/u0;->t(FF)V

    const/high16 v4, -0x40000000    # -2.0f

    invoke-virtual {v15, v4}, Laa3/u0;->q(F)V

    invoke-virtual {v15, v4}, Laa3/u0;->v(F)V

    invoke-virtual {v15, v10}, Laa3/u0;->q(F)V

    invoke-virtual {v15, v10}, Laa3/u0;->v(F)V

    invoke-virtual {v15}, Laa3/u0;->i()V

    invoke-virtual {v15, v12, v12}, Laa3/u0;->t(FF)V

    invoke-virtual {v15, v4}, Laa3/u0;->q(F)V

    const/high16 v4, 0x41300000    # 11.0f

    const/high16 v5, 0x40e00000    # 7.0f

    invoke-virtual {v15, v4, v5}, Laa3/u0;->r(FF)V

    invoke-virtual {v15, v10}, Laa3/u0;->q(F)V

    const/high16 v4, 0x40c00000    # 6.0f

    invoke-virtual {v15, v4}, Laa3/u0;->v(F)V

    invoke-virtual {v15}, Laa3/u0;->i()V

    move-object v14, v2

    invoke-static {v14, v3, v1}, Lo2/d;->a(Lo2/d;Ljava/util/ArrayList;Li2/c1;)V

    invoke-virtual {v14}, Lo2/d;->b()Lo2/e;

    move-result-object v1

    sput-object v1, Lbp/b;->z:Lo2/e;

    goto/16 :goto_0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    invoke-static {}, Lcom/squareup/wire/n;->H()Lo2/e;

    move-result-object v1

    goto/16 :goto_0

    :cond_3
    sget-object v1, Lio/sentry/config/a;->a:Lo2/e;

    if-eqz v1, :cond_4

    goto/16 :goto_0

    :cond_4
    new-instance v13, Lo2/d;

    const/16 v21, 0x0

    const/16 v23, 0x60

    const-string v14, "Filled.Warning"

    const/high16 v15, 0x41c00000    # 24.0f

    const/high16 v16, 0x41c00000    # 24.0f

    const/high16 v17, 0x41c00000    # 24.0f

    const/high16 v18, 0x41c00000    # 24.0f

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v13 .. v23}, Lo2/d;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Lo2/f0;->a:I

    new-instance v1, Li2/c1;

    sget-wide v4, Li2/x;->b:J

    invoke-direct {v1, v4, v5}, Li2/c1;-><init>(J)V

    new-instance v2, Laa3/u0;

    invoke-direct {v2, v3}, Laa3/u0;-><init>(I)V

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x41a80000    # 21.0f

    invoke-virtual {v2, v3, v4}, Laa3/u0;->t(FF)V

    const/high16 v5, 0x41b00000    # 22.0f

    invoke-virtual {v2, v5}, Laa3/u0;->q(F)V

    invoke-virtual {v2, v11, v10}, Laa3/u0;->r(FF)V

    invoke-virtual {v2, v3, v4}, Laa3/u0;->r(FF)V

    invoke-virtual {v2}, Laa3/u0;->i()V

    const/high16 v3, 0x41900000    # 18.0f

    invoke-virtual {v2, v12, v3}, Laa3/u0;->t(FF)V

    const/high16 v4, -0x40000000    # -2.0f

    invoke-virtual {v2, v4}, Laa3/u0;->q(F)V

    invoke-virtual {v2, v4}, Laa3/u0;->v(F)V

    invoke-virtual {v2, v10}, Laa3/u0;->q(F)V

    invoke-virtual {v2, v10}, Laa3/u0;->v(F)V

    invoke-virtual {v2}, Laa3/u0;->i()V

    const/high16 v3, 0x41600000    # 14.0f

    invoke-virtual {v2, v12, v3}, Laa3/u0;->t(FF)V

    invoke-virtual {v2, v4}, Laa3/u0;->q(F)V

    const/high16 v3, -0x3f800000    # -4.0f

    invoke-virtual {v2, v3}, Laa3/u0;->v(F)V

    invoke-virtual {v2, v10}, Laa3/u0;->q(F)V

    const/high16 v3, 0x40800000    # 4.0f

    invoke-virtual {v2, v3}, Laa3/u0;->v(F)V

    invoke-virtual {v2}, Laa3/u0;->i()V

    iget-object v2, v2, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-static {v13, v2, v1}, Lo2/d;->a(Lo2/d;Ljava/util/ArrayList;Li2/c1;)V

    invoke-virtual {v13}, Lo2/d;->b()Lo2/e;

    move-result-object v1

    sput-object v1, Lio/sentry/config/a;->a:Lo2/e;

    goto/16 :goto_0

    :cond_5
    sget-object v1, Lx30/s0;->a:Lo2/e;

    if-eqz v1, :cond_6

    goto/16 :goto_0

    :cond_6
    new-instance v12, Lo2/d;

    const/16 v20, 0x0

    const/16 v22, 0x60

    const-string v13, "Filled.CheckCircle"

    const/high16 v14, 0x41c00000    # 24.0f

    const/high16 v15, 0x41c00000    # 24.0f

    const/high16 v16, 0x41c00000    # 24.0f

    const/high16 v17, 0x41c00000    # 24.0f

    const-wide/16 v18, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v12 .. v22}, Lo2/d;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Lo2/f0;->a:I

    new-instance v1, Li2/c1;

    sget-wide v13, Li2/x;->b:J

    invoke-direct {v1, v13, v14}, Li2/c1;-><init>(J)V

    new-instance v15, Laa3/u0;

    invoke-direct {v15, v3}, Laa3/u0;-><init>(I)V

    iget-object v2, v15, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {v15, v11, v10}, Laa3/u0;->t(FF)V

    const/high16 v20, 0x40000000    # 2.0f

    const/high16 v21, 0x41400000    # 12.0f

    const v16, 0x40cf5c29    # 6.48f

    const/high16 v17, 0x40000000    # 2.0f

    const/high16 v18, 0x40000000    # 2.0f

    const v19, 0x40cf5c29    # 6.48f

    invoke-virtual/range {v15 .. v21}, Laa3/u0;->j(FFFFFF)V

    invoke-virtual {v15, v8, v9, v9, v9}, Laa3/u0;->u(FFFF)V

    invoke-virtual {v15, v9, v7, v9, v6}, Laa3/u0;->u(FFFF)V

    new-instance v3, Lo2/o;

    invoke-direct {v3, v4, v10, v11, v10}, Lo2/o;-><init>(FFFF)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v15}, Laa3/u0;->i()V

    invoke-virtual {v15, v9, v5}, Laa3/u0;->t(FF)V

    const/high16 v3, -0x3f600000    # -5.0f

    invoke-virtual {v15, v3, v3}, Laa3/u0;->s(FF)V

    const v3, 0x3fb47ae1    # 1.41f

    const v4, -0x404b851f    # -1.41f

    invoke-virtual {v15, v3, v4}, Laa3/u0;->s(FF)V

    const v3, 0x4162b852    # 14.17f

    invoke-virtual {v15, v9, v3}, Laa3/u0;->r(FF)V

    const v3, 0x40f2e148    # 7.59f

    const v4, -0x3f0d1eb8    # -7.59f

    invoke-virtual {v15, v3, v4}, Laa3/u0;->s(FF)V

    const/high16 v3, 0x41980000    # 19.0f

    const/high16 v4, 0x41000000    # 8.0f

    invoke-virtual {v15, v3, v4}, Laa3/u0;->r(FF)V

    const/high16 v3, -0x3ef00000    # -9.0f

    const/high16 v4, 0x41100000    # 9.0f

    invoke-virtual {v15, v3, v4}, Laa3/u0;->s(FF)V

    invoke-virtual {v15}, Laa3/u0;->i()V

    invoke-static {v12, v2, v1}, Lo2/d;->a(Lo2/d;Ljava/util/ArrayList;Li2/c1;)V

    invoke-virtual {v12}, Lo2/d;->b()Lo2/e;

    move-result-object v1

    sput-object v1, Lx30/s0;->a:Lo2/e;

    :goto_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    return-object v1
.end method
