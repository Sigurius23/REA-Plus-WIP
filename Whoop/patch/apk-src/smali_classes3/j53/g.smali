.class public abstract Lj53/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lea2/l;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_RTMP:Lstream/video/sfu/models/ParticipantSource;

    sget-object v1, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_WHIP:Lstream/video/sfu/models/ParticipantSource;

    sget-object v2, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_SRT:Lstream/video/sfu/models/ParticipantSource;

    sget-object v3, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_RTSP:Lstream/video/sfu/models/ParticipantSource;

    filled-new-array {v0, v1, v2, v3}, [Lstream/video/sfu/models/ParticipantSource;

    move-result-object v0

    new-instance v1, Lj43/a;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Lea2/l;

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lj53/g;->a:Lea2/l;

    return-void
.end method

.method public static final a(Lj53/f;Ljava/util/Map;)Ljava/util/Comparator;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lj53/a;->y:Lj53/a;

    const-string v3, "<this>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "pins"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lj53/c;->a:Lj53/c;

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/16 v5, 0x8

    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x6

    sget-object v13, Lj53/b;->c:Ldb/k0;

    sget-object v14, Lj53/b;->g:Ldb/k0;

    sget-object v15, Lj53/b;->e:Ldb/k0;

    sget-object v16, Lj53/b;->d:Ldb/k0;

    sget-object v17, Lj53/g;->a:Lea2/l;

    sget-object v18, Lj53/b;->f:Ldb/k0;

    sget-object v19, Lj53/b;->b:Ldb/k0;

    sget-object v20, Lj53/b;->a:Ldb/k0;

    if-eqz v4, :cond_0

    new-instance v0, Lea2/l;

    invoke-direct {v0, v1, v5}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    new-array v1, v12, [Ljava/util/Comparator;

    aput-object v20, v1, v11

    aput-object v19, v1, v10

    aput-object v18, v1, v9

    aput-object v17, v1, v8

    aput-object v16, v1, v7

    aput-object v15, v1, v6

    new-instance v3, Lea2/l;

    invoke-direct {v3, v1, v12}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lio/getstream/chat/android/models/querysort/a;

    invoke-direct {v1, v2, v3}, Lio/getstream/chat/android/models/querysort/a;-><init>(Lc93/m;Ljava/util/Comparator;)V

    new-instance v3, Lio/getstream/chat/android/models/querysort/a;

    invoke-direct {v3, v2, v14}, Lio/getstream/chat/android/models/querysort/a;-><init>(Lc93/m;Ljava/util/Comparator;)V

    new-array v2, v7, [Ljava/util/Comparator;

    aput-object v13, v2, v11

    aput-object v0, v2, v10

    aput-object v1, v2, v9

    aput-object v3, v2, v8

    new-instance v0, Lea2/l;

    invoke-direct {v0, v2, v12}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :cond_0
    sget-object v4, Lj53/e;->a:Lj53/e;

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    new-instance v0, Lea2/l;

    invoke-direct {v0, v1, v5}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    new-array v1, v6, [Ljava/util/Comparator;

    aput-object v19, v1, v11

    aput-object v18, v1, v10

    aput-object v17, v1, v9

    aput-object v16, v1, v8

    aput-object v15, v1, v7

    new-instance v2, Lea2/l;

    invoke-direct {v2, v1, v12}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Lj53/a;->x:Lj53/a;

    new-instance v3, Lio/getstream/chat/android/models/querysort/a;

    invoke-direct {v3, v1, v2}, Lio/getstream/chat/android/models/querysort/a;-><init>(Lc93/m;Ljava/util/Comparator;)V

    new-instance v2, Lio/getstream/chat/android/models/querysort/a;

    invoke-direct {v2, v1, v14}, Lio/getstream/chat/android/models/querysort/a;-><init>(Lc93/m;Ljava/util/Comparator;)V

    new-array v1, v6, [Ljava/util/Comparator;

    aput-object v13, v1, v11

    aput-object v0, v1, v10

    aput-object v20, v1, v9

    aput-object v3, v1, v8

    aput-object v2, v1, v7

    new-instance v0, Lea2/l;

    invoke-direct {v0, v1, v12}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :cond_1
    sget-object v4, Lj53/d;->a:Lj53/d;

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-array v0, v12, [Ljava/util/Comparator;

    aput-object v20, v0, v11

    aput-object v19, v0, v10

    aput-object v18, v0, v9

    aput-object v17, v0, v8

    aput-object v16, v0, v7

    aput-object v15, v0, v6

    new-instance v1, Lea2/l;

    invoke-direct {v1, v0, v12}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Lio/getstream/chat/android/models/querysort/a;

    invoke-direct {v0, v2, v1}, Lio/getstream/chat/android/models/querysort/a;-><init>(Lc93/m;Ljava/util/Comparator;)V

    const-string v1, "host"

    const-string v3, "speaker"

    const-string v4, "admin"

    filled-new-array {v4, v1, v3}, [Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lea2/l;

    const/16 v4, 0x9

    invoke-direct {v3, v1, v4}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lio/getstream/chat/android/models/querysort/a;

    invoke-direct {v1, v2, v14}, Lio/getstream/chat/android/models/querysort/a;-><init>(Lc93/m;Ljava/util/Comparator;)V

    new-array v2, v8, [Ljava/util/Comparator;

    aput-object v0, v2, v11

    aput-object v3, v2, v10

    aput-object v1, v2, v9

    new-instance v0, Lea2/l;

    invoke-direct {v0, v2, v12}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :cond_2
    invoke-static {v3, v1}, Lj53/g;->a(Lj53/f;Ljava/util/Map;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method
