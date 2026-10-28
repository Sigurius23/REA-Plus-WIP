.class public interface abstract Lkotlinx/serialization/internal/SerializerCache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/serialization/internal/SerializerCache$DefaultImpls;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008`\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002J%\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0003H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00020\u00082\n\u0010\u0004\u001a\u0006\u0012\u0002\u0008\u00030\u0003H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b\u00c0\u0006\u0003"
    }
    d2 = {
        "Lkotlinx/serialization/internal/SerializerCache;",
        "T",
        "",
        "Lj93/d;",
        "key",
        "Lwc3/c;",
        "get",
        "(Lj93/d;)Lwc3/c;",
        "",
        "isStored",
        "(Lj93/d;)Z",
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


# direct methods
.method public static synthetic access$isStored$jd(Lkotlinx/serialization/internal/SerializerCache;Lj93/d;)Z
    .locals 0

    invoke-super {p0, p1}, Lkotlinx/serialization/internal/SerializerCache;->isStored(Lj93/d;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public abstract get(Lj93/d;)Lwc3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/d;",
            ")",
            "Lwc3/c;"
        }
    .end annotation
.end method

.method public isStored(Lj93/d;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/d;",
            ")Z"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method
