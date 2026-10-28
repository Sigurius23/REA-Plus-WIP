.class public final Ltr2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltr2/k;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00082\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006H\u0017\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Ltr2/a;",
        "Ltr2/k;",
        "Ltr2/e;",
        "logDistributor",
        "<init>",
        "(Ltr2/e;)V",
        "Lcom/whoop/domain/model/event/LoggableEvent;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lcom/whoop/domain/model/event/LoggableEvent;)V",
        "app_prodStandardRelease"
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
.method public constructor <init>(Ltr2/e;)V
    .locals 1

    const-string v0, "logDistributor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, p0}, Ltr2/e;->y(Ltr2/k;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/whoop/domain/model/event/LoggableEvent;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LogNotTimber"
        }
    .end annotation

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
