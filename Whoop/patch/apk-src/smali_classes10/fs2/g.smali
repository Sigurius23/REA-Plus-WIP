.class public abstract Lfs2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Llive/hms/video/error/HMSException;",
        "",
        "b",
        "(Llive/hms/video/error/HMSException;)Ljava/lang/String;",
        "summary",
        "video-call_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Llive/hms/video/error/HMSException;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lfs2/g;->b(Llive/hms/video/error/HMSException;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Llive/hms/video/error/HMSException;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Llive/hms/video/error/HMSException;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Llive/hms/video/error/HMSException;->getCode()I

    move-result p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
