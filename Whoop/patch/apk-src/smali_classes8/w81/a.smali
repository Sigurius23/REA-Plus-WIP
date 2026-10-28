.class public final Lw81/a;
.super Landroidx/recyclerview/widget/i1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/i1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lw81/a;",
        "Landroidx/recyclerview/widget/i1;",
        "Lw81/e;",
        "",
        "pageCount",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "pageContents",
        "<init>",
        "(ILkotlin/jvm/functions/Function3;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "viewType",
        "b",
        "(Landroid/view/ViewGroup;I)Lw81/e;",
        "holder",
        "position",
        "a",
        "(Lw81/e;I)V",
        "getItemCount",
        "()I",
        "c",
        "(Lw81/e;)V",
        "I",
        "Lkotlin/jvm/functions/Function3;",
        "design_release"
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
.field private final a:I

.field private final b:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILkotlin/jvm/functions/Function3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function3;",
            ")V"
        }
    .end annotation

    const-string v0, "pageContents"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    iput p1, p0, Lw81/a;->a:I

    iput-object p2, p0, Lw81/a;->b:Lkotlin/jvm/functions/Function3;

    return-void
.end method


# virtual methods
.method public a(Lw81/e;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lw81/a;->b:Lkotlin/jvm/functions/Function3;

    invoke-virtual {p1, p2, v0}, Lw81/e;->b(ILkotlin/jvm/functions/Function3;)V

    return-void
.end method

.method public b(Landroid/view/ViewGroup;I)Lw81/e;
    .locals 1

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Le91/a;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le91/a;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lw81/e;

    invoke-direct {p2, p1}, Lw81/e;-><init>(Le91/a;)V

    return-object p2
.end method

.method public c(Lw81/e;)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lw81/e;->d()V

    return-void
.end method

.method public getItemCount()I
    .locals 1

    iget v0, p0, Lw81/a;->a:I

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    check-cast p1, Lw81/e;

    invoke-virtual {p0, p1, p2}, Lw81/a;->a(Lw81/e;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw81/a;->b(Landroid/view/ViewGroup;I)Lw81/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onViewRecycled(Landroidx/recyclerview/widget/o2;)V
    .locals 0

    check-cast p1, Lw81/e;

    invoke-virtual {p0, p1}, Lw81/a;->c(Lw81/e;)V

    return-void
.end method
