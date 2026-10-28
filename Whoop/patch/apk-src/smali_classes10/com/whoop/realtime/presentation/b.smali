.class final Lcom/whoop/realtime/presentation/b;
.super Landroidx/recyclerview/widget/i1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/realtime/presentation/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/i1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0010\u0008\u0002\u0018\u0000 \u00102\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB)\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u001cR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/whoop/realtime/presentation/b;",
        "Landroidx/recyclerview/widget/i1;",
        "Lo52/a;",
        "",
        "Lcom/whoop/realtime/presentation/c;",
        "activityListItems",
        "Lkotlin/Function1;",
        "Lcom/whoop/realtime/presentation/c$a;",
        "Ll83/a0;",
        "onClick",
        "<init>",
        "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "c",
        "(Landroid/view/ViewGroup;I)Lo52/a;",
        "holder",
        "position",
        "b",
        "(Lo52/a;I)V",
        "getItemViewType",
        "(I)I",
        "getItemCount",
        "()I",
        "a",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "Lkotlin/jvm/functions/Function1;",
        "realtime-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c:Lcom/whoop/realtime/presentation/b$a;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/realtime/presentation/c;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/realtime/presentation/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/realtime/presentation/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/realtime/presentation/b;->c:Lcom/whoop/realtime/presentation/b$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/realtime/presentation/c;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "activityListItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    iput-object p1, p0, Lcom/whoop/realtime/presentation/b;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/whoop/realtime/presentation/b;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/realtime/presentation/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/realtime/presentation/b;->a:Ljava/util/List;

    return-object v0
.end method

.method public b(Lo52/a;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/b;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/realtime/presentation/c;

    invoke-virtual {p1, p2}, Lo52/a;->a(Lcom/whoop/realtime/presentation/c;)V

    return-void
.end method

.method public c(Landroid/view/ViewGroup;I)Lo52/a;
    .locals 4

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const-string v1, "inflate(...)"

    const/4 v2, 0x0

    if-eqz p2, :cond_3

    const/4 v3, 0x1

    if-eq p2, v3, :cond_2

    const/4 v3, 0x2

    if-eq p2, v3, :cond_1

    const/4 v3, 0x3

    if-ne p2, v3, :cond_0

    new-instance p2, Lcom/whoop/realtime/presentation/n;

    sget v3, Lk52/e;->q:I

    invoke-virtual {v0, v3, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/whoop/realtime/presentation/n;-><init>(Landroid/view/View;)V

    return-object p2

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "unknown viewType "

    invoke-static {p2, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Lcom/whoop/realtime/presentation/o;

    sget v3, Lk52/e;->r:I

    invoke-virtual {v0, v3, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/whoop/realtime/presentation/o;-><init>(Landroid/view/View;)V

    return-object p2

    :cond_2
    new-instance p2, Lcom/whoop/realtime/presentation/h;

    sget v3, Lk52/e;->p:I

    invoke-virtual {v0, v3, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/whoop/realtime/presentation/h;-><init>(Landroid/view/View;)V

    return-object p2

    :cond_3
    new-instance p2, Lcom/whoop/realtime/presentation/d;

    sget v3, Lk52/e;->j:I

    invoke-virtual {v0, v3, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/b;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p2, p1, v0}, Lcom/whoop/realtime/presentation/d;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-object p2
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/b;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/realtime/presentation/c;

    instance-of v0, p1, Lcom/whoop/realtime/presentation/c$a;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    instance-of v0, p1, Lcom/whoop/realtime/presentation/c$b;

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    instance-of v0, p1, Lcom/whoop/realtime/presentation/c$d;

    if-eqz v0, :cond_2

    const/4 p1, 0x2

    return p1

    :cond_2
    instance-of p1, p1, Lcom/whoop/realtime/presentation/c$c;

    if-eqz p1, :cond_3

    const/4 p1, 0x3

    return p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    check-cast p1, Lo52/a;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/realtime/presentation/b;->b(Lo52/a;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/whoop/realtime/presentation/b;->c(Landroid/view/ViewGroup;I)Lo52/a;

    move-result-object p1

    return-object p1
.end method
