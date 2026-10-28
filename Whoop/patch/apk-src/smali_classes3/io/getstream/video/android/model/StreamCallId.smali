.class public final Lio/getstream/video/android/model/StreamCallId;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/video/android/model/StreamCallId$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000278B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tBA\u0008\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u00c1\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J8\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001dJ\u0010\u0010%\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020\u00062\u0008\u0010(\u001a\u0004\u0018\u00010\'H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010&J \u0010/\u001a\u00020\u00142\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00101\u001a\u0004\u00083\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00084\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00105\u001a\u0004\u0008\u0007\u0010!\u00a8\u00069"
    }
    d2 = {
        "Lio/getstream/video/android/model/StreamCallId;",
        "Landroid/os/Parcelable;",
        "",
        "type",
        "id",
        "cid",
        "",
        "isValid",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V",
        "",
        "seen1",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$stream_video_android_core_release",
        "(Lio/getstream/video/android/model/StreamCallId;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Le43/m;",
        "notificationType",
        "getNotificationId",
        "(Le43/m;)I",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Z",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lio/getstream/video/android/model/StreamCallId;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "Ljava/lang/String;",
        "getType",
        "getId",
        "getCid",
        "Z",
        "Companion",
        "$serializer",
        "io/getstream/video/android/model/b",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lio/getstream/video/android/model/StreamCallId;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lio/getstream/video/android/model/b;


# instance fields
.field private final cid:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final isValid:Z

.field private final type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/video/android/model/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/video/android/model/StreamCallId;->Companion:Lio/getstream/video/android/model/b;

    new-instance v0, Lmn/b;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lmn/b;-><init>(I)V

    sput-object v0, Lio/getstream/video/android/model/StreamCallId;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    and-int/lit8 p6, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lio/getstream/video/android/model/StreamCallId$$serializer;->INSTANCE:Lio/getstream/video/android/model/StreamCallId$$serializer;

    invoke-virtual {p6}, Lio/getstream/video/android/model/StreamCallId$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/getstream/video/android/model/StreamCallId;->type:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/video/android/model/StreamCallId;->id:Ljava/lang/String;

    and-int/lit8 p6, p1, 0x4

    if-nez p6, :cond_2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-lez p4, :cond_1

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-lez p4, :cond_1

    const-string p4, ":"

    .line 2
    invoke-static {p2, p4, p3}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    goto :goto_0

    .line 3
    :cond_1
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-lez p4, :cond_3

    move-object p4, p3

    .line 4
    :cond_2
    :goto_0
    iput-object p4, p0, Lio/getstream/video/android/model/StreamCallId;->cid:Ljava/lang/String;

    goto :goto_1

    .line 5
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string p5, "[StreamCallId] invalid arguments; type="

    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", id="

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_6

    .line 6
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_4

    goto :goto_2

    .line 7
    :cond_4
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_5

    :goto_2
    const/4 p1, 0x1

    goto :goto_3

    :cond_5
    const/4 p1, 0x0

    :goto_3
    iput-boolean p1, p0, Lio/getstream/video/android/model/StreamCallId;->isValid:Z

    return-void

    :cond_6
    iput-boolean p5, p0, Lio/getstream/video/android/model/StreamCallId;->isValid:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lio/getstream/video/android/model/StreamCallId;->type:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lio/getstream/video/android/model/StreamCallId;->id:Ljava/lang/String;

    .line 17
    iput-object p3, p0, Lio/getstream/video/android/model/StreamCallId;->cid:Ljava/lang/String;

    .line 18
    iput-boolean p4, p0, Lio/getstream/video/android/model/StreamCallId;->isValid:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 19
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-lez p3, :cond_0

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-lez p3, :cond_0

    const-string p3, ":"

    .line 20
    invoke-static {p1, p3, p2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    .line 21
    :cond_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-lez p3, :cond_1

    move-object p3, p2

    goto :goto_0

    :cond_1
    new-instance p3, Ljava/lang/IllegalStateException;

    .line 22
    new-instance p4, Ljava/lang/StringBuilder;

    const-string p5, "[StreamCallId] invalid arguments; type="

    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", id="

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_2
    :goto_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_5

    .line 23
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-lez p4, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-lez p4, :cond_4

    :goto_1
    const/4 p4, 0x1

    goto :goto_2

    :cond_4
    const/4 p4, 0x0

    .line 24
    :cond_5
    :goto_2
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/video/android/model/StreamCallId;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lio/getstream/video/android/model/StreamCallId;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/getstream/video/android/model/StreamCallId;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/getstream/video/android/model/StreamCallId;->id:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/getstream/video/android/model/StreamCallId;->cid:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lio/getstream/video/android/model/StreamCallId;->isValid:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/video/android/model/StreamCallId;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lio/getstream/video/android/model/StreamCallId;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$stream_video_android_core_release(Lio/getstream/video/android/model/StreamCallId;Lzc3/c;Lyc3/g;)V
    .locals 7

    iget-object v0, p0, Lio/getstream/video/android/model/StreamCallId;->type:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    iget-object v0, p0, Lio/getstream/video/android/model/StreamCallId;->id:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lio/getstream/video/android/model/StreamCallId;->cid:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/video/android/model/StreamCallId;->type:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_1

    iget-object v4, p0, Lio/getstream/video/android/model/StreamCallId;->id:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_1

    iget-object v4, p0, Lio/getstream/video/android/model/StreamCallId;->type:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/video/android/model/StreamCallId;->id:Ljava/lang/String;

    const-string v6, ":"

    invoke-static {v4, v6, v5}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    iget-object v4, p0, Lio/getstream/video/android/model/StreamCallId;->id:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_7

    iget-object v4, p0, Lio/getstream/video/android/model/StreamCallId;->id:Ljava/lang/String;

    :goto_0
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    :goto_1
    iget-object v3, p0, Lio/getstream/video/android/model/StreamCallId;->cid:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_2
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    iget-boolean v3, p0, Lio/getstream/video/android/model/StreamCallId;->isValid:Z

    iget-object v4, p0, Lio/getstream/video/android/model/StreamCallId;->type:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_4

    goto :goto_2

    :cond_4
    iget-object v4, p0, Lio/getstream/video/android/model/StreamCallId;->id:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_5

    :goto_2
    move v1, v2

    :cond_5
    if-eq v3, v1, :cond_6

    :goto_3
    iget-boolean p0, p0, Lio/getstream/video/android/model/StreamCallId;->isValid:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_6
    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object p2, p0, Lio/getstream/video/android/model/StreamCallId;->type:Ljava/lang/String;

    iget-object p0, p0, Lio/getstream/video/android/model/StreamCallId;->id:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[StreamCallId] invalid arguments; type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", id="

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/model/StreamCallId;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/model/StreamCallId;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/model/StreamCallId;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/video/android/model/StreamCallId;->isValid:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lio/getstream/video/android/model/StreamCallId;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/video/android/model/StreamCallId;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/video/android/model/StreamCallId;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/video/android/model/StreamCallId;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/video/android/model/StreamCallId;

    iget-object v1, p0, Lio/getstream/video/android/model/StreamCallId;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/video/android/model/StreamCallId;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/video/android/model/StreamCallId;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/video/android/model/StreamCallId;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/video/android/model/StreamCallId;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/video/android/model/StreamCallId;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/video/android/model/StreamCallId;->isValid:Z

    iget-boolean p1, p1, Lio/getstream/video/android/model/StreamCallId;->isValid:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/model/StreamCallId;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/model/StreamCallId;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getNotificationId(Le43/m;)I
    .locals 2

    const-string v0, "notificationType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Le43/m;->a:Ljava/lang/String;

    iget-object v0, p0, Lio/getstream/video/android/model/StreamCallId;->cid:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    return p1
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/model/StreamCallId;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/video/android/model/StreamCallId;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/video/android/model/StreamCallId;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/video/android/model/StreamCallId;->cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/video/android/model/StreamCallId;->isValid:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isValid()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/video/android/model/StreamCallId;->isValid:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lio/getstream/video/android/model/StreamCallId;->type:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/video/android/model/StreamCallId;->id:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/video/android/model/StreamCallId;->cid:Ljava/lang/String;

    iget-boolean v3, p0, Lio/getstream/video/android/model/StreamCallId;->isValid:Z

    const-string v4, ", id="

    const-string v5, ", cid="

    const-string v6, "StreamCallId(type="

    invoke-static {v6, v0, v4, v1, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isValid="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Ljh3/c;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lio/getstream/video/android/model/StreamCallId;->type:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lio/getstream/video/android/model/StreamCallId;->id:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lio/getstream/video/android/model/StreamCallId;->cid:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lio/getstream/video/android/model/StreamCallId;->isValid:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
