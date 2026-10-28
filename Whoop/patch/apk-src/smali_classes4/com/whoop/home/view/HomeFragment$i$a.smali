.class final Lcom/whoop/home/view/HomeFragment$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/home/view/HomeFragment$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lcom/whoop/home/view/HomeFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/home/view/HomeFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/home/view/HomeFragment$i$a;->w:Lcom/whoop/home/view/HomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ZLq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p1, p0, Lcom/whoop/home/view/HomeFragment$i$a;->w:Lcom/whoop/home/view/HomeFragment;

    invoke-static {p1}, Lcom/whoop/home/view/HomeFragment;->E0(Lcom/whoop/home/view/HomeFragment;)Lu92/d;

    move-result-object p1

    const/4 p2, 0x0

    const-string v0, "has-shown-yir-2025"

    invoke-virtual {p1, v0, p2}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/whoop/home/view/HomeFragment$i$a;->w:Lcom/whoop/home/view/HomeFragment;

    invoke-static {p1}, Lcom/whoop/home/view/HomeFragment;->y0(Lcom/whoop/home/view/HomeFragment;)Ldm1/b;

    move-result-object p1

    sget-object p2, Ldm1/a$i0;->a:Ldm1/a$i0;

    invoke-virtual {p1, p2}, Ldm1/b;->j(Ldm1/a;)Z

    iget-object p1, p0, Lcom/whoop/home/view/HomeFragment$i$a;->w:Lcom/whoop/home/view/HomeFragment;

    invoke-static {p1}, Lcom/whoop/home/view/HomeFragment;->E0(Lcom/whoop/home/view/HomeFragment;)Lu92/d;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, v0, p2}, Lu92/d;->q(Ljava/lang/String;Z)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/whoop/home/view/HomeFragment$i$a;->b(ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
