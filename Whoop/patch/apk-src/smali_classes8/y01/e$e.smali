.class final Ly01/e$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly01/e;->b(Landroidx/compose/ui/Modifier;Ly01/f;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Ly01/f;


# direct methods
.method public constructor <init>(Ly01/f;)V
    .locals 0

    iput-object p1, p0, Ly01/e$e;->w:Ly01/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le4/e;)V
    .locals 5

    const-string v0, "$this$constrainAs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Le4/e;->c:Le4/f;

    iget-object v1, p0, Ly01/e$e;->w:Ly01/f;

    invoke-virtual {v1}, Ly01/f;->g()Ly01/g;

    move-result-object v1

    const/4 v2, 0x6

    const/4 v3, 0x0

    if-nez v1, :cond_0

    iget-object v1, p0, Ly01/e$e;->w:Ly01/f;

    invoke-virtual {v1}, Ly01/f;->h()Ly01/g;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p1, Le4/e;->e:Lcom/google/crypto/tink/internal/l0;

    iget-object v4, v0, Le4/f;->e:Le4/g;

    invoke-static {v1, v4, v3, v2}, Lcom/google/crypto/tink/internal/l0;->X(Lcom/google/crypto/tink/internal/l0;Le4/g;FI)V

    :cond_0
    iget-object v1, p0, Ly01/e$e;->w:Ly01/f;

    invoke-virtual {v1}, Ly01/f;->b()Ly01/g;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v1, p1, Le4/e;->g:Lcom/google/crypto/tink/internal/l0;

    iget-object v4, v0, Le4/f;->g:Le4/g;

    invoke-static {v1, v4, v3, v2}, Lcom/google/crypto/tink/internal/l0;->X(Lcom/google/crypto/tink/internal/l0;Le4/g;FI)V

    :cond_1
    iget-object v1, p1, Le4/e;->d:Lwe/o;

    iget-object v4, v0, Le4/f;->d:Le4/h;

    invoke-static {v1, v4, v3, v2}, Lwe/o;->J(Lwe/o;Le4/h;FI)V

    iget-object p1, p1, Le4/e;->f:Lwe/o;

    iget-object v0, v0, Le4/f;->f:Le4/h;

    invoke-static {p1, v0, v3, v2}, Lwe/o;->J(Lwe/o;Le4/h;FI)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le4/e;

    invoke-virtual {p0, p1}, Ly01/e$e;->a(Le4/e;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
