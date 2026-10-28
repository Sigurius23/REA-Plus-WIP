.class final Lu80/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu80/c;->l(Lu80/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic w:Lu80/e;

.field final synthetic x:Lu80/d;

.field final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic z:Lb3/x2;


# direct methods
.method public constructor <init>(Lu80/e;Lu80/d;Lkotlin/jvm/functions/Function1;Lb3/x2;Lp1/c1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu80/e;",
            "Lu80/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Lb3/x2;",
            "Lp1/c1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lu80/c$c;->w:Lu80/e;

    iput-object p2, p0, Lu80/c$c;->x:Lu80/d;

    iput-object p3, p0, Lu80/c$c;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lu80/c$c;->z:Lb3/x2;

    iput-object p5, p0, Lu80/c$c;->E:Lp1/c1;

    iput-object p6, p0, Lu80/c$c;->F:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lu80/a;)V
    .locals 10

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lu80/c$c;->E:Lp1/c1;

    invoke-virtual {p1}, Lu80/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lu80/c;->A(Lp1/c1;Ljava/lang/String;)V

    iget-object v0, p0, Lu80/c$c;->F:Lp1/c1;

    iget-object v1, p0, Lu80/c$c;->w:Lu80/e;

    invoke-virtual {p1}, Lu80/a;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lu80/c$c;->F:Lp1/c1;

    invoke-static {v3}, Lu80/c;->x(Lp1/c1;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lu80/e;->b(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lu80/c;->y(Lp1/c1;Ljava/util/List;)V

    iget-object v0, p0, Lu80/c$c;->x:Lu80/d;

    invoke-virtual {v0}, Lu80/d;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SELECT_COUNTRY"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lu80/c$c;->y:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lj80/a$d;

    invoke-virtual {p1}, Lu80/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lj80/a$d;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const-string v1, "SELECT_STATE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu80/c$c;->y:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lj80/a$q0;

    invoke-virtual {p1}, Lu80/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lj80/a$q0;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    iget-object v0, p0, Lu80/c$c;->z:Lb3/x2;

    if-eqz v0, :cond_2

    check-cast v0, Lb3/x1;

    invoke-virtual {v0}, Lb3/x1;->a()V

    :cond_2
    iget-object v0, p0, Lu80/c$c;->y:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lh80/b$i;

    iget-object v2, p0, Lu80/c$c;->x:Lu80/d;

    invoke-virtual {v2}, Lu80/d;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lu80/a;->d()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x22

    const/4 v9, 0x0

    const/4 v3, 0x0

    const-string v4, "tile"

    const-string v6, "account_creation"

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu80/a;

    invoke-virtual {p0, p1}, Lu80/c$c;->a(Lu80/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
