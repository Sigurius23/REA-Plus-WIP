.class Lrd1/d$l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd1/d$l;-><init>(Lrd1/d;)V
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

    iput-object p1, p0, Lrd1/d$l$a;->a:Lrd1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lod1/t$e;
    .locals 2

    iget-object v0, p0, Lrd1/d$l$a;->a:Lrd1/d;

    invoke-static {v0}, Lrd1/d;->v(Lrd1/d;)Lrd1/e;

    move-result-object v0

    invoke-interface {v0, p1}, Lrd1/e;->i(Ljava/lang/Object;)V

    new-instance p1, Lod1/t$e;

    iget-object v0, p0, Lrd1/d$l$a;->a:Lrd1/d;

    sget-object v1, Lrd1/d$k;->ENABLED:Lrd1/d$k;

    invoke-static {v0, v1}, Lrd1/d;->I(Lrd1/d;Lod1/t$i;)Lod1/t$h;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lod1/t$e;-><init>(Lod1/t$h;Ljava/lang/Object;)V

    return-object p1
.end method
