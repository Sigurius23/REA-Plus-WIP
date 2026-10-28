.class public final Lio/getstream/android/video/generated/models/UserResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008%\n\u0002\u0010\u000b\n\u0002\u0008\u0018\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00dd\u0001\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0002\u0012\u000e\u0008\u0003\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t\u0012\u000e\u0008\u0003\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t\u0012\u0016\u0008\u0003\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000c\u0012\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0008\u0003\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00040\tH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0016\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00040\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001aJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001aJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\u001cJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010\u001aJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010\u001cJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010\u001aJ\u001e\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010$J\u00e6\u0001\u0010.\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00022\u000e\u0008\u0003\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t2\u000e\u0008\u0003\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t2\u0016\u0008\u0003\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000c2\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0016\u0008\u0003\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u00080\u0010\u001cJ\u0010\u00101\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u00081\u00102J\u001a\u00105\u001a\u0002042\u0008\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00109\u001a\u0004\u0008:\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00109\u001a\u0004\u0008;\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00109\u001a\u0004\u0008<\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00107\u001a\u0004\u0008=\u0010\u001aR\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010>\u001a\u0004\u0008?\u0010!R\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010>\u001a\u0004\u0008@\u0010!R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010A\u001a\u0004\u0008B\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010C\u001a\u0004\u0008D\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u00107\u001a\u0004\u0008E\u0010\u001aR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u00107\u001a\u0004\u0008F\u0010\u001aR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u00109\u001a\u0004\u0008G\u0010\u001cR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u00107\u001a\u0004\u0008H\u0010\u001aR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u00109\u001a\u0004\u0008I\u0010\u001cR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u00107\u001a\u0004\u0008J\u0010\u001aR%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010A\u001a\u0004\u0008K\u0010$\u00a8\u0006L"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/UserResponse;",
        "",
        "Ljg3/i;",
        "createdAt",
        "",
        "id",
        "language",
        "role",
        "updatedAt",
        "",
        "blockedUserIds",
        "teams",
        "",
        "custom",
        "",
        "avgResponseTime",
        "deactivatedAt",
        "deletedAt",
        "image",
        "lastActive",
        "name",
        "revokeTokensIssuedBefore",
        "teamsRole",
        "<init>",
        "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/util/Map;)V",
        "component1",
        "()Ljg3/i;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "component8",
        "()Ljava/util/Map;",
        "component9",
        "()Ljava/lang/Integer;",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "copy",
        "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/util/Map;)Lio/getstream/android/video/generated/models/UserResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljg3/i;",
        "getCreatedAt",
        "Ljava/lang/String;",
        "getId",
        "getLanguage",
        "getRole",
        "getUpdatedAt",
        "Ljava/util/List;",
        "getBlockedUserIds",
        "getTeams",
        "Ljava/util/Map;",
        "getCustom",
        "Ljava/lang/Integer;",
        "getAvgResponseTime",
        "getDeactivatedAt",
        "getDeletedAt",
        "getImage",
        "getLastActive",
        "getName",
        "getRevokeTokensIssuedBefore",
        "getTeamsRole",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final avgResponseTime:Ljava/lang/Integer;

.field private final blockedUserIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final createdAt:Ljg3/i;

.field private final custom:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final deactivatedAt:Ljg3/i;

.field private final deletedAt:Ljg3/i;

.field private final id:Ljava/lang/String;

.field private final image:Ljava/lang/String;

.field private final language:Ljava/lang/String;

.field private final lastActive:Ljg3/i;

.field private final name:Ljava/lang/String;

.field private final revokeTokensIssuedBefore:Ljg3/i;

.field private final role:Ljava/lang/String;

.field private final teams:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final teamsRole:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final updatedAt:Ljg3/i;


# direct methods
.method public constructor <init>(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "language"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "role"
        .end annotation
    .end param
    .param p5    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "updated_at"
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "blocked_user_ids"
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "teams"
        .end annotation
    .end param
    .param p8    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .param p9    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "avg_response_time"
        .end annotation
    .end param
    .param p10    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "deactivated_at"
        .end annotation
    .end param
    .param p11    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "deleted_at"
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "image"
        .end annotation
    .end param
    .param p13    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "last_active"
        .end annotation
    .end param
    .param p14    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "name"
        .end annotation
    .end param
    .param p15    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "revoke_tokens_issued_before"
        .end annotation
    .end param
    .param p16    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "teams_role"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljg3/i;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "createdAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "language"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "blockedUserIds"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teams"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "custom"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/UserResponse;->createdAt:Ljg3/i;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/UserResponse;->id:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/UserResponse;->language:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/UserResponse;->role:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/UserResponse;->updatedAt:Ljg3/i;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/UserResponse;->blockedUserIds:Ljava/util/List;

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/UserResponse;->teams:Ljava/util/List;

    .line 9
    iput-object p8, p0, Lio/getstream/android/video/generated/models/UserResponse;->custom:Ljava/util/Map;

    .line 10
    iput-object p9, p0, Lio/getstream/android/video/generated/models/UserResponse;->avgResponseTime:Ljava/lang/Integer;

    .line 11
    iput-object p10, p0, Lio/getstream/android/video/generated/models/UserResponse;->deactivatedAt:Ljg3/i;

    .line 12
    iput-object p11, p0, Lio/getstream/android/video/generated/models/UserResponse;->deletedAt:Ljg3/i;

    .line 13
    iput-object p12, p0, Lio/getstream/android/video/generated/models/UserResponse;->image:Ljava/lang/String;

    .line 14
    iput-object p13, p0, Lio/getstream/android/video/generated/models/UserResponse;->lastActive:Ljg3/i;

    .line 15
    iput-object p14, p0, Lio/getstream/android/video/generated/models/UserResponse;->name:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 16
    iput-object p1, p0, Lio/getstream/android/video/generated/models/UserResponse;->revokeTokensIssuedBefore:Ljg3/i;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lio/getstream/android/video/generated/models/UserResponse;->teamsRole:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p17

    and-int/lit8 v1, v0, 0x20

    .line 18
    sget-object v2, Lm83/y;->w:Lm83/y;

    if-eqz v1, :cond_0

    move-object v9, v2

    goto :goto_0

    :cond_0
    move-object/from16 v9, p6

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    move-object v10, v2

    goto :goto_1

    :cond_1
    move-object/from16 v10, p7

    :goto_1
    and-int/lit16 v1, v0, 0x80

    sget-object v2, Lm83/z;->w:Lm83/z;

    if-eqz v1, :cond_2

    move-object v11, v2

    goto :goto_2

    :cond_2
    move-object/from16 v11, p8

    :goto_2
    and-int/lit16 v1, v0, 0x100

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    move-object v12, v3

    goto :goto_3

    :cond_3
    move-object/from16 v12, p9

    :goto_3
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_4

    move-object v13, v3

    goto :goto_4

    :cond_4
    move-object/from16 v13, p10

    :goto_4
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_5

    move-object v14, v3

    goto :goto_5

    :cond_5
    move-object/from16 v14, p11

    :goto_5
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_6

    move-object v15, v3

    goto :goto_6

    :cond_6
    move-object/from16 v15, p12

    :goto_6
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_7

    move-object/from16 v16, v3

    goto :goto_7

    :cond_7
    move-object/from16 v16, p13

    :goto_7
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_8

    move-object/from16 v17, v3

    goto :goto_8

    :cond_8
    move-object/from16 v17, p14

    :goto_8
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_9

    move-object/from16 v18, v3

    goto :goto_9

    :cond_9
    move-object/from16 v18, p15

    :goto_9
    const v1, 0x8000

    and-int/2addr v0, v1

    if-eqz v0, :cond_a

    move-object/from16 v19, v2

    :goto_a
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    goto :goto_b

    :cond_a
    move-object/from16 v19, p16

    goto :goto_a

    :goto_b
    invoke-direct/range {v3 .. v19}, Lio/getstream/android/video/generated/models/UserResponse;-><init>(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/UserResponse;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/UserResponse;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/android/video/generated/models/UserResponse;->createdAt:Ljg3/i;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/android/video/generated/models/UserResponse;->id:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/android/video/generated/models/UserResponse;->language:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/android/video/generated/models/UserResponse;->role:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/android/video/generated/models/UserResponse;->updatedAt:Ljg3/i;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/android/video/generated/models/UserResponse;->blockedUserIds:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/android/video/generated/models/UserResponse;->teams:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lio/getstream/android/video/generated/models/UserResponse;->custom:Ljava/util/Map;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/getstream/android/video/generated/models/UserResponse;->avgResponseTime:Ljava/lang/Integer;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lio/getstream/android/video/generated/models/UserResponse;->deactivatedAt:Ljg3/i;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/android/video/generated/models/UserResponse;->deletedAt:Ljg3/i;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/android/video/generated/models/UserResponse;->image:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/android/video/generated/models/UserResponse;->lastActive:Ljg3/i;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/android/video/generated/models/UserResponse;->name:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lio/getstream/android/video/generated/models/UserResponse;->revokeTokensIssuedBefore:Ljg3/i;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lio/getstream/android/video/generated/models/UserResponse;->teamsRole:Ljava/util/Map;

    move-object/from16 p17, v1

    :goto_f
    move-object/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_10

    :cond_f
    move-object/from16 p17, p16

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p17}, Lio/getstream/android/video/generated/models/UserResponse;->copy(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/util/Map;)Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final component10()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->deactivatedAt:Ljg3/i;

    return-object v0
.end method

.method public final component11()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->deletedAt:Ljg3/i;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->lastActive:Ljg3/i;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->revokeTokensIssuedBefore:Ljg3/i;

    return-object v0
.end method

.method public final component16()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->teamsRole:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->language:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->updatedAt:Ljg3/i;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->blockedUserIds:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->teams:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public final component9()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->avgResponseTime:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/util/Map;)Lio/getstream/android/video/generated/models/UserResponse;
    .locals 18
    .param p1    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "language"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "role"
        .end annotation
    .end param
    .param p5    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "updated_at"
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "blocked_user_ids"
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "teams"
        .end annotation
    .end param
    .param p8    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .param p9    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "avg_response_time"
        .end annotation
    .end param
    .param p10    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "deactivated_at"
        .end annotation
    .end param
    .param p11    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "deleted_at"
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "image"
        .end annotation
    .end param
    .param p13    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "last_active"
        .end annotation
    .end param
    .param p14    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "name"
        .end annotation
    .end param
    .param p15    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "revoke_tokens_issued_before"
        .end annotation
    .end param
    .param p16    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "teams_role"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljg3/i;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/android/video/generated/models/UserResponse;"
        }
    .end annotation

    const-string v0, "createdAt"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "language"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "blockedUserIds"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teams"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "custom"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/UserResponse;

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    invoke-direct/range {v1 .. v17}, Lio/getstream/android/video/generated/models/UserResponse;-><init>(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/UserResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/UserResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserResponse;->createdAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserResponse;->createdAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserResponse;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserResponse;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserResponse;->language:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserResponse;->language:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserResponse;->role:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserResponse;->role:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserResponse;->updatedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserResponse;->updatedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserResponse;->blockedUserIds:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserResponse;->blockedUserIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserResponse;->teams:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserResponse;->teams:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserResponse;->custom:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserResponse;->custom:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserResponse;->avgResponseTime:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserResponse;->avgResponseTime:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserResponse;->deactivatedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserResponse;->deactivatedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserResponse;->deletedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserResponse;->deletedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserResponse;->image:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserResponse;->image:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserResponse;->lastActive:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserResponse;->lastActive:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserResponse;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserResponse;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserResponse;->revokeTokensIssuedBefore:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserResponse;->revokeTokensIssuedBefore:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserResponse;->teamsRole:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/UserResponse;->teamsRole:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getAvgResponseTime()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->avgResponseTime:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getBlockedUserIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->blockedUserIds:Ljava/util/List;

    return-object v0
.end method

.method public final getCreatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final getCustom()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public final getDeactivatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->deactivatedAt:Ljg3/i;

    return-object v0
.end method

.method public final getDeletedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->deletedAt:Ljg3/i;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final getLanguage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->language:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastActive()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->lastActive:Ljg3/i;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getRevokeTokensIssuedBefore()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->revokeTokensIssuedBefore:Ljg3/i;

    return-object v0
.end method

.method public final getRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final getTeams()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->teams:Ljava/util/List;

    return-object v0
.end method

.method public final getTeamsRole()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->teamsRole:Ljava/util/Map;

    return-object v0
.end method

.method public final getUpdatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->updatedAt:Ljg3/i;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserResponse;->createdAt:Ljg3/i;

    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserResponse;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserResponse;->language:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserResponse;->role:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserResponse;->updatedAt:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserResponse;->blockedUserIds:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserResponse;->teams:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserResponse;->custom:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserResponse;->avgResponseTime:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserResponse;->deactivatedAt:Ljg3/i;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljg3/i;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserResponse;->deletedAt:Ljg3/i;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljg3/i;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserResponse;->image:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserResponse;->lastActive:Ljg3/i;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljg3/i;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserResponse;->name:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserResponse;->revokeTokensIssuedBefore:Ljg3/i;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljg3/i;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserResponse;->teamsRole:Ljava/util/Map;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/android/video/generated/models/UserResponse;->createdAt:Ljg3/i;

    iget-object v2, v0, Lio/getstream/android/video/generated/models/UserResponse;->id:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/android/video/generated/models/UserResponse;->language:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/android/video/generated/models/UserResponse;->role:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/android/video/generated/models/UserResponse;->updatedAt:Ljg3/i;

    iget-object v6, v0, Lio/getstream/android/video/generated/models/UserResponse;->blockedUserIds:Ljava/util/List;

    iget-object v7, v0, Lio/getstream/android/video/generated/models/UserResponse;->teams:Ljava/util/List;

    iget-object v8, v0, Lio/getstream/android/video/generated/models/UserResponse;->custom:Ljava/util/Map;

    iget-object v9, v0, Lio/getstream/android/video/generated/models/UserResponse;->avgResponseTime:Ljava/lang/Integer;

    iget-object v10, v0, Lio/getstream/android/video/generated/models/UserResponse;->deactivatedAt:Ljg3/i;

    iget-object v11, v0, Lio/getstream/android/video/generated/models/UserResponse;->deletedAt:Ljg3/i;

    iget-object v12, v0, Lio/getstream/android/video/generated/models/UserResponse;->image:Ljava/lang/String;

    iget-object v13, v0, Lio/getstream/android/video/generated/models/UserResponse;->lastActive:Ljg3/i;

    iget-object v14, v0, Lio/getstream/android/video/generated/models/UserResponse;->name:Ljava/lang/String;

    iget-object v15, v0, Lio/getstream/android/video/generated/models/UserResponse;->revokeTokensIssuedBefore:Ljg3/i;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/UserResponse;->teamsRole:Ljava/util/Map;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v17, v15

    const-string v15, "UserResponse(createdAt="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", language="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", role="

    const-string v2, ", updatedAt="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", blockedUserIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", teams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", custom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", avgResponseTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deactivatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deletedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", image="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", lastActive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", revokeTokensIssuedBefore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", teamsRole="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
