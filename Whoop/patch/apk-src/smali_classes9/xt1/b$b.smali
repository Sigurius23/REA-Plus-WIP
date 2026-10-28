.class public final Lxt1/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxt1/b$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxt1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001a\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0013\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lxt1/b$b;",
        "Lxt1/b$d;",
        "Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;",
        "response",
        "<init>",
        "(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "b",
        "(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)Lxt1/b$b;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;",
        "()Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;",
        "labrador_release"
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
.field private final a:Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;


# direct methods
.method public constructor <init>(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)V
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxt1/b$b;->a:Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    return-void
.end method


# virtual methods
.method public a()Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;
    .locals 1

    iget-object v0, p0, Lxt1/b$b;->a:Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    return-object v0
.end method

.method public final b(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)Lxt1/b$b;
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxt1/b$b;

    invoke-direct {v0, p1}, Lxt1/b$b;-><init>(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lxt1/b$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lxt1/b$b;

    iget-object v1, p0, Lxt1/b$b;->a:Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    iget-object p1, p1, Lxt1/b$b;->a:Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lxt1/b$b;->a:Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    invoke-virtual {v0}, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "BottomLoading"

    return-object v0
.end method
