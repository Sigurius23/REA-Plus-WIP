.class final Lh21/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh21/c;->r(Landroidx/compose/ui/Modifier;Lh21/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:Lh21/e;

.field final synthetic x:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lh21/e;Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh21/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lh21/c$a;->w:Lh21/e;

    iput-object p2, p0, Lh21/c$a;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lh21/c$a;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lh21/c$a;->y:Lp1/c1;

    iget-object v1, p0, Lh21/c$a;->w:Lh21/e;

    invoke-virtual {v1}, Lh21/e;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lh21/c;->D(Lp1/c1;Ljava/lang/String;)V

    iget-object v0, p0, Lh21/c$a;->x:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lh21/a;

    iget-object v2, p0, Lh21/c$a;->w:Lh21/e;

    invoke-virtual {v2}, Lh21/e;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lh21/a;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh21/c$a;->a()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
