.class public final Lzz0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000c\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\t\u001a\u0004\u0008\u000e\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\t\u001a\u0004\u0008\u0011\u0010\u000b\u00a8\u0006\u0013"
    }
    d2 = {
        "Lzz0/j;",
        "",
        "<init>",
        "()V",
        "",
        "dateTime",
        "Lzz0/m;",
        "b",
        "(Ljava/lang/String;)Lzz0/m;",
        "Lzz0/m;",
        "a",
        "()Lzz0/m;",
        "currentWindow",
        "c",
        "getMiddleWindow",
        "middleWindow",
        "d",
        "getOldestWindow",
        "oldestWindow",
        "design_release"
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
.field public static final a:Lzz0/j;

.field private static final b:Lzz0/m;

.field private static final c:Lzz0/m;

.field private static final d:Lzz0/m;

.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lzz0/j;

    invoke-direct {v0}, Lzz0/j;-><init>()V

    sput-object v0, Lzz0/j;->a:Lzz0/j;

    const-string v0, "APR"

    const-string v1, "MAY"

    const-string v2, "MAR"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v5, "2025-02-01T00:00:00.000-05:00"

    const/4 v6, 0x0

    const-string v1, "MAR \'25 - MAY \'25"

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lzz0/k;->a(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;I)Lzz0/m;

    move-result-object v0

    sput-object v0, Lzz0/j;->b:Lzz0/m;

    const-string v0, "JAN"

    const-string v1, "FEB"

    const-string v2, "DEC"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v5, "2024-11-01T00:00:00.000-05:00"

    const/4 v6, 0x3

    const-string v1, "DEC \'24 - FEB \'25"

    const/4 v3, 0x0

    const-string v4, "2025-05-01T00:00:00.000-05:00"

    invoke-static/range {v1 .. v6}, Lzz0/k;->a(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;I)Lzz0/m;

    move-result-object v0

    sput-object v0, Lzz0/j;->c:Lzz0/m;

    const-string v0, "OCT"

    const-string v1, "NOV"

    const-string v2, "SEP"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x5

    const-string v1, "SEP \'24 - NOV \'24"

    const-string v4, "2025-02-01T00:00:00.000-05:00"

    invoke-static/range {v1 .. v6}, Lzz0/k;->a(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;I)Lzz0/m;

    move-result-object v0

    sput-object v0, Lzz0/j;->d:Lzz0/m;

    const/16 v0, 0x8

    sput v0, Lzz0/j;->e:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lzz0/m;
    .locals 1

    sget-object v0, Lzz0/j;->b:Lzz0/m;

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lzz0/m;
    .locals 4

    const-string v0, "dateTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lzz0/j;->b:Lzz0/m;

    invoke-virtual {v0}, Lzz0/m;->c()Lzz0/a;

    move-result-object v1

    invoke-virtual {v1}, Lzz0/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lzz0/j;->d:Lzz0/m;

    invoke-virtual {v1}, Lzz0/m;->c()Lzz0/a;

    move-result-object v2

    invoke-virtual {v2}, Lzz0/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, Lzz0/j;->c:Lzz0/m;

    invoke-virtual {v2}, Lzz0/m;->c()Lzz0/a;

    move-result-object v3

    invoke-virtual {v3}, Lzz0/a;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {v2}, Lzz0/m;->c()Lzz0/a;

    move-result-object v1

    invoke-virtual {v1}, Lzz0/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lzz0/j;->c:Lzz0/m;

    return-object p1
.end method
