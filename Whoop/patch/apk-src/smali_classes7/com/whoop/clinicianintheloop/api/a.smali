.class public final Lcom/whoop/clinicianintheloop/api/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/clinicianintheloop/api/a;",
        "Lwc3/c;",
        "Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "b",
        "(Lzc3/e;Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse;)V",
        "Lzc3/d;",
        "decoder",
        "a",
        "(Lzc3/d;)Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse;",
        "Lyc3/g;",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "descriptor",
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
.field private final a:Lyc3/g;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Lyc3/g;

    const-string v1, "HealthIntakeResponse"

    invoke-static {v1, v0}, Lvf3/b;->c(Ljava/lang/String;[Lyc3/g;)Lyc3/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/clinicianintheloop/api/a;->a:Lyc3/g;

    return-void
.end method


# virtual methods
.method public a(Lzc3/d;)Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Deserialization of HealthIntakeResponse is prohibited, since it is a read-only model."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Lzc3/e;Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$TextEntryHealthIntakeResponse;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$TextEntryHealthIntakeResponse;->Companion:Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$TextEntryHealthIntakeResponse$a;

    invoke-virtual {v0}, Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$TextEntryHealthIntakeResponse$a;->serializer()Lwc3/c;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lwc3/j;->serialize(Lzc3/e;Ljava/lang/Object;)V

    return-void

    :cond_0
    instance-of v0, p2, Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$HeightWeightHealthIntakeResponse;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$HeightWeightHealthIntakeResponse;->Companion:Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$HeightWeightHealthIntakeResponse$a;

    invoke-virtual {v0}, Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse$HeightWeightHealthIntakeResponse$a;->serializer()Lwc3/c;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lwc3/j;->serialize(Lzc3/e;Ljava/lang/Object;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/whoop/clinicianintheloop/api/a;->a(Lzc3/d;)Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/a;->a:Lyc3/g;

    return-object v0
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/clinicianintheloop/api/a;->b(Lzc3/e;Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse;)V

    return-void
.end method
