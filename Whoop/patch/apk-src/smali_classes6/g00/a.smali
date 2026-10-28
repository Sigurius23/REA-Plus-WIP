.class public abstract Lg00/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final b:J

.field public static final c:J

.field public static final d:J

.field public static final e:J

.field public static final f:J

.field public static final g:J

.field public static final h:J

.field public static final i:J

.field public static final j:J

.field public static final k:J

.field public static final l:J

.field public static final m:J

.field public static final n:J

.field public static final o:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, 0xff171717L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lg00/a;->a:J

    const-wide v0, 0xff262626L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lg00/a;->b:J

    const-wide v0, 0xff404040L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lg00/a;->c:J

    const-wide v0, 0xff707070L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lg00/a;->d:J

    const-wide v0, 0xffa3a3a3L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lg00/a;->e:J

    const-wide v0, 0xffd4d4d4L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lg00/a;->f:J

    const-wide v0, 0xffe5e5e5L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lg00/a;->g:J

    const-wide v0, 0xfff5f5f5L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lg00/a;->h:J

    const-wide v0, 0xffffffffL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lg00/a;->i:J

    const-wide v0, 0xff006635L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lg00/a;->j:J

    const-wide v0, 0xff00a355L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lg00/a;->k:J

    const-wide v0, 0xff00d66fL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lg00/a;->l:J

    const-wide v0, 0xffc0123cL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lg00/a;->m:J

    const-wide v0, 0xffe61947L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lg00/a;->n:J

    const-wide v0, 0xfffa4a67L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lg00/a;->o:J

    return-void
.end method

.method public static final a(Ld40/m;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 26

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v0, -0x3575a5a3    # -4533550.5f

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v2, p3, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_4

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object/from16 v12, p1

    move-object v10, v2

    goto/16 :goto_6

    :cond_4
    :goto_2
    if-eqz v0, :cond_5

    sget-object v0, Ld40/m;->x:Ld40/m;

    move-object v4, v0

    goto :goto_3

    :cond_5
    move-object v4, v2

    :goto_3
    sget-object v0, Ld40/q;->a:Ld40/n;

    invoke-static {v8}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v0

    iget-boolean v0, v0, Lg00/b;->a:Z

    if-eqz v0, :cond_6

    sget-object v0, Ld40/q;->b:Ld40/n;

    :goto_4
    move-object v9, v0

    goto :goto_5

    :cond_6
    sget-object v0, Ld40/q;->a:Ld40/n;

    goto :goto_4

    :goto_5
    invoke-static {v8}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v0

    iget-wide v10, v0, Lg00/b;->c:J

    invoke-static {v8}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v0

    iget-wide v5, v0, Lg00/b;->m:J

    invoke-static {v8}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v0

    iget-wide v12, v0, Lg00/b;->o:J

    invoke-static {v8}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v0

    iget-wide v14, v0, Lg00/b;->f:J

    invoke-static {v8}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v0

    iget-wide v1, v0, Lg00/b;->c:J

    iget-object v0, v9, Ld40/n;->i:Lg1/c1;

    invoke-static {v8}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v7

    move-object/from16 v16, v0

    move-wide/from16 v24, v1

    iget-wide v0, v7, Lg00/b;->g:J

    invoke-static {v8}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v2

    move-wide/from16 v17, v0

    iget-wide v0, v2, Lg00/b;->r:J

    const/16 v23, 0x1fbe

    const-wide/16 v19, 0x0

    move-wide/from16 v21, v0

    invoke-static/range {v16 .. v23}, Lg1/c1;->a(Lg1/c1;JJJI)Lg1/c1;

    move-result-object v0

    const-wide/16 v22, 0x0

    move-wide/from16 v20, v12

    move-wide/from16 v12, v24

    const/16 v25, 0xb0

    const-wide/16 v18, 0x0

    move-object/from16 v24, v0

    move-wide/from16 v16, v5

    invoke-static/range {v9 .. v25}, Ld40/n;->a(Ld40/n;JJJJJJJLg1/c1;I)Ld40/n;

    move-result-object v0

    sget-object v1, Ld40/q;->c:Ld40/o;

    iget v1, v1, Ld40/o;->c:F

    new-instance v2, Ld40/o;

    const/high16 v5, 0x41400000    # 12.0f

    const/high16 v6, 0x41c00000    # 24.0f

    invoke-direct {v2, v5, v6, v1}, Ld40/o;-><init>(FFF)V

    move-object v1, v2

    sget-object v2, Ld40/q;->d:Ld40/s;

    sget-object v5, Ld40/q;->p:Ld40/g;

    sget-object v6, Ld40/q;->r:Ld40/h;

    new-instance v7, Lb30/l4;

    move-object/from16 v12, p1

    const/4 v9, 0x4

    invoke-direct {v7, v12, v9}, Lb30/l4;-><init>(Lx1/b;I)V

    const v9, -0x5d9d808d

    invoke-static {v9, v8, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    shl-int/lit8 v3, v3, 0xc

    const v9, 0xe000

    and-int/2addr v3, v9

    const/high16 v9, 0xc00000

    or-int/2addr v9, v3

    const/4 v10, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v10}, Ld40/r;->a(Ld40/n;Ld40/o;Ld40/s;Ljava/lang/Float;Ld40/m;Ld40/g;Ld40/h;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v4

    :goto_6
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v9, Lfc0/e;

    const/4 v14, 0x3

    move/from16 v11, p3

    move/from16 v13, p4

    invoke-direct/range {v9 .. v14}, Lfc0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v9, v0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method
