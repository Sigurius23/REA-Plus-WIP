.class final Lcom/whoop/home/view/HomeFragment$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/home/view/HomeFragment$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

.field final synthetic x:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/home/view/HomeFragment;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/home/view/HomeFragment$d$a;->w:Lcom/whoop/home/view/HomeFragment;

    iput-object p2, p0, Lcom/whoop/home/view/HomeFragment$d$a;->x:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/time/LocalDate;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/time/LocalDate;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lcom/whoop/home/view/HomeFragment$d$a;->w:Lcom/whoop/home/view/HomeFragment;

    invoke-static {p2}, Lcom/whoop/home/view/HomeFragment;->L0(Lcom/whoop/home/view/HomeFragment;)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/whoop/home/view/HomeFragment$d$a;->w:Lcom/whoop/home/view/HomeFragment;

    invoke-static {p2}, Lcom/whoop/home/view/HomeFragment;->y0(Lcom/whoop/home/view/HomeFragment;)Ldm1/b;

    move-result-object p2

    new-instance v0, Ldm1/a$b0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Lcom/whoop/home/view/HomeFragment$d$a;->x:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Ldm1/a$b0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ldm1/b;->j(Ldm1/a;)Z

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/time/LocalDate;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/home/view/HomeFragment$d$a;->b(Ljava/time/LocalDate;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
