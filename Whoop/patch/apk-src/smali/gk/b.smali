.class public final Lgk/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfk/a;


# static fields
.field public static final a:Lgk/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgk/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lgk/b;->a:Lgk/b;

    return-void
.end method


# virtual methods
.method public final debug(Ljava/lang/String;)V
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-static {v0, v1}, Le4/p;->b(II)I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "Amplitude"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public final error(Ljava/lang/String;)V
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x4

    invoke-static {v0, v1}, Le4/p;->b(II)I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "Amplitude"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public final info(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0, v0}, Le4/p;->b(II)I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "Amplitude"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public final warn(Ljava/lang/String;)V
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x3

    invoke-static {v0, v1}, Le4/p;->b(II)I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "Amplitude"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method
