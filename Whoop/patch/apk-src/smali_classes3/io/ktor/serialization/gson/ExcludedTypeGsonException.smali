.class public final Lio/ktor/serialization/gson/ExcludedTypeGsonException;
.super Ljava/lang/Exception;
.source "SourceFile"

# interfaces
.implements Lbc3/x;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Exception;",
        "Lbc3/x;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\u0008\u0012\u0004\u0012\u00020\u00000\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lio/ktor/serialization/gson/ExcludedTypeGsonException;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "Lbc3/x;",
        "ktor-serialization-gson"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final w:Lj93/d;


# direct methods
.method public constructor <init>(Lj93/d;)V
    .locals 2

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Type "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Lkotlin/reflect/jvm/internal/KClassImpl;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is excluded so couldn\'t be used in receive"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lio/ktor/serialization/gson/ExcludedTypeGsonException;->w:Lj93/d;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Throwable;
    .locals 2

    new-instance v0, Lio/ktor/serialization/gson/ExcludedTypeGsonException;

    iget-object v1, p0, Lio/ktor/serialization/gson/ExcludedTypeGsonException;->w:Lj93/d;

    invoke-direct {v0, v1}, Lio/ktor/serialization/gson/ExcludedTypeGsonException;-><init>(Lj93/d;)V

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-object v0
.end method
