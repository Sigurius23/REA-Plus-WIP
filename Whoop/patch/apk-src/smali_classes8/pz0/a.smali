.class final Lpz0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lpz0/a;",
        "",
        "<init>",
        "()V",
        "Li2/x;",
        "trackColor",
        "",
        "trackAlpha",
        "background",
        "Lg1/o7;",
        "a",
        "(JFJLandroidx/compose/runtime/Composer;I)Lg1/o7;",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lpz0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpz0/a;

    invoke-direct {v0}, Lpz0/a;-><init>()V

    sput-object v0, Lpz0/a;->a:Lpz0/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JFJLandroidx/compose/runtime/Composer;I)Lg1/o7;
    .locals 21

    move-wide/from16 v3, p1

    move-wide/from16 v0, p4

    move-object/from16 v2, p6

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v5, v2, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    invoke-virtual {v5, v2, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->G()J

    move-result-wide v9

    invoke-virtual {v5, v2, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    const v13, 0x3e4ccccd    # 0.2f

    invoke-static {v13, v11, v12}, Li2/x;->c(FJ)J

    move-result-wide v11

    invoke-static {v11, v12, v0, v1}, Li2/w0;->p(JJ)J

    move-result-wide v11

    invoke-static {v13, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v14

    invoke-static {v14, v15, v0, v1}, Li2/w0;->p(JJ)J

    move-result-wide v14

    invoke-virtual {v5, v2, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->G()J

    move-result-wide v5

    invoke-static {v13, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v5

    invoke-static {v5, v6, v0, v1}, Li2/w0;->p(JJ)J

    move-result-wide v5

    move-wide/from16 v16, v5

    invoke-static {v13, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v5

    invoke-static {v5, v6, v0, v1}, Li2/w0;->p(JJ)J

    move-result-wide v0

    const/16 v20, 0x0

    move-wide v13, v14

    move-wide/from16 v15, v16

    move-wide/from16 v17, v0

    move-wide v1, v7

    move-wide v6, v9

    move-wide/from16 v8, p1

    move/from16 v10, p3

    move/from16 v5, p3

    move-object/from16 v19, p6

    invoke-static/range {v1 .. v20}, Ltx/f;->A(JJFJJFJJJJLandroidx/compose/runtime/Composer;I)Lg1/x1;

    move-result-object v0

    return-object v0
.end method
