.class public final Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\"\u0008\u0081\u0008\u0018\u0000 22\u00020\u0001:\u00012Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\'\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\t\u0010(\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u00c6\u0003J\t\u0010*\u001a\u00020\u0006H\u00c6\u0003J\u0015\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003J|\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u00062\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00062\u0014\u0008\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u00032\u0008\u0010/\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u00100\u001a\u00020\tH\u00d6\u0001J\t\u00101\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0015R\u0015\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0018R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0018R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"\u00a8\u00063"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;",
        "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;",
        "allow_answers",
        "",
        "allow_user_suggested_options",
        "description",
        "",
        "enforce_unique_vote",
        "max_votes_allowed",
        "",
        "name",
        "options",
        "",
        "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;",
        "voting_visibility",
        "extraData",
        "",
        "",
        "<init>",
        "(ZZLjava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V",
        "getAllow_answers",
        "()Z",
        "getAllow_user_suggested_options",
        "getDescription",
        "()Ljava/lang/String;",
        "getEnforce_unique_vote",
        "getMax_votes_allowed",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getName",
        "getOptions",
        "()Ljava/util/List;",
        "getVoting_visibility",
        "getExtraData",
        "()Ljava/util/Map;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(ZZLjava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;",
        "equals",
        "other",
        "hashCode",
        "toString",
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

.annotation runtime Lqx/t;
    generateAdapter = true
.end annotation


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest$Companion;

.field public static final VOTING_VISIBILITY_ANONYMOUS:Ljava/lang/String; = "anonymous"

.field public static final VOTING_VISIBILITY_PUBLIC:Ljava/lang/String; = "public"


# instance fields
.field private final allow_answers:Z

.field private final allow_user_suggested_options:Z

.field private final description:Ljava/lang/String;

.field private final enforce_unique_vote:Z

.field private final extraData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final max_votes_allowed:Ljava/lang/Integer;

.field private final name:Ljava/lang/String;

.field private final options:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;",
            ">;"
        }
    .end annotation
.end field

.field private final voting_visibility:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->Companion:Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest$Companion;

    return-void
.end method

.method public constructor <init>(ZZLjava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "description"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "voting_visibility"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->allow_answers:Z

    iput-boolean p2, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->allow_user_suggested_options:Z

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->description:Ljava/lang/String;

    iput-boolean p4, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->enforce_unique_vote:Z

    iput-object p5, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->max_votes_allowed:Ljava/lang/Integer;

    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->name:Ljava/lang/String;

    iput-object p7, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->options:Ljava/util/List;

    iput-object p8, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->voting_visibility:Ljava/lang/String;

    iput-object p9, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->extraData:Ljava/util/Map;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;ZZLjava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->allow_answers:Z

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-boolean p2, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->allow_user_suggested_options:Z

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->description:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-boolean p4, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->enforce_unique_vote:Z

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->max_votes_allowed:Ljava/lang/Integer;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->name:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->options:Ljava/util/List;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->voting_visibility:Ljava/lang/String;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->extraData:Ljava/util/Map;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->copy(ZZLjava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->allow_answers:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->allow_user_suggested_options:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->enforce_unique_vote:Z

    return v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->max_votes_allowed:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->options:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->voting_visibility:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(ZZLjava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;"
        }
    .end annotation

    const-string v0, "description"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "voting_visibility"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move-object/from16 v6, p5

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;-><init>(ZZLjava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->allow_answers:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->allow_answers:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->allow_user_suggested_options:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->allow_user_suggested_options:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->description:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->enforce_unique_vote:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->enforce_unique_vote:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->max_votes_allowed:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->max_votes_allowed:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->options:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->options:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->voting_visibility:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->voting_visibility:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->extraData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->extraData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAllow_answers()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->allow_answers:Z

    return v0
.end method

.method public final getAllow_user_suggested_options()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->allow_user_suggested_options:Z

    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnforce_unique_vote()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->enforce_unique_vote:Z

    return v0
.end method

.method public final getExtraData()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getMax_votes_allowed()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->max_votes_allowed:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->options:Ljava/util/List;

    return-object v0
.end method

.method public final getVoting_visibility()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->voting_visibility:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->allow_answers:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->allow_user_suggested_options:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->enforce_unique_vote:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->max_votes_allowed:Ljava/lang/Integer;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->options:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->voting_visibility:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->extraData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->allow_answers:Z

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->allow_user_suggested_options:Z

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->description:Ljava/lang/String;

    iget-boolean v3, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->enforce_unique_vote:Z

    iget-object v4, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->max_votes_allowed:Ljava/lang/Integer;

    iget-object v5, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->name:Ljava/lang/String;

    iget-object v6, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->options:Ljava/util/List;

    iget-object v7, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->voting_visibility:Ljava/lang/String;

    iget-object v8, p0, Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;->extraData:Ljava/util/Map;

    const-string v9, ", allow_user_suggested_options="

    const-string v10, ", description="

    const-string v11, "CreatePollRequest(allow_answers="

    invoke-static {v11, v9, v10, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", enforce_unique_vote="

    const-string v9, ", max_votes_allowed="

    invoke-static {v0, v2, v1, v3, v9}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", name="

    const-string v2, ", options="

    invoke-static {v4, v1, v5, v2, v0}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", voting_visibility="

    const-string v2, ", extraData="

    invoke-static {v1, v7, v2, v0, v6}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ")"

    invoke-static {v0, v8, v1}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
