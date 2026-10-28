.class Lrd1/d$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd1/d$d;-><init>(Lrd1/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrd1/d;


# direct methods
.method public constructor <init>(Lrd1/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lrd1/d$d$a;->a:Lrd1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lod1/t$e;
    .locals 1

    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lrd1/d$d$a;->a:Lrd1/d;

    invoke-virtual {p1}, Lrd1/d;->M()Lrd1/b;

    move-result-object p1

    sget-object v0, Lrd1/b;->ENABLED:Lrd1/b;

    if-eq p1, v0, :cond_1

    iget-object p1, p0, Lrd1/d$d$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->x(Lrd1/d;)Llh3/b;

    move-result-object p1

    sget-object v0, Lrd1/b;->ENABLING:Lrd1/b;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lrd1/d$d$a;->a:Lrd1/d;

    invoke-static {p1}, Lrd1/d;->x(Lrd1/d;)Llh3/b;

    move-result-object p1

    sget-object v0, Lrd1/b;->ENABLED:Lrd1/b;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
