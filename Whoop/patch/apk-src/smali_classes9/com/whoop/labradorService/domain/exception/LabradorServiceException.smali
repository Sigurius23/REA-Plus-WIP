.class public abstract Lcom/whoop/labradorService/domain/exception/LabradorServiceException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/labradorService/domain/exception/LabradorServiceException$LabradorCommandFailure;,
        Lcom/whoop/labradorService/domain/exception/LabradorServiceException$StrapIncompatible;,
        Lcom/whoop/labradorService/domain/exception/LabradorServiceException$StrapNotConnected;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0005\u0006\u0007B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u0082\u0001\u0003\u0008\t\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/labradorService/domain/exception/LabradorServiceException;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "<init>",
        "()V",
        "StrapIncompatible",
        "StrapNotConnected",
        "LabradorCommandFailure",
        "Lcom/whoop/labradorService/domain/exception/LabradorServiceException$LabradorCommandFailure;",
        "Lcom/whoop/labradorService/domain/exception/LabradorServiceException$StrapIncompatible;",
        "Lcom/whoop/labradorService/domain/exception/LabradorServiceException$StrapNotConnected;",
        "labrador-service_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/labradorService/domain/exception/LabradorServiceException;-><init>()V

    return-void
.end method
