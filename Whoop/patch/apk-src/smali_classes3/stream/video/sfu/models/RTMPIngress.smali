.class public final Lstream/video/sfu/models/RTMPIngress;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/models/RTMPIngress$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0015\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BW\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ]\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u001e\u001a\u0004\u0008\u001f\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u001e\u001a\u0004\u0008 \u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010!\u001a\u0004\u0008\"\u0010#R\u001a\u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010$\u001a\u0004\u0008%\u0010\u001bR\u001a\u0010\n\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010$\u001a\u0004\u0008&\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010$\u001a\u0004\u0008\'\u0010\u001bR\u001a\u0010\u000c\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010$\u001a\u0004\u0008(\u0010\u001b\u00a8\u0006*"
    }
    d2 = {
        "Lstream/video/sfu/models/RTMPIngress;",
        "Lcom/squareup/wire/l;",
        "",
        "",
        "width",
        "height",
        "",
        "frame_rate",
        "",
        "software",
        "version",
        "encoder",
        "remote_addr",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(IIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)V",
        "newBuilder",
        "()Ljava/lang/Void;",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "()I",
        "toString",
        "()Ljava/lang/String;",
        "copy",
        "(IIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/models/RTMPIngress;",
        "I",
        "getWidth",
        "getHeight",
        "D",
        "getFrame_rate",
        "()D",
        "Ljava/lang/String;",
        "getSoftware",
        "getVersion",
        "getEncoder",
        "getRemote_addr",
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

.field public static final Companion:Lstream/video/sfu/models/RTMPIngress$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final encoder:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x6
    .end annotation
.end field

.field private final frame_rate:D
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
        jsonName = "frameRate"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x3
    .end annotation
.end field

.field private final height:I
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#UINT32"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x2
    .end annotation
.end field

.field private final remote_addr:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "remoteAddr"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x7
    .end annotation
.end field

.field private final software:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x4
    .end annotation
.end field

.field private final version:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x5
    .end annotation
.end field

.field private final width:I
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#UINT32"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x1
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/models/RTMPIngress$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/models/RTMPIngress$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/models/RTMPIngress;->Companion:Lstream/video/sfu/models/RTMPIngress$Companion;

    const-class v0, Lstream/video/sfu/models/RTMPIngress;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/models/RTMPIngress$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/models/RTMPIngress$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/models/RTMPIngress;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0xff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lstream/video/sfu/models/RTMPIngress;-><init>(IIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)V
    .locals 1

    const-string v0, "software"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encoder"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remote_addr"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Lstream/video/sfu/models/RTMPIngress;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {p0, v0, p9}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 6
    iput p1, p0, Lstream/video/sfu/models/RTMPIngress;->width:I

    .line 7
    iput p2, p0, Lstream/video/sfu/models/RTMPIngress;->height:I

    .line 8
    iput-wide p3, p0, Lstream/video/sfu/models/RTMPIngress;->frame_rate:D

    .line 9
    iput-object p5, p0, Lstream/video/sfu/models/RTMPIngress;->software:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lstream/video/sfu/models/RTMPIngress;->version:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lstream/video/sfu/models/RTMPIngress;->encoder:Ljava/lang/String;

    .line 12
    iput-object p8, p0, Lstream/video/sfu/models/RTMPIngress;->remote_addr:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x1

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    const-wide/16 p3, 0x0

    :cond_2
    and-int/lit8 p11, p10, 0x8

    .line 2
    const-string v0, ""

    if-eqz p11, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move-object p7, v0

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    move-object p8, v0

    :cond_6
    and-int/lit16 p10, p10, 0x80

    if-eqz p10, :cond_7

    .line 3
    sget-object p9, Lne3/l;->E:Lne3/l;

    :cond_7
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-wide p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 4
    invoke-direct/range {p1 .. p10}, Lstream/video/sfu/models/RTMPIngress;-><init>(IIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/models/RTMPIngress;IIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/models/RTMPIngress;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lstream/video/sfu/models/RTMPIngress;->width:I

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget p2, p0, Lstream/video/sfu/models/RTMPIngress;->height:I

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-wide p3, p0, Lstream/video/sfu/models/RTMPIngress;->frame_rate:D

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p5, p0, Lstream/video/sfu/models/RTMPIngress;->software:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p6, p0, Lstream/video/sfu/models/RTMPIngress;->version:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p7, p0, Lstream/video/sfu/models/RTMPIngress;->encoder:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p8, p0, Lstream/video/sfu/models/RTMPIngress;->remote_addr:Ljava/lang/String;

    :cond_6
    and-int/lit16 p10, p10, 0x80

    if-eqz p10, :cond_7

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p9

    :cond_7
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p7, p5

    move-wide p5, p3

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p11}, Lstream/video/sfu/models/RTMPIngress;->copy(IIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/models/RTMPIngress;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(IIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/models/RTMPIngress;
    .locals 11

    const-string v0, "software"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encoder"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remote_addr"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lstream/video/sfu/models/RTMPIngress;

    move v2, p1

    move v3, p2

    move-wide v4, p3

    invoke-direct/range {v1 .. v10}, Lstream/video/sfu/models/RTMPIngress;-><init>(IIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/models/RTMPIngress;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/models/RTMPIngress;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lstream/video/sfu/models/RTMPIngress;->width:I

    iget v3, p1, Lstream/video/sfu/models/RTMPIngress;->width:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lstream/video/sfu/models/RTMPIngress;->height:I

    iget v3, p1, Lstream/video/sfu/models/RTMPIngress;->height:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lstream/video/sfu/models/RTMPIngress;->frame_rate:D

    iget-wide v5, p1, Lstream/video/sfu/models/RTMPIngress;->frame_rate:D

    cmpg-double v1, v3, v5

    if-nez v1, :cond_9

    iget-object v1, p0, Lstream/video/sfu/models/RTMPIngress;->software:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/models/RTMPIngress;->software:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lstream/video/sfu/models/RTMPIngress;->version:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/models/RTMPIngress;->version:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lstream/video/sfu/models/RTMPIngress;->encoder:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/models/RTMPIngress;->encoder:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lstream/video/sfu/models/RTMPIngress;->remote_addr:Ljava/lang/String;

    iget-object p1, p1, Lstream/video/sfu/models/RTMPIngress;->remote_addr:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0

    :cond_9
    return v2
.end method

.method public final getEncoder()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/RTMPIngress;->encoder:Ljava/lang/String;

    return-object v0
.end method

.method public final getFrame_rate()D
    .locals 2

    iget-wide v0, p0, Lstream/video/sfu/models/RTMPIngress;->frame_rate:D

    return-wide v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/models/RTMPIngress;->height:I

    return v0
.end method

.method public final getRemote_addr()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/RTMPIngress;->remote_addr:Ljava/lang/String;

    return-object v0
.end method

.method public final getSoftware()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/RTMPIngress;->software:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/RTMPIngress;->version:Ljava/lang/String;

    return-object v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/models/RTMPIngress;->width:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/squareup/wire/l;->hashCode:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {v0}, Lne3/l;->hashCode()I

    move-result v0

    const/16 v1, 0x25

    mul-int/2addr v0, v1

    iget v2, p0, Lstream/video/sfu/models/RTMPIngress;->width:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lstream/video/sfu/models/RTMPIngress;->height:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-wide v2, p0, Lstream/video/sfu/models/RTMPIngress;->frame_rate:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/models/RTMPIngress;->software:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/models/RTMPIngress;->version:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/models/RTMPIngress;->encoder:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lstream/video/sfu/models/RTMPIngress;->remote_addr:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

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
    invoke-virtual {p0}, Lstream/video/sfu/models/RTMPIngress;->newBuilder()Ljava/lang/Void;

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

    iget v1, p0, Lstream/video/sfu/models/RTMPIngress;->width:I

    const-string v2, "width="

    invoke-static {v1, v2, v0}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    iget v1, p0, Lstream/video/sfu/models/RTMPIngress;->height:I

    const-string v2, "height="

    invoke-static {v1, v2, v0}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    iget-wide v1, p0, Lstream/video/sfu/models/RTMPIngress;->frame_rate:D

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "frame_rate="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lstream/video/sfu/models/RTMPIngress;->software:Ljava/lang/String;

    const-string v2, "software="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/models/RTMPIngress;->version:Ljava/lang/String;

    const-string v2, "version="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/models/RTMPIngress;->encoder:Ljava/lang/String;

    const-string v2, "encoder="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/models/RTMPIngress;->remote_addr:Ljava/lang/String;

    const-string v2, "remote_addr="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "RTMPIngress{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
