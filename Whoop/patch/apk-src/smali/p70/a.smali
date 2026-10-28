.class public final Lp70/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp70/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lp70/a;",
        "Lp70/b;",
        "Lci2/b;",
        "whoopStrapProvider",
        "<init>",
        "(Lci2/b;)V",
        "Lcom/whoop/domain/model/WhoopStrapInfo;",
        "a",
        "()Lcom/whoop/domain/model/WhoopStrapInfo;",
        "Lci2/b;",
        "activation_release"
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
.field private final a:Lci2/b;


# direct methods
.method public constructor <init>(Lci2/b;)V
    .locals 1

    const-string v0, "whoopStrapProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp70/a;->a:Lci2/b;

    return-void
.end method


# virtual methods
.method public a()Lcom/whoop/domain/model/WhoopStrapInfo;
    .locals 1

    iget-object v0, p0, Lp70/a;->a:Lci2/b;

    invoke-interface {v0}, Lci2/b;->a()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
