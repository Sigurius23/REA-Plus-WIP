.class public final Lj80/a$c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj80/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj80/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c0"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ0\u0010\n\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lj80/a$c0;",
        "Lj80/a;",
        "",
        "isSkipAction",
        "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;",
        "currentDestination",
        "Lcom/whoop/activation/iajf/domain/SignUpSource;",
        "signUpSource",
        "<init>",
        "(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;)V",
        "a",
        "(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;)Lj80/a$c0;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "e",
        "()Z",
        "b",
        "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;",
        "c",
        "()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;",
        "Lcom/whoop/activation/iajf/domain/SignUpSource;",
        "d",
        "()Lcom/whoop/activation/iajf/domain/SignUpSource;",
        "activation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Z

.field private final b:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

.field private final c:Lcom/whoop/activation/iajf/domain/SignUpSource;


# direct methods
.method public constructor <init>(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;)V
    .locals 1

    const-string v0, "signUpSource"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lj80/a$c0;->a:Z

    .line 3
    iput-object p2, p0, Lj80/a$c0;->b:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    .line 4
    iput-object p3, p0, Lj80/a$c0;->c:Lcom/whoop/activation/iajf/domain/SignUpSource;

    return-void
.end method

.method public synthetic constructor <init>(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 5
    sget-object p3, Lcom/whoop/activation/iajf/domain/SignUpSource;->ACTIVATION:Lcom/whoop/activation/iajf/domain/SignUpSource;

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lj80/a$c0;-><init>(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;)V

    return-void
.end method

.method public static synthetic b(Lj80/a$c0;ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;ILjava/lang/Object;)Lj80/a$c0;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lj80/a$c0;->a:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lj80/a$c0;->b:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lj80/a$c0;->c:Lcom/whoop/activation/iajf/domain/SignUpSource;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lj80/a$c0;->a(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;)Lj80/a$c0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;)Lj80/a$c0;
    .locals 1

    const-string v0, "signUpSource"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj80/a$c0;

    invoke-direct {v0, p1, p2, p3}, Lj80/a$c0;-><init>(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;)V

    return-object v0
.end method

.method public final c()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;
    .locals 1

    iget-object v0, p0, Lj80/a$c0;->b:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    return-object v0
.end method

.method public final d()Lcom/whoop/activation/iajf/domain/SignUpSource;
    .locals 1

    iget-object v0, p0, Lj80/a$c0;->c:Lcom/whoop/activation/iajf/domain/SignUpSource;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lj80/a$c0;->a:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj80/a$c0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lj80/a$c0;

    iget-boolean v1, p0, Lj80/a$c0;->a:Z

    iget-boolean v3, p1, Lj80/a$c0;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lj80/a$c0;->b:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    iget-object v3, p1, Lj80/a$c0;->b:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lj80/a$c0;->c:Lcom/whoop/activation/iajf/domain/SignUpSource;

    iget-object p1, p1, Lj80/a$c0;->c:Lcom/whoop/activation/iajf/domain/SignUpSource;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lj80/a$c0;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lj80/a$c0;->b:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lj80/a$c0;->c:Lcom/whoop/activation/iajf/domain/SignUpSource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lj80/a$c0;->a:Z

    iget-object v1, p0, Lj80/a$c0;->b:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    iget-object v2, p0, Lj80/a$c0;->c:Lcom/whoop/activation/iajf/domain/SignUpSource;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "NextScreen(isSkipAction="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", currentDestination="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", signUpSource="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
