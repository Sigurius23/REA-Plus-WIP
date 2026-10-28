.class public abstract Lb91/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\"\u0017\u0010\u0011\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u00128@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00128@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "Ll3/v0;",
        "Li2/x;",
        "color",
        "Ll3/m0;",
        "f",
        "(Ll3/v0;JLandroidx/compose/runtime/Composer;I)Ll3/m0;",
        "Lkotlin/Function1;",
        "Lkd1/g;",
        "Lb91/a;",
        "Lb91/d;",
        "block",
        "g",
        "(Lkotlin/jvm/functions/Function1;)Lb91/d;",
        "a",
        "Lb91/d;",
        "e",
        "()Lb91/d;",
        "TextStyles",
        "Lp3/i;",
        "c",
        "()Lp3/i;",
        "dinpro",
        "d",
        "proximaNova",
        "design_release"
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
.field private static final a:Lb91/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La11/g;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, La11/g;-><init>(I)V

    invoke-static {v0}, Lb91/e;->g(Lkotlin/jvm/functions/Function1;)Lb91/d;

    move-result-object v0

    sput-object v0, Lb91/e;->a:Lb91/d;

    return-void
.end method

.method public static synthetic a(Lkd1/g;)Lb91/d;
    .locals 0

    invoke-static {p0}, Lb91/e;->b(Lkd1/g;)Lb91/d;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lkd1/g;)Lb91/d;
    .locals 90

    move-object/from16 v0, p0

    const-string v1, "$this$whoopTypography"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lb91/d;

    new-instance v1, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v10

    const/16 v19, 0x18

    invoke-static/range {v19 .. v19}, Lv63/c;->h(I)J

    move-result-wide v6

    sget-object v3, Lp3/r;->x:Lp3/r;

    sget-object v25, Lp3/r;->I:Lp3/r;

    const/16 v36, 0x1e

    invoke-static/range {v36 .. v36}, Lv63/c;->h(I)J

    move-result-wide v16

    const-wide v3, 0x4003333333333333L    # 2.4

    invoke-static {v3, v4}, Lv63/c;->g(D)J

    move-result-wide v11

    new-instance v3, Ll3/v0;

    const/4 v15, 0x0

    const v18, 0xfdff59

    const-wide/16 v4, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v8, v25

    invoke-direct/range {v3 .. v18}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    sget-object v4, Lb91/b$d;->a:Lb91/b$d;

    invoke-direct {v1, v3, v4}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v3, "H1 - Headline (XXL)"

    invoke-virtual {v0, v1, v3, v4}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lb91/a;

    new-instance v1, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v27

    const/16 v5, 0x11

    invoke-static {v5}, Lv63/c;->h(I)J

    move-result-wide v23

    const/16 v6, 0x15

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v33

    const-wide v7, 0x3ffb333333333333L    # 1.7

    invoke-static {v7, v8}, Lv63/c;->g(D)J

    move-result-wide v28

    new-instance v20, Ll3/v0;

    const/16 v32, 0x0

    const v35, 0xfdff59

    const-wide/16 v21, 0x0

    const/16 v26, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v20 .. v35}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v9, v20

    invoke-direct {v1, v9, v4}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v9, "H2 - Headline (XL)"

    invoke-virtual {v0, v1, v9, v4}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb91/a;

    new-instance v9, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v27

    const/16 v10, 0xf

    invoke-static {v10}, Lv63/c;->h(I)J

    move-result-wide v23

    const/16 v11, 0x13

    invoke-static {v11}, Lv63/c;->h(I)J

    move-result-wide v33

    const-wide/high16 v12, 0x3ff8000000000000L    # 1.5

    invoke-static {v12, v13}, Lv63/c;->g(D)J

    move-result-wide v28

    new-instance v20, Ll3/v0;

    invoke-direct/range {v20 .. v35}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v14, v20

    invoke-direct {v9, v14, v4}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v14, "H3 - Headline (L)"

    invoke-virtual {v0, v9, v14, v4}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lb91/a;

    new-instance v14, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v27

    const/16 v15, 0xd

    invoke-static {v15}, Lv63/c;->h(I)J

    move-result-wide v23

    const/16 v16, 0x10

    invoke-static/range {v16 .. v16}, Lv63/c;->h(I)J

    move-result-wide v33

    const-wide v17, 0x3ff4cccccccccccdL    # 1.3

    invoke-static/range {v17 .. v18}, Lv63/c;->g(D)J

    move-result-wide v28

    new-instance v20, Ll3/v0;

    invoke-direct/range {v20 .. v35}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move/from16 v37, v5

    move-object/from16 v5, v20

    invoke-direct {v14, v5, v4}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v5, "H4 - Headline (M)"

    invoke-virtual {v0, v14, v5, v4}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb91/a;

    new-instance v14, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v27

    const/16 v38, 0xb

    invoke-static/range {v38 .. v38}, Lv63/c;->h(I)J

    move-result-wide v23

    const/16 v39, 0xe

    invoke-static/range {v39 .. v39}, Lv63/c;->h(I)J

    move-result-wide v33

    const-wide v40, 0x3ff199999999999aL    # 1.1

    invoke-static/range {v40 .. v41}, Lv63/c;->g(D)J

    move-result-wide v28

    new-instance v20, Ll3/v0;

    invoke-direct/range {v20 .. v35}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move/from16 v42, v6

    move-object/from16 v6, v20

    invoke-direct {v14, v6, v4}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v6, "H5 - Headline (S)"

    invoke-virtual {v0, v14, v6, v4}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lb91/a;

    new-instance v14, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v27

    const/16 v43, 0xa

    invoke-static/range {v43 .. v43}, Lv63/c;->h(I)J

    move-result-wide v23

    invoke-static {v15}, Lv63/c;->h(I)J

    move-result-wide v33

    const-wide/high16 v20, 0x3ff0000000000000L    # 1.0

    invoke-static/range {v20 .. v21}, Lv63/c;->g(D)J

    move-result-wide v28

    new-instance v20, Ll3/v0;

    const-wide/16 v21, 0x0

    invoke-direct/range {v20 .. v35}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-wide/from16 v44, v7

    move-object/from16 v7, v20

    invoke-direct {v14, v7, v4}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v7, "H6 - Headline (XS)"

    invoke-virtual {v0, v14, v7, v4}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Lb91/a;

    new-instance v4, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v27

    invoke-static/range {v42 .. v42}, Lv63/c;->h(I)J

    move-result-wide v23

    const/16 v7, 0x1a

    invoke-static {v7}, Lv63/c;->h(I)J

    move-result-wide v33

    const-wide v20, 0x4000cccccccccccdL    # 2.1

    invoke-static/range {v20 .. v21}, Lv63/c;->g(D)J

    move-result-wide v28

    new-instance v20, Ll3/v0;

    const-wide/16 v21, 0x0

    invoke-direct/range {v20 .. v35}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v7, v20

    sget-object v14, Lb91/b$g;->a:Lb91/b$g;

    invoke-direct {v4, v7, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v7, "SH1 - Subheadline (XL)"

    invoke-virtual {v0, v4, v7, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb91/a;

    new-instance v7, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v27

    invoke-static/range {v37 .. v37}, Lv63/c;->h(I)J

    move-result-wide v23

    invoke-static/range {v42 .. v42}, Lv63/c;->h(I)J

    move-result-wide v33

    invoke-static/range {v44 .. v45}, Lv63/c;->g(D)J

    move-result-wide v28

    new-instance v20, Ll3/v0;

    invoke-direct/range {v20 .. v35}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move/from16 v44, v10

    move-object/from16 v10, v20

    invoke-direct {v7, v10, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v10, "SH2 - Subheadline (L)"

    invoke-virtual {v0, v7, v10, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v10, v7

    check-cast v10, Lb91/a;

    new-instance v7, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v27

    invoke-static/range {v44 .. v44}, Lv63/c;->h(I)J

    move-result-wide v23

    invoke-static {v11}, Lv63/c;->h(I)J

    move-result-wide v33

    invoke-static {v12, v13}, Lv63/c;->g(D)J

    move-result-wide v28

    new-instance v20, Ll3/v0;

    invoke-direct/range {v20 .. v35}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v12, v20

    invoke-direct {v7, v12, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v12, "SH3 - Subheadline (M)"

    invoke-virtual {v0, v7, v12, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lb91/a;

    new-instance v12, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v27

    const/16 v13, 0xc

    invoke-static {v13}, Lv63/c;->h(I)J

    move-result-wide v23

    invoke-static/range {v44 .. v44}, Lv63/c;->h(I)J

    move-result-wide v33

    const-wide v45, 0x3ff3333333333333L    # 1.2

    invoke-static/range {v45 .. v46}, Lv63/c;->g(D)J

    move-result-wide v28

    new-instance v20, Ll3/v0;

    invoke-direct/range {v20 .. v35}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move/from16 v47, v11

    move-object/from16 v11, v20

    invoke-direct {v12, v11, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v11, "SH4 - Subheadline (S)"

    invoke-virtual {v0, v12, v11, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lb91/a;

    new-instance v11, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v27

    invoke-static/range {v38 .. v38}, Lv63/c;->h(I)J

    move-result-wide v23

    invoke-static/range {v39 .. v39}, Lv63/c;->h(I)J

    move-result-wide v33

    invoke-static/range {v40 .. v41}, Lv63/c;->g(D)J

    move-result-wide v28

    new-instance v20, Ll3/v0;

    invoke-direct/range {v20 .. v35}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move/from16 v48, v13

    move-object/from16 v13, v20

    invoke-direct {v11, v13, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v13, "SH5 - Subheadline (XS)"

    invoke-virtual {v0, v11, v13, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object v13, v11

    check-cast v13, Lb91/a;

    new-instance v11, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v56

    invoke-static/range {v16 .. v16}, Lv63/c;->h(I)J

    move-result-wide v52

    sget-object v62, Lp3/r;->H:Lp3/r;

    const/16 v14, 0x14

    invoke-static {v14}, Lv63/c;->h(I)J

    move-result-wide v20

    const/4 v14, 0x0

    invoke-static {v14}, Lv63/c;->h(I)J

    move-result-wide v57

    new-instance v49, Ll3/v0;

    const/16 v61, 0x0

    const v64, 0xfdff59

    const-wide/16 v50, 0x0

    const/16 v55, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    move-object/from16 v54, v62

    move-wide/from16 v62, v20

    invoke-direct/range {v49 .. v64}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v50, v49

    move/from16 v49, v14

    move-object/from16 v14, v50

    move/from16 v50, v15

    move-object/from16 v62, v54

    sget-object v15, Lb91/b$i;->a:Lb91/b$i;

    invoke-direct {v11, v14, v15}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    sget-object v14, Lb91/b$b;->a:Lb91/b$b;

    move-object/from16 v51, v1

    const-string v1, "P1 - Paragraph One"

    invoke-virtual {v0, v11, v1, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb91/a;

    new-instance v11, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v64

    invoke-static/range {v39 .. v39}, Lv63/c;->h(I)J

    move-result-wide v60

    const/16 v52, 0x12

    invoke-static/range {v52 .. v52}, Lv63/c;->h(I)J

    move-result-wide v70

    invoke-static/range {v49 .. v49}, Lv63/c;->h(I)J

    move-result-wide v65

    new-instance v57, Ll3/v0;

    const/16 v69, 0x0

    const v72, 0xfdff59

    const-wide/16 v58, 0x0

    const/16 v63, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    invoke-direct/range {v57 .. v72}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v53, v1

    move-object/from16 v1, v57

    invoke-direct {v11, v1, v15}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v1, "P2 - Paragraph Two"

    invoke-virtual {v0, v11, v1, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb91/a;

    new-instance v11, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v64

    invoke-static/range {v44 .. v44}, Lv63/c;->h(I)J

    move-result-wide v60

    invoke-static/range {v47 .. v47}, Lv63/c;->h(I)J

    move-result-wide v70

    new-instance v57, Ll3/v0;

    const v72, 0xfdffd9

    const-wide/16 v65, 0x0

    invoke-direct/range {v57 .. v72}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v54, v1

    move-object/from16 v1, v57

    invoke-direct {v11, v1, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v1, "B1 - Body (L)"

    invoke-virtual {v0, v11, v1, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb91/a;

    new-instance v11, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v64

    invoke-static/range {v50 .. v50}, Lv63/c;->h(I)J

    move-result-wide v60

    invoke-static/range {v16 .. v16}, Lv63/c;->h(I)J

    move-result-wide v70

    new-instance v57, Ll3/v0;

    invoke-direct/range {v57 .. v72}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v55, v1

    move-object/from16 v1, v57

    invoke-direct {v11, v1, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v1, "B2 - Body (M)"

    invoke-virtual {v0, v11, v1, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb91/a;

    new-instance v11, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v64

    invoke-static/range {v48 .. v48}, Lv63/c;->h(I)J

    move-result-wide v60

    invoke-static/range {v44 .. v44}, Lv63/c;->h(I)J

    move-result-wide v70

    new-instance v57, Ll3/v0;

    invoke-direct/range {v57 .. v72}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v56, v1

    move-object/from16 v1, v57

    invoke-direct {v11, v1, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v1, "B3 - Body (S)"

    invoke-virtual {v0, v11, v1, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb91/a;

    new-instance v11, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v64

    invoke-static/range {v38 .. v38}, Lv63/c;->h(I)J

    move-result-wide v60

    invoke-static/range {v39 .. v39}, Lv63/c;->h(I)J

    move-result-wide v70

    new-instance v57, Ll3/v0;

    invoke-direct/range {v57 .. v72}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v73, v1

    move-object/from16 v1, v57

    invoke-direct {v11, v1, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v1, "B4 - Body (XS)"

    invoke-virtual {v0, v11, v1, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb91/a;

    new-instance v11, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v64

    invoke-static/range {v43 .. v43}, Lv63/c;->h(I)J

    move-result-wide v60

    invoke-static/range {v50 .. v50}, Lv63/c;->h(I)J

    move-result-wide v70

    new-instance v57, Ll3/v0;

    invoke-direct/range {v57 .. v72}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v58, v1

    move-object/from16 v1, v57

    invoke-direct {v11, v1, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v1, "B4 - Body (XXS)"

    invoke-virtual {v0, v11, v1, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb91/a;

    new-instance v11, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v27

    invoke-static/range {v50 .. v50}, Lv63/c;->h(I)J

    move-result-wide v23

    invoke-static/range {v16 .. v16}, Lv63/c;->h(I)J

    move-result-wide v33

    invoke-static/range {v17 .. v18}, Lv63/c;->g(D)J

    move-result-wide v28

    new-instance v20, Ll3/v0;

    const-wide/16 v21, 0x0

    invoke-direct/range {v20 .. v35}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v57, v1

    move-object/from16 v14, v20

    sget-object v1, Lb91/b$h;->a:Lb91/b$h;

    invoke-direct {v11, v14, v1}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v14, "BT-L Text Button (L)"

    invoke-virtual {v0, v11, v14, v1}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lb91/a;

    new-instance v14, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v27

    invoke-static/range {v48 .. v48}, Lv63/c;->h(I)J

    move-result-wide v23

    invoke-static/range {v44 .. v44}, Lv63/c;->h(I)J

    move-result-wide v33

    invoke-static/range {v45 .. v46}, Lv63/c;->g(D)J

    move-result-wide v28

    new-instance v20, Ll3/v0;

    invoke-direct/range {v20 .. v35}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v45, v2

    move-object/from16 v2, v20

    invoke-direct {v14, v2, v1}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v2, "BT-M Text Button (M)"

    invoke-virtual {v0, v14, v2, v1}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb91/a;

    new-instance v14, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v27

    invoke-static/range {v38 .. v38}, Lv63/c;->h(I)J

    move-result-wide v23

    invoke-static/range {v39 .. v39}, Lv63/c;->h(I)J

    move-result-wide v33

    invoke-static/range {v40 .. v41}, Lv63/c;->g(D)J

    move-result-wide v28

    new-instance v20, Ll3/v0;

    invoke-direct/range {v20 .. v35}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v40, v2

    move-object/from16 v2, v20

    invoke-direct {v14, v2, v1}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v2, "BT-S Text Button (S)"

    invoke-virtual {v0, v14, v2, v1}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb91/a;

    new-instance v2, Lb91/a;

    invoke-static {}, Lb91/e;->c()Lp3/i;

    move-result-object v27

    const/16 v14, 0x22

    invoke-static {v14}, Lv63/c;->h(I)J

    move-result-wide v23

    const/16 v41, 0x2b

    invoke-static/range {v41 .. v41}, Lv63/c;->h(I)J

    move-result-wide v33

    new-instance v20, Ll3/v0;

    const v35, 0xfdffd9

    const-wide/16 v28, 0x0

    invoke-direct/range {v20 .. v35}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v48, v1

    move/from16 v46, v14

    move-object/from16 v14, v20

    sget-object v1, Lb91/b$f;->a:Lb91/b$f;

    invoke-direct {v2, v14, v1}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v14, "BN-L Number Button (L)"

    invoke-virtual {v0, v2, v14, v1}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb91/a;

    new-instance v14, Lb91/a;

    invoke-static {}, Lb91/e;->c()Lp3/i;

    move-result-object v27

    invoke-static/range {v19 .. v19}, Lv63/c;->h(I)J

    move-result-wide v23

    invoke-static/range {v36 .. v36}, Lv63/c;->h(I)J

    move-result-wide v33

    new-instance v20, Ll3/v0;

    invoke-direct/range {v20 .. v35}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v24, v2

    move-object/from16 v2, v20

    invoke-direct {v14, v2, v1}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v2, "BN-M Number Button (M)"

    invoke-virtual {v0, v14, v2, v1}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v25, v2

    check-cast v25, Lb91/a;

    new-instance v2, Lb91/a;

    invoke-static {}, Lb91/e;->c()Lp3/i;

    move-result-object v81

    invoke-static/range {v37 .. v37}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->l()Lp3/r;

    move-result-object v79

    invoke-static/range {v42 .. v42}, Lv63/c;->h(I)J

    move-result-wide v87

    new-instance v74, Ll3/v0;

    const/16 v86, 0x0

    const v89, 0xfdffd9

    const-wide/16 v75, 0x0

    const/16 v80, 0x0

    const-wide/16 v82, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v14, v74

    invoke-direct {v2, v14, v1}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v14, "BN-S Number Button (S)"

    invoke-virtual {v0, v2, v14, v1}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v26, v1

    check-cast v26, Lb91/a;

    new-instance v1, Lb91/a;

    invoke-static {}, Lb91/e;->c()Lp3/i;

    move-result-object v81

    const/16 v2, 0x58

    invoke-static {v2}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->l()Lp3/r;

    move-result-object v79

    const/16 v2, 0x6e

    invoke-static {v2}, Lv63/c;->h(I)J

    move-result-wide v87

    new-instance v74, Ll3/v0;

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v2, v74

    sget-object v14, Lb91/b$e;->a:Lb91/b$e;

    invoke-direct {v1, v2, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v2, "N1 - 8:10"

    invoke-virtual {v0, v1, v2, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v27, v1

    check-cast v27, Lb91/a;

    new-instance v1, Lb91/a;

    invoke-static {}, Lb91/e;->c()Lp3/i;

    move-result-object v81

    const/16 v2, 0x45

    invoke-static {v2}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->l()Lp3/r;

    move-result-object v79

    const/16 v2, 0x56

    invoke-static {v2}, Lv63/c;->h(I)J

    move-result-wide v87

    new-instance v74, Ll3/v0;

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v2, v74

    invoke-direct {v1, v2, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v2, "N2 - 8:10"

    invoke-virtual {v0, v1, v2, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v28, v1

    check-cast v28, Lb91/a;

    new-instance v1, Lb91/a;

    invoke-static {}, Lb91/e;->c()Lp3/i;

    move-result-object v81

    invoke-static/range {v41 .. v41}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->l()Lp3/r;

    move-result-object v79

    const/16 v2, 0x36

    invoke-static {v2}, Lv63/c;->h(I)J

    move-result-wide v87

    new-instance v74, Ll3/v0;

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v2, v74

    invoke-direct {v1, v2, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v2, "N3 - 8:10"

    invoke-virtual {v0, v1, v2, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v29, v1

    check-cast v29, Lb91/a;

    new-instance v1, Lb91/a;

    invoke-static {}, Lb91/e;->c()Lp3/i;

    move-result-object v81

    invoke-static/range {v46 .. v46}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->l()Lp3/r;

    move-result-object v79

    invoke-static/range {v41 .. v41}, Lv63/c;->h(I)J

    move-result-wide v87

    new-instance v74, Ll3/v0;

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v2, v74

    invoke-direct {v1, v2, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v2, "N4 - 8:10"

    invoke-virtual {v0, v1, v2, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v30, v1

    check-cast v30, Lb91/a;

    new-instance v1, Lb91/a;

    invoke-static {}, Lb91/e;->c()Lp3/i;

    move-result-object v81

    const/16 v2, 0x1c

    invoke-static {v2}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->l()Lp3/r;

    move-result-object v79

    invoke-static/range {v41 .. v41}, Lv63/c;->h(I)J

    move-result-wide v87

    new-instance v74, Ll3/v0;

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v2, v74

    invoke-direct {v1, v2, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v2, "N45 - 8:10"

    invoke-virtual {v0, v1, v2, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v31, v1

    check-cast v31, Lb91/a;

    new-instance v1, Lb91/a;

    invoke-static {}, Lb91/e;->c()Lp3/i;

    move-result-object v81

    invoke-static/range {v19 .. v19}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->l()Lp3/r;

    move-result-object v79

    invoke-static/range {v36 .. v36}, Lv63/c;->h(I)J

    move-result-wide v87

    new-instance v74, Ll3/v0;

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v2, v74

    invoke-direct {v1, v2, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v2, "N5 - 8:10"

    invoke-virtual {v0, v1, v2, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v32, v1

    check-cast v32, Lb91/a;

    new-instance v1, Lb91/a;

    invoke-static {}, Lb91/e;->c()Lp3/i;

    move-result-object v81

    invoke-static/range {v42 .. v42}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->l()Lp3/r;

    move-result-object v79

    invoke-static/range {v42 .. v42}, Lv63/c;->h(I)J

    move-result-wide v87

    new-instance v74, Ll3/v0;

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v2, v74

    invoke-direct {v1, v2, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v2, "N55 - 8:10"

    invoke-virtual {v0, v1, v2, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v33, v1

    check-cast v33, Lb91/a;

    new-instance v1, Lb91/a;

    invoke-static {}, Lb91/e;->c()Lp3/i;

    move-result-object v81

    invoke-static/range {v37 .. v37}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->l()Lp3/r;

    move-result-object v79

    invoke-static/range {v42 .. v42}, Lv63/c;->h(I)J

    move-result-wide v87

    new-instance v74, Ll3/v0;

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v2, v74

    invoke-direct {v1, v2, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v2, "N6 - 8:10"

    invoke-virtual {v0, v1, v2, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v34, v1

    check-cast v34, Lb91/a;

    new-instance v1, Lb91/a;

    invoke-static {}, Lb91/e;->c()Lp3/i;

    move-result-object v81

    invoke-static/range {v44 .. v44}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->l()Lp3/r;

    move-result-object v79

    invoke-static/range {v47 .. v47}, Lv63/c;->h(I)J

    move-result-wide v87

    new-instance v74, Ll3/v0;

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v2, v74

    invoke-direct {v1, v2, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v2, "N7 - 8:10"

    invoke-virtual {v0, v1, v2, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v35, v1

    check-cast v35, Lb91/a;

    new-instance v1, Lb91/a;

    invoke-static {}, Lb91/e;->c()Lp3/i;

    move-result-object v81

    invoke-static/range {v50 .. v50}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->l()Lp3/r;

    move-result-object v79

    invoke-static/range {v16 .. v16}, Lv63/c;->h(I)J

    move-result-wide v87

    new-instance v74, Ll3/v0;

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v2, v74

    invoke-direct {v1, v2, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v2, "N8 - 8:10"

    invoke-virtual {v0, v1, v2, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb91/a;

    new-instance v2, Lb91/a;

    invoke-static {}, Lb91/e;->c()Lp3/i;

    move-result-object v81

    invoke-static/range {v38 .. v38}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->l()Lp3/r;

    move-result-object v79

    invoke-static/range {v39 .. v39}, Lv63/c;->h(I)J

    move-result-wide v87

    new-instance v74, Ll3/v0;

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v20, v1

    move-object/from16 v1, v74

    invoke-direct {v2, v1, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v1, "N9 - 8:10"

    invoke-virtual {v0, v2, v1, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v37, v1

    check-cast v37, Lb91/a;

    new-instance v1, Lb91/a;

    invoke-static {}, Lb91/e;->c()Lp3/i;

    move-result-object v81

    invoke-static/range {v43 .. v43}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->l()Lp3/r;

    move-result-object v79

    invoke-static/range {v50 .. v50}, Lv63/c;->h(I)J

    move-result-wide v87

    new-instance v74, Ll3/v0;

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v2, v74

    invoke-direct {v1, v2, v14}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v2, "N10 - 8:10"

    invoke-virtual {v0, v1, v2, v14}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb91/a;

    new-instance v2, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v81

    invoke-static/range {v38 .. v38}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->l()Lp3/r;

    move-result-object v79

    invoke-static/range {v39 .. v39}, Lv63/c;->h(I)J

    move-result-wide v87

    const-wide v21, 0x3ff6666666666666L    # 1.4

    invoke-static/range {v21 .. v22}, Lv63/c;->g(D)J

    move-result-wide v82

    new-instance v74, Ll3/v0;

    const v89, 0xfdff59

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v38, v1

    move-object/from16 v14, v74

    sget-object v1, Lb91/b$c;->a:Lb91/b$c;

    invoke-direct {v2, v14, v1}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v14, "Form label - Example Form Label Text"

    invoke-virtual {v0, v2, v14, v1}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v39, v2

    check-cast v39, Lb91/a;

    new-instance v2, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v81

    invoke-static/range {v50 .. v50}, Lv63/c;->h(I)J

    move-result-wide v77

    sget-object v79, Lp3/r;->F:Lp3/r;

    invoke-static/range {v16 .. v16}, Lv63/c;->h(I)J

    move-result-wide v87

    invoke-static/range {v17 .. v18}, Lv63/c;->g(D)J

    move-result-wide v82

    new-instance v74, Ll3/v0;

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v14, v74

    invoke-direct {v2, v14, v1}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v14, "Form label - Example Form Label Medium Text"

    invoke-virtual {v0, v2, v14, v1}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb91/a;

    new-instance v2, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v81

    const/16 v14, 0x1b

    invoke-static {v14}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->n()Lp3/r;

    move-result-object v79

    const/16 v16, 0x21

    invoke-static/range {v16 .. v16}, Lv63/c;->h(I)J

    move-result-wide v87

    invoke-static/range {v49 .. v49}, Lv63/c;->h(I)J

    move-result-wide v82

    new-instance v74, Ll3/v0;

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move/from16 v16, v14

    move-object/from16 v14, v74

    invoke-direct {v2, v14, v15}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v14, "T1 - Title (L)"

    invoke-virtual {v0, v2, v14, v15}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v41, v2

    check-cast v41, Lb91/a;

    new-instance v2, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v81

    invoke-static/range {v19 .. v19}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->n()Lp3/r;

    move-result-object v79

    invoke-static/range {v36 .. v36}, Lv63/c;->h(I)J

    move-result-wide v87

    invoke-static/range {v49 .. v49}, Lv63/c;->h(I)J

    move-result-wide v82

    new-instance v74, Ll3/v0;

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v14, v74

    invoke-direct {v2, v14, v15}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v14, "T2 - Title (M)"

    invoke-virtual {v0, v2, v14, v15}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb91/a;

    new-instance v14, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v81

    invoke-static/range {v42 .. v42}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->n()Lp3/r;

    move-result-object v79

    invoke-static/range {v16 .. v16}, Lv63/c;->h(I)J

    move-result-wide v87

    invoke-static/range {v49 .. v49}, Lv63/c;->h(I)J

    move-result-wide v82

    new-instance v74, Ll3/v0;

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v16, v1

    move-object/from16 v1, v74

    invoke-direct {v14, v1, v15}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v1, "T3 - Title (S)"

    invoke-virtual {v0, v14, v1, v15}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v43, v1

    check-cast v43, Lb91/a;

    new-instance v1, Lb91/a;

    invoke-static {}, Lb91/e;->d()Lp3/i;

    move-result-object v81

    invoke-static/range {v52 .. v52}, Lv63/c;->h(I)J

    move-result-wide v77

    invoke-static {}, Ljc/a;->n()Lp3/r;

    move-result-object v79

    invoke-static/range {v19 .. v19}, Lv63/c;->h(I)J

    move-result-wide v87

    invoke-static/range {v49 .. v49}, Lv63/c;->h(I)J

    move-result-wide v82

    new-instance v74, Ll3/v0;

    invoke-direct/range {v74 .. v89}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v14, v74

    invoke-direct {v1, v14, v15}, Lb91/a;-><init>(Ll3/v0;Lb91/b;)V

    const-string v14, "T4 - Title (XS)"

    invoke-virtual {v0, v1, v14, v15}, Lkd1/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v44, v1

    check-cast v44, Lb91/a;

    invoke-virtual {v0}, Lkd1/g;->c()Ljava/util/List;

    move-result-object v0

    move-object/from16 v42, v2

    move-object/from16 v21, v11

    move-object/from16 v36, v20

    move-object/from16 v22, v40

    move-object/from16 v2, v45

    move-object/from16 v23, v48

    move-object/from16 v14, v53

    move-object/from16 v15, v54

    move-object/from16 v17, v56

    move-object/from16 v20, v57

    move-object/from16 v19, v58

    move-object/from16 v18, v73

    move-object/from16 v45, v0

    move-object v11, v7

    move-object/from16 v40, v16

    move-object/from16 v16, v55

    move-object v7, v6

    move-object v6, v5

    move-object v5, v9

    move-object v9, v4

    move-object/from16 v4, v51

    invoke-direct/range {v2 .. v45}, Lb91/d;-><init>(Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Lb91/a;Ljava/util/List;)V

    return-object v2
.end method

.method public static final c()Lp3/i;
    .locals 4

    sget v0, Lgy0/b;->d:I

    sget-object v1, Lp3/r;->I:Lp3/r;

    const/16 v2, 0xc

    invoke-static {v0, v1, v2}, Lhg3/i;->b(ILp3/r;I)Lp3/x;

    move-result-object v0

    sget v1, Lgy0/b;->e:I

    sget-object v3, Lp3/r;->G:Lp3/r;

    invoke-static {v1, v3, v2}, Lhg3/i;->b(ILp3/r;I)Lp3/x;

    move-result-object v1

    filled-new-array {v0, v1}, [Lp3/x;

    move-result-object v0

    invoke-static {v0}, Le93/b;->d([Lp3/x;)Lp3/l;

    move-result-object v0

    return-object v0
.end method

.method public static final d()Lp3/i;
    .locals 5

    sget v0, Lgy0/b;->b:I

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, v1, v2}, Lhg3/i;->b(ILp3/r;I)Lp3/x;

    move-result-object v0

    sget v1, Lgy0/b;->a:I

    sget-object v2, Lp3/r;->I:Lp3/r;

    const/16 v3, 0xc

    invoke-static {v1, v2, v3}, Lhg3/i;->b(ILp3/r;I)Lp3/x;

    move-result-object v1

    sget v2, Lgy0/b;->c:I

    sget-object v4, Lp3/r;->H:Lp3/r;

    invoke-static {v2, v4, v3}, Lhg3/i;->b(ILp3/r;I)Lp3/x;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Lp3/x;

    move-result-object v0

    invoke-static {v0}, Le93/b;->d([Lp3/x;)Lp3/l;

    move-result-object v0

    return-object v0
.end method

.method public static final e()Lb91/d;
    .locals 1

    sget-object v0, Lb91/e;->a:Lb91/d;

    return-object v0
.end method

.method public static final f(Ll3/v0;JLandroidx/compose/runtime/Composer;I)Ll3/m0;
    .locals 21

    move-object/from16 v0, p0

    const-string v1, "$this$toSpanStyle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Ll3/v0;->a:Ll3/m0;

    iget-wide v4, v0, Ll3/m0;->b:J

    iget-object v9, v0, Ll3/m0;->f:Lp3/i;

    iget-object v6, v0, Ll3/m0;->c:Lp3/r;

    iget-wide v11, v0, Ll3/m0;->h:J

    new-instance v1, Ll3/m0;

    const/16 v19, 0x0

    const v20, 0xff58

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    move-wide/from16 v2, p1

    invoke-direct/range {v1 .. v20}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    return-object v1
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;)Lb91/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lb91/d;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkd1/g;

    invoke-direct {v0}, Lkd1/g;-><init>()V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb91/d;

    return-object p0
.end method
