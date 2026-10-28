.class final Lqk2/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqk2/b;->q(Lok2/a;Lok2/c;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic E:Le4/f;

.field final synthetic F:Le4/f;

.field final synthetic w:Lok2/d;

.field final synthetic x:Le4/f;

.field final synthetic y:Lqk2/e;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lok2/d;Le4/f;Lqk2/e;ZLe4/f;Le4/f;)V
    .locals 0

    iput-object p1, p0, Lqk2/b$e;->w:Lok2/d;

    iput-object p2, p0, Lqk2/b$e;->x:Le4/f;

    iput-object p3, p0, Lqk2/b$e;->y:Lqk2/e;

    iput-boolean p4, p0, Lqk2/b$e;->z:Z

    iput-object p5, p0, Lqk2/b$e;->E:Le4/f;

    iput-object p6, p0, Lqk2/b$e;->F:Le4/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le4/e;)V
    .locals 7

    const-string v0, "$this$constrainAs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Le4/e;->c:Le4/f;

    iget-object v1, p1, Le4/e;->g:Lcom/google/crypto/tink/internal/l0;

    iget-object v2, p0, Lqk2/b$e;->w:Lok2/d;

    invoke-virtual {v2}, Lok2/d;->b()Z

    move-result v2

    const/4 v3, 0x6

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    iget-object v2, p0, Lqk2/b$e;->x:Le4/f;

    iget-object v2, v2, Le4/f;->e:Le4/g;

    iget-object v5, p0, Lqk2/b$e;->y:Lqk2/e;

    invoke-virtual {v5}, Lqk2/e;->e()F

    move-result v5

    const/4 v6, 0x4

    invoke-static {v1, v2, v5, v6}, Lcom/google/crypto/tink/internal/l0;->X(Lcom/google/crypto/tink/internal/l0;Le4/g;FI)V

    goto :goto_2

    :cond_0
    iget-boolean v2, p0, Lqk2/b$e;->z:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lqk2/b$e;->E:Le4/f;

    :goto_0
    iget-object v2, v2, Le4/f;->e:Le4/g;

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lqk2/b$e;->F:Le4/f;

    goto :goto_0

    :goto_1
    invoke-static {v1, v2, v4, v3}, Lcom/google/crypto/tink/internal/l0;->X(Lcom/google/crypto/tink/internal/l0;Le4/g;FI)V

    :goto_2
    iget-object v1, p1, Le4/e;->d:Lwe/o;

    iget-object v2, v0, Le4/f;->d:Le4/h;

    invoke-static {v1, v2, v4, v3}, Lwe/o;->J(Lwe/o;Le4/h;FI)V

    iget-object v1, p1, Le4/e;->f:Lwe/o;

    iget-object v0, v0, Le4/f;->f:Le4/h;

    invoke-static {v1, v0, v4, v3}, Lwe/o;->J(Lwe/o;Le4/h;FI)V

    new-instance v0, Le4/n;

    const-string v1, "spread"

    invoke-direct {v0, v1}, Le4/n;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Le4/e;->a(Le4/n;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le4/e;

    invoke-virtual {p0, p1}, Lqk2/b$e;->a(Le4/e;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
