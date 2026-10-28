.class Lcom/whoop/ui/h$a;
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
.field final synthetic w:Lcom/whoop/ui/h;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ui/h$a;->w:Lcom/whoop/ui/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 0

    iget-object p1, p0, Lcom/whoop/ui/h$a;->w:Lcom/whoop/ui/h;

    invoke-virtual {p1}, Lcom/whoop/ui/h;->K()V

    return-void
.end method

.method public onCompleted()V
    .locals 0

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic onNext(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/whoop/ui/h$a;->a(Ljava/lang/Boolean;)V

    return-void
.end method
