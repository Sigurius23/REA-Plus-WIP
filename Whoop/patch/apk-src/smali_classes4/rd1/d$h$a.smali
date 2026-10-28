.class Lrd1/d$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd1/d$h;-><init>(Lrd1/d;)V
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

    iput-object p1, p0, Lrd1/d$h$a;->a:Lrd1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lod1/t$e;
    .locals 3

    iget-object v0, p0, Lrd1/d$h$a;->a:Lrd1/d;

    invoke-static {v0}, Lrd1/d;->u(Lrd1/d;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "PrimingReceivedState EnterAction"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lrd1/d$h$a;->a:Lrd1/d;

    invoke-static {v0}, Lrd1/d;->v(Lrd1/d;)Lrd1/e;

    move-result-object v0

    invoke-interface {v0, p1}, Lrd1/e;->j(Ljava/lang/Object;)V

    new-instance p1, Lod1/t$e;

    iget-object v0, p0, Lrd1/d$h$a;->a:Lrd1/d;

    sget-object v1, Lrd1/d$k;->PRIMING:Lrd1/d$k;

    invoke-static {v0, v1}, Lrd1/d;->G(Lrd1/d;Lod1/t$i;)Lod1/t$h;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lod1/t$e;-><init>(Lod1/t$h;Ljava/lang/Object;)V

    return-object p1
.end method
