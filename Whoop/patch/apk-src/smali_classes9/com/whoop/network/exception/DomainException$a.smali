.class public final Lcom/whoop/network/exception/DomainException$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/network/exception/DomainException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/network/exception/DomainException$a;",
        "",
        "<init>",
        "()V",
        "",
        "cause",
        "Lcom/whoop/network/exception/DomainException;",
        "a",
        "(Ljava/lang/Throwable;)Lcom/whoop/network/exception/DomainException;",
        "network_release"
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/network/exception/DomainException$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lcom/whoop/network/exception/DomainException;
    .locals 2

    new-instance v0, Lcom/whoop/network/exception/DomainException;

    sget-object v1, Lcom/whoop/network/exception/DomainException$c;->UNKNOWN:Lcom/whoop/network/exception/DomainException$c;

    invoke-direct {v0, v1, p1}, Lcom/whoop/network/exception/DomainException;-><init>(Lcom/whoop/network/exception/DomainException$b;Ljava/lang/Throwable;)V

    return-object v0
.end method
