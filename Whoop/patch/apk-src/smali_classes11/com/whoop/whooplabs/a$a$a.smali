.class final Lcom/whoop/whooplabs/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whooplabs/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/whooplabs/a;

.field final synthetic x:Lcom/whoop/whooplabs/a$a$b;


# direct methods
.method public constructor <init>(Lcom/whoop/whooplabs/a;Lcom/whoop/whooplabs/a$a$b;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/whooplabs/a$a$a;->w:Lcom/whoop/whooplabs/a;

    iput-object p2, p0, Lcom/whoop/whooplabs/a$a$a;->x:Lcom/whoop/whooplabs/a$a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    :try_start_0
    iget-object p1, p0, Lcom/whoop/whooplabs/a$a$a;->w:Lcom/whoop/whooplabs/a;

    invoke-static {p1}, Lcom/whoop/whooplabs/a;->a(Lcom/whoop/whooplabs/a;)Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/whooplabs/a$a$a;->x:Lcom/whoop/whooplabs/a$a$b;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/whoop/whooplabs/a$a$a;->w:Lcom/whoop/whooplabs/a;

    invoke-static {v0}, Lcom/whoop/whooplabs/a;->b(Lcom/whoop/whooplabs/a;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Failed to unbind from WhoopLabsService"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/a$a$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
