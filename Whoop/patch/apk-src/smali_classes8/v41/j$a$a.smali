.class final Lv41/j$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv41/j$a;->a(Lc41/w2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
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
.field final synthetic w:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lv41/j$a$a;->w:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly2/y;)V
    .locals 6

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ly2/y;->n()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    iget-object v1, p0, Lv41/j$a$a;->w:Lp1/c1;

    invoke-static {v1}, Lv41/j;->j(Lp1/c1;)I

    move-result v1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lv41/j$a$a;->w:Lp1/c1;

    invoke-interface {p1}, Ly2/y;->n()J

    move-result-wide v4

    and-long v1, v4, v2

    long-to-int p1, v1

    invoke-static {v0, p1}, Lv41/j;->k(Lp1/c1;I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/y;

    invoke-virtual {p0, p1}, Lv41/j$a$a;->a(Ly2/y;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
