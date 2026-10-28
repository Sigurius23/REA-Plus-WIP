.class public final Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 \"2\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u001e\u001a\u0004\u0008\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010 \u001a\u0004\u0008!\u0010\u000f\u00a8\u0006$"
    }
    d2 = {
        "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;",
        "",
        "Lj72/g;",
        "id",
        "Lh72/a;",
        "type",
        "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;",
        "content",
        "<init>",
        "(Lj72/g;Lh72/a;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;)V",
        "component1",
        "()Lj72/g;",
        "component2",
        "()Lh72/a;",
        "component3",
        "()Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;",
        "copy",
        "(Lj72/g;Lh72/a;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lj72/g;",
        "getId",
        "Lh72/a;",
        "getType",
        "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;",
        "getContent",
        "Companion",
        "a",
        "sage_release"
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
    with = Lh72/b;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen$a;


# instance fields
.field private final content:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;

.field private final id:Lj72/g;

.field private final type:Lh72/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->Companion:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->$stable:I

    return-void
.end method

.method public constructor <init>(Lj72/g;Lh72/a;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->id:Lj72/g;

    iput-object p2, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->type:Lh72/a;

    iput-object p3, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->content:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;Lj72/g;Lh72/a;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;ILjava/lang/Object;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->id:Lj72/g;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->type:Lh72/a;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->content:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->copy(Lj72/g;Lh72/a;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lj72/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->id:Lj72/g;

    return-object v0
.end method

.method public final component2()Lh72/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->type:Lh72/a;

    return-object v0
.end method

.method public final component3()Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->content:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;

    return-object v0
.end method

.method public final copy(Lj72/g;Lh72/a;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;-><init>(Lj72/g;Lh72/a;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;

    iget-object v1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->id:Lj72/g;

    iget-object v3, p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->id:Lj72/g;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->type:Lh72/a;

    iget-object v3, p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->type:Lh72/a;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->content:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;

    iget-object p1, p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->content:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getContent()Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->content:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;

    return-object v0
.end method

.method public final getId()Lj72/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->id:Lj72/g;

    return-object v0
.end method

.method public final getType()Lh72/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->type:Lh72/a;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->id:Lj72/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->type:Lh72/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->content:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->id:Lj72/g;

    iget-object v1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->type:Lh72/a;

    iget-object v2, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;->content:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "SageOnboardingScreen(id="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", content="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
