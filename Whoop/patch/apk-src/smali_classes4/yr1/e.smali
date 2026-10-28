.class public final Lyr1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000f\u0010\u0008R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lyr1/e;",
        "",
        "<init>",
        "()V",
        "Lw71/d;",
        "type",
        "Ltr1/c;",
        "c",
        "(Lw71/d;)Ltr1/c;",
        "d",
        "a",
        "Lw71/d$f;",
        "b",
        "(Lw71/d$f;)Ltr1/c;",
        "questionType",
        "e",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
        "journal_release"
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
.field private final a:Ltr2/n;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "JournalQuestionTypeMapper"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lyr1/e;->a:Ltr2/n;

    return-void
.end method

.method private final a(Lw71/d;)Ltr1/c;
    .locals 2

    instance-of v0, p1, Lw71/d$j;

    if-eqz v0, :cond_1

    new-instance v0, Ltr1/c$d;

    check-cast p1, Lw71/d$j;

    invoke-virtual {p1}, Lw71/d$j;->b()I

    move-result v1

    invoke-virtual {p1}, Lw71/d$j;->a()Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, v1, p1}, Ltr1/c$d;-><init>(IZ)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lw71/d$k;

    if-eqz v0, :cond_3

    check-cast p1, Lw71/d$k;

    invoke-virtual {p1}, Lw71/d$k;->a()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    new-instance v1, Ltr1/c$d;

    invoke-virtual {p1}, Lw71/d$k;->b()I

    move-result p1

    invoke-direct {v1, p1, v0}, Ltr1/c$d;-><init>(IZ)V

    return-object v1

    :cond_2
    new-instance v0, Ltr1/c$a;

    invoke-virtual {p1}, Lw71/d$k;->b()I

    move-result p1

    invoke-direct {v0, p1}, Ltr1/c$a;-><init>(I)V

    return-object v0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method private final b(Lw71/d$f;)Ltr1/c;
    .locals 1

    new-instance v0, Ltr1/c$f;

    invoke-virtual {p1}, Lw71/d$f;->a()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-direct {v0, p1}, Ltr1/c$f;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private final c(Lw71/d;)Ltr1/c;
    .locals 4

    instance-of v0, p1, Lw71/d$a;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_1

    new-instance v0, Ltr1/c$e;

    check-cast p1, Lw71/d$a;

    invoke-virtual {p1}, Lw71/d$a;->b()I

    move-result v3

    invoke-virtual {p1}, Lw71/d$a;->a()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-double v1, p1

    :cond_0
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {v0, v3, p1}, Ltr1/c$e;-><init>(ILjava/lang/Double;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lw71/d$c;

    if-eqz v0, :cond_3

    new-instance v0, Ltr1/c$e;

    check-cast p1, Lw71/d$c;

    invoke-virtual {p1}, Lw71/d$c;->b()I

    move-result v3

    invoke-virtual {p1}, Lw71/d$c;->a()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-double v1, p1

    :cond_2
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {v0, v3, p1}, Ltr1/c$e;-><init>(ILjava/lang/Double;)V

    return-object v0

    :cond_3
    instance-of v0, p1, Lw71/d$b;

    if-eqz v0, :cond_5

    new-instance v0, Ltr1/c$b;

    check-cast p1, Lw71/d$b;

    invoke-virtual {p1}, Lw71/d$b;->b()I

    move-result v3

    invoke-virtual {p1}, Lw71/d$b;->a()Ljava/lang/Double;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    :cond_4
    invoke-direct {v0, v3, v1, v2}, Ltr1/c$b;-><init>(ID)V

    return-object v0

    :cond_5
    instance-of v0, p1, Lw71/d$g;

    if-eqz v0, :cond_6

    new-instance v0, Ltr1/c$e;

    check-cast p1, Lw71/d$g;

    invoke-virtual {p1}, Lw71/d$g;->b()I

    move-result v1

    invoke-virtual {p1}, Lw71/d$g;->a()Ljava/lang/Double;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ltr1/c$e;-><init>(ILjava/lang/Double;)V

    return-object v0

    :cond_6
    const/4 p1, 0x0

    return-object p1
.end method

.method private final d(Lw71/d;)Ltr1/c;
    .locals 4

    instance-of v0, p1, Lw71/d$d;

    const-string v1, ""

    if-eqz v0, :cond_1

    new-instance v0, Ltr1/c$c;

    check-cast p1, Lw71/d$d;

    invoke-virtual {p1}, Lw71/d$d;->a()I

    move-result v2

    invoke-virtual {p1}, Lw71/d$d;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    invoke-direct {v0, v2, v1}, Ltr1/c$c;-><init>(ILjava/lang/String;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lw71/d$i;

    if-eqz v0, :cond_3

    new-instance v0, Ltr1/c$h;

    check-cast p1, Lw71/d$i;

    invoke-virtual {p1}, Lw71/d$i;->a()I

    move-result v1

    invoke-virtual {p1}, Lw71/d$i;->b()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    goto :goto_1

    :cond_2
    const-wide/16 v2, 0x0

    :goto_1
    invoke-direct {v0, v1, v2, v3}, Ltr1/c$h;-><init>(IJ)V

    return-object v0

    :cond_3
    instance-of v0, p1, Lw71/d$h;

    if-eqz v0, :cond_5

    new-instance v0, Ltr1/c$g;

    check-cast p1, Lw71/d$h;

    invoke-virtual {p1}, Lw71/d$h;->a()I

    move-result v2

    invoke-virtual {p1}, Lw71/d$h;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    move-object v1, p1

    :goto_2
    invoke-direct {v0, v2, v1}, Ltr1/c$g;-><init>(ILjava/lang/String;)V

    return-object v0

    :cond_5
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final e(Lw71/d;)Ltr1/c;
    .locals 4

    const-string v0, "questionType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lw71/d$a;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    instance-of v0, p1, Lw71/d$c;

    if-nez v0, :cond_6

    instance-of v0, p1, Lw71/d$b;

    if-nez v0, :cond_6

    instance-of v0, p1, Lw71/d$g;

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    instance-of v0, p1, Lw71/d$d;

    if-nez v0, :cond_5

    instance-of v0, p1, Lw71/d$i;

    if-nez v0, :cond_5

    instance-of v0, p1, Lw71/d$h;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lw71/d$j;

    if-nez v0, :cond_4

    instance-of v0, p1, Lw71/d$k;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lw71/d$f;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lw71/d$f;

    invoke-direct {p0, v0}, Lyr1/e;->b(Lw71/d$f;)Ltr1/c;

    move-result-object v0

    goto :goto_3

    :cond_3
    move-object v0, v1

    goto :goto_3

    :cond_4
    :goto_0
    invoke-direct {p0, p1}, Lyr1/e;->a(Lw71/d;)Ltr1/c;

    move-result-object v0

    goto :goto_3

    :cond_5
    :goto_1
    invoke-direct {p0, p1}, Lyr1/e;->d(Lw71/d;)Ltr1/c;

    move-result-object v0

    goto :goto_3

    :cond_6
    :goto_2
    invoke-direct {p0, p1}, Lyr1/e;->c(Lw71/d;)Ltr1/c;

    move-result-object v0

    :goto_3
    if-nez v0, :cond_7

    iget-object v0, p0, Lyr1/e;->a:Ltr2/n;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected question type: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, p1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1

    :cond_7
    return-object v0
.end method
