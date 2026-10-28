.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 42\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ$\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0006H\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u000bJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0013J%\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J-\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001eR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00070\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103\u00a8\u00065"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;",
        "Landroidx/room/z0;",
        "__db",
        "<init>",
        "(Landroidx/room/z0;)V",
        "",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
        "users",
        "Ll83/a0;",
        "insertMany",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "userEntity",
        "insert",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;Lq83/d;)Ljava/lang/Object;",
        "",
        "ids",
        "select",
        "id",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "limit",
        "offset",
        "selectAllUser",
        "(II)Ljava/util/List;",
        "searchString",
        "selectUsersLikeName",
        "(Ljava/lang/String;II)Ljava/util/List;",
        "deleteAll",
        "(Lq83/d;)Ljava/lang/Object;",
        "Landroidx/room/z0;",
        "Landroidx/room/k;",
        "__insertAdapterOfUserEntity",
        "Landroidx/room/k;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;",
        "__dateConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;",
        "__privacySettingsConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;",
        "__listConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;",
        "__mapConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;",
        "__extraDataConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;",
        "__pushPreferenceConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;",
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
.field public static final Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$Companion;


# instance fields
.field private final __dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

.field private final __db:Landroidx/room/z0;

.field private final __extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

.field private final __insertAdapterOfUserEntity:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

.field private final __mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

.field private final __privacySettingsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;

.field private final __pushPreferenceConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    const-string v0, "__db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__privacySettingsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__pushPreferenceConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__insertAdapterOfUserEntity:Landroidx/room/k;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ltb/a;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->select$lambda$2(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    return-object p0
.end method

.method public static final synthetic access$get__extraDataConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    return-object p0
.end method

.method public static final synthetic access$get__listConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    return-object p0
.end method

.method public static final synthetic access$get__mapConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    return-object p0
.end method

.method public static final synthetic access$get__privacySettingsConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__privacySettingsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;

    return-object p0
.end method

.method public static final synthetic access$get__pushPreferenceConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__pushPreferenceConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;

    return-object p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ljava/util/List;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->insertMany$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic c(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_user WHERE stream_chat_user.id IN (?)"

    invoke-static {v0, p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->select$lambda$3(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(IILio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ltb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_user ORDER BY name ASC LIMIT ? OFFSET ?"

    invoke-static {v0, p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->selectAllUser$lambda$4(Ljava/lang/String;IILio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method private static final deleteAll$lambda$6(Ljava/lang/String;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :catchall_0
    move-exception p1

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method public static synthetic e(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->insert$lambda$1(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic f(Ljava/lang/String;IILio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ltb/a;)Ljava/util/ArrayList;
    .locals 6

    const-string v0, "SELECT * FROM stream_chat_user WHERE name LIKE ? ORDER BY name ASC LIMIT ? OFFSET ?"

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->selectUsersLikeName$lambda$5(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic g(Ltb/a;)V
    .locals 1

    const-string v0, "DELETE FROM stream_chat_user"

    invoke-static {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->deleteAll$lambda$6(Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method private static final insert$lambda$1(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__insertAdapterOfUserEntity:Landroidx/room/k;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final insertMany$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__insertAdapterOfUserEntity:Landroidx/room/k;

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final select$lambda$2(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 39

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "_connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x1

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v1, v4, v5}, Ltb/c;->L(ILjava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object/from16 v16, v1

    goto/16 :goto_14

    :cond_0
    const-string v2, "id"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v4, "originalId"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "name"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "image"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "role"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "createdAt"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "updatedAt"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "lastActive"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "invisible"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "privacySettings"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "banned"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mutes"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "teams"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v3, "teamsRole"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p1, v3

    const-string v3, "extraData"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 p3, v3

    const-string v3, "avgResponseTime"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v16, v3

    const-string v3, "pushPreference"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    move/from16 v17, v3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v18

    if-eqz v18, :cond_11

    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v21

    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v22

    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v23

    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v24

    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v18

    const/16 v19, 0x0

    if-eqz v18, :cond_1

    move/from16 v37, v2

    move-object/from16 v2, v19

    :goto_2
    move/from16 v18, v4

    goto :goto_3

    :cond_1
    invoke-interface {v1, v8}, Ltb/c;->getLong(I)J

    move-result-wide v25

    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    move/from16 v37, v2

    move-object/from16 v2, v18

    goto :goto_2

    :goto_3
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v25

    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_2

    move-object/from16 v2, v19

    goto :goto_4

    :cond_2
    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v26

    invoke-static/range {v26 .. v27}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_4
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v26

    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object/from16 v2, v19

    goto :goto_5

    :cond_3
    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v27

    invoke-static/range {v27 .. v28}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_5
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v27

    move v2, v5

    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    if-eqz v4, :cond_4

    const/16 v28, 0x1

    goto :goto_6

    :cond_4
    const/16 v28, 0x0

    :goto_6
    invoke-interface {v1, v12}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_5

    move-object/from16 v4, v19

    goto :goto_7

    :cond_5
    invoke-interface {v1, v12}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_7
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__privacySettingsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;

    invoke-virtual {v5, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;->stringToPrivacySettings(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    move-result-object v4

    move-object/from16 v30, v4

    invoke-interface {v1, v13}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    if-eqz v4, :cond_6

    const/4 v5, 0x1

    goto :goto_8

    :cond_6
    const/4 v5, 0x0

    :goto_8
    invoke-interface {v1, v14}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_7

    move-object/from16 v4, v19

    :goto_9
    move/from16 v38, v2

    goto :goto_a

    :cond_7
    invoke-interface {v1, v14}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_9

    :goto_a
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v2, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toUserMuteList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v31

    if-eqz v31, :cond_10

    invoke-interface {v1, v15}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_8

    move-object/from16 v2, v19

    goto :goto_b

    :cond_8
    invoke-interface {v1, v15}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    :goto_b
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v4, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v32

    if-eqz v32, :cond_f

    move/from16 v2, p1

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_9

    move-object/from16 v4, v19

    :goto_c
    move/from16 p1, v2

    goto :goto_d

    :cond_9
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_c

    :goto_d
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v2, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v33

    if-eqz v33, :cond_e

    move/from16 v2, p3

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_a

    move-object/from16 v4, v19

    :goto_e
    move/from16 p3, v2

    goto :goto_f

    :cond_a
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_e

    :goto_f
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v2, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v34

    if-eqz v34, :cond_d

    move/from16 v2, v16

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_b

    move-object/from16 v35, v19

    :goto_10
    move/from16 v4, v17

    goto :goto_11

    :cond_b
    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v35

    invoke-static/range {v35 .. v36}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object/from16 v35, v4

    goto :goto_10

    :goto_11
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v16

    if-eqz v16, :cond_c

    :goto_12
    move-object/from16 v16, v1

    move/from16 v17, v2

    move-object/from16 v1, v19

    goto :goto_13

    :cond_c
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v19
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_12

    :goto_13
    :try_start_1
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__pushPreferenceConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;->stringToPushPreference(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;

    move-result-object v36

    new-instance v19, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    move-object/from16 v29, v30

    move/from16 v30, v5

    invoke-direct/range {v19 .. v36}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZLio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;)V

    move-object/from16 v1, v19

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v16

    move/from16 v16, v17

    move/from16 v2, v37

    move/from16 v5, v38

    move/from16 v17, v4

    move/from16 v4, v18

    goto/16 :goto_1

    :catchall_1
    move-exception v0

    goto :goto_14

    :cond_d
    move-object/from16 v16, v1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    move-object/from16 v16, v1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    move-object/from16 v16, v1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    move-object/from16 v16, v1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.user.`internal`.UserMuteEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_11
    move-object/from16 v16, v1

    invoke-interface/range {v16 .. v16}, Ljava/lang/AutoCloseable;->close()V

    return-object v3

    :goto_14
    invoke-interface/range {v16 .. v16}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final select$lambda$3(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;
    .locals 37

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "_connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v2, 0x1

    move-object/from16 v3, p1

    :try_start_0
    invoke-interface {v1, v2, v3}, Ltb/c;->L(ILjava/lang/String;)V

    const-string v3, "id"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "originalId"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "name"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "image"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "role"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "createdAt"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "updatedAt"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "lastActive"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "invisible"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "privacySettings"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "banned"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mutes"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "teams"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v2, "teamsRole"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p1, v2

    const-string v2, "extraData"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p3, v2

    const-string v2, "avgResponseTime"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 v16, v2

    const-string v2, "pushPreference"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v17

    const/16 v18, 0x0

    if-eqz v17, :cond_10

    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v21

    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v22

    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v23

    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v24

    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object/from16 v3, v18

    goto :goto_0

    :cond_0
    invoke-interface {v1, v8}, Ltb/c;->getLong(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :goto_0
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v25

    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object/from16 v3, v18

    goto :goto_1

    :cond_1
    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :goto_1
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v26

    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object/from16 v3, v18

    goto :goto_2

    :cond_2
    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :goto_2
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v27

    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    const/16 v28, 0x1

    goto :goto_3

    :cond_3
    move/from16 v28, v4

    :goto_3
    invoke-interface {v1, v12}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_4

    move-object/from16 v3, v18

    goto :goto_4

    :cond_4
    invoke-interface {v1, v12}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    :goto_4
    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__privacySettingsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;

    invoke-virtual {v5, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;->stringToPrivacySettings(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    move-result-object v29

    invoke-interface {v1, v13}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v3, v5

    if-eqz v3, :cond_5

    const/16 v30, 0x1

    goto :goto_5

    :cond_5
    move/from16 v30, v4

    :goto_5
    invoke-interface {v1, v14}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_6

    move-object/from16 v3, v18

    goto :goto_6

    :cond_6
    invoke-interface {v1, v14}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    :goto_6
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toUserMuteList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v31

    if-eqz v31, :cond_f

    invoke-interface {v1, v15}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_7

    move-object/from16 v3, v18

    goto :goto_7

    :cond_7
    invoke-interface {v1, v15}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    :goto_7
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v32

    if-eqz v32, :cond_e

    move/from16 v3, p1

    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_8

    move-object/from16 v3, v18

    goto :goto_8

    :cond_8
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    :goto_8
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v33

    if-eqz v33, :cond_d

    move/from16 v3, p3

    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_9

    move-object/from16 v3, v18

    goto :goto_9

    :cond_9
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    :goto_9
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v34

    if-eqz v34, :cond_c

    move/from16 v3, v16

    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_a

    move-object/from16 v35, v18

    goto :goto_a

    :cond_a
    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object/from16 v35, v3

    :goto_a
    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_b

    :goto_b
    move-object/from16 v2, v18

    goto :goto_c

    :cond_b
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    goto :goto_b

    :goto_c
    iget-object v0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__pushPreferenceConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;->stringToPushPreference(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;

    move-result-object v36

    new-instance v19, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    invoke-direct/range {v19 .. v36}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZLio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;)V

    move-object/from16 v18, v19

    goto :goto_d

    :catchall_0
    move-exception v0

    goto :goto_e

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.user.`internal`.UserMuteEntity>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_10
    :goto_d
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v18

    :goto_e
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final selectAllUser$lambda$4(Ljava/lang/String;IILio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 38

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    const-string v2, "_connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    move/from16 v2, p1

    int-to-long v2, v2

    const/4 v4, 0x1

    :try_start_0
    invoke-interface {v1, v4, v2, v3}, Ltb/c;->p(IJ)V

    const/4 v2, 0x2

    move/from16 v3, p2

    int-to-long v5, v3

    invoke-interface {v1, v2, v5, v6}, Ltb/c;->p(IJ)V

    const-string v2, "id"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "originalId"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v5, "name"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "image"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "role"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "createdAt"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "updatedAt"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "lastActive"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "invisible"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "privacySettings"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "banned"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mutes"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "teams"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v4, "teamsRole"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 p1, v4

    const-string v4, "extraData"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 p2, v4

    const-string v4, "avgResponseTime"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 p4, v4

    const-string v4, "pushPreference"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    move/from16 v16, v4

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v17

    if-eqz v17, :cond_10

    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v19

    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v21

    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v22

    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v23

    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v17

    const/16 v18, 0x0

    if-eqz v17, :cond_0

    move/from16 v36, v2

    move-object/from16 v2, v18

    :goto_1
    move/from16 v17, v3

    goto :goto_2

    :cond_0
    invoke-interface {v1, v8}, Ltb/c;->getLong(I)J

    move-result-wide v24

    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    move/from16 v36, v2

    move-object/from16 v2, v17

    goto :goto_1

    :goto_2
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v24

    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object/from16 v2, v18

    goto :goto_3

    :cond_1
    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_3
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v25

    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_2

    move-object/from16 v2, v18

    goto :goto_4

    :cond_2
    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_4
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v26

    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    if-eqz v2, :cond_3

    const/16 v27, 0x1

    goto :goto_5

    :cond_3
    const/16 v27, 0x0

    :goto_5
    invoke-interface {v1, v12}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object/from16 v2, v18

    goto :goto_6

    :cond_4
    invoke-interface {v1, v12}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    :goto_6
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__privacySettingsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;->stringToPrivacySettings(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    move-result-object v2

    move-object/from16 v29, v2

    invoke-interface {v1, v13}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    if-eqz v2, :cond_5

    const/4 v3, 0x1

    goto :goto_7

    :cond_5
    const/4 v3, 0x0

    :goto_7
    invoke-interface {v1, v14}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_6

    move-object/from16 v2, v18

    :goto_8
    move/from16 v28, v3

    goto :goto_9

    :cond_6
    invoke-interface {v1, v14}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_8

    :goto_9
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toUserMuteList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v30

    if-eqz v30, :cond_f

    invoke-interface {v1, v15}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_7

    move-object/from16 v2, v18

    goto :goto_a

    :cond_7
    invoke-interface {v1, v15}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    :goto_a
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v31

    if-eqz v31, :cond_e

    move/from16 v2, p1

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_8

    move-object/from16 v3, v18

    :goto_b
    move/from16 p1, v2

    goto :goto_c

    :cond_8
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_b

    :goto_c
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v32

    if-eqz v32, :cond_d

    move/from16 v2, p2

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_9

    move-object/from16 v3, v18

    :goto_d
    move/from16 p2, v2

    goto :goto_e

    :cond_9
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_d

    :goto_e
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v33

    if-eqz v33, :cond_c

    move/from16 v2, p4

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_a

    move-object/from16 v34, v18

    :goto_f
    move/from16 v3, v16

    goto :goto_10

    :cond_a
    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v34

    invoke-static/range {v34 .. v35}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object/from16 v34, v3

    goto :goto_f

    :goto_10
    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v16

    if-eqz v16, :cond_b

    :goto_11
    move-object/from16 p4, v1

    move/from16 v16, v2

    move-object/from16 v1, v18

    goto :goto_12

    :cond_b
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_11

    :goto_12
    :try_start_1
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__pushPreferenceConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;->stringToPushPreference(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;

    move-result-object v35

    new-instance v18, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    move-object/from16 v37, v29

    move/from16 v29, v28

    move-object/from16 v28, v37

    invoke-direct/range {v18 .. v35}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZLio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;)V

    move-object/from16 v1, v18

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p4

    move/from16 p4, v16

    move/from16 v2, v36

    move/from16 v16, v3

    move/from16 v3, v17

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_13

    :catchall_1
    move-exception v0

    move-object/from16 p4, v1

    goto :goto_13

    :cond_c
    move-object/from16 p4, v1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    move-object/from16 p4, v1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    move-object/from16 p4, v1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    move-object/from16 p4, v1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.user.`internal`.UserMuteEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_10
    move-object/from16 p4, v1

    invoke-interface/range {p4 .. p4}, Ljava/lang/AutoCloseable;->close()V

    return-object v4

    :goto_13
    invoke-interface/range {p4 .. p4}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static final selectUsersLikeName$lambda$5(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 37

    move-object/from16 v0, p4

    move-object/from16 v1, p5

    const-string v2, "_connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v2, 0x1

    move-object/from16 v3, p1

    :try_start_0
    invoke-interface {v1, v2, v3}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v3, 0x2

    move/from16 v4, p2

    int-to-long v4, v4

    invoke-interface {v1, v3, v4, v5}, Ltb/c;->p(IJ)V

    const/4 v3, 0x3

    move/from16 v4, p3

    int-to-long v4, v4

    invoke-interface {v1, v3, v4, v5}, Ltb/c;->p(IJ)V

    const-string v3, "id"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "originalId"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "name"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "image"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "role"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "createdAt"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "updatedAt"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "lastActive"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "invisible"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "privacySettings"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "banned"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "mutes"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "teams"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    const-string v2, "teamsRole"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p1, v2

    const-string v2, "extraData"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p2, v2

    const-string v2, "avgResponseTime"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p3, v2

    const-string v2, "pushPreference"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    move/from16 p5, v2

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v16

    if-eqz v16, :cond_10

    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v19

    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v20

    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v21

    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v22

    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v16

    const/16 v17, 0x0

    if-eqz v16, :cond_0

    move/from16 v35, v3

    move-object/from16 v3, v17

    :goto_1
    move/from16 v16, v4

    goto :goto_2

    :cond_0
    invoke-interface {v1, v8}, Ltb/c;->getLong(I)J

    move-result-wide v23

    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v16

    move/from16 v35, v3

    move-object/from16 v3, v16

    goto :goto_1

    :goto_2
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v23

    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object/from16 v3, v17

    goto :goto_3

    :cond_1
    invoke-interface {v1, v9}, Ltb/c;->getLong(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :goto_3
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v24

    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object/from16 v3, v17

    goto :goto_4

    :cond_2
    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :goto_4
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__dateConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->fromTimestamp(Ljava/lang/Long;)Ljava/util/Date;

    move-result-object v25

    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    if-eqz v3, :cond_3

    const/16 v26, 0x1

    goto :goto_5

    :cond_3
    const/16 v26, 0x0

    :goto_5
    invoke-interface {v1, v12}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_4

    move-object/from16 v3, v17

    goto :goto_6

    :cond_4
    invoke-interface {v1, v12}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    :goto_6
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__privacySettingsConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PrivacySettingsConverter;->stringToPrivacySettings(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    move-result-object v3

    move-object/from16 v28, v3

    invoke-interface {v1, v13}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    if-eqz v3, :cond_5

    const/4 v4, 0x1

    goto :goto_7

    :cond_5
    const/4 v4, 0x0

    :goto_7
    invoke-interface {v1, v14}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_6

    move-object/from16 v3, v17

    :goto_8
    move/from16 v27, v4

    goto :goto_9

    :cond_6
    invoke-interface {v1, v14}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_8

    :goto_9
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toUserMuteList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v29

    if-eqz v29, :cond_f

    invoke-interface {v1, v15}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_7

    move-object/from16 v3, v17

    goto :goto_a

    :cond_7
    invoke-interface {v1, v15}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    :goto_a
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v30

    if-eqz v30, :cond_e

    move/from16 v3, p1

    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_8

    move-object/from16 v4, v17

    :goto_b
    move/from16 p1, v3

    goto :goto_c

    :cond_8
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_b

    :goto_c
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__mapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    invoke-virtual {v3, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->stringToStringMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v31

    if-eqz v31, :cond_d

    move/from16 v3, p2

    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_9

    move-object/from16 v4, v17

    :goto_d
    move/from16 p2, v3

    goto :goto_e

    :cond_9
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_d

    :goto_e
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v3, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v32

    if-eqz v32, :cond_c

    move/from16 v3, p3

    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_a

    move-object/from16 v33, v17

    :goto_f
    move/from16 v4, p5

    goto :goto_10

    :cond_a
    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v33

    invoke-static/range {v33 .. v34}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object/from16 v33, v4

    goto :goto_f

    :goto_10
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v34

    if-eqz v34, :cond_b

    :goto_11
    move-object/from16 p5, v1

    move/from16 p3, v3

    move-object/from16 v1, v17

    goto :goto_12

    :cond_b
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v17
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_11

    :goto_12
    :try_start_1
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__pushPreferenceConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;

    invoke-virtual {v3, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/PushPreferenceConverter;->stringToPushPreference(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;

    move-result-object v34

    new-instance v17, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    move-object/from16 v36, v28

    move/from16 v28, v27

    move-object/from16 v27, v36

    invoke-direct/range {v17 .. v34}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZLio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;)V

    move-object/from16 v1, v17

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p5

    move/from16 p5, v4

    move/from16 v4, v16

    move/from16 v3, v35

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_13

    :catchall_1
    move-exception v0

    move-object/from16 p5, v1

    goto :goto_13

    :cond_c
    move-object/from16 p5, v1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    move-object/from16 p5, v1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    move-object/from16 p5, v1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    move-object/from16 p5, v1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected NON-NULL \'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.user.`internal`.UserMuteEntity>\', but it was NULL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_10
    move-object/from16 p5, v1

    invoke-interface/range {p5 .. p5}, Ljava/lang/AutoCloseable;->close()V

    return-object v2

    :goto_13
    invoke-interface/range {p5 .. p5}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method


# virtual methods
.method public final deleteAll(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/16 v2, 0x12

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insert(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/16 v2, 0xb

    invoke-direct {v1, v2, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertMany(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/16 v2, 0x9

    invoke-direct {v1, v2, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final select(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/16 v2, 0xa

    invoke-direct {v1, v2, p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final select(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const-string v0, "SELECT * FROM stream_chat_user WHERE stream_chat_user.id IN ("

    .line 2
    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    .line 4
    invoke-static {v1, v0}, Lpf/c;->j(ILjava/lang/StringBuilder;)V

    .line 5
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__db:Landroidx/room/z0;

    new-instance v2, Lig0/h;

    const/16 v3, 0xf

    invoke-direct {v2, v0, p1, p0, v3}, Lig0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-static {v1, p1, v0, v2, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectAllUser(II)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Ld62/f;

    invoke-direct {v1, p1, p2, p0}, Ld62/f;-><init>(IILio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final selectUsersLikeName(Ljava/lang/String;II)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
            ">;"
        }
    .end annotation

    const-string v0, "searchString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;

    invoke-direct {v1, p1, p2, p3, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;-><init>(Ljava/lang/String;IILio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method
