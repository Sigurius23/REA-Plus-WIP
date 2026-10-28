.class public abstract Lih0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\")\u0010\u0008\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lp1/t1;",
        "Lkotlin/Function1;",
        "Lih0/b;",
        "Ll83/a0;",
        "a",
        "Lp1/t1;",
        "e",
        "()Lp1/t1;",
        "LocalFormAnalyticsCallback",
        "bot_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lp1/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li21/r;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Li21/r;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lih0/c;->a:Lp1/t1;

    return-void
.end method

.method public static synthetic a()Lkotlin/jvm/functions/Function1;
    .locals 1

    invoke-static {}, Lih0/c;->c()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lih0/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lih0/c;->d(Lih0/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c()Lkotlin/jvm/functions/Function1;
    .locals 2

    new-instance v0, Lib0/c;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lib0/c;-><init>(I)V

    return-object v0
.end method

.method private static final d(Lih0/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e()Lp1/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp1/t1;"
        }
    .end annotation

    sget-object v0, Lih0/c;->a:Lp1/t1;

    return-object v0
.end method
