.class public final Lkh/e;
.super La0/a0;
.source "SourceFile"


# instance fields
.field public final synthetic g:Lcom/google/crypto/tink/internal/l0;


# direct methods
.method public constructor <init>(ILcom/google/crypto/tink/internal/l0;)V
    .locals 0

    iput-object p2, p0, Lkh/e;->g:Lcom/google/crypto/tink/internal/l0;

    invoke-direct {p0, p1}, La0/a0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Lkh/a;

    check-cast p3, Lkh/d;

    check-cast p4, Lkh/d;

    iget-object p1, p0, Lkh/e;->g:Lcom/google/crypto/tink/internal/l0;

    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast p1, Lbd3/v;

    iget-object p4, p3, Lkh/d;->a:Landroid/graphics/Bitmap;

    iget-object v0, p3, Lkh/d;->b:Ljava/util/Map;

    iget p3, p3, Lkh/d;->c:I

    invoke-virtual {p1, p2, p4, v0, p3}, Lbd3/v;->o(Lkh/a;Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    return-void
.end method

.method public final g(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lkh/a;

    check-cast p2, Lkh/d;

    iget p1, p2, Lkh/d;->c:I

    return p1
.end method
