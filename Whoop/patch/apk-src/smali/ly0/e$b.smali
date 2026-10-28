.class final Lly0/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lly0/e;->g(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Ly71/g;JZLandroidx/compose/runtime/Composer;II)V
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


# direct methods
.method public constructor <init>(Le4/f;)V
    .locals 0

    iput-object p1, p0, Lly0/e$b;->w:Le4/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le4/e;)V
    .locals 5

    const-string v0, "$this$constrainAs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Le4/e;->d:Lwe/o;

    iget-object v1, p0, Lly0/e$b;->w:Le4/f;

    iget-object v1, v1, Le4/f;->f:Le4/h;

    const/4 v2, 0x1

    int-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v4, v3

    mul-float/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Lwe/o;->J(Lwe/o;Le4/h;FI)V

    iget-object v0, p1, Le4/e;->e:Lcom/google/crypto/tink/internal/l0;

    iget-object v1, p0, Lly0/e$b;->w:Le4/f;

    iget-object v1, v1, Le4/f;->e:Le4/g;

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v1, v2, v3}, Lcom/google/crypto/tink/internal/l0;->X(Lcom/google/crypto/tink/internal/l0;Le4/g;FI)V

    iget-object p1, p1, Le4/e;->g:Lcom/google/crypto/tink/internal/l0;

    iget-object v0, p0, Lly0/e$b;->w:Le4/f;

    iget-object v0, v0, Le4/f;->g:Le4/g;

    invoke-static {p1, v0, v2, v3}, Lcom/google/crypto/tink/internal/l0;->X(Lcom/google/crypto/tink/internal/l0;Le4/g;FI)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le4/e;

    invoke-virtual {p0, p1}, Lly0/e$b;->a(Le4/e;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
