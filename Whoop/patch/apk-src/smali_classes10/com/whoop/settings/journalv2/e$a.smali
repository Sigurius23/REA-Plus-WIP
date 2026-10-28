.class final Lcom/whoop/settings/journalv2/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/journalv2/e;->q(Lcom/whoop/settings/journalv2/h;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic w:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
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

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc93/a;Lc93/m;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/m;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/settings/journalv2/e$a;->w:Lc93/a;

    iput-object p2, p0, Lcom/whoop/settings/journalv2/e$a;->x:Lc93/m;

    iput-object p3, p0, Lcom/whoop/settings/journalv2/e$a;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/settings/journalv2/c$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/whoop/settings/journalv2/e$a;->y:Lp1/c1;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/whoop/settings/journalv2/e;->z(Lp1/c1;Z)V

    return-void

    :cond_0
    instance-of v0, p1, Lcom/whoop/settings/journalv2/c$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/settings/journalv2/e$a;->x:Lc93/m;

    check-cast p1, Lcom/whoop/settings/journalv2/c$b;

    invoke-virtual {p1}, Lcom/whoop/settings/journalv2/c$b;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/settings/journalv2/c$b;->a()Lcom/whoop/journal/model/CurrentCycle;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/whoop/settings/journalv2/e$a;->a(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
