.class Lcom/whoop/ui/h$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/h$b;->onError(Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbh3/b;"
    }
.end annotation


# instance fields
.field w:Z

.field final synthetic x:Ljava/lang/Throwable;

.field final synthetic y:Lix/a;

.field final synthetic z:Lcom/whoop/ui/h$b;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/h$b;Ljava/lang/Throwable;Lix/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ui/h$b$a;->z:Lcom/whoop/ui/h$b;

    iput-object p2, p0, Lcom/whoop/ui/h$b$a;->x:Ljava/lang/Throwable;

    iput-object p3, p0, Lcom/whoop/ui/h$b$a;->y:Lix/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/whoop/ui/h$b$a;->w:Z

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 3

    iget-boolean p1, p0, Lcom/whoop/ui/h$b$a;->w:Z

    const/4 v0, 0x1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/whoop/ui/h$b$a;->z:Lcom/whoop/ui/h$b;

    iget-boolean v1, p1, Lcom/whoop/ui/h$b;->w:Z

    if-nez v1, :cond_0

    iput-boolean v0, p0, Lcom/whoop/ui/h$b$a;->w:Z

    iget-object v1, p1, Lcom/whoop/ui/h$b;->y:Lbh3/c;

    iget-object v2, p0, Lcom/whoop/ui/h$b$a;->x:Ljava/lang/Throwable;

    iget-object p1, p1, Lcom/whoop/ui/h$b;->z:Lcom/whoop/ui/h;

    invoke-interface {v1, v2, p1}, Lbh3/c;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    iget-object p1, p0, Lcom/whoop/ui/h$b$a;->z:Lcom/whoop/ui/h$b;

    iput-boolean v0, p1, Lcom/whoop/ui/h$b;->w:Z

    iget-object p1, p0, Lcom/whoop/ui/h$b$a;->y:Lix/a;

    iget-object p1, p1, Lix/a;->a:Ljava/lang/Object;

    check-cast p1, Lxg3/t;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lxg3/t;->b()V

    iget-object p1, p0, Lcom/whoop/ui/h$b$a;->y:Lix/a;

    const/4 v0, 0x0

    iput-object v0, p1, Lix/a;->a:Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/whoop/ui/h$b$a;->a(Ljava/lang/Boolean;)V

    return-void
.end method
