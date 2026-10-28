.class public final Lru1/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lru1/a;->e(Lcom/whoop/lastnightsleep/domain/models/DetailsGraphingCardModel;Lnu1/c;)Ltu1/g;
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
.field final synthetic w:Lmc1/b;


# direct methods
.method public constructor <init>(Lmc1/b;)V
    .locals 0

    iput-object p1, p0, Lru1/a$b;->w:Lmc1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lm91/u;)Lm91/u;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lk71/n;

    iget-object v0, p0, Lru1/a$b;->w:Lmc1/b;

    sget-object v1, Lmc1/b;->NONE:Lmc1/b;

    if-eq v0, v1, :cond_0

    sget-object v0, Lmc1/d;->a:Lmc1/d$a;

    invoke-virtual {p1}, Lk71/n;->c()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lru1/a$b;->w:Lmc1/b;

    invoke-virtual {v0, v1, v2, v2}, Lmc1/d$a;->a(Ljava/util/List;Lmc1/b;Lmc1/b;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, Lk71/n;->b(Lk71/n;Lk71/o;Ljava/util/List;ILjava/lang/Object;)Lk71/n;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm91/u;

    invoke-virtual {p0, p1}, Lru1/a$b;->a(Lm91/u;)Lm91/u;

    move-result-object p1

    return-object p1
.end method
