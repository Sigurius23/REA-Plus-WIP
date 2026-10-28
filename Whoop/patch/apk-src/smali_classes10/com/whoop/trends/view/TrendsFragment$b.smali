.class public final Lcom/whoop/trends/view/TrendsFragment$b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/trends/view/TrendsFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0010\u0002\u001a\u00028\u0000\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"
    }
    d2 = {
        "",
        "T",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation


# instance fields
.field final synthetic w:Landroid/content/ComponentCallbacks;

.field final synthetic x:Lvf3/a;

.field final synthetic y:Lc93/a;


# direct methods
.method public constructor <init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/trends/view/TrendsFragment$b;->w:Landroid/content/ComponentCallbacks;

    iput-object p2, p0, Lcom/whoop/trends/view/TrendsFragment$b;->x:Lvf3/a;

    iput-object p3, p0, Lcom/whoop/trends/view/TrendsFragment$b;->y:Lc93/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lor2/y;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/view/TrendsFragment$b;->w:Landroid/content/ComponentCallbacks;

    iget-object v1, p0, Lcom/whoop/trends/view/TrendsFragment$b;->x:Lvf3/a;

    iget-object v2, p0, Lcom/whoop/trends/view/TrendsFragment$b;->y:Lc93/a;

    invoke-static {v0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v3, Lor2/y;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v0, v2, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
