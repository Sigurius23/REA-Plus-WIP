.class public final Laa2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Laa2/e;


# instance fields
.field private final a:Landroidx/room/z0;

.field private final b:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final c:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final d:Laa2/b;

.field private final e:Laa2/c;

.field private final f:Laa2/d;

.field private final g:Laa2/a;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Laa2/b;

    invoke-direct {v0}, Laa2/b;-><init>()V

    iput-object v0, p0, Laa2/f;->d:Laa2/b;

    new-instance v0, Laa2/c;

    invoke-direct {v0}, Laa2/c;-><init>()V

    iput-object v0, p0, Laa2/f;->e:Laa2/c;

    new-instance v0, Laa2/d;

    invoke-direct {v0}, Laa2/d;-><init>()V

    iput-object v0, p0, Laa2/f;->f:Laa2/d;

    new-instance v0, Laa2/a;

    invoke-direct {v0}, Laa2/a;-><init>()V

    iput-object v0, p0, Laa2/f;->g:Laa2/a;

    iput-object p1, p0, Laa2/f;->a:Landroidx/room/z0;

    new-instance p1, Laa2/f$a;

    invoke-direct {p1, p0}, Laa2/f$a;-><init>(Laa2/f;)V

    iput-object p1, p0, Laa2/f;->b:Landroidx/room/k;

    new-instance p1, Laa2/f$b;

    invoke-direct {p1, p0}, Laa2/f$b;-><init>(Laa2/f;)V

    iput-object p1, p0, Laa2/f;->c:Landroidx/room/k;

    return-void
.end method

.method private synthetic A(Laa2/i;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Laa2/f;->c:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public static synthetic i(Laa2/f;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Laa2/f;->y(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ltb/a;)Laa2/g;
    .locals 0

    invoke-static {p0}, Laa2/f;->w(Ltb/a;)Laa2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Laa2/f;Ltb/a;)Laa2/i;
    .locals 0

    invoke-direct {p0, p1}, Laa2/f;->x(Ltb/a;)Laa2/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Laa2/f;Laa2/i;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Laa2/f;->A(Laa2/i;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Laa2/f;Laa2/g;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Laa2/f;->z(Laa2/g;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Laa2/f;->v(Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Laa2/f;->u(Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic p(Laa2/f;)Laa2/a;
    .locals 0

    iget-object p0, p0, Laa2/f;->g:Laa2/a;

    return-object p0
.end method

.method public static bridge synthetic q(Laa2/f;)Laa2/b;
    .locals 0

    iget-object p0, p0, Laa2/f;->d:Laa2/b;

    return-object p0
.end method

.method public static bridge synthetic r(Laa2/f;)Laa2/c;
    .locals 0

    iget-object p0, p0, Laa2/f;->e:Laa2/c;

    return-object p0
.end method

.method public static bridge synthetic s(Laa2/f;)Laa2/d;
    .locals 0

    iget-object p0, p0, Laa2/f;->f:Laa2/d;

    return-object p0
.end method

.method public static t()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method private static synthetic u(Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM table_user"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic v(Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM table_user_profile"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic w(Ltb/a;)Laa2/g;
    .locals 32

    const-string v0, "SELECT * FROM table_user LIMIT 1"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    const-string v0, "id"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "created_at"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "first_name"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "last_name"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "full_name"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "email_address"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "password"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "username"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "avatar_url"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "city"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "admin_division"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "country"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "concealed"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "age"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v15

    const/16 v16, 0x0

    if-eqz v15, :cond_c

    move/from16 p0, v14

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v0, v14

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_0

    move-object/from16 v19, v16

    goto :goto_0

    :cond_0
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v19, v2

    :goto_0
    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object/from16 v20, v16

    goto :goto_1

    :cond_1
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v20, v2

    :goto_1
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_2

    move-object/from16 v21, v16

    goto :goto_2

    :cond_2
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v21, v2

    :goto_2
    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object/from16 v22, v16

    goto :goto_3

    :cond_3
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v22, v2

    :goto_3
    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object/from16 v23, v16

    goto :goto_4

    :cond_4
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v23, v2

    :goto_4
    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object/from16 v24, v16

    goto :goto_5

    :cond_5
    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v24, v2

    :goto_5
    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_6

    move-object/from16 v25, v16

    goto :goto_6

    :cond_6
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v25, v2

    :goto_6
    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_7

    move-object/from16 v26, v16

    goto :goto_7

    :cond_7
    invoke-interface {v1, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v26, v2

    :goto_7
    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_8

    move-object/from16 v27, v16

    goto :goto_8

    :cond_8
    invoke-interface {v1, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v27, v2

    :goto_8
    invoke-interface {v1, v11}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_9

    move-object/from16 v28, v16

    goto :goto_9

    :cond_9
    invoke-interface {v1, v11}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v28, v2

    :goto_9
    invoke-interface {v1, v12}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_a

    :goto_a
    move-object/from16 v29, v16

    goto :goto_b

    :cond_a
    invoke-interface {v1, v12}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v16

    goto :goto_a

    :goto_b
    invoke-interface {v1, v13}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    if-eqz v2, :cond_b

    const/4 v2, 0x1

    :goto_c
    move/from16 v30, v2

    move/from16 v2, p0

    goto :goto_d

    :cond_b
    const/4 v2, 0x0

    goto :goto_c

    :goto_d
    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    new-instance v17, Laa2/g;

    move/from16 v18, v0

    move/from16 v31, v2

    invoke-direct/range {v17 .. v31}, Laa2/g;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v16, v17

    goto :goto_e

    :catchall_0
    move-exception v0

    goto :goto_f

    :cond_c
    :goto_e
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v16

    :goto_f
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic x(Ltb/a;)Laa2/i;
    .locals 29

    move-object/from16 v1, p0

    const-string v0, "SELECT * FROM table_user_profile LIMIT 1"

    move-object/from16 v2, p1

    invoke-interface {v2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_0
    const-string v0, "id"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v3, "gender"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "height"

    invoke-static {v2, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "weight"

    invoke-static {v2, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "birthday"

    invoke-static {v2, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "time_zone_offset"

    invoke-static {v2, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "unit_system"

    invoke-static {v2, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "fitness_level"

    invoke-static {v2, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "max_heart_rate"

    invoke-static {v2, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "min_heart_rate"

    invoke-static {v2, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "physiological_baseline"

    invoke-static {v2, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "can_upload_data"

    invoke-static {v2, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v14

    if-eqz v14, :cond_7

    invoke-interface {v2, v0}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v0, v14

    invoke-interface {v2, v3}, Ltb/c;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v2, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    :goto_0
    iget-object v14, v1, Laa2/f;->d:Laa2/b;

    invoke-virtual {v14, v3}, Laa2/b;->b(Ljava/lang/String;)Lcom/whoop/domain/model/Gender;

    move-result-object v18

    invoke-interface {v2, v4}, Ltb/c;->getDouble(I)D

    move-result-wide v3

    double-to-float v3, v3

    invoke-interface {v2, v5}, Ltb/c;->getDouble(I)D

    move-result-wide v4

    double-to-float v4, v4

    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    invoke-interface {v2, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_1
    iget-object v6, v1, Laa2/f;->e:Laa2/c;

    invoke-virtual {v6, v5}, Laa2/c;->b(Ljava/lang/String;)Lorg/joda/time/LocalDate;

    move-result-object v21

    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v22, 0x0

    goto :goto_2

    :cond_2
    invoke-interface {v2, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v22, v5

    :goto_2
    invoke-interface {v2, v8}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    goto :goto_3

    :cond_3
    invoke-interface {v2, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_3
    iget-object v6, v1, Laa2/f;->f:Laa2/d;

    invoke-virtual {v6, v5}, Laa2/d;->b(Ljava/lang/String;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object v23

    invoke-interface {v2, v9}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v5, 0x0

    goto :goto_4

    :cond_4
    invoke-interface {v2, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_4
    iget-object v6, v1, Laa2/f;->g:Laa2/a;

    invoke-virtual {v6, v5}, Laa2/a;->b(Ljava/lang/String;)Lcom/whoop/domain/model/FitnessLevel;

    move-result-object v24

    invoke-interface {v2, v10}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-interface {v2, v11}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-interface {v2, v12}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v27, 0x0

    goto :goto_5

    :cond_5
    invoke-interface {v2, v12}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v27, v15

    :goto_5
    invoke-interface {v2, v13}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-eqz v7, :cond_6

    const/4 v7, 0x1

    :goto_6
    move/from16 v28, v7

    goto :goto_7

    :cond_6
    const/4 v7, 0x0

    goto :goto_6

    :goto_7
    new-instance v16, Laa2/i;

    move/from16 v17, v0

    move/from16 v19, v3

    move/from16 v20, v4

    move/from16 v25, v5

    move/from16 v26, v6

    invoke-direct/range {v16 .. v28}, Laa2/i;-><init>(ILcom/whoop/domain/model/Gender;FFLorg/joda/time/LocalDate;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/domain/model/FitnessLevel;IILjava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v15, v16

    goto :goto_8

    :catchall_0
    move-exception v0

    goto :goto_9

    :cond_7
    const/4 v15, 0x0

    :goto_8
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v15

    :goto_9
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic y(Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1}, Laa2/e;->h(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private synthetic z(Laa2/g;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Laa2/f;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Laa2/i;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Laa2/f;->a:Landroidx/room/z0;

    new-instance v1, La6/i;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, La6/i;-><init>(Ljava/lang/Object;I)V

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Laa2/g;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa2/g;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Laa2/f;->a:Landroidx/room/z0;

    new-instance v1, La20/g;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0, p1}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Laa2/f;->a:Landroidx/room/z0;

    new-instance v1, Lp;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lp;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Laa2/g;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Laa2/f;->a:Landroidx/room/z0;

    new-instance v1, La11/g;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, La11/g;-><init>(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Laa2/i;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa2/i;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Laa2/f;->a:Landroidx/room/z0;

    new-instance v1, La20/g;

    const/4 v2, 0x4

    invoke-direct {v1, v2, p0, p1}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Laa2/f;->a:Landroidx/room/z0;

    new-instance v1, Lp;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lp;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Laa2/f;->a:Landroidx/room/z0;

    new-instance v1, La1/b;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, La1/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1, p1}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
