.class Ls52/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls52/f;->h(Lp92/a;)Z
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
.field final synthetic w:Lix/a;

.field final synthetic x:Lgx/a;

.field final synthetic y:Ls52/f;


# direct methods
.method public constructor <init>(Ls52/f;Lix/a;Lgx/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ls52/f$a;->y:Ls52/f;

    iput-object p2, p0, Ls52/f$a;->w:Lix/a;

    iput-object p3, p0, Ls52/f$a;->x:Lgx/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lod1/k;)V
    .locals 1

    iget-object v0, p0, Ls52/f$a;->w:Lix/a;

    invoke-static {p1}, Lcom/whoop/realtime/service/c;->g(Lod1/k;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lix/a;->a:Ljava/lang/Object;

    iget-object p1, p0, Ls52/f$a;->x:Lgx/a;

    invoke-virtual {p1}, Lgx/a;->a()V

    return-void
.end method

.method public onCompleted()V
    .locals 0

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Ls52/f$a;->w:Lix/a;

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p1, Lix/a;->a:Ljava/lang/Object;

    iget-object p1, p0, Ls52/f$a;->x:Lgx/a;

    invoke-virtual {p1}, Lgx/a;->a()V

    return-void
.end method

.method public bridge synthetic onNext(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lod1/k;

    invoke-virtual {p0, p1}, Ls52/f$a;->a(Lod1/k;)V

    return-void
.end method
