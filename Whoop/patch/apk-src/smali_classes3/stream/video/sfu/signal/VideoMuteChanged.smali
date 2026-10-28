.class public final Lstream/video/sfu/signal/VideoMuteChanged;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/signal/VideoMuteChanged$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001b\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00032\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0096\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lstream/video/sfu/signal/VideoMuteChanged;",
        "Lcom/squareup/wire/l;",
        "",
        "",
        "muted",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(ZLne3/l;)V",
        "newBuilder",
        "()Ljava/lang/Void;",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "copy",
        "(ZLne3/l;)Lstream/video/sfu/signal/VideoMuteChanged;",
        "Z",
        "getMuted",
        "()Z",
        "Companion",
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


# static fields
.field public static final ADAPTER:Lcom/squareup/wire/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/wire/q;"
        }
    .end annotation
.end field

.field public static final Companion:Lstream/video/sfu/signal/VideoMuteChanged$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final muted:Z
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#BOOL"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x2
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/signal/VideoMuteChanged$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/signal/VideoMuteChanged$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/signal/VideoMuteChanged;->Companion:Lstream/video/sfu/signal/VideoMuteChanged$Companion;

    const-class v0, Lstream/video/sfu/signal/VideoMuteChanged;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/signal/VideoMuteChanged$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/signal/VideoMuteChanged$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/signal/VideoMuteChanged;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v0}, Lstream/video/sfu/signal/VideoMuteChanged;-><init>(ZLne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLne3/l;)V
    .locals 1

    const-string v0, "unknownFields"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Lstream/video/sfu/signal/VideoMuteChanged;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {p0, v0, p2}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 5
    iput-boolean p1, p0, Lstream/video/sfu/signal/VideoMuteChanged;->muted:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 2
    sget-object p2, Lne3/l;->E:Lne3/l;

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2}, Lstream/video/sfu/signal/VideoMuteChanged;-><init>(ZLne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/signal/VideoMuteChanged;ZLne3/l;ILjava/lang/Object;)Lstream/video/sfu/signal/VideoMuteChanged;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lstream/video/sfu/signal/VideoMuteChanged;->muted:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p2

    :cond_1
    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/signal/VideoMuteChanged;->copy(ZLne3/l;)Lstream/video/sfu/signal/VideoMuteChanged;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(ZLne3/l;)Lstream/video/sfu/signal/VideoMuteChanged;
    .locals 1

    const-string v0, "unknownFields"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lstream/video/sfu/signal/VideoMuteChanged;

    invoke-direct {v0, p1, p2}, Lstream/video/sfu/signal/VideoMuteChanged;-><init>(ZLne3/l;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/signal/VideoMuteChanged;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/signal/VideoMuteChanged;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lstream/video/sfu/signal/VideoMuteChanged;->muted:Z

    iget-boolean p1, p1, Lstream/video/sfu/signal/VideoMuteChanged;->muted:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getMuted()Z
    .locals 1

    iget-boolean v0, p0, Lstream/video/sfu/signal/VideoMuteChanged;->muted:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/squareup/wire/l;->hashCode:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {v0}, Lne3/l;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x25

    iget-boolean v1, p0, Lstream/video/sfu/signal/VideoMuteChanged;->muted:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lcom/squareup/wire/l;->hashCode:I

    return v1

    :cond_0
    return v0
.end method

.method public bridge synthetic newBuilder()Lcom/squareup/wire/j;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lstream/video/sfu/signal/VideoMuteChanged;->newBuilder()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Lcom/squareup/wire/j;

    return-object v0
.end method

.method public synthetic newBuilder()Ljava/lang/Void;
    .locals 2
    .annotation runtime Ll83/c;
    .end annotation

    .line 2
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v1, p0, Lstream/video/sfu/signal/VideoMuteChanged;->muted:Z

    const-string v2, "muted="

    invoke-static {v2, v1, v0}, Lq63/c;->x(Ljava/lang/String;ZLjava/util/ArrayList;)V

    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "VideoMuteChanged{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
