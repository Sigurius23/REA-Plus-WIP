.class public final Lm7/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/util/Set;

.field public static final f:Ljava/util/Set;

.field public static final g:Ljava/lang/Object;


# instance fields
.field public final a:Ljava/time/Instant;

.field public final b:Ljava/time/Instant;

.field public final c:I

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 44

    const/16 v0, 0xa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v0, 0x24

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v8, v0, v1}, [Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    sput-object v2, Lm7/v;->e:Ljava/util/Set;

    const/16 v2, 0x26

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x27

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v4, 0x2c

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v5, 0x36

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v2, v3, v4, v5, v1}, [Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    sput-object v1, Lm7/v;->f:Ljava/util/Set;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v6, 0x5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v9, 0x9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/16 v10, 0xb

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v11, 0xc

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/16 v12, 0xd

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const/16 v13, 0xe

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v14, 0xf

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v15, 0x10

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v16, 0x11

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    const/16 v17, 0x12

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    const/16 v18, 0x13

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    const/16 v19, 0x14

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    const/16 v20, 0x16

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    const/16 v21, 0x17

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v21

    const/16 v22, 0x19

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v22

    const/16 v23, 0x1a

    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v23

    const/16 v24, 0x1c

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    const/16 v25, 0x1b

    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v25

    const/16 v26, 0x1d

    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v26

    const/16 v27, 0x1e

    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v27

    const/16 v28, 0x1f

    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v28

    const/16 v29, 0x20

    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v29

    const/16 v30, 0x21

    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v30

    const/16 v31, 0x22

    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v31

    const/16 v32, 0x23

    invoke-static/range {v32 .. v32}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v32

    const/16 v33, 0x25

    invoke-static/range {v33 .. v33}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v33

    const/16 v34, 0x29

    invoke-static/range {v34 .. v34}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v34

    const/16 v35, 0x2a

    invoke-static/range {v35 .. v35}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v35

    const/16 v36, 0x2b

    invoke-static/range {v36 .. v36}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v36

    const/16 v37, 0x30

    invoke-static/range {v37 .. v37}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v37

    const/16 v38, 0x31

    invoke-static/range {v38 .. v38}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v38

    const/16 v39, 0x32

    invoke-static/range {v39 .. v39}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v39

    const/16 v40, 0x33

    invoke-static/range {v40 .. v40}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v40

    const/16 v41, 0x3f

    invoke-static/range {v41 .. v41}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v41

    const/16 v42, 0x41

    invoke-static/range {v42 .. v42}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v42

    move-object/from16 v43, v32

    move-object/from16 v32, v0

    move-object v0, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v22

    move-object/from16 v22, v23

    move-object/from16 v23, v24

    move-object/from16 v24, v25

    move-object/from16 v25, v26

    move-object/from16 v26, v27

    move-object/from16 v27, v28

    move-object/from16 v28, v29

    move-object/from16 v29, v30

    move-object/from16 v30, v31

    move-object/from16 v31, v43

    filled-new-array/range {v1 .. v42}, [Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v21

    move-object/from16 v3, v22

    move-object/from16 v4, v30

    move-object/from16 v5, v33

    move-object/from16 v6, v37

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const/16 v8, 0x37

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const/16 v8, 0x38

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v8, 0x3a

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v8, 0x39

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v8, 0x3b

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    const/16 v8, 0x3d

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    filled-new-array/range {v12 .. v17}, [Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    const/16 v9, 0x8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v10, 0x7

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v10}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    new-instance v12, Ll83/k;

    invoke-direct {v12, v9, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v9}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    new-instance v14, Ll83/k;

    invoke-direct {v14, v7, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    invoke-direct {v7, v11, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v10, 0x15

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v10}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    new-instance v11, Ll83/k;

    invoke-direct {v11, v2, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v2, 0x43

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v10, 0x28

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v16, 0x18

    move-object/from16 v18, v7

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v2, v9, v10, v7}, [Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    new-instance v9, Ll83/k;

    invoke-direct {v9, v3, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v4, 0x40

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v7, 0x42

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v4, v7}, [Ljava/lang/Integer;

    move-result-object v16

    move-object/from16 v17, v2

    invoke-static/range {v16 .. v16}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    move-object/from16 v21, v3

    new-instance v3, Ll83/k;

    invoke-direct {v3, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v10}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    new-instance v5, Ll83/k;

    invoke-direct {v5, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v2, 0x2d

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    new-instance v6, Ll83/k;

    invoke-direct {v6, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x2e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0, v4}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    new-instance v2, Ll83/k;

    invoke-direct {v2, v13, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x2f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    new-instance v10, Ll83/k;

    invoke-direct {v10, v15, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x46

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v13, Ll83/k;

    invoke-direct {v13, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x44

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v15, 0x34

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v15}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v15

    move-object/from16 v25, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x45

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v15, 0x35

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v15}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v15

    move-object/from16 v28, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x49

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v15, Ln83/i;

    invoke-direct {v15}, Ln83/i;-><init>()V

    const/16 v16, 0x3c

    move-object/from16 v29, v2

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v15, v2}, Ln83/i;->add(Ljava/lang/Object;)Z

    check-cast v8, Ljava/util/Collection;

    invoke-virtual {v15, v8}, Ln83/i;->addAll(Ljava/util/Collection;)Z

    invoke-static {v15}, Ldt/b;->g(Ln83/i;)Ln83/i;

    move-result-object v2

    new-instance v15, Ll83/k;

    invoke-direct {v15, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x4a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v2, Ln83/i;

    invoke-direct {v2}, Ln83/i;-><init>()V

    const/16 v16, 0x3e

    move-object/from16 v22, v3

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln83/i;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v8}, Ln83/i;->addAll(Ljava/util/Collection;)Z

    invoke-static {v2}, Ldt/b;->g(Ln83/i;)Ln83/i;

    move-result-object v2

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x4f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v4}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x52

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v7}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    new-instance v7, Ll83/k;

    invoke-direct {v7, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x51

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x53

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v17 .. v17}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    new-instance v8, Ll83/k;

    invoke-direct {v8, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v34, v2

    move-object/from16 v31, v3

    move-object/from16 v32, v4

    move-object/from16 v23, v5

    move-object/from16 v24, v6

    move-object/from16 v33, v7

    move-object/from16 v35, v8

    move-object/from16 v20, v9

    move-object/from16 v26, v10

    move-object/from16 v19, v11

    move-object/from16 v16, v12

    move-object/from16 v27, v13

    move-object/from16 v17, v14

    move-object/from16 v30, v15

    filled-new-array/range {v16 .. v35}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lm7/v;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/time/Instant;Ljava/time/Instant;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/v;->a:Ljava/time/Instant;

    iput-object p2, p0, Lm7/v;->b:Ljava/time/Instant;

    iput p3, p0, Lm7/v;->c:I

    iput p4, p0, Lm7/v;->d:I

    invoke-virtual {p1, p2}, Ljava/time/Instant;->isBefore(Ljava/time/Instant;)Z

    move-result p1

    if-eqz p1, :cond_1

    if-ltz p4, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "repetitions can not be negative."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "startTime must be before endTime."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/v;->b:Ljava/time/Instant;

    return-object v0
.end method

.method public final b()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/v;->a:Ljava/time/Instant;

    return-object v0
.end method

.method public final c(I)Z
    .locals 3

    sget-object v0, Lm7/v;->e:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lm7/v;->f:Ljava/util/Set;

    iget v1, p0, Lm7/v;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    sget-object v0, Lm7/v;->g:Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    if-eqz p1, :cond_2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm7/v;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lm7/v;

    iget-object v1, p1, Lm7/v;->a:Ljava/time/Instant;

    iget-object v3, p0, Lm7/v;->a:Ljava/time/Instant;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lm7/v;->b:Ljava/time/Instant;

    iget-object v3, p1, Lm7/v;->b:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lm7/v;->c:I

    iget v3, p1, Lm7/v;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lm7/v;->d:I

    iget p1, p1, Lm7/v;->d:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lm7/v;->a:Ljava/time/Instant;

    invoke-virtual {v0}, Ljava/time/Instant;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm7/v;->b:Ljava/time/Instant;

    invoke-static {v2, v0, v1}, Ljh3/c;->b(Ljava/time/Instant;II)I

    move-result v0

    iget v2, p0, Lm7/v;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lm7/v;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
