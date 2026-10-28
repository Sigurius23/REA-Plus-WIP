.class public final Lcom/whoop/onboardingpersonalization/dayzero/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/onboardingpersonalization/dayzero/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0013\u0008\u0081\u0008\u0018\u0000  2\u00020\u0001:\u0001\u0015B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001f\u001a\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lcom/whoop/onboardingpersonalization/dayzero/a;",
        "",
        "Lsl0/n0;",
        "chat",
        "",
        "dismissible",
        "Lcom/whoop/navigation/models/ChatHeaderMetadata;",
        "headerMetaData",
        "Lr12/c;",
        "headerMetaDataFailure",
        "<init>",
        "(Lsl0/n0;ZLcom/whoop/navigation/models/ChatHeaderMetadata;Lr12/c;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lsl0/n0;",
        "b",
        "()Lsl0/n0;",
        "Z",
        "c",
        "()Z",
        "Lcom/whoop/navigation/models/ChatHeaderMetadata;",
        "d",
        "()Lcom/whoop/navigation/models/ChatHeaderMetadata;",
        "Lr12/c;",
        "e",
        "()Lr12/c;",
        "onboarding-personalization_release"
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
.field public static final e:Lcom/whoop/onboardingpersonalization/dayzero/a$a;

.field public static final f:I

.field private static final g:Ll02/a;


# instance fields
.field private final a:Lsl0/n0;

.field private final b:Z

.field private final c:Lcom/whoop/navigation/models/ChatHeaderMetadata;

.field private final d:Lr12/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/onboardingpersonalization/dayzero/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/onboardingpersonalization/dayzero/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/onboardingpersonalization/dayzero/a;->e:Lcom/whoop/onboardingpersonalization/dayzero/a$a;

    sget v0, Lcom/whoop/navigation/models/ChatHeaderMetadata;->$stable:I

    sget v2, Lsl0/n0;->t:I

    or-int/2addr v0, v2

    sput v0, Lcom/whoop/onboardingpersonalization/dayzero/a;->f:I

    new-instance v0, Ll02/a;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Ll02/a;-><init>(Lad3/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/onboardingpersonalization/dayzero/a;->g:Ll02/a;

    return-void
.end method

.method public constructor <init>(Lsl0/n0;ZLcom/whoop/navigation/models/ChatHeaderMetadata;Lr12/c;)V
    .locals 1

    const-string v0, "chat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->a:Lsl0/n0;

    iput-boolean p2, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->b:Z

    iput-object p3, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->c:Lcom/whoop/navigation/models/ChatHeaderMetadata;

    iput-object p4, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->d:Lr12/c;

    return-void
.end method

.method public static final synthetic a()Ll02/a;
    .locals 1

    sget-object v0, Lcom/whoop/onboardingpersonalization/dayzero/a;->g:Ll02/a;

    return-object v0
.end method


# virtual methods
.method public final b()Lsl0/n0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->a:Lsl0/n0;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->b:Z

    return v0
.end method

.method public final d()Lcom/whoop/navigation/models/ChatHeaderMetadata;
    .locals 1

    iget-object v0, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->c:Lcom/whoop/navigation/models/ChatHeaderMetadata;

    return-object v0
.end method

.method public final e()Lr12/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->d:Lr12/c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/onboardingpersonalization/dayzero/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/onboardingpersonalization/dayzero/a;

    iget-object v1, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->a:Lsl0/n0;

    iget-object v3, p1, Lcom/whoop/onboardingpersonalization/dayzero/a;->a:Lsl0/n0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->b:Z

    iget-boolean v3, p1, Lcom/whoop/onboardingpersonalization/dayzero/a;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->c:Lcom/whoop/navigation/models/ChatHeaderMetadata;

    iget-object v3, p1, Lcom/whoop/onboardingpersonalization/dayzero/a;->c:Lcom/whoop/navigation/models/ChatHeaderMetadata;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->d:Lr12/c;

    iget-object p1, p1, Lcom/whoop/onboardingpersonalization/dayzero/a;->d:Lr12/c;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->a:Lsl0/n0;

    invoke-virtual {v0}, Lsl0/n0;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->c:Lcom/whoop/navigation/models/ChatHeaderMetadata;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/navigation/models/ChatHeaderMetadata;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->d:Lr12/c;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->a:Lsl0/n0;

    iget-boolean v1, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->b:Z

    iget-object v2, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->c:Lcom/whoop/navigation/models/ChatHeaderMetadata;

    iget-object v3, p0, Lcom/whoop/onboardingpersonalization/dayzero/a;->d:Lr12/c;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "DayZeroPersonalizationArgs(chat="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dismissible="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", headerMetaData="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", headerMetaDataFailure="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
