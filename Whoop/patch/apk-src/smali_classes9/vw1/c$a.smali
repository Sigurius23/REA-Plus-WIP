.class public final Lvw1/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvw1/c;->b(Ljava/lang/String;Lcom/whoop/design/util/TextResource;)Ljb1/a;
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
.field final synthetic w:Ljava/lang/String;

.field final synthetic x:Lcom/whoop/design/util/TextResource;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V
    .locals 0

    iput-object p1, p0, Lvw1/c$a;->w:Ljava/lang/String;

    iput-object p2, p0, Lvw1/c$a;->x:Lcom/whoop/design/util/TextResource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lm91/u;)Lm91/u;
    .locals 10

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Luw1/h;

    iget-object v3, p0, Lvw1/c$a;->w:Ljava/lang/String;

    iget-object v4, p0, Lvw1/c$a;->x:Lcom/whoop/design/util/TextResource;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_0

    iget-object p1, p0, Lvw1/c$a;->x:Lcom/whoop/design/util/TextResource;

    invoke-static {p1}, Lcom/whoop/design/util/b;->c(Lcom/whoop/design/util/TextResource;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    :goto_0
    move v5, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    const/16 v8, 0x31

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Luw1/h;->b(Luw1/h;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLny0/h;Lcom/whoop/design/util/TextResource;ILjava/lang/Object;)Luw1/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm91/u;

    invoke-virtual {p0, p1}, Lvw1/c$a;->a(Lm91/u;)Lm91/u;

    move-result-object p1

    return-object p1
.end method
