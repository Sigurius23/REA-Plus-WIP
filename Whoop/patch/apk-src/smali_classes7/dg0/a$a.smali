.class public final Ldg0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldg0/a$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldg0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Ldg0/a$a;",
        "Ldg0/a$e;",
        "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;",
        "dialogData",
        "<init>",
        "(Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;)V",
        "",
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
        "a",
        "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;",
        "()Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;",
        "advanced-labs-join_release"
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
.field private final a:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;


# direct methods
.method public constructor <init>(Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;)V
    .locals 1

    const-string v0, "dialogData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldg0/a$a;->a:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;
    .locals 1

    iget-object v0, p0, Ldg0/a$a;->a:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ldg0/a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ldg0/a$a;

    iget-object v1, p0, Ldg0/a$a;->a:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;

    iget-object p1, p1, Ldg0/a$a;->a:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ldg0/a$a;->a:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;

    invoke-virtual {v0}, Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Ldg0/a$a;->a:Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ConfirmationDialog(dialogData="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
