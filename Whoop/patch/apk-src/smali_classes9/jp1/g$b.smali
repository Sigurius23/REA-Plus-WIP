.class final Ljp1/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljp1/g;->n(Landroidx/compose/ui/Modifier;Lhp1/d;Lcp1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic x:Lhp1/c;

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp1/c1;Lhp1/c;Lp1/c1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lhp1/c;",
            "Lp1/c1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Ljp1/g$b;->w:Lp1/c1;

    iput-object p2, p0, Ljp1/g$b;->x:Lhp1/c;

    iput-object p3, p0, Ljp1/g$b;->y:Lp1/c1;

    iput-object p4, p0, Ljp1/g$b;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Ljp1/g$b;->w:Lp1/c1;

    iget-object v1, p0, Ljp1/g$b;->x:Lhp1/c;

    invoke-virtual {v1}, Lhp1/c;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Ljp1/g$b;->y:Lp1/c1;

    iget-object v1, p0, Ljp1/g$b;->x:Lhp1/c;

    invoke-virtual {v1}, Lhp1/c;->c()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v1

    invoke-interface {v0, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Ljp1/g$b;->z:Lp1/c1;

    iget-object v1, p0, Ljp1/g$b;->x:Lhp1/c;

    invoke-virtual {v1}, Lhp1/c;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljp1/g$b;->a()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
