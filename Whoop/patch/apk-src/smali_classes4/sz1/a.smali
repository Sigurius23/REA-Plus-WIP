.class public final Lsz1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\t\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000c\u001a\u00020\u00012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lsz1/a;",
        "",
        "Loz1/a;",
        "analytics",
        "<init>",
        "(Loz1/a;)V",
        "Ltz1/d;",
        "",
        "source",
        "d",
        "(Ltz1/d;Ljava/lang/String;)Ltz1/d;",
        "Ltz1/d$h;",
        "event",
        "a",
        "(Ltz1/d$h;)Ltz1/d;",
        "b",
        "(Ljava/lang/Object;Ljava/lang/String;)Ltz1/d;",
        "Loz1/a;",
        "native-store_release"
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
.field private final a:Loz1/a;


# direct methods
.method public constructor <init>(Loz1/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsz1/a;->a:Loz1/a;

    return-void
.end method

.method private final a(Ltz1/d$h;)Ltz1/d;
    .locals 2

    invoke-virtual {p1}, Ltz1/d$h;->b()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_0

    new-instance v0, Ltz1/d$c;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {v0, p1}, Ltz1/d$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Ltz1/h;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Ltz1/h;

    invoke-virtual {p1}, Ltz1/h;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v0, Ltz1/d$c;

    invoke-direct {v0, p1}, Ltz1/d$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_1
    return-object v1

    :cond_2
    instance-of v0, p1, Ltz1/l;

    if-eqz v0, :cond_3

    new-instance v0, Ltz1/d$c;

    check-cast p1, Ltz1/l;

    invoke-virtual {p1}, Ltz1/l;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v0, p1}, Ltz1/d$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_3
    instance-of v0, p1, Ltz1/i;

    if-eqz v0, :cond_5

    check-cast p1, Ltz1/i;

    invoke-virtual {p1}, Ltz1/i;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Ltz1/d$c;

    invoke-direct {v0, p1}, Ltz1/d$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_4
    return-object v1

    :cond_5
    instance-of v0, p1, Ltz1/j;

    if-eqz v0, :cond_6

    check-cast p1, Ltz1/j;

    invoke-virtual {p1}, Ltz1/j;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, Ltz1/d$c;

    invoke-direct {v0, p1}, Ltz1/d$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_6
    return-object v1
.end method

.method public static synthetic c(Lsz1/a;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Ltz1/d;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lsz1/a;->b(Ljava/lang/Object;Ljava/lang/String;)Ltz1/d;

    move-result-object p0

    return-object p0
.end method

.method private final d(Ltz1/d;Ljava/lang/String;)Ltz1/d;
    .locals 10

    if-eqz p2, :cond_3

    instance-of v0, p1, Ltz1/d$c;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    move-object v0, p1

    check-cast v0, Ltz1/d$c;

    invoke-virtual {v0}, Ltz1/d$c;->b()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/navigation/ProductDescriptionPageScreenModel;

    if-nez v2, :cond_1

    return-object p1

    :cond_1
    invoke-virtual {v0}, Ltz1/d$c;->b()Lcom/whoop/navigation/e;

    move-result-object v3

    move-object v4, v1

    check-cast v4, Lcom/whoop/navigation/ProductDescriptionPageScreenModel;

    invoke-virtual {v4}, Lcom/whoop/navigation/ProductDescriptionPageScreenModel;->getSource()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    move-object v7, p2

    goto :goto_0

    :cond_2
    move-object v7, p1

    :goto_0
    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lcom/whoop/navigation/ProductDescriptionPageScreenModel;->copy$default(Lcom/whoop/navigation/ProductDescriptionPageScreenModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/navigation/ProductDescriptionPageScreenModel;

    move-result-object v5

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v4, 0x0

    invoke-static/range {v3 .. v8}, Lcom/whoop/navigation/e;->b(Lcom/whoop/navigation/e;Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILjava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-virtual {v0, p1}, Ltz1/d$c;->a(Lcom/whoop/navigation/e;)Ltz1/d$c;

    move-result-object p1

    :cond_3
    :goto_1
    return-object p1
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/String;)Ltz1/d;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ltz1/d$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsz1/a;->a:Loz1/a;

    move-object v1, p1

    check-cast v1, Ltz1/d$a;

    invoke-virtual {v0, v1, p2}, Loz1/a;->k(Ltz1/d$a;Ljava/lang/String;)V

    :cond_0
    instance-of v0, p1, Ltz1/d$h;

    if-eqz v0, :cond_1

    check-cast p1, Ltz1/d$h;

    invoke-direct {p0, p1}, Lsz1/a;->a(Ltz1/d$h;)Ltz1/d;

    move-result-object p1

    goto :goto_1

    :cond_1
    instance-of v0, p1, Ltz1/d$f;

    if-eqz v0, :cond_2

    new-instance v0, Ltz1/d$c;

    check-cast p1, Ltz1/d$f;

    invoke-virtual {p1}, Ltz1/d$f;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v0, p1}, Ltz1/d$c;-><init>(Lcom/whoop/navigation/e;)V

    :goto_0
    move-object p1, v0

    goto :goto_1

    :cond_2
    instance-of v0, p1, Ltz1/d;

    if-eqz v0, :cond_3

    check-cast p1, Ltz1/d;

    goto :goto_1

    :cond_3
    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_4

    new-instance v0, Ltz1/d$c;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {v0, p1}, Ltz1/d$c;-><init>(Lcom/whoop/navigation/e;)V

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    :goto_1
    invoke-direct {p0, p1, p2}, Lsz1/a;->d(Ltz1/d;Ljava/lang/String;)Ltz1/d;

    move-result-object p1

    return-object p1
.end method
