.class public abstract Lg00/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg00/e;


# direct methods
.method static constructor <clinit>()V
    .locals 34

    new-instance v0, Lg00/e;

    sget-object v6, Lp3/r;->H:Lp3/r;

    const/16 v17, 0x18

    invoke-static/range {v17 .. v17}, Lv63/c;->h(I)J

    move-result-wide v4

    const/16 v1, 0x20

    invoke-static {v1}, Lv63/c;->h(I)J

    move-result-wide v14

    new-instance v1, Ll3/v0;

    const/4 v13, 0x0

    const v16, 0xfdffd9

    const-wide/16 v2, 0x0

    const/4 v7, 0x0

    sget-object v25, Lp3/i;->w:Lp3/f;

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v8, v25

    invoke-direct/range {v1 .. v16}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    invoke-static {v1}, Lg00/h;->a(Ll3/v0;)Ll3/v0;

    move-result-object v1

    sget-object v23, Lp3/r;->F:Lp3/r;

    const/16 v2, 0x10

    invoke-static {v2}, Lv63/c;->h(I)J

    move-result-wide v21

    invoke-static/range {v17 .. v17}, Lv63/c;->h(I)J

    move-result-wide v31

    new-instance v18, Ll3/v0;

    const/16 v30, 0x0

    const v33, 0xfdffd9

    const-wide/16 v19, 0x0

    const/16 v24, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v18 .. v33}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v3, v23

    invoke-static/range {v18 .. v18}, Lg00/h;->a(Ll3/v0;)Ll3/v0;

    move-result-object v4

    sget-object v23, Lp3/r;->G:Lp3/r;

    invoke-static {v2}, Lv63/c;->h(I)J

    move-result-wide v21

    invoke-static/range {v17 .. v17}, Lv63/c;->h(I)J

    move-result-wide v31

    new-instance v18, Ll3/v0;

    invoke-direct/range {v18 .. v33}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v2, v23

    invoke-static/range {v18 .. v18}, Lg00/h;->a(Ll3/v0;)Ll3/v0;

    move-result-object v5

    const/16 v6, 0xe

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v21

    const/16 v7, 0x14

    invoke-static {v7}, Lv63/c;->h(I)J

    move-result-wide v31

    new-instance v18, Ll3/v0;

    move-object/from16 v23, v3

    invoke-direct/range {v18 .. v33}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    invoke-static/range {v18 .. v18}, Lg00/h;->a(Ll3/v0;)Ll3/v0;

    move-result-object v8

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v21

    invoke-static {v7}, Lv63/c;->h(I)J

    move-result-wide v31

    new-instance v18, Ll3/v0;

    move-object/from16 v23, v2

    invoke-direct/range {v18 .. v33}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    invoke-static/range {v18 .. v18}, Lg00/h;->a(Ll3/v0;)Ll3/v0;

    move-result-object v6

    const/16 v7, 0xc

    invoke-static {v7}, Lv63/c;->h(I)J

    move-result-wide v21

    const/16 v9, 0x12

    invoke-static {v9}, Lv63/c;->h(I)J

    move-result-wide v31

    new-instance v18, Ll3/v0;

    move-object/from16 v23, v3

    invoke-direct/range {v18 .. v33}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    invoke-static/range {v18 .. v18}, Lg00/h;->a(Ll3/v0;)Ll3/v0;

    move-result-object v3

    invoke-static {v7}, Lv63/c;->h(I)J

    move-result-wide v21

    invoke-static {v9}, Lv63/c;->h(I)J

    move-result-wide v31

    new-instance v18, Ll3/v0;

    move-object/from16 v23, v2

    invoke-direct/range {v18 .. v33}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    invoke-static/range {v18 .. v18}, Lg00/h;->a(Ll3/v0;)Ll3/v0;

    move-result-object v7

    move-object v2, v6

    move-object v6, v3

    move-object v3, v5

    move-object v5, v2

    move-object v2, v4

    move-object v4, v8

    invoke-direct/range {v0 .. v7}, Lg00/e;-><init>(Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;)V

    sput-object v0, Lg00/h;->a:Lg00/e;

    return-void
.end method

.method public static a(Ll3/v0;)Ll3/v0;
    .locals 15

    iget-object v1, p0, Ll3/v0;->b:Ll3/b0;

    iget-wide v10, v1, Ll3/b0;->c:J

    sget-object v1, Ll3/v0;->d:Ll3/v0;

    iget-object v1, v1, Ll3/v0;->b:Ll3/b0;

    iget-object v13, v1, Ll3/b0;->f:Lw3/i;

    new-instance v12, Ll3/g0;

    const/4 v1, 0x1

    invoke-direct {v12, v1}, Ll3/g0;-><init>(Z)V

    const/4 v9, 0x0

    const v14, 0xe5ffff

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v14}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v0

    return-object v0
.end method
