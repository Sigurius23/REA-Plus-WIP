.class final Lch0/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch0/u;->p(Lzg0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/a;"
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
.field final synthetic w:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic x:Lzg0/a;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lzg0/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lzg0/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lch0/u$a;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lch0/u$a;->x:Lzg0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 15

    iget-object v0, p0, Lch0/u$a;->w:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lzg0/g$b;

    iget-object v2, p0, Lch0/u$a;->x:Lzg0/a;

    invoke-virtual {v2}, Lzg0/a;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lch0/u$a;->x:Lzg0/a;

    invoke-virtual {v3}, Lzg0/a;->c()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lch0/u$a;->x:Lzg0/a;

    invoke-virtual {v4}, Lzg0/a;->d()Ljava/lang/String;

    move-result-object v4

    const/16 v13, 0x770

    const/4 v14, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v1 .. v14}, Lzg0/g$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZZLjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lch0/u$a;->a()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
