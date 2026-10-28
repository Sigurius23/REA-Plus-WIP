.class public final Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0000\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0010\u0010!\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"Jx\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u0014J\u0010\u0010&\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u0017J\u001a\u0010)\u001a\u00020\n2\u0008\u0010(\u001a\u0004\u0018\u00010\'H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008-\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010.\u001a\u0004\u0008/\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010+\u001a\u0004\u00080\u0010\u0014R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00101\u001a\u0004\u00082\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00101\u001a\u0004\u00083\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00104\u001a\u0004\u00085\u0010\u001dR\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00106\u001a\u0004\u00087\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00104\u001a\u0004\u00088\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u00109\u001a\u0004\u0008:\u0010\"\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;",
        "Lm91/u;",
        "",
        "id",
        "key",
        "",
        "finalIndex",
        "status",
        "initial",
        "completed",
        "",
        "visibility",
        "Lcom/whoop/home/domain/models/BorderAnimation;",
        "animateBorder",
        "highlightCard",
        "Lcom/whoop/home/domain/models/ContainerBorderStyle;",
        "containerBorderStyle",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lm91/u;Lm91/u;ZLcom/whoop/home/domain/models/BorderAnimation;ZLcom/whoop/home/domain/models/ContainerBorderStyle;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()I",
        "component4",
        "component5",
        "()Lm91/u;",
        "component6",
        "component7",
        "()Z",
        "component8",
        "()Lcom/whoop/home/domain/models/BorderAnimation;",
        "component9",
        "component10",
        "()Lcom/whoop/home/domain/models/ContainerBorderStyle;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lm91/u;Lm91/u;ZLcom/whoop/home/domain/models/BorderAnimation;ZLcom/whoop/home/domain/models/ContainerBorderStyle;)Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getKey",
        "I",
        "getFinalIndex",
        "getStatus",
        "Lm91/u;",
        "getInitial",
        "getCompleted",
        "Z",
        "getVisibility",
        "Lcom/whoop/home/domain/models/BorderAnimation;",
        "getAnimateBorder",
        "getHighlightCard",
        "Lcom/whoop/home/domain/models/ContainerBorderStyle;",
        "getContainerBorderStyle",
        "home_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final animateBorder:Lcom/whoop/home/domain/models/BorderAnimation;

.field private final completed:Lm91/u;

.field private final containerBorderStyle:Lcom/whoop/home/domain/models/ContainerBorderStyle;

.field private final finalIndex:I

.field private final highlightCard:Z

.field private final id:Ljava/lang/String;

.field private final initial:Lm91/u;

.field private final key:Ljava/lang/String;

.field private final status:Ljava/lang/String;

.field private final visibility:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lm91/u;Lm91/u;ZLcom/whoop/home/domain/models/BorderAnimation;ZLcom/whoop/home/domain/models/ContainerBorderStyle;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "animateBorder"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containerBorderStyle"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->id:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->key:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->finalIndex:I

    .line 5
    iput-object p4, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->status:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->initial:Lm91/u;

    .line 7
    iput-object p6, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->completed:Lm91/u;

    .line 8
    iput-boolean p7, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->visibility:Z

    .line 9
    iput-object p8, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->animateBorder:Lcom/whoop/home/domain/models/BorderAnimation;

    .line 10
    iput-boolean p9, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->highlightCard:Z

    .line 11
    iput-object p10, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->containerBorderStyle:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lm91/u;Lm91/u;ZLcom/whoop/home/domain/models/BorderAnimation;ZLcom/whoop/home/domain/models/ContainerBorderStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    move v9, v1

    goto :goto_0

    :cond_0
    move/from16 v9, p7

    :goto_0
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_1

    .line 12
    sget-object v1, Lcom/whoop/home/domain/models/BorderAnimation;->NONE:Lcom/whoop/home/domain/models/BorderAnimation;

    move-object v10, v1

    goto :goto_1

    :cond_1
    move-object/from16 v10, p8

    :goto_1
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    move v11, v1

    goto :goto_2

    :cond_2
    move/from16 v11, p9

    :goto_2
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_3

    .line 13
    sget-object v0, Lcom/whoop/home/domain/models/ContainerBorderStyle;->ONBOARDING:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    move-object v12, v0

    :goto_3
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    goto :goto_4

    :cond_3
    move-object/from16 v12, p10

    goto :goto_3

    .line 14
    :goto_4
    invoke-direct/range {v2 .. v12}, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lm91/u;Lm91/u;ZLcom/whoop/home/domain/models/BorderAnimation;ZLcom/whoop/home/domain/models/ContainerBorderStyle;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lm91/u;Lm91/u;ZLcom/whoop/home/domain/models/BorderAnimation;ZLcom/whoop/home/domain/models/ContainerBorderStyle;ILjava/lang/Object;)Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->key:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget p3, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->finalIndex:I

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->status:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->initial:Lm91/u;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->completed:Lm91/u;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-boolean p7, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->visibility:Z

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->animateBorder:Lcom/whoop/home/domain/models/BorderAnimation;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-boolean p9, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->highlightCard:Z

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->containerBorderStyle:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    :cond_9
    move p11, p9

    move-object p12, p10

    move p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->copy(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lm91/u;Lm91/u;ZLcom/whoop/home/domain/models/BorderAnimation;ZLcom/whoop/home/domain/models/ContainerBorderStyle;)Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/home/domain/models/ContainerBorderStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->containerBorderStyle:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->key:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->finalIndex:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lm91/u;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->initial:Lm91/u;

    return-object v0
.end method

.method public final component6()Lm91/u;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->completed:Lm91/u;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->visibility:Z

    return v0
.end method

.method public final component8()Lcom/whoop/home/domain/models/BorderAnimation;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->animateBorder:Lcom/whoop/home/domain/models/BorderAnimation;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->highlightCard:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lm91/u;Lm91/u;ZLcom/whoop/home/domain/models/BorderAnimation;ZLcom/whoop/home/domain/models/ContainerBorderStyle;)Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;
    .locals 12

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "animateBorder"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containerBorderStyle"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v10, p9

    invoke-direct/range {v1 .. v11}, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lm91/u;Lm91/u;ZLcom/whoop/home/domain/models/BorderAnimation;ZLcom/whoop/home/domain/models/ContainerBorderStyle;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;

    iget-object v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->key:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->key:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->finalIndex:I

    iget v3, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->finalIndex:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->status:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->status:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->initial:Lm91/u;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->initial:Lm91/u;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->completed:Lm91/u;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->completed:Lm91/u;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->visibility:Z

    iget-boolean v3, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->visibility:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->animateBorder:Lcom/whoop/home/domain/models/BorderAnimation;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->animateBorder:Lcom/whoop/home/domain/models/BorderAnimation;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->highlightCard:Z

    iget-boolean v3, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->highlightCard:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->containerBorderStyle:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    iget-object p1, p1, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->containerBorderStyle:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAnimateBorder()Lcom/whoop/home/domain/models/BorderAnimation;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->animateBorder:Lcom/whoop/home/domain/models/BorderAnimation;

    return-object v0
.end method

.method public final getCompleted()Lm91/u;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->completed:Lm91/u;

    return-object v0
.end method

.method public final getContainerBorderStyle()Lcom/whoop/home/domain/models/ContainerBorderStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->containerBorderStyle:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    return-object v0
.end method

.method public bridge getEvent()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lm91/u;->getEvent()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getFinalIndex()I
    .locals 1

    iget v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->finalIndex:I

    return v0
.end method

.method public final getHighlightCard()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->highlightCard:Z

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitial()Lm91/u;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->initial:Lm91/u;

    return-object v0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->key:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final getVisibility()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->visibility:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->key:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->finalIndex:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->status:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->initial:Lm91/u;

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

    iget-object v2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->completed:Lm91/u;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->visibility:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->animateBorder:Lcom/whoop/home/domain/models/BorderAnimation;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->highlightCard:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->containerBorderStyle:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->key:Ljava/lang/String;

    iget v2, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->finalIndex:I

    iget-object v3, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->status:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->initial:Lm91/u;

    iget-object v5, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->completed:Lm91/u;

    iget-boolean v6, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->visibility:Z

    iget-object v7, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->animateBorder:Lcom/whoop/home/domain/models/BorderAnimation;

    iget-boolean v8, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->highlightCard:Z

    iget-object v9, p0, Lcom/whoop/home/domain/models/CustomAnimationContainerViewState;->containerBorderStyle:Lcom/whoop/home/domain/models/ContainerBorderStyle;

    const-string v10, ", key="

    const-string v11, ", finalIndex="

    const-string v12, "CustomAnimationContainerViewState(id="

    invoke-static {v12, v0, v10, v1, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", status="

    const-string v10, ", initial="

    invoke-static {v2, v1, v3, v10, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", completed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", visibility="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", animateBorder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", highlightCard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", containerBorderStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
