.class public final Lo41/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lo41/a;",
        "",
        "<init>",
        "()V",
        "",
        "remainingMs",
        "b",
        "(J)J",
        "millis",
        "Ln41/a;",
        "c",
        "(J)Ln41/a;",
        "time",
        "Ln41/d;",
        "labels",
        "",
        "a",
        "(JLn41/d;)Ljava/lang/String;",
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
.field public static final a:Lo41/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo41/a;

    invoke-direct {v0}, Lo41/a;-><init>()V

    sput-object v0, Lo41/a;->a:Lo41/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JLn41/d;)Ljava/lang/String;
    .locals 2

    const-string v0, "labels"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lo41/a;->c(J)Ln41/a;

    move-result-object p1

    invoke-virtual {p1}, Ln41/a;->a()I

    move-result p2

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " "

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ln41/a;->b()I

    move-result p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ln41/d;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ln41/a;->c()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ln41/d;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ln41/a;->a()I

    move-result p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ln41/d;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ln41/a;->b()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ln41/d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "toString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final b(J)J
    .locals 8

    const-wide/32 v0, 0x36ee80

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const-wide/32 v0, 0xea60

    :goto_0
    move-wide v6, v0

    goto :goto_1

    :cond_0
    const-wide/16 v0, 0x3e8

    goto :goto_0

    :goto_1
    rem-long/2addr p1, v6

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_1

    move-wide v2, v6

    goto :goto_2

    :cond_1
    move-wide v2, p1

    :goto_2
    const-wide/16 v4, 0xc8

    invoke-static/range {v2 .. v7}, Le93/b;->p(JJJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final c(J)Ln41/a;
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    new-instance p1, Ln41/a;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p2, p2}, Ln41/a;-><init>(III)V

    return-object p1

    :cond_0
    const-wide/16 v0, 0x3e8

    div-long/2addr p1, v0

    const-wide/16 v0, 0xe10

    div-long v2, p1, v0

    long-to-int v2, v2

    rem-long v0, p1, v0

    const-wide/16 v3, 0x3c

    div-long/2addr v0, v3

    long-to-int v0, v0

    rem-long/2addr p1, v3

    long-to-int p1, p1

    new-instance p2, Ln41/a;

    invoke-direct {p2, v2, v0, p1}, Ln41/a;-><init>(III)V

    return-object p2
.end method
