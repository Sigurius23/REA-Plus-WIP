.class public final Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Content"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0001\u001eB1\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003J3\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001f"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;",
        "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState;",
        "owner",
        "Lio/getstream/chat/android/models/User;",
        "members",
        "Lio/getstream/chat/android/ui/common/utils/ExpandableList;",
        "Lio/getstream/chat/android/models/Member;",
        "options",
        "",
        "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;",
        "<init>",
        "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/utils/ExpandableList;Ljava/util/List;)V",
        "getOwner",
        "()Lio/getstream/chat/android/models/User;",
        "getMembers",
        "()Lio/getstream/chat/android/ui/common/utils/ExpandableList;",
        "getOptions",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "Option",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final members:Lio/getstream/chat/android/ui/common/utils/ExpandableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/ui/common/utils/ExpandableList<",
            "Lio/getstream/chat/android/models/Member;",
            ">;"
        }
    .end annotation
.end field

.field private final options:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;",
            ">;"
        }
    .end annotation
.end field

.field private final owner:Lio/getstream/chat/android/models/User;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;-><init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/utils/ExpandableList;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/utils/ExpandableList;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/ui/common/utils/ExpandableList<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;",
            ">;)V"
        }
    .end annotation

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->owner:Lio/getstream/chat/android/models/User;

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->members:Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->options:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/utils/ExpandableList;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 29

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    .line 6
    new-instance v1, Lio/getstream/chat/android/models/User;

    const v27, 0x1ffffff

    const/16 v28, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v1 .. v28}, Lio/getstream/chat/android/models/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_1

    .line 7
    invoke-static {}, Lio/getstream/chat/android/ui/common/utils/ExpandableListKt;->emptyExpandableList()Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object/from16 v0, p2

    :goto_1
    and-int/lit8 v2, p4, 0x4

    if-eqz v2, :cond_2

    .line 8
    sget-object v2, Lm83/y;->w:Lm83/y;

    :goto_2
    move-object/from16 v3, p0

    goto :goto_3

    :cond_2
    move-object/from16 v2, p3

    goto :goto_2

    .line 9
    :goto_3
    invoke-direct {v3, v1, v0, v2}, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;-><init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/utils/ExpandableList;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/utils/ExpandableList;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->owner:Lio/getstream/chat/android/models/User;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->members:Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->options:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->copy(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/utils/ExpandableList;Ljava/util/List;)Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->owner:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/ui/common/utils/ExpandableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/ui/common/utils/ExpandableList<",
            "Lio/getstream/chat/android/models/Member;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->members:Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->options:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/utils/ExpandableList;Ljava/util/List;)Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/ui/common/utils/ExpandableList<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;",
            ">;)",
            "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;"
        }
    .end annotation

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;-><init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/utils/ExpandableList;Ljava/util/List;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->owner:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->owner:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->members:Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->members:Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->options:Ljava/util/List;

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->options:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getMembers()Lio/getstream/chat/android/ui/common/utils/ExpandableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/ui/common/utils/ExpandableList<",
            "Lio/getstream/chat/android/models/Member;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->members:Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    return-object v0
.end method

.method public final getOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->options:Ljava/util/List;

    return-object v0
.end method

.method public final getOwner()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->owner:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->owner:Lio/getstream/chat/android/models/User;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->members:Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/utils/ExpandableList;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->options:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->owner:Lio/getstream/chat/android/models/User;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->members:Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;->options:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Content(owner="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", members="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", options="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
