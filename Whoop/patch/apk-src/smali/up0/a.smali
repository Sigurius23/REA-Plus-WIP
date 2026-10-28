.class public final Lup0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lup0/a;",
        "",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "a",
        "Landroid/content/Context;",
        "Lic/p0;",
        "b",
        "Lic/p0;",
        "workManagerInstance",
        "Lvp0/a;",
        "c",
        "Lvp0/a;",
        "logger",
        "commons_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lic/p0;

.field private final c:Lvp0/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lup0/a;->a:Landroid/content/Context;

    invoke-static {p1}, Ljc/v;->g(Landroid/content/Context;)Ljc/v;

    move-result-object p1

    iput-object p1, p0, Lup0/a;->b:Lic/p0;

    sget-object p1, Lvp0/a;->a:Lvp0/a$a;

    const-string v0, "WorkManagerUtil"

    invoke-virtual {p1, v0}, Lvp0/a$a;->a(Ljava/lang/String;)Lvp0/a;

    move-result-object p1

    iput-object p1, p0, Lup0/a;->c:Lvp0/a;

    return-void
.end method
