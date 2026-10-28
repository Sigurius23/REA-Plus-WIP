.class public final Lsc3/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lkotlin/jvm/internal/q;

.field public final b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/q;)V
    .locals 1

    .line 4
    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getName()Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-direct {p0, p1, v0}, Lsc3/r;-><init>(Lkotlin/jvm/internal/q;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/q;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lsc3/r;->a:Lkotlin/jvm/internal/q;

    .line 3
    iput-object p2, p0, Lsc3/r;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lsc3/r;->a:Lkotlin/jvm/internal/q;

    invoke-interface {v0, p1}, Lj93/w;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Field "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lsc3/r;->b:Ljava/lang/String;

    const-string v2, " is not set"

    invoke-static {v1, v2, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lsc3/r;->a:Lkotlin/jvm/internal/q;

    invoke-interface {v0, p1}, Lj93/w;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-interface {v0, p1, p2}, Lj93/l;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    :cond_0
    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-object v2

    :cond_1
    return-object v1
.end method
