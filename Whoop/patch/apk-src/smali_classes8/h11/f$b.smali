.class final Lh11/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh11/f;->h(Landroidx/compose/ui/Modifier;Ljava/util/List;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic x:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lc93/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lh11/f$b;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lh11/f$b;->x:Lc93/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh11/f$b;->w:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    instance-of v0, p1, Lh11/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh11/f$b;->x:Lc93/m;

    check-cast p1, Lh11/b;

    invoke-virtual {p1}, Lh11/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lh11/b;->a()Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lh11/f$b;->a(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
