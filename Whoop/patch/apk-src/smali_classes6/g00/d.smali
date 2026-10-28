.class public abstract Lg00/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg00/b;

.field public static final b:Lg00/b;


# direct methods
.method static constructor <clinit>()V
    .locals 56

    sget-wide v16, Lg00/a;->i:J

    sget-wide v4, Lg00/a;->h:J

    sget-wide v6, Lg00/a;->g:J

    sget-wide v2, Lg00/a;->a:J

    sget-wide v10, Lg00/a;->f:J

    sget-wide v14, Lg00/a;->n:J

    sget-wide v20, Lg00/a;->l:J

    sget-wide v26, Lg00/a;->c:J

    sget-wide v42, Lg00/a;->d:J

    sget-wide v32, Lg00/a;->j:J

    sget-wide v34, Lg00/a;->m:J

    const/4 v0, 0x0

    const v1, 0x3e4ccccd    # 0.2f

    const/16 v8, 0x10

    invoke-static {v0, v0, v0, v1, v8}, Li2/w0;->f(FFFFI)J

    move-result-wide v52

    new-instance v0, Lg00/b;

    move v9, v1

    const/4 v1, 0x0

    move-wide v12, v2

    move/from16 v19, v8

    move/from16 v18, v9

    move-wide v8, v2

    move-wide/from16 v2, v16

    move-wide/from16 v16, v8

    move/from16 v22, v18

    move/from16 v23, v19

    move-wide/from16 v18, v2

    move/from16 v24, v22

    move/from16 v25, v23

    move-wide/from16 v22, v14

    move/from16 v28, v24

    move/from16 v29, v25

    move-wide/from16 v24, v8

    move-wide/from16 v30, v2

    move-wide/from16 v36, v2

    move-wide/from16 v38, v8

    move-wide/from16 v40, v8

    move/from16 v44, v28

    move/from16 v45, v29

    move-wide/from16 v28, v42

    move-wide/from16 v42, v26

    move/from16 v46, v44

    move/from16 v47, v45

    move-wide/from16 v44, v28

    move/from16 v48, v46

    move/from16 v49, v47

    move-wide/from16 v46, v2

    move/from16 v50, v48

    move/from16 v51, v49

    move-wide/from16 v48, v20

    move/from16 v54, v50

    move/from16 v55, v51

    move-wide/from16 v50, v14

    invoke-direct/range {v0 .. v53}, Lg00/b;-><init>(ZJJJJJJJJJJJJJJJJJJJJJJJJJJ)V

    move-wide/from16 v6, v26

    sput-object v0, Lg00/d;->a:Lg00/b;

    new-instance v0, Lg00/b;

    move-wide/from16 v40, v4

    sget-wide v4, Lg00/a;->b:J

    move-wide/from16 v42, v28

    sget-wide v28, Lg00/a;->e:J

    move-wide/from16 v22, v34

    sget-wide v34, Lg00/a;->o:J

    const/high16 v1, 0x3f800000    # 1.0f

    const v12, 0x3e4ccccd    # 0.2f

    const/16 v13, 0x10

    invoke-static {v1, v1, v1, v12, v13}, Li2/w0;->f(FFFFI)J

    move-result-wide v52

    const/4 v1, 0x1

    move-wide/from16 v16, v2

    move-wide v2, v8

    move-wide/from16 v26, v10

    move-wide v10, v2

    move-wide/from16 v18, v4

    move-wide/from16 v12, v20

    move-wide/from16 v24, v16

    move-wide/from16 v30, v16

    move-wide/from16 v32, v12

    move-wide/from16 v36, v2

    move-wide/from16 v38, v2

    move-wide/from16 v44, v42

    move-wide/from16 v46, v16

    move-wide/from16 v48, v12

    invoke-direct/range {v0 .. v53}, Lg00/b;-><init>(ZJJJJJJJJJJJJJJJJJJJJJJJJJJ)V

    sput-object v0, Lg00/d;->b:Lg00/b;

    return-void
.end method
