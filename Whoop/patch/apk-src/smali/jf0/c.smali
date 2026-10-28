.class public final Ljf0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B5\u0012\"\u0010\u0006\u001a\u001e\u0008\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R0\u0010\u0006\u001a\u001e\u0008\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0012R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Ljf0/c;",
        "",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "Lpg3/v0;",
        "Lud3/a1;",
        "downloadTextFunction",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;Ltr2/n;)V",
        "Landroid/content/Context;",
        "context",
        "Landroid/net/Uri;",
        "uri",
        "",
        "a",
        "(Landroid/content/Context;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;",
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
.field private final a:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Ltr2/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "downloadTextFunction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ljf0/c;->a:Lkotlin/jvm/functions/Function1;

    .line 3
    iput-object p2, p0, Ljf0/c;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "TextFileDownloadHelper"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Ljf0/c;-><init>(Lkotlin/jvm/functions/Function1;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "Failed to download text file: HTTP "

    const-string v1, "Failed to save text file to: "

    const-string v2, "Text file saved successfully to: "

    instance-of v3, p3, Ljf0/c$a;

    if-eqz v3, :cond_0

    move-object v3, p3

    check-cast v3, Ljf0/c$a;

    iget v4, v3, Ljf0/c$a;->H:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Ljf0/c$a;->H:I

    goto :goto_0

    :cond_0
    new-instance v3, Ljf0/c$a;

    invoke-direct {v3, p0, p3}, Ljf0/c$a;-><init>(Ljf0/c;Lq83/d;)V

    :goto_0
    iget-object p3, v3, Ljf0/c$a;->F:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Ljf0/c$a;->H:I

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v5, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object p1, v3, Ljf0/c$a;->E:Ljava/lang/Object;

    check-cast p1, Ljf0/d;

    iget-object p1, v3, Ljf0/c$a;->z:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v3, Ljf0/c$a;->y:Ljava/lang/Object;

    check-cast p1, Lpg3/v0;

    iget-object p1, v3, Ljf0/c$a;->x:Ljava/lang/Object;

    check-cast p1, Landroid/net/Uri;

    iget-object p2, v3, Ljf0/c$a;->w:Ljava/lang/Object;

    check-cast p2, Landroid/content/Context;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v3, Ljf0/c$a;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Landroid/net/Uri;

    iget-object p1, v3, Ljf0/c$a;->w:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    :try_start_1
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p3, p0, Ljf0/c;->b:Ltr2/n;

    const-string v5, "Starting text file download and save"

    new-array v9, v8, [Lqr2/a$a;

    invoke-interface {p3, v5, v9}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p3, p0, Ljf0/c;->a:Lkotlin/jvm/functions/Function1;

    iput-object p1, v3, Ljf0/c$a;->w:Ljava/lang/Object;

    iput-object p2, v3, Ljf0/c$a;->x:Ljava/lang/Object;

    iput v7, v3, Ljf0/c$a;->H:I

    invoke-interface {p3, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v4, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p3, Lpg3/v0;

    iget-object v5, p3, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v7, v5, Lud3/x0;->Q:Z

    if-eqz v7, :cond_9

    iget-object p3, p3, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast p3, Lud3/a1;

    const/4 v0, 0x0

    if-eqz p3, :cond_5

    invoke-virtual {p3}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object p3

    goto :goto_2

    :cond_5
    move-object p3, v0

    :goto_2
    if-eqz p3, :cond_8

    new-instance v5, Ljf0/d;

    iget-object v7, p0, Ljf0/c;->b:Ltr2/n;

    invoke-direct {v5, p1, v7}, Ljf0/d;-><init>(Landroid/content/Context;Ltr2/n;)V

    iput-object v0, v3, Ljf0/c$a;->w:Ljava/lang/Object;

    iput-object p2, v3, Ljf0/c$a;->x:Ljava/lang/Object;

    iput-object v0, v3, Ljf0/c$a;->y:Ljava/lang/Object;

    iput-object v0, v3, Ljf0/c$a;->z:Ljava/lang/Object;

    iput-object v0, v3, Ljf0/c$a;->E:Ljava/lang/Object;

    iput v6, v3, Ljf0/c$a;->H:I

    invoke-virtual {v5, p2, p3, v3}, Ljf0/d;->c(Landroid/net/Uri;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v4, :cond_6

    :goto_3
    return-object v4

    :cond_6
    move-object p1, p2

    :goto_4
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_7

    iget-object p3, p0, Ljf0/c;->b:Ltr2/n;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v8, [Lqr2/a$a;

    invoke-interface {p3, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_5

    :cond_7
    iget-object p3, p0, Ljf0/c;->b:Ltr2/n;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v8, [Lqr2/a$a;

    invoke-interface {p3, p1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_5
    move v8, p2

    goto :goto_7

    :cond_8
    iget-object p1, p0, Ljf0/c;->b:Ltr2/n;

    const-string p2, "Text file download failed: Response body was null despite successful HTTP status"

    new-array p3, v8, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_7

    :cond_9
    iget-object p1, p0, Ljf0/c;->b:Ltr2/n;

    iget p2, v5, Lud3/x0;->z:I

    iget-object p3, v5, Lud3/x0;->y:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " - "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p3, v8, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_7

    :goto_6
    iget-object p2, p0, Ljf0/c;->b:Ltr2/n;

    const-string p3, "Network error during text file download"

    new-array v0, v8, [Lqr2/a$a;

    invoke-interface {p2, p3, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_7
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
