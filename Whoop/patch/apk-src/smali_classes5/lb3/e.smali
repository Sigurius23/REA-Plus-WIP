.class public final Llb3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Collection;

.field public b:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1

    const-string v0, "allSupertypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb3/e;->a:Ljava/util/Collection;

    sget-object p1, Lnb3/l;->d:Lnb3/i;

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Llb3/e;->b:Ljava/util/List;

    return-void
.end method
