.class public final Lkx2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax2/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkx2/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 \u000f2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0016\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lkx2/e;",
        "Lax2/a;",
        "",
        "Lmx2/b$d;",
        "action",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lmx2/b$d;Ltr2/n;)V",
        "Lax2/b;",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lmx2/b$d;",
        "b",
        "Ltr2/n;",
        "c",
        "whooplabs_release"
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
.field public static final c:Lkx2/e$a;

.field public static final d:I

.field private static final e:Ljava/lang/String;


# instance fields
.field private final a:Lmx2/b$d;

.field private final b:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkx2/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkx2/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkx2/e;->c:Lkx2/e$a;

    const/16 v0, 0x8

    sput v0, Lkx2/e;->d:I

    const-string v0, "UnknownActionCampaignDetailsCommand"

    sput-object v0, Lkx2/e;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lmx2/b$d;Ltr2/n;)V
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkx2/e;->a:Lmx2/b$d;

    iput-object p2, p0, Lkx2/e;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic b()Ljava/lang/String;
    .locals 1

    sget-object v0, Lkx2/e;->e:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lax2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p1, p0, Lkx2/e;->b:Ltr2/n;

    iget-object v0, p0, Lkx2/e;->a:Lmx2/b$d;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown action received/handled: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lax2/b$a;->a:Lax2/b$a;

    return-object p1
.end method
