.class public final Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0003R$\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;",
        "",
        "<init>",
        "()V",
        "Ll83/a0;",
        "markOptedOut",
        "",
        "value",
        "hasOptedOut",
        "Z",
        "getHasOptedOut",
        "()Z",
        "core_release"
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
.field private hasOptedOut:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getHasOptedOut()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;->hasOptedOut:Z

    return v0
.end method

.method public final markOptedOut()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;->hasOptedOut:Z

    return-void
.end method
