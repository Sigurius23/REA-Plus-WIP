.class public final Lwp0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lwp0/a;",
        "",
        "<init>",
        "()V",
        "Lud3/v0;",
        "requestBody",
        "b",
        "(Lud3/v0;)Lud3/v0;",
        "body",
        "c",
        "a",
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


# static fields
.field public static final a:Lwp0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwp0/a;

    invoke-direct {v0}, Lwp0/a;-><init>()V

    sput-object v0, Lwp0/a;->a:Lwp0/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Lud3/v0;)Lud3/v0;
    .locals 2

    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, v0}, Lud3/v0;->writeTo(Lne3/i;)V

    new-instance v1, Lwp0/a$a;

    invoke-direct {v1, p1, v0}, Lwp0/a$a;-><init>(Lud3/v0;Lne3/h;)V

    return-object v1
.end method

.method private final c(Lud3/v0;)Lud3/v0;
    .locals 1

    new-instance v0, Lwp0/a$b;

    invoke-direct {v0, p1}, Lwp0/a$b;-><init>(Lud3/v0;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lud3/v0;)Lud3/v0;
    .locals 1

    const-string v0, "requestBody"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lwp0/a;->c(Lud3/v0;)Lud3/v0;

    move-result-object p1

    invoke-direct {p0, p1}, Lwp0/a;->b(Lud3/v0;)Lud3/v0;

    move-result-object p1

    return-object p1
.end method
