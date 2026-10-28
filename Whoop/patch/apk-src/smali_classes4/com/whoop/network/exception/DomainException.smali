.class public Lcom/whoop/network/exception/DomainException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/network/exception/DomainException$a;,
        Lcom/whoop/network/exception/DomainException$b;,
        Lcom/whoop/network/exception/DomainException$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u000b\u0008\u0016\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\u0003\u000e\u000f\u000bB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/network/exception/DomainException;",
        "Ljava/lang/RuntimeException;",
        "Lkotlin/RuntimeException;",
        "Lcom/whoop/network/exception/DomainException$b;",
        "reason",
        "",
        "cause",
        "<init>",
        "(Lcom/whoop/network/exception/DomainException$b;Ljava/lang/Throwable;)V",
        "w",
        "Lcom/whoop/network/exception/DomainException$b;",
        "a",
        "()Lcom/whoop/network/exception/DomainException$b;",
        "x",
        "c",
        "b",
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


# static fields
.field public static final x:Lcom/whoop/network/exception/DomainException$a;


# instance fields
.field private final w:Lcom/whoop/network/exception/DomainException$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/network/exception/DomainException$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/network/exception/DomainException$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/network/exception/DomainException;->x:Lcom/whoop/network/exception/DomainException$a;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/network/exception/DomainException$b;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    iput-object p1, p0, Lcom/whoop/network/exception/DomainException;->w:Lcom/whoop/network/exception/DomainException$b;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/network/exception/DomainException$b;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/network/exception/DomainException;-><init>(Lcom/whoop/network/exception/DomainException$b;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/network/exception/DomainException$b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/network/exception/DomainException;->w:Lcom/whoop/network/exception/DomainException$b;

    return-object v0
.end method
