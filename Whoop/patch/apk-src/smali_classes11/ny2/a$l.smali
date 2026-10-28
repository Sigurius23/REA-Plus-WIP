.class public final Lny2/a$l;
.super Lny2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lny2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "l"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0019\u001a\u0004\u0008\u0015\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lny2/a$l;",
        "Lny2/a;",
        "",
        "message",
        "",
        "isSubmitted",
        "Lcom/whoop/whooplabs/data/domain/SurveyProvider;",
        "surveyProvider",
        "<init>",
        "(Ljava/lang/String;ZLcom/whoop/whooplabs/data/domain/SurveyProvider;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "b",
        "Z",
        "c",
        "()Z",
        "Lcom/whoop/whooplabs/data/domain/SurveyProvider;",
        "()Lcom/whoop/whooplabs/data/domain/SurveyProvider;",
        "whooplabs_release"
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
.field private final a:Ljava/lang/String;

.field private final b:Z

.field private final c:Lcom/whoop/whooplabs/data/domain/SurveyProvider;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLcom/whoop/whooplabs/data/domain/SurveyProvider;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "surveyProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lny2/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lny2/a$l;->a:Ljava/lang/String;

    iput-boolean p2, p0, Lny2/a$l;->b:Z

    iput-object p3, p0, Lny2/a$l;->c:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lny2/a$l;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Lcom/whoop/whooplabs/data/domain/SurveyProvider;
    .locals 1

    iget-object v0, p0, Lny2/a$l;->c:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lny2/a$l;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lny2/a$l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lny2/a$l;

    iget-object v1, p0, Lny2/a$l;->a:Ljava/lang/String;

    iget-object v3, p1, Lny2/a$l;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lny2/a$l;->b:Z

    iget-boolean v3, p1, Lny2/a$l;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lny2/a$l;->c:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    iget-object p1, p1, Lny2/a$l;->c:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lny2/a$l;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lny2/a$l;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lny2/a$l;->c:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lny2/a$l;->a:Ljava/lang/String;

    iget-boolean v1, p0, Lny2/a$l;->b:Z

    iget-object v2, p0, Lny2/a$l;->c:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    const-string v3, ", isSubmitted="

    const-string v4, ", surveyProvider="

    const-string v5, "ErrorLoadingWebView(message="

    invoke-static {v5, v0, v3, v4, v1}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
