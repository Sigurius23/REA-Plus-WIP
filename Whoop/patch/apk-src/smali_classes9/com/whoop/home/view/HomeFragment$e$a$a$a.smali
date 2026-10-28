.class final Lcom/whoop/home/view/HomeFragment$e$a$a$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/home/view/HomeFragment$e$a$a;->b(Ldm1/a;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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

.annotation runtime Ls83/e;
    c = "com.whoop.home.view.HomeFragment$observeNavigationState$1$1$1"
    f = "HomeFragment.kt"
    l = {
        0x2be
    }
    m = "emit"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/home/view/HomeFragment$e$a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/whoop/home/view/HomeFragment$e$a$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field z:I


# direct methods
.method public constructor <init>(Lcom/whoop/home/view/HomeFragment$e$a$a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/home/view/HomeFragment$e$a$a<",
            "-TT;>;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/home/view/HomeFragment$e$a$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/home/view/HomeFragment$e$a$a$a;->y:Lcom/whoop/home/view/HomeFragment$e$a$a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/home/view/HomeFragment$e$a$a$a;->x:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/home/view/HomeFragment$e$a$a$a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/home/view/HomeFragment$e$a$a$a;->z:I

    iget-object p1, p0, Lcom/whoop/home/view/HomeFragment$e$a$a$a;->y:Lcom/whoop/home/view/HomeFragment$e$a$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/whoop/home/view/HomeFragment$e$a$a;->b(Ldm1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
