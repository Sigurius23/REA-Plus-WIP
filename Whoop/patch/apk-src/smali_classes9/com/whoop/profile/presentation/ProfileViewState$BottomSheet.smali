.class public final Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/presentation/ProfileViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BottomSheet"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u00002\u00020\u0001B!\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000cJ0\u0010\u000e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u000cJ\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0018\u001a\u0004\u0008\u0019\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u000cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u001a\u001a\u0004\u0008\u001c\u0010\u000c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;",
        "",
        "Lkd1/o;",
        "image",
        "",
        "title",
        "subtitle",
        "<init>",
        "(Lkd1/o;Ljava/lang/String;Ljava/lang/String;)V",
        "component1",
        "()Lkd1/o;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "copy",
        "(Lkd1/o;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lkd1/o;",
        "getImage",
        "Ljava/lang/String;",
        "getTitle",
        "getSubtitle",
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
.field public static final $stable:I


# instance fields
.field private final image:Lkd1/o;

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lkd1/o;->a:I

    sput v0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->$stable:I

    return-void
.end method

.method public constructor <init>(Lkd1/o;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->image:Lkd1/o;

    iput-object p2, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->subtitle:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Lkd1/o;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->image:Lkd1/o;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->subtitle:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->copy(Lkd1/o;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->image:Lkd1/o;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lkd1/o;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;
    .locals 1

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;-><init>(Lkd1/o;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;

    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->image:Lkd1/o;

    iget-object v3, p1, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->image:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->subtitle:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->subtitle:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getImage()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->image:Lkd1/o;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->image:Lkd1/o;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->subtitle:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->image:Lkd1/o;

    iget-object v1, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;->subtitle:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "BottomSheet(image="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v2, v0, v3}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
