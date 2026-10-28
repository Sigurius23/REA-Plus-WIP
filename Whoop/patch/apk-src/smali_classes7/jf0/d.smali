.class public final Ljf0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J \u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Ljf0/d;",
        "",
        "Landroid/content/Context;",
        "context",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Landroid/content/Context;Ltr2/n;)V",
        "Landroid/net/Uri;",
        "uri",
        "",
        "textData",
        "",
        "c",
        "(Landroid/net/Uri;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Landroid/content/Context;",
        "b",
        "Ltr2/n;",
        "advanced-labs_release"
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
.field private final a:Landroid/content/Context;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ltr2/n;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljf0/d;->a:Landroid/content/Context;

    iput-object p2, p0, Ljf0/d;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Ljf0/d;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Ljf0/d;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic b(Ljf0/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ljf0/d;->b:Ltr2/n;

    return-object p0
.end method


# virtual methods
.method public final c(Landroid/net/Uri;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Ljf0/d$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Ljf0/d$a;-><init>(Ljf0/d;Landroid/net/Uri;Ljava/lang/String;Lq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
