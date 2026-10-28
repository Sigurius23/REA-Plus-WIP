.class final Lsv2/e$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsv2/e;->m0(Lrv2/h$b;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Landroidx/compose/runtime/Composer;I)V
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

.field final synthetic x:Lbc3/c0;

.field final synthetic y:Lg1/y3;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lbc3/c0;",
            "Lg1/y3;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lsv2/e$k;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lsv2/e$k;->x:Lbc3/c0;

    iput-object p3, p0, Lsv2/e$k;->y:Lg1/y3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lrv2/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsv2/e$k;->w:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    instance-of p1, p1, Lrv2/d$p;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lsv2/e$k;->x:Lbc3/c0;

    new-instance v0, Lsv2/e$k$a;

    iget-object v1, p0, Lsv2/e$k;->y:Lg1/y3;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lsv2/e$k$a;-><init>(Lg1/y3;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lsv2/e$k;->a(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
