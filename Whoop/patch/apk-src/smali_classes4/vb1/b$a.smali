.class public final Lvb1/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvb1/b;->m()Ljb1/a;
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
    .locals 20

    move-object/from16 v0, p1

    const-string v1, "it"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Lj71/c;

    invoke-virtual {v2}, Lj71/c;->e()Lj61/h;

    move-result-object v3

    new-instance v8, Lh2/c;

    const v0, 0x3ccccccd    # 0.025f

    const v1, 0x3d99999a    # 0.075f

    const v4, -0x43dc28f6    # -0.01f

    const v5, 0x3d23d70a    # 0.04f

    invoke-direct {v8, v4, v5, v0, v1}, Lh2/c;-><init>(FFFF)V

    const/16 v18, 0x1fef

    const/16 v19, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    invoke-static/range {v3 .. v19}, Lj61/h;->b(Lj61/h;Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JFILjava/lang/Object;)Lj61/h;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Lj71/c;->b(Lj71/c;Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;ILjava/lang/Object;)Lj71/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm91/u;

    invoke-virtual {p0, p1}, Lvb1/b$a;->a(Lm91/u;)Lm91/u;

    move-result-object p1

    return-object p1
.end method
