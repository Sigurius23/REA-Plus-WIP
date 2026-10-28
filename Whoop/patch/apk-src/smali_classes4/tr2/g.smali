.class public final Ltr2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltr2/f;


# instance fields
.field private final a:Landroidx/room/z0;

.field private final b:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltr2/g;->a:Landroidx/room/z0;

    new-instance p1, Ltr2/g$a;

    invoke-direct {p1, p0}, Ltr2/g$a;-><init>(Ltr2/g;)V

    iput-object p1, p0, Ltr2/g;->b:Landroidx/room/k;

    return-void
.end method

.method public static synthetic h(Ljava/lang/String;Ljava/lang/String;ILtb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltr2/g;->u(Ljava/lang/String;Ljava/lang/String;ILtb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/String;Landroidx/room/l1;Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1, p2}, Ltr2/g;->z(Ljava/lang/String;Landroidx/room/l1;Ltb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/String;Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1}, Ltr2/g;->t(Ljava/lang/String;Ltb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ltr2/g;Ltr2/h;Ltb/a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ltr2/g;->y(Ltr2/h;Ltb/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(ILtb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Ltr2/g;->x(ILtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Ltr2/g;->r(Ltb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(ILtb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Ltr2/g;->w(ILtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Ltb/a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Ltr2/g;->s(Ltb/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Ljava/lang/String;Ljava/lang/String;ILtb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltr2/g;->v(Ljava/lang/String;Ljava/lang/String;ILtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static q()Ljava/util/List;
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

.method private static synthetic r(Ltb/a;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "SELECT COUNT(*) FROM table_log_stream"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p0, v1}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v1, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic s(Ltb/a;)Ljava/lang/Object;
    .locals 1

    const-string v0, "DELETE FROM table_log_stream"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception v0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic t(Ljava/lang/String;Ltb/a;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "DELETE FROM table_log_stream WHERE utc_date_time <= ?"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p0, :cond_0

    :try_start_0
    invoke-interface {v0, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    invoke-interface {v0, v1, p0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-interface {v0}, Ltb/c;->e1()Z

    invoke-static {p1}, Lj93/l0;->H(Ltb/a;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    return-object p0

    :goto_1
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic u(Ljava/lang/String;Ljava/lang/String;ILtb/a;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "DELETE FROM table_log_stream WHERE id IN(SELECT id FROM table_log_stream WHERE utc_date_time >= ? AND utc_date_time <= ? ORDER BY utc_date_time ASC LIMIT ?)"

    invoke-interface {p3, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p0, :cond_0

    :try_start_0
    invoke-interface {v0, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_0
    invoke-interface {v0, v1, p0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    const/4 p0, 0x2

    if-nez p1, :cond_1

    invoke-interface {v0, p0}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-interface {v0, p0, p1}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    const/4 p0, 0x3

    int-to-long p1, p2

    invoke-interface {v0, p0, p1, p2}, Ltb/c;->p(IJ)V

    invoke-interface {v0}, Ltb/c;->e1()Z

    invoke-static {p3}, Lj93/l0;->H(Ltb/a;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    return-object p0

    :goto_2
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic v(Ljava/lang/String;Ljava/lang/String;ILtb/a;)Ljava/util/List;
    .locals 8

    const-string v0, "SELECT * FROM table_log_stream WHERE utc_date_time >= ? AND utc_date_time <= ? ORDER BY utc_date_time ASC LIMIT ?"

    invoke-interface {p3, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p3

    const/4 v0, 0x1

    if-nez p0, :cond_0

    :try_start_0
    invoke-interface {p3, v0}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto/16 :goto_7

    :cond_0
    invoke-interface {p3, v0, p0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    const/4 p0, 0x2

    if-nez p1, :cond_1

    invoke-interface {p3, p0}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p3, p0, p1}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    const/4 p0, 0x3

    int-to-long p1, p2

    invoke-interface {p3, p0, p1, p2}, Ltb/c;->p(IJ)V

    const-string p0, "user_id"

    invoke-static {p3, p0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p0

    const-string p1, "utc_date_time"

    invoke-static {p3, p1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p1

    const-string p2, "local_date_time"

    invoke-static {p3, p2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p2

    const-string v0, "body"

    invoke-static {p3, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "id"

    invoke-static {p3, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    invoke-interface {p3}, Ltb/c;->e1()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p3, p0}, Ltb/c;->isNull(I)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    move-object v3, v4

    goto :goto_3

    :cond_2
    invoke-interface {p3, p0}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :goto_3
    invoke-interface {p3, p1}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_3

    move-object v5, v4

    goto :goto_4

    :cond_3
    invoke-interface {p3, p1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v5

    :goto_4
    invoke-interface {p3, p2}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_4

    move-object v6, v4

    goto :goto_5

    :cond_4
    invoke-interface {p3, p2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_5
    invoke-interface {p3, v0}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_6

    :cond_5
    invoke-interface {p3, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_6
    new-instance v7, Ltr2/h;

    invoke-direct {v7, v3, v5, v6, v4}, Ltr2/h;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v1}, Ltb/c;->getLong(I)J

    move-result-wide v3

    invoke-virtual {v7, v3, v4}, Ltr2/h;->f(J)V

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_6
    invoke-interface {p3}, Ljava/lang/AutoCloseable;->close()V

    return-object v2

    :goto_7
    invoke-interface {p3}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic w(ILtb/a;)Ljava/util/List;
    .locals 3

    const-string v0, "SELECT body FROM table_log_stream ORDER BY utc_date_time DESC LIMIT ?"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ltb/c;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {p1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object p0

    :goto_2
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic x(ILtb/a;)Ljava/util/List;
    .locals 10

    const-string v0, "SELECT * FROM table_log_stream LIMIT ?"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    const-string p0, "user_id"

    invoke-static {p1, p0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p0

    const-string v0, "utc_date_time"

    invoke-static {p1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "local_date_time"

    invoke-static {p1, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    const-string v2, "body"

    invoke-static {p1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "id"

    invoke-static {p1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {p1, p0}, Ltb/c;->isNull(I)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    move-object v5, v6

    goto :goto_1

    :cond_0
    invoke-interface {p1, p0}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v5, v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :goto_1
    invoke-interface {p1, v0}, Ltb/c;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_1

    move-object v7, v6

    goto :goto_2

    :cond_1
    invoke-interface {p1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v7

    :goto_2
    invoke-interface {p1, v1}, Ltb/c;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_2

    move-object v8, v6

    goto :goto_3

    :cond_2
    invoke-interface {p1, v1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    :goto_3
    invoke-interface {p1, v2}, Ltb/c;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_3

    goto :goto_4

    :cond_3
    invoke-interface {p1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v6

    :goto_4
    new-instance v9, Ltr2/h;

    invoke-direct {v9, v5, v7, v8, v6}, Ltr2/h;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v5

    invoke-virtual {v9, v5, v6}, Ltr2/h;->f(J)V

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_5

    :cond_4
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object v4

    :goto_5
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private synthetic y(Ltr2/h;Ltb/a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltr2/g;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private static z(Ljava/lang/String;Landroidx/room/l1;Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-interface {p2, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    iget-object p1, p1, Landroidx/room/l1;->a:La6/i;

    invoke-virtual {p1, p0}, La6/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p0, p2}, Ltb/c;->getLong(I)J

    move-result-wide p1

    long-to-int p2, p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object p1

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method


# virtual methods
.method public a(Lub/g;)I
    .locals 4

    sget-object v0, Landroidx/room/n1;->I:Ljava/util/TreeMap;

    const-string v0, "supportSQLiteQuery"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lub/g;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lub/g;->b()I

    move-result v1

    invoke-static {v1, v0}, Lq83/g;->h(ILjava/lang/String;)Landroidx/room/n1;

    move-result-object v0

    new-instance v1, Landroidx/room/m1;

    invoke-direct {v1, v0}, Landroidx/room/m1;-><init>(Landroidx/room/n1;)V

    invoke-interface {p1, v1}, Lub/g;->i(Lub/f;)V

    new-instance p1, Landroidx/room/l1;

    invoke-virtual {v0}, Landroidx/room/n1;->h()Ljava/lang/String;

    move-result-object v1

    new-instance v2, La6/i;

    const/4 v3, 0x4

    invoke-direct {v2, v0, v3}, La6/i;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, v1, v2}, Landroidx/room/l1;-><init>(Ljava/lang/String;La6/i;)V

    iget-object v0, p0, Ltr2/g;->a:Landroidx/room/z0;

    new-instance v2, Lp3/b0;

    const/16 v3, 0xd

    invoke-direct {v2, v3, v1, p1}, Lp3/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, v2}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public b(ILjava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ltr2/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ltr2/g;->a:Landroidx/room/z0;

    new-instance v1, Lf0/m1;

    const/4 v2, 0x2

    invoke-direct {v1, p2, p3, p1, v2}, Lf0/m1;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public c(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Ltr2/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ltr2/g;->a:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/e;

    const/4 v2, 0x7

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/wipeable/e;-><init>(II)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public count()I
    .locals 4

    iget-object v0, p0, Ltr2/g;->a:Landroidx/room/z0;

    new-instance v1, Lto1/h;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lto1/h;-><init>(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public d(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Ltr2/g;->a:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/e;

    const/16 v2, 0x1a

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/persistent/e;-><init>(II)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deleteAll()V
    .locals 4

    iget-object v0, p0, Ltr2/g;->a:Landroidx/room/z0;

    new-instance v1, Lt71/i;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lt71/i;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public e(ILjava/lang/String;Ljava/lang/String;)I
    .locals 3

    iget-object v0, p0, Ltr2/g;->a:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/d;

    const/16 v2, 0x10

    invoke-direct {v1, p2, p3, p1, v2}, Lcom/whoop/data/local/room/dao/wipeable/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public f(Ltr2/h;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ltr2/g;->a:Landroidx/room/z0;

    new-instance v1, Lp3/b0;

    const/16 v2, 0xc

    invoke-direct {v1, v2, p0, p1}, Lp3/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public g(Ljava/lang/String;)I
    .locals 3

    iget-object v0, p0, Ltr2/g;->a:Landroidx/room/z0;

    new-instance v1, Le61/g;

    const/16 v2, 0x15

    invoke-direct {v1, p1, v2}, Le61/g;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
