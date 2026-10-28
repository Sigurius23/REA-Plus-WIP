.class public final Lpq0/e$d;
.super Lhc/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpq0/e;->b0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "pq0/e$d",
        "Lhc/h;",
        "",
        "position",
        "Ll83/a0;",
        "onPageSelected",
        "(I)V",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Lpq0/e;

.field final synthetic b:Leq0/d1;


# direct methods
.method public constructor <init>(Lpq0/e;Leq0/d1;)V
    .locals 0

    iput-object p1, p0, Lpq0/e$d;->a:Lpq0/e;

    iput-object p2, p0, Lpq0/e$d;->b:Leq0/d1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 3

    iget-object v0, p0, Lpq0/e$d;->a:Lpq0/e;

    invoke-static {v0}, Lpq0/e;->O(Lpq0/e;)Lz82/e;

    move-result-object v0

    iget-object v1, p0, Lpq0/e$d;->b:Leq0/d1;

    iget-object v1, v1, Leq0/d1;->h:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.whoop.community.presentation.share.WidgetViewAdapter"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lpq0/j;

    invoke-virtual {v1, p1}, Lpq0/j;->a(I)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ll83/k;

    const-string v2, "Data_Attached"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "Swipe"

    const-string v2, "Share Data - View Data"

    invoke-virtual {v0, v1, v2, p1}, Lz82/e;->j0(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
