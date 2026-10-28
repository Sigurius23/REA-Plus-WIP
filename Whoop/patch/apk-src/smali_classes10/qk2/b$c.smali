.class final Lqk2/b$c;
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
.field final synthetic w:Le4/f;

.field final synthetic x:Lqk2/e;


# direct methods
.method public constructor <init>(Le4/f;Lqk2/e;)V
    .locals 0

    iput-object p1, p0, Lqk2/b$c;->w:Le4/f;

    iput-object p2, p0, Lqk2/b$c;->x:Lqk2/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le4/e;)V
    .locals 5

    const-string v0, "$this$constrainAs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Le4/e;->g:Lcom/google/crypto/tink/internal/l0;

    iget-object v1, p0, Lqk2/b$c;->w:Le4/f;

    iget-object v1, v1, Le4/f;->e:Le4/g;

    iget-object v2, p0, Lqk2/b$c;->x:Lqk2/e;

    invoke-virtual {v2}, Lqk2/e;->d()F

    move-result v2

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3}, Lcom/google/crypto/tink/internal/l0;->X(Lcom/google/crypto/tink/internal/l0;Le4/g;FI)V

    iget-object v0, p1, Le4/e;->d:Lwe/o;

    iget-object v1, p1, Le4/e;->c:Le4/f;

    iget-object v2, v1, Le4/f;->d:Le4/h;

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-static {v0, v2, v3, v4}, Lwe/o;->J(Lwe/o;Le4/h;FI)V

    iget-object p1, p1, Le4/e;->f:Lwe/o;

    iget-object v0, v1, Le4/f;->f:Le4/h;

    invoke-static {p1, v0, v3, v4}, Lwe/o;->J(Lwe/o;Le4/h;FI)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le4/e;

    invoke-virtual {p0, p1}, Lqk2/b$c;->a(Le4/e;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
