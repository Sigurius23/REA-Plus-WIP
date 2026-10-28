.class final Lk01/d$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk01/d;->s(Landroidx/compose/ui/Modifier;Lk01/e;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:Le4/f;

.field final synthetic x:Le4/f;


# direct methods
.method public constructor <init>(Le4/f;Le4/f;)V
    .locals 0

    iput-object p1, p0, Lk01/d$i;->w:Le4/f;

    iput-object p2, p0, Lk01/d$i;->x:Le4/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le4/e;)V
    .locals 5

    const-string v0, "$this$constrainAs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Le4/e;->e:Lcom/google/crypto/tink/internal/l0;

    iget-object v1, p0, Lk01/d$i;->w:Le4/f;

    iget-object v1, v1, Le4/f;->g:Le4/g;

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v1, v2, v3}, Lcom/google/crypto/tink/internal/l0;->X(Lcom/google/crypto/tink/internal/l0;Le4/g;FI)V

    iget-object v0, p1, Le4/e;->d:Lwe/o;

    iget-object v1, p0, Lk01/d$i;->x:Le4/f;

    iget-object v1, v1, Le4/f;->f:Le4/h;

    invoke-static {v0, v1, v2, v3}, Lwe/o;->J(Lwe/o;Le4/h;FI)V

    iget-object v0, p1, Le4/e;->f:Lwe/o;

    iget-object v1, p1, Le4/e;->c:Le4/f;

    iget-object v4, v1, Le4/f;->f:Le4/h;

    invoke-static {v0, v4, v2, v3}, Lwe/o;->J(Lwe/o;Le4/h;FI)V

    iget-object v0, p1, Le4/e;->g:Lcom/google/crypto/tink/internal/l0;

    iget-object v1, v1, Le4/f;->g:Le4/g;

    invoke-static {v0, v1, v2, v3}, Lcom/google/crypto/tink/internal/l0;->X(Lcom/google/crypto/tink/internal/l0;Le4/g;FI)V

    new-instance v0, Le4/n;

    const-string v1, "preferWrap"

    invoke-direct {v0, v1}, Le4/n;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Le4/e;->a(Le4/n;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le4/e;

    invoke-virtual {p0, p1}, Lk01/d$i;->a(Le4/e;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
