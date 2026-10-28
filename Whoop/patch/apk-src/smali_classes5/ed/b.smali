.class public final Led/b;
.super Lwb3/f;
.source "SourceFile"


# instance fields
.field public final c:Led/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Led/e;

    invoke-direct {v0}, Led/e;-><init>()V

    iput-object v0, p0, Led/b;->c:Led/e;

    return-void
.end method


# virtual methods
.method public final A()Lcf/j;
    .locals 1

    iget-object v0, p0, Led/b;->c:Led/e;

    return-object v0
.end method

.method public final Q(Lcf/k;)Lcf/i;
    .locals 1

    check-cast p1, Led/f;

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Led/a;

    invoke-direct {v0, p1}, Led/a;-><init>(Led/f;)V

    return-object v0
.end method
