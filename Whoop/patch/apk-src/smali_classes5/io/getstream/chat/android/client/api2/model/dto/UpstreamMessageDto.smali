.class public final Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/StreamHandsOff;
    reason = "Field names can\'t be changed because [CustomObjectDtoAdapter] class uses reflections to add/remove content of [extraData] map"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008<\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u00ed\u0001\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0003\u0012\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010F\u001a\u00020\u0006H\u00c6\u0003J\t\u0010G\u001a\u00020\u0006H\u00c6\u0003J\t\u0010H\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010I\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u000b\u0010M\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010P\u001a\u00020\u0011H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0011H\u00c6\u0003J\t\u0010R\u001a\u00020\u0011H\u00c6\u0003J\t\u0010S\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010T\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0003H\u00c6\u0003J\u000f\u0010U\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\u0015\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fH\u00c6\u0003J\u00a0\u0002\u0010X\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00062\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00062\u000e\u0008\u0002\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00032\u000e\u0008\u0002\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0014\u0008\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fH\u00c6\u0001\u00a2\u0006\u0002\u0010YJ\u0013\u0010Z\u001a\u00020\u00112\u0008\u0010[\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010\\\u001a\u00020]H\u00d6\u0001J\t\u0010^\u001a\u00020\u0006H\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010&R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010&R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010&R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010&R\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010&R\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010/R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\u00080\u00101R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010/R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00105R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010&R\u0011\u0010\u0016\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u00108R\u0011\u0010\u0017\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u00108R\u0011\u0010\u0018\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u00108R\u0011\u0010\u0019\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010&R\u0017\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010$R\u0017\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010$R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010?R\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010A\u00a8\u0006_"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;",
        "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;",
        "attachments",
        "",
        "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
        "cid",
        "",
        "command",
        "args",
        "html",
        "id",
        "type",
        "mentioned_users",
        "parent_id",
        "pin_expires",
        "Ljava/util/Date;",
        "pinned",
        "",
        "pinned_at",
        "pinned_by",
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;",
        "quoted_message_id",
        "shadowed",
        "show_in_channel",
        "silent",
        "text",
        "thread_participants",
        "restricted_visibility",
        "shared_location",
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;",
        "extraData",
        "",
        "",
        "<init>",
        "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;Ljava/util/Map;)V",
        "getAttachments",
        "()Ljava/util/List;",
        "getCid",
        "()Ljava/lang/String;",
        "getCommand",
        "getArgs",
        "getHtml",
        "getId",
        "getType",
        "getMentioned_users",
        "getParent_id",
        "getPin_expires",
        "()Ljava/util/Date;",
        "getPinned",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getPinned_at",
        "getPinned_by",
        "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;",
        "getQuoted_message_id",
        "getShadowed",
        "()Z",
        "getShow_in_channel",
        "getSilent",
        "getText",
        "getThread_participants",
        "getRestricted_visibility",
        "getShared_location",
        "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;",
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
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "copy",
        "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final args:Ljava/lang/String;

.field private final attachments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
            ">;"
        }
    .end annotation
.end field

.field private final cid:Ljava/lang/String;

.field private final command:Ljava/lang/String;

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

.field private final html:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final mentioned_users:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final parent_id:Ljava/lang/String;

.field private final pin_expires:Ljava/util/Date;

.field private final pinned:Ljava/lang/Boolean;

.field private final pinned_at:Ljava/util/Date;

.field private final pinned_by:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

.field private final quoted_message_id:Ljava/lang/String;

.field private final restricted_visibility:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final shadowed:Z

.field private final shared_location:Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;

.field private final show_in_channel:Z

.field private final silent:Z

.field private final text:Ljava/lang/String;

.field private final thread_participants:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;",
            ">;"
        }
    .end annotation
.end field

.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/lang/Boolean;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;",
            "Ljava/lang/String;",
            "ZZZ",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object v0, p8

    move-object/from16 v1, p18

    move-object/from16 v2, p19

    move-object/from16 v3, p20

    move-object/from16 v4, p22

    const-string v5, "attachments"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "cid"

    invoke-static {p2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "html"

    invoke-static {p5, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "id"

    invoke-static {p6, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "type"

    invoke-static {p7, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "mentioned_users"

    invoke-static {p8, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "text"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "thread_participants"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "restricted_visibility"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "extraData"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->attachments:Ljava/util/List;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->cid:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->command:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->args:Ljava/lang/String;

    iput-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->html:Ljava/lang/String;

    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->id:Ljava/lang/String;

    iput-object p7, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->type:Ljava/lang/String;

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->mentioned_users:Ljava/util/List;

    move-object p1, p9

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->parent_id:Ljava/lang/String;

    move-object/from16 p1, p10

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pin_expires:Ljava/util/Date;

    move-object/from16 p1, p11

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned:Ljava/lang/Boolean;

    move-object/from16 p1, p12

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned_at:Ljava/util/Date;

    move-object/from16 p1, p13

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned_by:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    move-object/from16 p1, p14

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->quoted_message_id:Ljava/lang/String;

    move/from16 p1, p15

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->shadowed:Z

    move/from16 p1, p16

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->show_in_channel:Z

    move/from16 p1, p17

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->silent:Z

    iput-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->text:Ljava/lang/String;

    iput-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->thread_participants:Ljava/util/List;

    iput-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->restricted_visibility:Ljava/util/List;

    move-object/from16 p1, p21

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->shared_location:Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;

    iput-object v4, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->extraData:Ljava/util/Map;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p23

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->attachments:Ljava/util/List;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->cid:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->command:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->args:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->html:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->id:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->type:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->mentioned_users:Ljava/util/List;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->parent_id:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pin_expires:Ljava/util/Date;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned:Ljava/lang/Boolean;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned_at:Ljava/util/Date;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned_by:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->quoted_message_id:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-boolean v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->shadowed:Z

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-boolean v1, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->show_in_channel:Z

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p23, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget-boolean v1, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->silent:Z

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p23, v16

    move/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->text:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p23, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->thread_participants:Ljava/util/List;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p23, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->restricted_visibility:Ljava/util/List;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p23, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->shared_location:Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p23, v16

    if-eqz v16, :cond_15

    move-object/from16 p7, v1

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->extraData:Ljava/util/Map;

    move-object/from16 p22, p7

    move-object/from16 p23, v1

    :goto_15
    move/from16 p17, p2

    move/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move/from16 p16, v2

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

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_16

    :cond_15
    move-object/from16 p23, p22

    move-object/from16 p22, v1

    goto :goto_15

    :goto_16
    invoke-virtual/range {p1 .. p23}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->copy(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->attachments:Ljava/util/List;

    return-object v0
.end method

.method public final component10()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pin_expires:Ljava/util/Date;

    return-object v0
.end method

.method public final component11()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component12()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component13()Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned_by:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->quoted_message_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->shadowed:Z

    return v0
.end method

.method public final component16()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->show_in_channel:Z

    return v0
.end method

.method public final component17()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->silent:Z

    return v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->thread_participants:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->restricted_visibility:Ljava/util/List;

    return-object v0
.end method

.method public final component21()Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->shared_location:Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;

    return-object v0
.end method

.method public final component22()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->command:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->args:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->html:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->mentioned_users:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->parent_id:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/lang/Boolean;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;",
            "Ljava/lang/String;",
            "ZZZ",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;"
        }
    .end annotation

    const-string v0, "attachments"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "html"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentioned_users"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "thread_participants"

    move-object/from16 v4, p19

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restricted_visibility"

    move-object/from16 v5, p20

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v10, p22

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v22, p21

    move-object/from16 v20, v4

    move-object/from16 v21, v5

    move-object/from16 v23, v10

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v23}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->attachments:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->attachments:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->command:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->command:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->args:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->args:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->html:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->html:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->mentioned_users:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->mentioned_users:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->parent_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->parent_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pin_expires:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pin_expires:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned_by:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned_by:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->quoted_message_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->quoted_message_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->shadowed:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->shadowed:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->show_in_channel:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->show_in_channel:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->silent:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->silent:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->text:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->thread_participants:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->thread_participants:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->restricted_visibility:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->restricted_visibility:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->shared_location:Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->shared_location:Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->extraData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->extraData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    return v2

    :cond_17
    return v0
.end method

.method public final getArgs()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->args:Ljava/lang/String;

    return-object v0
.end method

.method public final getAttachments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->attachments:Ljava/util/List;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCommand()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->command:Ljava/lang/String;

    return-object v0
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getHtml()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->html:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getMentioned_users()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->mentioned_users:Ljava/util/List;

    return-object v0
.end method

.method public final getParent_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->parent_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getPin_expires()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pin_expires:Ljava/util/Date;

    return-object v0
.end method

.method public final getPinned()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getPinned_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getPinned_by()Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned_by:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    return-object v0
.end method

.method public final getQuoted_message_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->quoted_message_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getRestricted_visibility()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->restricted_visibility:Ljava/util/List;

    return-object v0
.end method

.method public final getShadowed()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->shadowed:Z

    return v0
.end method

.method public final getShared_location()Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->shared_location:Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;

    return-object v0
.end method

.method public final getShow_in_channel()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->show_in_channel:Z

    return v0
.end method

.method public final getSilent()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->silent:Z

    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getThread_participants()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->thread_participants:Ljava/util/List;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->attachments:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->command:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->args:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->html:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->type:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->mentioned_users:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->parent_id:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pin_expires:Ljava/util/Date;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned:Ljava/lang/Boolean;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned_at:Ljava/util/Date;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned_by:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->quoted_message_id:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->shadowed:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->show_in_channel:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->silent:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->text:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->thread_participants:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->restricted_visibility:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->shared_location:Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;

    if-nez v2, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->extraData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->attachments:Ljava/util/List;

    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->cid:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->command:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->args:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->html:Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->id:Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->type:Ljava/lang/String;

    iget-object v8, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->mentioned_users:Ljava/util/List;

    iget-object v9, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->parent_id:Ljava/lang/String;

    iget-object v10, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pin_expires:Ljava/util/Date;

    iget-object v11, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned:Ljava/lang/Boolean;

    iget-object v12, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned_at:Ljava/util/Date;

    iget-object v13, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->pinned_by:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    iget-object v14, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->quoted_message_id:Ljava/lang/String;

    iget-boolean v15, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->shadowed:Z

    move/from16 v16, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->show_in_channel:Z

    move/from16 v17, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->silent:Z

    move/from16 v18, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->text:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->thread_participants:Ljava/util/List;

    move-object/from16 v20, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->restricted_visibility:Ljava/util/List;

    move-object/from16 v21, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->shared_location:Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;

    move-object/from16 v22, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->extraData:Ljava/util/Map;

    const-string v0, ", cid="

    move-object/from16 v23, v15

    const-string v15, ", command="

    move-object/from16 v24, v14

    const-string v14, "UpstreamMessageDto(attachments="

    invoke-static {v14, v0, v2, v15, v1}, Lnh3/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", args="

    const-string v2, ", html="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", id="

    const-string v2, ", type="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", mentioned_users="

    const-string v2, ", parent_id="

    invoke-static {v7, v1, v2, v0, v8}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", pin_expires="

    const-string v2, ", pinned="

    invoke-static {v0, v9, v1, v10, v2}, Lev/n;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pinned_at="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pinned_by="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", quoted_message_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shadowed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", show_in_channel="

    const-string v2, ", silent="

    move/from16 v3, v16

    move/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", text="

    const-string v2, ", thread_participants="

    move/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", restricted_visibility="

    const-string v2, ", shared_location="

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
