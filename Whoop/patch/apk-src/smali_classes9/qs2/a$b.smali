.class public final Lqs2/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqs2/a;
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lm91/u;)Lm91/u;
    .locals 34

    move-object/from16 v0, p1

    const-string v1, "it"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Ld11/i;

    sget-object v0, Li2/t;->b:Li2/s;

    const-wide v3, 0xffffffffL

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    new-instance v1, Li2/x;

    invoke-direct {v1, v3, v4}, Li2/x;-><init>(J)V

    const/4 v3, 0x0

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    filled-new-array {v1, v5}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v3, 0x0

    const/16 v4, 0xe

    invoke-static {v0, v1, v3, v3, v4}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v24

    const v32, 0x1fdfffff

    const/16 v33, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v2 .. v33}, Ld11/i;->f(Ld11/i;Ljava/lang/Object;Lkd1/l;Ll3/v0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll3/v0;Ly71/g;Lkd1/o;Lkd1/o;Lkd1/o;Lkotlin/jvm/functions/Function1;ZZLd11/a;Lk91/a;Ld11/b;ZZLd11/c;Li91/a;Lj91/b;Li2/t;FFFFFLjava/lang/Object;Lcom/whoop/navigation/e;ILjava/lang/Object;)Ld11/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm91/u;

    invoke-virtual {p0, p1}, Lqs2/a$b;->a(Lm91/u;)Lm91/u;

    move-result-object p1

    return-object p1
.end method
