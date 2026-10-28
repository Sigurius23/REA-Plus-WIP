.class public Lcom/whoop/whoopaction/view/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whoopaction/view/a$a;,
        Lcom/whoop/whoopaction/view/a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0017\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\tB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ.\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/whoopaction/view/a;",
        "",
        "<init>",
        "()V",
        "Ljava/io/File;",
        "sourceFile",
        "Ljava/io/OutputStream;",
        "outputStream",
        "Ll83/a0;",
        "b",
        "(Ljava/io/File;Ljava/io/OutputStream;)V",
        "",
        "path",
        "Lcom/whoop/whoopaction/view/a$b;",
        "d",
        "(Ljava/lang/String;)Lcom/whoop/whoopaction/view/a$b;",
        "Landroid/content/Context;",
        "context",
        "Landroid/net/Uri;",
        "destinationUri",
        "Ll83/n;",
        "c",
        "(Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;",
        "a",
        "whoop-action_release"
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
.field public static final a:Lcom/whoop/whoopaction/view/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/whoopaction/view/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whoopaction/view/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whoopaction/view/a;->a:Lcom/whoop/whoopaction/view/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/whoop/whoopaction/view/a;Ljava/io/File;Ljava/io/OutputStream;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/whoopaction/view/a;->b(Ljava/io/File;Ljava/io/OutputStream;)V

    return-void
.end method

.method private final b(Ljava/io/File;Ljava/io/OutputStream;)V
    .locals 3

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/16 p1, 0x2000

    :try_start_0
    new-array p1, p1, [B

    invoke-virtual {v0, p1}, Ljava/io/FileInputStream;->read([B)I

    move-result v1

    :goto_0
    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v2, 0x0

    invoke-virtual {p2, p1, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    invoke-virtual {v0, p1}, Ljava/io/FileInputStream;->read([B)I

    move-result v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void

    :goto_1
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v0, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public final c(Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/io/File;",
            "Landroid/net/Uri;",
            "Lq83/d<",
            "-",
            "Ll83/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/whoop/whoopaction/view/a$c;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/whoop/whoopaction/view/a$c;

    iget v1, v0, Lcom/whoop/whoopaction/view/a$c;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/whoopaction/view/a$c;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/whoopaction/view/a$c;

    invoke-direct {v0, p0, p4}, Lcom/whoop/whoopaction/view/a$c;-><init>(Lcom/whoop/whoopaction/view/a;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lcom/whoop/whoopaction/view/a$c;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/whoopaction/view/a$c;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/whoopaction/view/a$c;->y:Ljava/lang/Object;

    check-cast p1, Landroid/net/Uri;

    iget-object p1, v0, Lcom/whoop/whoopaction/view/a$c;->x:Ljava/lang/Object;

    check-cast p1, Ljava/io/File;

    iget-object p1, v0, Lcom/whoop/whoopaction/view/a$c;->w:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p4, Lbc3/q0;->a:Lkc3/e;

    sget-object p4, Lkc3/d;->w:Lkc3/d;

    new-instance v4, Lcom/whoop/whoopaction/view/a$d;

    const/4 v9, 0x0

    move-object v7, p0

    move-object v5, p1

    move-object v8, p2

    move-object v6, p3

    invoke-direct/range {v4 .. v9}, Lcom/whoop/whoopaction/view/a$d;-><init>(Landroid/content/Context;Landroid/net/Uri;Lcom/whoop/whoopaction/view/a;Ljava/io/File;Lq83/d;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lcom/whoop/whoopaction/view/a$c;->w:Ljava/lang/Object;

    iput-object p1, v0, Lcom/whoop/whoopaction/view/a$c;->x:Ljava/lang/Object;

    iput-object p1, v0, Lcom/whoop/whoopaction/view/a$c;->y:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/whoopaction/view/a$c;->F:I

    invoke-static {p4, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1
.end method

.method public final d(Ljava/lang/String;)Lcom/whoop/whoopaction/view/a$b;
    .locals 8

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/whoop/whoopaction/view/a$b;

    const-string v1, "File does not exist: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, v1, v3, p1}, Lcom/whoop/whoopaction/view/a$b;-><init>(ZLjava/io/File;Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v1, Lcom/whoop/whoopaction/view/a$b;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/whoopaction/view/a$b;-><init>(ZLjava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    :goto_0
    new-instance v2, Lcom/whoop/whoopaction/view/a$b;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "Path is null or empty"

    invoke-direct/range {v2 .. v7}, Lcom/whoop/whoopaction/view/a$b;-><init>(ZLjava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method
