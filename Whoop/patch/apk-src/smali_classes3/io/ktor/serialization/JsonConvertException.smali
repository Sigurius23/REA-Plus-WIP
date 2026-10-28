.class public final Lio/ktor/serialization/JsonConvertException;
.super Lio/ktor/serialization/ContentConvertException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lio/ktor/serialization/JsonConvertException;",
        "Lio/ktor/serialization/ContentConvertException;",
        "ktor-serialization"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/gson/JsonSyntaxException;)V
    .locals 1

    const-string v0, "Illegal json parameter found"

    invoke-direct {p0, v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
