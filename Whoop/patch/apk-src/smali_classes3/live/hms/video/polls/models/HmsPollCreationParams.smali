.class public final Llive/hms/video/polls/models/HmsPollCreationParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008 \n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001By\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0010\u0008\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0008H\u00c6\u0003J\t\u0010(\u001a\u00020\u0008H\u00c6\u0003J\t\u0010)\u001a\u00020\u0008H\u00c6\u0003J\t\u0010*\u001a\u00020\u000cH\u00c6\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH\u00c6\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH\u00c6\u0003J\t\u0010-\u001a\u00020\u0011H\u00c6\u0003J\u007f\u0010.\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0010\u0008\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010/\u001a\u00020\u00082\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u000202H\u00d6\u0001J\t\u00103\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#\u00a8\u00064"
    }
    d2 = {
        "Llive/hms/video/polls/models/HmsPollCreationParams;",
        "",
        "pollId",
        "",
        "title",
        "duration",
        "",
        "anonymous",
        "",
        "visibility",
        "locked",
        "mode",
        "Llive/hms/video/polls/models/HmsPollUserTrackingMode;",
        "vote",
        "",
        "responses",
        "category",
        "Llive/hms/video/polls/models/HmsPollCategory;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;JZZZLlive/hms/video/polls/models/HmsPollUserTrackingMode;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollCategory;)V",
        "getPollId",
        "()Ljava/lang/String;",
        "getTitle",
        "getDuration",
        "()J",
        "getAnonymous",
        "()Z",
        "getVisibility",
        "getLocked",
        "getMode",
        "()Llive/hms/video/polls/models/HmsPollUserTrackingMode;",
        "getVote",
        "()Ljava/util/List;",
        "getResponses",
        "getCategory",
        "()Llive/hms/video/polls/models/HmsPollCategory;",
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
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final anonymous:Z

.field private final category:Llive/hms/video/polls/models/HmsPollCategory;

.field private final duration:J

.field private final locked:Z

.field private final mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

.field private final pollId:Ljava/lang/String;

.field private final responses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;

.field private final visibility:Z

.field private final vote:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JZZZLlive/hms/video/polls/models/HmsPollUserTrackingMode;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollCategory;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JZZZ",
            "Llive/hms/video/polls/models/HmsPollUserTrackingMode;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Llive/hms/video/polls/models/HmsPollCategory;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "category"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->pollId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->title:Ljava/lang/String;

    .line 4
    iput-wide p3, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->duration:J

    .line 5
    iput-boolean p5, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->anonymous:Z

    .line 6
    iput-boolean p6, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->visibility:Z

    .line 7
    iput-boolean p7, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->locked:Z

    .line 8
    iput-object p8, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    .line 9
    iput-object p9, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->vote:Ljava/util/List;

    .line 10
    iput-object p10, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->responses:Ljava/util/List;

    .line 11
    iput-object p11, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->category:Llive/hms/video/polls/models/HmsPollCategory;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JZZZLlive/hms/video/polls/models/HmsPollUserTrackingMode;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollCategory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p13, p12, 0x1

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_1

    const-wide/16 p3, 0x0

    :cond_1
    and-int/lit8 p13, p12, 0x8

    const/4 v1, 0x0

    if-eqz p13, :cond_2

    move p5, v1

    :cond_2
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_3

    const/4 p6, 0x1

    :cond_3
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_4

    move p7, v1

    :cond_4
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_5

    .line 12
    sget-object p8, Llive/hms/video/polls/models/HmsPollUserTrackingMode;->USER_ID:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    :cond_5
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_6

    move-object p9, v0

    :cond_6
    and-int/lit16 p12, p12, 0x100

    if-eqz p12, :cond_7

    move-object p12, p11

    move-object p11, v0

    :goto_0
    move-object p10, p9

    move-object p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move-wide p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_7
    move-object p12, p11

    move-object p11, p10

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p12}, Llive/hms/video/polls/models/HmsPollCreationParams;-><init>(Ljava/lang/String;Ljava/lang/String;JZZZLlive/hms/video/polls/models/HmsPollUserTrackingMode;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollCategory;)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/polls/models/HmsPollCreationParams;Ljava/lang/String;Ljava/lang/String;JZZZLlive/hms/video/polls/models/HmsPollUserTrackingMode;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollCategory;ILjava/lang/Object;)Llive/hms/video/polls/models/HmsPollCreationParams;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->pollId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-wide p3, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->duration:J

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-boolean p5, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->anonymous:Z

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-boolean p6, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->visibility:Z

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-boolean p7, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->locked:Z

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p8, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p9, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->vote:Ljava/util/List;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p10, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->responses:Ljava/util/List;

    :cond_8
    and-int/lit16 p12, p12, 0x200

    if-eqz p12, :cond_9

    iget-object p11, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->category:Llive/hms/video/polls/models/HmsPollCategory;

    :cond_9
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move p8, p6

    move p9, p7

    move p7, p5

    move-wide p5, p3

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p13}, Llive/hms/video/polls/models/HmsPollCreationParams;->copy(Ljava/lang/String;Ljava/lang/String;JZZZLlive/hms/video/polls/models/HmsPollUserTrackingMode;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollCategory;)Llive/hms/video/polls/models/HmsPollCreationParams;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->pollId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Llive/hms/video/polls/models/HmsPollCategory;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->category:Llive/hms/video/polls/models/HmsPollCategory;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->duration:J

    return-wide v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->anonymous:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->visibility:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->locked:Z

    return v0
.end method

.method public final component7()Llive/hms/video/polls/models/HmsPollUserTrackingMode;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

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

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->vote:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->responses:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;JZZZLlive/hms/video/polls/models/HmsPollUserTrackingMode;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollCategory;)Llive/hms/video/polls/models/HmsPollCreationParams;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JZZZ",
            "Llive/hms/video/polls/models/HmsPollUserTrackingMode;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Llive/hms/video/polls/models/HmsPollCategory;",
            ")",
            "Llive/hms/video/polls/models/HmsPollCreationParams;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "category"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/polls/models/HmsPollCreationParams;

    move-object v2, p1

    move-object v3, p2

    move-wide/from16 v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v12}, Llive/hms/video/polls/models/HmsPollCreationParams;-><init>(Ljava/lang/String;Ljava/lang/String;JZZZLlive/hms/video/polls/models/HmsPollUserTrackingMode;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollCategory;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/polls/models/HmsPollCreationParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/polls/models/HmsPollCreationParams;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->pollId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPollCreationParams;->pollId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->title:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPollCreationParams;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->duration:J

    iget-wide v5, p1, Llive/hms/video/polls/models/HmsPollCreationParams;->duration:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->anonymous:Z

    iget-boolean v3, p1, Llive/hms/video/polls/models/HmsPollCreationParams;->anonymous:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->visibility:Z

    iget-boolean v3, p1, Llive/hms/video/polls/models/HmsPollCreationParams;->visibility:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->locked:Z

    iget-boolean v3, p1, Llive/hms/video/polls/models/HmsPollCreationParams;->locked:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPollCreationParams;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->vote:Ljava/util/List;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPollCreationParams;->vote:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->responses:Ljava/util/List;

    iget-object v3, p1, Llive/hms/video/polls/models/HmsPollCreationParams;->responses:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->category:Llive/hms/video/polls/models/HmsPollCategory;

    iget-object p1, p1, Llive/hms/video/polls/models/HmsPollCreationParams;->category:Llive/hms/video/polls/models/HmsPollCategory;

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAnonymous()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->anonymous:Z

    return v0
.end method

.method public final getCategory()Llive/hms/video/polls/models/HmsPollCategory;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->category:Llive/hms/video/polls/models/HmsPollCategory;

    return-object v0
.end method

.method public final getDuration()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->duration:J

    return-wide v0
.end method

.method public final getLocked()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->locked:Z

    return v0
.end method

.method public final getMode()Llive/hms/video/polls/models/HmsPollUserTrackingMode;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    return-object v0
.end method

.method public final getPollId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->pollId:Ljava/lang/String;

    return-object v0
.end method

.method public final getResponses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->responses:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getVisibility()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->visibility:Z

    return v0
.end method

.method public final getVote()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->vote:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->pollId:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->title:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v3, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->duration:J

    invoke-static {v0, v3, v4, v2}, Ld;->e(IJI)I

    move-result v0

    iget-boolean v3, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->anonymous:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->visibility:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->locked:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->vote:Ljava/util/List;

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->responses:Ljava/util/List;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v3, v1

    mul-int/2addr v3, v2

    iget-object v0, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->category:Llive/hms/video/polls/models/HmsPollCategory;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HmsPollCreationParams(pollId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->pollId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->duration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", anonymous="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->anonymous:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", visibility="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->visibility:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", locked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->locked:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->mode:Llive/hms/video/polls/models/HmsPollUserTrackingMode;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", vote="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->vote:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", responses="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->responses:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", category="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/HmsPollCreationParams;->category:Llive/hms/video/polls/models/HmsPollCategory;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
