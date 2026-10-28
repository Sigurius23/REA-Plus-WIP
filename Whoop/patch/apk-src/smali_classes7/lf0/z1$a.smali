.class final Llf0/z1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llf0/z1;->s(Landroidx/compose/ui/Modifier;Llf0/a2;Lde0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:Lde0/a;

.field final synthetic x:Llf0/e;

.field final synthetic y:Llf0/a2;

.field final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lde0/a;Llf0/e;Llf0/a2;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde0/a;",
            "Llf0/e;",
            "Llf0/a2;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Llf0/z1$a;->w:Lde0/a;

    iput-object p2, p0, Llf0/z1$a;->x:Llf0/e;

    iput-object p3, p0, Llf0/z1$a;->y:Llf0/a2;

    iput-object p4, p0, Llf0/z1$a;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Llf0/z1$a;->w:Lde0/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Llf0/z1$a;->x:Llf0/e;

    invoke-virtual {v0}, Llf0/e;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Llf0/z1$a;->w:Lde0/a;

    invoke-virtual {v1}, Lde0/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llf0/z1$a;->y:Llf0/a2;

    invoke-virtual {v0}, Llf0/a2;->l()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Llf0/z1$a;->w:Lde0/a;

    invoke-virtual {v1}, Lde0/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Llf0/z1$a;->x:Llf0/e;

    :goto_0
    iget-object v1, p0, Llf0/z1$a;->z:Lkotlin/jvm/functions/Function1;

    new-instance v2, Llf0/x1$a;

    iget-object v3, p0, Llf0/z1$a;->y:Llf0/a2;

    invoke-virtual {v3}, Llf0/a2;->l()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Llf0/x1$a;-><init>(Ljava/lang/String;Llf0/e;)V

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Llf0/z1$a;->a()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
