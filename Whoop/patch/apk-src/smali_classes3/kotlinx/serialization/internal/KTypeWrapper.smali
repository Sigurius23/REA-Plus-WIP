.class final Lkotlinx/serialization/internal/KTypeWrapper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj93/a0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0010R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0014R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lkotlinx/serialization/internal/KTypeWrapper;",
        "Lj93/a0;",
        "origin",
        "<init>",
        "(Lj93/a0;)V",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Lj93/a0;",
        "",
        "",
        "getAnnotations",
        "()Ljava/util/List;",
        "annotations",
        "Lj93/d0;",
        "getArguments",
        "arguments",
        "Lj93/e;",
        "getClassifier",
        "()Lj93/e;",
        "classifier",
        "isMarkedNullable",
        "()Z",
        "kotlinx-serialization-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final origin:Lj93/a0;


# direct methods
.method public constructor <init>(Lj93/a0;)V
    .locals 1

    const-string v0, "origin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlinx/serialization/internal/KTypeWrapper;->origin:Lj93/a0;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lkotlinx/serialization/internal/KTypeWrapper;->origin:Lj93/a0;

    instance-of v2, p1, Lkotlinx/serialization/internal/KTypeWrapper;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move-object v2, p1

    check-cast v2, Lkotlinx/serialization/internal/KTypeWrapper;

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_2

    iget-object v2, v2, Lkotlinx/serialization/internal/KTypeWrapper;->origin:Lj93/a0;

    goto :goto_1

    :cond_2
    move-object v2, v3

    :goto_1
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v0

    :cond_3
    invoke-virtual {p0}, Lkotlinx/serialization/internal/KTypeWrapper;->getClassifier()Lj93/e;

    move-result-object v1

    instance-of v2, v1, Lj93/d;

    if-eqz v2, :cond_7

    instance-of v2, p1, Lj93/a0;

    if-eqz v2, :cond_4

    check-cast p1, Lj93/a0;

    goto :goto_2

    :cond_4
    move-object p1, v3

    :goto_2
    if-eqz p1, :cond_5

    invoke-interface {p1}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v3

    :cond_5
    if-eqz v3, :cond_7

    instance-of p1, v3, Lj93/d;

    if-nez p1, :cond_6

    goto :goto_3

    :cond_6
    check-cast v1, Lj93/d;

    invoke-static {v1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p1

    check-cast v3, Lj93/d;

    invoke-static {v3}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_7
    :goto_3
    return v0
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlinx/serialization/internal/KTypeWrapper;->origin:Lj93/a0;

    invoke-interface {v0}, Lj93/b;->getAnnotations()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getArguments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj93/d0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlinx/serialization/internal/KTypeWrapper;->origin:Lj93/a0;

    invoke-interface {v0}, Lj93/a0;->getArguments()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getClassifier()Lj93/e;
    .locals 1

    iget-object v0, p0, Lkotlinx/serialization/internal/KTypeWrapper;->origin:Lj93/a0;

    invoke-interface {v0}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lkotlinx/serialization/internal/KTypeWrapper;->origin:Lj93/a0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public isMarkedNullable()Z
    .locals 1

    iget-object v0, p0, Lkotlinx/serialization/internal/KTypeWrapper;->origin:Lj93/a0;

    invoke-interface {v0}, Lj93/a0;->isMarkedNullable()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "KTypeWrapper: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lkotlinx/serialization/internal/KTypeWrapper;->origin:Lj93/a0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
