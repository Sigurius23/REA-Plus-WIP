.class final Lat2/w$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lat2/w;->z(Lys2/e$i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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

.field final synthetic x:Lys2/e$i;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lys2/e$i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lys2/e$i;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lat2/w$c;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lat2/w$c;->x:Lys2/e$i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 7

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lf41/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lat2/w$c;->w:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lws2/i$l;

    iget-object v2, p0, Lat2/w$c;->x:Lys2/e$i;

    invoke-virtual {v2}, Lys2/e$i;->j()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v2

    check-cast p1, Lf41/r;

    invoke-virtual {p1}, Lf41/r;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lf41/r;->d()Z

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {p1}, Lf41/r;->b()I

    move-result v6

    invoke-direct/range {v1 .. v6}, Lws2/i$l;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;ZZI)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lat2/w$c;->a(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
