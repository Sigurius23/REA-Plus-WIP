.class public final Lgh2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgh2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 \u000c2\u00020\u0001:\u0001\u0008B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lgh2/a;",
        "",
        "Lcom/whoop/stealthmode/api/StealthModeApi;",
        "api",
        "Lrr2/c;",
        "crashReporter",
        "<init>",
        "(Lcom/whoop/stealthmode/api/StealthModeApi;Lrr2/c;)V",
        "a",
        "Lcom/whoop/stealthmode/api/StealthModeApi;",
        "b",
        "Lrr2/c;",
        "c",
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


# static fields
.field public static final c:Lgh2/a$a;


# instance fields
.field private final a:Lcom/whoop/stealthmode/api/StealthModeApi;

.field private final b:Lrr2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgh2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgh2/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lgh2/a;->c:Lgh2/a$a;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/stealthmode/api/StealthModeApi;Lrr2/c;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgh2/a;->a:Lcom/whoop/stealthmode/api/StealthModeApi;

    iput-object p2, p0, Lgh2/a;->b:Lrr2/c;

    return-void
.end method
