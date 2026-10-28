.class public final Lio0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J(\u0010\u0008\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio0/f;",
        "",
        "Lio0/b;",
        "fullScreenModal",
        "Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;",
        "response",
        "<init>",
        "(Lio0/b;Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;)V",
        "a",
        "(Lio0/b;Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;)Lio0/f;",
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
        "Lio0/b;",
        "b",
        "()Lio0/b;",
        "Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;",
        "c",
        "()Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;",
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


# instance fields
.field private final a:Lio0/b;

.field private final b:Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;


# direct methods
.method public constructor <init>(Lio0/b;Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio0/f;->a:Lio0/b;

    .line 3
    iput-object p2, p0, Lio0/f;->b:Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;

    return-void
.end method

.method public synthetic constructor <init>(Lio0/b;Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 4
    :cond_1
    invoke-direct {p0, p1, p2}, Lio0/f;-><init>(Lio0/b;Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;)V

    return-void
.end method


# virtual methods
.method public final a(Lio0/b;Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;)Lio0/f;
    .locals 1

    new-instance v0, Lio0/f;

    invoke-direct {v0, p1, p2}, Lio0/f;-><init>(Lio0/b;Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;)V

    return-object v0
.end method

.method public final b()Lio0/b;
    .locals 1

    iget-object v0, p0, Lio0/f;->a:Lio0/b;

    return-object v0
.end method

.method public final c()Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;
    .locals 1

    iget-object v0, p0, Lio0/f;->b:Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio0/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio0/f;

    iget-object v1, p0, Lio0/f;->a:Lio0/b;

    iget-object v3, p1, Lio0/f;->a:Lio0/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio0/f;->b:Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;

    iget-object p1, p1, Lio0/f;->b:Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio0/f;->a:Lio0/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio0/f;->b:Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio0/f;->a:Lio0/b;

    iget-object v1, p0, Lio0/f;->b:Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ClinicianSchedulingConfirmationDomainState(fullScreenModal="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", response="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
