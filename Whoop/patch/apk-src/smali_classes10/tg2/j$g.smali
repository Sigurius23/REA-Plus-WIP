.class final Ltg2/j$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltg2/j;->l(Ln82/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:I

.field final synthetic x:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic y:Ln82/c;

.field final synthetic z:Lp1/a1;


# direct methods
.method public constructor <init>(ILkotlin/jvm/functions/Function1;Ln82/c;Lp1/a1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function1;",
            "Ln82/c;",
            "Lp1/a1;",
            ")V"
        }
    .end annotation

    iput p1, p0, Ltg2/j$g;->w:I

    iput-object p2, p0, Ltg2/j$g;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Ltg2/j$g;->y:Ln82/c;

    iput-object p4, p0, Ltg2/j$g;->z:Lp1/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Ltg2/j$g;->z:Lp1/a1;

    iget v1, p0, Ltg2/j$g;->w:I

    invoke-static {v0, v1}, Ltg2/j;->s(Lp1/a1;I)V

    iget-object v0, p0, Ltg2/j$g;->x:Lkotlin/jvm/functions/Function1;

    new-instance v1, Ln82/b$b;

    iget-object v2, p0, Ltg2/j$g;->y:Ln82/c;

    invoke-virtual {v2}, Ln82/c;->j()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Ltg2/j$g;->y:Ln82/c;

    invoke-virtual {v3}, Ln82/c;->c()Ljava/util/List;

    move-result-object v3

    iget v4, p0, Ltg2/j$g;->w:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln82/a;

    invoke-direct {v1, v2, v3}, Ln82/b$b;-><init>(Ljava/lang/String;Ln82/a;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ltg2/j$g;->a()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
