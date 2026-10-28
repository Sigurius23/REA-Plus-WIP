.class public final Lzy1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lzy1/h;",
        "",
        "<init>",
        "()V",
        "Lxy1/d;",
        "domainState",
        "Laz1/j;",
        "a",
        "(Lxy1/d;)Laz1/j;",
        "mfa_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lxy1/d;)Laz1/j;
    .locals 2

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lxy1/d;->a()Ljava/lang/String;

    move-result-object p1

    const-string v0, "enforcement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Lpy1/d;->F:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    sget v0, Lpy1/d;->D:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget p1, Lpy1/d;->E:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    sget v0, Lpy1/d;->C:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    iget-object p1, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/design/util/TextResource$b;

    iget-object v0, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/util/TextResource$b;

    new-instance v1, Laz1/j;

    invoke-direct {v1, p1, v0}, Laz1/j;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v1
.end method
