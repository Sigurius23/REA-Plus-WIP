.class public final Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/presentation/ProfileViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ProfileDialogState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J~\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010%\u001a\u00020$H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010(\u001a\u00020\'H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010+\u001a\u00020\t2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010-\u001a\u0004\u0008/\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00081\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010-\u001a\u0004\u00082\u0010\u0014R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010-\u001a\u0004\u00083\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u00085\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00104\u001a\u0004\u00086\u0010\u001bR\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00107\u001a\u0004\u00088\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u00109\u001a\u0004\u0008:\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u00109\u001a\u0004\u0008;\u0010 \u00a8\u0006<"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "primaryActionText",
        "Ly81/e;",
        "primaryActionColor",
        "secondaryActionText",
        "description",
        "",
        "showCloseIcon",
        "useSolidButtons",
        "Lj11/p;",
        "topDialogStyle",
        "Lcom/whoop/profile/presentation/ProfileEvent;",
        "approveEvent",
        "dismissEvent",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;)V",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "component3",
        "()Ly81/e;",
        "component4",
        "component5",
        "component6",
        "()Z",
        "component7",
        "component8",
        "()Lj11/p;",
        "component9",
        "()Lcom/whoop/profile/presentation/ProfileEvent;",
        "component10",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;)Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "getPrimaryActionText",
        "Ly81/e;",
        "getPrimaryActionColor",
        "getSecondaryActionText",
        "getDescription",
        "Z",
        "getShowCloseIcon",
        "getUseSolidButtons",
        "Lj11/p;",
        "getTopDialogStyle",
        "Lcom/whoop/profile/presentation/ProfileEvent;",
        "getApproveEvent",
        "getDismissEvent",
        "profile_release"
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
.field private final approveEvent:Lcom/whoop/profile/presentation/ProfileEvent;

.field private final description:Lcom/whoop/design/util/TextResource;

.field private final dismissEvent:Lcom/whoop/profile/presentation/ProfileEvent;

.field private final primaryActionColor:Ly81/e;

.field private final primaryActionText:Lcom/whoop/design/util/TextResource;

.field private final secondaryActionText:Lcom/whoop/design/util/TextResource;

.field private final showCloseIcon:Z

.field private final title:Lcom/whoop/design/util/TextResource;

.field private final topDialogStyle:Lj11/p;

.field private final useSolidButtons:Z


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topDialogStyle"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->title:Lcom/whoop/design/util/TextResource;

    .line 3
    iput-object p2, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->primaryActionText:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p3, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->primaryActionColor:Ly81/e;

    .line 5
    iput-object p4, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->secondaryActionText:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p5, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->description:Lcom/whoop/design/util/TextResource;

    .line 7
    iput-boolean p6, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->showCloseIcon:Z

    .line 8
    iput-boolean p7, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->useSolidButtons:Z

    .line 9
    iput-object p8, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->topDialogStyle:Lj11/p;

    .line 10
    iput-object p9, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->approveEvent:Lcom/whoop/profile/presentation/ProfileEvent;

    .line 11
    iput-object p10, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->dismissEvent:Lcom/whoop/profile/presentation/ProfileEvent;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p12, p11, 0x2

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p12, p11, 0x20

    const/4 v1, 0x0

    if-eqz p12, :cond_3

    move p6, v1

    :cond_3
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_4

    move p7, v1

    :cond_4
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_5

    .line 12
    sget-object p8, Lj11/p;->DEFAULT:Lj11/p;

    :cond_5
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_6

    move-object p9, v0

    :cond_6
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_7

    move-object p11, v0

    :goto_0
    move-object p10, p9

    move-object p9, p8

    move p8, p7

    move p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_7
    move-object p11, p10

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;ILjava/lang/Object;)Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->title:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->primaryActionText:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->primaryActionColor:Ly81/e;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->secondaryActionText:Lcom/whoop/design/util/TextResource;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->description:Lcom/whoop/design/util/TextResource;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-boolean p6, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->showCloseIcon:Z

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-boolean p7, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->useSolidButtons:Z

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->topDialogStyle:Lj11/p;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->approveEvent:Lcom/whoop/profile/presentation/ProfileEvent;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->dismissEvent:Lcom/whoop/profile/presentation/ProfileEvent;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move p9, p7

    move-object p10, p8

    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;)Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component10()Lcom/whoop/profile/presentation/ProfileEvent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->dismissEvent:Lcom/whoop/profile/presentation/ProfileEvent;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->primaryActionText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Ly81/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->primaryActionColor:Ly81/e;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->secondaryActionText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->description:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->showCloseIcon:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->useSolidButtons:Z

    return v0
.end method

.method public final component8()Lj11/p;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->topDialogStyle:Lj11/p;

    return-object v0
.end method

.method public final component9()Lcom/whoop/profile/presentation/ProfileEvent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->approveEvent:Lcom/whoop/profile/presentation/ProfileEvent;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;)Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;
    .locals 12

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topDialogStyle"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->primaryActionText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->primaryActionText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->primaryActionColor:Ly81/e;

    iget-object v3, p1, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->primaryActionColor:Ly81/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->secondaryActionText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->secondaryActionText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->description:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->description:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->showCloseIcon:Z

    iget-boolean v3, p1, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->showCloseIcon:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->useSolidButtons:Z

    iget-boolean v3, p1, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->useSolidButtons:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->topDialogStyle:Lj11/p;

    iget-object v3, p1, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->topDialogStyle:Lj11/p;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->approveEvent:Lcom/whoop/profile/presentation/ProfileEvent;

    iget-object v3, p1, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->approveEvent:Lcom/whoop/profile/presentation/ProfileEvent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->dismissEvent:Lcom/whoop/profile/presentation/ProfileEvent;

    iget-object p1, p1, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->dismissEvent:Lcom/whoop/profile/presentation/ProfileEvent;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getApproveEvent()Lcom/whoop/profile/presentation/ProfileEvent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->approveEvent:Lcom/whoop/profile/presentation/ProfileEvent;

    return-object v0
.end method

.method public final getDescription()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->description:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getDismissEvent()Lcom/whoop/profile/presentation/ProfileEvent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->dismissEvent:Lcom/whoop/profile/presentation/ProfileEvent;

    return-object v0
.end method

.method public final getPrimaryActionColor()Ly81/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->primaryActionColor:Ly81/e;

    return-object v0
.end method

.method public final getPrimaryActionText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->primaryActionText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getSecondaryActionText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->secondaryActionText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getShowCloseIcon()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->showCloseIcon:Z

    return v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTopDialogStyle()Lj11/p;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->topDialogStyle:Lj11/p;

    return-object v0
.end method

.method public final getUseSolidButtons()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->useSolidButtons:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->title:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->primaryActionText:Lcom/whoop/design/util/TextResource;

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

    iget-object v2, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->primaryActionColor:Ly81/e;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->secondaryActionText:Lcom/whoop/design/util/TextResource;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->description:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->showCloseIcon:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->useSolidButtons:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->topDialogStyle:Lj11/p;

    invoke-static {v2, v0, v1}, Lte0/d;->f(Lj11/p;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->approveEvent:Lcom/whoop/profile/presentation/ProfileEvent;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->dismissEvent:Lcom/whoop/profile/presentation/ProfileEvent;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->title:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->primaryActionText:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->primaryActionColor:Ly81/e;

    iget-object v3, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->secondaryActionText:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->description:Lcom/whoop/design/util/TextResource;

    iget-boolean v5, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->showCloseIcon:Z

    iget-boolean v6, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->useSolidButtons:Z

    iget-object v7, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->topDialogStyle:Lj11/p;

    iget-object v8, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->approveEvent:Lcom/whoop/profile/presentation/ProfileEvent;

    iget-object v9, p0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;->dismissEvent:Lcom/whoop/profile/presentation/ProfileEvent;

    const-string v10, ", primaryActionText="

    const-string v11, ", primaryActionColor="

    const-string v12, "ProfileDialogState(title="

    invoke-static {v12, v0, v10, v1, v11}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", secondaryActionText="

    const-string v10, ", description="

    invoke-static {v0, v2, v1, v3, v10}, Lte0/d;->x(Ljava/lang/StringBuilder;Ly81/e;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ", showCloseIcon="

    const-string v2, ", useSolidButtons="

    invoke-static {v4, v1, v2, v0, v5}, Lte0/d;->w(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    const-string v1, ", topDialogStyle="

    const-string v2, ", approveEvent="

    invoke-static {v0, v6, v1, v7, v2}, Lte0/d;->y(Ljava/lang/StringBuilder;ZLjava/lang/String;Lj11/p;Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dismissEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
