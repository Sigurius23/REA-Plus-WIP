.class public final Lcom/whoop/realtime/presentation/j$j;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/realtime/presentation/j;-><init>()V
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
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00028\u0000\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"
    }
    d2 = {
        "Landroidx/lifecycle/w1;",
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
.field final synthetic w:Lpb/f;

.field final synthetic x:Lvf3/a;

.field final synthetic y:Lc93/a;

.field final synthetic z:Lc93/a;


# direct methods
.method public constructor <init>(Lpb/f;Lvf3/a;Lc93/a;Lc93/a;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/realtime/presentation/j$j;->w:Lpb/f;

    iput-object p2, p0, Lcom/whoop/realtime/presentation/j$j;->x:Lvf3/a;

    iput-object p3, p0, Lcom/whoop/realtime/presentation/j$j;->y:Lc93/a;

    iput-object p4, p0, Lcom/whoop/realtime/presentation/j$j;->z:Lc93/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/lifecycle/w1;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/whoop/realtime/presentation/k;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/whoop/realtime/presentation/j$j;->w:Lpb/f;

    iget-object v2, p0, Lcom/whoop/realtime/presentation/j$j;->x:Lvf3/a;

    iget-object v5, p0, Lcom/whoop/realtime/presentation/j$j;->y:Lc93/a;

    iget-object v6, p0, Lcom/whoop/realtime/presentation/j$j;->z:Lc93/a;

    .line 3
    const-class v1, Lcom/whoop/realtime/presentation/k;

    .line 4
    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    .line 5
    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "state"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "clazz"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v3, Lav/b;

    const/16 v1, 0x1c

    invoke-direct {v3, v0, v1}, Lav/b;-><init>(Ljava/lang/Object;I)V

    .line 7
    check-cast v0, Landroid/content/ComponentCallbacks;

    invoke-static {v0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v1

    .line 8
    invoke-static/range {v1 .. v6}, Ljc/x;->X(Lxf3/c;Lvf3/a;Lc93/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/realtime/presentation/j$j;->invoke()Landroidx/lifecycle/w1;

    move-result-object v0

    return-object v0
.end method
