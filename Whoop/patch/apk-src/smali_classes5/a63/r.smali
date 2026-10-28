.class public abstract La63/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo63/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo63/a;

    const-string v1, "ApplicationPluginRegistry"

    invoke-direct {v0, v1}, Lo63/a;-><init>(Ljava/lang/String;)V

    sput-object v0, La63/r;->a:Lo63/a;

    return-void
.end method

.method public static final a(Lv53/c;)Ljava/lang/Object;
    .locals 3

    sget-object v0, La63/e0;->b:La63/a;

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v0}, La63/r;->b(Lv53/c;La63/q;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Plugin "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " is not installed. Consider using `install("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, La63/e0;->c:Lo63/a;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")` in client config first."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Lv53/c;La63/q;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "plugin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lv53/c;->I:Lo63/f;

    sget-object v0, La63/r;->a:Lo63/a;

    invoke-virtual {p0, v0}, Lo63/f;->d(Lo63/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo63/f;

    if-eqz p0, :cond_0

    invoke-interface {p1}, La63/q;->getKey()Lo63/a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo63/f;->d(Lo63/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
