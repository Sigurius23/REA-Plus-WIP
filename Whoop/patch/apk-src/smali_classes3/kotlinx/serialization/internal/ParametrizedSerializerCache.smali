.class public interface abstract Lkotlinx/serialization/internal/ParametrizedSerializerCache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/serialization/internal/ParametrizedSerializerCache$DefaultImpls;
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
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008`\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002J;\u0010\u000c\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u00082\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\r\u00c0\u0006\u0003"
    }
    d2 = {
        "Lkotlinx/serialization/internal/ParametrizedSerializerCache;",
        "T",
        "",
        "Lj93/d;",
        "key",
        "",
        "Lj93/a0;",
        "types",
        "Ll83/n;",
        "Lwc3/c;",
        "get-gIAlu-s",
        "(Lj93/d;Ljava/util/List;)Ljava/lang/Object;",
        "get",
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
.method public static synthetic get-gIAlu-s$default(Lkotlinx/serialization/internal/ParametrizedSerializerCache;Lj93/d;Ljava/util/List;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_0
    invoke-interface {p0, p1, p2}, Lkotlinx/serialization/internal/ParametrizedSerializerCache;->get-gIAlu-s(Lj93/d;Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: get-gIAlu-s"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract get-gIAlu-s(Lj93/d;Ljava/util/List;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/d;",
            "Ljava/util/List<",
            "+",
            "Lj93/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
