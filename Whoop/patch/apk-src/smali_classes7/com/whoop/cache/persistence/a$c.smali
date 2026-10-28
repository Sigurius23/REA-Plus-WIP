.class public final Lcom/whoop/cache/persistence/a$c;
.super Landroidx/room/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/cache/persistence/a;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "com/whoop/cache/persistence/a$c",
        "Landroidx/room/i;",
        "Lum0/c;",
        "",
        "createQuery",
        "()Ljava/lang/String;",
        "Ltb/c;",
        "statement",
        "entity",
        "Ll83/a0;",
        "a",
        "(Ltb/c;Lum0/c;)V",
        "cache_release"
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
.method public a(Ltb/c;Lum0/c;)V
    .locals 3

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p2}, Lum0/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {p2}, Lum0/c;->a()[B

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->q(I[B)V

    const/4 v0, 0x3

    invoke-virtual {p2}, Lum0/c;->b()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    const/4 v0, 0x4

    invoke-virtual {p2}, Lum0/c;->c()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lum0/c;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/cache/persistence/a$c;->a(Ltb/c;Lum0/c;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE `cache_entries` SET `uri` = ?,`data` = ?,`lastUpdated` = ? WHERE `uri` = ?"

    return-object v0
.end method
