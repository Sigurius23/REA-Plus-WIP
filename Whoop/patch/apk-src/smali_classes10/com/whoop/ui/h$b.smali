.class Lcom/whoop/ui/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/h;->L(Landroidx/fragment/app/o1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ui/l;Lxg3/g;Lbh3/c;Lbh3/c;)Lcom/whoop/ui/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lxg3/h;"
    }
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/ui/l;

.field final synthetic F:Lbh3/c;

.field w:Z

.field final synthetic x:Lxg3/g;

.field final synthetic y:Lbh3/c;

.field final synthetic z:Lcom/whoop/ui/h;


# direct methods
.method public constructor <init>(Lxg3/g;Lbh3/c;Lcom/whoop/ui/h;Lcom/whoop/ui/l;Lbh3/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ui/h$b;->x:Lxg3/g;

    iput-object p2, p0, Lcom/whoop/ui/h$b;->y:Lbh3/c;

    iput-object p3, p0, Lcom/whoop/ui/h$b;->z:Lcom/whoop/ui/h;

    iput-object p4, p0, Lcom/whoop/ui/h$b;->E:Lcom/whoop/ui/l;

    iput-object p5, p0, Lcom/whoop/ui/h$b;->F:Lbh3/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/whoop/ui/h$b;->w:Z

    return-void
.end method


# virtual methods
.method public onCompleted()V
    .locals 0

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    new-instance v0, Lix/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lcom/whoop/ui/h$b;->x:Lxg3/g;

    new-instance v2, Lcom/whoop/ui/h$b$a;

    invoke-direct {v2, p0, p1, v0}, Lcom/whoop/ui/h$b$a;-><init>(Lcom/whoop/ui/h$b;Ljava/lang/Throwable;Lix/a;)V

    invoke-virtual {v1, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object p1

    iput-object p1, v0, Lix/a;->a:Ljava/lang/Object;

    iget-object v0, p0, Lcom/whoop/ui/h$b;->E:Lcom/whoop/ui/l;

    invoke-virtual {v0, p1}, Lcom/whoop/ui/l;->a(Lxg3/t;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/whoop/ui/h$b;->w:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/h$b;->F:Lbh3/c;

    iget-object v1, p0, Lcom/whoop/ui/h$b;->z:Lcom/whoop/ui/h;

    invoke-interface {v0, p1, v1}, Lbh3/c;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/ui/h$b;->w:Z

    :cond_0
    return-void
.end method
