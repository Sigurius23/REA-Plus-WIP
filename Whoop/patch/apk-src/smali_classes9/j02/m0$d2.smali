.class public final Lj02/m0$d2;
.super Lj02/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj02/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d2"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj02/m0$d2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0018B)\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\t\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0014\u001a\u0004\u0008\u0015\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lj02/m0$d2;",
        "Lj02/m0;",
        "",
        "integrationId",
        "source",
        "Lcom/whoop/navigation/AiAction;",
        "aiAction",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "b",
        "Ljava/lang/String;",
        "c",
        "d",
        "Lcom/whoop/navigation/AiAction;",
        "a",
        "()Lcom/whoop/navigation/AiAction;",
        "e",
        "navigation_release"
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
.field public static final e:Lj02/m0$d2$a;

.field public static final f:I


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/whoop/navigation/AiAction;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj02/m0$d2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj02/m0$d2$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lj02/m0$d2;->e:Lj02/m0$d2$a;

    const/16 v0, 0x8

    sput v0, Lj02/m0$d2;->f:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V
    .locals 1

    const-string v0, "integrationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lj02/m0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lj02/m0$d2;->b:Ljava/lang/String;

    iput-object p2, p0, Lj02/m0$d2;->c:Ljava/lang/String;

    iput-object p3, p0, Lj02/m0$d2;->d:Lcom/whoop/navigation/AiAction;

    return-void
.end method


# virtual methods
.method public a()Lcom/whoop/navigation/AiAction;
    .locals 1

    iget-object v0, p0, Lj02/m0$d2;->d:Lcom/whoop/navigation/AiAction;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj02/m0$d2;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj02/m0$d2;->c:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj02/m0$d2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lj02/m0$d2;

    iget-object v1, p0, Lj02/m0$d2;->b:Ljava/lang/String;

    iget-object v3, p1, Lj02/m0$d2;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lj02/m0$d2;->c:Ljava/lang/String;

    iget-object v3, p1, Lj02/m0$d2;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lj02/m0$d2;->d:Lcom/whoop/navigation/AiAction;

    iget-object p1, p1, Lj02/m0$d2;->d:Lcom/whoop/navigation/AiAction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lj02/m0$d2;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lj02/m0$d2;->c:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lj02/m0$d2;->d:Lcom/whoop/navigation/AiAction;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lj02/m0$d2;->b:Ljava/lang/String;

    iget-object v1, p0, Lj02/m0$d2;->c:Ljava/lang/String;

    iget-object v2, p0, Lj02/m0$d2;->d:Lcom/whoop/navigation/AiAction;

    const-string v3, ", source="

    const-string v4, ", aiAction="

    const-string v5, "IntegrationsNavigationScreen(integrationId="

    invoke-static {v5, v0, v3, v1, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
