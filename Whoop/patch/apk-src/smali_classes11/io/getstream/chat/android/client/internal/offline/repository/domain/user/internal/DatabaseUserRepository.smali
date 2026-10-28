.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/persistance/repository/UserRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J!\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\u00170\u0016H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\r2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0096@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008 \u0010!J\u0018\u0010\"\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\"\u0010!J\u001a\u0010$\u001a\u0004\u0018\u00010\u000b2\u0006\u0010#\u001a\u00020\u0018H\u0096@\u00a2\u0006\u0004\u0008$\u0010%J$\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u000b0&2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00180&H\u0096@\u00a2\u0006\u0004\u0008(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010+R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R&\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\u0017058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:\u00a8\u0006<"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;",
        "userDao",
        "",
        "cacheSize",
        "<init>",
        "(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;I)V",
        "",
        "Lio/getstream/chat/android/models/User;",
        "users",
        "Ll83/a0;",
        "cacheUsers",
        "(Ljava/util/Collection;)V",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
        "toEntity",
        "(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
        "userEntity",
        "toModel",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;)Lio/getstream/chat/android/models/User;",
        "Lec3/f2;",
        "",
        "",
        "observeLatestUsers",
        "()Lec3/f2;",
        "clear",
        "(Lq83/d;)Ljava/lang/Object;",
        "insertUsers",
        "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;",
        "user",
        "insertUser",
        "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "insertCurrentUser",
        "userId",
        "selectUser",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "ids",
        "selectUsers",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "La0/a0;",
        "userCache",
        "La0/a0;",
        "Lec3/p1;",
        "latestUsersFlow",
        "Lec3/p1;",
        "Lmc3/a;",
        "dbMutex",
        "Lmc3/a;",
        "Companion",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$Companion;

.field private static final ME_ID:Ljava/lang/String; = "me"


# instance fields
.field private final dbMutex:Lmc3/a;

.field private final latestUsersFlow:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final scope:Lbc3/c0;

.field private final userCache:La0/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La0/a0;"
        }
    .end annotation
.end field

.field private final userDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$Companion;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;I)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->scope:Lbc3/c0;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->userDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;

    .line 4
    const-string p1, "Chat:UserRepository"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->logger$delegate:Ll83/h;

    .line 5
    new-instance p1, La0/a0;

    invoke-direct {p1, p3}, La0/a0;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->userCache:La0/a0;

    .line 6
    sget-object p1, Lm83/z;->w:Lm83/z;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->latestUsersFlow:Lec3/p1;

    .line 7
    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->dbMutex:Lmc3/a;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/16 p3, 0x3e8

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;-><init>(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;I)V

    return-void
.end method

.method public static final synthetic access$getLatestUsersFlow$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->latestUsersFlow:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getUserCache$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;)La0/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->userCache:La0/a0;

    return-object p0
.end method

.method public static final synthetic access$getUserDao$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->userDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;

    return-object p0
.end method

.method public static final synthetic access$toEntity(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->toEntity(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    move-result-object p0

    return-object p0
.end method

.method private final cacheUsers(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/User;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/User;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->userCache:La0/a0;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->scope:Lbc3/c0;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$cacheUsers$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$cacheUsers$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final toEntity(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;
    .locals 19

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getImage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getRole()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getCreatedAt()Ljava/util/Date;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getUpdatedAt()Ljava/util/Date;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getLastActive()Ljava/util/Date;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->isInvisible()Z

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getPrivacySettings()Lio/getstream/chat/android/PrivacySettings;

    move-result-object v0

    const/4 v10, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsMapperKt;->toEntity(Lio/getstream/chat/android/PrivacySettings;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v10

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->isBanned()Z

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getMutes()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v12, v14}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lio/getstream/chat/android/models/Mute;

    invoke-static {v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteMapperKt;->toEntity(Lio/getstream/chat/android/models/Mute;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;

    move-result-object v14

    invoke-interface {v13, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getTeams()Ljava/util/List;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getTeamsRole()Ljava/util/Map;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getAvgResponseTime()Ljava/lang/Long;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getPushPreference()Lio/getstream/chat/android/models/PushPreference;

    move-result-object v15

    if-eqz v15, :cond_2

    invoke-static {v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceMapperKt;->toEntity(Lio/getstream/chat/android/models/PushPreference;)Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;

    move-result-object v10

    :cond_2
    move-object/from16 v17, v10

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getExtraData()Ljava/util/Map;

    move-result-object v15

    move-object v10, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    move-object/from16 v18, v13

    move-object v13, v12

    move-object/from16 v12, v18

    invoke-direct/range {v0 .. v17}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZLio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;)V

    return-object v0
.end method

.method private final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;)Lio/getstream/chat/android/models/User;
    .locals 29

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getOriginalId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getImage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getRole()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getLastActive()Ljava/util/Date;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getInvisible()Z

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getPrivacySettings()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-static {v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;)Lio/getstream/chat/android/PrivacySettings;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v6

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getBanned()Z

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getMutes()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v8, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;

    invoke-static {v10}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;)Lio/getstream/chat/android/models/Mute;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getTeams()Ljava/util/List;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getTeamsRole()Ljava/util/Map;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getAvgResponseTime()Ljava/lang/Long;

    move-result-object v22

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getPushPreference()Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;

    move-result-object v8

    if-eqz v8, :cond_2

    invoke-static {v8}, Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;)Lio/getstream/chat/android/models/PushPreference;

    move-result-object v6

    :cond_2
    move-object/from16 v23, v6

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->getExtraData()Ljava/util/Map;

    move-result-object v6

    invoke-static {v6}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v24

    move v6, v0

    new-instance v0, Lio/getstream/chat/android/models/User;

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    const v26, 0x118e340

    const/16 v27, 0x0

    const/4 v7, 0x0

    move-object/from16 v17, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v25, 0x0

    move-object/from16 v28, v6

    move-object v6, v5

    move-object/from16 v5, v28

    invoke-direct/range {v0 .. v27}, Lio/getstream/chat/android/models/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final clear(Lq83/d;)Ljava/lang/Object;
    .locals 8
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

    instance-of v0, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;->I$0:I

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v5

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->dbMutex:Lmc3/a;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;->I$0:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;->label:I

    invoke-interface {p1, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    move v2, v3

    :goto_1
    :try_start_1
    iget-object v5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->userDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;->L$0:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;->I$1:I

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$clear$1;->label:I

    invoke-interface {v5, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v0, p1

    :goto_3
    invoke-interface {v0, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_1
    move-exception v0

    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    :goto_4
    invoke-interface {v0, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public final insertCurrentUser(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/User;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/User;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$1;->label:I

    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->insertUser(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->scope:Lbc3/c0;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->dbMutex:Lmc3/a;

    new-instance v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;

    const/4 v5, 0x0

    invoke-direct {v4, p0, p1, v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;Lio/getstream/chat/android/models/User;Lq83/d;)V

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertCurrentUser$1;->label:I

    invoke-static {p2, v2, v4, v0}, Lio/getstream/chat/android/client/internal/offline/extensions/CoroutineScopeExtensionsKt;->launchWithMutex(Lbc3/c0;Lmc3/a;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertUser(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/models/User;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->userCache:La0/a0;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Lio/getstream/chat/android/models/User;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/User;

    invoke-direct {p0, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->toEntity(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->cacheUsers(Ljava/util/Collection;)V

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->scope:Lbc3/c0;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->dbMutex:Lmc3/a;

    new-instance v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertUsers$2;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v0, p1, v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$insertUsers$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;Ljava/util/List;Ljava/util/Collection;Lq83/d;)V

    invoke-static {v2, v3, v4, p2}, Lio/getstream/chat/android/client/internal/offline/extensions/CoroutineScopeExtensionsKt;->launchWithMutex(Lbc3/c0;Lmc3/a;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_4

    return-object p1

    :cond_4
    return-object v1
.end method

.method public final observeLatestUsers()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->latestUsersFlow:Lec3/p1;

    return-object v0
.end method

.method public final selectUser(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/User;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUser$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUser$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUser$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUser$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUser$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUser$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUser$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUser$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUser$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->userCache:La0/a0;

    invoke-virtual {p2, p1}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/User;

    if-nez p2, :cond_5

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->userDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUser$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUser$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;->select(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    if-eqz p2, :cond_4

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;)Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->cacheUsers(Ljava/util/Collection;)V

    return-object p1

    :cond_4
    return-object v3

    :cond_5
    return-object p2
.end method

.method public final selectUsers(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUsers$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUsers$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUsers$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUsers$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUsers$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUsers$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUsers$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUsers$1;->label:I

    const/16 v3, 0xa

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUsers$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/util/Collection;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUsers$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUsers$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUsers$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->userCache:La0/a0;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v2, v6}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/User;

    if-eqz v6, :cond_3

    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/User;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-static {v2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {p1, v2}, Lm83/s;->c1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->userDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;

    const/4 v5, 0x0

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUsers$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUsers$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUsers$1;->L$2:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUsers$1;->L$3:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository$selectUsers$1;->label:I

    invoke-interface {v2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;->select(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_3
    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    invoke-direct {p0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;)Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;->cacheUsers(Ljava/util/Collection;)V

    invoke-static {p1, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method
