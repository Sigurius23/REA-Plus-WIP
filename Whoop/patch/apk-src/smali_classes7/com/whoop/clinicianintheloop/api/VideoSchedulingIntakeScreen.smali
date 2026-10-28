.class public final Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 22\u00020\u0001:\u00013BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJX\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fH\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u001a\u0010$\u001a\u00020#2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010&\u001a\u0004\u0008\'\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010&\u001a\u0004\u0008(\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010&\u001a\u0004\u0008)\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010*\u001a\u0004\u0008+\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010,\u001a\u0004\u0008-\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010.\u001a\u0004\u0008/\u0010\u0019R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00100\u001a\u0004\u00081\u0010\u001b\u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;",
        "",
        "",
        "id",
        "navigationTitle",
        "navigationSkipTitle",
        "Lgo0/a;",
        "contentAlignment",
        "Lgo0/e;",
        "type",
        "Lgo0/c;",
        "content",
        "Lcom/whoop/design/models/ProgressButtonModel;",
        "progressButton",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgo0/a;Lgo0/e;Lgo0/c;Lcom/whoop/design/models/ProgressButtonModel;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lgo0/a;",
        "component5",
        "()Lgo0/e;",
        "component6",
        "()Lgo0/c;",
        "component7",
        "()Lcom/whoop/design/models/ProgressButtonModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgo0/a;Lgo0/e;Lgo0/c;Lcom/whoop/design/models/ProgressButtonModel;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getNavigationTitle",
        "getNavigationSkipTitle",
        "Lgo0/a;",
        "getContentAlignment",
        "Lgo0/e;",
        "getType",
        "Lgo0/c;",
        "getContent",
        "Lcom/whoop/design/models/ProgressButtonModel;",
        "getProgressButton",
        "Companion",
        "a",
        "clinician-in-the-loop_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
    with = Lgo0/d;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen$a;


# instance fields
.field private final content:Lgo0/c;

.field private final contentAlignment:Lgo0/a;

.field private final id:Ljava/lang/String;

.field private final navigationSkipTitle:Ljava/lang/String;

.field private final navigationTitle:Ljava/lang/String;

.field private final progressButton:Lcom/whoop/design/models/ProgressButtonModel;

.field private final type:Lgo0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->Companion:Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen$a;

    sget v0, Lcom/whoop/design/models/ProgressButtonModel;->$stable:I

    sput v0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgo0/a;Lgo0/e;Lgo0/c;Lcom/whoop/design/models/ProgressButtonModel;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentAlignment"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressButton"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->id:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->navigationTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->navigationSkipTitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->contentAlignment:Lgo0/a;

    iput-object p5, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->type:Lgo0/e;

    iput-object p6, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->content:Lgo0/c;

    iput-object p7, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgo0/a;Lgo0/e;Lgo0/c;Lcom/whoop/design/models/ProgressButtonModel;ILjava/lang/Object;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->navigationTitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->navigationSkipTitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->contentAlignment:Lgo0/a;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->type:Lgo0/e;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->content:Lgo0/c;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgo0/a;Lgo0/e;Lgo0/c;Lcom/whoop/design/models/ProgressButtonModel;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->navigationSkipTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lgo0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->contentAlignment:Lgo0/a;

    return-object v0
.end method

.method public final component5()Lgo0/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->type:Lgo0/e;

    return-object v0
.end method

.method public final component6()Lgo0/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->content:Lgo0/c;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/ProgressButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgo0/a;Lgo0/e;Lgo0/c;Lcom/whoop/design/models/ProgressButtonModel;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;
    .locals 9

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentAlignment"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressButton"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgo0/a;Lgo0/e;Lgo0/c;Lcom/whoop/design/models/ProgressButtonModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->navigationTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->navigationTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->navigationSkipTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->navigationSkipTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->contentAlignment:Lgo0/a;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->contentAlignment:Lgo0/a;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->type:Lgo0/e;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->type:Lgo0/e;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->content:Lgo0/c;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->content:Lgo0/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    iget-object p1, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getContent()Lgo0/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->content:Lgo0/c;

    return-object v0
.end method

.method public final getContentAlignment()Lgo0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->contentAlignment:Lgo0/a;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getNavigationSkipTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->navigationSkipTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getNavigationTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getProgressButton()Lcom/whoop/design/models/ProgressButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    return-object v0
.end method

.method public final getType()Lgo0/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->type:Lgo0/e;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->navigationTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->navigationSkipTitle:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->contentAlignment:Lgo0/a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->type:Lgo0/e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->content:Lgo0/c;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/ProgressButtonModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->navigationTitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->navigationSkipTitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->contentAlignment:Lgo0/a;

    iget-object v4, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->type:Lgo0/e;

    iget-object v5, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->content:Lgo0/c;

    iget-object v6, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    const-string v7, ", navigationTitle="

    const-string v8, ", navigationSkipTitle="

    const-string v9, "VideoSchedulingIntakeScreen(id="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", contentAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", content="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", progressButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
