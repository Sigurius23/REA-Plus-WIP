.class public final Lja3/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lva3/h;

.field public final b:Lx93/n;


# direct methods
.method public constructor <init>(Lva3/h;Lx93/n;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja3/r;->a:Lva3/h;

    iput-object p2, p0, Lja3/r;->b:Lx93/n;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lja3/r;

    if-eqz v0, :cond_0

    check-cast p1, Lja3/r;

    iget-object p1, p1, Lja3/r;->a:Lva3/h;

    iget-object v0, p0, Lja3/r;->a:Lva3/h;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lja3/r;->a:Lva3/h;

    invoke-virtual {v0}, Lva3/h;->hashCode()I

    move-result v0

    return v0
.end method
