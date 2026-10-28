.class final Lcom/whoop/integrations/view/IntegrationsFragment$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/integrations/view/IntegrationsFragment$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
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
.field final synthetic w:Lfr1/d;

.field final synthetic x:Lcom/whoop/integrations/view/IntegrationsFragment;


# direct methods
.method public constructor <init>(Lfr1/d;Lcom/whoop/integrations/view/IntegrationsFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/integrations/view/IntegrationsFragment$a$a;->w:Lfr1/d;

    iput-object p2, p0, Lcom/whoop/integrations/view/IntegrationsFragment$a$a;->x:Lcom/whoop/integrations/view/IntegrationsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lfr1/c;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfr1/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Lfr1/c$d;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/whoop/integrations/view/IntegrationsFragment$a$a;->w:Lfr1/d;

    check-cast p1, Lfr1/c$d;

    iget-object v0, p0, Lcom/whoop/integrations/view/IntegrationsFragment$a$a;->x:Lcom/whoop/integrations/view/IntegrationsFragment;

    invoke-static {v0}, Lcom/whoop/integrations/view/IntegrationsFragment;->I(Lcom/whoop/integrations/view/IntegrationsFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lfr1/c$d;->a(Ljava/lang/String;)Lfr1/c$d;

    move-result-object p1

    invoke-virtual {p2, p1}, Lfr1/d;->k(Lfr1/c;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/whoop/integrations/view/IntegrationsFragment$a$a;->w:Lfr1/d;

    invoke-virtual {p2, p1}, Lfr1/d;->k(Lfr1/c;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfr1/c;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/integrations/view/IntegrationsFragment$a$a;->b(Lfr1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
